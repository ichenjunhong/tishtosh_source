package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.adaptation.BaseScreenAdaptActivity;
import com.p683ss.android.ugc.aweme.analysis.Analysis;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionActivity */
public abstract class RecordSessionActivity extends BaseScreenAdaptActivity implements C45205n {

    /* renamed from: b */
    private boolean f113685b;

    /* renamed from: a */
    public final boolean mo78676a() {
        return this.f113685b;
    }

    public void finish() {
        m98156c(false);
        super.finish();
    }

    public void onDestroy() {
        m98156c(false);
        super.onDestroy();
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("video_shoot_page");
    }

    /* renamed from: c */
    private void m98156c(boolean z) {
        this.f113685b = z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m98156c(true);
    }
}
