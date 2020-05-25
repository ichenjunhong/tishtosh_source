package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.UserActiveStatusConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.UserActiveStatusConfigSettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34883a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34884b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1879b.C34891a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1879b.C34895b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1880c.C34898a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.b */
public final class C34886b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89855a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34886b.class), "globalConfig", "getGlobalConfig()Lcom/ss/android/ugc/aweme/im/sdk/relations/core/active/model/UserActiveStatusGlobalConfig;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34886b.class), "statusReporter", "getStatusReporter()Lcom/ss/android/ugc/aweme/im/sdk/relations/core/active/internal/UserActiveStatusReporter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34886b.class), "statusRepository", "getStatusRepository()Lcom/ss/android/ugc/aweme/im/sdk/relations/core/active/internal/UserActiveStatusRepository;"))};

    /* renamed from: b */
    public static final C34886b f89856b = new C34886b();

    /* renamed from: c */
    private static final C52668f f89857c = C52732g.m112285a(C34887a.f89860a);

    /* renamed from: d */
    private static final C52668f f89858d = C52732g.m112285a(C34889c.f89862a);

    /* renamed from: e */
    private static final C52668f f89859e = C52732g.m112285a(C34890d.f89863a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.b$a */
    static final class C34887a extends C52712l implements C52670a<C34898a> {

        /* renamed from: a */
        public static final C34887a f89860a = new C34887a();

        C34887a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C34898a aVar = new C34898a();
            C35284t a = C35284t.m79782a();
            C52711k.m112236a((Object) a, "IMSPUtils.get()");
            aVar.f89875a = a.mo73377C();
            aVar.f89876b = C33229c.f86227e.mo70572e();
            UserActiveStatusConfig value = UserActiveStatusConfigSettings.INSTANCE.getValue();
            C52711k.m112240b(value, "<set-?>");
            aVar.f89877c = value;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.b$b */
    public static final class C34888b<V> implements Callable<C52860x> {

        /* renamed from: a */
        public static final C34888b f89861a = new C34888b();

        C34888b() {
        }

        public final /* synthetic */ Object call() {
            C34886b.f89856b.mo73003a(true);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.b$c */
    static final class C34889c extends C52712l implements C52670a<C34891a> {

        /* renamed from: a */
        public static final C34889c f89862a = new C34889c();

        C34889c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C34891a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.b$d */
    static final class C34890d extends C52712l implements C52670a<C34895b> {

        /* renamed from: a */
        public static final C34890d f89863a = new C34890d();

        C34890d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C34895b();
        }
    }

    private C34886b() {
    }

    /* renamed from: d */
    private final C34895b m78990d() {
        return (C34895b) f89859e.getValue();
    }

    /* renamed from: a */
    public final C34898a mo73002a() {
        return (C34898a) f89857c.getValue();
    }

    /* renamed from: b */
    public final C34891a mo73004b() {
        return (C34891a) f89858d.getValue();
    }

    /* renamed from: c */
    public static final boolean m78989c() {
        if (C35279p.m79763a()) {
            return false;
        }
        return f89856b.mo73002a().mo73012b();
    }

    /* renamed from: a */
    public static final C52847n<Boolean, String> m78988a(long j) {
        if (!C35279p.m79763a()) {
            f89856b.mo73002a().mo73012b();
        }
        return new C52847n<>(Boolean.valueOf(false), null);
    }

    /* renamed from: a */
    public final void mo73003a(boolean z) {
        mo73004b().mo73007a(mo73002a(), z);
        m78990d().mo73010a(mo73002a());
    }

    /* renamed from: a */
    public static final C34879a m78987a(C34884b bVar, Set<IMUser> set, C34883a aVar) {
        Object obj;
        boolean z;
        C52711k.m112240b(bVar, "fetchScene");
        C52711k.m112240b(aVar, "callback");
        StringBuilder sb = new StringBuilder("UserActiveStatusManager fetchUserActiveStatus user: ");
        sb.append(bVar.getValue());
        sb.append(", ");
        if (set != null) {
            obj = Integer.valueOf(set.size());
        } else {
            obj = null;
        }
        sb.append(obj);
        sb.append(", ");
        sb.append(f89856b.mo73002a());
        C32458a.m75144a(sb.toString());
        if (C35279p.m79763a()) {
            aVar.mo70689c_(new IllegalStateException("Only enabled in CN"));
            return null;
        }
        Collection collection = set;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.mo70689c_(new IllegalArgumentException("Friend list cannot be empty"));
            return null;
        }
        f89856b.mo73002a().mo73012b();
        aVar.mo70689c_(new IllegalStateException("User active fetch disabled"));
        return null;
    }
}
