class PersonMethodChaining {
    private String name;
    private int age;
 
    // In addition to having the side-effect of setting the attributes in question,
    // the setters return "this" (the current Person object) to allow for further chained method calls.
 
    public PersonMethodChaining setName(String name) {
        this.name = name;
        return this;
    }
 
    public PersonMethodChaining setAge(int age) {
        this.age = age;
        return this;
    }
 
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
 
    // Usage:
    public static void main(String[] args) {
        PersonMethodChaining person = new PersonMethodChaining();
        // Output: Hello, my name is Peter and I am 21 years old.
        person.setName("Peter").setAge(21).introduce();
    }
}

// Without method chaining
/*class Person {
    private String name;
    private int age;
 
    // Per normal Java style, the setters return void.
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
 
    // Usage:
    public static void main(String[] args) {
        Person person = new Person();
        // Not using chaining; longer than the chained version above.
        // Output: Hello, my name is Peter and I am 21 years old.
        person.setName("Peter");
        person.setAge(21);
        person.introduce();
    }
}*/
