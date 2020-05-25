package com.p683ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23694h;

/* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$$Lambda$0 */
final /* synthetic */ class TabChangeManager$$Lambda$0 implements GenericLifecycleObserver {

    /* renamed from: a */
    private final TabChangeManager f93544a;

    /* renamed from: b */
    private final C23694h f93545b;

    TabChangeManager$$Lambda$0(TabChangeManager tabChangeManager, C23694h hVar) {
        this.f93544a = tabChangeManager;
        this.f93545b = hVar;
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        TabChangeManager tabChangeManager = this.f93544a;
        C23694h hVar = this.f93545b;
        if (aVar == C0177a.ON_DESTROY) {
            tabChangeManager.f93537b.remove(hVar);
        }
    }
}
