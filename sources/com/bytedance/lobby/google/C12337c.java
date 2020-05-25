package com.bytedance.lobby.google;

import com.bytedance.lobby.auth.AuthResult.C12315a;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.C15359k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.bytedance.lobby.google.c */
final /* synthetic */ class C12337c implements C15359k {

    /* renamed from: a */
    private final LobbyViewModel f32509a;

    C12337c(LobbyViewModel lobbyViewModel) {
        this.f32509a = lobbyViewModel;
    }

    /* renamed from: a */
    public final void mo23334a(C15358j jVar) {
        this.f32509a.mo23338b(new C12315a("google", 2).mo23302a(((Status) jVar).mo28060c()).mo23303a());
    }
}
