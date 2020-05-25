package com.bytedance.opensdk.p800b;

import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18088r;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.b.b */
public final class C12460b {
    /* renamed from: b */
    private static Integer m25057b(C18088r rVar) {
        C52711k.m112240b(rVar, "receiver$0");
        if (rVar.mo35033q()) {
            return Integer.valueOf(rVar.mo34910g());
        }
        return null;
    }

    /* renamed from: a */
    private static C18088r m25051a(C18082l lVar) {
        C52711k.m112240b(lVar, "receiver$0");
        if (lVar.mo35007k()) {
            return lVar.mo35011o();
        }
        return null;
    }

    /* renamed from: a */
    private static String m25056a(C18088r rVar) {
        C52711k.m112240b(rVar, "receiver$0");
        if (rVar.mo35034r()) {
            return rVar.mo34905c();
        }
        return null;
    }

    /* renamed from: a */
    public static final C18085o m25049a(C18085o oVar, String str) {
        C52711k.m112240b(oVar, "receiver$0");
        C52711k.m112240b(str, "key");
        C18082l b = oVar.mo35022b(str);
        if (b == null || !b.mo35006j()) {
            return null;
        }
        return b.mo35009m();
    }

    /* renamed from: a */
    public static final C18085o m25050a(Exception exc, int i) {
        C52711k.m112240b(exc, "receiver$0");
        C18085o oVar = new C18085o();
        oVar.mo35020a("message", "error");
        C18085o oVar2 = new C18085o();
        oVar2.mo35020a("description", exc.toString());
        oVar2.mo35019a("error_code", (Number) Integer.valueOf(i));
        oVar.mo35017a("data", (C18082l) oVar2);
        return oVar;
    }

    /* renamed from: a */
    public static final int m25048a(C18085o oVar, String str, int i) {
        C52711k.m112240b(oVar, "receiver$0");
        C52711k.m112240b(str, "key");
        C18082l b = oVar.mo35022b(str);
        if (b != null) {
            C18088r a = m25051a(b);
            if (a != null) {
                Integer b2 = m25057b(a);
                if (b2 != null) {
                    return b2.intValue();
                }
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Boolean m25052a(C18085o oVar, String str, Boolean bool) {
        Boolean bool2;
        C52711k.m112240b(oVar, "receiver$0");
        C52711k.m112240b(str, "key");
        C18082l b = oVar.mo35022b(str);
        if (b != null) {
            C18088r a = m25051a(b);
            if (a != null) {
                C52711k.m112240b(a, "receiver$0");
                if (a.mo35030a()) {
                    bool2 = Boolean.valueOf(a.mo34911h());
                } else {
                    bool2 = null;
                }
                if (bool2 != null) {
                    return bool2;
                }
            }
        }
        return bool;
    }

    /* renamed from: a */
    public static final String m25054a(C18085o oVar, String str, String str2) {
        C52711k.m112240b(oVar, "receiver$0");
        C52711k.m112240b(str, "key");
        C18082l b = oVar.mo35022b(str);
        if (b != null) {
            C18088r a = m25051a(b);
            if (a != null) {
                String a2 = m25056a(a);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return str2;
    }
}
