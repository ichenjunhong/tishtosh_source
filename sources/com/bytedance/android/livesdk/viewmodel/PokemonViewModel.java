package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.live.core.rxutils.p239a.C3988b;
import com.bytedance.android.live.core.rxutils.p239a.C3989c;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.api.PokemonApi;
import com.bytedance.android.livesdk.chatroom.model.C5729ar;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5701j;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p279af.p281b.C4586c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

public final class PokemonViewModel extends RxViewModel {

    /* renamed from: a */
    public PokemonApi f22855a;

    /* renamed from: b */
    public final Room f22856b;

    /* renamed from: c */
    public final C8408a f22857c;

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$a */
    public interface C8408a {
        /* renamed from: a */
        void mo12499a(C5701j jVar);

        /* renamed from: a */
        void mo12500a(C7514m mVar);

        /* renamed from: a */
        void mo12501a(Throwable th);

        /* renamed from: b */
        void mo12502b(Throwable th);

        /* renamed from: c */
        void mo12503c(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$b */
    static final class C8409b<T> implements C1710e<C4177d<C5701j>> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f22858a;

        C8409b(PokemonViewModel pokemonViewModel) {
            this.f22858a = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            C5701j jVar;
            C4177d dVar = (C4177d) obj;
            C8408a aVar = this.f22858a.f22857c;
            if (dVar != null) {
                jVar = (C5701j) dVar.data;
            } else {
                jVar = null;
            }
            if (jVar == null) {
                C52711k.m112234a();
            }
            aVar.mo12499a(jVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$c */
    static final class C8410c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f22859a;

        C8410c(PokemonViewModel pokemonViewModel) {
            this.f22859a = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8408a aVar = this.f22859a.f22857c;
            C52711k.m112236a((Object) th, "error");
            aVar.mo12502b(th);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$d */
    static final class C8411d<T> implements C1710e<C4177d<C7514m>> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f22860a;

        /* renamed from: b */
        final /* synthetic */ String f22861b;

        C8411d(PokemonViewModel pokemonViewModel, String str) {
            this.f22860a = pokemonViewModel;
            this.f22861b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            PokemonViewModel pokemonViewModel = this.f22860a;
            ((C7514m) dVar.data).f20632x = this.f22861b;
            C8408a aVar = pokemonViewModel.f22857c;
            if (aVar != null) {
                aVar.mo12500a((C7514m) dVar.data);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$e */
    static final class C8412e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f22862a;

        C8412e(PokemonViewModel pokemonViewModel) {
            this.f22862a = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8408a aVar = this.f22862a.f22857c;
            C52711k.m112236a((Object) th, "error");
            aVar.mo12501a(th);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$f */
    static final class C8413f<T> implements C1710e<C4177d<C5729ar>> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f22863a;

        C8413f(PokemonViewModel pokemonViewModel) {
            this.f22863a = pokemonViewModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
            if (r3.f15083a == 1) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r3) {
            /*
                r2 = this;
                com.bytedance.android.live.network.response.d r3 = (com.bytedance.android.live.network.response.C4177d) r3
                com.bytedance.android.livesdk.viewmodel.PokemonViewModel r0 = r2.f22863a
                if (r3 == 0) goto L_0x0012
                java.lang.Object r3 = r3.data
                com.bytedance.android.livesdk.chatroom.model.ar r3 = (com.bytedance.android.livesdk.chatroom.model.C5729ar) r3
                if (r3 == 0) goto L_0x0012
                int r3 = r3.f15083a
                r1 = 1
                if (r3 != r1) goto L_0x0012
                goto L_0x0021
            L_0x0012:
                com.bytedance.android.livesdk.viewmodel.PokemonViewModel$a r3 = r0.f22857c
                if (r3 == 0) goto L_0x0021
                com.bytedance.android.livesdk.gift.f.a r0 = new com.bytedance.android.livesdk.gift.f.a
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r3.mo12503c(r0)
                return
            L_0x0021:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.PokemonViewModel.C8413f.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$g */
    static final class C8414g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f22864a;

        C8414g(PokemonViewModel pokemonViewModel) {
            this.f22864a = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8408a aVar = this.f22864a.f22857c;
            if (aVar != null) {
                C52711k.m112236a((Object) th, "error");
                aVar.mo12503c(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$h */
    static final class C8415h<T> implements C1710e<C4177d<Object>> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f22865a;

        C8415h(PokemonViewModel pokemonViewModel) {
            this.f22865a = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            C3831a.m9707a("PokemonViewModel", "trigger pokemon message success");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$i */
    static final class C8416i<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f22866a;

        C8416i(PokemonViewModel pokemonViewModel) {
            this.f22866a = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder("trigger pokemon message failed, ");
            sb.append(th.getMessage());
            C3831a.m9716d("PokemonViewModel", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo14634a(long j) {
        mo9390a(((C4585b) this.f22855a.showPokemonTip(j).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10390a(3).mo6505a((C1710e<? super T>) new C8415h<Object>(this), (C1710e<? super Throwable>) new C8416i<Object>(this)));
    }

    /* renamed from: b */
    public final void mo14637b(long j) {
        PokemonApi pokemonApi = this.f22855a;
        User owner = this.f22856b.getOwner();
        C52711k.m112236a((Object) owner, "room.owner");
        mo9390a(((C4585b) pokemonApi.sendPokemon(owner.getId(), j, this.f22856b.getId()).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10390a(3).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C8413f<Object>(this), (C1710e<? super Throwable>) new C8414g<Object>(this)));
    }

    public PokemonViewModel(Room room, C8408a aVar) {
        C52711k.m112240b(room, "room");
        C52711k.m112240b(aVar, "callback");
        this.f22856b = room;
        this.f22857c = aVar;
        Object a = C4514j.m10883j().mo10321b().mo9550a(PokemonApi.class);
        C52711k.m112236a(a, "LiveInternalService.inst…e(PokemonApi::class.java)");
        this.f22855a = (PokemonApi) a;
    }

    /* renamed from: a */
    public final void mo14635a(long j, long j2) {
        mo9390a(((C4585b) this.f22855a.getPokemonInfo(j, j2).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10390a(3).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C8409b<Object>(this), (C1710e<? super Throwable>) new C8410c<Object>(this)));
    }

    /* renamed from: a */
    public final void mo14636a(String str, long j, User user, int i, String str2) {
        C52711k.m112240b(str, "enterLiveSource");
        if (((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(j) != null) {
            IGiftService iGiftService = (IGiftService) C4116c.m10249a(IGiftService.class);
            long id = this.f22856b.getId();
            User owner = this.f22856b.getOwner();
            C52711k.m112236a((Object) owner, "room.owner");
            mo9390a(iGiftService.sendGift(j, id, owner.getId(), 1).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6513a(C3989c.m10100a((C2201v<T>) this.f11116o).mo9394a(C3988b.DESTROY)).mo6505a((C1710e<? super T>) new C8411d<Object>(this, str2), (C1710e<? super Throwable>) new C8412e<Object>(this)));
        }
    }
}
