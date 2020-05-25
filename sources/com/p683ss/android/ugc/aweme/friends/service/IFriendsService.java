package com.p683ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.friends.adapter.C32541p;
import com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p683ss.android.ugc.aweme.friends.p1790d.C32579a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32773t;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32774u;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendContactItemView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendFriendItemViewV2;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService */
public interface IFriendsService {
    public static final int ACTION_FACEBOOK = 1;
    public static final C32612a Companion = C32612a.f84863a;

    /* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService$a */
    public static final class C32612a {

        /* renamed from: a */
        static final /* synthetic */ C32612a f84863a = new C32612a();

        private C32612a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService$b */
    public interface C32613b {
        /* renamed from: a */
        void mo49726a(Object obj);
    }

    int checkFriendslistPermissionPopUp(String str);

    C11585a<String, String, DislikeRecommendParams, String> createDislikeRecommendFetcher();

    C32541p createRecommendAwemeAdapter();

    IRecommendContactItemView createRecommendContactItemView(Context context);

    C32773t createRecommendContactViewHolder(IRecommendContactItemView iRecommendContactItemView);

    IRecommendFriendItemViewV2 createRecommendFriendItemViewV2(Context context, HashMap<String, Boolean> hashMap, boolean z);

    C32774u createRecommendFriendItemViewV2Holder(IRecommendFriendItemViewV2 iRecommendFriendItemViewV2);

    C32579a createRecommendListRepository();

    IRecommendFriendItemViewV2 createRecommendUserDialogItemView(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2);

    IRecommendFriendItemViewV2 createRecommendUserModalDialogItemView(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2);

    void dislikeRecommendUser(String str, String str2);

    C32617d getContactService();

    Intent getFindFriendsIntent(Context context, int i, int i2, String str);

    C32772s getFollowPresenter();

    Intent getFriendListIntent(Context context, String str);

    void hasShownComplianceDialog();

    boolean hasShownFriendslistPermissionPopUp();

    boolean isContactsActivityOrInviteFriendsActivity(Activity activity);

    void launchAddFriendActivity(Context context, String str);

    int needHomepageShowPermissionPopUp();

    void openPrivacyReminder(Context context, String str);

    void setPermissionNextPopUp(int i);

    void setPermissionPopUpNextTime(int i);

    void setShownFriendslistPermissionPopUp(boolean z);

    void showFriendslistPermissionPopUp(int i, String str);

    void startChatActivity(Context context, User user);

    C32618e thirdPartyFriendsService();

    void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i);
}
