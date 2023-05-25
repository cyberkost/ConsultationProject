package server_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientHandler implements Runnable {
    private Socket s;
    private PrintWriter out;
    private Scanner in;
    private static int CLIENTS_COUNT = 0;
    private String name;

    private static List<ClientHandler> clients;

    public static void setClients(List<ClientHandler> clients) {
        ClientHandler.clients = clients;
        clientWriters.clear();
        for (ClientHandler client : clients) {
            clientWriters.add(client.out);
        }
    }

    private static List<PrintWriter> clientWriters = new ArrayList<>();

    public ClientHandler(Socket s) {
        try {
            this.s = s;
            out = new PrintWriter(s.getOutputStream());
            in = new Scanner(s.getInputStream());
            CLIENTS_COUNT++;
            name = "Клиент № " + CLIENTS_COUNT;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            if (in.hasNext()) {
                String w = in.nextLine();
                System.out.println(name + ": " + w);
                sendMessageToAll(name + ": " + w);
                if (w.equals("end")) {
                    break;
                }
            }
        }
        try {
            System.out.println("Клиент отключился");
            in.close();
            out.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void sendMessageToAll(String message) {
        for (PrintWriter writer : clientWriters) {
            writer.println(message);
            writer.flush();
        }
    }
}
