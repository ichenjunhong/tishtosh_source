package com.bytedance.android.livesdk.p279af;

import android.telephony.PhoneStateListener;

/* renamed from: com.bytedance.android.livesdk.af.z */
public final class C4625z extends PhoneStateListener {

    /* renamed from: a */
    private C4626a f12601a;

    /* renamed from: com.bytedance.android.livesdk.af.z$a */
    public interface C4626a {
        /* renamed from: a */
        void mo10409a(int i);
    }

    public C4625z(C4626a aVar) {
        this.f12601a = aVar;
    }

    public final void onCallStateChanged(int i, String str) {
        super.onCallStateChanged(i, str);
        if (this.f12601a != null) {
            this.f12601a.mo10409a(i);
        }
    }
}
