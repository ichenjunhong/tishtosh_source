package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget;

import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.PrintStream;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.a */
public class C39370a extends LinearLayout {

    /* renamed from: a */
    public static int f100689a;

    /* renamed from: b */
    public static int f100690b;

    /* renamed from: c */
    public static float f100691c;

    /* renamed from: d */
    public static float f100692d;

    /* renamed from: e */
    public static int f100693e;

    /* renamed from: f */
    public static int f100694f;

    /* renamed from: g */
    public float f100695g;

    /* renamed from: h */
    public int f100696h;

    /* renamed from: i */
    private Paint f100697i;

    /* renamed from: j */
    private final Path f100698j;

    /* renamed from: k */
    private final Path f100699k;

    /* renamed from: l */
    private RectF f100700l;

    /* renamed from: m */
    private float f100701m;

    /* renamed from: n */
    private float f100702n;

    /* renamed from: o */
    private Path f100703o;

    /* renamed from: p */
    private RectF f100704p;

    /* renamed from: q */
    private int f100705q;

    /* renamed from: r */
    private Matrix f100706r;

    /* renamed from: s */
    private Bitmap f100707s;

    /* renamed from: t */
    private Canvas f100708t;

    /* renamed from: u */
    private int f100709u;

    /* renamed from: v */
    private int f100710v;

    /* renamed from: w */
    private boolean f100711w;

    /* renamed from: x */
    private boolean f100712x;

    /* renamed from: y */
    private PorterDuffXfermode f100713y;

    public float getBubbleOffset() {
        float max = Math.max(this.f100695g, f100692d);
        switch (this.f100696h) {
            case 0:
            case 3:
                return Math.min(max, this.f100701m - f100692d);
            case 1:
            case 2:
                return Math.min(max, this.f100702n - f100692d);
            default:
                return 0.0f;
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setBgColor(int i) {
        this.f100709u = i;
    }

    public void setBorderColor(int i) {
        this.f100710v = i;
    }

    public void setBubbleOrientation(int i) {
        this.f100696h = i;
    }

    public void setNeedPath(boolean z) {
        this.f100711w = z;
    }

    public void setNeedPressFade(boolean z) {
        this.f100712x = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (this.f100712x) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
                        ofFloat.setDuration(100);
                        ofFloat.start();
                        break;
                    }
                    break;
                case 1:
                    break;
            }
        }
        if (this.f100712x) {
            clearAnimation();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
            ofFloat2.setDuration(100);
            ofFloat2.start();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f100707s == null) {
            this.f100707s = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Config.ARGB_8888);
            this.f100708t = new Canvas(this.f100707s);
        }
        this.f100708t.drawColor(0, Mode.CLEAR);
        float f = this.f100701m;
        float f2 = this.f100702n;
        float max = Math.max(this.f100695g, f100692d);
        float min = Math.min(max, f2 - f100692d);
        Matrix matrix = new Matrix();
        this.f100706r = new Matrix();
        switch (this.f100696h) {
            case 0:
                f = Math.min(max, f - f100692d);
                matrix.postRotate(90.0f);
                this.f100706r.postRotate(90.0f);
                this.f100706r.postTranslate(((float) ((this.f100705q * 3) / 2)) + f, ((float) this.f100705q) + 0.0f);
                setPadding(0, f100689a, 0, 0);
                setGravity(17);
                this.f100700l = new RectF(0.0f, (float) f100689a, this.f100701m, this.f100702n);
                f2 = 0.0f;
                break;
            case 1:
                f2 = Math.min(max, f2 - f100692d);
                setPadding(f100689a, 0, 0, 0);
                setGravity(17);
                this.f100706r.postTranslate(((float) this.f100705q) + 0.0f, ((float) ((this.f100705q * 3) / 2)) + f2);
                this.f100700l = new RectF((float) f100689a, 0.0f, this.f100701m, this.f100702n);
                break;
            case 2:
                f2 = Math.min(max, f2 - f100692d);
                matrix.postRotate(180.0f);
                this.f100706r.postRotate(180.0f);
                this.f100706r.postTranslate(((float) (this.f100705q * 2)) + f, ((float) ((this.f100705q * 3) / 2)) + f2);
                setPadding(0, 0, f100689a, 0);
                setGravity(17);
                this.f100700l = new RectF(0.0f, 0.0f, this.f100701m - ((float) f100689a), this.f100702n);
                break;
            case 3:
                f = Math.min(max, f - f100692d);
                matrix.postRotate(270.0f);
                this.f100706r.postRotate(270.0f);
                this.f100706r.postTranslate(((float) ((this.f100705q * 3) / 2)) + f, ((float) (this.f100705q * 2)) + f2);
                setPadding(0, 0, 0, f100689a);
                setGravity(17);
                this.f100700l = new RectF(0.0f, 0.0f, this.f100701m, this.f100702n - ((float) f100689a));
                break;
            default:
                f2 = min;
                break;
        }
        f = 0.0f;
        this.f100700l.left += (float) ((this.f100705q * 3) / 2);
        this.f100700l.top += (float) ((this.f100705q * 3) / 2);
        this.f100700l.right += (float) ((this.f100705q * 3) / 2);
        this.f100700l.bottom += (float) ((this.f100705q * 3) / 2);
        this.f100704p = new RectF();
        this.f100704p.left = this.f100700l.left - ((float) (this.f100705q / 2));
        this.f100704p.top = this.f100700l.top - ((float) (this.f100705q / 2));
        this.f100704p.right = this.f100700l.right + ((float) (this.f100705q / 2));
        this.f100704p.bottom = this.f100700l.bottom + ((float) (this.f100705q / 2));
        matrix.postTranslate(f + ((float) ((this.f100705q * 3) / 2)), f2 + ((float) ((this.f100705q * 3) / 2)));
        this.f100697i.setColor(this.f100710v);
        this.f100697i.setStyle(Style.STROKE);
        this.f100697i.setStrokeWidth((float) this.f100705q);
        if (this.f100711w) {
            this.f100698j.reset();
            this.f100698j.addRoundRect(this.f100704p, f100691c + ((float) (this.f100705q / 2)), f100691c + ((float) (this.f100705q / 2)), Direction.CW);
            this.f100698j.addPath(this.f100703o, this.f100706r);
            this.f100708t.drawPath(this.f100698j, this.f100697i);
        }
        this.f100697i.setXfermode(this.f100713y);
        this.f100697i.setColor(this.f100709u);
        this.f100697i.setStyle(Style.FILL);
        this.f100698j.reset();
        Path path = this.f100698j;
        RectF rectF = this.f100700l;
        float f3 = f100691c;
        path.addRoundRect(rectF, f3, f3, Direction.CW);
        this.f100698j.addPath(this.f100699k, matrix);
        this.f100708t.drawPath(this.f100698j, this.f100697i);
        this.f100697i.setXfermode(null);
        canvas.drawBitmap(this.f100707s, 0.0f, 0.0f, null);
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
        if (this.f100696h == 2 || this.f100696h == 1) {
            if (i3 > f100693e) {
                i5 = i3 + (f100690b * 2);
            } else {
                i5 = f100693e;
            }
            i4 = i5 + f100689a;
        } else if (i3 > f100693e) {
            i4 = i3 + (f100690b * 2);
        } else {
            i4 = f100693e;
        }
        int i6 = i4 + (this.f100705q * 3);
        int i7 = f100694f + (this.f100705q * 3);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i6, i7);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i6, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, i7);
        }
        this.f100701m = (float) (getMeasuredWidth() - (this.f100705q * 3));
        this.f100702n = (float) (getMeasuredHeight() - (this.f100705q * 3));
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("bubbleoffset: width ");
        sb.append(this.f100701m);
        printStream.println(sb.toString());
    }
}
