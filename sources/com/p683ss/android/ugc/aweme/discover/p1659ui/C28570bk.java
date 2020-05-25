package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.discover.jedi.C28249b;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28129j;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28134m;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28141q;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28157x;
import com.p683ss.android.ugc.aweme.search.model.C41440e;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bk */
public final class C28570bk {
    /* renamed from: a */
    public static C28550bj m67782a(C41440e eVar, int i) {
        C28550bj bjVar;
        if (i == C28608ca.f75134b) {
            bjVar = new C28249b();
        } else if (i == C28608ca.f75136d) {
            bjVar = new C28157x();
        } else if (i == C28608ca.f75138f) {
            bjVar = new C28141q();
        } else if (i == C28608ca.f75139g) {
            bjVar = new C28129j();
        } else if (i == C28608ca.f75135c) {
            bjVar = new C28134m();
        } else {
            bjVar = new C28157x();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(C28525az.f74952u, eVar);
        bjVar.setArguments(bundle);
        return bjVar;
    }
}
