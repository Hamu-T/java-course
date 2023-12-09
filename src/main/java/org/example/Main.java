package org.example;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> musicalKeysMap = new HashMap<>();
        musicalKeysMap.put("C" , "Cメジャースケールは「ハ長調」です。");
        musicalKeysMap.put("Cm" , "Cマイナースケールは「ハ短調」です。");
        musicalKeysMap.put("D" , "Dメジャースケールは「二長調」です。");
        musicalKeysMap.put("Dm" , "Dマイナースケールは「二短調」です。");
        musicalKeysMap.put("E" , "Eメジャースケールは「ホ長調」です。");
        musicalKeysMap.put("Em" , "Eマイナースケールは「ホ短調」です。");
        musicalKeysMap.put("F" , "Fメジャースケールは「ヘ長調」です。");
        musicalKeysMap.put("Fm" , "Fマイナースケールは「ヘ短調」です。");
        musicalKeysMap.put("G" , "Gメジャースケールは「ト長調」です。");
        musicalKeysMap.put("Gm" , "Gマイナースケールは「ト短調」です。");
        musicalKeysMap.put("A" , "Aメジャースケールは「イ長調」です。");
        musicalKeysMap.put("Am" , "Aマイナースケールは「イ短調」です。");
        musicalKeysMap.put("B" , "Bメジャースケールは「ロ長調」です。");
        musicalKeysMap.put("Bm" , "Bマイナースケールは「ロ短調」です。");

        // Mapのすべてのエントリを拡張for文で表示
        for (Map.Entry<String, String> entry : musicalKeysMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        String targetKey = "Q";
        try {
            String japaneseDescription = getMusicalKeyDescription(musicalKeysMap, targetKey);
            System.out.println(japaneseDescription);
        } catch (myKeyNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getMusicalKeyDescription(Map<String, String> japanese, String targetKey) throws myKeyNotFoundException {
        if (japanese.containsKey(targetKey)) {
            return japanese.get(targetKey);
        } else {
            throw new myKeyNotFoundException("指定された調性が見つかりません : " + targetKey);
        }
    }
    static class myKeyNotFoundException extends Exception {
        public myKeyNotFoundException(String message) {
            super(message);
        }
    }
}