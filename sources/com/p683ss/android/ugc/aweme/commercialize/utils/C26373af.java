package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.support.p019b.C0260c;
import android.support.p019b.C0296m;
import android.support.p019b.C0304o;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2643g.C52733a;
import p2628d.p2647j.C52753d;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.af */
public final class C26373af {

    /* renamed from: a */
    public static final C26373af f69584a = new C26373af();

    /* renamed from: b */
    private static final int f69585b = R.id.cx;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.af$a */
    static final class C26374a extends C52712l implements C52671b<Integer, View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f69586a;

        C26374a(ViewGroup viewGroup) {
            this.f69586a = viewGroup;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return this.f69586a.getChildAt(((Number) obj).intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.af$b */
    static final class C26375b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f69587a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f69588b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f69589c;

        C26375b(View view, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f69587a = view;
            this.f69588b = viewGroup;
            this.f69589c = viewGroup2;
        }

        public final void run() {
            C26373af.f69584a.mo54097a(this.f69588b, this.f69589c, this.f69587a);
        }
    }

    private C26373af() {
    }

    /* renamed from: b */
    private static C52785g<View> m63824b(ViewGroup viewGroup) {
        return C52786h.m112348d(C52575l.m112148k(C52753d.m112320b(0, viewGroup.getChildCount())), new C26374a(viewGroup));
    }

    /* renamed from: a */
    public static final void m63821a(ViewGroup viewGroup) {
        int i;
        boolean z;
        boolean z2;
        long j;
        if (viewGroup != null) {
            Iterator a = C52786h.m112350e(m63824b(viewGroup)).mo110157a();
            while (true) {
                i = 8;
                if (!a.hasNext()) {
                    break;
                }
                View view = (View) a.next();
                Object tag = view.getTag(f69585b);
                if (!(tag instanceof Long)) {
                    tag = null;
                }
                Long l = (Long) tag;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (j > 0) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            C26373af afVar = f69584a;
            Iterator a2 = m63824b(viewGroup).mo110157a();
            while (true) {
                z = true;
                if (!a2.hasNext()) {
                    z = false;
                    break;
                }
                if (((View) a2.next()).getVisibility() == 0) {
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
            if (z) {
                i = 0;
            }
            viewGroup.setVisibility(i);
        }
    }

    /* renamed from: a */
    private static void m63823a(ViewGroup viewGroup, C0296m... mVarArr) {
        if (viewGroup != null) {
            try {
                C0304o.m646a(viewGroup, mVarArr[0]);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: a */
    public static final void m63820a(View view, AwemeTextLabelModel awemeTextLabelModel) {
        long j;
        if (view != null) {
            if (awemeTextLabelModel != null) {
                j = C52733a.m112279b(awemeTextLabelModel.getShowSeconds() * 1000.0f);
            } else {
                j = 0;
            }
            view.setTag(f69585b, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static final void m63822a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        long j;
        if (viewGroup2 != null) {
            Iterator a = C52786h.m112350e(m63824b(viewGroup2)).mo110157a();
            while (a.hasNext()) {
                View view = (View) a.next();
                Object tag = view.getTag(f69585b);
                if (!(tag instanceof Long)) {
                    tag = null;
                }
                Long l = (Long) tag;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (j > 0) {
                    view.postDelayed(new C26375b(view, viewGroup, viewGroup2), j);
                } else {
                    f69584a.mo54097a(viewGroup, viewGroup2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54097a(ViewGroup viewGroup, View view, View view2) {
        long j;
        C52711k.m112240b(view, "tagLayout");
        C52711k.m112240b(view2, "child");
        if (view2.getVisibility() != 0) {
            Object tag = view2.getTag(f69585b);
            if (!(tag instanceof Long)) {
                tag = null;
            }
            Long l = (Long) tag;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            view2.setVisibility(0);
            if (j <= 0 || view.getVisibility() != 0) {
                view2.setAlpha(1.0f);
                m63823a(viewGroup, new C0260c());
                view.setVisibility(0);
                return;
            }
            view2.setAlpha(0.0f);
            view2.animate().alpha(1.0f).setDuration(200).start();
        }
    }
}
