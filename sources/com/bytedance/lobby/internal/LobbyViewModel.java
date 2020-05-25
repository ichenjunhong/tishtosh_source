package com.bytedance.lobby.internal;

import android.app.Application;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.lobby.auth.AuthResult;

public class LobbyViewModel extends BaseViewModel<AuthResult> {
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ LiveData mo23341g() {
        return super.mo23341g();
    }

    public LobbyViewModel(Application application) {
        super(application);
    }

    /* renamed from: a */
    public static LobbyViewModel m24844a(FragmentActivity fragmentActivity) {
        return (LobbyViewModel) C0214z.m440a(fragmentActivity).mo359a(LobbyViewModel.class);
    }
}
