package com.bytedance.lobby.p779vk;

import android.content.Context;
import com.bytedance.lobby.C12324c;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.p2620vk.sdk.VKSdk;

/* renamed from: com.bytedance.lobby.vk.VkProvider */
class VkProvider<T> extends BaseProvider<T> {
    /* renamed from: d */
    public final void mo23331d() {
        try {
            VKSdk.m111754a((Context) this.f387a, Integer.parseInt(this.f32525b.f32488c), "");
        } catch (Exception unused) {
        }
    }

    VkProvider(C12324c cVar) {
        super(LobbyCore.getApplication(), cVar);
    }
}
