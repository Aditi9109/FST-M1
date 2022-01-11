package activities;

class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8 {
	
	 static void exceptionTest(String str){
	        if(str == null) {
	            new CustomException("Custom msg : null");
	        } else {
	            System.out.println(str);
	        }
	    }
	 
    public static void main(String[] a){
        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
        } catch(Exception mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }

}
