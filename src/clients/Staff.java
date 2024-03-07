package clients;

import java.time.LocalDate;

public abstract class Staff {
    public String name;
    protected String post;
    protected LocalDate age;

    public Staff (String name, String post, LocalDate age) {
        this.name = name;
        this.post = post;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public LocalDate getAge() {
        return age;
    }

    public String toString(){

        return String.format("name = %s, post = %s, age = %s",
                name, post, age);
    }
}
