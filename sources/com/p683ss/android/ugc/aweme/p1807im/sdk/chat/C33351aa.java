package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.aa */
public final class C33351aa extends Handler {

    /* renamed from: a */
    WeakReference<C33352a> f86486a;

    /* renamed from: b */
    private volatile int f86487b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.aa$a */
    public interface C33352a {
        /* renamed from: a */
        void mo70692a();

        /* renamed from: a */
        void mo70695a(Object obj, int i);

        /* renamed from: c */
        void mo70698c();
    }

    public C33351aa(C33352a aVar) {
        this.f86486a = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        C33352a aVar = (C33352a) this.f86486a.get();
        if (!(aVar == null || message == null)) {
            Object obj = message.obj;
            switch (message.what) {
                case 1:
                    aVar.mo70692a();
                    if (this.f86487b != 0) {
                        this.f86487b = 0;
                        removeMessages(1);
                        return;
                    }
                    break;
                case 2:
                    if (this.f86487b == 0) {
                        sendEmptyMessageDelayed(1, 300);
                    }
                    this.f86487b++;
                    return;
                case 3:
                    aVar.mo70698c();
                    return;
                case 4:
                    if (obj != null) {
                        aVar.mo70695a(obj, 0);
                        return;
                    }
                    break;
                case 5:
                    if (obj != null) {
                        aVar.mo70695a(obj, 1);
                        return;
                    }
                    break;
                case 6:
                    if (obj != null) {
                        aVar.mo70695a(obj, 2);
                        return;
                    }
                    break;
                case 7:
                    if (obj != null) {
                        aVar.mo70695a(obj, 3);
                        break;
                    }
                    break;
            }
        }
    }
}
