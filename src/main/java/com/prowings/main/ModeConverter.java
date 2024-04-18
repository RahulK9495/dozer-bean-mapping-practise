package com.prowings.main;

import org.dozer.CustomConverter;

public class ModeConverter implements CustomConverter {

	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {

		if(sourceFieldValue == null)
			return null;
		if(sourceFieldValue instanceof Integer) {
			int source =(Integer)sourceFieldValue;
			if(source==1)
				return "hello";
			else if (source == 2)
				return "hiii";
				else if (source == 3)
					return "world";
			
		}
		return "Invalid value";
	}

}
