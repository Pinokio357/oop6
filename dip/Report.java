package dip;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private OutputReport outputReport;
    private List<ReportItem> items;

    public Report(OutputReport outputReport) {
        this.outputReport = outputReport;
    }

    public void calculate(){
        items = new ArrayList<ReportItem>();
        items.add(new ReportItem("first", 5));
        items.add(new ReportItem("second", 8));
    }
    public void output(){
        outputReport.output(items);

    }

}
