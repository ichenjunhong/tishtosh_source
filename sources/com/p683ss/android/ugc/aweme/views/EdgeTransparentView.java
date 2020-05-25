package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.EdgeTransparentView */
public class EdgeTransparentView extends FrameLayout {

    /* renamed from: a */
    private Paint f121112a;

    /* renamed from: b */
    private int f121113b;

    /* renamed from: c */
    private float f121114c;

    /* renamed from: d */
    private int f121115d;

    /* renamed from: e */
    private int f121116e;

    /* renamed from: f */
    private int f121117f;

    /* renamed from: g */
    private int f121118g;

    /* renamed from: h */
    private int f121119h;

    /* renamed from: i */
    private int f121120i;

    /* renamed from: j */
    private int[] f121121j;

    /* renamed from: k */
    private float[] f121122k;

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public EdgeTransparentView(Context context) {
        this(context, null);
    }

    public void setDrawSize(float f) {
        this.f121114c = f;
        invalidate();
    }

    public EdgeTransparentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EdgeTransparentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121115d = 1;
        this.f121116e = this.f121115d << 1;
        this.f121117f = this.f121115d << 2;
        this.f121118g = this.f121115d << 3;
        this.f121121j = new int[]{-1, 0};
        this.f121122k = new float[]{0.0f, 1.0f};
        this.f121112a = new Paint(1);
        this.f121112a.setStyle(Style.FILL);
        this.f121112a.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ac_, R.attr.aca});
        this.f121113b = obtainStyledAttributes.getInt(0, 0);
        this.f121114c = obtainStyledAttributes.getDimension(1, C9432q.m18687b(getContext(), 20.0f));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.f121113b == 0 || (this.f121113b & this.f121115d) != 0) {
            canvas.drawRect(0.0f, -3.0f, (float) this.f121119h, this.f121114c, this.f121112a);
        }
        if (this.f121113b == 0 || (this.f121113b & this.f121116e) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, (float) (this.f121119h / 2), (float) (this.f121120i / 2));
            canvas.drawRect(0.0f, -3.0f, (float) this.f121119h, this.f121114c, this.f121112a);
            canvas.restoreToCount(save);
        }
        int i = (this.f121120i - this.f121119h) / 2;
        if (this.f121113b == 0 || (this.f121113b & this.f121117f) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, (float) (this.f121119h / 2), (float) (this.f121120i / 2));
            canvas.translate(0.0f, (float) i);
            canvas.drawRect((float) (0 - i), -3.0f, (float) (this.f121119h + i), this.f121114c, this.f121112a);
            canvas.restoreToCount(save2);
        }
        if (this.f121113b == 0 || (this.f121113b & this.f121118g) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, (float) (this.f121119h / 2), (float) (this.f121120i / 2));
            canvas.translate(0.0f, (float) i);
            canvas.drawRect((float) (0 - i), -3.0f, (float) (this.f121119h + i), this.f121114c, this.f121112a);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.f121112a;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f121114c, this.f121121j, this.f121122k, TileMode.CLAMP);
        paint.setShader(linearGradient);
        this.f121119h = getWidth();
        this.f121120i = getHeight();
    }
}
