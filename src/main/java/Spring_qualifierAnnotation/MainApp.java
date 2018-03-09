package Spring_qualifierAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("qualifier_Bean.xml");

        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();
    }
}
