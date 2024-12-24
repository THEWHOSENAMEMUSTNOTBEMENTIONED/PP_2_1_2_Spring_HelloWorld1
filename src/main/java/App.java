import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Создаем контекст Spring и передаем ему конфигурацию
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем бин HelloWorld дважды
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");

        // Получаем бин Cat дважды
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        // Выводим сообщение для HelloWorld
        System.out.println(helloWorld1.getMessage());

        // Сравниваем два объекта HelloWorld
        System.out.println("Are helloWorld beans the same? " + (helloWorld1 == helloWorld2)); // Должно быть true

        // Сравниваем два объекта Cat
        System.out.println("Cat1: " + cat1);
        System.out.println("Cat2: " + cat2);
        System.out.println("Are cat beans the same? " + (cat1 == cat2)); // Должно быть false
    }
}
