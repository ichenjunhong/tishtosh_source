package com.bytedance.android.livesdk.honor;

import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7819ax;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;

/* renamed from: com.bytedance.android.livesdk.honor.a */
public final class C7659a extends C5868cl<C7660a> implements OnMessageListener {

    /* renamed from: a */
    private LinkedList<C7819ax> f21093a = new LinkedList<>();

    /* renamed from: b */
    private C7819ax f21094b;

    /* renamed from: com.bytedance.android.livesdk.honor.a$a */
    public interface C7660a extends C6463ay {
        /* renamed from: a */
        void mo14021a(C7819ax axVar);
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
    }

    /* renamed from: b */
    public final void mo14023b() {
        if (this.f21093a.isEmpty()) {
            return;
        }
        if (this.f21094b == null || !this.f21094b.f21528d) {
            this.f21094b = (C7819ax) this.f21093a.poll();
            if (this.f21094b != null) {
                this.f21094b.f21528d = true;
                if (mo8518c() != null) {
                    ((C7660a) mo8518c()).mo14021a(this.f21094b);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8520a(C7660a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.HONOR_LEVEL_UP.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && iMessage.getIntType() == C8629a.HONOR_LEVEL_UP.getIntType()) {
            this.f21093a.offer((C7819ax) iMessage);
            mo14023b();
        }
    }
}
