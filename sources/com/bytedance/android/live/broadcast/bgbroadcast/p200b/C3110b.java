package com.bytedance.android.live.broadcast.bgbroadcast.p200b;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.android.live.broadcast.bgbroadcast.C3106b;
import com.bytedance.android.live.broadcast.bgbroadcast.C3133n;
import com.bytedance.android.live.broadcast.p198b.C3061a;
import com.bytedance.android.live.broadcast.p198b.C3071g;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.p160b.C2831a;
import com.bytedance.android.p160b.C2831a.C2832a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b */
public final class C3110b extends C3106b implements C2832a {

    /* renamed from: e */
    private C2831a f9069e;

    /* renamed from: f */
    private View f9070f;

    /* renamed from: g */
    private View f9071g;

    /* renamed from: h */
    private C3071g f9072h;

    /* renamed from: i */
    private C3061a f9073i;

    /* renamed from: j */
    private boolean f9074j;

    /* renamed from: k */
    private TextureView f9075k;

    /* renamed from: l */
    private boolean f9076l;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b$a */
    class C3112a implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C3112a() {
        }

        public final void onClick(View view) {
            C3110b.this.mo8427o();
            C3110b.this.mo8425a(false);
            C3110b.this.mo8426b(false);
        }
    }

    /* renamed from: a */
    public final void mo7452a(int i, String str) {
    }

    /* renamed from: a */
    public final void mo7453a(Exception exc) {
    }

    /* renamed from: a */
    public final void mo7454a(Object obj) {
    }

    /* renamed from: b */
    public final void mo8393b() {
    }

    /* renamed from: c */
    public final void mo8394c() {
    }

    /* renamed from: g */
    public final boolean mo8398g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo8399h() {
        return false;
    }

    /* renamed from: l */
    public final void mo7457l() {
    }

    /* renamed from: m */
    public final void mo7458m() {
    }

    /* renamed from: n */
    public final void mo7459n() {
    }

    /* renamed from: j */
    public final void mo7455j() {
        if (!this.f9074j) {
            m8630q();
        }
    }

    /* renamed from: q */
    private void m8630q() {
        this.f9071g.setVisibility(0);
        this.f9070f.setVisibility(0);
    }

    /* renamed from: r */
    private void m8631r() {
        this.f9071g.setVisibility(8);
        this.f9070f.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo8396e() {
        this.f9071g.postDelayed(new C3113c(this), 2000);
    }

    /* renamed from: f */
    public final void mo8397f() {
        this.f9074j = true;
        m8631r();
        m8629c(false);
    }

    /* renamed from: k */
    public final void mo7456k() {
        m8631r();
        this.f9065b.mo8443c(false);
    }

    /* renamed from: d */
    public final void mo8395d() {
        super.mo8395d();
        m8629c(true);
        if (this.f9069e != null) {
            this.f9069e.stop(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo8428p() {
        if (this.f9065b.mo8452l() && !this.f9074j) {
            mo8427o();
            mo8425a(true);
            mo8426b(true);
        }
    }

    /* renamed from: o */
    public final void mo8427o() {
        if (this.f9072h == null) {
            this.f9072h = new C3071g(this.f9066c, this.f9064a.getStreamUrl().mo15381a(), this.f9064a);
        }
        if (!this.f9072h.isShowing()) {
            this.f9072h.show();
        }
    }

    /* renamed from: a */
    public final void mo8392a() {
        super.mo8392a();
        this.f9071g = this.f9066c.findViewById(R.id.iz);
        this.f9070f = this.f9066c.findViewById(R.id.c66);
        m8630q();
        this.f9075k = (TextureView) this.f9066c.findViewById(R.id.dqi);
        this.f9069e = ((C4139d) C4116c.m10249a(C4139d.class)).createRoomPlayer(this.f9064a.getMultiStreamData(), this.f9064a.getMultiStreamDefaultQualitySdkKey(), this.f9064a.getStreamType(), this.f9064a.getStreamSrConfig(), this.f9075k, (C2832a) this, (Context) this.f9066c);
        this.f9069e.setSeiOpen(!this.f9076l);
        this.f9069e.startWithNewLivePlayer();
        this.f9074j = false;
        C6610k.m13986b().mo12668a(C6605h.PUSH_URL, (C6601a) new C3112a());
    }

    /* renamed from: c */
    private void m8629c(boolean z) {
        if (this.f9072h != null && this.f9072h.isShowing()) {
            this.f9072h.dismiss();
        }
        if (z) {
            this.f9072h = null;
        }
    }

    /* renamed from: a */
    public final void mo8425a(boolean z) {
        if (this.f9072h != null) {
            this.f9072h.f8970a = z;
        }
    }

    /* renamed from: b */
    public final void mo8426b(boolean z) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        String str3 = "room_id";
        if (this.f9064a == null) {
            str = "";
        } else {
            str = this.f9064a.getIdStr();
        }
        hashMap.put(str3, str);
        String str4 = "request_page";
        if (z) {
            str2 = "live_start";
        } else {
            str2 = "live_room";
        }
        hashMap.put(str4, str2);
        C8049c.m15979a().mo14202a("livesdk_stream_key_banner_show", hashMap, new Object[0]);
    }

    public final void onEvent(C5204w wVar) {
        if (wVar.f13924a == 27) {
            if (this.f9073i == null) {
                this.f9073i = new C3061a(this.f9066c);
            }
            if (!this.f9073i.isShowing()) {
                this.f9073i.show();
            }
        }
    }

    public C3110b(Room room, C3133n nVar) {
        boolean z;
        super(room, nVar);
        if (room.getOwnerUserId() == ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) {
            z = true;
        } else {
            z = false;
        }
        this.f9076l = z;
    }

    /* renamed from: a */
    public final void mo7451a(int i, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f9075k.getLayoutParams();
        if (i > i2) {
            marginLayoutParams.width = C9432q.m18670a((Context) this.f9066c);
            marginLayoutParams.height = (marginLayoutParams.width * i2) / i;
            marginLayoutParams.topMargin = (int) C9432q.m18687b((Context) this.f9066c, 96.0f);
            this.f9075k.setLayoutParams(marginLayoutParams);
            this.f9065b.mo8432a(i, i2);
        }
    }
}
