package com.radhe.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.map.JsonSerializer;

public class DateSerializer extends JsonSerializer<Date> {
	public void serialize(Date value, org.codehaus.jackson.JsonGenerator jgen, org.codehaus.jackson.map.SerializerProvider provider) throws java.io.IOException ,org.codehaus.jackson.JsonProcessingException {
		
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
	
	String dob=sdf.format(value);
	jgen.writeString(dob);
	}

}
