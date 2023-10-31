package oop3.src.Parking;

import java.time.LocalDate;

public class MjetiParkuar {
    private MjetTransporti mjetTransporti;
    private LocalDate data;
    private boolean paguar;
    private double cmimi;

    public MjetTransporti getMjetTransporti() {
        return mjetTransporti;
    }

    public void setMjetTransporti(MjetTransporti mjetTransporti) {
        this.mjetTransporti = mjetTransporti;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isPaguar() {
        return paguar;
    }

    public void setPaguar(boolean paguar) {
        this.paguar = paguar;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }
}
