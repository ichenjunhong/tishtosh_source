package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import java.util.LinkedList;

/* renamed from: com.facebook.imagepipeline.memory.g */
public final class C14076g<T> {

    /* renamed from: a */
    protected final SparseArray<C14078a<T>> f36794a = new SparseArray<>();

    /* renamed from: b */
    C14078a<T> f36795b;

    /* renamed from: c */
    C14078a<T> f36796c;

    /* renamed from: com.facebook.imagepipeline.memory.g$a */
    static class C14078a<I> {

        /* renamed from: a */
        C14078a<I> f36797a;

        /* renamed from: b */
        int f36798b;

        /* renamed from: c */
        LinkedList<I> f36799c;

        /* renamed from: d */
        C14078a<I> f36800d;

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkedEntry(key: ");
            sb.append(this.f36798b);
            sb.append(")");
            return sb.toString();
        }

        private C14078a(C14078a<I> aVar, int i, LinkedList<I> linkedList, C14078a<I> aVar2) {
            this.f36797a = aVar;
            this.f36798b = i;
            this.f36799c = linkedList;
            this.f36800d = aVar2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized T mo26336a() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.facebook.imagepipeline.memory.g$a<T> r0 = r3.f36796c     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)
            return r0
        L_0x0008:
            java.util.LinkedList<I> r1 = r0.f36799c     // Catch:{ all -> 0x0024 }
            java.lang.Object r1 = r1.pollLast()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            java.util.LinkedList<I> r2 = r0.f36799c     // Catch:{ all -> 0x0024 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0022
            r3.m28798a(r0)     // Catch:{ all -> 0x0024 }
            android.util.SparseArray<com.facebook.imagepipeline.memory.g$a<T>> r2 = r3.f36794a     // Catch:{ all -> 0x0024 }
            int r0 = r0.f36798b     // Catch:{ all -> 0x0024 }
            r2.remove(r0)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r3)
            return r1
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C14076g.mo26336a():java.lang.Object");
    }

    /* renamed from: b */
    private void m28799b(C14078a<T> aVar) {
        if (this.f36795b != aVar) {
            m28798a(aVar);
            if (this.f36795b == null) {
                this.f36795b = aVar;
                this.f36796c = aVar;
                return;
            }
            aVar.f36800d = this.f36795b;
            this.f36795b.f36797a = aVar;
            this.f36795b = aVar;
        }
    }

    /* renamed from: a */
    public final synchronized T mo26337a(int i) {
        C14078a aVar = (C14078a) this.f36794a.get(i);
        if (aVar == null) {
            return null;
        }
        T pollFirst = aVar.f36799c.pollFirst();
        m28799b(aVar);
        return pollFirst;
    }

    /* renamed from: a */
    private synchronized void m28798a(C14078a<T> aVar) {
        C14078a<I> aVar2 = aVar.f36797a;
        C14078a<I> aVar3 = aVar.f36800d;
        if (aVar2 != null) {
            aVar2.f36800d = aVar3;
        }
        if (aVar3 != null) {
            aVar3.f36797a = aVar2;
        }
        aVar.f36797a = null;
        aVar.f36800d = null;
        if (aVar == this.f36795b) {
            this.f36795b = aVar3;
        }
        if (aVar == this.f36796c) {
            this.f36796c = aVar2;
        }
    }

    /* renamed from: a */
    public final synchronized void mo26338a(int i, T t) {
        C14078a aVar = (C14078a) this.f36794a.get(i);
        if (aVar == null) {
            aVar = new C14078a(i, new LinkedList());
            this.f36794a.put(i, aVar);
        }
        aVar.f36799c.addLast(t);
        m28799b(aVar);
    }
}
