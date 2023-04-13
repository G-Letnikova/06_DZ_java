import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static Laptop laptop1 = new Laptop("DEXP Aquilon", "серебристый", "Windows 11 Pro", 4, 128);
    static Laptop laptop2 = new Laptop("Irbis NB257", "серый", "Windows 10", 4, 64);
    static Laptop laptop3 = new Laptop("Acer Aspire 3", "черный", "Windows 11 Pro", 4, 1000);
    static Laptop laptop4 = new Laptop("Aser Extensa 15", "черный", "Windows 11 Pro", 4, 128);
    static Laptop laptop5 = new Laptop("Apple MacBook Air", "серый", "macOS", 8, 256);
    
    static Scanner sc = new Scanner(System.in);

    static HashSet <Laptop> set = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5));
    public static void main(String[] args) {
        

        System.out.println("Введите цифру, соответствующую критерию: ");
        System.out.println("1 - Объем ОП");
        System.out.println("2 - Операционная система");
        System.out.println("3 - Обьем жесткого диска");
        System.out.println("4 - Цвет");

        int choice = Integer.valueOf(sc.next());

        switch (choice) {
            case 1:
                filterValOperMamory();
                break;
            case 2:
                filterOperSystem();                
                break;
            case 3:
                filtervalHardDisk();
                break;
            case 4:
                filterColor();
                break;
            default:
                System.out.println("Неверный выбор");
        }
    }


    static public void filterValOperMamory() {
        System.out.println("Введите цифру, соответствующую минимальному объему ОП (ГБ): ");
        int ch = Integer.valueOf(sc.next());
        boolean flag = false;
        for (var it : set) {
            if (it.getValOperMamory() >= ch){
            System.out.println(it); 
            flag = true;
            } 
        }
        if (!flag) 
        System.out.println("По объему ОП = " + ch + " ГБ ноутбуков нет");
    }


     static public void filterOperSystem(){
        String[] opSys = {"Windows","macOS"}; 
        System.out.println("Введите цифру, соответствующую операционной системе: ");
        System.out.printf("1 - %s\n", opSys[0]);
        System.out.printf("2 - %s\n", opSys[1]);

        int ch = Integer.valueOf(sc.next());

        for (var it : set) {
            if (it.getOperSystem().contains(opSys[ch-1])){  
            System.out.println(it); 
            } 
        }
     }


     static public void filtervalHardDisk(){
        System.out.println("Введите цифру, соответствующую минимальному объему жесткого диска: ");
        int ch = Integer.valueOf(sc.next());
        boolean flag = false;
        for (var it : set) {
            if (it.getValHardDisk() >= ch){
            System.out.println(it); 
            flag = true;
            } 
        }
        if (!flag) 
        System.out.println("По объему жесткого диска = " + ch + " ГБ ноутбуков нет");
     }

     
     public static void filterColor(){
        String[] colorLaptop = {"серый","черный","серебристый"};
        System.out.println("Введите цифру, соответствующую цвету ноутбука: ");
        System.out.printf("1 - %s\n", colorLaptop[0]);
        System.out.printf("2 - %s\n", colorLaptop[1]);
        System.out.printf("3 - %s\n", colorLaptop[2]);

        int ch = Integer.valueOf(sc.next());
        System.out.println(ch);
        System.out.println(colorLaptop[ch-1]);

        for (var it : set) {
            if (it.getColor() == colorLaptop[ch-1])
            System.out.println(it);  
        }
     }

}
