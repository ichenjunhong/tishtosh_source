package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.twitter.sdk.android.tweetui.internal.e */
public final class C52294e extends ImageView {

    /* renamed from: a */
    C52295a f130235a = new C52295a(null);

    /* renamed from: com.twitter.sdk.android.tweetui.internal.e$a */
    protected static class C52295a {

        /* renamed from: a */
        final Drawable f130236a;

        C52295a(Drawable drawable) {
            this.f130236a = drawable;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo109110a(int[] iArr) {
            if (this.f130236a != null && this.f130236a.isStateful()) {
                this.f130236a.setState(iArr);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo109109a(int i, int i2) {
            if (this.f130236a != null) {
                this.f130236a.setBounds(0, 0, i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f130235a.mo109110a(getDrawableState());
    }

    public C52294e(Context context) {
        super(context);
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.f130235a.f130236a) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C52295a aVar = this.f130235a;
        if (aVar.f130236a != null) {
            aVar.f130236a.draw(canvas);
        }
    }

    public final void setOverlayDrawable(Drawable drawable) {
        if (drawable != this.f130235a.f130236a) {
            C52295a aVar = this.f130235a;
            if (aVar.f130236a != null) {
                aVar.f130236a.setCallback(null);
                unscheduleDrawable(aVar.f130236a);
            }
            if (drawable != null) {
                drawable.setCallback(this);
            }
            this.f130235a = new C52295a(drawable);
            this.f130235a.mo109110a(getDrawableState());
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f130235a.mo109109a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f130235a.mo109109a(i, i2);
    }
}
