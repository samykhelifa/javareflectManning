class A{ 
      void printName(){
            System.out.println(this.getClass().getName()); }}
public class HelloWorld extends A {
 public static void main(String[] args){
     A hw = new HelloWorld() ;
     hw.printName();    
   }

}
