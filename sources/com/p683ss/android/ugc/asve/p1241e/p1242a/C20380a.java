package com.p683ss.android.ugc.asve.p1241e.p1242a;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.e.a.a */
public abstract class C20380a {

    /* renamed from: h */
    public static final C20381a f55887h = new C20381a(null);

    /* renamed from: a */
    public MotionEvent f55888a;

    /* renamed from: b */
    public MotionEvent f55889b;

    /* renamed from: c */
    public float f55890c;

    /* renamed from: d */
    public float f55891d;

    /* renamed from: e */
    public boolean f55892e;

    /* renamed from: f */
    public long f55893f;

    /* renamed from: g */
    public final Context f55894g;

    /* renamed from: com.ss.android.ugc.asve.e.a.a$a */
    public static final class C20381a {
        private C20381a() {
        }

        public /* synthetic */ C20381a(C52707g gVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo43208a(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo43210b(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43207a() {
        if (this.f55888a != null) {
            MotionEvent motionEvent = this.f55888a;
            if (motionEvent == null) {
                C52711k.m112234a();
            }
            motionEvent.recycle();
            this.f55888a = null;
        }
        if (this.f55889b != null) {
            MotionEvent motionEvent2 = this.f55889b;
            if (motionEvent2 == null) {
                C52711k.m112234a();
            }
            motionEvent2.recycle();
            this.f55889b = null;
        }
        this.f55892e = false;
    }

    public C20380a(Context context) {
        C52711k.m112240b(context, "mContext");
        this.f55894g = context;
    }

    /* renamed from: a */
    public final boolean mo43209a(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (!this.f55892e) {
            mo43208a(action, motionEvent);
        } else {
            mo43210b(action, motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo43211b(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "curr");
        MotionEvent motionEvent2 = this.f55888a;
        if (this.f55889b != null) {
            MotionEvent motionEvent3 = this.f55889b;
            if (motionEvent3 == null) {
                C52711k.m112234a();
            }
            motionEvent3.recycle();
            this.f55889b = null;
        }
        this.f55889b = MotionEvent.obtain(motionEvent);
        long eventTime = motionEvent.getEventTime();
        if (motionEvent2 == null) {
            C52711k.m112234a();
        }
        this.f55893f = eventTime - motionEvent2.getEventTime();
        this.f55890c = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f55891d = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }
}
