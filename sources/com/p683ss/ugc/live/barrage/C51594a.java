package com.p683ss.ugc.live.barrage;

import com.p683ss.ugc.live.barrage.p2602a.C51596a;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a.C51598a;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a.C51601d;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.live.barrage.a */
public final class C51594a extends CopyOnWriteArrayList<C51596a> {

    /* renamed from: a */
    private C51595a f128875a;

    /* renamed from: com.ss.ugc.live.barrage.a$a */
    public interface C51595a {
        /* renamed from: a */
        void mo105537a(boolean z, C51596a aVar);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(C51596a aVar) {
        return super.contains(aVar);
    }

    public final /* bridge */ int indexOf(C51596a aVar) {
        return super.indexOf(aVar);
    }

    public final /* bridge */ int lastIndexOf(C51596a aVar) {
        return super.lastIndexOf(aVar);
    }

    public final C51596a remove(int i) {
        return remove(i);
    }

    public final void setOnChangeListener(C51595a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f128875a = aVar;
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C51596a;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return contains((C51596a) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C51596a;
        } else {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return indexOf((C51596a) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C51596a;
        } else {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return lastIndexOf((C51596a) obj);
    }

    public final boolean remove(C51596a aVar) {
        boolean remove = super.remove(aVar);
        if (aVar != null) {
            aVar.mo105539a((C51597a) C51598a.f128883a);
            C51595a aVar2 = this.f128875a;
            if (aVar2 != null) {
                aVar2.mo105537a(false, aVar);
            }
        }
        return remove;
    }

    /* renamed from: removeAt */
    public final C51596a remove(int i) {
        C51596a aVar = (C51596a) super.remove(i);
        if (aVar != null) {
            aVar.mo105539a((C51597a) C51598a.f128883a);
            C51595a aVar2 = this.f128875a;
            if (aVar2 != null) {
                aVar2.mo105537a(false, aVar);
            }
        }
        C52711k.m112236a((Object) aVar, "barrage");
        return aVar;
    }

    public final boolean add(C51596a aVar) {
        C52711k.m112240b(aVar, "element");
        boolean add = super.add(aVar);
        aVar.mo105539a((C51597a) C51601d.f128886a);
        C51595a aVar2 = this.f128875a;
        if (aVar2 != null) {
            aVar2.mo105537a(true, aVar);
        }
        return add;
    }

    public final /* bridge */ boolean remove(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C51596a;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return remove((C51596a) obj);
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C52711k.m112240b(collection, "elements");
        boolean removeAll = super.removeAll(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C51596a aVar = (C51596a) it.next();
            if (aVar != null) {
                aVar.mo105539a((C51597a) C51598a.f128883a);
                C51595a aVar2 = this.f128875a;
                if (aVar2 != null) {
                    aVar2.mo105537a(false, aVar);
                }
            }
        }
        return removeAll;
    }

    public final boolean addAll(Collection<? extends C51596a> collection) {
        C52711k.m112240b(collection, "elements");
        boolean addAll = super.addAll(collection);
        for (C51596a aVar : collection) {
            aVar.mo105539a((C51597a) C51601d.f128886a);
            C51595a aVar2 = this.f128875a;
            if (aVar2 != null) {
                aVar2.mo105537a(true, aVar);
            }
        }
        return addAll;
    }

    public final void add(int i, C51596a aVar) {
        C52711k.m112240b(aVar, "element");
        super.add(i, aVar);
        aVar.mo105539a((C51597a) C51601d.f128886a);
        C51595a aVar2 = this.f128875a;
        if (aVar2 != null) {
            aVar2.mo105537a(true, aVar);
        }
    }

    public final boolean addAll(int i, Collection<? extends C51596a> collection) {
        C52711k.m112240b(collection, "elements");
        boolean addAll = super.addAll(i, collection);
        for (C51596a aVar : collection) {
            aVar.mo105539a((C51597a) C51601d.f128886a);
            C51595a aVar2 = this.f128875a;
            if (aVar2 != null) {
                aVar2.mo105537a(true, aVar);
            }
        }
        return addAll;
    }
}
