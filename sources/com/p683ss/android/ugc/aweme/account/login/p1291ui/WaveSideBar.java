package com.p683ss.android.ugc.aweme.account.login.p1291ui;

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
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.WaveSideBar */
public class WaveSideBar extends View {

    /* renamed from: a */
    private static final String[] f58432a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    /* renamed from: b */
    private String[] f58433b;

    /* renamed from: c */
    private int f58434c;

    /* renamed from: d */
    private float f58435d;

    /* renamed from: e */
    private Paint f58436e;

    /* renamed from: f */
    private int f58437f;

    /* renamed from: g */
    private float f58438g;

    /* renamed from: h */
    private float f58439h;

    /* renamed from: i */
    private float f58440i;

    /* renamed from: j */
    private RectF f58441j;

    /* renamed from: k */
    private float f58442k;

    /* renamed from: l */
    private float f58443l;

    /* renamed from: m */
    private boolean f58444m;

    /* renamed from: n */
    private boolean f58445n;

    /* renamed from: o */
    private int f58446o;

    /* renamed from: p */
    private int f58447p;

    /* renamed from: q */
    private C21541a f58448q;

    /* renamed from: r */
    private float f58449r;

    /* renamed from: s */
    private DisplayMetrics f58450s;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.WaveSideBar$a */
    public interface C21541a {
        /* renamed from: a */
        void mo45742a(String str);
    }

    /* access modifiers changed from: protected */
    public String[] getDefaultIndexItems() {
        return f58432a;
    }

    public void setLazyRespond(boolean z) {
        this.f58445n = z;
    }

    public void setOnSelectIndexItemListener(C21541a aVar) {
        this.f58448q = aVar;
    }

    public WaveSideBar(Context context) {
        this(context, null);
    }

    public void setMaxOffset(int i) {
        this.f58440i = (float) i;
        invalidate();
    }

    public void setIndexItems(String... strArr) {
        this.f58433b = (String[]) Arrays.copyOf(strArr, strArr.length);
        requestLayout();
    }

    public void setTextColor(int i) {
        this.f58437f = i;
        this.f58436e.setColor(i);
        invalidate();
    }

    public void setPosition(int i) {
        if (i == 0 || i == 1) {
            this.f58446o = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
    }

    public void setTextSize(float f) {
        if (this.f58438g != f) {
            this.f58438g = f;
            this.f58436e.setTextSize(f);
            invalidate();
        }
    }

    public void setTextAlign(int i) {
        if (this.f58447p != i) {
            switch (i) {
                case 0:
                    this.f58436e.setTextAlign(Align.CENTER);
                    break;
                case 1:
                    this.f58436e.setTextAlign(Align.LEFT);
                    break;
                case 2:
                    this.f58436e.setTextAlign(Align.RIGHT);
                    break;
                default:
                    throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
            }
            this.f58447p = i;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int length = this.f58433b.length;
        int i = 0;
        while (true) {
            int i2 = NormalGiftView.ALPHA_255;
            if (i < length) {
                float f2 = (float) i;
                float f3 = this.f58449r + (this.f58439h * f2);
                float f4 = 0.0f;
                if (this.f58434c != -1) {
                    float abs = Math.abs(this.f58435d - ((this.f58439h * f2) + (this.f58439h / 2.0f))) / this.f58439h;
                    f = Math.max(1.0f - ((abs * abs) / 16.0f), 0.0f);
                } else {
                    f = 0.0f;
                }
                if (i != this.f58434c) {
                    i2 = (int) ((1.0f - f) * 255.0f);
                }
                this.f58436e.setAlpha(i2);
                this.f58436e.setTextSize(this.f58438g + (this.f58438g * f));
                if (this.f58446o != 1) {
                    switch (this.f58447p) {
                        case 0:
                            f4 = (((float) (getWidth() - getPaddingRight())) - (this.f58443l / 2.0f)) - (this.f58440i * f);
                            break;
                        case 1:
                            f4 = (((float) (getWidth() - getPaddingRight())) - this.f58443l) - (this.f58440i * f);
                            break;
                        case 2:
                            f4 = ((float) (getWidth() - getPaddingRight())) - (this.f58440i * f);
                            break;
                    }
                } else {
                    switch (this.f58447p) {
                        case 0:
                            f4 = ((float) getPaddingLeft()) + (this.f58443l / 2.0f) + (this.f58440i * f);
                            break;
                        case 1:
                            f4 = ((float) getPaddingLeft()) + (this.f58440i * f);
                            break;
                        case 2:
                            f4 = ((float) getPaddingLeft()) + this.f58443l + (this.f58440i * f);
                            break;
                    }
                }
                canvas.drawText(this.f58433b[i], f4, f3, this.f58436e);
                i++;
            } else {
                this.f58436e.setAlpha(NormalGiftView.ALPHA_255);
                this.f58436e.setTextSize(this.f58438g);
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (this.f58433b.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        this.f58435d = y - (((float) (getHeight() / 2)) - (this.f58442k / 2.0f));
        if (this.f58435d <= 0.0f) {
            i = 0;
        } else {
            i = (int) (this.f58435d / this.f58439h);
            if (i >= this.f58433b.length) {
                i = this.f58433b.length - 1;
            }
        }
        this.f58434c = i;
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f58441j.contains(x, y)) {
                    this.f58444m = true;
                    if (!this.f58445n && this.f58448q != null) {
                        this.f58448q.mo45742a(this.f58433b[this.f58434c]);
                    }
                    invalidate();
                    return true;
                }
                this.f58434c = -1;
                return false;
            case 1:
            case 3:
                if (this.f58445n && this.f58448q != null) {
                    this.f58448q.mo45742a(this.f58433b[this.f58434c]);
                }
                this.f58434c = -1;
                this.f58444m = false;
                invalidate();
                return true;
            case 2:
                if (this.f58444m && !this.f58445n && this.f58448q != null) {
                    this.f58448q.mo45742a(this.f58433b[this.f58434c]);
                }
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
        FontMetrics fontMetrics = this.f58436e.getFontMetrics();
        this.f58439h = fontMetrics.bottom - fontMetrics.top;
        this.f58442k = ((float) this.f58433b.length) * this.f58439h;
        for (String measureText : this.f58433b) {
            this.f58443l = Math.max(this.f58443l, this.f58436e.measureText(measureText));
        }
        if (this.f58446o == 1) {
            f = 0.0f;
        } else {
            f = (((float) size2) - this.f58443l) - ((float) getPaddingRight());
        }
        if (this.f58446o == 1) {
            f2 = ((float) getPaddingLeft()) + f + this.f58443l;
        } else {
            f2 = (float) size2;
        }
        float f3 = (float) (size / 2);
        float f4 = f3 - (this.f58442k / 2.0f);
        this.f58441j.set(f, f4, f2, this.f58442k + f4);
        this.f58449r = ((f3 - ((((float) this.f58433b.length) * this.f58439h) / 2.0f)) + ((this.f58439h / 2.0f) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f))) - fontMetrics.ascent;
    }

    public WaveSideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58434c = -1;
        this.f58435d = -1.0f;
        this.f58441j = new RectF();
        this.f58444m = false;
        this.f58445n = false;
        this.f58450s = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a2_, R.attr.a2a, R.attr.a2b, R.attr.a2c, R.attr.a2d, R.attr.a2e});
        this.f58445n = obtainStyledAttributes.getBoolean(0, false);
        this.f58437f = obtainStyledAttributes.getColor(4, -7829368);
        this.f58438g = obtainStyledAttributes.getDimension(5, TypedValue.applyDimension(2, 14.0f, this.f58450s));
        this.f58440i = obtainStyledAttributes.getDimension(1, TypedValue.applyDimension(1, 80.0f, this.f58450s));
        this.f58446o = obtainStyledAttributes.getInt(2, 0);
        this.f58447p = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        this.f58433b = getDefaultIndexItems();
        this.f58436e = new Paint();
        this.f58436e.setAntiAlias(true);
        this.f58436e.setColor(this.f58437f);
        this.f58436e.setTextSize(this.f58438g);
        this.f58436e.setTypeface(C10749b.m21787a().mo19435a(C10751d.f28908g));
        switch (this.f58447p) {
            case 0:
                this.f58436e.setTextAlign(Align.CENTER);
                return;
            case 1:
                this.f58436e.setTextAlign(Align.LEFT);
                return;
            case 2:
                this.f58436e.setTextAlign(Align.RIGHT);
                break;
        }
    }
}
