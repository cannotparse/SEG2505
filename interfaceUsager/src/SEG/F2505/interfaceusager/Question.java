package seg.f2505.interfaceusager;

public class Question {
	
	private String quesTxt;
	private String ansText;
	private Status status;
	private String[] domain;
	
	public Question(String question,String[] domain){
		this.domain = domain;
		this.quesTxt = question;
		status = Status.UNASSIGNED;
	} 
	public Question(Question a){
		this.quesTxt=a.getQuesTxt();
		this.ansText=a.getAnsText();
		this.status=(Status) a.getStatus();
		this.domain[0]=a.getDomain(0);
		this.domain[1]=a.getDomain(1);
	}
	
	//Getters
	public String getQuesTxt() {
		return quesTxt;
	}
	public String getAnsText() {
		return ansText;
	}
	public Status getStatus() {
		return status;
	}
	public String getDomain(int i) {
		return domain[i];
	}
	
	//setters
	public void setAnsText(String ansText) {
		this.ansText = ansText;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public enum Status {
		UNASSIGNED,ASSIGNED,ACCEPTED,ANSWERED 
	}
}
