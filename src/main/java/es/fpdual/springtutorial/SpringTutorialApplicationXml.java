package es.fpdual.springtutorial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.fpdual.springtutorial.dependencias.xml.XmlBean;

@Configuration
@ComponentScan
public class SpringTutorialApplicationXml {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext
				= new ClassPathXmlApplicationContext("application-config.xml")) {
			
			XmlBean xmlBean
				= ProveedorContextoAplicacion.getApplicationContext().getBean(XmlBean.class);
			
			System.out.println(xmlBean);
			System.out.println(xmlBean.getXmlBeanDependency());
		}
	}

}
