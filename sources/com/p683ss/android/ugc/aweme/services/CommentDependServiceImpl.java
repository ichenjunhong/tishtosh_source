package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23694h;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23661f.C23662a;
import com.p683ss.android.ugc.aweme.comment.adapter.C25113f;
import com.p683ss.android.ugc.aweme.comment.api.C25140c;
import com.p683ss.android.ugc.aweme.comment.experiment.BindPhoneForCommentAB;
import com.p683ss.android.ugc.aweme.comment.list.C25266o;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25171f;
import com.p683ss.android.ugc.aweme.comment.services.C25281a;
import com.p683ss.android.ugc.aweme.comment.widgets.CommentAdWidget;
import com.p683ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget;
import com.p683ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.ISearchMixViewHolderExperiment;
import com.p683ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.p683ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.SummonFriendActivity;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36351a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.MainFragment;
import com.p683ss.android.ugc.aweme.main.MainPageFragment;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1632di.C27604ar;
import com.p683ss.android.ugc.aweme.p1797h.C32948d;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.C33195f;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35467d;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.CommentVideoConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45383ah.C45384a;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47722bj;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.CommentDependServiceImpl */
public class CommentDependServiceImpl implements C25281a {
    public static C25281a provideCommentDependService_Monster() {
        if (C27991b.f73518n == null) {
            synchronized (C25281a.class) {
                if (C27991b.f73518n == null) {
                    C27991b.f73518n = C27604ar.m66282a();
                }
            }
        }
        return (C25281a) C27991b.f73518n;
    }

    public C25266o createCommentVideoTagView(ViewGroup viewGroup) {
        return null;
    }

    public ReplacementSpan getLinkTagSpan(Context context, Aweme aweme) {
        return null;
    }

    public boolean isPersonalAweme(C25171f fVar, Aweme aweme) {
        return false;
    }

    public boolean isShowBarrageStyle(C25171f fVar, Aweme aweme) {
        return false;
    }

    public void logAdLink(Context context, String str, C26138s sVar, Aweme aweme, String str2) {
    }

    public boolean needBindMobile() {
        return false;
    }

    public boolean isChallengeToHashTag() {
        C41589c.m91432a();
        return true;
    }

    public long getPlayerManagerCurrentPosition() {
        return C48121w.m104249M().mo95256n();
    }

    public boolean isNewCommentBackground() {
        if (MigrateABTestModel.getInstance().getCommentBG() == 0) {
            return true;
        }
        return false;
    }

    public int getBindPhoneForCommentAB() {
        return C10181b.m20511a().mo18168a(BindPhoneForCommentAB.class, true, "bind_phone_for_post_comment", 31744, 21);
    }

    public boolean isBlackBackground() {
        Activity g = C11016e.m22312g();
        if ((g instanceof ForwardDetailActivity) || (g instanceof OriginDetailActivity)) {
            return true;
        }
        return false;
    }

    public boolean isFollowFeedEnterFullScreenDetail() {
        return C10181b.m20511a().mo18172a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false);
    }

    public boolean isSearchMixViewHolder() {
        if (C10181b.m20511a().mo18168a(ISearchMixViewHolderExperiment.class, true, "search_mix_display_type", 31744, 0) != 0) {
            return true;
        }
        return false;
    }

    public Widget getCommentHeaderWidget(C52670a<C52860x> aVar) {
        return new CommentHeaderWidget(aVar);
    }

    public List<AnchorCommonStruct> getDonationAnchor(Aweme aweme) {
        return C23662a.m58047a(aweme);
    }

    public int getIsLongItem(Context context) {
        return C36351a.m82034a(context);
    }

    public boolean isInLongVideoPage(Context context) {
        return C36351a.f93060a.mo75268b(context);
    }

    public boolean isLongVideo(Aweme aweme) {
        return C36353b.m82038a(aweme);
    }

    public C25140c getICommentLikeUsersHolder(ViewGroup viewGroup) {
        return new C25113f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjm, viewGroup, false));
    }

    public boolean isOnFeedPage(Context context) {
        if (context instanceof MainActivity) {
            Fragment a = ((MainActivity) context).getTabChangeManager().mo75609a();
            if (a != null && (a instanceof MainFragment) && ((MainFragment) a).mo75504d()) {
                return true;
            }
        }
        return false;
    }

    public void switchToUsername(Activity activity) {
        ProfileEditActivity.m89261a(activity, C47661ab.m103163a().mo94969a("need_focus_id_input", 4).f120139a);
        activity.overridePendingTransition(R.anim.bm, R.anim.bv);
    }

    public boolean isMainPageFragmentVisible(Fragment fragment) {
        for (Fragment fragment2 : fragment.getFragmentManager().mo2238f()) {
            if ((fragment2 instanceof MainPageFragment) && fragment2.getUserVisibleHint()) {
                return true;
            }
        }
        return false;
    }

    public boolean isCurPlayActive(Activity activity) {
        if (C11016e.m22313h()) {
            return false;
        }
        if (activity instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) activity;
            if (!ScrollSwitchStateManager.m75876a((FragmentActivity) mainActivity).mo69868b("page_feed") || !mainActivity.isUnderMainTab() || !mainActivity.isViewValid()) {
                return false;
            }
            return true;
        } else if (!(activity instanceof DetailActivity)) {
            return false;
        } else {
            DetailActivity detailActivity = (DetailActivity) activity;
            if (!ScrollSwitchStateManager.m75876a((FragmentActivity) detailActivity).mo69868b("page_feed") || !detailActivity.isViewValid()) {
                return false;
            }
            return true;
        }
    }

    public Uri getFileProviderUri(Context context, String str) {
        return C47722bj.m103304a(context, new File(str));
    }

    public Widget getCommentAdWidget(C26129j jVar, C52670a<C52860x> aVar) {
        if (jVar == null || jVar.getCommentStyle() == 0) {
            return new CommentAdWidget(aVar);
        }
        return new NewCommentAdWidget(aVar);
    }

    public String disLikeAweme(Aweme aweme, C26138s sVar) throws Exception {
        C26138s a = C26428bm.m63902a(aweme);
        if (a == null) {
            return "";
        }
        if (aweme == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        String str = a.creativeId;
        String str2 = a.logExtra;
        String aid = aweme.getAid();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("creative_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("log_extra", str2);
        }
        NetUtil.putCommonParams(hashMap, true);
        AwemeApi.f101549e.disLikeAweme(aid, hashMap).execute();
        return aid;
    }

    public void openRecordFromComment(Context context, CommentVideoModel commentVideoModel) {
        C52711k.m112240b(context, "activity");
        Builder shootWay = new Builder().shootWay("comment_reply");
        CommentVideoConfig commentVideoConfig = new CommentVideoConfig();
        commentVideoConfig.setCommentVideoModel(commentVideoModel);
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C45384a(context, shootWay.CommentVideoConfig(commentVideoConfig)));
    }

    public void createDialogForComment(Context context, int i, Runnable runnable) {
        C32948d.m75853a(context, i, runnable, "comment");
    }

    public void onEventV3IncludingPoiParams(Aweme aweme, String str, C23089d dVar) {
        PoiServiceImpl.createIPoiServicebyMonsterPlugin().onEventV3IncludingPoiParams(aweme, str, dVar);
    }

    public void onEventV3JsonIncludingPoiParams(Aweme aweme, String str, C23089d dVar) {
        PoiServiceImpl.createIPoiServicebyMonsterPlugin().onEventV3JsonIncludingPoiParams(aweme, str, dVar);
    }

    public void logFeedRawAdComment(Context context, Aweme aweme, String str) {
        JSONObject m = C26088l.m63373m(context, aweme, "raw ad comment");
        if (!TextUtils.isEmpty(str)) {
            try {
                m.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        C26088l.m63322b(context, "comment", aweme, m);
    }

    public void appendV4CommonParams(C23089d dVar, String str, String str2) {
        if (dVar != null && C10181b.m20511a().mo18168a(DiscoveryV4Experiment.class, true, "discover_v4_type", 31744, 0) > 0) {
            if (C10181b.m20511a().mo18168a(DiscoveryV4Experiment.class, true, "discover_v4_type", 31744, 0) == 1) {
                dVar.mo47829a("discovery_category", str);
            } else {
                dVar.mo47829a("tab_name", str);
            }
            dVar.mo47829a("order", str2);
        }
    }

    public void report(Activity activity, Comment comment, String str) {
        int i;
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", comment.getCid());
        String str2 = "comment_with_emoji";
        if (comment.getEmoji() != null) {
            i = 1;
        } else {
            i = 0;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(str2, String.valueOf(i)).appendQueryParameter("owner_id", Comment.getAuthorUid(comment)).appendQueryParameter("report_type", "comment");
        appendQueryParameter2.appendQueryParameter("locale", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage());
        if (!TextUtils.isEmpty(str)) {
            appendQueryParameter2.appendQueryParameter("video_owner_id", str);
        }
        C27013a.m65227a().report(activity, appendQueryParameter2);
    }

    public void startUserProfileActivity(Context context, String str, String str2, String str3) {
        UserProfileActivity.m89408a(context, str, str2, str3);
    }

    public void logDetailAdMaskClickReplay(Context context, String str, String str2, String str3) {
        C26088l.m63326b(context, "replay", str, str2, str3);
    }

    public void report(Activity activity, Aweme aweme, String str, String str2) {
        C27013a.m65227a().reportAweme(activity, aweme, str, str2);
    }

    public void sendAdLog(Context context, Aweme aweme, String str, String str2) {
        C26077e.m63190a().mo53590b(aweme).mo53582a(str).mo53593b(str2).mo53586a(context);
    }

    public void startSummonFriendActivityForResult(Activity activity, String str, int i, int i2) {
        if (activity != null) {
            Intent intent = new Intent(activity, SummonFriendActivity.class);
            intent.putExtra("video_id", str);
            intent.putExtra("source", i);
            activity.startActivityForResult(intent, i2);
        }
    }

    public void commentReplyToIM(Context context, Comment comment, UrlModel urlModel, String str, int i, String str2, String str3) {
        C35467d dVar = new C35467d();
        dVar.f91135a = urlModel;
        dVar.f91142h = C33194e.m76261a(comment.getUser());
        dVar.f91137c = str;
        dVar.f91136b = comment.getCid();
        dVar.f91140f = i;
        dVar.f91138d = str2;
        dVar.f91139e = str3;
        String text = comment.getText();
        if (comment.getEmoji() != null) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(context.getString(R.string.ax2));
            sb.append("]");
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(text)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(text);
                sb3.append(sb2);
                sb2 = sb3.toString();
            }
            text = sb2;
        }
        dVar.f91141g = text;
        Dialog commentReply = C33194e.m76279d().commentReply(context, dVar);
        if (commentReply != null && (context instanceof MainActivity)) {
            TabChangeManager.m82396a((FragmentActivity) context).mo75612a((C23694h) new C33195f(new WeakReference(commentReply)));
        }
    }
}
