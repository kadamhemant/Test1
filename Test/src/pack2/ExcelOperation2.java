package pack2;

public class ExcelOperation2 {

	
	public static void main(String[] args) {
		
		Xls_Reader d= new Xls_Reader("C:\\testing\\abc.xlsx");
		//d.addSheet("Data2");
		//d.addColumn("Data2", "City");
		d.setCellData("Data2", "Name", 2, "Hemant");
	    d.setCellData("Data2", "City", 2, "Pune");
		
		String column_data= d.getCellData("Data2", "Name", 2);
		System.out.println("Data in Column Name is "+column_data);
		String column_data1=d.getCellData("Data2", 1, 2);
		System.out.println("Data in Column City is "+column_data1);
		int rwocount= d.getRowCount("Data2");
		System.out.println("Total rows are "+rwocount);
		
	}

}
