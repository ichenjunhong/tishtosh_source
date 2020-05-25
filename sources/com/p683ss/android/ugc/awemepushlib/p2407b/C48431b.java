package com.p683ss.android.ugc.awemepushlib.p2407b;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.message.C19477e;
import com.p683ss.android.newmedia.redbadge.C19613j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.awemepushlib.b.b */
public final class C48431b implements C19477e {

    /* renamed from: a */
    private static C48431b f121793a;

    /* renamed from: b */
    private List<C19477e> f121794b = new ArrayList();

    private C48431b() {
        this.f121794b.add(new C19613j());
    }

    /* renamed from: b */
    public static synchronized C48431b m104787b() {
        C48431b bVar;
        synchronized (C48431b.class) {
            if (f121793a == null) {
                f121793a = new C48431b();
            }
            bVar = f121793a;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo40614a() {
        for (int i = 0; i < this.f121794b.size(); i++) {
            ((C19477e) this.f121794b.get(i)).mo40614a();
        }
    }

    /* renamed from: a */
    public final void mo40615a(Context context) {
        for (int i = 0; i < this.f121794b.size(); i++) {
            ((C19477e) this.f121794b.get(i)).mo40615a(context);
        }
    }

    /* renamed from: a */
    public final void mo40616a(Intent intent) {
        for (int i = 0; i < this.f121794b.size(); i++) {
            ((C19477e) this.f121794b.get(i)).mo40616a(intent);
        }
    }
}
