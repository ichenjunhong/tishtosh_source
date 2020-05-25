package com.bytedance.android.livesdk;

import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.network.p251a.C4149a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.init.SDKServiceInitTask;
import com.bytedance.android.livesdk.p270ab.C4502c;
import com.bytedance.android.livesdk.p270ab.C4504e;
import com.bytedance.android.livesdk.p392l.C7736c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.service.C8861d;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.bytedance.android.p173d.p176b.C2909b;
import com.bytedance.android.p173d.p176b.C2912d;
import com.bytedance.android.p173d.p176b.C2918h;
import com.bytedance.android.p173d.p176b.C2930i;
import com.bytedance.android.p173d.p176b.C2930i.C2932a;
import com.bytedance.android.p173d.p176b.C2930i.C2934b;
import com.bytedance.android.p173d.p176b.C2930i.C2934b.C2935a;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;

public class TTLiveSDKContext {
    private static C4504e sHostServiceWrapper;
    private static final ConcurrentHashMap<Class, Object> sServices = new ConcurrentHashMap<>();

    public static C4504e getHostService() {
        return sHostServiceWrapper;
    }

    public static void delayInit() {
        C7736c.m15763a().mo14083b();
    }

    public static String getLiveHostDomain() {
        return ((IHostNetwork) C4116c.m10249a(IHostNetwork.class)).getHostDomain();
    }

    public static C8862e getLiveService() {
        return (C8862e) getServiceInternal(C8862e.class);
    }

    public static void initGiftResource() {
        getLiveService().mo15038a(getHostService().mo10308a().context());
        C2201v.m6601a(C4547ae.f12499a).mo6514a(C1667a.m5940a()).mo6529b(C2168a.m6521b()).mo6551j();
    }

    public static void setHostServiceWrapper(C4504e eVar) {
        sHostServiceWrapper = eVar;
    }

    static <T> T getService(Class<T> cls) {
        return sServices.get(cls);
    }

    private static <T> T getServiceInternal(Class<T> cls) {
        return sServices.get(cls);
    }

    private static boolean isDebug(C8861d dVar) {
        if (dVar == null || !dVar.mo13039a().isLocalTest()) {
            return false;
        }
        return true;
    }

    public static boolean initialize(C8861d dVar) {
        boolean z;
        sHostServiceWrapper = new C4502c(dVar);
        C2934b bVar = new C2934b();
        StringBuilder sb = new StringBuilder();
        sb.append(getHostService().mo10308a().context().getFilesDir().getPath());
        sb.append(File.separator);
        sb.append("live_kv");
        bVar.f8630a = sb.toString();
        bVar.f8634e = false;
        bVar.f8635f = new C2935a() {
            /* renamed from: a */
            public final void mo7544a(int i, String str) {
                m10785b(i, str);
            }

            /* renamed from: b */
            private static void m10785b(int i, String str) {
                switch (i) {
                    case 1:
                        C8064d.m16005b();
                        C8064d.m9719a("SuperKV", str);
                        return;
                    case 2:
                        C8064d.m16005b();
                        C8064d.m9722d("SuperKV", str);
                        return;
                    default:
                        C8064d.m16005b();
                        C8064d.m9721c("SuperKV", str);
                        return;
                }
            }

            /* renamed from: a */
            public final void mo7545a(int i, String str, Throwable th) {
                m10785b(3, str);
                C8064d.m16005b();
                C8064d.m9718a(6, th.getStackTrace());
            }
        };
        if (C2930i.f8625b) {
            C2909b.m8286a((Throwable) new IllegalStateException("SuperKV must not be initialized twice!"));
        }
        if (bVar.f8635f != null) {
            C2909b.f8587c = bVar.f8635f;
        }
        if (bVar.f8631b <= 0) {
            C2909b.m8286a((Throwable) new IllegalArgumentException("Cache capacity must > 128"));
        }
        if (bVar.f8632c <= 128) {
            C2909b.m8286a((Throwable) new IllegalArgumentException("Initial file size must > 128"));
        }
        File file = new File(bVar.f8630a);
        if (!file.exists()) {
            file.mkdir();
        }
        C2932a aVar = C2930i.f8624a;
        String str = bVar.f8630a;
        int i = bVar.f8631b;
        aVar.f8626a = str;
        aVar.f8627b = i;
        if (bVar.f8631b > 0) {
            z = true;
        } else {
            z = false;
        }
        C2912d.f8590a = z;
        C2909b.f8586b = bVar.f8634e;
        C2918h.f8595a = bVar.f8632c;
        C2918h.f8596b = bVar.f8633d;
        C2930i.f8625b = true;
        C7736c.m15763a().mo14082a(0, new SDKServiceInitTask(dVar));
        C7736c.m15763a().mo14083b();
        C4097p<List<String>> pVar = LiveSettingKeys.NET_MONITOR_BLACK_LIST;
        pVar.getClass();
        C4149a.f11329a = new C4523ad(pVar);
        return true;
    }

    public static <T> void registerService(Class<T> cls, T t) {
        sServices.put(cls, t);
    }

    static <T> void unRegisterService(Class<T> cls, T t) {
        sServices.remove(cls, t);
    }
}
