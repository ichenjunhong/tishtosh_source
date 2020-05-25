package p2628d.p2631c.p2633b.p2634a;

import java.lang.reflect.Field;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.c.b.a.g */
public final class C52619g {
    /* renamed from: a */
    static final int m112169a(C52613a aVar) {
        int i;
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            C52711k.m112236a((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
