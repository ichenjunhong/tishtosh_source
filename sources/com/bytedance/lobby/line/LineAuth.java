package com.bytedance.lobby.line;

import android.arch.lifecycle.C0214z;
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
import com.linecorp.linesdk.C18233b;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationConfig.C18219a;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.linecorp.linesdk.p1086a.C18212c;
import com.linecorp.linesdk.p1086a.C18212c.C18213a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.Collections;
import java.util.List;

public class LineAuth extends LineProvider<AuthResult> implements C12321d {

    /* renamed from: c */
    private static final boolean f32559c = C12311a.f32450a;

    /* renamed from: d */
    private LobbyViewModel f32560d;

    /* renamed from: a */
    public final void mo23311a() {
    }

    /* renamed from: b */
    public final String mo23314b() {
        return null;
    }

    public LineAuth(C12324c cVar) {
        super(LobbyCore.getApplication(), cVar);
    }

    /* renamed from: b */
    public final void mo23315b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12317b.m24788a(this.f32560d, this.f32525b.f32487b);
    }

    /* renamed from: a */
    public final void mo23313a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32560d = (LobbyViewModel) C0214z.m440a(fragmentActivity).mo359a(LobbyViewModel.class);
        if (!mo23333c()) {
            C12317b.m24789a(this.f32560d, "line", 1);
            return;
        }
        try {
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new C18219a(this.f32525b.f32488c));
            List emptyList = Collections.emptyList();
            if (!lineAuthenticationConfig.f50288e && !C18212c.f50269b) {
                C18212c.f50269b = true;
                C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a()).execute(new C18213a(fragmentActivity.getApplicationContext()));
            }
            Intent intent = new Intent(fragmentActivity, LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("permissions", (String[]) emptyList.toArray(new String[emptyList.size()]));
            fragmentActivity.startActivityForResult(intent, 1);
        } catch (Throwable th) {
            this.f32560d.mo23338b(new C12315a(this.f32525b.f32487b, 1).mo23302a(false).mo23300a(new C12322b(6, th.getMessage())).mo23303a());
        }
    }

    /* renamed from: a */
    public final void mo23312a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        LineLoginResult lineLoginResult;
        if (intent == null) {
            lineLoginResult = new LineLoginResult(C18233b.INTERNAL_ERROR, new LineApiError("Callback intent is null"));
        } else {
            lineLoginResult = (LineLoginResult) intent.getParcelableExtra("authentication_result");
            if (lineLoginResult == null) {
                lineLoginResult = new LineLoginResult(C18233b.INTERNAL_ERROR, new LineApiError("Authentication result is not found."));
            }
        }
        switch (lineLoginResult.f50295b) {
            case SUCCESS:
                LineCredential lineCredential = lineLoginResult.f50297d;
                if (lineCredential != null) {
                    this.f32560d.mo23338b(new C12315a("line", 1).mo23302a(true).mo23298a(lineCredential.f50230a.f50225b).mo23304b(lineCredential.f50230a.f50224a).mo23303a());
                    return;
                }
                break;
            case CANCEL:
                this.f32560d.mo23338b(new C12315a("line", 1).mo23302a(false).mo23300a(new C12322b(4, "Line login cancelled by user")).mo23303a());
                return;
            default:
                Bundle bundle = new Bundle();
                bundle.putInt("line_response_ordinal", lineLoginResult.f50295b.ordinal());
                this.f32560d.mo23338b(new C12315a("line", 1).mo23302a(false).mo23300a(new C12322b(3, lineLoginResult.f50298e.f50229c)).mo23299a(bundle).mo23303a());
                break;
        }
    }
}
