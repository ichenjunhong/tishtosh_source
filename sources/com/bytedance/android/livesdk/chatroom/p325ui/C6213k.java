package com.bytedance.android.livesdk.chatroom.p325ui;

import android.arch.lifecycle.C0199s;
import com.bytedance.ies.sdk.widgets.KVData;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.k */
final /* synthetic */ class C6213k implements C0199s {

    /* renamed from: a */
    private final C5957b f16683a;

    C6213k(C5957b bVar) {
        this.f16683a = bVar;
    }

    public final void onChanged(Object obj) {
        C5957b bVar = this.f16683a;
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getData() != null && ((Boolean) kVData.getData()).booleanValue()) {
            bVar.f15702M.setVisibility(8);
        }
    }
}
