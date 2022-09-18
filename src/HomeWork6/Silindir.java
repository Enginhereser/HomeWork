package HomeWork6;

public class Silindir extends Daire {
    private double yukseklik;


    public Silindir(double yariCap, double yukseklik) {
        super(yariCap);
        this.yukseklik = yukseklik;

    }

    public double getYukseklik() {

        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {

        this.yukseklik = yukseklik;
    }


    public void setYukseklikAlan(double yukseklik){
        if (yukseklik<0) yukseklik=0;
        else {
            this.yukseklik=yukseklik;
        }

    }
    public double getYukseklikAlan(){
        return getYukseklikAlan();

    }
    public double getHacim(){
        return super.getAlan()*yukseklik;
    }

    @Override
    public double getAlan() {
        return 2*getYariCap()*getYariCap()*Math.PI+2*Math.PI*getYariCap()*yukseklik;
    }
}
