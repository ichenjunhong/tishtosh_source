package com.p683ss.android.ugc.aweme.p1807im.sdk.common;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.BaseContainerActivity */
public abstract class BaseContainerActivity extends AmeActivity {
    /* renamed from: a */
    public void mo71919a() {
    }

    /* renamed from: b */
    public abstract Fragment mo71920b();

    public void setStatusBarColor() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bby);
        C34004b.m77718b().setupStatusBar(this);
        mo71919a();
        getSupportFragmentManager().mo2225a().mo2192b(R.id.ajf, mo71920b(), "TAG_CONTAINER").mo2195c();
    }
}
