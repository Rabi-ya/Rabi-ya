package JAVAProjects;

public class EmplInfo {
    public String firstName;
    public String lastName;
    public String department;
    public int mailboxCapacity = 500;
    public String userName;
    public String password;
    String businessName= "company";

    public EmplInfo(String firstName, String lastName,String department){
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=department;
        char firstLetter = firstName.charAt(0);
        userName= firstLetter + lastName.toLowerCase() + "@" + department + "." + businessName + ".com";
        System.out.println("The username generated is :" + userName);


    }
    /*The password is generated by picking random characters from the alphabet string and appending them to the password
     string.The Math.random() method is used to generate a random number between 0 and 1, which is then multiplied by the
      length of the alphabet string to generate a random index between 0 and the length of the alphabet string.
      This random index is then used to select a character from the alphabet string using the charAt() method, and that
      character is appended to the password string.
     */
    public static String randomPassword(int length){
        String password = "";
        String alphabet = ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        for (int i = 0; i < length ; i++) {
            int random = (int) (Math.random() * alphabet.length());
            password += alphabet.charAt(random);
        }
        return password;
    }
    //Set method change the password
    public String setPassword(String password){
        this.password=password;
        //x = randomPassword(10);
        //return x;
        return password;
    }


    // Get method to display name
    public String getName(){
        return firstName + " " + lastName;
    }
    //Get method to display email
    public String getNewEmail(){
        return userName;
    }
    //Get method to get mailbox capacity
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
}
