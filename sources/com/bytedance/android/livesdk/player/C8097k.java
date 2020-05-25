package com.bytedance.android.livesdk.player;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3920x;
import com.bytedance.android.live.core.performance.C3973a;
import com.bytedance.android.live.livepullstream.p249a.C4138c;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b.C4145a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdkapi.depend.p436d.C8626b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.k */
public class C8097k implements C4138c {

    /* renamed from: a */
    boolean f22111a;

    /* renamed from: b */
    float f22112b;

    /* renamed from: c */
    int f22113c;

    /* renamed from: d */
    int f22114d;

    /* renamed from: e */
    String f22115e;

    /* renamed from: f */
    String f22116f;

    /* renamed from: g */
    private String f22117g = "tt";

    /* renamed from: com.bytedance.android.livesdk.player.k$a */
    public static final class C8099a implements C4144b<C8097k> {
        /* renamed from: a */
        public final C4145a<C8097k> mo9533a(C4145a<C8097k> aVar) {
            return aVar.mo9535a(new C8097k()).mo9534a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.player.k$b */
    static class C8100b implements Callable {

        /* renamed from: a */
        private final float f22118a;

        /* renamed from: b */
        private final JSONObject f22119b;

        /* renamed from: c */
        private int f22120c;

        /* renamed from: d */
        private int f22121d;

        /* renamed from: e */
        private String f22122e;

        /* renamed from: f */
        private String f22123f;

        public final Object call() throws Exception {
            String str;
            try {
                float a = ((float) C3920x.m9896a()) / 1024.0f;
                float f = a - this.f22118a;
                Context context = ((IHostContext) C4116c.m10249a(IHostContext.class)).context();
                String a2 = C3920x.m9897a(context.getPackageName());
                JSONObject jSONObject = this.f22119b;
                String str2 = "cpu";
                if ("".equals(a2)) {
                    str = "0";
                } else {
                    str = a2;
                }
                jSONObject.put(str2, str);
                StringBuilder sb = new StringBuilder("live push cpu:");
                sb.append(a2);
                C3831a.m9712b("LivePlayerLog", sb.toString());
                this.f22119b.put("memory", (int) a);
                this.f22119b.put("live_push_memory", (int) f);
                this.f22119b.put("product_line", CustomActionPushReceiver.f104061f);
                this.f22119b.put("start_memory", (int) this.f22118a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", this.f22119b);
                jSONObject2.put("did", AppLog.getServerDeviceId());
                jSONObject2.put("uid", ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b());
                jSONObject2.put("net_type", NetworkUtils.getNetworkAccessType(context));
                jSONObject2.put("net_des", NetworkUtils.getNetworkOperatorCode(context));
                if (C8106p.m16122a(context.getPackageManager(), context.getPackageName(), 128).metaData != null) {
                    jSONObject2.put("app_version_four", C8106p.m16122a(context.getPackageManager(), context.getPackageName(), 128).metaData.getInt("UPDATE_VERSION_CODE"));
                }
                this.f22119b.put("channel", ((IHostContext) C4116c.m10249a(IHostContext.class)).getChannel());
                this.f22119b.put("device_name", Build.MODEL);
                int a3 = C3973a.m10056a(context, Process.myPid());
                if (a3 != -1) {
                    this.f22119b.put("dalvik_pss", a3);
                }
                this.f22119b.put("screen_height", this.f22120c);
                this.f22119b.put("screen_width", this.f22121d);
                C8097k.m16117a(this.f22122e, this.f22123f, this.f22119b);
                C3837e.m9747a("live_client_monitor_log", (String) null, this.f22119b);
            } catch (Exception unused) {
            }
            return null;
        }

        private C8100b(int i, int i2, float f, String str, String str2, JSONObject jSONObject) {
            this.f22120c = i;
            this.f22121d = i2;
            this.f22118a = f;
            this.f22122e = str;
            this.f22123f = str2;
            this.f22119b = jSONObject;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.player.k$c */
    static class C8101c implements Callable {

        /* renamed from: a */
        private final float f22124a;

        /* renamed from: b */
        private final JSONObject f22125b;

        /* renamed from: c */
        private int f22126c;

        /* renamed from: d */
        private int f22127d;

        /* renamed from: e */
        private String f22128e;

        /* renamed from: f */
        private String f22129f;

        public final Object call() throws Exception {
            String str;
            try {
                if (this.f22125b != null) {
                    float a = ((float) C3920x.m9896a()) / 1024.0f;
                    float f = a - this.f22124a;
                    Context context = ((IHostContext) C4116c.m10249a(IHostContext.class)).context();
                    try {
                        if (TextUtils.equals("playing", this.f22125b.optString("event_key"))) {
                            String a2 = C3920x.m9897a(context.getPackageName());
                            JSONObject jSONObject = this.f22125b;
                            String str2 = "cpu";
                            if ("".equals(a2)) {
                                str = "0";
                            } else {
                                str = a2;
                            }
                            jSONObject.put(str2, str);
                            StringBuilder sb = new StringBuilder("live pull cpu:");
                            sb.append(a2);
                            C3831a.m9712b("LivePlayerLog", sb.toString());
                        }
                        this.f22125b.put("memory", (int) a);
                        this.f22125b.put("live_pull_memory", (int) f);
                        this.f22125b.put("start_memory", (int) this.f22124a);
                        this.f22125b.put("channel", ((IHostContext) C4116c.m10249a(IHostContext.class)).getChannel());
                        this.f22125b.put("device_name", Build.MODEL);
                        this.f22125b.put("did", AppLog.getServerDeviceId());
                        this.f22125b.put("uid", ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b());
                        this.f22125b.put("net_type", NetworkUtils.getNetworkAccessType(context));
                        this.f22125b.put("net_des", NetworkUtils.getNetworkOperatorCode(context));
                        if (C8107q.m16123a(context.getPackageManager(), context.getPackageName(), 128).metaData != null) {
                            this.f22125b.put("app_version_four", C8107q.m16123a(context.getPackageManager(), context.getPackageName(), 128).metaData.getInt("UPDATE_VERSION_CODE"));
                        }
                        this.f22125b.put("ttlive_sdk_version", "1510");
                        int a3 = C3973a.m10056a(context, Process.myPid());
                        if (a3 != -1) {
                            this.f22125b.put("dalvik_pss", a3);
                        }
                        this.f22125b.put("screen_height", this.f22126c);
                        this.f22125b.put("screen_width", this.f22127d);
                        C8097k.m16117a(this.f22128e, this.f22129f, this.f22125b);
                        C3837e.m9747a("live_client_monitor_log", (String) null, this.f22125b);
                    } catch (Exception e) {
                        C3831a.m9714b("LivePlayerLog", (Throwable) e);
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }

        C8101c(int i, int i2, float f, String str, String str2, JSONObject jSONObject) {
            this.f22126c = i;
            this.f22127d = i2;
            this.f22124a = f;
            this.f22128e = str;
            this.f22129f = str2;
            this.f22125b = jSONObject;
        }
    }

    public C8097k() {
        C8626b.m17014a().mo15104a(C8102l.f22130a);
        this.f22115e = ((C4139d) C4116c.m10249a(C4139d.class)).getCpuInfoFetcher().mo9523a();
        this.f22116f = ((C4139d) C4116c.m10249a(C4139d.class)).getGpuInfoFetcher().mo9525a(null);
        if (this.f22115e == null) {
            ((C4139d) C4116c.m10249a(C4139d.class)).getCpuInfoFetcher().mo9524a(new C8103m(this));
        }
    }

    /* renamed from: a */
    public final void mo9527a(String str) {
        this.f22116f = str;
    }

    /* renamed from: a */
    public static void m16117a(String str, String str2, JSONObject jSONObject) throws JSONException {
        if (str != null) {
            jSONObject.put("cpu_soc", str);
        }
        if (str2 != null) {
            jSONObject.put("gpu_name", str2);
        }
    }
}
