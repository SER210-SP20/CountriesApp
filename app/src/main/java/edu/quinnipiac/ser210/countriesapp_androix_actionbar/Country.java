package edu.quinnipiac.ser210.countriesapp_androix_actionbar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by relkharboutly on 2/26/2016.
 */
public class Country {

    private String name;
    private int flag;
    private String currency;
    private String fact;
    private int map;

    public static final Country[] countries = {
            new Country("India",R.drawable.india,"Indian Rupe","100 million people come to India's Kumbh Mela Festival, the world's biggest gathering of humans",R.drawable.india_map),
            new Country("Pakistan",R.drawable.pakistan,"Pakistani Rupee","Pakistan, officially the Islamic Republic of Pakistan, is a country in South Asia. It is the sixth-most populous country with a population exceeding 199 million people",R.drawable.pakistan_map),
            new Country("Sri Lanka",R.drawable.srilanka,"Sri Lankan Rupee","Sri Lanka (formerly Ceylon), a tiny island nation south of India in the Indian Ocean, is a rugged land of rainforest, diverse wildlife and endless beaches. It’s famed for its ancient Buddhist ruins, including the 5th-century citadel Sigiriya, with its palace and frescoes, and the sacred city of Anuradhapura",R.drawable.srilanka_map),
            new Country("China",R.drawable.china,"Renminbi","China, a communist nation in East Asia, is the world’s most populous country. Its vast landscape encompasses grassland, desert, mountain ranges, lakes, rivers and 14,500km of coastline. Beijing, the capital, mixes modern architecture with historic sites including sprawling Tiananmen Square. ",R.drawable.china_map),
            new Country("Afghanistan",R.drawable.afghanistan,"Afghani","Afghanistan officially the Islamic Republic of Afghanistan, is a landlocked country located within South Asia and Central Asia.",R.drawable.afghanistan_map),
            new Country("North Korea",R.drawable.nkorea,"North Korea Won", "North Korea Officially the Democratic People's Republic of Korea, is a country in East Asia, in the northern part of the Korean Peninsula. The name Korea is derived from the Kingdom of Goguryeo, also spelled as Koryŏ",R.drawable.nkorea_map),
            new Country("South Korea",R.drawable.skorea,"South Korean Won","South Korea, an East Asian nation on the southern half of the Korean Peninsula, shares one of the world’s most heavily militarized borders with North Korea. It’s equally known for its green, hilly countryside dotted with cherry trees and centuries-old Buddhist temples",R.drawable.skorea_map),
            new Country("Japan",R.drawable.japan,"Japanese Yen","Japan is an island nation in the Pacific Ocean with high-rise-filled cities, imperial palaces, mountainous national parks and thousands of shrines and temples. Tokyo, the crowded capital, is known for its neon skyscrapers and pop culture",R.drawable.japan_map)
    };

    public Country(){

    }
    public Country(String name, int flag, String currency, String fact, int map) {
        this.name = name;
        this.flag = flag;
        this.currency = currency;
        this.fact = fact;
        this.map = map;
    }

    public List<HashMap<String, String>> getAdaptorList(){
        // Each row in the list stores country name, currency and flag
        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        for(int i=0;i<countries.length;i++){
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("txt","Country:" + countries[i].getName());
            hm.put("cur","Currency : " + countries[i].getCurrency());
            hm.put("flag", Integer.toString(countries[i].getFlag()) );
            list.add(hm);
        }

        return list;
    }

    public String getName() {
        return name;
    }

    public int getFlag() {
        return flag;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFact() {
        return fact;
    }

    public int getMap() {
        return map;
    }
}
