package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7866cg;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cc */
public final class C5852cc extends C5868cl<C5853a> implements OnMessageListener {

    /* renamed from: a */
    private Queue<C7866cg> f15320a;

    /* renamed from: b */
    private long f15321b;

    /* renamed from: c */
    private boolean f15322c;

    /* renamed from: d */
    private long f15323d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cc$a */
    public interface C5853a extends C6463ay {
        /* renamed from: a */
        void mo11723a(C7866cg cgVar);

        /* renamed from: a */
        boolean mo11724a();
    }

    /* renamed from: a */
    public final void mo8247a() {
        if (this.f15320a != null) {
            this.f15320a.clear();
        }
        super.mo8247a();
    }

    /* renamed from: b */
    public final void mo11722b() {
        if (mo8518c() != null && !((C5853a) mo8518c()).mo11724a()) {
            C7866cg cgVar = (C7866cg) this.f15320a.poll();
            if (cgVar != null) {
                ((C5853a) mo8518c()).mo11723a(cgVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5853a aVar) {
        super.mo8520a(aVar);
        this.f15322c = ((Boolean) this.f15366s.get("data_is_anchor")).booleanValue();
        this.f15321b = ((Long) this.f15366s.get("data_room_id")).longValue();
        if (this.f15366s.get("data_room") instanceof Room) {
            this.f15323d = ((Room) this.f15366s.get("data_room")).getOwnerUserId();
        }
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.ROOM_PUSH.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C7866cg) {
            C7866cg cgVar = (C7866cg) iMessage;
            if (cgVar.baseMessage != null && cgVar.baseMessage.f24132c == this.f15321b) {
                if (this.f15320a == null) {
                    this.f15320a = new ArrayDeque();
                }
                if (!TextUtils.isEmpty(cgVar.f21772f) && cgVar.f21772f.equals("8") && (TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.mo9431a()) || this.f15322c)) {
                    return;
                }
                if (TextUtils.isEmpty(cgVar.f21772f) || !cgVar.f21772f.equals("10") || (!TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.mo9431a()) && !this.f15322c)) {
                    this.f15320a.offer(cgVar);
                    mo11722b();
                }
            }
        }
    }
}
