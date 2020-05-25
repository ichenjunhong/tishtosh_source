package com.bytedance.lobby.google;

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
import com.google.android.gms.auth.api.C15106a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C15136a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15233f.C15234a;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15359k;
import com.google.android.gms.common.api.Status;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.lang.ref.WeakReference;

public class GoogleAuth extends GoogleProvider<AuthResult> implements C12321d, C15235b {

    /* renamed from: c */
    private static final boolean f32499c = C12311a.f32450a;

    /* renamed from: d */
    private int f32500d;

    /* renamed from: e */
    private Bundle f32501e;

    /* renamed from: f */
    private WeakReference<FragmentActivity> f32502f;

    /* renamed from: g */
    private boolean f32503g;

    /* renamed from: h */
    private C15233f f32504h;

    /* renamed from: a */
    public final void mo23311a() {
    }

    /* renamed from: b */
    public final String mo23314b() {
        return null;
    }

    public void onConnectionSuspended(int i) {
    }

    /* renamed from: c */
    public final boolean mo23333c() {
        boolean z;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(LobbyCore.getApplication()) == 0) {
                z = true;
                if (super.mo23333c() || !z) {
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        z = false;
        if (super.mo23333c()) {
        }
        return false;
    }

    public GoogleAuth(C12324c cVar) {
        super(LobbyCore.getApplication(), cVar);
    }

    public void onConnected(Bundle bundle) {
        FragmentActivity fragmentActivity;
        if (this.f32502f != null) {
            fragmentActivity = (FragmentActivity) this.f32502f.get();
        } else {
            fragmentActivity = null;
        }
        if (this.f32503g && fragmentActivity != null) {
            this.f32503g = false;
            C15233f a = m24815a(fragmentActivity, m24814a(this.f32501e));
            m24817a(a, (C15359k<Status>) new C12338d<Status>(this, fragmentActivity, a));
        }
    }

    /* renamed from: a */
    private GoogleSignInOptions m24814a(Bundle bundle) {
        C15136a aVar = new C15136a(GoogleSignInOptions.f39143f);
        if (bundle.getBoolean("google_request_profile", true)) {
            aVar.mo27928b();
        }
        if (bundle.getBoolean("google_request_id", true)) {
            aVar.mo27925a();
        }
        if (bundle.getBoolean("google_request_email", true)) {
            aVar.f39156a.add(GoogleSignInOptions.f39139b);
        }
        if (bundle.getBoolean("google_request_id_token", true)) {
            String str = this.f32525b.f32488c;
            aVar.f39159d = true;
            aVar.f39160e = aVar.mo27927a(str);
        }
        if (bundle.getBoolean("google_request_server_auth_code", false)) {
            boolean z = bundle.getBoolean("google_force_refresh_token", false);
            String str2 = this.f32525b.f32488c;
            aVar.f39157b = true;
            aVar.f39160e = aVar.mo27927a(str2);
            aVar.f39158c = z;
        }
        return aVar.mo27929c();
    }

    /* renamed from: a */
    static void m24816a(FragmentActivity fragmentActivity, C15233f fVar) {
        fragmentActivity.startActivityForResult(C15106a.f39009h.mo27932a(fVar), BaseNotice.HASHTAG);
    }

    /* renamed from: a */
    private C15233f m24815a(FragmentActivity fragmentActivity, GoogleSignInOptions googleSignInOptions) {
        if (this.f32504h == null) {
            this.f32504h = new C15234a(fragmentActivity).mo28117a(C15106a.f39006e, googleSignInOptions).mo28118a((C15235b) this).mo28120a();
        }
        return this.f32504h;
    }

    /* renamed from: a */
    private static void m24817a(C15233f fVar, C15359k<Status> kVar) {
        if (fVar.mo28114j()) {
            C15106a.f39009h.mo27933b(fVar).mo28123a((C15359k<? super R>) new C12336b<Object>(kVar));
        }
    }

    /* renamed from: b */
    public final void mo23315b(FragmentActivity fragmentActivity, Bundle bundle) {
        LobbyViewModel a = LobbyViewModel.m24844a(fragmentActivity);
        if (!mo23333c()) {
            C12317b.m24789a(a, "google", 2);
            return;
        }
        C15233f a2 = m24815a(fragmentActivity, m24814a(bundle));
        if (a2.mo28114j()) {
            m24817a(a2, (C15359k<Status>) new C12337c<Status>(a));
        } else {
            a.mo23338b(new C12315a("google", 2).mo23302a(false).mo23300a(new C12322b(new IllegalStateException("GoogleApiClient is not connected yet"))).mo23303a());
        }
    }

    /* renamed from: a */
    public final void mo23313a(FragmentActivity fragmentActivity, Bundle bundle) {
        LobbyViewModel a = LobbyViewModel.m24844a(fragmentActivity);
        if (!mo23333c()) {
            C12317b.m24789a(a, "google", 1);
            return;
        }
        this.f32502f = new WeakReference<>(fragmentActivity);
        this.f32501e = bundle;
        C15233f a2 = m24815a(fragmentActivity, m24814a(bundle));
        if (bundle.getBoolean("google_force_sign_out", true)) {
            a2.mo28109e();
            if (a2.mo28114j()) {
                m24817a(a2, (C15359k<Status>) new C12335a<Status>(this, fragmentActivity, a2));
            } else {
                this.f32503g = true;
            }
        } else {
            m24816a(fragmentActivity, a2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23312a(android.support.p030v4.app.FragmentActivity r6, int r7, int r8, android.content.Intent r9) {
        /*
            r5 = this;
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r6)
            r5.f32502f = r7
            r7 = 0
            if (r9 == 0) goto L_0x0035
            java.lang.String r8 = "googleSignInStatus"
            boolean r8 = r9.hasExtra(r8)
            if (r8 != 0) goto L_0x001b
            java.lang.String r8 = "googleSignInAccount"
            boolean r8 = r9.hasExtra(r8)
            if (r8 != 0) goto L_0x001b
            goto L_0x0035
        L_0x001b:
            java.lang.String r8 = "googleSignInAccount"
            android.os.Parcelable r8 = r9.getParcelableExtra(r8)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r8 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r8
            java.lang.String r0 = "googleSignInStatus"
            android.os.Parcelable r9 = r9.getParcelableExtra(r0)
            com.google.android.gms.common.api.Status r9 = (com.google.android.gms.common.api.Status) r9
            if (r8 == 0) goto L_0x002f
            com.google.android.gms.common.api.Status r9 = com.google.android.gms.common.api.Status.f39265a
        L_0x002f:
            com.google.android.gms.auth.api.signin.b r0 = new com.google.android.gms.auth.api.signin.b
            r0.<init>(r8, r9)
            goto L_0x0036
        L_0x0035:
            r0 = r7
        L_0x0036:
            if (r0 != 0) goto L_0x0043
            com.google.android.gms.common.api.Status r8 = com.google.android.gms.common.api.Status.f39267c
            com.google.android.gms.common.api.b r8 = com.google.android.gms.common.internal.C15427b.m32018a(r8)
            com.google.android.gms.b.g r8 = com.google.android.gms.p1033b.C15183j.m31394a(r8)
            goto L_0x0065
        L_0x0043:
            com.google.android.gms.common.api.Status r8 = r0.mo27935a()
            boolean r8 = r8.mo28060c()
            if (r8 == 0) goto L_0x0059
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r8 = r0.f39167a
            if (r8 != 0) goto L_0x0052
            goto L_0x0059
        L_0x0052:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r8 = r0.f39167a
            com.google.android.gms.b.g r8 = com.google.android.gms.p1033b.C15183j.m31395a(r8)
            goto L_0x0065
        L_0x0059:
            com.google.android.gms.common.api.Status r8 = r0.mo27935a()
            com.google.android.gms.common.api.b r8 = com.google.android.gms.common.internal.C15427b.m32018a(r8)
            com.google.android.gms.b.g r8 = com.google.android.gms.p1033b.C15183j.m31394a(r8)
        L_0x0065:
            java.lang.Class<com.google.android.gms.common.api.b> r9 = com.google.android.gms.common.api.C15227b.class
            java.lang.Object r8 = r8.mo27997a(r9)     // Catch:{ b -> 0x0071 }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r8 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r8     // Catch:{ b -> 0x0071 }
            r4 = r8
            r8 = r7
            r7 = r4
            goto L_0x0072
        L_0x0071:
            r8 = move-exception
        L_0x0072:
            r9 = 1
            if (r7 != 0) goto L_0x0134
            r7 = 0
            if (r8 == 0) goto L_0x0111
            int r8 = r8.getStatusCode()
            r0 = 7
            r1 = 3
            if (r8 == r0) goto L_0x0084
            r2 = 8
            if (r8 != r2) goto L_0x008d
        L_0x0084:
            int r2 = r5.f32500d
            int r2 = r2 + r9
            r5.f32500d = r2
            if (r2 > r1) goto L_0x008d
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            if (r2 == 0) goto L_0x0096
            android.os.Bundle r7 = r5.f32501e
            r5.mo23313a(r6, r7)
            return
        L_0x0096:
            r2 = 13
            if (r8 == r2) goto L_0x0109
            switch(r8) {
                case 5: goto L_0x0100;
                case 6: goto L_0x00f8;
                case 7: goto L_0x00ef;
                case 8: goto L_0x00e7;
                default: goto L_0x009d;
            }
        L_0x009d:
            r2 = 4
            r3 = -999(0xfffffffffffffc19, float:NaN)
            switch(r8) {
                case 15: goto L_0x00df;
                case 16: goto L_0x00d7;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            switch(r8) {
                case 12500: goto L_0x00cf;
                case 12501: goto L_0x00c7;
                case 12502: goto L_0x00bf;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            com.bytedance.lobby.b r1 = new com.bytedance.lobby.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown error code = "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r3 = ", check documentation"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r8, r2)
            goto L_0x0119
        L_0x00bf:
            com.bytedance.lobby.b r1 = new com.bytedance.lobby.b
            java.lang.String r0 = "A sign in process is currently in progress and the current one cannot continue. e.g. the user clicks the SignInButton multiple times and more than one sign in intent was launched"
            r1.<init>(r3, r8, r0)
            goto L_0x0119
        L_0x00c7:
            com.bytedance.lobby.b r1 = new com.bytedance.lobby.b
            java.lang.String r0 = "The sign in was cancelled by the user. i.e. user cancelled some of the sign in resolutions, e.g. account picking or OAuth consent"
            r1.<init>(r2, r8, r0)
            goto L_0x0119
        L_0x00cf:
            com.bytedance.lobby.b r0 = new com.bytedance.lobby.b
            java.lang.String r2 = "Sign in failed with the selected Google account. There is nothing user can do to recover from the sign in failure. Switching to another account may or may not help. Check adb log to see details if any"
            r0.<init>(r1, r8, r2)
            goto L_0x0107
        L_0x00d7:
            com.bytedance.lobby.b r1 = new com.bytedance.lobby.b
            java.lang.String r0 = "The result was canceled either due to client disconnect or cancel()"
            r1.<init>(r2, r8, r0)
            goto L_0x0119
        L_0x00df:
            com.bytedance.lobby.b r1 = new com.bytedance.lobby.b
            java.lang.String r0 = "Timed out while awaiting the result"
            r1.<init>(r3, r8, r0)
            goto L_0x0119
        L_0x00e7:
            com.bytedance.lobby.b r0 = new com.bytedance.lobby.b
            java.lang.String r2 = "Google internal error occurred. Retrying should resolve the problem"
            r0.<init>(r1, r8, r2)
            goto L_0x0107
        L_0x00ef:
            com.bytedance.lobby.b r1 = new com.bytedance.lobby.b
            r0 = 5
            java.lang.String r2 = "Google network error occurred. Retrying should resolve the problem"
            r1.<init>(r0, r8, r2)
            goto L_0x0119
        L_0x00f8:
            com.bytedance.lobby.b r0 = new com.bytedance.lobby.b
            java.lang.String r2 = "Completing the operation requires some form of resolution"
            r0.<init>(r1, r8, r2)
            goto L_0x0107
        L_0x0100:
            com.bytedance.lobby.b r0 = new com.bytedance.lobby.b
            java.lang.String r2 = "The client attempted to connect to the service with an invalid account name specified"
            r0.<init>(r1, r8, r2)
        L_0x0107:
            r1 = r0
            goto L_0x0119
        L_0x0109:
            com.bytedance.lobby.b r1 = new com.bytedance.lobby.b
            java.lang.String r2 = "The operation failed with no more detailed information from Google"
            r1.<init>(r0, r8, r2)
            goto L_0x0119
        L_0x0111:
            com.bytedance.lobby.b r1 = new com.bytedance.lobby.b
            r8 = 6
            java.lang.String r0 = "GoogleSignInAccount and ApiException are both null"
            r1.<init>(r8, r0)
        L_0x0119:
            com.bytedance.lobby.auth.AuthResult$a r8 = new com.bytedance.lobby.auth.AuthResult$a
            java.lang.String r0 = "google"
            r8.<init>(r0, r9)
            com.bytedance.lobby.auth.AuthResult$a r7 = r8.mo23302a(r7)
            com.bytedance.lobby.auth.AuthResult$a r7 = r7.mo23300a(r1)
            com.bytedance.lobby.auth.AuthResult r7 = r7.mo23303a()
            com.bytedance.lobby.internal.LobbyViewModel r6 = com.bytedance.lobby.internal.LobbyViewModel.m24844a(r6)
            r6.mo23338b(r7)
            return
        L_0x0134:
            com.bytedance.lobby.auth.AuthResult$a r8 = new com.bytedance.lobby.auth.AuthResult$a
            java.lang.String r0 = "google"
            r8.<init>(r0, r9)
            com.bytedance.lobby.auth.AuthResult$a r9 = r8.mo23302a(r9)
            java.lang.String r0 = r7.f39118b
            com.bytedance.lobby.auth.AuthResult$a r9 = r9.mo23301a(r0)
            com.bytedance.lobby.b.a r0 = new com.bytedance.lobby.b.a
            r0.<init>()
            java.lang.String r1 = "email"
            java.lang.String r2 = r7.f39120d
            com.bytedance.lobby.b.a r0 = r0.mo23324a(r1, r2)
            java.lang.String r1 = "display_name"
            java.lang.String r2 = r7.f39121e
            com.bytedance.lobby.b.a r0 = r0.mo23324a(r1, r2)
            java.lang.String r1 = "code"
            java.lang.String r2 = r7.f39123g
            com.bytedance.lobby.b.a r0 = r0.mo23324a(r1, r2)
            android.os.Bundle r0 = r0.mo23323a()
            com.bytedance.lobby.auth.AuthResult$a r9 = r9.mo23299a(r0)
            java.lang.String r7 = r7.f39119c
            r9.mo23304b(r7)
            com.bytedance.lobby.internal.LobbyViewModel r6 = com.bytedance.lobby.internal.LobbyViewModel.m24844a(r6)
            com.bytedance.lobby.auth.AuthResult r7 = r8.mo23303a()
            r6.mo23338b(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.google.GoogleAuth.mo23312a(android.support.v4.app.FragmentActivity, int, int, android.content.Intent):void");
    }
}
