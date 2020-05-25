package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.share.gif.C42016a.C42017a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.p */
public final class C42116p implements C42357g {

    /* renamed from: a */
    private final Aweme f106575a;

    /* renamed from: b */
    private final String f106576b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.dxi;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.dhk;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "gif";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return R.drawable.dxj;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        if (!C23794bh.m58393g().mo75755b(this.f106575a) && this.f106575a.getDownloadStatus() == 0) {
            return true;
        }
        return false;
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

    public C42116p(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        this.f106575a = aweme;
        this.f106576b = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (C25945k.m62923n().mo54138a(this.f106575a) || C25945k.m62923n().mo54139b(this.f106575a)) {
            C10691a.m21548c(context, (int) R.string.dm).mo19066a();
        } else if (this.f106575a.getDownloadStatus() != 0) {
            C10691a.m21542b(context, (int) R.string.b5q).mo19066a();
        } else if (C23794bh.m58393g().mo75755b(this.f106575a)) {
            C10691a.m21542b(context, (int) R.string.gh1).mo19066a();
        } else {
            Activity a = C42149b.m92512a(context);
            Aweme aweme = this.f106575a;
            String str = this.f106576b;
            String a2 = C29981aa.m70153a().mo60161a(C23198ae.m56857c(this.f106575a));
            C52711k.m112236a((Object) a2, "LogPbManager.getInstance…tils.getRequestId(aweme))");
            C52711k.m112240b(a, "activity");
            C52711k.m112240b(aweme, "aweme");
            C52711k.m112240b(str, "enterFrom");
            C52711k.m112240b(a2, "logPb");
            C26890h.m65012a("save_as_gif", new C26898j().mo54849a("group_id", aweme.getAid()).mo54849a("author_id", aweme.getAuthorUid()).mo54849a("enter_from", str).mo54849a("log_pb", a2).mo54850a());
            C42017a aVar = new C42017a(C41922a.m91868a().getGifShareStrategy(), a, aweme, str, a2);
            String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
            C47937a.m103719a(a, 1001, strArr, (C47939a) aVar);
        }
    }
}
