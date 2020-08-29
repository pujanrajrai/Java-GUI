public class JuniorDeveloper extends Developer
{
    //instance variable
  float salary;
  private String appointedDate;
  private String evaluationPeriod;
  private String terminationDate;
  private String specialization;
  private String appointedBy;
  private boolean joined;
  //constructor for juniorDeveloper
  public JuniorDeveloper(String platform, String interviewerName, int workingHours, float salary, String appointedBy,String terminationDate)
  {
      super(platform, interviewerName, workingHours);
      this.salary=salary;
      this.appointedBy=appointedBy;
      this.terminationDate=terminationDate;
      evaluationPeriod="";
      this.specialization="";
      this.joined=false;
  }
  public float getSalary()//getter method to get salary
    {
        return salary;
    }
  public String getAppointedDate()//getter method to get appointed date
    {
        return appointedDate;
    }
  public String getEvaluationPeriod()//getter method to get evaluation period
    {
        return evaluationPeriod;
    }
  public String getTerminationDate()//getter method to get termination date
    {
        return terminationDate;
    }
  public String getSpecialization()//getter method to get specilixation
    {
        return specialization;
    }
  public String getAppointedBy()//getter method to get who appointed the developer
    {
        return appointedBy;
    }
  public boolean getJoined()//getter method to get developer has joined or not
    {
       return joined;
    }
  public void setSalary(float salary)
  {
       if(joined==false)
       {
            this.salary=salary;
            System.out.println("Salary is successfully set");
       }
       if(joined==true)
       {
            System.out.println("The developer is already joined.");
            System.out.println("Therefore it is not possible to change ta salary");
       } 
  }
  
  public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization)
  {
        if (joined==false)
        {
            setDeveloperName(developerName);
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
            joined=true;
        }
        else
        {
            System.out.println("The developer is already appointed.");
            System.out.println("Appointed Date is "+getAppointedDate());
        }
  }
  public void display()
  {
        super.display();//
        if(joined==true)
        {
            System.out.println("Appointed Date is "+getAppointedDate());
            System.out.println("Evaluation Period is "+getEvaluationPeriod());
            System.out.println("Termination Date is "+getTerminationDate());
            System.out.println("Developer Salary is "+getSalary());
            System.out.println("Developer Specialization is "+getSpecialization());
            System.out.println("Appointed By is "+getAppointedBy());
        }
  }
}
    
      
      
  
        