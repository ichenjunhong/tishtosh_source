package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1337j;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1341n;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewPropertyAnimator;
import com.bytedance.p780m.C12361b;
import com.google.p1057b.p1060c.C17592aq;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46054d;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46353k;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a */
public final class C46210a extends C46245g {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f116590a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46210a.class), "mStickerFetcher", "getMStickerFetcher()Lcom/ss/android/ugc/aweme/sticker/panel/newpanel/NewPanelStickerFetchController;"))};

    /* renamed from: b */
    public volatile boolean f116591b;

    /* renamed from: c */
    C46249k f116592c;

    /* renamed from: d */
    public final C46354l f116593d = ((C46354l) this.f116595f.mo23373a(C46354l.class, (String) null));

    /* renamed from: e */
    public final C0184k f116594e;

    /* renamed from: f */
    public final C12361b f116595f;

    /* renamed from: p */
    private final C52668f f116596p = C52732g.m112285a(new C46215e(this));

    /* renamed from: q */
    private C46235c f116597q;

    /* renamed from: r */
    private final AppCompatActivity f116598r;

    /* renamed from: s */
    private final AVDmtTabLayout f116599s;

    /* renamed from: t */
    private final AVStatusView f116600t;

    /* renamed from: u */
    private final View f116601u;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$a */
    public static final class C46211a extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C46210a f116602a;

        C46211a(C46210a aVar) {
            this.f116602a = aVar;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            C52711k.m112240b(recyclerView, "recyclerView");
            C46249k kVar = this.f116602a.f116592c;
            if (kVar != null) {
                z = kVar.f116688a;
            } else {
                z = false;
            }
            if (!z) {
                this.f116602a.mo92914a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$b */
    static final class C46212b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46210a f116603a;

        C46212b(C46210a aVar) {
            this.f116603a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f116603a.mo92940a(C37722a.LOADING);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$c */
    static final class C46213c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46210a f116604a;

        /* renamed from: b */
        final /* synthetic */ C52671b f116605b;

        /* renamed from: c */
        final /* synthetic */ String f116606c;

        C46213c(C46210a aVar, C52671b bVar, String str) {
            this.f116604a = aVar;
            this.f116605b = bVar;
            this.f116606c = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f116604a.f116591b = true;
            C52671b bVar = this.f116605b;
            if (bVar != null) {
                bVar.invoke(this.f116606c);
            }
            this.f116604a.mo92940a(C37722a.SUCCESS);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$d */
    static final class C46214d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46210a f116607a;

        C46214d(C46210a aVar) {
            this.f116607a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f116607a.mo92940a(C37722a.ERROR);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$e */
    static final class C46215e extends C52712l implements C52670a<NewPanelStickerFetchController> {

        /* renamed from: a */
        final /* synthetic */ C46210a f116608a;

        C46215e(C46210a aVar) {
            this.f116608a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NewPanelStickerFetchController((C46354l) this.f116608a.f116595f.mo23373a(C46354l.class, (String) null), this.f116608a.f116594e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$f */
    static final class C46216f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C46210a f116609a;

        /* renamed from: b */
        final /* synthetic */ Effect f116610b;

        C46216f(C46210a aVar, Effect effect) {
            this.f116609a = aVar;
            this.f116610b = effect;
        }

        public final /* synthetic */ Object call() {
            String str;
            C46236d dVar = this.f116609a.f116678m;
            if (dVar != null) {
                Effect effect = this.f116610b;
                C17592aq<String, String> aqVar = dVar.f116654c;
                if (effect != null) {
                    str = effect.getEffectId();
                } else {
                    str = null;
                }
                List list = aqVar.get(str);
                C52711k.m112236a((Object) list, "mStickerIdCategoryMap.get(effect?.effectId)");
                if (list != null) {
                    Iterable iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (true) {
                        int i = -1;
                        if (!it.hasNext()) {
                            break;
                        }
                        String str2 = (String) it.next();
                        C46236d dVar2 = this.f116609a.f116678m;
                        if (dVar2 != null) {
                            i = dVar2.mo92937a(str2, this.f116610b);
                        }
                        arrayList.add(new C0794k(Integer.valueOf(i), str2));
                    }
                    Iterable iterable2 = (List) arrayList;
                    Collection arrayList2 = new ArrayList();
                    for (Object next : iterable2) {
                        Integer num = (Integer) ((C0794k) next).f2711a;
                        if (num == null) {
                            num = Integer.valueOf(-1);
                        }
                        boolean z = false;
                        if (C52711k.m112230a(num.intValue(), 0) >= 0) {
                            z = true;
                        }
                        if (z) {
                            arrayList2.add(next);
                        }
                    }
                    return (List) arrayList2;
                }
            }
            return C52575l.m112097a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$g */
    static final class C46217g<TTaskResult, TContinuationResult> implements C0011g<List<? extends C0794k<Integer, String>>, Void> {

        /* renamed from: a */
        final /* synthetic */ C46210a f116611a;

        /* renamed from: b */
        final /* synthetic */ Effect f116612b;

        C46217g(C46210a aVar, Effect effect) {
            this.f116611a = aVar;
            this.f116612b = effect;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (iVar.mo26b()) {
                Object e = iVar.mo34e();
                C52711k.m112236a(e, "task.result");
                for (C0794k kVar : (Iterable) e) {
                    Integer num = (Integer) kVar.f2711a;
                    if (num == null) {
                        num = Integer.valueOf(-1);
                    }
                    C52711k.m112236a((Object) num, "pair.first ?: -1");
                    int intValue = num.intValue();
                    String str = (String) kVar.f2712b;
                    if (str == null) {
                        str = "";
                    }
                    C52711k.m112236a((Object) str, "pair.second ?: \"\"");
                    C46236d dVar = this.f116611a.f116678m;
                    if (dVar != null) {
                        dVar.notifyItemChanged(intValue, this.f116611a.f116593d.mo92973a().mo92532d().mo92510a(this.f116612b, str));
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$h */
    public static final class C46218h extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C46210a f116613a;

        C46218h(C46210a aVar) {
            this.f116613a = aVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C1337j jVar = this.f116613a.f116680o;
            if (jVar != null) {
                AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116613a.f116677l;
                if (aVDmtPanelRecyleView != null) {
                    aVDmtPanelRecyleView.mo4816b(jVar);
                }
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f116613a.mo92943h();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$i */
    public static final class C46219i implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C46210a f116614a;

        C46219i(C46210a aVar) {
            this.f116614a = aVar;
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f116614a.mo92945j();
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f116614a.f116676k) {
                this.f116614a.mo92943h();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$j */
    public static final class C46220j implements C1337j {

        /* renamed from: a */
        final /* synthetic */ C46210a f116615a;

        /* renamed from: b */
        public final void mo5077b(View view) {
            C52711k.m112240b(view, "view");
        }

        C46220j(C46210a aVar) {
            this.f116615a = aVar;
        }

        /* renamed from: a */
        public final void mo5076a(View view) {
            int i;
            C52711k.m112240b(view, "view");
            if (this.f116615a.f116676k) {
                C46210a aVar = this.f116615a;
                if (this.f116615a.f116677l != null) {
                    i = AVDmtPanelRecyleView.m4275f(view);
                } else {
                    i = DynamicTabYellowPointVersion.DEFAULT;
                }
                aVar.mo92939a(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$k */
    static final class C46221k<T> implements C0199s<C46353k> {

        /* renamed from: a */
        final /* synthetic */ C46210a f116616a;

        C46221k(C46210a aVar) {
            this.f116616a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C46353k kVar = (C46353k) obj;
            if (kVar != null) {
                Effect effect = kVar.f116947a;
                Effect effect2 = kVar.f116948b;
                this.f116616a.mo92915a(effect);
                this.f116616a.mo92915a(effect2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$l */
    static final class C46222l<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Map f116617a;

        C46222l(Map map) {
            this.f116617a = map;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            Collection collection;
            boolean z2;
            boolean z3;
            Map map = this.f116617a;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new ArrayList();
            }
            List arrayList = new ArrayList();
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                CategoryEffectModel categoryEffectModel = (CategoryEffectModel) entry.getValue();
                if (categoryEffectModel != null) {
                    collection = categoryEffectModel.getEffects();
                } else {
                    collection = null;
                }
                Collection collection2 = collection;
                if (collection2 == null || collection2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(!z2)) {
                    collection = null;
                }
                if (collection != null) {
                    Iterable iterable = collection;
                    Collection arrayList2 = new ArrayList();
                    for (Object next : iterable) {
                        Effect effect = (Effect) next;
                        if ((C39629l.m88232a().mo58593x().mo74282b() || !C44518a.m97418b(effect)) && (!C39629l.m88232a().mo58593x().mo74280a() || !C44518a.m97418b(effect))) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            arrayList2.add(next);
                        }
                    }
                    Iterable<Effect> iterable2 = (List) arrayList2;
                    Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable2, 10));
                    for (Effect stickerWrapper : iterable2) {
                        arrayList3.add(new StickerWrapper(stickerWrapper, str, 3));
                    }
                    List list = (List) arrayList3;
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        arrayList.addAll(list);
                        Effect effect2 = new Effect();
                        effect2.setEffectId("-1");
                        effect2.setName("");
                        arrayList.add(new StickerWrapper(effect2, "", 3));
                    }
                }
            }
            if ((!arrayList.isEmpty()) && StickerWrapper.m99612a((StickerWrapper) arrayList.get(arrayList.size() - 1))) {
                arrayList.remove(arrayList.size() - 1);
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$m */
    static final class C46223m<TTaskResult, TContinuationResult> implements C0011g<List<? extends StickerWrapper>, Void> {

        /* renamed from: a */
        final /* synthetic */ C46210a f116618a;

        C46223m(C46210a aVar) {
            this.f116618a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (iVar.mo26b()) {
                C46236d dVar = this.f116618a.f116678m;
                if (dVar != null) {
                    dVar.mo64318a((List) iVar.mo34e());
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.a$n */
    static final class C46224n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AVDmtPanelRecyleView f116619a;

        /* renamed from: b */
        final /* synthetic */ float f116620b;

        /* renamed from: c */
        final /* synthetic */ float f116621c;

        /* renamed from: d */
        final /* synthetic */ long f116622d;

        /* renamed from: e */
        final /* synthetic */ boolean f116623e;

        C46224n(AVDmtPanelRecyleView aVDmtPanelRecyleView, float f, float f2, long j, boolean z) {
            this.f116619a = aVDmtPanelRecyleView;
            this.f116620b = f;
            this.f116621c = f2;
            this.f116622d = j;
            this.f116623e = z;
        }

        public final void run() {
            int i;
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116619a;
            if (this.f116623e) {
                i = 0;
            } else {
                i = 8;
            }
            aVDmtPanelRecyleView.setVisibility(i);
        }
    }

    /* renamed from: k */
    private final NewPanelStickerFetchController m100374k() {
        return (NewPanelStickerFetchController) this.f116596p.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo92922d() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116677l;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(8);
        }
        AVStatusView aVStatusView = this.f116600t;
        if (aVStatusView != null) {
            aVStatusView.setVisibility(0);
        }
        AVStatusView aVStatusView2 = this.f116600t;
        if (aVStatusView2 != null) {
            aVStatusView2.mo98095b();
        }
    }

    /* renamed from: e */
    public final void mo92923e() {
        super.mo92923e();
        if (this.f116674i && this.f116600t != null && C37722a.LOADING == this.f116673h) {
            this.f116600t.mo98093a();
            this.f116600t.mo98095b();
        }
    }

    /* renamed from: f */
    public final void mo92924f() {
        super.mo92924f();
        C46235c cVar = this.f116597q;
        if (cVar != null) {
            cVar.f116645a.mo4818b((C1340m) cVar);
            cVar.f116645a.removeOnAttachStateChangeListener(cVar);
            cVar.f116645a.mo4816b((C1337j) cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo92920b() {
        Map b = C45924b.m99853b(this.f116593d.mo92973a().mo92537i());
        AVStatusView aVStatusView = this.f116600t;
        if (aVStatusView != null) {
            aVStatusView.mo98099e();
        }
        if (b.isEmpty()) {
            AVStatusView aVStatusView2 = this.f116600t;
            if (aVStatusView2 != null) {
                aVStatusView2.setVisibility(0);
            }
            AVStatusView aVStatusView3 = this.f116600t;
            if (aVStatusView3 != null) {
                aVStatusView3.mo98097c();
            }
            View view = this.f116601u;
            if (view != null) {
                view.setVisibility(8);
            }
            return;
        }
        AVStatusView aVStatusView4 = this.f116600t;
        if (aVStatusView4 != null) {
            aVStatusView4.mo98093a();
        }
        AVStatusView aVStatusView5 = this.f116600t;
        if (aVStatusView5 != null) {
            aVStatusView5.setVisibility(8);
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116677l;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(0);
        }
        View view2 = this.f116601u;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        C0013i.m16a((Callable<TResult>) new C46222l<TResult>(b)).mo20a((C0011g<TResult, TContinuationResult>) new C46223m<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo92921c() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116677l;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(8);
        }
        AVStatusView aVStatusView = this.f116600t;
        if (aVStatusView != null) {
            aVStatusView.setVisibility(0);
        }
        AVStatusView aVStatusView2 = this.f116600t;
        if (aVStatusView2 != null) {
            aVStatusView2.mo98094a(false);
        }
        View view = this.f116601u;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        if (r0 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b3, code lost:
        if (r0 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d3, code lost:
        if (r0 == null) goto L_0x00d5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92914a() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r0 = r8.f116678m
            android.support.v7.widget.LinearLayoutManager r1 = r8.f116679n
            r2 = 0
            r3 = -1
            if (r1 != 0) goto L_0x000a
        L_0x0008:
            r4 = -1
            goto L_0x0031
        L_0x000a:
            if (r0 != 0) goto L_0x000d
            goto L_0x0008
        L_0x000d:
            int r4 = r1.mo4749j()
            int r1 = r1.mo4751l()
            if (r4 > r1) goto L_0x0008
        L_0x0017:
            java.util.List r5 = r0.mo92825b()
            if (r5 == 0) goto L_0x0024
            java.lang.Object r5 = r5.get(r4)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r5 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r5
            goto L_0x0025
        L_0x0024:
            r5 = r2
        L_0x0025:
            boolean r5 = com.p683ss.android.ugc.aweme.sticker.StickerWrapper.m99612a(r5)
            if (r5 == 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            if (r4 == r1) goto L_0x0008
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0031:
            com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView r0 = r8.f116677l
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            r5 = 1
            if (r0 != 0) goto L_0x003b
        L_0x0039:
            r0 = 0
            goto L_0x0042
        L_0x003b:
            int r0 = android.support.p030v4.view.C1056u.m3055f(r0)
            if (r5 != r0) goto L_0x0039
            r0 = 1
        L_0x0042:
            if (r4 != r3) goto L_0x0068
            android.support.v7.widget.LinearLayoutManager r0 = r8.f116679n
            if (r0 == 0) goto L_0x004c
            int r1 = r0.mo4749j()
        L_0x004c:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r0 = r8.f116678m
            if (r0 == 0) goto L_0x0062
            java.util.List r0 = r0.mo92825b()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r0.f115780b
            if (r0 != 0) goto L_0x0064
        L_0x0062:
            java.lang.String r0 = ""
        L_0x0064:
            r8.m100372c(r0)
            return
        L_0x0068:
            com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView r6 = r8.f116677l
            if (r6 == 0) goto L_0x0070
            android.support.v7.widget.RecyclerView$v r2 = r6.mo4847f(r4)
        L_0x0070:
            r6 = 2
            int[] r7 = new int[r6]
            if (r2 == 0) goto L_0x007c
            android.view.View r2 = r2.itemView
            if (r2 == 0) goto L_0x007c
            r2.getLocationOnScreen(r7)
        L_0x007c:
            r1 = r7[r1]
            android.support.v7.app.AppCompatActivity r2 = r8.f116598r
            android.content.Context r2 = (android.content.Context) r2
            int r2 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94971b(r2)
            if (r0 == 0) goto L_0x008a
            int r1 = r2 - r1
        L_0x008a:
            int r2 = r2 / r6
            if (r1 >= r2) goto L_0x00ba
            int r0 = r4 + 1
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r6 = r8.f116678m
            if (r6 == 0) goto L_0x009d
            java.util.List r6 = r6.mo92825b()
            if (r6 == 0) goto L_0x009d
            int r3 = r6.size()
        L_0x009d:
            if (r0 >= r3) goto L_0x00ba
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r3 = r8.f116678m
            if (r3 == 0) goto L_0x00b5
            java.util.List r3 = r3.mo92825b()
            if (r3 == 0) goto L_0x00b5
            java.lang.Object r0 = r3.get(r0)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r0.f115780b
            if (r0 != 0) goto L_0x00b7
        L_0x00b5:
            java.lang.String r0 = ""
        L_0x00b7:
            r8.m100372c(r0)
        L_0x00ba:
            if (r1 <= r2) goto L_0x00da
            int r4 = r4 - r5
            if (r4 < 0) goto L_0x00da
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r0 = r8.f116678m
            if (r0 == 0) goto L_0x00d5
            java.util.List r0 = r0.mo92825b()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r0.get(r4)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = r0.f115780b
            if (r0 != 0) goto L_0x00d7
        L_0x00d5:
            java.lang.String r0 = ""
        L_0x00d7:
            r8.m100372c(r0)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46210a.mo92914a():void");
    }

    /* renamed from: a */
    public final void mo92915a(Effect effect) {
        C0013i.m16a((Callable<TResult>) new C46216f<TResult>(this, effect)).mo20a((C0011g<TResult, TContinuationResult>) new C46217g<TResult,TContinuationResult>(this, effect), C0013i.f25b);
    }

    /* renamed from: c */
    private final void m100372c(String str) {
        int d = m100373d(str);
        int tabCount = this.f116599s.getTabCount();
        if (d >= 0 && tabCount >= d) {
            C44709f a = this.f116599s.mo90679a(d);
            if (a != null) {
                a.mo90744a();
            }
            this.f116672g = d;
            mo92941b(mo92944i());
        }
    }

    /* renamed from: d */
    private final int m100373d(String str) {
        int i = 0;
        for (EffectCategoryModel key : C45924b.m99852a(this.f116593d.mo92973a().mo92537i())) {
            if (C52711k.m112239a((Object) key.getKey(), (Object) str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x003f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92916a(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "categoryKey"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            int r12 = r11.m100373d(r12)
            r0 = 0
            r1 = -1
            r2 = 2
            r3 = 1
            r4 = 0
            if (r12 == r1) goto L_0x006c
            com.ss.android.ugc.aweme.sticker.presenter.l r1 = r11.f116593d
            com.ss.android.ugc.aweme.sticker.i.a.p r1 = r1.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.q r1 = r1.mo92537i()
            java.util.List r1 = com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b.m99852a(r1)
            int r5 = r1.size()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r6 = 0
            r7 = 0
        L_0x002a:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x006b
            java.lang.Object r8 = r1.next()
            int r9 = r6 + 1
            if (r6 >= 0) goto L_0x003b
            p2628d.p2629a.C52575l.m112100b()
        L_0x003b:
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r8 = (com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r8
            if (r3 <= r6) goto L_0x0041
        L_0x003f:
            r6 = r9
            goto L_0x002a
        L_0x0041:
            if (r12 <= r6) goto L_0x003f
            com.ss.android.ugc.aweme.sticker.presenter.l r10 = r11.f116593d
            com.ss.android.ugc.aweme.sticker.i.a.p r10 = r10.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.q r10 = r10.mo92537i()
            java.lang.String r8 = r8.getKey()
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r8 = com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b.m99850a(r10, r8, false)
            if (r8 == 0) goto L_0x0062
            java.util.List r8 = r8.getEffects()
            if (r8 == 0) goto L_0x0062
            int r8 = r8.size()
            goto L_0x0063
        L_0x0062:
            r8 = 0
        L_0x0063:
            int r7 = r7 + r8
            int r8 = r5 + -1
            if (r6 == r8) goto L_0x003f
            int r7 = r7 + 1
            goto L_0x003f
        L_0x006b:
            r1 = r7
        L_0x006c:
            if (r1 < 0) goto L_0x0164
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r5 = r11.f116599s
            r5.setHideIndicatorView(r4)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r5 = r11.f116599s
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r5 = r5.mo90679a(r12)
            if (r5 == 0) goto L_0x007e
            r5.mo90744a()
        L_0x007e:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.k r5 = r11.f116592c
            if (r5 == 0) goto L_0x015b
            android.support.v7.widget.RecyclerView r6 = r5.f116694g
            android.support.v7.widget.RecyclerView$i r6 = r6.getLayoutManager()
            boolean r7 = r6 instanceof com.p683ss.android.ugc.aweme.sticker.panel.newpanel.StickerCenterLayoutManager
            if (r7 != 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r0 = r6
        L_0x008e:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.StickerCenterLayoutManager r0 = (com.p683ss.android.ugc.aweme.sticker.panel.newpanel.StickerCenterLayoutManager) r0
            if (r0 == 0) goto L_0x0097
            int r6 = r0.mo4749j()
            goto L_0x0098
        L_0x0097:
            r6 = 0
        L_0x0098:
            if (r0 == 0) goto L_0x009f
            int r0 = r0.mo4750k()
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            boolean r7 = r5.f116688a
            if (r7 != 0) goto L_0x015b
            if (r1 < 0) goto L_0x015b
            if (r0 != r1) goto L_0x00aa
            goto L_0x015b
        L_0x00aa:
            r5.f116688a = r3
            java.util.LinkedList<com.ss.android.ugc.aweme.sticker.panel.newpanel.i> r0 = r5.f116691d
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00bc
            java.util.LinkedList<com.ss.android.ugc.aweme.sticker.panel.newpanel.i> r0 = r5.f116691d
            r0.clear()
        L_0x00bc:
            float r0 = com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46249k.C46250a.m100430a()
            r5.f116690c = r0
            r0 = 1025758986(0x3d23d70a, float:0.04)
            com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46249k.f116686i = r0
            r7 = 300(0x12c, float:4.2E-43)
            android.content.Context r8 = r5.f116693f
            float r7 = (float) r7
            float r7 = r7 / r0
            int r0 = com.bytedance.common.utility.C9432q.m18692c(r8, r7)
            int r7 = r5.f116695h
            int r0 = r0 / r7
            r7 = 20
            int r0 = java.lang.Math.min(r0, r7)
            int r7 = r6 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r7 > r0) goto L_0x0110
            com.ss.android.ugc.aweme.sticker.panel.newpanel.i r0 = new com.ss.android.ugc.aweme.sticker.panel.newpanel.i
            r0.<init>(r4, r1)
            java.util.LinkedList<com.ss.android.ugc.aweme.sticker.panel.newpanel.i> r3 = r5.f116691d
            r3.offer(r0)
            boolean r0 = r5.f116689b
            if (r0 == 0) goto L_0x00fa
            com.ss.android.ugc.aweme.sticker.panel.newpanel.i r0 = new com.ss.android.ugc.aweme.sticker.panel.newpanel.i
            r0.<init>(r2, r1)
            java.util.LinkedList<com.ss.android.ugc.aweme.sticker.panel.newpanel.i> r1 = r5.f116691d
            r1.offer(r0)
        L_0x00fa:
            android.support.v7.widget.RecyclerView r0 = r5.f116694g
            com.ss.android.ugc.aweme.sticker.panel.newpanel.k$b r1 = r5.f116692e
            android.support.v7.widget.RecyclerView$m r1 = (android.support.p043v7.widget.RecyclerView.C1340m) r1
            r0.mo4818b(r1)
            android.support.v7.widget.RecyclerView r0 = r5.f116694g
            com.ss.android.ugc.aweme.sticker.panel.newpanel.k$b r1 = r5.f116692e
            android.support.v7.widget.RecyclerView$m r1 = (android.support.p043v7.widget.RecyclerView.C1340m) r1
            r0.mo4801a(r1)
            r5.mo92949a()
            goto L_0x015b
        L_0x0110:
            if (r6 <= r1) goto L_0x0116
            int r0 = r0 / r2
            int r6 = r6 - r0
            int r0 = r0 + r1
            goto L_0x011a
        L_0x0116:
            int r0 = r0 / r2
            int r6 = r6 + r0
            int r0 = r1 - r0
        L_0x011a:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.i r7 = new com.ss.android.ugc.aweme.sticker.panel.newpanel.i
            r7.<init>(r4, r6)
            com.ss.android.ugc.aweme.sticker.panel.newpanel.i r6 = new com.ss.android.ugc.aweme.sticker.panel.newpanel.i
            r6.<init>(r3, r0)
            com.ss.android.ugc.aweme.sticker.panel.newpanel.i r0 = new com.ss.android.ugc.aweme.sticker.panel.newpanel.i
            r0.<init>(r4, r1)
            java.util.LinkedList<com.ss.android.ugc.aweme.sticker.panel.newpanel.i> r3 = r5.f116691d
            r3.offer(r7)
            java.util.LinkedList<com.ss.android.ugc.aweme.sticker.panel.newpanel.i> r3 = r5.f116691d
            r3.offer(r6)
            java.util.LinkedList<com.ss.android.ugc.aweme.sticker.panel.newpanel.i> r3 = r5.f116691d
            r3.offer(r0)
            boolean r0 = r5.f116689b
            if (r0 == 0) goto L_0x0146
            com.ss.android.ugc.aweme.sticker.panel.newpanel.i r0 = new com.ss.android.ugc.aweme.sticker.panel.newpanel.i
            r0.<init>(r2, r1)
            java.util.LinkedList<com.ss.android.ugc.aweme.sticker.panel.newpanel.i> r1 = r5.f116691d
            r1.offer(r0)
        L_0x0146:
            android.support.v7.widget.RecyclerView r0 = r5.f116694g
            com.ss.android.ugc.aweme.sticker.panel.newpanel.k$b r1 = r5.f116692e
            android.support.v7.widget.RecyclerView$m r1 = (android.support.p043v7.widget.RecyclerView.C1340m) r1
            r0.mo4818b(r1)
            android.support.v7.widget.RecyclerView r0 = r5.f116694g
            com.ss.android.ugc.aweme.sticker.panel.newpanel.k$b r1 = r5.f116692e
            android.support.v7.widget.RecyclerView$m r1 = (android.support.p043v7.widget.RecyclerView.C1340m) r1
            r0.mo4801a(r1)
            r5.mo92949a()
        L_0x015b:
            r11.f116672g = r12
            java.lang.String r12 = r11.mo92944i()
            r11.mo92941b(r12)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46210a.mo92916a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo92919a(boolean z, long j) {
        float f;
        float f2;
        if (this.f116674i != z) {
            this.f116674i = z;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116677l;
            if (aVDmtPanelRecyleView != null) {
                aVDmtPanelRecyleView.setAlpha(f);
                aVDmtPanelRecyleView.setVisibility(0);
                ViewPropertyAnimator duration = aVDmtPanelRecyleView.animate().alpha(f2).setDuration(250);
                C46224n nVar = new C46224n(aVDmtPanelRecyleView, f, f2, 250, z);
                duration.withEndAction(nVar).start();
            }
            if (this.f116675j) {
                mo92940a(C37722a.SUCCESS);
                this.f116675j = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo92917a(String str, View view) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(view, "root");
        C46236d dVar = new C46236d(this.f116593d, (C45814b) this.f116595f.mo23373a(C45814b.class, (String) null));
        dVar.mo97992c(false);
        dVar.f116653b = (C46086b) this.f116595f.mo23373a(C46086b.class, (String) null);
        this.f116678m = dVar;
        this.f116679n = new StickerCenterLayoutManager(this.f116598r, 0, false);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) view.findViewById(R.id.b9y);
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setAdapter(this.f116678m);
            aVDmtPanelRecyleView.setLayoutManager(this.f116679n);
            aVDmtPanelRecyleView.setItemViewCacheSize(5);
            aVDmtPanelRecyleView.setRecycledViewPool((C1341n) this.f116595f.mo23373a(C1341n.class, (String) null));
            Context applicationContext = this.f116598r.getApplicationContext();
            C52711k.m112236a((Object) applicationContext, "mActivity.applicationContext");
            this.f116592c = new C46249k(applicationContext, aVDmtPanelRecyleView, 112);
        } else {
            aVDmtPanelRecyleView = null;
        }
        this.f116677l = aVDmtPanelRecyleView;
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f116677l;
        if (aVDmtPanelRecyleView2 != null) {
            aVDmtPanelRecyleView2.mo4801a((C1340m) new C46218h(this));
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView3 = this.f116677l;
        if (aVDmtPanelRecyleView3 != null) {
            aVDmtPanelRecyleView3.addOnAttachStateChangeListener(new C46219i(this));
        }
        this.f116680o = new C46220j(this);
        C1337j jVar = this.f116680o;
        if (jVar != null) {
            AVDmtPanelRecyleView aVDmtPanelRecyleView4 = this.f116677l;
            if (aVDmtPanelRecyleView4 != null) {
                aVDmtPanelRecyleView4.mo4799a(jVar);
            }
        }
        this.f116593d.mo92989g().mo93018d().observe(this.f116594e, new C46221k(this));
        this.f116676k = true;
        AVDmtPanelRecyleView aVDmtPanelRecyleView5 = this.f116677l;
        if (aVDmtPanelRecyleView5 != null) {
            aVDmtPanelRecyleView5.mo4801a((C1340m) new C46211a(this));
        }
        mo92941b(mo92944i());
        AVDmtPanelRecyleView aVDmtPanelRecyleView6 = this.f116677l;
        if (aVDmtPanelRecyleView6 != null) {
            C46236d dVar2 = this.f116678m;
            if (dVar2 != null) {
                this.f116597q = new C46235c(this, aVDmtPanelRecyleView6, dVar2, (C46054d) this.f116595f.mo23375b(C46054d.class, (String) null));
                C46235c cVar = this.f116597q;
                if (cVar != null) {
                    cVar.f116645a.mo4801a((C1340m) cVar);
                    cVar.f116645a.addOnAttachStateChangeListener(cVar);
                    cVar.f116645a.mo4799a((C1337j) cVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo92918a(String str, C52671b<? super String, ? extends Object> bVar) {
        C52711k.m112240b(str, "panel");
        mo92940a(C37722a.LOADING);
        Map b = C45924b.m99853b(this.f116593d.mo92973a().mo92537i());
        if (!this.f116591b || !(!b.isEmpty())) {
            m100374k().f116556g = new C46212b(this);
            m100374k().f116557h = new C46213c(this, bVar, str);
            m100374k().f116558i = new C46214d(this);
            NewPanelStickerFetchController k = m100374k();
            if (!k.f116555f) {
                k.f116555f = true;
                k.f116550a.clear();
                k.f116551b.clear();
                k.f116552c = null;
                k.f116553d = false;
                k.f116554e = null;
                C52670a<C52860x> aVar = k.f116556g;
                if (aVar != null) {
                    aVar.invoke();
                }
                k.f116559j.mo92973a().mo92537i().mo92542c().observe(k.f116560k, new C46199c(k));
            }
            return;
        }
        if (bVar != null) {
            bVar.invoke(str);
        }
        mo92940a(C37722a.SUCCESS);
    }

    public C46210a(AppCompatActivity appCompatActivity, C0184k kVar, C12361b bVar, AVDmtTabLayout aVDmtTabLayout, AVStatusView aVStatusView, View view) {
        C52711k.m112240b(appCompatActivity, "mActivity");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(bVar, "objectContainer");
        C52711k.m112240b(aVDmtTabLayout, "mTabLayout");
        super(appCompatActivity, (C46354l) bVar.mo23373a(C46354l.class, (String) null), (C45889c) bVar.mo23373a(C45889c.class, (String) null));
        this.f116598r = appCompatActivity;
        this.f116594e = kVar;
        this.f116595f = bVar;
        this.f116599s = aVDmtTabLayout;
        this.f116600t = aVStatusView;
        this.f116601u = view;
    }
}
