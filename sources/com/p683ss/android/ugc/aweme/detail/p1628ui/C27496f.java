package com.p683ss.android.ugc.aweme.detail.p1628ui;

import com.p683ss.android.ugc.aweme.discover.C27937c;
import com.p683ss.android.ugc.aweme.discover.C27940f;
import com.p683ss.android.ugc.aweme.feed.adapter.C30069bh;
import com.p683ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.f */
public final class C27496f extends VideoViewHolder {

    /* renamed from: a */
    private boolean f72288a = true;

    /* renamed from: b */
    private BaseFeedPageParams f72289b;

    /* renamed from: i */
    public final void mo54003i() {
        String str;
        super.mo54003i();
        try {
            if (C27937c.f73358a.getMixSearchRNWebViewRefHolder().mo56350a()) {
                Aweme e = mo53999e();
                C27940f mixSearchRNWebViewRefHolder = C27937c.f73358a.getMixSearchRNWebViewRefHolder();
                if (this.f72288a) {
                    str = "next_video";
                } else {
                    str = "prev_video";
                }
                mixSearchRNWebViewRefHolder.mo56349a(e, str, this.f72289b.param.getFrom());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo55903c(boolean z) {
        this.f72288a = z;
    }

    public C27496f(C30069bh bhVar) {
        super(bhVar);
        this.f72289b = bhVar.f78497e;
    }
}
