package com.bytedance.lobby.facebook;

import android.app.Application;
import com.bytedance.lobby.C12311a;
import com.bytedance.lobby.C12324c;
import com.bytedance.lobby.internal.BaseProvider;
import com.facebook.C14457k;
import com.facebook.C14533n;

class FacebookProvider<T> extends BaseProvider<T> {

    /* renamed from: c */
    private Application f32498c;

    /* renamed from: d */
    public final void mo23331d() {
        if (!C14533n.m29764a()) {
            C14533n.m29762a(this.f32525b.f32488c);
            try {
                C14533n.m29760a(this.f32498c.getApplicationContext());
            } catch (C14457k e) {
                if (C12311a.f32450a) {
                    throw e;
                }
            }
        }
    }

    FacebookProvider(Application application, C12324c cVar) {
        super(application, cVar);
        this.f32498c = application;
    }
}
