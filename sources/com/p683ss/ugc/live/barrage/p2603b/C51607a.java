package com.p683ss.ugc.live.barrage.p2603b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.RectF;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.p683ss.ugc.live.barrage.C51594a;
import com.p683ss.ugc.live.barrage.C51594a.C51595a;
import com.p683ss.ugc.live.barrage.p2602a.C51596a;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a.C51599b;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a.C51600c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.ugc.live.barrage.b.a */
public abstract class C51607a {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f128895b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C51607a.class), "valueAnimator", "getValueAnimator()Landroid/animation/ValueAnimator;"))};

    /* renamed from: i */
    public static final C51610b f128896i = new C51610b(null);

    /* renamed from: a */
    private C51596a f128897a;

    /* renamed from: c */
    public final LinkedList<C51596a> f128898c = new LinkedList<>();

    /* renamed from: d */
    public final ArrayList<C51596a> f128899d = new ArrayList<>();

    /* renamed from: e */
    public final C51594a f128900e = new C51594a();

    /* renamed from: f */
    public float f128901f;

    /* renamed from: g */
    public C51609a f128902g;

    /* renamed from: h */
    public final View f128903h;

    /* renamed from: j */
    private final C52668f f128904j = C52732g.m112285a(new C51612d(this));

    /* renamed from: com.ss.ugc.live.barrage.b.a$a */
    public interface C51609a {
        /* renamed from: a */
        void mo12308a(C51596a aVar);
    }

    /* renamed from: com.ss.ugc.live.barrage.b.a$b */
    public static final class C51610b {
        private C51610b() {
        }

        public /* synthetic */ C51610b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.live.barrage.b.a$c */
    static final class C51611c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C51607a f128906a;

        C51611c(C51607a aVar) {
            this.f128906a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f = this.f128906a.f128901f;
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f128906a.f128901f = floatValue;
                float f2 = (floatValue - f) * 1000.0f;
                if (floatValue < f) {
                    f2 = ((1.0f - f) + floatValue) * 1000.0f;
                }
                this.f128906a.mo10735a(this.f128906a.f128900e, f2);
                if (this.f128906a.f128898c.isEmpty() && this.f128906a.f128899d.isEmpty() && this.f128906a.f128900e.isEmpty()) {
                    this.f128906a.mo105551d();
                }
                this.f128906a.mo105553f();
                if (C52711k.m112239a((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
                    this.f128906a.f128903h.invalidate();
                } else {
                    this.f128906a.f128903h.postInvalidate();
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    /* renamed from: com.ss.ugc.live.barrage.b.a$d */
    static final class C51612d extends C52712l implements C52670a<ValueAnimator> {

        /* renamed from: a */
        final /* synthetic */ C51607a f128907a;

        C51612d(C51607a aVar) {
            this.f128907a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C51607a aVar = this.f128907a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            C52711k.m112236a((Object) ofFloat, "animator");
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(1000);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new C51611c(aVar));
            return ofFloat;
        }
    }

    /* renamed from: g */
    private final ValueAnimator m110768g() {
        return (ValueAnimator) this.f128904j.getValue();
    }

    /* renamed from: a */
    public abstract void mo10734a(C51596a aVar);

    /* renamed from: a */
    public abstract void mo10735a(C51594a aVar, float f);

    /* renamed from: a */
    public void mo10732a() {
        this.f128898c.clear();
        this.f128899d.clear();
        this.f128900e.clear();
    }

    /* renamed from: b */
    public int mo10736b() {
        return this.f128900e.size() + this.f128899d.size() + this.f128898c.size();
    }

    /* renamed from: c */
    public final void mo105550c() {
        if (!m110768g().isRunning()) {
            m110768g().start();
        }
        mo105553f();
    }

    /* renamed from: d */
    public final void mo105551d() {
        if (m110768g().isRunning()) {
            m110768g().cancel();
        }
    }

    /* renamed from: e */
    public final C51596a mo105552e() {
        C51596a aVar;
        C51596a aVar2 = null;
        try {
            if (this.f128899d.isEmpty()) {
                return null;
            }
            Iterator it = this.f128899d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (C51596a) it.next();
                if (aVar.f128879i) {
                    break;
                }
            }
            Collection collection = this.f128899d;
            if (collection != null) {
                C52731z.m112266b(collection).remove(aVar);
                aVar2 = aVar;
                return aVar2;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final void mo105553f() {
        while (this.f128899d.size() <= 30 && this.f128898c.size() != 0) {
            C51596a aVar = (C51596a) this.f128898c.removeFirst();
            aVar.mo105539a((C51597a) C51600c.f128885a);
            if (aVar.f128880j) {
                this.f128899d.add(0, aVar);
            } else {
                this.f128899d.add(aVar);
            }
        }
    }

    public C51607a(View view) {
        C52711k.m112240b(view, "barrageView");
        this.f128903h = view;
        this.f128900e.setOnChangeListener(new C51595a(this) {

            /* renamed from: a */
            final /* synthetic */ C51607a f128905a;

            {
                this.f128905a = r1;
            }

            /* renamed from: a */
            public final void mo105537a(boolean z, C51596a aVar) {
                C52711k.m112240b(aVar, "barrage");
                if (!z) {
                    C51609a aVar2 = this.f128905a.f128902g;
                    if (aVar2 != null) {
                        aVar2.mo12308a(aVar);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo105548a(C51609a aVar) {
        C52711k.m112240b(aVar, "barrageCallback");
        this.f128902g = aVar;
    }

    /* renamed from: a */
    public final boolean mo105549a(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                Iterator it = this.f128900e.iterator();
                while (it.hasNext()) {
                    C51596a aVar = (C51596a) it.next();
                    if (aVar.f128881k.contains(motionEvent.getX(), motionEvent.getY()) && aVar.mo105540a(motionEvent)) {
                        this.f128897a = aVar;
                        return true;
                    }
                }
                break;
            case 1:
                C51596a aVar2 = this.f128897a;
                if (aVar2 != null) {
                    RectF rectF = aVar2.f128881k;
                    if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        C51596a aVar3 = this.f128897a;
                        if (aVar3 != null) {
                            return aVar3.mo105540a(motionEvent);
                        }
                        return false;
                    }
                }
                break;
            case 2:
            case 3:
                if (this.f128897a != null) {
                    C51596a aVar4 = this.f128897a;
                    if (aVar4 != null) {
                        RectF rectF2 = aVar4.f128881k;
                        if (rectF2 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                            C51596a aVar5 = this.f128897a;
                            if (aVar5 != null) {
                                return aVar5.mo105540a(motionEvent);
                            }
                            return false;
                        }
                    }
                }
                break;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo105547a(C51596a aVar, boolean z) {
        C52711k.m112240b(aVar, "barrage");
        if (z) {
            this.f128898c.add(0, aVar);
        } else {
            this.f128898c.add(aVar);
        }
        aVar.mo105539a((C51597a) C51599b.f128884a);
        mo10734a(aVar);
    }
}
