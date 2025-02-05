class Worker {
    String name;

    public Worker(String name) {
        this.name = name;
    }

    public double computePay(int hours) {
        return 0;
    }
}

class DailyWorker extends Worker {
    private double dailyRate;

    public DailyWorker(String name, double dailyRate) {
        super(name);
        this.dailyRate = dailyRate;
    }

    public double computePay(int hours) {
        int daysWorked = hours / 8; 
        return dailyRate * daysWorked;
    }
}

class SalariedWorker extends Worker {
    private double weeklySalary;

    public SalariedWorker(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    public double computePay(int hours) {
        return weeklySalary;
    }
}

public class experiment5_4 {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("Adi", 2000);  
        Worker salariedWorker = new SalariedWorker("Mohit", 1000);  

        System.out.println(dailyWorker.name + " gets the pay in ruppee:" + dailyWorker.computePay(40));  
        System.out.println(salariedWorker.name + " gets the pay in ruppee:" + salariedWorker.computePay(50));
    }
}
