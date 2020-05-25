package com.p683ss.android.ugc.aweme.p1807im;

import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.p */
public final class C33206p implements C41683a {

    /* renamed from: e */
    public static final C52668f f86196e = C52732g.m112286a(C52757k.SYNCHRONIZED, C33208b.f86203a);

    /* renamed from: f */
    public static final C33207a f86197f = new C33207a(null);

    /* renamed from: a */
    public boolean f86198a;

    /* renamed from: b */
    public boolean f86199b;

    /* renamed from: c */
    public boolean f86200c;

    /* renamed from: d */
    public boolean f86201d;

    /* renamed from: com.ss.android.ugc.aweme.im.p$a */
    public static final class C33207a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f86202a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33207a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/im/NotificationManager;"))};

        private C33207a() {
        }

        /* renamed from: a */
        public static C33206p m76310a() {
            return (C33206p) C33206p.f86196e.getValue();
        }

        public /* synthetic */ C33207a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.p$b */
    static final class C33208b extends C52712l implements C52670a<C33206p> {

        /* renamed from: a */
        public static final C33208b f86203a = new C33208b();

        C33208b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C33206p(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.p$c */
    static final class C33209c<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33206p f86204a;

        /* renamed from: b */
        final /* synthetic */ boolean f86205b;

        C33209c(C33206p pVar, boolean z) {
            this.f86204a = pVar;
            this.f86205b = z;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C33200k.m76279d().showIMNotification(Boolean.valueOf(true));
            this.f86204a.f86201d = this.f86205b;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.p$d */
    static final class C33210d<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33206p f86206a;

        C33210d(C33206p pVar) {
            this.f86206a = pVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C33200k.m76279d().showIMNotification(Boolean.valueOf(this.f86206a.f86200c));
            this.f86206a.f86200c = false;
            return C52860x.f131107a;
        }
    }

    private C33206p() {
    }

    /* renamed from: c */
    public static final C33206p m76303c() {
        return C33207a.m76310a();
    }

    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return false;
    }

    /* renamed from: b */
    public static void m76302b() {
        C33200k.m76279d().clearIMNotification();
    }

    public /* synthetic */ C33206p(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final void mo70458a(Integer num) {
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        this.f86198a = z;
    }

    /* renamed from: a */
    public final void mo70457a(long j) {
        C0013i.m12a(500).mo20a((C0011g<TResult, TContinuationResult>) new C33210d<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo47082a(C41686c cVar) {
        boolean z;
        C52711k.m112240b(cVar, "settings");
        boolean z2 = false;
        if (cVar.f105498n == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f86198a = z;
        if (cVar.f105495k == 1) {
            z2 = true;
        }
        this.f86199b = z2;
    }

    /* renamed from: a */
    public final void mo70459a(boolean z) {
        if (!z) {
            C0013i.m12a(500).mo20a((C0011g<TResult, TContinuationResult>) new C33209c<TResult,TContinuationResult>(this, z), C0013i.f25b);
        } else {
            this.f86201d = z;
        }
    }
}
