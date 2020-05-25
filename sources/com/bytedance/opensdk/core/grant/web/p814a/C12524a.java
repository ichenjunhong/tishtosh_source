package com.bytedance.opensdk.core.grant.web.p814a;

import com.google.gson.C18085o;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.core.grant.web.a.a */
public final class C12524a {

    /* renamed from: a */
    public static final String f32884a;

    /* renamed from: b */
    public static final C12524a f32885b;

    /* renamed from: com.bytedance.opensdk.core.grant.web.a.a$a */
    public static final class C12525a {

        /* renamed from: a */
        public String f32886a;

        /* renamed from: b */
        public String f32887b;

        /* renamed from: c */
        public String f32888c;

        /* renamed from: d */
        public C18085o f32889d;

        /* renamed from: e */
        public int f32890e;

        public C12525a() {
            this(null, null, null, null, 0, 31, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C12525a) {
                    C12525a aVar = (C12525a) obj;
                    if (C52711k.m112239a((Object) this.f32886a, (Object) aVar.f32886a) && C52711k.m112239a((Object) this.f32887b, (Object) aVar.f32887b) && C52711k.m112239a((Object) this.f32888c, (Object) aVar.f32888c) && C52711k.m112239a((Object) this.f32889d, (Object) aVar.f32889d)) {
                        if (this.f32890e == aVar.f32890e) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f32886a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f32887b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f32888c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            C18085o oVar = this.f32889d;
            if (oVar != null) {
                i = oVar.hashCode();
            }
            return ((hashCode3 + i) * 31) + this.f32890e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JsMsg(type=");
            sb.append(this.f32886a);
            sb.append(", callback_id=");
            sb.append(this.f32887b);
            sb.append(", func=");
            sb.append(this.f32888c);
            sb.append(", params=");
            sb.append(this.f32889d);
            sb.append(", version=");
            sb.append(this.f32890e);
            sb.append(")");
            return sb.toString();
        }

        private C12525a(String str, String str2, String str3, C18085o oVar, int i) {
            this.f32886a = str;
            this.f32887b = str2;
            this.f32888c = str3;
            this.f32889d = oVar;
            this.f32890e = i;
        }

        public /* synthetic */ C12525a(String str, String str2, String str3, C18085o oVar, int i, int i2, C52707g gVar) {
            this(null, null, null, null, 0);
        }
    }

    private C12524a() {
    }

    static {
        C12524a aVar = new C12524a();
        f32885b = aVar;
        String simpleName = aVar.getClass().getSimpleName();
        C52711k.m112236a((Object) simpleName, "this::class.java.simpleName");
        f32884a = simpleName;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba A[Catch:{ Exception -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0064 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m25136a(java.lang.String r12, p2628d.p2639f.p2640a.C52671b<? super com.bytedance.opensdk.core.grant.web.p814a.C12524a.C12525a, p2628d.C52860x> r13) {
        /*
            java.lang.String r0 = "jsMsgQueue"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "handleMsg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            r0 = 2
            byte[] r12 = android.util.Base64.decode(r12, r0)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r1 = "Base64.decode(jsMsgQueue, Base64.NO_WRAP)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x00cf }
            java.nio.charset.Charset r2 = p2628d.p2650m.C52808d.f131043a     // Catch:{ Exception -> 0x00cf }
            r1.<init>(r12, r2)     // Catch:{ Exception -> 0x00cf }
            com.google.gson.q r12 = new com.google.gson.q     // Catch:{ Exception -> 0x00cf }
            r12.<init>()     // Catch:{ Exception -> 0x00cf }
            com.google.gson.l r12 = r12.mo35029a(r1)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r1 = "JsonParser().parse(s)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r1 = "receiver$0"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r1)     // Catch:{ Exception -> 0x00cf }
            boolean r1 = r12.mo35005i()     // Catch:{ Exception -> 0x00cf }
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.gson.i r12 = r12.mo35010n()     // Catch:{ Exception -> 0x00cf }
            goto L_0x003b
        L_0x003a:
            r12 = r2
        L_0x003b:
            if (r12 == 0) goto L_0x00ce
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch:{ Exception -> 0x00cf }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x00cf }
            r1.<init>()     // Catch:{ Exception -> 0x00cf }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x00cf }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x00cf }
        L_0x004a:
            boolean r3 = r12.hasNext()     // Catch:{ Exception -> 0x00cf }
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r12.next()     // Catch:{ Exception -> 0x00cf }
            boolean r4 = r3 instanceof com.google.gson.C18085o     // Catch:{ Exception -> 0x00cf }
            if (r4 == 0) goto L_0x004a
            r1.add(r3)     // Catch:{ Exception -> 0x00cf }
            goto L_0x004a
        L_0x005c:
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x00cf }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x00cf }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ Exception -> 0x00cf }
        L_0x0064:
            boolean r1 = r12.hasNext()     // Catch:{ Exception -> 0x00cf }
            if (r1 == 0) goto L_0x00cf
            java.lang.Object r1 = r12.next()     // Catch:{ Exception -> 0x00cf }
            com.google.gson.o r1 = (com.google.gson.C18085o) r1     // Catch:{ Exception -> 0x00cf }
            com.bytedance.opensdk.core.grant.web.a.a$a r11 = new com.bytedance.opensdk.core.grant.web.a.a$a     // Catch:{ Exception -> 0x00cf }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 31
            r10 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = "__msg_type"
            java.lang.String r3 = com.bytedance.opensdk.p800b.C12460b.m25054a(r1, r3, r2)     // Catch:{ Exception -> 0x00cf }
            r11.f32886a = r3     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = "__callback_id"
            java.lang.String r3 = com.bytedance.opensdk.p800b.C12460b.m25054a(r1, r3, r2)     // Catch:{ Exception -> 0x00cf }
            r11.f32887b = r3     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = "func"
            java.lang.String r3 = com.bytedance.opensdk.p800b.C12460b.m25054a(r1, r3, (java.lang.String) null)     // Catch:{ Exception -> 0x00cf }
            r11.f32888c = r3     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = "params"
            com.google.gson.o r3 = com.bytedance.opensdk.p800b.C12460b.m25049a(r1, r3)     // Catch:{ Exception -> 0x00cf }
            r11.f32889d = r3     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = "JSSDK"
            r4 = 0
            int r1 = com.bytedance.opensdk.p800b.C12460b.m25048a(r1, r3, r4)     // Catch:{ Exception -> 0x00cf }
            r11.f32890e = r1     // Catch:{ Exception -> 0x00cf }
            java.lang.String r1 = r11.f32886a     // Catch:{ Exception -> 0x00cf }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x00cf }
            r3 = 1
            if (r1 == 0) goto L_0x00b7
            int r1 = r1.length()     // Catch:{ Exception -> 0x00cf }
            if (r1 != 0) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            r1 = 0
            goto L_0x00b8
        L_0x00b7:
            r1 = 1
        L_0x00b8:
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = r11.f32888c     // Catch:{ Exception -> 0x00cf }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x00cf }
            if (r1 == 0) goto L_0x00c8
            int r1 = r1.length()     // Catch:{ Exception -> 0x00cf }
            if (r1 != 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            if (r3 != 0) goto L_0x0064
            r13.invoke(r11)     // Catch:{ Exception -> 0x00cf }
            goto L_0x0064
        L_0x00ce:
            return
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.core.grant.web.p814a.C12524a.m25136a(java.lang.String, d.f.a.b):void");
    }
}
