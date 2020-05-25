package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.chatroom.event.C5167am;
import com.bytedance.android.livesdk.chatroom.event.C5195o;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.google.gson.p1076a.C17952c;
import org.json.JSONObject;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l */
public final class C4905l extends C10779d<C4906a, Object> {

    /* renamed from: a */
    private final C1689b f13190a = new C1689b();

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$a */
    public static final class C4906a {
        @C17952c(mo34828a = "type")

        /* renamed from: a */
        public final String f13191a;
        @C17952c(mo34828a = "content")

        /* renamed from: b */
        public final String f13192b;
        @C17952c(mo34828a = "sender")

        /* renamed from: c */
        public final String f13193c;
        @C17952c(mo34828a = "args")

        /* renamed from: d */
        public final JSONObject f13194d;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f13194d, (java.lang.Object) r3.f13194d) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4905l.C4906a
                if (r0 == 0) goto L_0x0031
                com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$a r3 = (com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4905l.C4906a) r3
                java.lang.String r0 = r2.f13191a
                java.lang.String r1 = r3.f13191a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.f13192b
                java.lang.String r1 = r3.f13192b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.f13193c
                java.lang.String r1 = r3.f13193c
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                org.json.JSONObject r0 = r2.f13194d
                org.json.JSONObject r3 = r3.f13194d
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4905l.C4906a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f13191a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f13192b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13193c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            JSONObject jSONObject = this.f13194d;
            if (jSONObject != null) {
                i = jSONObject.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(type=");
            sb.append(this.f13191a);
            sb.append(", content=");
            sb.append(this.f13192b);
            sb.append(", sender=");
            sb.append(this.f13193c);
            sb.append(", args=");
            sb.append(this.f13194d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$b */
    static final class C4907b extends C52712l implements C52671b<String, C52847n<? extends String, ? extends Object>> {

        /* renamed from: a */
        final /* synthetic */ JSONObject f13195a;

        C4907b(JSONObject jSONObject) {
            this.f13195a = jSONObject;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            return C52856t.m112465a(str, this.f13195a.get(str));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$c */
    static final class C4908c<T> implements C1715j<C5167am> {

        /* renamed from: a */
        final /* synthetic */ C4905l f13196a;

        /* renamed from: b */
        final /* synthetic */ C5195o f13197b;

        C4908c(C4905l lVar, C5195o oVar) {
            this.f13196a = lVar;
            this.f13197b = oVar;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            C5167am amVar = (C5167am) obj;
            C52711k.m112240b(amVar, "it");
            if (amVar.f13849a == this.f13197b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$d */
    static final class C4909d<T> implements C1710e<C5167am> {

        /* renamed from: a */
        final /* synthetic */ C4905l f13198a;

        /* renamed from: b */
        final /* synthetic */ C5195o f13199b;

        C4909d(C4905l lVar, C5195o oVar) {
            this.f13198a = lVar;
            this.f13199b = oVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((C5167am) obj).f13850b) {
                this.f13198a.finishWithSuccess();
            } else {
                this.f13198a.finishWithFailure();
            }
        }
    }

    public final void onTerminate() {
        this.f13190a.dispose();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void invoke(java.lang.Object r5, com.bytedance.ies.p675g.p677b.C10783f r6) {
        /*
            r4 = this;
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$a r5 = (com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4905l.C4906a) r5
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r6 = r5.f13193c
            if (r6 != 0) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            int r0 = r6.hashCode()
            r1 = 354670409(0x1523d749, float:3.3087418E-26)
            if (r0 == r1) goto L_0x001b
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "lottery"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0026
            com.bytedance.android.livesdk.chatroom.event.o$a r6 = com.bytedance.android.livesdk.chatroom.event.C5195o.C5196a.Lottery
            goto L_0x0028
        L_0x0026:
            com.bytedance.android.livesdk.chatroom.event.o$a r6 = com.bytedance.android.livesdk.chatroom.event.C5195o.C5196a.Unknown
        L_0x0028:
            org.json.JSONObject r0 = r5.f13194d
            if (r0 == 0) goto L_0x004a
            java.util.Iterator r1 = r0.keys()
            java.lang.String r2 = "keys()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            d.l.g r1 = p2628d.p2649l.C52786h.m112336a(r1)
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$b r2 = new com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$b
            r2.<init>(r0)
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            d.l.g r0 = p2628d.p2649l.C52786h.m112348d(r1, r2)
            java.util.Map r0 = p2628d.p2629a.C52550ab.m112046a(r0)
            if (r0 != 0) goto L_0x004e
        L_0x004a:
            java.util.Map r0 = p2628d.p2629a.C52550ab.m112045a()
        L_0x004e:
            java.lang.String r1 = r5.f13191a
            int r2 = r1.hashCode()
            r3 = -333150752(0xffffffffec2485e0, float:-7.955842E26)
            if (r2 == r3) goto L_0x0070
            r3 = 3556653(0x36452d, float:4.983932E-39)
            if (r2 != r3) goto L_0x00b9
            java.lang.String r2 = "text"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00b9
            com.bytedance.android.livesdk.chatroom.event.an r1 = new com.bytedance.android.livesdk.chatroom.event.an
            java.lang.String r5 = r5.f13192b
            r1.<init>(r5, r6, r0)
            com.bytedance.android.livesdk.chatroom.event.o r1 = (com.bytedance.android.livesdk.chatroom.event.C5195o) r1
            goto L_0x0081
        L_0x0070:
            java.lang.String r2 = "barrage"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00b9
            com.bytedance.android.livesdk.chatroom.event.al r1 = new com.bytedance.android.livesdk.chatroom.event.al
            java.lang.String r5 = r5.f13192b
            r1.<init>(r5, r6, r0)
            com.bytedance.android.livesdk.chatroom.event.o r1 = (com.bytedance.android.livesdk.chatroom.event.C5195o) r1
        L_0x0081:
            com.bytedance.android.livesdk.aa.a r5 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.am> r6 = com.bytedance.android.livesdk.chatroom.event.C5167am.class
            c.a.v r6 = r5.mo10300a(r6)
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$c r0 = new com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$c
            r0.<init>(r4, r1)
            c.a.d.j r0 = (p064c.p065a.p071d.C1715j) r0
            c.a.v r6 = r6.mo6522a(r0)
            c.a.e.e.d.p r0 = new c.a.e.e.d.p
            r2 = 0
            r0.<init>(r6, r2)
            c.a.n r6 = p064c.p065a.p090h.C2150a.m6484a(r0)
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$d r0 = new com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$d
            r0.<init>(r4, r1)
            c.a.d.e r0 = (p064c.p065a.p071d.C1710e) r0
            c.a.d.e<java.lang.Throwable> r2 = p064c.p065a.p072e.p074b.C1723a.f5847f
            c.a.d.a r3 = p064c.p065a.p072e.p074b.C1723a.f5844c
            c.a.b.c r6 = r6.mo6481a(r0, r2, r3)
            c.a.b.b r0 = r4.f13190a
            r0.mo6181a(r6)
            r5.mo10301a(r1)
            return
        L_0x00b9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "unsupported comment type"
            r5.<init>(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4905l.invoke(java.lang.Object, com.bytedance.ies.g.b.f):void");
    }
}
