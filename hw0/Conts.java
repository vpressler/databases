package uchidb;

import java.util.*;

/**
 * Created by Valeria Pressler on 1/9/17.
 */
public class Conts implements Containers {

    Map m;

    @Override
    public Set initSet(Object[] tArray) {
        HashSet<Object> hs = new HashSet<Object>();

        for (Object item : tArray) {
            hs.add(item);
        }

        return hs;
    }

    @Override
    public List initList(Object[] tArray) {
        ArrayList<Object> al = new ArrayList<Object>();

        for (Object item : tArray) {
            al.add(item);
        }

        return al;
    }

    @Override
    public Map initEmptyMap() {
        HashMap hm = new HashMap();
        return hm;
    }

    @Override
    public void storeMap(Map mapToStoreInClass) {
        m = mapToStoreInClass;
    }

    @Override
    public boolean addToMap(Object key, Object value, boolean overwriteExistingKey) {
        Object val = m.get(key);

        if (val == null || overwriteExistingKey) {
            m.put(key, value);
            return true;
        }

        return false;
    }

    @Override
    public Object getValueFromMap(Object key) {
        return m.get(key);
    }

    @Override
    public Object getValueFromMap(Object key, Object defaultValue) {
        Object val = m.get(key);

        if (val == null)
            return defaultValue;
        else
            return val;
    }
}