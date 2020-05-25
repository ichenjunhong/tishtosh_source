package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5315j.C5316a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5315j.C5317b;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5381b;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5384d;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.C2203w;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.au */
public final class C5409au extends C5316a {

    /* renamed from: d */
    private Room f14375d;

    /* renamed from: e */
    private boolean f14376e;

    public C5409au(C5317b bVar) {
        super(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11307a(C4177d dVar) throws Exception {
        ((C5317b) this.f14144b).mo11194a((C5384d) dVar.data);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11312b(Throwable th) throws Exception {
        mo11147a(th);
        ((C5317b) this.f14144b).mo11197a(th);
    }

    /* renamed from: a */
    public final void mo11191a(int i) {
        ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).rivalsList(i).mo6525a((C2203w<T, ? extends R>) mo11148b())).mo9406a(new C5410av(this), new C5411aw(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11308a(C5382c cVar, int i, C4177d dVar) throws Exception {
        this.f14145c.f12622m = ((C5381b) dVar.data).f14330b;
        this.f14145c.f12612c = ((C5381b) dVar.data).f14329a;
        ((C5317b) this.f14144b).mo11195a(this.f14375d, cVar, i);
        this.f14376e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_SUCCEED");
        hashMap.put("vendor", Integer.valueOf(((C5381b) dVar.data).f14330b));
        hashMap.put("channel_id", Long.valueOf(((C5381b) dVar.data).f14329a));
        C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11310b(C5382c cVar, int i, C4177d dVar) throws Exception {
        if (!(dVar == null || dVar.data == null)) {
            this.f14145c.f12622m = ((C5381b) dVar.data).f14330b;
            this.f14145c.f12612c = ((C5381b) dVar.data).f14329a;
        }
        ((C5317b) this.f14144b).mo11195a(this.f14375d, cVar, i);
        this.f14376e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_SUCCEED");
        hashMap.put("vendor", Integer.valueOf(((C5381b) dVar.data).f14330b));
        hashMap.put("channel_id", Long.valueOf(((C5381b) dVar.data).f14329a));
        C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11311b(C5382c cVar, int i, Room room, Throwable th) throws Exception {
        mo11147a(th);
        ((C5317b) this.f14144b).mo11196a(this.f14375d, th, cVar, i);
        this.f14145c.mo10412c();
        this.f14376e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_FAILED");
        hashMap.put("target_room_id", Long.valueOf(room.getId()));
        C8064d.m16005b().mo9199b("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11309a(C5382c cVar, int i, Room room, Throwable th) throws Exception {
        mo11147a(th);
        ((C5317b) this.f14144b).mo11196a(this.f14375d, th, cVar, i);
        this.f14376e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_FAILED");
        hashMap.put("target_room_id", Long.valueOf(room.getId()));
        C8064d.m16005b().mo9199b("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo11192a(Room room, long j, C5382c cVar, int i, int i2) {
        Room room2 = room;
        C5382c cVar2 = cVar;
        int i3 = i2;
        if (!this.f14376e) {
            this.f14376e = true;
            this.f14375d = room2;
            this.f14145c.f12614e = room.getOwner().getId();
            ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).invite(6, room.getId(), room.getOwner().getId(), j, i, 0).mo6525a((C2203w<T, ? extends R>) mo11148b())).mo9406a(new C5414az(this, cVar2, i3), new C5416ba(this, cVar2, i3, room2));
        }
    }

    /* renamed from: a */
    public final void mo11193a(Room room, long j, String str, int i, int i2, C5382c cVar, int i3) {
        Room room2 = room;
        C5382c cVar2 = cVar;
        int i4 = i3;
        if (!this.f14376e) {
            this.f14376e = true;
            this.f14375d = room2;
            int i5 = i;
            this.f14145c.f12619j = i5;
            String str2 = str;
            this.f14145c.f12620k = str2;
            this.f14145c.f12614e = room.getOwner().getId();
            this.f14145c.f12616g = (long) i2;
            ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).inviteWithBattleOn(4, 6, room.getId(), room.getOwner().getId(), j, str2, i5, 0, i2, 0).mo6525a((C2203w<T, ? extends R>) mo11148b())).mo9406a(new C5412ax(this, cVar2, i4), new C5413ay(this, cVar2, i4, room2));
        }
    }
}
