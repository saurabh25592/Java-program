

public class TwoGreaterNumber {

   public  void  gratestNumber(int a, int b){

    if(a>b){
       System.out.println("a is a greater number than b");
    }
    else if(b>a)
    {
       System.out.println("b is greate than a ");
    }
   }

   public static void main(String[] args) {
    
    TwoGreaterNumber t=new TwoGreaterNumber();
    t.gratestNumber(12, 133);
   }
}

