package com.Simplilearn2;

public class Employee {
	int id;
    String name;
    String department;
    
    //default constructor
    public Employee()
    {
        id=27;
        name="Naveen";
    }
    public Employee(int id,String name, String department)
    {
        this.id=id;
        this.name=name;
        this.department = department;
    }
    
    public static void main(String[] args) {
        
        //when you create object automatically it calls default constructor
        //if no default constructor then compiler will create that
        Employee obj=new Employee();
        System.out.println("User 1");
        System.out.println("Id: "+obj.id);
        System.out.println("Name: "+obj.name);
        
        Employee obj2= new Employee(45,"Jashwanth","Artist");
        System.out.println("User 2");
        System.out.println("Id: "+obj2.id);
        System.out.println("Name: "+obj2.name);
        System.out.println("Department: "+obj2.department);
        
        
        
    }

}
