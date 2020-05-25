package com.p683ss.android.ugc.aweme.p1402b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.p100a.p102b.C2281a;
import com.p683ss.android.ugc.aweme.p1402b.C23347e.C23348a;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.b.h */
public class C23351h extends C23347e {

    /* renamed from: d */
    public static final C23352a f62358d = new C23352a(null);

    /* renamed from: b */
    public final ConcurrentHashMap<Integer, LinkedList<View>> f62359b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public long f62360c = 10000;

    /* renamed from: com.ss.android.ugc.aweme.b.h$a */
    public static final class C23352a {
        private C23352a() {
        }

        public /* synthetic */ C23352a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.b.h$b */
    static final class C23353b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C23351h f62361a;

        /* renamed from: b */
        final /* synthetic */ C23348a f62362b;

        C23353b(C23351h hVar, C23348a aVar) {
            this.f62361a = hVar;
            this.f62362b = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (!this.f62361a.f62352a.isFinishing()) {
                try {
                    for (C52847n nVar : this.f62362b.f62353a) {
                        Object first = nVar.getFirst();
                        int intValue = ((Number) nVar.getSecond()).intValue();
                        int intValue2 = ((Number) first).intValue();
                        LinkedList linkedList = (LinkedList) this.f62361a.f62359b.get(Integer.valueOf(intValue2));
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f62361a.f62359b.put(Integer.valueOf(intValue2), linkedList);
                        }
                        int i = 0;
                        while (true) {
                            if (i < intValue) {
                                View a = C2281a.m6814a(this.f62361a.f62352a, intValue2, new FrameLayout(this.f62361a.f62352a), false);
                                synchronized (linkedList) {
                                    linkedList.offer(a);
                                }
                                i++;
                            }
                        }
                    }
                    C23348a aVar = this.f62362b;
                    ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap = this.f62361a.f62359b;
                    long j = this.f62361a.f62360c;
                    C52711k.m112240b(aVar, "target");
                    C52711k.m112240b(concurrentHashMap, "viewCaches");
                    C23343a.m57406a().postDelayed(new C23350g(aVar, concurrentHashMap), j);
                    C23343a.f62347a.mo49812a(this.f62361a.f62352a);
                } catch (Exception unused) {
                }
            }
            return C52860x.f131107a;
        }
    }

    public C23351h(Activity activity) {
        C52711k.m112240b(activity, "activity");
        super(activity);
    }

    /* renamed from: a */
    public final View mo48401a(int i) {
        if (C23355j.f62366c.mo48411b()) {
            LinkedList linkedList = (LinkedList) this.f62359b.get(Integer.valueOf(i));
            if (linkedList != null) {
                synchronized (linkedList) {
                    View view = (View) linkedList.poll();
                    if (view != null) {
                        return view;
                    }
                    this.f62359b.remove(Integer.valueOf(i));
                }
            }
            View a = C2281a.m6814a(this.f62352a, i, new FrameLayout(this.f62352a), false);
            C52711k.m112236a((Object) a, "AndInflater.getView(acti…eLayout(activity), false)");
            return a;
        }
        C23355j jVar = C23355j.f62366c;
        if (((Boolean) C23355j.f62365b.getValue()).booleanValue()) {
            View a2 = C2281a.m6814a(this.f62352a, i, new FrameLayout(this.f62352a), false);
            C52711k.m112236a((Object) a2, "AndInflater.getView(acti…eLayout(activity), false)");
            return a2;
        }
        View inflate = LayoutInflater.from(this.f62352a).inflate(i, new FrameLayout(this.f62352a), false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(acti…eLayout(activity), false)");
        return inflate;
    }

    /* renamed from: a */
    public void mo48404a(C23348a aVar, long j) {
        C52711k.m112240b(aVar, "target");
        if (C23355j.f62366c.mo48411b()) {
            C52670a bVar = new C23353b(this, aVar);
            if (j > 0) {
                C23343a.m57406a().postDelayed(new C23354i(bVar), j);
            } else {
                C23343a.m57406a().post(new C23354i(bVar));
            }
        }
    }
}
