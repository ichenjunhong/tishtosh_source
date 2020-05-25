package com.p683ss.android.ugc.aweme.feed.p1719e;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import com.p683ss.android.ugc.aweme.feed.p1736ui.VideoBottomButton;
import com.p683ss.android.ugc.aweme.feed.p1736ui.VideoFloatingCard;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.e.c */
public final class C30188c {

    /* renamed from: a */
    public VideoBottomButton f78781a;

    /* renamed from: b */
    public VideoFloatingCard f78782b;

    /* renamed from: c */
    public ViewGroup f78783c;

    /* renamed from: d */
    public Aweme f78784d;

    /* renamed from: e */
    private ViewStub f78785e;

    /* renamed from: f */
    private ViewStub f78786f;

    /* renamed from: a */
    public void mo60482a() {
        if (this.f78782b == null) {
            this.f78782b = (VideoFloatingCard) this.f78785e.inflate();
        }
        if (this.f78781a == null) {
            this.f78781a = (VideoBottomButton) this.f78786f.inflate();
        }
    }

    public C30188c(View view) {
        this.f78783c = (ViewGroup) view.findViewById(R.id.id);
        this.f78786f = (ViewStub) view.findViewById(R.id.f6j);
        this.f78785e = (ViewStub) view.findViewById(R.id.f6q);
    }

    /* renamed from: a */
    public void mo60483a(long j) {
        if (this.f78782b != null) {
            this.f78782b.mo63406a(j, null, new C30194i(this, j));
        }
    }

    /* renamed from: a */
    static void m70809a(FloatingCardInfo floatingCardInfo) {
        if (C23794bh.m58405s().mo56649a(floatingCardInfo.getSchema())) {
            C26890h.m65011a("enter_star_board", C23089d.m56640a().mo47829a("enter_from", "star_ad").f61491a);
            C41302w.m91042a().mo83861a(C23794bh.m58405s().mo56650b("star_ad", "", ""));
            return;
        }
        C41302w.m91042a().mo83861a(floatingCardInfo.getSchema());
    }
}
