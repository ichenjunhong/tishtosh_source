package com.bytedance.sdk.account.p871j;

import com.bytedance.sdk.account.p871j.p875d.C13191a;
import com.bytedance.sdk.account.p871j.p875d.C13191a.C13192a;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.p1102b.C18494a;
import java.util.Date;
import java.util.Map;

/* renamed from: com.bytedance.sdk.account.j.a */
public final class C13180a {

    /* renamed from: a */
    private static Integer f34407a;

    /* renamed from: b */
    private static String f34408b;

    /* renamed from: com.bytedance.sdk.account.j.a$a */
    static class C13182a {

        /* renamed from: a */
        public int f34412a;

        /* renamed from: b */
        public String f34413b;

        C13182a(int i, String str) {
            this.f34412a = i;
            this.f34413b = str;
        }
    }

    /* renamed from: a */
    public static C13191a m26563a(C13207b bVar) {
        C13191a aVar;
        if (f34407a != null) {
            C13192a aVar2 = new C13192a();
            aVar2.f34432a = new Date().getTime();
            if (!(bVar == null || bVar.f34481i == null)) {
                aVar2.f34435d = bVar.f34473a;
                aVar2.f34436e = bVar.f34474b;
                String optString = bVar.f34481i.optString("screen_name");
                String optString2 = bVar.f34481i.optString("avatar_url");
                aVar2.f34438g = optString;
                aVar2.f34437f = optString2;
                if (f34407a.intValue() == 6) {
                    Map<String, C18494a> map = bVar.f34475c;
                    if (map != null) {
                        for (String str : map.keySet()) {
                            if (str.contains(f34408b)) {
                                f34408b = str;
                                C18494a aVar3 = (C18494a) map.get(str);
                                if (aVar3 != null) {
                                    String str2 = aVar3.f50951e;
                                    aVar2.f34439h = aVar3.f50952f;
                                    aVar2.f34440i = str2;
                                }
                            }
                        }
                    }
                }
            }
            aVar2.f34433b = f34407a.intValue();
            aVar2.f34434c = f34408b;
            aVar = new C13191a(aVar2.f34432a, aVar2.f34433b, aVar2.f34434c, aVar2.f34435d, aVar2.f34436e, aVar2.f34437f, aVar2.f34438g, aVar2.f34439h, aVar2.f34440i, aVar2.f34441j);
        } else {
            aVar = null;
        }
        f34407a = null;
        f34408b = null;
        return aVar;
    }

    /* renamed from: a */
    public static void m26564a(Integer num, String str) {
        f34407a = num;
        f34408b = str;
    }
}
