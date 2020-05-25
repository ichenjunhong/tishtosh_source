package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.C30530a;
import com.p683ss.android.ugc.aweme.livewallpaper.p1927b.C36193c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.w */
public final class C42124w implements C42357g {

    /* renamed from: a */
    private final Aweme f106580a;

    /* renamed from: b */
    private final String f106581b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.ann;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.dhu;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "live_photo";
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
        return C42358a.m93000a(this);
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        if (this.f106580a.getDownloadStatus() == 0 && !C23794bh.m58393g().mo75755b(this.f106580a) && this.f106580a.getDownloadStatus() != 1 && this.f106580a.getAwemeControl().canShare()) {
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

    public C42124w(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106580a = aweme;
        this.f106581b = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (C42148a.m92511a((C42357g) this, context, this.f106580a, this.f106581b) && C30530a.m71490a(context, this.f106580a) && C41979aq.m91947b().checkShareAllowStatus(this.f106580a, context) && this.f106580a.getAwemeControl().canShare()) {
            if (this.f106580a.getAuthor() != null) {
                IAccountUserService g = C20854a.m53167g();
                User author = this.f106580a.getAuthor();
                C52711k.m112236a((Object) author, "aweme.author");
                if (!g.isMe(author.getUid())) {
                    User author2 = this.f106580a.getAuthor();
                    C52711k.m112236a((Object) author2, "aweme.author");
                    if (author2.isPreventDownload()) {
                        C10691a.m21542b(context, (int) R.string.aq7).mo19066a();
                        return;
                    }
                }
            }
            if (C23794bh.m58393g().mo75755b(this.f106580a)) {
                C10691a.m21542b(context, (int) R.string.gh1).mo19066a();
                return;
            }
            Aweme aweme = this.f106580a;
            C26890h.m65011a("wall_paper_click", C23089d.m56640a().mo47829a("group_id", aweme.getAid()).mo47829a("request_id", aweme.getRequestId()).mo47829a("enter_from", this.f106581b).f61491a);
            new C36193c(C42149b.m92512a(context)).mo74947c(this.f106580a);
        }
    }
}
