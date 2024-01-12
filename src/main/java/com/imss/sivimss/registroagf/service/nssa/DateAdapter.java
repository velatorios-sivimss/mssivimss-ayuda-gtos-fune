package com.imss.sivimss.registroagf.service.nssa;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import org.springframework.expression.ParseException;
import java.util.GregorianCalendar;

public class DateAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public XMLGregorianCalendar unmarshal(String dateString) throws Exception {
		
		if (dateString != null && !dateString.isEmpty()) {
			
			try {
				
				Date date = dateFormat.parse(dateString);
				GregorianCalendar gregorianCalendar = new GregorianCalendar();
				gregorianCalendar.setTime(date);
				return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
			}catch (ParseException | DatatypeConfigurationException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String marshal(XMLGregorianCalendar xmlGregorianCalendar) throws Exception {
		if (xmlGregorianCalendar != null) {
			Date date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			return dateFormat.format(date);
		}
		return null;
	} 
	
}
