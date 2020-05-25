package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34044o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34879a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34883a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel */
public final class SessionListUserActiveViewModel extends C0209x implements C0183j, C34883a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89090a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SessionListUserActiveViewModel.class), "userActiveStatusLiveData", "getUserActiveStatusLiveData()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SessionListUserActiveViewModel.class), "updateSessionListTaskList", "getUpdateSessionListTaskList()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SessionListUserActiveViewModel.class), "lastSpotUidToSessionMap", "getLastSpotUidToSessionMap()Ljava/util/concurrent/ConcurrentHashMap;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SessionListUserActiveViewModel.class), "secUidToSessionIdMap", "getSecUidToSessionIdMap()Ljava/util/concurrent/ConcurrentHashMap;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SessionListUserActiveViewModel.class), "lastDisplayedUserActiveStatus", "getLastDisplayedUserActiveStatus()Ljava/util/Map;"))};

    /* renamed from: d */
    public static final C34558a f89091d = new C34558a(null);

    /* renamed from: b */
    public volatile boolean f89092b;

    /* renamed from: c */
    public C34879a f89093c;

    /* renamed from: e */
    private final C52668f f89094e = C52732g.m112285a(C34565h.f89107a);

    /* renamed from: f */
    private boolean f89095f;

    /* renamed from: g */
    private final C52668f f89096g = C52732g.m112285a(C34564g.f89106a);

    /* renamed from: h */
    private final C52668f f89097h = C52732g.m112285a(C34560c.f89101a);

    /* renamed from: i */
    private final C52668f f89098i = C52732g.m112285a(C34561d.f89102a);

    /* renamed from: j */
    private final C52668f f89099j = C52732g.m112285a(C34559b.f89100a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel$a */
    public static final class C34558a {
        private C34558a() {
        }

        public /* synthetic */ C34558a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static SessionListUserActiveViewModel m78500a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(SessionListUserActiveViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…iveViewModel::class.java)");
            return (SessionListUserActiveViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel$b */
    static final class C34559b extends C52712l implements C52670a<Map<String, C52847n<? extends Boolean, ? extends String>>> {

        /* renamed from: a */
        public static final C34559b f89100a = new C34559b();

        C34559b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel$c */
    static final class C34560c extends C52712l implements C52670a<ConcurrentHashMap<String, C52847n<? extends C35456b, ? extends Boolean>>> {

        /* renamed from: a */
        public static final C34560c f89101a = new C34560c();

        C34560c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel$d */
    static final class C34561d extends C52712l implements C52670a<ConcurrentHashMap<String, String>> {

        /* renamed from: a */
        public static final C34561d f89102a = new C34561d();

        C34561d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel$e */
    static final class C34562e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ SessionListUserActiveViewModel f89103a;

        /* renamed from: b */
        final /* synthetic */ List f89104b;

        C34562e(SessionListUserActiveViewModel sessionListUserActiveViewModel, List list) {
            this.f89103a = sessionListUserActiveViewModel;
            this.f89104b = list;
        }

        public final /* synthetic */ Object call() {
            this.f89103a.mo72625b().clear();
            Set linkedHashSet = new LinkedHashSet();
            for (C35456b bVar : this.f89104b) {
                long a = C11190e.m22685a(bVar.bm_());
                if (a > 0) {
                    IMUser a2 = C34010e.m77748a().mo71956a(String.valueOf(a), false);
                    boolean z = true;
                    if (a2 == null) {
                        this.f89103a.mo72625b().put(String.valueOf(a), new C52847n(bVar, Boolean.valueOf(true)));
                    } else if (a2.getFollowStatus() == 2) {
                        CharSequence secUid = a2.getSecUid();
                        if (!(secUid == null || secUid.length() == 0)) {
                            z = false;
                        }
                        if (!z && !C35265e.m79729a(a2.getUid())) {
                            Map c = this.f89103a.mo72626c();
                            String secUid2 = a2.getSecUid();
                            C52711k.m112236a((Object) secUid2, "user.secUid");
                            String bm_ = bVar.bm_();
                            C52711k.m112236a((Object) bm_, "chatSession.sessionID");
                            c.put(secUid2, bm_);
                            this.f89103a.mo72625b().put(String.valueOf(a), new C52847n(bVar, Boolean.valueOf(false)));
                            linkedHashSet.add(a2);
                        }
                    }
                }
            }
            return linkedHashSet;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel$f */
    static final class C34563f<TTaskResult, TContinuationResult> implements C0011g<Set<IMUser>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SessionListUserActiveViewModel f89105a;

        C34563f(SessionListUserActiveViewModel sessionListUserActiveViewModel) {
            this.f89105a = sessionListUserActiveViewModel;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r4) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel r0 = r3.f89105a
                r1 = 0
                r0.f89092b = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "SessionActiveViewModel updateSessionList taskResult: "
                r0.<init>(r2)
                java.lang.String r2 = "task"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r2)
                java.lang.Object r2 = r4.mo34e()
                java.util.Set r2 = (java.util.Set) r2
                int r2 = r2.size()
                r0.append(r2)
                java.lang.String r2 = ", "
                r0.append(r2)
                com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel r2 = r3.f89105a
                com.ss.android.ugc.aweme.im.sdk.relations.core.a.a r2 = r2.f89093c
                if (r2 == 0) goto L_0x0032
                com.ss.android.ugc.aweme.im.sdk.relations.core.a.a.b r2 = r2.f89845b
                if (r2 == 0) goto L_0x0032
                java.lang.String r2 = r2.getValue()
                goto L_0x0033
            L_0x0032:
                r2 = 0
            L_0x0033:
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
                java.lang.Object r0 = r4.mo34e()
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 == 0) goto L_0x004b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x004c
            L_0x004b:
                r1 = 1
            L_0x004c:
                if (r1 != 0) goto L_0x0081
                com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel r0 = r3.f89105a
                com.ss.android.ugc.aweme.im.sdk.relations.core.a.a r0 = r0.f89093c
                if (r0 != 0) goto L_0x0069
                com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel r0 = r3.f89105a
                com.ss.android.ugc.aweme.im.sdk.relations.core.a.a.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34884b.SESSION_PULL
                java.lang.Object r4 = r4.mo34e()
                java.util.Set r4 = (java.util.Set) r4
                com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel r2 = r3.f89105a
                com.ss.android.ugc.aweme.im.sdk.relations.core.a.a.a r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34883a) r2
                com.ss.android.ugc.aweme.im.sdk.relations.core.a.a r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b.m78987a(r1, r4, r2)
                r0.f89093c = r4
                goto L_0x0090
            L_0x0069:
                com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel r0 = r3.f89105a
                com.ss.android.ugc.aweme.im.sdk.relations.core.a.a r0 = r0.f89093c
                if (r0 != 0) goto L_0x0072
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0072:
                java.lang.Object r4 = r4.mo34e()
                java.lang.String r1 = "task.result"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r1)
                java.util.Set r4 = (java.util.Set) r4
                r0.mo72994a(r4)
                goto L_0x0090
            L_0x0081:
                java.lang.Exception r0 = r4.mo35f()
                if (r0 == 0) goto L_0x0090
                java.lang.Exception r4 = r4.mo35f()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r4)
            L_0x0090:
                com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel r4 = r3.f89105a
                r4.mo72628e()
                d.x r4 = p2628d.C52860x.f131107a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.SessionListUserActiveViewModel.C34563f.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel$g */
    static final class C34564g extends C52712l implements C52670a<List<List<C35456b>>> {

        /* renamed from: a */
        public static final C34564g f89106a = new C34564g();

        C34564g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListUserActiveViewModel$h */
    static final class C34565h extends C52712l implements C52670a<C23275b<Map<String, Long>>> {

        /* renamed from: a */
        public static final C34565h f89107a = new C34565h();

        C34565h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: a */
    public static final SessionListUserActiveViewModel m78491a(FragmentActivity fragmentActivity) {
        return C34558a.m78500a(fragmentActivity);
    }

    /* renamed from: f */
    private final List<List<C35456b>> m78493f() {
        return (List) this.f89096g.getValue();
    }

    /* renamed from: a */
    public final C23275b<Map<String, Long>> mo72624a() {
        return (C23275b) this.f89094e.getValue();
    }

    /* renamed from: b */
    public final ConcurrentHashMap<String, C52847n<C35456b, Boolean>> mo72625b() {
        return (ConcurrentHashMap) this.f89097h.getValue();
    }

    /* renamed from: c */
    public final ConcurrentHashMap<String, String> mo72626c() {
        return (ConcurrentHashMap) this.f89098i.getValue();
    }

    /* renamed from: d */
    public final Map<String, C52847n<Boolean, String>> mo72627d() {
        return (Map) this.f89099j.getValue();
    }

    public final void onCleared() {
        super.onCleared();
        C34879a aVar = this.f89093c;
        if (aVar != null) {
            aVar.mo72995a(true);
        }
        this.f89093c = null;
        C47718bf.m103291d(this);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onSessionListFragmentStop() {
        this.f89095f = true;
        mo72627d().clear();
        C34879a aVar = this.f89093c;
        if (aVar != null) {
            aVar.mo72995a(false);
        }
    }

    public SessionListUserActiveViewModel() {
        C47718bf.m103290c(this);
    }

    /* renamed from: e */
    public final void mo72628e() {
        StringBuilder sb = new StringBuilder("SessionActiveViewModel triggerNextSessionListUpdate: ");
        sb.append(this.f89092b);
        sb.append(", ");
        sb.append(m78493f().size());
        C32458a.m75144a(sb.toString());
        if (!this.f89092b && (!m78493f().isEmpty())) {
            List list = (List) m78493f().remove(m78493f().size() - 1);
            m78493f().clear();
            m78492a(list);
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onSessionListFragmentResume() {
        this.f89095f = false;
        C34879a aVar = this.f89093c;
        if (aVar != null) {
            aVar.mo72997c();
        }
        if (!this.f89092b) {
            if (!m78493f().isEmpty()) {
                mo72628e();
                return;
            }
            if (!mo72625b().isEmpty()) {
                Collection values = mo72625b().values();
                C52711k.m112236a((Object) values, "lastSpotUidToSessionMap.values");
                Iterable<C52847n> iterable = values;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (C52847n first : iterable) {
                    arrayList.add((C35456b) first.getFirst());
                }
                m78492a(C52575l.m112139e((Collection<? extends T>) (List) arrayList));
            }
        }
    }

    /* renamed from: c_ */
    public final void mo70689c_(Throwable th) {
        StringBuilder sb = new StringBuilder("SessionActiveViewModel onUserActiveStatusFetchError ");
        sb.append(th.getMessage());
        C32458a.m75144a(sb.toString());
        C32458a.m75148a(th);
    }

    /* renamed from: a */
    private void m78492a(List<C35456b> list) {
        List list2;
        boolean z;
        if (!C34886b.m78989c()) {
            C32458a.m75144a("SessionActiveViewModel updateSessionList fetch disabled");
            return;
        }
        Integer num = null;
        if (list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (((C35456b) next) instanceof C34567a) {
                    arrayList.add(next);
                }
            }
            list2 = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
        } else {
            list2 = null;
        }
        Collection collection = list2;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder("SessionActiveViewModel updateSessionList sessions empty: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            }
            sb.append(num);
            C32458a.m75144a(sb.toString());
        } else if (this.f89092b || this.f89095f) {
            m78493f().add(list2);
            StringBuilder sb2 = new StringBuilder("SessionActiveViewModel updateSessionList store update: ");
            sb2.append(this.f89092b);
            sb2.append(", ");
            sb2.append(this.f89095f);
            C32458a.m75144a(sb2.toString());
        } else {
            this.f89092b = true;
            C0013i.m16a((Callable<TResult>) new C34562e<TResult>(this, list2)).mo20a((C0011g<TResult, TContinuationResult>) new C34563f<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    @C53771m
    public final void onUserFetchedEvent(C34044o oVar) {
        boolean z;
        C52711k.m112240b(oVar, "event");
        StringBuilder sb = new StringBuilder("SessionActiveViewModel onUserFetchedEvent: ");
        sb.append(oVar.f88009a);
        sb.append(", ");
        sb.append(mo72625b().size());
        C32458a.m75144a(sb.toString());
        CharSequence charSequence = oVar.f88009a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && mo72625b().contains(oVar.f88009a)) {
            Object obj = mo72625b().get(oVar.f88009a);
            if (obj == null) {
                C52711k.m112234a();
            }
            if (((Boolean) ((C52847n) obj).getSecond()).booleanValue()) {
                Collection values = mo72625b().values();
                C52711k.m112236a((Object) values, "lastSpotUidToSessionMap.values");
                Iterable<C52847n> iterable = values;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (C52847n first : iterable) {
                    arrayList.add((C35456b) first.getFirst());
                }
                m78492a(C52575l.m112139e((Collection<? extends T>) (List) arrayList));
            }
        }
    }
}
