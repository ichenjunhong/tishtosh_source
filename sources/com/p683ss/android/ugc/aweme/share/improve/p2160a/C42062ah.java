package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ah */
public final class C42062ah implements C42357g {

    /* renamed from: a */
    private final Music f106463a;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.ao3;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d77;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "report_music";
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

    public C42062ah(Music music) {
        C52711k.m112240b(music, "music");
        this.f106463a = music;
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
        String str;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (TextUtils.isEmpty(this.f106463a.getOwnerId())) {
            str = "0";
        } else {
            str = this.f106463a.getOwnerId();
        }
        C27013a.m65227a().report(C42149b.m92512a(context), new Builder().appendQueryParameter("report_type", "music").appendQueryParameter("object_id", this.f106463a.getMid()).appendQueryParameter("owner_id", str));
        C27013a.m65227a().sendReportEvent("", "music", "", this.f106463a.getMid(), this.f106463a.getOwnerId(), "", "click_share_button");
    }
}
