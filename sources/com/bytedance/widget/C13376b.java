package com.bytedance.widget;

import android.arch.lifecycle.C0176h;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.C1028c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.widget.C13373a.C13374a.C13375a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.widget.b */
public final class C13376b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f34878a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C13376b.class), "asyncLayoutInflater", "getAsyncLayoutInflater()Landroid/support/v4/view/AsyncLayoutInflater;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C13376b.class), "syncLayoutInflater", "getSyncLayoutInflater()Landroid/view/LayoutInflater;"))};

    /* renamed from: h */
    public static final C13378a f34879h = new C13378a(null);

    /* renamed from: b */
    public final C52668f f34880b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<Widget> f34881c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public final HashMap<Widget, ViewGroup> f34882d = new HashMap<>();

    /* renamed from: e */
    public C13373a f34883e;

    /* renamed from: f */
    public final View f34884f;

    /* renamed from: g */
    public final C0176h f34885g;

    /* renamed from: i */
    private final C52668f f34886i;

    /* renamed from: com.bytedance.widget.b$a */
    public static final class C13378a {
        private C13378a() {
        }

        public /* synthetic */ C13378a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C13376b mo25076a(Fragment fragment, View view) {
            C52711k.m112240b(fragment, "fragment");
            if (fragment == null) {
                C52711k.m112234a();
            }
            C0654k childFragmentManager = fragment.getChildFragmentManager();
            C52711k.m112236a((Object) childFragmentManager, "fragment!!.childFragmentManager");
            Fragment a = childFragmentManager.mo2224a(C13373a.f34869d);
            if (!(a instanceof C13373a)) {
                a = null;
            }
            C13373a aVar = (C13373a) a;
            if (aVar == null) {
                aVar = new C13373a();
                aVar.f34871a = fragment;
                if (fragment != null) {
                    C0654k fragmentManager = fragment.getFragmentManager();
                    if (fragmentManager != null) {
                        fragmentManager.mo2229a((C0655a) new C13375a(aVar), false);
                    }
                }
                childFragmentManager.mo2225a().mo2178a((Fragment) aVar, C13373a.f34869d).mo2200e();
            }
            C0176h lifecycle = aVar.getLifecycle();
            C52711k.m112236a((Object) lifecycle, "it.lifecycle");
            return m26978a(lifecycle, aVar, view);
        }

        /* renamed from: a */
        public static C13376b m26978a(C0176h hVar, C13373a aVar, View view) {
            C52711k.m112240b(hVar, "lifecycle");
            C52711k.m112240b(aVar, "widgetHost");
            C13376b a = aVar.mo25069a(hVar);
            if (a != null) {
                return a;
            }
            C13376b bVar = new C13376b(aVar, view, hVar);
            aVar.mo25070a(hVar, bVar);
            return bVar;
        }
    }

    /* renamed from: com.bytedance.widget.b$b */
    static final class C13379b extends C52712l implements C52670a<C1028c> {

        /* renamed from: a */
        final /* synthetic */ C13373a f34888a;

        C13379b(C13373a aVar) {
            this.f34888a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C1028c(this.f34888a.mo25068a());
        }
    }

    /* renamed from: com.bytedance.widget.b$c */
    static final class C13380c extends C52712l implements C52670a<LayoutInflater> {

        /* renamed from: a */
        final /* synthetic */ C13373a f34889a;

        C13380c(C13373a aVar) {
            this.f34889a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return LayoutInflater.from(this.f34889a.mo25068a());
        }
    }

    /* renamed from: a */
    public final C13373a mo25073a() {
        C13373a aVar = this.f34883e;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final C13376b mo25074a(Widget widget) {
        C52711k.m112240b(widget, "widget");
        if (this.f34881c.contains(widget)) {
            return this;
        }
        widget.f34859b = mo25073a();
        this.f34881c.add(widget);
        mo25073a().mo25071a(widget);
        this.f34885g.mo324a(widget);
        return this;
    }

    public C13376b(C13373a aVar, View view, C0176h hVar) {
        C52711k.m112240b(aVar, "widgetHost");
        C52711k.m112240b(hVar, "parentLifecycle");
        this.f34884f = view;
        this.f34885g = hVar;
        this.f34886i = C52732g.m112285a(new C13379b(aVar));
        this.f34880b = C52732g.m112285a(new C13380c(aVar));
        this.f34883e = aVar;
        C52670a r3 = new C52670a<C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ C13376b f34887a;

            {
                this.f34887a = r1;
            }

            public final /* synthetic */ Object invoke() {
                for (Widget widget : this.f34887a.f34881c) {
                    C13376b bVar = this.f34887a;
                    C52711k.m112236a((Object) widget, "it");
                    C52711k.m112240b(widget, "widget");
                    bVar.f34885g.mo325b(widget);
                    switch (C13381c.f34890a[bVar.f34885g.mo323a().ordinal()]) {
                        case 2:
                            if (!widget.f34860c) {
                                widget.destroy$widget_release();
                                break;
                            }
                            break;
                        case 3:
                            widget.destroy$widget_release();
                            break;
                        case 4:
                            widget.stop$widget_release();
                            widget.destroy$widget_release();
                            break;
                        case 5:
                            widget.pause$widget_release();
                            widget.stop$widget_release();
                            widget.destroy$widget_release();
                            break;
                    }
                    widget.f34859b = null;
                    bVar.f34881c.remove(widget);
                    if (bVar.f34882d.containsKey(widget)) {
                        ViewGroup viewGroup = (ViewGroup) bVar.f34882d.get(widget);
                        if (viewGroup == null) {
                            C52711k.m112234a();
                        }
                        viewGroup.removeAllViews();
                        bVar.f34882d.remove(widget);
                    }
                    C13373a a = bVar.mo25073a();
                    C52711k.m112240b(widget, "widget");
                    Iterator it = a.f34872b.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                this.f34887a.f34881c.clear();
                this.f34887a.f34883e = null;
                return C52860x.f131107a;
            }
        };
        C52711k.m112240b(r3, "listener");
        aVar.f34873c.add(r3);
    }

    /* renamed from: a */
    public final void mo25075a(Widget widget, ViewGroup viewGroup, View view) {
        widget.mo25051a(view);
        viewGroup.addView(view);
        this.f34881c.add(widget);
        mo25073a().mo25071a(widget);
        this.f34885g.mo324a(widget);
    }
}
