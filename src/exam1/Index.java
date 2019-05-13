package exam1;

import java.util.*;

public class Index {

    private Map<String, List<Resource>> index;

    public Index() {

        index = new HashMap<>();

    }

    public void add(Resource res) {

        if (res == null) {throw new NullPointerException();}

        Set<String> keywords = res.getType().getCollector().getKeywords(res);

        for (String key : keywords){

            if (index.containsKey(key)){

                List<Resource> resources = index.get(key);

                if (resources.contains(res)) return;

                else  resources.add(res);

            } else {

                List<Resource> resources = new ArrayList<>(Collections.singletonList(res));

                this.index.put(key, resources);

            }
        }

    }

    public List<Resource> getResources(String keyword) {

        if (keyword.isEmpty()) {throw new NullPointerException();}

        return index.getOrDefault(keyword, Collections.emptyList());

    }

}

