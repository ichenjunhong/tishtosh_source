package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42134b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a */
public final class C42047a implements C42357g {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f106433a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42047a.class), "mCopyLinkChannel", "getMCopyLinkChannel()Lcom/ss/android/ugc/aweme/share/improve/channel/CopyLinkChannel;"))};

    /* renamed from: b */
    private Aweme f106434b;

    /* renamed from: c */
    private String f106435c;

    /* renamed from: d */
    private final C52668f f106436d = C52732g.m112285a(C42048a.f106437a);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.a$a */
    static final class C42048a extends C52712l implements C52670a<C42134b> {

        /* renamed from: a */
        public static final C42048a f106437a = new C42048a();

        C42048a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C42134b();
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.ait;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.dgo;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "ad_settings";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return C42358a.m93000a(this);
    }

    /* renamed from: a */
    public final void mo49951a(ImageView imageView) {
        C52711k.m112240b(imageView, "iconView");
        C42358a.m93002a((C42357g) this, imageView);
    }

    /* renamed from: a */
    public final void mo49952a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        C42358a.m93003a((C42357g) this, textView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r2 == null) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49949a(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r4 = "show_adsetting_entrance"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.f106435c
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f106434b
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f106434b
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.getUid()
            if (r2 != 0) goto L_0x0031
        L_0x002f:
            java.lang.String r2 = ""
        L_0x0031:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "click_share_button"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2160a.C42047a.mo49949a(android.content.Context):void");
    }

    public C42047a(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        this.f106434b = aweme;
        this.f106435c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005e, code lost:
        if (r1 == null) goto L_0x0060;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49950a(android.content.Context r4, com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r5) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "sharePackage"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = ""
            d.f r1 = r3.f106436d
            java.lang.Object r1 = r1.getValue()
            com.ss.android.ugc.aweme.share.improve.b.b r1 = (com.p683ss.android.ugc.aweme.share.improve.p2162b.C42134b) r1
            com.ss.android.ugc.aweme.sharer.b r1 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r1
            com.ss.android.ugc.aweme.sharer.f r5 = r5.mo73884a(r1)
            boolean r1 = r5 instanceof com.p683ss.android.ugc.aweme.sharer.C42322h
            if (r1 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.sharer.h r5 = (com.p683ss.android.ugc.aweme.sharer.C42322h) r5
            java.lang.String r0 = r5.f106878b
        L_0x0022:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.f106434b
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity> r2 = com.p683ss.android.ugc.aweme.setting.p2148ui.AdSettingsActivity.class
            r1.<init>(r4, r2)
            java.lang.String r2 = "short_url"
            r1.putExtra(r2, r0)
            com.p683ss.android.ugc.aweme.feed.utils.C31187c.m72819a(r5)
            r4.startActivity(r1)
            java.lang.String r4 = "click_adsetting_entrance"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = r3.f106435c
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r0, r1)
            java.lang.String r0 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f106434b
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r0, r1)
            java.lang.String r0 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f106434b
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = r1.getUid()
            if (r1 != 0) goto L_0x0062
        L_0x0060:
            java.lang.String r1 = ""
        L_0x0062:
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r0, r1)
            java.lang.String r0 = "enter_method"
            java.lang.String r1 = "click_share_button"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2160a.C42047a.mo49950a(android.content.Context, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }
}
