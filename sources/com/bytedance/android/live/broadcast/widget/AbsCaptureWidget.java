package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public abstract class AbsCaptureWidget extends LiveWidget {

    /* renamed from: a */
    protected boolean f10382a;

    /* renamed from: b */
    protected C3048a f10383b;

    /* renamed from: e */
    public void mo9029e() {
        this.f10382a = false;
    }

    public void onCreate() {
        super.onCreate();
        if (!this.f10382a) {
            this.f10382a = true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f10382a) {
            mo9029e();
        }
    }

    public AbsCaptureWidget(C3048a aVar) {
        this.f10383b = aVar;
    }
}
