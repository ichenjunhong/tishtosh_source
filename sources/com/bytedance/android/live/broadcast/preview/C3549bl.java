package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f.C8684a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.android.live.broadcast.preview.bl */
public final class C3549bl implements C8683f {

    /* renamed from: a */
    private ArrayList<C8684a> f10104a = new ArrayList<>();

    /* renamed from: a */
    public final void mo8930a() {
        Iterator it = this.f10104a.iterator();
        while (it.hasNext()) {
            ((C8684a) it.next()).mo8933a();
        }
    }

    /* renamed from: b */
    public final void mo8932b(C8684a aVar) {
        this.f10104a.remove(aVar);
    }

    /* renamed from: a */
    public final void mo8931a(C8684a aVar) {
        if (!this.f10104a.contains(aVar)) {
            this.f10104a.add(aVar);
        }
    }
}
