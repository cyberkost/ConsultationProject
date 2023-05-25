package server_chat;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientApp {
    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 8189;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ClientWindow> clients = new ArrayList<>();
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("end")) {
                break;
            }
            if (str.equals("add")) {
                ClientWindow clientWindow = new ClientWindow("", SERVER_HOST, SERVER_PORT);
                clients.add(clientWindow);
                ClientWindow.setClients(clients); // Используем статический метод setClients
                SwingUtilities.invokeLater(clientWindow);
            }
        }
        scanner.close();
    }
}
