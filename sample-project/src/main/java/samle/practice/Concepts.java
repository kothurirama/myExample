package samle.practice;

public class Concepts {

    public static void main(String[] args) {
        Trainging t=new Trainging();

        System.out.println("sum of a and b is "+t.addition(5,6));
       int res= t.sub(6,5);
        System.out.println("diff of a and b is "+  res);
    }

}
class Trainging {
    public int addition(int a, int b) {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }

}


