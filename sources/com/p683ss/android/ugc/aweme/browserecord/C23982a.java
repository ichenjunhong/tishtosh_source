package com.p683ss.android.ugc.aweme.browserecord;

import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23278c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C36674a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.browserecord.a */
public final class C23982a extends C11079a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63659a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23982a.class), "params", "getParams()Lcom/ss/android/ugc/aweme/feed/param/FeedParam;"))};

    /* renamed from: j */
    public static final C23983a f63660j = new C23983a(null);

    /* renamed from: b */
    public DataCenter f63661b;

    /* renamed from: c */
    public C30313ae<C30332aw> f63662c;

    /* renamed from: d */
    public int f63663d;

    /* renamed from: e */
    public BrowseRecordWidget f63664e;

    /* renamed from: k */
    private C23279d f63665k;

    /* renamed from: l */
    private final C52668f f63666l = C52732g.m112286a(C52757k.NONE, new C23985c(this));

    /* renamed from: m */
    private HashMap f63667m;

    /* renamed from: com.ss.android.ugc.aweme.browserecord.a$a */
    public static final class C23983a {
        private C23983a() {
        }

        public /* synthetic */ C23983a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.a$b */
    static final class C23984b implements C36674a {

        /* renamed from: a */
        final /* synthetic */ C23982a f63668a;

        C23984b(C23982a aVar) {
            this.f63668a = aVar;
        }

        /* renamed from: a */
        public final void mo49729a(Aweme aweme) {
            if (aweme != null) {
                DataCenter dataCenter = this.f63668a.f63661b;
                if (dataCenter != null) {
                    dataCenter.mo48228a("aweme_changed", (Object) aweme);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.a$c */
    static final class C23985c extends C52712l implements C52670a<C30669b> {

        /* renamed from: a */
        final /* synthetic */ C23982a f63669a;

        C23985c(C23982a aVar) {
            this.f63669a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Serializable serializable;
            Bundle arguments = this.f63669a.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("feed_param");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C30669b)) {
                serializable = null;
            }
            return (C30669b) serializable;
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f63667m != null) {
            this.f63667m.clear();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C0184k kVar = this;
        AwemeChangeCallBack.m82602a(getActivity(), kVar, new C23984b(this));
        Fragment fragment = this;
        this.f63661b = DataCenter.m57235a(C23278c.m57254a(fragment, this), kVar);
        this.f63665k = C23279d.m57256a(fragment, view);
        C23279d dVar = this.f63665k;
        if (dVar != null) {
            dVar.mo48252a(this.f63661b);
        }
        this.f63664e = new BrowseRecordWidget(this.f63662c);
        C23279d dVar2 = this.f63665k;
        if (dVar2 != null) {
            BrowseRecordWidget browseRecordWidget = this.f63664e;
            if (browseRecordWidget == null) {
                C52711k.m112237a("mBrowseRecordWidget");
            }
            dVar2.mo48250a((int) R.id.e9z, (Widget) browseRecordWidget);
        }
        DataCenter dataCenter = this.f63661b;
        if (dataCenter != null) {
            dataCenter.mo48228a("params", (Object) (C30669b) this.f63666l.getValue()).mo48228a("init_index", (Object) Integer.valueOf(this.f63663d));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b8p, viewGroup, false);
    }
}
