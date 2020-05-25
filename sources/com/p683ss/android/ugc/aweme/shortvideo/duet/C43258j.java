package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.vesdk.C50634ao;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.j */
public final class C43258j extends C43866a {

    /* renamed from: a */
    private int f109381a = C23724k.m58223b();

    /* renamed from: b */
    private int f109382b = C22452a.m55501g();

    /* renamed from: c */
    private boolean f109383c;

    /* renamed from: d */
    private final PointF f109384d = new PointF(-2.0f, -2.0f);

    /* renamed from: e */
    private float f109385e;

    /* renamed from: f */
    private final PointF f109386f = new PointF();

    /* renamed from: g */
    private Pair<Float, Float> f109387g = new Pair<>(Float.valueOf(-2.0f), Float.valueOf(-2.0f));

    /* renamed from: h */
    private final C20489b f109388h;

    public C43258j(C20489b bVar) {
        C52711k.m112240b(bVar, "effectController");
        this.f109388h = bVar;
    }

    /* renamed from: c */
    public final boolean mo87832c(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        m94892a(motionEvent.getX(), motionEvent.getY());
        this.f109388h.mo43455a(0, this.f109386f.x / ((float) this.f109381a), this.f109386f.y / ((float) this.f109382b), 0);
        this.f109383c = true;
        return false;
    }

    /* renamed from: d */
    public final boolean mo87834d(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        m94892a(motionEvent.getX(), motionEvent.getY());
        this.f109388h.mo43455a(2, this.f109386f.x / ((float) this.f109381a), this.f109386f.y / ((float) this.f109382b), 1);
        this.f109383c = false;
        return false;
    }

    /* renamed from: a */
    private final void m94892a(float f, float f2) {
        this.f109382b = C22452a.m55501g();
        int d = C22452a.m55498d();
        this.f109386f.set(f, f2);
        this.f109386f.offset(0.0f, (float) (-d));
    }

    /* renamed from: a */
    public final void mo87817a(C50634ao aoVar, MotionEvent motionEvent) {
        C52711k.m112240b(aoVar, "veTouchPointer");
        C52711k.m112240b(motionEvent, "event");
        super.mo87817a(aoVar, motionEvent);
        m94892a(aoVar.f126942c, aoVar.f126943d);
        aoVar.f126942c = this.f109386f.x / ((float) this.f109381a);
        aoVar.f126943d = this.f109386f.y / ((float) this.f109382b);
        this.f109388h.mo43484a(aoVar, motionEvent.getPointerCount());
    }

    /* renamed from: e */
    public final void mo87835e(MotionEvent motionEvent, int[] iArr) {
        C52711k.m112240b(motionEvent, "event");
        C52711k.m112240b(iArr, "location");
        if (motionEvent.getPointerCount() == 2) {
            m94892a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f109388h.mo43455a(2, this.f109386f.x / ((float) this.f109381a), this.f109386f.y / ((float) this.f109382b), 0);
            this.f109383c = false;
        }
    }

    /* renamed from: d */
    public final void mo87833d(MotionEvent motionEvent, int[] iArr) {
        C52711k.m112240b(motionEvent, "event");
        C52711k.m112240b(iArr, "location");
        if (motionEvent.getPointerCount() == 2) {
            m94892a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f109388h.mo43455a(0, this.f109386f.x / ((float) this.f109381a), this.f109386f.y / ((float) this.f109382b), 0);
            this.f109383c = true;
            this.f109387g = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
        }
    }

    /* renamed from: a */
    public final void mo87816a(MotionEvent motionEvent, int[] iArr) {
        C52711k.m112240b(motionEvent, "event");
        C52711k.m112240b(iArr, "location");
        if (motionEvent.getPointerCount() == 2) {
            if (this.f109383c) {
                this.f109384d.x = ((Number) this.f109387g.first).floatValue() + ((float) iArr[0]);
                this.f109384d.y = ((Number) this.f109387g.second).floatValue() + ((float) iArr[1]);
                this.f109383c = false;
            }
            float x = (motionEvent.getX(1) + ((float) iArr[0])) - this.f109384d.x;
            float y = (motionEvent.getY(1) + ((float) iArr[1])) - this.f109384d.y;
            m94892a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f109388h.mo43453a(this.f109386f.x / ((float) this.f109381a), this.f109386f.y / ((float) this.f109382b), x / ((float) this.f109381a), y / ((float) this.f109382b), 1.0f);
            this.f109384d.x = motionEvent.getX(1) + ((float) iArr[0]);
            this.f109384d.y = motionEvent.getY(1) + ((float) iArr[1]);
            if (((Number) this.f109387g.first).floatValue() + ((float) iArr[0]) != this.f109385e) {
                this.f109385e = ((Number) this.f109387g.first).floatValue() + ((float) iArr[0]);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C52711k.m112240b(motionEvent2, "e2");
        if (this.f109383c) {
            PointF pointF = this.f109384d;
            if (motionEvent == null) {
                C52711k.m112234a();
            }
            pointF.x = motionEvent.getX();
            this.f109384d.y = motionEvent.getY();
            this.f109383c = false;
        }
        float x = motionEvent2.getX() - this.f109384d.x;
        float y = motionEvent2.getY() - this.f109384d.y;
        m94892a(motionEvent2.getX(), motionEvent2.getY());
        this.f109388h.mo43453a(this.f109386f.x / ((float) this.f109381a), this.f109386f.y / ((float) this.f109382b), x / ((float) this.f109381a), y / ((float) this.f109382b), 1.0f);
        this.f109384d.x = motionEvent2.getX();
        this.f109384d.y = motionEvent2.getY();
        if (!(motionEvent == null || motionEvent.getX() == this.f109385e)) {
            this.f109385e = motionEvent.getX();
        }
        return false;
    }
}
