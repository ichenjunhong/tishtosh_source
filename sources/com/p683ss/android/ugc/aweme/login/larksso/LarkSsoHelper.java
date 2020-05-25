package com.p683ss.android.ugc.aweme.login.larksso;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.util.C47626j;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper */
public final class LarkSsoHelper {

    /* renamed from: a */
    static C36299a f92904a;

    /* renamed from: b */
    static LarkApi f92905b = ((LarkApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19926b(false).mo19925a().mo19930a(LarkApi.class));

    /* renamed from: c */
    public static final LarkSsoHelper f92906c = new LarkSsoHelper();

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$LarkApi */
    public interface LarkApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$a */
    public interface C36299a {
        /* renamed from: a */
        void mo75190a();
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$b */
    static final class C36300b<T> implements C2205y<String> {

        /* renamed from: a */
        final /* synthetic */ String f92907a;

        C36300b(String str) {
            this.f92907a = str;
        }

        public final void subscribe(C2204x<String> xVar) {
            String str;
            C52711k.m112240b(xVar, "it");
            try {
                str = (String) LarkSsoHelper.f92905b.doGet(this.f92907a).get();
            } catch (Exception e) {
                Throwable th = e;
                C9220a.m18312a(th, "larksso inside");
                StringBuilder sb = new StringBuilder("larksso catch1: ");
                sb.append(Log.getStackTraceString(th));
                C32458a.m75144a(sb.toString());
                str = null;
            }
            StringBuilder sb2 = new StringBuilder("larksso response: ");
            sb2.append(str);
            C32458a.m75144a(sb2.toString());
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optString("username");
                String optString = jSONObject.optString("email");
                C47865ew a = C47865ew.m103536a();
                if (!TextUtils.isEmpty(optString) && Pattern.matches("^([a-z0-9A-Z]+[-|.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$", optString)) {
                    a.f120440f.storeString("lastInputEmailPrefix", optString.split("@")[0]);
                }
                if (C47626j.m103108b()) {
                    C47626j.m103105a().mo22740a(optString);
                }
                C23859b.m58575b().mo49465a(C11010c.m22280a(), "local_test_lark_user_email", optString);
                xVar.mo6282a(optString);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$c */
    public static final class C36301c implements C1674ab<String> {
        C36301c() {
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "t");
            if (!TextUtils.isEmpty(str)) {
                C23859b.m58575b().mo49463a((Context) AwemeApplication.m56199a(), "sso_time", System.currentTimeMillis());
                C36299a aVar = LarkSsoHelper.f92904a;
                if (aVar != null) {
                    aVar.mo75190a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$d */
    public static final class C36302d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f92908a;

        public C36302d(Context context) {
            this.f92908a = context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                boolean r0 = com.p683ss.android.ugc.aweme.login.larksso.LarkSsoHelper.m81944a()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0032
                java.lang.String r0 = "validation.prop"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.io.File r4 = com.p683ss.android.ugc.aweme.video.C48016e.m103941b(r4)
                java.lang.String r4 = r4.toString()
                r3.append(r4)
                java.lang.String r4 = java.io.File.separator
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r0 = com.p683ss.android.ugc.aweme.video.C48016e.m103955f(r0)
                if (r0 == 0) goto L_0x0032
                r0 = 1
                goto L_0x0033
            L_0x0032:
                r0 = 0
            L_0x0033:
                com.ss.android.ugc.aweme.app.AwemeApplication r3 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
                android.content.Context r3 = (android.content.Context) r3
                boolean r3 = com.p683ss.android.ugc.aweme.login.larksso.C36303a.m81946a(r3)
                if (r3 == 0) goto L_0x00c1
                com.ss.android.ugc.aweme.bl.b r3 = com.p683ss.android.ugc.aweme.p1439bl.C23859b.m58575b()
                com.ss.android.ugc.aweme.app.AwemeApplication r4 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
                android.content.Context r4 = (android.content.Context) r4
                java.lang.String r5 = "sso_time"
                long r3 = r3.mo49473c(r4, r5)
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x0066
                long r5 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r3
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS
                r7 = 30
                long r3 = r3.toMillis(r7)
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x0067
            L_0x0066:
                r1 = 1
            L_0x0067:
                if (r1 == 0) goto L_0x00c1
                boolean r1 = com.p683ss.android.ugc.aweme.login.larksso.LarkSsoHelper.m81944a()
                if (r1 == 0) goto L_0x00c1
                boolean r1 = com.p683ss.android.ugc.aweme.app.p1380j.C23110b.m56677b()
                if (r1 != 0) goto L_0x00c1
                com.ss.android.ugc.aweme.update.f r1 = com.p683ss.android.ugc.aweme.update.C47517f.C47518a.m102946a()
                boolean r1 = r1.f119898a
                if (r1 != 0) goto L_0x00c1
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 23
                if (r1 < r3) goto L_0x00c1
                com.ss.android.ugc.aweme.utils.u r1 = com.p683ss.android.ugc.aweme.utils.C47955u.m103766a()
                java.lang.String r3 = "BoeUtils.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                boolean r1 = com.p683ss.android.ugc.aweme.setting.C41623i.m91496b()
                if (r1 != 0) goto L_0x00c1
                if (r0 != 0) goto L_0x00c1
                android.content.Context r0 = r9.f92908a
                java.lang.String r1 = "https://sso.bytedance.com/cas/login"
                android.content.Intent r0 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65482a(r0, r1)
                java.lang.String r1 = "CrossPlatformUtil.getInt…bytedance.com/cas/login\")"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                android.content.Context r1 = r9.f92908a
                java.lang.Class<com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso> r3 = com.p683ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso.class
                r0.setClass(r1, r3)
                java.lang.String r1 = "hide_more"
                r0.putExtra(r1, r2)
                java.lang.String r1 = "title_extra"
                android.content.Context r2 = r9.f92908a
                r3 = 2132546006(0x7f1c11d6, float:2.0745218E38)
                java.lang.String r2 = r2.getString(r3)
                r0.putExtra(r1, r2)
                android.content.Context r1 = r9.f92908a
                r1.startActivity(r0)
                return
            L_0x00c1:
                com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$a r0 = com.p683ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso.C36296a.m81940a()
                if (r0 == 0) goto L_0x00cb
                r0.mo75190a()
                return
            L_0x00cb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.login.larksso.LarkSsoHelper.C36302d.run():void");
        }
    }

    private LarkSsoHelper() {
    }

    /* renamed from: a */
    public static boolean m81944a() {
        if (C9431p.m18665a(C11010c.m22295p(), "local_test") || C9431p.m18665a(C11010c.m22295p(), "lark_inhouse")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m81942a(C36299a aVar) {
        f92904a = aVar;
    }

    /* renamed from: a */
    public static final synchronized void m81943a(String str) {
        synchronized (LarkSsoHelper.class) {
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    C52711k.m112234a();
                }
                try {
                    if (C52830p.m112456b((CharSequence) str, (CharSequence) "api/v1/be/user", false, 2, (Object) null)) {
                        C2201v.m6601a((C2205y<T>) new C36300b<T>(str)).mo6514a(C1667a.m5940a()).mo6529b(C2168a.m6521b()).mo6314a((C1674ab<? super T>) new C36301c<Object>());
                    } else {
                        C32458a.m75144a("larksso else: no api/v1/be/user");
                    }
                } catch (Exception e) {
                    C9220a.m18312a((Throwable) e, "larksso outside");
                    StringBuilder sb = new StringBuilder("larksso catch2: ");
                    sb.append(Log.getStackTraceString(e));
                    C32458a.m75144a(sb.toString());
                }
            }
        }
    }
}
