package com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33246f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.LivePushResponse;
import com.p683ss.android.ugc.aweme.p1807im.sdk.notification.p1873a.C34749a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35188ad;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.C35428b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35458i;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.C35462l;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.model.LivePushMessage;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import p001a.C0010f;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a */
public final class C34755a implements C27979p {

    /* renamed from: g */
    public static final C34755a f89518g = C34757b.f89532a;

    /* renamed from: h */
    public static final C34756a f89519h = new C34756a(null);

    /* renamed from: a */
    public final HashSet<String> f89520a;

    /* renamed from: b */
    public final Queue<C11207p> f89521b;

    /* renamed from: c */
    public final Map<String, Integer> f89522c;

    /* renamed from: d */
    public C34768c f89523d;

    /* renamed from: e */
    public boolean f89524e;

    /* renamed from: f */
    public boolean f89525f;

    /* renamed from: i */
    private final C35428b f89526i;

    /* renamed from: j */
    private final ArrayList<C11207p> f89527j;

    /* renamed from: k */
    private int f89528k;

    /* renamed from: l */
    private C0010f f89529l;

    /* renamed from: m */
    private boolean f89530m;

    /* renamed from: n */
    private boolean f89531n;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$a */
    public static final class C34756a {
        private C34756a() {
        }

        public /* synthetic */ C34756a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$b */
    static final class C34757b {

        /* renamed from: a */
        static final C34755a f89532a = new C34755a(null);

        /* renamed from: b */
        public static final C34757b f89533b = new C34757b();

        private C34757b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$c */
    static final class C34758c<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34755a f89534a;

        C34758c(C34755a aVar) {
            this.f89534a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f89534a.mo72827f();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$d */
    static final class C34759d<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34755a f89535a;

        C34759d(C34755a aVar) {
            this.f89535a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f89535a.mo72822a(1000);
            this.f89535a.f89524e = false;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$e */
    static final class C34760e<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34755a f89536a;

        C34760e(C34755a aVar) {
            this.f89536a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f89536a.mo72828g();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$f */
    static final class C34761f<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34755a f89537a;

        C34761f(C34755a aVar) {
            this.f89537a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C34767b bVar;
            boolean z;
            String string;
            C34755a aVar = this.f89537a;
            if (!aVar.f89521b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                HashSet hashSet = new HashSet();
                while (!aVar.f89521b.isEmpty()) {
                    C11207p pVar = (C11207p) aVar.f89521b.poll();
                    C52711k.m112236a((Object) pVar, "message");
                    if (hashSet.add(pVar.getConversationId()) && hashSet.size() < 3) {
                        if (pVar.getConversationType() == C11170a.f30115a) {
                            IMUser b = C34010e.m77748a().mo71964b(String.valueOf(pVar.getSender()));
                            if (b != null) {
                                sb.append(b.getDisplayName());
                                sb.append("、");
                            }
                        } else if (pVar.getConversationType() == C11170a.f30116b) {
                            C11180b a = C11182d.m22641a().mo20658a(pVar.getConversationId());
                            if (a != null) {
                                C11181c coreInfo = a.getCoreInfo();
                                if (coreInfo != null) {
                                    String name = coreInfo.getName();
                                    if (name != null) {
                                        sb.append(name);
                                        sb.append("、");
                                    }
                                }
                            }
                        }
                    }
                }
                if (sb.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sb.setLength(sb.length() - 1);
                }
                if (hashSet.size() > 1) {
                    string = C11010c.m22280a().getResources().getString(R.string.bfj, new Object[]{sb.toString()});
                } else {
                    string = C11010c.m22280a().getResources().getString(R.string.a18, new Object[]{sb.toString()});
                }
                bVar = new C34767b(1, null, null, null, null, C11010c.m22280a().getResources().getString(R.string.bef), string, null, null, null, false, 1950, null);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                C34768c cVar = this.f89537a.f89523d;
                if (cVar == null || !cVar.f89556a) {
                    this.f89537a.f89523d = null;
                    Activity i = C34755a.m78789i();
                    if (i != null) {
                        C34755a aVar2 = this.f89537a;
                        C34768c cVar2 = new C34768c(i);
                        cVar2.mo72836a(bVar);
                        aVar2.f89523d = cVar2;
                    }
                } else {
                    C34768c cVar3 = this.f89537a.f89523d;
                    if (cVar3 != null) {
                        cVar3.mo72836a(bVar);
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$g */
    static final class C34762g<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34755a f89538a;

        C34762g(C34755a aVar) {
            this.f89538a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f89538a.mo72827f();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$h */
    static final class C34763h<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34755a f89539a;

        C34763h(C34755a aVar) {
            this.f89539a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f89539a.mo72829h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$i */
    static final class C34764i<TTaskResult, TContinuationResult> implements C0011g<LivePushResponse, Void> {

        /* renamed from: a */
        final /* synthetic */ C34755a f89540a;

        C34764i(C34755a aVar) {
            this.f89540a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (iVar.mo26b() && iVar.mo34e() != null) {
                LivePushMessage data = ((LivePushResponse) iVar.mo34e()).getData();
                if (data != null) {
                    this.f89540a.f89525f = true;
                    this.f89540a.mo72823a(data);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$j */
    static final class C34765j<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34755a f89541a;

        /* renamed from: b */
        final /* synthetic */ LivePushMessage f89542b;

        C34765j(C34755a aVar, LivePushMessage livePushMessage) {
            this.f89541a = aVar;
            this.f89542b = livePushMessage;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f89541a.mo72823a(this.f89542b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$k */
    static final class C34766k<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34755a f89543a;

        C34766k(C34755a aVar) {
            this.f89543a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f89543a.mo72826e();
            return C52860x.f131107a;
        }
    }

    /* renamed from: c */
    public final void mo47074c() {
    }

    /* renamed from: b */
    public final void mo47072b() {
        this.f89531n = true;
        this.f89521b.clear();
    }

    /* renamed from: k */
    public final void mo72831k() {
        this.f89530m = false;
        this.f89527j.clear();
        this.f89529l.mo14c();
    }

    /* renamed from: i */
    public static Activity m78789i() {
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        if (f != null) {
            return f.getCurrentActivity();
        }
        return null;
    }

    /* renamed from: m */
    private final C34767b m78790m() {
        if (this.f89521b.isEmpty()) {
            return null;
        }
        C11207p pVar = (C11207p) this.f89521b.poll();
        C52711k.m112236a((Object) pVar, "message");
        return m78786a(pVar, false);
    }

    /* renamed from: o */
    private static boolean m78792o() {
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        if (f != null) {
            C35462l xrtcProxy = f.getXrtcProxy();
            if (xrtcProxy != null) {
                return xrtcProxy.mo73760a();
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo47070a() {
        this.f89531n = false;
        if (C33246f.f86254a.mo70589b() && (!this.f89527j.isEmpty())) {
            mo72822a(0);
        }
    }

    /* renamed from: l */
    public final boolean mo72832l() {
        boolean z;
        if (C35279p.m79763a()) {
            C35428b bVar = this.f89526i;
            if (bVar != null) {
                z = bVar.mo70327h();
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private static String m78793p() {
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
        C35458i liveProxy = f.getLiveProxy();
        C52711k.m112236a((Object) liveProxy, "AwemeImManager.instance().proxy.liveProxy");
        String b = liveProxy.mo73757b();
        C52711k.m112236a((Object) b, "AwemeImManager.instance(…veProxy.innerLivePushPage");
        return b;
    }

    /* renamed from: d */
    public final void mo72825d() {
        C35284t a = C35284t.m79782a();
        C52711k.m112236a((Object) a, "IMSPUtils.get()");
        this.f89528k = a.mo73445u();
        C35284t a2 = C35284t.m79782a();
        C52711k.m112236a((Object) a2, "IMSPUtils.get()");
        Set v = a2.mo73446v();
        if (v != null) {
            this.f89520a.addAll(v);
        }
    }

    /* renamed from: j */
    public final boolean mo72830j() {
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        if (f != null) {
            C35458i liveProxy = f.getLiveProxy();
            if (liveProxy != null && !liveProxy.mo73756a()) {
                return false;
            }
        }
        if (m78792o()) {
            return false;
        }
        return true;
    }

    private C34755a() {
        IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
        C52711k.m112236a((Object) provideIMService_Monster, "IMServiceManager.getServ…e(IIMService::class.java)");
        this.f89526i = provideIMService_Monster.getAbInterface();
        this.f89520a = new HashSet<>();
        this.f89521b = new LinkedBlockingDeque();
        this.f89527j = new ArrayList<>();
        this.f89522c = new LinkedHashMap();
        this.f89529l = new C0010f();
        mo72825d();
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        if (f != null) {
            f.registerAppStateCallback(this);
        }
    }

    /* renamed from: n */
    private final boolean m78791n() {
        Activity i = m78789i();
        if (i == null || TextUtils.equals(i.getLocalClassName(), "live.LivePlayActivity")) {
            return false;
        }
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        if (f != null && !f.canShowInnerNotification()) {
            return false;
        }
        C34004b a2 = C34004b.m77717a();
        C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
        C35460j f2 = a2.mo71949f();
        if ((f2 == null || !f2.isInPublishPage()) && !m78792o()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0.mo72838a() == true) goto L_0x001c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72826e() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r0 = r3.f89523d
            r1 = 1
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.f89556a
            if (r0 != r1) goto L_0x0013
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r0 = r3.f89523d
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.mo72838a()
            if (r0 == r1) goto L_0x001c
        L_0x0013:
            com.ss.android.ugc.aweme.im.sdk.notification.a.a r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.notification.p1873a.C34749a.f89481a
            r2 = 0
            boolean r0 = r0.mo72809a(r2)
            if (r0 == 0) goto L_0x002f
        L_0x001c:
            r0 = 5000(0x1388, double:2.4703E-320)
            a.i r0 = p001a.C0013i.m12a(r0)
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$k r1 = new com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$k
            r1.<init>(r3)
            a.g r1 = (p001a.C0011g) r1
            java.util.concurrent.Executor r2 = p001a.C0013i.f25b
            r0.mo20a(r1, r2)
            return
        L_0x002f:
            boolean r0 = r3.m78791n()
            if (r0 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.b r0 = r3.m78790m()
            if (r0 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r2 = r3.f89523d
            if (r2 == 0) goto L_0x004b
            boolean r2 = r2.f89556a
            if (r2 != r1) goto L_0x004b
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r1 = r3.f89523d
            if (r1 == 0) goto L_0x0060
            r1.mo72836a(r0)
            goto L_0x005f
        L_0x004b:
            r1 = 0
            r3.f89523d = r1
            android.app.Activity r1 = m78789i()
            if (r1 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r2 = new com.ss.android.ugc.aweme.im.sdk.notification.legacy.c
            r2.<init>(r1)
            r2.mo72836a(r0)
            r3.f89523d = r2
            goto L_0x0060
        L_0x005f:
            return
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34755a.mo72826e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0.mo72838a() == true) goto L_0x001c;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72828g() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r0 = r3.f89523d
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.f89556a
            r1 = 1
            if (r0 != r1) goto L_0x0013
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r0 = r3.f89523d
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.mo72838a()
            if (r0 == r1) goto L_0x001c
        L_0x0013:
            com.ss.android.ugc.aweme.im.sdk.notification.a.a r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.notification.p1873a.C34749a.f89481a
            r1 = 0
            boolean r0 = r0.mo72809a(r1)
            if (r0 == 0) goto L_0x002f
        L_0x001c:
            r0 = 5000(0x1388, double:2.4703E-320)
            a.i r0 = p001a.C0013i.m12a(r0)
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$e r1 = new com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$e
            r1.<init>(r3)
            a.g r1 = (p001a.C0011g) r1
            java.util.concurrent.Executor r2 = p001a.C0013i.f25b
            r0.mo20a(r1, r2)
            return
        L_0x002f:
            boolean r0 = m78792o()
            if (r0 == 0) goto L_0x0036
            return
        L_0x0036:
            r0 = 500(0x1f4, double:2.47E-321)
            a.i r0 = p001a.C0013i.m12a(r0)
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$f r1 = new com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$f
            r1.<init>(r3)
            a.g r1 = (p001a.C0011g) r1
            java.util.concurrent.Executor r2 = p001a.C0013i.f25b
            r0.mo20a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34755a.mo72828g():void");
    }

    /* renamed from: h */
    public final void mo72829h() {
        C34768c cVar = this.f89523d;
        int i = 1;
        if ((cVar == null || !cVar.f89556a) && !C34749a.f89481a.mo72809a(false)) {
            C34004b a = C34004b.m77717a();
            C52711k.m112236a((Object) a, "AwemeImManager.instance()");
            C35460j f = a.mo71949f();
            if (f != null) {
                C35458i liveProxy = f.getLiveProxy();
                if (liveProxy != null && liveProxy.mo73759d()) {
                    i = 0;
                }
            }
            C35188ad.m79439a(i, new C34764i(this));
            return;
        }
        C0013i.m12a(5000).mo20a((C0011g<TResult, TContinuationResult>) new C34763h<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72827f() {
        /*
            r25 = this;
            r0 = r25
            java.util.ArrayList<com.bytedance.im.core.c.p> r1 = r0.f89527j
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            android.app.Activity r1 = m78789i()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0013:
            r1 = 0
            goto L_0x005a
        L_0x0015:
            java.lang.String r1 = r1.getLocalClassName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r4 = "live.LivePlayActivity"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L_0x0026
            goto L_0x0013
        L_0x0026:
            com.ss.android.ugc.aweme.im.sdk.d.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r4 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            com.ss.android.ugc.aweme.im.service.j r1 = r1.mo71949f()
            if (r1 == 0) goto L_0x003c
            boolean r1 = r1.canShowInnerNotification()
            if (r1 != 0) goto L_0x003c
            goto L_0x0013
        L_0x003c:
            com.ss.android.ugc.aweme.im.sdk.d.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r4 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            com.ss.android.ugc.aweme.im.service.j r1 = r1.mo71949f()
            if (r1 == 0) goto L_0x0052
            boolean r1 = r1.isInPublishPage()
            if (r1 != r2) goto L_0x0052
            goto L_0x0013
        L_0x0052:
            boolean r1 = m78792o()
            if (r1 == 0) goto L_0x0059
            goto L_0x0013
        L_0x0059:
            r1 = 1
        L_0x005a:
            if (r1 != 0) goto L_0x0075
            r1 = 5000(0x1388, double:2.4703E-320)
            a.i r1 = p001a.C0013i.m12a(r1)
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$g r2 = new com.ss.android.ugc.aweme.im.sdk.notification.legacy.a$g
            r2.<init>(r0)
            a.g r2 = (p001a.C0011g) r2
            java.util.concurrent.Executor r3 = p001a.C0013i.f25b
            a.f r4 = r0.f89529l
            a.d r4 = r4.mo13b()
            r1.mo21a(r2, r3, r4)
            return
        L_0x0075:
            boolean r1 = m78792o()
            if (r1 == 0) goto L_0x007c
            return
        L_0x007c:
            r0.f89530m = r3
            java.lang.String r1 = ""
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Set r5 = (java.util.Set) r5
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.Set r6 = (java.util.Set) r6
            java.util.ArrayList<com.bytedance.im.core.c.p> r7 = r0.f89527j
            java.util.List r7 = (java.util.List) r7
            p2628d.p2629a.C52575l.m112106c(r7)
            java.util.ArrayList<com.bytedance.im.core.c.p> r7 = r0.f89527j
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r14 = r1
            r1 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x00a7:
            r11 = 2
            if (r1 >= r7) goto L_0x01e1
            java.util.ArrayList<com.bytedance.im.core.c.p> r12 = r0.f89527j
            java.lang.Object r12 = r12.get(r1)
            java.lang.String r13 = "mAssembleMessageList[index]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            com.bytedance.im.core.c.p r12 = (com.bytedance.p702im.core.p706c.C11207p) r12
            int r12 = r12.getConversationType()
            int r13 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30115a
            if (r12 != r13) goto L_0x0118
            com.ss.android.ugc.aweme.im.sdk.d.e r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            java.util.ArrayList<com.bytedance.im.core.c.p> r13 = r0.f89527j
            java.lang.Object r13 = r13.get(r1)
            java.lang.String r15 = "mAssembleMessageList[index]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r15)
            com.bytedance.im.core.c.p r13 = (com.bytedance.p702im.core.p706c.C11207p) r13
            long r15 = r13.getSender()
            java.lang.String r13 = java.lang.String.valueOf(r15)
            com.ss.android.ugc.aweme.im.service.model.IMUser r12 = r12.mo71952a(r13)
            if (r12 == 0) goto L_0x01a2
            boolean r13 = r5.contains(r12)
            if (r13 != 0) goto L_0x0113
            if (r8 >= r11) goto L_0x0113
            r11 = r4
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x00f1
            r11 = 1
            goto L_0x00f2
        L_0x00f1:
            r11 = 0
        L_0x00f2:
            if (r11 == 0) goto L_0x010a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "、"
            r11.<init>(r13)
            java.lang.String r13 = r12.getDisplayName()
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r4.append(r11)
            goto L_0x0111
        L_0x010a:
            java.lang.String r11 = r12.getDisplayName()
            r4.append(r11)
        L_0x0111:
            int r8 = r8 + 1
        L_0x0113:
            r5.add(r12)
            goto L_0x01a2
        L_0x0118:
            java.util.ArrayList<com.bytedance.im.core.c.p> r12 = r0.f89527j
            java.lang.Object r12 = r12.get(r1)
            java.lang.String r13 = "mAssembleMessageList[index]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            com.bytedance.im.core.c.p r12 = (com.bytedance.p702im.core.p706c.C11207p) r12
            int r12 = r12.getConversationType()
            int r13 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30116b
            if (r12 != r13) goto L_0x01a2
            com.bytedance.im.core.c.d r12 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.util.ArrayList<com.bytedance.im.core.c.p> r13 = r0.f89527j
            java.lang.Object r13 = r13.get(r1)
            java.lang.String r15 = "mAssembleMessageList[index]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r15)
            com.bytedance.im.core.c.p r13 = (com.bytedance.p702im.core.p706c.C11207p) r13
            java.lang.String r13 = r13.getConversationId()
            com.bytedance.im.core.c.b r12 = r12.mo20658a(r13)
            if (r12 == 0) goto L_0x01a2
            com.bytedance.im.core.c.c r13 = r12.getCoreInfo()
            if (r13 == 0) goto L_0x0151
            r13.getName()
        L_0x0151:
            android.content.Context r13 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r13 = r13.getResources()
            r15 = 2132542046(0x7f1c025e, float:2.0737186E38)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            com.bytedance.im.core.c.c r16 = r12.getCoreInfo()
            if (r16 == 0) goto L_0x0169
            java.lang.String r16 = r16.getName()
            goto L_0x016b
        L_0x0169:
            r16 = 0
        L_0x016b:
            r11[r3] = r16
            java.lang.String r11 = r13.getString(r15, r11)
            boolean r13 = r6.contains(r12)
            if (r13 != 0) goto L_0x019f
            r13 = 2
            if (r8 >= r13) goto L_0x019f
            r13 = r4
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x0185
            r13 = 1
            goto L_0x0186
        L_0x0185:
            r13 = 0
        L_0x0186:
            if (r13 == 0) goto L_0x019a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "、"
            r13.<init>(r15)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r4.append(r11)
            goto L_0x019d
        L_0x019a:
            r4.append(r11)
        L_0x019d:
            int r8 = r8 + 1
        L_0x019f:
            r6.add(r12)
        L_0x01a2:
            if (r1 != 0) goto L_0x01dd
            java.util.ArrayList<com.bytedance.im.core.c.p> r9 = r0.f89527j
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r10 = "mAssembleMessageList[index]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            com.bytedance.im.core.c.p r9 = (com.bytedance.p702im.core.p706c.C11207p) r9
            int r9 = r9.getMsgType()
            java.util.ArrayList<com.bytedance.im.core.c.p> r10 = r0.f89527j
            java.lang.Object r10 = r10.get(r1)
            java.lang.String r11 = "mAssembleMessageList[index]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            com.bytedance.im.core.c.p r10 = (com.bytedance.p702im.core.p706c.C11207p) r10
            int r10 = r10.getConversationType()
            java.util.ArrayList<com.bytedance.im.core.c.p> r11 = r0.f89527j
            java.lang.Object r11 = r11.get(r1)
            java.lang.String r12 = "mAssembleMessageList[index]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            com.bytedance.im.core.c.p r11 = (com.bytedance.p702im.core.p706c.C11207p) r11
            java.lang.String r11 = r11.getConversationId()
            java.lang.String r12 = "mAssembleMessageList[index].conversationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r14 = r11
        L_0x01dd:
            int r1 = r1 + 1
            goto L_0x00a7
        L_0x01e1:
            if (r8 != r2) goto L_0x0203
            java.util.ArrayList<com.bytedance.im.core.c.p> r1 = r0.f89527j
            java.util.ArrayList<com.bytedance.im.core.c.p> r3 = r0.f89527j
            java.util.List r3 = (java.util.List) r3
            int r3 = p2628d.p2629a.C52575l.m112093a(r3)
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r3 = "mAssembleMessageList[mAs…bleMessageList.lastIndex]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.bytedance.im.core.c.p r1 = (com.bytedance.p702im.core.p706c.C11207p) r1
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.b r1 = r0.m78786a(r1, r2)
            java.util.ArrayList<com.bytedance.im.core.c.p> r3 = r0.f89527j
            r3.clear()
            r3 = 0
            goto L_0x0273
        L_0x0203:
            java.util.ArrayList<com.bytedance.im.core.c.p> r1 = r0.f89527j
            r1.clear()
            int r1 = r6.size()
            int r5 = r5.size()
            int r1 = r1 + r5
            r5 = 2
            if (r1 <= r5) goto L_0x022e
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2132542047(0x7f1c025f, float:2.0737188E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r4 = r4.toString()
            r6[r3] = r4
            java.lang.String r1 = r1.getString(r5, r6)
        L_0x022b:
            r18 = r1
            goto L_0x0246
        L_0x022e:
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2132542049(0x7f1c0261, float:2.0737192E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r4 = r4.toString()
            r6[r3] = r4
            java.lang.String r1 = r1.getString(r5, r6)
            goto L_0x022b
        L_0x0246:
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.b r1 = new com.ss.android.ugc.aweme.im.sdk.notification.legacy.b
            r12 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2132542048(0x7f1c0260, float:2.073719E38)
            java.lang.String r17 = r3.getString(r4)
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 912(0x390, float:1.278E-42)
            r24 = 0
            r11 = r1
            r3 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0273:
            if (r1 == 0) goto L_0x0299
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r4 = r0.f89523d
            if (r4 == 0) goto L_0x0285
            boolean r4 = r4.f89556a
            if (r4 != r2) goto L_0x0285
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r2 = r0.f89523d
            if (r2 == 0) goto L_0x0299
            r2.mo72836a(r1)
            goto L_0x0298
        L_0x0285:
            r0.f89523d = r3
            android.app.Activity r2 = m78789i()
            if (r2 == 0) goto L_0x0298
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r3 = new com.ss.android.ugc.aweme.im.sdk.notification.legacy.c
            r3.<init>(r2)
            r3.mo72836a(r1)
            r0.f89523d = r3
            goto L_0x0299
        L_0x0298:
            return
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34755a.mo72827f():void");
    }

    public /* synthetic */ C34755a(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    private final boolean m78787a(C11207p pVar) {
        return this.f89526i != null ? false : false;
    }

    /* renamed from: a */
    public final void mo72822a(long j) {
        if (!this.f89530m) {
            this.f89529l = new C0010f();
            this.f89530m = true;
            C0013i.m12a(30000 - j).mo21a((C0011g<TResult, TContinuationResult>) new C34758c<TResult,TContinuationResult>(this), C0013i.f25b, this.f89529l.mo13b());
        }
    }

    /* renamed from: b */
    private final int m78788b(C11207p pVar) {
        int i;
        CharSequence charSequence;
        C35428b bVar = this.f89526i;
        if (bVar != null && bVar.mo70323d()) {
            Integer num = (Integer) this.f89522c.get(pVar.getConversationId());
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C11180b a = C11182d.m22641a().mo20658a(pVar.getConversationId());
            if (a != null) {
                Map localExt = a.getLocalExt();
                if (localExt != null) {
                    charSequence = (String) localExt.get("a:s_awe_show_close_notification");
                } else {
                    charSequence = null;
                }
                if (!TextUtils.equals(charSequence, "1") && i > 0 && i % 5 == 0) {
                    this.f89522c.remove(pVar.getConversationId());
                    Map localExt2 = a.getLocalExt();
                    if (localExt2 == null) {
                        localExt2 = new LinkedHashMap();
                    }
                    localExt2.put("a:s_awe_show_close_notification", "1");
                    a.setLocalExt(localExt2);
                    C11190e.m22688a(a.getConversationId(), localExt2, (Runnable) null);
                    return 2;
                }
            }
            Map<String, Integer> map = this.f89522c;
            String conversationId = pVar.getConversationId();
            C52711k.m112236a((Object) conversationId, "message.conversationId");
            map.put(conversationId, Integer.valueOf(i + 1));
            if (this.f89528k < 2) {
                int size = this.f89520a.size();
                if (size <= 5 || size % 5 != 0) {
                    this.f89520a.add(pVar.getConversationId());
                    C35284t a2 = C35284t.m79782a();
                    C52711k.m112236a((Object) a2, "IMSPUtils.get()");
                    a2.mo73398a((Set<String>) this.f89520a);
                } else {
                    this.f89528k++;
                    C35284t a3 = C35284t.m79782a();
                    C52711k.m112236a((Object) a3, "IMSPUtils.get()");
                    a3.mo73422g(this.f89528k);
                    return 3;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo72823a(LivePushMessage livePushMessage) {
        String str;
        if (!TextUtils.isEmpty(livePushMessage.getNickname()) && !TextUtils.isEmpty(livePushMessage.getText())) {
            if (mo72830j()) {
                C34004b a = C34004b.m77717a();
                C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                C35460j f = a.mo71949f();
                if (f != null) {
                    C35458i liveProxy = f.getLiveProxy();
                    if (liveProxy != null && liveProxy.mo73759d()) {
                        if (!TextUtils.isEmpty(livePushMessage.getSchema())) {
                            String nickname = livePushMessage.getNickname();
                            String text = livePushMessage.getText();
                            UrlModel avatar = livePushMessage.getAvatar();
                            StringBuilder sb = new StringBuilder();
                            sb.append(livePushMessage.getSchema());
                            sb.append("&request_page=");
                            sb.append(m78793p());
                            sb.append("&anchor_type=");
                            if (livePushMessage.getAnchorType() == 0) {
                                str = "old";
                            } else {
                                str = "new";
                            }
                            sb.append(str);
                            C34767b bVar = new C34767b(4, null, null, null, avatar, nickname, text, sb.toString(), Long.valueOf(livePushMessage.getAnchorId()), Integer.valueOf(livePushMessage.getAnchorType()), false, 1038, null);
                            this.f89523d = null;
                            Activity i = m78789i();
                            if (i != null) {
                                C34768c cVar = new C34768c(i);
                                cVar.mo72836a(bVar);
                                C35190af.m79447a(livePushMessage.getAnchorId(), livePushMessage.getRoomId(), m78793p(), livePushMessage.getAnchorType(), livePushMessage.getRequestId(), livePushMessage.getLogPb());
                                this.f89523d = cVar;
                            } else {
                                return;
                            }
                        }
                    }
                }
                C34004b a2 = C34004b.m77717a();
                C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
                C35460j f2 = a2.mo71949f();
                if (f2 != null) {
                    f2.getLiveProxy();
                }
            } else if (this.f89525f) {
                this.f89525f = false;
                C0013i.m12a(5000).mo20a((C0011g<TResult, TContinuationResult>) new C34765j<TResult,TContinuationResult>(this, livePushMessage), C0013i.f25b);
            } else {
                LivePushMessage livePushMessage2 = livePushMessage;
                C35190af.m79446a(livePushMessage.getAnchorId(), livePushMessage.getRoomId(), livePushMessage.getAnchorType());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34767b m78786a(com.bytedance.p702im.core.p706c.C11207p r19, boolean r20) {
        /*
            r18 = this;
            r0 = r19
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y.content(r19)
            java.lang.String r2 = "MessageViewType.content(message)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            int r4 = r18.m78788b(r19)
            int r2 = r19.getConversationType()
            int r3 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30115a
            r5 = 1
            r6 = 0
            if (r2 != r3) goto L_0x005f
            com.ss.android.ugc.aweme.im.sdk.d.e r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            long r7 = r19.getSender()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = r2.mo71952a(r3)
            if (r2 == 0) goto L_0x00fd
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.b r17 = new com.ss.android.ugc.aweme.im.sdk.notification.legacy.b
            int r3 = r19.getMsgType()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            int r3 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30115a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.String r8 = r19.getConversationId()
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r2.getAvatarThumb()
            java.lang.String r2 = r2.getDisplayName()
            java.lang.String r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34566a.m78502a(r1, r0, r5)
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 896(0x380, float:1.256E-42)
            r16 = 0
            r3 = r17
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r2
            r14 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00ff
        L_0x005f:
            int r2 = r19.getConversationType()
            int r3 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30116b
            if (r2 != r3) goto L_0x00fd
            com.bytedance.im.core.c.d r2 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r3 = r19.getConversationId()
            com.bytedance.im.core.c.b r2 = r2.mo20658a(r3)
            if (r2 == 0) goto L_0x00fd
            com.bytedance.im.core.c.c r3 = r2.getCoreInfo()
            if (r3 == 0) goto L_0x009a
            java.lang.String r3 = r3.getIcon()
            if (r3 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r7.<init>()
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = 0
            r8[r9] = r3
            r8[r5] = r3
            r5 = 2
            r8[r5] = r3
            java.util.List r3 = p2628d.p2629a.C52575l.m112099b(r8)
            r7.setUrlList(r3)
            r8 = r7
            goto L_0x009b
        L_0x009a:
            r8 = r6
        L_0x009b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.ss.android.ugc.aweme.im.sdk.d.e r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            long r9 = r19.getSender()
            java.lang.String r7 = java.lang.String.valueOf(r9)
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = r5.mo71952a(r7)
            if (r5 == 0) goto L_0x00c0
            java.lang.String r5 = r5.getDisplayName()
            if (r5 == 0) goto L_0x00c0
            r3.append(r5)
            java.lang.String r5 = ": "
            r3.append(r5)
        L_0x00c0:
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34566a.m78501a(r1, r0)
            r3.append(r1)
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.b r1 = new com.ss.android.ugc.aweme.im.sdk.notification.legacy.b
            int r5 = r19.getMsgType()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            int r5 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30116b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = r19.getConversationId()
            com.bytedance.im.core.c.c r2 = r2.getCoreInfo()
            if (r2 == 0) goto L_0x00e7
            java.lang.String r2 = r2.getName()
            r9 = r2
            goto L_0x00e8
        L_0x00e7:
            r9 = r6
        L_0x00e8:
            java.lang.String r10 = r3.toString()
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 896(0x380, float:1.256E-42)
            r16 = 0
            r3 = r1
            r6 = r0
            r14 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r17 = r1
            goto L_0x00ff
        L_0x00fd:
            r17 = r6
        L_0x00ff:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34755a.m78786a(com.bytedance.im.core.c.p, boolean):com.ss.android.ugc.aweme.im.sdk.notification.legacy.b");
    }

    /* renamed from: a */
    public final void mo72824a(List<C11207p> list, int i) {
        C52711k.m112240b(list, "list");
        if (!list.isEmpty()) {
            if (i == 3 && C33246f.f86254a.mo70589b()) {
                for (C11207p pVar : list) {
                    if (m78787a(pVar)) {
                        this.f89527j.add(pVar);
                    }
                }
                if (!this.f89524e) {
                    C0013i.m12a(1000).mo21a((C0011g<TResult, TContinuationResult>) new C34759d<TResult,TContinuationResult>(this), C0013i.f25b, this.f89529l.mo13b());
                    this.f89524e = true;
                }
            } else if (this.f89531n) {
                for (C11207p pVar2 : list) {
                    if (m78787a(pVar2)) {
                        this.f89527j.add(pVar2);
                    }
                }
            } else if (list.size() == 1 && !((C11207p) list.get(0)).isSelf()) {
                C35428b bVar = this.f89526i;
                if (!this.f89521b.isEmpty() && m78791n()) {
                    mo72826e();
                } else if (this.f89530m) {
                    mo72831k();
                }
            }
        }
    }
}
