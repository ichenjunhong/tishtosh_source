package com.p683ss.android.ugc.aweme.poi.widget;

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

/* renamed from: com.ss.android.ugc.aweme.poi.widget.BubbleLayout */
public class BubbleLayout extends LinearLayout {

    /* renamed from: a */
    public static int f100904a;

    /* renamed from: b */
    public static int f100905b;

    /* renamed from: c */
    public static int f100906c;

    /* renamed from: d */
    public static float f100907d;

    /* renamed from: e */
    public static float f100908e;

    /* renamed from: f */
    public static float f100909f;

    /* renamed from: g */
    public static int f100910g;

    /* renamed from: h */
    public static int f100911h;

    /* renamed from: i */
    private Paint f100912i;

    /* renamed from: j */
    private final Path f100913j;

    /* renamed from: k */
    private final Path f100914k;

    /* renamed from: l */
    private RectF f100915l;

    /* renamed from: m */
    private float f100916m;

    /* renamed from: n */
    private float f100917n;

    /* renamed from: o */
    private Path f100918o;

    /* renamed from: p */
    private RectF f100919p;

    /* renamed from: q */
    private int f100920q;

    /* renamed from: r */
    private Matrix f100921r;

    /* renamed from: s */
    private Bitmap f100922s;

    /* renamed from: t */
    private Canvas f100923t;

    /* renamed from: u */
    private int f100924u;

    /* renamed from: v */
    private int f100925v;

    /* renamed from: w */
    private float f100926w;

    /* renamed from: x */
    private int f100927x;

    /* renamed from: y */
    private boolean f100928y;

    /* renamed from: z */
    private boolean f100929z;

    /* renamed from: a */
    private void m87789a() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addUpdateListener(C39479a.f100984a);
    }

    public float getBubbleOffset() {
        float max = Math.max(this.f100926w, f100909f);
        switch (this.f100927x) {
            case 0:
                return Math.min(max, this.f100916m - f100909f);
            case 1:
                return Math.min(max, this.f100917n - f100909f);
            case 2:
                return Math.min(max, this.f100917n - f100909f);
            case 3:
                return Math.min(max, this.f100916m - f100909f);
            default:
                return 0.0f;
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setBgColor(int i) {
        this.f100924u = i;
    }

    public void setBorderColor(int i) {
        this.f100925v = i;
    }

    public void setBubbleOrientation(int i) {
        this.f100927x = i;
    }

    public void setNeedPath(boolean z) {
        this.f100928y = z;
    }

    public void setNeedPressFade(boolean z) {
        this.f100929z = z;
    }

    public BubbleLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (this.f100929z) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
                        ofFloat.setDuration(100);
                        ofFloat.start();
                        ofFloat.addUpdateListener(C39480b.f100985a);
                        break;
                    }
                    break;
                case 1:
                    if (this.f100929z) {
                        m87789a();
                        break;
                    }
                    break;
            }
        } else if (this.f100929z) {
            m87789a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f100922s == null) {
            this.f100922s = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Config.ARGB_8888);
            this.f100923t = new Canvas(this.f100922s);
        }
        float f = this.f100916m;
        float f2 = this.f100917n;
        float max = Math.max(this.f100926w, f100909f);
        float min = Math.min(max, f2 - f100909f);
        Matrix matrix = new Matrix();
        this.f100921r = new Matrix();
        switch (this.f100927x) {
            case 0:
                f = Math.min(max, f - f100909f);
                matrix.postRotate(90.0f);
                this.f100921r.postRotate(90.0f);
                this.f100921r.postTranslate(((float) ((this.f100920q * 3) / 2)) + f, ((float) this.f100920q) + 0.0f);
                setPadding(0, f100904a, 0, 0);
                setGravity(17);
                this.f100915l = new RectF(0.0f, (float) f100904a, this.f100916m, this.f100917n);
                f2 = 0.0f;
                break;
            case 1:
                f2 = Math.min(max, f2 - f100909f);
                setPadding(f100904a, 0, 0, 0);
                setGravity(17);
                this.f100921r.postTranslate(((float) this.f100920q) + 0.0f, ((float) ((this.f100920q * 3) / 2)) + f2);
                this.f100915l = new RectF((float) f100904a, 0.0f, this.f100916m, this.f100917n);
                break;
            case 2:
                f2 = Math.min(max, f2 - f100909f);
                matrix.postRotate(180.0f);
                this.f100921r.postRotate(180.0f);
                this.f100921r.postTranslate(((float) (this.f100920q * 2)) + f, ((float) ((this.f100920q * 3) / 2)) + f2);
                setPadding(0, 0, f100904a, 0);
                setGravity(17);
                this.f100915l = new RectF(0.0f, 0.0f, this.f100916m - ((float) f100904a), this.f100917n);
                break;
            case 3:
                f = Math.min(max, f - f100909f);
                matrix.postRotate(270.0f);
                this.f100921r.postRotate(270.0f);
                this.f100921r.postTranslate(((float) ((this.f100920q * 3) / 2)) + f, ((float) (this.f100920q * 2)) + f2);
                setPadding(0, 0, 0, f100904a);
                setGravity(17);
                this.f100915l = new RectF(0.0f, 0.0f, this.f100916m, this.f100917n - ((float) f100904a));
                break;
            default:
                f2 = min;
                break;
        }
        f = 0.0f;
        this.f100915l.left += (float) ((this.f100920q * 3) / 2);
        this.f100915l.top += (float) ((this.f100920q * 3) / 2);
        this.f100915l.right += (float) ((this.f100920q * 3) / 2);
        this.f100915l.bottom += (float) ((this.f100920q * 3) / 2);
        this.f100919p = new RectF();
        this.f100919p.left = this.f100915l.left - ((float) (this.f100920q / 2));
        this.f100919p.top = this.f100915l.top - ((float) (this.f100920q / 2));
        this.f100919p.right = this.f100915l.right + ((float) (this.f100920q / 2));
        this.f100919p.bottom = this.f100915l.bottom + ((float) (this.f100920q / 2));
        matrix.postTranslate(f + ((float) ((this.f100920q * 3) / 2)), f2 + ((float) ((this.f100920q * 3) / 2)));
        this.f100912i.setColor(this.f100925v);
        this.f100912i.setStyle(Style.STROKE);
        this.f100912i.setStrokeWidth((float) this.f100920q);
        if (this.f100928y) {
            this.f100913j.reset();
            this.f100913j.addRoundRect(this.f100919p, f100908e + ((float) (this.f100920q / 2)), f100908e + ((float) (this.f100920q / 2)), Direction.CW);
            this.f100913j.addPath(this.f100918o, this.f100921r);
            this.f100923t.drawPath(this.f100913j, this.f100912i);
        }
        this.f100912i.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.f100912i.setColor(this.f100924u);
        this.f100912i.setStyle(Style.FILL);
        this.f100913j.reset();
        Path path = this.f100913j;
        RectF rectF = this.f100915l;
        float f3 = f100908e;
        path.addRoundRect(rectF, f3, f3, Direction.CW);
        this.f100913j.addPath(this.f100914k, matrix);
        this.f100923t.drawPath(this.f100913j, this.f100912i);
        this.f100912i.setXfermode(null);
        canvas.drawBitmap(this.f100922s, 0.0f, 0.0f, null);
    }

    /* renamed from: a */
    public final void mo80423a(int i, float f) {
        this.f100926w = f;
        this.f100927x = i;
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m87788a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        TextView textView;
        int i3;
        int i4;
        int i5;
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
        if (this.f100927x == 2 || this.f100927x == 1) {
            if (i3 > f100910g) {
                i5 = i3 + (f100905b * 2);
            } else {
                i5 = f100910g;
            }
            i4 = i5 + f100904a;
        } else if (i3 > f100910g) {
            i4 = i3 + (f100905b * 2);
        } else {
            i4 = f100910g;
        }
        int i6 = i4 + (this.f100920q * 3);
        int i7 = f100911h + (this.f100920q * 3);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i6, i7);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i6, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, i7);
        }
        this.f100916m = (float) (getMeasuredWidth() - (this.f100920q * 3));
        this.f100917n = (float) (getMeasuredHeight() - (this.f100920q * 3));
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f100913j = new Path();
        this.f100914k = new Path();
        this.f100918o = new Path();
        this.f100926w = 0.75f;
        this.f100927x = 1;
        this.f100928y = true;
        this.f100920q = (int) m87788a(context, 0.5f);
        if (this.f100920q < 2) {
            this.f100920q = 2;
        }
        f100904a = (int) m87788a(context, 7.0f);
        f100905b = (int) m87788a(context, 10.0f);
        f100906c = (int) m87788a(context, 6.0f);
        f100907d = 2.0f;
        f100908e = m87788a(context, 6.0f);
        f100909f = (float) (f100904a + f100906c);
        f100910g = (int) m87788a(context, 50.0f);
        f100911h = (int) m87788a(context, 46.0f);
        this.f100912i = new Paint();
        this.f100912i.setStyle(Style.FILL);
        this.f100912i.setStrokeCap(Cap.BUTT);
        this.f100912i.setAntiAlias(true);
        this.f100912i.setStrokeWidth(f100907d);
        this.f100912i.setStrokeJoin(Join.MITER);
        this.f100924u = context.getResources().getColor(R.color.a47);
        this.f100925v = Color.parseColor("#1DFFFFFF");
        this.f100912i.setColor(this.f100924u);
        setLayerType(1, this.f100912i);
        this.f100914k.moveTo(0.0f, 0.0f);
        this.f100914k.lineTo((float) f100904a, (float) (-f100904a));
        this.f100914k.lineTo((float) f100904a, (float) f100904a);
        this.f100914k.close();
        this.f100918o.moveTo(0.0f, 0.0f);
        Path path = this.f100918o;
        double d = (double) f100904a;
        double d2 = (double) this.f100920q;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt;
        Double.isNaN(d);
        float f = (float) (d + d3);
        double d4 = (double) (-f100904a);
        double d5 = (double) this.f100920q;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt2;
        Double.isNaN(d4);
        path.lineTo(f, (float) (d4 - d6));
        Path path2 = this.f100918o;
        double d7 = (double) f100904a;
        double d8 = (double) this.f100920q;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt3;
        Double.isNaN(d7);
        float f2 = (float) (d7 + d9);
        double d10 = (double) f100904a;
        double d11 = (double) this.f100920q;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d11);
        double d12 = d11 * sqrt4;
        Double.isNaN(d10);
        path2.lineTo(f2, (float) (d10 + d12));
        this.f100918o.close();
        setBackgroundColor(0);
        setClipChildren(false);
    }
}
