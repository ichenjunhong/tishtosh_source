package com.facebook.drawee.p930a.p931a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.p920d.C13682e;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.p930a.p931a.p932a.C13758a;
import com.facebook.drawee.p930a.p931a.p933b.C13760a;
import com.facebook.drawee.p930a.p931a.p933b.C13764b;
import com.facebook.drawee.p930a.p931a.p933b.C13768f;
import com.facebook.drawee.p930a.p931a.p933b.C13769g;
import com.facebook.drawee.p930a.p931a.p933b.C13770h;
import com.facebook.drawee.p935b.C13777a;
import com.facebook.drawee.p936c.C13783a;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p937d.C13794a;
import com.facebook.drawee.p937d.p938a.C13795a;
import com.facebook.drawee.p939e.C13815p;
import com.facebook.drawee.p939e.C13816q;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p942h.C13843b;
import com.facebook.imagepipeline.p964d.C13986p;
import com.facebook.imagepipeline.p968h.C14038a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p929d.C13745c;
import com.facebook.p945f.p946a.C13856a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.drawee.a.a.d */
public class C13772d extends C13783a<C13715a<C14042c>, C14045f> {

    /* renamed from: r */
    private static final Class<?> f35836r = C13772d.class;

    /* renamed from: a */
    public final Resources f35837a;

    /* renamed from: b */
    public C13619c f35838b;

    /* renamed from: c */
    public C13691k<C13745c<C13715a<C14042c>>> f35839c;

    /* renamed from: d */
    public boolean f35840d;

    /* renamed from: e */
    public C13682e<C14038a> f35841e;

    /* renamed from: s */
    private final C14038a f35842s;

    /* renamed from: t */
    private final C13682e<C14038a> f35843t;

    /* renamed from: u */
    private final C13986p<C13619c, C14042c> f35844u;

    /* renamed from: v */
    private C13769g f35845v;

    /* renamed from: w */
    private Set<C14050c> f35846w;

    /* renamed from: x */
    private C13764b f35847x;

    /* renamed from: y */
    private C13758a f35848y;

    /* renamed from: a */
    public final /* synthetic */ void mo25711a(Object obj) {
        C13715a.m27752c((C13715a) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25712a(String str, Object obj) {
        super.mo25712a(str, (C13715a) obj);
        synchronized (this) {
            if (this.f35847x != null) {
                this.f35847x.mo25695a(str, 5, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo25708a(C13768f fVar) {
        if (this.f35845v != null) {
            C13769g gVar = this.f35845v;
            if (gVar.f35803b != null) {
                gVar.f35803b.clear();
            }
            gVar.mo25700a(false);
            C13770h hVar = gVar.f35802a;
            hVar.f35813b = null;
            hVar.f35814c = null;
            hVar.f35815d = null;
            hVar.f35816e = null;
            hVar.f35817f = -1;
            hVar.f35819h = -1;
            hVar.f35820i = -1;
            hVar.f35821j = -1;
            hVar.f35822k = -1;
            hVar.f35823l = -1;
            hVar.f35824m = 1;
            hVar.f35825n = false;
            hVar.f35826o = -1;
            hVar.f35827p = -1;
            hVar.f35828q = -1;
            hVar.f35829r = -1;
            hVar.f35830s = -1;
            hVar.f35831t = -1;
        }
        if (fVar != null) {
            if (this.f35845v == null) {
                this.f35845v = new C13769g(AwakeTimeSinceBootClock.get(), this);
            }
            C13769g gVar2 = this.f35845v;
            if (fVar != null) {
                if (gVar2.f35803b == null) {
                    gVar2.f35803b = new LinkedList();
                }
                gVar2.f35803b.add(fVar);
            }
            this.f35845v.mo25700a(true);
        }
    }

    public String toString() {
        return C13685h.m27644a(this).mo25581a("super", (Object) super.toString()).mo25581a("dataSourceSupplier", (Object) this.f35839c).toString();
    }

    /* renamed from: b */
    public final C13745c<C13715a<C14042c>> mo25714b() {
        if (C14237b.m29187b()) {
            C14237b.m29186a("PipelineDraweeController#getDataSource");
        }
        if (C13697a.m27683a(2)) {
            C13697a.m27673a(f35836r, "controller %x: getDataSource", (Object) Integer.valueOf(System.identityHashCode(this)));
        }
        C13745c<C13715a<C14042c>> cVar = (C13745c) this.f35839c.mo23157b();
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C13715a<C14042c> mo25717c() {
        if (C14237b.m29187b()) {
            C14237b.m29186a("PipelineDraweeController#getCachedImage");
        }
        try {
            if (this.f35844u != null) {
                if (this.f35838b != null) {
                    C13715a<C14042c> a = this.f35844u.mo26159a(this.f35838b);
                    if (a == null || ((C14042c) a.mo25630a()).mo26258e().mo26276c()) {
                        if (C14237b.m29187b()) {
                            C14237b.m29185a();
                        }
                        return a;
                    }
                    a.close();
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                    return null;
                }
            }
            return null;
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.imagepipeline.p971k.C14050c mo25704a() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            com.facebook.drawee.a.a.b.b r1 = r3.f35847x     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x000f
            com.facebook.drawee.a.a.b.c r0 = new com.facebook.drawee.a.a.b.c     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f35888k     // Catch:{ all -> 0x0025 }
            com.facebook.drawee.a.a.b.b r2 = r3.f35847x     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
        L_0x000f:
            java.util.Set<com.facebook.imagepipeline.k.c> r1 = r3.f35846w     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            com.facebook.imagepipeline.k.b r1 = new com.facebook.imagepipeline.k.b     // Catch:{ all -> 0x0025 }
            java.util.Set<com.facebook.imagepipeline.k.c> r2 = r3.f35846w     // Catch:{ all -> 0x0025 }
            r1.<init>(r2)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0021
            java.util.List<com.facebook.imagepipeline.k.c> r2 = r1.f36715a     // Catch:{ all -> 0x0025 }
            r2.add(r0)     // Catch:{ all -> 0x0025 }
        L_0x0021:
            monitor-exit(r3)
            return r1
        L_0x0023:
            monitor-exit(r3)
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.p930a.p931a.C13772d.mo25704a():com.facebook.imagepipeline.k.c");
    }

    /* renamed from: a */
    public final void mo25709a(C13843b bVar) {
        super.mo25709a(bVar);
        m27878a((C14042c) null);
    }

    /* renamed from: a */
    public final void mo25705a(Drawable drawable) {
        if (drawable instanceof C13856a) {
            ((C13856a) drawable).mo25995a();
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo25718c(Object obj) {
        C13715a aVar = (C13715a) obj;
        C13689i.m27657b(C13715a.m27750a(aVar));
        return (C14045f) aVar.mo25630a();
    }

    /* renamed from: a */
    public final synchronized void mo25710a(C14050c cVar) {
        if (this.f35846w == null) {
            this.f35846w = new HashSet();
        }
        this.f35846w.add(cVar);
    }

    /* renamed from: b */
    public final /* synthetic */ int mo25713b(Object obj) {
        C13715a aVar = (C13715a) obj;
        int i = 0;
        if (aVar != null) {
            if (!aVar.mo25635d()) {
                return 0;
            }
            i = System.identityHashCode(aVar.f35693a.mo25637a());
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Drawable mo25719d(C13715a<C14042c> aVar) {
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("PipelineDraweeController#createDrawable");
            }
            C13689i.m27657b(C13715a.m27750a(aVar));
            C14042c cVar = (C14042c) aVar.mo25630a();
            m27878a(cVar);
            Drawable a = m27876a(this.f35841e, cVar);
            if (a != null) {
                return a;
            }
            Drawable a2 = m27876a(this.f35843t, cVar);
            if (a2 != null) {
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
                return a2;
            }
            Drawable b = this.f35842s.mo25693b(cVar);
            if (b != null) {
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
                return b;
            }
            StringBuilder sb = new StringBuilder("Unrecognized image class: ");
            sb.append(cVar);
            throw new UnsupportedOperationException(sb.toString());
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo25715b(C13764b bVar) {
        if (this.f35847x instanceof C13760a) {
            ((C13760a) this.f35847x).mo25697b(bVar);
        } else if (this.f35847x != null) {
            this.f35847x = new C13760a(this.f35847x, bVar);
        } else {
            this.f35847x = bVar;
        }
    }

    /* renamed from: a */
    private void m27878a(C14042c cVar) {
        if (this.f35840d) {
            if (this.f35887j == null) {
                C13794a aVar = new C13794a();
                C13795a aVar2 = new C13795a(aVar);
                this.f35848y = new C13758a();
                mo25736a((C13791d<? super INFO>) aVar2);
                mo25742b((Drawable) aVar);
            }
            if (this.f35847x == null) {
                mo25707a((C13764b) this.f35848y);
            }
            if (this.f35887j instanceof C13794a) {
                C13794a aVar3 = (C13794a) this.f35887j;
                aVar3.mo25771a(this.f35888k);
                C13843b e = mo25745e();
                C13818b bVar = null;
                if (e != null) {
                    C13815p a = C13816q.m28034a(e.mo25888a());
                    if (a != null) {
                        bVar = a.f36054a;
                    }
                }
                aVar3.f35931c = bVar;
                aVar3.mo25772b(this.f35848y.mo25694a());
                if (cVar != null) {
                    aVar3.mo25769a(cVar.getWidth(), cVar.getHeight());
                    aVar3.f35929a = cVar.mo26251b();
                    return;
                }
                aVar3.mo25768a();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo25716b(C14050c cVar) {
        if (this.f35846w != null) {
            this.f35846w.remove(cVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo25707a(C13764b bVar) {
        if (this.f35847x instanceof C13760a) {
            ((C13760a) this.f35847x).mo25696a(bVar);
        } else if (this.f35847x != null) {
            this.f35847x = new C13760a(this.f35847x, bVar);
        } else {
            this.f35847x = bVar;
        }
    }

    /* renamed from: a */
    private static Drawable m27876a(C13682e<C14038a> eVar, C14042c cVar) {
        if (eVar == null) {
            return null;
        }
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            C14038a aVar = (C14038a) it.next();
            if (aVar.mo25692a(cVar)) {
                Drawable b = aVar.mo25693b(cVar);
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    public C13772d(Resources resources, C13777a aVar, C14038a aVar2, Executor executor, C13986p<C13619c, C14042c> pVar, C13682e<C14038a> eVar) {
        super(aVar, executor, null, null);
        this.f35837a = resources;
        this.f35842s = new C13757a(resources, aVar2);
        this.f35843t = eVar;
        this.f35844u = pVar;
    }

    /* renamed from: a */
    public final void mo25706a(C13691k<C13745c<C13715a<C14042c>>> kVar, String str, C13619c cVar, Object obj, C13682e<C14038a> eVar, C13764b bVar) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("PipelineDraweeController#initialize");
        }
        super.mo25744b(str, obj);
        this.f35894q = false;
        this.f35839c = kVar;
        m27878a((C14042c) null);
        this.f35838b = cVar;
        this.f35841e = eVar;
        synchronized (this) {
            this.f35847x = null;
        }
        m27878a((C14042c) null);
        mo25707a(bVar);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }
}
