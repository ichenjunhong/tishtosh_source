package com.p683ss.android.ugc.aweme.p1807im;

import android.app.Application;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38064h;
import com.p683ss.android.ugc.aweme.p1807im.service.C35421a;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.im.e */
public final class C33194e extends C33200k {
    /* renamed from: b */
    public static boolean m76265b() {
        return m76266c();
    }

    /* renamed from: c */
    public static boolean m76266c() {
        return m76279d().isXPlanB();
    }

    /* renamed from: a */
    public static boolean m76264a() {
        if (((Integer) SharePrefCache.inst().getCanIm().mo47782d()).intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static IMUser m76261a(User user) {
        if (user == null) {
            return null;
        }
        return IMUser.fromUser(user);
    }

    /* renamed from: a */
    public static void m76263a(Application application, IIMService iIMService) {
        if (iIMService != null) {
            C35421a aVar = new C35421a();
            aVar.f91098g = (int) C11010c.m22287h();
            aVar.f91097f = C11010c.m22295p();
            aVar.f91096e = "https://api.tiktokv.com/aweme/v1/";
            aVar.f91095d = "https://api.tiktokv.com/";
            aVar.f91094c = "https://imapi-16.tiktokv.com/";
            aVar.f91093b = C38064h.f96840a;
            aVar.f91099h = C11010c.m22283d();
            aVar.f91092a = false;
            iIMService.initialize(application, aVar, new C33201l());
            iIMService.setAbInterface(new C33196g(15));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|(1:12)(1:13)|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        r0.f91145c = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst().getMultiSelectLimit();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0072 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0087 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[Catch:{ a -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057 A[Catch:{ a -> 0x0062 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ugc.aweme.p1807im.service.model.C35468e m76262a(android.content.SharedPreferences.Editor r3, com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r4) {
        /*
            com.ss.android.ugc.aweme.im.service.model.e r0 = new com.ss.android.ugc.aweme.im.service.model.e
            r0.<init>()
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ a -> 0x0014 }
            com.ss.android.ugc.aweme.app.bf r1 = r1.getOpenImLinkItem()     // Catch:{ a -> 0x0014 }
            java.lang.Integer r2 = r4.getOpenImLink()     // Catch:{ a -> 0x0014 }
            r1.mo47779b(r3, r2)     // Catch:{ a -> 0x0014 }
        L_0x0014:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ a -> 0x0023 }
            com.ss.android.ugc.aweme.app.bf r1 = r1.getImUrlTemplateItem()     // Catch:{ a -> 0x0023 }
            java.lang.String r2 = r4.getImUrlTemplate()     // Catch:{ a -> 0x0023 }
            r1.mo47779b(r3, r2)     // Catch:{ a -> 0x0023 }
        L_0x0023:
            java.lang.Integer r1 = r4.getOpenImLink()     // Catch:{ a -> 0x002d }
            int r1 = r1.intValue()     // Catch:{ a -> 0x002d }
            r0.f91143a = r1     // Catch:{ a -> 0x002d }
        L_0x002d:
            java.lang.String r1 = r4.getImUrlTemplate()     // Catch:{ a -> 0x0033 }
            r0.f91144b = r1     // Catch:{ a -> 0x0033 }
        L_0x0033:
            java.lang.Integer r1 = r4.getImContactsMultiSelectLimit()     // Catch:{ a -> 0x0062 }
            int r1 = r1.intValue()     // Catch:{ a -> 0x0062 }
            if (r1 <= 0) goto L_0x0057
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ a -> 0x0062 }
            com.ss.android.ugc.aweme.app.bf r1 = r1.getMultiSelectLimitItem()     // Catch:{ a -> 0x0062 }
            java.lang.Integer r2 = r4.getImContactsMultiSelectLimit()     // Catch:{ a -> 0x0062 }
            r1.mo47779b(r3, r2)     // Catch:{ a -> 0x0062 }
            java.lang.Integer r3 = r4.getImContactsMultiSelectLimit()     // Catch:{ a -> 0x0062 }
            int r3 = r3.intValue()     // Catch:{ a -> 0x0062 }
            r0.f91145c = r3     // Catch:{ a -> 0x0062 }
            goto L_0x006c
        L_0x0057:
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ a -> 0x0062 }
            int r3 = r3.getMultiSelectLimit()     // Catch:{ a -> 0x0062 }
            r0.f91145c = r3     // Catch:{ a -> 0x0062 }
            goto L_0x006c
        L_0x0062:
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            int r3 = r3.getMultiSelectLimit()
            r0.f91145c = r3
        L_0x006c:
            com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings r3 = r4.getFlipchatSettings()     // Catch:{ a -> 0x0072 }
            r0.f91146d = r3     // Catch:{ a -> 0x0072 }
        L_0x0072:
            com.ss.android.ugc.aweme.im.service.model.f r3 = new com.ss.android.ugc.aweme.im.service.model.f     // Catch:{ a -> 0x007d }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanSetting r1 = r4.getImXDisplayStyleConfig()     // Catch:{ a -> 0x007d }
            r3.<init>(r1)     // Catch:{ a -> 0x007d }
            r0.f91147e = r3     // Catch:{ a -> 0x007d }
        L_0x007d:
            java.lang.Integer r3 = r4.getImXUnreadCountStrategy()     // Catch:{ a -> 0x0087 }
            int r3 = r3.intValue()     // Catch:{ a -> 0x0087 }
            r0.f91148f = r3     // Catch:{ a -> 0x0087 }
        L_0x0087:
            java.lang.Integer r3 = r4.getImXUseEncryptedImage()     // Catch:{ a -> 0x0091 }
            int r3 = r3.intValue()     // Catch:{ a -> 0x0091 }
            r0.f91149g = r3     // Catch:{ a -> 0x0091 }
        L_0x0091:
            com.ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble r3 = r4.getImCreateChatBubble()     // Catch:{ a -> 0x00ad }
            java.lang.Integer r3 = r3.getShowFlag()     // Catch:{ a -> 0x00ad }
            int r3 = r3.intValue()     // Catch:{ a -> 0x00ad }
            r0.f91151i = r3     // Catch:{ a -> 0x00ad }
            com.ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble r3 = r4.getImCreateChatBubble()     // Catch:{ a -> 0x00ad }
            java.lang.Integer r3 = r3.getTimeInterval()     // Catch:{ a -> 0x00ad }
            int r3 = r3.intValue()     // Catch:{ a -> 0x00ad }
            r0.f91152j = r3     // Catch:{ a -> 0x00ad }
        L_0x00ad:
            java.lang.Integer r3 = r4.getMaxMessageCountForRecommend()     // Catch:{ a -> 0x00b7 }
            int r3 = r3.intValue()     // Catch:{ a -> 0x00b7 }
            r0.f91153k = r3     // Catch:{ a -> 0x00b7 }
        L_0x00b7:
            java.lang.Boolean r3 = r4.getDisableImMessageFullFeedSlide()     // Catch:{ a -> 0x00c1 }
            boolean r3 = r3.booleanValue()     // Catch:{ a -> 0x00c1 }
            r0.f91154l = r3     // Catch:{ a -> 0x00c1 }
        L_0x00c1:
            java.lang.Integer r3 = r4.getEnabledImAsupporterMsgTypes()     // Catch:{ a -> 0x00cb }
            int r3 = r3.intValue()     // Catch:{ a -> 0x00cb }
            r0.f91155m = r3     // Catch:{ a -> 0x00cb }
        L_0x00cb:
            java.lang.Integer r3 = r4.getEnabledImAsupporterFuncs()     // Catch:{ a -> 0x00d5 }
            int r3 = r3.intValue()     // Catch:{ a -> 0x00d5 }
            r0.f91156n = r3     // Catch:{ a -> 0x00d5 }
        L_0x00d5:
            java.util.List r3 = r4.getImImageDomains()
            r0.f91150h = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.C33194e.m76262a(android.content.SharedPreferences$Editor, com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy):com.ss.android.ugc.aweme.im.service.model.e");
    }
}
