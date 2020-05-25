package com.bytedance.android.livesdk.banner;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.BannerRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.C5743c;
import com.bytedance.android.livesdk.message.model.C7817av;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p094l.C2178a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class InRoomBannerManager implements C0183j, OnMessageListener {

    /* renamed from: e */
    public static final C4648a f12696e = new C4648a(null);

    /* renamed from: a */
    public long f12697a = -1;

    /* renamed from: b */
    public boolean f12698b;

    /* renamed from: c */
    public final C2178a<C4649b> f12699c;

    /* renamed from: d */
    final C0184k f12700d;

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$a */
    static final class C4648a {
        private C4648a() {
        }

        public /* synthetic */ C4648a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$b */
    public static final class C4649b {

        /* renamed from: a */
        public final long f12701a;

        /* renamed from: b */
        public final C5743c f12702b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C4649b) {
                    C4649b bVar = (C4649b) obj;
                    if (!(this.f12701a == bVar.f12701a) || !C52711k.m112239a((Object) this.f12702b, (Object) bVar.f12702b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f12701a) * 31;
            C5743c cVar = this.f12702b;
            return hashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(roomId=");
            sb.append(this.f12701a);
            sb.append(", data=");
            sb.append(this.f12702b);
            sb.append(")");
            return sb.toString();
        }

        public C4649b(long j, C5743c cVar) {
            C52711k.m112240b(cVar, "data");
            this.f12701a = j;
            this.f12702b = cVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$c */
    static final class C4650c<T> implements C1710e<C4177d<C5743c>> {

        /* renamed from: a */
        final /* synthetic */ InRoomBannerManager f12703a;

        /* renamed from: b */
        final /* synthetic */ long f12704b;

        C4650c(InRoomBannerManager inRoomBannerManager, long j) {
            this.f12703a = inRoomBannerManager;
            this.f12704b = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            C2178a<C4649b> aVar = this.f12703a.f12699c;
            long j = this.f12704b;
            Object obj2 = dVar.data;
            C52711k.m112236a(obj2, "response.data");
            aVar.onNext(new C4649b(j, (C5743c) obj2));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$d */
    static final class C4651d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C4651d f12705a = new C4651d();

        C4651d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C3831a.m9714b("InRoomBannerManager", (Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$e */
    static final class C4652e<T> implements C1710e<C4177d<C5743c>> {

        /* renamed from: a */
        final /* synthetic */ InRoomBannerManager f12706a;

        /* renamed from: b */
        final /* synthetic */ long f12707b;

        C4652e(InRoomBannerManager inRoomBannerManager, long j) {
            this.f12706a = inRoomBannerManager;
            this.f12707b = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            C2178a<C4649b> aVar = this.f12706a.f12699c;
            long j = this.f12707b;
            Object obj2 = dVar.data;
            C52711k.m112236a(obj2, "response.data");
            aVar.onNext(new C4649b(j, (C5743c) obj2));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$f */
    static final class C4653f<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C4653f f12708a = new C4653f();

        C4653f() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C3831a.m9714b("InRoomBannerManager", (Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$g */
    static final class C4654g<T> implements C1715j<C4649b> {

        /* renamed from: a */
        final /* synthetic */ Long f12709a;

        C4654g(Long l) {
            this.f12709a = l;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            C4649b bVar = (C4649b) obj;
            C52711k.m112240b(bVar, "data");
            long j = bVar.f12701a;
            Long l = this.f12709a;
            if (l != null && j == l.longValue()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$h */
    static final class C4655h<T> implements C1710e<Integer> {

        /* renamed from: a */
        final /* synthetic */ InRoomBannerManager f12710a;

        C4655h(InRoomBannerManager inRoomBannerManager) {
            this.f12710a = inRoomBannerManager;
        }

        public final /* synthetic */ void accept(Object obj) {
            int i;
            Integer num = (Integer) obj;
            InRoomBannerManager inRoomBannerManager = this.f12710a;
            long j = this.f12710a.f12697a;
            BannerRetrofitApi bannerRetrofitApi = (BannerRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(BannerRetrofitApi.class);
            if (this.f12710a.f12698b) {
                i = 2;
            } else {
                i = 1;
            }
            ((C4002ac) bannerRetrofitApi.queryLiveRoomBanner(j, i).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10136a(inRoomBannerManager.f12700d))).mo9406a(new C4652e(inRoomBannerManager, j), C4653f.f12708a);
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        IMessageManager a = C4565af.m10958a();
        if (a != null) {
            a.removeMessageListener(this);
        }
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        IMessageManager a = C4565af.m10958a();
        if (a != null) {
            a.addMessageListener(C8629a.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType(), this);
        }
    }

    /* renamed from: a */
    public final C2201v<C4649b> mo10435a(Long l) {
        C2201v<C4649b> a = this.f12699c.mo6522a((C1715j<? super T>) new C4654g<Object>(l));
        C52711k.m112236a((Object) a, "bannerSubject.filter { d…> data.roomId == roomId }");
        return a;
    }

    public InRoomBannerManager(C0184k kVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f12700d = kVar;
        C2178a<C4649b> l = C2178a.m6527l();
        C52711k.m112236a((Object) l, "BehaviorSubject.create<Data>()");
        this.f12699c = l;
        this.f12700d.getLifecycle().mo324a(this);
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && iMessage.getIntType() == C8629a.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType() && (iMessage instanceof C7817av)) {
            C7817av avVar = (C7817av) iMessage;
            if (avVar.f21523a > 0) {
                ((C4002ac) C2201v.m6614b(Integer.valueOf(1)).mo6539d((long) new Random().nextInt(avVar.f21523a), TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6529b(C1667a.m5940a()).mo6540d((C1710e<? super T>) new C4655h<Object>(this)).mo6525a((C2203w<T, ? extends R>) C4021e.m10136a(this.f12700d))).mo9404a();
            }
        }
    }

    /* renamed from: a */
    public final C2201v<C4649b> mo10434a(long j, boolean z) {
        int i;
        if (j == this.f12697a) {
            return mo10435a(Long.valueOf(j));
        }
        this.f12697a = j;
        this.f12698b = z;
        BannerRetrofitApi bannerRetrofitApi = (BannerRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(BannerRetrofitApi.class);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        ((C4002ac) bannerRetrofitApi.queryLiveRoomBanner(j, i).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10136a(this.f12700d))).mo9406a(new C4650c(this, j), C4651d.f12705a);
        return mo10435a(Long.valueOf(j));
    }
}
