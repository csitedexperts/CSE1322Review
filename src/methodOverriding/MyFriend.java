package methodOverriding;

public class MyFriend { 
    String name; 
    String email;   
    MyFriend (String name, String email) { 
        this.name = name; 
        this.email = email;    
    } 
    public String toString() 
    { return "My friend: "+ name + " " + email ; }   
    
public static void main(String[] args) { 
        MyFriend f1 = new MyFriend("John", "john@gmail.com"); 
        System.out.println(f1);   // methodOverriding.MyFriend@7852e922
        
        System.out.println(f1.toString());  // methodOverriding.MyFriend@7852e922
    } 
} 