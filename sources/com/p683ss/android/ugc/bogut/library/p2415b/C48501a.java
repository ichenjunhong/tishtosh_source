package com.p683ss.android.ugc.bogut.library.p2415b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.bogut.library.b.a */
public class C48501a<View> {

    /* renamed from: a */
    public View f121942a;

    /* renamed from: b */
    public CopyOnWriteArrayList<C48502a> f121943b = new CopyOnWriteArrayList<>();

    /* renamed from: com.ss.android.ugc.bogut.library.b.a$a */
    public interface C48502a {
        /* renamed from: a */
        void mo95990a();
    }

    /* renamed from: b */
    public final void mo95993b() {
        this.f121942a = null;
    }

    /* renamed from: a */
    public final void mo95991a() {
        Iterator it = this.f121943b.iterator();
        while (it.hasNext()) {
            ((C48502a) it.next()).mo95990a();
        }
    }

    /* renamed from: a */
    public final void mo95992a(View view) {
        this.f121942a = view;
    }
}
