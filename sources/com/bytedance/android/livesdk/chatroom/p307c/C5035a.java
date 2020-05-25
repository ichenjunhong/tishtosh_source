package com.bytedance.android.livesdk.chatroom.p307c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.gift.model.p379a.C7492c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.bytedance.android.livesdkapi.p458l.p459a.C8839e;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.a */
public final class C5035a {
    /* renamed from: a */
    public static void m11518a(Context context, C7492c cVar) {
        m11519a(context, (C8692a) cVar.f20516d, null);
    }

    /* renamed from: a */
    public static void m11519a(Context context, C8692a aVar, Map<String, Object> map) {
        switch (aVar.f23801h) {
            case 2:
                ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(context, C4704c.m11227b(aVar.f23799f).mo10505a(aVar.f23795b));
                return;
            case 3:
                C8839e eVar = new C8839e(aVar.f23799f);
                eVar.mo15827a("is_first_consume", String.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).isFirstConsume(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
                if (map != null && map.size() > 0) {
                    for (Entry entry : map.entrySet()) {
                        eVar.mo15827a((String) entry.getKey(), entry.getValue().toString());
                    }
                }
                int i = aVar.f23798e;
                int i2 = aVar.f23797d;
                C4495a a = C4495a.m10823a();
                C5161ag agVar = new C5161ag(eVar.mo15824a(), "banner", 17, i, i2, 2);
                a.mo10301a((Object) agVar);
                return;
            default:
                C8839e eVar2 = new C8839e(aVar.f23799f);
                eVar2.mo15827a("title", aVar.f23795b);
                ((C8260a) C4116c.m10249a(C8260a.class)).handle(context, Uri.parse(eVar2.mo15824a()));
                return;
        }
    }
}
