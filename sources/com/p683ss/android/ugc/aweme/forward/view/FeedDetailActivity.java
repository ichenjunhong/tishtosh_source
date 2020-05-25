package com.p683ss.android.ugc.aweme.forward.view;

import android.os.Bundle;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.utils.C47863eu;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.forward.view.FeedDetailActivity */
public class FeedDetailActivity extends AmeBaseActivity {

    /* renamed from: a */
    public String f84524a;

    /* renamed from: b */
    public String f84525b;

    /* renamed from: c */
    public String f84526c;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.b_;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public void onResume() {
        super.onResume();
        if (!C47863eu.m103535a()) {
            C37879b.m84582b();
        }
    }

    public void onPause() {
        super.onPause();
        if (!C31843f.m74206a().mo64953b()) {
            C37879b.m84588b(this.f84524a, C22858c.f61208d);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
