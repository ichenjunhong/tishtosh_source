package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5288a.C5289a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5288a.C5290b;
import com.bytedance.android.livesdk.chatroom.model.C5689a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5695d;
import com.bytedance.android.livesdk.p272ad.C4528e;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p330f.C6772g;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.C8737f.C8738a;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C1686aj;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.h */
public final class C5596h extends C5289a {

    /* renamed from: b */
    private Room f14674b;

    /* renamed from: c */
    private boolean f14675c;

    /* renamed from: d */
    private List<C5695d> f14676d;

    /* renamed from: e */
    private int f14677e = 1;

    /* renamed from: f */
    private int f14678f;

    /* renamed from: g */
    private int f14679g = 2;

    /* renamed from: h */
    private String f14680h = "";

    /* renamed from: i */
    private C8688c f14681i;

    /* renamed from: j */
    private String f14682j;

    /* renamed from: k */
    private boolean f14683k;

    /* renamed from: l */
    private C1690c f14684l;

    /* renamed from: a */
    public final int mo11132a() {
        return this.f14679g;
    }

    /* renamed from: b */
    public final String mo11136b() {
        return this.f14680h;
    }

    /* renamed from: d */
    public final boolean mo11139d() {
        return this.f14675c;
    }

    /* renamed from: c */
    public final ImageModel mo11138c() {
        return TTLiveSDKContext.getHostService().mo10315h().mo14521a().getAvatarThumb();
    }

    /* renamed from: f */
    public final void mo11492f() {
        super.mo11492f();
        if (this.f14684l != null && !this.f14684l.isDisposed()) {
            this.f14684l.dispose();
        }
    }

    /* renamed from: e */
    public final void mo11140e() {
        int i;
        int i2;
        String str;
        boolean z;
        String str2;
        if (!this.f14683k) {
            this.f14683k = true;
            C4639e a = C4639e.m11122a();
            if (this.f14675c) {
                C5695d dVar = (C5695d) this.f14676d.get(this.f14678f);
                i = dVar.f14948a;
                i2 = dVar.f14949b;
                a.f12678j = true;
                a.f12679k = i;
                a.f12680l = i2;
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(i));
                sb.append("-");
                sb.append(i2);
                str = sb.toString();
            } else {
                a.f12678j = false;
                a.f12679k = 0;
                a.f12680l = 0;
                str = "";
                i2 = 0;
                i = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("link_type", String.valueOf(this.f14677e));
            hashMap.put("guest_supported_vendor", "6");
            hashMap.put("guest_supported_layout", "15");
            hashMap.put("payed_money", String.valueOf(i));
            hashMap.put("link_duration", String.valueOf(i2));
            this.f14684l = ((LinkApi) C4157e.m10322a().mo9550a(LinkApi.class)).apply(this.f14674b.getId(), this.f14674b.getOwnerUserId(), hashMap).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6152a((C1710e<? super T>) new C5601i<Object>(this), (C1710e<? super Throwable>) new C5602j<Object>(this));
            C4639e.m11122a().f12675g = this.f14679g;
            C4639e.m11122a().f12676h = this.f14681i;
            C4639e.m11122a().f12677i = this.f14680h;
            Room room = this.f14674b;
            if (this.f14677e == 1) {
                z = true;
            } else {
                z = false;
            }
            C4563ad.m10957a(room, z, str);
            HashMap hashMap2 = new HashMap();
            if (this.f14674b != null) {
                String str3 = "room_type";
                if (this.f14674b.getStreamType() == C8710m.AUDIO) {
                    str2 = "radio";
                } else {
                    str2 = "video";
                }
                hashMap2.put(str3, str2);
            }
            hashMap2.put("audience_connection_type", "voice");
            C8049c.m15979a().mo14202a("audience_connection_apply", hashMap2, new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"), C8059j.class, Room.class);
        }
    }

    /* renamed from: a */
    public final void mo11133a(int i) {
        this.f14677e = i;
    }

    /* renamed from: a */
    public final void mo11134a(C8688c cVar) {
        this.f14681i = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11490a(C6772g gVar) {
        super.mo11490a((C5290b) gVar);
        this.f14679g = TTLiveSDKContext.getHostService().mo10309b().mo15489b().mo15410b(C4528e.LIVE_INTERACT_BEAUTY_LEVEL);
    }

    /* renamed from: b */
    public final void mo11137b(int i) {
        this.f14679g = i;
        TTLiveSDKContext.getHostService().mo10309b().mo15489b().mo15406a((C8738a) C4528e.LIVE_INTERACT_BEAUTY_LEVEL, i);
    }

    /* renamed from: a */
    public final void mo11135a(String str) {
        this.f14680h = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11489a(C4177d dVar) throws Exception {
        String str;
        C5689a aVar = (C5689a) dVar.data;
        this.f14683k = false;
        if (this.f18546a != null) {
            C4638d.m11114a().mo10420b(aVar.f14916b, aVar.f14915a);
            C4638d.m11114a().f12666i = aVar.f14918d;
            C4639e.m11122a().mo10414a(Integer.valueOf(1));
            C4639e.m11122a().f12681m = this.f14677e;
            int i = this.f14677e;
            HashMap hashMap = new HashMap();
            String str2 = "guest_connection_type";
            if (i == 1) {
                str = "video";
            } else {
                str = "voice";
            }
            hashMap.put(str2, str);
            C8049c.m15979a().mo14202a("guest_connection_apply", hashMap, new C8059j().mo14213a("live_take_detail"), Room.class);
            ((C5290b) this.f18546a).mo11142b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11491a(Throwable th) throws Exception {
        this.f14683k = false;
        if (this.f18546a != null) {
            ((C5290b) this.f18546a).mo11141a(th);
        }
    }

    public C5596h(Room room, boolean z, List<C5695d> list, String str) {
        this.f14674b = room;
        this.f14675c = z;
        this.f14676d = list;
        this.f14682j = str;
    }
}
