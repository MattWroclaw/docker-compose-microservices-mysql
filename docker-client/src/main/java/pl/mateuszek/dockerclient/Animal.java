package pl.mateuszek.dockerclient;

public class Animal {

    private long id;

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
