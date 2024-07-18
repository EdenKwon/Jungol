package Tests.Json_product;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class UtilJson {

  public static JSONObject createJsonData() {
    /**
     * 모든 데이터를 담을 JSONObject 생성
     */
    JSONObject productInfo = new JSONObject();
    Shirt shirt = new Shirt("shirt", 1, List.of("nike1", "nike2", "nike3", "nike4"), "XL", "Blue");
    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 처리.
     * product_no
     * product_name
     */
    productInfo.put("product_name", shirt.getProduct_name());
    productInfo.put("product_no", shirt.getProduct_no());

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * extra_product_info JSONObject 생성
     */
    JSONObject extra_product_info = new JSONObject();
    extra_product_info.put("extra_size", shirt.getExtra_size());
    extra_product_info.put("extra_color", shirt.getExtra_color());

    /**
     * value로 Array를 가지는 프로퍼티 처리.
     * item_list JSONArray 생성
     */
    JSONArray item_list = new JSONArray();
    item_list.put(shirt.getItem_list().get(0));
    item_list.put(shirt.getItem_list().get(1));
    item_list.put(shirt.getItem_list().get(2));
    item_list.put(shirt.getItem_list().get(3));

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * item_list.* JSONObject 생성하세요
     */
    productInfo.put("extra_product_info", extra_product_info);
    productInfo.put("item_list", item_list);

    return productInfo;
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
    System.out.println(parsedObject.getJSONObject("extra_product_info").getString("extra_size"));
    System.out.println(parsedObject.getJSONObject("extra_product_info").getString("extra_color"));
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
    System.out.println(parsedObject.getJSONObject("extra_product_info").getString("extra_size"));
    System.out.println(parsedObject.getJSONObject("extra_product_info").getString("extra_color"));

    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */
    parsedObject.getJSONArray("item_list").forEach(System.out::println);
    /**
     * item_list의 각 원소를 JSONObject로 캐스팅 후, 변수의 키셋을 가져온다.
     * [참고] 각 원소의 키가 다를 경우 유용하다.
     */
  }


  public static String jsonToString(JSONObject jsonObject) {
    return jsonObject.toString();
  }


}
