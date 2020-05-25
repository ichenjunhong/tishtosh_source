package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45399aq;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.an */
public final class C42075an implements C42357g {

    /* renamed from: a */
    private final Aweme f106488a;

    /* renamed from: b */
    private final String f106489b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.ccu;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.hj5;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "status";
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
        return R.drawable.ccv;
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

    public C42075an(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106488a = aweme;
        this.f106489b = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (C42148a.m92511a((C42357g) this, context, this.f106488a, this.f106489b)) {
            if (TimeLockRuler.isTeenModeON()) {
                C10691a.m21551c(context, context.getString(R.string.dw2)).mo19066a();
            } else {
                new C45399aq().mo91725a(this.f106488a, C42149b.m92512a(context), this.f106489b);
            }
        }
    }
}
