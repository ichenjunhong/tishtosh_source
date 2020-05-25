package com.p683ss.android.ugc.aweme.p1807im.sdk.p1811b;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34544a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35470g;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.b.d */
public final class C33289d extends C33266a {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f86342d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33289d.class), "icon", "getIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33289d.class), "title", "getTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33289d.class), "desc", "getDesc()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33289d.class), "button", "getButton()Lcom/bytedance/ies/dmt/ui/widget/DmtButton;"))};

    /* renamed from: e */
    public static final C33290a f86343e = new C33290a(null);

    /* renamed from: f */
    private final C52668f f86344f;

    /* renamed from: g */
    private final C52668f f86345g;

    /* renamed from: h */
    private final C52668f f86346h;

    /* renamed from: i */
    private final C52668f f86347i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.d$a */
    public static final class C33290a {
        private C33290a() {
        }

        public /* synthetic */ C33290a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.d$b */
    static final class C33291b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33289d f86348a;

        /* renamed from: b */
        final /* synthetic */ C34544a f86349b;

        C33291b(C33289d dVar, C34544a aVar) {
            this.f86348a = dVar;
            this.f86349b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C33289d dVar = this.f86348a;
            C52711k.m112236a((Object) view, "it");
            dVar.mo70620a(view, this.f86349b.f89050b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.d$c */
    static final class C33292c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33289d f86350a;

        /* renamed from: b */
        final /* synthetic */ C34544a f86351b;

        C33292c(C33289d dVar, C34544a aVar) {
            this.f86350a = dVar;
            this.f86351b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C33289d dVar = this.f86350a;
            C52711k.m112236a((Object) view, "it");
            dVar.mo70620a(view, this.f86351b.f89050b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.d$d */
    static final class C33293d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33289d f86352a;

        /* renamed from: b */
        final /* synthetic */ C34544a f86353b;

        C33293d(C33289d dVar, C34544a aVar) {
            this.f86352a = dVar;
            this.f86353b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C33289d dVar = this.f86352a;
            C52711k.m112236a((Object) view, "it");
            dVar.mo70620a(view, this.f86353b.f89050b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.d$e */
    static final class C33294e extends C52712l implements C52670a<DmtButton> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86354a;

        C33294e(ViewGroup viewGroup) {
            this.f86354a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtButton) this.f86354a.findViewById(R.id.e0q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.d$f */
    static final class C33295f extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86355a;

        C33295f(ViewGroup viewGroup) {
            this.f86355a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f86355a.findViewById(R.id.f2m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.d$g */
    static final class C33296g extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86356a;

        C33296g(ViewGroup viewGroup) {
            this.f86356a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RemoteImageView) this.f86356a.findViewById(R.id.ef3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.d$h */
    static final class C33297h extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86357a;

        C33297h(ViewGroup viewGroup) {
            this.f86357a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f86357a.findViewById(R.id.f2n);
        }
    }

    /* renamed from: a */
    private final RemoteImageView m76406a() {
        return (RemoteImageView) this.f86344f.getValue();
    }

    /* renamed from: b */
    private final DmtButton m76407b() {
        return (DmtButton) this.f86347i.getValue();
    }

    public C33289d(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "layout");
        super(viewGroup);
        this.f86344f = C52732g.m112285a(new C33296g(viewGroup));
        this.f86345g = C52732g.m112285a(new C33297h(viewGroup));
        this.f86346h = C52732g.m112285a(new C33295f(viewGroup));
        this.f86347i = C52732g.m112285a(new C33294e(viewGroup));
    }

    /* renamed from: a */
    public final void mo70620a(View view, String str) {
        boolean z;
        if (!C35200an.m79575a(view, 500)) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = null;
            }
            if (str != null) {
                C34004b a = C34004b.m77717a();
                C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                C35460j f = a.mo71949f();
                if (f != null) {
                    f.jumpToDeepLink(this.f86290a, str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70613a(C34544a aVar, boolean z) {
        C52711k.m112240b(aVar, "acBannerData");
        this.f86292c.setVisibility(0);
        C35470g gVar = aVar.f89049a;
        if (gVar != null) {
            UrlModel urlModel = gVar.f91187a;
            if (urlModel != null) {
                C23515d.m57669a(m76406a(), urlModel);
            }
        }
        String str = aVar.f89051c;
        if (str != null) {
            DmtTextView dmtTextView = (DmtTextView) this.f86345g.getValue();
            C52711k.m112236a((Object) dmtTextView, "title");
            dmtTextView.setText(str);
        }
        String str2 = aVar.f89052d;
        if (str2 != null) {
            DmtTextView dmtTextView2 = (DmtTextView) this.f86346h.getValue();
            C52711k.m112236a((Object) dmtTextView2, "desc");
            dmtTextView2.setText(str2);
        }
        String str3 = aVar.f89053e;
        if (str3 != null) {
            DmtButton b = m76407b();
            C52711k.m112236a((Object) b, "button");
            b.setText(str3);
        }
        this.f86292c.setOnClickListener(new C33291b(this, aVar));
        m76407b().setOnClickListener(new C33292c(this, aVar));
        m76406a().setOnClickListener(new C33293d(this, aVar));
        if (z) {
            C35190af.m79494d();
        }
    }
}
