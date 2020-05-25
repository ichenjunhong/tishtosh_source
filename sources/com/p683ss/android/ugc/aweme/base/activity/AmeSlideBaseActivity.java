package com.p683ss.android.ugc.aweme.base.activity;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeSlideBaseActivity */
public class AmeSlideBaseActivity extends AmeBaseActivity {

    /* renamed from: a */
    protected C23442u f62475a;

    /* renamed from: b */
    private Handler f62476b = new Handler();

    /* renamed from: c */
    private Runnable f62477c = new Runnable() {
        public final void run() {
            if (AmeSlideBaseActivity.this.f62475a != null) {
                AmeSlideBaseActivity.this.f62475a.mo48609c();
            }
        }
    };

    public void onDestroy() {
        super.onDestroy();
        this.f62476b.removeCallbacks(this.f62477c);
    }

    /* renamed from: c */
    private static boolean m57551c() {
        try {
            if (!C32816h.m75716b().getUseRightSwipeBack().booleanValue()) {
                return false;
            }
        } catch (C10174a unused) {
        }
        if (VERSION.SDK_INT == 29) {
            return false;
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f62476b.removeCallbacks(this.f62477c);
        this.f62476b.postDelayed(this.f62477c, TimeUnit.SECONDS.toMillis(2));
    }

    public void onResume() {
        super.onResume();
        this.f62476b.removeCallbacks(this.f62477c);
        if (this.f62475a != null) {
            this.f62475a.mo48608b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m57551c()) {
            this.f62475a = new C23442u(this, 1);
            this.f62475a.mo48607a();
        }
    }
}
