package app.view;

import java.util.Locale;
import java.util.Scanner;

import app.utils.Utils;

public class AppView {
    private final static String CURRENCY = "грн.";
    private final Scanner scanner = new Scanner(System.in);

    public String[] typeWatches = {"Кварцеві","Механічні","Електронні"};
    public String[][] nameWatches = {{"Curren","Megalith","AMST"},
                                     {"Forsining","Casio","Winner"},
                                     {"Skmei","Sanda","G-Shock"}};

    public void getCaption() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("\nЛаскаво просимо до онлайн-магазину наручних годинників 'WatchTime.ukr'\n");

    }

    //------------------------------------------------------------------------------------------------------------------
    public int getCategoryProduct() {
        System.out.printf("Оберіть тип механізму годинника:%n" +
                        "0 - %s%n" +
                        "1 - %s%n" +
                        "2 - %s",
                typeWatches[0],
                typeWatches[1],
                typeWatches[2]);

        return (int) Utils.checkNumber(scanner.nextLine().trim());
    }
    //------------------------------------------------------------------------------------------------------------------
    public int getModelProduct(int typeMechanism,double[][] price) {


        System.out.printf("%nОберіть модель годинника:%n" +
                        "0 - %s %.2f %s%n" +
                        "1 - %s %.2f %s%n" +
                        "2 - %s %.2f %s",
                nameWatches[typeMechanism][0],price[typeMechanism][0],CURRENCY,
                nameWatches[typeMechanism][1],price[typeMechanism][1],CURRENCY,
                nameWatches[typeMechanism][2],price[typeMechanism][2],CURRENCY);

        return (int) Utils.checkNumber(scanner.nextLine().trim());
    }
    //------------------------------------------------------------------------------------------------------------------
    public int getQuantity(){
        System.out.println("\nВведіть кількість, шт.:");
        return (int) Utils.checkNumber(scanner.nextLine().trim());
    }
    //------------------------------------------------------------------------------------------------------------------
    public int getTypeDelivery(){
        System.out.println("""
                Оберіть тип доставки:
                1 - Самовивіз з  офісу магазину
                2 - Кур'єр(+5% від вартості замовлення)
                """);

        return (int) Utils.checkNumber(scanner.nextLine().trim());
    }
    //------------------------------------------------------------------------------------------------------------------
    public String[] getBuyerData(){
        System.out.println("\nДля завершення замовлення ведіть наступні данні:\n" +
                "Прізвище:");
        String name = scanner.nextLine().trim();
        System.out.println("Номер телефону:");
        String phone = scanner.nextLine().trim();
        System.out.println("Населений пункт:");
        String city = scanner.nextLine().trim();
        System.out.println("Номер поштового відділення:");
        String postNum = scanner.nextLine().trim();



       return new String[]{name, phone, city, postNum};
    }
    //------------------------------------------------------------------------------------------------------------------
    public void orderResult(String res){
        System.out.println(res);
        scanner.close();

    }
    //------------------------------------------------------------------------------------------------------------------
}
