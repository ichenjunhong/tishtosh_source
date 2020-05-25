package com.p683ss.android.ugc.aweme.splash;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13783a;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.view.C13848b;
import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p952c.C13877a;
import com.facebook.fresco.animation.p952c.C13882b;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.common.applog.GlobalContext;
import com.p683ss.android.p1103ad.splash.C18558c;
import com.p683ss.android.p1103ad.splash.C18721d;
import com.p683ss.android.p1103ad.splash.C18731f;
import com.p683ss.android.p1103ad.splash.C18757i;
import com.p683ss.android.p1103ad.splash.C18758j;
import com.p683ss.android.p1103ad.splash.C18759k;
import com.p683ss.android.p1103ad.splash.C18767n;
import com.p683ss.android.p1103ad.splash.C18769p;
import com.p683ss.android.p1103ad.splash.C18771r;
import com.p683ss.android.p1103ad.splash.C18772s;
import com.p683ss.android.p1103ad.splash.C18773t;
import com.p683ss.android.p1103ad.splash.C18773t.C18774a;
import com.p683ss.android.p1103ad.splash.C18776v;
import com.p683ss.android.p1103ad.splash.C18776v.C18777a;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18631b;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18640h;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18640h.C18641a;
import com.p683ss.android.p1103ad.splash.p1109a.C18547a;
import com.p683ss.android.p1103ad.splash.p1111c.C18559a;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import com.p683ss.android.p1147d.C18946h;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23098h;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.commercialize.abtest.AwesomeSplashFirstLaunchExperiment;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashEnableExperiment;
import com.p683ss.android.ugc.aweme.commercialize.abtest.SplashEnableValidTimeSetting;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.C25904e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26064ba;
import com.p683ss.android.ugc.aweme.commercialize.log.C26075d.C26076a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26081f;
import com.p683ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26227j;
import com.p683ss.android.ugc.aweme.commercialize.splash.SplashAdApi;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26443bw;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.lancet.C18994o;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35868f;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p2271sp.SharedPreferencesManager;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47776cn;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder */
public class SplashAdManagerHolder {

    /* renamed from: a */
    private static volatile boolean f115526a = false;

    /* renamed from: b */
    private static volatile C18769p f115527b = null;

    /* renamed from: c */
    private static volatile boolean f115528c = true;

    /* renamed from: d */
    private static volatile boolean f115529d;

    /* renamed from: e */
    private static Object f115530e = new Object();

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$SplashAdEventListenerImpl */
    static class SplashAdEventListenerImpl implements C18757i {

        /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$SplashAdEventListenerImpl$MobJobTask */
        class MobJobTask implements LegoTask {
            JSONObject extJson;
            long extValue;
            String label;
            String tag;
            long value;

            public C35896f process() {
                return C35894d.m81063a(this);
            }

            public C35898h type() {
                return C35898h.BOOT_FINISH;
            }

            public void run(Context context) {
                C32458a.m75144a("MobJobTask");
                C26890h.m65006a(context, this.tag, this.label, String.valueOf(this.value), this.extValue, this.extJson);
            }

            MobJobTask(String str, String str2, long j, long j2, JSONObject jSONObject) {
                this.tag = str;
                this.label = str2;
                this.value = j;
                this.extValue = j2;
                this.extJson = jSONObject;
            }
        }

        private SplashAdEventListenerImpl() {
        }

        /* renamed from: a */
        public final void mo38359a(C18547a aVar) {
            C26076a a = new C26076a().mo53564a(aVar.f51111b);
            a.f68861a = aVar.f51110a;
            C26076a a2 = a.mo53568b(aVar.f51112c).mo53563a(aVar.f51113d);
            a2.f68862b = aVar.f51114e;
            a2.mo53567b(aVar.f51115f).mo53565a(aVar.f51116g).mo53566a().mo53562a();
        }

        /* renamed from: a */
        public final void mo38360a(String str, String str2, long j, long j2, JSONObject jSONObject) {
            String str3;
            StringBuilder sb = new StringBuilder("onEvent :  tag = ");
            String str4 = str;
            sb.append(str);
            sb.append(" label = ");
            String str5 = str2;
            sb.append(str2);
            sb.append(" value = ");
            sb.append(j);
            sb.append(" ext_value = 0");
            sb.append(" extJson = ");
            if (jSONObject == null) {
                str3 = "";
            } else {
                str3 = jSONObject.toString();
            }
            sb.append(str3);
            C35868f b = C35857a.m81001b();
            MobJobTask mobJobTask = new MobJobTask(str, str2, j, 0, jSONObject);
            b.mo74526a(mobJobTask).mo74527a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$a */
    static class C45686a implements C18772s {
        private C45686a() {
        }

        /* renamed from: a */
        public final void mo38374a(ImageView imageView, String str, int i, C18759k kVar) {
            C26217c.m63502a().f69231h = false;
            if (!C18747l.m45742a(str)) {
                if (((long) i) == 1) {
                    Context a = C11010c.m22280a();
                    StringBuilder sb = new StringBuilder("file://");
                    sb.append(str);
                    C13783a c = ((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25757b(C14232c.m29169a(Uri.parse(sb.toString())).mo26449a())).mo25751a((C13791d<? super INFO>) new C13790c<C14045f>(kVar) {

                        /* renamed from: a */
                        final /* synthetic */ C18759k f115541a;

                        {
                            this.f115541a = r1;
                        }

                        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                            C14045f fVar = (C14045f) obj;
                            if (animatable != null) {
                                try {
                                    C13877a aVar = (C13877a) animatable;
                                    aVar.mo26024a((C13857a) new C45702a(aVar.f36202d, 1));
                                    aVar.mo26025a((C13882b) new C13882b() {
                                        /* renamed from: a */
                                        public final void mo26040a(C13877a aVar) {
                                        }

                                        /* renamed from: a */
                                        public final void mo26041a(C13877a aVar, int i) {
                                        }

                                        /* renamed from: c */
                                        public final void mo26043c(C13877a aVar) {
                                        }

                                        /* renamed from: b */
                                        public final void mo26042b(C13877a aVar) {
                                            C457001.this.f115541a.mo37920a();
                                        }
                                    });
                                    animatable.start();
                                } catch (Throwable th) {
                                    StringBuilder sb = new StringBuilder("frescoOpenGifSplashError: e = ");
                                    sb.append(th.toString());
                                    C47625i.m103103a(sb.toString());
                                    C32458a.m75148a(th);
                                }
                            }
                        }
                    })).mo25762c(false)).mo25763d();
                    C13848b a2 = C13848b.m28154a(new C13834b(a.getResources()).mo25912a(), a);
                    a2.mo25979a((C13842a) c);
                    imageView.setImageDrawable(a2.mo25985e());
                    return;
                }
                Context a3 = C11010c.m22280a();
                Bitmap a4 = SplashAdManagerHolder.m99457a(str, C9432q.m18670a(a3), C9432q.m18688b(a3));
                if (a4 != null) {
                    imageView.setImageBitmap(a4);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$b */
    static class C45687b implements C18776v {

        /* renamed from: a */
        SplashAdApi f115534a;

        /* renamed from: b */
        SplashAdApi f115535b;

        private C45687b() {
            this.f115534a = (SplashAdApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b, null).create(SplashAdApi.class);
            this.f115535b = (SplashAdApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(Api.f61282b).mo19927c(false).mo19925a().mo19930a(SplashAdApi.class);
        }

        /* renamed from: a */
        public final C18640h mo38377a(String str) {
            String d = RawURLGetter.m63087d();
            try {
                String a = C26081f.m63235a(str, System.currentTimeMillis(), d);
                StringBuilder sb = new StringBuilder("TrackUrlResponse_sendTrackUrl trackUrl = ");
                sb.append(a);
                C32458a.m75144a(sb.toString());
                return new C18641a().mo38054a(this.f115535b.executeGet(0, a, d).execute().mo23958a()).mo38055a(d).mo38056a();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) new C18994o(e));
                return new C18641a().mo38054a(-1).mo38055a(d).mo38056a();
            }
        }

        /* renamed from: b */
        public final C18773t mo38383b(String str) {
            try {
                StringBuilder sb = new StringBuilder("SplashAdResponse_sendStockUrl");
                sb.append(str);
                C32458a.m75144a(sb.toString());
                try {
                    return new C18773t(new C18774a().mo38376a(true).mo38375a(new JSONObject((String) this.f115534a.executeGet(0, str).execute().f33552b)));
                } catch (JSONException unused) {
                    return null;
                }
            } catch (Exception e) {
                C32458a.m75148a((Throwable) new C18994o(e));
                return null;
            }
        }

        /* renamed from: a */
        public final boolean mo38382a(String str, boolean z) {
            C35857a.m81001b().mo74526a(new SplashAdManagerHolder$SplashNetWorkImpl$1(this, str)).mo74527a();
            return false;
        }

        /* renamed from: a */
        public final C18773t mo38379a(String str, String str2) {
            String str3;
            if (C18747l.m45742a(str)) {
                return null;
            }
            try {
                String curUserId = C20902b.m53242a().getCurUserId();
                if (!TextUtils.isEmpty(curUserId)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("&user_id=");
                    sb.append(curUserId);
                    str = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("&gaid=");
                sb2.append(URLEncoder.encode(SplashAdManagerHolder.m99465b()));
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append("&android_id=");
                sb4.append(URLEncoder.encode(SplashAdManagerHolder.m99466c()));
                String sb5 = sb4.toString();
                String d = RawURLGetter.m63087d();
                if (!TextUtils.isEmpty(d)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append("&ad_user_agent=");
                    sb6.append(URLEncoder.encode(d));
                    sb5 = sb6.toString();
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb5);
                sb7.append("&cmpl_enc=");
                sb7.append(C40869c.m90379e());
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(Api.f61282b);
                sb9.append(sb8);
                String sb10 = sb9.toString();
                StringBuilder sb11 = new StringBuilder("SplashAdResponse_loadAdMessage url = ");
                sb11.append(sb10);
                C32458a.m75144a(sb11.toString());
                str3 = (String) this.f115534a.executeGet(0, sb10).execute().f33552b;
            } catch (Exception e) {
                C32458a.m75148a((Throwable) new C18994o(e));
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            try {
                return new C18773t(new C18774a().mo38376a(!TextUtils.isEmpty(str3)).mo38375a(new JSONObject(str3)));
            } catch (JSONException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final boolean mo38381a(String str, String str2, C18731f fVar) {
            if (C18747l.m45742a(str) || C18747l.m45742a(str2)) {
                return false;
            }
            if (new File(str2).exists()) {
                return true;
            }
            return SplashAdManagerHolder.m99463a(str, str2, fVar);
        }

        /* renamed from: a */
        public final void mo38380a(String str, String str2, C18731f fVar, C18777a aVar) {
            C456844 r0 = new IDownloadListener(aVar, fVar, str) {

                /* renamed from: a */
                final /* synthetic */ C18777a f115531a;

                /* renamed from: b */
                final /* synthetic */ C18731f f115532b;

                /* renamed from: c */
                final /* synthetic */ String f115533c;

                public final void onCanceled(DownloadInfo downloadInfo) {
                }

                public final void onFirstStart(DownloadInfo downloadInfo) {
                }

                public final void onFirstSuccess(DownloadInfo downloadInfo) {
                }

                public final void onPause(DownloadInfo downloadInfo) {
                }

                public final void onPrepare(DownloadInfo downloadInfo) {
                }

                public final void onProgress(DownloadInfo downloadInfo) {
                }

                public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                }

                public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                }

                public final void onStart(DownloadInfo downloadInfo) {
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    if (this.f115531a != null) {
                        this.f115531a.mo38139a();
                    }
                    C26227j.m63544b(true, Long.valueOf(this.f115532b.f51807a), this.f115532b.f51808b, null);
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    if (this.f115531a != null) {
                        this.f115531a.mo38140b();
                    }
                    C26227j.m63544b(false, Long.valueOf(this.f115532b.f51807a), this.f115532b.f51808b, baseException.getErrorMessage());
                }

                {
                    this.f115531a = r1;
                    this.f115532b = r2;
                    this.f115533c = r3;
                }
            };
            int lastIndexOf = str2.lastIndexOf("/") + 1;
            Downloader.with(GlobalContext.getContext()).url(str).savePath(str2.substring(0, lastIndexOf)).name(str2.substring(lastIndexOf)).showNotification(false).subThreadListener(r0).download();
        }

        /* renamed from: a */
        public final C18773t mo38378a(String str, int i, HashMap<String, String> hashMap, JSONObject jSONObject) {
            String str2;
            try {
                StringBuilder sb = new StringBuilder("SplashAdResponse_sendSplashAckUrl url path = ");
                sb.append(str);
                C32458a.m75144a(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Api.f61282b);
                sb2.append(str);
                String sb3 = sb2.toString();
                switch (3) {
                    case 1:
                        str2 = (String) this.f115534a.executeGet(0, sb3).execute().f33552b;
                        break;
                    case 2:
                        str2 = (String) this.f115534a.executePost(0, sb3, null).execute().f33552b;
                        break;
                    case 3:
                        str2 = (String) this.f115534a.executePost(0, sb3, (TypedOutput) new TypedByteArray("application/json", jSONObject.toString().getBytes("UTF-8"), new String[0])).execute().f33552b;
                        break;
                    default:
                        return null;
                }
                return new C18773t(new C18774a().mo38376a(true).mo38375a(new JSONObject(str2)));
            } catch (Exception e) {
                C32458a.m75148a((Throwable) new C18994o(e));
                return null;
            }
        }
    }

    /* renamed from: a */
    public static boolean m99462a() {
        m99471e();
        return f115528c;
    }

    /* renamed from: b */
    static String m99465b() {
        String str;
        try {
            str = I18nBridgeService.getBridgeService_Monster().getAdvertisingIdOb();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: c */
    static String m99466c() {
        String str;
        try {
            str = I18nBridgeService.getBridgeService_Monster().getAndroidId();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: d */
    public static long m99468d() {
        long a = C23098h.f61512f.mo47840a("splash_ad_preload");
        if (a != 60000 && a != 0) {
            return a;
        }
        try {
            return C32816h.m75716b().getSplashPreloadDelay().longValue();
        } catch (C10174a unused) {
            return 0;
        }
    }

    /* renamed from: e */
    private static void m99471e() {
        boolean z;
        if (!f115529d) {
            synchronized (f115530e) {
                if (!f115529d) {
                    if (!C32816h.m75716b().getEnableNormalSplashAd().booleanValue() || !C10181b.m20511a().mo18172a(NormalSplashEnableExperiment.class, true, "enable_normal_splash_ad_ab", 31744, true)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    f115528c = z;
                    f115529d = true;
                }
            }
        }
    }

    /* renamed from: a */
    public static C18769p m99458a(Context context) {
        m99467c(context);
        return f115527b;
    }

    /* renamed from: b */
    public static C18767n m99464b(Context context) {
        m99467c(context);
        return C18758j.m45768b(context);
    }

    /* renamed from: f */
    private static boolean m99472f(Context context) {
        return SharedPreferencesManager.getInstance().getSharedPreferences(context, "file_splash_ad_preload").getBoolean("key_splash_ad_preload_delay", true);
    }

    /* renamed from: c */
    private static void m99467c(Context context) {
        if (!f115526a) {
            synchronized (SplashAdManagerHolder.class) {
                if (!f115526a) {
                    m99469d(context);
                    f115527b = C18758j.m45767a(context);
                    m99460a(context.getApplicationContext(), f115527b);
                    f115526a = true;
                }
            }
        }
    }

    /* renamed from: e */
    private static String m99470e(Context context) throws Exception {
        System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(context.getPackageName());
        sb.append("/splashCache/");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m99459a(User user) {
        int i;
        int n = C40869c.m90383n();
        if (user.getUserMode() != -1) {
            i = user.getUserMode();
        } else {
            i = 0;
        }
        if (n == 2 || n == 0) {
            return Integer.toString(i | 4);
        }
        return Integer.toString(i);
    }

    /* renamed from: d */
    private static void m99469d(Context context) {
        HashMap hashMap = new HashMap();
        if (m99462a()) {
            User curUser = C20902b.m53242a().getCurUser();
            if (curUser != null) {
                hashMap.put("user_mode", m99459a(curUser));
                hashMap.put("user_period", Integer.toString(curUser.getUserPeriod()));
            }
        }
        C26443bw.m63931a(context, hashMap, m99462a());
    }

    /* renamed from: a */
    private static void m99460a(Context context, C18769p pVar) {
        long j;
        long j2;
        try {
            j = C32816h.m75716b().getSplashStockDelayMillisTime().longValue();
            try {
                long a = C23098h.f61512f.mo47840a("splash_stock");
                if (a != 60000) {
                    j = a;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 2000;
        }
        boolean f = m99472f(context);
        C18771r rVar = C45703l.f115544a;
        int j3 = C11010c.m22289j();
        C18769p a2 = pVar.mo38107c(((Boolean) C23183v.m56778a().mo47920p().mo47782d()).booleanValue()).mo38095a((C18772s) new C45686a()).mo38096a((C18776v) new C45687b()).mo38099a(C10181b.m20511a().mo18172a(AwesomeSplashFirstLaunchExperiment.class, true, "aweme_splash_first_launch_enabled", 31744, true)).mo38088a(TimeUnit.DAYS.toMillis(10)).mo38106c(j).mo38087a(2).mo38117f(true).mo38093a((C18757i) new SplashAdEventListenerImpl());
        if (f) {
            j2 = 15000;
        } else {
            j2 = m99468d();
        }
        a2.mo38102b(j2).mo38094a(rVar).mo38119g(C10193n.m20607a().mo18204a(SplashEnableValidTimeSetting.class, "enable_splash_valid_time_check", C10181b.m20511a().mo18175c().getEnableSplashValidTimeCheck(), false)).mo38098a(new JSONArray(C32816h.m75716b().getSplashSwitchServerList()), false, j3).mo38103b(false).mo38113e(C32816h.m75716b().getUseNewSplashView().booleanValue()).mo38089a((C18558c) new C18558c() {
            /* renamed from: a */
            public final void mo37854a(List<? extends C18559a> list) {
                boolean z;
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C0013i.m16a((Callable<TResult>) new C25904e<TResult>(list));
                }
            }
        });
        pVar.mo38092a((C18721d) new C18721d() {
            /* renamed from: a */
            public final boolean mo38334a(C18559a aVar) {
                if (C47915gg.m103651b()) {
                    C26447bz.f69708a.mo54163b("儿童模式不展示广告");
                    return false;
                } else if (!aVar.mo37860L() || C40869c.m90383n() != 0) {
                    return true;
                } else {
                    C26447bz.f69708a.mo54163b("个性化展示关闭，不展示广告");
                    return false;
                }
            }
        });
        if (C26060ay.m63139a()) {
            pVar.mo38091a((C18631b) C26064ba.f68834a);
        }
        m99461a(context, pVar, f);
        C26443bw.m63930a(context, pVar);
        try {
            pVar.mo38097a(m99470e(context), true);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
        ((Boolean) C23183v.m56778a().mo47918n().mo47782d()).booleanValue();
        ((Boolean) C23183v.m56778a().mo47919o().mo47782d()).booleanValue();
        C18758j.m45769c(context).mo38112d(R.drawable.bc2).mo38108c(R.style.mx).mo38118f(R.drawable.bc3).mo38114e(R.string.dma).mo38120g(R.string.dm_).mo38124i(1).mo38123h(1).mo38100a(false, 0);
    }

    /* renamed from: a */
    private static int m99456a(Options options, int i, int i2) {
        int i3 = options.outWidth / 2;
        int i4 = options.outHeight / 2;
        int i5 = 1;
        while (i3 / i5 >= i && i4 / i5 >= i2) {
            i5 *= 2;
        }
        return i5;
    }

    /* renamed from: a */
    public static Bitmap m99457a(String str, int i, int i2) {
        Bitmap bitmap;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            return BitmapFactory.decodeFile(str);
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m99456a(options, i, i2);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        try {
            bitmap = BitmapFactory.decodeFile(str, options);
        } catch (Exception unused) {
            bitmap = decodeFile;
        }
        return bitmap;
    }

    /* renamed from: a */
    private static void m99461a(Context context, final C18769p pVar, boolean z) {
        if (z) {
            C35857a.m81001b().mo74526a(new LegoTask() {
                public final C35896f process() {
                    return C35894d.m81063a(this);
                }

                public final C35898h type() {
                    return C35898h.BOOT_FINISH;
                }

                public final void run(Context context) {
                    pVar.mo38102b(SplashAdManagerHolder.m99468d());
                }
            });
            SharedPreferencesManager.getInstance().getSharedPreferences(context, "file_splash_ad_preload").edit().putBoolean("key_splash_ad_preload_delay", false).apply();
        }
    }

    /* renamed from: a */
    public static boolean m99463a(String str, String str2, C18731f fVar) {
        boolean z;
        boolean z2;
        String str3 = str;
        String str4 = str2;
        C18731f fVar2 = fVar;
        File file = new File(str4);
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(".tmp");
        String sb2 = sb.toString();
        try {
            if (TextUtils.isEmpty(sb2)) {
                z2 = true;
                z = false;
            } else {
                int lastIndexOf = sb2.lastIndexOf("/") + 1;
                String substring = sb2.substring(lastIndexOf);
                String substring2 = sb2.substring(0, lastIndexOf);
                C47776cn cnVar = C47776cn.f120296a;
                Context a = C11010c.m22280a();
                C52711k.m112240b(a, "context");
                C52711k.m112240b(str3, "url");
                C52711k.m112240b(substring2, "dir");
                C52711k.m112240b(substring, LeakCanaryFileProvider.f132049i);
                C52711k.m112240b(a, "context");
                C52711k.m112240b(str3, "url");
                C52711k.m112240b(substring2, "dir");
                C52711k.m112240b(substring, LeakCanaryFileProvider.f132049i);
                List extractImageUrlList = C18946h.extractImageUrlList(str3, null);
                C52711k.m112236a((Object) extractImageUrlList, "ImageInfo.extractImageUrlList(url, urlList)");
                z2 = true;
                z = C47776cn.m103402a(a, -1, str, extractImageUrlList, substring2, "", substring, null, substring, null);
            }
            if (z) {
                File file2 = new File(sb2);
                if (file2.renameTo(file)) {
                    C26227j.m63543a(z2, Long.valueOf(fVar2.f51807a), fVar2.f51808b, (String) null);
                    return z2;
                }
                if (file2.exists()) {
                    file2.delete();
                }
                C26227j.m63543a(false, Long.valueOf(fVar2.f51807a), fVar2.f51808b, (String) null);
                return false;
            }
        } catch (Throwable th) {
            C26227j.m63543a(false, Long.valueOf(fVar2.f51807a), fVar2.f51808b, th.getMessage());
        }
        return false;
    }
}
