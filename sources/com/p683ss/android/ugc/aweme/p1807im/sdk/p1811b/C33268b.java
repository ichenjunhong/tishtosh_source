package com.p683ss.android.ugc.aweme.p1807im.sdk.p1811b;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34544a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34545b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35470g;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.ss.android.ugc.trill.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.b.b */
public final class C33268b extends C33266a {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f86293d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33268b.class), "acImageView", "getAcImageView()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33268b.class), "splitImageView", "getSplitImageView()Landroid/view/View;"))};

    /* renamed from: e */
    public static final C33269a f86294e = new C33269a(null);

    /* renamed from: f */
    private final C52668f f86295f;

    /* renamed from: g */
    private final C52668f f86296g;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.b$a */
    public static final class C33269a {
        private C33269a() {
        }

        public /* synthetic */ C33269a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.b$b */
    static final class C33270b extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86297a;

        C33270b(ViewGroup viewGroup) {
            this.f86297a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RemoteImageView) this.f86297a.findViewById(R.id.dwt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.b$c */
    static final class C33271c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33268b f86298a;

        /* renamed from: b */
        final /* synthetic */ C34544a f86299b;

        C33271c(C33268b bVar, C34544a aVar) {
            this.f86298a = bVar;
            this.f86299b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C35200an.m79575a(view, 500)) {
                String str = this.f86299b.f89050b;
                C52711k.m112236a((Object) str, "acBannerData.openSchema");
                if (!TextUtils.isEmpty(str)) {
                    C35190af.m79478b(C34545b.f89055b, "banner_click");
                    StringBuilder sb = new StringBuilder();
                    if (C52830p.m112411b(str, "https://", false, 2, null) || C52830p.m112411b(str, "http://", false, 2, null)) {
                        try {
                            sb.append("aweme://ame/webview/?url=");
                            sb.append(URLEncoder.encode(str, "ISO-8859-1"));
                            SmartRouter.buildRoute(this.f86298a.f86292c.getContext(), sb.toString()).withParam("hide_more", false).withParam("enter_from", "im_session_list").open();
                        } catch (UnsupportedEncodingException unused) {
                        }
                    } else if (!C52830p.m112411b(str, "maya1349://", false, 2, null) || !(this.f86298a.f86292c.getContext() instanceof Activity)) {
                        sb.append(str);
                        Uri parse = Uri.parse(sb.toString());
                        C52711k.m112236a((Object) parse, "uri");
                        if (TextUtils.equals(parse.getHost(), "challenge")) {
                            C41302w.m91042a().mo83861a(C41311y.m91065a(sb.toString()).mo83870a("enter_from", "message").mo83871a());
                            return;
                        }
                        C41302w.m91042a().mo83861a(sb.toString());
                    } else {
                        C35243bl.m79697a((Activity) this.f86298a.f86292c.getContext(), 1, (Object) str);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.b$d */
    static final class C33272d extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86300a;

        C33272d(ViewGroup viewGroup) {
            this.f86300a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f86300a.findViewById(R.id.f68);
        }
    }

    /* renamed from: a */
    private final RemoteImageView m76390a() {
        return (RemoteImageView) this.f86295f.getValue();
    }

    public C33268b(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "layout");
        super(viewGroup);
        this.f86295f = C52732g.m112285a(new C33270b(viewGroup));
        this.f86296g = C52732g.m112285a(new C33272d(viewGroup));
    }

    /* renamed from: a */
    public final void mo70613a(C34544a aVar, boolean z) {
        C52711k.m112240b(aVar, "acBannerData");
        super.mo70613a(aVar, z);
        if (z) {
            C35190af.m79478b(C34545b.f89055b, "banner_show");
        }
        this.f86292c.setVisibility(0);
        int a = C9432q.m18670a(this.f86292c.getContext());
        float b = C9432q.m18687b(this.f86292c.getContext(), 16.0f);
        LayoutParams layoutParams = new LayoutParams(-1, (int) ((((float) a) - (2.0f * b)) / 4.8f));
        int i = (int) b;
        layoutParams.setMargins(i, i, i, i);
        RemoteImageView a2 = m76390a();
        C52711k.m112236a((Object) a2, "acImageView");
        a2.setLayoutParams(layoutParams);
        RemoteImageView a3 = m76390a();
        C52711k.m112236a((Object) a3, "acImageView");
        a3.setVisibility(0);
        View view = (View) this.f86296g.getValue();
        C52711k.m112236a((Object) view, "splitImageView");
        view.setVisibility(0);
        RemoteImageView a4 = m76390a();
        C52711k.m112236a((Object) a4, "acImageView");
        ((C13833a) a4.getHierarchy()).mo25903b((int) R.drawable.dak, C13818b.f36062b);
        RemoteImageView a5 = m76390a();
        C52711k.m112236a((Object) a5, "acImageView");
        ((C13833a) a5.getHierarchy()).mo25907c((int) R.color.a1x);
        RemoteImageView a6 = m76390a();
        C52711k.m112236a((Object) a6, "acImageView");
        ((C13833a) a6.getHierarchy()).mo25892a((int) R.drawable.d9c, C13818b.f36062b);
        if (aVar.f89049a != null) {
            RemoteImageView a7 = m76390a();
            C35470g gVar = aVar.f89049a;
            C52711k.m112236a((Object) gVar, "acBannerData.backgroundIcon");
            C23515d.m57669a(a7, gVar.f91187a);
        } else {
            C23515d.m57668a(m76390a(), (int) R.color.a1x);
        }
        m76390a().setOnClickListener(new C33271c(this, aVar));
    }
}
