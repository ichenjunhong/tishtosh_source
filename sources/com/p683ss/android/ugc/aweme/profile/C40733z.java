package com.p683ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40200a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40453o;
import com.p683ss.android.ugc.aweme.profile.presenter.C39984r;
import com.p683ss.android.ugc.aweme.profile.presenter.UserResponse;
import java.util.List;
import p064c.p065a.C1680ad;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.z */
public final class C40733z implements IProfileService {

    /* renamed from: a */
    public static final C40733z f103767a = new C40733z();

    /* renamed from: b */
    private final /* synthetic */ IProfileService f103768b;

    public final C26875a<Aweme, ?> createAwemeModel() {
        return this.f103768b.createAwemeModel();
    }

    public final C26875a<Aweme, ?> createAwemeModel(List<? extends Aweme> list) {
        C52711k.m112240b(list, "items");
        return this.f103768b.createAwemeModel(list);
    }

    public final C26840g<IMUser> createSearchIMUserAdapter() {
        return this.f103768b.createSearchIMUserAdapter();
    }

    public final int getMessageProfile() {
        return this.f103768b.getMessageProfile();
    }

    public final Object getPushSettingCallback() {
        return this.f103768b.getPushSettingCallback();
    }

    public final String getUserApi(String str) {
        C52711k.m112240b(str, "uid");
        return this.f103768b.getUserApi(str);
    }

    public final String getUserApi(String str, String str2, String str3, int i) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "secUserId");
        C52711k.m112240b(str3, "uniqueId");
        return this.f103768b.getUserApi(str, str2, str3, i);
    }

    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        Activity activity2 = activity;
        C52711k.m112240b(activity, "activity");
        String str2 = str;
        C52711k.m112240b(str, "originalUrl");
        this.f103768b.gotoCropActivity(activity2, str2, z, f, i, i2, i3, i4);
    }

    public final void mobRefreshInProfileAweme(C26875a<?, ?> aVar, List<? extends Aweme> list) {
        C52711k.m112240b(aVar, "model");
        C52711k.m112240b(list, "items");
        this.f103768b.mobRefreshInProfileAweme(aVar, list);
    }

    public final boolean needShowCompleteProfileGuide() {
        return this.f103768b.needShowCompleteProfileGuide();
    }

    public final boolean needShowCompleteProfileGuideBar() {
        return this.f103768b.needShowCompleteProfileGuideBar();
    }

    public final boolean needShowCompleteProfileGuideBarForFansDetail() {
        return this.f103768b.needShowCompleteProfileGuideBarForFansDetail();
    }

    public final C40200a newAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle) {
        String str3 = str;
        C52711k.m112240b(str, "uid");
        Bundle bundle2 = bundle;
        C52711k.m112240b(bundle2, "args");
        return this.f103768b.newAwemeListFragment(i, i2, str3, str2, z, z2, bundle2);
    }

    public final C40200a newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C52711k.m112240b(str, "uid");
        return this.f103768b.newBasicAwemeListFragment(i, i2, str, str2, z, z2);
    }

    public final C40200a newMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C52711k.m112240b(str, "uid");
        return this.f103768b.newMTAwemeListFragment(i, i2, str, str2, z, z2);
    }

    public final C39984r newUserPresenter() {
        return this.f103768b.newUserPresenter();
    }

    public final void onFansDetailCompleteProfileGuideBarShow() {
        this.f103768b.onFansDetailCompleteProfileGuideBarShow();
    }

    public final void preloadProfile(FragmentActivity fragmentActivity, String str) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(str, "pageName");
        this.f103768b.preloadProfile(fragmentActivity, str);
    }

    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i) {
        C52711k.m112240b(handler, "handler");
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "secUid");
        C52711k.m112240b(str3, "uniqueId");
        this.f103768b.queryProfileResponseWithDoubleId(handler, str, str2, str3, i);
    }

    public final User queryUser(String str, boolean z, String str2) {
        C52711k.m112240b(str, "url");
        return this.f103768b.queryUser(str, z, str2);
    }

    public final void setSearchIMUserData(C26840g<IMUser> gVar, List<IMUser> list) {
        C52711k.m112240b(gVar, "adapter");
        this.f103768b.setSearchIMUserData(gVar, list);
    }

    public final void setSearchIMUserKeywords(C26840g<IMUser> gVar, String str) {
        C52711k.m112240b(gVar, "adapter");
        C52711k.m112240b(str, "keywords");
        this.f103768b.setSearchIMUserKeywords(gVar, str);
    }

    public final void showRemarkEditDialog(Context context, User user, String str, int i, Bundle bundle, C40453o oVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "defaultInput");
        this.f103768b.showRemarkEditDialog(context, user, str, i, bundle, oVar);
    }

    public final boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, OnDismissListener onDismissListener) {
        C52711k.m112240b(context, "context");
        return this.f103768b.showRemindUserCompleteProfileDialog(context, str, str2, onDismissListener);
    }

    public final boolean showRemindUserCompleteProfileDialogAfterFollow(Context context, String str, String str2, User user, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        return this.f103768b.showRemindUserCompleteProfileDialogAfterFollow(context, str, str2, user, i);
    }

    public final void startUserPfoeilActivity(Context context, User user, String str, String str2, String str3, String str4) {
        this.f103768b.startUserPfoeilActivity(context, user, str, str2, str3, str4);
    }

    public final void updateProfilePermission(boolean z) {
        this.f103768b.updateProfilePermission(z);
    }

    public final C1680ad<UserResponse> user(String str, String str2, String str3) {
        return this.f103768b.user(str, str2, str3);
    }

    public final String userUrl(String str, String str2, String str3, int i) {
        return this.f103768b.userUrl(str, str2, str3, i);
    }

    private C40733z() {
        IProfileService createIProfileServicebyMonsterPlugin = ProfileServiceImpl.createIProfileServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIProfileServicebyMonsterPlugin, "ServiceManager.get().get…ofileService::class.java)");
        this.f103768b = createIProfileServicebyMonsterPlugin;
    }
}
