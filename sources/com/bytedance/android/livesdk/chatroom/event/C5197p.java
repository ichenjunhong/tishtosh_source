package com.bytedance.android.livesdk.chatroom.event;

import android.os.Bundle;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.p */
public class C5197p {

    /* renamed from: a */
    public long f13908a;

    /* renamed from: b */
    public String f13909b;

    /* renamed from: c */
    public Bundle f13910c;

    /* renamed from: d */
    public boolean f13911d;

    public C5197p(long j) {
        this.f13908a = j;
    }

    public C5197p(long j, Bundle bundle, boolean z) {
        this.f13908a = j;
        this.f13910c = bundle;
        this.f13911d = true;
    }

    public C5197p(long j, String str, Bundle bundle) {
        this.f13908a = j;
        this.f13909b = str;
        this.f13910c = bundle;
    }
}
