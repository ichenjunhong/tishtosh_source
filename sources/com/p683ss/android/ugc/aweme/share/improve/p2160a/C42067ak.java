package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.share.C42250w;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ak */
public final class C42067ak implements C42357g {

    /* renamed from: a */
    private final Aweme f106470a;

    /* renamed from: b */
    private final String f106471b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.ao4;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d8t;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "reuse_mv_template";
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
        return R.drawable.d4u;
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

    public C42067ak(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106470a = aweme;
        this.f106471b = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        String str;
        String str2;
        String str3;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (C42148a.m92511a((C42357g) this, context, this.f106470a, this.f106471b)) {
            FaceStickerBean.sCurPropSource = "prop_reuse";
            C26890h.m65011a("mvtheme_reuse_icon", C23089d.m56640a().mo47829a("mv_id", this.f106470a.getUploadMiscInfoStruct().mvThemeId).mo47829a("action_type", "click").mo47829a("group_id", this.f106470a.getAid()).f61491a);
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin() || !AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().needLoginBeforeRecord()) {
                new C42250w(context, 1).mo86226a(this.f106470a.getUploadMiscInfoStruct().mvThemeId, this.f106470a.getUploadMiscInfoStruct().mvType);
                int i = this.f106470a.getUploadMiscInfoStruct().mvType;
                String str4 = "shoot";
                C23089d a2 = C23089d.m56640a();
                String str5 = "shoot_way";
                if (i == 1) {
                    str = "jianying_mv_reuse";
                } else {
                    str = "mv_page";
                }
                C23089d a3 = a2.mo47829a(str5, str);
                String str6 = "enter_from";
                if (i == 1) {
                    str2 = "jianying_mv_page";
                } else {
                    str2 = "mv_page";
                }
                C23089d a4 = a3.mo47829a(str6, str2).mo47829a("mv_id", this.f106470a.getUploadMiscInfoStruct().mvThemeId).mo47829a("log_pb", C29981aa.m70153a().mo60160a(new LogPbBean())).mo47829a("group_id", this.f106470a.getAid()).mo47829a("author_id", this.f106470a.getAuthorUid());
                String str7 = "content_type";
                if (i == 1) {
                    str3 = "jianying_mv";
                } else {
                    str3 = "mv";
                }
                C26890h.m65011a(str4, a4.mo47829a(str7, str3).f61491a);
                return;
            }
            C27965f.m66719a(C42149b.m92512a(context), this.f106471b, "click_share_button");
        }
    }
}
