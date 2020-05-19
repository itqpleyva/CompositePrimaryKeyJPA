package Main.Models.Account;

import java.io.Serializable;

public class AccountId implements Serializable {
	
    public AccountId() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String accountNumber;
 
    private String accountType;
 
    // default constructor
 
    public AccountId(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
 
}