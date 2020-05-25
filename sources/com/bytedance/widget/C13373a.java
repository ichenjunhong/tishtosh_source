package com.bytedance.widget;

import android.arch.lifecycle.C0176h;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.widget.a */
public final class C13373a extends Fragment {

    /* renamed from: d */
    public static final String f34869d = C13373a.class.getCanonicalName();

    /* renamed from: e */
    public static final C13374a f34870e = new C13374a(null);

    /* renamed from: a */
    public Fragment f34871a;

    /* renamed from: b */
    final List<Object> f34872b = new ArrayList();

    /* renamed from: c */
    final Set<C52670a<C52860x>> f34873c = new LinkedHashSet();

    /* renamed from: f */
    private final HashMap<Integer, Widget> f34874f = new HashMap<>();

    /* renamed from: g */
    private final Map<C0176h, C13376b> f34875g = new WeakHashMap();

    /* renamed from: h */
    private HashMap f34876h;

    /* renamed from: com.bytedance.widget.a$a */
    public static final class C13374a {

        /* renamed from: com.bytedance.widget.a$a$a */
        public static final class C13375a extends C0655a {

            /* renamed from: a */
            final /* synthetic */ C13373a f34877a;

            C13375a(C13373a aVar) {
                this.f34877a = aVar;
            }

            public final void onFragmentViewDestroyed(C0654k kVar, Fragment fragment) {
                C52711k.m112240b(kVar, "fm");
                C52711k.m112240b(fragment, "f");
                if (fragment == this.f34877a.f34871a) {
                    kVar.mo2228a((C0655a) this);
                    fragment.getChildFragmentManager().mo2225a().mo2177a((Fragment) this.f34877a).mo2200e();
                    C13373a aVar = this.f34877a;
                    for (C52670a invoke : aVar.f34873c) {
                        invoke.invoke();
                    }
                    aVar.f34873c.clear();
                }
            }
        }

        private C13374a() {
        }

        public /* synthetic */ C13374a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final Context mo25068a() {
        Context requireContext = requireContext();
        C52711k.m112236a((Object) requireContext, "requireContext()");
        return requireContext;
    }

    /* renamed from: b */
    public final Object mo25072b() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        Object requireHost = requireHost();
        C52711k.m112236a(requireHost, "requireHost()");
        return requireHost;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f34876h != null) {
            this.f34876h.clear();
        }
    }

    /* renamed from: a */
    public final C13376b mo25069a(C0176h hVar) {
        C52711k.m112240b(hVar, "lifecycle");
        return (C13376b) this.f34875g.get(hVar);
    }

    /* renamed from: a */
    public final void mo25071a(Widget widget) {
        C52711k.m112240b(widget, "widget");
        Iterator it = this.f34872b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (widget.f34863f) {
            widget.f34863f = false;
        }
    }

    /* renamed from: a */
    public final void mo25070a(C0176h hVar, C13376b bVar) {
        C52711k.m112240b(hVar, "lifecycle");
        C52711k.m112240b(bVar, "manager");
        this.f34875g.put(hVar, bVar);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f34874f.get(Integer.valueOf(i));
        this.f34874f.remove(Integer.valueOf(i));
    }
}
