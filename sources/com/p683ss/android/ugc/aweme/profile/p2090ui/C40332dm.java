package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView.C28448a;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.profile.experiment.UserRateRemindExperiment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.model.UserRateRemindInfo;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dm */
public final class C40332dm implements C28448a {

    /* renamed from: e */
    private static final boolean f102948e = false;

    /* renamed from: a */
    public UserRateRemindInfo f102949a;

    /* renamed from: b */
    public NoticeView f102950b;

    /* renamed from: c */
    public boolean f102951c = true;

    /* renamed from: d */
    public Context f102952d;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dm$a */
    public static class C40333a {

        /* renamed from: a */
        public String f102953a;

        /* renamed from: b */
        public long f102954b;

        /* renamed from: c */
        long f102955c;

        /* renamed from: d */
        long f102956d;

        /* renamed from: e */
        long f102957e;
    }

    /* renamed from: c */
    public static List<C40333a> m89689c() {
        List<C40333a> list;
        String b = C23859b.m58575b().mo49468b(C11010c.m22280a(), "user_rate_remind_key", "");
        if (TextUtils.isEmpty(b)) {
            return new ArrayList();
        }
        try {
            list = C47760cd.m103386b(b, C40333a[].class);
        } catch (Exception unused) {
            list = new ArrayList<>();
        }
        return list;
    }

    /* renamed from: d */
    private static boolean m89691d() {
        User curUser = C20854a.m53167g().getCurUser();
        if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
            String uid = curUser.getUid();
            for (C40333a aVar : m89689c()) {
                if (aVar != null && aVar.f102953a != null && TextUtils.equals(aVar.f102953a, uid) && aVar.f102955c > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo51945a() {
        boolean z = true;
        if (m89688b(this.f102949a) == 1 && this.f102952d != null) {
            C26890h.m65011a("toast_click", C23089d.m56640a().mo47826a("have_view_more", m89688b(this.f102949a)).mo47829a("click_position", "view_more").mo47829a("toast_type", "publisher_block").f61491a);
            this.f102950b.setVisibility(4);
            User curUser = C20854a.m53167g().getCurUser();
            if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
                String uid = curUser.getUid();
                List c = m89689c();
                Iterator it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C40333a aVar = (C40333a) it.next();
                    if (aVar != null && aVar.f102953a != null && TextUtils.equals(aVar.f102953a, uid)) {
                        aVar.f102956d = System.currentTimeMillis();
                        break;
                    }
                }
                if (!z) {
                    C40333a aVar2 = new C40333a();
                    aVar2.f102953a = uid;
                    aVar2.f102956d = System.currentTimeMillis();
                    c.add(aVar2);
                }
                mo82587a(c);
            }
            SmartRouter.buildRoute(this.f102952d, this.f102949a.getDetailLink()).open();
        }
    }

    /* renamed from: b */
    public final void mo51946b() {
        C26890h.m65011a("toast_click", C23089d.m56640a().mo47826a("have_view_more", m89688b(this.f102949a)).mo47829a("click_position", "cross").mo47829a("toast_type", "publisher_block").f61491a);
        this.f102950b.setVisibility(4);
        User curUser = C20854a.m53167g().getCurUser();
        if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
            String uid = curUser.getUid();
            List c = m89689c();
            boolean z = false;
            Iterator it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C40333a aVar = (C40333a) it.next();
                if (aVar != null && aVar.f102953a != null && TextUtils.equals(aVar.f102953a, uid)) {
                    z = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    aVar.f102955c = currentTimeMillis;
                    if (aVar.f102957e <= 0) {
                        aVar.f102957e = currentTimeMillis;
                    }
                }
            }
            if (!z) {
                C40333a aVar2 = new C40333a();
                aVar2.f102953a = uid;
                aVar2.f102955c = System.currentTimeMillis();
                aVar2.f102957e = System.currentTimeMillis();
                c.add(aVar2);
            }
            mo82587a(c);
        }
    }

    public C40332dm(NoticeView noticeView) {
        this.f102950b = noticeView;
    }

    /* renamed from: b */
    public static int m89688b(UserRateRemindInfo userRateRemindInfo) {
        if (!TextUtils.isEmpty(userRateRemindInfo.getDetailLink())) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo82587a(List<C40333a> list) {
        if (list != null && this.f102952d != null) {
            try {
                C23859b.m58575b().mo49465a(this.f102952d, "user_rate_remind_key", C47760cd.m103385a(list));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m89687a(UserRateRemindInfo userRateRemindInfo) {
        if (userRateRemindInfo == null) {
            return false;
        }
        switch (C10181b.m20511a().mo18168a(UserRateRemindExperiment.class, true, "user_rate_strategy", 31744, 0)) {
            case 0:
                return false;
            case 1:
                return m89690c(userRateRemindInfo);
            case 2:
                return m89691d();
            default:
                return false;
        }
    }

    /* renamed from: c */
    private static boolean m89690c(UserRateRemindInfo userRateRemindInfo) {
        User curUser = C20854a.m53167g().getCurUser();
        if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
            String uid = curUser.getUid();
            Iterator it = m89689c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C40333a aVar = (C40333a) it.next();
                if (aVar != null && aVar.f102953a != null && TextUtils.equals(aVar.f102953a, uid)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (aVar.f102956d > 0 && aVar.f102955c > 0 && aVar.f102956d < aVar.f102955c) {
                        return false;
                    }
                    if (aVar.f102957e > 0 && !m89686a(currentTimeMillis, aVar.f102957e, userRateRemindInfo.getShowDayLimit())) {
                        return false;
                    }
                    if (aVar.f102955c > 0 && aVar.f102956d <= 0 && m89686a(currentTimeMillis, aVar.f102955c, 1)) {
                        return false;
                    }
                    if (aVar.f102955c <= 0 || m89688b(userRateRemindInfo) != 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m89686a(long j, long j2, int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        if (i < 0) {
            i = 3;
        }
        int i2 = instance.get(6);
        int i3 = instance.get(1);
        int i4 = instance2.get(6);
        int i5 = 0;
        for (int i6 = instance2.get(1); i6 < i3; i6++) {
            if ((i6 % 4 != 0 || i6 % 100 == 0) && i6 % MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL != 0) {
                i5 += 365;
            } else {
                i5 += 366;
            }
        }
        if (i5 + (i2 - i4) < i) {
            return true;
        }
        return false;
    }
}
