package android.support.design.bottomappbar;

import android.support.design.p028f.C0426b;
import android.support.design.p028f.C0428d;

/* renamed from: android.support.design.bottomappbar.a */
public final class C0417a extends C0426b {

    /* renamed from: a */
    public float f1334a;

    /* renamed from: b */
    public float f1335b;

    /* renamed from: c */
    public float f1336c;

    /* renamed from: d */
    public float f1337d;

    /* renamed from: e */
    public float f1338e;

    /* renamed from: a */
    public final void mo972a(float f, float f2, C0428d dVar) {
        float f3 = f;
        C0428d dVar2 = dVar;
        if (this.f1336c == 0.0f) {
            dVar2.mo1027a(f3, 0.0f);
            return;
        }
        float f4 = ((this.f1335b * 2.0f) + this.f1336c) / 2.0f;
        float f5 = f2 * this.f1334a;
        float f6 = (f3 / 2.0f) + this.f1338e;
        float f7 = (this.f1337d * f2) + ((1.0f - f2) * f4);
        if (f7 / f4 >= 1.0f) {
            dVar2.mo1027a(f3, 0.0f);
            return;
        }
        float f8 = f4 + f5;
        float f9 = f7 + f5;
        float sqrt = (float) Math.sqrt((double) ((f8 * f8) - (f9 * f9)));
        float f10 = f6 - sqrt;
        float f11 = f6 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f9)));
        float f12 = 90.0f - degrees;
        float f13 = f10 - f5;
        dVar2.mo1027a(f13, 0.0f);
        float f14 = f5 * 2.0f;
        float f15 = degrees;
        dVar.mo1028a(f13, 0.0f, f10 + f5, f14, 270.0f, degrees);
        dVar.mo1028a(f6 - f4, (-f4) - f7, f6 + f4, f4 - f7, 180.0f - f12, (f12 * 2.0f) - 180.0f);
        dVar.mo1028a(f11 - f5, 0.0f, f11 + f5, f14, 270.0f - f15, f15);
        dVar2.mo1027a(f3, 0.0f);
    }
}
