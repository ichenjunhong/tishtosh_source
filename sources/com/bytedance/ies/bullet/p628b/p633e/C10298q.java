package com.bytedance.ies.bullet.p628b.p633e;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bytedance.ies.bullet.p628b.C10242b;
import com.bytedance.ies.bullet.p628b.C10250d;
import com.bytedance.ies.bullet.p628b.p629a.C10241d;
import com.bytedance.ies.bullet.p628b.p631c.C10247a;
import com.bytedance.ies.bullet.p628b.p631c.C10248b;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10257c;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10271f;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10272g;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10333d;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10335f;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10344j;
import com.bytedance.ies.bullet.p628b.p641h.C10345a;
import com.bytedance.ies.bullet.p628b.p641h.C10357d;
import com.bytedance.ies.bullet.p628b.p641h.C10358e;
import com.bytedance.ies.bullet.p628b.p643i.C10386g;
import com.bytedance.ies.bullet.p628b.p643i.C10388i;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.ies.bullet.b.e.q */
public abstract class C10298q implements C10290i {

    /* renamed from: a_ */
    public C10291j f27680a_;

    /* renamed from: b */
    public final List<C10291j> f27681b = new ArrayList();

    /* renamed from: c */
    public boolean f27682c = true;

    /* renamed from: d */
    public C10345a f27683d;

    /* renamed from: e */
    private final List<String> f27684e = new ArrayList();

    /* renamed from: f */
    private Uri f27685f;

    /* renamed from: g */
    private C10250d f27686g;

    /* renamed from: h */
    private C10294m f27687h;

    /* renamed from: i */
    private C10286e f27688i;

    /* renamed from: j */
    private final List<C10294m> f27689j = new ArrayList();

    /* renamed from: k */
    private final List<C10286e> f27690k = new ArrayList();

    /* renamed from: l */
    private C10272g f27691l;

    /* renamed from: m */
    private C10423r f27692m;

    /* renamed from: n */
    private final List<C10423r> f27693n = new ArrayList();

    /* renamed from: o */
    private final C10284d<?, ?, ?, ?> f27694o;

    /* renamed from: p */
    private final C10277aa f27695p;

    /* renamed from: q */
    private final C10326b f27696q;

    /* renamed from: com.bytedance.ies.bullet.b.e.q$a */
    public static final class C10299a implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C10298q f27697a;

        public C10299a(C10298q qVar) {
            this.f27697a = qVar;
        }

        public final void onViewAttachedToWindow(View view) {
            C52711k.m112240b(view, "v");
            C10345a g = this.f27697a.mo18349g();
            if (g != null) {
                g.mo18417a(view);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            C52711k.m112240b(view, "v");
            C10345a g = this.f27697a.mo18349g();
            if (g != null) {
                g.mo18419b(view);
            }
            this.f27697a.mo18377t();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.q$b */
    static final class C10300b extends C52712l implements C52671b<Uri, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10298q f27698a;

        /* renamed from: b */
        final /* synthetic */ C52671b f27699b;

        /* renamed from: c */
        final /* synthetic */ C52671b f27700c;

        C10300b(C10298q qVar, C52671b bVar, C52671b bVar2) {
            this.f27698a = qVar;
            this.f27699b = bVar;
            this.f27700c = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Uri uri = (Uri) obj;
            C52711k.m112240b(uri, "it");
            this.f27698a.mo18360a(uri, this.f27699b, this.f27700c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.q$c */
    static final class C10301c extends C52712l implements C52671b<C10291j, C103021> {

        /* renamed from: a */
        final /* synthetic */ C10298q f27701a;

        C10301c(C10298q qVar) {
            this.f27701a = qVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final C10291j jVar = (C10291j) obj;
            C52711k.m112240b(jVar, "$receiver");
            return new C10333d<Uri>(this) {

                /* renamed from: a */
                final /* synthetic */ C10301c f27702a;

                {
                    this.f27702a = r1;
                }

                /* renamed from: a */
                public final /* synthetic */ void mo18267a(Object obj, C52671b bVar, C52671b bVar2) {
                    C52711k.m112240b((Uri) obj, "input");
                    C52711k.m112240b(bVar, "resolve");
                    C52711k.m112240b(bVar2, "reject");
                }
            };
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.q$d */
    static final class C10303d extends C52712l implements C52671b<Uri, C10388i<Map<?, ?>>> {

        /* renamed from: a */
        public static final C10303d f27704a = new C10303d();

        C10303d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Uri uri;
            Uri uri2 = (Uri) obj;
            C52711k.m112240b(uri2, "uri");
            Class<Map> cls = Map.class;
            Map linkedHashMap = new LinkedHashMap();
            String authority = uri2.getAuthority();
            C52711k.m112236a((Object) authority, "uri.authority");
            linkedHashMap.put("__AUTHORITY__", authority);
            String path = uri2.getPath();
            C52711k.m112236a((Object) path, "uri.path");
            linkedHashMap.put("__PATH__", path);
            if (uri2.isHierarchical()) {
                uri = uri2;
            } else {
                uri = null;
            }
            if (uri != null) {
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str : queryParameterNames) {
                        if (str != null) {
                            String queryParameter = uri2.getQueryParameter(str);
                            if (queryParameter != null) {
                                linkedHashMap.put(str, queryParameter);
                            }
                        }
                    }
                }
            }
            return new C10388i(cls, linkedHashMap);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.q$e */
    static final class C10304e extends C52712l implements C52671b<Uri, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10298q f27705a;

        /* renamed from: b */
        final /* synthetic */ C52671b f27706b;

        C10304e(C10298q qVar, C52671b bVar) {
            this.f27705a = qVar;
            this.f27706b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Uri uri = (Uri) obj;
            C52711k.m112240b(uri, "it");
            this.f27706b.invoke(uri);
            C10298q qVar = this.f27705a;
            qVar.mo18359a(uri);
            Iterator it = qVar.f27681b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public abstract C10345a mo18358a(Uri uri, Uri uri2);

    /* renamed from: a */
    public abstract void mo18359a(Uri uri);

    /* renamed from: a */
    public abstract boolean mo18361a(Uri uri, C52671b<? super Throwable, C52860x> bVar);

    /* renamed from: b */
    public final C10284d<?, ?, ?, ?> mo18344b() {
        return this.f27694o;
    }

    /* renamed from: b */
    public abstract void mo18363b(Uri uri, C52671b<? super Uri, C52860x> bVar, C52671b<? super Throwable, C52860x> bVar2);

    /* renamed from: c */
    public abstract void mo18366c(List<String> list, C10250d dVar);

    /* renamed from: d */
    public final C10326b mo18346d() {
        return this.f27696q;
    }

    /* renamed from: e */
    public final List<String> mo18347e() {
        return this.f27684e;
    }

    /* renamed from: f */
    public final C10423r mo18348f() {
        return this.f27692m;
    }

    /* renamed from: g */
    public final C10345a mo18349g() {
        return this.f27683d;
    }

    /* renamed from: k */
    public final C10286e mo18367k() {
        return this.f27688i;
    }

    /* renamed from: k_ */
    public final C10277aa mo18352k_() {
        return this.f27695p;
    }

    /* renamed from: l */
    public final List<C10294m> mo18368l() {
        return this.f27689j;
    }

    /* renamed from: l_ */
    public final C10294m mo18369l_() {
        return this.f27687h;
    }

    /* renamed from: m */
    public final List<C10286e> mo18370m() {
        return this.f27690k;
    }

    /* renamed from: n */
    public final C10272g mo18371n() {
        return this.f27691l;
    }

    /* renamed from: r */
    public abstract void mo18375r();

    /* renamed from: s */
    public abstract void mo18376s();

    /* renamed from: c */
    public final C10254a mo18345c() {
        return mo18344b().getKitType();
    }

    /* renamed from: p */
    public final C10357d mo18373p() {
        return (C10357d) mo18346d().mo18401c(C10357d.class);
    }

    /* renamed from: q */
    public final C10358e mo18374q() {
        return (C10358e) mo18346d().mo18401c(C10358e.class);
    }

    /* renamed from: t */
    public final void mo18377t() {
        C10345a g = mo18349g();
        if (g != null) {
            g.mo18420g();
        }
        this.f27683d = null;
    }

    /* renamed from: i */
    public final void mo18351i() {
        mo18365b(mo18347e(), this.f27686g);
        mo18376s();
        Iterator it = this.f27681b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: o */
    public final C10247a mo18372o() {
        C10248b bVar = (C10248b) mo18346d().mo18401c(C10248b.class);
        if (bVar != null) {
            C10247a a = bVar.mo18279a(mo18346d());
            if (a != null) {
                return a;
            }
        }
        return (C10247a) mo18346d().mo18401c(C10247a.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18364b(Throwable th) {
        mo18377t();
    }

    /* renamed from: a */
    public final void mo18342a(Throwable th) {
        C10272g n = mo18371n();
        if (n != null) {
            n.mo18295a();
        }
        mo18364b(th);
        Iterator it = this.f27681b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final <T extends C10423r> T mo18341a(Class<T> cls) {
        Object obj;
        C52711k.m112240b(cls, "type");
        Iterator it = C52575l.m112138e((Iterable) this.f27693n).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cls.isAssignableFrom(((C10423r) obj).getClass())) {
                break;
            }
        }
        T t = (C10423r) obj;
        if (t == null) {
            return null;
        }
        if (!(t instanceof C10423r)) {
            t = null;
        }
        return t;
    }

    /* renamed from: b */
    public final void mo18362b(Uri uri) {
        C52711k.m112240b(uri, "uri");
        C10311x xVar = new C10311x();
        xVar.mo18493a(Uri.class, uri);
        C10345a a = mo18358a(uri, (Uri) xVar.f27714a.mo18457b());
        a.mo18418a(mo18352k_().f27674a);
        this.f27683d = a;
        mo18346d().mo18397a(C10345a.class, mo18349g());
    }

    /* renamed from: a */
    public final void mo18343a(List<String> list, C10250d dVar) {
        C52711k.m112240b(list, "newPackageNames");
        C52711k.m112240b(dVar, "newRegistryBundle");
        this.f27682c = false;
        this.f27684e.clear();
        this.f27684e.addAll(list);
        mo18366c(list, dVar);
        mo18365b(list, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18365b(List<String> list, C10250d dVar) {
        C10333d dVar2;
        C52711k.m112240b(list, "packageNames");
        C52711k.m112240b(dVar, "kitPackageRegistryBundle");
        this.f27684e.clear();
        this.f27684e.addAll(list);
        C10333d dVar3 = null;
        this.f27687h = null;
        this.f27688i = null;
        this.f27680a_ = null;
        C10293l a = dVar.mo18280a();
        if (a != null) {
            C10294m a2 = a.mo18354a(mo18346d());
            if (a2 != null) {
                this.f27687h = a2;
            }
            C10286e b = a.mo18355b(mo18346d());
            if (b != null) {
                this.f27688i = b;
                b.mo18251a(mo18346d());
            }
        }
        this.f27689j.clear();
        this.f27690k.clear();
        this.f27681b.clear();
        for (C10293l lVar : dVar.mo18281b()) {
            C10294m a3 = lVar.mo18354a(mo18346d());
            if (a3 != null) {
                this.f27689j.add(a3);
            }
            C10286e b2 = lVar.mo18355b(mo18346d());
            if (b2 != null) {
                this.f27690k.add(b2);
                b2.mo18251a(mo18346d());
            }
        }
        mo18375r();
        C10272g gVar = this.f27691l;
        if (gVar != null) {
            gVar.mo18295a();
        }
        this.f27691l = null;
        for (C10271f fVar : dVar.mo18283d()) {
            List list2 = (List) fVar.mo18248a().invoke(mo18346d());
            List list3 = (List) fVar.mo18249b().invoke(mo18346d());
            try {
                dVar2 = (C10333d) fVar.mo18250c().invoke(mo18346d());
            } catch (C10241d unused) {
                dVar2 = null;
            }
            C10257c cVar = new C10257c(list2, list3, mo18346d(), dVar2);
            if (this.f27691l == null) {
                this.f27691l = cVar;
            } else {
                C10272g gVar2 = this.f27691l;
                if (gVar2 != null) {
                    gVar2.mo18299a(cVar, false);
                }
            }
        }
        C10271f c = dVar.mo18282c();
        if (c != null) {
            try {
                dVar3 = (C10333d) c.mo18250c().invoke(mo18346d());
            } catch (C10241d unused2) {
            }
            C10257c cVar2 = new C10257c((List) c.mo18248a().invoke(mo18346d()), (List) c.mo18249b().invoke(mo18346d()), mo18346d(), dVar3);
            if (this.f27691l == null) {
                this.f27691l = cVar2;
            } else {
                C10272g gVar3 = this.f27691l;
                if (gVar3 != null) {
                    gVar3.mo18299a(cVar2, false);
                }
            }
        }
        this.f27686g = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo18267a(Object obj, C52671b bVar, C52671b bVar2) {
        C10335f fVar;
        Uri uri = (Uri) obj;
        C52711k.m112240b(uri, "input");
        C52711k.m112240b(bVar, "resolve");
        C52711k.m112240b(bVar2, "reject");
        this.f27685f = uri;
        C52671b cVar = new C10301c(this);
        List arrayList = new ArrayList();
        for (C10291j invoke : this.f27681b) {
            arrayList.add((C10333d) cVar.invoke(invoke));
        }
        C10291j jVar = this.f27680a_;
        if (jVar != null) {
            C10333d dVar = (C10333d) cVar.invoke(jVar);
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            fVar = new C10344j(arrayList, null, 2, null);
        } else {
            fVar = null;
        }
        C10335f fVar2 = fVar;
        if (fVar2 == null) {
            mo18360a(uri, bVar, bVar2);
        } else {
            fVar2.mo18267a(uri, new C10300b(this, bVar, bVar2), bVar2);
        }
    }

    /* renamed from: a */
    public final void mo18360a(Uri uri, C52671b<? super Uri, C52860x> bVar, C52671b<? super Throwable, C52860x> bVar2) {
        C10423r rVar;
        C10386g gVar = (C10386g) mo18346d().mo18401c(C10386g.class);
        C10294m mVar = (C10294m) C52575l.m112140f(mo18368l());
        if (mVar == null) {
            mVar = mo18369l_();
        }
        Bundle bundle = null;
        if (mVar != null) {
            rVar = mVar.mo18356a(mo18346d());
            C10242b bVar3 = (C10242b) mo18346d().mo18401c(C10242b.class);
            if (bVar3 != null) {
                if (!bVar3.f27635b) {
                    bVar3 = null;
                }
                if (bVar3 != null) {
                    Class<Uri> cls = Uri.class;
                    C52671b bVar4 = C10303d.f27704a;
                    C52711k.m112240b(cls, "inputType");
                    C52711k.m112240b(bVar4, "parserInterceptor");
                    rVar.f27841c.put(cls, bVar4);
                }
            }
        } else {
            rVar = null;
        }
        this.f27692m = rVar;
        this.f27693n.clear();
        for (C52671b invoke : this.f27686g.mo18284e()) {
            this.f27693n.addAll((Collection) invoke.invoke(mo18346d()));
        }
        if (gVar != null) {
            Object a = gVar.mo18459a();
            if (a != null) {
                if (!(a instanceof Bundle)) {
                    a = null;
                }
                bundle = (Bundle) a;
            }
        }
        C10423r rVar2 = this.f27692m;
        if (rVar2 != null) {
            if (bundle != null) {
                rVar2.mo18493a(Bundle.class, bundle);
            }
            rVar2.mo18493a(Uri.class, uri);
        }
        for (C10423r rVar3 : this.f27693n) {
            if (bundle != null) {
                rVar3.mo18493a(Bundle.class, bundle);
            }
            rVar3.mo18493a(Uri.class, uri);
        }
        if (mo18361a(uri, bVar2)) {
            C10423r rVar4 = this.f27692m;
            if (!(rVar4 == null || gVar == null)) {
                gVar.mo18460a(this, uri, rVar4);
            }
            mo18363b(uri, new C10304e(this, bVar), bVar2);
        }
    }

    public C10298q(C10284d<?, ?, ?, ?> dVar, C10277aa aaVar, List<String> list, C10250d dVar2, C10326b bVar) {
        C52711k.m112240b(dVar, "kitApi");
        C52711k.m112240b(aaVar, "sessionInfo");
        C52711k.m112240b(list, "packageNames");
        C52711k.m112240b(dVar2, "kitPackageRegistryBundle");
        C52711k.m112240b(bVar, "providerFactory");
        this.f27694o = dVar;
        this.f27695p = aaVar;
        this.f27696q = bVar;
        this.f27684e.clear();
        this.f27684e.addAll(list);
        this.f27686g = dVar2;
        mo18346d().mo18397a(C10290i.class, this);
    }
}
