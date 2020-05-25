package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.tools.C47351z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ex */
public final class C43801ex {

    /* renamed from: a */
    C43225dr f110917a;

    /* renamed from: b */
    private VideoRecordNewActivity f110918b = ((VideoRecordNewActivity) this.f110917a.f33840g_);

    public C43801ex(C43225dr drVar) {
        this.f110917a = drVar;
    }

    public final void onEvent(C47351z zVar) {
        if (this.f110918b == null) {
            this.f110918b = (VideoRecordNewActivity) this.f110917a.f33840g_;
        }
        if (this.f110918b != null) {
            this.f110918b.mo91196f().mo97809c(true);
        }
    }
}
