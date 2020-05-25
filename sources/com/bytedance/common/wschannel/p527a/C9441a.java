package com.bytedance.common.wschannel.p527a;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.C9446a;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p529c.C9457a;
import com.bytedance.common.wschannel.p529c.C9458b;
import com.bytedance.common.wschannel.p529c.C9459c;
import java.util.ArrayList;

/* renamed from: com.bytedance.common.wschannel.a.a */
public final class C9441a {

    /* renamed from: a */
    private final C9442a f25718a;

    /* renamed from: com.bytedance.common.wschannel.a.a$a */
    public interface C9442a {
        /* renamed from: a */
        void mo17092a(WsChannelMsg wsChannelMsg);
    }

    public C9441a(C9442a aVar) {
        this.f25718a = aVar;
    }

    /* renamed from: a */
    private void m18722a(Message message) {
        try {
            message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
            if (message.what == 40) {
                Parcelable parcelable = message.getData().getParcelable("payload");
                if (parcelable instanceof WsChannelMsg) {
                    this.f25718a.mo17092a((WsChannelMsg) parcelable);
                }
                return;
            }
            if (message.what == 41) {
                message.getData().getString("payload_md5");
                message.getData().getBoolean("send_result");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo17091a(Intent intent) {
        try {
            String action = intent.getAction();
            if ("com.bytedance.article.wschannel.receive.connection".equals(action)) {
                intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                SocketState socketState = (SocketState) intent.getParcelableExtra("connection");
                C9459c a = m18721a(socketState.f25922d, socketState.f25920b);
                C9446a listener = WsConstants.getListener(socketState.f25922d);
                if (listener != null) {
                    listener.mo17111a(new C9458b(a, C9457a.m18765of(socketState.f25923e), socketState.f25922d), socketState.mo17273a());
                }
            } else {
                if ("com.bytedance.article.wschannel.syncconnectstate".equals(action)) {
                    intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                    ArrayList<SocketState> parcelableArrayListExtra = intent.getParcelableArrayListExtra("connection");
                    if (parcelableArrayListExtra != null) {
                        for (SocketState socketState2 : parcelableArrayListExtra) {
                            if (socketState2 != null) {
                                m18721a(socketState2.f25922d, socketState2.f25920b);
                            }
                        }
                    }
                } else {
                    intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
                    if ("com.bytedance.article.wschannel.receive.payload".equals(action)) {
                        WsChannelMsg wsChannelMsg = (WsChannelMsg) intent.getParcelableExtra("payload");
                        Message message = new Message();
                        message.what = 40;
                        message.getData().putParcelable("payload", wsChannelMsg);
                        m18722a(message);
                    } else if ("com.bytedance.article.wschannel.send.payload".equals(action)) {
                        String stringExtra = intent.getStringExtra("payload_md5");
                        boolean booleanExtra = intent.getBooleanExtra("send_result", true);
                        Message message2 = new Message();
                        message2.what = 41;
                        message2.getData().putString("payload_md5", stringExtra);
                        message2.getData().putBoolean("send_result", booleanExtra);
                        m18722a(message2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static C9459c m18721a(int i, int i2) {
        C9459c cVar = C9459c.CONNECTION_UNKNOWN;
        if (i2 == 0) {
            cVar = C9459c.CONNECTION_UNKNOWN;
        } else if (i2 == 1) {
            cVar = C9459c.CONNECTING;
        } else if (i2 == 2) {
            cVar = C9459c.CONNECT_FAILED;
        } else if (i2 == 3) {
            cVar = C9459c.CONNECT_CLOSED;
        } else if (i2 == 4) {
            cVar = C9459c.CONNECTED;
        }
        WsConstants.setConnectionState(i, cVar);
        return cVar;
    }
}
