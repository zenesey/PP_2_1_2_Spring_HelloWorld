import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = applicationContext.getBean("helloworld",HelloWorld.class);
        Cat cat1 = applicationContext.getBean("cat",Cat.class);
        Cat cat2 = applicationContext.getBean("cat",Cat.class);

        System.out.println(bean.getMessage());
        System.out.println(bean);
        System.out.println(bean2 + "\n");
        System.out.println(bean == bean2);
        System.out.println();

        System.out.println(cat1);
        System.out.println(cat2 + "\n");
        System.out.println(cat1 == cat2);



    }
}