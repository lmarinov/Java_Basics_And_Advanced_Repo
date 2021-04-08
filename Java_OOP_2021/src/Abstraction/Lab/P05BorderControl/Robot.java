package Abstraction.Lab.P05BorderControl;

public class Robot implements Identifiable{
    private String id;
    private String model;

    public Robot(String model, String id) {
        this.setId(id);
        this.setModel(model);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}