package com.p683ss.android.ugc.asve.p1241e.p1242a;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.e.a.c */
public final class C20385c extends C20388d {

    /* renamed from: i */
    public float f55902i;

    /* renamed from: j */
    public float f55903j;

    /* renamed from: q */
    private boolean f55904q;

    /* renamed from: r */
    private final C20386a f55905r;

    /* renamed from: com.ss.android.ugc.asve.e.a.c$a */
    public interface C20386a {
        /* renamed from: a */
        boolean mo43216a(C20385c cVar);

        /* renamed from: b */
        boolean mo43217b(C20385c cVar);

        /* renamed from: c */
        void mo43218c(C20385c cVar);
    }

    /* renamed from: com.ss.android.ugc.asve.e.a.c$b */
    public static class C20387b implements C20386a {
        /* renamed from: a */
        public boolean mo43216a(C20385c cVar) {
            C52711k.m112240b(cVar, "detector");
            return false;
        }

        /* renamed from: b */
        public boolean mo43217b(C20385c cVar) {
            C52711k.m112240b(cVar, "detector");
            return true;
        }

        /* renamed from: c */
        public void mo43218c(C20385c cVar) {
            C52711k.m112240b(cVar, "detector");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43207a() {
        super.mo43207a();
        this.f55904q = false;
    }

    /* renamed from: b */
    public final float mo43215b() {
        return (float) (Math.atan2((double) this.f55910l, (double) this.f55909k) - Math.atan2((double) this.f55912n, (double) this.f55911m));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo43211b(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "curr");
        super.mo43211b(motionEvent);
        m50570d(motionEvent);
    }

    /* renamed from: d */
    private final void m50570d(MotionEvent motionEvent) {
        int i;
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getAction() & NormalGiftView.ALPHA_255) == 6) {
            i = motionEvent.getActionIndex();
        } else {
            i = -1;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (i != i2) {
                f += motionEvent.getX(i2);
                f2 += motionEvent.getY(i2);
            }
        }
        float f3 = (float) pointerCount;
        this.f55902i = f / f3;
        this.f55903j = f2 / f3;
    }

    public C20385c(Context context, C20386a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "mListener");
        super(context);
        this.f55905r = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43208a(int i, MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        if (i != 2) {
            if (i == 5) {
                mo43207a();
                this.f55888a = MotionEvent.obtain(motionEvent);
                this.f55893f = 0;
                mo43211b(motionEvent);
                this.f55904q = mo43219c(motionEvent);
                if (!this.f55904q) {
                    this.f55892e = this.f55905r.mo43217b(this);
                }
            }
        } else if (this.f55904q) {
            this.f55904q = mo43219c(motionEvent);
            if (!this.f55904q) {
                this.f55892e = this.f55905r.mo43217b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo43210b(int i, MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        if (i != 6) {
            switch (i) {
                case 2:
                    mo43211b(motionEvent);
                    if (this.f55890c / this.f55891d > 0.67f && this.f55905r.mo43216a(this)) {
                        MotionEvent motionEvent2 = this.f55888a;
                        if (motionEvent2 == null) {
                            C52711k.m112234a();
                        }
                        motionEvent2.recycle();
                        this.f55888a = MotionEvent.obtain(motionEvent);
                        break;
                    }
                case 3:
                    if (!this.f55904q) {
                        this.f55905r.mo43218c(this);
                    }
                    mo43207a();
                    return;
            }
            return;
        }
        mo43211b(motionEvent);
        if (!this.f55904q) {
            this.f55905r.mo43218c(this);
        }
        mo43207a();
    }
}
