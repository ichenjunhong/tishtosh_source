package com.p683ss.android.ugc.aweme.splash;

import android.content.Intent;
import com.p683ss.android.ugc.aweme.utils.p2387a.C47659c;

/* renamed from: com.ss.android.ugc.aweme.splash.p */
final /* synthetic */ class C45708p implements Runnable {

    /* renamed from: a */
    private final TransitActivity f115546a;

    C45708p(TransitActivity transitActivity) {
        this.f115546a = transitActivity;
    }

    public final void run() {
        Intent intent;
        TransitActivity transitActivity = this.f115546a;
        Intent intent2 = transitActivity.getIntent();
        if (intent2 != null) {
            intent2.setExtrasClassLoader(TransitActivity.class.getClassLoader());
            intent = (Intent) intent2.getParcelableExtra("main");
            if (intent != null) {
                intent.setExtrasClassLoader(TransitActivity.class.getClassLoader());
                transitActivity.startActivity(intent);
                transitActivity.overridePendingTransition(0, 0);
            }
        }
        intent = C47659c.m103160a(transitActivity);
        transitActivity.startActivity(intent);
        transitActivity.overridePendingTransition(0, 0);
    }
}
