package com.p683ss.android.ugc.aweme.feed.utils;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26879e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.f */
public final class C31190f {
    /* renamed from: h */
    public static boolean m72840h(Aweme aweme) {
        return false;
    }

    /* renamed from: i */
    public static boolean m72841i(Aweme aweme) {
        return false;
    }

    /* renamed from: m */
    public static boolean m72845m(Aweme aweme) {
        return C31204p.m72865a(aweme);
    }

    /* renamed from: c */
    public static Aweme m72835c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.isForwardAweme()) {
            aweme = aweme.getForwardItem();
        }
        return aweme;
    }

    /* renamed from: d */
    public static boolean m72836d(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String m72838f(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    /* renamed from: l */
    public static boolean m72844l(Aweme aweme) {
        if (aweme == null || !aweme.isPreventDownload()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m72834b(Aweme aweme) {
        if (aweme == null || aweme.getHotListStruct() == null || aweme.getHotListStruct().getType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m72837e(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null) {
            return false;
        }
        return aweme.getStatus().isDelete();
    }

    /* renamed from: g */
    public static boolean m72839g(Aweme aweme) {
        if (aweme == null || !m72831a(aweme) || !aweme.isProhibited()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m72842j(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRiskModel() == null || (!aweme.getAwemeRiskModel().isWarn() && !aweme.getAwemeRiskModel().isNotice())) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m72846n(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRiskModel() == null || !aweme.getAwemeRiskModel().isWarn()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m72843k(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null || m72846n(aweme) || !m72847o(aweme) || ((C47950q.m103758g(aweme) && !C47915gg.m103647a(aweme.getAuthorUid())) || m72845m(aweme))) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private static boolean m72847o(Aweme aweme) {
        if (!(aweme == null || aweme.getAuthor() == null)) {
            int downloadSetting = aweme.getAuthor().getDownloadSetting();
            if (downloadSetting == 3) {
                return m72831a(aweme);
            }
            switch (downloadSetting) {
                case 0:
                    return true;
                case 1:
                    if (C47950q.m103756e(aweme) || m72831a(aweme)) {
                        return true;
                    }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Aweme m72830a(String str) {
        Aweme awemeById = C23324d.m57378a().getAwemeById(str);
        if (awemeById == null) {
            awemeById = C23324d.m57378a().getProfileSelfSeeAweme(str);
        }
        if (awemeById != null) {
            return awemeById;
        }
        StringBuilder sb = new StringBuilder("getAweme ");
        sb.append(str);
        sb.append(" is null, mock one");
        C32458a.m75141a(6, "DeleteAweme", sb.toString());
        Aweme aweme = new Aweme();
        aweme.setAid(str);
        return aweme;
    }

    /* renamed from: a */
    public static boolean m72831a(Aweme aweme) {
        User user;
        if (aweme == null) {
            user = null;
        } else {
            user = aweme.getAuthor();
        }
        if (user != null) {
            return TextUtils.equals(user.getUid(), C20854a.m53167g().getCurUser().getUid());
        }
        return false;
    }

    /* renamed from: a */
    public static int m72829a(List<Aweme> list, Aweme aweme) {
        if (aweme == null || aweme.getAid() == null || list == null || list.isEmpty()) {
            return -1;
        }
        String aid = aweme.getAid();
        for (int i = 0; i < list.size(); i++) {
            Aweme aweme2 = (Aweme) list.get(i);
            if (aweme2 != null && aid.equals(aweme2.getAid())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m72833b(List<Aweme> list, Aweme aweme) {
        if (aweme == null || aweme.getAid() == null || list == null || list.isEmpty()) {
            return -1;
        }
        String aid = aweme.getAid();
        for (int size = list.size() - 1; size >= 0; size--) {
            Aweme aweme2 = (Aweme) list.get(size);
            if (aweme2 != null && aid.equals(aweme2.getAid())) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m72832a(Collection<Aweme> collection, Aweme aweme, List<C26874f> list) {
        if (aweme == null || aweme.getAid() == null || collection == null || collection.isEmpty()) {
            C32458a.m75141a(6, "DeleteAweme", "aweme is null or items is null, delete failed");
            return true;
        }
        int i = -1;
        String aid = aweme.getAid();
        Iterator it = collection.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Aweme aweme2 = (Aweme) it.next();
            if (aweme2 != null && aid.equals(aweme2.getAid())) {
                it.remove();
                i = i2;
                break;
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder("delete aweme : ");
        sb.append(aid);
        sb.append(", index is ");
        sb.append(i);
        C32458a.m75141a(6, "DeleteAweme", sb.toString());
        if (i >= 0 && !C9376b.m18558a((Collection<T>) list)) {
            for (C26874f fVar : list) {
                if (fVar instanceof C26879e) {
                    ((C26879e) fVar).mo46992a(i);
                }
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }
}
