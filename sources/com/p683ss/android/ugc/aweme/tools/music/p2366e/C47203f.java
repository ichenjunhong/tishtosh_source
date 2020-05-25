package com.p683ss.android.ugc.aweme.tools.music.p2366e;

import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.ttuploader.TTImageUploader;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.f */
public final class C47203f {

    /* renamed from: a */
    public static final C47203f f119159a = new C47203f();

    private C47203f() {
    }

    /* renamed from: a */
    public static final TTImageUploader m102461a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService().mo80678a("ttvideouploader");
        try {
            return new TTImageUploader();
        } catch (Throwable unused) {
            return null;
        }
    }
}
