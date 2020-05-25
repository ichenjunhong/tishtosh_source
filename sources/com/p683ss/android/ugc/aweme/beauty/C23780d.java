package com.p683ss.android.ugc.aweme.beauty;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;

/* renamed from: com.ss.android.ugc.aweme.beauty.d */
public final class C23780d {

    /* renamed from: a */
    public static final Keva f63371a = Keva.getRepo("ulike_repo");

    /* renamed from: b */
    public static boolean f63372b = true;

    /* renamed from: c */
    public static boolean f63373c;

    /* renamed from: d */
    public static final C23780d f63374d = new C23780d();

    private C23780d() {
    }

    /* renamed from: a */
    public static final boolean m58365a() {
        if (f63372b || !m58366b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m58366b() {
        if (!C23777a.m58348a() || m58367c()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m58367c() {
        if (!C23777a.m58348a() || !C39629l.m88232a().mo58583n().mo83103a(C40790a.StudioMBeautyPanel)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m58368d() {
        return C39629l.m88232a().mo58583n().mo83103a(C40790a.ComposerPanelHasTitle);
    }

    /* renamed from: a */
    public static final void m58364a(boolean z) {
        f63371a.storeBoolean("key_beauty_guarantee_strategy", z);
    }
}
