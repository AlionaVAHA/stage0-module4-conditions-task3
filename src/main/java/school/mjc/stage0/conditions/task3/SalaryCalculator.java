package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
          if (salary<=10000){
           float taxes = (float) (salary*0.15);
           float result = salary-taxes;
           System.out.println(result);
       } else if (salary > 10000&&salary<=20000) {
           float taxes = (float) (salary*0.18);
           float result = salary-taxes;
           System.out.println(result);
       } else if (salary>20000) {
           float taxes = (float) (salary*0.20);
           float result = salary-taxes;
           System.out.println(result);
       }
       else if (salary<0){
           System.out.println("wrong input!");
       }
    }
}
