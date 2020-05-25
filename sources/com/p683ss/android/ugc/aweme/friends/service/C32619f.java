package com.p683ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1632di.C27618be;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.service.f */
public final class C32619f implements IRecommendDependentService {

    /* renamed from: a */
    public static final C32619f f84867a = new C32619f();

    /* renamed from: b */
    private final /* synthetic */ IRecommendDependentService f84868b;

    /* renamed from: a */
    private static IRecommendDependentService m75405a() {
        if (C27991b.f73417A == null) {
            synchronized (IRecommendDependentService.class) {
                if (C27991b.f73417A == null) {
                    C27991b.f73417A = C27618be.m66301b();
                }
            }
        }
        return (IRecommendDependentService) C27991b.f73417A;
    }

    public final boolean checkInsertRecommendContact() {
        return this.f84868b.checkInsertRecommendContact();
    }

    public final void cleanUpdateTagCount(String str) {
        C52711k.m112240b(str, "uid");
        this.f84868b.cleanUpdateTagCount(str);
    }

    public final void dislike(String str) {
        this.f84868b.dislike(str);
    }

    public final boolean enableFace2Face() {
        return this.f84868b.enableFace2Face();
    }

    public final boolean enableFriendRecommendEnhance() {
        return this.f84868b.enableFriendRecommendEnhance();
    }

    public final void enterContactActivity(Activity activity, C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(activity, "activity");
        this.f84868b.enterContactActivity(activity, bVar);
    }

    public final String getAppProtocol() {
        return this.f84868b.getAppProtocol();
    }

    public final Intent getContactsActivityIntent(Context context, String str, boolean z) {
        return this.f84868b.getContactsActivityIntent(context, str, z);
    }

    public final String getFriendToFamiliarStr(int i, int i2, int i3) {
        return this.f84868b.getFriendToFamiliarStr(i, i2, i3);
    }

    public final Intent getInviteUserListActivityIntent(Activity activity, int i) {
        return this.f84868b.getInviteUserListActivityIntent(activity, i);
    }

    public final int getRecommendContactPosition() {
        return this.f84868b.getRecommendContactPosition();
    }

    public final <T> T getSP(Context context, Class<T> cls) {
        C52711k.m112240b(cls, "preferencesClass");
        return this.f84868b.getSP(context, cls);
    }

    public final int getShowRemarkIconStyle() {
        return this.f84868b.getShowRemarkIconStyle();
    }

    public final int getUpdateTagCount(String str) {
        C52711k.m112240b(str, "uid");
        return this.f84868b.getUpdateTagCount(str);
    }

    public final void goToPrivacyActivity(Context context) {
        this.f84868b.goToPrivacyActivity(context);
    }

    public final void guideContactToEditRemark(Context context, User user, FollowStatus followStatus, C52671b<? super User, C52860x> bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(followStatus, "followStatus");
        this.f84868b.guideContactToEditRemark(context, user, followStatus, bVar);
    }

    public final void handleRemarkEditView(User user, int i, TextView textView, View view, boolean z, String str, boolean z2) {
        User user2 = user;
        C52711k.m112240b(user, "user");
        TextView textView2 = textView;
        C52711k.m112240b(textView, "userName");
        View view2 = view;
        C52711k.m112240b(view, "editRemark");
        String str2 = str;
        C52711k.m112240b(str, "enterFrom");
        this.f84868b.handleRemarkEditView(user2, i, textView2, view2, z, str2, z2);
    }

    public final void inviteFriends(Activity activity, String str) {
        this.f84868b.inviteFriends(activity, str);
    }

    public final void inviteFriendsByChannel(String str, Activity activity, String str2) {
        C52711k.m112240b(str, "channel");
        C52711k.m112240b(activity, "activity");
        this.f84868b.inviteFriendsByChannel(str, activity, str2);
    }

    public final boolean isPrivacyReminder() {
        return this.f84868b.isPrivacyReminder();
    }

    public final void launchProfileActivity(Context context, User user) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        this.f84868b.launchProfileActivity(context, user);
    }

    public final void launchProfileActivity(Context context, User user, String str, String str2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        this.f84868b.launchProfileActivity(context, user, str, str2);
    }

    public final void launchProfileActivity(Context context, User user, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "enterFrom");
        this.f84868b.launchProfileActivity(context, user, str, str2, str3);
    }

    public final void launchQRCodePermissionActivity(Context context, boolean z) {
        this.f84868b.launchQRCodePermissionActivity(context, z);
    }

    public final void logRecommendContactEvent(String str, String str2) {
        C52711k.m112240b(str, "actionType");
        this.f84868b.logRecommendContactEvent(str, str2);
    }

    public final void openPrivacyReminder(Context context, String str) {
        C52711k.m112240b(context, "context");
        this.f84868b.openPrivacyReminder(context, str);
    }

    public final void sendEnterPersonalDetailForAddFriend(int i, String str, int i2, String str2, String str3, String str4) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str3, "uid");
        C52711k.m112240b(str4, "enterMethod");
        this.f84868b.sendEnterPersonalDetailForAddFriend(i, str, i2, str2, str3, str4);
    }

    public final void showRecommendContact(String str) {
        this.f84868b.showRecommendContact(str);
    }

    public final int showRemarkIconStyle() {
        return this.f84868b.showRemarkIconStyle();
    }

    public final String sortLetters(String str) {
        return this.f84868b.sortLetters(str);
    }

    public final void startChatActivity(Context context, User user) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        this.f84868b.startChatActivity(context, user);
    }

    public final void startContactActivity(Context context, String str, boolean z) {
        C52711k.m112240b(context, "context");
        this.f84868b.startContactActivity(context, str, z);
    }

    public final void startFace2FacePermissionActivity(Context context, String str) {
        C52711k.m112240b(context, "context");
        this.f84868b.startFace2FacePermissionActivity(context, str);
    }

    public final void startFollowingFollowerActivity(Context context, Fragment fragment, String str, boolean z, boolean z2, int i, User user) {
        this.f84868b.startFollowingFollowerActivity(context, fragment, str, z, z2, i, user);
    }

    public final void startFollowingFollowerActivity(Context context, User user) {
        C52711k.m112240b(context, "context");
        this.f84868b.startFollowingFollowerActivity(context, user);
    }

    public final void startInviteMoreFriendsActivity(Context context) {
        C52711k.m112240b(context, "context");
        this.f84868b.startInviteMoreFriendsActivity(context);
    }

    public final void startQRCodePermissionActivity(Context context, boolean z) {
        this.f84868b.startQRCodePermissionActivity(context, z);
    }

    public final void watchFromSearch(Context context, User user, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "previousPage");
        this.f84868b.watchFromSearch(context, user, str);
    }

    public final void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i) {
        this.f84868b.wrapperSendMessageSyncXIcon(remoteImageView, i);
    }

    private C32619f() {
        IRecommendDependentService a = m75405a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…ndentService::class.java)");
        this.f84868b = a;
    }
}
