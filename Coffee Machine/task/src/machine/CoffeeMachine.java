package machine;

import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int cofeeBeans= 120;
        int cups = 9;
        int money = 550;
      
        print1(water,milk,cofeeBeans,cups,money);

        String str = in.nextLine();
        switch (str){
            case "buy": {
                System.out.println(" What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int chouse = in.nextInt();
                switch (chouse){//espresso
                    case 1:{print1(water-250,milk,cofeeBeans-16,cups-1,money+4);
                    }break;
                    case 2:{//latte
                        print1(water-350,milk-75,cofeeBeans-20,cups-1,money+7);
                    }break;
                    case 3:{//cappuccino
                        print1(water-200,milk-100,cofeeBeans-12,cups-1,money+6);
                    }break;
                }
            }break;
            case "fill": {
                System.out.println("Write how many ml of water do you want to add: ");
                int water2 = in.nextInt();  water = water+water2;
                System.out.println("Write how many ml of milk do you want to add:  ");
                int milk2 = in.nextInt();  milk = milk+milk2;
              System.out.println("Write how many grams of coffee beans do you want to add: ");
                int cofee2 = in.nextInt();  cofeeBeans = cofeeBeans+cofee2;
              System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int cups2 = in.nextInt();  cups = cups+cups2;
                print1(water,milk,cofeeBeans,cups,money);
            }break;

            case "take":{
                System.out.println("I gave you $"+ money);
                print1(water,milk,cofeeBeans,cups,money-money);
            }break;

        }

}
    private static void print1(int water, int milk, int cofeeBeans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.printf("%d of water",water);System.out.println();
        System.out.printf("%d of milk",milk);System.out.println();
        System.out.printf("%d of coffee beans",cofeeBeans);System.out.println();
        System.out.printf("%d disposable cups",cups);System.out.println();
        System.out.printf("%d of money",money);System.out.println();
    }
}
