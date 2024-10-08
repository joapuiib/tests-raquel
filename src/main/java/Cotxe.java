public class Cotxe {
    private String matricula;
    private String marca;
    private String model;
    private int velocitat;

    public Cotxe(String matricula, String marca, String model) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.velocitat = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public void accelerate(int speed) {
        velocitat += speed;
    }
}
