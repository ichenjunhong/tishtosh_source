package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.os.Bundle;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.lego.p1913a.C35880a.C35881a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.az */
public abstract class C28525az extends C23526a implements C35881a {

    /* renamed from: t */
    public static final String f74951t = f74951t;

    /* renamed from: u */
    public static final String f74952u = f74952u;

    /* renamed from: v */
    public static final int f74953v = 1;

    /* renamed from: w */
    public static final int f74954w = f74954w;

    /* renamed from: x */
    public static final C28526a f74955x = new C28526a(null);

    /* renamed from: a */
    private HashMap f74956a;

    /* renamed from: e */
    public C41440e f74957e;

    /* renamed from: j */
    public C41440e f74958j;

    /* renamed from: k */
    public C27797ad f74959k = new C27797ad(true);

    /* renamed from: l */
    public String f74960l = "";

    /* renamed from: m */
    public String f74961m = "";

    /* renamed from: n */
    public int f74962n = C28608ca.f75136d;

    /* renamed from: o */
    public int f74963o;

    /* renamed from: p */
    public String f74964p = "";

    /* renamed from: q */
    public String f74965q = "";

    /* renamed from: r */
    public int f74966r;

    /* renamed from: s */
    public int f74967s = 1;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.az$a */
    public static final class C28526a {
        private C28526a() {
        }

        /* renamed from: a */
        public static int m67668a() {
            return C28525az.f74953v;
        }

        public /* synthetic */ C28526a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public View mo56545a(int i) {
        if (this.f74956a == null) {
            this.f74956a = new HashMap();
        }
        View view = (View) this.f74956a.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f74956a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public void mo58192b(C41440e eVar) {
        C52711k.m112240b(eVar, "searchResultParam");
    }

    /* renamed from: j */
    public void mo56548j() {
        if (this.f74956a != null) {
            this.f74956a.clear();
        }
    }

    /* renamed from: l */
    public abstract String mo56549l();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo56548j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo58194c(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f74965q = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58193b(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f74964p = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C27797ad adVar = this.f74959k;
        String l = mo56549l();
        C52711k.m112240b(l, "<set-?>");
        adVar.f73041d = l;
    }
}
