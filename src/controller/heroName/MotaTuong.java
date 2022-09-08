package controller.heroName;

public class MotaTuong {
    private String name;
    private int baseDam;
    private double Critical;
    public MotaTuong(){}

    public MotaTuong(String name, int baseDam, double critical) {
        this.name = name;
        this.baseDam = baseDam;
        Critical = critical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseDam() {
        return baseDam;
    }

    public void setBaseDam(int baseDam) {
        this.baseDam = baseDam;
    }

    public double getCritical() {
        return Critical;
    }

    public void setCritical(double critical) {
        Critical = critical;
    }

    @Override
    public String toString() {
        return "MotaTuong{" +
                "name='" + name + '\'' +
                ", baseDam=" + baseDam +
                ", Critical=" + Critical +
                '}';
    }
}
