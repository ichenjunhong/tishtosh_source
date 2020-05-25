package com.p683ss.android.ugc.aweme.comment.api;

import com.bytedance.retrofit2.p831b.C12702d;
import com.google.gson.C17971f;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.p683ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p683ss.android.ugc.aweme.comment.model.CommentResponse;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25169e;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.net.cache.C37753b;
import com.p683ss.android.ugc.aweme.net.cache.C37755d;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.util.concurrent.ExecutionException;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.comment.api.CommentApi */
public final class CommentApi {

    /* renamed from: a */
    static final IRetrofit f66573a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e);

    /* renamed from: b */
    private static IRetrofitService f66574b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.comment.api.CommentApi$RealApi */
    interface RealApi {
        @C53075f(mo110603a = "/aweme/v1/comment/delete/")
        C17832m<BaseCommentResponse> deleteComment(@C53089t(mo110619a = "cid") String str);

        @C53075f(mo110603a = "/aweme/v1/comment/digg/")
        C17832m<BaseCommentResponse> diggComment(@C53089t(mo110619a = "cid") String str, @C53089t(mo110619a = "aweme_id") String str2, @C53089t(mo110619a = "digg_type") String str3, @C53089t(mo110619a = "channel_id") int i);

        @C53075f(mo110603a = "/aweme/v1/comment/list/")
        C17832m<CommentItemList> fetchCommentList(@C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "comment_style") int i2, @C53089t(mo110619a = "digged_cid") String str2, @C53089t(mo110619a = "insert_cids") String str3, @C53089t(mo110619a = "address_book_access") Integer num, @C53089t(mo110619a = "gps_access") Integer num2);

        @C53075f(mo110603a = "/aweme/v2/comment/list/")
        C0013i<CommentItemList> fetchCommentListV2(@C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "insert_ids") String str2, @C53089t(mo110619a = "address_book_access") Integer num, @C53089t(mo110619a = "gps_access") Integer num2, @C53089t(mo110619a = "forward_page_type") int i2, @C53089t(mo110619a = "ad_creative_id") Long l, @C53089t(mo110619a = "channel_id") int i3, @C53089t(mo110619a = "city") String str3, @C53089t(mo110619a = "hotsoon_filtered_count") int i4, @C53089t(mo110619a = "hotsoon_has_more") int i5, @C12702d Object obj);

        @C53075f(mo110603a = "/aweme/v1/comment/story/replylist/")
        C17832m<CommentItemList> fetchStoryReplyCommentList(@C53089t(mo110619a = "comment_id") String str);

        @C53075f(mo110603a = "/aweme/v1/comment/list/reply/")
        C0013i<CommentItemList> loadMoreCommentList(@C53089t(mo110619a = "comment_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "top_ids") String str2, @C53089t(mo110619a = "item_id") String str3, @C53089t(mo110619a = "insert_ids") String str4, @C53089t(mo110619a = "channel_id") int i2, @C53089t(mo110619a = "city") String str5);

        @C53084o(mo110612a = "/aweme/v1/comment/publish/")
        @C53074e
        C17832m<CommentResponse> publishComment(@C53072c(mo110600a = "aweme_id") String str, @C53072c(mo110600a = "text") String str2, @C53072c(mo110600a = "reply_id") String str3, @C53072c(mo110600a = "text_extra") String str4, @C53072c(mo110600a = "is_self_see") int i, @C53072c(mo110600a = "reply_to_reply_id") String str5, @C53072c(mo110600a = "sticker_id") String str6, @C53072c(mo110600a = "sticker_uri") String str7, @C53072c(mo110600a = "sticker_source") int i2, @C53072c(mo110600a = "sticker_width") int i3, @C53072c(mo110600a = "sticker_height") int i4, @C53072c(mo110600a = "channel_id") int i5, @C53072c(mo110600a = "city") String str8, @C53072c(mo110600a = "action_type") int i6);

        @C53075f(mo110603a = "/aweme/v1/comment/top/save/")
        C17832m<BaseResponse> topComment(@C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "comment_id") String str2, @C53089t(mo110619a = "op") int i);
    }

    /* renamed from: a */
    public static BaseCommentResponse m61044a(String str) throws Exception {
        try {
            return (BaseCommentResponse) ((RealApi) f66573a.create(RealApi.class)).deleteComment(str).get();
        } catch (ExecutionException e) {
            throw f66574b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    private static Long m61047a(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || C26503d.m64064g(aweme)) {
            return null;
        }
        return aweme.getAwemeRawAd().getCreativeId();
    }

    /* renamed from: a */
    public static CommentResponse m61046a(C25169e eVar, int i) throws Exception {
        String str;
        String valueOf;
        UrlModel urlModel;
        int i2;
        int i3;
        int i4;
        C25169e eVar2 = eVar;
        try {
            C17971f gson = C47759cc.m103382a().getGson();
            if (eVar2.f66623d != null) {
                str = gson.mo34889b(eVar2.f66623d);
            } else {
                str = "[]";
            }
            String str2 = str;
            C29366a aVar = eVar2.f66625f;
            if (aVar == null) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(aVar.getId());
            }
            String str3 = valueOf;
            String str4 = null;
            if (aVar == null) {
                urlModel = null;
            } else {
                urlModel = aVar.getAnimateUrl();
            }
            if (urlModel != null) {
                str4 = urlModel.getUri();
            }
            String str5 = str4;
            if (aVar == null) {
                i2 = 0;
            } else {
                i2 = aVar.getStickerType();
            }
            if (aVar == null) {
                i3 = 0;
            } else {
                i3 = aVar.getWidth();
            }
            if (aVar == null) {
                i4 = 0;
            } else {
                i4 = aVar.getHeight();
            }
            int i5 = i;
            CommentResponse commentResponse = (CommentResponse) ((RealApi) f66573a.create(RealApi.class)).publishComment(eVar2.f66620a, eVar2.f66621b, eVar2.f66622c, str2, i5, eVar2.f66624e, str3, str5, i2, i3, i4, eVar2.f66626g, eVar2.f66627h, eVar2.f66684j ? 1 : 0).get();
            commentResponse.comment.setLabelInfo(commentResponse.starFakeLabel);
            commentResponse.comment.setEmoji(eVar2.f66625f);
            commentResponse.comment.setFakeId(eVar2.f66628i);
            return commentResponse;
        } catch (ExecutionException e) {
            throw f66574b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m61043a(String str, String str2, boolean z) throws Exception {
        int i;
        try {
            RealApi realApi = (RealApi) f66573a.create(RealApi.class);
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            return (BaseResponse) realApi.topComment(str, str2, i).get();
        } catch (ExecutionException e) {
            throw f66574b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseCommentResponse m61045a(String str, String str2, String str3, int i) throws Exception {
        try {
            return (BaseCommentResponse) ((RealApi) f66573a.create(RealApi.class)).diggComment(str, str2, str3, i).get();
        } catch (ExecutionException e) {
            throw f66574b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C0013i<CommentItemList> m61042a(String str, long j, int i, String str2, String str3, String str4, int i2, String str5) {
        return ((RealApi) f66573a.create(RealApi.class)).loadMoreCommentList(str, j, i, str2, str3, str4, i2, str5);
    }

    /* renamed from: a */
    public static C0013i<CommentItemList> m61041a(String str, long j, int i, String str2, int i2, int i3, Long l, int i4, String str3, int i5, int i6) {
        C37755d dVar;
        boolean isFollowFeedEnterFullScreenDetail = C25282a.m61494a().isFollowFeedEnterFullScreenDetail();
        Aweme awemeById = C23324d.m57378a().getAwemeById(str);
        if (l == null) {
            m61047a(awemeById);
        }
        if (awemeById == null || awemeById.getPreload() == null || awemeById.getPreload().commentPreload < 0) {
            dVar = null;
        } else {
            C37755d dVar2 = new C37755d();
            C37753b bVar = new C37753b();
            bVar.f96198a = "cache_comment";
            bVar.f96200c = 100000;
            bVar.f96199b = 1;
            dVar2.f96204s = bVar;
            dVar = dVar2;
        }
        return ((RealApi) f66573a.create(RealApi.class)).fetchCommentListV2(str, j, i, str2, Integer.valueOf(i2), Integer.valueOf(i3), isFollowFeedEnterFullScreenDetail ? 1 : 0, l, i4, str3, i5, i6, dVar);
    }
}
