package com.p683ss.android.ugc.aweme.arch.widgets.base;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.b */
public class C23275b<T> extends C0198r<T> {

    /* renamed from: c */
    private static Handler f62244c = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public int f62245a = -1;

    /* renamed from: b */
    private Map<C0199s, C23277a<T>> f62246b = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.b$a */
    class C23277a<R> implements C0199s<R> {

        /* renamed from: b */
        private int f62250b;

        /* renamed from: c */
        private C0199s<R> f62251c;

        /* renamed from: d */
        private boolean f62252d;

        public final void onChanged(R r) {
            if (this.f62252d || this.f62250b < C23275b.this.f62245a) {
                this.f62251c.onChanged(r);
            }
        }

        C23277a(int i, C0199s<R> sVar, boolean z) {
            this.f62250b = i;
            this.f62251c = sVar;
            this.f62252d = z;
        }
    }

    public void observeForever(C0199s<T> sVar) {
        mo48248a(sVar, false);
    }

    public void postValue(final T t) {
        f62244c.post(new Runnable() {
            public final void run() {
                C23275b.this.setValue(t);
            }
        });
    }

    public void setValue(T t) {
        this.f62245a++;
        super.setValue(t);
    }

    public void removeObserver(C0199s<T> sVar) {
        C23277a aVar = (C23277a) this.f62246b.remove(sVar);
        if (aVar != null) {
            super.removeObserver(aVar);
            return;
        }
        if (sVar instanceof C23277a) {
            C0199s sVar2 = null;
            Iterator it = this.f62246b.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (sVar.equals(entry.getValue())) {
                    sVar2 = (C0199s) entry.getKey();
                    super.removeObserver(sVar);
                    break;
                }
            }
            if (sVar2 != null) {
                this.f62246b.remove(sVar2);
            }
        }
    }

    public void observe(C0184k kVar, C0199s<T> sVar) {
        mo48247a(kVar, sVar, false);
    }

    /* renamed from: a */
    public final void mo48248a(C0199s<T> sVar, boolean z) {
        if (!this.f62246b.containsKey(sVar)) {
            C23277a aVar = new C23277a(this.f62245a, sVar, false);
            this.f62246b.put(sVar, aVar);
            super.observeForever(aVar);
        }
    }

    /* renamed from: a */
    public final void mo48247a(C0184k kVar, C0199s<T> sVar, boolean z) {
        if (!this.f62246b.containsKey(sVar)) {
            C23277a aVar = new C23277a(this.f62245a, sVar, z);
            this.f62246b.put(sVar, aVar);
            super.observe(kVar, aVar);
        }
    }
}
