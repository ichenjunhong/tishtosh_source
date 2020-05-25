package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p279af.p281b.C4586c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C1673aa;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.n */
public final class C3297n {
    /* renamed from: a */
    public static void m9029a(long j) {
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        List<C7505d> stickerGifts = ((IGiftService) C4116c.m10249a(IGiftService.class)).getStickerGifts();
        if (stickerGifts.size() != 0) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            boolean z = true;
            HashMap hashMap = new HashMap();
            for (C7505d dVar : stickerGifts) {
                sb2.append(dVar.f20543d);
                sb2.append(",");
                if (((IGiftService) C4116c.m10249a(IGiftService.class)).getAssets("effects", dVar.f20558s) != null) {
                    sb3.append(dVar.f20543d);
                    sb3.append(",");
                }
                if (((IGiftService) C4116c.m10249a(IGiftService.class)).isAssetsDownloaded("effects", dVar.f20558s)) {
                    if (z) {
                        sb.append(dVar.f20543d);
                        z = false;
                    } else {
                        sb.append(",");
                        sb.append(dVar.f20543d);
                    }
                }
            }
            hashMap.put("download_sticker_id", sb.toString());
            hashMap.put("all_sticker_id", sb2.toString());
            hashMap.put("asset_sticker_id", sb3.toString());
            hashMap.put("room_id", Long.valueOf(j));
            if (currentRoom != null) {
                hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
                hashMap.put("live_type", Integer.valueOf(currentRoom.getOrientation()));
            }
            C3837e.m9743a(C3836d.m9734a("service_sticker_gift_status"), 0, (Map<String, Object>) hashMap);
            ((C4585b) C3395f.m9156f().mo8742c().mo9025h().reportFaceGift(j, sb.toString()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10390a(3).mo6505a((C1710e<? super T>) new C3298o<Object>(j, currentRoom), (C1710e<? super Throwable>) new C3299p<Object>(j, currentRoom));
        }
    }
}
