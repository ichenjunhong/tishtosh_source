package com.p683ss.android.ugc.aweme.net;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.retrofit2.p830a.C12685b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C53671s;

/* renamed from: com.ss.android.ugc.aweme.net.z */
public final class C37818z {
    /* renamed from: a */
    public static List<C12685b> m84419a(C53671s sVar) {
        if (sVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : sVar.mo111596b()) {
            arrayList.add(new C12685b(str, sVar.mo111593a(str)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C53671s m84420a(List<C12685b> list) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C12685b bVar : list) {
            hashMap.put(bVar.f33318a, bVar.f33319b);
        }
        return C53671s.m114149a((Map<String, String>) hashMap);
    }
}
