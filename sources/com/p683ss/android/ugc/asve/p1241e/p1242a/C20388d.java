package com.p683ss.android.ugc.asve.p1241e.p1242a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.e.a.d */
public abstract class C20388d extends C20380a {

    /* renamed from: p */
    public static final C20389a f55906p = new C20389a(null);

    /* renamed from: i */
    private final float f55907i;

    /* renamed from: j */
    private float f55908j;

    /* renamed from: k */
    public float f55909k;

    /* renamed from: l */
    public float f55910l;

    /* renamed from: m */
    public float f55911m;

    /* renamed from: n */
    public float f55912n;

    /* renamed from: o */
    public int f55913o;

    /* renamed from: q */
    private float f55914q;

    /* renamed from: r */
    private float f55915r;

    /* renamed from: s */
    private float f55916s;

    /* renamed from: com.ss.android.ugc.asve.e.a.d$a */
    public static final class C20389a {
        private C20389a() {
        }

        public /* synthetic */ C20389a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static float m50586a(MotionEvent motionEvent, int i) {
            C52711k.m112240b(motionEvent, "event");
            float x = motionEvent.getX() - motionEvent.getRawX();
            if (1 < motionEvent.getPointerCount()) {
                return motionEvent.getX(1) + x;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public static float m50587b(MotionEvent motionEvent, int i) {
            C52711k.m112240b(motionEvent, "event");
            float y = motionEvent.getY() - motionEvent.getRawY();
            if (1 < motionEvent.getPointerCount()) {
                return motionEvent.getY(1) + y;
            }
            return 0.0f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo43208a(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo43210b(int i, MotionEvent motionEvent);

    public C20388d(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C52711k.m112236a((Object) viewConfiguration, "config");
        this.f55907i = (float) viewConfiguration.getScaledEdgeSlop();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo43211b(MotionEvent motionEvent) {
        float f;
        C52711k.m112240b(motionEvent, "curr");
        super.mo43211b(motionEvent);
        MotionEvent motionEvent2 = this.f55888a;
        this.f55915r = -1.0f;
        this.f55916s = -1.0f;
        if (motionEvent2 == null) {
            C52711k.m112234a();
        }
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float f2 = 0.0f;
        if (motionEvent2.getPointerCount() >= 2) {
            f2 = motionEvent2.getX(1);
            f = motionEvent2.getY(1);
        } else {
            f = 0.0f;
        }
        float f3 = f - y;
        this.f55909k = f2 - x;
        this.f55910l = f3;
        float x2 = motionEvent.getX(0);
        float y2 = motionEvent.getY(0);
        if (motionEvent.getPointerCount() >= 2) {
            f2 = motionEvent.getX(1);
            f = motionEvent.getY(1);
        }
        float f4 = f - y2;
        this.f55911m = f2 - x2;
        this.f55912n = f4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo43219c(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        C52711k.m112240b(motionEvent, "event");
        Resources resources = this.f55894g.getResources();
        C52711k.m112236a((Object) resources, "mContext.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.f55908j = ((float) displayMetrics.widthPixels) - this.f55907i;
        this.f55914q = ((float) displayMetrics.heightPixels) - this.f55907i;
        float f = this.f55907i - ((float) this.f55913o);
        float f2 = this.f55908j + ((float) this.f55913o);
        float f3 = this.f55914q + ((float) this.f55913o);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float a = C20389a.m50586a(motionEvent, 1);
        float b = C20389a.m50587b(motionEvent, 1);
        if (rawX < f || rawY < f || rawX > f2 || rawY > f3) {
            z = true;
        } else {
            z = false;
        }
        if (a < f || b < f || a > f2 || b > f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z || !z2) && !z && !z2) {
            return false;
        }
        return true;
    }
}
