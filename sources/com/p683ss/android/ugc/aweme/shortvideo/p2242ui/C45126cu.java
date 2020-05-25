package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0199s;
import com.bytedance.als.ApiCenter;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44330b;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cu */
final /* synthetic */ class C45126cu implements C0199s {

    /* renamed from: a */
    private final VideoRecordNewActivity f114246a;

    C45126cu(VideoRecordNewActivity videoRecordNewActivity) {
        this.f114246a = videoRecordNewActivity;
    }

    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f114246a;
        C37721a aVar = (C37721a) obj;
        if (aVar != null) {
            if (aVar.f96126b != C37722a.SUCCESS || aVar.f96125a == null) {
                C44330b.m97099b(videoRecordNewActivity.f113778d.f107132y);
                return;
            }
            boolean booleanValue = ((Boolean) ((C52847n) aVar.f96125a).getFirst()).booleanValue();
            int intValue = ((Integer) ((C52847n) aVar.f96125a).getSecond()).intValue();
            if (booleanValue) {
                if (videoRecordNewActivity.f113794t != null) {
                    ((C49577b) ((ApiCenter) videoRecordNewActivity.f113776b.getValue()).mo7341b(C49577b.class)).mo97481a(intValue);
                    return;
                }
            }
        }
        C44330b.m97099b(videoRecordNewActivity.f113778d.f107132y);
    }
}
