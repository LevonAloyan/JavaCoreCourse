package armen.restaurant;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Amalia on 30.12.2018.
 */
public class Dishes {
    int dishNum;
    int clientCount;
    int clientNum;
    int fromCookWait = 0;
    int fromWaitCust = 0;

    Dishes(int clientCount){
        this.clientCount = clientCount;
    }

    synchronized int cooking() {
        int amount = 0; //контроль цикла (должен продолжаться, пока все посетители не обслужены)
        int customers[] = new int[clientCount]; // контроль обслуживания посетителей

        while(amount < (3 * clientCount)) {
            while(fromCookWait != 0)
                try {
                    wait();
                }catch(InterruptedException e) {
                    System.out.println("Exception thrown");
                }

            dishNum = ThreadLocalRandom.current().nextInt(1, 4);
            switch(dishNum)
            {
                case 1:
                    for(int i = 1; i < clientCount; i++) {
                        if (customers[i]==0){
                            clientNum = i + 1;
                            amount++;
                            customers[i] = customers[i] + 1;
                            fromCookWait = 1;
                            System.out.println("Dish: " + dishNum + " cook");
                            notifyAll();
                        }
                    }
                    break;
                case 2:
                    for(int i = 1; i < clientCount; i++) {
                        if (customers[i]==1){
                            clientNum = i + 1;
                            amount++;
                            customers[i] = customers[i] + 1;
                            fromCookWait = 1;
                            System.out.println("Dish:" + dishNum + " cook");
                            notifyAll();
                        }
                    }
                    break;
                case 3:
                    for(int i = 1; i < clientCount; i++) {
                        if (customers[i]==2){
                            clientNum = i + 1;
                            amount++;
                            customers[i] = customers[i] + 1;
                            fromCookWait = 1;
                            System.out.println("Dish:" + dishNum + " cook");
                            notifyAll();
                        }
                    }
                    break;
            }
        }
        return clientNum;
    }

    synchronized void bring() {
        while((fromCookWait != 1) & (fromWaitCust != 0))
            try {
                wait();
            }catch(InterruptedException e) {
                System.out.println("Exception thrown");
            }
        System.out.println("Dish:" + dishNum + " waiter");
        fromWaitCust = 1;
        notifyAll();
    }

    synchronized void eating() {
        while((fromCookWait != 1) & (fromWaitCust != 1))
            try {
                wait();
            }catch(InterruptedException e) {
                System.out.println("Exception thrown");
            }
        System.out.println("Dish:" + dishNum + " customer " + clientNum);
        fromCookWait = 0;
        fromWaitCust = 0;
        notifyAll();
    }
}

