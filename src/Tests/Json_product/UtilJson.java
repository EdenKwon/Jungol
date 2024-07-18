package Tests.Json_product;

import Tests.Json_product.Shirt.extra_product_info;
import java.text.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;

public class UtilJson {

  public static JSONObject createJsonData() {
    /**
     * 모든 데이터를 담을 JSONObject 생성
     */
    JSONObject productInfo = new JSONObject();
    Shirt shirt = new Shirt("shirt", 1, new extra_product_info("100L", "2024.07.18"));
    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 처리.
     * product_no
     * product_name
     */
    productInfo.put("product_name", "shirt");
    productInfo.put("product_no", 1);

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * extra_product_info JSONObject 생성
     */
    JSONObject extra_product_info = new JSONObject();
    extra_product_info.put("brand", "Nike");
    extra_product_info.put("color", "Blue");

    /**
     * value로 Array를 가지는 프로퍼티 처리.
     * item_list JSONArray 생성
     */
    JSONArray item_lists = new JSONArray();
    item_lists.put("nike1");
    item_lists.put("nike2");
    item_lists.put("nike3");
    item_lists.put("nike4");

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * item_list.* JSONObject 생성하세요
     */
  }

  public static void parseJsonData(JSONObject jsonObject) {

    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */
    JSONObject parsedObject;

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */
    String parsedString = jsonObject.toString();
    parsedObject = new JSONObject(parsedString);

    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */
    System.out.println(parsedObject.getInt("product_no"));
    System.out.println(parsedObject.getString("product_name"));

    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */
    System.out.println(parsedObject.getJSONObject("extra_product_info").getString("brand"));
    System.out.println(parsedObject.getJSONObject("extra_product_info").getString("color"));
    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */
    parsedObject.getJSONArray("item_list").forEach(System.out::println);

  }

  public static void parseJsonDataUseIterator(JSONObject jsonObject) {
    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */


    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */


    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */


    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */


    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */

    /**
     * item_list의 각 원소를 JSONObject로 캐스팅 후, 변수의 키셋을 가져온다.
     * [참고] 각 원소의 키가 다를 경우 유용하다.
     */

  }


  public static String jsonToString(JSONObject jsonObject) {
    return jsonObject.toString();
  }


}
