package com.bytedance.lobby.p778b;

import android.os.Bundle;

/* renamed from: com.bytedance.lobby.b.a */
public final class C12323a {

    /* renamed from: a */
    private Bundle f32485a;

    /* renamed from: a */
    public final Bundle mo23323a() {
        return m24799b();
    }

    /* renamed from: b */
    private synchronized Bundle m24799b() {
        if (this.f32485a == null) {
            this.f32485a = new Bundle();
        }
        return this.f32485a;
    }

    /* renamed from: a */
    public final C12323a mo23324a(String str, String str2) {
        m24799b().putString(str, str2);
        return this;
    }
}
