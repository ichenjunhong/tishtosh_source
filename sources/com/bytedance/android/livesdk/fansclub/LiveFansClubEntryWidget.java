package com.bytedance.android.livesdk.fansclub;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4641g;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.fansclub.C6777b.C6779a;
import com.bytedance.android.livesdk.message.model.C7799af;
import com.bytedance.android.livesdk.message.model.C7801ag;
import com.bytedance.android.livesdk.message.model.FansclubStatisticMessage;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p420u.C8315a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class LiveFansClubEntryWidget extends LiveRecyclableWidget implements C4641g<KVData>, C6779a {

    /* renamed from: a */
    TextView f18568a;

    /* renamed from: b */
    C4104a f18569b;

    /* renamed from: c */
    Room f18570c;

    /* renamed from: d */
    User f18571d;

    /* renamed from: e */
    String f18572e = "";

    /* renamed from: f */
    long f18573f;

    /* renamed from: g */
    int f18574g;

    /* renamed from: h */
    boolean f18575h;

    /* renamed from: i */
    boolean f18576i;

    /* renamed from: j */
    private ImageView f18577j;

    /* renamed from: k */
    private C1690c f18578k;

    /* renamed from: l */
    private C6777b f18579l;

    /* renamed from: m */
    private C1690c f18580m;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.ajp;
    }

    public void onUnload() {
        this.f18579l.mo8247a();
        if (this.f18578k != null && !this.f18578k.isDisposed()) {
            this.f18578k.dispose();
        }
        if (this.f18580m != null && !this.f18580m.isDisposed()) {
            this.f18580m.dispose();
        }
        this.f18571d = null;
        this.dataCenter.removeObserver(new C6790m(this));
    }

    /* renamed from: a */
    public final void mo12914a(C7799af afVar) {
        User user = afVar.f21451c;
        if (TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            C3009i a = TTLiveSDKContext.getHostService().mo10315h().mo14521a();
            if (!(user == null || a == null || a.getId() != user.getId())) {
                if (this.f18569b != null) {
                    this.f18569b.dismissAllowingStateLoss();
                    this.f18569b = null;
                }
                this.f18575h = true;
            }
        }
    }

    public void onInit(Object[] objArr) {
        this.f18568a = (TextView) this.contentView.findViewById(R.id.d_8);
        this.f18577j = (ImageView) this.contentView.findViewById(R.id.d_9);
        C8315a aVar = (C8315a) C4514j.m10883j().mo10326g().mo10305a(C8315a.class);
        if (aVar != null) {
            this.f18577j.setImageResource(aVar.mo14492a());
        }
        this.f18579l = new C6777b();
    }

    /* renamed from: a */
    public final void mo12913a(FansclubStatisticMessage fansclubStatisticMessage) {
        if (fansclubStatisticMessage != null) {
            if (!TextUtils.isEmpty(fansclubStatisticMessage.name)) {
                this.f18572e = fansclubStatisticMessage.name;
            }
            if (fansclubStatisticMessage.fansCount >= 0) {
                this.f18573f = fansclubStatisticMessage.fansCount;
            }
            if (!TextUtils.isEmpty(this.f18572e) && this.f18573f >= 0) {
                C9432q.m18691b(this.contentView, 0);
                this.f18568a.setText(getContext().getResources().getString(R.string.ea8, new Object[]{this.f18572e, C4204a.m10420a(this.f18573f, "w")}));
            }
        }
    }

    /* renamed from: a */
    public final void mo12915a(C7801ag agVar) {
        if (agVar.f21456a == 1) {
            this.f18572e = agVar.f21457b;
            this.f18568a.setText(getContext().getResources().getString(R.string.ea8, new Object[]{this.f18572e, C4204a.m10420a(this.f18573f, "w")}));
            this.f18574g = 3;
        }
    }

    public void onLoad(Object[] objArr) {
        this.f18570c = (Room) this.dataCenter.get("data_room");
        if (this.f18570c != null && this.f18570c.getOwner() != null) {
            this.f18580m = C4495a.m10823a().mo10300a(C6776a.class).mo6545f((C1710e<? super T>) new C6785h<Object>(this));
            String str = (String) this.dataCenter.get("log_enter_live_source");
            this.dataCenter.observeForever("data_user_in_room", new C6786i(this));
            C8315a aVar = (C8315a) C4514j.m10883j().mo10326g().mo10305a(C8315a.class);
            if (aVar != null) {
                this.f18578k = ((LiveFansClubApi) C4514j.m10883j().mo10321b().mo9550a(LiveFansClubApi.class)).queryFansClubInfo(aVar.mo14493b(), this.f18570c.getOwner().getId()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C6787j<Object>(this), C6788k.f18591a);
                this.f18579l.mo8520a((C6779a) this);
                this.containerView.setOnClickListener(new C6789l(this, str));
            }
        }
    }

    /* renamed from: a */
    public final void mo9061a(KVData kVData) {
        if (kVData != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -1741164106 && key.equals("data_user_in_room")) {
                c = 0;
            }
            if (c == 0) {
                Object data = kVData.getData();
                if (data instanceof User) {
                    this.f18571d = (User) data;
                }
            }
        }
    }
}
