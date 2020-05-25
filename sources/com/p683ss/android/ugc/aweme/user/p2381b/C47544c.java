package com.p683ss.android.ugc.aweme.user.p2381b;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.C23860bm;
import com.p683ss.android.ugc.aweme.C24514cb;
import com.p683ss.android.ugc.aweme.account.network.C22077a;
import com.p683ss.android.ugc.aweme.user.C47557d;
import com.ss.android.ugc.trill.R;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.user.b.c */
public final class C47544c {

    /* renamed from: a */
    public static final C47544c f119959a = new C47544c();

    /* renamed from: com.ss.android.ugc.aweme.user.b.c$a */
    public static final class C47545a<T, R> implements C1711f<String, C53694b<C47543b>> {

        /* renamed from: a */
        public static final C47545a f119960a = new C47545a();

        C47545a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C52711k.m112240b(str, "response");
            return new C53694b<C47543b>() {
                /* renamed from: a */
                public final void mo336a(C53695c<? super C47543b> cVar) {
                    C22077a a = C24514cb.m59920a();
                    C52711k.m112236a((Object) a, "UserModuleStore.getNetworkProxy()");
                    cVar.onNext((C47543b) a.mo46183a().mo34884a(str, C47543b.class));
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.b.c$b */
    public static final class C47547b<T> implements C1710e<C47543b> {

        /* renamed from: a */
        final /* synthetic */ C23860bm f119962a;

        public C47547b(C23860bm bmVar) {
            this.f119962a = bmVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r4) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.user.b.b r4 = (com.p683ss.android.ugc.aweme.user.p2381b.C47543b) r4
                r0 = 0
                if (r4 == 0) goto L_0x0008
                java.lang.String r1 = r4.f119957a
                goto L_0x0009
            L_0x0008:
                r1 = r0
            L_0x0009:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r2 = "success"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x0031
                if (r4 == 0) goto L_0x0024
                com.ss.android.ugc.aweme.user.b.a r4 = r4.f119958b
                if (r4 == 0) goto L_0x0024
                java.lang.Boolean r4 = r4.f119954a
                if (r4 == 0) goto L_0x0024
                boolean r4 = r4.booleanValue()
                goto L_0x0025
            L_0x0024:
                r4 = 0
            L_0x0025:
                com.p683ss.android.ugc.aweme.user.p2381b.C47544c.m102972a(r4)
                com.ss.android.ugc.aweme.bm r0 = r3.f119962a
                if (r0 == 0) goto L_0x0030
                r0.mo45352a(r4)
                goto L_0x0041
            L_0x0030:
                return
            L_0x0031:
                com.ss.android.ugc.aweme.bm r1 = r3.f119962a
                if (r1 == 0) goto L_0x0041
                if (r4 == 0) goto L_0x003d
                com.ss.android.ugc.aweme.user.b.a r4 = r4.f119958b
                if (r4 == 0) goto L_0x003d
                java.lang.String r0 = r4.f119955b
            L_0x003d:
                r1.mo45351a(r0)
                return
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.user.p2381b.C47544c.C47547b.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.b.c$c */
    public static final class C47548c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C23860bm f119963a;

        public C47548c(C23860bm bmVar) {
            this.f119963a = bmVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C23860bm bmVar = this.f119963a;
            if (bmVar != null) {
                bmVar.mo45351a(C24514cb.m59923b().getString(R.string.c28));
            }
        }
    }

    private C47544c() {
    }

    /* renamed from: a */
    public static final void m102972a(boolean z) {
        Keva repo = Keva.getRepo("password_status");
        StringBuilder sb = new StringBuilder();
        sb.append(C47557d.m102992f());
        sb.append("_password_set_status");
        repo.storeBoolean(sb.toString(), z);
    }
}
