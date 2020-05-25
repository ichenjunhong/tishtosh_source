package com.bytedance.android.livesdk.chatroom.p305b;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.message.model.C7835bj;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.message.model.C8016y;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.a */
public final class C4997a implements OnMessageListener {

    /* renamed from: a */
    public final Set<C4999a> f13391a = new HashSet();

    /* renamed from: b */
    private long f13392b;

    /* renamed from: c */
    private long f13393c;

    /* renamed from: d */
    private long f13394d;

    /* renamed from: e */
    private long f13395e;

    /* renamed from: f */
    private long f13396f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.b.a$a */
    public interface C4999a {
        /* renamed from: a */
        void mo10877a(C8629a aVar, long j);
    }

    public C4997a() {
        IMessageManager a = C4565af.m10958a();
        a.addMessageListener(C8629a.GIFT.getIntType(), this);
        a.addMessageListener(C8629a.CHAT.getIntType(), this);
        a.addMessageListener(C8629a.DIGG.getIntType(), this);
        a.addMessageListener(C8629a.MEMBER.getIntType(), this);
    }

    /* renamed from: a */
    public static boolean m11487a() {
        if (TTLiveSDKContext.getHostService() == null || TTLiveSDKContext.getHostService().mo10309b() == null || TTLiveSDKContext.getHostService().mo10309b().mo15488a() == null) {
            return false;
        }
        TTLiveSDKContext.getHostService().mo10309b();
        return false;
    }

    /* renamed from: b */
    private boolean m11488b(long j) {
        if (j == this.f13392b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10876a(long j) {
        this.f13392b = j;
        this.f13393c = 0;
        this.f13394d = 0;
        this.f13395e = 0;
        this.f13396f = 0;
        m11486a(C8629a.GIFT, this.f13393c);
        m11486a(C8629a.CHAT, this.f13394d);
        m11486a(C8629a.DIGG, this.f13395e);
        m11486a(C8629a.MEMBER, this.f13396f);
    }

    public final void onMessage(IMessage iMessage) {
        if (m11487a()) {
            C7859c cVar = (C7859c) iMessage;
            switch (cVar.getMessageType()) {
                case GIFT:
                    if (m11488b(((C7810ao) iMessage).f21492a.getId())) {
                        this.f13393c++;
                        m11486a(C8629a.GIFT, this.f13393c);
                        return;
                    }
                    break;
                case DIGG:
                    User user = ((C8016y) iMessage).f21942d;
                    if (user != null && m11488b(user.getId())) {
                        this.f13395e++;
                        m11486a(C8629a.DIGG, this.f13395e);
                        return;
                    }
                case CHAT:
                    if (m11488b(((C8001m) iMessage).f21870c.getId())) {
                        this.f13394d++;
                        m11486a(C8629a.CHAT, this.f13394d);
                        return;
                    }
                    break;
                case MEMBER:
                    User user2 = ((C7835bj) iMessage).f21634b;
                    if (user2 != null && m11488b(user2.getId())) {
                        this.f13396f++;
                        m11486a(C8629a.MEMBER, this.f13396f);
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    private void m11486a(C8629a aVar, long j) {
        for (C4999a a : this.f13391a) {
            a.mo10877a(aVar, j);
        }
    }
}
