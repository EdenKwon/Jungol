package Tests.Json_product;

import java.util.HashMap;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONArray;
import org.json.JSONObject;

@Data
public class Shirt {
  private String product_name;
  private int product_no;
  private List item_list;
  private String extra_size;
  private String extra_color;

  public Shirt(String product_name, int product_no, List item_list, String extra_size, String extra_color) {
    this.product_name = product_name;
    this.product_no = product_no;
    this.item_list = item_list;
    this.extra_size = extra_size;
    this.extra_color = extra_color;
  }

  public String getProduct_name() {
    return product_name;
  }

  public void setProduct_name(String product_name) {
    this.product_name = product_name;
  }

  public int getProduct_no() {
    return product_no;
  }

  public void setProduct_no(int product_no) {
    this.product_no = product_no;
  }

  public List getItem_list() {
    return item_list;
  }

  public void setItem_list(List item_list) {
    this.item_list = item_list;
  }

  public String getExtra_size() {
    return extra_size;
  }

  public void setExtra_size(String extra_size) {
    this.extra_size = extra_size;
  }

  public String getExtra_color() {
    return extra_color;
  }

  public void setExtra_color(String extra_color) {
    this.extra_color = extra_color;
  }
}
