public class MyData {
    private static MyData instance = null;
    private static String myString1;
    private static int number;
    
    private MyData() {
        // Private constructor to prevent instantiation
    }

    public static MyData getInstance() {
        if (instance == null) {
            instance = new MyData();
        }
        return instance;
    }

    public static String getMyString() {
        return myString1;
    }

    public void setMyString(String myString) {
        MyData.myString1 = myString;
    }
   

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		MyData.number = number;
	}

}
