package com.p683ss.android.ugc.asve.recorder.effect.composer;

import com.p683ss.android.medialib.presenter.C19361d;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20496a.C20498b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.d */
public final class C20502d implements C20499b {

    /* renamed from: a */
    final HashMap<Integer, ArrayList<ComposerInfo>> f56167a = new HashMap<>(8);

    /* renamed from: b */
    final C19361d f56168b;

    /* renamed from: b */
    public final void mo43487b() {
        this.f56167a.clear();
        mo43559a();
    }

    /* renamed from: e */
    public final C20501c mo43518e() {
        return new C20496a(this);
    }

    /* renamed from: a */
    public final void mo43559a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collection<ArrayList> values = this.f56167a.values();
        C52711k.m112236a((Object) values, "nodeMap.values");
        for (ArrayList<ComposerInfo> arrayList3 : values) {
            C52711k.m112236a((Object) arrayList3, "it");
            for (ComposerInfo composerInfo : arrayList3) {
                arrayList.add(composerInfo.f56151a);
                arrayList2.add(composerInfo.f56152b);
            }
        }
        C19361d dVar = this.f56168b;
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = arrayList.size();
            Object[] array2 = arrayList2.toArray(new String[0]);
            if (array2 != null) {
                dVar.mo40274a(strArr, size, (String[]) array2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: n */
    public final void mo43537n(boolean z) {
        this.f56168b.mo40366f(z ? 1 : 0, 0);
    }

    public C20502d(C19361d dVar) {
        C52711k.m112240b(dVar, "presenter");
        this.f56168b = dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43560a(C20498b bVar) {
        String str = bVar.f56160c;
        Set<Integer> keySet = this.f56167a.keySet();
        C52711k.m112236a((Object) keySet, "nodeMap.keys");
        for (Integer num : keySet) {
            ArrayList<ComposerInfo> arrayList = (ArrayList) this.f56167a.get(num);
            if (arrayList != null) {
                for (ComposerInfo composerInfo : arrayList) {
                    if (C52711k.m112239a((Object) str, (Object) composerInfo.f56151a)) {
                        arrayList.remove(composerInfo);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo43505c(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56167a.clear();
        this.f56167a.put(Integer.valueOf(i), (ArrayList) list);
        mo43559a();
    }

    /* renamed from: d */
    public final void mo43514d(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        ArrayList arrayList = (ArrayList) this.f56167a.get(Integer.valueOf(i));
        if (arrayList != null) {
            arrayList.clear();
        } else {
            arrayList = new ArrayList();
            this.f56167a.put(Integer.valueOf(i), arrayList);
        }
        arrayList.addAll(list);
        mo43559a();
    }

    /* renamed from: b */
    public final void mo43497b(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        ArrayList arrayList = (ArrayList) this.f56167a.get(Integer.valueOf(i));
        if (arrayList != null) {
            arrayList.removeAll(list);
            Iterable<ComposerInfo> iterable = list;
            Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
            for (ComposerInfo composerInfo : iterable) {
                arrayList2.add(composerInfo.f56151a);
            }
            List list2 = (List) arrayList2;
            C19361d dVar = this.f56168b;
            Object[] array = list2.toArray(new String[0]);
            if (array != null) {
                dVar.mo40325b((String[]) array, list2.size());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new Exception("should not go this case ");
    }

    /* renamed from: a */
    public final void mo43476a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        ArrayList arrayList = (ArrayList) this.f56167a.get(Integer.valueOf(i));
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            this.f56167a.put(Integer.valueOf(i), arrayList2);
        } else {
            arrayList.addAll(list);
        }
        Iterable<ComposerInfo> iterable = list;
        Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ComposerInfo composerInfo : iterable) {
            arrayList3.add(composerInfo.f56151a);
        }
        List list2 = (List) arrayList3;
        Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ComposerInfo composerInfo2 : iterable) {
            arrayList4.add(composerInfo2.f56152b);
        }
        List list3 = (List) arrayList4;
        C19361d dVar = this.f56168b;
        Object[] array = list2.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = list2.size();
            Object[] array2 = list3.toArray(new String[0]);
            if (array2 != null) {
                dVar.mo40326b(strArr, size, (String[]) array2);
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
        ArrayList arrayList = (ArrayList) this.f56167a.get(Integer.valueOf(i));
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.removeAll(list);
            arrayList2.addAll(list2);
            this.f56167a.put(Integer.valueOf(i), arrayList2);
        } else {
            arrayList.removeAll(list);
            arrayList.addAll(list2);
        }
        Iterable<ComposerInfo> iterable = list;
        Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ComposerInfo composerInfo : iterable) {
            arrayList3.add(composerInfo.f56151a);
        }
        List list3 = (List) arrayList3;
        Iterable<ComposerInfo> iterable2 = list2;
        Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable2, 10));
        for (ComposerInfo composerInfo2 : iterable2) {
            arrayList4.add(composerInfo2.f56151a);
        }
        List list4 = (List) arrayList4;
        Collection arrayList5 = new ArrayList(C52575l.m112104a(iterable2, 10));
        for (ComposerInfo composerInfo3 : iterable2) {
            arrayList5.add(composerInfo3.f56152b);
        }
        List list5 = (List) arrayList5;
        C19361d dVar = this.f56168b;
        Object[] array = list3.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = list3.size();
            Object[] array2 = list4.toArray(new String[0]);
            if (array2 != null) {
                String[] strArr2 = (String[]) array2;
                int size2 = list4.size();
                Object[] array3 = list5.toArray(new String[0]);
                if (array3 != null) {
                    dVar.mo40275a(strArr, size, strArr2, size2, (String[]) array3);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
