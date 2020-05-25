package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.ab */
public class C33392ab implements Runnable {

    /* renamed from: f */
    public String f86585f;

    /* renamed from: g */
    public Map<String, C33392ab> f86586g;

    public void run() {
    }

    /* renamed from: b */
    public final void mo70776b() {
        if (this.f86586g != null && TextUtils.isEmpty(this.f86585f)) {
            this.f86586g.remove(this.f86585f);
        }
    }
}
