package store3D.inmemory;

import store3D.models.Camera;
import store3D.models.Flash;
import store3D.models.PolygonalModel;
import store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    private List<IModelChangedObserver> observers = new ArrayList<>();

    private List<PolygonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PolygonalModel model) {
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (IModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(IModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(IModelChangedObserver o) {
        observers.remove(o);
    }
}
