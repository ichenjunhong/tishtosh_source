package com.snapchat.kit.sdk.core.networking;

import android.text.TextUtils;
import com.C2240a;
import com.bytedance.sysoptimizer.BuildConfig;
import com.google.gson.C17971f;
import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.OAuth2Manager.OnTokenRefreshCallback;
import com.snapchat.kit.sdk.core.controller.C18250a;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.models.TokenErrorResponse;
import java.io.IOException;
import java.util.UUID;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.networking.e */
public class C18289e implements C53676u {

    /* renamed from: a */
    final C18250a f50495a;

    /* renamed from: b */
    private final OAuth2Manager f50496b;

    /* renamed from: c */
    private final String f50497c;

    /* renamed from: a */
    private synchronized String m44495a() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C53499a mo36690a(C53677a aVar) {
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(this.f50496b.mo36368b());
        return aVar.mo111416a().mo111256a().mo111263a("User-Agent", C18286b.f50489a).mo111263a("authorization", sb.toString()).mo111263a("X-Snap-SDK-OAuth-Client-Id", this.f50497c).mo111263a("X-Cloud-Trace-Context", C2240a.m6772a("%s/0;o=1", new Object[]{m44495a()})).mo111263a("X-SnapKit-Core-Version", BuildConfig.VERSION_NAME);
    }

    public C53504ad intercept(C53677a aVar) throws IOException {
        boolean z;
        boolean z2 = false;
        this.f50496b.mo36366a(false);
        C53504ad a = aVar.mo111417a(mo36690a(aVar).mo111272c());
        if (!(a == null || a.f132404g == null || a.f132400c != 401)) {
            TokenErrorResponse tokenErrorResponse = (TokenErrorResponse) new C17971f().mo34883a(a.f132404g.charStream(), TokenErrorResponse.class);
            if (tokenErrorResponse == null || TextUtils.isEmpty(tokenErrorResponse.getError()) || !TextUtils.equals(tokenErrorResponse.getError().toLowerCase(), "invalid_token")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f50496b.mo36367a(true, (OnTokenRefreshCallback) new OnTokenRefreshCallback() {
                    public final void onTokenRefreshSucceeded(boolean z) {
                    }

                    public final void onTokenRefreshFailed(boolean z) {
                        if (z) {
                            C18289e.this.f50495a.mo36405a();
                        }
                    }
                });
            } else {
                if (tokenErrorResponse != null && !TextUtils.isEmpty(tokenErrorResponse.getError()) && TextUtils.equals(tokenErrorResponse.getError().toLowerCase(), "force_logout")) {
                    z2 = true;
                }
                if (z2) {
                    this.f50496b.mo36364a();
                    this.f50495a.mo36405a();
                }
            }
        }
        return a;
    }

    C18289e(OAuth2Manager oAuth2Manager, C18250a aVar, String str) {
        this.f50496b = oAuth2Manager;
        this.f50495a = aVar;
        this.f50497c = str;
    }
}
