package com.bytedance.ies.bullet.p653ui.common.p656c;

import android.net.Uri;
import android.view.View;
import com.bytedance.ies.bullet.p628b.C10250d;
import com.bytedance.ies.bullet.p628b.p633e.C10277aa;
import com.bytedance.ies.bullet.p628b.p633e.C10284d;
import com.bytedance.ies.bullet.p628b.p633e.C10298q;
import com.bytedance.ies.bullet.p628b.p633e.C10298q.C10299a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.ies.bullet.ui.common.c.c */
public abstract class C10573c<T extends View> extends C10298q implements C10571b<T> {

    /* renamed from: r */
    public final List<C10575d<T>> f28088r = new ArrayList();

    /* renamed from: com.bytedance.ies.bullet.ui.common.c.c$a */
    public static final class C10574a extends C52712l implements C52671b<List<? extends C10575d<T>>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10573c f28089a;

        /* renamed from: b */
        final /* synthetic */ C52671b f28090b;

        public C10574a(C10573c cVar, C52671b bVar) {
            this.f28089a = cVar;
            this.f28090b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            List<C10575d<T>> list2 = this.f28089a.f28088r;
            list2.clear();
            list2.addAll(list);
            this.f28090b.invoke(list);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public abstract void mo18668a(C52671b<? super List<C10575d<T>>, C52860x> bVar);

    /* renamed from: r */
    public void mo18375r() {
    }

    /* renamed from: v */
    public String mo18670v() {
        return "DebugView";
    }

    /* renamed from: x */
    public final List<C10575d<T>> mo18754x() {
        return this.f28088r;
    }

    /* renamed from: y */
    public final C10577d mo18755y() {
        return (C10577d) mo18346d().mo18401c(C10577d.class);
    }

    /* renamed from: a */
    public final C10575d<T> mo18753a() {
        if (!this.f28088r.isEmpty()) {
            return (C10575d) this.f28088r.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public void mo18667a(C10575d<T> dVar, Uri uri) {
        C52711k.m112240b(dVar, "viewComponent");
        C52711k.m112240b(uri, "uri");
        T t = dVar.f28092b;
        C52711k.m112240b(t, "view");
        t.addOnAttachStateChangeListener(new C10299a(this));
    }

    public C10573c(C10284d<?, ?, ?, ?> dVar, C10277aa aaVar, List<String> list, C10250d dVar2, C10326b bVar) {
        C52711k.m112240b(dVar, "kitApi");
        C52711k.m112240b(aaVar, "sessionInfo");
        C52711k.m112240b(list, "packageNames");
        C52711k.m112240b(dVar2, "kitPackageRegistryBundle");
        C52711k.m112240b(bVar, "providerFactory");
        super(dVar, aaVar, list, dVar2, bVar);
    }
}
