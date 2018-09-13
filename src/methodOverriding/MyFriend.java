package methodOverriding;

public class MyFriend { 
    String name; 
    int age; 
    String moreInfo;   
    MyFriend (String name, int age, String moreInfo) { 
        this.name = name; 
        this.age = age; 
        this.moreInfo = moreInfo;    
    } 
    public String toString() 
    { return "My friend: "+ name + " " + age + " " + moreInfo; }   
    
public static void main(String[] args) { 
        MyFriend f1 = new MyFriend("John", 21, "770-123-0000"); 
        System.out.println(f1);   // methodOverriding.MyFriend@7852e922
        
        System.out.println(f1.toString());  // methodOverriding.MyFriend@7852e922
    } 
} 