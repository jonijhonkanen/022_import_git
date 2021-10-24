class Program {
    public static void main(String[] args) {
        //Retrieve the user name
        Class1 name = new Class1();
        String text = name.tellName();
        System.out.println(text);
        
        //Retrieve user age
        Class2 number = new Class2();
        int age = number.tellAge();
        System.out.println(age);

    }
}

