package com.bytedance.lighten.loader;

import com.facebook.common.p923g.C13703b;
import com.facebook.common.p923g.C13704c;
import com.facebook.common.p923g.C13705d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.lighten.loader.q */
public final class C12250q implements C13705d {

    /* renamed from: a */
    private CopyOnWriteArraySet<C13704c> f32355a;

    /* renamed from: com.bytedance.lighten.loader.q$a */
    static class C12252a {

        /* renamed from: a */
        public static C12250q f32356a = new C12250q();
    }

    /* renamed from: a */
    public static C12250q m24726a() {
        return C12252a.f32356a;
    }

    private C12250q() {
        this.f32355a = new CopyOnWriteArraySet<>();
    }

    /* renamed from: a */
    public final void mo23182a(C13704c cVar) {
        this.f32355a.add(cVar);
    }

    /* renamed from: a */
    public final void mo23181a(C13703b bVar) {
        try {
            Iterator it = this.f32355a.iterator();
            while (it.hasNext()) {
                ((C13704c) it.next()).mo25598a(bVar);
            }
        } catch (Exception unused) {
        }
    }
}
