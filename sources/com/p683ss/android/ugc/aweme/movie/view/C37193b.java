package com.p683ss.android.ugc.aweme.movie.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12187e;
import com.bytedance.lighten.p766a.C12187e.C12189a;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p770d.C12186c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.base.C27321a;
import com.p683ss.android.ugc.aweme.detail.base.C27323c;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.christmas.C31361b;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.movie.p1968b.C37179c;
import com.p683ss.android.ugc.aweme.p684l.C10912c;
import com.p683ss.android.ugc.aweme.p684l.C10912c.C10914b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.movie.view.b */
public final class C37193b implements C37210g {

    /* renamed from: a */
    public final Context f94944a;

    /* renamed from: b */
    public final String f94945b;

    /* renamed from: d */
    private DmtTextView f94946d;

    /* renamed from: e */
    private RemoteImageView f94947e;

    /* renamed from: f */
    private DmtTextView f94948f;

    /* renamed from: g */
    private FrameLayout f94949g;

    /* renamed from: h */
    private SmartImageView f94950h;

    /* renamed from: i */
    private DmtTextView f94951i;

    /* renamed from: com.ss.android.ugc.aweme.movie.view.b$a */
    static final class C37194a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37193b f94952a;

        /* renamed from: b */
        final /* synthetic */ C10912c f94953b;

        C37194a(C37193b bVar, C10912c cVar) {
            this.f94952a = bVar;
            this.f94953b = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("xmas_banner_click", C23089d.m56640a().mo47829a("enter_from", "mv_page").mo47829a("gen", C31357a.m73100c()).mo47829a("mv_id", this.f94952a.f94945b).f61491a);
            Context context = this.f94952a.f94944a;
            C10914b bVar = this.f94953b.f29318s;
            C52711k.m112236a((Object) bVar, "entry.bannerDetail");
            C31361b.m73110a(context, bVar.f29322b);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C27323c mo76523a() {
        return new C27321a(this.f94944a, R.drawable.tm);
    }

    /* renamed from: a */
    public final void mo76524a(View view) {
        C52711k.m112240b(view, "rootView");
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ao4);
        if (viewGroup != null) {
            View inflate = LayoutInflater.from(this.f94944a).inflate(R.layout.aac, viewGroup, true);
            this.f94951i = (DmtTextView) inflate.findViewById(R.id.e4y);
            this.f94950h = (SmartImageView) inflate.findViewById(R.id.dwd);
            this.f94949g = (FrameLayout) inflate.findViewById(R.id.dwc);
            this.f94946d = (DmtTextView) inflate.findViewById(R.id.bnd);
            this.f94947e = (RemoteImageView) inflate.findViewById(R.id.bnc);
            this.f94948f = (DmtTextView) inflate.findViewById(R.id.bp6);
        }
    }

    /* renamed from: a */
    public final void mo76525a(C37179c cVar) {
        String str;
        long j;
        C52711k.m112240b(cVar, "detailModel");
        MvModel mvModel = cVar.f94907c;
        if (mvModel != null) {
            DmtTextView dmtTextView = this.f94946d;
            if (dmtTextView != null) {
                dmtTextView.setText(mvModel.getName());
            }
            DmtTextView dmtTextView2 = this.f94948f;
            if (dmtTextView2 != null) {
                StringBuilder sb = new StringBuilder();
                Long userCount = mvModel.getUserCount();
                if (userCount != null) {
                    j = userCount.longValue();
                } else {
                    j = 0;
                }
                sb.append(C33095b.m76071b(j));
                sb.append(" ");
                dmtTextView2.setText(sb.toString());
            }
            C23515d.m57669a(this.f94947e, mvModel.getIconUrl());
        }
        if (C31357a.m73095a()) {
            C10912c e = C31357a.m73104e();
            if (!(e == null || e.f29318s == null || e.f29311l == null)) {
                List<String> list = e.f29311l;
                MvModel mvModel2 = cVar.f94907c;
                if (mvModel2 != null) {
                    str = mvModel2.getMvId();
                } else {
                    str = null;
                }
                if (list.contains(str)) {
                    if (!TextUtils.isEmpty(e.f29313n)) {
                        DmtTextView dmtTextView3 = this.f94951i;
                        if (dmtTextView3 != null) {
                            dmtTextView3.setVisibility(0);
                        }
                        DmtTextView dmtTextView4 = this.f94951i;
                        if (dmtTextView4 != null) {
                            dmtTextView4.setText(e.f29313n);
                        }
                        FrameLayout frameLayout = this.f94949g;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(0);
                        }
                    } else {
                        DmtTextView dmtTextView5 = this.f94951i;
                        if (dmtTextView5 != null) {
                            dmtTextView5.setVisibility(8);
                        }
                    }
                    FrameLayout frameLayout2 = this.f94949g;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(0);
                    }
                    SmartImageView smartImageView = this.f94950h;
                    if (smartImageView != null) {
                        smartImageView.setVisibility(0);
                    }
                    C26890h.m65011a("xmas_banner_show", C23089d.m56640a().mo47829a("gen", C31357a.m73100c()).mo47829a("enter_from", "mv_page").mo47829a("mv_id", this.f94945b).f61491a);
                    C10914b bVar = e.f29318s;
                    C52711k.m112236a((Object) bVar, "entry.bannerDetail");
                    C12208t a = C12203q.m24646a(bVar.f29321a).mo23118a("MovieDetailFragment");
                    Context context = this.f94944a;
                    C12187e a2 = new C12189a().mo23107b(C12186c.m24630a(context, 2.0f)).mo23103a(C12186c.m24630a(context, 0.0f)).mo23106a();
                    C52711k.m112236a((Object) a2, "builder.build()");
                    a.mo23115a(a2).mo23116a((C12197k) this.f94950h).mo23121a();
                    FrameLayout frameLayout3 = this.f94949g;
                    if (frameLayout3 != null) {
                        frameLayout3.setOnClickListener(new C37194a(this, e));
                    }
                }
            }
        }
    }

    public C37193b(Context context, String str, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "mvId");
        this.f94944a = context;
        this.f94945b = str;
    }
}
