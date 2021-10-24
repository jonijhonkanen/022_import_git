class Class2 {
    public int sendAge() {
        return 25;
    }

    public void verifyAge(int age) {
        if (age < 18) {
            System.out.println("User is under 18!");
        } else if (age < 0) {
            System.out.println("User is not even born yet!");
        } else {
            System.out.println("User is old enough to understand Java.");
        }
    }
}

