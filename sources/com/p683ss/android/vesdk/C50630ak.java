package com.p683ss.android.vesdk;

import android.content.Context;
import android.os.Build.VERSION;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.medialib.VideoSdkCore;
import com.p683ss.android.ttve.editorInfo.C20084a;
import com.p683ss.android.ttve.editorInfo.TEEditorInfoInvoker;
import com.p683ss.android.ttve.log.C20085a;
import com.p683ss.android.ttve.log.TELog2ClientInvoker;
import com.p683ss.android.ttve.monitor.ApplogUtilsInvoker;
import com.p683ss.android.ttve.monitor.C20102a;
import com.p683ss.android.ttve.monitor.C20108d;
import com.p683ss.android.ttve.monitor.C20110e;
import com.p683ss.android.ttve.monitor.C20112f;
import com.p683ss.android.ttve.monitor.C20112f.C20113a;
import com.p683ss.android.ttve.monitor.C20114g;
import com.p683ss.android.ttve.monitor.TEMonitorInvoker;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.ttve.nativePort.TEEffectUtils;
import com.p683ss.android.vesdk.C50712l.C50716c;
import com.p683ss.android.vesdk.VEListener.C50538b;
import com.p683ss.android.vesdk.VEListener.C50551o;
import com.p683ss.android.vesdk.VEListener.C50556t;
import com.p683ss.android.vesdk.runtime.C50761a;
import com.p683ss.android.vesdk.runtime.C50766c;
import com.p683ss.android.vesdk.runtime.C50772e;
import com.p683ss.android.vesdk.runtime.VEEffectConfig;
import com.p683ss.android.vesdk.runtime.VERuntime;
import com.p683ss.android.vesdk.runtime.p2536a.C50762a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.ak */
public final class C50630ak {

    /* renamed from: a */
    public static int f126915a = C20114g.f55317a;

    /* renamed from: a */
    public static void m109154a() {
        C20114g.m49642a();
    }

    /* renamed from: a */
    public static void m109165a(boolean z, int i) throws C50751p {
        int i2;
        VERuntime a = VERuntime.m109853a();
        if (!a.f127482j) {
            C50792y.m109914d("VERuntime", "runtime not init");
            i2 = -108;
        } else {
            if (i <= 720) {
                i = 730;
            }
            a.nativeEnableHDH264HWDecoder(z, i);
            i2 = 0;
        }
        if (i2 == -108) {
            throw new C50751p(i2, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: a */
    public static void m109166a(boolean z, int i, int i2) throws C50751p {
        int i3;
        VERuntime a = VERuntime.m109853a();
        if (!a.f127482j) {
            C50792y.m109914d("VERuntime", "runtime not init");
            i3 = -108;
        } else {
            a.nativeEnableHighFpsH264HWDecoder(z, 40, 1070);
            i3 = 0;
        }
        if (i3 == -108) {
            throw new C50751p(i3, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: b */
    public static String m109168b() {
        return TEEffectUtils.getEffectVersion();
    }

    /* renamed from: b */
    public static void m109169b(boolean z) {
        C20110e.f55311e = z;
    }

    /* renamed from: g */
    public static void m109174g(boolean z) {
        VEEffectConfig.setUseNewEffectAlgorithmApi(z);
    }

    /* renamed from: a */
    public static void m109155a(int i) {
        C20110e.m49636a(i);
    }

    /* renamed from: f */
    public static void m109173f(boolean z) {
        VideoSdkCore.setABbUseBuildinAmazing(z);
        VEEffectConfig.setABbUseBuildinAmazing(z);
    }

    /* renamed from: a */
    public static void m109157a(C2592c cVar) {
        VERuntime.m109853a().mo99439a(cVar);
    }

    /* renamed from: a */
    public static void m109158a(C50538b bVar) {
        VERuntime a = VERuntime.m109853a();
        a.f127484l = new WeakReference<>(bVar);
        C20102a.m49611a(a.f127487o);
    }

    /* renamed from: d */
    public static void m109171d(boolean z) {
        int i;
        if (VERuntime.m109853a().f127477e == null) {
            i = -108;
        } else {
            VEEffectConfig.setEnableStickerAmazing(z);
            i = 0;
        }
        if (i == -108) {
            throw new C50751p(i, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: e */
    public static void m109172e(boolean z) {
        int i;
        if (VERuntime.m109853a().f127477e == null) {
            i = -108;
        } else {
            VEEffectConfig.setEffectAsynAPI(z);
            i = 0;
        }
        if (i == -108) {
            throw new C50751p(i, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: a */
    public static void m109159a(C50551o oVar) {
        WeakReference<C20113a> weakReference;
        VERuntime a = VERuntime.m109853a();
        a.f127485m = new WeakReference<>(oVar);
        C20113a aVar = a.f127488p;
        if (aVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(aVar);
        }
        C20112f.f55316a = weakReference;
    }

    /* renamed from: b */
    public static int m109167b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                try {
                    C50629aj.f126914f.put(str2, Long.valueOf(jSONObject.getLong(str2)));
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
        return 0;
    }

    /* renamed from: c */
    public static void m109170c(boolean z) throws C50751p {
        int i;
        VERuntime a = VERuntime.m109853a();
        if (!a.f127482j) {
            C50792y.m109914d("VERuntime", "runtime not init");
            i = -108;
        } else {
            a.nativeEnableTT265Decoder(z);
            i = 0;
        }
        if (i == -108) {
            throw new C50751p(i, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: a */
    public static void m109160a(C50556t tVar) {
        VERuntime a = VERuntime.m109853a();
        a.f127483k = new WeakReference<>(tVar);
        C20114g.f55319c = new WeakReference<>(a.f127486n);
    }

    /* renamed from: a */
    public static void m109161a(C50702h hVar) {
        C20110e.m49639a("user_id", hVar.f127240b);
        C20110e.m49639a("device_id", hVar.f127241c);
        C50762a.m109863a().mo99450a("KEY_DEVICEID", hVar.f127241c, true);
        C20110e.m49639a("app_version", hVar.f127239a);
    }

    /* renamed from: a */
    public static void m109162a(C50791x xVar) {
        C20085a.f55217a = xVar;
        TELog2ClientInvoker.nativeInit();
        TELog2ClientInvoker.nativeSetLog2ClientSwitch(true);
    }

    /* renamed from: a */
    public static void m109163a(String str) {
        VideoSdkCore.setAmazingShareDir(str);
        VEEffectConfig.setShareDir(str);
    }

    /* renamed from: a */
    public static void m109164a(boolean z) {
        VERuntime.m109853a().f127481i = true;
    }

    /* renamed from: a */
    public static void m109156a(Context context, String str) {
        VERuntime a = VERuntime.m109853a();
        boolean z = true;
        if (!a.f127482j) {
            a.f127482j = true;
            a.f127473a = context;
            C20129b.m49680a(context);
            a.f127477e = new C50766c();
            a.f127477e.f127520a = str;
            a.f127480h = new C50701g();
            a.f127476d = new C50772e();
            a.f127489q = C50762a.m109863a();
            a.f127489q.mo99448a(context);
            Context context2 = a.f127473a;
            String str2 = (String) a.f127489q.mo99451b("KEY_DEVICEID", "");
            TEMonitorInvoker.nativeInit();
            Context applicationContext = context2.getApplicationContext();
            if (C20110e.f55307a) {
                C20110e.m49636a(1);
                if (!C20110e.f55311e) {
                    C20108d.m49629a(applicationContext, str2, null, null);
                    C20110e.f55309c = true;
                } else if (!C20110e.f55309c && C20110e.f55308b == null) {
                    Thread thread = new Thread(new Runnable(applicationContext, str2, null, null) {

                        /* renamed from: a */
                        final /* synthetic */ Context f55312a;

                        /* renamed from: b */
                        final /* synthetic */ String f55313b;

                        /* renamed from: c */
                        final /* synthetic */ String f55314c;

                        /* renamed from: d */
                        final /* synthetic */ String f55315d;

                        public final void run() {
                            synchronized (C20110e.f55310d) {
                                C20108d.m49629a(this.f55312a, this.f55313b, this.f55314c, this.f55315d);
                                C20110e.f55309c = true;
                                C20110e.f55310d.notifyAll();
                            }
                        }

                        {
                            this.f55312a = r1;
                            this.f55313b = r2;
                            this.f55314c = r3;
                            this.f55315d = r4;
                        }
                    });
                    C20110e.f55308b = thread;
                    thread.start();
                }
            }
            ApplogUtilsInvoker.nativeInit();
            TEEditorInfoInvoker.nativeInit();
            C20084a.f55215a = new ConcurrentHashMap<>();
            VideoSdkCore.init(context);
            a.mo99440b();
        }
        C50761a.m109859a().mo99447a(str);
        C50712l.m109659a().mo99232c();
        C50716c a2 = C50712l.m109659a().mo99229a("use_open_gl_three");
        if (!(a2 == null || a2.f127275b == null || !(a2.f127275b instanceof Integer))) {
            if (1 != ((Integer) a2.f127275b).intValue()) {
                z = false;
            }
            if (VERSION.SDK_INT >= 18) {
                VERuntime.m109853a().f127478f = z;
                C50659d.m109321a(z);
            } else {
                VERuntime.m109853a().f127478f = false;
                C50659d.m109321a(false);
            }
        }
        C50716c a3 = C50712l.m109659a().mo99229a("aeabtest_v2api");
        if (a3 != null && a3.f127275b != null && (a3.f127275b instanceof Boolean)) {
            VERuntime.nativeEnableAudioSDKApiV2(((Boolean) a3.f127275b).booleanValue());
        }
    }
}
