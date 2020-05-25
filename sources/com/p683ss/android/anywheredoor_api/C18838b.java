package com.p683ss.android.anywheredoor_api;

import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.anywheredoor_api.b */
public final class C18838b {

    /* renamed from: b */
    public static final C52668f f52016b = C52732g.m112286a(C52757k.SYNCHRONIZED, C18840b.f52020a);

    /* renamed from: c */
    public static final C18839a f52017c = new C18839a(null);

    /* renamed from: a */
    public IAnyWhereDoor f52018a;

    /* renamed from: com.ss.android.anywheredoor_api.b$a */
    public static final class C18839a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f52019a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C18839a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/anywheredoor_api/AnyWhereServiceManager;"))};

        private C18839a() {
        }

        /* renamed from: a */
        public static C18838b m45927a() {
            return (C18838b) C18838b.f52016b.getValue();
        }

        public /* synthetic */ C18839a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.anywheredoor_api.b$b */
    static final class C18840b extends C52712l implements C52670a<C18838b> {

        /* renamed from: a */
        public static final C18840b f52020a = new C18840b();

        C18840b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C18838b(null);
        }
    }

    private C18838b() {
    }

    /* renamed from: a */
    public final IAnyWhereDoor mo38460a() {
        IAnyWhereDoor iAnyWhereDoor = this.f52018a;
        if (iAnyWhereDoor == null) {
            C52711k.m112237a("outService");
        }
        return iAnyWhereDoor;
    }

    public /* synthetic */ C18838b(C52707g gVar) {
        this();
    }
}
