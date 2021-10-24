class Program {
    public static void main(String[] args) {

        int id = 0;
        //Retrieve the user name
        Class1 name = new Class1();
        String text = name.tellName();
        System.out.println(text);

        //Retrieve user age
        Class2 userAge = new Class2();
        int number = userAge.tellAge();
        System.out.println(number);

        System.out.println("User id is: " + sendId(id));
    }

    public id sendId(int userId) {
        return userId + 1;
    }
}

