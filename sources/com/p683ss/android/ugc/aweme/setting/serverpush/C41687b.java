package com.p683ss.android.ugc.aweme.setting.serverpush;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p683ss.android.ugc.aweme.browserecord.C24029g;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.C27021a;
import com.p683ss.android.ugc.aweme.familiar.p1699a.C29638e;
import com.p683ss.android.ugc.aweme.feed.utils.C31211t;
import com.p683ss.android.ugc.aweme.p1807im.C33203m;
import com.p683ss.android.ugc.aweme.p1807im.C33206p.C33207a;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.protection.C40836a;
import com.p683ss.android.ugc.aweme.protection.C40877e;
import com.p683ss.android.ugc.aweme.setting.p2134c.C41590a;
import com.p683ss.android.ugc.aweme.setting.p2138g.C41608a;
import com.p683ss.android.ugc.aweme.setting.p2148ui.WhoCanSeeMyLikeListActivity;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41700e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53219ap;
import kotlinx.coroutines.C53225av;
import kotlinx.coroutines.C53256be;
import kotlinx.coroutines.C53342j;
import kotlinx.coroutines.C53343k;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b */
public final class C41687b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f105512a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C41687b.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;"))};

    /* renamed from: b */
    public static final C41687b f105513b = new C41687b();

    /* renamed from: c */
    private static List<C41683a> f105514c = new ArrayList();

    /* renamed from: d */
    private static C41683a f105515d;

    /* renamed from: e */
    private static boolean f105516e = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: f */
    private static final C52668f f105517f = C52732g.m112285a(C41689b.f105520a);

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b$a */
    static final class C41688a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C41683a f105518a;

        /* renamed from: b */
        final /* synthetic */ C41686c f105519b;

        C41688a(C41683a aVar, C41686c cVar) {
            this.f105518a = aVar;
            this.f105519b = cVar;
        }

        public final /* synthetic */ Object call() {
            this.f105518a.mo47082a(this.f105519b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b$b */
    static final class C41689b extends C52712l implements C52670a<C41700e> {

        /* renamed from: a */
        public static final C41689b f105520a = new C41689b();

        C41689b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C41700e eVar = new C41700e();
            eVar.mo54800a(new C41693b() {
                /* renamed from: a */
                public final void mo55281a(C41686c cVar) {
                    C52711k.m112240b(cVar, "settings");
                    C41687b.m91547a(cVar);
                }

                /* renamed from: e_ */
                public final void mo55285e_(Exception exc) {
                    C52711k.m112240b(exc, "e");
                    C41687b.m91550a(exc);
                }
            });
            return eVar;
        }
    }

    @C52618f(mo110254b = "PushSettingsManager.kt", mo110255c = {117}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.setting.serverpush.PushSettingsManager$syncPUshSettingData$1")
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b$c */
    static final class C41691c extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f105521a;

        /* renamed from: b */
        int f105522b;

        /* renamed from: c */
        final /* synthetic */ C41683a f105523c;

        /* renamed from: d */
        private C53199ae f105524d;

        C41691c(C41683a aVar, C52625c cVar) {
            this.f105523c = aVar;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C41691c cVar2 = new C41691c(this.f105523c, cVar);
            cVar2.f105524d = (C53199ae) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C41691c) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object a = C52601b.m112157a();
            switch (this.f105522b) {
                case 0:
                    C53199ae aeVar = this.f105524d;
                    long millis = TimeUnit.SECONDS.toMillis(1);
                    this.f105521a = aeVar;
                    this.f105522b = 1;
                    if (millis <= 0) {
                        obj2 = C52860x.f131107a;
                    } else {
                        C53343k kVar = new C53343k(C52601b.m112154a(this), 1);
                        C53342j jVar = kVar;
                        C53219ap.m113057a(jVar.getContext()).mo110784a(millis, jVar);
                        obj2 = kVar.mo110937b();
                        if (obj2 == C52601b.m112157a()) {
                            C52620h.m112171b(this);
                        }
                    }
                    if (obj2 == a) {
                        return a;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C41687b.f105513b.mo85532a(this.f105523c, true);
            return C52860x.f131107a;
        }
    }

    private C41687b() {
    }

    /* renamed from: a */
    private final C41700e m91546a() {
        return (C41700e) f105517f.getValue();
    }

    static {
        m91548a((C41683a) new C31211t());
        Object commentFilterPushSettingCallback = C27021a.f71325a.getCommentFilterPushSettingCallback();
        if (!(commentFilterPushSettingCallback instanceof C41683a)) {
            commentFilterPushSettingCallback = null;
        }
        C41683a aVar = (C41683a) commentFilterPushSettingCallback;
        if (aVar != null) {
            m91548a(aVar);
        }
        m91548a(WhoCanSeeMyLikeListActivity.f105987e);
        m91548a((C41683a) ParentalPlatformManager.f60890c);
        m91548a((C41683a) C41608a.f105333a);
        m91548a((C41683a) C33207a.m76310a());
        m91548a((C41683a) C29638e.f77491b);
        m91548a((C41683a) new C41590a());
        m91548a((C41683a) C40877e.f104050a);
        m91548a((C41683a) C40836a.f103981a);
        m91548a((C41683a) C24029g.f63762a);
        Object pushSettingCallback = C40733z.f103767a.getPushSettingCallback();
        if (!(pushSettingCallback instanceof C41683a)) {
            pushSettingCallback = null;
        }
        C41683a aVar2 = (C41683a) pushSettingCallback;
        if (aVar2 != null) {
            m91548a(aVar2);
        }
        m91548a((C41683a) new C33203m());
        if (C18920g.m46048a(C11010c.m22280a())) {
        }
    }

    /* renamed from: a */
    private static void m91548a(C41683a aVar) {
        f105514c.add(aVar);
    }

    /* renamed from: a */
    public static void m91547a(C41686c cVar) {
        C52711k.m112240b(cVar, "settings");
        for (C41683a aVar : f105514c) {
            if (!f105516e || !aVar.mo47084a()) {
                aVar.mo47082a(cVar);
            } else {
                C0013i.m16a((Callable<TResult>) new C41688a<TResult>(aVar, cVar));
            }
        }
        C41683a aVar2 = f105515d;
        if (aVar2 != null) {
            aVar2.mo47082a(cVar);
        }
        f105515d = null;
    }

    /* renamed from: a */
    public static void m91550a(Exception exc) {
        for (C41683a a : f105514c) {
            a.mo47083a(exc);
        }
        C41683a aVar = f105515d;
        if (aVar != null) {
            aVar.mo47083a(exc);
        }
        f105515d = null;
    }

    /* renamed from: a */
    public final void mo85532a(C41683a aVar, boolean z) {
        f105515d = aVar;
        try {
            m91546a().mo44934a_(new Object[0]);
        } catch (Exception unused) {
            if (!z) {
                C53301g.m113291a(C53256be.f131885a, C53225av.m113074b(), null, new C41691c(aVar, null), 2, null);
            } else {
                m91550a(new Exception());
            }
        }
    }
}
