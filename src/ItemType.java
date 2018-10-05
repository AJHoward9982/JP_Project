
public enum ItemType {
  Audio("AU"), AudioMobile("AM"), Visual("VI"), VisualMobile("VM");

  public String code = getCode();

  ItemType(String item) {
    this.code = item;
  }

  public String getCode() {
    return code;
  }

}
