package androidx.work;

import androidx.work.C1538e.C1539a;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class ArrayCreatingInputMerger extends C1540f {
    /* renamed from: a */
    public final C1538e mo5901a(List<C1538e> list) {
        Object newInstance;
        C1539a aVar = new C1539a();
        HashMap hashMap = new HashMap();
        loop0:
        for (C1538e a : list) {
            Iterator it = a.mo5920a().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    Class cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            if (cls2.isArray()) {
                                int length = Array.getLength(obj);
                                int length2 = Array.getLength(value);
                                Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                                System.arraycopy(obj, 0, newInstance2, 0, length);
                                System.arraycopy(value, 0, newInstance2, length, length2);
                                value = newInstance2;
                            } else {
                                newInstance = Array.newInstance(obj.getClass(), 2);
                                Array.set(newInstance, 0, obj);
                                Array.set(newInstance, 1, value);
                            }
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = m5478a(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = m5478a(value, obj);
                        }
                        hashMap.put(str, value);
                    } else if (cls.isArray()) {
                        hashMap.put(str, value);
                    } else {
                        newInstance = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance, 0, value);
                    }
                    value = newInstance;
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.mo5923a(hashMap);
        return aVar.mo5924a();
    }

    /* renamed from: a */
    private static Object m5478a(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }
}
