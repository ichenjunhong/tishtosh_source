package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.HollowTextView */
public class HollowTextView extends View {

    /* renamed from: a */
    protected Paint f62943a;

    /* renamed from: b */
    private String f62944b;

    /* renamed from: c */
    private PorterDuffXfermode f62945c;

    /* renamed from: d */
    private PorterDuffXfermode f62946d;

    /* renamed from: e */
    private RectF f62947e;

    /* renamed from: f */
    private int f62948f;

    /* renamed from: g */
    private int f62949g;

    /* renamed from: h */
    private int f62950h;

    /* renamed from: i */
    private boolean f62951i;

    /* renamed from: j */
    private boolean f62952j;

    /* renamed from: k */
    private boolean f62953k;

    /* renamed from: l */
    private boolean f62954l;

    /* renamed from: m */
    private int f62955m;

    /* renamed from: n */
    private int f62956n;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.HollowTextView$a */
    public static class C23626a {

        /* renamed from: a */
        public String f62957a;

        /* renamed from: b */
        public int f62958b;

        /* renamed from: c */
        public int f62959c;

        /* renamed from: d */
        public int f62960d;

        /* renamed from: e */
        public boolean f62961e;

        /* renamed from: f */
        public boolean f62962f;

        /* renamed from: g */
        public boolean f62963g;

        /* renamed from: h */
        public boolean f62964h;
    }

    public String getText() {
        return this.f62944b;
    }

    /* renamed from: a */
    private void m57942a() {
        this.f62943a = new Paint();
        this.f62943a.setTextSize((float) this.f62948f);
        this.f62943a.setAntiAlias(true);
        this.f62943a.setFakeBoldText(true);
        this.f62943a.setColor(this.f62949g);
        this.f62943a.setAntiAlias(true);
    }

    public HollowTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setText(String str) {
        if (str != null && !str.equals(this.f62944b)) {
            this.f62944b = str;
            requestLayout();
            invalidate();
            setContentDescription(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        if (!TextUtils.isEmpty(this.f62944b)) {
            if (VERSION.SDK_INT >= 21) {
                i = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null);
            } else {
                i = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            }
            if (this.f62946d == null) {
                this.f62946d = new PorterDuffXfermode(Mode.SRC);
            }
            this.f62943a.setXfermode(this.f62946d);
            if (this.f62950h > 0) {
                if (this.f62947e == null) {
                    this.f62947e = new RectF();
                }
                this.f62947e.left = 0.0f;
                this.f62947e.top = 0.0f;
                this.f62947e.right = (float) this.f62955m;
                this.f62947e.bottom = (float) this.f62956n;
                canvas.drawRoundRect(this.f62947e, (float) this.f62950h, (float) this.f62950h, this.f62943a);
                if (!this.f62951i) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f62950h, (float) this.f62950h, this.f62943a);
                }
                if (!this.f62952j) {
                    canvas.drawRect((float) (this.f62955m - this.f62950h), 0.0f, (float) this.f62955m, (float) this.f62950h, this.f62943a);
                }
                if (!this.f62953k) {
                    canvas.drawRect(0.0f, (float) (this.f62956n - this.f62950h), (float) this.f62950h, (float) this.f62956n, this.f62943a);
                }
                if (!this.f62954l) {
                    canvas.drawRect((float) (this.f62955m - this.f62950h), (float) (this.f62956n - this.f62950h), (float) this.f62955m, (float) this.f62956n, this.f62943a);
                }
            } else {
                canvas.drawRect(0.0f, 0.0f, (float) this.f62955m, (float) this.f62956n, this.f62943a);
            }
            if (this.f62945c == null) {
                this.f62945c = new PorterDuffXfermode(Mode.DST_OUT);
            }
            this.f62943a.setXfermode(this.f62945c);
            canvas.drawText(this.f62944b, (float) getPaddingLeft(), (float) ((((int) (((float) this.f62956n) - this.f62943a.getFontMetrics().ascent)) >> 1) - 2), this.f62943a);
            canvas.restoreToCount(i);
        }
    }

    public HollowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m57941a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    public HollowTextView(Context context, C23626a aVar) {
        super(context);
        this.f62948f = 15;
        this.f62949g = -1711276033;
        this.f62944b = aVar.f62957a;
        this.f62948f = aVar.f62958b;
        this.f62949g = aVar.f62959c;
        this.f62950h = aVar.f62960d;
        this.f62951i = aVar.f62961e;
        this.f62952j = aVar.f62962f;
        this.f62953k = aVar.f62963g;
        this.f62954l = aVar.f62964h;
        m57942a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f62955m = ((int) this.f62943a.measureText(this.f62944b)) + getPaddingLeft() + getPaddingRight();
        this.f62956n = this.f62948f + getPaddingTop() + getPaddingBottom();
        this.f62955m = m57941a(this.f62955m, i);
        this.f62956n = m57941a(this.f62956n, i2);
        setMeasuredDimension(this.f62955m, this.f62956n);
    }

    public HollowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62948f = 15;
        this.f62949g = -1711276033;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, 16843087, 16843176, R.attr.fm, R.attr.ou, R.attr.ov, R.attr.pa, R.attr.pb});
        this.f62948f = (int) obtainStyledAttributes.getDimension(0, C9432q.m18687b(context, 15.0f));
        this.f62944b = obtainStyledAttributes.getString(1);
        this.f62949g = obtainStyledAttributes.getColor(3, 0);
        this.f62950h = (int) obtainStyledAttributes.getDimension(2, 0.0f);
        this.f62951i = obtainStyledAttributes.getBoolean(6, false);
        this.f62952j = obtainStyledAttributes.getBoolean(7, false);
        this.f62953k = obtainStyledAttributes.getBoolean(4, false);
        this.f62954l = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        m57942a();
    }
}
