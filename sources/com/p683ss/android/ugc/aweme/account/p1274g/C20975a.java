package com.p683ss.android.ugc.aweme.account.p1274g;

import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.account.g.a */
public final class C20975a {

    /* renamed from: a */
    private static C21386a f57085a;

    /* renamed from: b */
    private static List<WeakReference<C20976a>> f57086b = new LinkedList();

    /* renamed from: c */
    private static List<C20977b> f57087c = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.ugc.aweme.account.g.a$a */
    public interface C20976a {
        /* renamed from: a */
        void mo44974a(C21386a aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.g.a$b */
    public interface C20977b {
        /* renamed from: a_ */
        void mo44975a_(int i);
    }

    /* renamed from: a */
    public static C21386a m53336a() {
        return f57085a;
    }

    /* renamed from: a */
    public static void m53339a(C20977b bVar) {
        f57087c.add(bVar);
    }

    /* renamed from: b */
    public static void m53341b(C20977b bVar) {
        f57087c.remove(bVar);
    }

    /* renamed from: a */
    public static void m53337a(int i) {
        for (C20977b a_ : f57087c) {
            a_.mo44975a_(i);
        }
    }

    /* renamed from: a */
    public static void m53338a(C20976a aVar) {
        synchronized (C20975a.class) {
            f57086b.add(new WeakReference(aVar));
        }
    }

    /* renamed from: a */
    public static void m53340a(C21386a aVar) {
        synchronized (C20975a.class) {
            f57085a = aVar;
            Iterator it = f57086b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else {
                    ((C20976a) weakReference.get()).mo44974a(aVar);
                }
            }
        }
    }
}
