package com.bytedance.android.livesdk.browser.p290d;

import android.view.View;
import android.view.View.OnClickListener;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.browser.d.i */
final /* synthetic */ class C4728i implements OnClickListener {

    /* renamed from: a */
    private final C4720h f12909a;

    C4728i(C4720h hVar) {
        this.f12909a = hVar;
    }

    public final void onClick(View view) {
        C4720h hVar = this.f12909a;
        int id = view.getId();
        if (id == R.id.ij) {
            hVar.mo10555b();
            return;
        }
        if (id == R.id.du7) {
            hVar.mo10549a();
        }
    }
}
