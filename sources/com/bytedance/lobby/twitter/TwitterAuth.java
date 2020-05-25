package com.bytedance.lobby.twitter;

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
import com.bytedance.lobby.p778b.C12323a;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52188j;
import com.twitter.sdk.android.core.C52189k;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.identity.C52082a;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import java.util.Arrays;

public class TwitterAuth extends TwitterProvider<AuthResult> implements C12321d {

    /* renamed from: c */
    public static final boolean f32562c = C12311a.f32450a;

    /* renamed from: d */
    public LobbyViewModel f32563d;

    /* renamed from: e */
    private TwitterLoginButton f32564e;

    /* renamed from: f */
    private C52068b<C52231v> f32565f;

    /* renamed from: a */
    public final void mo23311a() {
        this.f32564e = null;
    }

    /* renamed from: b */
    public final String mo23314b() {
        C52188j jVar;
        C52189k<C52231v> kVar = C52225r.m111638a().f130049b;
        if (kVar == null || kVar.mo108768a() == null) {
            jVar = null;
        } else {
            jVar = (C52231v) kVar.mo108768a();
        }
        if (jVar == null || jVar.f129901a == null) {
            return null;
        }
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) jVar.f129901a;
        if (twitterAuthToken == null) {
            return null;
        }
        return twitterAuthToken.f129649b;
    }

    public TwitterAuth(C12324c cVar) {
        super(LobbyCore.getApplication(), cVar);
    }

    /* renamed from: b */
    public final void mo23315b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12317b.m24788a(this.f32563d, this.f32525b.f32487b);
    }

    /* renamed from: a */
    public final void mo23313a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32563d = LobbyViewModel.m24844a(fragmentActivity);
        if (!mo23333c()) {
            C12317b.m24789a(this.f32563d, this.f32525b.f32487b, 1);
            return;
        }
        this.f32564e = new TwitterLoginButton(fragmentActivity);
        this.f32565f = new C52068b<C52231v>() {
            /* renamed from: a */
            public final void mo23366a(C52077i<C52231v> iVar) {
                TwitterAuth twitterAuth = TwitterAuth.this;
                C52231v vVar = (C52231v) iVar.f129666a;
                String str = ((TwitterAuthToken) vVar.f129901a).f129649b;
                twitterAuth.f32563d.mo23338b(new C12315a(twitterAuth.f32525b.f32487b, 1).mo23302a(true).mo23304b(str).mo23305c(((TwitterAuthToken) vVar.f129901a).f129650c).mo23301a(String.valueOf(vVar.f129902b)).mo23299a(new C12323a().mo23324a("username", vVar.f130066c).mo23323a()).mo23303a());
            }

            /* renamed from: a */
            public final void mo23367a(C52229t tVar) {
                String message = tVar.getMessage();
                C12315a aVar = new C12315a(TwitterAuth.this.f32525b.f32487b, 1);
                if (Arrays.asList(new String[]{"Authorize failed.", "Authorization failed, request was canceled.", "Failed to get authorization, bundle incomplete"}).contains(message)) {
                    aVar.mo23302a(false).mo23300a(new C12322b(4, message));
                } else {
                    aVar.mo23302a(false).mo23300a(new C12322b(tVar));
                }
                TwitterAuth.this.f32563d.mo23338b(aVar.mo23303a());
            }
        };
        this.f32564e.setCallback(this.f32565f);
        this.f32564e.performClick();
    }

    /* renamed from: a */
    public final void mo23312a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        if (this.f32564e != null) {
            TwitterLoginButton twitterLoginButton = this.f32564e;
            twitterLoginButton.getTwitterAuthClient();
            if (i == 140) {
                TwitterAuthClient twitterAuthClient = twitterLoginButton.getTwitterAuthClient();
                StringBuilder sb = new StringBuilder("onActivityResult called with ");
                sb.append(i);
                sb.append(" ");
                sb.append(i2);
                if (twitterAuthClient.f129672b.mo108786a()) {
                    C52082a aVar = (C52082a) twitterAuthClient.f129672b.f129686a.get();
                    if (aVar != null && aVar.mo108784a(i, i2, intent)) {
                        twitterAuthClient.f129672b.f129686a.set(null);
                    }
                }
            }
        }
    }
}
