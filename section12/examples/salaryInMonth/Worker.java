package section12.examples.salaryInMonth;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel workerLevel;
    private double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel workerLevel, double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int month, int year) {
        double sum = baseSalary;
        for (HourContract contract : contracts) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(contract.getDate());
            int contract_year = calendar.get(Calendar.YEAR);
            int contract_month = calendar.get(Calendar.MONTH) + 1;
            if (year == contract_year && month == contract_month) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "baseSalary=" + baseSalary +
                ", workerLevel=" + workerLevel +
                ", name='" + name + '\'' +
                '}';
    }
}
