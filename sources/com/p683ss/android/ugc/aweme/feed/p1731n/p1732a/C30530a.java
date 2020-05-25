package com.p683ss.android.ugc.aweme.feed.p1731n.p1732a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.share.AwemeACLStruct;
import com.p683ss.android.ugc.aweme.share.C41994c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.n.a.a */
public final class C30530a {
    /* renamed from: a */
    private static String m71489a() {
        C23051bf downloadForbiddenToast = SharePrefCache.inst().getDownloadForbiddenToast();
        if (downloadForbiddenToast == null) {
            return null;
        }
        return (String) downloadForbiddenToast.mo47782d();
    }

    /* renamed from: e */
    private static boolean m71497e(Aweme aweme) {
        return aweme.isReviewed();
    }

    /* renamed from: b */
    public static boolean m71494b(Aweme aweme) {
        if (aweme == null || aweme.getDownloadStatus() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m71495c(Aweme aweme) {
        if (m71499g(aweme) || m71496d(aweme)) {
            return true;
        }
        if (aweme == null || !m71491a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m71498f(Aweme aweme) {
        if (!C23183v.m56778a().mo47894E() || aweme == null || m71497e(aweme) || m71491a(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m71491a(Aweme aweme) {
        return TextUtils.equals(C20854a.m53167g().getCurUserId(), aweme.getAuthorUid());
    }

    /* renamed from: g */
    private static boolean m71499g(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null || !aweme.getStatus().isReviewed() || !aweme.getStatus().isSelfSee() || !((Boolean) C23183v.m56778a().mo47922r().mo47782d()).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m71496d(Aweme aweme) {
        Integer num = (Integer) C23183v.m56778a().mo47893D().mo47782d();
        if (num == null || num.intValue() != 2) {
            return false;
        }
        User currentUser = BaseUserService.getBaseUserService_Monster().getCurrentUser();
        if (aweme == null || currentUser == null || !TextUtils.equals(aweme.getRegion(), currentUser.getRegion()) || m71497e(aweme) || m71491a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m71493b(Context context, Aweme aweme) {
        if (!m71498f(aweme)) {
            String a = m71489a();
            if (TextUtils.isEmpty(a)) {
                a = context.getString(R.string.at7);
            }
            C10691a.m21546b(context, a, 1).mo19066a();
            return false;
        } else if (C31190f.m72831a(aweme) || m71494b(aweme)) {
            return true;
        } else {
            C10691a.m21545b(context, context.getString(R.string.b5q)).mo19066a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m71490a(Context context, Aweme aweme) {
        if (!m71498f(aweme)) {
            String a = m71489a();
            if (TextUtils.isEmpty(a)) {
                a = context.getString(R.string.at7);
            }
            AwemeACLStruct.m91858a().setToastMsg(a);
            C41994c.m91964a("", aweme);
            C10691a.m21546b(context, a, 1).mo19066a();
            return false;
        } else if (m71494b(aweme)) {
            return true;
        } else {
            AwemeACLStruct.m91858a().setToastMsg(context.getString(R.string.b5q));
            C41994c.m91964a("", aweme);
            C10691a.m21545b(context, context.getString(R.string.b5q)).mo19066a();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m71492a(com.p683ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = m71499g(r5)
            if (r1 != 0) goto L_0x0069
            boolean r1 = m71496d(r5)
            if (r1 == 0) goto L_0x0011
            goto L_0x0069
        L_0x0011:
            com.ss.android.ugc.aweme.feed.model.Video r1 = r5.getVideo()
            r2 = 1
            if (r1 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.feed.model.Video r1 = r5.getVideo()
            boolean r1 = r1.isHasWaterMark()
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 != 0) goto L_0x0045
            com.ss.android.ugc.aweme.feed.model.Video r1 = r5.getVideo()
            if (r1 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.feed.model.Video r1 = r5.getVideo()
            boolean r1 = r1.hasEndWaterMark()
            if (r1 == 0) goto L_0x003f
            boolean r1 = com.p683ss.android.ugc.aweme.share.libra.MTEndWatermarkExperiment.m92638a()
            if (r1 == 0) goto L_0x003f
            r1 = 1
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r1 = 0
            goto L_0x0046
        L_0x0045:
            r1 = 1
        L_0x0046:
            boolean r3 = m71497e(r5)
            boolean r4 = m71491a(r5)
            if (r4 == 0) goto L_0x005b
            if (r3 == 0) goto L_0x0053
            return r2
        L_0x0053:
            boolean r5 = com.p683ss.android.ugc.aweme.share.libra.CloseClientWatermarkExperiment.m92635a()
            if (r5 != 0) goto L_0x005a
            return r2
        L_0x005a:
            return r0
        L_0x005b:
            boolean r5 = r5.isImage()
            if (r5 == 0) goto L_0x0062
            return r2
        L_0x0062:
            if (r1 == 0) goto L_0x0068
            if (r6 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            return r0
        L_0x0068:
            return r2
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.C30530a.m71492a(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }
}
