package com.bytedance.android.livesdk.message.p397b;

import android.support.p030v4.p038f.C0785g;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7209f;
import com.bytedance.android.livesdk.gift.assets.C7211h;
import com.bytedance.android.livesdk.gift.assets.C7211h.C7212a;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.message.C7772a;
import com.bytedance.android.livesdk.message.model.C7793a;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.message.b.a */
public final class C7777a implements C7772a {

    /* renamed from: a */
    public C7211h f21381a = C7209f.m14962a("effects");

    /* renamed from: b */
    C0785g<List<C7859c>> f21382b = new C0785g<>();

    /* renamed from: c */
    public List<Long> f21383c = new ArrayList();

    /* renamed from: d */
    public IMessageManager f21384d;

    /* renamed from: e */
    private final boolean f21385e;

    /* renamed from: f */
    private C7212a f21386f = new C7212a() {
        /* renamed from: a */
        public final void mo13439a(List<AssetsModel> list) {
            Iterator it = C7777a.this.f21383c.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                if (C7777a.this.f21381a.mo13434c(longValue) != null) {
                    List<C7859c> list2 = (List) C7777a.this.f21382b.mo2487a(longValue);
                    if (!C9414h.m18630a(list2) && C7777a.this.f21384d != null) {
                        for (C7859c insertMessage : list2) {
                            C7777a.this.f21384d.insertMessage(insertMessage, true);
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder("拉不到该特效资源  assetId = ");
                    sb.append(longValue);
                    C3831a.m9716d("AssetsInterceptor", sb.toString());
                }
                List list3 = (List) C7777a.this.f21382b.mo2487a(longValue);
                if (list3 != null) {
                    list3.clear();
                }
                it.remove();
            }
        }
    };

    /* renamed from: g */
    private long f21387g;

    /* renamed from: a */
    public final void mo14111a() {
        if (this.f21381a != null) {
            this.f21381a.mo13433b(this.f21386f);
        }
        this.f21384d = null;
    }

    /* renamed from: a */
    public final void mo14112a(IMessageManager iMessageManager) {
        this.f21384d = iMessageManager;
    }

    public C7777a(boolean z) {
        this.f21381a.mo13430a(this.f21386f);
        this.f21385e = z;
    }

    public final boolean onMessage(IMessage iMessage) {
        if (this.f21387g <= 0) {
            this.f21387g = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
        }
        if (this.f21387g > 0 && (iMessage instanceof C7810ao)) {
            C7810ao aoVar = (C7810ao) iMessage;
            if (!aoVar.f21505n && aoVar.f21492a != null && this.f21387g == aoVar.f21492a.getId() && aoVar.f21498g != 1) {
                return true;
            }
        }
        if (iMessage instanceof C7810ao) {
            C7810ao aoVar2 = (C7810ao) iMessage;
            C7505d findGiftById = GiftManager.inst().findGiftById(aoVar2.f21494c);
            if (findGiftById == null) {
                this.f21384d.insertMessage(iMessage);
                return true;
            } else if ((findGiftById.f20544e != 2 && findGiftById.f20544e != 8) || findGiftById.f20543d == 998 || this.f21381a.mo13434c(findGiftById.f20558s) != null) {
                return false;
            } else {
                long j = aoVar2.f21494c;
                long j2 = findGiftById.f20558s;
                HashMap hashMap = new HashMap();
                hashMap.put("gift_id", Long.valueOf(j));
                hashMap.put("asset_id", Long.valueOf(j2));
                Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
                if (currentRoom != null) {
                    hashMap.put("room_type", Integer.valueOf(currentRoom.getOrientation()));
                    hashMap.put("room_id", Long.valueOf(currentRoom.getId()));
                    hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
                }
                C3837e.m9743a(C7647s.m15652b("ttlive_asset_id_not_found"), 1, (Map<String, Object>) hashMap);
                C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_asset_id_not_found", 1, (Map) hashMap);
                m15832a(aoVar2, findGiftById.f20558s);
                this.f21383c.add(Long.valueOf(findGiftById.f20558s));
                this.f21381a.mo13427a(4, this.f21385e);
                return true;
            }
        } else if (!(iMessage instanceof C7793a)) {
            return false;
        } else {
            C7793a aVar = (C7793a) iMessage;
            if (this.f21381a.mo13434c(aVar.f21426a) != null) {
                return false;
            }
            m15832a(aVar, aVar.f21426a);
            this.f21383c.add(Long.valueOf(aVar.f21426a));
            this.f21381a.mo13427a(4, this.f21385e);
            return true;
        }
    }

    /* renamed from: a */
    private void m15832a(C7859c cVar, long j) {
        List list = (List) this.f21382b.mo2487a(j);
        if (list == null) {
            list = new ArrayList();
            this.f21382b.mo2493b(j, list);
        }
        list.add(cVar);
    }
}
