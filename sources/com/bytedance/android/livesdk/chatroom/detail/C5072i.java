package com.bytedance.android.livesdk.chatroom.detail;

import android.os.CountDownTimer;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.i */
public final class C5072i {

    /* renamed from: a */
    public CountDownTimer f13626a;

    /* renamed from: b */
    public CountDownTimer f13627b;

    /* renamed from: c */
    public CountDownTimer f13628c;

    /* renamed from: a */
    public final void mo10963a() {
        if (this.f13626a != null) {
            this.f13626a.start();
        }
        if (this.f13627b != null) {
            this.f13627b.start();
        }
    }

    /* renamed from: b */
    public final void mo10964b() {
        if (this.f13626a != null) {
            this.f13626a.cancel();
        }
        if (this.f13627b != null) {
            this.f13627b.cancel();
        }
        if (this.f13628c != null) {
            this.f13628c.cancel();
        }
    }

    public C5072i() {
        C50731 r0 = new CountDownTimer(3000, 3000) {
            public final void onFinish() {
            }

            public final void onTick(long j) {
            }
        };
        this.f13626a = r0;
        C50742 r7 = new CountDownTimer(6000, 6000) {
            public final void onFinish() {
            }

            public final void onTick(long j) {
            }
        };
        this.f13627b = r7;
        C50753 r1 = new CountDownTimer(3000, 3000) {
            public final void onFinish() {
            }

            public final void onTick(long j) {
            }
        };
        this.f13628c = r1;
    }
}
