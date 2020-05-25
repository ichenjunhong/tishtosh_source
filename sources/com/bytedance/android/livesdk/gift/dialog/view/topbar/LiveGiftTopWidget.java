package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.view.View;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.app.dataholder.C4641g;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1710e;

public class LiveGiftTopWidget extends LiveRecyclableWidget implements C4641g<KVData> {

    /* renamed from: a */
    final GiftViewModel f19799a;

    /* renamed from: b */
    LiveGiftGroupView f19800b;

    /* renamed from: c */
    LiveNobleGiftView f19801c;

    /* renamed from: d */
    LiveFirstChargeView f19802d;

    /* renamed from: e */
    LiveTopDefaultView f19803e;

    /* renamed from: f */
    boolean f19804f;

    /* renamed from: g */
    private View f19805g;

    /* renamed from: h */
    private View f19806h;

    /* renamed from: i */
    private View f19807i;

    public int getLayoutId() {
        return R.layout.bvl;
    }

    public void onUnload() {
        this.f19799a.mo13529a((C0184k) this);
    }

    public LiveGiftTopWidget(GiftViewModel giftViewModel) {
        this.f19799a = giftViewModel;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13519a(View view) {
        if (view != null) {
            if (this.f19807i != null) {
                this.f19807i.setVisibility(8);
            }
            this.f19807i = view;
            this.f19807i.setVisibility(0);
        }
    }

    public void onInit(Object[] objArr) {
        this.f19805g = findViewById(R.id.e_o);
        this.f19800b = (LiveGiftGroupView) findViewById(R.id.e_j);
        this.f19801c = (LiveNobleGiftView) findViewById(R.id.en_);
        this.f19802d = (LiveFirstChargeView) findViewById(R.id.e8t);
        this.f19803e = (LiveTopDefaultView) findViewById(R.id.e4r);
        this.f19806h = findViewById(R.id.e2b);
    }

    /* renamed from: a */
    public final void mo9061a(KVData kVData) {
        if (kVData != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -1688481778 && key.equals("data_first_charge_in_room")) {
                c = 0;
            }
            if (c == 0) {
                kVData.getData();
                this.f19804f = false;
                if (this.f19802d.getVisibility() == 0) {
                    Boolean.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c());
                    mo13519a((View) this.f19803e);
                }
            }
        }
    }

    public void onLoad(Object[] objArr) {
        Room room = (Room) this.dataCenter.get("data_room", null);
        LiveGiftGroupView liveGiftGroupView = this.f19800b;
        liveGiftGroupView.f19790g = this.f19799a;
        liveGiftGroupView.f19791h = room;
        this.f19803e.setViewModel(this.f19799a);
        this.dataCenter.get("data_first_charge_in_room", null);
        Boolean.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c());
        ((C4002ac) C4495a.m10823a().mo10300a(C7713e.class).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C7280b<Object>(this));
        this.dataCenter.observe("data_first_charge_in_room", new C7281c(this));
        this.f19799a.mo13530a((C0184k) this, (C0199s<C7290b>) new C7282d<C7290b>(this));
        this.f19806h.setOnClickListener(new C7283e(this));
    }
}
