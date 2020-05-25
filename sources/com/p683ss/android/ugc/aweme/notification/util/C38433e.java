package com.p683ss.android.ugc.aweme.notification.util;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38087b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38102o;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38105r;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.ChallengeNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p683ss.android.ugc.aweme.notice.repo.p2010a.C38081a;
import com.p683ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.notification.util.e */
public final class C38433e implements C9382a {

    /* renamed from: a */
    public HashMap<Integer, C38436b> f97822a;

    /* renamed from: b */
    private C9381g f97823b;

    /* renamed from: com.ss.android.ugc.aweme.notification.util.e$a */
    static class C38435a {

        /* renamed from: a */
        public static final C38433e f97831a = new C38433e();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.util.e$b */
    public interface C38436b {
        /* renamed from: a */
        void mo78170a(BaseNotice baseNotice);
    }

    /* renamed from: a */
    public static C38433e m85749a() {
        return C38435a.f97831a;
    }

    private C38433e() {
        this.f97823b = new C9381g(this);
        this.f97822a = new HashMap<>();
    }

    public final void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof C23459a) {
            C10691a.m21545b(C11010c.m22280a(), ((C23459a) obj).getErrorMsg()).mo19066a();
        } else if (obj instanceof Exception) {
            C10691a.m21545b(C11010c.m22280a(), C11010c.m22280a().getString(R.string.cg2)).mo19066a();
        } else {
            if (obj instanceof NoticeResponse) {
                C38436b bVar = (C38436b) this.f97822a.get(Integer.valueOf(i));
                if (bVar != null) {
                    List items = ((NoticeResponse) obj).getItems();
                    if (items == null || items.isEmpty()) {
                        bVar.mo78170a(null);
                    } else {
                        bVar.mo78170a((BaseNotice) items.get(0));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo78333a(int i, C38436b bVar) {
        this.f97822a.put(Integer.valueOf(i), bVar);
        m85750a(0, 0, 1, i, null, 0);
    }

    /* renamed from: a */
    public static void m85751a(C35456b bVar, BaseNotice baseNotice) {
        if (bVar != null && baseNotice != null) {
            String str = "";
            String str2 = "";
            AnnouncementNotice announcement = baseNotice.getAnnouncement();
            ChallengeNotice challengeNotice = baseNotice.getChallengeNotice();
            UserTextNotice textNotice = baseNotice.getTextNotice();
            C38102o shopNotice = baseNotice.getShopNotice();
            FriendNotice friendNotice = baseNotice.getFriendNotice();
            C38087b adHelperNotice = baseNotice.getAdHelperNotice();
            C38105r tcmNotice = baseNotice.getTcmNotice();
            if (announcement != null) {
                Challenge challenge = announcement.getChallenge();
                if (challenge != null) {
                    str = challenge.getChallengeName();
                    str2 = announcement.getContent();
                    bVar.f91120k = 1;
                } else {
                    str = announcement.getTitle();
                }
            }
            if (challengeNotice != null) {
                Challenge challenge2 = challengeNotice.getChallenge();
                if (challenge2 != null) {
                    str = challenge2.getChallengeName();
                    str2 = challengeNotice.getContent();
                    bVar.f91120k = 1;
                } else {
                    str = challengeNotice.getTitle();
                }
            }
            if (textNotice != null) {
                str = textNotice.getTitle();
                str2 = textNotice.getContent();
            }
            if (shopNotice != null) {
                str = shopNotice.f96937b;
                str2 = shopNotice.f96936a;
            }
            if (friendNotice != null) {
                str2 = friendNotice.getContent();
            }
            if (adHelperNotice != null) {
                str = adHelperNotice.f96890b;
                str2 = adHelperNotice.f96889a;
            }
            if (tcmNotice != null) {
                str = tcmNotice.f96946a;
                str2 = tcmNotice.f96947b;
            }
            if (!TextUtils.isEmpty(str)) {
                bVar.f91117h = str;
            } else {
                bVar.f91117h = str2;
            }
            bVar.mo73751a(baseNotice.getCreateTime());
        }
    }

    /* renamed from: a */
    private void m85750a(long j, long j2, int i, int i2, Integer num, int i3) {
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.f97823b;
        final int i4 = i2;
        C384341 r1 = new Callable<NoticeResponse>(0, 0, 1, null, 0) {

            /* renamed from: a */
            final /* synthetic */ long f97824a;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public NoticeResponse call() throws Exception {
                try {
                    return NoticeApiManager.m85270a(this.f97824a, 0, 1, i4, null, 0, C38081a.m85158a(), C38081a.m85160b());
                } catch (ExecutionException e) {
                    throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                }
            }

            {
                this.f97824a = r2;
            }
        };
        a.mo48750a(gVar, r1, i2);
    }
}
