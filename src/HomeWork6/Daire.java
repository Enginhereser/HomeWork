package HomeWork6;

public class Daire {
    private double yariCap;

    public Daire() {
    }
    public Daire(double yariCap) {
        if (yariCap<0) yariCap=0;
        else {
            this.yariCap = yariCap;
        }

    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }
    public double getAlan(){
        return yariCap*yariCap*Math.PI;
    }
}
