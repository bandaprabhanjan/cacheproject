package com.custom.markerinterface;

public class CustomMarkerInterfaceTest {
	/*
	 * @Autowired private MarkerEntityService entityService;
	 * 
	 * @Autowired private Employee employee;
	 * 
	 * public void entityService() { try { entityService.save(employee); } catch
	 * (InvalidEntityFoundException e) { e.printStackTrace(); }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Employee employee = new Employee();
		try {
			new MarkerEntityService().save(employee);
		} catch (InvalidEntityFoundException e) {
			e.printStackTrace();
		}
	}

}
