package dmt.p2652av.video;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.a */
public final class C52884a {

    /* renamed from: a */
    public static final SparseArray<HashMap<String, Object>> f131167a = new SparseArray<>();

    /* renamed from: b */
    public static final C52884a f131168b = new C52884a();

    private C52884a() {
    }

    /* renamed from: a */
    public static void m112518a(int i, String str) {
        C52711k.m112240b(str, "key");
        HashMap hashMap = (HashMap) f131167a.get(1);
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    /* renamed from: a */
    public static void m112519a(int i, String str, Object obj) {
        C52711k.m112240b(str, "key");
        if (f131167a.get(1) == null) {
            f131167a.put(1, new HashMap());
        }
        Object obj2 = f131167a.get(1);
        C52711k.m112236a(obj2, "INFO_MAP[type]");
        ((Map) obj2).put(str, obj);
    }
}
