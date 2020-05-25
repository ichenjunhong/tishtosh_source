package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.livesdk.feed.C6804a.C6805a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository.C7070a;
import com.bytedance.android.livesdkapi.depend.model.live.C8706l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.feed.repository.l */
final /* synthetic */ class C7083l implements C1711f {

    /* renamed from: a */
    private final C7070a f19287a;

    /* renamed from: b */
    private final boolean f19288b;

    C7083l(C7070a aVar, boolean z) {
        this.f19287a = aVar;
        this.f19288b = z;
    }

    public final Object apply(Object obj) {
        C7070a aVar = this.f19287a;
        boolean z = this.f19288b;
        C4172a aVar2 = (C4172a) obj;
        ArrayList<FeedItem> arrayList = new ArrayList<>(aVar2.f11365b);
        if (aVar.f19267h != 0 && !arrayList.isEmpty()) {
            FeedItem feedItem = (FeedItem) arrayList.get(0);
            if (feedItem.item != null && feedItem.item.getId() == aVar.f19267h) {
                feedItem.repeatDisable = true;
            }
        }
        C2974a aVar3 = (C2974a) aVar2.f11366c;
        if (!C9414h.m18630a(arrayList)) {
            for (FeedItem feedItem2 : arrayList) {
                if (!(feedItem2 == null || aVar3 == null || (feedItem2.type != 1 && feedItem2.type != 2))) {
                    Room room = (Room) feedItem2.item;
                    if (aVar3.mo7693a() != null) {
                        room.setLog_pb(aVar3.mo7693a().toString());
                        if (room.getOwner() != null) {
                            room.getOwner().setLogPb(aVar3.mo7693a().toString());
                        }
                    }
                    room.setRequestId(feedItem2.resId);
                }
                if (feedItem2 != null && feedItem2.type == 1 && (feedItem2.item instanceof Room)) {
                    ((Room) feedItem2.item).isFromRecommendCard = feedItem2.isRecommendCard;
                }
                if (!(feedItem2 == null || aVar3 == null || feedItem2.type != 3)) {
                    C8706l lVar = (C8706l) feedItem2.item;
                    if (aVar3.mo7693a() != null) {
                        lVar.f23857J = aVar3.mo7693a().toString();
                    }
                    lVar.f23856I = feedItem2.resId;
                }
            }
        }
        aVar.f19264e.mo13102a(aVar.f19261b, arrayList, aVar3, z);
        if (z) {
            aVar.f19260a = arrayList.size();
        } else {
            aVar.f19260a += arrayList.size();
        }
        aVar.f19268i.mo12992a(z ? C6805a.REFRESH : C6805a.LOAD_MORE, z ? aVar.f19262c : aVar.f19263d, aVar3);
        return Pair.create(arrayList, aVar2.f11366c);
    }
}
