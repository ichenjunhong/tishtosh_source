package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.os.Looper;
import com.p683ss.android.ugc.aweme.base.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45098a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cj */
final /* synthetic */ class C45115cj implements C45098a {

    /* renamed from: a */
    private final VideoRecordNewActivity f114234a;

    /* renamed from: b */
    private final C50048n f114235b;

    C45115cj(VideoRecordNewActivity videoRecordNewActivity, C50048n nVar) {
        this.f114234a = videoRecordNewActivity;
        this.f114235b = nVar;
    }

    /* renamed from: a */
    public final void mo91293a() {
        VideoRecordNewActivity videoRecordNewActivity = this.f114234a;
        C50048n nVar = this.f114235b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            nVar.mo97802G();
            return;
        }
        SafeHandler safeHandler = videoRecordNewActivity.f113780f;
        nVar.getClass();
        safeHandler.post(new C45119cn(nVar));
    }
}
