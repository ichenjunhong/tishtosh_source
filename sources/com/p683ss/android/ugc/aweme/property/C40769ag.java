package com.p683ss.android.ugc.aweme.property;

import android.text.TextUtils;
import com.google.gson.C18085o;
import com.google.gson.C18088r;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40763b;
import com.p683ss.android.vesdk.C50712l;
import com.p683ss.android.vesdk.C50712l.C50715b;
import com.p683ss.android.vesdk.C50712l.C50716c;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.ag */
public final class C40769ag {

    /* renamed from: a */
    private final C40789h f103868a;

    /* renamed from: com.ss.android.ugc.aweme.property.ag$a */
    public static final class C40770a implements C40762a {

        /* renamed from: a */
        final /* synthetic */ String f103869a;

        /* renamed from: b */
        final /* synthetic */ C50716c f103870b;

        public final String key() {
            return this.f103869a;
        }

        public final boolean supportPersist() {
            return true;
        }

        public final Object defValue() {
            Object obj = this.f103870b.f127275b;
            C52711k.m112236a(obj, "valuePkt.getValue()");
            return obj;
        }

        public final C40763b type() {
            C50715b bVar = this.f103870b.f127274a;
            if (bVar != null) {
                switch (C40772ah.f103873a[bVar.ordinal()]) {
                    case 1:
                        return C40763b.Long;
                    case 2:
                        return C40763b.Boolean;
                    case 3:
                        return C40763b.Float;
                    case 4:
                        return C40763b.Integer;
                    case 5:
                        return C40763b.String;
                }
            }
            return C40763b.String;
        }

        C40770a(String str, C50716c cVar) {
            this.f103869a = str;
            this.f103870b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ag$b */
    public static final class C40771b implements C40773ai {

        /* renamed from: a */
        final /* synthetic */ C40769ag f103871a;

        /* renamed from: b */
        final /* synthetic */ C40762a f103872b;

        public final boolean supportPersist() {
            return this.f103872b.supportPersist();
        }

        public final Object defValue() {
            return this.f103871a.mo83090a(this.f103872b);
        }

        public final String key() {
            String key = this.f103872b.key();
            C52711k.m112236a((Object) key, "propertyFromVE.key()");
            return key;
        }

        public final C40763b type() {
            C40763b type = this.f103872b.type();
            C52711k.m112236a((Object) type, "propertyFromVE.type()");
            return type;
        }

        C40771b(C40769ag agVar, C40762a aVar) {
            this.f103871a = agVar;
            this.f103872b = aVar;
        }
    }

    /* renamed from: a */
    public final Map<String, C40773ai> mo83091a() {
        HashMap hashMap = new HashMap();
        C50712l a = C50712l.m109659a();
        C52711k.m112236a((Object) a, "VEConfigCenter.getInstance()");
        Map b = a.mo99231b();
        C52711k.m112236a((Object) b, "VEConfigCenter.getInstance().configs");
        for (Entry entry : b.entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty((CharSequence) entry.getKey())) {
                Map map = hashMap;
                Object key = entry.getKey();
                C52711k.m112236a(key, "it.key");
                Object key2 = entry.getKey();
                C52711k.m112236a(key2, "it.key");
                String str = (String) key2;
                Object value = entry.getValue();
                C52711k.m112236a(value, "it.value");
                map.put(key, m90194b(m90191a(str, (C50716c) value)));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private final C40773ai m90194b(C40762a aVar) {
        return new C40771b(this, aVar);
    }

    public C40769ag(C40789h hVar) {
        C52711k.m112240b(hVar, "avab");
        this.f103868a = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        p2628d.p2639f.p2641b.C52711k.m112236a(r3, "when (property.type()) {…perty(property)\n        }");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo83090a(com.p683ss.android.ugc.aweme.property.C40761aa.C40762a r3) {
        /*
            r2 = this;
            java.lang.String r0 = "property"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            com.ss.android.ugc.aweme.property.aa$b r0 = r3.type()
            if (r0 == 0) goto L_0x004f
            int[] r1 = com.p683ss.android.ugc.aweme.property.C40772ah.f103874b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x003f;
                case 2: goto L_0x0034;
                case 3: goto L_0x0029;
                case 4: goto L_0x001e;
                case 5: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x004f
        L_0x0017:
            com.ss.android.ugc.aweme.property.h r0 = r2.f103868a
            java.lang.String r3 = r0.mo83107e(r3)
            goto L_0x0049
        L_0x001e:
            com.ss.android.ugc.aweme.property.h r0 = r2.f103868a
            float r3 = r0.mo83106d(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0049
        L_0x0029:
            com.ss.android.ugc.aweme.property.h r0 = r2.f103868a
            long r0 = r0.mo83105c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto L_0x0049
        L_0x0034:
            com.ss.android.ugc.aweme.property.h r0 = r2.f103868a
            int r3 = r0.mo83104b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0049
        L_0x003f:
            com.ss.android.ugc.aweme.property.h r0 = r2.f103868a
            boolean r3 = r0.mo83103a(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        L_0x0049:
            java.lang.String r0 = "when (property.type()) {…perty(property)\n        }"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
            return r3
        L_0x004f:
            d.l r3 = new d.l
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.property.C40769ag.mo83090a(com.ss.android.ugc.aweme.property.aa$a):java.lang.Object");
    }

    /* renamed from: a */
    public static C40762a m90191a(String str, C50716c cVar) {
        return new C40770a(str, cVar);
    }

    /* renamed from: a */
    public static String m90192a(C18085o oVar, String str) {
        String str2 = "";
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                String c2 = c.mo34905c();
                C52711k.m112236a((Object) c2, "primitive.asString");
                return c2;
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo83092a(C40762a aVar, Object obj) {
        C52711k.m112240b(aVar, "property");
        C52711k.m112240b(obj, "value");
        C40763b type = aVar.type();
        if (type != null) {
            switch (C40772ah.f103875c[type.ordinal()]) {
                case 1:
                    this.f103868a.mo83102a(aVar, ((Boolean) obj).booleanValue());
                    return;
                case 2:
                    this.f103868a.mo83099a(aVar, ((Integer) obj).intValue());
                    return;
                case 3:
                    this.f103868a.mo83100a(aVar, ((Long) obj).longValue());
                    return;
                case 4:
                    this.f103868a.mo83098a(aVar, ((Float) obj).floatValue());
                    return;
                case 5:
                    this.f103868a.mo83101a(aVar, (String) obj);
                    break;
            }
        }
    }

    /* renamed from: a */
    public static float m90188a(C18085o oVar, String str, float f) {
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                return c.mo34907e();
            }
        } catch (Exception unused) {
        }
        return f;
    }

    /* renamed from: a */
    public static int m90189a(C18085o oVar, String str, int i) {
        try {
            C18088r c = oVar.mo35023c(str);
            if (c == null) {
                return i;
            }
            if (!c.mo35030a()) {
                return c.mo34910g();
            }
            if (c.mo34911h()) {
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static long m90190a(C18085o oVar, String str, long j) {
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                return c.mo34909f();
            }
        } catch (Exception unused) {
        }
        return j;
    }

    /* renamed from: a */
    public static boolean m90193a(C18085o oVar, String str, boolean z) {
        try {
            C18088r c = oVar.mo35023c(str);
            if (c == null) {
                return z;
            }
            if (!c.mo35033q()) {
                return c.mo34911h();
            }
            if (c.mo34904b().intValue() == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return z;
        }
    }
}
