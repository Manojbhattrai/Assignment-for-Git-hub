public class App {
    public static void main(String[] args) throws Exception {
        int age= 2;
        if(age>0 && age<20){
            System.out.println(age +". You are underage to take License.");
         } else{
            System.out.println(age +". You are able to take a License.");
         }
         System.out.println("Press space to exit");
    }
}
