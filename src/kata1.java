
import java.util.Date;

public class kata1 {
    public static void main (String[]arg){
        Date birt = new Date(93,1,24);
        Student yunior = new Student("yuni",birt);
        System.out.println (yunior.getBirthDate());
        System.out.println (yunior.getBirthDate());
        System.out.println (yunior.getAge());
    }
            
}
