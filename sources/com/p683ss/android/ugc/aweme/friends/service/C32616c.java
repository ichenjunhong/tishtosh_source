package com.p683ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.friends.adapter.C32541p;
import com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p683ss.android.ugc.aweme.friends.p1790d.C32579a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32773t;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32774u;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendContactItemView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendFriendItemViewV2;
import com.p683ss.android.ugc.aweme.p1632di.C27618be;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.service.c */
public final class C32616c implements IFriendsService {

    /* renamed from: a */
    public static final C32616c f84865a = new C32616c();

    /* renamed from: b */
    private final /* synthetic */ IFriendsService f84866b;

    /* renamed from: a */
    public static IFriendsService m75399a() {
        if (C27991b.f73430N == null) {
            synchronized (IFriendsService.class) {
                if (C27991b.f73430N == null) {
                    C27991b.f73430N = C27618be.m66300a();
                }
            }
        }
        return (IFriendsService) C27991b.f73430N;
    }

    public final int checkFriendslistPermissionPopUp(String str) {
        C52711k.m112240b(str, "enterFrom");
        return this.f84866b.checkFriendslistPermissionPopUp(str);
    }

    public final C11585a<String, String, DislikeRecommendParams, String> createDislikeRecommendFetcher() {
        return this.f84866b.createDislikeRecommendFetcher();
    }

    public final C32541p createRecommendAwemeAdapter() {
        return this.f84866b.createRecommendAwemeAdapter();
    }

    public final IRecommendContactItemView createRecommendContactItemView(Context context) {
        C52711k.m112240b(context, "context");
        return this.f84866b.createRecommendContactItemView(context);
    }

    public final C32773t createRecommendContactViewHolder(IRecommendContactItemView iRecommendContactItemView) {
        C52711k.m112240b(iRecommendContactItemView, "recommendContactItemView");
        return this.f84866b.createRecommendContactViewHolder(iRecommendContactItemView);
    }

    public final IRecommendFriendItemViewV2 createRecommendFriendItemViewV2(Context context, HashMap<String, Boolean> hashMap, boolean z) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hashMap, "followClickMap");
        return this.f84866b.createRecommendFriendItemViewV2(context, hashMap, z);
    }

    public final C32774u createRecommendFriendItemViewV2Holder(IRecommendFriendItemViewV2 iRecommendFriendItemViewV2) {
        C52711k.m112240b(iRecommendFriendItemViewV2, "view");
        return this.f84866b.createRecommendFriendItemViewV2Holder(iRecommendFriendItemViewV2);
    }

    public final C32579a createRecommendListRepository() {
        return this.f84866b.createRecommendListRepository();
    }

    public final IRecommendFriendItemViewV2 createRecommendUserDialogItemView(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hashMap, "followClickMap");
        return this.f84866b.createRecommendUserDialogItemView(context, hashMap, z, z2);
    }

    public final IRecommendFriendItemViewV2 createRecommendUserModalDialogItemView(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hashMap, "followClickMap");
        return this.f84866b.createRecommendUserModalDialogItemView(context, hashMap, z, z2);
    }

    public final void dislikeRecommendUser(String str, String str2) {
        C52711k.m112240b(str, "uid");
        this.f84866b.dislikeRecommendUser(str, str2);
    }

    public final C32617d getContactService() {
        return this.f84866b.getContactService();
    }

    public final Intent getFindFriendsIntent(Context context, int i, int i2, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        return this.f84866b.getFindFriendsIntent(context, i, i2, str);
    }

    public final C32772s getFollowPresenter() {
        return this.f84866b.getFollowPresenter();
    }

    public final Intent getFriendListIntent(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        return this.f84866b.getFriendListIntent(context, str);
    }

    public final void hasShownComplianceDialog() {
        this.f84866b.hasShownComplianceDialog();
    }

    public final boolean hasShownFriendslistPermissionPopUp() {
        return this.f84866b.hasShownFriendslistPermissionPopUp();
    }

    public final boolean isContactsActivityOrInviteFriendsActivity(Activity activity) {
        return this.f84866b.isContactsActivityOrInviteFriendsActivity(activity);
    }

    public final void launchAddFriendActivity(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        this.f84866b.launchAddFriendActivity(context, str);
    }

    public final int needHomepageShowPermissionPopUp() {
        return this.f84866b.needHomepageShowPermissionPopUp();
    }

    public final void openPrivacyReminder(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        this.f84866b.openPrivacyReminder(context, str);
    }

    public final void setPermissionNextPopUp(int i) {
        this.f84866b.setPermissionNextPopUp(i);
    }

    public final void setPermissionPopUpNextTime(int i) {
        this.f84866b.setPermissionPopUpNextTime(i);
    }

    public final void setShownFriendslistPermissionPopUp(boolean z) {
        this.f84866b.setShownFriendslistPermissionPopUp(z);
    }

    public final void showFriendslistPermissionPopUp(int i, String str) {
        C52711k.m112240b(str, "enterFrom");
        this.f84866b.showFriendslistPermissionPopUp(i, str);
    }

    public final void startChatActivity(Context context, User user) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        this.f84866b.startChatActivity(context, user);
    }

    public final C32618e thirdPartyFriendsService() {
        return this.f84866b.thirdPartyFriendsService();
    }

    public final void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i) {
        this.f84866b.wrapperSendMessageSyncXIcon(remoteImageView, i);
    }

    private C32616c() {
        IFriendsService a = m75399a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…iendsService::class.java)");
        this.f84866b = a;
    }
}
