package dip;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

public class PrintReport3 implements OutputReport {


    private Report report;

    public void saveToFile(List<ReportItem> items) {
        String fileName = "report.txt";
        for (ReportItem item : items) {
            try (FileWriter writer = new FileWriter(fileName, true)) {

                writer.write("Description: " + item.getDescription() + "\n");
                writer.write("Amount: " + item.getAmount() + "\n");


                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }


    }

    @Override
    public void output(List<ReportItem> items) {
        saveToFile(items);

    }
}
