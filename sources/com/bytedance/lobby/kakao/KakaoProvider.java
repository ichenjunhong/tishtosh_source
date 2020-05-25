package com.bytedance.lobby.kakao;

import com.bytedance.lobby.C12324c;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.kakao.auth.KakaoSDK;

public class KakaoProvider<T> extends BaseProvider<T> {
    /* renamed from: d */
    public final void mo23331d() {
        if (KakaoSDK.getAdapter() == null) {
            KakaoSDK.init(new C12351a());
        }
    }

    KakaoProvider(C12324c cVar) {
        super(LobbyCore.getApplication(), cVar);
    }
}
