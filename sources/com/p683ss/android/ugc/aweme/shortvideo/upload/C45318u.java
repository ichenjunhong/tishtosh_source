package com.p683ss.android.ugc.aweme.shortvideo.upload;

import android.content.Context;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45321x.C45322a;
import com.p683ss.android.ugc.tools.utils.C50200d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.u */
public final class C45318u {

    /* renamed from: a */
    public static final C45318u f114574a = new C45318u();

    /* renamed from: b */
    private static C45321x f114575b;

    private C45318u() {
    }

    /* renamed from: a */
    private static float m98792a(long j) {
        return (((float) j) / 1024.0f) / 1024.0f;
    }

    /* renamed from: a */
    public static final C45322a m98793a() {
        C45321x xVar = f114575b;
        if (xVar != null) {
            return xVar.mo91598a();
        }
        return null;
    }

    /* renamed from: b */
    private final float m98797b() {
        return m98792a(C50200d.m108338a((Context) C39629l.m88233b()));
    }

    /* renamed from: a */
    public static final void m98794a(String str) {
        if (str != null) {
            C45321x xVar = new C45321x(str, C45320w.DirectRecord, 0.0f, 0.0f, 0.0f, 0.0f, null, null, false, 508, null);
            f114575b = xVar;
            xVar.f114580c = f114574a.m98797b();
        }
    }

    /* renamed from: b */
    public static final void m98798b(String str) {
        if (str != null) {
            C45321x xVar = new C45321x(str, C45320w.Draft, 0.0f, 0.0f, 0.0f, 0.0f, null, null, false, 508, null);
            f114575b = xVar;
            xVar.f114580c = f114574a.m98797b();
        }
    }

    /* renamed from: a */
    public static final void m98795a(String str, long j) {
        if (str != null && f114575b != null) {
            m98799b(str, "onSyntheticFinish");
            C45321x xVar = f114575b;
            if (xVar != null) {
                xVar.f114582e = f114574a.m98797b();
            }
            C45321x xVar2 = f114575b;
            if (xVar2 != null) {
                xVar2.f114583f = m98792a(j);
            }
        }
    }

    /* renamed from: b */
    private static void m98799b(String str, String str2) {
        Object obj;
        if (f114575b != null) {
            C45321x xVar = f114575b;
            String str3 = null;
            if (xVar != null) {
                obj = xVar.f114578a;
            } else {
                obj = null;
            }
            if (!C52711k.m112239a((Object) str, obj)) {
                C45321x xVar2 = f114575b;
                if (xVar2 == null) {
                    C52711k.m112234a();
                }
                String str4 = xVar2.f114585h;
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(str2);
                sb.append(" creationId Error, start:");
                C45321x xVar3 = f114575b;
                if (xVar3 != null) {
                    str3 = xVar3.f114578a;
                }
                sb.append(str3);
                sb.append(", now:");
                sb.append(str);
                xVar2.mo91600b(sb.toString());
                C45321x xVar4 = f114575b;
                if (xVar4 != null) {
                    xVar4.f114586i = false;
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m98796a(String str, String str2) {
        C52711k.m112240b(str2, "contentType");
        if (str != null && f114575b != null) {
            m98799b(str, "onSyntheticStart");
            C45321x xVar = f114575b;
            if (xVar != null) {
                xVar.f114581d = f114574a.m98797b();
            }
            C45321x xVar2 = f114575b;
            if (xVar2 != null) {
                xVar2.mo91599a(str2);
            }
        }
    }
}
