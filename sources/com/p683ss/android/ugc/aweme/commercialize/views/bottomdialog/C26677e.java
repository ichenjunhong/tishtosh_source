package com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.e */
public final class C26677e extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f70288a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26677e.class), "singleLineContainer", "getSingleLineContainer()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26677e.class), "multipleLineContainer", "getMultipleLineContainer()Landroid/widget/LinearLayout;"))};

    /* renamed from: b */
    public static final C26678a f70289b = new C26678a(null);

    /* renamed from: c */
    private final C52668f f70290c;

    /* renamed from: d */
    private final C52668f f70291d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.e$a */
    public static final class C26678a {
        private C26678a() {
        }

        public /* synthetic */ C26678a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.e$b */
    static final class C26679b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26663c f70292a;

        /* renamed from: b */
        final /* synthetic */ int f70293b;

        C26679b(C26663c cVar, int i) {
            this.f70292a = cVar;
            this.f70293b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f70292a.mo54488a(this.f70293b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.e$c */
    static final class C26680c extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ View f70294a;

        C26680c(View view) {
            this.f70294a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f70294a.findViewById(R.id.em0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.e$d */
    static final class C26681d extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ View f70295a;

        C26681d(View view) {
            this.f70295a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f70295a.findViewById(R.id.ew1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final FrameLayout mo54494a() {
        return (FrameLayout) this.f70290c.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final LinearLayout mo54495b() {
        return (LinearLayout) this.f70291d.getValue();
    }

    public C26677e(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f70290c = C52732g.m112285a(new C26681d(view));
        this.f70291d = C52732g.m112285a(new C26680c(view));
    }
}
