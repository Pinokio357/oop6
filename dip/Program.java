package dip;

public class Program {
    public static void main(String[] args) {
        Report report = new Report(new PrintReport2());
        report.calculate();
        report.output();
    }
}
