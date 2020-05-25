package com.bytedance.ies.bullet.p653ui.common;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.p633e.C10284d;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p636f.C10318c;
import com.bytedance.ies.bullet.p628b.p636f.C10322e;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10573c;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10573c.C10574a;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.ies.bullet.ui.common.c */
public final class C10567c implements C10609f {

    /* renamed from: a */
    private final C10322e f28074a = new C10318c();

    /* renamed from: b */
    private final C10326b f28075b;

    /* renamed from: com.bytedance.ies.bullet.ui.common.c$a */
    static final class C10568a extends C52712l implements C52686q<C10290i, Uri, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f28076a;

        /* renamed from: b */
        final /* synthetic */ C10326b f28077b;

        /* renamed from: c */
        final /* synthetic */ C52671b f28078c;

        /* renamed from: d */
        final /* synthetic */ C52686q f28079d;

        /* renamed from: e */
        final /* synthetic */ C52671b f28080e;

        /* renamed from: com.bytedance.ies.bullet.ui.common.c$a$a */
        static final class C10569a extends C52712l implements C52671b<List<? extends C10575d<View>>, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C10573c f28081a;

            /* renamed from: b */
            final /* synthetic */ C10568a f28082b;

            /* renamed from: c */
            final /* synthetic */ boolean f28083c;

            /* renamed from: d */
            final /* synthetic */ Uri f28084d;

            C10569a(C10573c cVar, C10568a aVar, boolean z, Uri uri) {
                this.f28081a = cVar;
                this.f28082b = aVar;
                this.f28083c = z;
                this.f28084d = uri;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                List<C10575d> list = (List) obj;
                C52711k.m112240b(list, "viewComponents");
                if (!list.isEmpty()) {
                    boolean z = false;
                    for (C10575d dVar : list) {
                        if (!z) {
                            this.f28081a.mo18667a(dVar, this.f28084d);
                            z = true;
                        }
                        this.f28081a.mo18666a(dVar);
                        this.f28082b.f28078c.invoke(dVar);
                    }
                    this.f28082b.f28079d.invoke(this.f28081a, list, Boolean.valueOf(this.f28083c));
                } else {
                    C52671b bVar = this.f28082b.f28080e;
                    StringBuilder sb = new StringBuilder("initiateViewComponents failed for uri ");
                    sb.append(this.f28084d);
                    bVar.invoke(new IllegalStateException(sb.toString()));
                }
                return C52860x.f131107a;
            }
        }

        C10568a(C52671b bVar, C10326b bVar2, C52671b bVar3, C52686q qVar, C52671b bVar4) {
            this.f28076a = bVar;
            this.f28077b = bVar2;
            this.f28078c = bVar3;
            this.f28079d = qVar;
            this.f28080e = bVar4;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            C10290i iVar = (C10290i) obj;
            Uri uri = (Uri) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            C52711k.m112240b(iVar, "instanceApi");
            C52711k.m112240b(uri, "uri");
            if (!(iVar instanceof C10573c)) {
                iVar = null;
            }
            if (iVar != null) {
                if (iVar != null) {
                    C10573c cVar = (C10573c) iVar;
                    if (cVar != null) {
                        if (booleanValue) {
                            this.f28076a.invoke(this.f28077b);
                            C52671b aVar = new C10569a(cVar, this, booleanValue, uri);
                            C52711k.m112240b(aVar, "provider");
                            cVar.mo18668a(new C10574a(cVar, aVar));
                        } else {
                            this.f28079d.invoke(cVar, cVar.mo18754x(), Boolean.valueOf(booleanValue));
                        }
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.kit.KitContainerApiDefault /* = com.bytedance.ies.bullet.ui.common.kit.KitContainerApi<android.view.View> */");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public final C10326b mo18752b() {
        return this.f28075b;
    }

    /* renamed from: a */
    public final void mo18295a() {
        mo18752b().mo18395a(Context.class);
        this.f28074a.mo18295a();
    }

    /* renamed from: a */
    public final <T extends C10284d<?, ?, ?, ?>> C10290i mo18260a(Class<? extends T> cls) {
        C52711k.m112240b(cls, "clazz");
        return this.f28074a.mo18260a(cls);
    }

    public C10567c(Context context) {
        C52711k.m112240b(context, "context");
        C10326b bVar = new C10326b();
        bVar.mo18400b(Context.class, context);
        this.f28075b = bVar;
    }

    /* renamed from: a */
    public final C10290i mo18261a(String str) {
        C52711k.m112240b(str, "sessionId");
        return this.f28074a.mo18261a(str);
    }

    /* renamed from: a */
    public final void mo18274a(C10246b bVar) {
        C52711k.m112240b(bVar, "coreProvider");
        this.f28074a.mo18274a(bVar);
    }

    /* renamed from: a */
    public final void mo18751a(Uri uri, C10326b bVar, C52671b<? super C10326b, C52860x> bVar2, C52671b<? super C10575d<? extends View>, C52860x> bVar3, C52686q<? super C10290i, ? super List<? extends C10575d<? extends View>>, ? super Boolean, C52860x> qVar, C52671b<? super Throwable, C52860x> bVar4) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(bVar, "providerFactory");
        C52711k.m112240b(bVar2, "providerFactoryHandler");
        C52711k.m112240b(bVar3, "viewComponentHandler");
        C52711k.m112240b(qVar, "resolve");
        C52711k.m112240b(bVar4, "reject");
        bVar.mo18394a(mo18752b());
        bVar.mo18400b(Uri.class, uri);
        C10322e eVar = this.f28074a;
        C10568a aVar = new C10568a(bVar2, bVar, bVar3, qVar, bVar4);
        eVar.mo18391a(uri, bVar, aVar, bVar4);
    }
}
