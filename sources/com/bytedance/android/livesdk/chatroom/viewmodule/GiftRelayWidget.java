package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.presenter.C5784ah;
import com.bytedance.android.livesdk.chatroom.presenter.C5784ah.C5785a;
import com.bytedance.android.livesdk.chatroom.presenter.C5786ai;
import com.bytedance.android.livesdk.chatroom.presenter.C5787aj;
import com.bytedance.android.livesdk.chatroom.presenter.C5788ak;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.relay.C7634b;
import com.bytedance.android.livesdk.gift.relay.C7638e;
import com.bytedance.android.livesdk.gift.relay.p381a.C7629a;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c;
import com.bytedance.android.livesdk.message.model.C7870ck;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.HashMap;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

public class GiftRelayWidget extends LiveRecyclableWidget implements C0199s<KVData>, C5785a {

    /* renamed from: a */
    private Room f17024a;

    /* renamed from: b */
    private boolean f17025b;

    /* renamed from: c */
    private boolean f17026c;

    /* renamed from: d */
    private C7634b f17027d;

    /* renamed from: e */
    private C5784ah f17028e;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
        if (this.f17027d != null && this.f17027d.f18412j) {
            this.f17027d.f21005a = false;
            this.f17027d.dismissAllowingStateLoss();
        }
        this.f17028e.mo8247a();
    }

    public void onInit(Object[] objArr) {
        this.f17028e = new C5784ah();
    }

    /* renamed from: a */
    public final void mo11672a(C7629a aVar) {
        if (this.f17027d != null && this.f17027d.mo12851g() && aVar != null) {
            this.f17027d.mo13996a(aVar.f20981m, aVar.f20980l);
        }
    }

    public void onLoad(Object[] objArr) {
        this.f17024a = (Room) this.dataCenter.get("data_room", null);
        this.f17025b = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        this.f17026c = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        this.dataCenter.observe("cmd_show_gift_relay_dialog", this);
        this.f17028e.mo8520a((C5785a) this);
    }

    public /* synthetic */ void onChanged(Object obj) {
        boolean z;
        String str;
        KVData kVData = (KVData) obj;
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -171438776 && key.equals("cmd_show_gift_relay_dialog")) {
                c = 0;
            }
            if (c == 0) {
                C7870ck ckVar = (C7870ck) kVData.getData();
                if (ckVar != null) {
                    String str2 = ckVar.f21793a;
                    String str3 = ckVar.f21793a;
                    if (this.f17027d != null && this.f17027d.mo12851g()) {
                        this.f17027d.f21005a = false;
                        this.f17027d.dismissAllowingStateLoss();
                        this.f17027d = null;
                    }
                    Activity activity = (Activity) this.context;
                    Room room = this.f17024a;
                    boolean z2 = this.f17025b;
                    boolean z3 = this.f17026c;
                    long j = ckVar.f21794b;
                    C7634b bVar = new C7634b();
                    bVar.f21006b = activity;
                    bVar.f21008d = room;
                    bVar.f21009e = z2;
                    bVar.f21010f = z3;
                    if (!z2 || (!z3 && !C3894h.m9842a(activity))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bVar.f21011g = z;
                    bVar.f21005a = "gift_panel".equals(str3);
                    bVar.f21012h = j;
                    this.f17027d = bVar;
                    C7634b bVar2 = this.f17027d;
                    bVar2.f21007c = this.dataCenter;
                    bVar2.f21007c.observe("data_is_gift_relay_showing", new C7638e(bVar2));
                    if (this.context instanceof FragmentActivity) {
                        long j2 = 0;
                        C7631c giftRelayInfo = GiftManager.inst().getGiftRelayInfo(0);
                        C5784ah ahVar = this.f17028e;
                        long id = this.f17024a.getId();
                        long ownerUserId = this.f17024a.getOwnerUserId();
                        if (giftRelayInfo != null) {
                            j2 = giftRelayInfo.f20985c;
                        }
                        ahVar.f15231a = ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).checkFreeCellStatus(id, ownerUserId, j2).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6506a((C1710e<? super T>) new C5786ai<Object>(ahVar), C5787aj.f15233a, C5788ak.f15234a);
                        this.f17027d.show(((FragmentActivity) this.context).getSupportFragmentManager(), "");
                    }
                    if (this.f17024a != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("anchor_id", String.valueOf(this.f17024a.getOwnerUserId()));
                        hashMap.put("room_id", String.valueOf(this.f17024a.getId()));
                        hashMap.put("show_position", str2);
                        C8049c a = C8049c.m15979a();
                        String str4 = "endless_gift_show";
                        Object[] objArr = new Object[2];
                        C8059j jVar = new C8059j();
                        if (this.f17026c) {
                            str = "live_take_detail";
                        } else {
                            str = "live_detail";
                        }
                        objArr[0] = jVar.mo14213a(str).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                        objArr[1] = Room.class;
                        a.mo14202a(str4, hashMap, objArr);
                    }
                }
            }
        }
    }
}
