package Model;

public class Customer {
	
	String Name;
	String Nickname;
	String Id;
	String Address;
	String birthday;
	String tel;
	String gender; 
	String type;
	
	
	public Customer() {
		
	}
	public Customer(String Id,String Name, String Nickname,String Address,String birthday, String tel,String genter,String type){
		this.Id=Id;
		this.Name=Name;
		this.Nickname=Nickname;
		this.Address=Address;
		this.birthday=birthday;
		this.tel=tel;
		
	}

  public void setId(String Id) {
	  this.Id=Id;
  }
  public String getId() {
	  return this.Id;
  }
  public void setName(String Name) {
	  this.Name=Name;
  }
  public String getName() {
	 return this.Name;
  }
  public void setNickname(String NickName) {
	  this.Nickname=NickName;
  }
  public String getNickName() {
	  return this.Nickname;
  }
  public void setAddress(String Address) {
	  this.Address=Address;
  }
  public String getAddress() {
	  return this.Address;
  }
  public void setBirthday(String birthbay) {
	  this.birthday=birthday;
  }
  public String getBirthday() {
	  return this.birthday;
  }
  public void setTel(String tel) {
	  this.tel=tel;
  }
  public String getTel() {
	  return this.tel;
  }
  public void setGender(String string) {
	  this.gender=gender;
  }
  public String getGender() {
	  return this.gender;
  }
  public void setType(String type) {
	  this.type=type;
  }
  public String getType() {
	  return this.type;
  }
  
  
}
  
  
  