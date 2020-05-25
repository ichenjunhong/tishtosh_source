package com.bytedance.android.livesdk.gift.relay;

import android.arch.lifecycle.C0199s;
import com.bytedance.ies.sdk.widgets.KVData;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.relay.e */
public final /* synthetic */ class C7638e implements C0199s {

    /* renamed from: a */
    private final C7634b f21033a;

    public C7638e(C7634b bVar) {
        this.f21033a = bVar;
    }

    public final void onChanged(Object obj) {
        C7634b bVar = this.f21033a;
        KVData kVData = (KVData) obj;
        if (kVData != null && bVar.f21015l != null) {
            bVar.f21015l.setText(bVar.f21006b.getResources().getString(kVData.getData() != null && ((Boolean) kVData.getData()).booleanValue() ? R.string.ec4 : R.string.f1n));
        }
    }
}
