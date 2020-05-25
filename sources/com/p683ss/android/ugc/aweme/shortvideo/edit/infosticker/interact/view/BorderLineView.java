package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.asve.p1241e.C20393d;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43546a;
import com.p683ss.android.ugc.aweme.utils.C47918gj;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.BorderLineView */
public class BorderLineView extends FrameLayout {

    /* renamed from: a */
    public RectF f110350a;

    /* renamed from: b */
    public int f110351b;

    /* renamed from: c */
    RectF f110352c;

    /* renamed from: d */
    PointF[] f110353d;

    /* renamed from: e */
    private int f110354e;

    /* renamed from: f */
    private int f110355f;

    /* renamed from: g */
    private int f110356g;

    /* renamed from: h */
    private Paint f110357h;

    /* renamed from: i */
    private DashPathEffect f110358i;

    /* renamed from: j */
    private float f110359j;

    /* renamed from: k */
    private int f110360k;

    /* renamed from: l */
    private Vibrator f110361l;

    /* renamed from: m */
    private int f110362m;

    /* renamed from: n */
    private C43606a f110363n;

    public int getDeltaX() {
        return this.f110351b;
    }

    public int getViewWidth() {
        return this.f110360k;
    }

    /* renamed from: b */
    private boolean m95796b() {
        if ((this.f110362m & 128) == 128) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m95798c() {
        if ((this.f110362m & UnReadVideoExperiment.BROWSE_RECORD_LIST) == 256) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m95800d() {
        if ((this.f110362m & 64) == 64) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m95802e() {
        if ((this.f110362m & 8) == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m95804f() {
        if ((this.f110362m & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m95806g() {
        if ((this.f110362m & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m95808h() {
        if ((this.f110362m & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m95809i() {
        if (this.f110361l != null) {
            try {
                this.f110361l.vibrate(30);
            } catch (Throwable unused) {
            }
        }
    }

    private float getLeftViewXMargin() {
        if (C47918gj.m103682a(getContext())) {
            return (float) this.f110356g;
        }
        return C9432q.m18687b(getContext(), 8.0f);
    }

    private float getRightViewXMargin() {
        if (C47918gj.m103682a(getContext())) {
            return ((float) C43303dy.m94971b(getContext())) - C9432q.m18687b(getContext(), 8.0f);
        }
        return (float) (C43303dy.m94971b(getContext()) - this.f110356g);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo88856a();
        if (!C20393d.m50598a()) {
            m95794b(getContext());
        }
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(C43303dy.m94971b(getContext()), m95790a(getContext()));
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        if (!C20393d.m50598a()) {
            LayoutParams layoutParams2 = new LayoutParams(C43303dy.m94971b(getContext()), m95790a(getContext()));
            layoutParams2.gravity = 1;
            this.f110363n.setLayoutParams(layoutParams2);
        }
        this.f110350a = new RectF(getLeftViewXMargin(), (float) (-getHeight()), getRightViewXMargin(), ((float) m95790a(context)) - this.f110359j);
    }

    /* renamed from: a */
    public final void mo88856a() {
        m95797c(false);
        m95793a(false);
        m95795b(false);
        m95799d(false);
        m95801e(false);
        m95803f(false);
        m95805g(false);
        m95807h(false);
        m95810i(false);
        if (this.f110363n != null) {
            this.f110363n.mo88920b(false);
            this.f110363n.mo88919a(false);
        }
    }

    public void setDeltaX(int i) {
        this.f110351b = i;
    }

    public void setViewWidth(int i) {
        this.f110360k = i;
    }

    private BorderLineView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m95790a(Context context) {
        return C43303dy.m94967a(context) - C22452a.m55498d();
    }

    /* renamed from: a */
    private void m95793a(boolean z) {
        if (z) {
            if (!m95800d()) {
                m95809i();
            }
            this.f110362m |= 64;
        } else {
            this.f110362m &= -65;
        }
        postInvalidate();
    }

    /* renamed from: b */
    private void m95795b(boolean z) {
        if (z) {
            if (!m95796b()) {
                m95809i();
            }
            this.f110362m |= 128;
        } else {
            this.f110362m &= -129;
        }
        postInvalidate();
    }

    /* renamed from: c */
    private void m95797c(boolean z) {
        if (z) {
            if (!m95798c()) {
                m95809i();
            }
            this.f110362m |= UnReadVideoExperiment.BROWSE_RECORD_LIST;
        } else {
            this.f110362m &= -257;
        }
        postInvalidate();
    }

    /* renamed from: d */
    private void m95799d(boolean z) {
        if (z) {
            this.f110362m |= 32;
        } else {
            this.f110362m &= -33;
        }
        postInvalidate();
    }

    /* renamed from: e */
    private void m95801e(boolean z) {
        if (z) {
            this.f110362m |= 16;
        } else {
            this.f110362m &= -17;
        }
        postInvalidate();
    }

    /* renamed from: f */
    private void m95803f(boolean z) {
        if (z) {
            if (!m95802e()) {
                m95809i();
            }
            this.f110362m |= 8;
        } else {
            this.f110362m &= -9;
        }
        postInvalidate();
    }

    /* renamed from: g */
    private void m95805g(boolean z) {
        if (z) {
            if (!m95804f()) {
                m95809i();
            }
            this.f110362m |= 4;
        } else {
            this.f110362m &= -5;
        }
        postInvalidate();
    }

    /* renamed from: h */
    private void m95807h(boolean z) {
        if (z) {
            if (!m95806g()) {
                m95809i();
            }
            this.f110362m |= 2;
        } else {
            this.f110362m &= -3;
        }
        postInvalidate();
    }

    /* renamed from: i */
    private void m95810i(boolean z) {
        if (z) {
            if (!m95808h()) {
                m95809i();
            }
            this.f110362m |= 1;
        } else {
            this.f110362m &= -2;
        }
        postInvalidate();
    }

    /* renamed from: b */
    private void m95794b(Context context) {
        if (this.f110363n == null) {
            this.f110363n = new C43606a(context);
            LayoutParams layoutParams = new LayoutParams(C43303dy.m94971b(getContext()), m95790a(context));
            layoutParams.gravity = 1;
            this.f110363n.setLayoutParams(layoutParams);
            addView(this.f110363n);
        }
    }

    /* renamed from: a */
    public static Float m95792a(float f) {
        if (Math.abs(f - 0.0f) < 1.0f) {
            return Float.valueOf(0.0f);
        }
        if (Math.abs(Math.abs(f) - 90.0f) < 1.0f) {
            return Float.valueOf(90.0f);
        }
        if (Math.abs(f - 45.0f) < 1.0f) {
            return Float.valueOf(45.0f);
        }
        if (Math.abs(f - -45.0f) < 1.0f) {
            return Float.valueOf(-45.0f);
        }
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        this.f110357h.setPathEffect(null);
        if (m95798c()) {
            canvas.drawLine(getLeftViewXMargin(), 0.0f, getLeftViewXMargin(), (float) getHeight(), this.f110357h);
        }
        if (m95796b()) {
            canvas.drawLine(getRightViewXMargin(), 0.0f, getRightViewXMargin(), (float) getHeight(), this.f110357h);
        }
        if (m95800d()) {
            canvas.drawLine(0.0f, ((float) getHeight()) - this.f110359j, (float) getWidth(), ((float) getHeight()) - this.f110359j, this.f110357h);
        }
        boolean z2 = false;
        if ((this.f110362m & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.drawLine(0.0f, ((float) getHeight()) / 2.0f, (float) getWidth(), ((float) getHeight()) / 2.0f, this.f110357h);
        }
        if ((this.f110362m & 16) == 16) {
            z2 = true;
        }
        if (z2) {
            canvas.drawLine(((float) getWidth()) / 2.0f, 0.0f, ((float) getWidth()) / 2.0f, (float) getHeight(), this.f110357h);
        }
        this.f110357h.setPathEffect(this.f110358i);
        if (m95802e() && this.f110352c != null) {
            canvas.drawLine(0.0f, this.f110352c.centerY(), (float) getWidth(), this.f110352c.centerY(), this.f110357h);
        }
        if (m95804f() && this.f110352c != null) {
            canvas.drawLine(this.f110352c.centerX(), 0.0f, this.f110352c.centerX(), (float) getHeight(), this.f110357h);
        }
        if (m95806g() && this.f110352c != null) {
            canvas.drawLine(0.0f, ((float) getHeight()) - ((((float) getHeight()) - this.f110352c.centerY()) + this.f110352c.centerX()), this.f110352c.centerX() + (((float) getHeight()) - this.f110352c.centerY()), (float) getHeight(), this.f110357h);
        }
        if (m95808h() && this.f110352c != null) {
            canvas.drawLine((float) getWidth(), ((float) getHeight()) - ((((float) getWidth()) - this.f110352c.centerX()) + (((float) getHeight()) - this.f110352c.centerY())), ((float) getWidth()) - ((((float) getWidth()) - this.f110352c.centerX()) + (((float) getHeight()) - this.f110352c.centerY())), (float) getHeight(), this.f110357h);
        }
    }

    public BorderLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110354e = 4;
        this.f110355f = -16717825;
        this.f110357h = new Paint();
        this.f110352c = new RectF();
        this.f110362m = 0;
        this.f110354e = (int) C9432q.m18687b(context, 1.5f);
        this.f110356g = (int) C9432q.m18687b(context, 56.0f);
        this.f110357h.setColor(this.f110355f);
        this.f110357h.setAntiAlias(true);
        this.f110357h.setStyle(Style.STROKE);
        this.f110357h.setStrokeWidth((float) this.f110354e);
        setWillNotDraw(false);
        this.f110359j = (float) ((int) C9432q.m18687b(context, 201.0f));
        this.f110358i = new DashPathEffect(new float[]{C9432q.m18687b(context, 2.0f), C9432q.m18687b(context, 1.0f)}, 0.0f);
        this.f110361l = (Vibrator) context.getSystemService("vibrator");
    }

    /* renamed from: a */
    public final int mo88854a(PointF[] pointFArr, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i = -1;
        if (pointFArr == null) {
            return -1;
        }
        this.f110352c = C43546a.m95604a(pointFArr);
        if (this.f110352c.isEmpty()) {
            return -1;
        }
        this.f110352c.offset((float) this.f110351b, 0.0f);
        this.f110353d = pointFArr;
        if (this.f110350a == null) {
            return -1;
        }
        if (!z2 || Math.abs(this.f110352c.left - this.f110350a.left) >= 2.0f) {
            m95797c(false);
        } else {
            m95797c(true);
        }
        if (!z2 || Math.abs(this.f110352c.right - this.f110350a.right) >= 2.0f) {
            m95795b(false);
        } else {
            m95795b(true);
        }
        if (!z2 || Math.abs(this.f110352c.bottom - this.f110350a.bottom) >= 2.0f) {
            m95793a(false);
        } else {
            m95793a(true);
        }
        if (!C47918gj.m103682a(getContext()) ? this.f110352c.right >= this.f110350a.right || Math.abs(this.f110352c.right - this.f110350a.right) < 2.0f : this.f110352c.left <= this.f110350a.left || Math.abs(this.f110352c.left - this.f110350a.left) < 2.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f110352c.bottom >= this.f110350a.bottom || Math.abs(this.f110352c.bottom - this.f110350a.bottom) < 2.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 || z4) {
            m95794b(getContext());
        }
        if (this.f110363n != null) {
            this.f110363n.mo88919a(z3);
            this.f110363n.mo88920b(z4);
        }
        int i2 = 3;
        if (z) {
            int round = Math.round((float) ((Math.atan((double) ((pointFArr[1].y - pointFArr[0].y) / (pointFArr[1].x - pointFArr[0].x))) / 3.141592653589793d) * 180.0d));
            float f = (float) round;
            if (Math.abs(f - 0.0f) < 1.0f) {
                m95803f(true);
                i = 4;
            } else {
                m95803f(false);
            }
            if (Math.abs(((float) Math.abs(round)) - 90.0f) < 1.0f) {
                m95805g(true);
                i = 4;
            } else {
                m95805g(false);
            }
            if (Math.abs(f - 45.0f) < 1.0f) {
                m95807h(true);
                i2 = 4;
            } else {
                m95807h(false);
                i2 = i;
            }
            if (Math.abs(f - -45.0f) < 1.0f) {
                m95810i(true);
                i2 = 4;
            } else {
                m95810i(false);
            }
        } else {
            if (Math.abs(((Math.abs(this.f110352c.bottom - this.f110352c.top) / 2.0f) + this.f110352c.top) - (((float) getHeight()) / 2.0f)) < 2.0f) {
                m95799d(true);
                i = 3;
            } else {
                m95799d(false);
            }
            if (Math.abs(((Math.abs(this.f110352c.right - this.f110352c.left) / 2.0f) + this.f110352c.left) - (((float) getWidth()) / 2.0f)) < 2.0f) {
                m95801e(true);
            } else {
                m95801e(false);
                i2 = i;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final PointF mo88855a(PointF[] pointFArr, float f, float f2, boolean z) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF a = C43546a.m95604a(pointFArr);
        a.offset((float) this.f110351b, 0.0f);
        PointF pointF = new PointF();
        pointF.x = f;
        pointF.y = f2;
        if (Math.abs(((Math.abs(a.bottom - a.top) / 2.0f) + a.top) - (((float) getHeight()) / 2.0f)) < 1.0f) {
            pointF.y = (((float) getHeight()) / 2.0f) - (((a.bottom - a.top) / 2.0f) + a.top);
        }
        if (Math.abs(((Math.abs(a.right - a.left) / 2.0f) + a.left) - (((float) getWidth()) / 2.0f)) < 1.0f) {
            pointF.x = (((float) getWidth()) / 2.0f) - (((a.right - a.left) / 2.0f) + a.left);
        }
        return pointF;
    }

    /* renamed from: a */
    public static BorderLineView m95791a(Context context, int i, int i2, int i3, int i4) {
        BorderLineView borderLineView = new BorderLineView(context);
        LayoutParams layoutParams = new LayoutParams(C43303dy.m94971b(context), m95790a(context));
        layoutParams.gravity = 1;
        borderLineView.setLayoutParams(layoutParams);
        borderLineView.setDeltaX(i3);
        borderLineView.setViewWidth(i);
        borderLineView.setLayerType(1, null);
        return borderLineView;
    }
}
