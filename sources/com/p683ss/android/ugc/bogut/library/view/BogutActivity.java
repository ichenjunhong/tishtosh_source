package com.p683ss.android.ugc.bogut.library.view;

import android.app.Activity;
import android.os.Bundle;
import com.p683ss.android.ugc.bogut.library.p2414a.C48496a;
import com.p683ss.android.ugc.bogut.library.p2415b.C48501a;

/* renamed from: com.ss.android.ugc.bogut.library.view.BogutActivity */
public abstract class BogutActivity<P extends C48501a> extends Activity {

    /* renamed from: a */
    private C48504b<P> f121944a = new C48504b<>(C48496a.m104926a(getClass()));

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f121944a.mo96002a(!isChangingConfigurations());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f121944a.mo96004c();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f121944a.mo96001a((Object) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("presenter_state", this.f121944a.mo96003b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f121944a.mo96000a(bundle.getBundle("presenter_state"));
        }
    }
}
