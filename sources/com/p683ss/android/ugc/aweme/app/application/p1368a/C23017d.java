package com.p683ss.android.ugc.aweme.app.application.p1368a;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a.C22885a;
import com.p683ss.android.ugc.aweme.login.depenimpl.AccountDepeImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.app.application.a.d */
final /* synthetic */ class C23017d implements C0011g {

    /* renamed from: a */
    private final Bundle f61358a;

    C23017d(Bundle bundle) {
        this.f61358a = bundle;
    }

    public final Object then(C0013i iVar) {
        Bundle bundle = this.f61358a;
        C22885a aVar = C22884a.f61216c;
        List afterSwitchAccountActions = AccountDepeImpl.createAccountDepeServicebyMonsterPlugin().getAfterSwitchAccountActions(bundle);
        C22884a.f61214a = afterSwitchAccountActions != null ? C52575l.m112139e((Collection<? extends T>) afterSwitchAccountActions) : new ArrayList<>();
        C22885a.m56354a();
        aVar.mo47681a(bundle);
        return (Bundle) iVar.mo34e();
    }
}
