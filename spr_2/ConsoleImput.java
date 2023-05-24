package spr_2;

import java.util.Scanner;

public class ConsoleImput {
    private final Order order;

    public ConsoleImput(Order order) {
        this.order = order;
    }

    public void inputFromConsole(){
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
