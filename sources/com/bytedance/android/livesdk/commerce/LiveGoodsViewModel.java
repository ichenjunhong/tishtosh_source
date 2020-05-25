package com.bytedance.android.livesdk.commerce;

import android.arch.lifecycle.C0198r;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.core.widget.simple.SimpleListViewModel;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.p438f.C8630a;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52711k;

public final class LiveGoodsViewModel extends SimpleListViewModel<Object> {

    /* renamed from: p */
    public int f18274p;

    /* renamed from: q */
    public final C0198r<Integer> f18275q = new C0198r<>();

    /* renamed from: r */
    public C8630a<Long> f18276r = new C8630a<>("live_commerce_banner_last_close_id", Long.valueOf(-1));

    /* renamed from: s */
    private long f18277s;

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsViewModel$a */
    static final class C6702a<T> implements C1710e<C4172a<Object, C2974a>> {

        /* renamed from: a */
        final /* synthetic */ LiveGoodsViewModel f18278a;

        C6702a(LiveGoodsViewModel liveGoodsViewModel) {
            this.f18278a = liveGoodsViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4172a aVar = (C4172a) obj;
            this.f18278a.f18274p += aVar.f11365b.size();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsViewModel$b */
    static final class C6703b<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ LiveGoodsViewModel f18279a;

        /* renamed from: b */
        final /* synthetic */ boolean f18280b;

        C6703b(LiveGoodsViewModel liveGoodsViewModel, boolean z) {
            this.f18279a = liveGoodsViewModel;
            this.f18280b = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C4172a aVar = (C4172a) obj;
            C52711k.m112240b(aVar, "response");
            ArrayList arrayList = new ArrayList();
            if (!C9414h.m18630a(aVar.f11365b)) {
                if (this.f18280b) {
                    C4097p<C6711d> pVar = C6718b.f18330a;
                    C52711k.m112236a((Object) pVar, "LiveOtherSettingKeys.LIVE_COMMERCE_BANNER");
                    C6711d dVar = (C6711d) pVar.mo9431a();
                    if (dVar != null) {
                        long j = dVar.f18297a;
                        Object a = this.f18279a.f18276r.mo10345a();
                        C52711k.m112236a(a, "LIVE_COMMERCE_BANNER_LAST_CLOSE_ID.value");
                        if (j > ((Number) a).longValue()) {
                            arrayList.add(dVar);
                        }
                    }
                }
                arrayList.addAll(aVar.f11365b);
            }
            ((C2974a) aVar.f11366c).f8715e = ((C2974a) aVar.f11366c).now;
            this.f18279a.f18275q.postValue(Integer.valueOf(((C2974a) aVar.f11366c).f8719i));
            return Pair.create(arrayList, aVar.f11366c);
        }
    }

    /* renamed from: a */
    public final C2201v<Pair<List<Object>, C2974a>> mo9343a(boolean z, Long l, int i) {
        if (z) {
            this.f18274p = 0;
        }
        C2201v<Pair<List<Object>, C2974a>> d = ((LiveCommerceApi) C4514j.m10883j().mo10321b().mo9550a(LiveCommerceApi.class)).fetchLiveCommerce("https://api.hypstar.com/hotsoon/commerce/live/promotions/", this.f18277s, (long) this.f18274p, 10, CustomActionPushReceiver.f104061f).mo6540d((C1710e<? super T>) new C6702a<Object>(this)).mo6541d((C1711f<? super T, ? extends R>) new C6703b<Object,Object>(this, z));
        C52711k.m112236a((Object) d, "LiveCommerceService.fetc….extra)\n                }");
        return d;
    }
}
