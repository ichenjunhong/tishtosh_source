package com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1562a;

import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25749d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.c */
public final class C25796c {

    /* renamed from: a */
    public static final C25796c f68219a = new C25796c();

    private C25796c() {
    }

    /* renamed from: a */
    public static C25749d m62433a(String str, C25773a aVar, String str2) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(aVar, "eggData");
        int hashCode = str.hashCode();
        if (hashCode != 3321751) {
            if (hashCode == 950398559 && str.equals("comment")) {
                C25792a aVar2 = new C25792a();
                String str3 = aVar.f68165m;
                C52711k.m112240b(str3, "<set-?>");
                aVar2.f68212e = str3;
                String str4 = aVar.f68166n;
                C52711k.m112240b(str4, "<set-?>");
                aVar2.f68213f = str4;
                String str5 = aVar.f68167o;
                C52711k.m112240b(str5, "<set-?>");
                aVar2.f68214g = str5;
                String str6 = aVar.f68158f;
                C52711k.m112240b(str6, "<set-?>");
                aVar2.f68208a = str6;
                String str7 = aVar.f68156d;
                C52711k.m112240b(str7, "<set-?>");
                aVar2.f68210c = str7;
                String str8 = aVar.f68157e;
                C52711k.m112240b(str8, "<set-?>");
                aVar2.f68211d = str8;
                if (str2 == null) {
                    str2 = "";
                }
                C52711k.m112240b(str2, "<set-?>");
                aVar2.f68209b = str2;
                return aVar2;
            }
        } else if (str.equals("like")) {
            C25794b bVar = new C25794b();
            String str9 = aVar.f68165m;
            C52711k.m112240b(str9, "<set-?>");
            bVar.f68216a = str9;
            String str10 = aVar.f68166n;
            C52711k.m112240b(str10, "<set-?>");
            bVar.f68217b = str10;
            String str11 = aVar.f68167o;
            C52711k.m112240b(str11, "<set-?>");
            bVar.f68218c = str11;
            return bVar;
        }
        return null;
    }
}
