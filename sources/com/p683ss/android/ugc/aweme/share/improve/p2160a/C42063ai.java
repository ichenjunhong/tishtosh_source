package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.net.Uri.Builder;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ai */
public final class C42063ai implements C42357g {

    /* renamed from: a */
    private final User f106464a;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.ao3;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d75;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "report";
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

    public C42063ai(User user) {
        C52711k.m112240b(user, "user");
        this.f106464a = user;
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

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C26890h.m65011a("report_user", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("to_user_id", this.f106464a.getUid()).f61491a);
        String str = "";
        try {
            C18085o oVar = new C18085o();
            oVar.mo35020a("unique_id", C47915gg.m103656e(this.f106464a));
            oVar.mo35018a("is_blocked", Boolean.valueOf(this.f106464a.isBlock()));
            String a = C47760cd.m103385a(oVar);
            C52711k.m112236a((Object) a, "GsonUtil.toJson(jsonObject)");
            str = a;
        } catch (Exception unused) {
        }
        C27013a.m65227a().report(C42149b.m92512a(context), new Builder().appendQueryParameter("owner_id", this.f106464a.getUid()).appendQueryParameter("object_id", this.f106464a.getUid()).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str));
        C27013a.m65227a().sendReportEvent("others_homepage", "user", "", this.f106464a.getUid(), this.f106464a.getUid(), "", "click_share_button");
    }
}
