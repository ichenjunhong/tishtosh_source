package com.bytedance.common.wschannel.p527a;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.wschannel.C9503d;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p527a.C9443b.C9444a;
import com.bytedance.common.wschannel.server.C9531a;

/* renamed from: com.bytedance.common.wschannel.a.c */
public final class C9445c implements C9443b {
    /* renamed from: a */
    public final void mo17093a(Context context) {
        m18731b(context, 1);
    }

    /* renamed from: b */
    public final void mo17097b(Context context) {
        m18731b(context, 2);
    }

    /* renamed from: a */
    public final void mo17094a(Context context, int i) {
        C9444a aVar = new C9444a();
        aVar.f25719a = "ws_app";
        aVar.f25720b = new IntegerParcelable(i);
        aVar.f25721c = 1;
        m18730a(context, aVar);
    }

    /* renamed from: a */
    private static void m18730a(Context context, C9444a aVar) {
        if (C9503d.m18870a(context).mo17230a()) {
            Message obtain = Message.obtain();
            obtain.what = aVar.f25721c;
            obtain.getData().putParcelable(aVar.f25719a, aVar.f25720b);
            C9531a.m18918a(context).handleMsg(obtain);
        }
    }

    /* renamed from: b */
    private static void m18731b(Context context, int i) {
        if (context != null && i > 0 && i <= 3 && C9503d.m18870a(context).mo17230a()) {
            Message message = new Message();
            message.what = 2;
            message.arg1 = i;
            C9531a.m18918a(context).handleMsg(message);
        }
    }

    /* renamed from: a */
    public final void mo17095a(Context context, SsWsApp ssWsApp) {
        C9444a aVar = new C9444a();
        aVar.f25719a = "ws_app";
        aVar.f25720b = ssWsApp;
        aVar.f25721c = 0;
        m18730a(context, aVar);
    }

    /* renamed from: a */
    public final void mo17096a(Context context, WsChannelMsg wsChannelMsg) {
        C9444a aVar = new C9444a();
        aVar.f25719a = "payload";
        aVar.f25720b = wsChannelMsg;
        aVar.f25721c = 5;
        m18730a(context, aVar);
    }
}
