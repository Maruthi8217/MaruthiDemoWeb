package Exception_handling;

public class throwsa
{
	String sname;
	int eid;
	double salary;
	public throwsa(String sname,int eid,double salary)
	{
		this.sname=sname;
		this.eid=eid;
		this.salary=salary;
	}
	public static void main(String[] args)
	{
		throwsa s1=new throwsa("manu",111,1000);
		throwsa s2=new throwsa("m++ruthi",112,11100);
		throwsa s3=new throwsa("shree",131,2000);
		throwsa data[]=new throwsa[3];
		data[0]=s1;
		data[1]=s2;
		data[2]=s3;
		for (int i = 0; i < data.length; i++) 
		{
			System.out.println(data[i]);
		}

	}
}


//throws is a keyword which is used to prpagate the exception