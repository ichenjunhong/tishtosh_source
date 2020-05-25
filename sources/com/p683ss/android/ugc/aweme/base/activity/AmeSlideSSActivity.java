package com.p683ss.android.ugc.aweme.base.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity */
public class AmeSlideSSActivity extends AmeSSActivity {

    /* renamed from: a */
    protected C23442u f62479a;

    /* renamed from: b */
    private Handler f62480b = new Handler();

    /* renamed from: c */
    private Runnable f62481c = new Runnable() {
        public final void run() {
            if (AmeSlideSSActivity.this.f62479a != null) {
                AmeSlideSSActivity.this.f62479a.mo48609c();
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo48562b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo48563c() {
        return 1;
    }

    /* renamed from: a */
    private static boolean mo65244a() {
        try {
            return C32816h.m75716b().getUseRightSwipeBack().booleanValue();
        } catch (C10174a unused) {
            return false;
        }
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        return super.getResources();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f62480b.removeCallbacks(this.f62481c);
    }

    public void onPause() {
        super.onPause();
        this.f62480b.removeCallbacks(this.f62481c);
        this.f62480b.postDelayed(this.f62481c, TimeUnit.SECONDS.toMillis(2));
    }

    public void onResume() {
        super.onResume();
        this.f62480b.removeCallbacks(this.f62481c);
        if (this.f62479a != null) {
            this.f62479a.mo48608b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo65244a() && mo48562b()) {
            this.f62479a = new C23442u(this, mo48563c());
            this.f62479a.mo48607a();
        }
    }
}
