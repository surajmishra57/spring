package org.example.autowiredLab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = {"org.example.**"})
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);

        // get all bean definition name;
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);


        // this is simple example of autowired not needed if we have only one constructor
        MovieRecommender movieRecommender = applicationContext.getBean("movieRecommender", MovieRecommender.class);
        movieRecommender.getRating();


        // this is simple example of autowired with setter method
        SimpleMovieLister simpleMovieLister = applicationContext.getBean("simpleMovieLister", SimpleMovieLister.class);
        System.out.println(simpleMovieLister.getMovieFinder().getResult());
        simpleMovieLister.getMovieCatalog();

        BeanConfig beanConfig = applicationContext.getBean("beanConfig", BeanConfig.class);
        System.out.println(beanConfig.getData());


    }
}

