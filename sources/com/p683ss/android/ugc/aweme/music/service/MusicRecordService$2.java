package com.p683ss.android.ugc.aweme.music.service;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;

/* renamed from: com.ss.android.ugc.aweme.music.service.MusicRecordService$2 */
class MusicRecordService$2 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C37437d f95475a;

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f95475a.f95478a = false;
        this.f95475a.f95481d.mo77154b();
    }

    MusicRecordService$2(C37437d dVar) {
        this.f95475a = dVar;
    }
}
