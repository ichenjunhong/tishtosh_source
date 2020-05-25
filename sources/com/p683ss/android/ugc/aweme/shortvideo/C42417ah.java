package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45311o.C45312a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45319v;
import com.p683ss.android.ugc.aweme.utils.C47702b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ah */
final /* synthetic */ class C42417ah implements C45312a {

    /* renamed from: a */
    private final C424075 f107302a;

    C42417ah(C424075 r1) {
        this.f107302a = r1;
    }

    /* renamed from: a */
    public final void mo86504a(C45319v vVar) {
        C424075 r0 = this.f107302a;
        if (vVar == C45319v.CANCEL) {
            C42402ab.this.f107259k.allowMergeUpload();
            C47702b.f120193a.mo94984a("user_cancel_publish", C23089d.m56640a().mo47829a("publish_id", C42402ab.this.f111187d).mo47826a("video_type", 0).mo47826a("video_upload_type", 1).mo47829a("cancel_step", "call_uploader").f61491a);
            C42402ab.this.f107259k.cancelUpload();
        }
    }
}
