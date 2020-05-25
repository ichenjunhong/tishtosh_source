package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.FixBubbleLayout */
public class FixBubbleLayout extends LinearLayout {

    /* renamed from: b */
    public static int f110030b;

    /* renamed from: c */
    public static int f110031c;

    /* renamed from: d */
    public static float f110032d;

    /* renamed from: e */
    public static float f110033e;

    /* renamed from: f */
    public static float f110034f;

    /* renamed from: g */
    public static int f110035g;

    /* renamed from: h */
    public static int f110036h;

    /* renamed from: i */
    public static int f110037i;

    /* renamed from: A */
    private boolean f110038A;

    /* renamed from: a */
    PorterDuffXfermode f110039a;

    /* renamed from: j */
    private Paint f110040j;

    /* renamed from: k */
    private final Path f110041k;

    /* renamed from: l */
    private final Path f110042l;

    /* renamed from: m */
    private RectF f110043m;

    /* renamed from: n */
    private float f110044n;

    /* renamed from: o */
    private float f110045o;

    /* renamed from: p */
    private Path f110046p;

    /* renamed from: q */
    private RectF f110047q;

    /* renamed from: r */
    private int f110048r;

    /* renamed from: s */
    private Matrix f110049s;

    /* renamed from: t */
    private Bitmap f110050t;

    /* renamed from: u */
    private Canvas f110051u;

    /* renamed from: v */
    private int f110052v;

    /* renamed from: w */
    private int f110053w;

    /* renamed from: x */
    private float f110054x;

    /* renamed from: y */
    private int f110055y;

    /* renamed from: z */
    private boolean f110056z;

    /* renamed from: a */
    private void m95381a() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addUpdateListener(C43520g.f110089a);
    }

    public float getBubbleOffset() {
        float max = Math.max(this.f110054x, f110034f);
        switch (this.f110055y) {
            case 0:
                return Math.min(max, this.f110044n - f110034f);
            case 1:
                return Math.min(max, this.f110045o - f110034f);
            case 2:
                return Math.min(max, this.f110045o - f110034f);
            case 3:
                return Math.min(max, this.f110044n - f110034f);
            default:
                return 0.0f;
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setAnimOffset(int i) {
        f110037i = i;
    }

    public void setBgColor(int i) {
        this.f110052v = i;
    }

    public void setBorderColor(int i) {
        this.f110053w = i;
    }

    public void setBubbleOrientation(int i) {
        this.f110055y = i;
    }

    public void setNeedPath(boolean z) {
        this.f110056z = z;
    }

    public void setNeedPressFade(boolean z) {
        this.f110038A = z;
    }

    public FixBubbleLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (this.f110038A) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
                        ofFloat.setDuration(100);
                        ofFloat.start();
                        ofFloat.addUpdateListener(C43521h.f110090a);
                        break;
                    }
                    break;
                case 1:
                    if (this.f110038A) {
                        m95381a();
                        break;
                    }
                    break;
            }
        } else if (this.f110038A) {
            m95381a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        if (this.f110050t == null) {
            this.f110050t = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Config.ARGB_8888);
            this.f110051u = new Canvas(this.f110050t);
        }
        float f2 = this.f110044n;
        float f3 = this.f110045o;
        float max = Math.max(this.f110054x, f110034f);
        float min = Math.min(max, f3 - f110034f);
        Matrix matrix = new Matrix();
        this.f110049s = new Matrix();
        int i = f110030b + f110037i;
        switch (this.f110055y) {
            case 0:
                f = Math.min(max, f2 - f110034f);
                min = (float) (f110037i + (this.f110048r * 2));
                matrix.postRotate(90.0f);
                this.f110049s.postRotate(90.0f);
                this.f110049s.postTranslate(((float) ((this.f110048r * 3) / 2)) + f, ((float) this.f110048r) + min);
                break;
            case 1:
                f = (float) (f110037i + (this.f110048r * 2));
                min = Math.min(max, f3 - f110034f);
                setGravity(17);
                this.f110049s.postTranslate(((float) this.f110048r) + f, ((float) ((this.f110048r * 3) / 2)) + min);
                break;
            case 2:
                f = (f2 - ((float) f110037i)) - ((float) (this.f110048r * 2));
                min = Math.min(max, f3 - f110034f);
                matrix.postRotate(180.0f);
                this.f110049s.postRotate(180.0f);
                this.f110049s.postTranslate(((float) (this.f110048r * 2)) + f, ((float) ((this.f110048r * 3) / 2)) + min);
                break;
            case 3:
                f = Math.min(max, f2 - f110034f);
                min = (f3 - ((float) f110037i)) - ((float) (this.f110048r * 2));
                matrix.postRotate(270.0f);
                this.f110049s.postRotate(270.0f);
                this.f110049s.postTranslate(((float) ((this.f110048r * 3) / 2)) + f, ((float) (this.f110048r * 2)) + min);
                break;
            default:
                f = 0.0f;
                break;
        }
        setGravity(17);
        float f4 = (float) i;
        this.f110043m = new RectF(f4, f4, this.f110044n - f4, this.f110045o - f4);
        this.f110043m.left += (float) ((this.f110048r * 3) / 2);
        this.f110043m.top += (float) ((this.f110048r * 3) / 2);
        this.f110043m.right += (float) ((this.f110048r * 3) / 2);
        this.f110043m.bottom += (float) ((this.f110048r * 3) / 2);
        this.f110047q = new RectF();
        this.f110047q.left = this.f110043m.left - (((float) this.f110048r) / 2.0f);
        this.f110047q.top = this.f110043m.top - (((float) this.f110048r) / 2.0f);
        this.f110047q.right = this.f110043m.right + (((float) this.f110048r) / 2.0f);
        this.f110047q.bottom = this.f110043m.bottom + (((float) this.f110048r) / 2.0f);
        matrix.postTranslate(f + ((((float) this.f110048r) * 3.0f) / 2.0f), min + ((((float) this.f110048r) * 3.0f) / 2.0f));
        this.f110040j.setColor(this.f110053w);
        this.f110040j.setStyle(Style.STROKE);
        this.f110040j.setStrokeWidth((float) this.f110048r);
        if (this.f110056z) {
            this.f110041k.reset();
            this.f110041k.addRoundRect(this.f110047q, f110033e + ((float) (this.f110048r / 2)), f110033e + ((float) (this.f110048r / 2)), Direction.CW);
            this.f110041k.addPath(this.f110046p, this.f110049s);
            this.f110051u.drawPath(this.f110041k, this.f110040j);
        }
        this.f110040j.setXfermode(this.f110039a);
        this.f110040j.setColor(this.f110052v);
        this.f110040j.setStyle(Style.FILL);
        this.f110041k.reset();
        Path path = this.f110041k;
        RectF rectF = this.f110043m;
        float f5 = f110033e;
        path.addRoundRect(rectF, f5, f5, Direction.CW);
        this.f110041k.addPath(this.f110042l, matrix);
        this.f110051u.drawPath(this.f110041k, this.f110040j);
        this.f110040j.setXfermode(null);
        canvas.drawBitmap(this.f110050t, 0.0f, 0.0f, null);
    }

    /* renamed from: a */
    public final void mo88529a(int i, float f) {
        this.f110054x = f;
        this.f110055y = i;
    }

    public FixBubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m95380a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        TextView textView;
        int i3;
        super.onMeasure(i, i2);
        if (getChildAt(0) instanceof TextView) {
            textView = (TextView) getChildAt(0);
        } else {
            textView = null;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (textView != null) {
            i3 = ((int) textView.getPaint().measureText(textView.getText().toString())) + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            i3 = getMeasuredWidth();
        }
        if (this.f110055y == 2 || this.f110055y == 1) {
            if (i3 <= f110035g) {
                i3 = f110035g;
            }
            i3 += f110030b;
        } else if (i3 <= f110035g) {
            i3 = f110035g;
        }
        int measuredHeight = getMeasuredHeight() + (this.f110048r * 3) + (f110030b * 2) + (f110037i * 2);
        int i4 = i3 + (this.f110048r * 3) + (f110030b * 2) + (f110037i * 2);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i4, measuredHeight);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i4, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, measuredHeight);
        }
        this.f110044n = (float) (getMeasuredWidth() - (this.f110048r * 3));
        this.f110045o = (float) (getMeasuredHeight() - (this.f110048r * 3));
    }

    public FixBubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f110039a = new PorterDuffXfermode(Mode.SRC);
        this.f110040j = null;
        this.f110041k = new Path();
        this.f110042l = new Path();
        this.f110046p = new Path();
        this.f110054x = 0.75f;
        this.f110055y = 1;
        this.f110056z = true;
        this.f110048r = (int) m95380a(context, 0.5f);
        f110030b = (int) m95380a(context, 7.0f);
        f110031c = (int) m95380a(context, 6.0f);
        f110032d = 2.0f;
        f110033e = m95380a(context, 6.0f);
        f110034f = (float) (f110030b + f110031c);
        f110035g = (int) m95380a(context, 50.0f);
        f110036h = (int) m95380a(context, 46.0f);
        this.f110040j = new Paint();
        this.f110040j.setStyle(Style.FILL);
        this.f110040j.setStrokeCap(Cap.BUTT);
        this.f110040j.setAntiAlias(true);
        this.f110040j.setStrokeWidth(f110032d);
        this.f110040j.setStrokeJoin(Join.MITER);
        this.f110052v = context.getResources().getColor(R.color.a47);
        this.f110053w = Color.parseColor("#1DFFFFFF");
        this.f110040j.setColor(this.f110052v);
        setLayerType(1, this.f110040j);
        this.f110042l.moveTo(0.0f, 0.0f);
        this.f110042l.lineTo((float) f110030b, (float) (-f110030b));
        this.f110042l.lineTo((float) f110030b, (float) f110030b);
        this.f110042l.close();
        this.f110046p.moveTo(0.0f, 0.0f);
        Path path = this.f110046p;
        double d = (double) f110030b;
        double d2 = (double) this.f110048r;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt;
        Double.isNaN(d);
        float f = (float) (d + d3);
        double d4 = (double) (-f110030b);
        double d5 = (double) this.f110048r;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt2;
        Double.isNaN(d4);
        path.lineTo(f, (float) (d4 - d6));
        Path path2 = this.f110046p;
        double d7 = (double) f110030b;
        double d8 = (double) this.f110048r;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt3;
        Double.isNaN(d7);
        float f2 = (float) (d7 + d9);
        double d10 = (double) f110030b;
        double d11 = (double) this.f110048r;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d11);
        double d12 = d11 * sqrt4;
        Double.isNaN(d10);
        path2.lineTo(f2, (float) (d10 + d12));
        this.f110046p.close();
        setBackgroundColor(0);
        setClipChildren(false);
    }
}
