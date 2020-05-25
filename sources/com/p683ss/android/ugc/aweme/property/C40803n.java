package com.p683ss.android.ugc.aweme.property;

import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.property.n */
public final class C40803n {

    /* renamed from: c */
    public static final C40804a f103930c = new C40804a(null);

    /* renamed from: a */
    public final int f103931a = this.f103932b.size();

    /* renamed from: b */
    public final ArrayList<C40776c> f103932b;

    /* renamed from: com.ss.android.ugc.aweme.property.n$a */
    public static final class C40804a {
        private C40804a() {
        }

        /* renamed from: b */
        public final C40803n mo83135b() {
            C40789h hVar = C39618d.f101152P;
            C52711k.m112236a((Object) hVar, "AVEnv.AB");
            Map a = hVar.f103907a.mo83091a();
            Collection arrayList = new ArrayList(a.size());
            for (Entry entry : a.entrySet()) {
                C40762a aVar = (C40762a) entry.getValue();
                C40816u uVar = new C40816u("vesdk", (String) entry.getKey(), "", "", "", "");
                arrayList.add(new C40776c(aVar, uVar));
            }
            ArrayList arrayList2 = new ArrayList((List) arrayList);
            m90269a(arrayList2);
            return new C40803n(arrayList2);
        }

        /* renamed from: a */
        public final C40803n mo83134a() {
            Object[] enumConstants = C40796a.class.getEnumConstants();
            C52711k.m112236a((Object) enumConstants, "AVSettings.Property::class.java.enumConstants");
            Collection arrayList = new ArrayList(enumConstants.length);
            int length = enumConstants.length;
            int i = 0;
            while (i < length) {
                C40796a aVar = (C40796a) enumConstants[i];
                C52711k.m112236a((Object) aVar, "it");
                C40762a aVar2 = aVar;
                C52711k.m112240b(aVar, "$this$getItemMoreMessage");
                C40808o oVar = (C40808o) aVar.getClass().getField(aVar.name()).getAnnotation(C40808o.class);
                if (oVar != null) {
                    arrayList.add(new C40776c(aVar2, C40793j.m90225a(oVar)));
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("Item (");
                    sb.append(aVar.name());
                    sb.append(") 配置项必须由 DetailMessage 进行注解 有问题@liuhao.65537");
                    throw new RuntimeException(sb.toString());
                }
            }
            ArrayList arrayList2 = new ArrayList((List) arrayList);
            m90269a(arrayList2);
            C40809p pVar = C40809p.f103935b;
            C52711k.m112240b(pVar, "$this$getMoreMessage");
            C40808o oVar2 = (C40808o) C40809p.f103935b.getClass().getAnnotation(C40808o.class);
            if (oVar2 == null) {
                C52711k.m112234a();
            }
            arrayList2.add(new C40775b(pVar, C40793j.m90225a(oVar2), C40809p.f103934a));
            return new C40803n(arrayList2);
        }

        public /* synthetic */ C40804a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m90269a(ArrayList<C40776c> arrayList) {
            for (C40776c cVar : arrayList) {
                if (!C52711k.m112239a((Object) cVar.f103885c, (Object) "")) {
                    if (C52711k.m112239a((Object) cVar.mo83094b(), (Object) "")) {
                    }
                }
                StringBuilder sb = new StringBuilder("Item (");
                sb.append(cVar.f103887e.key());
                sb.append(") 的中文 key 或者英文 key 不能为空。有问题@liuhao.65537");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.n$b */
    public static final class C40805b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(((C40776c) t).mo83093a(), ((C40776c) t2).mo83093a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.n$c */
    public static final class C40806c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(((C40776c) t).f103885c, ((C40776c) t2).f103885c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.n$d */
    static final class C40807d extends C52712l implements C52671b<C40776c, String> {

        /* renamed from: a */
        public static final C40807d f103933a = new C40807d();

        C40807d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C40776c cVar = (C40776c) obj;
            C52711k.m112240b(cVar, "it");
            return cVar.toString();
        }
    }

    /* renamed from: a */
    private static C40803n m90262a(ArrayList<C40776c> arrayList) {
        C52711k.m112240b(arrayList, "listOfItemBean");
        return new C40803n(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f103932b, (java.lang.Object) ((com.p683ss.android.ugc.aweme.property.C40803n) r2).f103932b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.property.C40803n
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.property.n r2 = (com.p683ss.android.ugc.aweme.property.C40803n) r2
            java.util.ArrayList<com.ss.android.ugc.aweme.property.c> r0 = r1.f103932b
            java.util.ArrayList<com.ss.android.ugc.aweme.property.c> r2 = r2.f103932b
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.property.C40803n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList<C40776c> arrayList = this.f103932b;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    /* renamed from: c */
    public final C40803n mo83130c() {
        return m90262a(new ArrayList<>(this.f103932b));
    }

    /* renamed from: b */
    public final void mo83129b() {
        List list = this.f103932b;
        if (list.size() > 1) {
            C52575l.m112105a(list, new C40806c());
        }
    }

    public final String toString() {
        String a = C52575l.m112120a(this.f103932b, "\n", null, null, 0, null, C40807d.f103933a, 30, null);
        StringBuilder sb = new StringBuilder("AllItems(_ItemBeanList=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo83127a() {
        List list = this.f103932b;
        if (list.size() > 1) {
            C52575l.m112105a(list, new C40805b());
        }
    }

    public C40803n(ArrayList<C40776c> arrayList) {
        C52711k.m112240b(arrayList, "listOfItemBean");
        this.f103932b = arrayList;
    }

    /* renamed from: a */
    public final C40776c mo83125a(int i) {
        Object obj = this.f103932b.get(i);
        C52711k.m112236a(obj, "listOfItemBean[index]");
        return (C40776c) obj;
    }

    /* renamed from: a */
    public final C40803n mo83126a(C52671b<? super C40776c, Boolean> bVar) {
        C52711k.m112240b(bVar, "predicate");
        Iterable iterable = this.f103932b;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Boolean) bVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return new C40803n(new ArrayList((List) arrayList));
    }

    /* renamed from: b */
    public final int mo83128b(C52671b<? super C40776c, Boolean> bVar) {
        C52711k.m112240b(bVar, "predicate");
        int i = 0;
        for (Object invoke : this.f103932b) {
            if (((Boolean) bVar.invoke(invoke)).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
