
public class Laptop {
    private String model;
    private String color;
    private String operSystem;
    private int valOperMamory;
    private int valHardDisk;

    public Laptop(){
    }

    public Laptop(String model, String color, String operSystem, int valOperMamory, int valHardDisk){
        this.model = model;
        this.color = color;
        this.operSystem = operSystem;
        this.valOperMamory = valOperMamory;
        this.valHardDisk = valHardDisk;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getOperSystem() {
        return operSystem;
    }
    public int getValOperMamory() {
        return valOperMamory;
    }
    public int getValHardDisk() {
        return valHardDisk;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOperSystem(String operSystem) {
        this.operSystem = operSystem;
    }
    public void setValOperMamory(int valOperMamory) {
        this.valOperMamory = valOperMamory;
    }
    public void setValHardDisk(int valHardDisk) {
        this.valHardDisk = valHardDisk;
    }
    
    @Override
    public String toString() {
        return String.format("Модель = %s, Цвет = %s, Операционная система = %s, Объем ОП = %d ГБ, Обьем жесткого диска = %d ГБ",
        model,color,operSystem,valOperMamory,valHardDisk);
    }

}
