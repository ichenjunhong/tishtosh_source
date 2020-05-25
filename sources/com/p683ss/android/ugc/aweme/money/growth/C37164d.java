package com.p683ss.android.ugc.aweme.money.growth;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47463i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.money.growth.d */
public final class C37164d {

    /* renamed from: g */
    public static boolean f94850g;

    /* renamed from: h */
    public static final C37164d f94851h = C37166b.f94859a;

    /* renamed from: i */
    public static final C37165a f94852i = new C37165a(null);

    /* renamed from: a */
    public UgAwemeActivitySetting f94853a;

    /* renamed from: b */
    public final List<C52671b<UgAwemeActivitySetting, C52860x>> f94854b;

    /* renamed from: c */
    public final C37162c f94855c;

    /* renamed from: d */
    public String f94856d;

    /* renamed from: e */
    public boolean f94857e;

    /* renamed from: f */
    public boolean f94858f;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.d$a */
    public static final class C37165a {
        private C37165a() {
        }

        /* renamed from: a */
        public static boolean m83404a() {
            return C37164d.f94850g;
        }

        /* renamed from: b */
        public static C37164d m83405b() {
            return C37164d.f94851h;
        }

        public /* synthetic */ C37165a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.d$b */
    static final class C37166b {

        /* renamed from: a */
        static final C37164d f94859a = new C37164d(null);

        /* renamed from: b */
        public static final C37166b f94860b = new C37166b();

        private C37166b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.d$c */
    static final class C37167c<T> implements C23522b<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ C37164d f94861a;

        C37167c(C37164d dVar) {
            this.f94861a = dVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo48682a(Object obj) {
            if (((Bitmap) obj) != null && this.f94861a.f94857e && !this.f94861a.f94858f) {
                C37164d.m83388b("素材准备好，自动展示弹窗");
                C37164d.m83392d();
            }
        }
    }

    /* renamed from: b */
    public static void m83388b(String str) {
        C52711k.m112240b(str, "msg");
    }

    /* renamed from: d */
    public static void m83392d() {
        C47718bf.m103288a(new C47463i());
    }

    /* renamed from: e */
    private final void m83393e() {
        this.f94857e = true;
        if (!this.f94858f) {
            m83388b("不是第一个视频，自动展示弹窗");
            m83392d();
        }
    }

    private C37164d() {
        this.f94854b = new ArrayList();
        this.f94855c = new C37162c();
        this.f94858f = true;
        mo76485a();
        this.f94856d = this.f94855c.f94848c;
    }

    /* renamed from: f */
    private final boolean m83394f() {
        UrlModel urlModel;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f94853a;
            if (ugAwemeActivitySetting != null) {
                UgChannelPopup channelPopup = ugAwemeActivitySetting.getChannelPopup();
                if (channelPopup != null) {
                    urlModel = channelPopup.getResourceUrl();
                    return m83389b(urlModel);
                }
            }
            urlModel = null;
            return m83389b(urlModel);
        } catch (C10174a unused) {
            return false;
        }
    }

    /* renamed from: h */
    private final boolean m83396h() {
        UrlModel urlModel;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f94853a;
            if (ugAwemeActivitySetting != null) {
                UgLoginBanner loginBanner = ugAwemeActivitySetting.getLoginBanner();
                if (loginBanner != null) {
                    urlModel = loginBanner.getResourceUrl();
                    return m83389b(urlModel);
                }
            }
            urlModel = null;
            return m83389b(urlModel);
        } catch (C10174a unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b A[Catch:{ a -> 0x0033 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m83395g() {
        /*
            r5 = this;
            java.lang.String r0 = "tryLoadCouponIconImage"
            m83388b(r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r5.f94853a     // Catch:{ a -> 0x0033 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton r0 = r0.getProfileActivityButton()     // Catch:{ a -> 0x0033 }
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r0 = r0.getResourceUrl()     // Catch:{ a -> 0x0033 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            boolean r2 = r5.m83389b(r0)     // Catch:{ a -> 0x0033 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ a -> 0x0033 }
            java.lang.String r4 = "加载结果："
            r3.<init>(r4)     // Catch:{ a -> 0x0033 }
            r3.append(r2)     // Catch:{ a -> 0x0033 }
            java.lang.String r2 = " resourceUrl:"
            r3.append(r2)     // Catch:{ a -> 0x0033 }
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = r0.getUri()     // Catch:{ a -> 0x0033 }
        L_0x002f:
            r3.append(r1)     // Catch:{ a -> 0x0033 }
            return
        L_0x0033:
            java.lang.String r0 = "tryLoadCouponIconImage:NullValueException"
            m83388b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.money.growth.C37164d.m83395g():void");
    }

    /* renamed from: b */
    public final boolean mo76489b() {
        Boolean valueOf = Boolean.valueOf(false);
        if (this.f94853a != null) {
            try {
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f94853a;
                if (ugAwemeActivitySetting != null) {
                    List activityTasks = ugAwemeActivitySetting.getActivityTasks();
                    if (activityTasks != null) {
                        valueOf = Boolean.valueOf(!activityTasks.isEmpty());
                    }
                }
                valueOf = null;
            } catch (C10174a unused) {
            }
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    /* renamed from: i */
    private final boolean m83397i() {
        CharSequence charSequence;
        if (this.f94855c.f94846a == 2) {
            m83388b("DeepLink不展示： 已展示过");
            return false;
        } else if (this.f94855c.f94846a == 1) {
            return true;
        } else {
            try {
                CharSequence charSequence2 = this.f94856d;
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f94853a;
                UgChannelPopup ugChannelPopup = null;
                if (ugAwemeActivitySetting != null) {
                    charSequence = ugAwemeActivitySetting.getActivityId();
                } else {
                    charSequence = null;
                }
                if (!TextUtils.equals(charSequence2, charSequence)) {
                    StringBuilder sb = new StringBuilder("DeepLink不展示： DeepLinkID != activityId--->");
                    sb.append(this.f94856d);
                    m83388b(sb.toString());
                    return false;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f94853a;
                if (ugAwemeActivitySetting2 != null) {
                    ugChannelPopup = ugAwemeActivitySetting2.getChannelPopup();
                }
                if (ugChannelPopup == null) {
                    m83388b("DeepLink不展示： channelPopup==null");
                    return false;
                }
                this.f94855c.mo76482a(1);
                return true;
            } catch (C10174a unused) {
                m83388b("DeepLink不展示： setting数据为null");
                return false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|3|4|(5:6|(2:8|(3:10|12|(1:14)))|11|12|(0))|15|16|(1:18)|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036 A[Catch:{ a -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[Catch:{ a -> 0x004d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76485a() {
        /*
            r2 = this;
            java.lang.String r0 = " initActivityEntry"
            m83388b(r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x004d }
            java.lang.String r1 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ a -> 0x004d }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r0.getAwemeActivitySetting()     // Catch:{ a -> 0x004d }
            r2.f94853a = r0     // Catch:{ a -> 0x004d }
            java.lang.String r0 = r2.f94856d     // Catch:{ a -> 0x003d }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x003d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ a -> 0x003d }
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f94853a     // Catch:{ a -> 0x003d }
            if (r0 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ a -> 0x003d }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r0.getCampaignName()     // Catch:{ a -> 0x003d }
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x003d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ a -> 0x003d }
            if (r0 != 0) goto L_0x003d
            com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$a$a r0 = com.p683ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi.C37150a.C37151a.f94824a     // Catch:{ a -> 0x003d }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ a -> 0x003d }
            p001a.C0013i.m16a(r0)     // Catch:{ a -> 0x003d }
        L_0x003d:
            boolean r0 = r2.m83397i()     // Catch:{ a -> 0x004d }
            if (r0 == 0) goto L_0x0049
            r2.m83394f()     // Catch:{ a -> 0x004d }
            r2.m83395g()     // Catch:{ a -> 0x004d }
        L_0x0049:
            r2.m83396h()     // Catch:{ a -> 0x004d }
            return
        L_0x004d:
            java.lang.String r0 = " initEntry 时NullValueException"
            m83388b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.money.growth.C37164d.mo76485a():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[Catch:{ a -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[Catch:{ a -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[Catch:{ a -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d A[Catch:{ a -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0075 A[Catch:{ a -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b A[Catch:{ a -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0093 A[Catch:{ a -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0099 A[Catch:{ a -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b7 A[Catch:{ a -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd A[Catch:{ a -> 0x00c7 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup mo76490c() {
        /*
            r2 = this;
            r0 = 0
            r2.f94858f = r0
            boolean r0 = f94850g
            r1 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "DeepLink不展示： setting接口未返回，啥都不干"
            m83388b(r0)
            return r1
        L_0x000e:
            boolean r0 = r2.m83397i()
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            boolean r0 = r2.m83394f()
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "DeepLink不展示： 素材未准备好"
            m83388b(r0)
            return r1
        L_0x0021:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f94853a     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r0.getButtonText()     // Catch:{ a -> 0x00c7 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x00c7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.buttonText is empty"
            m83388b(r0)     // Catch:{ a -> 0x00c7 }
            return r1
        L_0x003f:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f94853a     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r0.getContent()     // Catch:{ a -> 0x00c7 }
            goto L_0x004f
        L_0x004e:
            r0 = r1
        L_0x004f:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x00c7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.content is empty"
            m83388b(r0)     // Catch:{ a -> 0x00c7 }
            return r1
        L_0x005d:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f94853a     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.getTitle()     // Catch:{ a -> 0x00c7 }
            goto L_0x006d
        L_0x006c:
            r0 = r1
        L_0x006d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x00c7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.title is empty"
            m83388b(r0)     // Catch:{ a -> 0x00c7 }
            return r1
        L_0x007b:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f94853a     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r0.getH5Link()     // Catch:{ a -> 0x00c7 }
            goto L_0x008b
        L_0x008a:
            r0 = r1
        L_0x008b:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x00c7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.h5Link is empty"
            m83388b(r0)     // Catch:{ a -> 0x00c7 }
            return r1
        L_0x0099:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f94853a     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r0 = r0.getResourceUrl()     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x00ae
            java.util.List r0 = r0.getUrlList()     // Catch:{ a -> 0x00c7 }
            goto L_0x00af
        L_0x00ae:
            r0 = r1
        L_0x00af:
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ a -> 0x00c7 }
            boolean r0 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r0)     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.resourceUrl is empty"
            m83388b(r0)     // Catch:{ a -> 0x00c7 }
            return r1
        L_0x00bd:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f94853a     // Catch:{ a -> 0x00c7 }
            if (r0 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ a -> 0x00c7 }
            return r0
        L_0x00c6:
            return r1
        L_0x00c7:
            java.lang.String r0 = "DeepLink不展示： setting channelPopup 字段为空"
            m83388b(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.money.growth.C37164d.mo76490c():com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup");
    }

    public /* synthetic */ C37164d(C52707g gVar) {
        this();
    }

    /* renamed from: b */
    private final boolean m83389b(UrlModel urlModel) {
        com.p683ss.android.ugc.aweme.base.model.UrlModel c = m83390c(urlModel);
        if (mo76487a(urlModel)) {
            return true;
        }
        C23515d.m57666a(c, 0, 0, (C23522b<Bitmap>) new C37167c<Bitmap>(this));
        return false;
    }

    /* renamed from: c */
    private static com.p683ss.android.ugc.aweme.base.model.UrlModel m83390c(UrlModel urlModel) {
        List list;
        com.p683ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.p683ss.android.ugc.aweme.base.model.UrlModel();
        String str = null;
        if (urlModel != null) {
            try {
                list = urlModel.getUrlList();
            } catch (C10174a unused) {
            }
        } else {
            list = null;
        }
        urlModel2.setUrlList(list);
        if (urlModel != null) {
            str = urlModel.getUri();
        }
        urlModel2.setUri(str);
        return urlModel2;
    }

    /* renamed from: c */
    private final void m83391c(String str) {
        try {
            if (this.f94855c.f94846a != 2) {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                UgAwemeActivitySetting awemeActivitySetting = b.getAwemeActivitySetting();
                C52711k.m112236a((Object) awemeActivitySetting, "SettingsReader.get().awemeActivitySetting");
                Boolean isNewUser = awemeActivitySetting.getIsNewUser();
                String str2 = "old_user";
                C52711k.m112236a((Object) isNewUser, "isNewUser");
                if (isNewUser.booleanValue()) {
                    str2 = "new_user";
                }
                C26890h.m65011a("coupon_targetusers", new C23089d().mo47829a("media_source", str).mo47829a("user_type", str2).f61491a);
            }
        } catch (C10174a unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (android.text.TextUtils.equals(r7, r0) == false) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ a -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053 A[Catch:{ a -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[Catch:{ a -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c A[Catch:{ a -> 0x0093 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76486a(com.p683ss.android.ugc.aweme.money.growth.C37153a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "campaign"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r6.f94853a     // Catch:{ a -> 0x0093 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ a -> 0x0093 }
            if (r0 == 0) goto L_0x0015
            java.util.List r0 = r0.getCampaignList()     // Catch:{ a -> 0x0093 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            r2 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ a -> 0x0093 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ a -> 0x0093 }
            r3 = 0
        L_0x0020:
            boolean r4 = r0.hasNext()     // Catch:{ a -> 0x0093 }
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r0.next()     // Catch:{ a -> 0x0093 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ a -> 0x0093 }
            if (r3 != 0) goto L_0x003d
            java.lang.String r3 = r7.f94827b     // Catch:{ a -> 0x0093 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ a -> 0x0093 }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ a -> 0x0093 }
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch:{ a -> 0x0093 }
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            goto L_0x003e
        L_0x003d:
            r3 = 1
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ a -> 0x0093 }
            java.lang.String r5 = "hintGoogleCampaign："
            r4.<init>(r5)     // Catch:{ a -> 0x0093 }
            r4.append(r3)     // Catch:{ a -> 0x0093 }
            java.lang.String r4 = r4.toString()     // Catch:{ a -> 0x0093 }
            m83388b(r4)     // Catch:{ a -> 0x0093 }
            goto L_0x0020
        L_0x0050:
            r2 = r3
        L_0x0051:
            if (r2 != 0) goto L_0x006f
            java.lang.String r7 = r7.f94827b     // Catch:{ a -> 0x0093 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ a -> 0x0093 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r6.f94853a     // Catch:{ a -> 0x0093 }
            if (r0 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ a -> 0x0093 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r0.getCampaignName()     // Catch:{ a -> 0x0093 }
            goto L_0x0067
        L_0x0066:
            r0 = r1
        L_0x0067:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ a -> 0x0093 }
            boolean r7 = android.text.TextUtils.equals(r7, r0)     // Catch:{ a -> 0x0093 }
            if (r7 == 0) goto L_0x0093
        L_0x006f:
            java.lang.String r7 = "命中"
            m83388b(r7)     // Catch:{ a -> 0x0093 }
            java.lang.String r7 = "google"
            r6.m83391c(r7)     // Catch:{ a -> 0x0093 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r7 = r6.f94853a     // Catch:{ a -> 0x0093 }
            if (r7 == 0) goto L_0x0081
            java.lang.String r1 = r7.getActivityId()     // Catch:{ a -> 0x0093 }
        L_0x0081:
            r6.f94856d = r1     // Catch:{ a -> 0x0093 }
            r6.m83393e()     // Catch:{ a -> 0x0093 }
            boolean r7 = r6.m83397i()     // Catch:{ a -> 0x0093 }
            if (r7 == 0) goto L_0x0093
            r6.m83394f()     // Catch:{ a -> 0x0093 }
            r6.m83395g()     // Catch:{ a -> 0x0093 }
            return
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.money.growth.C37164d.mo76486a(com.ss.android.ugc.aweme.money.growth.a):void");
    }

    /* renamed from: a */
    public final boolean mo76487a(UrlModel urlModel) {
        com.p683ss.android.ugc.aweme.base.model.UrlModel c = m83390c(urlModel);
        if (C23715d.m58202a((Collection<T>) c.getUrlList()) || !C23515d.m57680a(Uri.parse((String) c.getUrlList().get(0)))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo76488a(String str) {
        StringBuilder sb = new StringBuilder("feacebook DeepLink:");
        sb.append(str);
        m83388b(sb.toString());
        CharSequence charSequence = str;
        if (TextUtils.indexOf(charSequence, "snssdk1233://growth_activity_dialog") != 0 && TextUtils.indexOf(charSequence, "snssdk1180://growth_activity_dialog") != 0) {
            return false;
        }
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "Uri.parse(scheme)");
        this.f94856d = parse.getLastPathSegment();
        StringBuilder sb2 = new StringBuilder("deepLinkRequestComplete:");
        sb2.append(str);
        m83388b(sb2.toString());
        m83391c("facebook");
        if (this.f94856d != null) {
            C37162c cVar = this.f94855c;
            String str2 = this.f94856d;
            if (str2 != null) {
                cVar.mo76483a(str2);
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.String");
            }
        }
        m83393e();
        if (m83397i()) {
            m83394f();
            m83395g();
        }
        return true;
    }

    /* renamed from: a */
    public static void m83387a(String str, Context context) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(context, "context");
        if (!C23794bh.m58408v().mo49242a(context, str, "client")) {
            SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
        }
    }
}
