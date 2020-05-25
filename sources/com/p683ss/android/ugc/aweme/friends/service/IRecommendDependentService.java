package com.p683ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.friends.service.IRecommendDependentService */
public interface IRecommendDependentService {
    boolean checkInsertRecommendContact();

    void cleanUpdateTagCount(String str);

    void dislike(String str);

    boolean enableFace2Face();

    boolean enableFriendRecommendEnhance();

    void enterContactActivity(Activity activity, C52671b<? super Boolean, C52860x> bVar);

    String getAppProtocol();

    Intent getContactsActivityIntent(Context context, String str, boolean z);

    String getFriendToFamiliarStr(int i, int i2, int i3);

    Intent getInviteUserListActivityIntent(Activity activity, int i);

    int getRecommendContactPosition();

    <T> T getSP(Context context, Class<T> cls);

    int getShowRemarkIconStyle();

    int getUpdateTagCount(String str);

    void goToPrivacyActivity(Context context);

    void guideContactToEditRemark(Context context, User user, FollowStatus followStatus, C52671b<? super User, C52860x> bVar);

    void handleRemarkEditView(User user, int i, TextView textView, View view, boolean z, String str, boolean z2);

    void inviteFriends(Activity activity, String str);

    void inviteFriendsByChannel(String str, Activity activity, String str2);

    boolean isPrivacyReminder();

    void launchProfileActivity(Context context, User user);

    void launchProfileActivity(Context context, User user, String str, String str2);

    void launchProfileActivity(Context context, User user, String str, String str2, String str3);

    void launchQRCodePermissionActivity(Context context, boolean z);

    void logRecommendContactEvent(String str, String str2);

    void openPrivacyReminder(Context context, String str);

    void sendEnterPersonalDetailForAddFriend(int i, String str, int i2, String str2, String str3, String str4);

    void showRecommendContact(String str);

    int showRemarkIconStyle();

    String sortLetters(String str);

    void startChatActivity(Context context, User user);

    void startContactActivity(Context context, String str, boolean z);

    void startFace2FacePermissionActivity(Context context, String str);

    void startFollowingFollowerActivity(Context context, Fragment fragment, String str, boolean z, boolean z2, int i, User user);

    void startFollowingFollowerActivity(Context context, User user);

    void startInviteMoreFriendsActivity(Context context);

    void startQRCodePermissionActivity(Context context, boolean z);

    void watchFromSearch(Context context, User user, String str);

    void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i);
}
