package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStartListener;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.controller.a */
public final class C18250a implements LoginStateController {

    /* renamed from: a */
    final WeakHashMap<OnLoginStartListener, Void> f50414a = new WeakHashMap<>();

    /* renamed from: b */
    public final Handler f50415b;

    /* renamed from: c */
    private final WeakHashMap<OnLoginStateChangedListener, Void> f50416c = new WeakHashMap<>();

    /* renamed from: b */
    public final void mo36406b() {
        this.f50415b.post(new Runnable() {
            public final void run() {
                for (OnLoginStateChangedListener onLoginFailed : C18250a.m44469a(C18250a.this)) {
                    onLoginFailed.onLoginFailed();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo36405a() {
        this.f50415b.post(new Runnable() {
            public final void run() {
                for (OnLoginStateChangedListener onLogout : C18250a.m44469a(C18250a.this)) {
                    onLogout.onLogout();
                }
            }
        });
    }

    public final void addOnLoginStartListener(OnLoginStartListener onLoginStartListener) {
        this.f50414a.put(onLoginStartListener, null);
    }

    public final void addOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f50416c.put(onLoginStateChangedListener, null);
    }

    public final void removeOnLoginStartListener(OnLoginStartListener onLoginStartListener) {
        this.f50414a.remove(onLoginStartListener);
    }

    public final void removeOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f50416c.remove(onLoginStateChangedListener);
    }

    /* renamed from: a */
    static /* synthetic */ Collection m44469a(C18250a aVar) {
        return new ArrayList(aVar.f50416c.keySet());
    }

    C18250a(Handler handler) {
        this.f50415b = handler;
    }
}
