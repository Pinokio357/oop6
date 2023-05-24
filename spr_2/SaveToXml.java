package spr_2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToXml {
    private final Order order;

    public SaveToXml(Order order) {
        this.order = order;
    }
    public void saveToXml() {
        String fileName = "order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<order>\n");
            writer.write("<clientName>"+ order.getClientName() + "</clientName>\n");
            writer.write("<product>"+ order.getProduct()+ "</product>\n");
            writer.write("<qnt>:"+ order.getQnt()+"</qnt>\n");
            writer.write("<price>"+ order.getPrice()+"</price>\n");
            writer.write("</order>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
