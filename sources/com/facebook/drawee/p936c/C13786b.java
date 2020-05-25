package com.facebook.drawee.p936c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import com.facebook.drawee.p935b.C13782c;
import com.facebook.drawee.p936c.C13786b;
import com.facebook.drawee.p941g.C13840a;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.p942h.C13845d;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.p929d.C13745c;
import com.facebook.p929d.C13749f;
import com.facebook.p929d.C13753g;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.drawee.c.b */
public abstract class C13786b<BUILDER extends C13786b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements C13845d {

    /* renamed from: n */
    protected static final AtomicLong f35903n = new AtomicLong();

    /* renamed from: o */
    private static final C13791d<Object> f35904o = new C13790c<Object>() {
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    };

    /* renamed from: p */
    private static final NullPointerException f35905p = new NullPointerException("No image request was specified!");

    /* renamed from: a */
    public final Context f35906a;

    /* renamed from: b */
    public Object f35907b;

    /* renamed from: c */
    public REQUEST f35908c;

    /* renamed from: d */
    public REQUEST f35909d;

    /* renamed from: e */
    public REQUEST[] f35910e;

    /* renamed from: f */
    public C13691k<C13745c<IMAGE>> f35911f;

    /* renamed from: g */
    public C13791d<? super INFO> f35912g;

    /* renamed from: h */
    public C13792e f35913h;

    /* renamed from: i */
    public boolean f35914i;

    /* renamed from: j */
    public boolean f35915j;

    /* renamed from: k */
    public boolean f35916k;

    /* renamed from: l */
    public String f35917l;

    /* renamed from: m */
    public C13842a f35918m;

    /* renamed from: q */
    private final Set<C13791d> f35919q;

    /* renamed from: r */
    private boolean f35920r;

    /* renamed from: com.facebook.drawee.c.b$a */
    public enum C13789a {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* renamed from: f */
    private BUILDER m27949f() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13745c<IMAGE> mo25721a(C13842a aVar, String str, REQUEST request, Object obj, C13789a aVar2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13783a mo25724a();

    /* renamed from: a */
    public final BUILDER mo25755a(REQUEST[] requestArr) {
        return m27947a(requestArr, true);
    }

    /* renamed from: b */
    public final BUILDER mo25756b() {
        m27948e();
        return m27949f();
    }

    /* renamed from: e */
    private void m27948e() {
        this.f35907b = null;
        this.f35908c = null;
        this.f35909d = null;
        this.f35910e = null;
        this.f35920r = true;
        this.f35912g = null;
        this.f35913h = null;
        this.f35914i = false;
        this.f35915j = false;
        this.f35918m = null;
        this.f35917l = null;
    }

    /* renamed from: c */
    public final C13783a mo25763d() {
        boolean z;
        boolean z2 = false;
        if (this.f35910e == null || this.f35908c == null) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27658b(z, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f35911f == null || (this.f35910e == null && this.f35908c == null && this.f35909d == null)) {
            z2 = true;
        }
        C13689i.m27658b(z2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        if (this.f35908c == null && this.f35910e == null && this.f35909d != null) {
            this.f35908c = this.f35909d;
            this.f35909d = null;
        }
        if (C14237b.m29187b()) {
            C14237b.m29186a("AbstractDraweeControllerBuilder#buildController");
        }
        C13783a a = mo25724a();
        a.f35892o = this.f35916k;
        a.f35893p = this.f35917l;
        a.f35885h = this.f35913h;
        if (this.f35914i) {
            if (a.f35883f == null) {
                a.f35883f = new C13782c();
            }
            a.f35883f.f35875a = this.f35914i;
            if (a.f35884g == null) {
                a.f35884g = new C13840a(this.f35906a);
                if (a.f35884g != null) {
                    a.f35884g.f36118a = a;
                }
            }
        }
        if (this.f35919q != null) {
            for (C13791d a2 : this.f35919q) {
                a.mo25736a(a2);
            }
        }
        if (this.f35912g != null) {
            a.mo25736a(this.f35912g);
        }
        if (this.f35915j) {
            a.mo25736a(f35904o);
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return a;
    }

    /* renamed from: c */
    public final BUILDER mo25761c(REQUEST request) {
        this.f35909d = request;
        return m27949f();
    }

    /* renamed from: b */
    public final BUILDER mo25757b(REQUEST request) {
        this.f35908c = request;
        return m27949f();
    }

    /* renamed from: c */
    public final BUILDER mo25762c(boolean z) {
        this.f35915j = z;
        return m27949f();
    }

    /* renamed from: b */
    public final BUILDER mo25758b(boolean z) {
        this.f35916k = z;
        return m27949f();
    }

    /* renamed from: a */
    public final BUILDER mo25751a(C13791d<? super INFO> dVar) {
        this.f35912g = dVar;
        return m27949f();
    }

    /* renamed from: a */
    public final BUILDER mo25759b(C13842a aVar) {
        this.f35918m = aVar;
        return m27949f();
    }

    /* renamed from: a */
    public final BUILDER mo25753a(Object obj) {
        this.f35907b = obj;
        return m27949f();
    }

    /* renamed from: a */
    public final BUILDER mo25754a(boolean z) {
        this.f35914i = z;
        return m27949f();
    }

    protected C13786b(Context context, Set<C13791d> set) {
        this.f35906a = context;
        this.f35919q = set;
        m27948e();
    }

    /* renamed from: a */
    private BUILDER m27947a(REQUEST[] requestArr, boolean z) {
        boolean z2;
        if (requestArr == null || requestArr.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13689i.m27656a(z2, (Object) "No requests specified!");
        this.f35910e = requestArr;
        this.f35920r = true;
        return m27949f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13691k<C13745c<IMAGE>> mo25750a(C13842a aVar, String str) {
        if (this.f35911f != null) {
            return this.f35911f;
        }
        C13691k<C13745c<IMAGE>> kVar = null;
        if (this.f35908c != null) {
            kVar = m27945a(aVar, str, this.f35908c);
        } else if (this.f35910e != null) {
            REQUEST[] requestArr = this.f35910e;
            boolean z = this.f35920r;
            ArrayList arrayList = new ArrayList(requestArr.length * 2);
            if (z) {
                for (REQUEST a : requestArr) {
                    arrayList.add(m27946a(aVar, str, a, C13789a.BITMAP_MEMORY_CACHE));
                }
            }
            for (REQUEST a2 : requestArr) {
                arrayList.add(m27945a(aVar, str, a2));
            }
            kVar = C13749f.m27821a(arrayList);
        }
        if (!(kVar == null || this.f35909d == null)) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(kVar);
            arrayList2.add(m27945a(aVar, str, this.f35909d));
            kVar = new C13753g<>(arrayList2, false);
        }
        if (kVar == null) {
            kVar = new C13691k<C13745c<T>>(f35905p) {

                /* renamed from: a */
                final /* synthetic */ Throwable f35750a;

                /* renamed from: b */
                public final /* synthetic */ Object mo23157b() {
                    return C13746d.m27819a(this.f35750a);
                }

                {
                    this.f35750a = r1;
                }
            };
        }
        return kVar;
    }

    /* renamed from: a */
    private C13691k<C13745c<IMAGE>> m27945a(C13842a aVar, String str, REQUEST request) {
        return m27946a(aVar, str, request, C13789a.FULL_FETCH);
    }

    /* renamed from: a */
    private C13691k<C13745c<IMAGE>> m27946a(C13842a aVar, String str, REQUEST request, C13789a aVar2) {
        final Object obj = this.f35907b;
        final C13842a aVar3 = aVar;
        final String str2 = str;
        final REQUEST request2 = request;
        final C13789a aVar4 = aVar2;
        C137882 r0 = new C13691k<C13745c<IMAGE>>() {
            /* renamed from: b */
            public final /* synthetic */ Object mo23157b() {
                return C13786b.this.mo25721a(aVar3, str2, request2, obj, aVar4);
            }

            public final String toString() {
                return C13685h.m27644a(this).mo25581a("request", (Object) request2.toString()).toString();
            }
        };
        return r0;
    }
}
