package spr_2;

public class Program {
    public static void main(String[] args) {
        Order order = new Order("", "", 0, 0);
        ConsoleImput consoleImput = new ConsoleImput(order);
        SaveToJson saveToJson = new SaveToJson(order);
        SaveToXml saveToXml = new SaveToXml(order);
        System.out.println("Введите заказ:");
        consoleImput.inputFromConsole();
        saveToJson.saveToJson();
        saveToXml.saveToXml();
    }
}
