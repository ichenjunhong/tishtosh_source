package com.bytedance.android.livesdk.chatroom.event;

import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.panel.widget.C7595ao;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.az */
public class C5180az {

    /* renamed from: a */
    public User f13873a;

    /* renamed from: b */
    public Bundle f13874b;

    /* renamed from: c */
    public C7595ao f13875c;

    /* renamed from: d */
    public long f13876d;

    /* renamed from: e */
    private boolean f13877e;

    public C5180az() {
        this.f13877e = true;
        this.f13875c = C7595ao.GIFT;
    }

    public C5180az(C7595ao aoVar) {
        this.f13877e = true;
        this.f13875c = aoVar;
    }

    public C5180az(C7595ao aoVar, boolean z) {
        this(aoVar);
        this.f13877e = z;
    }
}
