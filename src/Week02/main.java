package Week02;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Employee [] employees = new Employee[7];
        employees[0] = new Employee("HR", 5000);
        employees[1] = new Employee("HR", 3000);
        employees[2] = new Employee("IT", 4000);
        employees[3] = new Employee("IT", 5000);
        employees[4] = new Employee("MGR", 5000);
        employees[5] = new Employee("MGR", 5000);
        employees[6] = new Employee("MGR", 5000);

        calculateSalary(employees);
        System.out.println("***********");
        calculateSalarywithOrder(employees);
    }
    public static void calculateSalary(Employee []employees){
        ArrayList <String> deptname = new ArrayList();
        for(int i=0;i<employees.length;i++){
            if(!deptname.contains(employees[i].department)){
                deptname.add(employees[i].department);
            }
        }
        for(int j=0;j<deptname.size();j++){
            int totalsalary=0;
            for(int i=0;i<employees.length;i++){
                if(employees[i].department.equals(deptname.get(j))){
                    totalsalary+=employees[i].salary;
                }
            }
            System.out.println(deptname.get(j)+"= "+totalsalary);
        }
    }

    public static void calculateSalarywithOrder(Employee []employees){
        int totalsalary=0;
        String currentDeptname=employees[0].department;
        for(int j=0;j<employees.length;j++){
            if(currentDeptname.equals(employees[j].department)){
                totalsalary+=employees[j].salary;
            }else{
                System.out.println(currentDeptname+"= "+totalsalary);
                currentDeptname=employees[j].department;
                totalsalary=employees[j].salary;
            }
        }
        System.out.println(currentDeptname+"= "+totalsalary);
    }
}
