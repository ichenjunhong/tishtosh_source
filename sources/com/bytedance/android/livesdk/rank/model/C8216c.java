package com.bytedance.android.livesdk.rank.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.rank.model.c */
public class C8216c {

    /* renamed from: a */
    public List<C8219f> f22436a;

    /* renamed from: b */
    public String f22437b;

    /* renamed from: c */
    public int f22438c;

    /* renamed from: a */
    public static C8216c m16292a(C8214a aVar) {
        if (aVar == null) {
            return null;
        }
        List<C8219f> list = aVar.f22415c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        C8216c cVar = new C8216c();
        cVar.f22436a = new ArrayList(list);
        cVar.f22437b = aVar.f22426n;
        return cVar;
    }
}
