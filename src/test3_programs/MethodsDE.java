package test3_programs;


public class MethodsDE {

	public static int MethodD(int x, int y)
    {
       return x / (MethodE(x, y) * y);
    }

public static int MethodE(int x, int y)
    {
    System.out.println("x = " + x + " and " + "y = " + y);

        if (x % y == 0)
             	return y;
        else
      		return MethodE(y, x % y);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MethodD(75, 40));
		
	}

}
