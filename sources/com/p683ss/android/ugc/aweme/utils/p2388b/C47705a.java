package com.p683ss.android.ugc.aweme.utils.p2388b;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.utils.b.a */
public final class C47705a {

    /* renamed from: a */
    private C47707b f120195a;

    /* renamed from: com.ss.android.ugc.aweme.utils.b.a$a */
    public interface C47706a {
        /* renamed from: a */
        void mo44816a(int i, int i2, Intent intent);
    }

    public C47705a(Activity activity) {
        boolean z;
        C47707b bVar = (C47707b) activity.getFragmentManager().findFragmentByTag("AvoidOnActivityResult");
        if (bVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bVar = new C47707b();
            FragmentManager fragmentManager = activity.getFragmentManager();
            fragmentManager.beginTransaction().add(bVar, "AvoidOnActivityResult").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        this.f120195a = bVar;
    }

    /* renamed from: a */
    public final void mo94988a(Intent intent, int i, C47706a aVar) {
        this.f120195a.mo94989a(intent, i, aVar);
    }
}
