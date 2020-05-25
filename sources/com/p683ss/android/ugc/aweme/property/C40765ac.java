package com.p683ss.android.ugc.aweme.property;

import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;

/* renamed from: com.ss.android.ugc.aweme.property.ac */
public final class C40765ac {
    /* renamed from: e */
    public static C40791a m90176e(C40762a aVar) {
        if (aVar instanceof C40790a) {
            return ((C40790a) aVar).getUpdateCallback();
        }
        return null;
    }

    /* renamed from: f */
    public static <T extends Comparable<T>> C40766ad<T> m90177f(C40762a aVar) {
        if (aVar instanceof C40790a) {
            return ((C40790a) aVar).valueRange();
        }
        return null;
    }

    /* renamed from: a */
    public static float m90171a(C40762a aVar) {
        if (aVar instanceof C40790a) {
            return C39618d.f101152P.mo83106d((C40790a) aVar);
        }
        if (aVar instanceof C40796a) {
            return C39618d.f101151O.mo83120d((C40796a) aVar);
        }
        if (aVar instanceof C40773ai) {
            return ((Float) C39618d.f101152P.f103907a.mo83090a((C40773ai) aVar)).floatValue();
        }
        throw new RuntimeException("property must be AVAB.Property || AVSettings.Property || VESDKProperty");
    }

    /* renamed from: b */
    public static int m90173b(C40762a aVar) {
        if (aVar instanceof C40790a) {
            return C39618d.f101152P.mo83104b((C40790a) aVar);
        }
        if (aVar instanceof C40796a) {
            return C39618d.f101151O.mo83118b((C40796a) aVar);
        }
        if (aVar instanceof C40773ai) {
            return ((Integer) C39618d.f101152P.f103907a.mo83090a((C40773ai) aVar)).intValue();
        }
        throw new RuntimeException("property must be AVAB.Property || AVSettings.Property || VESDKProperty");
    }

    /* renamed from: c */
    public static long m90174c(C40762a aVar) {
        if (aVar instanceof C40790a) {
            return C39618d.f101152P.mo83105c((C40790a) aVar);
        }
        if (aVar instanceof C40796a) {
            return C39618d.f101151O.mo83119c((C40796a) aVar);
        }
        if (aVar instanceof C40773ai) {
            return ((Long) C39618d.f101152P.f103907a.mo83090a((C40773ai) aVar)).longValue();
        }
        throw new RuntimeException("property must be AVAB.Property || AVSettings.Property || VESDKProperty");
    }

    /* renamed from: d */
    public static String m90175d(C40762a aVar) {
        if (aVar instanceof C40790a) {
            return C39618d.f101152P.mo83107e((C40790a) aVar);
        }
        if (aVar instanceof C40796a) {
            return C39618d.f101151O.mo83121e((C40796a) aVar);
        }
        if (aVar instanceof C40773ai) {
            return (String) C39618d.f101152P.f103907a.mo83090a((C40773ai) aVar);
        }
        throw new RuntimeException("property must be AVAB.Property || AVSettings.Property || VESDKProperty");
    }

    /* renamed from: a */
    static void m90172a(C40773ai aiVar, Object obj) {
        C39618d.f101152P.f103907a.mo83092a((C40762a) aiVar, obj);
    }
}
