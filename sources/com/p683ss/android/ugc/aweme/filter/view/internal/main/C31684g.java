package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31634f;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31613h;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31614i;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44703b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g */
public class C31684g implements C31614i {

    /* renamed from: a */
    public Map<EffectCategoryResponse, List<C31459g>> f82752a = new LinkedHashMap();

    /* renamed from: b */
    public Map<Object, View> f82753b = new LinkedHashMap();

    /* renamed from: c */
    boolean f82754c = true;

    /* renamed from: d */
    final C2189f<EffectCategoryResponse> f82755d;

    /* renamed from: e */
    final C2189f<Object> f82756e;

    /* renamed from: f */
    public final TabLayout f82757f;

    /* renamed from: g */
    public final C31634f f82758g;

    /* renamed from: h */
    private final C1689b f82759h;

    /* renamed from: i */
    private final C31613h f82760i;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g$a */
    static final class C31685a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31684g f82761a;

        /* renamed from: b */
        final /* synthetic */ View f82762b;

        /* renamed from: c */
        final /* synthetic */ Object f82763c;

        C31685a(C31684g gVar, View view, Object obj) {
            this.f82761a = gVar;
            this.f82762b = view;
            this.f82763c = obj;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31684g gVar = this.f82761a;
            View view2 = this.f82762b;
            gVar.f82756e.onNext(this.f82763c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g$b */
    public static final class C31686b implements C48710o {

        /* renamed from: a */
        final /* synthetic */ AVDmtTabItemView f82764a;

        /* renamed from: a */
        public final void mo8641a() {
            this.f82764a.mo93989b(true);
        }

        /* renamed from: b */
        public final void mo8642b() {
            this.f82764a.mo93989b(false);
        }

        C31686b(AVDmtTabItemView aVDmtTabItemView) {
            this.f82764a = aVDmtTabItemView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g$c */
    static final class C31687c<T> implements C1710e<C31459g> {

        /* renamed from: a */
        final /* synthetic */ C31684g f82765a;

        C31687c(C31684g gVar) {
            this.f82765a = gVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C31459g gVar = (C31459g) obj;
            C31684g gVar2 = this.f82765a;
            C52711k.m112236a((Object) gVar, "it");
            gVar2.mo64585c(gVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g$d */
    static final class C31688d<T> implements C1710e<C11575f<? extends C31459g>> {

        /* renamed from: a */
        final /* synthetic */ C31684g f82766a;

        C31688d(C31684g gVar) {
            this.f82766a = gVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C11575f fVar = (C11575f) obj;
            C31684g gVar = this.f82766a;
            C31459g gVar2 = (C31459g) fVar.mo22313a();
            if (gVar2 != null) {
                gVar.mo64585c(gVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g$e */
    static final class C31689e<T> implements C1710e<C31459g> {

        /* renamed from: a */
        final /* synthetic */ C31684g f82767a;

        C31689e(C31684g gVar) {
            this.f82767a = gVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C31459g gVar = (C31459g) obj;
            C31684g gVar2 = this.f82767a;
            C52711k.m112236a((Object) gVar, "it");
            if (gVar2.f82754c) {
                gVar2.mo64585c(gVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g$f */
    public static final class C31690f implements C44704c {

        /* renamed from: a */
        final /* synthetic */ C31684g f82768a;

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
        }

        C31690f(C31684g gVar) {
            this.f82768a = gVar;
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            View view;
            Object obj;
            if (fVar != null) {
                view = fVar.f113162f;
            } else {
                view = null;
            }
            if (fVar != null && view != null) {
                if (!(view instanceof AVDmtTabItemView)) {
                    view = null;
                }
                AVDmtTabItemView aVDmtTabItemView = (AVDmtTabItemView) view;
                int i = 0;
                if (aVDmtTabItemView != null) {
                    aVDmtTabItemView.mo93989b(false);
                }
                C31634f fVar2 = this.f82768a.f82758g;
                if (fVar2 != null) {
                    Iterable keySet = this.f82768a.f82752a.keySet();
                    int i2 = fVar.f113161e;
                    C52711k.m112240b(keySet, "$this$elementAtOrNull");
                    if (keySet instanceof List) {
                        obj = C52575l.m112118a((List) keySet, i2);
                    } else {
                        if (i2 >= 0) {
                            Iterator it = keySet.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                int i3 = i + 1;
                                if (i2 == i) {
                                    obj = next;
                                    break;
                                }
                                i = i3;
                            }
                        }
                        obj = null;
                    }
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) obj;
                    if (effectCategoryResponse != null) {
                        fVar2.mo64546a(effectCategoryResponse, (C48715t) null);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g$g */
    static final class C31691g implements C44703b {

        /* renamed from: a */
        public static final C31691g f82769a = new C31691g();

        C31691g() {
        }

        /* renamed from: a */
        public final void mo64479a(C44709f fVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g$h */
    static final class C31692h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C31684g f82770a;

        /* renamed from: b */
        final /* synthetic */ Map f82771b;

        C31692h(C31684g gVar, Map map) {
            this.f82770a = gVar;
            this.f82771b = map;
        }

        public final void run() {
            C31684g gVar = this.f82770a;
            Iterable keySet = this.f82771b.keySet();
            C52711k.m112240b(keySet, "$this$firstOrNull");
            Object obj = null;
            if (keySet instanceof List) {
                List list = (List) keySet;
                if (!list.isEmpty()) {
                    obj = list.get(0);
                }
            } else {
                Iterator it = keySet.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                }
            }
            gVar.mo64500a((EffectCategoryResponse) obj, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.g$i */
    static final class C31693i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31684g f82772a;

        /* renamed from: b */
        final /* synthetic */ EffectCategoryResponse f82773b;

        C31693i(C31684g gVar, EffectCategoryResponse effectCategoryResponse) {
            this.f82772a = gVar;
            this.f82773b = effectCategoryResponse;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31684g gVar = this.f82772a;
            EffectCategoryResponse effectCategoryResponse = this.f82773b;
            gVar.f82755d.onNext(effectCategoryResponse);
            gVar.mo64500a(effectCategoryResponse, true);
        }
    }

    /* renamed from: a */
    public final C31459g mo64492a() {
        return this.f82760i.mo64492a();
    }

    /* renamed from: b */
    public final C2201v<C31459g> mo64495b() {
        return this.f82760i.mo64495b();
    }

    /* renamed from: c */
    public final C2201v<C11575f<C31459g>> mo64497c() {
        return this.f82760i.mo64497c();
    }

    /* renamed from: d */
    public final C2201v<C31459g> mo64498d() {
        return this.f82760i.mo64498d();
    }

    /* renamed from: e */
    public final C2201v<EffectCategoryResponse> mo64502e() {
        C2201v<EffectCategoryResponse> e = this.f82755d.mo6542e();
        C52711k.m112236a((Object) e, "tabClickSubject.hide()");
        return e;
    }

    /* renamed from: f */
    public final C2201v<Object> mo64503f() {
        C2201v<Object> e = this.f82756e.mo6542e();
        C52711k.m112236a((Object) e, "extraViewSubject.hide()");
        return e;
    }

    /* renamed from: a */
    public final void mo64501a(boolean z) {
        this.f82754c = z;
    }

    /* renamed from: a */
    public final void mo64493a(C31459g gVar) {
        this.f82760i.mo64493a(gVar);
    }

    /* renamed from: b */
    public final void mo64496b(C31459g gVar) {
        this.f82760i.mo64496b(gVar);
    }

    /* renamed from: a */
    public final void mo64491a(Map<EffectCategoryResponse, ? extends List<? extends C31459g>> map) {
        C52711k.m112240b(map, "filterList");
        this.f82752a.clear();
        this.f82752a.putAll(map);
        mo64584a(C52575l.m112138e((Iterable<? extends T>) this.f82752a.keySet()));
        this.f82760i.mo64491a(this.f82752a);
        this.f82757f.post(new C31692h(this, map));
    }

    /* renamed from: c */
    public final void mo64585c(C31459g gVar) {
        EffectCategoryResponse effectCategoryResponse;
        Object obj;
        boolean z;
        Object obj2;
        boolean z2;
        C52711k.m112240b(gVar, "filterBean");
        Iterator it = this.f82752a.entrySet().iterator();
        while (true) {
            effectCategoryResponse = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Iterator it2 = ((Iterable) ((Entry) obj).getValue()).iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((C31459g) obj2).f82324a == gVar.f82324a) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (obj2 == null) {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Entry entry = (Entry) obj;
        if (entry != null) {
            effectCategoryResponse = (EffectCategoryResponse) entry.getKey();
        }
        mo64500a(effectCategoryResponse, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64584a(List<? extends EffectCategoryResponse> list) {
        C52711k.m112240b(list, "tabDataList");
        this.f82757f.mo90692b();
        for (EffectCategoryResponse effectCategoryResponse : list) {
            Context context = this.f82757f.getContext();
            C52711k.m112236a((Object) context, "tabLayout.context");
            C52711k.m112240b(context, "context");
            C52711k.m112240b(effectCategoryResponse, "tabData");
            AVDmtTabItemView a = C46784a.m101614a(context);
            a.mo93985a();
            if (TextUtils.isEmpty(effectCategoryResponse.getIcon_normal_url())) {
                a.setText(effectCategoryResponse.getName());
            } else {
                a.mo93987a(effectCategoryResponse.getIcon_normal_url(), 0);
            }
            C31634f fVar = this.f82758g;
            if (fVar != null) {
                fVar.mo64545a(effectCategoryResponse, (C48710o) new C31686b(a));
            }
            View view = a;
            C44709f a2 = this.f82757f.mo90678a().mo90742a(view);
            C52711k.m112236a((Object) a2, "tabLayout.newTab().setCustomView(tabView)");
            this.f82757f.mo90684a(a2);
            view.setOnClickListener(new C31693i(this, effectCategoryResponse));
        }
        for (Entry entry : this.f82753b.entrySet()) {
            m73607b((View) entry.getValue(), entry.getKey());
        }
    }

    /* renamed from: a */
    public final void mo64499a(View view, Object obj) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(obj, "token");
        this.f82753b.put(obj, view);
        m73607b(view, obj);
    }

    /* renamed from: b */
    private final void m73607b(View view, Object obj) {
        C44709f a = this.f82757f.mo90678a().mo90742a(view);
        C52711k.m112236a((Object) a, "tabLayout.newTab().setCustomView(view)");
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((View) parent).setOnClickListener(new C31685a(this, view, obj));
            this.f82757f.mo90684a(a);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: a */
    public final void mo64494a(C31459g gVar, int i) {
        this.f82760i.mo64494a(gVar, i);
    }

    /* renamed from: a */
    public final void mo64500a(EffectCategoryResponse effectCategoryResponse, boolean z) {
        int i = -1;
        if (effectCategoryResponse != null) {
            Iterator it = this.f82752a.keySet().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    C52575l.m112100b();
                }
                if (C52711k.m112239a((Object) ((EffectCategoryResponse) next).getId(), (Object) effectCategoryResponse.getId())) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (z && effectCategoryResponse != null) {
            List list = (List) this.f82752a.get(effectCategoryResponse);
            if (list != null) {
                C31459g gVar = (C31459g) C52575l.m112140f(list);
                if (gVar != null) {
                    this.f82760i.mo64494a(gVar, 0);
                }
            }
        }
        if (i >= 0 && this.f82757f.getSelectedTabPosition() != i) {
            C44709f a = this.f82757f.mo90679a(i);
            if (a != null) {
                a.mo90744a();
            }
        } else if (i < 0) {
            if (this.f82757f.getCurSelectedTab() != null) {
                C44709f curSelectedTab = this.f82757f.getCurSelectedTab();
                C52711k.m112236a((Object) curSelectedTab, "tabLayout.curSelectedTab");
                View view = curSelectedTab.f113162f;
                if (!(view instanceof AVDmtTabItemView)) {
                    view = null;
                }
                AVDmtTabItemView aVDmtTabItemView = (AVDmtTabItemView) view;
                if (aVDmtTabItemView != null) {
                    aVDmtTabItemView.setSelected(false);
                }
            }
            this.f82757f.mo90698d();
        }
    }

    public C31684g(C31613h hVar, TabLayout tabLayout, C31634f fVar) {
        C52711k.m112240b(hVar, "filterListView");
        C52711k.m112240b(tabLayout, "tabLayout");
        this.f82760i = hVar;
        this.f82757f = tabLayout;
        this.f82758g = fVar;
        C2180b l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create()");
        this.f82755d = l;
        C2180b l2 = C2180b.m6534l();
        C52711k.m112236a((Object) l2, "PublishSubject.create()");
        this.f82756e = l2;
        this.f82759h = new C1689b();
        this.f82759h.mo6181a(this.f82760i.mo64495b().mo6505a((C1710e<? super T>) new C31687c<Object>(this), C1723a.f5846e));
        this.f82759h.mo6181a(this.f82760i.mo64497c().mo6505a((C1710e<? super T>) new C31688d<Object>(this), C1723a.f5846e));
        this.f82759h.mo6181a(this.f82760i.mo64498d().mo6505a((C1710e<? super T>) new C31689e<Object>(this), C1723a.f5846e));
        this.f82757f.mo90683a((C44704c) new C31690f(this));
        this.f82757f.setOnTabClickListener(C31691g.f82769a);
    }
}
