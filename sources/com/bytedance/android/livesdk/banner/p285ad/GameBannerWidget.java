package com.bytedance.android.livesdk.banner.p285ad;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.banner.ad.GameBannerWidget */
public class GameBannerWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    BannerAdView f12716a;

    /* renamed from: b */
    private boolean f12717b;

    /* renamed from: c */
    private Room f12718c;

    public void onInit(Object... objArr) {
    }

    public void onUnload() {
        this.f12716a = null;
    }

    public void onLoad(Object... objArr) {
        this.f12718c = (Room) this.dataCenter.get("data_room");
        this.f12717b = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        InRoomBannerManager inRoomBannerManager = (InRoomBannerManager) this.dataCenter.get("data_in_room_banner_manager", null);
        if (inRoomBannerManager != null) {
            ((C4002ac) inRoomBannerManager.mo10435a(Long.valueOf(this.f12718c.getId())).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C4659d<Object>(this));
        }
    }
}
