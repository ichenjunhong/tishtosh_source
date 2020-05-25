package com.p683ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.vesdk.C50634ao;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e */
public final class C44563e extends C43866a {

    /* renamed from: a */
    private final C20489b f112745a;

    /* renamed from: b */
    private int f112746b;

    /* renamed from: c */
    private int f112747c;

    /* renamed from: d */
    private boolean f112748d;

    /* renamed from: e */
    private PointF f112749e = new PointF(-2.0f, -2.0f);

    /* renamed from: f */
    private PointF f112750f = new PointF();

    /* renamed from: c */
    public final boolean mo87832c(MotionEvent motionEvent) {
        m97495a(motionEvent.getX(), motionEvent.getY());
        this.f112745a.mo43455a(0, this.f112750f.x / ((float) this.f112746b), this.f112750f.y / ((float) this.f112747c), 1);
        this.f112748d = true;
        return false;
    }

    /* renamed from: d */
    public final boolean mo87834d(MotionEvent motionEvent) {
        m97495a(motionEvent.getX(), motionEvent.getY());
        this.f112745a.mo43455a(2, this.f112750f.x / ((float) this.f112746b), this.f112750f.y / ((float) this.f112747c), 1);
        this.f112748d = false;
        return false;
    }

    /* renamed from: a */
    public final boolean mo87820a(MotionEvent motionEvent) {
        m97495a(motionEvent.getX(), motionEvent.getY());
        this.f112745a.mo43490b(this.f112750f.x / ((float) this.f112746b), this.f112750f.y / ((float) this.f112747c));
        return true;
    }

    public C44563e(Context context, C20489b bVar) {
        this.f112746b = C23724k.m58224b(context);
        this.f112745a = bVar;
    }

    /* renamed from: a */
    private void m97495a(float f, float f2) {
        this.f112747c = C22452a.m55501g();
        int d = C22452a.m55498d();
        this.f112750f.set(f, f2);
        this.f112750f.offset(0.0f, (float) (-d));
    }

    /* renamed from: a */
    public final void mo87817a(C50634ao aoVar, MotionEvent motionEvent) {
        super.mo87817a(aoVar, motionEvent);
        m97495a(aoVar.f126942c, aoVar.f126943d);
        aoVar.f126942c = this.f112750f.x / ((float) this.f112746b);
        aoVar.f126943d = this.f112750f.y / ((float) this.f112747c);
        this.f112745a.mo43484a(aoVar, motionEvent.getPointerCount());
    }

    /* renamed from: a */
    public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f112748d) {
            this.f112749e.x = motionEvent.getX();
            this.f112749e.y = motionEvent.getY();
            this.f112748d = false;
        }
        float x = motionEvent2.getX() - this.f112749e.x;
        float y = motionEvent2.getY() - this.f112749e.y;
        m97495a(motionEvent2.getX(), motionEvent2.getY());
        this.f112745a.mo43453a(this.f112750f.x / ((float) this.f112746b), this.f112750f.y / ((float) this.f112747c), x / ((float) this.f112746b), y / ((float) this.f112747c), 1.0f);
        this.f112749e.x = motionEvent2.getX();
        this.f112749e.y = motionEvent2.getY();
        return true;
    }
}
