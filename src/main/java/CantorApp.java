import utils.Display;
import utils.ConfigurationLoader;
import java.io.IOException;
import java.util.Scanner;

public class CantorApp {
    public static Display display = new Display();
    public static ConfigurationLoader configurationLoader = new ConfigurationLoader();

    public static void main(String[] args) throws IOException {
        configurationLoader.loadProperties();
        int value;

        do
        {
            display.displayMainMenu();
            System.out.print("Enter value: \n");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();

            switch(value) {
                case 1:
                    display.displayUserRegister();
                    break;
                case 2:
                    if (display.displayLogin() == true){
                        do {
                            display.displayUserMenu();
                            System.out.printf("Enter value: \n");
                            value = scanner.nextInt();

                            switch (value) {
                                case 1:
                                    display.displayCheckRates();
                                    break;
                                case 2:
                                    display.displayTransaction();
                                    break;
                                case 3:
                                    display.displayTransactionFile();
                                    break;
                                case 4:
                                    display.displayUserDatabaseFile();
                                    break;
                                case 5:
                                    display.displayUserListSortedByLogin();
                                    break;
                                case 6:
                                    display.displayUserListSortedByName();
                                    break;
                                case 7:
                                    display.displayUserListSortedByUserId();
                                    break;
                                }
                            } while (value!=9);
                    }
                    break;
                case 3:
                    display.displayCheckRates();
                    break;
                case 4:
                    display.displayTransaction();
                    break;
            }
        } while(value!=0);
    }
}