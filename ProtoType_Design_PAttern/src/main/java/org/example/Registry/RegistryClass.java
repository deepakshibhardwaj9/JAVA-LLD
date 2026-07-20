package org.example.Registry;
import com.sun.jdi.Value;

import java.security.Key;
import  java.util.*;

public class RegistryClass {
    private Map<String, Student> registry;

    public RegistryClass() {
        registry = new HashMap<>();
    }

    public void addEntry(String key, Student value)
    {
        registry.put(key, value);
    }

    public void removeEntry(String key)
    {
        registry.remove(key);
    }

    public void updateEntry(String key, Student student) {
        registry.replace(key, student);
    }

    public int registrySize()
    {
        return registry.size();
    }

    public Student getRegistry(String key)
    {
        // We added clone() method here so that instead of fetching the object, user directly get the copy of Object..
        // This will make sure that the original object must not be modified while fetching already added object in registry.
        return registry.get(key).clone();
    }

}
