package com.p683ss.android.ugc.aweme.shortvideo.p2185d.p2186a;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44882e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.d.a.b */
public final class C43205b extends C43866a {

    /* renamed from: a */
    private final C44882e f109248a;

    /* renamed from: b */
    private int f109249b;

    /* renamed from: c */
    private int f109250c;

    /* renamed from: d */
    private float f109251d = 1.0f;

    /* renamed from: e */
    private float f109252e = 1.0f;

    /* renamed from: f */
    private float f109253f;

    /* renamed from: g */
    private boolean f109254g;

    /* renamed from: h */
    private PointF f109255h = new PointF(-2.0f, -2.0f);

    /* renamed from: i */
    private int f109256i;

    /* renamed from: j */
    private int f109257j;

    /* renamed from: k */
    private PointF f109258k = new PointF();

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
    public final boolean mo87825b() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo87819a(float f) {
        this.f109251d = 1.0f;
        this.f109252e = 1.0f;
        return true;
    }

    /* renamed from: b */
    public final boolean mo87826b(float f) {
        this.f109248a.mo91021g(-f, 6.0f);
        return true;
    }

    /* renamed from: c */
    public final boolean mo87831c(float f) {
        this.f109248a.mo91021g(-f, 6.0f);
        return true;
    }

    public C43205b(C44882e eVar) {
        this.f109248a = eVar;
        this.f109249b = C23724k.m58223b();
        this.f109256i = C39618d.f101176q.getVideoWidth();
        this.f109257j = C39618d.f101176q.getVideoHeight();
    }

    /* renamed from: a */
    public final boolean mo87820a(MotionEvent motionEvent) {
        m94785a(motionEvent.getX(), motionEvent.getY());
        PointF b = m94786b(this.f109258k.x, this.f109258k.y);
        this.f109248a.mo91017d(b.x, b.y);
        return true;
    }

    /* renamed from: b */
    public final boolean mo87827b(MotionEvent motionEvent) {
        m94785a(motionEvent.getX(), motionEvent.getY());
        PointF b = m94786b(this.f109258k.x, this.f109258k.y);
        if (this.f109248a != null) {
            this.f109248a.mo91022h(b.x, b.y);
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo87832c(MotionEvent motionEvent) {
        m94785a(motionEvent.getX(), motionEvent.getY());
        this.f109248a.mo91004a(0, this.f109258k.x / ((float) this.f109249b), this.f109258k.y / ((float) this.f109250c), 0);
        this.f109254g = true;
        return false;
    }

    /* renamed from: d */
    public final boolean mo87834d(MotionEvent motionEvent) {
        m94785a(motionEvent.getX(), motionEvent.getY());
        this.f109248a.mo91004a(2, this.f109258k.x / ((float) this.f109249b), this.f109258k.y / ((float) this.f109250c), 0);
        this.f109254g = false;
        return false;
    }

    /* renamed from: b */
    public final boolean mo87829b(ScaleGestureDetector scaleGestureDetector) {
        this.f109252e *= scaleGestureDetector.getScaleFactor();
        this.f109248a.mo91020f(this.f109252e / this.f109251d, 3.0f);
        this.f109251d = this.f109252e;
        return true;
    }

    /* renamed from: a */
    public final C43205b mo87836a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return this;
        }
        this.f109256i = i;
        this.f109257j = i2;
        return this;
    }

    /* renamed from: a */
    private void m94785a(float f, float f2) {
        this.f109250c = C22452a.m55501g();
        int d = C22452a.m55498d();
        this.f109258k.set(f, f2);
        this.f109258k.offset(0.0f, (float) (-d));
    }

    /* renamed from: b */
    private PointF m94786b(float f, float f2) {
        int i = (this.f109256i - this.f109249b) / 2;
        PointF pointF = new PointF();
        pointF.x = (f + ((float) i)) / ((float) this.f109256i);
        pointF.y = f2 / ((float) this.f109257j);
        return pointF;
    }

    /* renamed from: a */
    public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f109254g) {
            this.f109255h.x = motionEvent.getX();
            this.f109255h.y = motionEvent.getY();
            this.f109254g = false;
        }
        float x = motionEvent2.getX() - this.f109255h.x;
        float y = motionEvent2.getY() - this.f109255h.y;
        m94785a(motionEvent2.getX(), motionEvent2.getY());
        this.f109248a.mo91002a(this.f109258k.x / ((float) this.f109249b), this.f109258k.y / ((float) this.f109250c), x / ((float) this.f109249b), y / ((float) this.f109250c), 1.0f);
        this.f109255h.x = motionEvent2.getX();
        this.f109255h.y = motionEvent2.getY();
        if (!(motionEvent == null || motionEvent.getX() == this.f109253f)) {
            this.f109253f = motionEvent.getX();
        }
        return true;
    }
}
