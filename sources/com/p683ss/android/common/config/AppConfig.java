package com.p683ss.android.common.config;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Address;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.common.util.C18917d;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18906c;
import com.p683ss.android.http.p1169a.C19184c;
import com.p683ss.android.http.p1169a.p1170a.p1171a.C19172a;
import com.p683ss.android.linkselector.LinkSelector;
import com.p683ss.android.linkselector.LinkSelector.NetworkChangeReceiver;
import com.p683ss.android.linkselector.p1176b.C19202b;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.lego.p1915c.C35890a;
import com.p683ss.android.ugc.aweme.net.experiment.LinkSelectorTypeExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* renamed from: com.ss.android.common.config.AppConfig */
public class AppConfig implements C9382a, C18906c {
    private static String[] CONFIG_SERVERS = {"dm.toutiao.com", "dm.bytedance.com", "dm.pstatp.com"};
    private static String DOMAIN_CONFIG_URL = "";
    private static AppConfig mInstance;
    private static int sShuffleDns = -1;
    private Address address = null;
    private boolean isDebug = false;
    private boolean isEnableLinkSelector = false;
    private boolean isFirstActivityCreate;
    private boolean isTryInitFailed;
    private final Context mContext;
    private List<String> mCookieShareHostList = new ArrayList();
    private HashMap<String, InetAddress[]> mDnsMap;
    private boolean mEnableLocation = true;
    private boolean mForceChanged = true;
    final C9381g mHandler = new C9381g(Looper.getMainLooper(), this);
    private HashMap<String, List<ConnectHost>> mHostMap = new HashMap<>();
    private final boolean mIsMainProcess;
    private long mLastRefreshTime;
    private long mLastTryRefreshTime;
    private HashMap<String, List<C19202b>> mLinkHostMap = new HashMap<>();
    private long mLinkOptInterval = 300;
    private HashMap<Pattern, String> mLinkPathMap = new LinkedHashMap();
    private boolean mLoading;
    private volatile boolean mLocalLoaded;
    private HashMap<Pattern, String> mPathHostGroupMap = new LinkedHashMap();
    private HashMap<String, List<ConnectHost>> mUIHostMap = new HashMap<>();
    private HashMap<Pattern, String> mUiPathHostGroupMap = new LinkedHashMap();
    private boolean mUseHttps = true;
    private boolean mUseLinkSelector = true;

    /* renamed from: com.ss.android.common.config.AppConfig$_lancet */
    class _lancet {
        private _lancet() {
        }

        static boolean com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo(Context context) {
            try {
                return C23718g.m58207b().mo49153d();
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r9v0, types: [java.util.List, java.util.List<java.lang.String>] */
        /* renamed from: com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_inCookieHostList */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static boolean m46002xa5c485d2(com.p683ss.android.common.config.AppConfig r7, java.lang.String r8, java.util.List<java.lang.String> r9) {
            /*
                r7 = 0
                boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ Throwable -> 0x006a }
                if (r0 != 0) goto L_0x006a
                boolean r0 = com.bytedance.common.utility.C9414h.m18630a(r9)     // Catch:{ Throwable -> 0x006a }
                if (r0 == 0) goto L_0x000e
                goto L_0x006a
            L_0x000e:
                com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ Throwable -> 0x006a }
                java.lang.Class<com.ss.android.ugc.aweme.experiment.UseCookieSyncExperiment> r2 = com.p683ss.android.ugc.aweme.experiment.UseCookieSyncExperiment.class
                r3 = 1
                java.lang.String r4 = "is_use_cookie_sync"
                r5 = 31744(0x7c00, float:4.4483E-41)
                r6 = 1
                boolean r0 = r1.mo18172a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x006a }
                r1 = 1
                if (r0 == 0) goto L_0x004d
                com.ss.android.ugc.aweme.app.AwemeApplication r0 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()     // Catch:{ Throwable -> 0x006a }
                com.ss.android.common.config.AppConfig r0 = com.p683ss.android.common.config.AppConfig.getInstance(r0)     // Catch:{ Throwable -> 0x006a }
                monitor-enter(r0)     // Catch:{ Throwable -> 0x006a }
                java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x004a }
            L_0x002e:
                boolean r2 = r9.hasNext()     // Catch:{ all -> 0x004a }
                if (r2 == 0) goto L_0x0048
                java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x004a }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x004a }
                boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ all -> 0x004a }
                if (r3 != 0) goto L_0x002e
                boolean r2 = r8.endsWith(r2)     // Catch:{ all -> 0x004a }
                if (r2 == 0) goto L_0x002e
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return r1
            L_0x0048:
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return r7
            L_0x004a:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                throw r8     // Catch:{ Throwable -> 0x006a }
            L_0x004d:
                java.util.Iterator r9 = r9.iterator()     // Catch:{ Throwable -> 0x006a }
            L_0x0051:
                boolean r0 = r9.hasNext()     // Catch:{ Throwable -> 0x006a }
                if (r0 == 0) goto L_0x006a
                java.lang.Object r0 = r9.next()     // Catch:{ Throwable -> 0x006a }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x006a }
                boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x006a }
                if (r2 != 0) goto L_0x0051
                boolean r0 = r8.endsWith(r0)     // Catch:{ Throwable -> 0x006a }
                if (r0 == 0) goto L_0x0051
                return r1
            L_0x006a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.config.AppConfig._lancet.m46002xa5c485d2(com.ss.android.common.config.AppConfig, java.lang.String, java.util.List):boolean");
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_tryRefreshConfig */
        static void m46003x6dfbc865(AppConfig appConfig, boolean z) {
            int i;
            if (C35890a.m81058a(C11010c.m22280a())) {
                i = Keva.getRepo("ab_repo_cold_boot").getInt("link_selector_type", 1);
            } else {
                i = C10181b.m20511a().mo18168a(LinkSelectorTypeExperiment.class, true, "link_selector_type", 31744, 1);
            }
            if (i != 1) {
                appConfig.tryRefreshConfig$___twin___(z);
            }
        }
    }

    private boolean inCookieHostList(String str, List list) {
        return _lancet.m46002xa5c485d2(this, str, list);
    }

    public String filterUrlOnUIThread(String str) {
        return str;
    }

    public boolean isEnableLinkSelector() {
        return this.isEnableLinkSelector;
    }

    public void tryRefreshConfig(boolean z) {
        _lancet.m46003x6dfbc865(this, z);
    }

    public void tryRefreshConfig() {
        tryRefreshConfig(false);
    }

    public void setFirstActivityCreate() {
        if (!this.isFirstActivityCreate) {
            this.isFirstActivityCreate = true;
            if (this.isTryInitFailed) {
                initLinkSelector();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void tryLoadDomainConfig4OtherProcess() {
        if (System.currentTimeMillis() - this.mLastRefreshTime > 3600000) {
            this.mLastRefreshTime = System.currentTimeMillis();
            try {
                extractPathHostMapping(C18917d.m46043a(this.mContext, 2));
            } catch (Exception unused) {
            }
        }
    }

    private void initLinkSelector() {
        if (!this.isFirstActivityCreate) {
            this.isTryInitFailed = true;
            return;
        }
        this.isTryInitFailed = false;
        LinkSelector a = LinkSelector.m46791a(this.mContext);
        a.f52900a = this.isEnableLinkSelector;
        long j = this.mLinkOptInterval * 1000;
        if (j < 60000) {
            j = 60000;
        }
        a.f52902c = j;
        HashMap<String, List<C19202b>> hashMap = this.mLinkHostMap;
        HashMap<Pattern, String> hashMap2 = this.mLinkPathMap;
        a.mo39178a((Map<String, List<C19202b>>) hashMap);
        a.mo39180b((Map<Pattern, String>) hashMap2);
        Context context = LinkSelector.f52898f;
        if (context != null && a.f52901b == null) {
            a.f52901b = new NetworkChangeReceiver();
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            Context applicationContext = context.getApplicationContext();
            LinkSelector.f52898f = applicationContext;
            applicationContext.registerReceiver(a.f52901b, intentFilter);
        }
        a.f52903d = 10000;
        a.mo39175a((C19198a) null);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0087 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void tryLoadLocalConfig() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.mLocalLoaded     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r10)
            return
        L_0x0007:
            r0 = 1
            r10.mLocalLoaded = r0     // Catch:{ all -> 0x008c }
            android.content.Context r0 = r10.mContext     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "smart_network_select"
            r2 = 0
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0, r1, r2)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "config_mapping"
            r3 = 0
            java.lang.String r1 = r0.getString(r1, r3)     // Catch:{ all -> 0x008c }
            java.lang.String r4 = "domain_cookie_share_mapping"
            java.lang.String r4 = r0.getString(r4, r3)     // Catch:{ all -> 0x008c }
            java.lang.String r5 = "domain_group_host_list"
            java.lang.String r5 = r0.getString(r5, r3)     // Catch:{ all -> 0x008c }
            java.lang.String r6 = "is_enable_selector"
            boolean r2 = r0.getBoolean(r6, r2)     // Catch:{ all -> 0x008c }
            r10.isEnableLinkSelector = r2     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "link_opt_interval"
            r6 = 300(0x12c, double:1.48E-321)
            long r6 = r0.getLong(r2, r6)     // Catch:{ all -> 0x008c }
            r10.mLinkOptInterval = r6     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "last_refresh_time"
            r6 = 0
            long r6 = r0.getLong(r2, r6)     // Catch:{ all -> 0x008c }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x008c }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0049
            r6 = r8
        L_0x0049:
            r10.mLastRefreshTime = r6     // Catch:{ all -> 0x008c }
            r10.extractPathHostMapping(r1)     // Catch:{ all -> 0x008c }
            r10.extractDomainList(r4)     // Catch:{ all -> 0x008c }
            r10.extractHostMap(r5)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "static_dns_mapping"
            java.lang.String r1 = r0.getString(r1, r3)     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "shuffle_dns"
            r3 = -1
            int r2 = r0.getInt(r2, r3)     // Catch:{ all -> 0x008c }
            sShuffleDns = r2     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "use_dns_mapping"
            int r0 = r0.getInt(r2, r3)     // Catch:{ all -> 0x008c }
            com.p683ss.android.common.util.NetworkUtils.setUseDnsMapping(r0)     // Catch:{ all -> 0x008c }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x008c }
            r0.<init>()     // Catch:{ all -> 0x008c }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ all -> 0x008c }
            if (r2 != 0) goto L_0x0087
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0087 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0087 }
            com.p683ss.android.common.config.AppConfigParser.parseDnsMap(r0, r2)     // Catch:{ Exception -> 0x0087 }
            monitor-enter(r10)     // Catch:{ Exception -> 0x0087 }
            r10.mDnsMap = r0     // Catch:{ all -> 0x0084 }
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            goto L_0x0087
        L_0x0084:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ Exception -> 0x0087 }
        L_0x0087:
            r10.initLinkSelector()     // Catch:{ all -> 0x008c }
            monitor-exit(r10)
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.config.AppConfig.tryLoadLocalConfig():void");
    }

    public static void setConfigServers(String[] strArr) {
        CONFIG_SERVERS = strArr;
    }

    public static void setDomainConfigUrl(String str) {
        DOMAIN_CONFIG_URL = str;
    }

    public void setAddress(Address address2) {
        this.address = address2;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    public void setEnableLocation(boolean z) {
        this.mEnableLocation = z;
    }

    public void setUseHttps(boolean z) {
        this.mUseHttps = z;
    }

    public void setUseLinkSelector(boolean z) {
        this.mUseLinkSelector = z;
    }

    public static void onActivityResume(Context context) {
        AppConfig appConfig = mInstance;
        if (appConfig != null) {
            appConfig.tryRefreshConfig(true);
        }
    }

    private void doRefresh(final boolean z) {
        this.mLoading = true;
        if (z) {
            this.mLastTryRefreshTime = System.currentTimeMillis();
        }
        new Thread("AppConfigThread") {
            public void run() {
                AppConfig.this.updateConfig(z);
            }
        }.start();
    }

    private void extractDomainList(String str) {
        if (!C9431p.m18664a(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                if (AppConfigParser.parseCookieShareDomain(arrayList, jSONArray)) {
                    this.mCookieShareHostList = arrayList;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static AppConfig getInstance(Context context) {
        AppConfig appConfig;
        synchronized (AppConfig.class) {
            if (mInstance == null) {
                AppConfig appConfig2 = new AppConfig(context.getApplicationContext(), C18920g.m46048a(context));
                mInstance = appConfig2;
                NetworkUtils.setApiRequestInterceptor(appConfig2);
            }
            appConfig = mInstance;
        }
        return appConfig;
    }

    public List<String> getShareCookieHostList(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            List<String> list = this.mCookieShareHostList;
            if (inCookieHostList(str, list)) {
                return list;
            }
            return null;
        }
    }

    private void extractHostMap(String str) {
        if (!C9431p.m18664a(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                HashMap<String, List<ConnectHost>> hashMap = new HashMap<>();
                HashMap<String, List<C19202b>> hashMap2 = new HashMap<>();
                if (AppConfigParser.parseHostMap(hashMap, jSONArray, hashMap2)) {
                    this.mHostMap = hashMap;
                    this.mLinkHostMap = hashMap2;
                    HashMap<String, List<ConnectHost>> hashMap3 = new HashMap<>();
                    hashMap3.putAll(hashMap);
                    this.mUIHostMap = hashMap3;
                }
            } catch (Exception unused) {
            }
        }
    }

    private void extractPathHostMapping(String str) {
        if (!C9431p.m18664a(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (AppConfigParser.parsePathHostMap(linkedHashMap, jSONArray, linkedHashMap2)) {
                    this.mPathHostGroupMap = linkedHashMap;
                    this.mLinkPathMap = linkedHashMap2;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.putAll(linkedHashMap);
                    this.mUiPathHostGroupMap = linkedHashMap3;
                }
            } catch (Exception unused) {
            }
        }
    }

    private String filterUrlForDebug(String str) {
        String str2;
        URI create = URI.create(str);
        if (!this.isDebug) {
            return str;
        }
        if (this.mUseHttps) {
            str2 = WebKitApi.SCHEME_HTTPS;
        } else {
            str2 = WebKitApi.SCHEME_HTTP;
        }
        try {
            return C19172a.m46741a(create, new C19184c(create.getHost(), create.getPort(), str2)).toString();
        } catch (URISyntaxException unused) {
            return str;
        }
    }

    public void handleMsg(Message message) {
        switch (message.what) {
            case BaseNotice.HASHTAG /*101*/:
                this.mLoading = false;
                this.mLastRefreshTime = System.currentTimeMillis();
                if (this.mForceChanged) {
                    tryRefreshConfig();
                    return;
                }
                break;
            case 102:
                this.mLoading = false;
                if (this.mForceChanged) {
                    tryRefreshConfig();
                    break;
                }
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.net.InetAddress> resolveInetAddresses(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r3)
            r1 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r2.mIsMainProcess
            if (r0 != 0) goto L_0x000c
            goto L_0x003e
        L_0x000c:
            r2.tryLoadLocalConfig()
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.mDnsMap     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x001d
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.mDnsMap     // Catch:{ all -> 0x003b }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x003b }
            java.net.InetAddress[] r3 = (java.net.InetAddress[]) r3     // Catch:{ all -> 0x003b }
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            if (r3 == 0) goto L_0x0039
            int r0 = r3.length     // Catch:{ all -> 0x003b }
            if (r0 > 0) goto L_0x0024
            goto L_0x0039
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ all -> 0x003b }
            r0.addAll(r3)     // Catch:{ all -> 0x003b }
            int r3 = sShuffleDns     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0037
            java.util.Collections.shuffle(r0)     // Catch:{ all -> 0x003b }
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return r0
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return r1
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.config.AppConfig.resolveInetAddresses(java.lang.String):java.util.List");
    }

    public void tryRefreshConfig$___twin___(boolean z) {
        if (TextUtils.isEmpty(DOMAIN_CONFIG_URL)) {
            throw new RuntimeException("must called setDomainConfigUrl method before tryRefreshConfig!");
        } else if (this.mIsMainProcess) {
            tryRefreshDomainConfig(z);
        } else {
            if (this.mLastRefreshTime <= 0) {
                try {
                    new C9393e("LoadDomainConfig4Other-Thread") {
                        public void run() {
                            AppConfig.this.tryLoadDomainConfig4OtherProcess();
                        }
                    }.start();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void tryRefreshDomainConfig(boolean z) {
        long j;
        if (!this.mLoading) {
            if (this.mForceChanged) {
                this.mForceChanged = false;
                this.mLastRefreshTime = 0;
                this.mLastTryRefreshTime = 0;
            }
            if (z) {
                j = 10800000;
            } else {
                j = 43200000;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastRefreshTime > j && currentTimeMillis - this.mLastTryRefreshTime > 120000) {
                boolean com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo = _lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo(this.mContext);
                if (!this.mLocalLoaded || com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo) {
                    doRefresh(com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo);
                }
            }
        }
    }

    public String filterUrl(String str) {
        if (C9431p.m18664a(str) || !this.mUseLinkSelector) {
            return str;
        }
        if (LinkSelector.m46790a().mo39181b()) {
            return filterUrlForDebug(LinkSelector.m46790a().mo39174a(str));
        }
        try {
            String filterUrlForDebug = filterUrlForDebug(str);
            try {
                URI create = URI.create(filterUrlForDebug);
                String host = create.getHost();
                int port = create.getPort();
                String scheme = create.getScheme();
                for (String equals : CONFIG_SERVERS) {
                    if (equals.equals(host)) {
                        return filterUrlForDebug;
                    }
                }
                if (this.mIsMainProcess) {
                    tryLoadLocalConfig();
                } else {
                    tryLoadDomainConfig4OtherProcess();
                }
                String str2 = "";
                synchronized (this) {
                    ConnectHost findBestConnectHost = findBestConnectHost(filterUrlForDebug, this.mHostMap);
                    if (findBestConnectHost != null) {
                        str2 = findBestConnectHost.getHost();
                        scheme = findBestConnectHost.getSchema();
                    }
                }
                if (!C9431p.m18664a(str2)) {
                    str = C19172a.m46741a(create, new C19184c(str2, port, scheme)).toString();
                    return str;
                }
            } catch (Throwable unused) {
            }
            str = filterUrlForDebug;
        } catch (Throwable unused2) {
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f2 A[Catch:{ Exception -> 0x0204 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f3 A[Catch:{ Exception -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0198 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateConfig(boolean r18) {
        /*
            r17 = this;
            r1 = r17
            r17.tryLoadLocalConfig()
            r2 = 102(0x66, float:1.43E-43)
            if (r18 != 0) goto L_0x000f
            com.bytedance.common.utility.b.g r0 = r1.mHandler
            r0.sendEmptyMessage(r2)
            return
        L_0x000f:
            java.lang.String[] r3 = CONFIG_SERVERS
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x0014:
            if (r6 >= r4) goto L_0x020f
            r0 = r3[r6]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x020b }
            r7.<init>()     // Catch:{ Throwable -> 0x020b }
            java.lang.String r8 = "https://"
            r7.append(r8)     // Catch:{ Throwable -> 0x020b }
            r7.append(r0)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r0 = DOMAIN_CONFIG_URL     // Catch:{ Throwable -> 0x020b }
            r7.append(r0)     // Catch:{ Throwable -> 0x020b }
            boolean r0 = r1.mEnableLocation     // Catch:{ Throwable -> 0x020b }
            if (r0 == 0) goto L_0x0070
            android.location.Address r0 = r1.address     // Catch:{ Throwable -> 0x020b }
            if (r0 == 0) goto L_0x0070
            android.location.Address r0 = r1.address     // Catch:{ Throwable -> 0x020b }
            if (r0 == 0) goto L_0x0070
            boolean r8 = r0.hasLatitude()     // Catch:{ Throwable -> 0x020b }
            if (r8 == 0) goto L_0x0070
            boolean r8 = r0.hasLongitude()     // Catch:{ Throwable -> 0x020b }
            if (r8 == 0) goto L_0x0070
            java.lang.String r8 = "?latitude="
            r7.append(r8)     // Catch:{ Throwable -> 0x020b }
            double r8 = r0.getLatitude()     // Catch:{ Throwable -> 0x020b }
            r7.append(r8)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r8 = "&longitude="
            r7.append(r8)     // Catch:{ Throwable -> 0x020b }
            double r8 = r0.getLongitude()     // Catch:{ Throwable -> 0x020b }
            r7.append(r8)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r0 = r0.getLocality()     // Catch:{ Throwable -> 0x020b }
            boolean r8 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x020b }
            if (r8 != 0) goto L_0x0070
            java.lang.String r8 = "&city="
            r7.append(r8)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r0 = android.net.Uri.encode(r0)     // Catch:{ Throwable -> 0x020b }
            r7.append(r0)     // Catch:{ Throwable -> 0x020b }
        L_0x0070:
            com.ss.android.http.a.b.f r0 = new com.ss.android.http.a.b.f     // Catch:{ Throwable -> 0x020b }
            r0.<init>()     // Catch:{ Throwable -> 0x020b }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x020b }
            r8 = 8192(0x2000, float:1.14794E-41)
            r10 = 0
            r11 = 1
            r12 = 0
            r14 = 1
            r9 = r7
            r13 = r0
            java.lang.String r8 = com.p683ss.android.common.util.NetworkUtils.executeGet(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x020b }
            boolean r9 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ Throwable -> 0x020b }
            if (r9 == 0) goto L_0x008d
            goto L_0x020b
        L_0x008d:
            java.lang.String r9 = "X-SS-SIGN"
            com.ss.android.http.a.a r0 = r0.mo39139b(r9)     // Catch:{ Throwable -> 0x020b }
            if (r0 == 0) goto L_0x020b
            java.lang.String r9 = r0.mo39117b()     // Catch:{ Throwable -> 0x020b }
            boolean r9 = com.bytedance.common.utility.C9431p.m18664a(r9)     // Catch:{ Throwable -> 0x020b }
            if (r9 == 0) goto L_0x00a1
            goto L_0x020b
        L_0x00a1:
            java.lang.String r0 = r0.mo39117b()     // Catch:{ Throwable -> 0x020b }
            boolean r0 = com.p683ss.android.common.config.RequestValidator.checkSSSign(r7, r0, r8)     // Catch:{ Throwable -> 0x020b }
            if (r0 != 0) goto L_0x00ad
            goto L_0x020b
        L_0x00ad:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x020b }
            r0.<init>(r8)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r7 = "status_code"
            int r7 = r0.optInt(r7)     // Catch:{ Throwable -> 0x020b }
            if (r7 == 0) goto L_0x00bc
            goto L_0x020b
        L_0x00bc:
            java.lang.String r7 = "data"
            org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r7 = "enable_link_select"
            boolean r7 = r0.optBoolean(r7)     // Catch:{ Throwable -> 0x020b }
            r1.isEnableLinkSelector = r7     // Catch:{ Throwable -> 0x020b }
            java.lang.String r7 = "speed_interval"
            long r7 = r0.optLong(r7)     // Catch:{ Throwable -> 0x020b }
            r1.mLinkOptInterval = r7     // Catch:{ Throwable -> 0x020b }
            java.lang.String r7 = "path_control"
            org.json.JSONArray r7 = r0.optJSONArray(r7)     // Catch:{ Throwable -> 0x020b }
            if (r7 != 0) goto L_0x00df
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Throwable -> 0x020b }
            r7.<init>()     // Catch:{ Throwable -> 0x020b }
        L_0x00df:
            java.lang.String r8 = "all_hosts"
            org.json.JSONArray r8 = r0.optJSONArray(r8)     // Catch:{ Throwable -> 0x020b }
            if (r8 != 0) goto L_0x00ec
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Throwable -> 0x020b }
            r8.<init>()     // Catch:{ Throwable -> 0x020b }
        L_0x00ec:
            java.lang.String r9 = "union_domain"
            org.json.JSONArray r9 = r0.optJSONArray(r9)     // Catch:{ Throwable -> 0x020b }
            if (r9 != 0) goto L_0x00f9
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ Throwable -> 0x020b }
            r9.<init>()     // Catch:{ Throwable -> 0x020b }
        L_0x00f9:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Throwable -> 0x020b }
            r10.<init>()     // Catch:{ Throwable -> 0x020b }
            boolean r11 = com.p683ss.android.common.config.AppConfigParser.parseCookieShareDomain(r10, r9)     // Catch:{ Throwable -> 0x020b }
            r12 = 1
            if (r11 == 0) goto L_0x010e
            monitor-enter(r17)     // Catch:{ Throwable -> 0x020b }
            r1.mCookieShareHostList = r10     // Catch:{ all -> 0x010b }
            monitor-exit(r17)     // Catch:{ all -> 0x010b }
            r10 = 1
            goto L_0x010f
        L_0x010b:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ Throwable -> 0x020b }
        L_0x010e:
            r10 = 0
        L_0x010f:
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ Throwable -> 0x020b }
            r11.<init>()     // Catch:{ Throwable -> 0x020b }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ Throwable -> 0x020b }
            r13.<init>()     // Catch:{ Throwable -> 0x020b }
            boolean r14 = com.p683ss.android.common.config.AppConfigParser.parseHostMap(r11, r8, r13)     // Catch:{ Throwable -> 0x020b }
            if (r14 == 0) goto L_0x0134
            monitor-enter(r17)     // Catch:{ Throwable -> 0x020b }
            r1.mHostMap = r11     // Catch:{ all -> 0x0131 }
            r1.mLinkHostMap = r13     // Catch:{ all -> 0x0131 }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ all -> 0x0131 }
            r13.<init>()     // Catch:{ all -> 0x0131 }
            r13.putAll(r11)     // Catch:{ all -> 0x0131 }
            r1.mUIHostMap = r13     // Catch:{ all -> 0x0131 }
            monitor-exit(r17)     // Catch:{ all -> 0x0131 }
            r11 = 1
            goto L_0x0135
        L_0x0131:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0131 }
            throw r0     // Catch:{ Throwable -> 0x020b }
        L_0x0134:
            r11 = 0
        L_0x0135:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x020b }
            r13.<init>()     // Catch:{ Throwable -> 0x020b }
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x020b }
            r14.<init>()     // Catch:{ Throwable -> 0x020b }
            boolean r15 = com.p683ss.android.common.config.AppConfigParser.parsePathHostMap(r13, r7, r14)     // Catch:{ Throwable -> 0x020b }
            if (r15 == 0) goto L_0x0159
            monitor-enter(r17)     // Catch:{ Throwable -> 0x020b }
            r1.mPathHostGroupMap = r13     // Catch:{ all -> 0x0156 }
            r1.mLinkPathMap = r14     // Catch:{ all -> 0x0156 }
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0156 }
            r14.<init>()     // Catch:{ all -> 0x0156 }
            r14.putAll(r13)     // Catch:{ all -> 0x0156 }
            r1.mUiPathHostGroupMap = r14     // Catch:{ all -> 0x0156 }
            monitor-exit(r17)     // Catch:{ all -> 0x0156 }
            goto L_0x015a
        L_0x0156:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ Throwable -> 0x020b }
        L_0x0159:
            r12 = 0
        L_0x015a:
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x020b }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x020b }
            java.lang.String r13 = "dns_mapping"
            org.json.JSONArray r13 = r0.optJSONArray(r13)     // Catch:{ Throwable -> 0x020b }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ Throwable -> 0x020b }
            r14.<init>()     // Catch:{ Throwable -> 0x020b }
            com.p683ss.android.common.config.AppConfigParser.parseDnsMap(r14, r13)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r15 = ""
            if (r13 == 0) goto L_0x0182
            int r16 = r14.size()     // Catch:{ Throwable -> 0x020b }
            if (r16 <= 0) goto L_0x0182
            java.lang.String r15 = r13.toString()     // Catch:{ Throwable -> 0x020b }
        L_0x0182:
            java.lang.String r13 = "shuffle_dns"
            int r13 = r0.optInt(r13)     // Catch:{ Throwable -> 0x020b }
            sShuffleDns = r13     // Catch:{ Throwable -> 0x020b }
            java.lang.String r13 = "use_dns_mapping"
            int r0 = r0.optInt(r13)     // Catch:{ Throwable -> 0x020b }
            com.p683ss.android.common.util.NetworkUtils.setUseDnsMapping(r0)     // Catch:{ Throwable -> 0x020b }
            monitor-enter(r17)     // Catch:{ Throwable -> 0x020b }
            r1.mDnsMap = r14     // Catch:{ all -> 0x0208 }
            monitor-exit(r17)     // Catch:{ all -> 0x0208 }
            monitor-enter(r17)     // Catch:{ Throwable -> 0x020b }
            android.content.Context r0 = r1.mContext     // Catch:{ all -> 0x0205 }
            java.lang.String r13 = "smart_network_select"
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0, r13, r5)     // Catch:{ all -> 0x0205 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0205 }
            if (r12 == 0) goto L_0x01ab
            java.lang.String r12 = "config_mapping"
            r0.putString(r12, r7)     // Catch:{ all -> 0x0205 }
        L_0x01ab:
            if (r10 == 0) goto L_0x01b2
            java.lang.String r10 = "domain_cookie_share_mapping"
            r0.putString(r10, r9)     // Catch:{ all -> 0x0205 }
        L_0x01b2:
            if (r11 == 0) goto L_0x01b9
            java.lang.String r9 = "domain_group_host_list"
            r0.putString(r9, r8)     // Catch:{ all -> 0x0205 }
        L_0x01b9:
            java.lang.String r8 = "is_enable_selector"
            boolean r9 = r1.isEnableLinkSelector     // Catch:{ all -> 0x0205 }
            r0.putBoolean(r8, r9)     // Catch:{ all -> 0x0205 }
            java.lang.String r8 = "link_opt_interval"
            long r9 = r1.mLinkOptInterval     // Catch:{ all -> 0x0205 }
            r0.putLong(r8, r9)     // Catch:{ all -> 0x0205 }
            java.lang.String r8 = "static_dns_mapping"
            r0.putString(r8, r15)     // Catch:{ all -> 0x0205 }
            java.lang.String r8 = "shuffle_dns"
            int r9 = sShuffleDns     // Catch:{ all -> 0x0205 }
            r0.putInt(r8, r9)     // Catch:{ all -> 0x0205 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0205 }
            java.lang.String r10 = "last_refresh_time"
            r0.putLong(r10, r8)     // Catch:{ all -> 0x0205 }
            r0.commit()     // Catch:{ all -> 0x0205 }
            monitor-exit(r17)     // Catch:{ all -> 0x0205 }
            com.bytedance.common.utility.b.g r0 = r1.mHandler     // Catch:{ Throwable -> 0x020b }
            r8 = 101(0x65, float:1.42E-43)
            r0.sendEmptyMessage(r8)     // Catch:{ Throwable -> 0x020b }
            r17.initLinkSelector()     // Catch:{ Throwable -> 0x020b }
            android.content.Context r0 = r1.mContext     // Catch:{ Throwable -> 0x020b }
            com.ss.android.common.util.MultiProcessSharedProvider$b r0 = com.p683ss.android.common.util.MultiProcessSharedProvider.m46020b(r0)     // Catch:{ Exception -> 0x0204 }
            if (r0 != 0) goto L_0x01f3
            return
        L_0x01f3:
            com.ss.android.common.util.MultiProcessSharedProvider$a r8 = new com.ss.android.common.util.MultiProcessSharedProvider$a     // Catch:{ Exception -> 0x0204 }
            android.content.Context r0 = r0.f52116a     // Catch:{ Exception -> 0x0204 }
            r9 = 0
            r8.<init>(r0)     // Catch:{ Exception -> 0x0204 }
            java.lang.String r0 = "dns"
            r8.mo38756a(r0, r7)     // Catch:{ Exception -> 0x0204 }
            r8.mo38758a()     // Catch:{ Exception -> 0x0204 }
            return
        L_0x0204:
            return
        L_0x0205:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0205 }
            throw r0     // Catch:{ Throwable -> 0x020b }
        L_0x0208:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0208 }
            throw r0     // Catch:{ Throwable -> 0x020b }
        L_0x020b:
            int r6 = r6 + 1
            goto L_0x0014
        L_0x020f:
            com.bytedance.common.utility.b.g r0 = r1.mHandler
            r0.sendEmptyMessage(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.config.AppConfig.updateConfig(boolean):void");
    }

    private ConnectHost findBestConnectHost(String str, HashMap<String, List<ConnectHost>> hashMap) {
        URI create = URI.create(str);
        HashMap<Pattern, String> hashMap2 = this.mPathHostGroupMap;
        StringBuilder sb = new StringBuilder();
        sb.append(create.getHost());
        sb.append(create.getPath());
        List list = (List) hashMap.get(findMatchHostName(hashMap2, sb.toString()));
        if (C9414h.m18630a(list)) {
            return null;
        }
        return (ConnectHost) list.get(0);
    }

    private String findMatchHostName(HashMap<Pattern, String> hashMap, String str) {
        if (C9431p.m18664a(str) || hashMap == null || hashMap.isEmpty()) {
            return "";
        }
        try {
            for (Entry entry : hashMap.entrySet()) {
                if (((Pattern) entry.getKey()).matcher(str).matches()) {
                    return (String) entry.getValue();
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public boolean inCookieHostList$___twin___(String str, List<String> list) {
        if (C9431p.m18664a(str) || C9414h.m18630a(list)) {
            return false;
        }
        for (String endsWith : list) {
            if (str.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    private AppConfig(Context context, boolean z) {
        this.mContext = context;
        this.mIsMainProcess = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> getShareCookie(android.webkit.CookieManager r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0041
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r5)
            if (r1 == 0) goto L_0x000a
            goto L_0x0041
        L_0x000a:
            monitor-enter(r3)
            java.util.List<java.lang.String> r1 = r3.mCookieShareHostList     // Catch:{ all -> 0x003e }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0016 }
            java.lang.String r5 = r5.getHost()     // Catch:{ Exception -> 0x0016 }
            goto L_0x0017
        L_0x0016:
            r5 = r0
        L_0x0017:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x003c
            boolean r5 = r3.inCookieHostList(r5, r1)     // Catch:{ all -> 0x003e }
            if (r5 != 0) goto L_0x0024
            goto L_0x003c
        L_0x0024:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x003e }
            r5.<init>()     // Catch:{ all -> 0x003e }
            java.lang.String r0 = com.p683ss.android.common.util.NetworkUtils.getShareCookieHost()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = r4.getCookie(r0)     // Catch:{ all -> 0x003e }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r4)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x003a
            r5.add(r4)     // Catch:{ all -> 0x003e }
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return r5
        L_0x003c:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return r0
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r4
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.config.AppConfig.getShareCookie(android.webkit.CookieManager, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007f, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String tryDnsMapping(java.lang.String r7, java.lang.String[] r8) {
        /*
            r6 = this;
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r7)
            if (r0 != 0) goto L_0x0086
            boolean r0 = r6.mIsMainProcess
            if (r0 == 0) goto L_0x0086
            if (r8 == 0) goto L_0x0086
            int r0 = r8.length
            if (r0 > 0) goto L_0x0011
            goto L_0x0086
        L_0x0011:
            r0 = 0
            r1 = 0
            r8[r1] = r0
            r6.tryLoadLocalConfig()
            monitor-enter(r6)
            java.net.URI r2 = java.net.URI.create(r7)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = r2.getHost()     // Catch:{ Exception -> 0x0082 }
            if (r3 == 0) goto L_0x007e
            int r4 = r3.length()     // Catch:{ Exception -> 0x0082 }
            if (r4 != 0) goto L_0x002a
            goto L_0x007e
        L_0x002a:
            int r4 = r2.getPort()     // Catch:{ Exception -> 0x0082 }
            if (r4 <= 0) goto L_0x0036
            r5 = 80
            if (r4 == r5) goto L_0x0036
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            return r7
        L_0x0036:
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r4 = r6.mDnsMap     // Catch:{ Exception -> 0x0082 }
            if (r4 == 0) goto L_0x0042
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r6.mDnsMap     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0082 }
            java.net.InetAddress[] r0 = (java.net.InetAddress[]) r0     // Catch:{ Exception -> 0x0082 }
        L_0x0042:
            if (r0 == 0) goto L_0x007c
            int r4 = r0.length     // Catch:{ Exception -> 0x0082 }
            if (r4 > 0) goto L_0x0048
            goto L_0x007c
        L_0x0048:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0082 }
            r4.<init>()     // Catch:{ Exception -> 0x0082 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x0082 }
            r4.addAll(r0)     // Catch:{ Exception -> 0x0082 }
            java.util.Collections.shuffle(r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r0 = r4.get(r1)     // Catch:{ Exception -> 0x0082 }
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch:{ Exception -> 0x0082 }
            boolean r0 = r0 instanceof java.net.Inet4Address     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r4.get(r1)     // Catch:{ Exception -> 0x0082 }
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ Exception -> 0x0082 }
            com.ss.android.http.a.c r4 = new com.ss.android.http.a.c     // Catch:{ Exception -> 0x0082 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0082 }
            java.net.URI r0 = com.p683ss.android.http.p1169a.p1170a.p1171a.C19172a.m46741a(r2, r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0082 }
            r8[r1] = r3     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            r7 = r0
            goto L_0x0082
        L_0x007c:
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            return r7
        L_0x007e:
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            return r7
        L_0x0080:
            r7 = move-exception
            goto L_0x0084
        L_0x0082:
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            return r7
        L_0x0084:
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            throw r7
        L_0x0086:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.config.AppConfig.tryDnsMapping(java.lang.String, java.lang.String[]):java.lang.String");
    }
}
