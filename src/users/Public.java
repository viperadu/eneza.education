package users;

public class Public extends User{

	
	public Public(String name, String password, int number){
		super(name, password, number);
		this.user_type = "public";
		this.user_id = getNewUserID();
	}
	
	private int getNewUserID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Public(String name, String password, String email){
		super(name, password, email);
		this.user_type = "public";
		this.user_id = getNewUserID();
	}
}
