package com.p683ss.android.ugc.aweme.experiment;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.p620a.C10180c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.feed.interest.C30408a;
import com.p683ss.android.ugc.aweme.feed.interest.C30410b;
import com.p683ss.android.ugc.aweme.feed.interest.InterestApi;
import com.p683ss.android.ugc.aweme.feed.interest.InterestApi.C30407a;
import com.p683ss.android.ugc.aweme.feed.interest.p1726b.C30412b;
import com.p683ss.android.ugc.aweme.feed.interest.viewmodel.InterestViewModel.C30432a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.journey.C35791v;
import com.p683ss.android.ugc.aweme.utils.GsonHolder;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import java.util.Arrays;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

@C10178a(mo18163a = "user_interest_show_strategy")
@C10180c
/* renamed from: com.ss.android.ugc.aweme.experiment.InterestSelectExperiment */
public final class InterestSelectExperiment {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InterestSelectExperiment.class), "api", "getApi()Lcom/ss/android/ugc/aweme/feed/interest/InterestApi;"))};
    public static final InterestSelectExperiment INSTANCE = new InterestSelectExperiment();
    private static final String KEVA_KEY_VIDEO_NOT_SEEN_ONCE = KEVA_KEY_VIDEO_NOT_SEEN_ONCE;
    private static final String KEVA_KEY_VIDEO_NOT_SEEN_ONCE_NEW = KEVA_KEY_VIDEO_NOT_SEEN_ONCE_NEW;
    @C10179b
    private static final String METHOD_ONE = METHOD_ONE;
    @C10179b
    private static final String METHOD_TWO = METHOD_TWO;
    private static final boolean MOCK = C10181b.m20511a().mo18172a(InterestSelectMockExperiment.class, true, "user_interest_show_strategy_android_mock", 31744, false);
    @C10179b(mo18165a = true)
    private static final String NONE = "";
    private static final String REPO_NAME = REPO_NAME;
    public static final String TAG = TAG;
    public static volatile boolean alreadyRequested;
    public static final C52668f api$delegate = C52732g.m112285a(C29495a.f77260a);
    private static volatile String feedParams;
    static volatile Aweme interestAweme;
    private static final Keva kevaRepo = Keva.getRepo(REPO_NAME);
    public static int monitorTimes;
    public static boolean v2NotRequest = true;

    /* renamed from: com.ss.android.ugc.aweme.experiment.InterestSelectExperiment$a */
    static final class C29495a extends C52712l implements C52670a<InterestApi> {

        /* renamed from: a */
        public static final C29495a f77260a = new C29495a();

        C29495a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C30407a.m71331a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.InterestSelectExperiment$b */
    public static final class C29496b<T> implements C1710e<C30412b> {

        /* renamed from: a */
        public static final C29496b f77261a = new C29496b();

        C29496b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num;
            Object obj2;
            C30412b bVar = (C30412b) obj;
            String str = null;
            if (bVar != null) {
                num = bVar.f79487a;
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                C32458a.m75141a(4, InterestSelectExperiment.m69599a(), "request ok");
                Aweme aweme = bVar.f79490d;
                if (aweme != null) {
                    String aid = aweme.getAid();
                    if (aid != null) {
                        C35791v vVar = bVar.f79489c;
                        if (vVar != null) {
                            String a = InterestSelectExperiment.m69599a();
                            StringBuilder sb = new StringBuilder("requestId:");
                            sb.append(bVar.getRequestId());
                            sb.append(",logPb:");
                            sb.append(bVar.f79493g);
                            C32458a.m75141a(4, a, sb.toString());
                            bVar.setRequestId("user_interest_show_strategy");
                            C29981aa.m70153a().mo60162a(bVar.getRequestId(), bVar.f79493g);
                            C30436k.m71368a(Arrays.asList(new Aweme[]{bVar.f79490d}), bVar.getRequestId(), 0);
                            if (!(vVar == null || aid == null)) {
                                C30408a.f79479a.put(aid, vVar);
                            }
                            InterestSelectExperiment.interestAweme = bVar.f79490d;
                            if (InterestSelectExperiment.INSTANCE.mo59606h()) {
                                InterestSelectExperiment.m69600a((Context) C11016e.m22312g());
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(InterestSelectExperiment.m69599a());
            sb2.append(",status:");
            if (bVar != null) {
                obj2 = bVar.f79487a;
            } else {
                obj2 = null;
            }
            sb2.append(obj2);
            sb2.append(",msg:");
            if (bVar != null) {
                str = bVar.f79488b;
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            C32458a.m75141a(6, InterestSelectExperiment.m69599a(), sb3);
            throw new RuntimeException(sb3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.InterestSelectExperiment$c */
    public static final class C29497c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C29497c f77262a = new C29497c();

        C29497c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C32458a.m75148a((Throwable) obj);
        }
    }

    private InterestSelectExperiment() {
    }

    /* renamed from: a */
    public static String m69599a() {
        return TAG;
    }

    /* renamed from: b */
    public static final String m69602b() {
        return feedParams;
    }

    /* renamed from: m */
    private final C29501c m69604m() {
        return m69605n();
    }

    /* renamed from: c */
    public final int mo59601c() {
        try {
            C29501c m = m69604m();
            if (m != null) {
                return m.f77283a;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public final int mo59602d() {
        try {
            C29501c m = m69604m();
            if (m != null) {
                return m.f77284b;
            }
            return 4;
        } catch (Throwable unused) {
            return 4;
        }
    }

    /* renamed from: e */
    public final String mo59603e() {
        try {
            C29501c m = m69604m();
            if (m != null) {
                String str = m.f77287e;
                if (str != null) {
                    return str;
                }
            }
            return "选择兴趣";
        } catch (Throwable unused) {
            return "选择兴趣";
        }
    }

    /* renamed from: f */
    public final String mo59604f() {
        try {
            C29501c m = m69604m();
            if (m != null) {
                String str = m.f77288f;
                if (str != null) {
                    return str;
                }
            }
            return "你可以选择一个或多个兴趣";
        } catch (Throwable unused) {
            return "你可以选择一个或多个兴趣";
        }
    }

    /* renamed from: h */
    public final boolean mo59606h() {
        if (mo59601c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo59607i() {
        if (mo59601c() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo59608j() {
        try {
            C29501c m = m69604m();
            if (m != null) {
                return m.f77286d;
            }
            return 3;
        } catch (Throwable unused) {
            return 3;
        }
    }

    /* renamed from: k */
    public final int mo59609k() {
        try {
            C29501c m = m69604m();
            if (m != null) {
                return m.f77285c;
            }
            return 3;
        } catch (Throwable unused) {
            return 3;
        }
    }

    /* renamed from: g */
    public final boolean mo59605g() {
        if (kevaRepo.getBoolean(m69603l(), true)) {
            C22711b d = C23794bh.m58390d();
            C52711k.m112236a((Object) d, "LegacyServiceUtils.getTimeLockRulerService()");
            if (!d.mo47103a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private final String m69603l() {
        boolean z;
        Integer num;
        try {
            C29501c m = m69604m();
            if (m != null) {
                num = Integer.valueOf(m.f77289g);
            } else {
                num = null;
            }
            z = C52711k.m112239a((Object) num, (Object) Integer.valueOf(1));
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return KEVA_KEY_VIDEO_NOT_SEEN_ONCE_NEW;
        }
        return KEVA_KEY_VIDEO_NOT_SEEN_ONCE;
    }

    /* renamed from: n */
    private static C29501c m69605n() {
        String a = C10181b.m20511a().mo18171a(InterestSelectExperiment.class, false, "user_interest_show_strategy", 31744, "");
        GsonProvider createGsonProviderbyMonsterPlugin = GsonHolder.createGsonProviderbyMonsterPlugin();
        C52711k.m112236a((Object) createGsonProviderbyMonsterPlugin, "ServiceManager.get().get…GsonProvider::class.java)");
        C29501c cVar = (C29501c) createGsonProviderbyMonsterPlugin.getGson().mo34884a(a, C29501c.class);
        String str = TAG;
        StringBuilder sb = new StringBuilder("get experiment,raw:");
        sb.append(a);
        sb.append(",end:");
        sb.append(cVar);
        C32458a.m75141a(4, str, sb.toString());
        return cVar;
    }

    /* renamed from: a */
    public static final void m69601a(String str) {
        if (!C52711k.m112239a((Object) str, (Object) feedParams)) {
            feedParams = str;
        }
    }

    /* renamed from: a */
    public static void m69600a(Context context) {
        if (!(context instanceof FragmentActivity) || interestAweme == null) {
            C32458a.m75141a(4, TAG, "not insert cause aweme is null or other reason,just ignore");
        } else {
            C30410b.f79484a.mo60822b();
            Aweme aweme = interestAweme;
            if (aweme != null) {
                String str = TAG;
                StringBuilder sb = new StringBuilder("insert aid:");
                sb.append(aweme.getAid());
                C32458a.m75141a(4, str, sb.toString());
                C30432a.m71352a((FragmentActivity) context).f79550a.postValue(aweme);
            }
        }
    }
}
