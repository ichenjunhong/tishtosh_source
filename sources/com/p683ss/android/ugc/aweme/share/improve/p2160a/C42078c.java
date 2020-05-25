package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.c */
public final class C42078c implements C42357g {

    /* renamed from: a */
    private final Aweme f106494a;

    /* renamed from: b */
    private final String f106495b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.dxt;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.c4j;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "ad_plan";
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
        return R.drawable.dxu;
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

    public C42078c(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106494a = aweme;
        this.f106495b = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (C42148a.m92511a((C42357g) this, context, this.f106494a, this.f106495b)) {
            C23196ad.m56841a("promote_layer_show").mo47957b("enter_from", this.f106495b).mo47957b(C42311c.f106865i, "promote_plan").mo47957b("group_id", this.f106494a.getAid()).mo48076e();
            new C10643a(context).mo18885a((int) R.string.c4h).mo18902b(this.f106494a.getAdSchedule()).mo18886a((int) R.string.ah2, (OnClickListener) null).mo18897a().mo18883c();
        }
    }
}
