package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.bytedance.p702im.core.proto.Request;
import com.bytedance.p702im.core.proto.Response;
import com.google.gson.C18085o;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33597a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33377b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34147d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34149f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34276a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.BlockResponse;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34547d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34548e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34551h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34554k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.ShareStateResponse;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerMessageList;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerSessionList;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.UserStruct;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j.p1846a.C34390a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.RelationFetchResponse;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53070a;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53078i;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;
import p2666g.p2672c.C53093x;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ImApi */
public interface ImApi {
    @C53075f(mo110603a = "user/block/")
    C17832m<BlockResponse> block(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "block_type") int i);

    @C53075f(mo110603a = "im/stranger/cell/delete/")
    C17832m<BaseResponse> deleteStrangerCell();

    @C53075f(mo110603a = "im/stranger/msg/delete/")
    C17832m<BaseResponse> deleteStrangerSingleMsg(@C53089t(mo110619a = "to_uid") long j, @C53089t(mo110619a = "client_msg_id") long j2);

    @C53075f(mo110603a = "im/stranger/session/delete/")
    C17832m<BaseResponse> deleteStrangerSingleSession(@C53089t(mo110619a = "to_uid") long j);

    @C53075f(mo110603a = "im/msg/feedback/")
    C2201v<BaseResponse> feedBackMsg(@C53089t(mo110619a = "content") String str, @C53089t(mo110619a = "msg_type") String str2, @C53089t(mo110619a = "scene") String str3, @C53089t(mo110619a = "msg_id") Long l, @C53089t(mo110619a = "con_short_id") Long l2);

    @C53075f(mo110603a = "im/resources/hellosticker/")
    C0013i<C34547d> fetchGreetEmoji();

    @C53075f(mo110603a = "im/reboot/misc/")
    C2201v<C34548e> fetchMixInit(@C53089t(mo110619a = "r_cell_status") int i, @C53089t(mo110619a = "is_active_x") int i2, @C53089t(mo110619a = "im_token") int i3);

    @C53075f(mo110603a = "im/clist/banner/")
    C0013i<C34551h> fetchSessionListBannerConfig();

    @C53075f(mo110603a = "im/stranger/msg/list/")
    C17832m<StrangerMessageList> fetchStrangerMsgList(@C53089t(mo110619a = "to_uid") long j, @C53089t(mo110619a = "sec_to_uid") String str);

    @C53075f(mo110603a = "im/stranger/session/list/")
    C17832m<StrangerSessionList> fetchStrangerSessionList(@C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") long j2, @C53089t(mo110619a = "is_reset_total_unread_count") boolean z);

    @C53075f(mo110603a = "user/")
    C0013i<UserStruct> fetchUser(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2);

    @C53084o(mo110612a = "im/user/info/")
    @C53074e
    C0013i<C34554k> fetchUserInfo(@C53072c(mo110600a = "sec_user_ids") String str);

    @C53084o(mo110612a = "multi/commit/follow/user/")
    @C53074e
    C2201v<Object> followUsers(@C53072c(mo110600a = "user_ids") String str, @C53072c(mo110600a = "sec_user_ids") String str2, @C53072c(mo110600a = "type") int i, @C53072c(mo110600a = "from") int i2, @C53072c(mo110600a = "from_pre") int i3, @C53072c(mo110600a = "channel_id") int i4, @C53072c(mo110600a = "group_id") String str3);

    @C53075f(mo110603a = "im/group/share/")
    C0013i<C34147d> getGroupShareInfo(@C53089t(mo110619a = "share_scene") int i, @C53089t(mo110619a = "share_type") int i2, @C53089t(mo110619a = "group_id") String str);

    @C53075f(mo110603a = "im/spotlight/multi_relation/")
    C0013i<ShareStateResponse> getShareUserCanSendMsg(@C53089t(mo110619a = "sec_to_user_id") String str);

    @C53075f(mo110603a = "spotlight/relation/")
    C17832m<RelationFetchResponse> getSpotlightRelation(@C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "source") String str, @C53089t(mo110619a = "with_fstatus") int i2, @C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "address_book_access") int i3);

    @C53075f(mo110603a = "life/detail/")
    C0013i<C34390a> getStoryDetail(@C53089t(mo110619a = "story_id") String str);

    @C53075f(mo110603a = "im/upload/config/")
    C2201v<C33377b> getUploadAuthKeyConfig();

    @C53084o(mo110612a = "im/group/share/verification/")
    @C53074e
    C0013i<C34149f> groupShareVerification(@C53072c(mo110600a = "secret") String str, @C53072c(mo110600a = "secret_type") int i, @C53072c(mo110600a = "group_id") String str2);

    @C53084o
    C2201v<Response> postIMSDK(@C53093x String str, @C53070a Request request, @C53078i(mo110608a = "Content-Type") String str2);

    @C53084o(mo110612a = "im/user/active/status/")
    @C53074e
    C2201v<Object> pullUserActiveStatus(@C53072c(mo110600a = "source") String str, @C53072c(mo110600a = "sec_user_ids") String str2);

    @C53075f(mo110603a = "im/user/active/update/")
    C2201v<BaseResponse> pushUserActiveStatus(@C53089t(mo110619a = "action") String str);

    @C53075f(mo110603a = "aweme/detail/")
    C0013i<C18085o> queryAweme(@C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "origin_type") String str2);

    @C53075f(mo110603a = "user/")
    C17832m<UserStruct> queryUser(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2);

    @C53075f(mo110603a = "im/dx/app/status/")
    C2201v<BaseResponse> reportXInstall(@C53089t(mo110619a = "is_install") int i);

    @C53075f(mo110603a = "im/resources/emoticon/search/")
    C0013i<C33597a> searchEmojis(@C53089t(mo110619a = "keyword") String str, @C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "source") String str2, @C53089t(mo110619a = "target_uid") String str3);

    @C53075f(mo110603a = "im/follower/search/")
    C2201v<C34276a> searchFollowers(@C53089t(mo110619a = "keyword") String str, @C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "search_source") String str2);

    @C53084o(mo110612a = "im/dr/cell/")
    C0013i<BaseResponse> updateRCellState(@C53089t(mo110619a = "action") int i);
}
