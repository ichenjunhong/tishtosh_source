package android.arch.lifecycle;

import android.arch.p006a.p008b.C0046b;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.p */
public final class C0195p<T> extends C0198r<T> {

    /* renamed from: a */
    private C0046b<LiveData<?>, C0196a<?>> f463a = new C0046b<>();

    /* renamed from: android.arch.lifecycle.p$a */
    static class C0196a<V> implements C0199s<V> {

        /* renamed from: a */
        final LiveData<V> f464a;

        /* renamed from: b */
        final C0199s<V> f465b;

        /* renamed from: c */
        int f466c = -1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo343a() {
            this.f464a.observeForever(this);
        }

        public final void onChanged(V v) {
            if (this.f466c != this.f464a.mVersion) {
                this.f466c = this.f464a.mVersion;
                this.f465b.onChanged(v);
            }
        }

        C0196a(LiveData<V> liveData, C0199s<V> sVar) {
            this.f464a = liveData;
            this.f465b = sVar;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActive() {
        Iterator it = this.f463a.iterator();
        while (it.hasNext()) {
            ((C0196a) ((Entry) it.next()).getValue()).mo343a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onInactive() {
        Iterator it = this.f463a.iterator();
        while (it.hasNext()) {
            C0196a aVar = (C0196a) ((Entry) it.next()).getValue();
            aVar.f464a.removeObserver(aVar);
        }
    }

    /* renamed from: a */
    public final <S> void mo342a(LiveData<S> liveData, C0199s<S> sVar) {
        C0196a aVar = new C0196a(liveData, sVar);
        C0196a aVar2 = (C0196a) this.f463a.mo62a(liveData, aVar);
        if (aVar2 == null || aVar2.f465b == sVar) {
            if (aVar2 == null && hasActiveObservers()) {
                aVar.mo343a();
            }
            return;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }
}
