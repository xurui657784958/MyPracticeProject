package util;
import java.util.*;
import java.util.List;

/**
 * @author edward
 */
public class AverageWorkerUtil {
    /**
     * 定义存储待分配数据集合
     */
    private static List<String> list = new ArrayList<>();

    /**
     * 定义存储分组数据的结构，Map去除泛型，适配多种数据类型格式，使用时需注意
     */
    private static List<Map> los = new ArrayList<>();

    /**
     * 供外部调用的平均分配方法
     *
     * @param deviceGroupIds 设备组Id
     * @param workerIds  workerId
     * @return List<Map>
     */
    public static List<Map> averageData(List<String> deviceGroupIds, List<String> workerIds) {
        initCollections(deviceGroupIds, workerIds);
        if (deviceGroupIds.size() >= workerIds.size()) {
            groupByData(los.size());
            return getMaps();
        } else {
            groupByData(list.size());
            return getMaps();
        }
    }

    /**
     * 返回数据，清空静态缓存
     *
     * @return List<Map>
     */
    private static List<Map> getMaps() {
        List<Map> listMap = new ArrayList<>();
        listMap.addAll(los);
        //清空静态数据
        los = new ArrayList<>();
        list = new ArrayList<>();
        return listMap;
    }

    /**
     * 分配数据
     *
     * @param size       分组大小
     */
    private static void groupByData(int size) {
        List<String> augmented = list;

        List<List<String>> lists = chunk2(augmented, size);

        for (int i = 0; i < size; i++) {
            Map map = los.get(i);
            Iterator iterator = map.keySet().iterator();
            if (iterator.hasNext()) {
                String next = (String) iterator.next();
                map.put(next, lists.get(i));
            }
        }
    }

    /**
     * 初始化集合数据
     *
     * @param deviceGroupIds 待分配数据
     * @param workerIds  分配目标
     */
    private static void initCollections(List<String> deviceGroupIds, List<String> workerIds) {
        //每次调用前清空数据
        if (list.size() > 0) {
            list = new ArrayList<>();
        }
        if (los.size() > 0) {
            los = new ArrayList<>();
        }
        list.addAll(deviceGroupIds);
        List<Map<String, List<String>>> list1 = new ArrayList<>();
        for (String sellerId : workerIds) {
            Map<String, List<String>> map = new HashMap<>(16);
            List<String> list = new ArrayList<>();
            map.put(sellerId, list);
            list1.add(map);
        }
        los.addAll(list1);
    }

    /**
     * 分组数据-核心算法
     *
     * @param list  需分配数据
     * @param group 分组大小
     * @param <T>   分组数据泛型
     * @return 分组结果
     */
    private static <T> List<List<T>> chunk2(List<T> list, int group) {
        if (list.size() == 0) {
            return new ArrayList<>();
        }
        List<List<T>> result = new ArrayList<>();
        Map<Integer, Set<T>> temp = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (temp.containsKey(i % group)) {
                Set<T> ts = temp.get(i % group);
                ts.add(list.get(i));
                temp.put(i % group, ts);
            } else {
                Set<T> ts = new HashSet<>();
                ts.add(list.get(i));
                temp.put(i % group, ts);
            }
        }
        for (Set<T> ts : temp.values()) {
            result.add(new ArrayList<>(ts));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> dgIds = new ArrayList<>();
        dgIds.add("aa");
        dgIds.add("bb");
        dgIds.add("cc");
        dgIds.add("dd");
        dgIds.add("ee");
        dgIds.add("ff");
        dgIds.add("gg");
        dgIds.add("hh");
        dgIds.add("ii");
        dgIds.add("jj");
        dgIds.add("kk");
        List<String> sellerIds = new ArrayList<>();
        sellerIds.add("11");
        sellerIds.add("22");
        sellerIds.add("33");
        sellerIds.add("44");
        sellerIds.add("55");
        List<Map> maps = averageData(dgIds, sellerIds);
        System.out.println(maps);
        for (Map rt : maps){
            System.out.println(rt.keySet());
        }
    }
}
