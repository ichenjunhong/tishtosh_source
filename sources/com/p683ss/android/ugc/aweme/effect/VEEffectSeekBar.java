package com.p683ss.android.ugc.aweme.effect;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.C9432q;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.effect.VEEffectSeekBar */
public class VEEffectSeekBar extends View {

    /* renamed from: a */
    private float f76224a;

    /* renamed from: b */
    private int f76225b;

    /* renamed from: c */
    private int f76226c;

    /* renamed from: d */
    private Paint f76227d;

    /* renamed from: e */
    private Paint f76228e;

    /* renamed from: f */
    private ArrayList<EffectPointModel> f76229f;

    /* renamed from: g */
    private boolean f76230g;

    /* renamed from: h */
    private RectF f76231h;

    /* renamed from: i */
    private RectF f76232i;

    /* renamed from: j */
    private int f76233j;

    /* renamed from: k */
    private int f76234k;

    /* renamed from: l */
    private int f76235l;

    /* renamed from: m */
    private boolean f76236m;

    public VEEffectSeekBar(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo58902a(boolean z) {
        if (this.f76236m != z) {
            this.f76236m = z;
            invalidate();
        }
    }

    public void setDuration(int i) {
        this.f76233j = i;
        this.f76224a = ((float) this.f76225b) / ((float) i);
    }

    public void setNormalColor(int i) {
        this.f76234k = i;
        if (!this.f76236m) {
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        if (this.f76235l != i) {
            this.f76235l = i;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f76236m) {
            this.f76227d.setColor(this.f76235l);
            if (this.f76235l != 0) {
                this.f76227d.setAlpha(230);
            }
            canvas.drawRect(this.f76231h, this.f76227d);
            return;
        }
        this.f76227d.setColor(this.f76234k);
        canvas.drawRoundRect(this.f76231h, (float) (this.f76226c / 2), (float) (this.f76226c / 2), this.f76227d);
        for (int i = 0; i < this.f76229f.size(); i++) {
            EffectPointModel effectPointModel = (EffectPointModel) this.f76229f.get(i);
            if (effectPointModel.getSelectedColor() != 0) {
                this.f76228e.setColor(effectPointModel.getSelectedColor());
                this.f76228e.setAlpha(230);
                int uiStartPoint = effectPointModel.getUiStartPoint();
                int uiEndPoint = effectPointModel.getUiEndPoint();
                boolean isFromEnd = effectPointModel.isFromEnd() ^ this.f76230g;
                if (isFromEnd) {
                    f = (float) (this.f76233j - uiEndPoint);
                } else {
                    f = (float) uiStartPoint;
                }
                float f3 = f * this.f76224a;
                if (isFromEnd) {
                    f2 = (float) (this.f76233j - uiStartPoint);
                } else {
                    f2 = (float) uiEndPoint;
                }
                this.f76232i.set(f3, 0.0f, f2 * this.f76224a, (float) this.f76226c);
                if (uiStartPoint == 0 && uiEndPoint == this.f76233j) {
                    canvas.drawRoundRect(this.f76232i, (float) (this.f76226c / 2), (float) (this.f76226c / 2), this.f76228e);
                } else {
                    canvas.drawRect(this.f76232i, this.f76228e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58901a(ArrayList<EffectPointModel> arrayList, boolean z) {
        this.f76229f = arrayList;
        this.f76230g = z;
        postInvalidate();
    }

    public VEEffectSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo58903a(boolean z, int i) {
        boolean z2;
        if (this.f76236m != z) {
            this.f76236m = z;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && this.f76235l != i) {
            this.f76235l = i;
            z2 = true;
        }
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f76226c = MeasureSpec.getSize(i2);
        if (this.f76231h == null) {
            this.f76231h = new RectF();
        }
        this.f76231h.set(0.0f, 0.0f, (float) this.f76225b, (float) this.f76226c);
    }

    public VEEffectSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f76225b = C29197f.f76504a;
        this.f76226c = (int) C9432q.m18687b(getContext(), 5.0f);
        this.f76227d = new Paint();
        this.f76227d.setAntiAlias(true);
        this.f76228e = new Paint();
        this.f76228e.setAntiAlias(true);
        this.f76229f = new ArrayList<>();
        this.f76232i = new RectF();
    }
}
