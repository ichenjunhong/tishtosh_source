package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.bytedance.p702im.core.internal.utils.C11466d;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.internal.utils.C11500m;
import com.bytedance.p702im.core.p703a.C11160a;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11172e;
import com.bytedance.p702im.core.p705b.C11173a;
import com.bytedance.p702im.core.p705b.C11174b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11201j;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.net.C26923f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImSdkLogPrivacySettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.SdkRequestHeaderSettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33474i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33849j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34169a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34755a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34401d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34402e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34403f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.DefaultMainProxy;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.IImplService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.ImServiceProvider;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.ImplService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.p1886a.C34970a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b.C34888b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34885c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1879b.C34891a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35215a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35421a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.android.websocket.p2539b.C50819b.C50820a;
import com.p683ss.android.websocket.p2539b.p2540a.C50813a;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.b */
public class C34004b {

    /* renamed from: c */
    private static C34004b f87928c;

    /* renamed from: a */
    public C35421a f87929a;

    /* renamed from: b */
    public long f87930b = System.currentTimeMillis();

    /* renamed from: d */
    private C35460j f87931d;

    /* renamed from: e */
    private C11160a f87932e = new C34403f();

    /* renamed from: b */
    public static IImplService m77718b() {
        return ImplService.createIImplServicebyMonsterPlugin();
    }

    /* renamed from: f */
    public final C35460j mo71949f() {
        if (this.f87931d == null) {
            return new DefaultMainProxy();
        }
        return this.f87931d;
    }

    private C34004b() {
    }

    /* renamed from: a */
    public static C34004b m77717a() {
        if (f87928c == null) {
            synchronized (C34004b.class) {
                if (f87928c == null) {
                    f87928c = new C34004b();
                }
            }
        }
        return f87928c;
    }

    /* renamed from: e */
    public final void mo71948e() {
        C11500m.m23559a();
        if (C35265e.m79727a()) {
            m77720h();
            C34010e.m77748a().mo71965b();
        }
        mo71947d();
    }

    /* renamed from: g */
    public final void mo71950g() {
        if (C11165c.m22588a().f30108c == null) {
            C11165c.m22588a().mo20512a(this.f87932e);
        }
    }

    /* renamed from: c */
    public static void m77719c() {
        if (!C11165c.m22588a().f30110e) {
            if (C34030j.f87979a == null) {
                C34030j.f87979a = C34031a.f87982a;
            }
            C11472i.m23483a().f30779c = C34030j.f87979a;
            C11182d.m22641a().mo20663a(C34032k.m77795a().f87994k);
            C11165c.m22588a().mo20515c();
            C34755a.f89518g.mo72825d();
            C33849j.m77600e();
        }
    }

    /* renamed from: h */
    private static void m77720h() {
        C35237bj a = C35237bj.m79649a();
        a.f90549a.clear();
        a.f90550b.clear();
        C11165c.m22588a().mo20516d();
        C34032k a2 = C34032k.m77795a();
        C11182d.m22641a().mo20669b(a2.f87994k);
        a2.f87992i.removeMessages(2);
        if (a2.f87991h != null && !a2.f87991h.mo12a()) {
            a2.f87991h.mo14c();
        }
        a2.f87991h = null;
        a2.f87986c.clear();
        a2.f87987d.clear();
        a2.f87990g = false;
        a2.f87989f = 0;
        a2.f87988e = 0;
        a2.f87993j = true;
        a2.mo71987d();
        if (C34030j.f87979a != null) {
            C11472i a3 = C11472i.m23483a();
            C11201j jVar = C34030j.f87979a;
            a3.f30779c = null;
            C34030j.f87979a = null;
        }
        C35284t.m79782a().f90621b.edit().remove("userid").remove("token").commit();
        C34401d a4 = C34401d.m78329a();
        if (a4.f88779c == C50820a.CLOSED || a4.f88779c == C50820a.CLOSING) {
            C35459a.m80150b("ImWebSocketManager", "close ws return : connection is closed or closing already");
        } else {
            String str = a4.f88778b;
            if (C34402e.m78334a(a4.f88777a)) {
                C35459a.m80150b("ImWebSocketManager", "close ws connection");
                C53755c.m114319a().mo112960d(new C50813a(str));
            }
        }
        C34755a aVar = C34755a.f89518g;
        aVar.f89521b.clear();
        aVar.f89520a.clear();
        aVar.f89522c.clear();
    }

    /* renamed from: d */
    public final void mo71947d() {
        C11500m.m23559a();
        if (!C35279p.m79763a()) {
            C34891a b = C34886b.f89856b.mo73004b();
            if (C35265e.m79727a()) {
                b.mo73006a(C34885c.LOGIN);
            } else {
                b.mo73008d();
            }
        }
        SdkRequestHeaderSettings.clearRequestHeaderCache();
        boolean z = false;
        if (C35265e.m79727a()) {
            long d = C35265e.m79733d();
            if (d != C35284t.m79782a().mo73430j()) {
                z = true;
            }
            C35284t.m79782a().f90621b.edit().putLong("userid", d).commit();
            if (z) {
                C34971b.m79104a(C34971b.f89988d, C34970a.COLDUP_FULL, true, null, 4, null);
            }
            ImServiceProvider.INSTANCE.getFamiliarService().mo72370a();
            if (mo71949f().showNewStyle()) {
                C34169a.m77980a().mo72158b();
            }
            C34018h.m77779b().mo71972a(true, 1);
            C35243bl.m79710a(C11010c.m22280a());
            return;
        }
        m77720h();
        if (mo71949f().showNewStyle()) {
            C34169a a = C34169a.m77980a();
            a.f88291a.clear();
            a.f88292b = false;
        }
        C34010e.m77748a().mo71965b();
    }

    @C53771m
    public void onEvent(C26923f fVar) {
        if (fVar.f70799a != 0 && C35265e.m79727a() && System.currentTimeMillis() - this.f87930b >= 5000) {
            C35197am.m79562c();
        }
    }

    /* renamed from: a */
    public final void mo71946a(Application application, C35421a aVar, C35460j jVar) {
        int i;
        this.f87929a = aVar;
        if (jVar == null) {
            jVar = new DefaultMainProxy();
        }
        this.f87931d = jVar;
        application.registerActivityLifecycleCallbacks(C34003a.f87925a);
        C52711k.m112240b(application, "application");
        C11165c a = C11165c.m22588a();
        C11172e eVar = new C11172e();
        eVar.f30140d = aVar.f91098g;
        eVar.f30141e = aVar.f91097f;
        eVar.f30147k = 0;
        if (aVar.f91092a) {
            i = 3;
        } else {
            i = 6;
        }
        eVar.f30137a = i;
        eVar.f30143g = C35268h.f90603d;
        eVar.f30138b = 2;
        eVar.f30155s = 1;
        eVar.f30146j = 1000;
        eVar.f30126A = true;
        eVar.f30135J = "1000";
        eVar.f30136K = false;
        eVar.f30139c = !ImSdkLogPrivacySettings.isLogEnabled();
        if (!C35279p.m79763a()) {
            eVar.f30153q = new int[]{1};
        }
        a.f30106a = application;
        a.f30107b = eVar;
        C11467e.f30774a = a.mo20513b().f30137a;
        C11165c.m22588a().mo20512a(this.f87932e);
        C11165c.m22588a().f30109d = new C11173a() {
            /* renamed from: a */
            public final void mo20520a(String str, JSONObject jSONObject) {
                C26890h.m65012a(str, jSONObject);
            }
        };
        C34401d.m78330a(application.getApplicationContext());
        C34401d a2 = C34401d.m78329a();
        if (!C53755c.m114319a().mo112958b((Object) a2)) {
            C53755c.m114319a().mo112955a((Object) a2);
        }
        if (!C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112955a((Object) this);
        }
        C11165c.m22588a();
        C11472i.m23483a().f30777a = new C33474i();
        C11176d.f30167a = new C11174b() {
            /* renamed from: a */
            public final void mo20521a(Object obj) {
                try {
                    String b = C11466d.f30773a.mo34889b(obj);
                    while (b.length() > 2000) {
                        C32458a.m75144a(b.substring(0, 2000));
                        b = b.substring(2000);
                    }
                    C32458a.m75144a(b);
                } catch (Exception unused) {
                }
            }

            /* renamed from: a */
            public final void mo20525a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                C9951d.m19998a(str, jSONObject, jSONObject2);
            }

            /* renamed from: a */
            public final void mo20524a(String str, String str2, JSONObject jSONObject) {
                C9951d.m19997a("im_event", jSONObject);
            }

            /* renamed from: a */
            public final void mo20522a(String str, String str2, Throwable th) {
                if (!TextUtils.isEmpty(str2)) {
                    C32458a.m75144a(str2);
                }
                if (th != null) {
                    C32458a.m75148a(th);
                }
            }

            /* renamed from: a */
            public final void mo20523a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
                if (TextUtils.equals(str, "network")) {
                    try {
                        C35215a.m79604a(str2, map, map2);
                    } catch (Throwable th) {
                        C32458a.m75143a((Exception) new RuntimeException(th));
                    }
                }
                C35265e.m79724a(str, str2, map);
            }
        };
        C34018h b = C34018h.m77779b();
        C34018h.m77777a("loginWithLocalToken");
        if (b.f87957b) {
            b = null;
        }
        C34018h hVar = b;
        if (hVar != null) {
            hVar.mo71972a(false, 0);
        }
        if (!C35279p.m79763a()) {
            C0013i.m18a((Callable<TResult>) C34888b.f89861a, C0013i.f25b);
        }
    }
}
