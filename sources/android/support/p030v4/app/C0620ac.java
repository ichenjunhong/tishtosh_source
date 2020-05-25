package android.support.p030v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: android.support.v4.app.ac */
final class C0620ac {

    /* renamed from: a */
    private static final Object f2251a = new Object();

    /* renamed from: b */
    private static Field f2252b;

    /* renamed from: c */
    private static boolean f2253c;

    /* renamed from: d */
    private static final Object f2254d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m1694a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m1693a(Notification notification) {
        synchronized (f2251a) {
            if (f2253c) {
                return null;
            }
            try {
                if (f2252b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f2253c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2252b = declaredField;
                }
                Bundle bundle = (Bundle) f2252b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2252b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f2253c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    static Bundle[] m1695a(C0630ag[] agVarArr) {
        if (agVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[agVarArr.length];
        for (int i = 0; i < agVarArr.length; i++) {
            C0630ag agVar = agVarArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", agVar.f2293a);
            bundle.putCharSequence("label", agVar.f2294b);
            bundle.putCharSequenceArray("choices", agVar.f2295c);
            bundle.putBoolean("allowFreeFormInput", agVar.f2296d);
            bundle.putBundle("extras", agVar.f2297e);
            Set<String> set = agVar.f2298f;
            if (set != null && !set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (String add : set) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
