package springexamples;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBeans implements BeanPostProcessor{
public Object PostProcessBeforeInitialization(Object bean,String beanName)throws BeanException
    System.out.println("Before Initialization");
return bean;
}
public Object postProcessorAfterInitialization(Object bean,String bean1)throws BeanException{
	System.out.println("after Initialization");
}
