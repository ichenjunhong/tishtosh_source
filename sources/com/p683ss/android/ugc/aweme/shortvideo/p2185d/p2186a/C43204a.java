package com.p683ss.android.ugc.aweme.shortvideo.p2185d.p2186a;

import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.vesdk.C50634ao;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.d.a.a */
public final class C43204a extends C43866a {

    /* renamed from: a */
    private final C20489b f109236a;

    /* renamed from: b */
    private int f109237b;

    /* renamed from: c */
    private int f109238c;

    /* renamed from: d */
    private float f109239d = 1.0f;

    /* renamed from: e */
    private float f109240e = 1.0f;

    /* renamed from: f */
    private float f109241f;

    /* renamed from: g */
    private boolean f109242g;

    /* renamed from: h */
    private PointF f109243h = new PointF(-2.0f, -2.0f);

    /* renamed from: i */
    private int f109244i;

    /* renamed from: j */
    private int f109245j;

    /* renamed from: k */
    private PointF f109246k = new PointF();

    /* renamed from: l */
    private Pair<Float, Float> f109247l;

    /* renamed from: a */
    public final boolean mo87818a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo87822a(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo87823a(C20385c cVar) {
        return true;
    }

    /* renamed from: b */
    public final void mo87824b(MotionEvent motionEvent, int[] iArr) {
    }

    /* renamed from: b */
    public final boolean mo87825b() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo87819a(float f) {
        this.f109239d = 1.0f;
        this.f109240e = 1.0f;
        return true;
    }

    /* renamed from: b */
    public final boolean mo87826b(float f) {
        this.f109236a.mo43511d(-f, 6.0f);
        return true;
    }

    /* renamed from: c */
    public final boolean mo87831c(float f) {
        this.f109236a.mo43511d(-f, 6.0f);
        return true;
    }

    public C43204a(C20489b bVar) {
        this.f109236a = bVar;
        this.f109237b = C23724k.m58223b();
        this.f109244i = C39618d.f101176q.getVideoWidth();
        this.f109245j = C39618d.f101176q.getVideoHeight();
    }

    /* renamed from: b */
    public final boolean mo87827b(MotionEvent motionEvent) {
        m94762a(motionEvent.getX(), motionEvent.getY());
        PointF b = m94763b(this.f109246k.x, this.f109246k.y);
        if (this.f109236a != null) {
            this.f109236a.mo43519e(b.x, b.y);
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo87834d(MotionEvent motionEvent) {
        m94762a(motionEvent.getX(), motionEvent.getY());
        this.f109236a.mo43455a(2, this.f109246k.x / ((float) this.f109237b), this.f109246k.y / ((float) this.f109238c), 0);
        this.f109242g = false;
        return false;
    }

    /* renamed from: a */
    public final boolean mo87820a(MotionEvent motionEvent) {
        m94762a(motionEvent.getX(), motionEvent.getY());
        PointF b = m94763b(this.f109246k.x, this.f109246k.y);
        this.f109236a.mo43452a(b.x, b.y);
        return true;
    }

    /* renamed from: c */
    public final boolean mo87832c(MotionEvent motionEvent) {
        m94762a(motionEvent.getX(), motionEvent.getY());
        this.f109236a.mo43455a(0, this.f109246k.x / ((float) this.f109237b), this.f109246k.y / ((float) this.f109238c), 0);
        this.f109242g = true;
        return false;
    }

    /* renamed from: b */
    public final boolean mo87829b(ScaleGestureDetector scaleGestureDetector) {
        this.f109240e *= scaleGestureDetector.getScaleFactor();
        this.f109236a.mo43502c(this.f109240e / this.f109239d, 3.0f);
        this.f109239d = this.f109240e;
        return true;
    }

    /* renamed from: a */
    public final C43204a mo87815a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return this;
        }
        this.f109244i = i;
        this.f109245j = i2;
        return this;
    }

    /* renamed from: a */
    private void m94762a(float f, float f2) {
        this.f109238c = C22452a.m55501g();
        int d = C22452a.m55498d();
        this.f109246k.set(f, f2);
        this.f109246k.offset(0.0f, (float) (-d));
    }

    /* renamed from: b */
    private PointF m94763b(float f, float f2) {
        int i = (this.f109244i - this.f109237b) / 2;
        PointF pointF = new PointF();
        pointF.x = (f + ((float) i)) / ((float) this.f109244i);
        pointF.y = f2 / ((float) this.f109245j);
        return pointF;
    }

    /* renamed from: a */
    public final void mo87817a(C50634ao aoVar, MotionEvent motionEvent) {
        super.mo87817a(aoVar, motionEvent);
        m94762a(aoVar.f126942c, aoVar.f126943d);
        aoVar.f126942c = this.f109246k.x / ((float) this.f109237b);
        aoVar.f126943d = this.f109246k.y / ((float) this.f109238c);
        this.f109236a.mo43484a(aoVar, motionEvent.getPointerCount());
    }

    /* renamed from: c */
    public final void mo87830c(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            m94762a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            PointF b = m94763b(this.f109246k.x, this.f109246k.y);
            this.f109236a.mo43452a(b.x, b.y);
        }
    }

    /* renamed from: e */
    public final void mo87835e(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            m94762a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f109236a.mo43455a(2, this.f109246k.x / ((float) this.f109237b), this.f109246k.y / ((float) this.f109238c), 0);
            this.f109242g = false;
        }
    }

    /* renamed from: d */
    public final void mo87833d(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            m94762a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f109236a.mo43455a(0, this.f109246k.x / ((float) this.f109237b), this.f109246k.y / ((float) this.f109238c), 0);
            this.f109242g = true;
            this.f109247l = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
        }
    }

    /* renamed from: a */
    public final void mo87816a(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            if (this.f109242g && this.f109247l != null) {
                this.f109243h.x = ((Float) this.f109247l.first).floatValue() + ((float) iArr[0]);
                this.f109243h.y = ((Float) this.f109247l.second).floatValue() + ((float) iArr[1]);
                this.f109242g = false;
            }
            float x = (motionEvent.getX(1) + ((float) iArr[0])) - this.f109243h.x;
            float y = (motionEvent.getY(1) + ((float) iArr[1])) - this.f109243h.y;
            m94762a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f109236a.mo43453a(this.f109246k.x / ((float) this.f109237b), this.f109246k.y / ((float) this.f109238c), x / ((float) this.f109237b), y / ((float) this.f109238c), 1.0f);
            this.f109243h.x = motionEvent.getX(1) + ((float) iArr[0]);
            this.f109243h.y = motionEvent.getY(1) + ((float) iArr[1]);
            if (!(this.f109247l == null || ((Float) this.f109247l.first).floatValue() + ((float) iArr[0]) == this.f109241f)) {
                this.f109241f = ((Float) this.f109247l.first).floatValue() + ((float) iArr[0]);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f109242g) {
            this.f109243h.x = motionEvent.getX();
            this.f109243h.y = motionEvent.getY();
            this.f109242g = false;
        }
        float x = motionEvent2.getX() - this.f109243h.x;
        float y = motionEvent2.getY() - this.f109243h.y;
        m94762a(motionEvent2.getX(), motionEvent2.getY());
        this.f109236a.mo43453a(this.f109246k.x / ((float) this.f109237b), this.f109246k.y / ((float) this.f109238c), x / ((float) this.f109237b), y / ((float) this.f109238c), 1.0f);
        this.f109243h.x = motionEvent2.getX();
        this.f109243h.y = motionEvent2.getY();
        if (!(motionEvent == null || motionEvent.getX() == this.f109241f)) {
            this.f109241f = motionEvent.getX();
        }
        return true;
    }
}
