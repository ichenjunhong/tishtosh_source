package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5291b.C5292a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5291b.C5293b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5603k;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.a */
public final class C5328a extends C5293b implements OnClickListener {

    /* renamed from: e */
    private int f14151e;

    /* renamed from: f */
    private DataCenter f14152f;

    /* renamed from: c */
    public final float mo11150c() {
        return 160.0f;
    }

    /* renamed from: b */
    public final String mo11149b() {
        return getString(R.string.emd);
    }

    /* renamed from: a */
    public final void mo11144a() {
        boolean z;
        if (this.f10828D) {
            if (this.f14151e == R.id.axw || this.f14151e == R.id.d6q) {
                if (VERSION.SDK_INT < 21) {
                    C4575an.m10981a((int) R.string.emb);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f14146a.mo11094a(C5347s.m12140a(this.f14146a, 2, this.f14152f));
                }
            }
            this.f14151e = 0;
        }
    }

    /* renamed from: e */
    public final View mo11152e() {
        int i = 0;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aq0, (ViewGroup) getView(), false);
        View findViewById = inflate.findViewById(R.id.b47);
        if (!((Boolean) C4525b.f12349aR.mo10345a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C5329b(this));
        return inflate;
    }

    /* renamed from: a */
    public final void mo11145a(Throwable th) {
        if (this.f10828D) {
            this.f14151e = 0;
            C4602l.m11046a(getContext(), th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11223a(View view) {
        C4525b.f12349aR.mo10346a(Boolean.valueOf(false));
        this.f14146a.mo11094a(C5351u.m12157a(this.f14146a));
    }

    public final void onClick(View view) {
        if (this.f14151e == 0) {
            this.f14151e = view.getId();
            new HashMap();
            if (this.f14151e == R.id.d6w || this.f14151e == R.id.ay0) {
                LinkCrossRoomDataHolder.m11103a().f12630u = true;
                HashMap hashMap = new HashMap();
                hashMap.put("connection_type", "audience");
                C8049c.m15979a().mo14202a("connection_invite", hashMap, Room.class);
            } else if (this.f14151e == R.id.d6q || this.f14151e == R.id.axw) {
                LinkCrossRoomDataHolder.m11103a().f12630u = false;
                HashMap hashMap2 = new HashMap();
                Room room = (Room) this.f14152f.get("data_room", null);
                if (room != null) {
                    long id = room.getOwner().getId();
                    long id2 = room.getId();
                    hashMap2.put("anchor_id", String.valueOf(id));
                    hashMap2.put("room_id", String.valueOf(id2));
                }
                hashMap2.put("connection_type", "anchor");
                C8049c.m15979a().mo14202a("livesdk_manual_icon_click", hashMap2, new Object[0]);
            }
            if (this.f14151e == R.id.d6w || this.f14151e == R.id.ay0) {
                this.f14151e = 0;
                this.f14152f.lambda$put$1$DataCenter("cmd_audience_turn_on_link", new Object());
                return;
            }
            if (!(this.f14146a == null || this.f14146a.mo11097c() == null)) {
                ((C5292a) this.f14148c).mo11143a(this.f14146a.mo11097c().getId());
            }
        }
    }

    /* renamed from: a */
    public static C5328a m12064a(C5323b bVar, DataCenter dataCenter) {
        C5328a aVar = new C5328a();
        aVar.f14148c = new C5603k(aVar);
        aVar.f14146a = bVar;
        aVar.f14152f = dataCenter;
        return aVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ak8, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.d6q);
        TextView textView2 = (TextView) inflate.findViewById(R.id.d6w);
        View findViewById = inflate.findViewById(R.id.axw);
        View findViewById2 = inflate.findViewById(R.id.ay0);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        return inflate;
    }
}
