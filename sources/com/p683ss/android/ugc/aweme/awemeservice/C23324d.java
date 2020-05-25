package com.p683ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.awemeservice.p1393b.C23321a;
import com.p683ss.android.ugc.aweme.awemeservice.p1393b.C23322b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.VideoControl;
import com.p683ss.android.ugc.aweme.p1632di.C27599am;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.d */
public final class C23324d implements IAwemeService {
    /* renamed from: a */
    public static IAwemeService m57378a() {
        if (C27991b.f73438V == null) {
            synchronized (IAwemeService.class) {
                if (C27991b.f73438V == null) {
                    C27991b.f73438V = C27599am.m66279a();
                }
            }
        }
        return (IAwemeService) C27991b.f73438V;
    }

    public final C11536c<String, Aweme> getAwemeCache() {
        return C23321a.f62330c;
    }

    public final C2201v<List<C52847n<String, Aweme>>> observeAwemes() {
        return C23322b.m57377b();
    }

    public final void clearCache() {
        C0013i.m16a((Callable<TResult>) new C23323c<TResult>(C23320b.m57366a()));
    }

    public final Aweme getAwemeById(String str) {
        return C23320b.m57366a().mo48385a(str);
    }

    public final Aweme getRawAdAwemeById(String str) {
        return C23301a.m57317a().mo48348a(str);
    }

    public final C2201v<C11575f<Aweme>> observeAwemeById(String str) {
        C52711k.m112240b(str, "aid");
        return C23322b.f62332b.mo22300a(str, (C11574e<?, ?>[]) new C11574e[0]);
    }

    public final Aweme updateRawAdAweme(Aweme aweme) {
        return C23301a.m57317a().mo48347a(aweme);
    }

    public final void setFeedCount(long j) {
        for (Aweme feedCount : C23320b.m57366a().f62327a.mo48351a()) {
            feedCount.setFeedCount(j);
        }
    }

    public final Aweme getRawAdAwemeByAdId(String str) {
        for (Aweme aweme : C23301a.m57317a().f62297b.values()) {
            if (TextUtils.equals(aweme.getAwemeRawAdIdStr(), str)) {
                return aweme;
            }
        }
        return null;
    }

    public final void increaseCommentCount(String str) {
        C23320b a = C23320b.m57366a();
        AwemeStatistics b = C23301a.m57317a().mo48349b(str);
        if (b != null) {
            b.setCommentCount(b.getCommentCount() + 1);
        }
        Aweme b2 = a.mo48388b(str);
        AwemeStatistics e = C23320b.m57372e(b2);
        if (e != null) {
            e.setCommentCount(e.getCommentCount() + 1);
            a.f62327a.mo48352a(b2.getAid(), b2);
        }
    }

    public final Aweme updateAweme(Aweme aweme) {
        C23320b a = C23320b.m57366a();
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (C23320b.m57368a(aweme) || C23320b.m57369b(aweme) || C23320b.m57370c(aweme) || C23320b.m57371d(aweme)) {
            return C23301a.m57317a().mo48347a(aweme);
        }
        return C23320b.m57367a(aweme, a.f62327a);
    }

    public final Aweme getProfileSelfSeeAweme(String str) {
        C23320b a = C23320b.m57366a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("type0");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("type1");
        String sb4 = sb3.toString();
        if (a.f62327a.mo48354b(sb2)) {
            return a.f62327a.mo48350a(sb2);
        }
        if (a.f62327a.mo48354b(sb4)) {
            return a.f62327a.mo48350a(sb4);
        }
        return null;
    }

    public final Aweme getProfileSelfSeeAweme(String str, int i) {
        return C23320b.m57366a().mo48386a(str, i);
    }

    public final void updateCommentSetting(Aweme aweme, int i) {
        C23320b.m57366a();
        if (aweme != null) {
            aweme.setCommentSetting(i);
        }
    }

    public final void updatePreventDownloadType(Aweme aweme, int i) {
        C23320b.m57366a();
        if (aweme != null) {
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                videoControl.preventDownloadType = i;
            }
        }
    }

    public final void updateCollectStatus(String str, int i) {
        C23320b a = C23320b.m57366a();
        Aweme a2 = a.mo48385a(str);
        if (a2 != null) {
            a2.setCollectStatus(i);
            a.f62327a.mo48352a(a2.getAid(), a2);
        }
        if (i == 1) {
            MainServiceImpl.createIMainServicebyMonsterPlugin().trackAppsFlyerEvent("collect_video", str);
        }
    }

    public final void updateCommentCount(String str, long j) {
        C23320b a = C23320b.m57366a();
        AwemeStatistics b = C23301a.m57317a().mo48349b(str);
        if (b != null) {
            b.setCommentCount(j);
        }
        Aweme b2 = a.mo48388b(str);
        AwemeStatistics e = C23320b.m57372e(b2);
        if (e != null) {
            e.setCommentCount(j);
            a.f62327a.mo48352a(b2.getAid(), b2);
        }
    }

    public final Aweme updateProfileSelfSeeAweme(Aweme aweme, int i) {
        C23320b a = C23320b.m57366a();
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (C23320b.m57368a(aweme) || C23320b.m57369b(aweme) || C23320b.m57370c(aweme) || C23320b.m57371d(aweme)) {
            return C23301a.m57317a().mo48347a(aweme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aweme.getAid());
        sb.append("type");
        sb.append(i);
        String sb2 = sb.toString();
        if (a.f62327a.mo48354b(sb2)) {
            Aweme a2 = a.f62327a.mo48350a(sb2);
            if (a2 != null) {
                a2.update(aweme);
                return a2;
            }
            a.f62327a.mo48352a(sb2, aweme);
        } else {
            a.f62327a.mo48352a(sb2, aweme);
        }
        return aweme;
    }

    public final void updateUserDigg(String str, int i) {
        C23320b a = C23320b.m57366a();
        if (!TextUtils.isEmpty(str)) {
            C23301a a2 = C23301a.m57317a();
            if (!TextUtils.isEmpty(str)) {
                Aweme a3 = a2.mo48348a(str);
                if (a3 != null) {
                    a3.setUserDigg(i);
                    if (i == 0) {
                        AwemeStatistics b = a2.mo48349b(str);
                        if (b != null) {
                            b.setDiggCount(b.getDiggCount() - 1);
                        }
                    } else {
                        AwemeStatistics b2 = a2.mo48349b(str);
                        if (b2 != null) {
                            b2.setDiggCount(b2.getDiggCount() + 1);
                        }
                    }
                }
            }
            Aweme b3 = a.mo48388b(str);
            if (b3 == null) {
                Aweme a4 = a.mo48386a(str, 0);
                if (a4 != null) {
                    a.mo48387a(a4, i);
                }
                Aweme a5 = a.mo48386a(str, 1);
                if (a5 != null) {
                    a.mo48387a(a5, i);
                }
                return;
            }
            a.mo48387a(b3, i);
        }
    }
}
