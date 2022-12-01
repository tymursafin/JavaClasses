package repls;

import java.util.*;

public class Repl218CountingDeviceNames {

    public static List<String> countDeviceNames(List<String> deviceNames) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (String device : deviceNames) {
            int id = 1;
            if (!set.add(device)) {
                while (!set.add(device + id)) {
                    id++;
                }
            }
        }

        ArrayList<String> aList = new ArrayList<>(set.size());
        aList.addAll(set);
        return aList;
    }

    public static void main(String[] args) {
        List<String> devices = new ArrayList<>();
        devices.add("yyy");
        devices.add("zzz");
        devices.add("yyy");
        devices.add("yyy");
        devices.add("yyy");
        devices.add("xxx");
        devices.add("zzz");
        devices.add("zzz");
        devices.add("zzz");
        devices.add("zzz");

        System.out.println(countDeviceNames(devices));
    }

}
