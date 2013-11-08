package seg.f2505.interfaceusager;

import java.io.Serializable;

public class Profile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usrnm;
	private String eml;
	private String x;
	private Question[] ques; 
	
	public Profile(String username, String email, String password){
		this.usrnm = username;
		this.eml = email;
		this.x = password;
	}
	public Boolean verifyX(String y){
		if(x.equals(y)){
			return true;
		}
		return false;
	}
	public String getEmail(){
		return eml;
	}
	public void addQuestion(Question a){
		Question[] t;
		t = new Question[ques.length +1];
		for(int i=0;i<t.length;i++){
			
		}
		
	}
	public Question[] getQuestions(){
		return ques;
	}
	public Question getQuestion(int i){
		return ques[i];
	}
	public String toString(){
		return "Username :"+usrnm+ "- Email : "+eml;
	}
}
