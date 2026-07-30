package q2;

public class OrgOperations implements EmployeeData {

	@Override
	public String[] getAllEmployeesBasedOnLocation(String cityName) {
		String code=" ";
		for(int i=0; i<city.length;i++)
			if(city[i].equalsIgnoreCase(cityName)){
				code=citycode[i];
			}
		int count=0;
		for(int i=0; i<allEmployeesId.length;i++)
			if(allEmployeesId[i].endsWith(code)) {
								count++;
			}
	String result[]=new String[count];
	int index=0;
	for(int i= 0;i<allEmployeesId.length;i++)
		if(allEmployeesId[i].endsWith(code)) {
			result[index++]=allEmployeesId[i];
		}
	
		
		return result;
	}

	@Override
	public String[] getAllEmployeesBasedOnDepartment(String departmentName) {
		
		char code=' ';
		if(departmentName.equalsIgnoreCase("Production")) {
			code='P';
		}else if(departmentName.equalsIgnoreCase("Testing")) {
			code='T';
		}else if(departmentName.equalsIgnoreCase("Research")) {
			code='R';
		}
		else if(departmentName.equalsIgnoreCase("Business")) {
			code='B';
		}
		else if(departmentName.equalsIgnoreCase("Marketing")) {
			code='M';
		}
		
		int count = 0;

		for(int i = 0; i < allEmployeesId.length; i++) {
		    if(allEmployeesId[i].charAt(0) == code) {
		        count++;
		    }
		}

		String result[] = new String[count];

		int j = 0;
		for(int i = 0; i < allEmployeesId.length; i++) {
		    if(allEmployeesId[i].charAt(0) == code) {
		        result[j] = allEmployeesId[i];
		        j++;
		    }
		}

		return result;
	}
		

	@Override
	public String getEmployeesByCityNameAndDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countEmployeesByDepartmentAndCity(String departmentName, String cityName) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}