package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.p920d.C13689i;

/* renamed from: com.facebook.drawee.e.i */
public final class C13806i extends C13804g {

    /* renamed from: a */
    final Matrix f35985a;

    /* renamed from: b */
    private int f35986b;

    /* renamed from: c */
    private int f35987c;

    /* renamed from: d */
    private final Matrix f35988d = new Matrix();

    /* renamed from: e */
    private final RectF f35989e = new RectF();

    public final int getIntrinsicHeight() {
        if (this.f35987c == 5 || this.f35987c == 7 || this.f35986b % NormalGiftView.ALPHA_180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        if (this.f35987c == 5 || this.f35987c == 7 || this.f35986b % NormalGiftView.ALPHA_180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    public final void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        if (!this.f35985a.isIdentity()) {
            matrix.preConcat(this.f35985a);
        }
    }

    public final void draw(Canvas canvas) {
        if (this.f35986b > 0 || !(this.f35987c == 0 || this.f35987c == 1)) {
            int save = canvas.save();
            canvas.concat(this.f35985a);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable current = getCurrent();
        if (this.f35986b > 0 || !(this.f35987c == 0 || this.f35987c == 1)) {
            int i = this.f35987c;
            if (i == 2) {
                this.f35985a.setScale(-1.0f, 1.0f);
            } else if (i != 7) {
                switch (i) {
                    case 4:
                        this.f35985a.setScale(1.0f, -1.0f);
                        break;
                    case 5:
                        this.f35985a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                        this.f35985a.postScale(1.0f, -1.0f);
                        break;
                    default:
                        this.f35985a.setRotate((float) this.f35986b, (float) rect.centerX(), (float) rect.centerY());
                        break;
                }
            } else {
                this.f35985a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f35985a.postScale(-1.0f, 1.0f);
            }
            this.f35988d.reset();
            this.f35985a.invert(this.f35988d);
            this.f35989e.set(rect);
            this.f35988d.mapRect(this.f35989e);
            current.setBounds((int) this.f35989e.left, (int) this.f35989e.top, (int) this.f35989e.right, (int) this.f35989e.bottom);
            return;
        }
        current.setBounds(rect);
    }

    public C13806i(Drawable drawable, int i, int i2) {
        boolean z;
        super(drawable);
        boolean z2 = false;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i2 >= 0 && i2 <= 8) {
            z2 = true;
        }
        C13689i.m27655a(z2);
        this.f35985a = new Matrix();
        this.f35986b = i;
        this.f35987c = i2;
    }
}
