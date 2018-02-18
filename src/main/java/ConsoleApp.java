import com.jjump.spring.CLI.Commands;
import com.jjump.spring.GeneralConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.shell.Bootstrap;

import java.io.IOException;
import java.util.logging.LogManager;

public class ConsoleApp {
    public static void main(String[] args) throws IOException {
//        -Djline.WindowsTerminal.directConsole=false -Djline.terminal=jline.UnsupportedTerminal

        System.out.println("Loading...");

        LogManager.getLogManager().reset(); // off spring-msg
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GeneralConfiguration.class);
        Commands.setContext(context);
        Bootstrap.main(args);
        context.close();

    }


}
