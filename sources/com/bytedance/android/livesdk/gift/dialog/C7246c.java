package com.bytedance.android.livesdk.gift.dialog;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p378h.C7459a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.c */
public final class C7246c {
    /* renamed from: a */
    public static void m15028a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("cards_left", String.valueOf(i));
        C8049c.m15979a().mo14202a("popular_card_show", hashMap, Room.class);
    }

    /* renamed from: a */
    public static void m15029a(int i, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("cards_left", String.valueOf(i));
        hashMap.put("room_id", String.valueOf(j));
        C8049c.m15979a().mo14202a("popular_card_click", hashMap, new Object[0]);
    }

    /* renamed from: a */
    public static void m15031a(Room room, int i, int i2) {
        HashMap hashMap = new HashMap();
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", String.valueOf(room.getId()));
        }
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageType", String.valueOf(i2));
        C8049c.m15979a().mo14202a("gift_pages_show", hashMap, new C8059j(), Room.class);
    }

    /* renamed from: a */
    public static void m15030a(C7514m mVar, User user, boolean z, Room room, int i) {
        int i2;
        int i3;
        int i4;
        long j;
        String str;
        int i5;
        int i6;
        int i7;
        String str2;
        C7514m mVar2 = mVar;
        if (mVar2 != null && mVar2.f20613e != -1 && mVar2.f20616h > 0) {
            C7505d findGiftById = GiftManager.inst().findGiftById(mVar2.f20613e);
            if (findGiftById != null && findGiftById.f20544e != 2 && findGiftById.f20544e != 8) {
                if (mVar2.f20620l > 0) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Long valueOf = Long.valueOf(mVar2.f20620l);
                    if (findGiftById.f20544e == 2) {
                        i5 = 1;
                    } else {
                        i5 = mVar2.f20616h;
                    }
                    hashMap2.put(valueOf, Integer.valueOf(i5));
                    hashMap.put("prop_info", C7459a.m15414a(hashMap2));
                    String str3 = "gift_cnt";
                    if (findGiftById.f20544e == 2) {
                        i6 = 1;
                    } else {
                        i6 = mVar2.f20616h;
                    }
                    hashMap.put(str3, String.valueOf(i6));
                    if (findGiftById.f20544e == 2) {
                        i7 = 1;
                    } else {
                        i7 = mVar2.f20616h;
                    }
                    hashMap.put("money", String.valueOf(i7 * findGiftById.f20545f));
                    if (!(user == null || user.getId() == room.getOwnerUserId())) {
                        hashMap.put("to_user_id", String.valueOf(user.getId()));
                    }
                    C8049c a = C8049c.m15979a();
                    String str4 = "send_prop";
                    Object[] objArr = new Object[5];
                    C8059j jVar = new C8059j();
                    if (z) {
                        str2 = "live_take_detail";
                    } else {
                        str2 = "live_detail";
                    }
                    objArr[0] = jVar.mo14213a(str2).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                    objArr[1] = Room.class;
                    objArr[2] = C7519o.m15513a(mVar);
                    objArr[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
                    objArr[4] = new C8060k();
                    a.mo14202a(str4, hashMap, objArr);
                    return;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("gift_position", String.valueOf(i));
                if (!TextUtils.isEmpty(mVar2.f20632x)) {
                    hashMap3.put("request_page", mVar2.f20632x);
                }
                HashMap hashMap4 = new HashMap();
                Long valueOf2 = Long.valueOf(mVar2.f20613e);
                if (findGiftById.f20544e == 2) {
                    i2 = 1;
                } else {
                    i2 = mVar2.f20616h;
                }
                hashMap4.put(valueOf2, Integer.valueOf(i2));
                hashMap3.put("gift_info", C7459a.m15414a(hashMap4));
                String str5 = "gift_cnt";
                if (findGiftById.f20544e == 2) {
                    i3 = 1;
                } else {
                    i3 = mVar2.f20616h;
                }
                hashMap3.put(str5, String.valueOf(i3));
                if (findGiftById.f20544e == 2) {
                    i4 = 1;
                } else {
                    i4 = mVar2.f20616h;
                }
                hashMap3.put("money", String.valueOf(i4 * findGiftById.f20545f));
                if (!(user == null || user.getId() == room.getOwnerUserId())) {
                    hashMap3.put("to_user_id", String.valueOf(user.getId()));
                }
                hashMap3.put("is_first_consume", String.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).isFirstConsume(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
                hashMap3.put("growth_deepevent", "1");
                String str6 = "to_user_id";
                if (user != null) {
                    j = user.getId();
                } else {
                    j = room.getOwnerUserId();
                }
                hashMap3.put(str6, String.valueOf(j));
                if (findGiftById.f20544e == 10) {
                    hashMap3.put("gift_type", "coin_gift");
                }
                C8049c a2 = C8049c.m15979a();
                String str7 = "send_gift";
                Object[] objArr2 = new Object[4];
                C8059j jVar2 = new C8059j();
                if (z) {
                    str = "live_take_detail";
                } else {
                    str = "live_detail";
                }
                objArr2[0] = jVar2.mo14213a(str).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                objArr2[1] = Room.class;
                objArr2[2] = C7519o.m15513a(mVar);
                objArr2[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
                a2.mo14202a(str7, hashMap3, objArr2);
            }
        }
    }
}
