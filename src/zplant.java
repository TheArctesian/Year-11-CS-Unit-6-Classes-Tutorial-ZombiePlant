public class ZombiePlant {
    private int potencyRequired;
    private int treatmentsNeeded;

    public ZombiePlant(int potency, int treatments) {
        this.potencyRequired = potency;
        this.treatmentsNeeded = treatments;
    }

    public boolean isDangerous() {
        if (treatmentsNeeded == 0) {return false;}
        else{ return true;}
    }
    public void treat(int potency) {
        if (potency <= potencyRequired && potency > 0 && treatmentsNeeded != 0)
            treatmentsNeeded -= 1;
        else if (potency > this.potencyRequired)
            treatmentsNeeded +=1;
    }
    public int getPotencyRequired() {return potencyRequired;}
    public int getTreatmentsNeeded() {return treatmentsNeeded;}
    public void setPotencyRequired(int potencyRequired) {this.potencyRequired = potencyRequired;}
    public void setTreatmentsNeeded(int treatmentsNeeded) {this.treatmentsNeeded = treatmentsNeeded;}
}