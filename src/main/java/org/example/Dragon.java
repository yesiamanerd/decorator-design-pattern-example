package org.example;

public class Dragon extends Bird {

    Lizard l;

    public Dragon() {
        l = new Lizard();
    }

    public Dragon(int age) {
        this.age = age;
        l = new Lizard();
        l.age = age;
    }

    public int age;

    public void setAge(int age) {
        this.age = age;
        l.age = age;
    }

    public String crawl() {
        return (age > 100) ? "crawling" : "too young";
    }

    public String fly() {
        return age < 200 ? "flying" : "too old";
    }

    public String toString() {
        return "age: " + age + " " + fly() + " " + crawl();
    }
}
