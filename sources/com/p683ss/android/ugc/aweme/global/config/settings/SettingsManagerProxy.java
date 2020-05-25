package com.p683ss.android.ugc.aweme.global.config.settings;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h.C32817a;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy */
public final class SettingsManagerProxy implements C32817a {
    public static final int SETTING_REQUEST_FROM_TYPE_APP = 1;
    public static final int SETTING_REQUEST_FROM_TYPE_LANGUAGE = 2;
    public static final int SETTING_REQUEST_FROM_TYPE_LOGIN = 3;
    public static final int SETTING_REQUEST_FROM_TYPE_LOGOUT = 4;
    private final C32813e settingManager;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy$a */
    static final class C32805a {

        /* renamed from: a */
        public static final SettingsManagerProxy f85408a = new SettingsManagerProxy();
    }

    public static SettingsManagerProxy inst() {
        return C32805a.f85408a;
    }

    public final IESSettingsProxy get() {
        return this.settingManager.f85419c;
    }

    public final IESSettings getDefaultSettings() {
        return this.settingManager.f85420d;
    }

    public final C17971f getGson() {
        return this.settingManager.f85421e;
    }

    private SettingsManagerProxy() {
        Application application = (Application) C11010c.m22280a();
        if (application != null) {
            this.settingManager = new C32813e(application);
            return;
        }
        throw new NullPointerException("context is null!");
    }

    public final void registerSettingsWatcher(C32811d dVar) {
        this.settingManager.mo66391a(dVar, true);
    }

    public final void setCanMock(boolean z) {
        this.settingManager.mo66394a(z);
    }

    public final void removeSettingsWatcher(C32811d dVar) {
        C32813e eVar = this.settingManager;
        synchronized (eVar.f85417a) {
            eVar.f85418b.remove(dVar);
        }
    }

    public final void registerSettingsWatcher(C32811d dVar, boolean z) {
        this.settingManager.mo66391a(dVar, z);
    }

    /* access modifiers changed from: 0000 */
    public final <T> void setMock(String str, Class<T> cls, T t) {
        this.settingManager.mo66393a(str, cls, t);
    }

    public final void notifySettingsChange(Throwable th, IESSettings iESSettings, String str) {
        C32813e eVar = this.settingManager;
        if (th != null) {
            SettingsUtil.m75695a(th);
        }
        if (!TextUtils.isEmpty(str)) {
            C0013i.m16a((Callable<TResult>) new C32819j<TResult>(str, th, "SettingsManager", iESSettings));
        }
        eVar.mo66392a(iESSettings);
    }
}
