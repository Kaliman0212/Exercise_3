import java.util.ArrayList;

class Bag {
    private final ArrayList<FormObject> list;

    public Bag () {
        this.list = new ArrayList<>();
    }

    public void addObject(FormObject object) {
        list.add(object);
    }

    public ArrayList<FormObject> getAllObjects() {
        return list;
    }

    public void addSeveralObjects(Flat flatObject, int amount) {
        for (int i = 0; i < amount; i++) {
            list.add(flatObject);
        }
    }

    public void addSeveralObjects(Sphere flatObject, int amount) {
        for (int i = 0; i < amount; i++) {
            list.add(flatObject);
        }
    }

    public void addSeveralObjects(Cylinder flatObject, int amount) {
        for (int i = 0; i < amount; i++) {
            list.add(flatObject);
        }
    }

    @Override
    public String toString() {
        return "Bag{" +
                "list=" + list +
                '}';
    }
}
