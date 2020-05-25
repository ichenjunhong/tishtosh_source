package com.bytedance.opensdk.core.p801a.p802a;

import com.bytedance.opensdk.core.p801a.C12481a;
import com.bytedance.opensdk.core.p801a.p803b.C12490c;
import com.bytedance.opensdk.core.p801a.p804c.C12491a;
import com.bytedance.opensdk.core.p801a.p804c.C12492b;
import com.bytedance.opensdk.core.p801a.p804c.C12493c;
import com.bytedance.opensdk.core.p801a.p804c.C12494d;
import com.bytedance.opensdk.p800b.C12460b;
import com.bytedance.opensdk.p800b.C12473k;
import com.bytedance.opensdk.p800b.C12478o;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18087q;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.LinkedHashMap;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.opensdk.core.a.a.c */
public final class C12486c extends C12482a<C12490c> {

    /* renamed from: com.bytedance.opensdk.core.a.a.c$a */
    public static final class C12487a extends C52712l implements C52671b<String, C12481a> {

        /* renamed from: a */
        final /* synthetic */ C12486c f32804a;

        public C12487a(C12486c cVar) {
            this.f32804a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C12481a aVar;
            int i;
            boolean z;
            String str = (String) obj;
            C52711k.m112240b(str, "ticket");
            C12492b a = this.f32804a.mo23516a(((C12490c) this.f32804a.f32801a).f32814f, ((C12490c) this.f32804a.f32801a).f32812d, ((C12490c) this.f32804a.f32801a).f32811c, str);
            if (a == null) {
                aVar = new C12481a(200, null, "error: 200", "code resp null error!");
            } else if (a.mo23524a()) {
                String str2 = ((C12491a) a.f32828c).f32815a;
                CharSequence charSequence = str2;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    aVar = new C12481a(0, str2, a.f32827b, ((C12491a) a.f32828c).f32825c);
                } else {
                    aVar = new C12481a(202, null, a.mo23525b(), ((C12491a) a.f32828c).f32825c);
                }
            } else {
                Integer num = ((C12491a) a.f32828c).f32826d;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 201;
                }
                return new C12481a(i, null, a.mo23525b(), ((C12491a) a.f32828c).f32825c);
            }
            return aVar;
        }
    }

    public C12486c(C12490c cVar) {
        C52711k.m112240b(cVar, "authConfig");
        super(cVar);
    }

    /* renamed from: a */
    public final C12494d mo23517a(int i) {
        C18085o oVar;
        String str;
        String str2;
        String str3 = ((C12490c) this.f32801a).f32809a;
        C52711k.m112240b(str3, "ticketDomain");
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append("/passport/open/authorize/ticket/");
        try {
            C18082l a = new C18087q().mo35029a(C12473k.f32778a.m25070a(new C12478o(sb.toString()).mo23508a("aid", i).mo23510a(), new LinkedHashMap(), new LinkedHashMap()));
            C52711k.m112236a((Object) a, "JsonParser().parse(SdkUt….get(urlBuilder.build()))");
            oVar = a.mo35009m();
        } catch (Exception e) {
            oVar = C12460b.m25050a(e, (int) BaseNotice.HASHTAG);
        }
        C52711k.m112236a((Object) oVar, "jsonResp");
        Integer num = null;
        String a2 = C12460b.m25054a(oVar, "message", (String) null);
        if (a2 == null) {
            a2 = "";
        }
        C18085o a3 = C12460b.m25049a(oVar, "data");
        if (a3 != null) {
            str = C12460b.m25054a(a3, "ticket", (String) null);
        } else {
            str = null;
        }
        if (a3 != null) {
            str2 = C12460b.m25054a(a3, "description", (String) null);
        } else {
            str2 = null;
        }
        if (a3 != null) {
            String a4 = C12460b.m25054a(a3, "error_code", (String) null);
            if (a4 != null) {
                Integer c = C52830p.m112395c(a4);
                if (c != null) {
                    num = c;
                    return new C12494d(a2, new C12493c(str2, num, str));
                }
            }
        }
        if (a3 != null) {
            num = Integer.valueOf(C12460b.m25048a(a3, "error_code", -1));
        }
        return new C12494d(a2, new C12493c(str2, num, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ba, code lost:
        if (r2 == null) goto L_0x00bc;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.opensdk.core.p801a.p804c.C12492b mo23516a(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r6 = this;
            T r0 = r6.f32801a
            com.bytedance.opensdk.core.a.b.c r0 = (com.bytedance.opensdk.core.p801a.p803b.C12490c) r0
            java.lang.String r0 = r0.f32810b
            java.lang.String r1 = "codeDomain"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            boolean r1 = com.bytedance.opensdk.core.base.config.C12504a.C12505a.m25100a()
            if (r1 == 0) goto L_0x0023
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/passport/open/authorize/"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0034
        L_0x0023:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/oauth/authorize/"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0034:
            com.bytedance.opensdk.b.o r1 = new com.bytedance.opensdk.b.o
            r1.<init>(r0)
            java.lang.String r0 = "client_key"
            com.bytedance.opensdk.b.o r7 = r1.mo23509a(r0, r7)
            java.lang.String r0 = "scope"
            com.bytedance.opensdk.b.o r7 = r7.mo23509a(r0, r8)
            java.lang.String r8 = "response_type"
            com.bytedance.opensdk.b.o r7 = r7.mo23509a(r8, r9)
            java.lang.String r8 = "from"
            java.lang.String r9 = "opensdk"
            com.bytedance.opensdk.b.o r7 = r7.mo23509a(r8, r9)
            java.lang.String r8 = "ticket"
            com.bytedance.opensdk.b.o r7 = r7.mo23509a(r8, r10)
            com.google.gson.q r8 = new com.google.gson.q     // Catch:{ Exception -> 0x007a }
            r8.<init>()     // Catch:{ Exception -> 0x007a }
            com.bytedance.opensdk.b.k r0 = com.bytedance.opensdk.p800b.C12473k.f32778a     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = r7.mo23510a()     // Catch:{ Exception -> 0x007a }
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.lang.String r7 = r0.m25070a(r1, new java.util.LinkedHashMap(), new java.util.LinkedHashMap())     // Catch:{ Exception -> 0x007a }
            com.google.gson.l r7 = r8.mo35029a(r7)     // Catch:{ Exception -> 0x007a }
            java.lang.String r8 = "JsonParser().parse(SdkUt….get(urlBuilder.build()))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ Exception -> 0x007a }
            com.google.gson.o r7 = r7.mo35009m()     // Catch:{ Exception -> 0x007a }
            goto L_0x0081
        L_0x007a:
            r7 = move-exception
            r8 = 201(0xc9, float:2.82E-43)
            com.google.gson.o r7 = com.bytedance.opensdk.p800b.C12460b.m25050a(r7, r8)
        L_0x0081:
            java.lang.String r8 = "jsonResp"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.String r8 = "message"
            r9 = 2
            r10 = 0
            java.lang.String r8 = com.bytedance.opensdk.p800b.C12460b.m25054a(r7, r8, (java.lang.String) null)
            if (r8 != 0) goto L_0x0092
            java.lang.String r8 = ""
        L_0x0092:
            java.lang.String r0 = "data"
            com.google.gson.o r7 = com.bytedance.opensdk.p800b.C12460b.m25049a(r7, r0)
            if (r7 == 0) goto L_0x00a1
            java.lang.String r0 = "code"
            java.lang.String r0 = com.bytedance.opensdk.p800b.C12460b.m25054a(r7, r0, (java.lang.String) null)
            goto L_0x00a2
        L_0x00a1:
            r0 = r10
        L_0x00a2:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r1 = "description"
            java.lang.String r1 = com.bytedance.opensdk.p800b.C12460b.m25054a(r7, r1, (java.lang.String) null)
            goto L_0x00ac
        L_0x00ab:
            r1 = r10
        L_0x00ac:
            if (r7 == 0) goto L_0x00bc
            java.lang.String r2 = "error_code"
            java.lang.String r2 = com.bytedance.opensdk.p800b.C12460b.m25054a(r7, r2, (java.lang.String) null)
            if (r2 == 0) goto L_0x00bc
            java.lang.Integer r2 = p2628d.p2650m.C52830p.m112395c(r2)
            if (r2 != 0) goto L_0x00cb
        L_0x00bc:
            if (r7 == 0) goto L_0x00ca
            java.lang.String r2 = "error_code"
            r3 = -1
            int r2 = com.bytedance.opensdk.p800b.C12460b.m25048a(r7, r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00cb
        L_0x00ca:
            r2 = r10
        L_0x00cb:
            if (r7 == 0) goto L_0x00d3
            java.lang.String r3 = "state"
            java.lang.String r10 = com.bytedance.opensdk.p800b.C12460b.m25054a(r7, r3, (java.lang.String) null)
        L_0x00d3:
            com.bytedance.opensdk.core.a.c.a r7 = new com.bytedance.opensdk.core.a.c.a
            r7.<init>(r0, r10, r1, r2)
            com.bytedance.opensdk.core.a.c.b r9 = new com.bytedance.opensdk.core.a.c.b
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.core.p801a.p802a.C12486c.mo23516a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.bytedance.opensdk.core.a.c.b");
    }
}
