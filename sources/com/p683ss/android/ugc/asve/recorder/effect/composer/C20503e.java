package com.p683ss.android.ugc.asve.recorder.effect.composer;

import com.p683ss.android.ugc.asve.recorder.effect.composer.C20496a.C20498b;
import com.p683ss.android.vesdk.C50601ah;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.e */
public final class C20503e implements C20499b {

    /* renamed from: a */
    private final HashMap<Integer, List<ComposerInfo>> f56169a = new HashMap<>(8);

    /* renamed from: b */
    private final C50601ah f56170b;

    /* renamed from: b */
    public final void mo43487b() {
        this.f56169a.clear();
        m51416a();
    }

    /* renamed from: e */
    public final C20501c mo43518e() {
        return new C20496a(this);
    }

    /* renamed from: a */
    private final void m51416a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collection<List> values = this.f56169a.values();
        C52711k.m112236a((Object) values, "nodeMap.values");
        for (List<ComposerInfo> list : values) {
            C52711k.m112236a((Object) list, "it");
            for (ComposerInfo composerInfo : list) {
                arrayList.add(composerInfo.f56151a);
                arrayList2.add(composerInfo.f56152b);
            }
        }
        C50601ah ahVar = this.f56170b;
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = arrayList.size();
            Object[] array2 = arrayList2.toArray(new String[0]);
            if (array2 != null) {
                ahVar.mo98777a(strArr, size, (String[]) array2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: n */
    public final void mo43537n(boolean z) {
        this.f56170b.mo98843c(z ? 1 : 0, 0);
    }

    public C20503e(C50601ah ahVar) {
        C52711k.m112240b(ahVar, "recoder");
        this.f56170b = ahVar;
    }

    /* renamed from: a */
    private static String m51415a(String str) {
        List b = C52830p.m112452b((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
        if (b.size() < 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) b.get(0));
        sb.append(':');
        sb.append((String) b.get(1));
        return sb.toString();
    }

    /* renamed from: a */
    private final void m51417a(C20498b bVar) {
        String str = bVar.f56160c;
        Set<Integer> keySet = this.f56169a.keySet();
        C52711k.m112236a((Object) keySet, "nodeMap.keys");
        for (Integer num : keySet) {
            List list = (List) this.f56169a.get(num);
            if (list != null) {
                Iterator it = list.iterator();
                if (it != null) {
                    while (it.hasNext()) {
                        if (C52711k.m112239a((Object) str, (Object) ((ComposerInfo) it.next()).f56151a)) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo43561a(C20496a aVar) {
        C52711k.m112240b(aVar, "composerOperation");
        if (aVar.f56155a.size() > 0) {
            for (C20498b bVar : aVar.f56155a) {
                switch (bVar.f56158a) {
                    case 0:
                        this.f56169a.clear();
                        this.f56170b.mo98776a(new String[0], 0);
                        break;
                    case 1:
                        List list = (List) this.f56169a.get(Integer.valueOf(bVar.f56159b));
                        if (list != null) {
                            ComposerInfo composerInfo = new ComposerInfo(bVar.f56160c, bVar.f56163f, null, 4, null);
                            list.add(composerInfo);
                            break;
                        } else {
                            List arrayList = new ArrayList();
                            ComposerInfo composerInfo2 = new ComposerInfo(bVar.f56160c, bVar.f56163f, null, 4, null);
                            arrayList.add(composerInfo2);
                            this.f56169a.put(Integer.valueOf(bVar.f56159b), arrayList);
                            break;
                        }
                    case 2:
                        m51417a(bVar);
                        break;
                    case 3:
                        this.f56169a.remove(Integer.valueOf(bVar.f56159b));
                        break;
                }
            }
            m51416a();
        }
        for (C20498b bVar2 : aVar.f56156b) {
            if (bVar2.f56159b != -1) {
                List<ComposerInfo> list2 = (List) this.f56169a.get(Integer.valueOf(bVar2.f56159b));
                if (list2 != null) {
                    for (ComposerInfo composerInfo3 : list2) {
                        CharSequence charSequence = composerInfo3.f56151a;
                        StringBuilder sb = new StringBuilder();
                        sb.append(bVar2.f56160c);
                        sb.append(";");
                        sb.append(bVar2.f56161d);
                        if (C52830p.m112456b(charSequence, (CharSequence) sb.toString(), false, 2, (Object) null)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(bVar2.f56160c);
                            sb2.append(";");
                            sb2.append(bVar2.f56161d);
                            sb2.append(";");
                            sb2.append(bVar2.f56162e);
                            composerInfo3.mo43542a(sb2.toString());
                        }
                    }
                }
            }
            this.f56170b.mo98829b(bVar2.f56160c, bVar2.f56161d, bVar2.f56162e);
        }
    }

    /* renamed from: d */
    public final void mo43514d(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        List list2 = (List) this.f56169a.get(Integer.valueOf(i));
        if (list2 != null) {
            list2.clear();
        } else {
            list2 = new ArrayList();
            this.f56169a.put(Integer.valueOf(i), list2);
        }
        list2.addAll(list);
        m51416a();
    }

    /* renamed from: b */
    public final void mo43497b(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        List list2 = (List) this.f56169a.get(Integer.valueOf(i));
        if (list2 != null) {
            list2.removeAll(list);
            Iterable<ComposerInfo> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (ComposerInfo composerInfo : iterable) {
                arrayList.add(composerInfo.f56151a);
            }
            List list3 = (List) arrayList;
            C50601ah ahVar = this.f56170b;
            Object[] array = list3.toArray(new String[0]);
            if (array != null) {
                ahVar.mo98831b((String[]) array, list3.size());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new Exception("should not go this case ");
    }

    /* renamed from: c */
    public final void mo43505c(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56169a.clear();
        this.f56169a.put(Integer.valueOf(i), new ArrayList());
        for (ComposerInfo composerInfo : list) {
            List list2 = (List) this.f56169a.get(Integer.valueOf(i));
            if (list2 != null) {
                list2.add(composerInfo);
            }
        }
        m51416a();
    }

    /* renamed from: a */
    public final void mo43476a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        List list2 = (List) this.f56169a.get(Integer.valueOf(i));
        if (list2 == null) {
            List arrayList = new ArrayList();
            arrayList.addAll(list);
            this.f56169a.put(Integer.valueOf(i), arrayList);
        } else {
            Collection collection = list;
            list2.removeAll(collection);
            list2.addAll(collection);
        }
        Iterable<ComposerInfo> iterable = list;
        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ComposerInfo composerInfo : iterable) {
            arrayList2.add(composerInfo.f56151a);
        }
        List list3 = (List) arrayList2;
        Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ComposerInfo composerInfo2 : iterable) {
            arrayList3.add(composerInfo2.f56152b);
        }
        List list4 = (List) arrayList3;
        C50601ah ahVar = this.f56170b;
        Object[] array = list3.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = list3.size();
            Object[] array2 = list4.toArray(new String[0]);
            if (array2 != null) {
                ahVar.mo98832b(strArr, size, (String[]) array2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public final void mo43477a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldNodes");
        C52711k.m112240b(list2, "newNodes");
        List list3 = (List) this.f56169a.get(Integer.valueOf(i));
        if (list3 == null) {
            List arrayList = new ArrayList();
            arrayList.removeAll(list);
            arrayList.addAll(list2);
            this.f56169a.put(Integer.valueOf(i), arrayList);
        } else {
            list3.removeAll(list);
            list3.addAll(list2);
        }
        Iterable<ComposerInfo> iterable = list;
        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ComposerInfo composerInfo : iterable) {
            arrayList2.add(m51415a(composerInfo.f56151a));
        }
        List list4 = (List) arrayList2;
        Iterable<ComposerInfo> iterable2 = list2;
        Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable2, 10));
        for (ComposerInfo composerInfo2 : iterable2) {
            arrayList3.add(composerInfo2.f56151a);
        }
        List list5 = (List) arrayList3;
        Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable2, 10));
        for (ComposerInfo composerInfo3 : iterable2) {
            arrayList4.add(composerInfo3.f56152b);
        }
        List list6 = (List) arrayList4;
        C50601ah ahVar = this.f56170b;
        Object[] array = list4.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = list4.size();
            Object[] array2 = list5.toArray(new String[0]);
            if (array2 != null) {
                String[] strArr2 = (String[]) array2;
                int size2 = list5.size();
                Object[] array3 = list6.toArray(new String[0]);
                if (array3 != null) {
                    ahVar.mo98778a(strArr, size, strArr2, size2, (String[]) array3);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
