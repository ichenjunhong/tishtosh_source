package com.p683ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44882e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b */
public final class C44525b extends C43866a {

    /* renamed from: a */
    private final C44882e f112680a;

    /* renamed from: b */
    private int f112681b;

    /* renamed from: c */
    private int f112682c;

    /* renamed from: d */
    private boolean f112683d;

    /* renamed from: e */
    private PointF f112684e = new PointF(-2.0f, -2.0f);

    /* renamed from: f */
    private PointF f112685f = new PointF();

    /* renamed from: a */
    public final boolean mo87820a(MotionEvent motionEvent) {
        m97441a(motionEvent.getX(), motionEvent.getY());
        this.f112680a.mo91019e(this.f112685f.x / ((float) this.f112681b), this.f112685f.y / ((float) this.f112682c));
        return true;
    }

    /* renamed from: c */
    public final boolean mo87832c(MotionEvent motionEvent) {
        m97441a(motionEvent.getX(), motionEvent.getY());
        this.f112680a.mo91004a(0, this.f112685f.x / ((float) this.f112681b), this.f112685f.y / ((float) this.f112682c), 1);
        this.f112683d = true;
        return false;
    }

    /* renamed from: d */
    public final boolean mo87834d(MotionEvent motionEvent) {
        m97441a(motionEvent.getX(), motionEvent.getY());
        this.f112680a.mo91004a(2, this.f112685f.x / ((float) this.f112681b), this.f112685f.y / ((float) this.f112682c), 1);
        this.f112683d = false;
        return false;
    }

    public C44525b(Context context, C44882e eVar) {
        this.f112681b = C23724k.m58224b(context);
        this.f112680a = eVar;
    }

    /* renamed from: a */
    private void m97441a(float f, float f2) {
        this.f112682c = C22452a.m55501g();
        int d = C22452a.m55498d();
        this.f112685f.set(f, f2);
        this.f112685f.offset(0.0f, (float) (-d));
    }

    /* renamed from: a */
    public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f112683d) {
            this.f112684e.x = motionEvent.getX();
            this.f112684e.y = motionEvent.getY();
            this.f112683d = false;
        }
        float x = motionEvent2.getX() - this.f112684e.x;
        float y = motionEvent2.getY() - this.f112684e.y;
        m97441a(motionEvent2.getX(), motionEvent2.getY());
        this.f112680a.mo91002a(this.f112685f.x / ((float) this.f112681b), this.f112685f.y / ((float) this.f112682c), x / ((float) this.f112681b), y / ((float) this.f112682c), 1.0f);
        this.f112684e.x = motionEvent2.getX();
        this.f112684e.y = motionEvent2.getY();
        return true;
    }
}
