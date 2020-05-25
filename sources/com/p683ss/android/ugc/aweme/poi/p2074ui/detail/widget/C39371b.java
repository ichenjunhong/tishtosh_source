package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget;

import android.support.p030v4.p038f.C0795l.C0796a;
import android.support.p030v4.p038f.C0795l.C0797b;
import android.support.p030v4.p038f.C0800n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.b */
public final class C39371b<T> {

    /* renamed from: a */
    final C0796a<ArrayList<T>> f100714a = new C0797b(10);

    /* renamed from: b */
    final C0800n<T, ArrayList<T>> f100715b = new C0800n<>();

    /* renamed from: c */
    private final ArrayList<T> f100716c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f100717d = new HashSet<>();

    /* renamed from: a */
    public final ArrayList<T> mo80335a() {
        this.f100716c.clear();
        this.f100717d.clear();
        int size = this.f100715b.size();
        for (int i = 0; i < size; i++) {
            m87537a(this.f100715b.mo2576b(i), this.f100716c, this.f100717d);
        }
        return this.f100716c;
    }

    /* renamed from: a */
    public final void mo80336a(T t) {
        if (!this.f100715b.containsKey(t)) {
            this.f100715b.put(t, null);
        }
    }

    /* renamed from: b */
    public final List mo80337b(T t) {
        return (List) this.f100715b.get(t);
    }

    /* renamed from: c */
    public final List<T> mo80338c(T t) {
        int size = this.f100715b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f100715b.mo2577c(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f100715b.mo2576b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m87537a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f100715b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m87537a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
