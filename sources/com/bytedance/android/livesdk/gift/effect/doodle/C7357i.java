package com.bytedance.android.livesdk.gift.effect.doodle;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.C7648t;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p378h.C7459a;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7565d;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8058i;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8062m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.i */
final /* synthetic */ class C7357i implements C1710e {

    /* renamed from: a */
    private final C7330a f20065a;

    /* renamed from: b */
    private final C7525b f20066b;

    /* renamed from: c */
    private final long f20067c;

    C7357i(C7330a aVar, C7525b bVar, long j) {
        this.f20065a = aVar;
        this.f20066b = bVar;
        this.f20067c = j;
    }

    public final void accept(Object obj) {
        long j;
        long j2;
        C7330a aVar = this.f20065a;
        C7525b bVar = this.f20066b;
        long j3 = this.f20067c;
        C7514m mVar = (C7514m) ((C4177d) obj).data;
        mVar.f20617i = bVar.f20670a.size();
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10091a(mVar.f20611c);
        int i = mVar.f20617i;
        long longValue = ((Long) aVar.f20000f.get("data_gift_group_id", Long.valueOf(0))).longValue();
        long id = (aVar.f20011r == null || aVar.f20011r.f20042c == null) ? 0 : aVar.f20011r.f20042c.getId();
        String str = aVar.f20016w;
        if (aVar.f20001g == null || bVar == null) {
            j = j3;
        } else {
            String str2 = C7565d.GUEST == aVar.f20015v ? "guest_tuya_gift" : "tuya_gift";
            HashSet hashSet = new HashSet();
            try {
                JSONObject jSONObject = new JSONObject();
                if (aVar.f20001g != null) {
                    j = j3;
                    try {
                        jSONObject.put("UID", ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b());
                        jSONObject.put("room_id", aVar.f20001g.getId());
                        jSONObject.put("source", aVar.f20001g.getUserFrom());
                        jSONObject.put("request_id", aVar.f20001g.getRequestId());
                        jSONObject.put("log_pb", aVar.f20001g.getLog_pb());
                        if (!TextUtils.isEmpty(aVar.f20001g.getSourceType())) {
                            jSONObject.put("moment_room_source", aVar.f20001g.getSourceType());
                        }
                    } catch (Exception e) {
                        e = e;
                        C3831a.m9716d("DoodleGiftDialogFragment", e.toString());
                        C7647s.m15648a(998, aVar.f20001g.getId(), SystemClock.uptimeMillis() - j);
                    }
                } else {
                    j = j3;
                }
                int i2 = 0;
                for (C7648t tVar : aVar.f20012s.f20670a) {
                    int i3 = i;
                    hashSet.add(Long.valueOf(tVar.f21073c));
                    i2 += tVar.f21074d;
                    i = i3;
                }
                int i4 = i;
                jSONObject.put("gift_id", hashSet);
                if (aVar.f20015v == C7565d.GUEST) {
                    jSONObject.put("UID", aVar.f20002h.getId());
                }
                jSONObject.put("enter_from", str);
                jSONObject.put("event_page", aVar.f19996b ? "live_take_detail" : "live_detail");
                HashMap hashMap = new HashMap();
                if (longValue != 0) {
                    hashMap.put("team_id", String.valueOf(longValue));
                    hashMap.put("top_anchor_id", aVar.f20002h == null ? "" : aVar.f20002h.getIdStr());
                }
                hashMap.put("request_id", aVar.f20001g.getRequestId());
                hashMap.put("log_pb", aVar.f20001g.getLog_pb());
                hashMap.put("gift_cnt", String.valueOf(i4));
                HashMap hashMap2 = new HashMap();
                if (bVar == null || C9414h.m18630a(bVar.f20670a)) {
                    hashMap2.put(Long.valueOf(998), Integer.valueOf(1));
                } else {
                    for (C7648t tVar2 : bVar.f20670a) {
                        if (!hashMap2.containsKey(Long.valueOf(tVar2.f21073c))) {
                            hashMap2.put(Long.valueOf(tVar2.f21073c), Integer.valueOf(1));
                        } else {
                            hashMap2.put(Long.valueOf(tVar2.f21073c), Integer.valueOf(((Integer) hashMap2.get(Long.valueOf(tVar2.f21073c))).intValue() + 1));
                        }
                    }
                }
                hashMap.put("gift_info", C7459a.m15414a(hashMap2));
                hashMap.put("is_first_consume", String.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).isFirstConsume(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
                hashMap.put("growth_deepevent", "1");
                hashMap.put(MovieDetailAPi.f94892b, String.valueOf(id));
                C8049c a = C8049c.m15979a();
                String str3 = "send_gift";
                Object[] objArr = new Object[4];
                String obj2 = hashSet.toString();
                int i5 = aVar.f20015v == C7565d.GUEST ? C8058i.f22019b : C8058i.f22018a;
                if (aVar.f20002h == null) {
                    j2 = 0;
                } else {
                    j2 = aVar.f20002h.getId();
                }
                C8062m mVar2 = new C8062m(str2, obj2, i2, i5, j2);
                objArr[0] = mVar2;
                objArr[1] = new C8059j().mo14213a(aVar.f19996b ? "live_take_detail" : "live_detail").mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                objArr[2] = Room.class;
                objArr[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
                a.mo14202a(str3, hashMap, objArr);
            } catch (Exception e2) {
                e = e2;
                j = j3;
                C3831a.m9716d("DoodleGiftDialogFragment", e.toString());
                C7647s.m15648a(998, aVar.f20001g.getId(), SystemClock.uptimeMillis() - j);
            }
        }
        C7647s.m15648a(998, aVar.f20001g.getId(), SystemClock.uptimeMillis() - j);
    }
}
