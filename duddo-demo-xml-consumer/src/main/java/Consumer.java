import api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        new String[]{"consumer.xml"});
    context.start();
    System.out.println("consumer start");
    DemoService demoService = (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
    String hello = demoService.sayHello("world"); // execute remote invocation
    System.out.println(hello); // show the result
  }
}
