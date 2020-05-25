package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ex */
public final class C6185ex extends View {

    /* renamed from: a */
    public int f16601a;

    /* renamed from: b */
    public int f16602b;

    /* renamed from: c */
    public Context f16603c;

    /* renamed from: d */
    private Paint f16604d;

    /* renamed from: e */
    private Paint f16605e = new Paint();

    /* renamed from: f */
    private int f16606f;

    /* renamed from: g */
    private int f16607g;

    /* renamed from: h */
    private int f16608h;

    /* renamed from: i */
    private int f16609i;

    /* renamed from: j */
    private int f16610j = 12;

    /* renamed from: k */
    private int f16611k;

    /* renamed from: l */
    private RectF f16612l;

    /* renamed from: m */
    private C6186a f16613m;

    /* renamed from: n */
    private C6186a f16614n;

    /* renamed from: o */
    private PathEffect f16615o;

    /* renamed from: p */
    private float f16616p;

    /* renamed from: q */
    private float f16617q;

    /* renamed from: r */
    private float f16618r;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ex$a */
    public class C6186a {

        /* renamed from: a */
        public float f16619a;

        /* renamed from: b */
        public float f16620b;

        /* renamed from: c */
        float f16621c = 2.0f;

        /* renamed from: a */
        public final void mo12226a(int i) {
            float b = (((float) C6185ex.this.f16601a) - C9432q.m18687b(C6185ex.this.f16603c, 2.0f)) / this.f16621c;
            double d = (double) i;
            float f = ((float) C6185ex.this.f16601a) / this.f16621c;
            Double.isNaN(d);
            double d2 = (d * 3.141592653589793d) / 180.0d;
            this.f16619a = f + (((float) Math.cos(d2)) * b);
            this.f16620b = (((float) C6185ex.this.f16602b) / this.f16621c) + (((float) Math.sin(d2)) * b);
        }

        public C6186a(int i) {
            mo12226a(0);
        }
    }

    public final void setColor(int i) {
        this.f16611k = i;
    }

    public C6185ex(Context context) {
        super(context);
        this.f16603c = context;
        this.f16606f = 0;
        this.f16607g = 0;
        this.f16612l = new RectF();
        this.f16613m = new C6186a(0);
        this.f16614n = new C6186a(0);
        this.f16615o = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        this.f16616p = C9432q.m18687b(this.f16603c, 1.9f);
        this.f16617q = C9432q.m18687b(this.f16603c, 2.0f);
        this.f16618r = C9432q.m18687b(this.f16603c, 2.0f) / 2.0f;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16604d == null) {
            this.f16604d = new Paint();
            this.f16604d.setAntiAlias(true);
            this.f16604d.setStyle(Style.STROKE);
        }
        this.f16604d.setColor(this.f16611k);
        this.f16604d.setPathEffect(this.f16615o);
        this.f16604d.setStrokeWidth(this.f16616p);
        canvas.drawArc(this.f16612l, ((float) this.f16606f) / 4.0f, 359.0f, false, this.f16604d);
        this.f16604d.setPathEffect(null);
        int i = this.f16606f;
        double d = (double) i;
        Double.isNaN(d);
        int sin = (int) (Math.sin((d * 3.141592653589793d) / 90.0d) * 345.0d * -1.0d);
        if ((i >= 0 && i < 45) || ((135 <= i && i < 225) || (315 <= i && i < 360))) {
            sin = -sin;
        }
        if (this.f16606f % 90 == 45) {
            this.f16609i = (this.f16607g - this.f16608h) - 1;
            this.f16607g = this.f16608h + 1;
        }
        if (sin == 0) {
            this.f16607g += this.f16609i;
        }
        this.f16604d.setStrokeWidth(this.f16617q);
        canvas.drawArc(this.f16612l, (float) (this.f16607g - this.f16610j), (float) sin, false, this.f16604d);
        this.f16613m.mo12226a(this.f16607g - this.f16610j);
        this.f16614n.mo12226a((this.f16607g - this.f16610j) + sin);
        this.f16605e.setColor(this.f16611k);
        canvas.drawCircle(this.f16613m.f16619a, this.f16613m.f16620b, this.f16618r, this.f16605e);
        canvas.drawCircle(this.f16614n.f16619a, this.f16614n.f16620b, this.f16618r, this.f16605e);
        this.f16608h = this.f16607g + sin;
        this.f16606f = (this.f16606f + 1) % 360;
        this.f16607g = (this.f16607g + 1) % 360;
        postInvalidateDelayed(15);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f16601a = MeasureSpec.getSize(i);
        this.f16602b = MeasureSpec.getSize(i2);
        float b = C9432q.m18687b(this.f16603c, 1.0f);
        this.f16612l.set(b, b, ((float) this.f16601a) - b, ((float) this.f16602b) - b);
    }
}
