package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.live.broadcast.p198b.C3061a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b */
public abstract class C3106b {

    /* renamed from: a */
    protected final Room f9064a;

    /* renamed from: b */
    public final C3133n f9065b;

    /* renamed from: c */
    public final Activity f9066c;

    /* renamed from: d */
    public C3061a f9067d;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b$a */
    class C3108a implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C3108a() {
        }

        public final void onClick(View view) {
            long j;
            if (C3106b.this.f9067d == null) {
                C3106b.this.f9067d = new C3061a(C3106b.this.f9066c);
            }
            if (!C3106b.this.f9067d.isShowing()) {
                C3106b.this.f9067d.show();
            }
            Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
            if (currentRoom != null) {
                j = currentRoom.getId();
            } else {
                j = -1;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_function");
            hashMap.put("event_type", "show");
            hashMap.put("event_page", "live_take_detail");
            if (j != -1) {
                hashMap.put("room_id", String.valueOf(j));
            }
            C8049c.m15979a().mo14202a("auto_reply_show", hashMap, new Object[0]);
        }
    }

    /* renamed from: b */
    public abstract void mo8393b();

    /* renamed from: c */
    public abstract void mo8394c();

    /* renamed from: e */
    public abstract void mo8396e();

    /* renamed from: f */
    public abstract void mo8397f();

    /* renamed from: g */
    public abstract boolean mo8398g();

    /* renamed from: h */
    public abstract boolean mo8399h();

    /* renamed from: i */
    public void mo8400i() {
    }

    public abstract void onEvent(C5204w wVar);

    /* renamed from: a */
    public void mo8392a() {
        C6610k.m13986b().mo12668a(C6605h.AUTO_REPLY, (C6601a) new C3108a());
    }

    /* renamed from: d */
    public void mo8395d() {
        if (this.f9067d != null) {
            this.f9067d.dismiss();
        }
    }

    public C3106b(Room room, C3133n nVar) {
        this.f9064a = room;
        this.f9065b = nVar;
        if (nVar != null) {
            this.f9066c = nVar.mo8453m();
        } else {
            this.f9066c = null;
        }
    }
}
