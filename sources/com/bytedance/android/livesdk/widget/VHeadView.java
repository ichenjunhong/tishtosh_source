package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;

public class VHeadView extends AppCompatImageView {

    /* renamed from: a */
    private int f23235a;

    /* renamed from: b */
    private int f23236b;

    /* renamed from: c */
    private Bitmap f23237c;

    /* renamed from: d */
    private Boolean f23238d = Boolean.valueOf(false);

    /* renamed from: e */
    private int f23239e;

    /* renamed from: f */
    private Bitmap f23240f;

    /* renamed from: g */
    private boolean f23241g = false;

    /* renamed from: h */
    private Paint f23242h = new Paint();

    public void setAuthor(boolean z) {
        if (this.f23241g != z) {
            this.f23241g = z;
            invalidate();
        }
    }

    public void setVResId(int i) {
        if (this.f23236b != i) {
            this.f23236b = i;
            this.f23237c = null;
            invalidate();
        }
    }

    public VHeadView(Context context) {
        super(context);
        m16745a(context, null);
    }

    public void setVAble(boolean z) {
        if (this.f23238d.booleanValue() != z) {
            this.f23238d = Boolean.valueOf(z);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23238d.booleanValue() || this.f23241g) {
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(width, height);
            if (this.f23238d.booleanValue()) {
                if (this.f23237c == null) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.f23236b);
                    if (decodeResource != null) {
                        this.f23237c = decodeResource;
                    }
                }
                if (this.f23237c != null) {
                    int width2 = (min - this.f23237c.getWidth()) - this.f23235a;
                    int height2 = min - this.f23237c.getHeight();
                    if (width > height) {
                        width2 += (width - height) / 2;
                    } else {
                        height2 += (height - width) / 2;
                    }
                    canvas.drawBitmap(this.f23237c, (float) width2, (float) height2, this.f23242h);
                }
            }
            if (this.f23241g) {
                if (this.f23240f == null) {
                    Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), this.f23239e);
                    if (decodeResource2 != null) {
                        this.f23240f = decodeResource2;
                    }
                }
                if (this.f23240f != null) {
                    Bitmap bitmap = this.f23240f;
                    canvas.drawBitmap(bitmap, (float) ((min - bitmap.getWidth()) / 2), (float) (min - this.f23240f.getHeight()), this.f23242h);
                }
            }
        }
    }

    public VHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16745a(context, attributeSet);
    }

    /* renamed from: a */
    private void m16745a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bl, R.attr.a_h, R.attr.a_i});
        this.f23236b = obtainStyledAttributes.getResourceId(2, R.drawable.c2b);
        this.f23238d = Boolean.valueOf(obtainStyledAttributes.getBoolean(1, false));
        this.f23239e = obtainStyledAttributes.getResourceId(0, R.drawable.bdt);
        obtainStyledAttributes.recycle();
    }

    public VHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16745a(context, attributeSet);
    }
}
