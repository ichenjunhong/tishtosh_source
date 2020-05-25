package com.bytedance.lobby.kakao;

import android.app.Activity;
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
import com.bytedance.lobby.internal.LobbyViewModel;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.auth.AuthService;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISessionCallback;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.network.ErrorResult;
import com.kakao.util.exception.KakaoException;

public class KakaoAuth extends KakaoProvider<AuthResult> implements C12321d {

    /* renamed from: c */
    public static final boolean f32551c = C12311a.f32450a;

    /* renamed from: d */
    public LobbyViewModel f32552d;

    /* renamed from: e */
    private ISessionCallback f32553e;

    /* renamed from: a */
    public final void mo23311a() {
    }

    /* renamed from: b */
    public final String mo23314b() {
        if (KakaoSDK.getAdapter() != null) {
            Session currentSession = Session.getCurrentSession();
            if (currentSession != null) {
                AccessToken tokenInfo = currentSession.getTokenInfo();
                if (tokenInfo == null) {
                    return null;
                }
                return tokenInfo.getAccessToken();
            }
        }
        return null;
    }

    public KakaoAuth(C12324c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final void mo23350a(C12322b bVar) {
        this.f32552d.mo23338b(new C12315a(this.f32525b.f32487b, 1).mo23302a(false).mo23300a(bVar).mo23303a());
    }

    /* renamed from: a */
    public final void mo23313a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32552d = LobbyViewModel.m24844a(fragmentActivity);
        if (!mo23333c()) {
            C12317b.m24789a(this.f32552d, this.f32525b.f32487b, 1);
            return;
        }
        this.f32553e = new ISessionCallback() {
            public final void onSessionOpened() {
                final Session currentSession = Session.getCurrentSession();
                if (currentSession != null) {
                    AuthService.getInstance().requestAccessTokenInfo(new ApiResponseCallback<AccessTokenInfoResponse>() {
                        public final void onNotSignedUp() {
                            KakaoAuth.this.mo23350a(new C12322b(-999, "KakaoSDK ApiResponseCallback onNotSignedUp"));
                        }

                        public final void onFailure(ErrorResult errorResult) {
                            C12322b bVar;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                bVar = new C12322b(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                bVar = new C12322b(3, "KakaoSDK ApiResponseCallback onFailure with no ErrorResult");
                            }
                            kakaoAuth.mo23350a(bVar);
                        }

                        public final void onFailureForUiThread(ErrorResult errorResult) {
                            C12322b bVar;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                bVar = new C12322b(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                bVar = new C12322b(3, "KakaoSDK ApiResponseCallback onFailureForUiThread with no ErrorResult");
                            }
                            kakaoAuth.mo23350a(bVar);
                        }

                        public final void onSessionClosed(ErrorResult errorResult) {
                            C12322b bVar;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                bVar = new C12322b(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                bVar = new C12322b(3, "KakaoSDK ApiResponseCallback onSessionClosed with no ErrorResult");
                            }
                            kakaoAuth.mo23350a(bVar);
                        }

                        public final /* synthetic */ void onSuccess(Object obj) {
                            AccessTokenInfoResponse accessTokenInfoResponse = (AccessTokenInfoResponse) obj;
                            if (accessTokenInfoResponse == null) {
                                KakaoAuth.this.mo23350a(new C12322b(3, "KakaoSDK ApiResponseCallback onSuccess called, but AccessTokenInfoResponse is null."));
                                return;
                            }
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            long currentTimeMillis = System.currentTimeMillis() + accessTokenInfoResponse.getExpiresInMillis();
                            kakaoAuth.f32552d.mo23338b(new C12315a(kakaoAuth.f32525b.f32487b, 1).mo23302a(true).mo23304b(currentSession.getTokenInfo().getAccessToken()).mo23298a(currentTimeMillis).mo23301a(String.valueOf(accessTokenInfoResponse.getUserId())).mo23303a());
                        }
                    });
                }
            }

            public final void onSessionOpenFailed(KakaoException kakaoException) {
                KakaoAuth.this.f32552d.mo23338b(new C12315a(KakaoAuth.this.f32525b.f32487b, 1).mo23302a(false).mo23300a(new C12322b(kakaoException).setCancelled(true)).mo23303a());
            }
        };
        Session.getCurrentSession().addCallback(this.f32553e);
        Session.getCurrentSession().checkAndImplicitOpen();
        Session.getCurrentSession().open(AuthType.KAKAO_LOGIN_ALL, (Activity) fragmentActivity);
    }

    /* renamed from: b */
    public final void mo23315b(FragmentActivity fragmentActivity, Bundle bundle) {
        if (Session.getCurrentSession().isOpened()) {
            Session.getCurrentSession().close();
            this.f32552d.mo23338b(new C12315a(this.f32525b.f32487b, 1).mo23302a(true).mo23303a());
        }
    }

    /* renamed from: a */
    public final void mo23312a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        if (this.f32553e != null) {
            Session.getCurrentSession().handleActivityResult(i, i2, intent);
        }
    }
}
