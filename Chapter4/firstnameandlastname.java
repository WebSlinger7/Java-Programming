public class firstnameandlastname {
    public static void main(String[] args) {
        String Fullname = "Kyaw Zaw Han";
       int index = Fullname.indexOf(" ");
       String Firstname = Fullname.substring(0,index);
       System.out.println("First Name is :" + Firstname);
       String Lastname = Fullname.substring(index+1);
       System.out.println(Lastname);
    }
}
