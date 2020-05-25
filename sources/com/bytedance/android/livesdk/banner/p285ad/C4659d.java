package com.bytedance.android.livesdk.banner.p285ad;

import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.banner.InRoomBannerManager.C4649b;
import com.bytedance.android.livesdk.chatroom.model.C5743c;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.banner.ad.d */
final /* synthetic */ class C4659d implements C1710e {

    /* renamed from: a */
    private final GameBannerWidget f12722a;

    C4659d(GameBannerWidget gameBannerWidget) {
        this.f12722a = gameBannerWidget;
    }

    public final void accept(Object obj) {
        GameBannerWidget gameBannerWidget = this.f12722a;
        C5743c cVar = ((C4649b) obj).f12702b;
        if (cVar == null || cVar.f15100d == null || cVar.f15100d.f15102b == null || cVar.f15100d.f15102b.isEmpty()) {
            if (gameBannerWidget.containerView != null) {
                gameBannerWidget.containerView.removeAllViews();
            }
            return;
        }
        C8692a aVar = (C8692a) cVar.f15100d.f15102b.get(0);
        if (!(aVar == null || gameBannerWidget.containerView == null || gameBannerWidget.getContext() == null)) {
            gameBannerWidget.containerView.removeAllViews();
            if (gameBannerWidget.f12716a == null) {
                gameBannerWidget.f12716a = new BannerAdView(gameBannerWidget.getContext());
            }
            gameBannerWidget.containerView.addView(gameBannerWidget.f12716a, new LayoutParams(-1, C3922z.m9899a(58.0f)));
            BannerAdView bannerAdView = gameBannerWidget.f12716a;
            bannerAdView.f12714d = aVar;
            if (!bannerAdView.f12713c && aVar.f23796c != null) {
                bannerAdView.setTag(aVar);
                bannerAdView.f12711a.setTag(aVar);
                HSImageView hSImageView = bannerAdView.f12712b;
                ImageModel imageModel = aVar.f23796c;
                if (!(hSImageView == null || imageModel == null)) {
                    C5213c.m11812a(imageModel).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C4657b<Object>(bannerAdView, hSImageView));
                }
                if (!bannerAdView.f12715e) {
                    bannerAdView.mo10441a("livesdk_game_ad_banner_show");
                    bannerAdView.f12715e = true;
                }
            }
        }
    }
}
