package com.facebook.drawee.p936c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.drawee.p935b.C13777a;
import com.facebook.drawee.p935b.C13777a.C13779a;
import com.facebook.drawee.p935b.C13780b;
import com.facebook.drawee.p935b.C13780b.C13781a;
import com.facebook.drawee.p935b.C13782c;
import com.facebook.drawee.p941g.C13840a;
import com.facebook.drawee.p941g.C13840a.C13841a;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.p942h.C13843b;
import com.facebook.drawee.p942h.C13844c;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.p929d.C13744b;
import com.facebook.p929d.C13745c;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.drawee.c.a */
public abstract class C13783a<T, INFO> implements C13779a, C13841a, C13842a {

    /* renamed from: a */
    private static final Class<?> f35878a = C13783a.class;

    /* renamed from: b */
    private final C13780b f35879b = C13780b.m27909a();

    /* renamed from: c */
    private final C13777a f35880c;

    /* renamed from: d */
    private final Executor f35881d;

    /* renamed from: e */
    private C13791d<INFO> f35882e;

    /* renamed from: f */
    C13782c f35883f;

    /* renamed from: g */
    public C13840a f35884g;

    /* renamed from: h */
    public C13792e f35885h;

    /* renamed from: i */
    C13844c f35886i;

    /* renamed from: j */
    public Drawable f35887j;

    /* renamed from: k */
    public String f35888k;

    /* renamed from: l */
    public Object f35889l;

    /* renamed from: m */
    public boolean f35890m;

    /* renamed from: n */
    public boolean f35891n;

    /* renamed from: o */
    public boolean f35892o;

    /* renamed from: p */
    String f35893p;

    /* renamed from: q */
    protected boolean f35894q = true;

    /* renamed from: r */
    private boolean f35895r;

    /* renamed from: s */
    private boolean f35896s;

    /* renamed from: t */
    private C13745c<T> f35897t;

    /* renamed from: u */
    private T f35898u;

    /* renamed from: v */
    private Drawable f35899v;

    /* renamed from: com.facebook.drawee.c.a$a */
    static class C13785a<INFO> extends C13793f<INFO> {
        private C13785a() {
        }

        /* renamed from: a */
        public static <INFO> C13785a<INFO> m27944a(C13791d<? super INFO> dVar, C13791d<? super INFO> dVar2) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("AbstractDraweeController#createInternal");
            }
            C13785a<INFO> aVar = new C13785a<>();
            aVar.mo25766a(dVar);
            aVar.mo25766a(dVar2);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            return aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25705a(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25711a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25712a(String str, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C13745c<T> mo25714b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public T mo25717c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract INFO mo25718c(T t);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Drawable mo25719d(T t);

    /* renamed from: e */
    public final C13843b mo25745e() {
        return this.f35886i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo25741a(String str, C13745c<T> cVar) {
        if (cVar == null && this.f35897t == null) {
            return true;
        }
        if (!str.equals(this.f35888k) || cVar != this.f35897t || !this.f35895r) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private C13791d<INFO> m27917j() {
        if (this.f35882e == null) {
            return C13790c.getNoOpListener();
        }
        return this.f35882e;
    }

    /* renamed from: i */
    public final Animatable mo25749i() {
        if (this.f35899v instanceof Animatable) {
            return (Animatable) this.f35899v;
        }
        return null;
    }

    /* renamed from: k */
    private boolean m27918k() {
        if (!this.f35891n || this.f35883f == null || !this.f35883f.mo25735c()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo25730d() {
        this.f35879b.mo25731a(C13781a.ON_RELEASE_CONTROLLER);
        if (this.f35883f != null) {
            this.f35883f.mo25734b();
        }
        if (this.f35884g != null) {
            this.f35884g.mo25944b();
        }
        if (this.f35886i != null) {
            this.f35886i.mo25901b();
        }
        mo25704a();
    }

    /* renamed from: h */
    public final boolean mo25748h() {
        if (C13697a.m27683a(2)) {
            C13697a.m27674a(f35878a, "controller %x %s: onClick", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.f35888k);
        }
        if (!m27918k()) {
            return false;
        }
        this.f35883f.f35877c++;
        this.f35886i.mo25901b();
        m27919l();
        return true;
    }

    public String toString() {
        return C13685h.m27644a(this).mo25582a("isAttached", this.f35890m).mo25582a("isRequestSubmitted", this.f35895r).mo25582a("hasFetchFailed", this.f35891n).mo25580a("fetchedImage", mo25713b(this.f35898u)).mo25581a("events", (Object) this.f35879b.toString()).toString();
    }

    /* renamed from: a */
    private void mo25704a() {
        boolean z = this.f35895r;
        this.f35895r = false;
        this.f35891n = false;
        if (this.f35897t != null) {
            this.f35897t.mo25677g();
            this.f35897t = null;
        }
        if (this.f35899v != null) {
            mo25705a(this.f35899v);
        }
        if (this.f35893p != null) {
            this.f35893p = null;
        }
        this.f35899v = null;
        if (this.f35898u != null) {
            m27915c("release", this.f35898u);
            mo25711a(this.f35898u);
            this.f35898u = null;
        }
        if (z) {
            m27917j().onRelease(this.f35888k);
        }
    }

    /* renamed from: f */
    public final void mo25746f() {
        String str;
        if (C14237b.m29187b()) {
            C14237b.m29186a("AbstractDraweeController#onAttach");
        }
        if (C13697a.m27683a(2)) {
            Class<?> cls = f35878a;
            String str2 = "controller %x %s: onAttach: %s";
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str3 = this.f35888k;
            if (this.f35895r) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            C13697a.m27675a(cls, str2, valueOf, str3, str);
        }
        this.f35879b.mo25731a(C13781a.ON_ATTACH_CONTROLLER);
        C13689i.m27652a(this.f35886i);
        this.f35880c.mo25728a(this);
        this.f35890m = true;
        if (!this.f35895r) {
            m27919l();
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    /* renamed from: g */
    public final void mo25747g() {
        if (C14237b.m29187b()) {
            C14237b.m29186a("AbstractDraweeController#onDetach");
        }
        if (C13697a.m27683a(2)) {
            C13697a.m27674a(f35878a, "controller %x %s: onDetach", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.f35888k);
        }
        this.f35879b.mo25731a(C13781a.ON_DETACH_CONTROLLER);
        this.f35890m = false;
        C13777a aVar = this.f35880c;
        C13777a.m27906b();
        if (aVar.f35867a.add(this) && aVar.f35867a.size() == 1) {
            aVar.f35868b.post(aVar.f35869c);
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    /* renamed from: l */
    private void m27919l() {
        if (C14237b.m29187b()) {
            C14237b.m29186a("AbstractDraweeController#submitRequest");
        }
        Object c = mo25717c();
        if (c != null) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("AbstractDraweeController#submitRequest->cache");
            }
            this.f35897t = null;
            this.f35895r = true;
            this.f35891n = false;
            this.f35879b.mo25731a(C13781a.ON_SUBMIT_CACHE_HIT);
            m27917j().onSubmit(this.f35888k, this.f35889l);
            mo25712a(this.f35888k, (T) c);
            mo25737a(this.f35888k, this.f35897t, c, 1.0f, true, true, true);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            return;
        }
        this.f35879b.mo25731a(C13781a.ON_DATASOURCE_SUBMIT);
        m27917j().onSubmit(this.f35888k, this.f35889l);
        this.f35886i.mo25889a(0.0f, true);
        this.f35895r = true;
        this.f35891n = false;
        this.f35897t = mo25714b();
        if (C13697a.m27683a(2)) {
            C13697a.m27675a(f35878a, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f35888k, Integer.valueOf(System.identityHashCode(this.f35897t)));
        }
        final String str = this.f35888k;
        final boolean c2 = this.f35897t.mo25673c();
        this.f35897t.mo25666a(new C13744b<T>() {
            public final void onFailureImpl(C13745c<T> cVar) {
                C13783a.this.mo25738a(str, cVar, cVar.mo25675e(), true);
            }

            public final void onNewResultImpl(C13745c<T> cVar) {
                boolean b = cVar.mo25672b();
                float f = cVar.mo25676f();
                Object d = cVar.mo25674d();
                if (d != null) {
                    C13783a.this.mo25737a(str, cVar, d, f, b, c2, false);
                    return;
                }
                if (b) {
                    C13783a.this.mo25738a(str, cVar, new NullPointerException(), true);
                }
            }

            public final void onProgressUpdate(C13745c<T> cVar) {
                boolean b = cVar.mo25672b();
                float f = cVar.mo25676f();
                C13783a aVar = C13783a.this;
                if (!aVar.mo25741a(str, cVar)) {
                    aVar.mo25739a("ignore_old_datasource @ onProgress", (Throwable) null);
                    cVar.mo25677g();
                    return;
                }
                if (!b) {
                    aVar.f35886i.mo25889a(f, false);
                }
            }
        }, this.f35881d);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo25713b(T t) {
        return System.identityHashCode(t);
    }

    /* renamed from: e */
    private static String m27916e(T t) {
        if (t != null) {
            return t.getClass().getSimpleName();
        }
        return "<null>";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25742b(Drawable drawable) {
        this.f35887j = drawable;
        if (this.f35886i != null) {
            this.f35886i.mo25895a(this.f35887j);
        }
    }

    /* renamed from: b */
    public final void mo25743b(C13791d<? super INFO> dVar) {
        C13689i.m27652a(dVar);
        if (this.f35882e instanceof C13785a) {
            ((C13785a) this.f35882e).mo25767b(dVar);
            return;
        }
        if (this.f35882e == dVar) {
            this.f35882e = null;
        }
    }

    /* renamed from: a */
    public final void mo25736a(C13791d<? super INFO> dVar) {
        C13689i.m27652a(dVar);
        if (this.f35882e instanceof C13785a) {
            ((C13785a) this.f35882e).mo25766a(dVar);
        } else if (this.f35882e != null) {
            this.f35882e = C13785a.m27944a(this.f35882e, dVar);
        } else {
            this.f35882e = dVar;
        }
    }

    /* renamed from: a */
    public void mo25709a(C13843b bVar) {
        C13781a aVar;
        if (C13697a.m27683a(2)) {
            C13697a.m27675a(f35878a, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f35888k, bVar);
        }
        C13780b bVar2 = this.f35879b;
        if (bVar != null) {
            aVar = C13781a.ON_SET_HIERARCHY;
        } else {
            aVar = C13781a.ON_CLEAR_HIERARCHY;
        }
        bVar2.mo25731a(aVar);
        if (this.f35895r) {
            this.f35880c.mo25728a(this);
            mo25730d();
        }
        if (this.f35886i != null) {
            this.f35886i.mo25895a((Drawable) null);
            this.f35886i = null;
        }
        if (bVar != null) {
            C13689i.m27655a(bVar instanceof C13844c);
            this.f35886i = (C13844c) bVar;
            this.f35886i.mo25895a(this.f35887j);
        }
    }

    /* renamed from: a */
    public final boolean mo25740a(MotionEvent motionEvent) {
        if (C13697a.m27683a(2)) {
            C13697a.m27675a(f35878a, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f35888k, motionEvent);
        }
        if (this.f35884g == null) {
            return false;
        }
        if (!this.f35884g.f36120c && !m27918k()) {
            return false;
        }
        C13840a aVar = this.f35884g;
        switch (motionEvent.getAction()) {
            case 0:
                aVar.f36120c = true;
                aVar.f36121d = true;
                aVar.f36122e = motionEvent.getEventTime();
                aVar.f36123f = motionEvent.getX();
                aVar.f36124g = motionEvent.getY();
                break;
            case 1:
                aVar.f36120c = false;
                if (Math.abs(motionEvent.getX() - aVar.f36123f) > aVar.f36119b || Math.abs(motionEvent.getY() - aVar.f36124g) > aVar.f36119b) {
                    aVar.f36121d = false;
                }
                if (aVar.f36121d && motionEvent.getEventTime() - aVar.f36122e <= ((long) ViewConfiguration.getLongPressTimeout()) && aVar.f36118a != null) {
                    aVar.f36118a.mo25748h();
                    break;
                }
            case 2:
                if (Math.abs(motionEvent.getX() - aVar.f36123f) > aVar.f36119b || Math.abs(motionEvent.getY() - aVar.f36124g) > aVar.f36119b) {
                    aVar.f36121d = false;
                    break;
                }
            case 3:
                aVar.f36120c = false;
                break;
        }
        aVar.f36121d = false;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25739a(String str, Throwable th) {
        if (C13697a.m27683a(2)) {
            C13697a.m27676a(f35878a, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f35888k, str, th);
        }
    }

    /* renamed from: c */
    private void m27915c(String str, T t) {
        if (C13697a.m27683a(2)) {
            C13697a.m27678a(f35878a, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f35888k, str, m27916e(t), Integer.valueOf(mo25713b(t)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo25744b(String str, Object obj) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("AbstractDraweeController#init");
        }
        this.f35879b.mo25731a(C13781a.ON_INIT_CONTROLLER);
        if (!this.f35894q && this.f35880c != null) {
            this.f35880c.mo25728a(this);
        }
        this.f35890m = false;
        this.f35896s = false;
        mo25704a();
        this.f35892o = false;
        if (this.f35883f != null) {
            this.f35883f.mo25733a();
        }
        if (this.f35884g != null) {
            this.f35884g.mo25943a();
            this.f35884g.f36118a = this;
        }
        if (this.f35882e instanceof C13785a) {
            ((C13785a) this.f35882e).mo25765a();
        } else {
            this.f35882e = null;
        }
        this.f35885h = null;
        if (this.f35886i != null) {
            this.f35886i.mo25901b();
            this.f35886i.mo25895a((Drawable) null);
            this.f35886i = null;
        }
        this.f35887j = null;
        if (C13697a.m27683a(2)) {
            C13697a.m27675a(f35878a, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f35888k, str);
        }
        this.f35888k = str;
        this.f35889l = obj;
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    public C13783a(C13777a aVar, Executor executor, String str, Object obj) {
        this.f35880c = aVar;
        this.f35881d = executor;
        mo25744b(null, null);
    }

    /* renamed from: a */
    public final void mo25738a(String str, C13745c<T> cVar, Throwable th, boolean z) {
        C13781a aVar;
        if (C14237b.m29187b()) {
            C14237b.m29186a("AbstractDraweeController#onFailureInternal");
        }
        if (!mo25741a(str, cVar)) {
            mo25739a("ignore_old_datasource @ onFailure", th);
            cVar.mo25677g();
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            return;
        }
        C13780b bVar = this.f35879b;
        if (z) {
            aVar = C13781a.ON_DATASOURCE_FAILURE;
        } else {
            aVar = C13781a.ON_DATASOURCE_FAILURE_INT;
        }
        bVar.mo25731a(aVar);
        if (z) {
            mo25739a("final_failed @ onFailure", th);
            this.f35897t = null;
            this.f35891n = true;
            if (this.f35892o && this.f35899v != null) {
                this.f35886i.mo25896a(this.f35899v, 1.0f, true);
            } else if (m27918k()) {
                this.f35886i.mo25906b(th);
            } else {
                this.f35886i.mo25900a(th);
            }
            m27917j().onFailure(this.f35888k, th);
        } else {
            mo25739a("intermediate_failed @ onFailure", th);
            m27917j().onIntermediateImageFailed(this.f35888k, th);
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    /* renamed from: a */
    public final void mo25737a(String str, C13745c<T> cVar, T t, float f, boolean z, boolean z2, boolean z3) {
        C13781a aVar;
        Drawable d;
        T t2;
        Drawable drawable;
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("AbstractDraweeController#onNewResultInternal");
            }
            if (!mo25741a(str, cVar)) {
                m27915c("ignore_old_datasource @ onNewResult", t);
                mo25711a(t);
                cVar.mo25677g();
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
                return;
            }
            C13780b bVar = this.f35879b;
            if (z) {
                aVar = C13781a.ON_DATASOURCE_RESULT;
            } else {
                aVar = C13781a.ON_DATASOURCE_RESULT_INT;
            }
            bVar.mo25731a(aVar);
            try {
                d = mo25719d(t);
                t2 = this.f35898u;
                drawable = this.f35899v;
                this.f35898u = t;
                this.f35899v = d;
                if (z) {
                    m27915c("set_final_result @ onNewResult", t);
                    this.f35897t = null;
                    this.f35886i.mo25896a(d, 1.0f, z2);
                    m27917j().onFinalImageSet(str, mo25718c(t), mo25749i());
                } else if (z3) {
                    m27915c("set_temporary_result @ onNewResult", t);
                    this.f35886i.mo25896a(d, 1.0f, z2);
                    m27917j().onFinalImageSet(str, mo25718c(t), mo25749i());
                } else {
                    m27915c("set_intermediate_result @ onNewResult", t);
                    this.f35886i.mo25896a(d, f, z2);
                    m27917j().onIntermediateImageSet(str, mo25718c(t));
                }
                if (!(drawable == null || drawable == d)) {
                    mo25705a(drawable);
                }
                if (!(t2 == null || t2 == t)) {
                    m27915c("release_previous_result @ onNewResult", t2);
                    mo25711a(t2);
                }
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
            } catch (Exception e) {
                m27915c("drawable_failed @ onNewResult", t);
                mo25711a(t);
                mo25738a(str, cVar, e, z);
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
            }
        } catch (Throwable th) {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            throw th;
        }
    }
}
