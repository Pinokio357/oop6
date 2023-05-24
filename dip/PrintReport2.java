package dip;

import java.util.List;

public class PrintReport2 implements OutputReport{
    public void printAll(List<ReportItem> items) {
        for(ReportItem item: items) {
            System.out.println(item.getDescription());
            System.out.println(item.getAmount());
            }

        }



    @Override
    public void output(List<ReportItem> items) {
        printAll(items);
    }
}
