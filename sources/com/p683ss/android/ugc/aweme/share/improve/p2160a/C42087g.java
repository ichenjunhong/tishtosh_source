package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.g */
public final class C42087g implements C42357g {

    /* renamed from: d */
    public static final C42088a f106512d = new C42088a(null);

    /* renamed from: a */
    public C29686a f106513a;

    /* renamed from: b */
    public final Aweme f106514b;

    /* renamed from: c */
    public final String f106515c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.g$a */
    public static final class C42088a {
        private C42088a() {
        }

        public /* synthetic */ C42088a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.g$b */
    static final class C42089b implements C23505g {

        /* renamed from: a */
        final /* synthetic */ C42087g f106516a;

        C42089b(C42087g gVar) {
            this.f106516a = gVar;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo46279a() {
            this.f106516a.mo86121h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.g$c */
    public static final class C42090c implements C29689c {

        /* renamed from: a */
        final /* synthetic */ C42087g f106517a;

        /* renamed from: a */
        public final void mo50570a(Exception exc) {
        }

        C42090c(C42087g gVar) {
            this.f106517a = gVar;
        }

        /* renamed from: a */
        public final void mo50568a(BaseResponse baseResponse) {
            if (!this.f106517a.f106514b.isCollected()) {
                this.f106517a.f106514b.setCollectStatus(1);
                C23324d.m57378a().updateCollectStatus(this.f106517a.f106514b.getAid(), 1);
                ReportFeedAdAction.f69464a.mo54011a(this.f106517a.f106514b, 3, this.f106517a.f106515c);
                return;
            }
            this.f106517a.f106514b.setCollectStatus(0);
            C23324d.m57378a().updateCollectStatus(this.f106517a.f106514b.getAid(), 0);
        }
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "favorite";
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

    /* renamed from: a */
    public final int mo49948a() {
        if (this.f106514b.isCollected()) {
            return R.drawable.dxb;
        }
        return R.drawable.dxr;
    }

    /* renamed from: b */
    public final int mo49953b() {
        if (this.f106514b.isCollected()) {
            return R.string.i0;
        }
        return R.string.hz;
    }

    /* renamed from: g */
    public final int mo49958g() {
        if (this.f106514b.isCollected()) {
            return R.drawable.dxc;
        }
        return R.drawable.dxs;
    }

    /* renamed from: h */
    public final void mo86121h() {
        if (this.f106513a == null) {
            this.f106513a = new C29686a();
        }
        C29686a aVar = this.f106513a;
        if (aVar == null) {
            C52711k.m112237a("collectActionPresenter");
        }
        aVar.mo54800a(new C42090c(this));
        C29686a aVar2 = this.f106513a;
        if (aVar2 == null) {
            C52711k.m112237a("collectActionPresenter");
        }
        aVar2.mo44934a_(Integer.valueOf(2), this.f106514b.getAid(), Integer.valueOf(this.f106514b.isCollected() ^ true ? 1 : 0));
    }

    /* renamed from: a */
    public final void mo49949a(Context context) {
        C52711k.m112240b(context, "context");
        C42358a.m93001a((C42357g) this, context);
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

    public C42087g(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        this.f106514b = aweme;
        this.f106515c = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        String str;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (!this.f106514b.isCollected()) {
            C23089d a = C23089d.m56640a();
            a.mo47829a("enter_from", this.f106515c).mo47829a("group_id", this.f106514b.getAid()).mo47829a("author_id", this.f106514b.getAuthorUid()).mo47829a("enter_method", "click_share_button").mo47830a(C23794bh.m58391e().mo65590a(this.f106514b, C22858c.f61208d));
            if (C52711k.m112239a((Object) "homepage_country", (Object) this.f106515c) && this.f106514b.getAuthor() != null) {
                String str2 = "country_name";
                if (this.f106514b.getAuthor() == null) {
                    str = "";
                } else {
                    User author = this.f106514b.getAuthor();
                    C52711k.m112236a((Object) author, "aweme.author");
                    str = author.getRegion();
                }
                a.mo47829a(str2, str);
            }
            if (C23198ae.m56860d(this.f106515c)) {
                a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(this.f106514b)));
                C26890h.m65012a("favourite_video", C23198ae.m56851a(a.f61491a));
            } else {
                C26890h.m65011a("favourite_video", a.f61491a);
            }
            C30578o.m71566a(C29988ad.SHARE);
        } else {
            C26890h.m65011a("cancel_favourite_video", C23089d.m56640a().mo47829a("enter_from", this.f106515c).mo47829a("group_id", this.f106514b.getAid()).mo47829a("author_id", this.f106514b.getAuthorUid()).mo47829a("enter_method", "click_share_button").mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(this.f106514b))).mo47830a(C23794bh.m58391e().mo65590a(this.f106514b, C22858c.f61208d)).f61491a);
        }
        if (C26503d.m64060c(this.f106514b)) {
            C10691a.m21542b(context, (int) R.string.dn).mo19066a();
            return;
        }
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin()) {
            String aid = this.f106514b.getAid();
            C27965f.m66721a(C42149b.m92512a(context), this.f106515c, "click_favorite_video", C47661ab.m103163a().mo94972a("group_id", aid).mo94972a("log_pb", C23198ae.m56874k(aid)).f120139a, (C23505g) new C42089b(this));
            return;
        }
        mo86121h();
    }
}
