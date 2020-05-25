package com.p683ss.android.ugc.aweme.miniapp.p1955b;

import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;

/* renamed from: com.ss.android.ugc.aweme.miniapp.b.e */
final /* synthetic */ class C36863e implements C36862a {

    /* renamed from: a */
    private final C36861d f94214a;

    /* renamed from: b */
    private final int f94215b;

    /* renamed from: c */
    private final C36966e f94216c;

    C36863e(C36861d dVar, int i, C36966e eVar) {
        this.f94214a = dVar;
        this.f94215b = i;
        this.f94216c = eVar;
    }

    /* renamed from: a */
    public final void mo76060a(String str) {
        C36861d dVar = this.f94214a;
        int i = this.f94215b;
        C36966e eVar = this.f94216c;
        if (i != 0) {
            dVar.f94210a.remove(i);
            dVar.f94210a.add(0, eVar);
            dVar.notifyDataSetChanged();
        }
    }
}
