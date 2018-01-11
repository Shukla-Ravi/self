package jvm;
public class Application {
    public static void main(String[] args) {
        
        final static class Constants {
            public static String name = "PI";
        }
        
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Constants.name);
            }
            
        });
        
        thread.start();
    }
}