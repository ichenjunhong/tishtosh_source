package com.p683ss.android.ugc.aweme.property;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.property.WaveSideBar */
public class WaveSideBar extends View {

    /* renamed from: a */
    private static final String[] f103831a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#"};

    /* renamed from: b */
    private String[] f103832b;

    /* renamed from: c */
    private int f103833c;

    /* renamed from: d */
    private float f103834d;

    /* renamed from: e */
    private Paint f103835e;

    /* renamed from: f */
    private int f103836f;

    /* renamed from: g */
    private float f103837g;

    /* renamed from: h */
    private float f103838h;

    /* renamed from: i */
    private float f103839i;

    /* renamed from: j */
    private RectF f103840j;

    /* renamed from: k */
    private float f103841k;

    /* renamed from: l */
    private float f103842l;

    /* renamed from: m */
    private boolean f103843m;

    /* renamed from: n */
    private boolean f103844n;

    /* renamed from: o */
    private int f103845o;

    /* renamed from: p */
    private int f103846p;

    /* renamed from: q */
    private C40758a f103847q;

    /* renamed from: r */
    private float f103848r;

    /* renamed from: s */
    private DisplayMetrics f103849s;

    /* renamed from: com.ss.android.ugc.aweme.property.WaveSideBar$a */
    public interface C40758a {
        /* renamed from: a */
        void mo83060a(String str);
    }

    public void setLazyRespond(boolean z) {
        this.f103844n = z;
    }

    public void setOnSelectIndexItemListener(C40758a aVar) {
        this.f103847q = aVar;
    }

    public WaveSideBar(Context context) {
        this(context, null);
    }

    public void setMaxOffset(int i) {
        this.f103839i = (float) i;
        invalidate();
    }

    public void setIndexItems(String... strArr) {
        this.f103832b = (String[]) Arrays.copyOf(strArr, strArr.length);
        requestLayout();
    }

    public void setTextColor(int i) {
        this.f103836f = i;
        this.f103835e.setColor(i);
        invalidate();
    }

    public void setPosition(int i) {
        if (i == 0 || i == 1) {
            this.f103845o = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
    }

    public void setTextSize(float f) {
        if (this.f103837g != f) {
            this.f103837g = f;
            this.f103835e.setTextSize(f);
            invalidate();
        }
    }

    public void setTextAlign(int i) {
        if (this.f103846p != i) {
            switch (i) {
                case 0:
                    this.f103835e.setTextAlign(Align.CENTER);
                    break;
                case 1:
                    this.f103835e.setTextAlign(Align.LEFT);
                    break;
                case 2:
                    this.f103835e.setTextAlign(Align.RIGHT);
                    break;
                default:
                    throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
            }
            this.f103846p = i;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int length = this.f103832b.length;
        int i = 0;
        while (true) {
            int i2 = NormalGiftView.ALPHA_255;
            if (i < length) {
                float f2 = (float) i;
                float f3 = this.f103848r + (this.f103838h * f2);
                float f4 = 0.0f;
                if (this.f103833c != -1) {
                    float abs = Math.abs(this.f103834d - ((this.f103838h * f2) + (this.f103838h / 2.0f))) / this.f103838h;
                    f = Math.max(1.0f - ((abs * abs) / 16.0f), 0.0f);
                } else {
                    f = 0.0f;
                }
                if (i != this.f103833c) {
                    i2 = (int) ((1.0f - f) * 255.0f);
                }
                this.f103835e.setAlpha(i2);
                this.f103835e.setTextSize(this.f103837g + (this.f103837g * f));
                if (this.f103845o != 1) {
                    switch (this.f103846p) {
                        case 0:
                            f4 = (((float) (getWidth() - getPaddingRight())) - (this.f103842l / 2.0f)) - (this.f103839i * f);
                            break;
                        case 1:
                            f4 = (((float) (getWidth() - getPaddingRight())) - this.f103842l) - (this.f103839i * f);
                            break;
                        case 2:
                            f4 = ((float) (getWidth() - getPaddingRight())) - (this.f103839i * f);
                            break;
                    }
                } else {
                    switch (this.f103846p) {
                        case 0:
                            f4 = ((float) getPaddingLeft()) + (this.f103842l / 2.0f) + (this.f103839i * f);
                            break;
                        case 1:
                            f4 = ((float) getPaddingLeft()) + (this.f103839i * f);
                            break;
                        case 2:
                            f4 = ((float) getPaddingLeft()) + this.f103842l + (this.f103839i * f);
                            break;
                    }
                }
                canvas.drawText(this.f103832b[i], f4, f3, this.f103835e);
                i++;
            } else {
                this.f103835e.setAlpha(NormalGiftView.ALPHA_255);
                this.f103835e.setTextSize(this.f103837g);
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (this.f103832b.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        this.f103834d = y - (((float) (getHeight() / 2)) - (this.f103841k / 2.0f));
        if (this.f103834d <= 0.0f) {
            i = 0;
        } else {
            i = (int) (this.f103834d / this.f103838h);
            if (i >= this.f103832b.length) {
                i = this.f103832b.length - 1;
            }
        }
        this.f103833c = i;
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f103840j.contains(x, y)) {
                    this.f103843m = true;
                    invalidate();
                    return true;
                }
                this.f103833c = -1;
                return false;
            case 1:
            case 3:
                if (this.f103844n && this.f103847q != null) {
                    this.f103847q.mo83060a(this.f103832b[this.f103833c]);
                }
                this.f103833c = -1;
                this.f103843m = false;
                invalidate();
                return true;
            case 2:
                invalidate();
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public WaveSideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i);
        FontMetrics fontMetrics = this.f103835e.getFontMetrics();
        this.f103838h = fontMetrics.bottom - fontMetrics.top;
        this.f103841k = ((float) this.f103832b.length) * this.f103838h;
        for (String measureText : this.f103832b) {
            this.f103842l = Math.max(this.f103842l, this.f103835e.measureText(measureText));
        }
        if (this.f103845o == 1) {
            f = 0.0f;
        } else {
            f = (((float) size2) - this.f103842l) - ((float) getPaddingRight());
        }
        if (this.f103845o == 1) {
            f2 = ((float) getPaddingLeft()) + f + this.f103842l;
        } else {
            f2 = (float) size2;
        }
        float f3 = (float) (size / 2);
        float f4 = f3 - (this.f103841k / 2.0f);
        this.f103840j.set(f, f4, f2, this.f103841k + f4);
        this.f103848r = ((f3 - ((((float) this.f103832b.length) * this.f103838h) / 2.0f)) + ((this.f103838h / 2.0f) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f))) - fontMetrics.ascent;
    }

    public WaveSideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f103833c = -1;
        this.f103834d = -1.0f;
        this.f103840j = new RectF();
        this.f103843m = false;
        this.f103844n = false;
        this.f103849s = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a2_, R.attr.a2a, R.attr.a2b, R.attr.a2c, R.attr.a2d, R.attr.a2e});
        this.f103844n = obtainStyledAttributes.getBoolean(0, false);
        this.f103836f = obtainStyledAttributes.getColor(4, -7829368);
        this.f103837g = obtainStyledAttributes.getDimension(5, TypedValue.applyDimension(2, 14.0f, this.f103849s));
        this.f103839i = obtainStyledAttributes.getDimension(1, TypedValue.applyDimension(1, 80.0f, this.f103849s));
        this.f103845o = obtainStyledAttributes.getInt(2, 0);
        this.f103846p = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        this.f103832b = f103831a;
        this.f103835e = new Paint();
        this.f103835e.setAntiAlias(true);
        this.f103835e.setColor(this.f103836f);
        this.f103835e.setTextSize(this.f103837g);
        switch (this.f103846p) {
            case 0:
                this.f103835e.setTextAlign(Align.CENTER);
                return;
            case 1:
                this.f103835e.setTextAlign(Align.LEFT);
                return;
            case 2:
                this.f103835e.setTextAlign(Align.RIGHT);
                break;
        }
    }
}
