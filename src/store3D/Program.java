package store3D;

import store3D.inmemory.ModelStore;
import store3D.inmemory.Observer1;
import store3D.models.Polygon;
import store3D.models.PolygonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();

        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);

        Polygon p1 = new Polygon();
        List<Polygon> polygons = new ArrayList<>();
        polygons.add(p1);
        PolygonalModel polygonalModel = new PolygonalModel(polygons);
        store.add(polygonalModel);
    }
}
