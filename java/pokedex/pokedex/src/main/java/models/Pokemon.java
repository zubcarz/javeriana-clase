package models;

public class Pokemon {
    int base_experience = 0;
    int id;
    String name;
    double weight = 0;
    double height = 0;
    Sprites sprites;

    public int getBase_experience() {
        return base_experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

}
