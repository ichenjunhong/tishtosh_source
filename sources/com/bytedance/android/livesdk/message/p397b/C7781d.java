package com.bytedance.android.livesdk.message.p397b;

import android.os.Handler;
import android.os.Message;
import android.support.p030v4.p038f.C0785g;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.gift.C7191a;
import com.bytedance.android.livesdk.gift.C7220c;
import com.bytedance.android.livesdk.gift.C7226d;
import com.bytedance.android.livesdk.gift.C7226d.C7228a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.message.C7772a;
import com.bytedance.android.livesdk.message.model.C7794aa;
import com.bytedance.android.livesdk.message.model.C7795ab;
import com.bytedance.android.livesdk.message.model.C7804aj;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.message.model.C7944f;
import com.bytedance.android.livesdk.message.model.C8017z;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.android.livesdkapi.host.C8794c.C8796b;
import com.bytedance.common.utility.C9414h;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.message.b.d */
public final class C7781d implements C7772a, C8619a {

    /* renamed from: a */
    public boolean f21391a;

    /* renamed from: b */
    public Handler f21392b;

    /* renamed from: c */
    C0785g<List<C7810ao>> f21393c = new C0785g<>();

    /* renamed from: d */
    public IMessageManager f21394d;

    /* renamed from: e */
    private long f21395e;

    /* renamed from: f */
    private boolean f21396f;

    /* renamed from: g */
    private C7226d f21397g;

    /* renamed from: h */
    private LinkedList<Pair<Set<Long>, C8017z>> f21398h = new LinkedList<>();

    /* renamed from: i */
    private C7783a f21399i;

    /* renamed from: j */
    private C7228a f21400j = new C7228a() {
        /* renamed from: a */
        public final void mo13460a(long j) {
            C7781d.this.mo14124a(j);
            StringBuilder sb = new StringBuilder("can't find giftId = ");
            sb.append(j);
            C3831a.m9716d("GiftInterceptor", sb.toString());
        }

        /* renamed from: a */
        public final void mo13461a(C7505d dVar) {
            C7781d dVar2 = C7781d.this;
            List<C7810ao> list = (List) dVar2.f21393c.mo2487a(dVar.f20543d);
            if (!C9414h.m18630a(list)) {
                if (C7781d.this.f21394d != null) {
                    for (C7810ao insertMessage : list) {
                        C7781d.this.f21394d.insertMessage(insertMessage, true);
                    }
                }
                C7781d.this.mo14124a(dVar.f20543d);
            }
        }
    };

    /* renamed from: k */
    private long f21401k;

    /* renamed from: com.bytedance.android.livesdk.message.b.d$a */
    class C7783a implements C8796b {

        /* renamed from: a */
        public Pair<Set<Long>, C8017z> f21403a;

        /* renamed from: b */
        int f21404b;

        /* renamed from: c */
        boolean f21405c;

        /* renamed from: c */
        public final void mo14128c() {
            mo14126a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14126a() {
            C3831a.m9716d("GiftInterceptor", "DoodleGiftMessage#download doodle image fail, drop this message");
            if (!this.f21405c) {
                this.f21405c = true;
                this.f21403a = null;
                C7781d.this.f21392b.removeMessages(1);
                C7781d.this.f21391a = false;
                C7781d.this.mo14125b();
            }
        }

        /* renamed from: b */
        public final void mo14127b() {
            if (!this.f21405c) {
                this.f21404b--;
                if (this.f21404b <= 0) {
                    C3831a.m9712b("GiftInterceptor", "DoodleGiftMessage#download doodle image done, schedule DoodleGiftMessage again");
                    C7781d.this.f21392b.removeMessages(1);
                    C7781d.this.f21391a = false;
                    C7781d.this.mo14125b();
                    C7781d.this.f21392b.post(new Runnable() {
                        public final void run() {
                            C7781d.this.f21394d.insertMessage((IMessage) C7783a.this.f21403a.second, true);
                        }
                    });
                }
            }
        }

        C7783a(Pair<Set<Long>, C8017z> pair) {
            this.f21403a = pair;
            this.f21404b = ((Set) pair.first).size();
        }
    }

    /* renamed from: a */
    public final void mo14111a() {
    }

    /* renamed from: b */
    public final void mo14125b() {
        if (!this.f21398h.isEmpty() && !this.f21391a) {
            Pair pair = (Pair) this.f21398h.poll();
            if (pair != null && pair.first != null && !((Set) pair.first).isEmpty() && pair.second != null) {
                this.f21391a = true;
                this.f21399i = new C7783a(pair);
                for (Long l : (Set) pair.first) {
                    if (l != null) {
                        long longValue = l.longValue();
                        C7783a aVar = this.f21399i;
                        C7505d findGiftById = GiftManager.inst().findGiftById(longValue);
                        if (findGiftById == null || findGiftById.f20541b == null || findGiftById.f20541b.getUrls() == null || findGiftById.f20541b.getUrls().isEmpty()) {
                            aVar.mo14128c();
                        } else {
                            ((C8794c) C4116c.m10249a(C8794c.class)).mo15492a((String) findGiftById.f20541b.getUrls().get(0), (C8796b) aVar);
                        }
                    }
                }
                this.f21392b.sendEmptyMessageDelayed(1, 60000);
            }
        }
    }

    /* renamed from: a */
    public final void mo14112a(IMessageManager iMessageManager) {
        this.f21394d = iMessageManager;
    }

    /* renamed from: a */
    public final void mo14124a(long j) {
        List list = (List) this.f21393c.mo2487a(j);
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        if (message.what == 1) {
            this.f21399i.mo14126a();
            mo14125b();
        }
    }

    public final boolean onMessage(IMessage iMessage) {
        if (this.f21401k <= 0) {
            this.f21401k = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
        }
        if (iMessage instanceof C7944f) {
            iMessage = ((C7944f) iMessage).f21846a;
        }
        if (this.f21401k > 0 && (iMessage instanceof C7810ao)) {
            C7810ao aoVar = (C7810ao) iMessage;
            if (!aoVar.f21505n && aoVar.f21492a != null && this.f21401k == aoVar.f21492a.getId() && aoVar.f21498g != 1) {
                return true;
            }
        }
        if (this.f21401k > 0 && (iMessage instanceof C7804aj)) {
            C7804aj ajVar = (C7804aj) iMessage;
            if (!ajVar.f21472i && ajVar.f21469f != null && ajVar.f21469f.getId() == this.f21401k) {
                return true;
            }
        }
        if (iMessage instanceof C7810ao) {
            C7810ao aoVar2 = (C7810ao) iMessage;
            StringBuilder sb = new StringBuilder("收到 GiftMessage: ");
            sb.append(aoVar2.toString());
            C3831a.m9712b("GiftInterceptor", sb.toString());
            if (aoVar2.f21492a == null) {
                StringBuilder sb2 = new StringBuilder("giftMessage#fromUser is null! messageId = ");
                sb2.append(aoVar2.getMessageId());
                C3831a.m9716d("GiftInterceptor", sb2.toString());
                return true;
            } else if (((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(aoVar2.f21494c) != null) {
                return false;
            } else {
                long j = aoVar2.f21494c;
                HashMap hashMap = new HashMap();
                hashMap.put("gift_id", Long.valueOf(j));
                Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
                if (currentRoom != null) {
                    hashMap.put("room_type", Integer.valueOf(currentRoom.getOrientation()));
                    hashMap.put("room_id", Long.valueOf(currentRoom.getId()));
                    hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
                }
                C3837e.m9743a(C7647s.m15652b("ttlive_gift_id_not_found"), 1, (Map<String, Object>) hashMap);
                C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_gift_id_not_found", 1, (Map) hashMap);
                List list = (List) this.f21393c.mo2487a(aoVar2.f21494c);
                if (list == null) {
                    list = new ArrayList();
                    this.f21393c.mo2493b(aoVar2.f21494c, list);
                }
                list.add(aoVar2);
                C7226d dVar = this.f21397g;
                C7220c cVar = new C7220c(aoVar2.f21494c, this.f21395e, this.f21400j);
                List list2 = (List) dVar.f19617b.get(Long.valueOf(cVar.f19601b));
                if (list2 == null) {
                    list2 = new ArrayList();
                    dVar.f19617b.put(Long.valueOf(cVar.f19601b), list2);
                    dVar.f19616a.put(Long.valueOf(cVar.f19601b), Integer.valueOf(0));
                }
                if (!list2.contains(cVar)) {
                    list2.add(cVar);
                }
                dVar.mo13459a();
                return true;
            }
        } else {
            if (iMessage instanceof C8017z) {
                C8017z zVar = (C8017z) iMessage;
                StringBuilder sb3 = new StringBuilder("收到 DoodleGiftMessage: ");
                sb3.append(zVar.toString());
                C3831a.m9712b("GiftInterceptor", sb3.toString());
                if (zVar.f21944a == null) {
                    StringBuilder sb4 = new StringBuilder("doodleGiftMessage#fromUser is null! messageId = ");
                    sb4.append(zVar.getMessageId());
                    C3831a.m9716d("GiftInterceptor", sb4.toString());
                    return true;
                }
                C7794aa aaVar = zVar.f21950g;
                if (aaVar == null || aaVar.f21433a == null) {
                    StringBuilder sb5 = new StringBuilder("DoodleGiftMessage#compose is null! messageId = ");
                    sb5.append(zVar.getMessageId());
                    C3831a.m9716d("GiftInterceptor", sb5.toString());
                    return true;
                }
                Set set = null;
                for (int i = 0; i < aaVar.f21433a.size(); i++) {
                    C7795ab abVar = (C7795ab) aaVar.f21433a.get(i);
                    if (TextUtils.isEmpty(C7191a.m14934a(abVar.f21438c))) {
                        if (set == null) {
                            set = new HashSet();
                        }
                        set.add(Long.valueOf(abVar.f21438c));
                    }
                }
                if (set != null && !set.isEmpty()) {
                    if (zVar != null && zVar.getMessageId() > 0 && set != null && !set.isEmpty()) {
                        this.f21398h.add(new Pair(set, zVar));
                    }
                    mo14125b();
                    StringBuilder sb6 = new StringBuilder("DoodleGiftMessage#intercept due to no images, ids=");
                    sb6.append(set);
                    C3831a.m9712b("GiftInterceptor", sb6.toString());
                    return true;
                }
            }
            return false;
        }
    }

    public C7781d(long j, boolean z) {
        this.f21395e = j;
        this.f21396f = z;
        this.f21397g = new C7226d(z);
        this.f21392b = new C8618a(this);
    }
}
