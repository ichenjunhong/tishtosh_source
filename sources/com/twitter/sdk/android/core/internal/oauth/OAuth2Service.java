package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.internal.C52136q;
import com.twitter.sdk.android.core.internal.p2617a.C52103f;
import okio.ByteString;
import p2666g.C53061b;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53078i;
import p2666g.p2672c.C53080k;
import p2666g.p2672c.C53084o;

public final class OAuth2Service extends C52133d {

    /* renamed from: a */
    OAuth2Api f129753a = ((OAuth2Api) this.f129774e.mo110651a(OAuth2Api.class));

    interface OAuth2Api {
        @C53080k(mo110609a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @C53074e
        @C53084o(mo110612a = "/oauth2/token")
        C53061b<OAuth2Token> getAppAuthToken(@C53078i(mo110608a = "Authorization") String str, @C53072c(mo110600a = "grant_type") String str2);

        @C53084o(mo110612a = "/1.1/guest/activate.json")
        C53061b<C52130a> getGuestToken(@C53078i(mo110608a = "Authorization") String str);
    }

    /* renamed from: a */
    private String m111492a() {
        TwitterAuthConfig twitterAuthConfig = this.f129771b.f130052e;
        StringBuilder sb = new StringBuilder();
        sb.append(C52103f.m111440b(twitterAuthConfig.f129647a));
        sb.append(":");
        sb.append(C52103f.m111440b(twitterAuthConfig.f129648b));
        ByteString encodeUtf8 = ByteString.encodeUtf8(sb.toString());
        StringBuilder sb2 = new StringBuilder("Basic ");
        sb2.append(encodeUtf8.base64());
        return sb2.toString();
    }

    /* renamed from: b */
    private void m111493b(C52068b<OAuth2Token> bVar) {
        this.f129753a.getAppAuthToken(m111492a(), "client_credentials").mo110595a(bVar);
    }

    /* renamed from: a */
    public final void mo108834a(final C52068b<GuestAuthToken> bVar) {
        m111493b(new C52068b<OAuth2Token>() {
            /* renamed from: a */
            public final void mo23367a(C52229t tVar) {
                if (bVar != null) {
                    bVar.mo23367a(tVar);
                }
            }

            /* renamed from: a */
            public final void mo23366a(C52077i<OAuth2Token> iVar) {
                final OAuth2Token oAuth2Token = (OAuth2Token) iVar.f129666a;
                C521271 r0 = new C52068b<C52130a>() {
                    /* renamed from: a */
                    public final void mo23367a(C52229t tVar) {
                        bVar.mo23367a(tVar);
                    }

                    /* renamed from: a */
                    public final void mo23366a(C52077i<C52130a> iVar) {
                        bVar.mo23366a(new C52077i<>(new GuestAuthToken(oAuth2Token.f129758c, oAuth2Token.f129759d, ((C52130a) iVar.f129666a).f129763a), null));
                    }
                };
                OAuth2Api oAuth2Api = OAuth2Service.this.f129753a;
                StringBuilder sb = new StringBuilder("Bearer ");
                sb.append(oAuth2Token.f129759d);
                oAuth2Api.getGuestToken(sb.toString()).mo110595a(r0);
            }
        });
    }

    public OAuth2Service(C52225r rVar, C52136q qVar) {
        super(rVar, qVar);
    }
}
