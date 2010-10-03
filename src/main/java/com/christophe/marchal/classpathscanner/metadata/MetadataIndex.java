package com.christophe.marchal.classpathscanner.metadata;

import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import com.christophe.marchal.classpathscanner.metadata.annotation.XmlMapping;
import com.christophe.marchal.classpathscanner.metadata.extractor.XmlMappingExtractor;
import com.christophe.marchal.classpathscanner.metadata.xml.XmlMetadata;


public class MetadataIndex {

	private String packageName;
	
	private XmlMappingExtractor extractor;
	
	public void init() throws ClassNotFoundException{
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
		// Configure the scanner
		scanner.addIncludeFilter(new  AnnotationTypeFilter(XmlMapping.class));
		String folder = packageName.replace('.', '/');
		Set<BeanDefinition> beans = scanner.findCandidateComponents(folder);
		if(beans == null){
			return;
		}
		for(BeanDefinition b : beans ){
			String beanName = b.getBeanClassName();
			
			Class clazz = Class.forName(beanName);
			extractor.extract(clazz);
		}
	}
	
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	public void setExtractor(XmlMappingExtractor extractor) {
		this.extractor = extractor;
	}
	
	public XmlMetadata getXmlMetadata(){
		return extractor.getMetadata();
	}
	
	@Override
	public String toString() {
		return getXmlMetadata().toString();
	}
}
