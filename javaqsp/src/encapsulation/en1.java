package encapsulation;

public class en1 
{
	private String name;
	
	private String account_number;
	
	private String balance;
	
	public String setname(String string)
	{
		return name;	}
	public void getename()
	{
      this.name=name;
	}
	public void getaccountnumber()
	{
		this.account_number=account_number;
	}
	public void getbalance()
	{
		this.balance=balance;
	}
	
}

//encapsulation:-wrappingup of data member declaray it as private and acess through getters and setteres

//getter is used to get the data

//setter is used to set the data

//syntax for getter method:-
//access specifier return-type of variable get