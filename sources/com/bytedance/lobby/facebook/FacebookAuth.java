package com.bytedance.lobby.facebook;

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
import com.facebook.AccessToken;
import com.facebook.C13855f;
import com.facebook.C13904i;
import com.facebook.C14457k;
import com.facebook.internal.C14308d;
import com.facebook.internal.C14308d.C14310b;
import com.facebook.login.C14526g;

public class FacebookAuth extends FacebookProvider<AuthResult> implements C12321d, C13904i<C14526g> {

    /* renamed from: c */
    private static final boolean f32494c = C12311a.f32450a;

    /* renamed from: d */
    private C13855f f32495d;

    /* renamed from: e */
    private LobbyViewModel f32496e;

    /* renamed from: f */
    private C12334a f32497f;

    /* renamed from: b */
    public final String mo23314b() {
        if (AccessToken.m27253a() != null) {
            return AccessToken.m27253a().f35176e;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo23311a() {
        if (this.f32497f != null) {
            C12334a aVar = this.f32497f;
            C13855f fVar = this.f32495d;
            aVar.getLoginManager();
            if (fVar instanceof C14308d) {
                ((C14308d) fVar).f37250a.remove(Integer.valueOf(C14310b.Login.toRequestCode()));
                this.f32497f.onDetachedFromWindow();
                return;
            }
            throw new C14457k("Unexpected CallbackManager, please use the provided Factory.");
        }
    }

    /* renamed from: n_ */
    public final void mo23330n_() {
        this.f32496e.mo23338b(new C12315a("facebook", 1).mo23302a(false).mo23300a(new C12322b(4, "Facebook login cancelled")).mo23303a());
    }

    public FacebookAuth(C12324c cVar) {
        super(LobbyCore.getApplication(), cVar);
    }

    /* renamed from: a */
    public final void mo23328a(C14457k kVar) {
        this.f32496e.mo23338b(new C12315a("facebook", 1).mo23302a(false).mo23300a(new C12322b(kVar)).mo23303a());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23329a(Object obj) {
        C14526g gVar = (C14526g) obj;
        this.f32496e.mo23338b(new C12315a("facebook", 1).mo23302a(true).mo23304b(gVar.f37739a.f35176e).mo23298a(gVar.f37739a.f35172a.getTime()).mo23301a(gVar.f37739a.f35180i).mo23303a());
    }

    /* renamed from: b */
    public final void mo23315b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12317b.m24788a(this.f32496e, this.f32525b.f32487b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x003b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23313a(android.support.p030v4.app.FragmentActivity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m440a(r4)
            java.lang.Class<com.bytedance.lobby.internal.LobbyViewModel> r1 = com.bytedance.lobby.internal.LobbyViewModel.class
            android.arch.lifecycle.x r0 = r0.mo359a(r1)
            com.bytedance.lobby.internal.LobbyViewModel r0 = (com.bytedance.lobby.internal.LobbyViewModel) r0
            r3.f32496e = r0
            boolean r0 = r3.mo23333c()
            r1 = 1
            if (r0 != 0) goto L_0x001d
            com.bytedance.lobby.internal.LobbyViewModel r4 = r3.f32496e
            java.lang.String r5 = "facebook"
            com.bytedance.lobby.auth.C12317b.m24789a(r4, r5, r1)
            return
        L_0x001d:
            com.facebook.internal.d r0 = new com.facebook.internal.d
            r0.<init>()
            r3.f32495d = r0
            com.facebook.login.LoginManager r0 = com.facebook.login.LoginManager.m29666a()
            com.facebook.f r2 = r3.f32495d
            r0.mo26709a(r2, r3)
            if (r5 == 0) goto L_0x003b
            java.lang.String r0 = "fb_read_permissions"
            java.lang.String r5 = r5.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            java.lang.String r5 = "public_profile"
        L_0x003d:
            com.bytedance.lobby.facebook.a r0 = new com.bytedance.lobby.facebook.a
            r0.<init>(r4)
            r3.f32497f = r0
            com.bytedance.lobby.facebook.a r4 = r3.f32497f
            java.lang.String[] r0 = new java.lang.String[r1]
            r1 = 0
            r0[r1] = r5
            r4.setReadPermissions(r0)
            com.bytedance.lobby.facebook.a r4 = r3.f32497f
            com.facebook.f r5 = r3.f32495d
            com.facebook.login.LoginManager r4 = r4.getLoginManager()
            r4.mo26709a(r5, r3)
            com.facebook.AccessToken r4 = com.facebook.AccessToken.m27253a()
            if (r4 == 0) goto L_0x0066
            com.facebook.login.LoginManager r4 = com.facebook.login.LoginManager.m29666a()
            r4.mo26711b()
        L_0x0066:
            com.bytedance.lobby.facebook.a r4 = r3.f32497f
            r4.performClick()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.facebook.FacebookAuth.mo23313a(android.support.v4.app.FragmentActivity, android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo23312a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        if (this.f32495d != null) {
            this.f32495d.mo25994a(i, i2, intent);
            return;
        }
        this.f32496e.mo23338b(new C12315a("facebook", 1).mo23302a(false).mo23300a(new C12322b(3, "Facebook CallbackManager is null")).mo23303a());
    }
}
