package com.p683ss.android.ugc.aweme.search.performance;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.p100a.p102b.C2281a;
import com.p683ss.android.ugc.aweme.p1402b.C23343a;
import com.p683ss.android.ugc.aweme.p1402b.C23347e.C23348a;
import com.p683ss.android.ugc.aweme.p1402b.C23351h;
import com.p683ss.android.ugc.aweme.p1402b.C23355j;
import java.util.LinkedList;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.search.performance.b */
public final class C41444b extends C23351h {

    /* renamed from: com.ss.android.ugc.aweme.search.performance.b$a */
    static final class C41445a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C41444b f105065a;

        /* renamed from: b */
        final /* synthetic */ C23348a f105066b;

        C41445a(C41444b bVar, C23348a aVar) {
            this.f105065a = bVar;
            this.f105066b = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (!this.f105065a.f62352a.isFinishing()) {
                try {
                    for (C52847n nVar : this.f105066b.f62353a) {
                        Object first = nVar.getFirst();
                        int intValue = ((Number) nVar.getSecond()).intValue();
                        int intValue2 = ((Number) first).intValue();
                        LinkedList linkedList = (LinkedList) this.f105065a.f62359b.get(Integer.valueOf(intValue2));
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f105065a.f62359b.put(Integer.valueOf(intValue2), linkedList);
                        }
                        int i = 0;
                        while (true) {
                            if (i < intValue) {
                                View a = C2281a.m6814a(this.f105065a.f62352a, intValue2, new FrameLayout(this.f105065a.f62352a), false);
                                synchronized (linkedList) {
                                    linkedList.offer(a);
                                }
                                i++;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return C52860x.f131107a;
        }
    }

    public C41444b(Activity activity) {
        C52711k.m112240b(activity, "activity");
        super(activity);
    }

    /* renamed from: a */
    public final void mo48404a(C23348a aVar, long j) {
        C52711k.m112240b(aVar, "target");
        if (C23355j.f62366c.mo48411b()) {
            C52670a aVar2 = new C41445a(this, aVar);
            if (j > 0) {
                C23343a.m57406a().postDelayed(new C41446c(aVar2), j);
            } else {
                C23343a.m57406a().post(new C41446c(aVar2));
            }
        }
    }
}
