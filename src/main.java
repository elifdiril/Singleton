/**
 * @author Elif
 */
public class main {
    public static void main(String [] Args){
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if(instance == instance2){
            System.out.println("Just one instance created");
        }else
            System.out.println("Error");
    }
}
