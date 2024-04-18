package com.prowings.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.dozer.CustomConverter;

public class DateConverter implements CustomConverter {

	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
		
		String isoDate = null;
		if(sourceFieldValue == null)
		return null;
		if(sourceFieldValue instanceof Long) {
			long dateInLong =(Long)sourceFieldValue;
			
			Date date = new Date(dateInLong * 1000);
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            isoDate = format.format(date);
        	System.out.println(">>>>Date after conversion : "+isoDate);
			
		}
		return isoDate;
	}

}
