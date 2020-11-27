package simple.example.hewanpedia.model;

public class Leptop {
    private String model;
    private String pabrikan;
    private String deskripsi;
    private int drawableRes;

    public Leptop(String model, String pabrikan, String deskripsi, int drawableRes) {
        this.model= model;
        this.pabrikan= pabrikan;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPabrikan() {
        return pabrikan;
    }

    public void setPabrikan(String pabrikan) {
        this.pabrikan= pabrikan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
