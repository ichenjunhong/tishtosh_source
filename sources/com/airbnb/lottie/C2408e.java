package com.airbnb.lottie;

import android.graphics.Rect;
import android.support.p030v4.p038f.C0785g;
import android.support.p030v4.p038f.C0801o;
import com.airbnb.lottie.p108c.C2381c;
import com.airbnb.lottie.p108c.C2397d;
import com.airbnb.lottie.p108c.p111c.C2388d;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.e */
public final class C2408e {

    /* renamed from: a */
    public final C2479m f7515a = new C2479m();

    /* renamed from: b */
    public Map<String, List<C2388d>> f7516b;

    /* renamed from: c */
    public Map<String, C2472h> f7517c;

    /* renamed from: d */
    public Map<String, C2381c> f7518d;

    /* renamed from: e */
    public C0801o<C2397d> f7519e;

    /* renamed from: f */
    C0785g<C2388d> f7520f;

    /* renamed from: g */
    public List<C2388d> f7521g;

    /* renamed from: h */
    public Rect f7522h;

    /* renamed from: i */
    public float f7523i;

    /* renamed from: j */
    public float f7524j;

    /* renamed from: k */
    public float f7525k;

    /* renamed from: l */
    private final HashSet<String> f7526l = new HashSet<>();

    /* renamed from: b */
    public final float mo6781b() {
        return this.f7524j - this.f7523i;
    }

    /* renamed from: a */
    public final float mo6777a() {
        return (float) ((long) ((mo6781b() / this.f7525k) * 1000.0f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C2388d a : this.f7521g) {
            sb.append(a.mo6756a("\t"));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo6779a(String str) {
        this.f7526l.add(str);
    }

    /* renamed from: a */
    public final C2388d mo6778a(long j) {
        return (C2388d) this.f7520f.mo2487a(j);
    }

    /* renamed from: a */
    public final void mo6780a(boolean z) {
        this.f7515a.f7672a = z;
    }
}
