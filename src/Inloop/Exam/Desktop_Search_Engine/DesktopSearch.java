package Inloop.Exam.Desktop_Search_Engine;

import java.util.*;

public class DesktopSearch {

    private Map<String, ResourceType> types;
    private Index index;

    public DesktopSearch(){

        types = new HashMap<>();
        index = new Index();

    }

    public void registerType(String extension, ResourceType type) {

        if (extension.isEmpty() | type == null) {throw new NullPointerException();}

        types.put(extension, type);

    }

    public void unregisterType(String extension) {

        if (extension.isEmpty()) {throw new NullPointerException();}

        types.remove(extension);

    }

    public ResourceType getType(String extension) {return types.get(extension);}

    public void registerResource(Resource res) {index.add(res);}

    public List<Resource> processRequest(String request) {return index.getResources(request);}

}
