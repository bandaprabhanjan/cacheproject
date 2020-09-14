package com.custom.markerinterface;

public class MarkerEntityDao {

	public boolean save(Object object) throws InvalidEntityFoundException {
		boolean isSaved = false;
		if (object instanceof MarkerEntity) {
			System.out.println("entity save to db");
			isSaved = true;
		} else {
			throw new InvalidEntityFoundException("Entity cannot be saved");
		}
		return isSaved;

	}
}
