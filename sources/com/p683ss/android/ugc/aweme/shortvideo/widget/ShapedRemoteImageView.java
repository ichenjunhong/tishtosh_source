package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ShapedRemoteImageView */
public class ShapedRemoteImageView extends RemoteImageView {

    /* renamed from: a */
    private int f115267a;

    /* renamed from: b */
    private float f115268b;

    /* renamed from: c */
    private int f115269c = 637534208;

    /* renamed from: d */
    private float f115270d;

    /* renamed from: e */
    private boolean f115271e;

    /* renamed from: f */
    private Path f115272f;

    /* renamed from: g */
    private Shape f115273g;

    /* renamed from: h */
    private Shape f115274h;

    /* renamed from: i */
    private Paint f115275i;

    /* renamed from: j */
    private Paint f115276j;

    /* renamed from: k */
    private Paint f115277k;

    /* renamed from: l */
    private Bitmap f115278l;

    /* renamed from: m */
    private C45585a f115279m;

    /* renamed from: n */
    private PorterDuffXfermode f115280n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ShapedRemoteImageView$a */
    public interface C45585a {
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m99293c();
    }

    /* renamed from: c */
    private void m99293c() {
        if (this.f115278l != null) {
            this.f115278l.recycle();
            this.f115278l = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f115278l == null) {
            m99291b();
        }
    }

    /* renamed from: b */
    private Bitmap m99291b() {
        if (this.f115270d <= 0.0f) {
            return null;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return null;
        }
        m99293c();
        this.f115278l = Bitmap.createBitmap(measuredWidth, measuredHeight, Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f115278l);
        Paint paint = new Paint(1);
        paint.setColor(this.f115269c);
        canvas.drawRect(new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight), paint);
        return this.f115278l;
    }

    public void setExtension(C45585a aVar) {
        this.f115279m = aVar;
        requestLayout();
    }

    public void setShapeMode(int i) {
        m99292b(i, this.f115268b);
    }

    public void setShapeRadius(float f) {
        m99292b(this.f115267a, f);
    }

    public void setStrokeColor(int i) {
        m99289a(i, this.f115270d);
    }

    public void setStrokeWidth(float f) {
        m99289a(this.f115269c, f);
    }

    public ShapedRemoteImageView(Context context) {
        super(context);
        m99290a(null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!(this.f115270d <= 0.0f || this.f115274h == null || this.f115278l == null)) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            this.f115276j.setXfermode(null);
            canvas.drawBitmap(this.f115278l, 0.0f, 0.0f, this.f115276j);
            canvas.translate(this.f115270d, this.f115270d);
            if (this.f115280n == null) {
                this.f115280n = new PorterDuffXfermode(Mode.DST_OUT);
            }
            this.f115276j.setXfermode(this.f115280n);
            this.f115274h.draw(canvas, this.f115276j);
            canvas.restoreToCount(saveLayer);
        }
        if (this.f115279m != null) {
            canvas.drawPath(this.f115272f, this.f115277k);
        }
        switch (this.f115267a) {
            case 1:
            case 2:
                if (this.f115273g != null) {
                    this.f115273g.draw(canvas, this.f115275i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m99290a(AttributeSet attributeSet) {
        if (VERSION.SDK_INT >= 11) {
            setLayerType(2, null);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a0g, R.attr.a1v, R.attr.a3n, R.attr.a3o});
            this.f115267a = obtainStyledAttributes.getInt(1, 0);
            this.f115268b = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f115270d = obtainStyledAttributes.getDimension(3, 0.0f);
            this.f115269c = obtainStyledAttributes.getColor(2, this.f115269c);
            obtainStyledAttributes.recycle();
        }
        this.f115275i = new Paint(1);
        this.f115275i.setFilterBitmap(true);
        this.f115275i.setColor(-16777216);
        this.f115275i.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        this.f115276j = new Paint(1);
        this.f115276j.setFilterBitmap(true);
        this.f115276j.setColor(-16777216);
        this.f115277k = new Paint(1);
        this.f115277k.setFilterBitmap(true);
        this.f115277k.setColor(-16777216);
        this.f115277k.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        this.f115272f = new Path();
    }

    public ShapedRemoteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99290a(attributeSet);
    }

    /* renamed from: a */
    private void m99289a(int i, float f) {
        if (this.f115270d > 0.0f) {
            if (this.f115270d != f) {
                this.f115270d = f;
                this.f115274h.resize(((float) getMeasuredWidth()) - (this.f115270d * 2.0f), ((float) getMeasuredHeight()) - (this.f115270d * 2.0f));
                postInvalidate();
            }
            if (this.f115269c != i) {
                this.f115269c = i;
                m99291b();
                postInvalidate();
            }
        }
    }

    /* renamed from: b */
    private void m99292b(int i, float f) {
        boolean z;
        if (this.f115267a == i && this.f115268b == f) {
            z = false;
        } else {
            z = true;
        }
        this.f115271e = z;
        if (this.f115271e) {
            this.f115267a = i;
            this.f115268b = f;
            this.f115273g = null;
            this.f115274h = null;
            requestLayout();
        }
    }

    public ShapedRemoteImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m99290a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.f115271e) {
            this.f115271e = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            switch (this.f115267a) {
                case 2:
                    this.f115268b = ((float) Math.min(measuredWidth, measuredHeight)) / 2.0f;
                    break;
            }
            if (this.f115273g == null || this.f115268b != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.f115268b);
                this.f115273g = new RoundRectShape(fArr, null, null);
                this.f115274h = new RoundRectShape(fArr, null, null);
            }
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            this.f115273g.resize(f, f2);
            this.f115274h.resize(f - (this.f115270d * 2.0f), f2 - (this.f115270d * 2.0f));
            m99291b();
        }
    }
}
