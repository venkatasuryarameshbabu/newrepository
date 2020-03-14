

 

public class Employee

{

     private String empid;

     private String ename;

     private String dept;

     private String desg;

     private String email;

   

   

     public Employee() {

          super();

     }

 

     public Employee(String empid, String ename, String dept, String desg, String email) {

          super();

          this.empid = empid;

          this.ename= ename;

          this.dept = dept;

          this.desg = desg;

          this.email = email;

     }

 

      public String getEmpid() {

            return empid;

      }

 

      public void setEmpid(String empid) {

            this.empid = empid;

      }

 

      public String getEname() {

            return ename;

      }

 

      public void setEname(String ename) {

            this.ename = ename;

      }

 

      public String getDept() {

            return dept;

      }

 

      public void setDept(String dept) {

            this.dept = dept;

      }

 

      public String getDesg() {

            return desg;

      }

 

      public void setDesg(String desg) {

            this.desg = desg;

      }

 

      public String getEmail() {

            return email;

      }

 

      public void setEmail(String email) {

            this.email = email;

      }

   

   

}