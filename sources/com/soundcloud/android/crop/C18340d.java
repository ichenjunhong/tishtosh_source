package com.soundcloud.android.crop;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: com.soundcloud.android.crop.d */
final class C18340d {

    /* renamed from: a */
    public Bitmap f50647a;

    /* renamed from: b */
    public int f50648b;

    /* renamed from: e */
    private boolean m44553e() {
        if ((this.f50648b / 90) % 2 != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo36780d() {
        if (this.f50647a != null) {
            this.f50647a.recycle();
            this.f50647a = null;
        }
    }

    /* renamed from: b */
    public final int mo36778b() {
        if (this.f50647a == null) {
            return 0;
        }
        if (m44553e()) {
            return this.f50647a.getWidth();
        }
        return this.f50647a.getHeight();
    }

    /* renamed from: c */
    public final int mo36779c() {
        if (this.f50647a == null) {
            return 0;
        }
        if (m44553e()) {
            return this.f50647a.getHeight();
        }
        return this.f50647a.getWidth();
    }

    /* renamed from: a */
    public final Matrix mo36777a() {
        Matrix matrix = new Matrix();
        if (!(this.f50647a == null || this.f50648b == 0)) {
            matrix.preTranslate((float) (-(this.f50647a.getWidth() / 2)), (float) (-(this.f50647a.getHeight() / 2)));
            matrix.postRotate((float) this.f50648b);
            matrix.postTranslate((float) (mo36779c() / 2), (float) (mo36778b() / 2));
        }
        return matrix;
    }

    public C18340d(Bitmap bitmap, int i) {
        this.f50647a = bitmap;
        this.f50648b = i % 360;
    }
}
