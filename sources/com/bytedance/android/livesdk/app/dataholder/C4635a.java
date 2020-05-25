package com.bytedance.android.livesdk.app.dataholder;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.a */
public abstract class C4635a<T> {

    /* renamed from: a */
    protected List<WeakReference<C4641g<T>>> f12650a = new ArrayList();

    /* renamed from: b */
    public T f12651b;

    /* renamed from: c */
    private boolean f12652c = true;

    /* renamed from: a */
    public final void mo10413a(C4641g<T> gVar) {
        if (gVar != null) {
            Iterator it = this.f12650a.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else if (weakReference.get() == gVar) {
                    return;
                }
            }
            this.f12650a.add(new WeakReference(gVar));
            if (this.f12652c) {
                gVar.mo9061a(this.f12651b);
            }
        }
    }

    /* renamed from: b */
    public final void mo10415b(C4641g<T> gVar) {
        Iterator it = this.f12650a.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                it.remove();
            } else if (weakReference.get() == gVar) {
                it.remove();
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo10414a(T t) {
        if (t != this.f12651b) {
            this.f12651b = t;
            Iterator it = this.f12650a.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else {
                    ((C4641g) weakReference.get()).mo9061a(this.f12651b);
                }
            }
        }
    }
}
