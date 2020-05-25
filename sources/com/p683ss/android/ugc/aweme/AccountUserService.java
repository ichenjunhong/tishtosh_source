package com.p683ss.android.ugc.aweme;

import android.os.Handler;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12992d;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b.C18493a;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.C24514cb;
import com.p683ss.android.ugc.aweme.IAccountUserService.C20841a;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.network.C22077a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.service.C36679a;
import com.p683ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.model.VideoCover;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.user.C47538a;
import com.p683ss.android.ugc.aweme.user.C47541b;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.user.C47557d;
import com.p683ss.android.ugc.aweme.user.C47557d.C47558a;
import com.p683ss.android.ugc.aweme.user.p2381b.C47544c.C47545a;
import com.p683ss.android.ugc.aweme.user.p2381b.C47544c.C47547b;
import com.p683ss.android.ugc.aweme.user.p2381b.C47544c.C47548c;
import com.p683ss.android.ugc.aweme.user.p2382c.C47550a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import org.p2692b.C53694b;
import p001a.C0013i;
import p064c.p065a.C1680ad;
import p064c.p065a.C1682af;
import p064c.p065a.C1684ah;
import p064c.p065a.C1685ai;
import p064c.p065a.C2149h;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p079b.C1848v;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.AccountUserService */
public class AccountUserService implements IAccountUserService {
    private static final int AGE_GATE_MODE_US_FTC = 1;
    private volatile boolean mHastInitialized;

    static final /* synthetic */ C1685ai lambda$logoutAllBackgroundUser$6$AccountUserService(C1680ad adVar, Object obj) throws Exception {
        return adVar;
    }

    static final /* synthetic */ String lambda$refreshPassportUserInfo$1$AccountUserService(Throwable th) throws Exception {
        return "";
    }

    static final /* synthetic */ void lambda$refreshPassportUserInfo$3$AccountUserService(Throwable th) throws Exception {
    }

    public void accountUserClear() {
        C0013i.m16a(C24480ca.f64866a);
    }

    public List<String> allUidList() {
        C47549c.m102974a();
        return C47549c.m102980f();
    }

    public User getCurUser() {
        C47549c.m102974a();
        return C47549c.m102975b();
    }

    public String getCurUserId() {
        C47549c.m102974a();
        return C47549c.m102979e();
    }

    public int getUidContactPermissionCount() {
        return C24429bw.f64808a.count();
    }

    public boolean hasUpdated() {
        return C47549c.m102974a().f119966b;
    }

    public boolean isLogin() {
        C47549c.m102974a();
        return C47549c.m102978c();
    }

    public boolean isNewUser() {
        return C24514cb.f64933a.f64823a;
    }

    public String getLastUid() {
        C47549c.m102974a();
        return C47557d.f119986b.mo94874g();
    }

    public boolean hasCommerceVideoRights() {
        C47549c.m102974a();
        return C47549c.m102975b().isWithItemCommerceEntry();
    }

    public boolean isOnCommerceWhiteList() {
        C47549c.m102974a();
        return C47549c.m102975b().isWithCommerceEntry();
    }

    public void checkIn() {
        init();
        C23566n.m57766a().mo48750a(C47549c.m102974a().f119969e, new Callable(C47549c.f119964a) {

            /* renamed from: a */
            final /* synthetic */ String f119982a;

            public final Object call() throws Exception {
                C24514cb.m59920a().mo46189b(Integer.MAX_VALUE, this.f119982a);
                return null;
            }

            {
                this.f119982a = r1;
            }
        }, 113);
    }

    public boolean getAuthGoods() {
        C47549c.m102974a();
        if (((C47549c.m102975b().getAuthorityStatus() >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    public String getAvatarUrl() {
        C47538a d = C47557d.f119986b.mo94870d(C47557d.m102992f());
        if (d != null) {
            return d.f119951e;
        }
        return "";
    }

    public String getNickName() {
        C47538a d = C47557d.f119986b.mo94870d(C47557d.m102992f());
        if (d != null) {
            return d.f119950d;
        }
        return "";
    }

    public String getPhoneCountryCode() {
        C47558a c = C47557d.f119986b.mo94869c(C47557d.m102992f());
        if (c == null) {
            return "";
        }
        return c.f119999e;
    }

    public String getSessionKey() {
        C47558a c = C47557d.f119986b.mo94869c(C47557d.m102992f());
        if (c != null) {
            return c.f119996b;
        }
        return "";
    }

    public void init() {
        if (!this.mHastInitialized) {
            this.mHastInitialized = true;
            C24514cb.f64933a = new C24445bx();
            addUserChangeListener(C20842a.f56787e);
        }
    }

    public boolean isOldUser() {
        C47549c.m102974a();
        User b = C47549c.m102975b();
        if (b == null || b.getCreateTime() < 1506787200) {
            return true;
        }
        return false;
    }

    public boolean isUidContactPermisioned() {
        boolean z = false;
        try {
            if (C0726c.m2090a(C11010c.m22280a(), "android.permission.READ_CONTACTS") != -1) {
                z = true;
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void updateFbExpireTime() {
        C47549c.m102974a();
        C47549c.m102975b().setFbExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        C47557d.m102995i();
    }

    public void updateTwExpireTime() {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setTwExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        C47557d.m102995i();
    }

    public void updateYoutubeExpireTime() {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setYoutubeExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        C47557d.m102995i();
    }

    public String getCurSecUserId() {
        if (!TextUtils.isEmpty(getCurUser().getSecUid())) {
            return getCurUser().getSecUid();
        }
        C47558a c = C47557d.f119986b.mo94869c(C47557d.m102992f());
        if (c == null || TextUtils.isEmpty(c.f120000f)) {
            return "";
        }
        return c.f120000f;
    }

    public boolean hasCurUserSetPassword() {
        Keva repo = Keva.getRepo("password_status");
        StringBuilder sb = new StringBuilder();
        sb.append(C47557d.m102992f());
        sb.append("_password_set_status");
        return repo.getBoolean(sb.toString(), false);
    }

    public boolean isChildrenMode() {
        init();
        User currentUser = BaseUserService.getBaseUserService_Monster().getCurrentUser();
        int g = ((C22475af) C20842a.m53148a(C22475af.class)).mo46780g();
        if (currentUser == null || g != 1) {
            return false;
        }
        return true;
    }

    public void queryUser() {
        init();
        C47550a.m102987a(C47549c.m102974a().f119969e, ((C36679a) C20842a.m53148a(C36679a.class)).mo47860a(), false, 112);
    }

    public void refreshPassportUserInfo() {
        if (isLogin()) {
            init();
            C2149h a = C2149h.m6452a(C27310d.f72032a);
            C1711f fVar = C27941e.f73360a;
            C1745b.m6050a(fVar, "valueSupplier is null");
            C2150a.m6483a((C2149h<T>) new C1848v<T>(a, fVar)).mo6452b(C2168a.m6521b()).mo6438a(C27942f.f73361a, C27943g.f73362a);
        }
    }

    public boolean shouldRefresh() {
        C47549c a = C47549c.m102974a();
        if (!a.f119966b || ((a.f119968d >= 0 && System.currentTimeMillis() - a.f119968d >= 180000) || a.f119967c)) {
            return true;
        }
        return false;
    }

    public C1680ad<C12992d> logoutAllBackgroundUser() {
        C47549c.m102974a();
        List f = C47549c.m102980f();
        if (f.size() < 2) {
            return null;
        }
        C47549c.m102974a();
        String e = C47549c.m102979e();
        StringBuilder sb = new StringBuilder("?uids=");
        for (int size = f.size() - 1; size >= 0; size--) {
            if (!TextUtils.equals((CharSequence) f.get(size), e)) {
                C47549c.m102974a();
                C47549c.m102977b((String) f.get(size));
                sb.append((String) f.get(size));
                sb.append(",");
            }
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return C1680ad.m5962a((Callable<? extends T>) new C27945i<Object>(sb)).mo6155b(C2168a.m6521b()).mo6151a((C1711f<? super T, ? extends C1685ai<? extends R>>) new C27946j<Object,Object>(C1680ad.m5958a((C1684ah<T>) new C27944h<T>(this)))).mo6148a(C1667a.m5940a());
    }

    public void setNetworkProxyInstance(C22077a aVar) {
        C24514cb.f64934b = aVar;
    }

    public void storeUidContactPermisioned(boolean z) {
        C24429bw bwVar = C24429bw.f64809b;
    }

    public C47538a findSignificanUserInfo(String str) {
        return C47557d.f119986b.mo94870d(str);
    }

    public boolean isNullUid(String str) {
        return C47557d.m102993f(str);
    }

    public boolean isMe(String str) {
        return C9431p.m18665a(str, getCurUserId());
    }

    public void removeUserChangeListener(C20841a aVar) {
        synchronized (C24514cb.class) {
            C24514cb.f64935c.remove(aVar);
        }
    }

    public void updateCurUser(User user) {
        init();
        C47549c.m102974a().mo94854a(user);
    }

    public void updateCurUserId(String str) {
        init();
        C47549c.m102974a().mo94855a(str);
    }

    static final /* synthetic */ void lambda$refreshPassportUserInfo$2$AccountUserService(String str) throws Exception {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            new C18493a();
            C24514cb.m59922a(C18493a.m44735b(jSONObject), "refresh passport user info");
        }
    }

    public void addUserChangeListener(C20841a aVar) {
        synchronized (C24514cb.class) {
            if (!C24514cb.f64935c.contains(aVar)) {
                C24514cb.f64935c.add(aVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$logoutAllBackgroundUser$4$AccountUserService(final C1682af afVar) throws Exception {
        C13081d.m26312a(C11010c.m22280a()).mo24605a((C12989a<C12992d>) new C12989a<C12992d>() {
            public final /* synthetic */ void onResponse(C12990b bVar) {
                C12992d dVar = (C12992d) bVar;
                if (!dVar.f33998a) {
                    StringBuilder sb = new StringBuilder("account/logout_others fail, error code: ");
                    sb.append(dVar.f34000c);
                    sb.append(", error msg: ");
                    sb.append(dVar.f34001d);
                    C32458a.m75144a(sb.toString());
                }
                afVar.mo6164a(dVar);
            }
        });
    }

    public void queryUserSync(User user) {
        init();
        C47549c.m102974a().mo94854a(user);
        C24514cb.m59921a(10, null, user, null);
    }

    public void setWithCommerceNewbieTask(boolean z) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setWithCommerceNewbieTask(z);
        C47557d.m102995i();
    }

    public void updateCurAllowStatus(int i) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setAllowStatus(i);
        C47557d.m102995i();
    }

    public void updateCurAwemeCount(int i) {
        init();
        C47549c.m102974a();
        int awemeCount = C47549c.m102975b().getAwemeCount() + i;
        if (awemeCount < 0) {
            awemeCount = 0;
        }
        C47549c.m102975b().setAwemeCount(awemeCount);
        C47557d.m102995i();
    }

    public void updateCurCanChangeSchoolInfo(boolean z) {
        init();
        C47549c a = C47549c.m102974a();
        C47549c.m102975b().setCanModifySchoolInfo(z);
        a.f119966b = true;
        C47557d.m102995i();
    }

    public void updateCurCover(List<UrlModel> list) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setCoverUrls(list);
        C47557d.m102995i();
    }

    public void updateCurDongtaiCount(int i) {
        init();
        C47549c.m102974a();
        int dongtaiCount = C47549c.m102975b().getDongtaiCount() + i;
        if (dongtaiCount < 0) {
            dongtaiCount = 0;
        }
        C47549c.m102975b().setDongtaiCount(dongtaiCount);
        C47557d.m102995i();
    }

    public void updateCurFavoritingCount(int i) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setFavoritingCount(C47549c.m102975b().getFavoritingCount() + i);
        C47557d.m102995i();
    }

    public void updateCurFollowerCount(int i) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setFollowerCount(C47549c.m102975b().getFollowerCount() + i);
        C47557d.m102995i();
    }

    public void updateCurFollowingCount(int i) {
        init();
        C47549c.m102974a();
        int followingCount = C47549c.m102975b().getFollowingCount() + i;
        if (followingCount < 0) {
            followingCount = 0;
        }
        C47549c.m102975b().setFollowingCount(followingCount);
        C47557d.m102995i();
    }

    public void updateCurHideFollowingFollowerList(int i) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setHideFollowingFollowerList(i);
        C47557d.m102995i();
    }

    public void updateCurHideSearch(boolean z) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setHideSearch(z);
        C47557d.m102995i();
    }

    public void updateCurSecret(boolean z) {
        init();
        C47549c a = C47549c.m102974a();
        if (C47549c.m102975b().isSecret() != z) {
            C47549c.m102975b().setSecret(z);
            a.f119966b = true;
            C47557d.m102995i();
        }
    }

    public void updateCurVideoCover(VideoCover videoCover) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setVideoCover(videoCover);
        C47557d.m102995i();
    }

    public void updateHasFacebookToken(boolean z) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setHasFacebookToken(z);
        C47557d.m102995i();
    }

    public void updateHasTwitterToken(boolean z) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setHasTwitterToken(z);
        C47557d.m102995i();
    }

    public void updateHasYoutubeToken(boolean z) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setHasYoutubeToken(z);
        C47557d.m102995i();
    }

    public void updateInsId(String str) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setInsId(str);
        C47557d.m102995i();
    }

    public void updateLeaveTime(long j) {
        init();
        C47549c a = C47549c.m102974a();
        if (a.f119968d != -1) {
            j = a.f119968d;
        }
        a.f119968d = j;
    }

    public void updateMinor(boolean z) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setMinor(z);
        C47557d.m102995i();
    }

    public void updateNotifyPrivateAccount(int i) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setNotifyPrivateAccount(i);
        C47557d.m102995i();
    }

    public void updateShieldCommentNotice(int i) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setShieldCommentNotice(i);
        C47557d.m102995i();
    }

    public void updateShieldDiggNotice(int i) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setShieldDiggNotice(i);
        C47557d.m102995i();
    }

    public void updateShieldFollowNotice(int i) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setShieldFollowNotice(i);
        C47557d.m102995i();
    }

    public void updateUserInfo(C13207b bVar) {
        init();
        C24514cb.m59922a(bVar, "service update user info");
    }

    public void updateWeiboBindStatus(boolean z) {
        init();
        C47549c.m102974a();
        C47549c.m102975b().setBindedWeibo(z);
        C47557d.m102995i();
    }

    static final /* synthetic */ Object lambda$logoutAllBackgroundUser$5$AccountUserService(StringBuilder sb) throws Exception {
        C22077a a = C24514cb.m59920a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C21459s.f58193c);
        sb2.append(sb.toString());
        return a.mo46189b(Integer.MAX_VALUE, sb2.toString());
    }

    public FollowerDetail getCurUserFollowDetail(String str) {
        C47549c.m102974a();
        if (C47549c.m102975b().getFollowerDetailList() != null) {
            for (FollowerDetail followerDetail : C47549c.m102975b().getFollowerDetailList()) {
                if (TextUtils.equals(followerDetail.getPackageName(), str)) {
                    return followerDetail;
                }
            }
        }
        return null;
    }

    public void getSetPasswordStatus(C23860bm bmVar) {
        C24514cb.m59920a().mo46182a("/passport/password/has_set/", null).mo6446a((C1711f<? super T, ? extends C53694b<? extends R>>) C47545a.f119960a).mo6452b(C2168a.m6521b()).mo6443a(C1667a.m5940a()).mo6438a((C1710e<? super T>) new C47547b<Object>(bmVar), (C1710e<? super Throwable>) new C47548c<Object>(bmVar));
    }

    public boolean isUserEmpty(User user) {
        C47549c.m102974a();
        if (user == null || user.getUid() == null || user.getAvatarLarger() == null || user.getAvatarMedium() == null || user.getAvatarThumb() == null || user.getShortId() == null) {
            return true;
        }
        return false;
    }

    public void setCurUser(User user) {
        init();
        C47549c a = C47549c.m102974a();
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            C47557d.f119986b.mo94864a(user);
            a.f119966b = true;
            a.f119967c = false;
            a.f119968d = -1;
            C47557d.f119986b.mo94867b(user.getUid());
            a.mo94856d();
        }
    }

    public void updateCurNickname(String str) {
        init();
        C47549c a = C47549c.m102974a();
        if (!TextUtils.equals(C47549c.m102975b().getNickname(), str)) {
            C47549c.m102975b().setNickname(str);
            a.f119966b = true;
            C47557d.m102995i();
            C24514cb.m59921a(6, null, C47549c.m102975b(), null);
        }
    }

    public void updateCurSignature(String str) {
        init();
        C47549c a = C47549c.m102974a();
        if (!TextUtils.equals(C47549c.m102975b().getSignature(), str)) {
            C47549c.m102975b().setSignature(str);
            a.f119966b = true;
            C47557d.m102995i();
        }
    }

    public void updateWeiboName(String str) {
        init();
        C47549c a = C47549c.m102974a();
        if (!TextUtils.equals(C47549c.m102975b().getWeiboNickname(), str)) {
            C47549c.m102975b().setWeiboNickname(str);
            a.f119966b = true;
            C47557d.m102995i();
        }
    }

    public void clear(String str) {
        init();
        StringBuilder sb = new StringBuilder();
        sb.append(C22087a.m54861a());
        sb.append("|clear:");
        sb.append(str);
        C22087a.m54864b(sb.toString());
        Keva.getRepo("aweme_verify_info").clear();
        Keva.getRepo("password_status").clear();
        C47549c a = C47549c.m102974a();
        a.f119966b = false;
        C47549c.m102977b(C47557d.m102992f());
        a.f119967c = false;
        a.f119968d = -1;
    }

    public void queryUser(Handler handler) {
        init();
        C47549c.m102974a();
        C47550a.m102987a(handler, ((C36679a) C20842a.m53148a(C36679a.class)).mo47860a(), false, 112);
    }

    public void updateGender(Handler handler, Map<String, String> map) {
        init();
        C47549c.m102974a();
        C47550a.m102988a(handler, map, 1);
    }

    public void updateLocation(Handler handler, Map<String, String> map) {
        init();
        C47549c.m102974a();
        C47550a.m102988a(handler, map, 7);
    }

    public void updateSchool(Handler handler, Map<String, String> map) {
        init();
        C47549c.m102974a();
        C47550a.m102988a(handler, map, 8);
    }

    public void updateUserInfo(Handler handler, Map<String, String> map) {
        init();
        C47549c.m102974a();
        C47550a.m102988a(handler, map, 112);
    }

    public User queryUser(String str, boolean z) throws Exception {
        init();
        C47549c.m102974a();
        if (TextUtils.isEmpty(str)) {
            str = ((C36679a) C20842a.m53148a(C36679a.class)).mo47860a();
        }
        return C47541b.m102968a(str, z);
    }

    public void queryVerifyStatus(C23862bn bnVar, boolean z) {
        C47549c.m102974a();
        if (C47549c.m102978c() && bnVar != null) {
            C47549c.m102974a();
            C47549c.m102975b().getVerifyStatusInMT();
        }
    }

    public void registerNotice(String str, int i) {
        init();
        C23566n.m57766a().mo48750a(C47549c.m102974a().f119969e, new Callable(str, i) {

            /* renamed from: a */
            final /* synthetic */ String f119983a;

            /* renamed from: b */
            final /* synthetic */ int f119984b;

            public final Object call() throws Exception {
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(this.f119983a)) {
                    hashMap.put("phone_number", this.f119983a);
                }
                hashMap.put("login_type", String.valueOf(this.f119984b));
                C24514cb.m59920a().mo46190b(Integer.MAX_VALUE, C47550a.f119971a, hashMap);
                return null;
            }

            {
                this.f119983a = r1;
                this.f119984b = r2;
            }
        }, 114);
    }

    public void delete(String str, String str2) {
        init();
        StringBuilder sb = new StringBuilder();
        sb.append(C22087a.m54861a());
        sb.append("|delete:");
        sb.append(str2);
        C22087a.m54864b(sb.toString());
        C47549c.m102974a();
        C47549c.m102977b(str);
    }

    public void updateCurBirthday(String str, int i) {
        init();
        C47549c a = C47549c.m102974a();
        if (!TextUtils.equals(C47549c.m102975b().getBirthday(), str) || i != C47549c.m102975b().getBirthdayHideLevel()) {
            C47549c.m102975b().setBirthday(str);
            C47549c.m102975b().setBirthdayHideLevel(i);
            a.f119966b = true;
            C47557d.m102995i();
        }
    }

    public void updateCurGender(int i, int i2) {
        init();
        C47549c a = C47549c.m102974a();
        if (C47549c.m102975b().getGender() != i2) {
            C47549c.m102975b().setGender(i2);
            C47549c.m102975b().setShowGenderStrategy(i);
            a.f119966b = true;
            C47557d.m102995i();
        }
    }

    public void updateAvatarUri(Handler handler, String str, int i) {
        init();
        C47549c.m102974a();
        C47550a.m102986a(handler, "avatar_uri", str, i, 4);
    }

    public void updateId(Handler handler, String str, int i) {
        init();
        C47549c.m102974a();
        C47550a.m102986a(handler, "unique_id", str, i, 116);
    }

    public void updateInsId(Handler handler, String str, int i) {
        init();
        C47549c.m102974a();
        C47550a.m102986a(handler, "ins_id", str, i, 6);
    }

    public void updateLanguage(Handler handler, String str, int i) {
        init();
        C47549c.m102974a();
        C47550a.m102986a(handler, "language_change", str, i, 124);
    }

    public void updateNickName(Handler handler, String str, int i) {
        init();
        C47549c.m102974a();
        C47550a.m102986a(handler, "nickname", str, i, 0);
    }

    public void updateSignature(Handler handler, String str, int i) {
        init();
        C47549c.m102974a();
        C47550a.m102986a(handler, "signature", str, i, 2);
    }

    public void syncWeiboBindStatus(Handler handler, boolean z, int i) {
        init();
        C47549c.m102974a();
        C47550a.m102986a(handler, "is_binded_weibo", String.valueOf(z ? 1 : 0), i, 119);
    }

    public void updateAllowStatus(Handler handler, int i, int i2) {
        init();
        C47549c.m102974a();
        C47550a.m102986a(handler, "allow_status", String.valueOf(i), i2, 5);
    }

    public void updateSecret(Handler handler, boolean z, int i) {
        String str;
        init();
        C47549c.m102974a();
        String str2 = "secret";
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C47550a.m102986a(handler, str2, str, i, 122);
    }

    public void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        init();
        C47549c.m102974a();
        User b = C47549c.m102975b();
        if (b.getAvatarThumb() == null || b.getAvatarMedium() == null || b.getAvatarLarger() == null || (urlModel != null && !TextUtils.equals(b.getAvatarThumb().getUri(), urlModel.getUri()) && urlModel2 != null && !TextUtils.equals(b.getAvatarMedium().getUri(), urlModel2.getUri()) && urlModel3 != null && !TextUtils.equals(b.getAvatarLarger().getUri(), urlModel3.getUri()))) {
            b.setAvatarThumb(urlModel);
            b.setAvatarMedium(urlModel2);
            b.setAvatarLarger(urlModel3);
            C47557d.m102995i();
            C24514cb.m59921a(7, null, b, null);
        }
    }

    public void uploadCover(Handler handler, String str, int i, String str2) {
        init();
        C47549c.m102974a();
        C47550a.m102984a(handler, str, i, str2, 126);
    }

    public void uploadVideoAvatar(Handler handler, String str, int i, String str2) {
        init();
        C47549c.m102974a();
        C47550a.m102984a(handler, str, i, str2, 121);
    }

    public void updateBirthday(Handler handler, String str, int i, int i2) {
        init();
        C47549c.m102974a();
        HashMap hashMap = new HashMap(2);
        hashMap.put("birthday", str);
        hashMap.put("birthday_hide_level", String.valueOf(i));
        hashMap.put("page_from", String.valueOf(i2));
        C47550a.m102988a(handler, hashMap, 3);
    }

    public void updateCoverUri(Handler handler, String str, int i, int i2) {
        init();
        C47549c.m102974a();
        HashMap hashMap = new HashMap(2);
        hashMap.put("cover_uri", str);
        hashMap.put("cover_source", String.valueOf(i));
        hashMap.put("page_from", String.valueOf(i2));
        C47550a.m102988a(handler, hashMap, 10);
    }

    public void updateNickNameWithSupplementray(Handler handler, String str, List<String> list, int i) {
        init();
        C47549c.m102974a();
        HashMap hashMap = new HashMap(2);
        hashMap.put("nickname", str);
        if (list != null && list.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                hashMap.put("supplementary_img_uri", sb.deleteCharAt(sb.length() - 1).toString());
            }
        }
        hashMap.put("page_from", String.valueOf(i));
        C47550a.m102988a(handler, hashMap, 0);
    }

    public void uploadAvatar(Handler handler, String str, int i, String str2, List<C19180e> list) {
        init();
        C47549c.m102974a();
        C47550a.m102985a(handler, str, i, str2, list, 111);
    }

    public void uploadCommerceHeadImage(Handler handler, String str, int i, String str2, String str3) {
        init();
        C47549c.m102974a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19180e("source", str3));
        C47550a.m102985a(handler, str, i, str2, arrayList, 125);
    }

    public void updateCurSchoolInfo(String str, String str2, String str3, int i, int i2) {
        init();
        C47549c a = C47549c.m102974a();
        C47549c.m102975b().setSchoolName(str);
        C47549c.m102975b().setCollegeName(str2);
        C47549c.m102975b().setEnrollYear(str3);
        C47549c.m102975b().setEducation(i);
        C47549c.m102975b().setSchoolInfoShowRange(i2);
        a.f119966b = true;
        C47557d.m102995i();
    }

    public void updateVideoCoverUri(Handler handler, String str, String str2, int i, int i2) {
        init();
        C47549c.m102974a();
        HashMap hashMap = new HashMap(2);
        hashMap.put("cover_video_id", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("cover_item_id", str2);
        }
        hashMap.put("cover_video_offset", String.valueOf(i));
        hashMap.put("page_from", String.valueOf(i2));
        C47550a.m102988a(handler, hashMap, 11);
    }

    public void updateCurLocation(String str, String str2, String str3, String str4, String str5, boolean z) {
        init();
        C47549c a = C47549c.m102974a();
        C47549c.m102975b().setIsoCountryCode(str);
        C47549c.m102975b().setCountry(str2);
        C47549c.m102975b().setProvince(str3);
        C47549c.m102975b().setCityName(str4);
        C47549c.m102975b().setDistrict(str5);
        C47549c.m102975b().setHideCity(z);
        a.f119966b = true;
        C47557d.m102995i();
    }
}
