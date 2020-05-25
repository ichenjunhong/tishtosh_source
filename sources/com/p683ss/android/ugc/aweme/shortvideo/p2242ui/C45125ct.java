package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0198r;
import com.bytedance.als.C2767k;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ct */
final /* synthetic */ class C45125ct implements C2767k {

    /* renamed from: a */
    private final VideoRecordNewActivity f114245a;

    C45125ct(VideoRecordNewActivity videoRecordNewActivity) {
        this.f114245a = videoRecordNewActivity;
    }

    public final void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        ShortVideoContextViewModel i = this.f114245a.mo91199i();
        if (i.f107135b == null) {
            i.f107135b = new C0198r<>();
        }
        i.f107135b.setValue(Boolean.valueOf(true));
    }
}
