package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* renamed from: org.greenrobot.eventbus.j */
final class C53768j {

    /* renamed from: d */
    private static final List<C53768j> f133358d = new ArrayList();

    /* renamed from: a */
    Object f133359a;

    /* renamed from: b */
    C53776q f133360b;

    /* renamed from: c */
    C53768j f133361c;

    /* renamed from: a */
    static void m114355a(C53768j jVar) {
        jVar.f133359a = null;
        jVar.f133360b = null;
        jVar.f133361c = null;
        synchronized (f133358d) {
            if (f133358d.size() < 10000) {
                f133358d.add(jVar);
            }
        }
    }

    private C53768j(Object obj, C53776q qVar) {
        this.f133359a = obj;
        this.f133360b = qVar;
    }

    /* renamed from: a */
    static C53768j m114354a(C53776q qVar, Object obj) {
        synchronized (f133358d) {
            int size = f133358d.size();
            if (size <= 0) {
                return new C53768j(obj, qVar);
            }
            C53768j jVar = (C53768j) f133358d.remove(size - 1);
            jVar.f133359a = obj;
            jVar.f133360b = qVar;
            jVar.f133361c = null;
            return jVar;
        }
    }
}
