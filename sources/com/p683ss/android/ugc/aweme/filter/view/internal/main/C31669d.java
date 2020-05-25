package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.LiveData;
import android.net.Uri;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.jedi.p725a.p728c.C11577g;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31613h;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.tools.p2506c.p2507a.C50192a;
import com.p683ss.android.ugc.tools.p2506c.p2507a.C50193b;
import com.p683ss.android.ugc.tools.p2506c.p2507a.C50195c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p064c.p065a.C2201v;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d */
public class C31669d implements C31613h {

    /* renamed from: i */
    public static final C52686q<C31613h, C31459g, C31494g, C52860x> f82722i = C31671b.f82737a;

    /* renamed from: j */
    public static final C31670a f82723j = new C31670a(null);

    /* renamed from: a */
    public final C50192a<C52847n<C31459g, C31494g>> f82724a;

    /* renamed from: b */
    public final C50193b f82725b;

    /* renamed from: c */
    Map<C31459g, ? extends C31494g> f82726c;

    /* renamed from: d */
    final C2189f<C31459g> f82727d;

    /* renamed from: e */
    public final C2189f<C31459g> f82728e;

    /* renamed from: f */
    public final C52682m<C31459g, C31494g, C52860x> f82729f;

    /* renamed from: g */
    public final RecyclerView f82730g;

    /* renamed from: h */
    final C52686q<C31613h, C31459g, C31494g, C52860x> f82731h;

    /* renamed from: k */
    private C31459g f82732k;

    /* renamed from: l */
    private final C2189f<C11575f<C31459g>> f82733l;

    /* renamed from: m */
    private final C0184k f82734m;

    /* renamed from: n */
    private final C31730p f82735n;

    /* renamed from: o */
    private final C31731q f82736o;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$a */
    public static final class C31670a {
        private C31670a() {
        }

        public /* synthetic */ C31670a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$b */
    static final class C31671b extends C52712l implements C52686q<C31613h, C31459g, C31494g, C52860x> {

        /* renamed from: a */
        public static final C31671b f82737a = new C31671b();

        C31671b() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            C31613h hVar = (C31613h) obj;
            C31459g gVar = (C31459g) obj2;
            C31494g gVar2 = (C31494g) obj3;
            C52711k.m112240b(hVar, "list");
            C52711k.m112240b(gVar, "filter");
            C52711k.m112240b(gVar2, "<anonymous parameter 2>");
            hVar.mo64493a(gVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$c */
    final class C31672c extends C50193b {

        /* renamed from: a */
        final /* synthetic */ C31669d f82738a;

        /* renamed from: a */
        public final void mo64582a(C1352v vVar) {
            C52711k.m112240b(vVar, "holder");
        }

        /* renamed from: a */
        public final C1352v mo64581a(ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fj, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…list_line, parent, false)");
            return new C50195c(inflate);
        }

        public C31672c(C31669d dVar, C1322a<C1352v> aVar) {
            C52711k.m112240b(aVar, "delegate");
            this.f82738a = dVar;
            super(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$d */
    final class C31673d extends C50192a<C52847n<? extends C31459g, ? extends C31494g>> {
        public C31673d() {
        }

        public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            return C31669d.this.mo64520a(viewGroup, i, C31669d.this.f82729f);
        }

        public final void onBindViewHolder(C1352v vVar, int i) {
            C52711k.m112240b(vVar, "holder");
            C52847n nVar = (C52847n) this.f125745b.get(i);
            C31669d.this.mo64521a(vVar, i, (C31459g) nVar.getFirst(), (C31494g) nVar.getSecond());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$e */
    static final class C31674e extends C52712l implements C52682m<C31459g, C31494g, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31669d f82740a;

        C31674e(C31669d dVar) {
            this.f82740a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C31459g gVar = (C31459g) obj;
            C31494g gVar2 = (C31494g) obj2;
            C52711k.m112240b(gVar, "data");
            C52711k.m112240b(gVar2, "state");
            C31669d dVar = this.f82740a;
            dVar.f82727d.onNext(gVar);
            C52686q<C31613h, C31459g, C31494g, C52860x> qVar = dVar.f82731h;
            if (qVar != null) {
                qVar.invoke(dVar, gVar, gVar2);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$f */
    static final class C31675f<T> implements C0199s<Map<C31459g, ? extends C31494g>> {

        /* renamed from: a */
        final /* synthetic */ C31669d f82741a;

        C31675f(C31669d dVar) {
            this.f82741a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Map<C31459g, ? extends C31494g> map = (Map) obj;
            if (map != null) {
                C31669d dVar = this.f82741a;
                dVar.f82726c = map;
                int i = 0;
                for (C52847n nVar : dVar.f82724a.mo97975a()) {
                    C31494g gVar = (C31494g) nVar.getSecond();
                    C31494g a = C31682e.m73603a(map, (C31459g) nVar.getFirst());
                    if (gVar != a) {
                        C50192a<C52847n<C31459g, C31494g>> aVar = dVar.f82724a;
                        C52847n a2 = C52856t.m112465a(nVar.getFirst(), a);
                        if (a2 != null) {
                            aVar.f125745b.set(i, a2);
                            aVar.notifyItemChanged(i);
                        }
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$g */
    static final class C31676g<T> implements C0199s<C31459g> {

        /* renamed from: a */
        final /* synthetic */ C31669d f82742a;

        C31676g(C31669d dVar) {
            this.f82742a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82742a.mo64580c((C31459g) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$h */
    public static final class C31677h extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C31669d f82743a;

        C31677h(C31669d dVar) {
            this.f82743a = dVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            if (i == 0) {
                C1332i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    C52847n nVar = (C52847n) C52575l.m112118a(this.f82743a.f82724a.mo97975a(), this.f82743a.f82725b.mo97976a(linearLayoutManager.mo4749j()));
                    if (nVar != null) {
                        this.f82743a.f82728e.onNext(nVar.getFirst());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$i */
    static final class C31678i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C31669d f82744a;

        /* renamed from: b */
        final /* synthetic */ int f82745b;

        /* renamed from: c */
        final /* synthetic */ int f82746c;

        C31678i(C31669d dVar, int i, int i2) {
            this.f82744a = dVar;
            this.f82745b = i;
            this.f82746c = i2;
        }

        public final void run() {
            this.f82744a.mo64578a(this.f82745b, this.f82746c + 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$j */
    static final class C31679j extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31669d f82747a;

        C31679j(C31669d dVar) {
            this.f82747a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f82747a.mo64578a(((Number) obj).intValue(), 0);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$k */
    static final class C31680k extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31669d f82748a;

        /* renamed from: b */
        final /* synthetic */ int f82749b;

        C31680k(C31669d dVar, int i) {
            this.f82748a = dVar;
            this.f82749b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f82748a.mo64579b(((Number) obj).intValue(), this.f82749b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.d$l */
    static final class C31681l extends C52712l implements C52671b<C31459g, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31669d f82750a;

        C31681l(C31669d dVar) {
            this.f82750a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            C31459g gVar = (C31459g) obj;
            int i = -1;
            if (gVar != null) {
                Iterator it = this.f82750a.f82724a.mo97975a().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((C31459g) ((C52847n) it.next()).getFirst()).f82324a == gVar.f82324a) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            if (i >= 0) {
                this.f82750a.f82724a.notifyItemChanged(i);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final C31459g mo64492a() {
        return this.f82732k;
    }

    /* renamed from: b */
    public final C2201v<C31459g> mo64495b() {
        C2201v<C31459g> e = this.f82727d.mo6542e();
        C52711k.m112236a((Object) e, "filterClickSubject.hide()");
        return e;
    }

    /* renamed from: c */
    public final C2201v<C11575f<C31459g>> mo64497c() {
        C2201v<C11575f<C31459g>> e = this.f82733l.mo6542e();
        C52711k.m112236a((Object) e, "filterSelectedSubject.hide()");
        return e;
    }

    /* renamed from: d */
    public final C2201v<C31459g> mo64498d() {
        C2201v<C31459g> e = this.f82728e.mo6542e();
        C52711k.m112236a((Object) e, "filterListScrollSubject.hide()");
        return e;
    }

    /* renamed from: b */
    public final void mo64496b(C31459g gVar) {
        m73586a(gVar, (C52671b<? super Integer, C52860x>) new C31679j<Object,C52860x>(this));
    }

    /* renamed from: c */
    public final void mo64580c(C31459g gVar) {
        C31459g gVar2 = this.f82732k;
        if (gVar2 != null || gVar != null) {
            if (gVar2 == null || gVar == null || gVar2.f82324a != gVar.f82324a) {
                this.f82732k = gVar;
                C52671b lVar = new C31681l(this);
                lVar.invoke(gVar2);
                lVar.invoke(gVar);
                this.f82733l.onNext(C11577g.m23686a(gVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo64493a(C31459g gVar) {
        mo64496b(gVar);
        if (this.f82735n != null) {
            this.f82735n.mo64574a(gVar);
        } else {
            mo64580c(gVar);
        }
    }

    /* renamed from: a */
    public final void mo64491a(Map<EffectCategoryResponse, ? extends List<? extends C31459g>> map) {
        C52711k.m112240b(map, "filterList");
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        int i = 0;
        for (Entry entry : map.entrySet()) {
            arrayList.addAll((Collection) entry.getValue());
            if (i < map.size() - 1 && (!((Collection) entry.getValue()).isEmpty())) {
                arrayList2.add(Integer.valueOf(arrayList.size() - 1));
            }
            i++;
        }
        C50192a<C52847n<C31459g, C31494g>> aVar = this.f82724a;
        Iterable<C31459g> iterable = arrayList;
        Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C31459g gVar : iterable) {
            arrayList3.add(C52856t.m112465a(gVar, C31682e.m73603a(this.f82726c, gVar)));
        }
        List list = (List) arrayList3;
        aVar.f125745b.clear();
        aVar.f125745b.addAll(list);
        this.f82725b.mo97977a(arrayList2);
        C31731q qVar = this.f82736o;
        if (qVar != null) {
            Collection arrayList4 = new ArrayList();
            for (Entry value : map.entrySet()) {
                C52575l.m112108a(arrayList4, (Iterable) (List) value.getValue());
            }
            qVar.mo64576a((List) arrayList4);
        }
    }

    /* renamed from: a */
    public final void mo64494a(C31459g gVar, int i) {
        m73586a(gVar, (C52671b<? super Integer, C52860x>) new C31680k<Object,C52860x>(this, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64578a(int i, int i2) {
        if (this.f82730g.getWidth() != 0 || i2 >= 3) {
            this.f82730g.mo4814b(i);
        } else {
            this.f82730g.post(new C31678i(this, i, i2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo64579b(int i, int i2) {
        C1332i layoutManager = this.f82730g.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            linearLayoutManager.mo4721a(i, i2);
        }
    }

    /* renamed from: a */
    private final void m73586a(C31459g gVar, C52671b<? super Integer, C52860x> bVar) {
        boolean z;
        if (gVar != null) {
            Iterator it = this.f82724a.mo97975a().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C31459g) ((C52847n) it.next()).getFirst()).f82324a == gVar.f82324a) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                bVar.invoke(Integer.valueOf(this.f82725b.mo97978b(i)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1352v mo64520a(ViewGroup viewGroup, int i, C52682m<? super C31459g, ? super C31494g, C52860x> mVar) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(mVar, "clickListener");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.axu, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…main_view, parent, false)");
        return new C31720m(inflate, mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64521a(C1352v vVar, int i, C31459g gVar, C31494g gVar2) {
        boolean z;
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(gVar, "filterBean");
        C52711k.m112240b(gVar2, "filterState");
        String str = null;
        if (!(vVar instanceof C31720m)) {
            vVar = null;
        }
        C31720m mVar = (C31720m) vVar;
        if (mVar != null) {
            C31459g gVar3 = this.f82732k;
            if (gVar3 == null || gVar3.f82324a != gVar.f82324a) {
                z = false;
            } else {
                z = true;
            }
            C52711k.m112240b(gVar, "filter");
            C52711k.m112240b(gVar2, "filterState");
            AVDmtImageTextView aVDmtImageTextView = mVar.f82852b;
            Uri uri = gVar.f82329f;
            if (uri != null) {
                str = uri.toString();
            }
            aVDmtImageTextView.mo93969a(str);
            mVar.f82852b.setText(gVar.f82325b);
            mVar.f82852b.mo93970a(z);
            if (mVar.f82855e != gVar2) {
                switch (C31722n.f82858a[gVar2.ordinal()]) {
                    case 1:
                    case 2:
                        mVar.mo64604a();
                        ImageView imageView = mVar.f82851a;
                        C52711k.m112236a((Object) imageView, "ivDownload");
                        imageView.setVisibility(0);
                        break;
                    case 3:
                    case 4:
                        mVar.mo64604a();
                        ImageView imageView2 = mVar.f82851a;
                        C52711k.m112236a((Object) imageView2, "ivDownload");
                        imageView2.setVisibility(8);
                        break;
                    case 5:
                        ImageView imageView3 = mVar.f82851a;
                        C52711k.m112236a((Object) imageView3, "ivDownload");
                        imageView3.setVisibility(0);
                        mVar.f82851a.setImageResource(R.drawable.ed);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mVar.f82851a, "rotation", new float[]{0.0f, 360.0f});
                        C52711k.m112236a((Object) ofFloat, "animator");
                        ofFloat.setDuration(800);
                        ofFloat.setRepeatMode(1);
                        ofFloat.setRepeatCount(-1);
                        ofFloat.start();
                        mVar.f82853c = ofFloat;
                        break;
                }
            }
            mVar.f82854d = gVar;
            mVar.f82855e = gVar2;
        }
    }

    public C31669d(RecyclerView recyclerView, C0184k kVar, C31730p pVar, C31731q qVar, C52686q<? super C31613h, ? super C31459g, ? super C31494g, C52860x> qVar2) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f82730g = recyclerView;
        this.f82734m = kVar;
        this.f82735n = pVar;
        this.f82736o = qVar;
        this.f82731h = qVar2;
        this.f82724a = new C31673d();
        this.f82725b = new C31672c(this, this.f82724a);
        this.f82726c = C52550ab.m112045a();
        C2180b l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create()");
        this.f82727d = l;
        C2180b l2 = C2180b.m6534l();
        C52711k.m112236a((Object) l2, "PublishSubject.create()");
        this.f82733l = l2;
        C2180b l3 = C2180b.m6534l();
        C52711k.m112236a((Object) l3, "PublishSubject.create()");
        this.f82728e = l3;
        this.f82729f = new C31674e(this);
        this.f82730g.setAdapter(this.f82725b);
        C0184k kVar2 = this.f82734m;
        C31731q qVar3 = this.f82736o;
        if (qVar3 != null) {
            LiveData a = qVar3.mo64559a();
            if (a != null) {
                a.observe(kVar2, new C31675f(this));
            }
        }
        C31730p pVar2 = this.f82735n;
        if (pVar2 != null) {
            LiveData a2 = pVar2.mo64559a();
            if (a2 != null) {
                a2.observe(kVar2, new C31676g(this));
            }
        }
        this.f82730g.mo4801a((C1340m) new C31677h(this));
    }

    public /* synthetic */ C31669d(RecyclerView recyclerView, C0184k kVar, C31730p pVar, C31731q qVar, C52686q qVar2, int i, C52707g gVar) {
        this(recyclerView, kVar, pVar, qVar, f82722i);
    }
}
