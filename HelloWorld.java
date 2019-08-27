public class HelloWorld {
 public static void main(String[] args){
     HelloWorld hw = new HelloWorld() ;
     hw.printName();    
   }
public void printName() {        

System.out.println(this.getClass().getName());    

}

}
