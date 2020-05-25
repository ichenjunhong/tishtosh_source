package com.p683ss.android.ugc.aweme.photo.setfilter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.p043v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.FilterRateSeekBar */
public class FilterRateSeekBar extends AppCompatSeekBar {

    /* renamed from: a */
    private int f98471a;

    /* renamed from: b */
    private float f98472b;

    /* renamed from: c */
    private String f98473c;

    /* renamed from: d */
    private Paint f98474d;

    /* renamed from: e */
    private int f98475e;

    /* renamed from: f */
    private float f98476f;

    /* renamed from: g */
    private float f98477g;

    /* renamed from: h */
    private float f98478h;

    /* renamed from: i */
    private Context f98479i;

    public synchronized int getProgress() {
        int progress;
        progress = super.getProgress();
        this.f98473c = String.valueOf(progress);
        if (this.f98474d != null) {
            this.f98476f = this.f98474d.measureText(this.f98473c);
        }
        return progress;
    }

    public FilterRateSeekBar(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        invalidate();
        return super.onTouchEvent(motionEvent);
    }

    public synchronized void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        synchronized (this) {
            super.onDraw(canvas);
            float width = (float) ((getProgressDrawable().getBounds().width() * getProgress()) / getMax());
            canvas2.drawText(this.f98473c, (width - (this.f98476f / 2.0f)) + this.f98478h, C9432q.m18687b(this.f98479i, 11.0f), this.f98474d);
            float f = this.f98478h;
            float paddingTop = ((float) getPaddingTop()) + C9432q.m18687b(this.f98479i, 3.5f);
            float paddingTop2 = ((float) getPaddingTop()) + C9432q.m18687b(this.f98479i, 10.0f);
            float a = ((float) C9432q.m18670a(this.f98479i)) - this.f98478h;
            m86068a(canvas, f, paddingTop, f, paddingTop2, a, paddingTop);
            float b = paddingTop2 + C9432q.m18687b(this.f98479i, 2.0f);
            float b2 = b + C9432q.m18687b(this.f98479i, 6.5f);
            m86068a(canvas, f, b, f, b2, a, b2);
            float f2 = width + this.f98478h;
            float b3 = paddingTop2 + C9432q.m18687b(this.f98479i, 0.5f);
            float b4 = C9432q.m18687b(this.f98479i, 11.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Style.FILL);
            paint.setColor(getResources().getColor(R.color.a1k));
            canvas2.drawCircle(f2, b3, b4, paint);
        }
    }

    public FilterRateSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterRateSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f98479i = context;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.xr, R.attr.xs, R.attr.xt, R.attr.xu}, i, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f98471a = obtainStyledAttributes.getColor(index, -1);
            } else if (index == 3) {
                this.f98472b = obtainStyledAttributes.getDimension(index, 15.0f);
            } else if (index == 2) {
                this.f98475e = obtainStyledAttributes.getInt(index, 1);
            }
        }
        obtainStyledAttributes.recycle();
        this.f98474d = new Paint();
        this.f98474d.setAntiAlias(true);
        this.f98474d.setColor(this.f98471a);
        this.f98474d.setTextSize(this.f98472b);
        Rect rect = new Rect();
        this.f98473c = String.valueOf(getProgress());
        this.f98474d.getTextBounds(this.f98473c, 0, this.f98473c.length(), rect);
        this.f98477g = (float) rect.height();
        this.f98478h = C9432q.m18687b(context, 52.5f);
        if (this.f98475e == 1) {
            setPadding((int) this.f98478h, (int) (this.f98477g + C9432q.m18687b(context, 9.0f)), (int) this.f98478h, 0);
        } else {
            setPadding((int) this.f98478h, 0, (int) this.f98478h, (int) (this.f98477g + C9432q.m18687b(context, 5.0f)));
        }
    }

    /* renamed from: a */
    private void m86068a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Style.FILL);
        paint.setColor(getResources().getColor(R.color.a2j));
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        path.lineTo(f5, f6);
        path.close();
        canvas.drawPath(path, paint);
    }
}
