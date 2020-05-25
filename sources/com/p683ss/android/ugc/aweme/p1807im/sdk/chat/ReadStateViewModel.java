package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0209x;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p706c.C11203l;
import com.bytedance.p702im.core.p706c.C11205n;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11238s;
import com.bytedance.p702im.core.p706c.C11241u;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.CommonLifeCycleObserver.C33325a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33521c.C33534a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.C33992a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35428b;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateViewModel */
public final class ReadStateViewModel extends C0209x implements CommonLifeCycleObserver, C33534a, C33683o, C33992a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f86454a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ReadStateViewModel.class), "markDelegate", "getMarkDelegate()Lcom/ss/android/ugc/aweme/im/sdk/chat/ReadStateMarkDelegate;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ReadStateViewModel.class), "syncDelegate", "getSyncDelegate()Lcom/ss/android/ugc/aweme/im/sdk/chat/ReadStateSyncDelegate;"))};

    /* renamed from: c */
    public static final boolean f86455c;

    /* renamed from: d */
    public static final C33338a f86456d = new C33338a(null);

    /* renamed from: b */
    public final C33449f f86457b = new C33449f();

    /* renamed from: e */
    private final C52668f f86458e = C52732g.m112285a(new C33339b(this));

    /* renamed from: f */
    private final C52668f f86459f = C52732g.m112285a(new C33340c(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateViewModel$a */
    public static final class C33338a {
        private C33338a() {
        }

        public /* synthetic */ C33338a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateViewModel$b */
    static final class C33339b extends C52712l implements C52670a<ReadStateMarkDelegate> {

        /* renamed from: a */
        final /* synthetic */ ReadStateViewModel f86460a;

        C33339b(ReadStateViewModel readStateViewModel) {
            this.f86460a = readStateViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ReadStateMarkDelegate(this.f86460a.f86457b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateViewModel$c */
    static final class C33340c extends C52712l implements C52670a<ReadStateSyncDelegate> {

        /* renamed from: a */
        final /* synthetic */ ReadStateViewModel f86461a;

        C33340c(ReadStateViewModel readStateViewModel) {
            this.f86461a = readStateViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ReadStateSyncDelegate(this.f86461a.f86457b);
        }
    }

    /* renamed from: a */
    public final void mo20721a(int i, C11207p pVar) {
    }

    /* renamed from: a */
    public final void mo20722a(int i, C11238s sVar) {
    }

    /* renamed from: a */
    public final void mo20723a(int i, C11241u uVar) {
    }

    /* renamed from: a */
    public final void mo20724a(C11207p pVar) {
    }

    /* renamed from: a */
    public final void mo20725a(C11207p pVar, Map<String, List<C11205n>> map, Map<String, List<C11205n>> map2) {
    }

    /* renamed from: a */
    public final void mo20727a(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ReadStateMarkDelegate mo70685b() {
        return (ReadStateMarkDelegate) this.f86458e.getValue();
    }

    /* renamed from: b */
    public final void mo20728b(int i, C11207p pVar) {
    }

    /* renamed from: b */
    public final void mo20729b(C11207p pVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final ReadStateSyncDelegate mo70686c() {
        return (ReadStateSyncDelegate) this.f86459f.getValue();
    }

    /* renamed from: c */
    public final void mo20730c(List<C11207p> list) {
    }

    /* renamed from: d */
    public final void mo20731d(List<C11207p> list) {
    }

    /* renamed from: e */
    public final void mo20732e(List<C11207p> list) {
    }

    /* renamed from: f */
    public final void mo20733f(List<C11241u> list) {
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        C33325a.onCreate(this);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        C33325a.onPause(this);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        C33325a.onResume(this);
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void onStart() {
        C33325a.onStart(this);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
        C33325a.onStop(this);
    }

    /* renamed from: a */
    public final void mo70683a() {
        mo70685b().mo70679c();
    }

    /* renamed from: d */
    public final void mo70687d() {
        mo70685b().mo70679c();
    }

    public final void onDestroy() {
        C11472i.m23483a().mo21116b(this.f86457b.mo70864d().f30222b, (C11203l) this);
    }

    static {
        boolean z = false;
        IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
        C52711k.m112236a((Object) provideIMService_Monster, "IMServiceManager.getServ…e(IIMService::class.java)");
        C35428b abInterface = provideIMService_Monster.getAbInterface();
        if (abInterface != null && 1 == abInterface.mo70325f()) {
            z = true;
        }
        f86455c = z;
    }

    /* renamed from: a */
    public final void mo70684a(List<C11207p> list) {
        Object obj;
        boolean z;
        StringBuilder sb = new StringBuilder("onDataChanged: ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = null;
        }
        sb.append(obj);
        if (list != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list = null;
            }
            if (list != null) {
                this.f86457b.mo70862b().clear();
                this.f86457b.mo70862b().addAll(collection);
                mo70685b().mo70638a();
                mo70686c().mo70638a();
            }
        }
    }

    /* renamed from: a */
    public final void mo20726a(List<C11207p> list, int i) {
        Integer num;
        StringBuilder sb = new StringBuilder("onGetMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        mo70685b().mo70639b();
        mo70686c().mo70639b();
    }
}
