package com.p683ss.android.ugc.aweme.location;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.location.C36266j.C36267a;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.location.u */
public final class C36285u implements C36284t {

    /* renamed from: b */
    public static final C52668f f92880b = C52732g.m112286a(C52757k.SYNCHRONIZED, C36287b.f92884a);

    /* renamed from: c */
    public static final C36286a f92881c = new C36286a(null);

    /* renamed from: a */
    public C36266j f92882a;

    /* renamed from: com.ss.android.ugc.aweme.location.u$a */
    public static final class C36286a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f92883a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C36286a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/location/SimpleLocationHelper;"))};

        private C36286a() {
        }

        /* renamed from: a */
        public static C36285u m81925a() {
            return (C36285u) C36285u.f92880b.getValue();
        }

        public /* synthetic */ C36286a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m81927a(Context context) {
            return C36266j.f92833d.mo75090a(context);
        }

        /* renamed from: a */
        public static void m81926a(Activity activity, C47939a aVar) {
            if (activity != null) {
                C36267a.m81887a(activity, aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.location.u$b */
    static final class C36287b extends C52712l implements C52670a<C36285u> {

        /* renamed from: a */
        public static final C36287b f92884a = new C36287b();

        C36287b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C36285u(null);
        }
    }

    private C36285u() {
    }

    /* renamed from: a */
    public static final boolean m81919a(Context context) {
        return C36286a.m81927a(context);
    }

    /* renamed from: d */
    public final void mo75089d() {
        C36266j jVar = this.f92882a;
        if (jVar != null) {
            jVar.mo75089d();
        }
    }

    /* renamed from: a */
    public final C36282r mo75118a() {
        C36266j jVar = this.f92882a;
        if (jVar != null) {
            return jVar.mo75084a();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo75121b() {
        C36266j jVar = this.f92882a;
        if (jVar != null) {
            jVar.mo75087b();
        }
    }

    public /* synthetic */ C36285u(C52707g gVar) {
        this();
    }

    /* renamed from: b */
    public final C36282r mo75120b(C36265i iVar) {
        C36266j jVar = this.f92882a;
        if (jVar != null) {
            return jVar.mo75085a(iVar);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo75119a(C36265i iVar) {
        C52711k.m112240b(iVar, "locationCallback");
        C36266j jVar = this.f92882a;
        if (jVar != null) {
            C52711k.m112240b(iVar, "locationCallback");
            if (jVar.mo75088c()) {
                synchronized (jVar.f92834a) {
                    C52575l.m112110a((List) jVar.f92834a, (C52671b) new C36270b(jVar, iVar));
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m81918a(Activity activity, C47939a aVar) {
        if (activity != null) {
            C36267a.m81889b(activity, aVar);
        }
    }
}
