package com.p683ss.android.ugc.aweme.feed.p1719e;

import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.p1720f.C30230b;
import com.p683ss.android.ugc.aweme.feed.p1720f.C30230b.C30232a;
import com.p683ss.android.ugc.aweme.p1963ml.C37105d;
import com.p683ss.android.ugc.aweme.p1963ml.C37115l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.e.x */
final /* synthetic */ class C30217x implements Callable {

    /* renamed from: a */
    private final C30200o f78908a;

    /* renamed from: b */
    private final Aweme f78909b;

    C30217x(C30200o oVar, Aweme aweme) {
        this.f78908a = oVar;
        this.f78909b = aweme;
    }

    public final Object call() {
        C30200o oVar = this.f78908a;
        Aweme aweme = this.f78909b;
        C30230b a = C30230b.m70993a();
        HashMap hashMap = new HashMap();
        if (aweme != null) {
            hashMap.put("user_is_login", Integer.valueOf(C20854a.m53161a().userService().isLogin() ? 1 : 0));
            C30232a aVar = new C30232a();
            if (!(aweme == null || aweme.getStatistics() == null)) {
                AwemeStatistics statistics = aweme.getStatistics();
                aVar.f78970a = statistics.getPlayCount();
                aVar.f78971b = statistics.getCommentCount();
                aVar.f78972c = statistics.getDiggCount();
                aVar.f78973d = statistics.getShareCount();
                if (aweme.getAuthor() != null) {
                    aVar.f78974e = aweme.getAuthor().getFollowStatus();
                }
            }
            hashMap.put("vs_v", Long.valueOf(aVar.f78970a));
            hashMap.put("vs_c", Long.valueOf(aVar.f78971b));
            hashMap.put("vs_l", Long.valueOf(aVar.f78972c));
            hashMap.put("vs_s", Long.valueOf(aVar.f78973d));
            hashMap.put("rel", Integer.valueOf(aVar.f78974e));
            hashMap.put("uas_v", Integer.valueOf(a.f78962a));
            hashMap.put("uas_c", Integer.valueOf(a.f78963b));
            hashMap.put("uas_pc", Integer.valueOf(a.f78964c));
            hashMap.put("uas_p", Integer.valueOf(a.f78965d));
            hashMap.put("uas_s", Integer.valueOf(a.f78966e));
            hashMap.put("uas_m", Integer.valueOf(a.f78967f));
            int[] b = a.mo60574b();
            hashMap.put("ula_c", Integer.valueOf(b[0]));
            hashMap.put("ula_pc", Integer.valueOf(b[1]));
            hashMap.put("ula_l", Integer.valueOf(b[2]));
            hashMap.put("ula_s", Integer.valueOf(b[3]));
            hashMap.put("ula_m", Integer.valueOf(b[4]));
            hashMap.put("ula_p", Integer.valueOf(b[5]));
            hashMap.put("ula_c_cnt8", Integer.valueOf(C30230b.m70992a(b[0], 8)));
            hashMap.put("ula_c_cnt16", Integer.valueOf(C30230b.m70992a(b[0], 16)));
            hashMap.put("ula_c_cnt31", Integer.valueOf(C30230b.m70992a(b[0], 31)));
            hashMap.put("ula_pc_cnt8", Integer.valueOf(C30230b.m70992a(b[1], 8)));
            hashMap.put("ula_pc_cnt16", Integer.valueOf(C30230b.m70992a(b[1], 16)));
            hashMap.put("ula_pc_cnt31", Integer.valueOf(C30230b.m70992a(b[1], 31)));
            hashMap.put("ula_l_cnt8", Integer.valueOf(C30230b.m70992a(b[2], 8)));
            hashMap.put("ula_l_cnt16", Integer.valueOf(C30230b.m70992a(b[2], 16)));
            hashMap.put("ula_l_cnt31", Integer.valueOf(C30230b.m70992a(b[2], 31)));
            hashMap.put("ula_s_cnt8", Integer.valueOf(C30230b.m70992a(b[3], 8)));
            hashMap.put("ula_s_cnt16", Integer.valueOf(C30230b.m70992a(b[3], 16)));
            hashMap.put("ula_s_cnt31", Integer.valueOf(C30230b.m70992a(b[3], 31)));
            hashMap.put("ula_m_cnt8", Integer.valueOf(C30230b.m70992a(b[4], 8)));
            hashMap.put("ula_m_cnt16", Integer.valueOf(C30230b.m70992a(b[4], 16)));
            hashMap.put("ula_m_cnt31", Integer.valueOf(C30230b.m70992a(b[4], 31)));
            hashMap.put("ula_p_cnt8", Integer.valueOf(C30230b.m70992a(b[5], 8)));
            hashMap.put("ula_p_cnt16", Integer.valueOf(C30230b.m70992a(b[5], 16)));
            hashMap.put("ula_p_cnt31", Integer.valueOf(C30230b.m70992a(b[5], 31)));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        C37105d.m83336a().f94754a.mo76386a(aweme, unmodifiableMap);
        C37115l.m83346a().f94762a.mo76391a(aweme, unmodifiableMap);
        C30200o.m70862a(aweme, oVar.f78760e);
        C30200o.m70873b(aweme);
        return null;
    }
}
