package com.bytedance.lobby.auth;

import android.text.TextUtils;
import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.auth.AuthResult.C12315a;
import com.bytedance.lobby.internal.LobbyViewModel;

/* renamed from: com.bytedance.lobby.auth.b */
public final class C12317b {
    /* renamed from: a */
    public static void m24788a(LobbyViewModel lobbyViewModel, String str) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] provider currently does not support logging out, please contact Lobby developer for further details.");
            lobbyViewModel.mo23338b(new C12315a(str, 2).mo23302a(false).mo23300a(new C12322b(1, sb.toString())).mo23303a());
        }
    }

    /* renamed from: a */
    public static void m24789a(LobbyViewModel lobbyViewModel, String str, int i) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] provider is not available, make sure you have added it to your dependency.");
            lobbyViewModel.mo23338b(new C12315a(str, i).mo23302a(false).mo23300a(new C12322b(2, sb.toString())).mo23303a());
        }
    }
}
