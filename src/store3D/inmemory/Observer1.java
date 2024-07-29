package store3D.inmemory;

public class Observer1 implements IModelChangedObserver {

    @Override
    public void applyUpdateModel() {
        System.out.println("Добавлена новая полигональная модель - observer$1");
    }
}
