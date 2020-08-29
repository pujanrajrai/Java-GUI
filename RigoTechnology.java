
    
    /**
     * Write a description of class RigoTechnology here.
     *
     * @author Pujan Raj Rai
     * @version 2.0
     */
    import javax.swing.*;
    import java.awt.event.*;
    import java.util.*;
    
    public class RigoTechnology implements ActionListener
    {
                ArrayList<Developer> list=new ArrayList<Developer>();
                
        JFrame frm, asfrm, htsfrm, ajfrm, hjfrm;
        
            JButton btnAddSrDev ,
            btnHireSrDev ,
            btnExit ,
            btnAddJrDev,
            btnHireJrDev ,
            btnDisplay,
            btnAddJr,btnClearAddJr,btnCancelAddJr,
            btnHireJr,btnClearHireJr,btnCancelHireJr,
            btnHireSr,btnClearSr,btnCancelSr,btnTerminateSr,
            btnAddSr,btnClearAddSr,btnCancelAddSr
            
            ;
            
            JLabel lblTitle,lblPlatform1,lblIntName1,lblSalary1,lblWrh1,lblContact,
            lblDevName1,lblJoinDate1,lblAdSalary,lblPNo1,lblStaff,
            lblPlatform2,lblIntName2,lblSalary2,lblWrh2,lblAppBy,lblTerDate1,
            lblDevName2,lblJoinDate2,lblTerDate2,lblSpecialization,lblPNo2,
            lblTerDate3;
            
            JTextField txtPlatform1,txtIntName1,txtSalary1,txtWrh1,txtContact,
            txtDevName1,txtJoinDate1,txtAdSalary,txtPNo1,txtStaff,
            txtPlatform2,txtIntName2,txtSalary2,txtWrh2,txtAppBy,txtTerDate1,
            txtDevName2,txtJoinDate2,txtTerDate2,txtSpecialization,txtPNo2,
            txtTerDate3;
       

        
        public static void main(String[] args)
        {
            new RigoTechnology().developerGUI();
    
        }
       
        public void developerGUI()
        {
           frm=new JFrame("Rigo Technology");
           frm.setVisible(true);
           frm.setSize(533,470);
           frm.setLayout(null);
           
           btnAddJrDev=new JButton("Add Junior Developer");
           frm.add(btnAddJrDev);
           btnAddJrDev.setBounds(40,10,220,100);
           btnAddJrDev.addActionListener(this);
           
           btnHireJrDev = new JButton("Hire Junior Developer");
           frm.add(btnHireJrDev);
           btnHireJrDev.setBounds(300,10,220,100);
           btnHireJrDev.addActionListener(this);
           
           
           btnAddSrDev=new JButton("Add Senior Developer");
           frm.add(btnAddSrDev);
           btnAddSrDev.setBounds(40,150,220,100);
           btnAddSrDev.addActionListener(this);
           
           btnHireSrDev=new JButton("Hire/Terminate Senior Devloper");
           frm.add(btnHireSrDev);
           btnHireSrDev.setBounds(300,150,220,100);
           btnHireSrDev.addActionListener(this);
           
           
           btnDisplay=new JButton("Display all");
           frm.add(btnDisplay);
           btnDisplay.setBounds(40,290,220,100);
           btnDisplay.addActionListener(this);
           
           btnExit=new JButton("Exit");
           frm.add(btnExit);
           btnExit.setBounds(300,290,220,100);
           btnExit.addActionListener(this);
           
           
           
         
      }
      
      public void AddSeniorDev()
      {
           asfrm=new JFrame("Add Senior Developer");
           asfrm.setVisible(true);
           asfrm.setSize(470,350);
           asfrm.setLayout(null);
           
           lblTitle=new JLabel("Add Senior Developer");
           lblTitle.setBounds(20,10,250,30);
           lblTitle.setFont(lblTitle.getFont().deriveFont(16f));
           asfrm.add(lblTitle);
           
           lblPlatform1=new JLabel("Platform:");
           asfrm.add(lblPlatform1);
           lblPlatform1.setBounds(20,50,250,30);
     
           txtPlatform1=new JTextField();
           asfrm.add(txtPlatform1);
           txtPlatform1.setBounds(150,50,250,30);
           
           lblIntName1=new JLabel("Interviewer's Name:");
           asfrm.add(lblIntName1);
           lblIntName1.setBounds(20,80,250,30);
           
           txtIntName1=new JTextField();
           asfrm.add(txtIntName1);
           txtIntName1.setBounds(150,80,250,30);
           
           lblSalary1=new JLabel("Salary:");
           asfrm.add(lblSalary1);
           lblSalary1.setBounds(20,110,250,30);
           
           txtSalary1=new JTextField();
           asfrm.add(txtSalary1);
           txtSalary1.setBounds(150,110,250,30);
           
           lblWrh1=new JLabel("Working Hours:");
           asfrm.add(lblWrh1);
           lblWrh1.setBounds(20,140,250,30);
    
           txtWrh1=new JTextField();
           asfrm.add(txtWrh1);
           txtWrh1.setBounds(150,140,250,30);
           
           lblContact=new JLabel("Contact Period:");
           asfrm.add(lblContact);
           lblContact.setBounds(20,170,250,30);
           
           txtContact=new JTextField();
           asfrm.add(txtContact);
           txtContact.setBounds(150,170,250,30);
           
           btnAddSr=new JButton("Add");
           asfrm.add(btnAddSr);
           btnAddSr.setBounds(100,210,100,60);
           btnAddSr.addActionListener(this);
           
           btnClearAddSr=new JButton("Clear");
           asfrm.add(btnClearAddSr);
           btnClearAddSr.setBounds(200,210,100,60);
           btnClearAddSr.addActionListener(this);
           
           
           btnCancelAddSr=new JButton("Cancel");
           asfrm.add(btnCancelAddSr);
           btnCancelAddSr.setBounds(300,210,100,60);
           btnCancelAddSr.addActionListener(this);
           
           
      }
      
      public void HireTerSrDev()
      {
           htsfrm=new JFrame("Hire/Terminate Senior Devloper");
           htsfrm.setVisible(true);
           htsfrm.setSize(470,350);
           htsfrm.setLayout(null);
           
           lblTitle=new JLabel("Hire/Terminate Senior Devloper");
           lblTitle.setBounds(20,10,300,30);
           lblTitle.setFont(lblTitle.getFont().deriveFont(16f));
           htsfrm.add(lblTitle);
           
           lblDevName1=new JLabel("Developer's Name:");
           htsfrm.add(lblDevName1);
           lblDevName1.setBounds(20,50,250,30);
           
           txtDevName1=new JTextField();
           htsfrm.add(txtDevName1);
           txtDevName1.setBounds(150,50,250,30);
         
           lblJoinDate1=new JLabel("Join Date:");
           htsfrm.add(lblJoinDate1);
           lblJoinDate1.setBounds(20,80,250,30);
           
           txtJoinDate1=new JTextField();
           htsfrm.add(txtJoinDate1);
           txtJoinDate1.setBounds(150,80,250,30);
           
           lblAdSalary=new JLabel("Advance Salary:");
           htsfrm.add(lblAdSalary);
           lblAdSalary.setBounds(20,110,250,30);
    
           txtAdSalary=new JTextField();
           htsfrm.add(txtAdSalary);
           txtAdSalary.setBounds(150,110,250,30);
           
           lblStaff=new JLabel("Staff Room No:");
           htsfrm.add(lblStaff);
           lblStaff.setBounds(20,140,250,30);
           
           txtStaff=new JTextField();
           htsfrm.add(txtStaff);
           txtStaff.setBounds(150,140,250,30);
    
           lblPNo1=new JLabel("Platform No:");
           htsfrm.add(lblPNo1);
           lblPNo1.setBounds(20,170,250,30);
    
           txtPNo1=new JTextField();
           htsfrm.add(txtPNo1);
           txtPNo1.setBounds(150,170,250,30);
    
           btnHireSr=new JButton("Hire");
           htsfrm.add(btnHireSr);
           btnHireSr.setBounds(10,200,100,60);
           btnHireSr.addActionListener(this);
           
           
           btnTerminateSr=new JButton("Terminate");
           htsfrm.add(btnTerminateSr);
           btnTerminateSr.setBounds(110,200,100,60);
           btnTerminateSr.addActionListener(this);
           
           btnClearSr=new JButton("Clear");
           htsfrm.add(btnClearSr);
           btnClearSr.setBounds(210,200,100,60);
           btnClearSr.addActionListener(this);
           
           
           btnCancelSr=new JButton("Cancel");
           htsfrm.add(btnCancelSr);
           btnCancelSr.setBounds(310,200,100,60);
           btnCancelSr.addActionListener(this); 
           
           
      }  
      
      public void AddJrDev(){
        
           ajfrm=new JFrame("Add Junior Developer");
           ajfrm.setVisible(true);
           ajfrm.setSize(470,350);
           ajfrm.setLayout(null);
           
           lblTitle=new JLabel("Add Junior Developer");
           ajfrm.add(lblTitle);
           lblTitle.setBounds(20,10,250,30);
           lblTitle.setFont(lblTitle.getFont().deriveFont(16f));
           
           lblPlatform2=new JLabel("Platform:");
           lblPlatform2.setBounds(20,50,250,30);
           ajfrm.add(lblPlatform2);
           
           txtPlatform2=new JTextField();
           ajfrm.add(txtPlatform2);
           txtPlatform2.setBounds(150,50,250,30);
           
           lblIntName2=new JLabel("Interviewer's Name:");
           ajfrm.add(lblIntName2);
           lblIntName2.setBounds(20,80,250,30);
           
           txtIntName2=new JTextField();
           ajfrm.add(txtIntName2);
           txtIntName2.setBounds(150,80,250,30);
           
           lblSalary2=new JLabel("Salary:");
           ajfrm.add(lblSalary2);
           lblSalary2.setBounds(20,110,250,30);
           
           txtSalary2=new JTextField();
           ajfrm.add(txtSalary2);
           txtSalary2.setBounds(150,110,250,30);
           
           lblWrh2=new JLabel("Working Hours:");
           ajfrm.add(lblWrh2);
           lblWrh2.setBounds(20,140,250,30);
    
           txtWrh2=new JTextField();
           ajfrm.add(txtWrh2);
           txtWrh2.setBounds(150,140,250,30);
           
           lblAppBy=new JLabel("Appointed By");
           ajfrm.add(lblAppBy);
           lblAppBy.setBounds(20,170,250,30);
           
           txtAppBy=new JTextField();
           ajfrm.add(txtAppBy);
           txtAppBy.setBounds(150,170,250,30);
           
           lblTerDate2=new JLabel("Termination Date:");
           ajfrm.add(lblTerDate2);
           lblTerDate2.setBounds(20,200,250,30);
    
           txtTerDate2=new JTextField();
           ajfrm.add(txtTerDate2);
           txtTerDate2.setBounds(150,200,250,30);
           
           btnAddJr=new JButton("Add");
           ajfrm.add(btnAddJr);
           btnAddJr.setBounds(100,240,100,60);
           btnAddJr.addActionListener(this);
           
           btnClearAddJr=new JButton("Clear");
           ajfrm.add(btnClearAddJr);
           btnClearAddJr.setBounds(200,240,100,60);
           btnClearAddJr.addActionListener(this);
           
           
           btnCancelAddJr=new JButton("Cancel");
           ajfrm.add(btnCancelAddJr);
           btnCancelAddJr.setBounds(300,240,100,60);
           btnCancelAddJr.addActionListener(this);
           
           
    
    }
    public void HireJrDev()
      {
           hjfrm=new JFrame("Hire Junior Developer");
           hjfrm.setVisible(true);
           hjfrm.setSize(470,350);
           hjfrm.setLayout(null);
           
           lblTitle=new JLabel("Hire Junior Developer");
           hjfrm.add(lblTitle);
           lblTitle.setBounds(20,10,250,30);
           lblTitle.setFont(lblTitle.getFont().deriveFont(16f));
           
           
                  
           lblDevName2=new JLabel("Developer's Name:");
           hjfrm.add(lblDevName2);
           lblDevName2.setBounds(20,40,250,30);
           
           txtDevName2=new JTextField();
           hjfrm.add(txtDevName2);
           txtDevName2.setBounds(150,40,250,30);
         
           lblJoinDate2=new JLabel("Join Date:");
           hjfrm.add(lblJoinDate2);
           lblJoinDate2.setBounds(20,70,250,30);
           
           txtJoinDate2=new JTextField();
           hjfrm.add(txtJoinDate2);
           txtJoinDate2.setBounds(150,70,250,30);
           
           lblTerDate3=new JLabel("Termination Date:");
           hjfrm.add(lblTerDate3);
           lblTerDate3.setBounds(20,100,250,30);
           
           txtTerDate3=new JTextField();
           hjfrm.add(txtTerDate3);
           txtTerDate3.setBounds(150,100,250,30);
           
           lblSpecialization=new JLabel("Specialization:");
           hjfrm.add(lblSpecialization);
           lblSpecialization.setBounds(20,130,250,30);
           
           txtSpecialization=new JTextField();
           hjfrm.add(txtSpecialization);
           txtSpecialization.setBounds(150,130,250,30);
           
           lblPNo2=new JLabel("Platform No:");
           hjfrm.add(lblPNo2);
           lblPNo2.setBounds(20,160,250,30);
    
           txtPNo2=new JTextField();
           hjfrm.add(txtPNo2);
           txtPNo2.setBounds(150,160,250,30);
           
           btnHireJr=new JButton("Hire");
           hjfrm.add(btnHireJr);
           btnHireJr.setBounds(100,200,100,60);
           btnHireJr.addActionListener(this);
           
           btnClearHireJr = new JButton("Clear");
           hjfrm.add(btnClearHireJr);
           btnClearHireJr.setBounds(200,200,100,60);
           btnClearHireJr.addActionListener(this);
           
           
           btnCancelHireJr=new JButton("Cancel");
           hjfrm.add(btnCancelHireJr);
           btnCancelHireJr.setBounds(300,200,100,60);
           btnCancelHireJr.addActionListener(this);
           
           
      }
public void ClearAddJr(){
  txtPlatform2.setText("");
  txtIntName2.setText("");
  txtSalary2.setText("");
  txtWrh2.setText("");
  txtAppBy.setText("");
  txtTerDate2.setText("");

}
public void ClearHireJr(){
  txtDevName2.setText("");
  txtJoinDate2.setText("");
  txtSpecialization.setText("");
  txtPNo2.setText("");
  txtTerDate3.setText("");
        

}
public void ClearAddSr(){
  txtPlatform1.setText("");
  txtIntName1.setText("");
  txtSalary1.setText("");
  txtWrh1.setText("");
  txtContact.setText("");
  
}
public void ClearSr(){
    txtDevName1.setText("");
    txtJoinDate1.setText("");
    txtAdSalary.setText("");
    txtPNo1.setText("");
    txtStaff.setText("");
    
}
public void AddJr(){
    if(txtPlatform2.getText().equals("") || txtIntName2.getText().equals("") || txtSalary2.getText().equals("")
    || txtWrh2.getText().equals("") || txtAppBy.getText().equals("") || txtTerDate2.getText().equals("")){
        JOptionPane.showMessageDialog(ajfrm, 
        "Enter data in every fields.","INFORMATION MESSAGE", 
        JOptionPane.INFORMATION_MESSAGE);
    }
    else
    {
        try{
            String Platform2 = txtPlatform2.getText();
            String IntName2 = txtIntName2.getText();
            int Salary2 = Integer.parseInt(txtSalary2.getText());
            int Wrh2 = Integer.parseInt(txtWrh2.getText());
            String AppBy = txtAppBy.getText();
            String TerDate2 = txtTerDate2.getText();
            
            
                JuniorDeveloper juniorDeveloper=new JuniorDeveloper(Platform2,IntName2,Salary2,Wrh2,AppBy,TerDate2);
                list.add(juniorDeveloper);
                JOptionPane.showMessageDialog(frm,"Junior Developer is sucessfully added");
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(ajfrm, "Enter Numbers only :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(ajfrm, "Error :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        
    }

}
public void AddSr(){
    if(txtPlatform1.getText().equals("") || txtIntName1.getText().equals("") || txtSalary1.getText().equals("") 
    || txtWrh1.getText().equals("") || txtContact.getText().equals("")){
        JOptionPane.showMessageDialog(ajfrm, 
        "Enter data in every fields.","INFORMATION MESSAGE", 
        JOptionPane.INFORMATION_MESSAGE);
    }
    else{
        try{
        String Platform1 = txtPlatform1.getText();
        String Name1 = txtIntName1.getText();
        int Salary = Integer.parseInt(txtSalary1.getText());
        int Whr1 = Integer.parseInt(txtWrh1.getText());
        int Contract = Integer.parseInt(txtContact.getText());
        
        SeniorDeveloper seniorDeveloper= new SeniorDeveloper(Platform1,Name1,Salary,Whr1,Contract);
        list.add(seniorDeveloper);
        JOptionPane.showMessageDialog(frm,"Senior Developer is Successfuly added");
            
        
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(ajfrm, "Enter Numbers only :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(ajfrm, "Error :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        
    
    }

}

public void HireJr(){
    
           
    try{
            String DevName2=txtDevName2.getText();
            String JoinDate2=txtJoinDate2.getText();
            String TerDate3=txtTerDate3.getText();
            String Specialization=txtSpecialization.getText();
            String PNo2=txtPNo2.getText();
            if(DevName2.equals("") || JoinDate2.equals("") || TerDate3.equals("") || Specialization.equals("") || PNo2.equals(""))
            {
                JOptionPane.showMessageDialog(hjfrm, 
                "Enter data in every fields.","INFORMATION MESSAGE", 
                JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                int PNo2Jr=Integer.parseInt(PNo2)-1;
                if(PNo2Jr>=0 && PNo2Jr<list.size()){
                    if(list.get(PNo2Jr) instanceof JuniorDeveloper)
                    {
                        JuniorDeveloper jd=(JuniorDeveloper)list.get(PNo2Jr);
                        jd.appointDeveloper(DevName2,JoinDate2,TerDate3,Specialization);
                        JOptionPane.showMessageDialog(hjfrm,"Junior Developer is hired successfully");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(hjfrm,"Please enter the valid platform number");
                        
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(hjfrm,"Platform number unavilable");
                }
            }
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(ajfrm, "Enter Numbers only :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(ajfrm, "Error :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void HireSr(){
        try{
            
            String DevName1=txtDevName1.getText();
            String JoinDate1= txtJoinDate1.getText();
            String AdSalary=txtAdSalary.getText();
            String Staff= txtStaff.getText();
            String PNo1=txtPNo1.getText();
            if(DevName1.equals("") || JoinDate1.equals("") || AdSalary.equals("") || Staff.equals("") || PNo1.equals(""))
            {
                JOptionPane.showMessageDialog(htsfrm,"Please don't leave the data empty");
            }
            else
            {
                float AdSalaryS=Float.parseFloat(AdSalary);
                int developerNoS=(Integer.parseInt(PNo1)-1);
                if(developerNoS>=0 && developerNoS<list.size()){
                    if(list.get(developerNoS) instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper sd=(SeniorDeveloper)list.get(developerNoS);
                        sd.hireDeveloper(DevName1,JoinDate1,AdSalaryS,Staff);
                        JOptionPane.showMessageDialog(htsfrm,"Senior Developer has been successfully Appointed");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(htsfrm,"This platform number is not for Senior developer");
                        
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(htsfrm,"The Platform number is not Available");
                }
            }
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(ajfrm, "Enter Numbers only :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(ajfrm, "Error :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void TerminateSr(){
    try
        {
            String PNo1=txtPNo1.getText();
            int developerNoS=Integer.parseInt(PNo1)-1;
            if(developerNoS>=0 && developerNoS<list.size())
            {
                if(list.get(developerNoS) instanceof SeniorDeveloper)
                {
                    SeniorDeveloper sd=(SeniorDeveloper)list.get(developerNoS);
                    sd.termination();
                    JOptionPane.showMessageDialog(htsfrm,"Senior Developer has Successfully terminated");
                    
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(htsfrm,"This platform number is not for Senior developer");
                        
                }
            }
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(ajfrm, "Enter Numbers only :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(ajfrm, "Error :" + e.getMessage(),"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void Display(){
     if(list.size()<1)
        {
            JOptionPane.showMessageDialog(frm,"Nothing to Display");   
        }
        else
        {
            for (Developer obj:list)
            {
                if (obj instanceof SeniorDeveloper)
                {
                    System.out.println("    ========================================================");
                    System.out.println("=======================SeniorDeveloper=======================");
                    System.out.println("    ========================================================");
                    SeniorDeveloper d=(SeniorDeveloper)obj;
                    d.display();
                }
                if(obj instanceof JuniorDeveloper)
                {
                    System.out.println("    ========================================================");
                    System.out.println("=======================Junior Developer=======================");
                    System.out.println("    ========================================================");
                    JuniorDeveloper d=(JuniorDeveloper)obj;
                    d.display();
                }
            }
        }
    }
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btnAddSrDev){
    AddSeniorDev();
}

else if(e.getSource()==btnHireSrDev){
    HireTerSrDev();
}

else if(e.getSource()==btnAddJrDev){
    AddJrDev();
}
else if(e.getSource()==btnHireJrDev){
    HireJrDev();
}
else if(e.getSource()==btnExit){
    frm.dispose();
}

else if(e.getSource()==btnCancelAddJr){
    ajfrm.dispose();
}


else if(e.getSource()==btnCancelHireJr){
    hjfrm.dispose();
}

else if(e.getSource()==btnCancelAddSr){
    asfrm.dispose();
}


else if(e.getSource()==btnCancelSr){
    htsfrm.dispose();
}
else if(e.getSource()==btnClearAddJr){
    ClearAddJr();
}

else if(e.getSource()==btnClearHireJr){
    ClearHireJr();
}

else if(e.getSource()==btnClearAddSr){
    ClearAddSr();
}


else if(e.getSource()==btnClearSr){
    ClearSr();
    
}
else if(e.getSource()==btnAddJr){
    AddJr();   
}
else if (e.getSource() == btnAddSr){
    AddSr();
}

else if(e.getSource( )== btnHireJr ){
    HireJr();
}
else if(e.getSource()== btnTerminateSr){
    TerminateSr();
}
else if(e.getSource() == btnHireSr){
    HireSr();
}
else if (e.getSource() == btnDisplay){
    Display();
    }
}

}
