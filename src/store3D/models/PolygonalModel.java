package store3D.models;

import java.util.List;

public class PolygonalModel {
    private List<Polygon> polygons;
    private List<Texture> textures;


    public PolygonalModel(List<Polygon> polygons, List<Texture> textures) {
        this.polygons = polygons;
        this.textures = textures;
    }

    public PolygonalModel(List<Polygon> polygons) {
        this.polygons = polygons;
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }

    public List<Texture> getTextures() {
        return textures;
    }
}
