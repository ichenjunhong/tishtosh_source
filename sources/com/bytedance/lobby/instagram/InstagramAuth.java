package com.bytedance.lobby.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.lobby.C12311a;
import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.C12324c;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.AuthResult.C12315a;
import com.bytedance.lobby.auth.C12317b;
import com.bytedance.lobby.auth.C12321d;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;

public class InstagramAuth extends InstagramProvider<AuthResult> implements C12321d {

    /* renamed from: c */
    private static final boolean f32513c = C12311a.f32450a;

    /* renamed from: d */
    private LobbyViewModel f32514d;

    /* renamed from: a */
    public final void mo23311a() {
    }

    /* renamed from: b */
    public final String mo23314b() {
        return null;
    }

    public InstagramAuth(C12324c cVar) {
        super(LobbyCore.getApplication(), cVar);
    }

    /* renamed from: b */
    public final void mo23315b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12317b.m24788a(this.f32514d, this.f32525b.f32487b);
    }

    /* renamed from: a */
    public final void mo23313a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32514d = LobbyViewModel.m24844a(fragmentActivity);
        if (!mo23333c()) {
            C12317b.m24789a(this.f32514d, "instagram", 1);
            return;
        }
        String str = this.f32525b.f32488c;
        String string = this.f32525b.f32489d.getString("ig_login_auth_url");
        String string2 = this.f32525b.f32489d.getString("ig_redirect_url");
        String string3 = this.f32525b.f32489d.getString("ig_scope", "basic");
        String string4 = this.f32525b.f32489d.getString("ig_response_type", "code");
        Intent intent = new Intent(fragmentActivity, InstagramAuthActivity.class);
        intent.putExtra("client_id", str);
        intent.putExtra("login_auth_url", string);
        intent.putExtra("redirect_url", string2);
        intent.putExtra("response_type", string4);
        intent.putExtra("scope", string3);
        fragmentActivity.startActivityForResult(intent, 458);
    }

    /* renamed from: a */
    public final void mo23312a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        C12315a aVar = new C12315a(this.f32525b.f32487b, 1);
        if (intent == null) {
            aVar.mo23302a(false).mo23300a(new C12322b(1, "No intent data received after launching InstagramAuthActivity"));
            this.f32514d.mo23338b(aVar.mo23303a());
            return;
        }
        switch (i2) {
            case -1:
                aVar.mo23302a(false).mo23300a(new C12322b(4, intent.getStringExtra("ig_result_error_info")));
                break;
            case 0:
                aVar.mo23302a(false).mo23300a(new C12322b(3, intent.getStringExtra("ig_result_error_info")));
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putString("code", intent.getStringExtra("ig_result_code"));
                aVar.mo23302a(true).mo23299a(bundle);
                break;
            default:
                aVar.mo23302a(false).mo23300a(new C12322b(7, "Unidentified result code in InstagramAuthActivity"));
                break;
        }
        this.f32514d.mo23338b(aVar.mo23303a());
    }
}
