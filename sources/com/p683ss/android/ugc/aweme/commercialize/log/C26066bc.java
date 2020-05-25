package com.p683ss.android.ugc.aweme.commercialize.log;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.p140a.p141a.C2782d;
import com.bytedance.android.p140a.p141a.C2782d.C2784a;
import com.bytedance.android.p140a.p141a.C2789f;
import com.bytedance.android.p140a.p141a.p142a.C2771a;
import com.bytedance.android.p140a.p141a.p148g.C2792a;
import com.bytedance.android.p140a.p141a.p148g.C2792a.C2794a;
import com.bytedance.android.p140a.p141a.p149h.C2796a;
import com.bytedance.android.p140a.p151b.C2806a;
import com.bytedance.android.p140a.p151b.C2806a.C2808a;
import com.bytedance.android.p140a.p151b.p152a.C2809a;
import com.bytedance.android.p140a.p151b.p153b.C2820c;
import com.bytedance.android.p140a.p151b.p153b.C2822d;
import com.bytedance.android.p140a.p151b.p153b.p154a.C2815b;
import com.bytedance.android.p140a.p151b.p153b.p154a.C2815b.C2816a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32811d;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.ArrayList;
import java.util.HashMap;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.bc */
public final class C26066bc {

    /* renamed from: a */
    static String f68839a;

    /* renamed from: b */
    public static final C26066bc f68840b = new C26066bc();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.bc$a */
    static final class C26067a implements C2771a {

        /* renamed from: a */
        public static final C26067a f68841a = new C26067a();

        C26067a() {
        }

        /* renamed from: a */
        public final void mo7363a(String str, JSONObject jSONObject) {
            C26890h.m65012a(str, jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.bc$b */
    public static final class C26068b extends C2789f {
        C26068b() {
        }

        /* renamed from: a */
        public final String mo7392a() {
            return RawURLGetter.m63083a("other");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.bc$c */
    public static final class C26069c extends C2809a {
        C26069c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.bc$d */
    static final class C26070d implements C2815b {

        /* renamed from: a */
        public static final C26070d f68842a = new C26070d();

        C26070d() {
        }

        /* renamed from: a */
        public final C2822d mo7410a(C2816a aVar) {
            String str;
            int i;
            C52711k.m112240b(aVar, "chain");
            C2822d a = aVar.mo7414a(aVar.mo7413a());
            if (a != null) {
                C2820c cVar = a.f8419e;
                if (cVar != null) {
                    str = cVar.f8407b;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C2820c cVar2 = a.f8419e;
                    C52711k.m112236a((Object) cVar2, "c2SResponse.request");
                    Uri parse = Uri.parse(cVar2.f8407b);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("track_url", parse.toString());
                        C52711k.m112236a((Object) parse, "uri");
                        jSONObject.put("scheme", parse.getScheme());
                        jSONObject.put("host", parse.getHost());
                        jSONObject.put(LeakCanaryFileProvider.f132050j, parse.getPath());
                        jSONObject.put("ref", "track_sdk");
                    } catch (JSONException unused) {
                    }
                    Throwable th = a.f8420f;
                    if (th != null) {
                        try {
                            jSONObject.put("error_message", th.getMessage());
                        } catch (JSONException e) {
                            Integer.valueOf(Log.e("TrackSDKHelper", "put track_url failed", e));
                        }
                    }
                    try {
                        jSONObject.put("status_code", a.f8415a);
                    } catch (JSONException unused2) {
                    }
                    String str2 = "aweme_third_party_track_url_succeed_rate";
                    if (a.f8415a < 200 || a.f8415a >= 300) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    C23131p.m57776a(str2, i, jSONObject);
                }
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.bc$e */
    static final class C26071e implements C32811d {

        /* renamed from: a */
        final /* synthetic */ C2782d f68843a;

        C26071e(C2782d dVar) {
            this.f68843a = dVar;
        }

        public final void change(IESSettingsProxy iESSettingsProxy) {
            C52711k.m112240b(iESSettingsProxy, "it");
            String str = C26066bc.f68839a;
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            if (C52830p.m112407a(str, b.getAdTrackerConfig(), false, 2, null)) {
                this.f68843a.mo7382a(C26066bc.f68840b.mo53557b());
            }
        }
    }

    private C26066bc() {
    }

    /* renamed from: c */
    private static JSONObject m63159c() {
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        f68839a = b.getAdTrackerConfig();
        try {
            IESSettingsProxy b2 = C32816h.m75716b();
            C52711k.m112236a((Object) b2, "SettingsReader.get()");
            return new JSONObject(b2.getAdTrackerConfig());
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C2792a mo53557b() {
        C2792a a = new C2794a().mo7399a(false).mo7401b(true).mo7398a(m63159c()).mo7400a();
        C52711k.m112236a((Object) a, "AdTrackerSetting.Builder…\n                .build()");
        return a;
    }

    /* renamed from: a */
    public final C2782d mo53556a() {
        C2782d a = C2782d.m7909a();
        C52711k.m112236a((Object) a, "trackerSDK");
        if (!a.mo7385b()) {
            synchronized (getClass()) {
                if (!a.mo7385b()) {
                    C26066bc bcVar = f68840b;
                    C2784a aVar = new C2784a(C11010c.m22280a());
                    aVar.f8347a = bcVar.mo53557b();
                    aVar.f8348b = C26067a.f68841a;
                    aVar.f8350d = new C26068b();
                    C2808a aVar2 = new C2808a();
                    aVar2.f8394a = true;
                    aVar2.f8396c = new C26069c();
                    C2815b bVar = C26070d.f68842a;
                    if (bVar != null) {
                        if (aVar2.f8397d == null) {
                            aVar2.f8397d = new ArrayList();
                        }
                        aVar2.f8397d.add(bVar);
                    }
                    C2796a aVar3 = new C2806a(aVar2);
                    if (aVar.f8349c == null) {
                        aVar.f8349c = new HashMap();
                    }
                    aVar.f8349c.put(aVar3.mo7402b(), aVar3);
                    aVar.mo7387a();
                    SettingsManagerProxy.inst().registerSettingsWatcher(new C26071e(C2782d.m7909a()), false);
                }
            }
        }
        return a;
    }
}
