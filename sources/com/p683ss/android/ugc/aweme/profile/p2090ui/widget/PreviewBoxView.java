package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView */
public class PreviewBoxView extends View {

    /* renamed from: a */
    public boolean f103142a;

    /* renamed from: b */
    public int f103143b;

    /* renamed from: c */
    public int f103144c;

    /* renamed from: d */
    public float f103145d = 0.5625f;

    /* renamed from: e */
    public float f103146e;

    /* renamed from: f */
    public C40414a f103147f;

    /* renamed from: g */
    private Paint f103148g;

    /* renamed from: h */
    private ValueAnimator f103149h;

    /* renamed from: i */
    private RectF f103150i;

    /* renamed from: j */
    private Bitmap f103151j;

    /* renamed from: k */
    private Context f103152k;

    /* renamed from: l */
    private int f103153l = -1;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView$a */
    public interface C40414a {
        /* renamed from: a */
        void mo82258a();

        /* renamed from: a */
        void mo82259a(float f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public Rect getVisibleRect() {
        Rect rect = new Rect();
        rect.set((int) this.f103150i.left, (int) this.f103150i.top, (int) this.f103150i.right, (int) this.f103150i.bottom);
        return rect;
    }

    /* renamed from: b */
    public final void mo82687b() {
        if (this.f103149h != null && this.f103149h.isStarted()) {
            this.f103149h.cancel();
        }
        if (Math.abs(this.f103146e - 0.5f) >= Float.MIN_NORMAL) {
            this.f103146e = 0.5f;
            setAlpha(this.f103146e);
            if (this.f103147f != null) {
                this.f103147f.mo82258a();
            }
        }
    }

    /* renamed from: a */
    public final void mo82686a() {
        if (Math.abs(this.f103146e - 0.85f) >= Float.MIN_NORMAL && !this.f103142a) {
            this.f103142a = true;
            this.f103149h = ValueAnimator.ofFloat(new float[]{0.5f, 0.85f});
            this.f103149h.setEvaluator(new FloatEvaluator());
            this.f103149h.setDuration(300);
            this.f103149h.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PreviewBoxView.this.f103146e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewBoxView.this.setAlpha(PreviewBoxView.this.f103146e);
                    if (PreviewBoxView.this.f103147f != null) {
                        PreviewBoxView.this.f103147f.mo82259a(valueAnimator.getAnimatedFraction());
                    }
                }
            });
            this.f103149h.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    PreviewBoxView.this.f103146e = 0.85f;
                    PreviewBoxView.this.f103142a = false;
                }
            });
            this.f103149h.setStartDelay(300);
            this.f103149h.start();
        }
    }

    public void setTopOffset(int i) {
        this.f103153l = i;
    }

    public PreviewBoxView(Context context) {
        super(context);
        m89815a(context);
    }

    /* renamed from: a */
    private void m89815a(Context context) {
        this.f103152k = context;
        this.f103148g = new Paint();
        this.f103148g.setAntiAlias(true);
        this.f103143b = (int) C9432q.m18687b(context, 16.0f);
        this.f103146e = 0.5f;
        setAlpha(this.f103146e);
    }

    public void onDraw(Canvas canvas) {
        int i;
        boolean z;
        if (this.f103150i != null) {
            if (this.f103151j == null) {
                int width = getWidth();
                int height = getHeight();
                RectF rectF = this.f103150i;
                Context context = this.f103152k;
                if (context != null) {
                    i = context.getResources().getColor(R.color.av_);
                } else {
                    i = Color.parseColor("#d9161823");
                }
                if (this.f103144c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_4444);
                Canvas canvas2 = new Canvas(createBitmap);
                canvas2.drawColor(i);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
                if (z) {
                    canvas2.drawOval(rectF, paint);
                } else {
                    canvas2.drawRect(rectF, paint);
                }
                this.f103151j = createBitmap;
            }
            canvas.drawBitmap(this.f103151j, 0.0f, 0.0f, this.f103148g);
        }
    }

    public PreviewBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89815a(context);
    }

    public PreviewBoxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m89815a(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth() - (this.f103143b * 2);
        int i5 = (int) (((float) width) * this.f103145d);
        int i6 = this.f103153l;
        if (i6 < 0) {
            i6 = Math.max(0, (getHeight() - i5) / 2);
        }
        this.f103150i = new RectF((float) this.f103143b, (float) i6, (float) (this.f103143b + width), (float) (i6 + i5));
    }
}
