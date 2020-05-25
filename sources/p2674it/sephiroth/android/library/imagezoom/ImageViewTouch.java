package p2674it.sephiroth.android.library.imagezoom;

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
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch */
public class ImageViewTouch extends ImageViewTouchBase {

    /* renamed from: a */
    protected ScaleGestureDetector f131701a;

    /* renamed from: b */
    protected GestureDetector f131702b;

    /* renamed from: c */
    protected int f131703c;

    /* renamed from: d */
    protected float f131704d;

    /* renamed from: e */
    protected int f131705e;

    /* renamed from: f */
    protected OnGestureListener f131706f;

    /* renamed from: g */
    protected OnScaleGestureListener f131707g;

    /* renamed from: h */
    protected boolean f131708h;

    /* renamed from: i */
    protected boolean f131709i;

    /* renamed from: j */
    protected boolean f131710j;

    /* renamed from: k */
    public C53178b f131711k;

    /* renamed from: l */
    public C53179c f131712l;

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$a */
    public class C53177a extends SimpleOnGestureListener {
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        public C53177a() {
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.f131712l != null) {
                ImageViewTouch.this.f131712l.mo91689a();
            }
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (ImageViewTouch.this.isLongClickable() && !ImageViewTouch.this.f131701a.isInProgress()) {
                ImageViewTouch.this.setPressed(true);
                ImageViewTouch.this.performLongClick();
            }
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (ImageViewTouch.this.f131708h) {
                ImageViewTouch.this.f131733s = true;
                ImageViewTouch.this.mo110714a(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(ImageViewTouch.this.mo110685a(ImageViewTouch.this.getScale(), ImageViewTouch.this.getMaxScale()), ImageViewTouch.this.getMinScale())), motionEvent.getX(), motionEvent.getY(), 200.0f);
                ImageViewTouch.this.invalidate();
            }
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ImageViewTouch.this.f131710j && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.f131701a.isInProgress() && ImageViewTouch.this.getScale() != 1.0f) {
                return ImageViewTouch.this.mo110691b(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ImageViewTouch.this.f131710j && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.f131701a.isInProgress()) {
                return ImageViewTouch.this.mo110690a(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$b */
    public interface C53178b {
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$c */
    public interface C53179c {
        /* renamed from: a */
        void mo91689a();
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$d */
    public class C53180d extends SimpleOnScaleGestureListener {

        /* renamed from: a */
        protected boolean f131714a;

        public C53180d() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = ImageViewTouch.this.getScale() * scaleGestureDetector.getScaleFactor();
            if (ImageViewTouch.this.f131709i) {
                if (this.f131714a && currentSpan != 0.0f) {
                    ImageViewTouch.this.f131733s = true;
                    ImageViewTouch.this.mo110713a(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(scale, ImageViewTouch.this.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    ImageViewTouch.this.f131705e = 1;
                    ImageViewTouch.this.invalidate();
                    return true;
                } else if (!this.f131714a) {
                    this.f131714a = true;
                }
            }
            return true;
        }
    }

    public boolean getDoubleTapEnabled() {
        return this.f131708h;
    }

    /* access modifiers changed from: protected */
    public OnGestureListener getGestureListener() {
        return new C53177a();
    }

    /* access modifiers changed from: protected */
    public OnScaleGestureListener getScaleListener() {
        return new C53180d();
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f131708h = z;
    }

    public void setDoubleTapListener(C53178b bVar) {
        this.f131711k = bVar;
    }

    public void setScaleEnabled(boolean z) {
        this.f131709i = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f131710j = z;
    }

    public void setSingleTapListener(C53179c cVar) {
        this.f131712l = cVar;
    }

    public ImageViewTouch(Context context) {
        super(context);
        this.f131708h = true;
        this.f131709i = true;
        this.f131710j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110686a(float f) {
        if (f < getMinScale()) {
            mo110717b(getMinScale(), 50.0f);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f131701a.onTouchEvent(motionEvent);
        if (!this.f131701a.isInProgress()) {
            this.f131702b.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & NormalGiftView.ALPHA_255) == 1 && getScale() < getMinScale()) {
            mo110717b(getMinScale(), 50.0f);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo110689a(int i) {
        RectF bitmapRect = getBitmapRect();
        mo110715a(bitmapRect, this.f131740z);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect == null) {
            return false;
        }
        if (bitmapRect.right < ((float) rect.right) || i >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.f131740z.left)) > 1.0d) {
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
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo110685a(float f, float f2) {
        if (this.f131705e != 1) {
            this.f131705e = 1;
            return 1.0f;
        } else if ((this.f131704d * 2.0f) + f <= f2) {
            return f + this.f131704d;
        } else {
            this.f131705e = -1;
            return f2;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f131708h = true;
        this.f131709i = true;
        this.f131710j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110687a(Context context, AttributeSet attributeSet, int i) {
        super.mo110687a(context, attributeSet, i);
        this.f131703c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f131706f = getGestureListener();
        this.f131707g = getScaleListener();
        this.f131701a = new ScaleGestureDetector(getContext(), this.f131707g);
        this.f131702b = new GestureDetector(getContext(), this.f131706f, null, true);
        this.f131705e = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110688a(Drawable drawable, Matrix matrix, float f, float f2) {
        super.mo110688a(drawable, matrix, f, f2);
        this.f131704d = getMaxScale() / 3.0f;
    }

    /* renamed from: b */
    public final boolean mo110691b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f) <= 800.0f && Math.abs(f2) <= 800.0f) {
            return false;
        }
        this.f131733s = true;
        mo110712a(x / 2.0f, y / 2.0f, 300.0d);
        invalidate();
        return true;
    }

    /* renamed from: a */
    public final boolean mo110690a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (getScale() == 1.0f) {
            return false;
        }
        this.f131733s = true;
        mo110719c(-f, -f2);
        invalidate();
        return true;
    }
}
