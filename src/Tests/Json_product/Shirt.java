package Tests.Json_product;

import java.util.HashMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONArray;
import org.json.JSONObject;

@Data
@AllArgsConstructor
public class Shirt {
  private String product_name;
  private int product_no;
  private JSONObject extra_product_info;
  private JSONArray item_list;
}
