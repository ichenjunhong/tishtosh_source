package com.bytedance.jedi.ext.adapter.p747b;

import android.support.p043v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.internal.C11977a;
import com.bytedance.jedi.ext.adapter.p747b.C11949e;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.ext.adapter.b.g */
public class C11954g<VH extends C11949e<?>> implements C11959h<VH> {

    /* renamed from: a */
    private final SparseArray<C52671b<ViewGroup, VH>> f31647a = new SparseArray<>();

    /* renamed from: b */
    public final C11977a f31648b;

    /* renamed from: c */
    private int f31649c = 11513600;

    /* renamed from: d */
    private final List<C11955a<VH>> f31650d;

    /* renamed from: com.bytedance.jedi.ext.adapter.b.g$a */
    static final class C11955a<VH> {

        /* renamed from: a */
        public final C52671b<ViewGroup, VH> f31651a;

        /* renamed from: b */
        public final C52671b<Integer, Boolean> f31652b;

        /* renamed from: c */
        public final int f31653c;

        /* renamed from: d */
        public final C52682m<Integer, RecyclerView, C52860x> f31654d;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f31654d, (java.lang.Object) r3.f31654d) != false) goto L_0x002f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x002f
                boolean r0 = r3 instanceof com.bytedance.jedi.ext.adapter.p747b.C11954g.C11955a
                if (r0 == 0) goto L_0x002d
                com.bytedance.jedi.ext.adapter.b.g$a r3 = (com.bytedance.jedi.ext.adapter.p747b.C11954g.C11955a) r3
                d.f.a.b<android.view.ViewGroup, VH> r0 = r2.f31651a
                d.f.a.b<android.view.ViewGroup, VH> r1 = r3.f31651a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x002d
                d.f.a.b<java.lang.Integer, java.lang.Boolean> r0 = r2.f31652b
                d.f.a.b<java.lang.Integer, java.lang.Boolean> r1 = r3.f31652b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x002d
                int r0 = r2.f31653c
                int r1 = r3.f31653c
                if (r0 != r1) goto L_0x002d
                d.f.a.m<java.lang.Integer, android.support.v7.widget.RecyclerView, d.x> r0 = r2.f31654d
                d.f.a.m<java.lang.Integer, android.support.v7.widget.RecyclerView, d.x> r3 = r3.f31654d
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r3 = 0
                return r3
            L_0x002f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.p747b.C11954g.C11955a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C52671b<ViewGroup, VH> bVar = this.f31651a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            C52671b<Integer, Boolean> bVar2 = this.f31652b;
            int hashCode2 = (((hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31) + this.f31653c) * 31;
            C52682m<Integer, RecyclerView, C52860x> mVar = this.f31654d;
            if (mVar != null) {
                i = mVar.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HolderCreator(factory=");
            sb.append(this.f31651a);
            sb.append(", typeMatcher=");
            sb.append(this.f31652b);
            sb.append(", viewType=");
            sb.append(this.f31653c);
            sb.append(", onAttachedToRecyclerView=");
            sb.append(this.f31654d);
            sb.append(")");
            return sb.toString();
        }

        public C11955a(C52671b<? super ViewGroup, ? extends VH> bVar, C52671b<? super Integer, Boolean> bVar2, int i, C52682m<? super Integer, ? super RecyclerView, C52860x> mVar) {
            C52711k.m112240b(bVar, "factory");
            C52711k.m112240b(bVar2, "typeMatcher");
            this.f31651a = bVar;
            this.f31652b = bVar2;
            this.f31653c = i;
            this.f31654d = mVar;
        }

        public /* synthetic */ C11955a(C52671b bVar, C52671b bVar2, int i, C52682m mVar, int i2, C52707g gVar) {
            this(bVar, bVar2, i, null);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.b.g$b */
    static final class C11956b extends C52712l implements C52671b<ViewGroup, VH> {

        /* renamed from: a */
        final /* synthetic */ C11954g f31655a;

        C11956b(C11954g gVar) {
            this.f31655a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            return this.f31655a.mo22694a(viewGroup);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.b.g$c */
    static final class C11957c extends C52712l implements C52671b<Integer, Boolean> {

        /* renamed from: a */
        public static final C11957c f31656a = new C11957c();

        C11957c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.b.g$d */
    static final class C11958d extends C52712l implements C52671b<Integer, Boolean> {

        /* renamed from: a */
        public static final C11958d f31657a = new C11958d();

        C11958d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return Boolean.valueOf(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public VH mo22693a(int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public VH mo22696a(VH vh) {
        C52711k.m112240b(vh, "holder");
        return vh;
    }

    public C11954g() {
        C52671b bVar = new C11956b(this);
        C52671b bVar2 = C11957c.f31656a;
        int i = this.f31649c;
        this.f31649c = i + 1;
        C11955a aVar = new C11955a(bVar, bVar2, i, null, 8, null);
        this.f31650d = C52575l.m112101c(aVar);
        this.f31648b = new C11977a();
    }

    /* renamed from: b */
    public final void mo22702b(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        this.f31648b.mo22716b(recyclerView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public VH mo22694a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        return (C11949e) new C11945a(viewGroup);
    }

    /* renamed from: b */
    public final int mo22701b(int i) {
        Object obj;
        Iterator it = this.f31650d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) ((C11955a) obj).f31652b.invoke(Integer.valueOf(i))).booleanValue()) {
                break;
            }
        }
        C11955a aVar = (C11955a) obj;
        if (aVar != null) {
            C52671b<ViewGroup, VH> bVar = aVar.f31651a;
            int i2 = aVar.f31653c;
            if (this.f31647a.get(i2) == null) {
                this.f31647a.put(i2, bVar);
            }
            return i2;
        }
        throw new IllegalArgumentException("no factory is registered for this item type".toString());
    }

    /* renamed from: a */
    public final void mo22699a(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        this.f31648b.mo22715a(recyclerView);
        for (C11955a aVar : this.f31650d) {
            int i = aVar.f31653c;
            C52682m<Integer, RecyclerView, C52860x> mVar = aVar.f31654d;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(i), recyclerView);
            }
        }
    }

    /* renamed from: a */
    public final void mo22700a(boolean z) {
        this.f31648b.f31691a = z;
    }

    /* renamed from: a */
    public final VH mo22695a(ViewGroup viewGroup, int i) {
        boolean z;
        C52711k.m112240b(viewGroup, "parent");
        VH a = mo22693a(i);
        if (a != null) {
            return a;
        }
        if (this.f31647a.indexOfKey(i) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object obj = this.f31647a.get(i);
            C52711k.m112236a(obj, "factories[viewType]");
            VH vh = (C11949e) ((C52671b) obj).invoke(viewGroup);
            mo22696a(vh);
            return vh;
        }
        StringBuilder sb = new StringBuilder("no factory for viewType ");
        sb.append(i);
        sb.append(" is registered");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public final C11959h<VH> mo22698a(C52671b<? super Integer, Boolean> bVar, C52682m<? super Integer, ? super RecyclerView, C52860x> mVar, C52671b<? super ViewGroup, ? extends VH> bVar2) {
        C52711k.m112240b(bVar, "typeMatcher");
        C52711k.m112240b(bVar2, "factory");
        int size = this.f31650d.size();
        List<C11955a<VH>> list = this.f31650d;
        int i = size - 1;
        int i2 = this.f31649c;
        this.f31649c = i2 + 1;
        list.add(i, new C11955a(bVar2, bVar, i2, mVar));
        return this;
    }

    /* renamed from: a */
    public final C11959h<VH> mo22697a(int i, C52682m<? super Integer, ? super RecyclerView, C52860x> mVar, C52671b<? super ViewGroup, ? extends VH> bVar) {
        boolean z;
        C52711k.m112240b(bVar, "factory");
        C52671b bVar2 = (C52671b) this.f31647a.get(i);
        if (bVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f31650d.add(this.f31650d.size() - 1, new C11955a(bVar, C11958d.f31657a, i, mVar));
            this.f31647a.put(i, bVar);
            return this;
        }
        StringBuilder sb = new StringBuilder("factory's viewType ");
        sb.append(i);
        sb.append(' ');
        sb.append(bVar2.getClass().getSimpleName());
        sb.append(" is already registered");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static void m24330a(VH vh, Object obj, int i, List<Object> list) {
        C52711k.m112240b(vh, "holder");
        if (obj != null) {
            vh.mo22667b(obj, i, list);
        }
    }
}
