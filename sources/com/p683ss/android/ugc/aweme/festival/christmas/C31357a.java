package com.p683ss.android.ugc.aweme.festival.christmas;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p684l.C10912c;
import com.p683ss.android.ugc.aweme.p684l.C10916d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.a */
public final class C31357a {

    /* renamed from: a */
    public static final int co7 = 2132022804;

    /* renamed from: b */
    public static final int aqq = 2132019585;

    /* renamed from: c */
    public static int f82125c = 1;

    /* renamed from: d */
    public static volatile C10912c f82126d = null;

    /* renamed from: e */
    private static boolean f82127e = true;

    /* renamed from: b */
    public static int m73098b() {
        if (m73104e() == null) {
            return 0;
        }
        return m73104e().f29316q;
    }

    /* renamed from: c */
    public static String m73100c() {
        if (m73098b() == 0) {
            return "donation";
        }
        return "lottery";
    }

    /* renamed from: d */
    public static boolean m73102d() {
        if (f82125c >= 6) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static C10916d m73106g() {
        C10912c e = m73104e();
        if (e == null) {
            return null;
        }
        return e.f29304e;
    }

    /* renamed from: h */
    private static boolean m73107h() {
        if (m73104e() == null || !m73095a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m73095a() {
        if (m73104e() == null || !m73104e().f29303d || C47915gg.m103651b()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m73105f() {
        if (m73104e() == null || m73104e().f29304e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m73108i() {
        return m73096a(((Long) SharePrefCache.inst().getFestivalShareDonationTime().mo47782d()).longValue(), System.currentTimeMillis());
    }

    /* renamed from: e */
    public static C10912c m73104e() {
        if (f82126d != null) {
            return f82126d;
        }
        String str = (String) C23183v.m56778a().mo47898I().mo47782d();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            f82126d = (C10912c) new C17971f().mo34884a(str, C10912c.class);
        } catch (Exception unused) {
            f82126d = null;
        }
        return f82126d;
    }

    /* renamed from: a */
    private static ArrayList<String> m73094a(String str) {
        String[] split;
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : str.split(",")) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m73099b(Aweme aweme) {
        if (!m73107h() || aweme == null) {
            return false;
        }
        String stickerIDs = aweme.getStickerIDs();
        C10912c e = m73104e();
        if (e != null) {
            List<String> list = e.f29309j;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                ArrayList<String> a = m73094a(stickerIDs);
                Iterator it2 = a.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                for (String str : a) {
                    if (list != null && list.contains(str)) {
                        return true;
                    }
                }
            }
            String str2 = null;
            if (aweme.getUploadMiscInfoStruct() != null) {
                str2 = aweme.getUploadMiscInfoStruct().mvThemeId;
            }
            if (str2 != null) {
                List<String> list2 = e.f29311l;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    if (list2.contains(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m73101c(Aweme aweme) {
        if (aweme != null && aweme.getUploadMiscInfoStruct() != null && !TextUtils.isEmpty(aweme.getUploadMiscInfoStruct().mvThemeId) && m73095a()) {
            C10912c e = m73104e();
            if (e != null && m73104e().f29307h != null && !C9376b.m18558a((Collection<T>) e.f29311l) && e.f29311l.contains(aweme.getUploadMiscInfoStruct().mvThemeId)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m73097a(Aweme aweme) {
        if (aweme == null || !m73099b(aweme)) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author == null || C47950q.m103754c(aweme) || C47950q.m103755d(aweme)) {
            return false;
        }
        if (C20854a.m53167g().isMe(author.getUid())) {
            return m73103d(aweme);
        }
        if (!author.isSecret()) {
            return m73108i();
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m73103d(Aweme aweme) {
        if (!m73107h() || aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        if (C20854a.m53167g().isMe(aweme.getAuthor().getUid())) {
            User curUser = C20854a.m53167g().getCurUser();
            if (curUser == null || curUser.isSecret()) {
                return false;
            }
            List list = null;
            C23183v a = C23183v.m56778a();
            if (a.f61630l == null) {
                a.f61630l = new C23051bf<>("festival_share_donation_list", "");
            }
            try {
                list = (List) new C17971f().mo34885a((String) a.f61630l.mo47782d(), new C17956a<List<String>>() {
                }.f49843c);
            } catch (Exception unused) {
            }
            if (C9376b.m18558a((Collection<T>) list) || !list.contains(aweme.getAid())) {
                return false;
            }
            return true;
        } else if (aweme.getAuthor().isSecret() || !m73099b(aweme)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m73096a(long j, long j2) {
        boolean z;
        boolean z2;
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance2.setTimeInMillis(j2);
        int i = instance.get(1);
        int i2 = instance2.get(1);
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (i2 != i || instance2.get(6) - instance.get(6) <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
