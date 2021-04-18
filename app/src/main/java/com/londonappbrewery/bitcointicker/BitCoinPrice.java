package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitCoinPrice {
    private static Double price;
    public static String priceBsyJSON(String jsonIn,String currency){
         //BitCoinPrice currentPrice = new BitCoinPrice();
        String priceStr=null;
        try {
            JSONObject reader = new JSONObject(jsonIn);
            BitCoinPrice.price=reader.getJSONObject(currency).getDouble("last");
            priceStr= BitCoinPrice.price.toString()+reader.getJSONObject(currency).getString("symbol");

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return priceStr;
     }

}
