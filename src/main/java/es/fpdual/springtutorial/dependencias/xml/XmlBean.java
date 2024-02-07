package es.fpdual.springtutorial.dependencias.xml;

public class XmlBean {

	private XmlBeanDependency xmlBeanDependency;
	
	public XmlBean() {
		
	}
	
	public XmlBean(XmlBeanDependency xmlBeanDependency) {
		this.xmlBeanDependency = xmlBeanDependency;
	}

	public XmlBeanDependency getXmlBeanDependency() {
		return xmlBeanDependency;
	}

	public void setXmlBeanDependency(XmlBeanDependency xmlBeanDependency) {
		this.xmlBeanDependency = xmlBeanDependency;
	}
}
