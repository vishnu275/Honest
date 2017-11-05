/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author vishnu.saraswathy
 */
public class BeanConfig {
    private static ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/resources/SpringConfiguration/spring-confg.xml"); 
    public static ApplicationContext getBeanFactory(){     
         return ctx;
    }
    private BeanConfig(){}
}
