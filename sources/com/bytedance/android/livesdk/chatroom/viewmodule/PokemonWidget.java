package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.C4311b;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4767e;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.chatroom.event.C5173as;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5701j;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p376f.C7449a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.viewmodel.PokemonViewModel;
import com.bytedance.android.livesdk.viewmodel.PokemonViewModel.C8408a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class PokemonWidget extends LiveRecyclableWidget {

    /* renamed from: d */
    public static final C6355a f17418d = new C6355a(null);

    /* renamed from: a */
    public PokemonViewModel f17419a;

    /* renamed from: b */
    public Room f17420b;

    /* renamed from: c */
    public boolean f17421c;

    /* renamed from: e */
    private C0199s<KVData> f17422e = new C6356b(this);

    /* renamed from: f */
    private C6359e f17423f = new C6359e(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$a */
    public static final class C6355a {
        private C6355a() {
        }

        public /* synthetic */ C6355a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$b */
    static final class C6356b<T> implements C0199s<KVData> {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f17424a;

        C6356b(PokemonWidget pokemonWidget) {
            this.f17424a = pokemonWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            KVData kVData = (KVData) obj;
            Object obj2 = null;
            if (kVData != null) {
                str = kVData.getKey();
            } else {
                str = null;
            }
            if (str != null) {
                if (kVData != null) {
                    obj2 = kVData.getData();
                }
                if (obj2 != null && C52711k.m112239a((Object) kVData.getKey(), (Object) "data_link_state")) {
                    Integer num = (Integer) kVData.getData();
                    if (num != null && num.intValue() == 1) {
                        View view = this.f17424a.contentView;
                        C52711k.m112236a((Object) view, "contentView");
                        view.setVisibility(8);
                        return;
                    }
                    View view2 = this.f17424a.contentView;
                    C52711k.m112236a((Object) view2, "contentView");
                    view2.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$c */
    static final class C6357c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f17425a;

        C6357c(PokemonWidget pokemonWidget) {
            this.f17425a = pokemonWidget;
        }

        public final void onClick(View view) {
            C8333e h = TTLiveSDKContext.getHostService().mo10315h();
            C52711k.m112236a((Object) h, "TTLiveSDKContext.getHostService().user()");
            if (!h.mo14532c()) {
                TTLiveSDKContext.getHostService().mo10315h().mo14516a((FragmentActivity) this.f17425a.context, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.eva)).mo14539a(0).mo14541a()).mo6513a((C1673aa<? super T, ? extends R>) this.f17425a.getAutoUnbindTransformer()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
            } else if (!TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.GIFT)) {
                C18922i iVar = new C18922i("https://hotsoon.snssdk.com/falcon/live_inroom/page/magic_baby/pokemon/");
                User owner = this.f17425a.mo12496a().getOwner();
                C52711k.m112236a((Object) owner, "mRoom.owner");
                iVar.mo38777a("anchor_id", owner.getId());
                iVar.mo38777a("room_id", this.f17425a.mo12496a().getId());
                C8333e h2 = TTLiveSDKContext.getHostService().mo10315h();
                C52711k.m112236a((Object) h2, "TTLiveSDKContext.getHostService().user()");
                C3009i a = h2.mo14521a();
                C52711k.m112236a((Object) a, "TTLiveSDKContext.getHost…vice().user().currentUser");
                if (a != null) {
                    iVar.mo38777a("user_id", a.getId());
                }
                C5161ag agVar = new C5161ag(iVar.mo38774a(), "", 17, 0, 0, 8);
                agVar.f13838h = true;
                C4495a.m10823a().mo10301a((Object) agVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$d */
    static final class C6358d<T> implements C1710e<C4767e> {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f17426a;

        C6358d(PokemonWidget pokemonWidget) {
            this.f17426a = pokemonWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4767e eVar = (C4767e) obj;
            PokemonWidget pokemonWidget = this.f17426a;
            C52711k.m112236a((Object) eVar, "it");
            pokemonWidget.onEvent(eVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$e */
    public static final class C6359e implements C8408a {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f17427a;

        /* renamed from: a */
        private final void m13750a() {
            C4575an.m10981a((int) R.string.f0x);
            this.f17427a.dataCenter.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new C5173as(1, (String) this.f17427a.dataCenter.get("log_enter_live_source"), "pokemon"));
        }

        C6359e(PokemonWidget pokemonWidget) {
            this.f17427a = pokemonWidget;
        }

        /* renamed from: b */
        public final void mo12502b(Throwable th) {
            C52711k.m112240b(th, "error");
            C4602l.m11046a(this.f17427a.context, th);
        }

        /* renamed from: c */
        public final void mo12503c(Throwable th) {
            C52711k.m112240b(th, "error");
            C4602l.m11046a(this.f17427a.context, th);
        }

        /* renamed from: a */
        public final void mo12499a(C5701j jVar) {
            C52711k.m112240b(jVar, "pokemonInfo");
            if (jVar.f14976a && this.f17427a.isViewValid) {
                View view = this.f17427a.contentView;
                if (view != null) {
                    ((ImageView) view).setBackground(null);
                    C5213c.m11814a((ImageView) this.f17427a.contentView, jVar.f14985j);
                    ViewGroup viewGroup = this.f17427a.containerView;
                    C52711k.m112236a((Object) viewGroup, "containerView");
                    viewGroup.setVisibility(0);
                    PokemonWidget pokemonWidget = this.f17427a;
                    int i = jVar.f14984i;
                    if (i <= 0) {
                        i = 30;
                    }
                    ((C4002ac) C2201v.m6592a((long) (i * 1000), TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) pokemonWidget.autoDispose())).mo9405a((C1710e<? super T>) new C6360f<Object>(pokemonWidget));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.ImageView");
            }
        }

        /* renamed from: a */
        public final void mo12500a(C7514m mVar) {
            String str;
            if (mVar != null && this.f17427a.isViewValid) {
                C4311b walletCenter = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter();
                C52711k.m112236a((Object) walletCenter, "ServiceManager.getServic…          .walletCenter()");
                walletCenter.mo10091a(mVar.f20611c);
                if (C4565af.m10958a() != null && this.f17427a.isViewValid) {
                    C4565af.m10958a().insertMessage(((IGiftService) C4116c.m10249a(IGiftService.class)).getGiftMessage(this.f17427a.mo12496a().getId(), mVar, (User) this.f17427a.dataCenter.get("data_user_in_room")));
                }
                this.f17427a.dataCenter.get("log_enter_live_source");
                this.f17427a.mo12496a().getUserFrom();
                C35807d.m80935a(this.f17427a.context, "feed_live_span", 0).getInt("span_count", 0);
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(mVar.f20632x)) {
                    String str2 = mVar.f20632x;
                    C52711k.m112236a((Object) str2, "result.giftType");
                    hashMap.put("request_page", str2);
                }
                C8049c a = C8049c.m15979a();
                String str3 = "send_gift";
                Map map = hashMap;
                Object[] objArr = new Object[3];
                C8059j jVar = new C8059j();
                if (this.f17427a.f17421c) {
                    str = "live_take_detail";
                } else {
                    str = "live_detail";
                }
                objArr[0] = jVar.mo14213a(str).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                objArr[1] = Room.class;
                objArr[2] = ((IGiftService) C4116c.m10249a(IGiftService.class)).getSendGiftResultLog(mVar);
                a.mo14202a(str3, map, objArr);
                this.f17427a.dataCenter.lambda$put$1$DataCenter("cmd_close_h5_dialog", new Object());
                PokemonViewModel pokemonViewModel = this.f17427a.f17419a;
                if (pokemonViewModel != null) {
                    pokemonViewModel.mo14637b(mVar.f20613e);
                }
            }
        }

        /* renamed from: a */
        public final void mo12501a(Throwable th) {
            C52711k.m112240b(th, "error");
            if (th instanceof C7449a) {
                m13750a();
            } else if (th instanceof C2949a) {
                C2949a aVar = (C2949a) th;
                if (40001 == aVar.getErrorCode()) {
                    m13750a();
                } else {
                    C4575an.m10987a(aVar.getPrompt());
                }
            } else {
                C4575an.m10981a((int) R.string.eh4);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$f */
    static final class C6360f<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f17428a;

        C6360f(PokemonWidget pokemonWidget) {
            this.f17428a = pokemonWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            PokemonViewModel pokemonViewModel = this.f17428a.f17419a;
            if (pokemonViewModel != null) {
                User owner = this.f17428a.mo12496a().getOwner();
                C52711k.m112236a((Object) owner, "mRoom.owner");
                pokemonViewModel.mo14634a(owner.getId());
            }
        }
    }

    public final int getLayoutId() {
        return R.layout.anp;
    }

    /* renamed from: a */
    public final Room mo12496a() {
        Room room = this.f17420b;
        if (room == null) {
            C52711k.m112237a("mRoom");
        }
        return room;
    }

    public final void onUnload() {
        ViewGroup viewGroup = this.containerView;
        C52711k.m112236a((Object) viewGroup, "containerView");
        viewGroup.setVisibility(8);
        this.dataCenter.removeObserver(this.f17422e);
    }

    public final void onInit(Object[] objArr) {
        this.contentView.setOnClickListener(new C6357c(this));
    }

    public final void onEvent(C4767e eVar) {
        C52711k.m112240b(eVar, "event");
        if (((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(eVar.f12975a) != null) {
            PokemonViewModel pokemonViewModel = this.f17419a;
            if (pokemonViewModel != null) {
                Object obj = this.dataCenter.get("log_enter_live_source");
                C52711k.m112236a(obj, "dataCenter.get(WidgetCon…nt.LOG_ENTER_LIVE_SOURCE)");
                pokemonViewModel.mo14636a((String) obj, eVar.f12975a, null, 1, "pokemon_task");
            }
        }
    }

    public final void onLoad(Object[] objArr) {
        ViewGroup viewGroup = this.containerView;
        C52711k.m112236a((Object) viewGroup, "containerView");
        viewGroup.setVisibility(8);
        C4495a.m10823a().mo10300a(C4767e.class).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C6358d<Object>(this));
        Object obj = this.dataCenter.get("data_room");
        C52711k.m112236a(obj, "dataCenter.get(WidgetConstant.DATA_ROOM)");
        this.f17420b = (Room) obj;
        Object obj2 = this.dataCenter.get("data_is_anchor");
        C52711k.m112236a(obj2, "dataCenter.get(WidgetConstant.DATA_IS_ANCHOR)");
        this.f17421c = ((Boolean) obj2).booleanValue();
        Room room = this.f17420b;
        if (room == null) {
            C52711k.m112237a("mRoom");
        }
        this.f17419a = new PokemonViewModel(room, this.f17423f);
        long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        if (b > 0) {
            PokemonViewModel pokemonViewModel = this.f17419a;
            if (pokemonViewModel != null) {
                Room room2 = this.f17420b;
                if (room2 == null) {
                    C52711k.m112237a("mRoom");
                }
                User owner = room2.getOwner();
                C52711k.m112236a((Object) owner, "mRoom.owner");
                pokemonViewModel.mo14635a(owner.getId(), b);
            }
        } else {
            PokemonViewModel pokemonViewModel2 = this.f17419a;
            if (pokemonViewModel2 != null) {
                Room room3 = this.f17420b;
                if (room3 == null) {
                    C52711k.m112237a("mRoom");
                }
                User owner2 = room3.getOwner();
                C52711k.m112236a((Object) owner2, "mRoom.owner");
                long id = owner2.getId();
                Room room4 = this.f17420b;
                if (room4 == null) {
                    C52711k.m112237a("mRoom");
                }
                User owner3 = room4.getOwner();
                C52711k.m112236a((Object) owner3, "mRoom.owner");
                pokemonViewModel2.mo14635a(id, owner3.getId());
            }
        }
        this.dataCenter.observe("data_link_state", this.f17422e);
    }
}
