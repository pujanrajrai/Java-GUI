public class Developer{
    //declaring the instance variables
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHours;
    //constructor for Developer class
    public Developer(String platform,String interviewerName,int workingHours)
    {
         this.platform=platform;
         this.interviewerName=interviewerName;
         this.developerName="";
         this.workingHours=workingHours;
    }
    public String getPlatform()//getter method to get platform
    {
         return platform;
    }
    public String getInterviewerName()//getter method to get interviewer name
    {
         return interviewerName;
    }
    public String getDeveloperName()//getter method to get developer name
    {
         return developerName;
    }
    public int getWorkingHours()//getter method to get working hours
    {
         return workingHours;
    }
    public void setDeveloperName(String developerName)//setter method for set the developer name
    {
         this.developerName=developerName;
    }
    //creating the a display method to print platform,interviewer name,working hours and developer name
    public void display()
    {
         System.out.println("Platform is "+getPlatform());
         System.out.println("Interviewer Name is "+getInterviewerName());
         System.out.println("Working Hours is "+getWorkingHours());
         if(!developerName.equals(""))
         {
              System.out.println("Developer Name is "+getDeveloperName());
         }
    }
}
        
        