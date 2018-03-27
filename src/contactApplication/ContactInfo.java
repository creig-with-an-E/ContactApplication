package contactApplication;

public class ContactInfo extends Contact{
	
	//					class properties
	
	private String emailAddress,facebokURL ,twitterURL;
	private int cellphoneNum;
	
	
	//					getters and setters
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFacebokURL() {
		return facebokURL;
	}
	public void setFacebokURL(String facebokURL) {
		this.facebokURL = facebokURL;
	}
	public String getTwitterURL() {
		return twitterURL;
	}
	public void setTwitterURL(String twitterURL) {
		this.twitterURL = twitterURL;
	}
	public int getCellphoneNum() {
		return cellphoneNum;
	}
	public void setCellphoneNum(int cellphoneNum) {
		this.cellphoneNum = cellphoneNum;
	}
	
	
}
