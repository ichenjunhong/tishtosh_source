package com.bytedance.android.live.broadcast.preview;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.bytedance.android.livesdk.p399o.C8049c;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.preview.ae */
final /* synthetic */ class C3507ae implements OnFocusChangeListener {

    /* renamed from: a */
    private final C3589i f9997a;

    C3507ae(C3589i iVar) {
        this.f9997a = iVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C3589i iVar = this.f9997a;
        if (iVar.f10265w != null && !iVar.f10265w.isDisposed()) {
            iVar.f10265w.dispose();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("live_type", iVar.mo8959a());
        C8049c.m15979a().mo14202a("livesdk_title_click", hashMap, new Object[0]);
    }
}
