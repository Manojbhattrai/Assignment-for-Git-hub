public class App {
    public static void main(String[] args) throws Exception {
        int age= 56;
        if(age>0 && age<18){
            System.out.println("Your age is "+ age +". You are underage to take License.");
         } else{
            System.out.println("Your age is "+ age +". You are able to take a License.");
         }
         System.out.println("Press space to exit");
    }
}
