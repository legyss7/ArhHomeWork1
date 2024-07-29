package store3D.models;

public class Texture {
    private int id;

    /// <summary>
    /// Наименование
    /// </summary>
    private String name;

    public Texture(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
