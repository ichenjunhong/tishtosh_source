package com.p683ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.awemeservice.p1392a.C23302a;
import com.p683ss.android.ugc.aweme.awemeservice.p1392a.C23309b;
import com.p683ss.android.ugc.aweme.awemeservice.p1392a.C23310c;
import com.p683ss.android.ugc.aweme.awemeservice.p1392a.C23315g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.b */
public final class C23320b {

    /* renamed from: b */
    private static C23320b f62326b;

    /* renamed from: a */
    C23309b<String> f62327a;

    /* renamed from: c */
    private boolean f62328c;

    /* renamed from: d */
    private boolean f62329d;

    /* renamed from: a */
    public static C23320b m57366a() {
        if (f62326b == null) {
            f62326b = new C23320b();
        }
        return f62326b;
    }

    private C23320b() {
        boolean z;
        C23309b<String> bVar;
        if (MainServiceImpl.createIMainServicebyMonsterPlugin().isUseJediAwemelistFragment() || MainServiceImpl.createIMainServicebyMonsterPlugin().isRelationLabelClickEnter()) {
            z = true;
        } else {
            z = false;
        }
        this.f62328c = z;
        this.f62329d = MainServiceImpl.createIMainServicebyMonsterPlugin().isReplaceAwemeCache();
        if (this.f62328c) {
            bVar = C23302a.f62298a;
        } else if (this.f62329d) {
            bVar = new C23315g<>();
        } else {
            bVar = new C23310c<>();
        }
        this.f62327a = bVar;
    }

    /* renamed from: b */
    static boolean m57369b(Aweme aweme) {
        if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static boolean m57370c(Aweme aweme) {
        if (aweme == null || aweme.getLiveAwesomeSplashInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m57368a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    /* renamed from: d */
    static boolean m57371d(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if ((aweme.getStarAtlasInfo() == null || aweme.getStarAtlasInfo().getStarAtlasLink() == null) && aweme.getAwemeNationalTask() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    static AwemeStatistics m57372e(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics == null) {
            statistics = new AwemeStatistics();
            aweme.setStatistics(statistics);
        }
        return statistics;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Aweme mo48388b(String str) {
        if (this.f62327a.mo48354b(str)) {
            return this.f62327a.mo48350a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final Aweme mo48385a(String str) {
        Aweme aweme;
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return null;
        }
        if (this.f62327a.mo48354b(str)) {
            aweme = this.f62327a.mo48350a(str);
        } else {
            aweme = C23301a.m57317a().mo48348a(str);
        }
        return aweme;
    }

    /* renamed from: a */
    public static Aweme m57367a(Aweme aweme, C23309b<String> bVar) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || bVar == null || aweme.isProhibited() || aweme.isSelfSee()) {
            return aweme;
        }
        if (bVar.mo48354b(aweme.getAid())) {
            Aweme a = bVar.mo48350a(aweme.getAid());
            if (a != null) {
                a.update(aweme);
                aweme = a;
            }
        }
        bVar.mo48352a(aweme.getAid(), aweme);
        return aweme;
    }

    /* renamed from: a */
    public final Aweme mo48386a(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("type");
        sb.append(i);
        String sb2 = sb.toString();
        if (this.f62327a.mo48354b(sb2)) {
            return this.f62327a.mo48350a(sb2);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo48387a(Aweme aweme, int i) {
        aweme.setUserDigg(i);
        AwemeStatistics statistics = aweme.getStatistics();
        if (i != 0) {
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() + 1);
            }
            MainServiceImpl.createIMainServicebyMonsterPlugin().trackAppsFlyerEvent("mus_af_like_video_1", aweme.getAid());
            MainServiceImpl.createIMainServicebyMonsterPlugin().trackAppsFlyerEvent("mus_af_like_video_5", null);
        } else if (statistics != null) {
            statistics.setDiggCount(statistics.getDiggCount() - 1);
        }
        this.f62327a.mo48352a(aweme.getAid(), aweme);
    }
}
