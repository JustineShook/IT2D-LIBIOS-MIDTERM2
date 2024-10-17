
package feedback;

import java.util.Scanner;

public class FEEDBACK {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String resp;
        do{

            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");

            System.out.print("Enter Action: ");
            int action = sc.nextInt();
            FEEDBACK test;
            test = new FEEDBACK();
            switch(action){
                case 1:
                    test.addFEEDBACK();
                break;
                case 2:
                    test.viewFEEDBACK();
                break;
                case 3:
                    test.viewFEEDBACK();
                    test.updateFEEDBACK();
                break;
                case 4:
                    test.viewFEEDBACK();
                    test.deleteFEEDBACK();
                    test.viewFEEDBACK();
                break;
            }
            
            System.out.print("Continue? ");
            resp = sc.next();

        }while(resp.equalsIgnoreCase("yes"));
            System.out.println("Thank You!");

    }
    
    public void addFEEDBACK(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("What is your freedback?: ");
        String f_text = sc.nextLine();
        System.out.print("Type Date: ");
        String f_date = sc.nextLine();
        System.out.print("Type Rate: ");
        int rating = sc.nextInt();
       

        String sql = "INSERT INTO feedback.tbl (, f_text, f_date, radting) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, f_text, f_date, rating);
    
    
    private void viewFEEDBACK() {
        
        String qry = "SELECT * FROM feedback.tbl";
        String[] hdrs = {"ID", "Feedback", "Date", "rating"};
        String[] clms = {"f_id", "f_text", "f_date", "rating"};

        config conf = new config();
        conf.viewRecords(qry, hdrs, clms);
    }
    
    private void updateFEDDBACK(){
    
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the ID to Update: ");
        int id = sc.nextInt();
        
        System.out.print("Update Feedback: ");
        String nfname = sc.next();
        System.out.print("Update Date: ");
        String nlname = sc.next();
        System.out.print("Update Rating: ");
        String nemail = sc.next();
        System.out.print("Enter new Status: ");
        String nstatus = sc.next();
        
        String qry = "UPDATE feedback.tbl SET e_fname = ?, e_lname = ?, e_email = ?, e_status = ? WHERE e_id = ?";
        
        config conf = new config();
        conf.updateRecord(qry, nfname, nlname, nemail, nstatus, id);
        
    }
    
    private void deleteEmployee(){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the ID to Delete: ");
        int id = sc.nextInt();
        
        String qry = "DELETE FROM feedback.tbl WHERE e_id = ?";
        
        config conf = new config();
        conf.deleteRecord(qry, id);
    
    }

    private void deleteFEEDBACK() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void updateFEEDBACK() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}



   
    

