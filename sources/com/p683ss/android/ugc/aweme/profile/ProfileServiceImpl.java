package com.p683ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FriendsSearchAdapter;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C32964a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.api.C39791d;
import com.p683ss.android.ugc.aweme.profile.api.C39792e;
import com.p683ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2088f.C39871b.C39872a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40200a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40211ae;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40273bu;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40280c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.CropActivity.C40055a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40453o;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40454p;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39958b;
import com.p683ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p064c.p065a.C1680ad;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ProfileServiceImpl */
public final class ProfileServiceImpl implements IProfileService {

    /* renamed from: com.ss.android.ugc.aweme.profile.ProfileServiceImpl$a */
    static final class C39712a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ String f101350a;

        /* renamed from: b */
        final /* synthetic */ String f101351b;

        /* renamed from: c */
        final /* synthetic */ String f101352c;

        C39712a(String str, String str2, String str3) {
            this.f101350a = str;
            this.f101351b = str2;
            this.f101352c = str3;
        }

        public final /* synthetic */ Object call() {
            String str;
            if (C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
                str = C39791d.m88509b(this.f101350a, this.f101351b, this.f101352c, 0);
            } else {
                str = C39791d.m88505a(this.f101351b, this.f101350a, this.f101352c, 0);
            }
            return C39791d.m88507b(str, false, (String) null);
        }
    }

    public final int getMessageProfile() {
        return 0;
    }

    public final Object getPushSettingCallback() {
        return C39716ab.f101353a;
    }

    public final boolean needShowCompleteProfileGuide() {
        return false;
    }

    public final C26875a<Aweme, ?> createAwemeModel() {
        return new C39958b<>();
    }

    public final C26840g<IMUser> createSearchIMUserAdapter() {
        return new FriendsSearchAdapter<>();
    }

    public final C39954ad newUserPresenter() {
        return new C39954ad();
    }

    public static IProfileService createIProfileServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IProfileService.class);
        if (a != null) {
            return (IProfileService) a;
        }
        return new ProfileServiceImpl();
    }

    public final boolean needShowCompleteProfileGuideBarForFansDetail() {
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (!needShowCompleteProfileGuideBar() || repo.getInt(C39877j.f101725a.mo80974e(), 0) >= 3 || System.currentTimeMillis() - repo.getLong(C39877j.f101725a.mo80975f(), 0) <= 604800000) {
            return false;
        }
        return true;
    }

    public final void onFansDetailCompleteProfileGuideBarShow() {
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        repo.storeInt(C39877j.f101725a.mo80974e(), repo.getInt(C39877j.f101725a.mo80974e(), 0) + 1);
        repo.storeLong(C39877j.f101725a.mo80975f(), System.currentTimeMillis());
    }

    public final boolean needShowCompleteProfileGuideBar() {
        boolean z;
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        C52711k.m112236a((Object) curUser, "curUser");
        if (curUser.getProfileCompletion() <= 0.0f || curUser.getProfileCompletion() > 0.7f) {
            z = false;
        } else {
            z = true;
        }
        if (!needShowCompleteProfileGuide() || (!z && !curUser.nicknameUpdateReminder() && !curUser.avatarUpdateReminder())) {
            return false;
        }
        return true;
    }

    public final C26875a<Aweme, ?> createAwemeModel(List<? extends Aweme> list) {
        C52711k.m112240b(list, "items");
        C39958b bVar = new C39958b();
        bVar.setItems(list);
        return bVar;
    }

    public final String getUserApi(String str) {
        C52711k.m112240b(str, "uid");
        String a = C39791d.m88503a(str);
        C52711k.m112236a((Object) a, "ProfileApi.getUserApi(uid)");
        return a;
    }

    public final void updateProfilePermission(boolean z) {
        WeakReference<MyProfileGuideViewModel> weakReference = C40730x.f103764b;
        if (weakReference != null) {
            MyProfileGuideViewModel myProfileGuideViewModel = (MyProfileGuideViewModel) weakReference.get();
            if (myProfileGuideViewModel != null) {
                myProfileGuideViewModel.mo82895g(new C40731a(z));
            }
        }
        C40730x.f103763a = z;
    }

    public final void setSearchIMUserData(C26840g<IMUser> gVar, List<IMUser> list) {
        C52711k.m112240b(gVar, "adapter");
        if (gVar instanceof FriendsSearchAdapter) {
            ((FriendsSearchAdapter) gVar).mo50303a(list);
        }
    }

    public final void setSearchIMUserKeywords(C26840g<IMUser> gVar, String str) {
        C52711k.m112240b(gVar, "adapter");
        C52711k.m112240b(str, "keywords");
        if (gVar instanceof FriendsSearchAdapter) {
            ((FriendsSearchAdapter) gVar).f83779b = str;
        }
    }

    public final void mobRefreshInProfileAweme(C26875a<?, ?> aVar, List<? extends Aweme> list) {
        C52711k.m112240b(aVar, "model");
        C52711k.m112240b(list, "items");
        if (aVar instanceof C39958b) {
            C39958b bVar = (C39958b) aVar;
            bVar.setItems(new ArrayList(list));
            ((FeedItemList) bVar.mData).cursor = (long) list.size();
        }
    }

    public final void preloadProfile(FragmentActivity fragmentActivity, String str) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(str, "pageName");
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(str, "pageName");
        Aweme aweme = C32964a.m75869a(fragmentActivity).f85652f;
        if (aweme != null && !aweme.getIsPreloadScroll() && TextUtils.equals(str, "page_profile")) {
            aweme.setIsPreloadScroll(true);
            C0013i.m16a((Callable<TResult>) new C39872a<TResult>(aweme));
        }
    }

    public final User queryUser(String str, boolean z, String str2) {
        C52711k.m112240b(str, "url");
        User a = C39791d.m88502a(str, z, str2);
        C52711k.m112236a((Object) a, "ProfileApi.queryUser(url, cache, isPreload)");
        return a;
    }

    public final C1680ad<UserResponse> user(String str, String str2, String str3) {
        C1680ad<UserResponse> b = C1680ad.m5962a((Callable<? extends T>) new C39712a<Object>(str, str2, str3)).mo6155b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "Single.fromCallable {\n  …scribeOn(Schedulers.io())");
        return b;
    }

    public final String userUrl(String str, String str2, String str3, int i) {
        String b = C39791d.m88508b(str, str2, i);
        C52711k.m112236a((Object) b, "ProfileApi.userUrl(sid, uid, from)");
        return b;
    }

    public final String getUserApi(String str, String str2, String str3, int i) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "secUserId");
        C52711k.m112240b(str3, "uniqueId");
        String a = C39791d.m88505a(str, str2, str3, i);
        C52711k.m112236a((Object) a, "ProfileApi.getUserApi(ui…ecUserId, uniqueId, from)");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0060, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        if (r2.getInt(r3, 0) <= 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (r2.getInt(r3, 0) < 3) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        if (r4 == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        r4 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean showRemindUserCompleteProfileDialog(android.content.Context r14, java.lang.String r15, java.lang.String r16, android.content.DialogInterface.OnDismissListener r17) {
        /*
            r13 = this;
            r0 = r14
            java.lang.String r1 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r1)
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            java.lang.String r2 = "keva_repo_profile_component"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r2)
            com.ss.android.ugc.aweme.profile.j r3 = com.p683ss.android.ugc.aweme.profile.C39877j.f101725a
            java.lang.String r3 = "remind_user_complete_profile_show_times"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.profile.C39877j.m88645a(r3)
            boolean r4 = r13.needShowCompleteProfileGuide()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0075
            boolean r4 = r1.nicknameUpdateReminder()
            if (r4 != 0) goto L_0x0035
            boolean r4 = r1.avatarUpdateReminder()
            if (r4 == 0) goto L_0x0075
        L_0x0035:
            long r7 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.profile.j r4 = com.p683ss.android.ugc.aweme.profile.C39877j.f101725a
            java.lang.String r4 = r4.mo80970a()
            r9 = 0
            long r9 = r2.getLong(r4, r9)
            long r7 = r7 - r9
            r9 = 604800000(0x240c8400, double:2.988109026E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0075
            com.bytedance.ies.abmock.b r7 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.profile.experiment.ShowCompleteProfileAlertStyle> r8 = com.p683ss.android.ugc.aweme.profile.experiment.ShowCompleteProfileAlertStyle.class
            r9 = 1
            java.lang.String r10 = "show_complete_profile_alert_style"
            r11 = 31744(0x7c00, float:4.4483E-41)
            r12 = 0
            int r4 = r7.mo18168a(r8, r9, r10, r11, r12)
            switch(r4) {
                case 1: goto L_0x0069;
                case 2: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            r4 = 0
            goto L_0x0071
        L_0x0062:
            int r4 = r2.getInt(r3, r6)
            if (r4 > 0) goto L_0x0060
            goto L_0x0070
        L_0x0069:
            int r4 = r2.getInt(r3, r6)
            r7 = 3
            if (r4 >= r7) goto L_0x0060
        L_0x0070:
            r4 = 1
        L_0x0071:
            if (r4 == 0) goto L_0x0075
            r4 = 1
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            if (r4 != 0) goto L_0x0079
            return r6
        L_0x0079:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity> r7 = com.p683ss.android.ugc.aweme.profile.p2090ui.RemindUserCompleteProfileActivity.class
            r4.<init>(r14, r7)
            java.lang.String r7 = "enter_from"
            if (r15 != 0) goto L_0x0087
            java.lang.String r8 = ""
            goto L_0x0088
        L_0x0087:
            r8 = r15
        L_0x0088:
            r4.putExtra(r7, r8)
            java.lang.String r7 = "enter_method"
            r9 = r16
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L_0x009c
            int r9 = r9.length()
            if (r9 != 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r9 = 0
            goto L_0x009d
        L_0x009c:
            r9 = 1
        L_0x009d:
            if (r9 == 0) goto L_0x00a2
            java.lang.String r8 = "follow"
            goto L_0x00a4
        L_0x00a2:
            r8 = r16
        L_0x00a4:
            r4.putExtra(r7, r8)
            java.lang.String r7 = "complete_avatar"
            boolean r8 = r1.avatarUpdateReminder()
            r4.putExtra(r7, r8)
            java.lang.String r7 = "complete_nickname"
            boolean r1 = r1.nicknameUpdateReminder()
            r4.putExtra(r7, r1)
            r14.startActivity(r4)
            com.p683ss.android.ugc.aweme.profile.p2090ui.RemindUserCompleteProfileActivity.C40192a.m89371a(r17)
            int r0 = r2.getInt(r3, r6)
            int r0 = r0 + r5
            r2.storeInt(r3, r0)
            com.ss.android.ugc.aweme.profile.j r0 = com.p683ss.android.ugc.aweme.profile.C39877j.f101725a
            java.lang.String r0 = r0.mo80970a()
            long r3 = java.lang.System.currentTimeMillis()
            r2.storeLong(r0, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.ProfileServiceImpl.showRemindUserCompleteProfileDialog(android.content.Context, java.lang.String, java.lang.String, android.content.DialogInterface$OnDismissListener):boolean");
    }

    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i) {
        C52711k.m112240b(handler, "handler");
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "secUid");
        C52711k.m112240b(str3, "uniqueId");
        C39792e.m88511a().mo80874a(handler, str, str2, str3, i);
    }

    public final boolean showRemindUserCompleteProfileDialogAfterFollow(Context context, String str, String str2, User user, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        if (!C52711k.m112239a((Object) str2, (Object) "follow") || C40211ae.m89449b(user) >= 1000 || (i != 1 && i != 2 && i != 4)) {
            return false;
        }
        return showRemindUserCompleteProfileDialog(context, str, str2, null);
    }

    public final void startUserPfoeilActivity(Context context, User user, String str, String str2, String str3, String str4) {
        UserProfileActivity.m89405a(context, user, str, str2, str3, str4);
    }

    public final C40200a newMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C52711k.m112240b(str, "uid");
        C40273bu a = C40273bu.m89554a(i, i2, str, str2, z, new Bundle());
        C52711k.m112236a((Object) a, "MTAwemeListFragment.newI…d, isMyProfile, Bundle())");
        return a;
    }

    public final C40200a newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C52711k.m112240b(str, "uid");
        if (str2 == null) {
            str2 = "";
        }
        Bundle bundle = new Bundle();
        C40280c cVar = new C40280c();
        bundle.putInt("type", i2);
        bundle.putString("uid", str);
        bundle.putString("sec_user_id", str2);
        bundle.putBoolean("is_my_profile", z);
        bundle.putInt("bottom_bar_height", i);
        bundle.putBoolean("should_refresh_on_init_data", z2);
        cVar.setArguments(bundle);
        C52711k.m112236a((Object) cVar, "AwemeListFragmentImpl.ne…reshOnInitData, Bundle())");
        return cVar;
    }

    public final void showRemarkEditDialog(Context context, User user, String str, int i, Bundle bundle, C40453o oVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "defaultInput");
        C40454p pVar = new C40454p(context);
        pVar.f103285f = user;
        pVar.f103286g = str;
        pVar.f103287h = i;
        if (oVar != null) {
            pVar.f103284e = oVar;
        }
        pVar.show();
    }

    public final C40200a newAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(bundle, "args");
        C40273bu a = C40273bu.m89554a(i, i2, str, str2, z, bundle);
        C52711k.m112236a((Object) a, "MTAwemeListFragment.newI… suid, isMyProfile, args)");
        return a;
    }

    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "originalUrl");
        C40055a.m89042a(activity, str, z, f, i, i2, i3, i4);
    }
}
