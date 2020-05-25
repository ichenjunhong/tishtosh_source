package com.bytedance.android.livesdk.chatroom.p325ui;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p388k.C7709b;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ai */
final /* synthetic */ class C5931ai implements C1710e {

    /* renamed from: a */
    private final C5929ah f15616a;

    /* renamed from: b */
    private final long f15617b;

    /* renamed from: c */
    private final C7505d f15618c;

    C5931ai(C5929ah ahVar, long j, C7505d dVar) {
        this.f15616a = ahVar;
        this.f15617b = j;
        this.f15618c = dVar;
    }

    public final void accept(Object obj) {
        int i;
        C5929ah ahVar = this.f15616a;
        long j = this.f15617b;
        C7505d dVar = this.f15618c;
        C7514m mVar = (C7514m) ((C4177d) obj).data;
        C7647s.m15648a(ahVar.f15598b, ahVar.f15597a.getId(), SystemClock.uptimeMillis() - j);
        if (dVar != null && dVar.f20539H) {
            C7647s.m15646a(ahVar.f15598b, ahVar.f15597a.getId(), 1, "gift_guide", SystemClock.uptimeMillis() - j);
        }
        if (ahVar.f15599c != null) {
            ahVar.f15599c.mo9492a(mVar);
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10091a(mVar.f20611c);
            int i2 = 0;
            if (C4600j.m11040b(ahVar.f15602f) && ahVar.f15597a.author() != null) {
                JSONObject jSONObject = new JSONObject();
                String str = "amount";
                if (dVar == null) {
                    i = 0;
                } else {
                    try {
                        i = dVar.f20545f;
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put(str, String.valueOf(i));
                jSONObject.put("anchor_id", String.valueOf(ahVar.f15597a.author().getId()));
                jSONObject.put("room_id", String.valueOf(ahVar.f15597a.getId()));
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject).mo14222a(C4600j.m11041c(ahVar.f15602f));
            }
            if (C4600j.m11043d(ahVar.f15602f) && ahVar.f15597a.author() != null) {
                JSONObject jSONObject2 = new JSONObject();
                String str2 = "amount";
                if (dVar != null) {
                    try {
                        i2 = dVar.f20545f;
                    } catch (JSONException unused2) {
                    }
                }
                jSONObject2.put(str2, String.valueOf(i2));
                jSONObject2.put("anchor_id", String.valueOf(ahVar.f15597a.author().getId()));
                jSONObject2.put("room_id", String.valueOf(ahVar.f15597a.getId()));
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject2).mo14222a(C4600j.m11044e(ahVar.f15602f));
            }
            if (!(mVar == null || ahVar.f15597a == null || !ahVar.f15597a.isStar())) {
                C7505d findGiftById = GiftManager.inst().findGiftById(mVar.f20613e);
                if (findGiftById != null && findGiftById.f20539H) {
                    C4495a.m10823a().mo10301a((Object) new C7709b(1, "cny_send_gift", new JSONObject()));
                }
            }
        }
    }
}
