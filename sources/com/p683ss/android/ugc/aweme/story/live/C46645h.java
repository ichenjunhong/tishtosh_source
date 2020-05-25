package com.p683ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.live.C36006a;
import com.p683ss.android.ugc.aweme.live.C36148r;
import com.p683ss.android.ugc.aweme.live.ILiveHostOuterService.C36000a;
import com.p683ss.android.ugc.aweme.live.Live;
import com.p683ss.android.ugc.aweme.p1803i.C33089c;
import com.p683ss.android.ugc.aweme.p1803i.C33089c.C33090a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.model.Story;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.live.h */
public final class C46645h implements C33089c {

    /* renamed from: a */
    public static boolean f117650a;

    /* renamed from: com.ss.android.ugc.aweme.story.live.h$a */
    static class C46647a {

        /* renamed from: a */
        public static C33089c f117653a = new C46645h();
    }

    /* renamed from: b */
    public static C33089c m101231b() {
        return C46647a.f117653a;
    }

    /* renamed from: a */
    public final void mo70087a() {
        Live.requestFeedTab();
    }

    /* renamed from: a */
    public final void mo70097a(C36006a aVar) {
        int i = -1;
        try {
            if (!C9431p.m18664a(aVar.f92275e)) {
                i = Integer.parseInt(aVar.f92275e);
            }
        } catch (Throwable unused) {
        }
        Bundle bundle = aVar.f92279i == null ? new Bundle() : aVar.f92279i;
        bundle.putInt("live.intent.extra.ENTER_LIVE_ORDER", aVar.f92281k);
        bundle.putInt("live.intent.extra.BACK_TAB_INDEX", i);
        bundle.putString("live.intent.extra.REQUEST_ID", aVar.f92278h);
        bundle.putLong("anchor_id", m101233c(aVar));
        for (String str : aVar.f92274d.keySet()) {
            bundle.putString(str, (String) aVar.f92274d.get(str));
        }
        if (!TextUtils.isEmpty(aVar.f92277g)) {
            bundle.putString("enter_method", aVar.f92277g);
        }
        bundle.putParcelable("live.intent.extra.SOURCE_POSITION", aVar.f92273c);
        String str2 = null;
        long j = -1;
        if (aVar.f92272b != null) {
            str2 = aVar.f92272b.roomData;
            j = aVar.f92272b.roomId;
        }
        Live.watchLive(aVar.f92271a, j, str2, bundle, aVar.f92276f, m101232b(aVar));
    }

    /* renamed from: c */
    private static long m101233c(C36006a aVar) {
        String str;
        if (aVar.f92272b != null) {
            str = aVar.f92272b.getUid();
        } else {
            str = null;
        }
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m101230a(User user) {
        if (user == null || user.isBlock()) {
            return false;
        }
        if (!C47915gg.m103652b(user, false) || user.getFollowStatus() == 2 || user.getFollowStatus() == 1 || C20854a.m53161a().userService().getCurUserId().equals(user.getUid())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static List<Long> m101232b(C36006a aVar) {
        ArrayList arrayList = new ArrayList();
        if (aVar.f92280j != null) {
            for (Story story : aVar.f92280j) {
                if (story.getUserInfo() != null) {
                    arrayList.add(Long.valueOf(story.getUserInfo().roomId));
                }
            }
            return arrayList;
        } else if (aVar.f92283m == null || aVar.f92283m.length <= 0) {
            return null;
        } else {
            for (long valueOf : aVar.f92283m) {
                arrayList.add(Long.valueOf(valueOf));
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo70089a(Context context, Bundle bundle) {
        Live.enterLiveConverge(context, bundle);
    }

    /* renamed from: a */
    public final void mo70090a(Context context, Bundle bundle, String str) {
        Live.enterLiveConverge(context, bundle, str);
    }

    /* renamed from: a */
    public final void mo70093a(final Context context, User user, C33090a aVar) {
        if (context != null && user != null && !f117650a) {
            if (!m101230a(user)) {
                C36148r.m81573a().requestUser(user.getUid(), user.getSecUid(), new C36000a() {
                    /* renamed from: a */
                    public final void mo74701a(Exception exc) {
                        C46645h.f117650a = false;
                    }

                    /* renamed from: a */
                    public final void mo74700a(User user) {
                        C46645h.f117650a = false;
                        if (user != null) {
                            if (!C46645h.m101230a(user)) {
                                C10691a.m21548c(context, (int) R.string.cxd).mo19066a();
                            } else {
                                new C46653l(context).mo93536a(user);
                            }
                        }
                    }
                });
                f117650a = true;
                return;
            }
            new C46653l(context).mo93536a(user);
        }
    }

    /* renamed from: a */
    public final void mo70094a(Context context, User user, String str) {
        if (context != null && user != null) {
            if (!m101230a(user)) {
                C10691a.m21548c(context, (int) R.string.cxd).mo19066a();
                return;
            }
            String requestId = user.getRequestId();
            C46641d.m101205a(context, 1, user.getUid(), user.roomId, C46641d.m101204a(str, "head", requestId));
            m101231b().mo70097a(new C36006a(new C46653l(context).f117667a, user).mo74741d(user.getRequestId()).mo74739b("search_result").mo74740c("others_photo"));
        }
    }

    /* renamed from: a */
    public final void mo70096a(Context context, User user, boolean z, C33090a aVar) {
        if (context != null && user != null) {
            if (!m101230a(user)) {
                C10691a.m21548c(context, (int) R.string.cxd).mo19066a();
                return;
            }
            C46641d.m101209a(context, z, 1, user.getRequestId(), user.getUid(), user.roomId);
            m101231b().mo70097a(new C36006a(new C46653l(context).f117667a, user).mo74741d(user.getRequestId()).mo74739b("others_homepage").mo74740c("others_photo"));
        }
    }

    /* renamed from: a */
    public final void mo70088a(Context context, long j, Bundle bundle, String str, ArrayList<Long> arrayList) {
        Live.watchLive(context, j, bundle, str, (List<Long>) arrayList);
    }

    /* renamed from: a */
    public final void mo70091a(Context context, User user, Rect rect, String str, Bundle bundle) {
        try {
            bundle.putLong("anchor_id", Long.valueOf(user.getUid()).longValue());
        } catch (Exception unused) {
        }
        Live.watchLive(context, user.roomId, user.roomData, bundle, str);
    }

    /* renamed from: a */
    public final void mo70095a(Context context, User user, String str, String str2, Bundle bundle) {
        mo70097a(new C36006a(context, user).mo74741d(user.getRequestId()).mo74739b(str).mo74740c(str2).mo74736a(bundle));
    }

    /* renamed from: a */
    public final void mo70092a(Context context, User user, Rect rect, List<Story> list, String str, int i, boolean z, int i2) {
        if (context != null && user != null) {
            C46641d.m101207a(context, 1, user.getRequestId(), user.getUid(), user.roomId, str);
            C46653l lVar = new C46653l(context);
            C33089c b = m101231b();
            C36006a d = new C36006a(lVar.f117667a, user).mo74741d(user.getRequestId());
            d.f92273c = rect;
            b.mo70097a(d.mo74739b("toplist").mo74740c("others_photo"));
        }
    }
}
