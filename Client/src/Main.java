import input.ConsoleInput;
import utilities.ConnectionManager;
import utilities.Process;

import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int port;
        String ip;

        ConnectionManager cm;
        while (true) {
            try {
                System.out.println("Enter the ip address of server: ");
                ip = sc.nextLine().trim();
                System.out.println("Enter the port of server: ");
                port = Integer.parseInt(sc.nextLine());

                cm = new ConnectionManager(ip, port);
                break;
            } catch (SocketException e) {
                System.out.println("Port is out of range");
            } catch (IOException e) {
                System.out.println("IOException occurred");
            }
        }

        Process process = new Process(new ConsoleInput(), cm);
        process.defineCommand();

    }
}
