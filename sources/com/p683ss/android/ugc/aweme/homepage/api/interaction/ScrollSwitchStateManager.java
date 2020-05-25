package com.p683ss.android.ugc.aweme.homepage.api.interaction;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23695i;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager.C23638a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p2628d.C52847n;
import p2628d.C52855s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager */
public class ScrollSwitchStateManager extends C0209x {

    /* renamed from: q */
    public static final C32969a f85666q = new C32969a(null);

    /* renamed from: A */
    private C0198r<Boolean> f85667A = new C0198r<>();

    /* renamed from: a */
    public final C32972b f85668a = new C32972b();

    /* renamed from: b */
    public final C0198r<Integer> f85669b = new C0198r<>();

    /* renamed from: c */
    public final C0198r<C32977f> f85670c = new C0198r<>();

    /* renamed from: d */
    public final C23275b<String> f85671d = new C23275b<>();

    /* renamed from: e */
    public final C0198r<Boolean> f85672e = new C0198r<>();

    /* renamed from: f */
    public C0198r<Fragment> f85673f = new C0198r<>();

    /* renamed from: g */
    public String f85674g;

    /* renamed from: h */
    public C32971a f85675h;

    /* renamed from: i */
    public C0198r<SparseArray<Fragment>> f85676i = new C0198r<>();

    /* renamed from: j */
    public WeakReference<Fragment> f85677j;

    /* renamed from: k */
    public final C0198r<Integer> f85678k = new C0198r<>();

    /* renamed from: l */
    public final C0198r<C52855s<Integer, Float, Integer>> f85679l = new C0198r<>();

    /* renamed from: m */
    public C32976e f85680m;

    /* renamed from: n */
    public final C0198r<Boolean> f85681n = new C0198r<>();

    /* renamed from: o */
    public final C32972b f85682o = new C32972b();

    /* renamed from: p */
    public C32975d f85683p;

    /* renamed from: r */
    private final C0198r<List<C23695i>> f85684r = new C0198r<>();

    /* renamed from: s */
    private final C0198r<HashMap<Integer, C23689d>> f85685s = new C0198r<>();

    /* renamed from: t */
    private final C0198r<Boolean> f85686t = new C0198r<>();

    /* renamed from: u */
    private final C0198r<String> f85687u = new C0198r<>();

    /* renamed from: v */
    private final C0198r<Integer> f85688v = new C0198r<>();

    /* renamed from: w */
    private final C0198r<C52855s<Integer, Float, Integer>> f85689w = new C0198r<>();

    /* renamed from: x */
    private final C23275b<String> f85690x = new C23275b<>();

    /* renamed from: y */
    private final C0198r<C23638a> f85691y = new C0198r<>();

    /* renamed from: z */
    private final C0198r<C52847n<String, Boolean>> f85692z = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager$a */
    public static final class C32969a {

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager$a$a */
        public static final class C32970a implements C0212b {
            C32970a() {
            }

            /* renamed from: a */
            public final <T extends C0209x> T mo361a(Class<T> cls) {
                C52711k.m112240b(cls, "modelClass");
                return (C0209x) new ScrollSwitchStateManager();
            }
        }

        private C32969a() {
        }

        public /* synthetic */ C32969a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static ScrollSwitchStateManager m75907a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m441a(fragmentActivity, (C0212b) new C32970a()).mo359a(ScrollSwitchStateManager.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…StateManager::class.java)");
            return (ScrollSwitchStateManager) a;
        }
    }

    /* renamed from: a */
    public static final ScrollSwitchStateManager m75876a(FragmentActivity fragmentActivity) {
        return C32969a.m75907a(fragmentActivity);
    }

    /* renamed from: a */
    public final boolean mo69864a() {
        return this.f85668a.f85693a;
    }

    /* renamed from: a */
    public final void mo69862a(List<? extends C23695i> list) {
        C52711k.m112240b(list, "mainPages");
        this.f85684r.setValue(list);
    }

    /* renamed from: a */
    public final void mo69861a(HashMap<Integer, C23689d> hashMap) {
        C52711k.m112240b(hashMap, "fragments");
        this.f85685s.setValue(hashMap);
    }

    /* renamed from: a */
    public final void mo69863a(boolean z) {
        this.f85686t.setValue(Boolean.valueOf(z));
    }

    /* renamed from: d */
    private String m75877d() {
        if (!mo69864a()) {
            return "";
        }
        return mo69853a(this.f85668a.getValue().intValue());
    }

    /* renamed from: b */
    public final boolean mo69867b() {
        Object value = this.f85686t.getValue();
        if (value == null) {
            C52711k.m112234a();
        }
        return ((Boolean) value).booleanValue();
    }

    /* renamed from: c */
    public final Fragment mo69870c() {
        Fragment fragment = (Fragment) this.f85673f.getValue();
        if (this.f85673f.getValue() == null) {
            return null;
        }
        return fragment;
    }

    public ScrollSwitchStateManager() {
        this.f85686t.setValue(Boolean.valueOf(true));
    }

    /* renamed from: c */
    public final void mo69871c(int i) {
        this.f85688v.setValue(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final C23689d mo69873d(String str) {
        C52711k.m112240b(str, "pageName");
        return mo69865b(mo69869c(str));
    }

    /* renamed from: f */
    public final void mo69879f(String str) {
        C52711k.m112240b(str, "showPage");
        this.f85687u.setValue(str);
    }

    /* renamed from: g */
    public final void mo69881g(String str) {
        C52711k.m112240b(str, "bottomTabName");
        this.f85690x.setValue(str);
    }

    /* renamed from: b */
    public final C23689d mo69865b(int i) {
        if (this.f85685s.getValue() != null) {
            Object value = this.f85685s.getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            if (!((HashMap) value).isEmpty()) {
                Object value2 = this.f85685s.getValue();
                if (value2 == null) {
                    C52711k.m112234a();
                }
                return (C23689d) ((HashMap) value2).get(Integer.valueOf(i));
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo69874d(int i) {
        this.f85669b.setValue(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final String mo69853a(int i) {
        int i2;
        Integer num;
        if (this.f85684r.getValue() == null) {
            i2 = 0;
        } else {
            List list = (List) this.f85684r.getValue();
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (num == null) {
                C52711k.m112234a();
            }
            i2 = num.intValue();
        }
        if (i < 0 || i >= i2) {
            return "";
        }
        Object value = this.f85684r.getValue();
        if (value == null) {
            C52711k.m112234a();
        }
        String str = ((C23695i) ((List) value).get(i)).f63200b;
        C52711k.m112236a((Object) str, "mainPages.value!![index].pageName");
        return str;
    }

    /* renamed from: b */
    public final boolean mo69868b(String str) {
        C52711k.m112240b(str, "pageName");
        return TextUtils.equals(str, m75877d());
    }

    /* renamed from: c */
    public final int mo69869c(String str) {
        int i;
        if (this.f85684r.getValue() == null) {
            i = 0;
        } else {
            Object value = this.f85684r.getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            i = ((List) value).size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            CharSequence charSequence = str;
            Object value2 = this.f85684r.getValue();
            if (value2 == null) {
                C52711k.m112234a();
            }
            if (TextUtils.equals(charSequence, ((C23695i) ((List) value2).get(i2)).f63200b)) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[LOOP:0: B:8:0x0022->B:19:0x0047, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo69877e(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "pageName"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            android.arch.lifecycle.r<java.util.List<com.ss.android.ugc.aweme.base.ui.i>> r0 = r5.f85684r
            java.lang.Object r0 = r0.getValue()
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0021
        L_0x0010:
            android.arch.lifecycle.r<java.util.List<com.ss.android.ugc.aweme.base.ui.i>> r0 = r5.f85684r
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x001b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x001b:
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 >= r0) goto L_0x004a
            r3 = r6
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            android.arch.lifecycle.r<java.util.List<com.ss.android.ugc.aweme.base.ui.i>> r4 = r5.f85684r
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r4.get(r2)
            com.ss.android.ugc.aweme.base.ui.i r4 = (com.p683ss.android.ugc.aweme.base.p1420ui.C23695i) r4
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = r4.f63200b
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0047
            r6 = 1
            return r6
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.mo69877e(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo69857a(C23638a aVar) {
        C52711k.m112240b(aVar, "checker");
        this.f85691y.setValue(aVar);
    }

    /* renamed from: a */
    public final void mo69858a(C32974c cVar) {
        C52711k.m112240b(cVar, "dataStreamBridge");
        this.f85668a.mo69886a(cVar);
    }

    /* renamed from: a */
    public final void mo69859a(String str) {
        C52711k.m112240b(str, "pageName");
        this.f85668a.mo69883a(mo69869c(str));
    }

    /* renamed from: a */
    public final void mo69855a(int i, boolean z) {
        this.f85682o.mo69884a(i, false);
    }

    /* renamed from: b */
    public final void mo69866b(C0184k kVar, C0199s<String> sVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(sVar, "observer");
        this.f85687u.observe(kVar, sVar);
    }

    /* renamed from: e */
    public final void mo69876e(C0184k kVar, C0199s<C52855s<Integer, Float, Integer>> sVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(sVar, "observer");
        this.f85689w.observe(kVar, sVar);
    }

    /* renamed from: f */
    public final void mo69878f(C0184k kVar, C0199s<String> sVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(sVar, "observer");
        this.f85690x.observe(kVar, sVar);
    }

    /* renamed from: g */
    public final void mo69880g(C0184k kVar, C0199s<C23638a> sVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(sVar, "observer");
        this.f85691y.observe(kVar, sVar);
    }

    /* renamed from: a */
    public final void mo69856a(C0184k kVar, C0199s<Boolean> sVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(sVar, "observer");
        this.f85686t.observe(kVar, sVar);
    }

    /* renamed from: c */
    public final void mo69872c(C0184k kVar, C0199s<Integer> sVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(sVar, "observer");
        this.f85688v.observe(kVar, sVar);
    }

    /* renamed from: d */
    public final void mo69875d(C0184k kVar, C0199s<Integer> sVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(sVar, "observer");
        this.f85669b.observe(kVar, sVar);
    }

    /* renamed from: a */
    public final void mo69860a(String str, boolean z) {
        C52711k.m112240b(str, "pageName");
        this.f85668a.mo69884a(mo69869c(str), z);
    }

    /* renamed from: a */
    public final void mo69854a(int i, float f, int i2) {
        this.f85689w.setValue(new C52855s(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)));
    }
}
