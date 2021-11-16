class Homework5 {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
	    persArray[0] = new Person("Jack Morrison", "Director", "Varian@mail.ru", "724919973916",
            40000, 50);
        persArray[1] = new Person("Jaina Praydmyr", "Manager", "Jaina@gmail.com", "74957950596",
            50000, 38);
        persArray[2] = new Person("Angela Ziegler", "Support", "Ziegler@gmail.com", "74955398363",
            30000, 37);
        persArray[3] = new Person("Olivia Kolomar", "QA Automation", "Sombra@gmail.com", "74951290732",
            60000, 30);
        persArray[4] = new Person("Jesse McCree", "QA Egeneer", "McCree@gmail.com", "74957950596",
            80000,37);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].print();
            }
        }
    }
}

class Person {
    private String full_name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    Person(String full_name, String position, String email, String number, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }



    public void print() {
        System.out.println("full_name: " + full_name + ", position: " + position + ", email: " + email + ", number: " + number +
                ", salary: " + salary + ", age: " + age);
    }
}
