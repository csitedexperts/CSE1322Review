package car_package1;

abstract public class Vehicle extends Object
{
 public 	String vType;
 private String vDetail;
 
 public  void BodyType() {
	 System.out.println("Vehicle:: BodyType ....  ");
 }

 abstract public  void EngineType(); //{ }
/*
 {
	 System.out.println("Vehicle:: EngineType ....  ");
 }
*/
 
 public void SetVDetail(String vDetail ){
 this.vDetail = vDetail; 
 }

 public String GetVDetail(){
   return vDetail;
 }

}
