package com.p683ss.android.ugc.asve.p1241e.p1242a;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.e.a.b */
public final class C20382b extends C20380a {

    /* renamed from: j */
    public static final C20383a f55895j = new C20383a(null);

    /* renamed from: o */
    private static final PointF f55896o = new PointF();

    /* renamed from: i */
    public PointF f55897i = new PointF();

    /* renamed from: k */
    private PointF f55898k;

    /* renamed from: l */
    private PointF f55899l;

    /* renamed from: m */
    private final PointF f55900m = new PointF();

    /* renamed from: n */
    private final C20384b f55901n;

    /* renamed from: com.ss.android.ugc.asve.e.a.b$a */
    public static final class C20383a {
        private C20383a() {
        }

        public /* synthetic */ C20383a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.e.a.b$b */
    public interface C20384b {
        /* renamed from: a */
        boolean mo43212a(C20382b bVar);

        /* renamed from: a */
        boolean mo43213a(C20382b bVar, float f, float f2);

        /* renamed from: b */
        void mo43214b(C20382b bVar);
    }

    /* renamed from: c */
    private static PointF m50563c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = (float) pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo43211b(MotionEvent motionEvent) {
        boolean z;
        PointF pointF;
        C52711k.m112240b(motionEvent, "curr");
        super.mo43211b(motionEvent);
        MotionEvent motionEvent2 = this.f55888a;
        this.f55898k = m50563c(motionEvent);
        if (motionEvent2 == null) {
            C52711k.m112234a();
        }
        this.f55899l = m50563c(motionEvent2);
        if (motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            pointF = f55896o;
        } else {
            PointF pointF2 = this.f55898k;
            if (pointF2 == null) {
                C52711k.m112234a();
            }
            float f = pointF2.x;
            PointF pointF3 = this.f55899l;
            if (pointF3 == null) {
                C52711k.m112234a();
            }
            float f2 = f - pointF3.x;
            PointF pointF4 = this.f55898k;
            if (pointF4 == null) {
                C52711k.m112234a();
            }
            float f3 = pointF4.y;
            PointF pointF5 = this.f55899l;
            if (pointF5 == null) {
                C52711k.m112234a();
            }
            pointF = new PointF(f2, f3 - pointF5.y);
        }
        this.f55897i = pointF;
        this.f55900m.x += this.f55897i.x;
        this.f55900m.y += this.f55897i.y;
    }

    public C20382b(Context context, C20384b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "mListener");
        super(context);
        this.f55901n = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43208a(int i, MotionEvent motionEvent) {
        float f;
        C52711k.m112240b(motionEvent, "event");
        if (i != 0) {
            if (i == 2) {
                C20384b bVar = this.f55901n;
                MotionEvent motionEvent2 = this.f55888a;
                float f2 = -1.0f;
                if (motionEvent2 == null) {
                    f = -1.0f;
                } else {
                    f = motionEvent2.getX();
                }
                MotionEvent motionEvent3 = this.f55888a;
                if (motionEvent3 != null) {
                    f2 = motionEvent3.getY();
                }
                this.f55892e = bVar.mo43213a(this, f, f2);
            }
            return;
        }
        mo43207a();
        this.f55900m.x = 0.0f;
        this.f55900m.y = 0.0f;
        this.f55888a = MotionEvent.obtain(motionEvent);
        this.f55893f = 0;
        mo43211b(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo43210b(int i, MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        switch (i) {
            case 1:
            case 3:
                this.f55901n.mo43214b(this);
                mo43207a();
                return;
            case 2:
                if (this.f55888a != null) {
                    mo43211b(motionEvent);
                    if (this.f55890c / this.f55891d > 0.67f && this.f55901n.mo43212a(this)) {
                        MotionEvent motionEvent2 = this.f55888a;
                        if (motionEvent2 == null) {
                            C52711k.m112234a();
                        }
                        motionEvent2.recycle();
                        this.f55888a = MotionEvent.obtain(motionEvent);
                        break;
                    }
                } else {
                    return;
                }
        }
    }
}
