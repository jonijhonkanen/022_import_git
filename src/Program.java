class Program {
    public static void main(String[] args) {

        int id = 0;
        String userName = "Admin";

        //Retrieve the user name
        Class1 name = new Class1();
        String text = name.sendGreeting(userName);
        System.out.println(text);

        //Retrieve user age
        Class2 userAge = new Class2();
        int number = userAge.sendAge();
        System.out.println(number);

        //Print user's id number
        System.out.println("User id is: " + sendId(id));
    }
    //Changes user id and returns it
    public id sendId(int userId) {
        return userId + 1;
    }
}

