package com.p683ss.android.ugc.aweme.notice.api.p2009ws;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.geckoclient.model.C10967l;
import com.bytedance.ies.geckoclient.p686e.C10943g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18911h;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.common.net.C26918a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38034b;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38037d;
import com.p683ss.android.ugc.aweme.notice.api.p2004a.C38023a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.C35445g;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47925go;
import com.p683ss.android.ugc.aweme.utils.C47955u;
import com.p683ss.android.websocket.p2539b.C50819b.C50820a;
import com.p683ss.android.websocket.p2539b.p2540a.C50813a;
import com.p683ss.android.websocket.p2539b.p2540a.C50814b;
import com.p683ss.android.websocket.p2539b.p2540a.C50815c;
import com.p683ss.android.websocket.p2539b.p2540a.C50816d;
import com.p683ss.android.websocket.p2539b.p2540a.C50817e;
import com.p683ss.android.websocket.p2539b.p2541b.C50821a;
import com.p683ss.android.websocket.p2539b.p2541b.C50822b;
import com.p683ss.android.websocket.p2539b.p2541b.C50823c;
import com.p683ss.android.websocket.p2539b.p2541b.C50824d;
import com.p683ss.android.websocket.p2539b.p2541b.C50827g;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import okio.ByteString;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.h */
public class C38064h implements C27979p {

    /* renamed from: a */
    public static final String f96840a;

    /* renamed from: e */
    private static final String f96841e = "com.ss.android.ugc.aweme.notice.api.ws.h";

    /* renamed from: l */
    private static C38064h f96842l = new C38064h();

    /* renamed from: b */
    public String f96843b = "";

    /* renamed from: c */
    public boolean f96844c;

    /* renamed from: d */
    public final HashMap<C38037d, Set<C38023a>> f96845d = new HashMap<>();

    /* renamed from: f */
    private String f96846f;

    /* renamed from: g */
    private boolean f96847g;

    /* renamed from: h */
    private boolean f96848h;

    /* renamed from: i */
    private boolean f96849i;

    /* renamed from: j */
    private long f96850j;

    /* renamed from: k */
    private boolean f96851k;

    /* renamed from: d */
    public static C38064h m85136d() {
        return f96842l;
    }

    /* renamed from: a */
    public final void mo47070a() {
        m85140k();
    }

    /* renamed from: b */
    public final void mo47072b() {
        m85140k();
    }

    /* renamed from: c */
    public final void mo47074c() {
    }

    @C53771m
    public void onEvent(C50821a aVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ Object mo77612h() throws Exception {
        m85138i();
        return null;
    }

    /* renamed from: g */
    public static int m85137g() {
        if (C47925go.m103695a().isAppBackground()) {
            return 1;
        }
        return 0;
    }

    static {
        StringBuilder sb = new StringBuilder("wss://");
        sb.append("frontier.tiktokv.com/ws/v2");
        f96840a = sb.toString();
    }

    /* renamed from: e */
    public final String mo77610e() {
        if (C38072o.f96862i.mo77629a().f96863a) {
            return C38072o.f96862i.mo77629a().f96865c;
        }
        return this.f96846f;
    }

    /* renamed from: f */
    public final void mo77611f() {
        if (this.f96851k) {
            C0013i.m18a((Callable<TResult>) new C38066i<TResult>(this), (Executor) C24076h.m58904e());
        } else {
            m85138i();
        }
    }

    private C38064h() {
        if (C18920g.m46048a(C11010c.m22280a())) {
            this.f96851k = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
        }
    }

    /* renamed from: j */
    private boolean m85139j() {
        String sessionKey = AppLog.getSessionKey();
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster == null || !baseUserService_Monster.isLogin()) {
            sessionKey = "";
        }
        boolean z = !TextUtils.equals(this.f96843b, sessionKey);
        StringBuilder sb = new StringBuilder("check session key: lastKey=");
        sb.append(this.f96843b);
        sb.append(", curKey=");
        sb.append(sessionKey);
        m85134a(sb.toString());
        if (z) {
            this.f96843b = sessionKey;
            this.f96847g = true;
        }
        return z;
    }

    /* renamed from: k */
    private void m85140k() {
        HashMap hashMap = new HashMap();
        hashMap.put("IsBackground", String.valueOf(m85137g()));
        C50817e eVar = new C50817e(this.f96846f, 9000, 0, 0, 4, new byte[]{0}, "", "", hashMap);
        C47718bf.m103288a(new C50816d(this.f96846f, eVar));
    }

    /* renamed from: i */
    private void m85138i() {
        if (C23718g.m58207b().mo49153d()) {
            String str = f96840a;
            String providerString = C47925go.m103695a().getProviderString();
            if (!TextUtils.isEmpty(providerString)) {
                try {
                    JSONArray jSONArray = new JSONArray(providerString);
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        String optString = jSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString) && optString.startsWith("wss:")) {
                            try {
                                StringBuilder sb = new StringBuilder("find provider wssUrl=");
                                sb.append(optString);
                                m85134a(sb.toString());
                            } catch (JSONException unused) {
                            }
                            str = optString;
                            break;
                        }
                        i++;
                    }
                } catch (JSONException unused2) {
                }
            }
            if (C38071n.m85148a(C47955u.m103766a())) {
                str = "ws://frontier-boei18n.bytedance.net/ws/v2";
            }
            StringBuilder sb2 = new StringBuilder("start connect ws: wsUrl=");
            sb2.append(str);
            sb2.append(", lastWsUrl=");
            sb2.append(this.f96846f);
            m85134a(sb2.toString());
            String str2 = this.f96846f;
            this.f96846f = str;
            boolean j = m85139j();
            if ((!C9431p.m18664a(str2) && !C9431p.m18665a(this.f96846f, str2)) || j) {
                StringBuilder sb3 = new StringBuilder("start close last connection: lastWsUrl=");
                sb3.append(str2);
                m85134a(sb3.toString());
                m85135b(str2);
            }
            StringBuilder sb4 = new StringBuilder("start connect ws real, url=");
            sb4.append(str);
            sb4.append(", sessionKey=");
            sb4.append(this.f96843b);
            m85134a(sb4.toString());
            C50814b bVar = new C50814b(this.f96846f, new C38062f(), new C50815c() {
                /* renamed from: a */
                public final String mo77619a() {
                    StringBuilder sb = new StringBuilder();
                    AppLog.appendCommonParams(sb, false);
                    sb.append("&aid=");
                    sb.append(AppLog.getAppId());
                    sb.append("&device_id=");
                    sb.append(AppLog.getServerDeviceId());
                    sb.append("&access_key=");
                    String serverDeviceId = AppLog.getServerDeviceId();
                    StringBuilder sb2 = new StringBuilder("9");
                    sb2.append("e1bd35ec9db7b8d846de66ed140b1ad9");
                    sb2.append(serverDeviceId);
                    sb2.append("f8a69f1719916z");
                    sb.append(C9395d.m18571a(sb2.toString()));
                    sb.append("&fpid=");
                    sb.append(9);
                    sb.append("&iid=");
                    sb.append(AppLog.getInstallId());
                    sb.append("&sid=");
                    sb.append(C38064h.this.f96843b);
                    sb.append("&wid=");
                    sb.append(0);
                    sb.append("&pl=");
                    sb.append(0);
                    sb.append("&ne=");
                    sb.append(C38064h.m85132a(NetworkUtils.getNetworkType(C11010c.m22280a())));
                    sb.append("&language=");
                    sb.append(I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(C11010c.m22280a()).mo70122b());
                    sb.append("&is_background=");
                    sb.append(C38064h.m85137g());
                    return sb.toString();
                }
            });
            C47925go.m103695a().registerAppLifecycleObserver(this);
            C47718bf.m103288a(bVar);
            synchronized (this) {
                C47718bf.m103290c(this);
            }
        }
    }

    /* renamed from: b */
    private static void m85135b(String str) {
        C47718bf.m103288a(new C50813a(str));
    }

    /* renamed from: a */
    public static int m85132a(C18911h hVar) {
        if (hVar == C18911h.WIFI) {
            return 1;
        }
        if (hVar == C18911h.MOBILE_2G) {
            return 2;
        }
        if (hVar == C18911h.MOBILE_3G) {
            return 3;
        }
        if (hVar == C18911h.MOBILE_4G) {
            return 4;
        }
        return 0;
    }

    /* renamed from: a */
    private void m85133a(C38034b bVar) {
        if (bVar != null) {
            Set<C38023a> set = (Set) this.f96845d.get(bVar.msgType);
            if (set != null) {
                for (C38023a a : set) {
                    a.mo75935a(bVar);
                }
            }
        }
    }

    @C53771m
    public void onEvent(C26918a aVar) {
        Context context;
        if (C23718g.m58207b().mo49153d()) {
            mo77611f();
            return;
        }
        if (!C47925go.m103695a().isAppBackground()) {
            if (C11016e.m22312g() == null) {
                context = C11010c.m22280a();
            } else {
                context = C11016e.m22312g();
            }
            C10691a.m21542b(context, (int) R.string.az7).mo19066a();
        }
    }

    /* renamed from: a */
    private static void m85134a(String str) {
        IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
        if (provideIMService_Monster != null) {
            C35445g iMErrorMonitor = provideIMService_Monster.getIMErrorMonitor();
            if (iMErrorMonitor != null) {
                iMErrorMonitor.mo73371a(str);
            }
        }
    }

    @C53771m
    public void onEvent(C50822b bVar) {
        if (this.f96849i) {
            this.f96848h = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.f96850j);
                jSONObject.put("ws_connect_type", bVar.f127695c);
                C9951d.m19996a("aweme_long_connection_error_rate", 0, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f96849i = false;
    }

    @C53771m
    public void onEvent(C50823c cVar) {
        StringBuilder sb = new StringBuilder("ReceivedMsgEvent receive message method=");
        sb.append(cVar.f127699d);
        sb.append("  service=");
        sb.append(cVar.f127700e);
        sb.append(" url=");
        sb.append(cVar.f127696a);
        Object obj = cVar.f127698c;
        if (obj instanceof C38034b) {
            m85133a((C38034b) obj);
            return;
        }
        if (C10943g.m22212a(cVar.f127700e)) {
            byte[] bArr = cVar.f127697b;
            if (bArr != null) {
                C10967l lVar = new C10967l(cVar.f127699d, ByteString.m114277of(bArr).utf8());
                if (!C10181b.m20511a().mo18172a(WsAsyncGeckoAB.class, true, "ws_async_get_gecko", 31744, false) || Looper.getMainLooper() != Looper.myLooper()) {
                    C10885e normalGeckoClient = C47925go.m103695a().getNormalGeckoClient();
                    if (normalGeckoClient != null) {
                        normalGeckoClient.mo19653a(lVar);
                    }
                } else {
                    C24076h.m58903d().execute(new C38068k(lVar));
                }
            }
        }
    }

    @C53771m
    public void onEvent(C50824d dVar) {
        if (!this.f96848h && this.f96849i) {
            this.f96848h = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.f96850j);
                jSONObject.put("errorResponse", dVar.f127702b);
                jSONObject.put("ws_connect_type", dVar.f127703c);
                C9951d.m19996a("aweme_long_connection_error_rate", 1, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f96849i = false;
    }

    @C53771m
    public void onEvent(C50827g gVar) {
        boolean z = false;
        if ((gVar.f127711b == null || gVar.f127711b == C50820a.CLOSED) && this.f96847g) {
            this.f96847g = false;
            mo77611f();
        }
        if (gVar.f127711b == C50820a.OPENING) {
            this.f96850j = SystemClock.uptimeMillis();
            this.f96849i = true;
        }
        if (gVar.f127711b == C50820a.CONNECTED) {
            z = true;
        }
        this.f96844c = z;
        if (this.f96844c) {
            if (!C10181b.m20511a().mo18172a(WsAsyncGeckoAB.class, true, "ws_async_get_gecko", 31744, false) || Looper.getMainLooper() != Looper.myLooper()) {
                C10885e normalGeckoClient = C47925go.m103695a().getNormalGeckoClient();
                if (normalGeckoClient != null) {
                    normalGeckoClient.mo19669e();
                }
            } else {
                C24076h.m58903d().execute(C38067j.f96854a);
            }
        }
    }
}
