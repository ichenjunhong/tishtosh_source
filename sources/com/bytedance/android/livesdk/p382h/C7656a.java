package com.bytedance.android.livesdk.p382h;

import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b.C4145a;
import com.bytedance.android.live.livepullstream.p250b.C4147d;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4181b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.C51171b;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.C51172c.C51174a;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.C51176d;
import com.p683ss.p2549c.p2550a.p2551a.p2554b.C51185a;
import p2658e.p2659a.p2660a.p2661a.p2662a.C53032a;

/* renamed from: com.bytedance.android.livesdk.h.a */
public final class C7656a implements C4181b {

    /* renamed from: a */
    private C51185a f21087a;

    /* renamed from: com.bytedance.android.livesdk.h.a$a */
    public static final class C7658a implements C4144b<C4181b> {
        /* renamed from: a */
        public final C4145a<C4181b> mo9533a(C4145a<C4181b> aVar) {
            return aVar.mo9535a(new C7656a()).mo9534a();
        }
    }

    private C7656a() {
    }

    /* renamed from: a */
    public final C51185a mo9574a() {
        return this.f21087a;
    }

    /* renamed from: a */
    public final void mo9575a(C51185a aVar) {
        this.f21087a = aVar;
    }

    /* renamed from: a */
    public final void mo9576a(boolean z) {
        boolean z2;
        try {
            Context context = ((IHostContext) C4116c.m10249a(IHostContext.class)).context();
            String a = C53032a.m112777a(context);
            if ((a == null || !a.contains(":")) && a != null && a.equals(context.getPackageName())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (((Integer) LiveSettingKeys.DNS_OPT_METHOD.mo9431a()).intValue() == 1 && C4147d.m10295f().mo9530c().mo9574a() == null) {
            C51174a aVar = new C51174a();
            aVar.f127817b = "https://hotapi-va.isnssdk.com";
            aVar.f127819d = ((IHostContext) C4116c.m10249a(IHostContext.class)).getUpdateVersionCode();
            aVar.f127820e = new C51171b() {
                /* renamed from: a */
                public final String mo14019a(String str) throws Exception {
                    return new String(((C8815e) ((INetworkService) C4116c.m10249a(INetworkService.class)).get(str, null).mo15805a()).f24066e);
                }

                /* renamed from: a */
                public final String mo14020a(String str, byte[] bArr, String str2, String str3) throws Exception {
                    return new String(((C8815e) ((INetworkService) C4116c.m10249a(INetworkService.class)).post(str, null, str3, bArr).mo15805a()).f24066e);
                }
            };
            C51176d.m110086a().mo101707a(aVar.mo101706a());
            C51185a aVar2 = new C51185a(((IHostContext) C4116c.m10249a(IHostContext.class)).context().getApplicationContext());
            C4147d.m10295f().mo9530c().mo9575a(aVar2);
            try {
                aVar2.f127845e = true;
                aVar2.f127842b.registerReceiver(aVar2.f127843c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                C51176d.m110086a().f127824c.mo101708a();
            } catch (Throwable unused2) {
            }
        }
    }
}
