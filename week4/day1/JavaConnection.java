package week4.day1;

public class JavaConnection extends MySqlConnection{
	
	@Override
	void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("Abstract class implementation in Concrete class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection obj = new JavaConnection();
		obj.connect();
		obj.executeUpdate();
		obj.disconnect();
		obj.executeQuery();
		
	}

	

}
