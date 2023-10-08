package file学习;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 统计文件的数量 {
    public static void main(String[] args) {

        File file = new File("G:\\图片合集\\原神");
        System.out.println(类型(file));
    }

    public static HashMap<String, Integer> 类型(File file) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        File[] files = file.listFiles();

        if (file != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    String[] arr = file1.getName().split("\\.");
                    if (arr.length >= 2) {
                        String suffix = arr[arr.length - 1];
                        if (hashMap.containsKey(suffix)) {

                            Integer count = hashMap.get(suffix);
                            count += 1;
                            hashMap.put(suffix, count);

                        } else {
                            hashMap.put(suffix, 1);
                        }
                    }
                } else {
                    HashMap<String, Integer> sonMap = 类型(file1);
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        if (hashMap.containsKey(key)) {

                            Integer integer = hashMap.get(key);
                            integer+=value;
                            hashMap.put(key,integer);

                        }else {
                            hashMap.put(key,value);
                        }
                    }
                }
            }
        }

        return hashMap;
    }
}
