public class FirstProgram {
    int value;
    public static void main(String[] args) {

        FirstProgram first= new FirstProgram();

        System.out.println("sum of 5 and 6    :" +first.sum(5,6));  //11
        System.out.println("sub of 5 and 6    :" +first.sub(5,6));  //-1
        System.out.println("mul of 5 and 6    :" +first.mul(5,6));  //30
        System.out.println("div of 5 and 6    :" +first.div(5,6));  // 0
        System.out.println("mod div of 5 and 6    :" +first.modDiv(5,6)); //5

    }

    public int sum(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public int modDiv(int a,int b){
        return a%b;
    }

    public void greeting(){
        System.out.println("Welcome");
    }

    public void noNeed(int a){
        value=a+10;
    }
    public int getValue(){
        return value;
    }
}

