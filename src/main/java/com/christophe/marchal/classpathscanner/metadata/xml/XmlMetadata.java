package com.christophe.marchal.classpathscanner.metadata.xml;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class XmlMetadata {

	private Map<String, String> xmlMetadata = new Hashtable<String, String>();
	
	public String getXmlValue(String field){
		return xmlMetadata.get(field);
	}
	
	public void addMapping(String field, String xmlField){
		xmlMetadata.put(field, xmlField);
	}
	
	@Override
	public String toString() {
		Set<String> fields = xmlMetadata.keySet();
		StringBuilder sb = new StringBuilder("XML mapping\n");
		for(String f : fields){
			sb.append("\t attribute: ");
			sb.append(f);
			sb.append(" <--> xml: ");
			sb.append(xmlMetadata.get(f));
			sb.append("\n");
		}
		return sb.toString();
	}
}
