package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16654ei;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.google.android.gms.tagmanager.bi */
final class C17198bi {
    /* renamed from: a */
    static C17169ah<C16654ei> m42143a(C17169ah<C16654ei> ahVar, int... iArr) {
        for (int i : iArr) {
            if (C17196bg.m42133b((C16654ei) ahVar.f48564a) instanceof String) {
                if (i != 12) {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unsupported Value Escaping: ");
                    sb.append(i);
                } else {
                    ahVar = m42142a(ahVar);
                }
            }
        }
        return ahVar;
    }

    /* renamed from: a */
    private static C17169ah<C16654ei> m42142a(C17169ah<C16654ei> ahVar) {
        try {
            return new C17169ah<>(C17196bg.m42132b((Object) URLEncoder.encode(C17196bg.m42131a(C17196bg.m42133b((C16654ei) ahVar.f48564a)), "UTF-8").replaceAll("\\+", "%20")), ahVar.f48565b);
        } catch (UnsupportedEncodingException unused) {
            return ahVar;
        }
    }
}
