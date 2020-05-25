package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout.C6622a;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public class CommonToastWidget extends LiveWidget {

    /* renamed from: a */
    public C6622a f16861a = C6596t.f17935a;

    /* renamed from: a */
    public static String m13449a(String str) {
        if (str.length() != 9) {
            return str;
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append(str.substring(7, 9));
        sb.append(str.substring(1, 7));
        return sb.toString();
    }
}
