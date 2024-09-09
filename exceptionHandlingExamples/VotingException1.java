package exceptionHandlingExamples;

 class VotingException extends Exception{
	public VotingException(String s) {//To print customized message
        super(s);
    }
}
 class VotingException1 {
    String validAge(int age) throws VotingException  {
        if(age<15) {
            throw new VotingException("Age is smaller than 15");
        }
        else {
            return "Valid for vote ";
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VotingException1 v=new VotingException1();
	        
	        try {
	            System.out.println(v.validAge(18));
	        } catch (VotingException e) {
	            System.out.println(e.getMessage());
	        
	        }

	}

}
