package encapsulation;

public class a
{
  private String studentname="janu";
  private int no_of_semister;
  private int no_of_backlogs;
  private int std_id;
  
 
  public void getstudent_name()
  {
	  this.studentname=studentname;
  }
  public String setstudent_name(String sname)
  {
	  return studentname;
  }
  
}
