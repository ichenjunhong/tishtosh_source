package com.p683ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.awemelobby.C9204a;
import com.bytedance.lobby.C12324c;
import com.bytedance.lobby.C12324c.C12326a;
import com.bytedance.lobby.C12324c.C12327b;
import com.bytedance.lobby.C12324c.C12328c;
import com.bytedance.lobby.C12324c.C12329d;
import com.bytedance.lobby.C12324c.C12330e;
import com.bytedance.lobby.C12324c.C12331f;
import com.bytedance.lobby.C12324c.C12332g;
import com.bytedance.lobby.C12324c.C12333h;
import com.bytedance.lobby.internal.C12343c;
import com.bytedance.lobby.internal.C12343c.C12345a.C12346a;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.setting.C41587bf;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.task.LobbyInitTask */
public final class LobbyInitTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.MAIN;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(context, "context");
        C12324c[] cVarArr = new C12324c[7];
        C12324c a = new C12328c(C24095a.m58946c()).mo23325a(2).mo23327a();
        C52711k.m112236a((Object) a, "LobbyProviderConfig.Goog…                 .build()");
        int i = 0;
        cVarArr[0] = a;
        C12324c a2 = new C12327b(C24095a.m58947d()).mo23325a(2).mo23327a();
        C52711k.m112236a((Object) a2, "LobbyProviderConfig.Face…                 .build()");
        cVarArr[1] = a2;
        C12324c a3 = new C12331f(C24095a.m58945b()).mo23325a(2).mo23327a();
        C52711k.m112236a((Object) a3, "LobbyProviderConfig.Line…                 .build()");
        cVarArr[2] = a3;
        C12326a a4 = new C12329d(C24095a.m58948e()).mo23325a(2);
        Bundle bundle = new Bundle();
        if (C41587bf.m91423a()) {
            bundle.putString("ig_scope", "user_profile");
        }
        bundle.putString("ig_redirect_url", C24095a.m58949f());
        bundle.putString("ig_login_auth_url", "https://api.instagram.com/oauth/authorize/");
        C12324c a5 = a4.mo23326a(bundle).mo23327a();
        C52711k.m112236a((Object) a5, "LobbyProviderConfig.Inst…                 .build()");
        cVarArr[3] = a5;
        C12326a a6 = new C12332g(C24095a.m58950g()).mo23325a(2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("twitter_consumer_secret", C24095a.m58951h());
        C12324c a7 = a6.mo23326a(bundle2).mo23327a();
        C52711k.m112236a((Object) a7, "LobbyProviderConfig.Twit…                 .build()");
        cVarArr[4] = a7;
        C12324c a8 = new C12330e(C24095a.m58953j()).mo23325a(2).mo23327a();
        C52711k.m112236a((Object) a8, "LobbyProviderConfig.Kaka…                 .build()");
        cVarArr[5] = a8;
        C12324c a9 = new C12333h(C24095a.m58954k()).mo23325a(2).mo23327a();
        C52711k.m112236a((Object) a9, "LobbyProviderConfig.VkBu…                 .build()");
        cVarArr[6] = a9;
        List b = C52575l.m112099b((Object[]) cVarArr);
        C12343c.m24852a(new C12346a().mo23343a(context).mo23345a(C9204a.f25175a).mo23344a(b).mo23346a());
        if (C9204a.f25175a) {
            StringBuilder sb = new StringBuilder();
            for (Object next : b) {
                int i2 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                C12324c cVar = (C12324c) next;
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(cVar.f32487b);
                i = i2;
            }
            C52711k.m112236a((Object) sb.toString(), "StringBuilder().apply {\n…\n            }.toString()");
        }
    }
}
