package store3D.inmemory;

public class Observer2 implements IModelChangedObserver {

    @Override
    public void applyUpdateModel() {
        System.out.println("Добавлена новая полигональная модель - observer$2");
    }
}