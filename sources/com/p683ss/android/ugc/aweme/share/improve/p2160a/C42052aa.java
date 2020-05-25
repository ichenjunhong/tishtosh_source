package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.ShareDependService;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.aa */
public final class C42052aa implements C42357g {

    /* renamed from: a */
    private final Aweme f106446a;

    /* renamed from: b */
    private final String f106447b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.dxm;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.cx5;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "privacy";
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

    public C42052aa(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106446a = aweme;
        this.f106447b = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        String string = sharePackage.f106900i.getString("tab_name", "");
        String string2 = sharePackage.f106900i.getString("impr_id", "");
        C23089d a = C23089d.m56640a().mo47829a("group_id", this.f106446a.getAid()).mo47829a("enter_from", this.f106447b).mo47829a("impr_id", string2);
        if (TextUtils.equals(this.f106447b, "personal_homepage")) {
            a.mo47829a("tab_name", string);
        }
        C26890h.m65011a("click_privacy_setting_video", a.f61491a);
        ShareDependService a2 = C41922a.m91868a();
        Aweme aweme = this.f106446a;
        C52711k.m112236a((Object) string, "tabName");
        String str = this.f106447b;
        C52711k.m112236a((Object) string2, "imprId");
        a2.startPrivacySetting(context, aweme, string, str, string2);
    }
}
