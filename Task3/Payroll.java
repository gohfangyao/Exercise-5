import java.util.Scanner;
public class Payroll{
    public static void main(String[] args){
        Employee sc = new Employee();
        sc.input();
        Payroll pay = new Payroll(sc.grossPay,sc.stateTax,sc.federalTax);
        pay.printOutput();
    }
}

class Employee{
    double ID, grossPay, stateTax, federalTax;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your employee ID number: ");
        ID = sc.nextDouble();
        System.out.printf("Enter your Gross Pay         : RM ");
        grossPay = sc.nextDouble();
        System.out.printf("Enter your State Tax         : RM ");
        stateTax = sc.nextDouble();
        System.out.printf("Enter your Federal Tax       : RM ");
        federalTax = sc.nextDouble();
    }
}
class Payroll{
    private double grossPay, stateTax, federalTax, netPay;

    public Payroll(double grossPay,double stateTax,double federalTax){
        this.grossPay = grossPay;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
    }

    public double calculateNetPay(){
        return netPay = grossPay - stateTax - federalTax;
    }

    public void printOutput(){
        System.out.printf("Net pay is: RM %.2f", calculateNetPay());
    }
}
