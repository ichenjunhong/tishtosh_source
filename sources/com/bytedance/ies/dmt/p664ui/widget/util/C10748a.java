package com.bytedance.ies.dmt.p664ui.widget.util;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.a */
public class C10748a {

    /* renamed from: a */
    static volatile C10748a f28886a;

    /* renamed from: b */
    static volatile Map<String, Integer> f28887b;

    /* renamed from: f */
    private static volatile SparseArray<String> f28888f;

    /* renamed from: c */
    SparseArray<Typeface> f28889c = new SparseArray<>();

    /* renamed from: d */
    Map<String, String> f28890d = new HashMap();

    /* renamed from: e */
    Context f28891e;

    private C10748a() {
    }

    /* renamed from: a */
    public static C10748a m21784a() {
        if (f28886a == null) {
            synchronized (C10748a.class) {
                if (f28886a == null) {
                    f28886a = new C10748a();
                }
            }
        }
        return f28886a;
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f28888f = sparseArray;
        sparseArray.put(1, C10751d.f28902a);
        f28888f.put(2, C10751d.f28903b);
        f28888f.put(3, C10751d.f28904c);
        f28888f.put(4, C10751d.f28905d);
        f28888f.put(5, C10751d.f28906e);
        f28888f.put(6, C10751d.f28907f);
        f28888f.put(7, C10751d.f28908g);
        f28888f.put(8, C10751d.f28909h);
        HashMap hashMap = new HashMap();
        f28887b = hashMap;
        hashMap.put(C10751d.f28902a, Integer.valueOf(1));
        f28887b.put(C10751d.f28903b, Integer.valueOf(2));
        f28887b.put(C10751d.f28904c, Integer.valueOf(3));
        f28887b.put(C10751d.f28905d, Integer.valueOf(4));
        f28887b.put(C10751d.f28906e, Integer.valueOf(5));
        f28887b.put(C10751d.f28907f, Integer.valueOf(6));
        f28887b.put(C10751d.f28908g, Integer.valueOf(7));
        f28887b.put(C10751d.f28909h, Integer.valueOf(8));
    }

    /* renamed from: b */
    private Typeface m21785b(int i) {
        String str = (String) this.f28890d.get((String) f28888f.get(i));
        if (this.f28891e != null) {
            try {
                return Typeface.createFromAsset(this.f28891e.getAssets(), str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Typeface mo19434a(int i) {
        Typeface typeface = (Typeface) this.f28889c.get(i, null);
        if (typeface != null) {
            return typeface;
        }
        Typeface b = m21785b(i);
        this.f28889c.put(i, b);
        return b;
    }
}
