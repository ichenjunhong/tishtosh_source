package com.p683ss.android.ugc.trill.language;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.language.ContentLanguageAdapter$1 */
class ContentLanguageAdapter$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C50337c f126217a;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.f126217a.f126235d != null) {
            this.f126217a.f126235d.f126286a.mo6180a();
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        if (this.f126217a.f126234c != null) {
            this.f126217a.f126232a = (ArrayList) this.f126217a.f126234c.mo98275d().getValue();
            this.f126217a.notifyDataSetChanged();
        }
    }

    ContentLanguageAdapter$1(C50337c cVar) {
        this.f126217a = cVar;
    }
}
