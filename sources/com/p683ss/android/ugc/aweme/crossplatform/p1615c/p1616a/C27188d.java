package com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.settings.RnSourceUrlSetting;
import com.p683ss.android.ugc.aweme.settings.RnSourceUrlSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a.d */
public final class C27188d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71730a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27188d.class), "settings", "getSettings()Ljava/util/Map;"))};

    /* renamed from: c */
    public static final C52668f f71731c = C52732g.m112285a(C27190b.f71735a);

    /* renamed from: d */
    public static final C27189a f71732d = new C27189a(null);

    /* renamed from: b */
    final C52668f f71733b;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a.d$a */
    public static final class C27189a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f71734a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27189a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/params/base/SourUrlSettingsCache;"))};

        private C27189a() {
        }

        public /* synthetic */ C27189a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a.d$b */
    static final class C27190b extends C52712l implements C52670a<C27188d> {

        /* renamed from: a */
        public static final C27190b f71735a = new C27190b();

        C27190b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27188d(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a.d$c */
    static final class C27191c extends C52712l implements C52670a<Map<String, String>> {

        /* renamed from: a */
        public static final C27191c f71736a = new C27191c();

        C27191c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m65616a();
        }

        /* renamed from: a */
        private static Map<String, String> m65616a() {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            try {
                RnSourceUrlSetting[] rnSourceUrlSettingArr = (RnSourceUrlSetting[]) C10193n.m20607a().mo18202a(RnSourceUrlSettings.class, "android_source_url", C10181b.m20511a().mo18175c().getAndroidSourceUrl(), "com.ss.android.ugc.aweme.settings.RnSourceUrlSetting[]", RnSourceUrlSetting[].class);
                if (rnSourceUrlSettingArr != null) {
                    for (RnSourceUrlSetting rnSourceUrlSetting : rnSourceUrlSettingArr) {
                        String channel = rnSourceUrlSetting.getChannel();
                        if (channel != null) {
                            String sourceUrl = rnSourceUrlSetting.getSourceUrl();
                            if (sourceUrl != null) {
                                linkedHashMap.put(channel, sourceUrl);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return linkedHashMap;
        }
    }

    private C27188d() {
        this.f71733b = C52732g.m112285a(C27191c.f71736a);
    }

    public /* synthetic */ C27188d(C52707g gVar) {
        this();
    }
}
