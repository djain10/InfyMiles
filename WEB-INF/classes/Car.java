
public class Car {
	private String id;
    private String carName;
    private String carCategory;
    private String carBrandName;
    private String carMileage;
    private String carModel;
    private String carProductionYear;
	private String carColor;
	private String carImagePath;
	private String carPrice;
	private String carReservationStatus;
    

public Car(String id, String carName, String carCategory, String carBrandName, String carMileage,
                String carModel, String carProductionYear, String carColor, String carImagePath, String carPrice,
                String carReservationStatus) {
            
            this.id = id;
            this.carName = carName;
            this.carCategory = carCategory;
            this.carBrandName = carBrandName;
            this.carMileage = carMileage;
            this.carModel = carModel;
            this.carProductionYear = carProductionYear;
            this.carColor = carColor;
            this.carImagePath = carImagePath;
            this.carPrice = carPrice;
            this.carReservationStatus = carReservationStatus;
        }	


        public Car(){

        }

	public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
	
    public String getcarName() {
        return carName;
    }
    public void setcarName(String carName) {
        this.carName = carName;
    }
	 public String getcarCategory() {
        return carCategory;
    }
    public void setcarCategory(String carCategory) {
        this.carCategory = carCategory;
    }
	
    public String getcarBrandName() {
        return carBrandName;
    }
    public void setcarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }
    public String getcarMileage() {
        return carMileage;
    }
    public void setcarMileage(String carMileage) {
        this.carMileage = carMileage;
    }
    public String getcarModel() {
        return carModel;
    }
    public void setcarModel(String carModel) {
        this.carModel = carModel;
    }
    public String getcarProductionYear() {
        return carProductionYear;
    }
    public void setcarProductionYear(String carProductionYear) {
        this.carProductionYear = carProductionYear;
    }
   public String getcarImagePath() {
        return carImagePath;
    }
    public void setcarImagePath(String carImagePath) {
        this.carImagePath = carImagePath;
    } 
	   public String getcarColor() {
        return carColor;
    }
    public void setcarColor(String carColor) {
        this.carColor = carColor;
    } 

    public String getcarPrice() {
        return carPrice;
    }
    public void setcarPrice(String carPrice) {
        this.carPrice = carPrice;
    } 
	
	public String getcarReservationStatus() {
        return carReservationStatus;
    }
    public void setcarReservationStatus(String carReservationStatus) {
        this.carReservationStatus = carReservationStatus;
    } 
 
    @Override
    public String toString() {
        return this.id + "," + this.carName+ "," + this.carCategory + "," + this.carBrandName +"," + this.carModel + "," + this.carMileage +"," + this.carProductionYear + "," + this.carColor + "," + this.carImagePath + "," + this.carPrice + "," + this.carReservationStatus;
    }
    
}