package com.bytedance.jedi.arch.ext.list.p744a;

import android.support.p043v7.p051e.C1206a;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.p051e.C1208c.C1210a;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.p051e.C1216d;
import android.support.p043v7.widget.RecyclerView.C1322a;
import com.bytedance.jedi.arch.ext.list.p744a.C11845c.C11846a;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import java.util.List;
import java.util.concurrent.Executor;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.b */
public final class C11841b<T> {

    /* renamed from: a */
    public final Executor f31414a;

    /* renamed from: b */
    public int f31415b;

    /* renamed from: c */
    public List<? extends T> f31416c;

    /* renamed from: d */
    public final C1216d f31417d;

    /* renamed from: e */
    public final C11845c<T> f31418e;

    /* renamed from: f */
    private final C11848e f31419f;

    /* renamed from: com.bytedance.jedi.arch.ext.list.a.b$a */
    public static final class C11842a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11841b f31420a;

        /* renamed from: b */
        final /* synthetic */ List f31421b;

        /* renamed from: c */
        final /* synthetic */ List f31422c;

        /* renamed from: d */
        final /* synthetic */ int f31423d;

        /* renamed from: e */
        final /* synthetic */ C52670a f31424e;

        /* renamed from: com.bytedance.jedi.arch.ext.list.a.b$a$a */
        public static final class C11844a extends C1210a {

            /* renamed from: a */
            final /* synthetic */ C11842a f31427a;

            /* renamed from: a */
            public final int mo159a() {
                return this.f31427a.f31421b.size();
            }

            /* renamed from: b */
            public final int mo161b() {
                return this.f31427a.f31422c.size();
            }

            C11844a(C11842a aVar) {
                this.f31427a = aVar;
            }

            /* renamed from: a */
            public final Object mo160a(int i, int i2) {
                Object obj = this.f31427a.f31421b.get(i);
                Object obj2 = this.f31427a.f31422c.get(i2);
                if (obj != null && obj2 != null) {
                    return this.f31427a.f31420a.f31418e.f31429b.mo3934c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* renamed from: b */
            public final boolean mo162b(int i, int i2) {
                Object obj = this.f31427a.f31421b.get(i);
                Object obj2 = this.f31427a.f31422c.get(i2);
                if (obj != null && obj2 != null) {
                    return this.f31427a.f31420a.f31418e.f31429b.mo3932a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            /* renamed from: c */
            public final boolean mo163c(int i, int i2) {
                Object obj = this.f31427a.f31421b.get(i);
                Object obj2 = this.f31427a.f31422c.get(i2);
                if (obj != null && obj2 != null) {
                    return this.f31427a.f31420a.f31418e.f31429b.mo3933b(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }
        }

        public C11842a(C11841b bVar, List list, List list2, int i, C52670a aVar) {
            this.f31420a = bVar;
            this.f31421b = list;
            this.f31422c = list2;
            this.f31423d = i;
            this.f31424e = aVar;
        }

        public final void run() {
            final C1211b a = C1208c.m3654a(new C11844a(this));
            C52711k.m112236a((Object) a, "DiffUtil.calculateDiff(o…                       })");
            this.f31420a.f31414a.execute(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C11842a f31425a;

                {
                    this.f31425a = r1;
                }

                public final void run() {
                    if (this.f31425a.f31420a.f31415b == this.f31425a.f31423d) {
                        C11841b bVar = this.f31425a.f31420a;
                        List<? extends T> list = this.f31425a.f31422c;
                        C1211b bVar2 = a;
                        C52670a aVar = this.f31425a.f31424e;
                        bVar.f31416c = list;
                        bVar2.mo3930a(bVar.f31417d);
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo22594a() {
        return this.f31416c.size();
    }

    /* renamed from: a */
    public final T mo22595a(int i, boolean z) {
        List<? extends T> list = this.f31416c;
        if (i >= list.size() || i < 0) {
            return null;
        }
        if (z) {
            C11848e eVar = this.f31419f;
            if (eVar != null) {
                eVar.mo22599a(i);
            }
        }
        return list.get(i);
    }

    public C11841b(C1216d dVar, C11845c<T> cVar, C11848e eVar) {
        C52711k.m112240b(dVar, "mUpdateCallback");
        C52711k.m112240b(cVar, "mConfig");
        this.f31417d = dVar;
        this.f31418e = cVar;
        this.f31419f = eVar;
        Executor executor = this.f31418e.f31430c;
        if (executor == null) {
            executor = new C11852g();
        }
        this.f31414a = executor;
        this.f31416c = C52575l.m112097a();
    }

    public C11841b(C1322a<?> aVar, C1212c<T> cVar, C11850b bVar) {
        C52711k.m112240b(aVar, "adapter");
        C52711k.m112240b(cVar, "diffCallback");
        C1216d aVar2 = new C1206a(aVar);
        C11845c a = new C11846a(cVar).mo22598a();
        C11848e eVar = null;
        if (bVar != null) {
            eVar = C11851f.m24206a(bVar, true, 10);
        }
        this(aVar2, a, eVar);
    }

    public /* synthetic */ C11841b(C1322a aVar, C1212c cVar, C11850b bVar, int i, C52707g gVar) {
        this(aVar, cVar, (C11850b) null);
    }
}
