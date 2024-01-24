package HW6;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(16, 512, "Windows", "черный");
        Laptop laptop2 = new Laptop(8, 256, "MacOS", "синий");
        Laptop laptop3 = new Laptop(32, 512, "Linux", "серый");
        Laptop laptop4 = new Laptop(16, 512, "Windows", "серый");
        Laptop laptop5 = new Laptop(8, 256, "MacOS", "черный");
        Laptop laptop6 = new Laptop(8, 256, "Linux", "черный");

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6));

        // for (Laptop laptop : laptops) {
        //     System.out.println(laptop);
        // }

       getScanner(laptops);

    }

    private static void getScanner(Set <Laptop> laptops) {
        Map <String, String> map = new HashMap<>();
        map.put("1", "ОЗУ");
        map.put("2", "Объем ЖД");
        map.put("3", "Операционная память");
        map.put("4", "Цвет");
        map.put("5", "Выход");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = "Введите цифру, соответствующую необходимому критерию: \n" +
                "1 - ОЗУ \n" +
                "2 - Объем ЖД \n" +
                "3 - Операционная система \n" +
                "4 - Цвет \n" +
                "5 - Выход \n";
            System.out.println(text);
            
            String input = scanner.nextLine();
            if (map.containsKey(input)){
                String criterion = map.get(input);
                if (input.equals("1")){
                    System.out.println("Введите минимальное значение для: " + criterion + " (8, 16, 32)");
                } else if (input.equals("2")) {
                    System.out.println("Введите минимальное значение для: " + criterion + " (256, 512)");
                } else if (input.equals("3")) {
                    System.out.println("Введите значение для: " + criterion + " (Windows, Linux, MacOS)");
                } else if (input.equals("4")){
                    System.out.println("Введите значение для: " + criterion + " (черный, синий, серый)");
                } else {
                    break;
                }

                String minValue = scanner.nextLine();


                Set <Laptop> filteredLaptops = new HashSet<>();
                switch (criterion) {
                    case "ОЗУ":
                        int minRam = Integer.parseInt(minValue);
                        for (Laptop laptop : laptops) {
                            if (laptop.getRAM() >= minRam) {
                                filteredLaptops.add(laptop);
                            }
                        }
                        break;
                    case "Объем ЖД":
                        int minHdSize = Integer.parseInt(minValue);
                        for (Laptop laptop : laptops) {
                            if (laptop.getHDC() >= minHdSize) {
                                filteredLaptops.add(laptop);
                            }
                        }
                        break;
                    case "Операционная система":
                        for (Laptop laptop : laptops) {
                            if (laptop.getOS().equalsIgnoreCase(minValue)) {
                                filteredLaptops.add(laptop);
                            }
                        }
                        break;
                    case "Цвет":
                        for (Laptop laptop : laptops) {
                            if (laptop.getColor().equalsIgnoreCase(minValue)) {
                                filteredLaptops.add(laptop);
                            }
                        }
                        break;
                    default:
                        System.out.println("Введены не корректные данные. Попробуйте еще раз.");
                        break;
                }

                if (filteredLaptops.isEmpty()) {
                    System.out.println("Ноутбуки, удовлетворяющие условиям фильтрации, не найдены.");
                } else {
                    for (Laptop laptop : filteredLaptops) {
                        System.out.println(laptop);
                    }
                }
            } else {
                System.out.println("Введены не корректные данные.");
                break;
            }
        }
    }
}
                

            



    