public class SeniorDeveloper extends Developer{
    //creating the instance variable
    private float salary;
    private String joinDate;
    private String staffRoomNo;
    private int contractPeriod;
    private float advanceSalary;
    private boolean appointed;
    private boolean terminated;
    //constructor for Senior developer class
    public SeniorDeveloper(String platform, String interviewerName, int workingHours, float salary,int contractPeriod)
    {
        super(platform, interviewerName, workingHours);
        this.salary=salary;
        this.contractPeriod=contractPeriod;
        this.joinDate="";
        this.staffRoomNo="";
        this.advanceSalary=0.0f;
        this.appointed=false;
        this.terminated=false;
    }
    public float getSalary()//getter method to get salary
    {
        return salary;
    }
    public String getJoinDate()//getter method to get joined date
    {
        return joinDate;
    }
    public String getStaffRoomNo()//getter method to get staff room number
    {
        return staffRoomNo;
    }
    public int getContractPeriod()//getter method to get contract period
    {
        return contractPeriod;
    }
    public float getAdvanceSalary()//getter method to get advance salary
    {
        return advanceSalary;
    }
    public boolean getAppointed()//getter method to get appointed or not
    {
        return appointed;
    }
    public boolean getTerminated()//getter method to get terminated or not
    {
        return terminated;
    }
    public void setSalary(float salary)//setter method to set the salary
    {
       this.salary=salary;
    }
    public void setContractPeriod(int contractPeriod)//setter method to set the contract period
    {
        this.contractPeriod=contractPeriod;
    }
    public void hireDeveloper(String developerName, String joinDate, float advanceSalary, String staffRoomNo)
    {//method to hire developer
        if(appointed==true)//if developer is appointed 
        {
            System.out.println("Developer is already hired.");
            System.out.println("Developer Name is "+getDeveloperName());
            System.out.println("Room Numberis "+getStaffRoomNo());
        }
        else//if developer is not appointed
        {
            setDeveloperName(developerName);
            this.joinDate=joinDate;
            this.staffRoomNo=staffRoomNo;
            this.advanceSalary=advanceSalary;
            System.out.println("The developer is successfully hired");
            appointed=true;
            terminated=false;
            
        }
    }
    public void termination()//method to  terminate the contract
    {
        if(terminated==true)//if the contract had been terminated
        {
            System.out.println("Developer is already terminated.");
            System.out.println("You can hire new developer now.");
        }
        else//if contract is not terminated
        {
            setDeveloperName("");
            joinDate="";
            advanceSalary=0.0f;
            System.out.println("The developer is successfully terminated");
            terminated=true;
            appointed=false;
        }
    }
    public void print()//method to display platform,interviewer name and salary
    {
        System.out.println("Platform is "+getPlatform());
        System.out.println("Interviewer Name is "+getInterviewerName());
        System.out.println("Developer Salary is "+getSalary());
    }
    public void display()//method to display the staff room number,join date and advance salary
    {
        super.display();
        if(appointed==true)
        {
            System.out.println("Staff Room Number is "+getStaffRoomNo());
            System.out.println("Join Date is "+getJoinDate());
            System.out.println("Advance Salary is "+getAdvanceSalary());
        }
    }
}
    
        
    
    
        
    
     