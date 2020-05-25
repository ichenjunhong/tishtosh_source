package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.au */
final /* synthetic */ class C44996au implements C0199s {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f113954a;

    C44996au(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f113954a = vEVideoPublishPreviewActivity;
    }

    public final void onChanged(Object obj) {
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f113954a;
        Void voidR = (Void) obj;
        C32458a.m75144a("receive prepare done event in publish preview page");
        if (vEVideoPublishPreviewActivity.f113700f == null) {
            vEVideoPublishPreviewActivity.f113700f = new HashMap<>();
        } else {
            vEVideoPublishPreviewActivity.f113700f.clear();
        }
        vEVideoPublishPreviewActivity.f113697c.mo110526a(vEVideoPublishPreviewActivity.f113700f);
        SubtitleModule.m97950a(vEVideoPublishPreviewActivity.f113697c.f131275u, C39618d.f101160a, vEVideoPublishPreviewActivity.f113696b, vEVideoPublishPreviewActivity.f113700f);
    }
}
