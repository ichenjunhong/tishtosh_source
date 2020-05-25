package com.bytedance.android.livesdk.chatroom.interact.p322k;

import android.content.Context;
import android.content.DialogInterface;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.app.dataholder.C4641g;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.C5282ap.C5283a;
import com.bytedance.android.livesdk.chatroom.interact.C5284aq;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5252a;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5252a.C5253a;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5252a.C5254b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5387a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5697f;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p325ui.C5985bi;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.rank.C8208i;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.video.rtc.interact.controller.SEIHelper;
import com.p683ss.video.rtc.interact.controller.SEIHelper.Callback;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.model.SEI;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C1674ab;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.k.a */
public final class C5647a implements C5254b, C5283a, C5631a, Callback {

    /* renamed from: a */
    public Context f14784a;

    /* renamed from: b */
    public FrameLayout f14785b;

    /* renamed from: c */
    public View f14786c;

    /* renamed from: d */
    public ImageView f14787d;

    /* renamed from: e */
    public TextView f14788e;

    /* renamed from: f */
    public RecyclerView f14789f;

    /* renamed from: g */
    public C5252a f14790g;

    /* renamed from: h */
    public C5630a f14791h;

    /* renamed from: i */
    public Room f14792i;

    /* renamed from: j */
    public boolean f14793j;

    /* renamed from: k */
    public SEIHelper f14794k;

    /* renamed from: l */
    public boolean f14795l;

    /* renamed from: m */
    public DataCenter f14796m;

    /* renamed from: n */
    public C4641g<Integer> f14797n = new C5652b(this);

    /* renamed from: o */
    public C5387a f14798o;

    /* renamed from: p */
    public C5985bi f14799p;

    /* renamed from: q */
    private C5284aq f14800q;

    /* renamed from: r */
    private C8208i f14801r;

    /* renamed from: s */
    private Map<String, Boolean> f14802s = new HashMap(9);

    /* renamed from: t */
    private OnClickListener f14803t = new OnClickListener() {
        public final void onClick(View view) {
            if (!C5647a.this.f14793j) {
                if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                    TTLiveSDKContext.getHostService().mo10315h().mo14516a(C5647a.this.f14784a, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ek_)).mo14543c("interact").mo14539a(0).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                    return;
                } else if (TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.INTERACT)) {
                    return;
                }
            }
            C5647a.this.f14796m.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(0));
            C4563ad.m10956a(C5647a.this.f14792i, "click_connection_banner", "guest_connection", C5647a.this.f14793j);
        }
    };

    /* renamed from: u */
    private OnClickListener f14804u = new OnClickListener() {
        public final void onClick(View view) {
            C5647a.this.mo11528b();
        }
    };

    /* renamed from: v */
    private OnClickListener f14805v = new OnClickListener() {
        public final void onClick(View view) {
            boolean z;
            int i;
            if (((Integer) C4639e.m11122a().f12651b).intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            C8552a a = new C8552a(C5647a.this.f14784a).mo14996a(false);
            if (z) {
                i = R.string.eq2;
            } else {
                i = R.string.eq3;
            }
            a.mo15008c(i).mo15003b(0, (int) R.string.e59, (DialogInterface.OnClickListener) new C5655e(this, z)).mo15003b(1, (int) R.string.e45, C5656f.f14815a).mo15011d();
        }
    };

    /* renamed from: a */
    public final void mo11074a(long j, String str, boolean z) {
    }

    /* renamed from: b */
    public final void mo11125b(long j, String str) {
    }

    public final boolean isVersionSupported(int i) {
        return i == 3;
    }

    /* renamed from: a */
    public final void mo11527a() {
        String str;
        int c = this.f14791h.mo11524c();
        List<C5696e> list = this.f14791h.f14761i;
        if (this.f14793j) {
            if (c > 0) {
                str = C3922z.m9905a((int) R.string.eqa, Integer.valueOf(c));
                C5213c.m11824b(this.f14787d, ((C5696e) list.get(c - 1)).f14953d.getAvatarThumb());
            } else {
                str = C3922z.m9903a((int) R.string.eq_);
                C5213c.m11813a(this.f14787d, (int) R.drawable.bry);
            }
            this.f14788e.setText(str);
            this.f14786c.setOnClickListener(this.f14803t);
            this.f14786c.setVisibility(0);
        } else if (1 == ((Integer) C4639e.m11122a().f12651b).intValue()) {
            this.f14788e.setText(R.string.epq);
            C5213c.m11813a(this.f14787d, (int) R.drawable.bsk);
            this.f14786c.setOnClickListener(this.f14805v);
            this.f14786c.setVisibility(0);
        } else if (2 == ((Integer) C4639e.m11122a().f12651b).intValue()) {
            this.f14788e.setText(R.string.epz);
            C5213c.m11813a(this.f14787d, (int) R.drawable.bsl);
            this.f14786c.setOnClickListener(this.f14805v);
            this.f14786c.setVisibility(0);
        } else {
            this.f14788e.setText(R.string.gy6);
            C5213c.m11813a(this.f14787d, (int) R.drawable.bry);
            this.f14786c.setOnClickListener(this.f14804u);
            this.f14786c.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo11528b() {
        String str;
        if (!this.f14793j) {
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                TTLiveSDKContext.getHostService().mo10315h().mo14516a(this.f14784a, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ek_)).mo14543c("interact").mo14539a(0).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                return;
            } else if (TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.INTERACT)) {
                return;
            }
        }
        C4563ad.m10956a(this.f14792i, "click_connection_banner", "guest_connection", false);
        if (!this.f14793j && ((Integer) C4639e.m11122a().f12651b).intValue() == 0) {
            new C8552a(this.f14784a).mo15008c((int) R.string.eq1).mo15003b(0, (int) R.string.e59, (DialogInterface.OnClickListener) new C5653c(this)).mo15003b(1, (int) R.string.e45, C5654d.f14812a).mo15011d();
            HashMap hashMap = new HashMap();
            if (this.f14792i != null) {
                String str2 = "room_type";
                if (this.f14792i.getStreamType() == C8710m.AUDIO) {
                    str = "radio";
                } else {
                    str = "video";
                }
                hashMap.put(str2, str);
            }
            hashMap.put("audience_connection_type", "voice");
            C8049c.m15979a().mo14202a("audience_connection_apply", hashMap, new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"), C8059j.class, Room.class);
        }
    }

    /* renamed from: a */
    public final void mo11127a(int i) {
        mo11527a();
    }

    /* renamed from: b */
    public final void mo11106b(int i) {
        if (!this.f14793j) {
            mo11528b();
        }
    }

    /* renamed from: b */
    public final void mo11126b(List<C5696e> list) {
        mo11527a();
    }

    public final void onSeiUpdated(SEI sei) {
        if (sei != null && sei.getGridList() != null && !sei.getGridList().isEmpty()) {
            List gridList = sei.getGridList();
            int size = gridList.size();
            String[] strArr = new String[size];
            boolean[] zArr = new boolean[size];
            for (int i = 0; i < size; i++) {
                Region region = (Region) gridList.get(i);
                strArr[i] = String.valueOf(region.getInteractId());
                zArr[i] = region.isTalking();
            }
            onTalkStateUpdated(strArr, zArr);
        }
    }

    /* renamed from: a */
    public final void mo11105a(C5696e eVar) {
        if (this.f14793j) {
            if (this.f14798o == null) {
                this.f14798o = new C5387a(this.f14792i, true, this.f14791h);
            }
            this.f14799p = new C5985bi(this.f14784a, this.f14796m, eVar, this.f14798o);
            this.f14799p.show();
            return;
        }
        if (this.f14796m != null) {
            this.f14796m.lambda$put$1$DataCenter("cmd_send_gift", eVar.f14953d);
        }
    }

    /* renamed from: a */
    public final void mo11092a(List<C5696e> list) {
        boolean z;
        ArrayList arrayList = new ArrayList(8);
        if (list.size() > 0 && list.size() <= 9) {
            C5284aq aqVar = this.f14800q;
            long id = ((C5696e) list.get(0)).f14953d.getId();
            if (((C5696e) list.get(0)).f14961l != 0) {
                z = true;
            } else {
                z = false;
            }
            aqVar.mo11128a(id, z);
            for (int i = 0; i < 8; i++) {
                C5696e eVar = new C5696e();
                eVar.f14952c = 0;
                arrayList.add(eVar);
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((C5696e) list.get(i2)).f14960k > 0 && ((C5696e) list.get(i2)).f14960k < 9) {
                    arrayList.set(((C5696e) list.get(i2)).f14960k - 1, list.get(i2));
                }
            }
            C5252a aVar = this.f14790g;
            aVar.f14051a = arrayList;
            aVar.notifyDataSetChanged();
            this.f14790g.f14052b = list;
        }
    }

    /* renamed from: a */
    public final void mo11104a(int i, boolean z) {
        if (this.f14789f.mo4847f(i) instanceof C5253a) {
            C5253a aVar = (C5253a) this.f14789f.mo4847f(i);
            if (!z || aVar.f14061h.f14961l != 0) {
                aVar.f14060g.setVisibility(4);
                if (aVar.f14060g.mo6660e()) {
                    aVar.f14060g.mo6661f();
                }
            } else {
                aVar.f14060g.setVisibility(0);
                aVar.f14060g.mo6654b();
            }
        }
    }

    /* renamed from: a */
    public final void mo11122a(long j, long j2) {
        C5252a aVar = this.f14790g;
        int i = -1;
        for (int i2 = 0; i2 < aVar.f14051a.size(); i2++) {
            C5696e eVar = (C5696e) aVar.f14051a.get(i2);
            if (eVar.mo11637a() != null && eVar.f14953d.getId() == j) {
                ((C5696e) aVar.f14051a.get(i2)).f14951b = j2;
                i = i2;
            }
        }
        if (i >= 0) {
            aVar.notifyItemChanged(i);
        }
    }

    public final void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
        boolean z;
        for (int i = 0; i < strArr.length; i++) {
            this.f14802s.put(strArr[i], Boolean.valueOf(zArr[i]));
        }
        String str = null;
        C5696e a = this.f14791h.mo11513a(this.f14792i.getOwner().getId(), null);
        if (!(a == null || a.f14953d == null)) {
            str = a.mo11637a();
        }
        if (this.f14802s.containsKey(str) && this.f14800q != null) {
            Boolean bool = (Boolean) this.f14802s.get(str);
            C5284aq aqVar = this.f14800q;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            aqVar.mo11129a(str, z);
        }
        C5252a aVar = this.f14790g;
        Map<String, Boolean> map = this.f14802s;
        for (int i2 = 0; i2 < aVar.f14051a.size(); i2++) {
            C5696e eVar = (C5696e) aVar.f14051a.get(i2);
            Boolean bool2 = (Boolean) map.get(String.valueOf(eVar.mo11637a()));
            if (!(eVar.mo11637a() == null || bool2 == null || bool2.booleanValue() == eVar.f14964o)) {
                eVar.f14964o = bool2.booleanValue();
                aVar.f14053c.mo11104a(i2, eVar.f14964o);
            }
        }
    }

    /* renamed from: a */
    public final void mo11123a(List<C5697f> list, long j) {
        if (this.f14795l) {
            if (this.f14801r != null && this.f14801r.isShowing()) {
                this.f14801r.dismiss();
            }
            this.f14801r = new C8208i(this.f14784a, list);
            this.f14801r.f22391a = j;
            this.f14801r.show();
        }
    }

    public C5647a(Room room, boolean z, FrameLayout frameLayout, C5630a aVar, Context context, C5284aq aqVar, DataCenter dataCenter) {
        this.f14784a = context;
        this.f14792i = room;
        this.f14793j = z;
        this.f14785b = frameLayout;
        this.f14791h = aVar;
        this.f14794k = new SEIHelper(this);
        this.f14800q = aqVar;
        this.f14796m = dataCenter;
    }
}
