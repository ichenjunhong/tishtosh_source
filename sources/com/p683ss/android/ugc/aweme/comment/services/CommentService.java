package com.p683ss.android.ugc.aweme.comment.services;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p683ss.android.ugc.aweme.comment.api.C25139b;
import com.p683ss.android.ugc.aweme.comment.api.C25142e;
import com.p683ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.p683ss.android.ugc.aweme.comment.list.C25253b;
import com.p683ss.android.ugc.aweme.comment.list.C25256e;
import com.p683ss.android.ugc.aweme.comment.list.C25258g;
import com.p683ss.android.ugc.aweme.comment.list.C25259h;
import com.p683ss.android.ugc.aweme.comment.list.C25261j;
import com.p683ss.android.ugc.aweme.comment.list.C25262k;
import com.p683ss.android.ugc.aweme.comment.list.C25264m;
import com.p683ss.android.ugc.aweme.comment.list.C25268q;
import com.p683ss.android.ugc.aweme.comment.list.C25269r;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25144a;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25145b;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25149c;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25171f;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.feed.api.C30153k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.comment.services.CommentService */
public interface CommentService {
    public static final C25280a Companion = C25280a.f66876a;

    /* renamed from: com.ss.android.ugc.aweme.comment.services.CommentService$a */
    public static final class C25280a {

        /* renamed from: a */
        static final /* synthetic */ C25280a f66876a = new C25280a();

        private C25280a() {
        }

        /* renamed from: a */
        public static CommentService m61493a() {
            return CommentServiceImpl.provideCommentService_Monster();
        }
    }

    C26129j buildCommentStruct(Aweme aweme);

    void clearAllTranslationCache();

    void fetchPreloadCommentList(String str, long j, int i, int i2, String str2, String str3, int i3, int i4, boolean z, String str4, String str5) throws Exception;

    String getCommentCategory(Comment comment);

    CommentViewModel getCommentViewModel(FragmentActivity fragmentActivity);

    List<TextExtraStruct> getDispalyTextExtraForMoment(Comment comment);

    List<TextExtraStruct> getDisplayLinkTextExtra(Context context, Aweme aweme, C26129j jVar);

    String getDisplayText(C26129j jVar);

    List<TextExtraStruct> getDisplayTextExtra(C26129j jVar);

    List<TextExtraStruct> getDisplayTextExtraForIns(Comment comment);

    String getDisplayTextForIns(Comment comment, Paint paint, int i);

    String getDisplayTextForMoment(Comment comment, Paint paint, int i);

    List<TextExtraStruct> getNewDisplayTextExtra(C26129j jVar, AwemeRawAd awemeRawAd, C52670a<C52860x> aVar);

    List<TextExtraStruct> getSearchCommentTextExtra(C26129j jVar, C52670a<C52860x> aVar);

    String getTextWithGifEmojiDetailTail(Comment comment);

    String getTextWithGifEmojiDetailTail(Comment comment, String str);

    void handleCommentInputPublishSuccess(Context context, Comment comment);

    boolean handleException(Context context, Exception exc, int i, boolean z);

    boolean hasTextExtra(Comment comment);

    void hideCommentList(Context context);

    void hideCommentListImmediately(Context context);

    boolean isBlackMode();

    boolean isCommentListShowing(Context context);

    boolean isFeedHotCommentExperimentOpen();

    C25139b provideCommentBlackModeColorHelper();

    Collection<Integer> provideViewHolderLayoutIdsForPreload();

    C25253b providerCommentDeletePresenter();

    C25256e providerCommentDiggPresenter();

    C25258g providerCommentFetchPresenter();

    C25145b providerCommentInputManager(Fragment fragment, int i, C25285d dVar);

    C25261j providerCommentReplyButtonViewHolder(ViewGroup viewGroup, C25147a aVar);

    C25262k providerCommentReplyListPresenter(String str);

    C25264m providerCommentReplyViewHolder(ViewGroup viewGroup, C25147a aVar);

    C25268q providerCommentViewHolderFollowFeed(ViewGroup viewGroup, C25147a aVar, String str);

    C30153k providerFeedHotCommentManager(ViewGroup viewGroup, View view, View view2, DataCenter dataCenter, int i);

    C25142e providerFeedHotCommentPanel();

    int providerInputLayoutIdForPreLoad();

    C25269r providerReplyCommentDataManager();

    boolean publishSelfSeeComment();

    void sendCloseCommentTabEvent(String str);

    void sendCloseTextEvent(String str, Aweme aweme, long j, String str2);

    void sendCollectEmojiEvent();

    void sendCommentDurationEvent(String str, String str2, String str3, int i, String str4, int i2, long j, String str5, String str6, String str7, String str8, String str9);

    void sendCommentEvent(String str, Aweme aweme, JSONObject jSONObject, boolean z, String str2);

    void sendCopyCommentEvent(String str, String str2, String str3, Aweme aweme);

    void sendEmojiClickEvent(String str, int i, String str2, String str3, String str4);

    void sendEmojiToKeyboardEvent(String str, String str2, String str3, String str4);

    void sendEnterCommentEvent(String str, Aweme aweme, String str2, int i, String str3, String str4);

    void sendEnterTextEvent(String str, Aweme aweme, String str2, String str3);

    void sendHideAllReplyEvent(String str, String str2, String str3);

    void sendLikeCommentResultEvent(String str, Aweme aweme, String str2, boolean z, String str3, String str4);

    void sendPostCommentEvent(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7);

    void sendReportCommentEvent(String str, Aweme aweme, String str2, String str3, String str4);

    void sendShowMoreReplyEvent(String str, String str2, String str3);

    void setShouldSetTopWhenOpen(boolean z);

    void setStartLoadTime();

    C25259h showCommentList(Activity activity, Aweme aweme, C25171f fVar);

    C25144a showInputFragment(View view, C0654k kVar, String str, C25284c cVar, C25149c cVar2);

    void updateDigg(Comment comment, String str);
}
