package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import com.bytedance.als.C2767k;
import com.p683ss.android.ugc.tools.utils.C50203g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cr */
final /* synthetic */ class C45123cr implements C2767k {

    /* renamed from: a */
    private final VideoRecordNewActivity f114243a;

    C45123cr(VideoRecordNewActivity videoRecordNewActivity) {
        this.f114243a = videoRecordNewActivity;
    }

    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f114243a;
        if (((Boolean) obj).booleanValue() && videoRecordNewActivity.f113798x) {
            videoRecordNewActivity.f113798x = false;
            C50203g.m108358a("VideoRecordNewActivity => addFragment by getFrameAvailableEvent");
            videoRecordNewActivity.f113780f.post(new C45120co(videoRecordNewActivity));
        }
    }
}
