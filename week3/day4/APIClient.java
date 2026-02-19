package week3.day4;

public class APIClient {
	
	public void sendRequest(String endPoint)
	{
		System.out.println(endPoint);
	}
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus)
	{
		System.out.println("Get " +endPoint +" Check " +requestBody+ " Output "+ requestStatus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient obj = new APIClient();
		obj.sendRequest("www.facebook.com");
		obj.sendRequest("www.test.com", "200", true);
	}

}
