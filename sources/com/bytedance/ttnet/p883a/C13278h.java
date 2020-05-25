package com.bytedance.ttnet.p883a;

import com.bytedance.common.utility.C9431p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ttnet.a.h */
public class C13278h {

    /* renamed from: a */
    private static volatile C13278h f34640a;

    /* renamed from: a */
    public static C13278h m26738a() {
        if (f34640a == null) {
            synchronized (C13278h.class) {
                if (f34640a == null) {
                    f34640a = new C13278h();
                }
            }
        }
        return f34640a;
    }

    /* renamed from: a */
    static List<String> m26739a(String str) {
        String[] split;
        ArrayList arrayList = new ArrayList();
        if (C9431p.m18664a(str)) {
            return arrayList;
        }
        for (String str2 : str.split(",")) {
            if (!C9431p.m18664a(str2)) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static List<String> m26740a(List<String> list) {
        String[] split;
        ArrayList arrayList = new ArrayList();
        for (String split2 : list) {
            for (String str : split2.split(";")) {
                if (!C9431p.m18664a(str)) {
                    arrayList.add(str.trim());
                }
            }
        }
        return arrayList;
    }
}
