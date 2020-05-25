package com.p683ss.android.ugc.aweme.main;

import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl;
import com.p683ss.android.ugc.aweme.main.experiment.C36646b;
import com.p683ss.android.ugc.aweme.main.experiment.C36647c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.cd */
public final class C36553cd {

    /* renamed from: a */
    private static final boolean f93642a = m82452h();

    /* renamed from: c */
    public static boolean m82447c() {
        return true;
    }

    /* renamed from: d */
    public static boolean m82448d() {
        return false;
    }

    /* renamed from: e */
    public static boolean m82449e() {
        m82447c();
        return true;
    }

    /* renamed from: g */
    public static boolean m82451g() {
        m82447c();
        return true;
    }

    /* renamed from: a */
    public static boolean m82445a() {
        m82447c();
        if (f93642a) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m82446b() {
        return HomepageExperimentServiceImpl.createIHomepageExperimentServicebyMonsterPlugin().isFamiliarInMainTab();
    }

    /* renamed from: h */
    private static boolean m82452h() {
        try {
            return C32816h.m75716b().getMainTabFollowUseLazyViewpager().booleanValue();
        } catch (C10174a unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m82450f() {
        m82447c();
        C36647c cVar = C36646b.f93779a;
        if (cVar == null) {
            C52711k.m112234a();
        }
        if (cVar.f93783c == 1) {
            return true;
        }
        return false;
    }
}
