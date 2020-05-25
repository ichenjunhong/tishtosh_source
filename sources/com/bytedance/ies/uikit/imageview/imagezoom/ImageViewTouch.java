package com.bytedance.ies.uikit.imageview.imagezoom;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public class ImageViewTouch extends ImageViewTouchBase {

    /* renamed from: a */
    protected ScaleGestureDetector f29901a;

    /* renamed from: b */
    protected GestureDetector f29902b;

    /* renamed from: c */
    protected int f29903c;

    /* renamed from: d */
    protected float f29904d;

    /* renamed from: e */
    protected float f29905e;

    /* renamed from: f */
    protected int f29906f;

    /* renamed from: g */
    protected OnGestureListener f29907g;

    /* renamed from: h */
    protected OnScaleGestureListener f29908h;

    /* renamed from: i */
    protected boolean f29909i = true;

    /* renamed from: j */
    protected boolean f29910j = true;

    /* renamed from: k */
    protected boolean f29911k = true;

    /* renamed from: l */
    public C11108b f29912l;

    /* renamed from: m */
    protected boolean f29913m = true;

    /* renamed from: n */
    protected OnClickListener f29914n;

    /* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch$a */
    public class C11107a extends SimpleOnGestureListener {
        public C11107a() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (ImageViewTouch.this.isLongClickable() && !ImageViewTouch.this.f29901a.isInProgress()) {
                ImageViewTouch.this.setPressed(true);
                ImageViewTouch.this.performLongClick();
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.f29914n == null || !ImageViewTouch.this.f29913m) {
                return super.onSingleTapConfirmed(motionEvent);
            }
            ImageViewTouch.this.f29914n.onClick(ImageViewTouch.this);
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (ImageViewTouch.this.f29909i) {
                float min = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(ImageViewTouch.this.mo20149a(ImageViewTouch.this.getScale(), ImageViewTouch.this.getMaxZoom()), ImageViewTouch.this.getMinZoom()));
                ImageViewTouch.this.f29904d = min;
                ImageViewTouch.this.mo20178a(min, motionEvent.getX(), motionEvent.getY(), 200.0f);
                ImageViewTouch.this.invalidate();
            }
            if (ImageViewTouch.this.f29912l != null) {
                ImageViewTouch.this.f29912l.mo20172a();
            }
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return ImageViewTouch.this.mo20157b(motionEvent, motionEvent2, f, f2);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return ImageViewTouch.this.mo20155a(motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch$b */
    public interface C11108b {
        /* renamed from: a */
        void mo20172a();
    }

    /* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch$c */
    public class C11109c extends SimpleOnScaleGestureListener {
        public C11109c() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getCurrentSpan();
            scaleGestureDetector.getPreviousSpan();
            float scaleFactor = ImageViewTouch.this.f29904d * scaleGestureDetector.getScaleFactor();
            if (!ImageViewTouch.this.f29910j) {
                return false;
            }
            float min = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(scaleFactor, ImageViewTouch.this.getMinZoom() - 0.1f));
            ImageViewTouch.this.mo20177a(min, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            ImageViewTouch.this.f29904d = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(min, ImageViewTouch.this.getMinZoom() - 1.0f));
            ImageViewTouch.this.f29906f = 1;
            ImageViewTouch.this.invalidate();
            return true;
        }
    }

    public boolean getDoubleTapEnabled() {
        return this.f29909i;
    }

    /* access modifiers changed from: protected */
    public OnGestureListener getGestureListener() {
        return new C11107a();
    }

    /* access modifiers changed from: protected */
    public OnScaleGestureListener getScaleListener() {
        return new C11109c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20150a() {
        super.mo20150a();
        this.f29903c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f29907g = getGestureListener();
        this.f29908h = getScaleListener();
        this.f29901a = new ScaleGestureDetector(getContext().getApplicationContext(), this.f29908h);
        this.f29902b = new GestureDetector(getContext().getApplicationContext(), this.f29907g, null, true);
        this.f29904d = 1.0f;
        this.f29906f = 1;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f29909i = z;
    }

    public void setDoubleTapListener(C11108b bVar) {
        this.f29912l = bVar;
    }

    public void setMyOnClickListener(OnClickListener onClickListener) {
        this.f29914n = onClickListener;
    }

    public void setScaleEnabled(boolean z) {
        this.f29910j = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f29911k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20151a(float f) {
        super.mo20151a(f);
        if (!this.f29901a.isInProgress()) {
            this.f29904d = f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo20156b(float f) {
        super.mo20156b(f);
        if (!this.f29901a.isInProgress()) {
            this.f29904d = f;
        }
        if (f < getMinZoom()) {
            mo20182b(getMinZoom(), 50.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20152a(Drawable drawable) {
        super.mo20152a(drawable);
        float[] fArr = new float[9];
        this.f29927q.getValues(fArr);
        this.f29904d = fArr[0];
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 0) {
            this.f29913m = true;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f29913m = false;
        }
        this.f29901a.onTouchEvent(motionEvent);
        if (!this.f29901a.isInProgress()) {
            this.f29902b.onTouchEvent(motionEvent);
        }
        switch (action) {
            case 0:
                this.f29923G = false;
                break;
            case 1:
                if (getScale() < getMinZoom()) {
                    mo20182b(getMinZoom(), 50.0f);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo20154a(int i) {
        if (getDrawable() == null) {
            return false;
        }
        RectF bitmapRect = getBitmapRect();
        if (bitmapRect == null) {
            return false;
        }
        mo20179a(bitmapRect, this.f29922F);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect.right < ((float) rect.right) || i >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.f29922F.left)) > 1.0d) {
                return true;
            }
            return false;
        } else if (Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo20149a(float f, float f2) {
        if (this.f29906f != 1) {
            this.f29906f = 1;
            return 1.0f;
        } else if ((this.f29905e * 2.0f) + f <= f2) {
            return f + this.f29905e;
        } else {
            this.f29906f = -1;
            return f2;
        }
    }

    /* renamed from: b */
    public final boolean mo20157b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f29911k || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.f29901a.isInProgress()) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f) <= 800.0f && Math.abs(f2) <= 800.0f) {
            return false;
        }
        mo20176a(x / 2.0f, y / 2.0f, 300.0d);
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20153a(Drawable drawable, boolean z, Matrix matrix, float f) {
        super.mo20153a(drawable, z, matrix, f);
        this.f29905e = getMaxZoom() / 3.0f;
    }

    /* renamed from: a */
    public final boolean mo20155a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f29911k || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.f29901a.isInProgress()) {
            return false;
        }
        if (getScale() == 1.0f && !this.f29936z) {
            return false;
        }
        mo20184c(-f, -f2);
        invalidate();
        return true;
    }
}
