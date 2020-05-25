package com.bytedance.android.live.broadcast;

import android.content.Context;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.p683ss.avframework.utils.EarlyAVLog;
import com.p683ss.avframework.utils.LibraryLoader;
import com.p683ss.avframework.utils.LibraryLoader.Loader;
import java.util.Arrays;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.live.broadcast.a */
public class C3023a {

    /* renamed from: b */
    public static final String[] f8902b = {"lens", "ttquic", "avframework", "ies_render", "agora-rtc-sdk-jni", "zegoliveroom", "bytertc"};

    /* renamed from: c */
    private static C3023a f8903c;

    /* renamed from: e */
    private static final String[] f8904e = {"c++_shared", "yuv", "ttffmpeg", "audioeffect", "effect"};

    /* renamed from: a */
    public Context f8905a = C3922z.m9915e();

    /* renamed from: d */
    private boolean f8906d;

    private C3023a() {
    }

    /* renamed from: c */
    public static C2201v<Integer> m8462c() {
        return C2201v.m6614b(Integer.valueOf(1));
    }

    /* renamed from: a */
    public static C3023a m8461a() {
        if (f8903c == null) {
            synchronized (C3023a.class) {
                if (f8903c == null) {
                    f8903c = new C3023a();
                }
            }
        }
        return f8903c;
    }

    /* renamed from: b */
    public final void mo8215b() {
        try {
            C3831a.m9716d("LiveBroadcastContext", "LibraryLoader.setupLibraryLoader");
            LibraryLoader.setupLibraryLoader(new Loader() {
                public final void loadLibraryFromPath(String str) throws Exception {
                }

                public final void loadLibrary(String str) throws Exception {
                    StringBuilder sb = new StringBuilder("start sdk load library name:");
                    sb.append(str);
                    C3831a.m9716d("LiveBroadcastContext", sb.toString());
                    if (Arrays.asList(C3023a.f8902b).contains(str)) {
                        ((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).loadLibrary(0, C3023a.this.f8905a, C8828a.LiveResource.getPackageName(), str, null);
                    } else {
                        ((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).loadLibrary(2, C3023a.this.f8905a, "", str, null);
                    }
                }
            });
            C3831a.m9716d("LiveBroadcastContext", "EarlyAVLog.setEarlyLogPrint");
            EarlyAVLog.setEarlyLogPrint(C3060b.f8938a);
        } catch (Throwable th) {
            C3831a.m9714b("LiveBroadcastContext", th);
        }
        if (!this.f8906d) {
            C8828a.LiveResource.preload();
            m8463d();
            m8462c();
            try {
                C8828a.LiveResource.load(this.f8905a, false);
            } catch (Throwable unused) {
            }
            this.f8906d = true;
        }
    }

    /* renamed from: d */
    private void m8463d() {
        C3617q.INST.loadResources();
        String[] strArr = {"yuv", "NailSLAM_jni", "ttffmpeg", "c++_shared", "audioeffect", "effect", "avframework", "ies_render", "zegoliveroom", "agora-rtc-sdk-jni"};
        IHostPlugin iHostPlugin = (IHostPlugin) C4116c.m10249a(IHostPlugin.class);
        for (int i = 0; i < 10; i++) {
            String str = "LiveBroadcastContext";
            try {
                StringBuilder sb = new StringBuilder("start load library:");
                sb.append(strArr[i]);
                C3831a.m9716d(str, sb.toString());
                String hostPackageName = iHostPlugin.getHostPackageName();
                iHostPlugin.loadLibrary(2, this.f8905a, hostPackageName, strArr[i], getClass().getClassLoader());
            } catch (Throwable unused) {
            }
        }
    }
}
