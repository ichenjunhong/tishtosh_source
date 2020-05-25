package com.p683ss.android.ugc.aweme.comment.services;

import android.app.Activity;
import android.content.Context;
import android.text.style.ReplacementSpan;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.api.C25140c;
import com.p683ss.android.ugc.aweme.comment.list.C25266o;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25171f;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.services.CommentDependServiceImpl;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.comment.services.a */
public interface C25281a {

    /* renamed from: a */
    public static final C25282a f66877a = C25282a.f66878a;

    /* renamed from: com.ss.android.ugc.aweme.comment.services.a$a */
    public static final class C25282a {

        /* renamed from: a */
        static final /* synthetic */ C25282a f66878a = new C25282a();

        private C25282a() {
        }

        /* renamed from: a */
        public static C25281a m61494a() {
            return CommentDependServiceImpl.provideCommentDependService_Monster();
        }
    }

    void appendV4CommonParams(C23089d dVar, String str, String str2);

    void commentReplyToIM(Context context, Comment comment, UrlModel urlModel, String str, int i, String str2, String str3);

    C25266o createCommentVideoTagView(ViewGroup viewGroup);

    void createDialogForComment(Context context, int i, Runnable runnable);

    String disLikeAweme(Aweme aweme, C26138s sVar) throws Exception;

    int getBindPhoneForCommentAB();

    Widget getCommentAdWidget(C26129j jVar, C52670a<C52860x> aVar);

    Widget getCommentHeaderWidget(C52670a<C52860x> aVar);

    List<AnchorCommonStruct> getDonationAnchor(Aweme aweme);

    C25140c getICommentLikeUsersHolder(ViewGroup viewGroup);

    int getIsLongItem(Context context);

    ReplacementSpan getLinkTagSpan(Context context, Aweme aweme);

    long getPlayerManagerCurrentPosition();

    boolean isBlackBackground();

    boolean isChallengeToHashTag();

    boolean isCurPlayActive(Activity activity);

    boolean isFollowFeedEnterFullScreenDetail();

    boolean isInLongVideoPage(Context context);

    boolean isNewCommentBackground();

    boolean isPersonalAweme(C25171f fVar, Aweme aweme);

    boolean isSearchMixViewHolder();

    boolean isShowBarrageStyle(C25171f fVar, Aweme aweme);

    void logAdLink(Context context, String str, C26138s sVar, Aweme aweme, String str2);

    void logDetailAdMaskClickReplay(Context context, String str, String str2, String str3);

    void logFeedRawAdComment(Context context, Aweme aweme, String str);

    boolean needBindMobile();

    void onEventV3IncludingPoiParams(Aweme aweme, String str, C23089d dVar);

    void onEventV3JsonIncludingPoiParams(Aweme aweme, String str, C23089d dVar);

    void openRecordFromComment(Context context, CommentVideoModel commentVideoModel);

    void report(Activity activity, Comment comment, String str);

    void report(Activity activity, Aweme aweme, String str, String str2);

    void sendAdLog(Context context, Aweme aweme, String str, String str2);

    void startUserProfileActivity(Context context, String str, String str2, String str3);

    void switchToUsername(Activity activity);
}
