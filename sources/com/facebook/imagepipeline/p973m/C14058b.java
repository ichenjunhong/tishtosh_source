package com.facebook.imagepipeline.p973m;

import android.graphics.Bitmap;
import com.C2240a;
import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.p975o.C14228a;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;

/* renamed from: com.facebook.imagepipeline.m.b */
public final class C14058b extends C14228a {

    /* renamed from: a */
    private final int f36728a;

    /* renamed from: b */
    private final int f36729b;

    /* renamed from: c */
    private C13619c f36730c;

    public final C13619c getPostprocessorCacheKey() {
        if (this.f36730c == null) {
            this.f36730c = new C13624h(C2240a.m6773a(null, "i%dr%d", new Object[]{Integer.valueOf(this.f36728a), Integer.valueOf(this.f36729b)}));
        }
        return this.f36730c;
    }

    public C14058b(int i) {
        this(3, i);
    }

    public final void process(Bitmap bitmap) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, this.f36728a, this.f36729b);
    }

    private C14058b(int i, int i2) {
        boolean z = true;
        C13689i.m27655a(true);
        if (i2 <= 0) {
            z = false;
        }
        C13689i.m27655a(z);
        this.f36728a = 3;
        this.f36729b = i2;
    }
}
