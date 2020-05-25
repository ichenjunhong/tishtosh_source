package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.C2240a;
import com.google.gson.C17971f;
import com.snapchat.kit.sdk.core.controller.C18250a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C18276e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.models.AuthToken;
import com.snapchat.kit.sdk.core.models.AuthorizationRequest;
import com.snapchat.kit.sdk.core.models.TokenErrorResponse;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.security.C18301g;
import com.snapchat.kit.sdk.p1089a.C18244a;
import com.snapchat.kit.sdk.p1089a.C18244a.C18245a;
import com.snapchat.kit.sdk.util.SnapUtils;
import dagger.C52863a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53668q.C53669a;
import okhttp3.C53682y;

public final class OAuth2Manager implements AuthTokenManager {

    /* renamed from: a */
    static final Set<String> f50342a = new HashSet<String>() {
        {
            add("invalid_grant");
            add("invalid_request");
            add("invalid_scope");
            add("unsupported_grant_type");
        }
    };

    /* renamed from: b */
    final String f50343b;

    /* renamed from: c */
    final String f50344c;
    /* access modifiers changed from: 0000 */

    /* renamed from: d */
    public final C18250a f50345d;

    /* renamed from: e */
    final C53682y f50346e;

    /* renamed from: f */
    final C17971f f50347f;
    /* access modifiers changed from: 0000 */

    /* renamed from: g */
    public final C52863a<MetricQueue<ServerEvent>> f50348g;
    /* access modifiers changed from: 0000 */

    /* renamed from: h */
    public final C18276e f50349h;
    /* access modifiers changed from: 0000 */

    /* renamed from: i */
    public final C18244a f50350i;

    /* renamed from: j */
    public AuthorizationRequest f50351j;

    /* renamed from: k */
    int f50352k = 0;

    /* renamed from: l */
    private final List<String> f50353l;

    /* renamed from: m */
    private final Context f50354m;

    /* renamed from: n */
    private final C18301g f50355n;

    /* renamed from: o */
    private AtomicReference<AuthToken> f50356o;

    /* renamed from: p */
    private final AtomicBoolean f50357p = new AtomicBoolean(false);

    public interface OnTokenRefreshCallback {
        void onTokenRefreshFailed(boolean z);

        void onTokenRefreshSucceeded(boolean z);
    }

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$a */
    static class C18242a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final WeakReference<OAuth2Manager> f50368a;

        /* renamed from: b */
        private final boolean f50369b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            OAuth2Manager oAuth2Manager = (OAuth2Manager) this.f50368a.get();
            if (oAuth2Manager == null) {
                return null;
            }
            oAuth2Manager.mo36366a(this.f50369b);
            return null;
        }

        private C18242a(OAuth2Manager oAuth2Manager, boolean z) {
            this.f50368a = new WeakReference<>(oAuth2Manager);
            this.f50369b = z;
        }
    }

    /* renamed from: a */
    public final void mo36366a(boolean z) {
        mo36367a(z, (OnTokenRefreshCallback) null);
    }

    /* renamed from: a */
    public final void mo36367a(boolean z, OnTokenRefreshCallback onTokenRefreshCallback) {
        C53498ab a = m44437a(z, m44446c());
        if (a != null && this.f50357p.compareAndSet(false, true)) {
            this.f50350i.mo36393a(C18245a.REFRESH);
            try {
                m44441a(this.f50346e.mo111325a(a).mo111247b(), onTokenRefreshCallback);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f50357p.set(false);
                throw th;
            }
            this.f50357p.set(false);
        }
    }

    /* renamed from: c */
    private AuthToken m44446c() {
        m44451e();
        return (AuthToken) this.f50356o.get();
    }

    /* renamed from: d */
    private String m44450d() {
        AuthToken c = m44446c();
        if (c == null) {
            return null;
        }
        return c.getRefreshToken();
    }

    /* renamed from: f */
    private AuthToken m44452f() {
        return (AuthToken) this.f50355n.get("auth_token", AuthToken.class);
    }

    /* renamed from: b */
    public final String mo36368b() {
        AuthToken c = m44446c();
        if (c == null) {
            return null;
        }
        return c.getAccessToken();
    }

    public final boolean isUserLoggedIn() {
        if (!TextUtils.isEmpty(mo36368b())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m44451e() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference<com.snapchat.kit.sdk.core.models.AuthToken> r0 = r4.f50356o     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0029
            com.snapchat.kit.sdk.core.models.AuthToken r0 = r4.m44452f()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r4)
            return
        L_0x0011:
            java.lang.String r1 = r0.getScope()     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0024
            com.snapchat.kit.sdk.OAuth2Manager$a r1 = new com.snapchat.kit.sdk.OAuth2Manager$a     // Catch:{ all -> 0x002b }
            r2 = 1
            r3 = 0
            r1.<init>()     // Catch:{ all -> 0x002b }
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
        L_0x0024:
            java.util.concurrent.atomic.AtomicReference<com.snapchat.kit.sdk.core.models.AuthToken> r1 = r4.f50356o     // Catch:{ all -> 0x002b }
            r1.set(r0)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.OAuth2Manager.m44451e():void");
    }

    public final void revokeToken() {
        AuthToken c = m44446c();
        if (c != null) {
            C53669a aVar = new C53669a();
            aVar.mo111586a("token", c.getRefreshToken());
            aVar.mo111586a("client_id", this.f50343b);
            C53498ab a = m44436a((C53500ac) aVar.mo111587a(), "/accounts/oauth2/revoke");
            if (a != null) {
                this.f50350i.mo36393a(C18245a.REVOKE);
                this.f50346e.mo111325a(a).mo111246a(new C53526f() {
                    public final void onFailure(C53524e eVar, IOException iOException) {
                        OAuth2Manager.this.f50350i.mo36394a(C18245a.REVOKE, false);
                    }

                    public final void onResponse(C53524e eVar, C53504ad adVar) throws IOException {
                        OAuth2Manager.this.f50350i.mo36394a(C18245a.REVOKE, true);
                    }
                });
                this.f50356o.set(null);
                m44448c((AuthToken) null);
                this.f50345d.mo36405a();
            }
        }
    }

    public final void startTokenGrant() {
        boolean z;
        if (TextUtils.isEmpty(this.f50344c)) {
            throw new IllegalStateException("Redirect URL must be set!");
        } else if (this.f50353l == null || this.f50353l.isEmpty()) {
            throw new IllegalStateException("Valid scopes must be set");
        } else {
            String str = this.f50343b;
            String str2 = this.f50344c;
            List<String> list = this.f50353l;
            String a = C18243a.m44461a(C18243a.f50375b);
            String a2 = C18243a.m44462a(a);
            AuthorizationRequest withState = new AuthorizationRequest().withResponseType("code").withClientId(str).withScope(TextUtils.join(" ", list)).withRedirectUri(str2).withCodeChallengeMethod("S256").withCodeVerifier(a).withCodeChallenge(a2).withState(C18243a.m44461a(C18243a.f50374a));
            this.f50351j = withState;
            PackageManager packageManager = this.f50354m.getPackageManager();
            String str3 = "com.snapchat.android";
            if (this.f50352k < 3 && SnapUtils.isSnapchatInstalled(packageManager, str3)) {
                Context context = this.f50354m;
                Intent intent = new Intent("android.intent.action.VIEW", withState.toUri("snapchat://", "oauth2", this.f50354m.getPackageName(), null));
                intent.setPackage(str3);
                intent.setFlags(268435456);
                if (intent.resolveActivity(packageManager) != null) {
                    context.startActivity(intent);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f50350i.mo36395a("authSnapchat");
                    ((MetricQueue) this.f50348g.get()).push(this.f50349h.mo36434a());
                    this.f50352k++;
                    return;
                }
            }
            Uri uri = withState.toUri("https://accounts.snapchat.com/accounts", "/oauth2/auth", null, "snapkit_web");
            this.f50350i.mo36395a("authWeb");
            Context context2 = this.f50354m;
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                intent2.setFlags(268435456);
                context2.startActivity(intent2);
            } catch (Exception unused) {
            }
            ((MetricQueue) this.f50348g.get()).push(this.f50349h.mo36434a());
        }
    }

    /* renamed from: a */
    public final void mo36364a() {
        this.f50356o.set(null);
        m44448c((AuthToken) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m44440a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* renamed from: c */
    private synchronized void m44448c(AuthToken authToken) {
        this.f50355n.put("auth_token", authToken);
    }

    /* renamed from: a */
    private AuthToken m44435a(C53504ad adVar) throws IOException {
        if (adVar == null || !adVar.mo111275a() || adVar.f132404g == null || adVar.f132404g.charStream() == null) {
            return null;
        }
        return (AuthToken) this.f50347f.mo34883a(adVar.f132404g.charStream(), AuthToken.class);
    }

    /* renamed from: b */
    private TokenErrorResponse m44443b(C53504ad adVar) throws IOException {
        if (adVar == null || adVar.mo111275a() || adVar.f132400c != 400) {
            return null;
        }
        return (TokenErrorResponse) this.f50347f.mo34883a(adVar.f132404g.charStream(), TokenErrorResponse.class);
    }

    public final boolean hasAccessToScope(String str) {
        AuthToken c = m44446c();
        if (c == null || c.getScope() == null) {
            return false;
        }
        return Arrays.asList(c.getScope().split(" ")).contains(str);
    }

    /* renamed from: b */
    static boolean m44444b(AuthToken authToken) {
        if (authToken == null || TextUtils.isEmpty(authToken.getAccessToken()) || TextUtils.isEmpty(authToken.getRefreshToken()) || !TextUtils.equals(authToken.getTokenType(), "Bearer") || authToken.getExpiresIn() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo36365a(AuthToken authToken) {
        AuthToken f = m44452f();
        if (m44444b(authToken) && (f == null || f.getLastUpdated() <= authToken.getLastUpdated())) {
            m44448c(authToken);
            this.f50356o.set(authToken);
        }
    }

    /* renamed from: a */
    static C53498ab m44436a(C53500ac acVar, String str) {
        return new C53499a().mo111263a("Content-Type", "application/x-www-form-urlencoded").mo111262a(C2240a.m6772a("%s%s", new Object[]{"https://accounts.snapchat.com", str})).mo111265a(acVar).mo111272c();
    }

    /* renamed from: a */
    private C53498ab m44437a(boolean z, AuthToken authToken) {
        if (!m44444b(authToken) || !m44445b(z, authToken)) {
            return null;
        }
        C53669a aVar = new C53669a();
        aVar.mo111586a("grant_type", "refresh_token");
        aVar.mo111586a("refresh_token", authToken.getRefreshToken());
        aVar.mo111586a("client_id", this.f50343b);
        return m44436a((C53500ac) aVar.mo111587a(), "/accounts/oauth2/token");
    }

    /* renamed from: b */
    private static boolean m44445b(boolean z, AuthToken authToken) {
        boolean z2;
        boolean z3;
        boolean z4;
        double currentTimeMillis = (double) (System.currentTimeMillis() - authToken.getLastUpdated());
        double expiresInMillis = (double) authToken.getExpiresInMillis();
        Double.isNaN(expiresInMillis);
        if (currentTimeMillis >= Math.min(3600000.0d, expiresInMillis / 2.0d)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (System.currentTimeMillis() >= authToken.getLastUpdated() + authToken.getExpiresInMillis()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (authToken.getScope() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z || z2 || z3 || z4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m44441a(C53504ad adVar, OnTokenRefreshCallback onTokenRefreshCallback) throws IOException {
        AuthToken a = m44435a(adVar);
        if (a != null) {
            if (TextUtils.isEmpty(a.getRefreshToken())) {
                a.setRefreshToken(m44450d());
            }
            if (m44444b(a)) {
                a.setLastUpdated(System.currentTimeMillis());
                mo36365a(a);
                this.f50350i.mo36394a(C18245a.REFRESH, true);
                m44438a(onTokenRefreshCallback, true, true, false);
                return;
            }
        }
        TokenErrorResponse b = m44443b(adVar);
        if (b == null || TextUtils.isEmpty(b.getError()) || !f50342a.contains(b.getError().toLowerCase())) {
            this.f50350i.mo36394a(C18245a.REFRESH, false);
            m44438a(onTokenRefreshCallback, false, false, false);
            return;
        }
        mo36364a();
        this.f50350i.mo36394a(C18245a.REFRESH, false);
        m44438a(onTokenRefreshCallback, false, false, true);
    }

    /* renamed from: a */
    private void m44438a(OnTokenRefreshCallback onTokenRefreshCallback, boolean z, boolean z2, boolean z3) {
        if (onTokenRefreshCallback != null) {
            final boolean z4 = z;
            final OnTokenRefreshCallback onTokenRefreshCallback2 = onTokenRefreshCallback;
            final boolean z5 = z2;
            final boolean z6 = z3;
            C182414 r0 = new Runnable() {
                public final void run() {
                    if (z4) {
                        onTokenRefreshCallback2.onTokenRefreshSucceeded(z5);
                    } else {
                        onTokenRefreshCallback2.onTokenRefreshFailed(z6);
                    }
                }
            };
            m44440a((Runnable) r0);
        }
    }

    OAuth2Manager(String str, String str2, List<String> list, Context context, C18301g gVar, C18250a aVar, C53682y yVar, C17971f fVar, C52863a<MetricQueue<ServerEvent>> aVar2, C18276e eVar, C52863a<MetricQueue<OpMetric>> aVar3) {
        this.f50343b = str;
        this.f50344c = str2;
        this.f50353l = list;
        this.f50354m = context;
        this.f50355n = gVar;
        this.f50345d = aVar;
        this.f50346e = yVar;
        this.f50347f = fVar;
        this.f50348g = aVar2;
        this.f50349h = eVar;
        this.f50350i = new C18244a(aVar3);
        this.f50356o = new AtomicReference<>(null);
    }
}
