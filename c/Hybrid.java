public class Hybrid implements GasolineInterface, ElectricInterface{
    double MPG;
    double Gmiles;
    double Ggallons;
    double MPGe;
    double kwh;
    double Emiles;
    double EGallons;

    @Override
    public double calcgasMPG() {
        if(Ggallons == 0) {
            return 0;
        }
        double MPG = Gmiles/Ggallons;
        return MPG;
    }
    public void setMilesfromGas(double miles) {
        if(miles < 0) {
            throw new IllegalArgumentException("Miles cannot be negative");
        }
        Gmiles = miles;
    }
    public void setGallonsfromGas(double gallons) { 
        if(gallons < 0) {
            throw new IllegalArgumentException("Gallons cannot be negative");
        }
        Ggallons = gallons;
    }

// ------------------Gas-Electric-Seperator------------------------------------
    
    public double calcMPGe() {
        EGallons = kwh / 33.7;
        if(EGallons == 0) {
            return 0;
        }
        MPGe = Emiles / EGallons;
        return MPGe;
    }
    public void setElectricMiles(double totalElectricMiles) {
        if(totalElectricMiles < 0) {
            throw new IllegalArgumentException("ElectricMiles cannot be negative");
        }
        Emiles = totalElectricMiles;
        
    }
    public void setTotalkWh(double totalkWh) {
        if(totalkWh < 0) {
            throw new IllegalArgumentException("kWh cannot be negative");
        }
        kwh = totalkWh;
    }
}
