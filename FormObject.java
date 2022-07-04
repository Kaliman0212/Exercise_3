abstract class FormObject {
    String objectName;

    public FormObject(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return objectName;
    }
}
