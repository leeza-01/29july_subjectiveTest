package q2;

public class MainApp {

	public static void main(String[] args) {

		MainApp obj = new MainApp();
		/*Sample display of data 
		 passing employee code and display the data based on output*/
		
		obj.doPrintEmployee("P00101500");
	}

	public void display(String[] arr) {
		for (String empCode : arr) {
			doPrintEmployee(empCode);
		}
	}

	public void doPrintEmployee(String empCode) {
		// P00101500
		// P : production
		// 00101 : five digit employee code
		// 500 : city Pincode , Hydrabad

		char departmentCode = empCode.charAt(0);
		String empId = empCode.substring(1, 6);
		int cityCode = Integer.parseInt(empCode.substring(6, empCode.length()));
		String cityName = getCityName(cityCode);
		String deepartmentName = getDepartmentName(departmentCode);

		System.out.println("Employee Id : "+empId+", Department Name : "+deepartmentName+", Location : "+cityName);
	}

	public String getCityName(int cityCode) {
		String cityName = "";
		switch (cityCode) {
		case 500:
			cityName = "Hydrabad";
			break;
		}

		return cityName;
	}

	public String getDepartmentName(char code) {
		
		String departmentName = "";
		switch (code) {
		case 'P':
			 departmentName= "Production";
			break;
		}

		return departmentName;
	}
}