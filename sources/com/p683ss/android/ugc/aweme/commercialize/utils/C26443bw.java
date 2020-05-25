package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.p1103ad.splash.C18546a;
import com.p683ss.android.p1103ad.splash.C18764m;
import com.p683ss.android.p1103ad.splash.C18764m.C18766a;
import com.p683ss.android.p1103ad.splash.C18769p;
import com.p683ss.android.p1103ad.splash.core.C18652i;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18629a;
import com.p683ss.android.p1103ad.splash.p1111c.C18559a;
import com.p683ss.android.p1103ad.splash.p1111c.C18561c;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.p1380j.C23110b;
import com.p683ss.android.ugc.aweme.commercialize.abtest.AwemeSplashPreloadExperiment;
import com.p683ss.android.ugc.aweme.commercialize.abtest.SplashDownloadAsyncType;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26250r;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26237e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import com.p683ss.android.ugc.aweme.utils.C47892fm;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bw */
public final class C26443bw {
    /* renamed from: a */
    private static boolean m63932a() {
        if (C23110b.m56676a()) {
            C26447bz.f69708a.mo54163b("不展示普通开屏 理由：trace功能开启");
            return true;
        } else if (!AwemeAppData.m47851a().f61129g) {
            return false;
        } else {
            AwemeAppData.m47851a().f61129g = false;
            C26447bz.f69708a.mo54163b("不展示普通开屏 理由：从通知点进来，不展示广告");
            return true;
        }
    }

    /* renamed from: a */
    public static void m63930a(Context context, C18769p pVar) {
        pVar.mo38110d(true);
        pVar.mo38090a((C18629a) new C26250r(context));
        pVar.mo38105b(C10181b.m20511a().mo18168a(SplashDownloadAsyncType.class, true, "splash_download_async_type", 31744, 0));
    }

    /* renamed from: a */
    public static boolean m63933a(Context context, boolean z) {
        if (context == null || m63932a()) {
            return false;
        }
        C22574a.m55738f().mo46917a("cold_boot_live_splash_init", false);
        System.currentTimeMillis();
        C26237e.m63579b().mo53890c();
        if (!C26237e.m63579b().mo53891d()) {
            C22574a.m55738f().mo46921b("cold_boot_live_splash_init", false);
            return false;
        } else if (!z) {
            return true;
        } else {
            C18559a f = SplashAdManagerHolder.m99458a(context).mo38116f();
            C26237e.m63579b();
            C26237e.m63578a(f);
            C22574a.m55738f().mo46921b("cold_boot_live_splash_init", false);
            return true;
        }
    }

    /* renamed from: a */
    public static void m63931a(final Context context, HashMap<String, String> hashMap, boolean z) {
        C264441 r0 = new C18561c() {
            /* renamed from: a */
            public final void mo37868a(List<String> list) {
                C26217c a = C26217c.m63502a();
                Context context = context;
                if (C26217c.m63506f()) {
                    C26447bz.f69708a.mo54162a("取消下载 理由：青少年模式过滤原生开屏");
                } else if (C26217c.m63505e()) {
                    C26447bz.f69708a.mo54162a("取消下载 理由：根据服务端下发字段过滤掉原生开屏");
                } else if (C26217c.f69224b == null) {
                    C26447bz.f69708a.mo54162a("取消下载 理由：未获取到原生开屏列表preference");
                } else if (C9376b.m18558a((Collection<T>) list)) {
                    C26447bz.f69708a.mo54162a("取消下载 理由：下载列表为空");
                } else {
                    boolean z = false;
                    for (String a2 : list) {
                        Aweme a3 = C26217c.f69224b.mo53869a(a2);
                        if (a3 != null) {
                            C26088l.m63322b(context, "download_video_count_splash_sdk", a3, C26088l.m63373m(context, a3, "raw ad download_video_count_splash_sdk"));
                            if ((!z || C10181b.m20511a().mo18168a(AwemeSplashPreloadExperiment.class, true, "awesome_splash_preload_optimize", 31744, 0) == 0) && a.mo53861a(context, a3)) {
                                z = true;
                            }
                        }
                    }
                }
            }

            /* renamed from: a */
            public final boolean mo37869a(C18559a aVar, boolean z) {
                return C26217c.m63502a().mo53862a(aVar.mo37857C(), z);
            }
        };
        C18766a aVar = new C18766a();
        aVar.f51905o = new C18546a() {
            /* renamed from: c */
            public final String mo37816c() {
                return C11010c.m22283d();
            }

            /* renamed from: e */
            public final String mo37818e() {
                return C11010c.m22288i();
            }

            /* renamed from: g */
            public final String mo37820g() {
                return C11010c.m22295p();
            }

            /* renamed from: j */
            public final String mo37823j() {
                return AppLog.getInstallId();
            }

            /* renamed from: l */
            public final String mo37825l() {
                return C47892fm.m103594a();
            }

            /* renamed from: n */
            public final String mo37827n() {
                return C11010c.m22288i();
            }

            /* renamed from: b */
            public final String mo37815b() {
                return String.valueOf(C11010c.m22289j());
            }

            /* renamed from: d */
            public final String mo37817d() {
                return String.valueOf(C11010c.m22287h());
            }

            /* renamed from: f */
            public final String mo37819f() {
                return String.valueOf(C11010c.m22286g());
            }

            /* renamed from: k */
            public final String mo37824k() {
                String serverDeviceId = AppLog.getServerDeviceId();
                if (serverDeviceId == null) {
                    return "";
                }
                return serverDeviceId;
            }

            /* renamed from: h */
            public final String mo37821h() {
                StringBuilder sb = new StringBuilder();
                sb.append(C11010c.m22293n());
                return sb.toString();
            }

            /* renamed from: m */
            public final String mo37826m() {
                HashMap hashMap = new HashMap();
                AppLog.getSSIDs(hashMap);
                return (String) hashMap.get("openudid");
            }
        };
        aVar.f51898h = hashMap;
        aVar.f51899i = r0;
        boolean z2 = true;
        aVar.f51900j = true;
        if (C10181b.m20511a().mo18168a(SplashDownloadAsyncType.class, true, "splash_download_async_type", 31744, 0) == 0) {
            z2 = false;
        }
        aVar.f51907q = z2;
        aVar.f51902l = z;
        C18652i.m45256a(context, new C18764m(aVar));
    }
}
