package ua.lviv.iot.fortifications.models;

public abstract class Fortifications {

    private double lenght;
    private double depth;
    private double timeToBuild;



    public Fortifications(final double lenght, final double depth,
                          final double timeToBuild) {
        this.lenght = lenght;
        this.depth = depth;
        this.timeToBuild = timeToBuild;
    }

    public Fortifications() {
    }

    public String getHeaders(){
      return "lenght, depth, timeToBuild";
    }

    public String toCSV() {
        return getLenght() + "," + getDepth() + "," + getTimeToBuild();
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(final double lenght) {
        this.lenght = lenght;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(final double depth) {
        this.depth = depth;
    }

    public double getTimeToBuild() {
        return timeToBuild;
    }

    public void setTimeToBuild(final double timeToBuild) {
        this.timeToBuild = timeToBuild;
    }

}
