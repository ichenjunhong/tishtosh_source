package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fe */
public final class C43810fe implements C17824h<SynthetiseResult> {

    /* renamed from: a */
    private List<String> f110948a;

    public final void onFailure(Throwable th) {
    }

    public C43810fe(List<String> list) {
        this.f110948a = list;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        if (synthetiseResult.audioLength - synthetiseResult.videoLength > 3000.0f) {
            EditPreviewInfo editPreviewInfo = synthetiseResult.editPreviewInfo;
            long j = 0;
            if (editPreviewInfo != null) {
                for (EditVideoSegment videoFileInfo : editPreviewInfo.getVideoList()) {
                    j += videoFileInfo.getVideoFileInfo().getDuration();
                }
            }
            C23569o.m57779a("aweme_synthesis_lost_video_log", C42437ay.m93202a().mo86521a("fileInfo", synthetiseResult.toString()).mo86519a("duration", Integer.valueOf((int) j)).mo86522b());
        }
        if (!this.f110948a.isEmpty()) {
            C23569o.m57779a("aweme_synthesis_skip_frame_log", C42437ay.m93202a().mo86521a("fileInfo", this.f110948a.toString()).mo86522b());
        }
    }
}
