package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicRecommendActivity;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.h */
final /* synthetic */ class C24931h implements C23364b {

    /* renamed from: a */
    private final Activity f66020a;

    C24931h(Activity activity) {
        this.f66020a = activity;
    }

    /* renamed from: a */
    public final void mo40906a(String[] strArr, int[] iArr) {
        Activity activity = this.f66020a;
        if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
            activity.startActivity(new Intent(activity, MusicRecommendActivity.class));
        }
    }
}
