package com.christophe.marchal.classpathscanner.metadata.extractor;

import java.lang.reflect.Field;

import com.christophe.marchal.classpathscanner.metadata.annotation.XmlFieldMapping;
import com.christophe.marchal.classpathscanner.metadata.xml.XmlMetadata;

public class XmlMappingExtractor {

	private XmlMetadata metadata;
	
	public void extract(Class clazz){
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field f : fields){
			XmlFieldMapping mapping = f.getAnnotation(XmlFieldMapping.class);
			if(mapping != null){
				String field = f.getName();
				String xmlField = mapping.xmlField();
				// Default value case: xmlField = fieldName
				if("".equals(xmlField)){
					xmlField = field;
				}
				metadata.addMapping(field, xmlField);
			}
		}
	}

	public XmlMetadata getMetadata() {
		return metadata;
	}
	
	public void setMetadata(XmlMetadata metadata) {
		this.metadata = metadata;
	}
}
