package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5312i.C5313a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5312i.C5314b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5379a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5406ar;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.q */
public final class C5345q extends C5314b implements OnClickListener, OnCheckedChangeListener {

    /* renamed from: e */
    private DataCenter f14226e;

    /* renamed from: f */
    private TextView f14227f;

    /* renamed from: g */
    private TextView f14228g;

    /* renamed from: h */
    private View f14229h;

    /* renamed from: i */
    private C5379a f14230i;

    /* renamed from: j */
    private C2949a f14231j;

    /* renamed from: k */
    private TextView f14232k;

    /* renamed from: l */
    private CountDownTimer f14233l;

    /* renamed from: m */
    private TextView f14234m;

    /* renamed from: n */
    private ImageView f14235n;

    /* renamed from: o */
    private int f14236o;

    /* renamed from: c */
    public final float mo11150c() {
        return 176.0f;
    }

    /* renamed from: b */
    public final String mo11149b() {
        return getString(R.string.emg);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f14233l != null) {
            this.f14233l.cancel();
            this.f14233l = null;
        }
    }

    /* renamed from: e */
    public final View mo11152e() {
        int i = 0;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aq0, (ViewGroup) getView(), false);
        View findViewById = inflate.findViewById(R.id.b47);
        if (!((Boolean) C4525b.f12348aQ.mo10345a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C5346r(this));
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11258a(View view) {
        C4525b.f12348aQ.mo10346a(Boolean.valueOf(false));
        this.f14146a.mo11094a(C5341m.m12118a(this.f14146a));
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.b2d || view.getId() == R.id.dbp) {
            LinkCrossRoomDataHolder.m11103a().f12627r = 1;
            this.f14146a.mo11094a(C5335h.m12091a(this.f14146a, this.f14226e, 0));
            HashMap hashMap = new HashMap();
            hashMap.put("is_rematch", "0");
            hashMap.put("is_oncemore", "0");
            hashMap.put("connection_type", "random_pk");
            C8049c.m15979a().mo14202a("connection_invite", hashMap, new C8056g().mo14205a(300), Room.class);
        } else if (view.getId() == R.id.b2c || view.getId() == R.id.dbn) {
            HashMap hashMap2 = new HashMap();
            Room room = (Room) this.f14226e.get("data_room", null);
            if (room != null) {
                long id = room.getOwner().getId();
                long id2 = room.getId();
                hashMap2.put("anchor_id", String.valueOf(id));
                hashMap2.put("room_id", String.valueOf(id2));
            }
            hashMap2.put("connection_type", "manual_pk");
            C8049c.m15979a().mo14202a("livesdk_manual_icon_click", hashMap2, new Object[0]);
            this.f14146a.mo11094a(C5347s.m12140a(this.f14146a, 1, this.f14226e));
        } else {
            view.getId();
            if (view.getId() == R.id.b2b || view.getId() == R.id.dbm) {
                this.f14149d.f12627r = 2;
                this.f14149d.f12628s = (long) this.f14236o;
                this.f14149d.f12619j = 300;
                this.f14146a.mo11094a(C5335h.m12091a(this.f14146a, this.f14226e, this.f14236o));
                C8049c.m15979a().mo14203a("connection_invite", new C8056g().mo14207a(Boolean.valueOf(false)), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
            }
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton.getId();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.b2d).setOnClickListener(this);
        view.findViewById(R.id.dbp).setOnClickListener(this);
        view.findViewById(R.id.b2c).setOnClickListener(this);
        view.findViewById(R.id.dbn).setOnClickListener(this);
        this.f14232k = (TextView) view.findViewById(R.id.f3_);
        this.f14234m = (TextView) view.findViewById(R.id.dbm);
        this.f14235n = (ImageView) view.findViewById(R.id.b2b);
        this.f14227f = (TextView) view.findViewById(R.id.d8o);
        this.f14228g = (TextView) view.findViewById(R.id.d8p);
        this.f14229h = view.findViewById(R.id.k4);
        if (!C8607a.f23572a) {
            ((C5313a) this.f14148c).mo11190a(((Room) this.f14226e.get("data_room")).getOwner().getId());
        }
        this.f14236o = 0;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ake, viewGroup, false);
    }

    /* renamed from: a */
    public static C5345q m12135a(C5323b bVar, DataCenter dataCenter, C5379a aVar, C2949a aVar2) {
        C5345q qVar = new C5345q();
        qVar.f14148c = new C5406ar(qVar);
        qVar.f14146a = bVar;
        qVar.f14226e = dataCenter;
        qVar.f14230i = aVar;
        qVar.f14231j = aVar2;
        return qVar;
    }
}
