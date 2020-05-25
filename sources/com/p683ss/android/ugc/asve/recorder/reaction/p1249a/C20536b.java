package com.p683ss.android.ugc.asve.recorder.reaction.p1249a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.asve.recorder.reaction.C20531a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.b */
public final class C20536b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56252a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20536b.class), "windowBoundaryView", "getWindowBoundaryView()Landroid/view/View;"))};

    /* renamed from: b */
    private final C52668f f56253b;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.b$a */
    static final class C20537a extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C20531a f56254a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f56255b;

        /* renamed from: c */
        final /* synthetic */ View f56256c;

        C20537a(C20531a aVar, ViewGroup viewGroup, View view) {
            this.f56254a = aVar;
            this.f56255b = viewGroup;
            this.f56256c = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int[] c = this.f56254a.mo43574c();
            if (c == null) {
                return null;
            }
            View view = new View(this.f56255b.getContext());
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.topMargin = this.f56256c.getTop() + c[0];
            layoutParams.height = (this.f56256c.getHeight() - c[0]) - c[1];
            layoutParams.leftMargin = this.f56256c.getLeft() + c[2];
            layoutParams.width = (this.f56256c.getWidth() - c[2]) - c[3];
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
            }
            layoutParams.gravity = 0;
            view.setBackgroundResource(this.f56254a.mo43569a().mo43185g());
            this.f56255b.addView(view, layoutParams);
            return view;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo43588a() {
        return (View) this.f56253b.getValue();
    }

    public C20536b(ViewGroup viewGroup, View view, C20531a aVar) {
        C52711k.m112240b(viewGroup, "rootView");
        C52711k.m112240b(view, "presentView");
        C52711k.m112240b(aVar, "reactionCtrl");
        this.f56253b = C52732g.m112285a(new C20537a(aVar, viewGroup, view));
    }
}
