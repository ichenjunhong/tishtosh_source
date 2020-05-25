package com.p683ss.android.p1103ad.splash.core.video2;

/* renamed from: com.ss.android.ad.splash.core.video2.c */
public class C18711c implements C18710b {

    /* renamed from: a */
    private int f51772a;

    /* renamed from: a */
    public void mo37921a() {
    }

    /* renamed from: a */
    public void mo37922a(int i) {
    }

    /* renamed from: a */
    public void mo37923a(int i, int i2) {
    }

    /* renamed from: b */
    public void mo37924b() {
    }

    /* renamed from: b */
    public void mo37925b(int i, int i2) {
    }

    /* renamed from: c */
    public void mo37926c(int i, int i2) {
    }

    /* renamed from: d */
    public void mo37927d(int i, int i2) {
    }

    /* renamed from: e */
    public final void mo38322e(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f >= 0.0f) {
            if (f >= 0.75f && (this.f51772a & 8) == 0) {
                this.f51772a |= 8;
                mo37927d(i, i2);
            }
            if (f >= 0.5f && (this.f51772a & 4) == 0) {
                this.f51772a |= 4;
                mo37926c(i, i2);
            }
            if (f >= 0.25f && (this.f51772a & 2) == 0) {
                this.f51772a |= 2;
                mo37925b(i, i2);
            }
        }
    }
}
