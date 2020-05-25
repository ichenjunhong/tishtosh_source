package android.support.p030v4.widget;

import android.support.p030v4.p038f.C0795l.C0796a;
import android.support.p030v4.p038f.C0795l.C0797b;
import android.support.p030v4.p038f.C0800n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.widget.h */
public final class C1108h<T> {

    /* renamed from: a */
    public final C0796a<ArrayList<T>> f3537a = new C0797b(10);

    /* renamed from: b */
    public final C0800n<T, ArrayList<T>> f3538b = new C0800n<>();

    /* renamed from: c */
    private final ArrayList<T> f3539c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3540d = new HashSet<>();

    /* renamed from: a */
    public final ArrayList<T> mo3553a() {
        this.f3539c.clear();
        this.f3540d.clear();
        int size = this.f3538b.size();
        for (int i = 0; i < size; i++) {
            m3228a(this.f3538b.mo2576b(i), this.f3539c, this.f3540d);
        }
        return this.f3539c;
    }

    /* renamed from: a */
    public final void mo3554a(T t) {
        if (!this.f3538b.containsKey(t)) {
            this.f3538b.put(t, null);
        }
    }

    /* renamed from: b */
    public final List mo3555b(T t) {
        return (List) this.f3538b.get(t);
    }

    /* renamed from: c */
    public final List<T> mo3556c(T t) {
        int size = this.f3538b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f3538b.mo2577c(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3538b.mo2576b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m3228a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f3538b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m3228a(arrayList2.get(i), arrayList, hashSet);
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
