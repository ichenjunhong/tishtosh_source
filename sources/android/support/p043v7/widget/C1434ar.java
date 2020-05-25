package android.support.p043v7.widget;

import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: android.support.v7.widget.ar */
final class C1434ar {

    /* renamed from: a */
    public int f5158a;

    /* renamed from: b */
    public int f5159b;

    /* renamed from: c */
    int f5160c = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: d */
    int f5161d = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: e */
    int f5162e;

    /* renamed from: f */
    int f5163f;

    /* renamed from: g */
    boolean f5164g;

    /* renamed from: h */
    boolean f5165h;

    C1434ar() {
    }

    /* renamed from: a */
    public final void mo5604a(int i, int i2) {
        this.f5160c = i;
        this.f5161d = i2;
        this.f5165h = true;
        if (this.f5164g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f5158a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f5159b = i;
            }
        } else {
            if (i != Integer.MIN_VALUE) {
                this.f5158a = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f5159b = i2;
            }
        }
    }

    /* renamed from: b */
    public final void mo5605b(int i, int i2) {
        this.f5165h = false;
        if (i != Integer.MIN_VALUE) {
            this.f5162e = i;
            this.f5158a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5163f = i2;
            this.f5159b = i2;
        }
    }
}
