package com.bytedance.android.livesdk.browser.shorturl;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b.C4511a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public final class ShortUrlService implements C4955a {

    /* renamed from: a */
    private ShortUrlApi f13287a;

    interface ShortUrlApi {
        @C12706h(mo23876a = "/hotsoon/share/link_command/")
        C2201v<C4177d<Object>> linkCommand(@C12724z(mo23894a = "url_schema_url") String str);

        @C12706h(mo23876a = "/hotsoon/short_url/gene/")
        C2201v<Object> shortenUrl(@C12724z(mo23894a = "long_url") String str, @C12724z(mo23894a = "target") String str2);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.shorturl.ShortUrlService$a */
    public static final class C4954a implements C4510b<C4955a> {
        /* renamed from: a */
        public final C4511a<C4955a> mo10307a(C4511a<C4955a> aVar) {
            return aVar.mo10337a(new ShortUrlService()).mo10336a();
        }
    }

    private ShortUrlService() {
        this.f13287a = (ShortUrlApi) C4514j.m10883j().mo10321b().mo9550a(ShortUrlApi.class);
    }
}
