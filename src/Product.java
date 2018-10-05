import java.util.Date;
import javax.print.attribute.standard.DateTimeAtProcessing;

abstract class Product implements Item {

  int serialNumber;
  String manufacturer;
  Date manufacuredOn;
  String name;

  //Add an integer class variable called currentProductionNumber. This will store the next number to be
  //assigned to serialNumber.
  int currentProductionNumber;


  //  A method setProductionNumber, one integer parameter
  public void setProductionNumber(int number) {
    this.currentProductionNumber = number;
  }


  //  A method setName, String parameter
  public void setName(String newName) {
    this.name = newName;
  }

  //  A method getName, return a String
  public String getName() {
    return this.name;
  }


  //  A method getManufactureDate, return a Date
  public Date getManufactureDate() {
    return this.manufacuredOn;
  }


  //  A method getSerialNumber, return an int
  public int getSerialNumber() {
    return this.serialNumber;
  }


  public Product(String newName) {
    this.name = newName;
    this.serialNumber = getSerialNumber();
    setProductionNumber(2);
    this.manufacuredOn = new Date();
  }

  public String toString() {
    return "Manufacturer :" + this.manufacturer + "\n" + "Serial Number :" + this.serialNumber
        + "\n" + "Date :" + getManufactureDate() + "\n" + "Name :" + getName();
  }

}
