import com.sun.source.util.SourcePositions;

import java.nio.channels.Pipe;

public class Main {
    public static void main(String[] args) {
        int age = 4;
        if (age >=18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил!");
        }

        {
            int age2 = 32;
            if (age2 >= 7 && age2 < 18) {
                System.out.println("Ребенок ходит в школу");

            }
            if (age2>= 18 && age2<24)
                System.out.println("Университетские годы");
            if (age2 >= 24) {
                System.out.println("Пора искать работу");
            }
        }
        int passengers = 100;
        if (passengers <=60){
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.printf("В вагоне остались только стоячие места");
        }
        if (passengers>102){
            System.out.println("В вагоне нет мест");
        }



}}