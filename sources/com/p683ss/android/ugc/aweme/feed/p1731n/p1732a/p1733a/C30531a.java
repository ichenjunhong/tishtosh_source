package com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.p1733a;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.experiment.DownloadMaskExperiment;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.video.C48121w;

/* renamed from: com.ss.android.ugc.aweme.feed.n.a.a.a */
public class C30531a implements C30532b {

    /* renamed from: a */
    private Context f79789a;

    /* renamed from: a */
    public void mo62728a(String str) {
    }

    /* renamed from: a */
    public final void mo62727a() {
        if (mo62730c()) {
            C48121w.m104249M().mo95293z();
        }
    }

    /* renamed from: b */
    public void mo62729b() {
        if (mo62730c()) {
            C48121w.m104249M().mo95291x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo62730c() {
        if (!C25282a.m61494a().isCurPlayActive(C42149b.m92512a(this.f79789a)) || C10181b.m20511a().mo18172a(DownloadMaskExperiment.class, false, "downloading_no_mask", 31744, false)) {
            return false;
        }
        return true;
    }

    public C30531a(Context context) {
        this.f79789a = context;
    }
}
