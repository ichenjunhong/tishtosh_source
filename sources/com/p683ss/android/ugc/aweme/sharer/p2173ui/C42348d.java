package com.p683ss.android.ugc.aweme.sharer.p2173ui;

import android.view.View;
import com.google.p1057b.p1060c.C17638bb;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.d */
public final class C42348d {

    /* renamed from: a */
    public final List<C42307b> f106945a;

    /* renamed from: b */
    public final List<C42357g> f106946b;

    /* renamed from: c */
    public final boolean f106947c;

    /* renamed from: d */
    public final boolean f106948d;

    /* renamed from: e */
    public final int f106949e;

    /* renamed from: f */
    public final int f106950f;

    /* renamed from: g */
    public final float f106951g;

    /* renamed from: h */
    public final int f106952h;

    /* renamed from: i */
    public final SharePackage f106953i;

    /* renamed from: j */
    public final boolean f106954j;

    /* renamed from: k */
    public final View f106955k;

    /* renamed from: l */
    public final C42354e f106956l;

    /* renamed from: m */
    public final C42346c f106957m;

    /* renamed from: n */
    public final C52670a<Boolean> f106958n;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.d$a */
    static final class C42349a extends C52712l implements C52671b<C42307b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42350b f106959a;

        C42349a(C42350b bVar) {
            this.f106959a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C42307b bVar = (C42307b) obj;
            C52711k.m112240b(bVar, "it");
            return Boolean.valueOf(this.f106959a.f106962c.contains(bVar.mo86136b()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.d$b */
    public static final class C42350b {

        /* renamed from: a */
        public List<C42307b> f106960a = new ArrayList();

        /* renamed from: b */
        public List<C42357g> f106961b = new ArrayList();

        /* renamed from: c */
        public List<String> f106962c = new ArrayList();

        /* renamed from: d */
        public boolean f106963d;

        /* renamed from: e */
        public boolean f106964e = true;

        /* renamed from: f */
        public C17638bb<C42357g> f106965f;

        /* renamed from: g */
        public C17638bb<C42307b> f106966g;

        /* renamed from: h */
        public C52671b<? super C42307b, Boolean> f106967h;

        /* renamed from: i */
        public int f106968i;

        /* renamed from: j */
        public int f106969j;

        /* renamed from: k */
        public float f106970k;

        /* renamed from: l */
        public int f106971l;

        /* renamed from: m */
        public SharePackage f106972m;

        /* renamed from: n */
        public boolean f106973n;

        /* renamed from: o */
        public View f106974o;

        /* renamed from: p */
        public C42354e f106975p;

        /* renamed from: q */
        public C42346c f106976q;

        /* renamed from: r */
        public C52670a<Boolean> f106977r;

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.d$b$a */
        static final class C42351a<T> implements Comparator<T> {

            /* renamed from: a */
            public static final C42351a f106978a = new C42351a();

            C42351a() {
            }

            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.d$b$b */
        static final class C42352b<T> implements Comparator<T> {

            /* renamed from: a */
            public static final C42352b f106979a = new C42352b();

            C42352b() {
            }

            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.d$b$c */
        static final class C42353c extends C52712l implements C52671b<C42307b, Boolean> {

            /* renamed from: a */
            public static final C42353c f106980a = new C42353c();

            C42353c() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C52711k.m112240b((C42307b) obj, "<anonymous parameter 0>");
                return Boolean.valueOf(true);
            }
        }

        /* renamed from: b */
        public final C42350b mo86267b() {
            this.f106963d = true;
            return this;
        }

        public C42350b() {
            C17638bb<C42357g> a = C17638bb.m43358a((Comparator<T>) C42351a.f106978a);
            C52711k.m112236a((Object) a, "Ordering.from { _, _ -> 0 }");
            this.f106965f = a;
            C17638bb<C42307b> a2 = C17638bb.m43358a((Comparator<T>) C42352b.f106979a);
            C52711k.m112236a((Object) a2, "Ordering.from { _, _ -> 0 }");
            this.f106966g = a2;
            this.f106967h = C42353c.f106980a;
            this.f106969j = R.color.ji;
            this.f106970k = 1.0f;
            this.f106973n = true;
        }

        /* renamed from: a */
        public final C42348d mo86266a() {
            return new C42348d(this, null);
        }

        /* renamed from: a */
        public final C42350b mo86257a(int i) {
            this.f106968i = i;
            return this;
        }

        /* renamed from: a */
        public final C42350b mo86259a(SharePackage sharePackage) {
            C52711k.m112240b(sharePackage, "sharePackage");
            this.f106972m = sharePackage;
            return this;
        }

        /* renamed from: b */
        public final C42350b mo86268b(int i) {
            this.f106971l = R.string.wf;
            return this;
        }

        /* renamed from: a */
        public final C42350b mo86258a(C42307b bVar) {
            C52711k.m112240b(bVar, "channel");
            this.f106960a.add(bVar);
            return this;
        }

        /* renamed from: b */
        public final C42350b mo86270b(boolean z) {
            this.f106973n = z;
            return this;
        }

        /* renamed from: a */
        public final C42350b mo86260a(C42346c cVar) {
            C52711k.m112240b(cVar, "hooker");
            this.f106976q = cVar;
            return this;
        }

        /* renamed from: b */
        public final C42350b mo86269b(Comparator<C42307b> comparator) {
            C52711k.m112240b(comparator, "comparator");
            C17638bb<C42307b> a = C17638bb.m43358a(comparator);
            C52711k.m112236a((Object) a, "Ordering.from(comparator)");
            this.f106966g = a;
            return this;
        }

        /* renamed from: a */
        public final C42350b mo86261a(C42354e eVar) {
            C52711k.m112240b(eVar, "listener");
            this.f106975p = eVar;
            return this;
        }

        /* renamed from: a */
        public final C42350b mo86262a(C42357g gVar) {
            C52711k.m112240b(gVar, "action");
            this.f106961b.add(gVar);
            return this;
        }

        /* renamed from: a */
        public final C42350b mo86263a(String str) {
            C52711k.m112240b(str, "channelKey");
            this.f106962c.add(str);
            return this;
        }

        /* renamed from: a */
        public final C42350b mo86264a(Comparator<C42357g> comparator) {
            C52711k.m112240b(comparator, "comparator");
            C17638bb<C42357g> a = C17638bb.m43358a(comparator);
            C52711k.m112236a((Object) a, "Ordering.from(comparator)");
            this.f106965f = a;
            return this;
        }

        /* renamed from: a */
        public final C42350b mo86265a(boolean z) {
            this.f106964e = true;
            return this;
        }
    }

    private C42348d(C42350b bVar) {
        C17638bb<C42307b> bbVar = bVar.f106966g;
        List<C42307b> list = bVar.f106960a;
        C52575l.m112110a((List) list, (C52671b) new C42349a(bVar));
        Iterable iterable = list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (hashSet.add(((C42307b) next).mo86136b())) {
                arrayList.add(next);
            }
        }
        Iterable iterable2 = arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next2 : iterable2) {
            if (((Boolean) bVar.f106967h.invoke((C42307b) next2)).booleanValue()) {
                arrayList2.add(next2);
            }
        }
        List<C42307b> a = bbVar.mo34233a((Iterable<E>) (List) arrayList2);
        C52711k.m112236a((Object) a, "builder.channelComparato…lder.channelFilter(it) })");
        this.f106945a = a;
        C17638bb<C42357g> bbVar2 = bVar.f106965f;
        Iterable iterable3 = bVar.f106961b;
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : iterable3) {
            if (hashSet2.add(((C42357g) next3).mo49954c())) {
                arrayList3.add(next3);
            }
        }
        List<C42357g> a2 = bbVar2.mo34233a((Iterable<E>) arrayList3);
        C52711k.m112236a((Object) a2, "builder.actionComparator….distinctBy { it.key() })");
        this.f106946b = a2;
        this.f106947c = bVar.f106963d;
        this.f106948d = bVar.f106964e;
        this.f106949e = bVar.f106968i;
        this.f106950f = bVar.f106969j;
        this.f106951g = bVar.f106970k;
        this.f106952h = bVar.f106971l;
        SharePackage sharePackage = bVar.f106972m;
        if (sharePackage == null) {
            C52711k.m112234a();
        }
        this.f106953i = sharePackage;
        this.f106954j = bVar.f106973n;
        this.f106955k = bVar.f106974o;
        this.f106956l = bVar.f106975p;
        this.f106957m = bVar.f106976q;
        this.f106958n = bVar.f106977r;
    }

    public /* synthetic */ C42348d(C42350b bVar, C52707g gVar) {
        this(bVar);
    }
}
