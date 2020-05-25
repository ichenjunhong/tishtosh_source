package com.p683ss.android.ugc.aweme.friends.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.friends.invite.C32585c;
import com.p683ss.android.ugc.aweme.friends.invite.C32586d;
import com.p683ss.android.ugc.aweme.friends.model.Friend;
import com.p683ss.android.ugc.aweme.friends.model.FriendList;
import com.p683ss.android.ugc.aweme.friends.model.ThirdPartyUserList;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.friends.api.FriendApi */
public interface FriendApi {
    @C53075f(mo110603a = "/ug/social/invite/msg/settings/")
    C17832m<C32586d> getInviteContactFriendsSettings();

    @C53084o(mo110612a = "/ug/social/invite/msg/send_msg/")
    @C53074e
    C17832m<C32560c> inviteBySms(@C53072c(mo110600a = "user_name") String str, @C53072c(mo110600a = "enter_from") String str2, @C53072c(mo110600a = "mobile_list") String str3);

    @C53084o(mo110612a = "/aweme/v1/user/contact/invite/")
    @C53074e
    C17832m<C32560c> inviteBySmsDouyin(@C53089t(mo110619a = "user_name") String str, @C53072c(mo110600a = "mobile_ids") String str2);

    @C53075f(mo110603a = "/aweme/v1/user/contact/")
    C0013i<FriendList<User>> queryContactsFriends(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "type") int i3);

    @C53075f(mo110603a = "/aweme/v1/user/contact/")
    C0013i<FriendList<User>> queryContactsFriendsCountOnly(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "type") int i3, @C53089t(mo110619a = "count_only") int i4);

    @C53075f(mo110603a = "/aweme/v1/user/contact/invite_list/")
    C0013i<FriendList<User>> queryMoreUnregisteredFriends(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

    @C53084o(mo110612a = "/ug/social/invite/msg/short_url/")
    @C53074e
    C17832m<C32585c> shortenUrl(@C53072c(mo110600a = "url") String str);

    @C53075f(mo110603a = "/aweme/v1/social/friend/")
    C0013i<FriendList<Friend>> thirdPartFriends(@C53089t(mo110619a = "social") String str, @C53089t(mo110619a = "access_token") String str2, @C53089t(mo110619a = "secret_access_token") String str3);

    @C53075f(mo110603a = "/aweme/v1/login/user/recommend/")
    C0013i<ThirdPartyUserList> thirdPartyRecommendUsers(@C53089t(mo110619a = "social_login_source") int i, @C53089t(mo110619a = "access_token") String str, @C53089t(mo110619a = "access_token_secret") String str2, @C53089t(mo110619a = "scenario") int i2, @C53089t(mo110619a = "cursor") int i3, @C53089t(mo110619a = "count") int i4);

    @C53075f(mo110603a = "/aweme/v1/social/token_upload/")
    C0013i<BaseResponse> uploadAccessToken(@C53089t(mo110619a = "social") String str, @C53089t(mo110619a = "access_token") String str2, @C53089t(mo110619a = "secret_access_token") String str3);
}
