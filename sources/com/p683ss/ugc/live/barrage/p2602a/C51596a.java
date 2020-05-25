package com.p683ss.ugc.live.barrage.p2602a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.MotionEvent;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.ugc.live.barrage.a.a */
public abstract class C51596a {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f128876g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C51596a.class), "paint", "getPaint()Landroid/graphics/Paint;"))};

    /* renamed from: a */
    private final C52668f f128877a = C52732g.m112285a(C51603c.f128887a);

    /* renamed from: h */
    public C51602b f128878h;

    /* renamed from: i */
    public boolean f128879i;

    /* renamed from: j */
    public boolean f128880j;

    /* renamed from: k */
    public final RectF f128881k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: l */
    public volatile C51597a f128882l;

    /* renamed from: com.ss.ugc.live.barrage.a.a$a */
    public static abstract class C51597a {

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$a */
        public static final class C51598a extends C51597a {

            /* renamed from: a */
            public static final C51598a f128883a = new C51598a();

            private C51598a() {
                super(null);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$b */
        public static final class C51599b extends C51597a {

            /* renamed from: a */
            public static final C51599b f128884a = new C51599b();

            private C51599b() {
                super(null);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$c */
        public static final class C51600c extends C51597a {

            /* renamed from: a */
            public static final C51600c f128885a = new C51600c();

            private C51600c() {
                super(null);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$d */
        public static final class C51601d extends C51597a {

            /* renamed from: a */
            public static final C51601d f128886a = new C51601d();

            private C51601d() {
                super(null);
            }
        }

        private C51597a() {
        }

        public /* synthetic */ C51597a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.live.barrage.a.a$b */
    public interface C51602b {
        /* renamed from: a */
        void mo10739a(C51596a aVar);
    }

    /* renamed from: com.ss.ugc.live.barrage.a.a$c */
    static final class C51603c extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        public static final C51603c f128887a = new C51603c();

        C51603c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Paint paint = new Paint();
            paint.setStyle(Style.FILL);
            paint.setDither(true);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: a */
    public final Paint mo105538a() {
        return (Paint) this.f128877a.getValue();
    }

    /* renamed from: b */
    public abstract Bitmap mo105541b();

    /* renamed from: c */
    public void mo105542c() {
    }

    /* renamed from: d */
    public void mo105543d() {
    }

    /* renamed from: e */
    public final void mo105544e() {
        this.f128879i = true;
    }

    /* renamed from: a */
    public final void mo105539a(C51597a aVar) {
        this.f128882l = aVar;
        m110751b(aVar);
    }

    /* renamed from: a */
    public final boolean mo105540a(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                return true;
            case 1:
                C51602b bVar = this.f128878h;
                if (bVar != null) {
                    bVar.mo10739a(this);
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    private final void m110751b(C51597a aVar) {
        if (!C52711k.m112239a((Object) aVar, (Object) C51599b.f128884a)) {
            if (C52711k.m112239a((Object) aVar, (Object) C51600c.f128885a)) {
                mo105542c();
            } else if (!C52711k.m112239a((Object) aVar, (Object) C51601d.f128886a) && C52711k.m112239a((Object) aVar, (Object) C51598a.f128883a)) {
                mo105543d();
            }
        }
    }

    /* renamed from: a */
    public void mo10730a(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        if (!(!C52711k.m112239a((Object) this.f128882l, (Object) C51601d.f128886a))) {
            Bitmap b = mo105541b();
            if (b != null && !b.isRecycled()) {
                canvas.drawBitmap(mo105541b(), this.f128881k.left, this.f128881k.top, mo105538a());
            }
        }
    }
}
