package com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.commercialize.C25732e;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1581b.C26413b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.concurrent.Callable;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.f */
public class C26339f extends C26333a {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f69520g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26339f.class), "intent", "getIntent()Landroid/content/Intent;"))};

    /* renamed from: h */
    public static final C26340a f69521h = new C26340a(null);

    /* renamed from: a */
    private final C52668f f69522a = C52732g.m112285a(new C26343d(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.f$a */
    public static final class C26340a {
        private C26340a() {
        }

        public /* synthetic */ C26340a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.f$b */
    static final class C26341b extends C52712l implements C52671b<C26413b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C26339f f69523a;

        /* renamed from: b */
        final /* synthetic */ String f69524b;

        C26341b(C26339f fVar, String str) {
            this.f69523a = fVar;
            this.f69524b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C26413b bVar = (C26413b) obj;
            C52711k.m112240b(bVar, "$receiver");
            bVar.f69668b = this.f69523a.mo54083d().f69470a.f69478b;
            bVar.f69669c = this.f69523a.mo54083d().f69470a.f69479c;
            bVar.f69670d = this.f69523a.mo54083d().f69470a.f69480d;
            bVar.f69667a = this.f69524b;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.f$c */
    static final class C26342c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C26339f f69525a;

        C26342c(C26339f fVar) {
            this.f69525a = fVar;
        }

        public final /* synthetic */ Object call() {
            try {
                C25732e a = C25732e.m62287a();
                C52711k.m112236a((Object) a, "CommercializeManager.getInstance()");
                a.f68051a = this.f69525a.mo54083d().f69470a.f69477a;
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.f$d */
    static final class C26343d extends C52712l implements C52670a<Intent> {

        /* renamed from: a */
        final /* synthetic */ C26339f f69526a;

        C26343d(C26339f fVar) {
            this.f69526a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.f69526a.mo54083d().f69472c.f69499a));
            intent.putExtra(C23060d.f61428b, this.f69526a.mo54083d().f69472c.f69499a);
            return intent;
        }
    }

    /* renamed from: e */
    private final Intent m63770e() {
        return (Intent) this.f69522a.getValue();
    }

    /* renamed from: a */
    public final boolean mo54084a() {
        if (!mo54083d().f69472c.f69500b && !TextUtils.isEmpty(mo54083d().f69472c.f69499a)) {
            return C18920g.m46049a(mo54082c(), m63770e());
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54085b() {
        /*
            r15 = this;
            android.content.Intent r0 = r15.m63770e()
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r15.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$f r1 = r1.f69472c
            java.lang.String r2 = r1.f69499a
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r15.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$f r1 = r1.f69472c
            java.lang.String r1 = r1.f69501c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r15.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$d r1 = r1.f69474e
            java.lang.String r1 = r1.f69495a
            goto L_0x002d
        L_0x0025:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r15.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$f r1 = r1.f69472c
            java.lang.String r1 = r1.f69501c
        L_0x002d:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r3 = r15.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$f r3 = r3.f69472c
            boolean r3 = r3.f69502d
            r4 = 2
            r5 = 0
            r8 = 0
            if (r3 == 0) goto L_0x00ab
            r3 = 1
            if (r2 == 0) goto L_0x004c
            r6 = r2
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r7 = "__back_url__"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r4 = p2628d.p2650m.C52830p.m112456b(r6, r7, r5, r4, r8)
            if (r4 != r3) goto L_0x004c
            r4 = 1
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            if (r4 == 0) goto L_0x008f
            if (r1 == 0) goto L_0x0075
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x005b
            r5 = 1
        L_0x005b:
            if (r5 != r3) goto L_0x0075
            android.net.Uri r3 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r4 = "tag"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r1)
            android.net.Uri r3 = r3.build()
            java.lang.String r3 = r3.toString()
            r9 = r3
            goto L_0x0076
        L_0x0075:
            r9 = r2
        L_0x0076:
            if (r9 == 0) goto L_0x008d
            java.lang.String r10 = "__back_url__"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.commercialize.utils.p1581b.C26411a.f69663a
            java.lang.String r11 = android.net.Uri.encode(r3)
            java.lang.String r3 = "Uri.encode(ADX_DEEP_LINK)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r3)
            r12 = 0
            r13 = 4
            r14 = 0
            java.lang.String r3 = p2628d.p2650m.C52830p.m112401a(r9, r10, r11, r12, r13, r14)
            goto L_0x0090
        L_0x008d:
            r3 = r8
            goto L_0x0090
        L_0x008f:
            r3 = r2
        L_0x0090:
            if (r3 != 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r2 = r3
        L_0x0094:
            com.ss.android.ugc.aweme.commercialize.utils.b.b$a r3 = new com.ss.android.ugc.aweme.commercialize.utils.b.b$a
            r3.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.a.f$b r4 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.f$b
            r4.<init>(r15, r1)
            d.f.a.b r4 = (p2628d.p2639f.p2640a.C52671b) r4
            com.ss.android.ugc.aweme.commercialize.utils.bl r1 = r3.mo54142a(r4)
            T r1 = r1.f69675a
            com.ss.android.ugc.aweme.commercialize.utils.b.b r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1581b.C26413b) r1
            com.p683ss.android.ugc.aweme.commercialize.utils.p1581b.C26411a.f69664b = r1
            goto L_0x00ed
        L_0x00ab:
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r6 = "__back_url__"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r3, r6, r5, r4, r8)
            if (r3 == 0) goto L_0x00ed
            java.lang.String r3 = com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25653a.f67876a
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r4 = "tag"
            android.net.Uri$Builder r1 = r3.appendQueryParameter(r4, r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Uri.parse(CommercializeC…              .toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.String r3 = "__back_url__"
            java.lang.String r4 = android.net.Uri.encode(r1)
            java.lang.String r1 = "Uri.encode(backUrl)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r1)
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r2 = p2628d.p2650m.C52830p.m112401a(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.f$c r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.f$c
            r1.<init>(r15)
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            p001a.C0013i.m16a(r1)
        L_0x00ed:
            android.net.Uri r1 = android.net.Uri.parse(r2)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r15.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r2 = r2.f69470a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f69477a
            if (r2 == 0) goto L_0x0100
            java.lang.String r2 = r2.getAid()
            goto L_0x0101
        L_0x0100:
            r2 = r8
        L_0x0101:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0125
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r2 = "source_aid"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r3 = r15.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r3 = r3.f69470a
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f69477a
            if (r3 == 0) goto L_0x011d
            java.lang.String r8 = r3.getAid()
        L_0x011d:
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r8)
            android.net.Uri r1 = r1.build()
        L_0x0125:
            r0.setData(r1)
            android.content.Context r1 = r15.mo54082c()
            boolean r0 = m63755a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26339f.mo54085b():boolean");
    }
}
