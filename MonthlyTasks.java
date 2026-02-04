package lec_10;

public abstract class MonthlyTasks {
    abstract void makeMonthlyReport();
}

class Member extends MonthlyTasks {
    int memberID;

    @Override
    void makeMonthlyReport() {
        System.out.println(
                "Step 1: Get form from Report folder\n" +
                "Step 2: Fill information\n" +
                "Step 3: Upload to MemberReport folder");
    }
}

class Processor {
    public static void main(String[] args) {
        Member m = new Member();
        m.makeMonthlyReport();
    }

}
