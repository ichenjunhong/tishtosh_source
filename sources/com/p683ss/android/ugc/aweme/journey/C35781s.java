package com.p683ss.android.ugc.aweme.journey;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.p558e.C9741d;
import com.bytedance.p558e.p559a.C9735a;
import com.bytedance.p558e.p559a.C9736b;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47464j;
import com.p683ss.android.ugc.aweme.setting.experiment.C41600b;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.p2629a.C52555ag;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.journey.s */
public final class C35781s {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f91896a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35781s.class), "getDefaultDataName", "getGetDefaultDataName()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35781s.class), "needShow", "getNeedShow()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35781s.class), "needShowInternal", "getNeedShowInternal()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35781s.class), "currentRegion", "getCurrentRegion()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35781s.class), "isInterestSupportRegion", "isInterestSupportRegion()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35781s.class), "genderSelectionABParams", "getGenderSelectionABParams()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35781s.class), "abParams", "getAbParams()I"))};

    /* renamed from: b */
    public static boolean f91897b;

    /* renamed from: c */
    public static int f91898c = -1;

    /* renamed from: d */
    public static boolean f91899d;

    /* renamed from: e */
    static StringBuilder f91900e = new StringBuilder();

    /* renamed from: f */
    static String f91901f;

    /* renamed from: g */
    static Set<String> f91902g = C52555ag.m112063a("BR", "ID", "IN", "TH", "US", "VN");

    /* renamed from: h */
    static Set<String> f91903h = C52555ag.m112063a("BR", "GB", "US", "AU", "DE", "FR", "JP", "TH", "VN", "KR", "ID");

    /* renamed from: i */
    static final Set<String> f91904i = C52555ag.m112061a("RU");

    /* renamed from: j */
    static final Set<String> f91905j = C52555ag.m112063a("KR", "US", "AD", "AL", "AT", "AX", "BA", "BE", "BG", "BY", "CH", "CZ", "DE", "DK", "EE", "ES", "FI", "FO", "FR", "GB", "GG", "GI", "GR", "EL", "HR", "HU", "IE", "IM", "IS", "IT", "JE", "LI", "LT", "LU", "LV", "MC", "MD", "ME", "MK", "MT", "NL", "NO", "PL", "PT", "RO", "RS", "RU", "SE", "SI", "SJ", "SK", "SM", "UA", "VA");

    /* renamed from: k */
    static final C52668f f91906k = C52732g.m112286a(C52757k.NONE, C35785d.f91923a);

    /* renamed from: l */
    static int f91907l = -1;

    /* renamed from: m */
    static int f91908m;

    /* renamed from: n */
    public static final C35781s f91909n = new C35781s();

    /* renamed from: o */
    private static boolean f91910o;

    /* renamed from: p */
    private static final Set<String> f91911p = C52555ag.m112061a("IN");

    /* renamed from: q */
    private static final Set<String> f91912q = C52555ag.m112063a("AE", "SA", "KW", "QA", "OM", "BH", "MA", "TN", "LB");

    /* renamed from: r */
    private static final Set<String> f91913r = C52555ag.m112061a("MY");

    /* renamed from: s */
    private static final C52668f f91914s = C52732g.m112285a(C35787f.f91925a);

    /* renamed from: t */
    private static final C52668f f91915t = C52732g.m112285a(C35788g.f91926a);

    /* renamed from: u */
    private static final C52668f f91916u = C52732g.m112285a(C35783b.f91921a);

    /* renamed from: v */
    private static final C52668f f91917v = C52732g.m112286a(C52757k.NONE, C35786e.f91924a);

    /* renamed from: w */
    private static final C52668f f91918w = C52732g.m112286a(C52757k.NONE, C35784c.f91922a);

    /* renamed from: x */
    private static final C52668f f91919x = C52732g.m112286a(C52757k.NONE, C35782a.f91920a);

    /* renamed from: com.ss.android.ugc.aweme.journey.s$a */
    static final class C35782a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C35782a f91920a = new C35782a();

        C35782a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i = Keva.getRepo("new_user_journey").getInt("experiment_id", -1);
            if (i == -1) {
                Boolean a = C30578o.m71565a();
                C52711k.m112236a((Object) a, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
                if (a.booleanValue()) {
                    if (C35781s.m80911a().contains(C35781s.f91909n.mo74443g())) {
                        i = 7;
                    } else if (C35781s.m80913b().contains(C35781s.f91909n.mo74443g())) {
                        i = 12;
                    } else {
                        if (!C35781s.f91904i.contains(C35781s.f91909n.mo74443g())) {
                            if (C35781s.m80914c().contains(C35781s.f91909n.mo74443g())) {
                                i = 10;
                            } else if (C35781s.f91903h.contains(C35781s.f91909n.mo74443g())) {
                                i = 1;
                            }
                        }
                        i = 11;
                    }
                    Keva.getRepo("new_user_journey").storeInt("experiment_id", i);
                }
            }
            if (C35781s.m80915d()) {
                i = 1;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.s$b */
    static final class C35783b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C35783b f91921a = new C35783b();

        C35783b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String a = C35837h.m80973a();
            C52711k.m112236a((Object) a, "RegionHelper.getCurrentRegionCode()");
            if (a != null) {
                String upperCase = a.toUpperCase();
                C52711k.m112236a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
                return upperCase;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.s$c */
    static final class C35784c extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C35784c f91922a = new C35784c();

        C35784c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            if (!C35781s.f91905j.contains(C35781s.f91909n.mo74443g())) {
                new C41600b();
                Integer valueOf = Integer.valueOf(0);
                C9735a aVar = new C9735a("com.ss.android.ugc.aweme.setting.experiment.ClientNewUserGenderSelectionExperiment", ProfileUiInitOptimizeEnterThreshold.DEFAULT, "abtest", new String[]{"app_skin_white", "back_refresh_strategy", "client_boolean_empty_experiment", "client_empty_experiment", "client_enum_forcelogin_experiment", "client_string_empty_experiment", "douyin_privacy_show", "new_user_journey", "new_user_journey_collect_gender", "new_user_strategy", "support_facebook_deeplink", "swipe_up_type", "video_sound_guide_new_user"}, new C9736b("1558053", 0.334d, Integer.valueOf(0)), new C9736b("1558054", 0.333d, Integer.valueOf(1)), new C9736b("1558055", 0.333d, Integer.valueOf(2)));
                Integer num = (Integer) C9741d.m19511a("new_user_journey_collect_gender", Integer.class, valueOf, false, true, aVar);
                C52711k.m112236a((Object) num, "Experiments.getClientNew…tegyGenderSelection(true)");
                i = num.intValue();
            } else {
                i = -1;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.s$d */
    static final class C35785d extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C35785d f91923a = new C35785d();

        C35785d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (C35781s.f91902g.contains(C35781s.f91909n.mo74443g())) {
                return C35781s.f91909n.mo74443g();
            }
            return "US";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.s$e */
    static final class C35786e extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C35786e f91924a = new C35786e();

        C35786e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z = false;
            if (!C35781s.m80913b().contains(C35781s.f91909n.mo74443g()) ? !C35781s.m80911a().contains(C35781s.f91909n.mo74443g()) && (!C35781s.m80914c().contains(C35781s.f91909n.mo74443g()) || C35781s.f91909n.mo74446j() != 10) : C35781s.f91909n.mo74446j() != 10) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.s$f */
    static final class C35787f extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C35787f f91925a = new C35787f();

        C35787f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            if (C35781s.f91909n.mo74442f() <= 0 || C35781s.f91909n.mo74442f() == 4) {
                z = false;
            } else {
                z = true;
            }
            if (z && !C35789t.m80922a(C11010c.m22280a())) {
                Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.s$g */
    static final class C35788g extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C35788g f91926a = new C35788g();

        C35788g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C35781s sVar = C35781s.f91909n;
            int i = -1;
            if (C35781s.m80915d() || (C30578o.m71565a().booleanValue() && !Keva.getRepo("new_user_journey").contains("new_user_journey_show"))) {
                i = sVar.mo74446j();
            }
            return Integer.valueOf(i);
        }
    }

    private C35781s() {
    }

    /* renamed from: a */
    public static Set<String> m80911a() {
        return f91911p;
    }

    /* renamed from: b */
    public static Set<String> m80913b() {
        return f91912q;
    }

    /* renamed from: c */
    public static Set<String> m80914c() {
        return f91913r;
    }

    /* renamed from: e */
    public final boolean mo74441e() {
        return ((Boolean) f91914s.getValue()).booleanValue();
    }

    /* renamed from: f */
    public final int mo74442f() {
        return ((Number) f91915t.getValue()).intValue();
    }

    /* renamed from: g */
    public final String mo74443g() {
        return (String) f91916u.getValue();
    }

    /* renamed from: h */
    public final boolean mo74444h() {
        return ((Boolean) f91917v.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final int mo74445i() {
        return ((Number) f91918w.getValue()).intValue();
    }

    /* renamed from: j */
    public final int mo74446j() {
        return ((Number) f91919x.getValue()).intValue();
    }

    /* renamed from: d */
    public static boolean m80915d() {
        return C10181b.m20511a().mo18172a(NewUserJourneyTool.class, true, "lanuch_new_user_journey_next_time", 31744, false);
    }

    /* renamed from: a */
    public static void m80912a(String str) {
        C52711k.m112240b(str, "info");
        try {
            StringBuilder sb = f91900e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(' ');
            sb.append(sb2.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final String m80910a(int i) {
        int i2;
        if (f91910o || f91909n.mo74442f() == -1) {
            return null;
        }
        if (f91901f != null) {
            f91910o = true;
            return f91901f;
        } else if (i != 4) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            Map map = hashMap;
            map.put("recommend_group", Integer.valueOf(f91909n.mo74446j()));
            if (C47464j.f119726b.mo94745c()) {
                i2 = 2;
            } else {
                i2 = f91908m;
            }
            map.put("special_type", Integer.valueOf(i2));
            return C47760cd.m103385a(hashMap);
        }
    }
}
