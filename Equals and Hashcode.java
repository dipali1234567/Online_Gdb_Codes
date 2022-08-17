/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
	
// 	Employee e1=new Employee(1,"u1");
// 		Employee e2=new Employee(1,"u1");
// 			Employee e3=new Employee(1,"u1");
// 		Employee e4=new Employee(2,"u2");
// 			Employee e5=new Employee(3,"u3");
			
// 			HashMap<Employee,String>map=new HashMap<>();
// 			map.put(e1,"User1");
// 				map.put(e2,"User1");
// 					map.put(e3,"User1");
// 						map.put(e4,"User1");
// 							map.put(e5,"User1");
// 			Set<Map.Entry<Employee,String>>set=map.entrySet();
	
// 	       for(Map.Entry<Employee,String>entry:map.entrySet())
// 	       {
// 	           System.out.println(entry.getKey().toString()+" "+entry.getValue());
// 	       }
	
// 	}
// }


// class Employee{
//     int id;
//     String name;
    
//     Employee(int id,String name)
//     {
//         this.id=id;
//         this.name=name;
//     }
    
//     public  String toString()
//     {
//         return "Employee{ "+this.id+", "+this.name+" }";
//     }
// }

// Employee{ 2, u2 } User1
// Employee{ 3, u3 } User1
// Employee{ 1, u1 } User1
// Employee{ 1, u1 } User1
// Employee{ 1, u1 } User1



//To avoid above like Employee{ 1, u1 } this is one object but it has been stored multiple time because each time reference
// by different variable e1 and e2 and e2 and hence hashcode return for them is also different

//Whenever we are storing any object it first check for equality by equal method if same key already present 
//it will return same hashcode and value will be store over there
//while accessing the key we search for equal object as per equal method in the hashmap and get hashcode of it.

//lte's create hashcode and equal method we see behaviour of it


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	Employee e1=new Employee(1,"u1");
		Employee e2=new Employee(1,"u1");
			Employee e3=new Employee(1,"u1");
		Employee e4=new Employee(2,"u2");
			Employee e5=new Employee(3,"u3");
			
			HashMap<Employee,String>map=new HashMap<>();
			map.put(e1,"User1");
				map.put(e2,"User1");
					map.put(e3,"User1");
						map.put(e4,"User1");
							map.put(e5,"User1");
			Set<Map.Entry<Employee,String>>set=map.entrySet();
	
	       for(Map.Entry<Employee,String>entry:map.entrySet())
	       {
	           System.out.println(entry.getKey().toString()+" "+entry.getValue());
	       }
	
	}
}


class Employee{
    int id;
    String name;
    
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
    public  String toString()
    {
        return "Employee{ "+this.id+", "+this.name+" }";
    }
    
    public boolean equal(Object obj)
    {
        if(this==obj)
        return true;
        
        if(obj==null)
        return false;
        
        if(getClass()!=obj.getClass())
        return false;
        
        
        Employee emp= (Employee) obj;
        
        if(emp.id!=id)
        return false;
        
        return true;
        
    }
    
    public int hashCode(){
        final int prime=31;
        int result=1;
        result=prime*result+id;
        return result;
    }
}