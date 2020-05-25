package com.p683ss.android.ugc.p2416c;

import android.content.Context;
import com.bytedance.debugbox.base.IDebugBoxService;
import com.p683ss.android.anywheredoor_api.IAnyWhereDoor;
import com.p683ss.android.ugc.aweme.C20845aa;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p683ss.android.ugc.aweme.comment.list.C25260i;
import com.p683ss.android.ugc.aweme.comment.services.C25281a;
import com.p683ss.android.ugc.aweme.comment.services.CommentService;
import com.p683ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p683ss.android.ugc.aweme.conan.IConanService;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31296a;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31778a;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31779b;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31780c;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p683ss.android.ugc.aweme.friends.service.IRecommendDependentService;
import com.p683ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.main.service.C36679a;
import com.p683ss.android.ugc.aweme.main.service.C36680b;
import com.p683ss.android.ugc.aweme.main.service.C36681c;
import com.p683ss.android.ugc.aweme.main.service.C36682d;
import com.p683ss.android.ugc.aweme.main.service.C36684f;
import com.p683ss.android.ugc.aweme.main.service.C36685g;
import com.p683ss.android.ugc.aweme.main.service.C36687h;
import com.p683ss.android.ugc.aweme.main.service.C36688i;
import com.p683ss.android.ugc.aweme.main.service.C36689j;
import com.p683ss.android.ugc.aweme.main.service.C36690k;
import com.p683ss.android.ugc.aweme.main.service.C36691l;
import com.p683ss.android.ugc.aweme.main.service.C36692m;
import com.p683ss.android.ugc.aweme.main.service.C36693n;
import com.p683ss.android.ugc.aweme.main.service.C36694o;
import com.p683ss.android.ugc.aweme.main.service.C36695p;
import com.p683ss.android.ugc.aweme.main.service.C36697r;
import com.p683ss.android.ugc.aweme.main.service.C36698s;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import com.p683ss.android.ugc.aweme.main.service.C36700u;
import com.p683ss.android.ugc.aweme.main.service.C36701v;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.p683ss.android.ugc.aweme.main.service.C36704y;
import com.p683ss.android.ugc.aweme.notice.api.C38027b;
import com.p683ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import com.p683ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import com.p683ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.I18nLogHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeDuetWithMovieHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.NoticeABService;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38029b;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38030c;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38031d;
import com.p683ss.android.ugc.aweme.notice.api.p2007c.C38045b;
import com.p683ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;
import com.p683ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;
import com.p683ss.android.ugc.aweme.p1632di.DaggerAppComponent;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.pay.service.IPayService;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38867f;
import com.p683ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.share.ShareDependService;
import com.p683ss.android.ugc.aweme.share.ShareExtService;
import com.p683ss.android.ugc.aweme.share.ShareService;
import com.p683ss.android.ugc.aweme.story.api.C46622b;
import com.p683ss.android.ugc.aweme.story.api.C46625c;
import com.p683ss.android.ugc.aweme.story.api.C46626d;
import com.p683ss.android.ugc.aweme.story.api.C46627e;
import com.p683ss.android.ugc.aweme.userservice.api.C47590b;
import com.p683ss.android.ugc.p2487h.C50078a;

/* renamed from: com.ss.android.ugc.c.c */
final class C48509c extends C48507a {
    C48509c() {
        this.f121950a.put(C48507a.m104944a(DaggerAppComponent.class), this);
    }

    /* renamed from: a */
    public final <T> T mo96007a(Object obj, Class<T> cls) {
        if (cls == DeepLinkReturnHelperService.class) {
            return ((DaggerAppComponent) obj).provideDeepLinkReturnHelperService();
        }
        if (cls == C36704y.class) {
            return ((DaggerAppComponent) obj).getWebViewTweakerService();
        }
        if (cls == C25260i.class) {
            return ((DaggerAppComponent) obj).provideICommentPostingManager();
        }
        if (cls == NoticeChallengePropertyUtil.class) {
            return ((DaggerAppComponent) obj).provideNoticeChallengePropertyUtil();
        }
        if (cls == IConanService.class) {
            return ((DaggerAppComponent) obj).provideIConanService();
        }
        if (cls == C38030c.class) {
            return ((DaggerAppComponent) obj).provideOldRedPointService();
        }
        if (cls == IDebugBoxService.class) {
            return ((DaggerAppComponent) obj).provideIDebugBoxService();
        }
        if (cls == C36695p.class) {
            return ((DaggerAppComponent) obj).getLiveProxyService();
        }
        if (cls == C36682d.class) {
            return ((DaggerAppComponent) obj).getApiNetworkServiceForAccount();
        }
        if (cls == IAwemeService.class) {
            return ((DaggerAppComponent) obj).provideIAwemeService();
        }
        if (cls == ShareExtService.class) {
            return ((DaggerAppComponent) obj).provideShareExtService();
        }
        if (cls == Context.class) {
            return ((DaggerAppComponent) obj).context();
        }
        if (cls == C36679a.class) {
            return ((DaggerAppComponent) obj).getAccountHelperService();
        }
        if (cls == IIapWalletProxy.class) {
            return ((DaggerAppComponent) obj).provideIIapWalletProxy();
        }
        if (cls == IWalletService.class) {
            return ((DaggerAppComponent) obj).provideIWalletService();
        }
        if (cls == SchemaPageHelper.class) {
            return ((DaggerAppComponent) obj).provideSchemaPageHelper();
        }
        if (cls == C38031d.class) {
            return ((DaggerAppComponent) obj).provideRedPointService();
        }
        if (cls == IRequestIdService.class) {
            return ((DaggerAppComponent) obj).provideIRequestIdService();
        }
        if (cls == C36692m.class) {
            return ((DaggerAppComponent) obj).getI18nService();
        }
        if (cls == ShareService.class) {
            return ((DaggerAppComponent) obj).provideShareService();
        }
        if (cls == IRecommendDependentService.class) {
            return ((DaggerAppComponent) obj).provideIRecommendDependentService();
        }
        if (cls == C36685g.class) {
            return ((DaggerAppComponent) obj).getChallengeService();
        }
        if (cls == IBridgeService.class) {
            return ((DaggerAppComponent) obj).getBridgeService();
        }
        if (cls == I18nLogHelper.class) {
            return ((DaggerAppComponent) obj).provideI18nLogHelper();
        }
        if (cls == ICommerceService.class) {
            return ((DaggerAppComponent) obj).provideICommerceService();
        }
        if (cls == C47590b.class) {
            return ((DaggerAppComponent) obj).provideIUserService();
        }
        if (cls == CommentService.class) {
            return ((DaggerAppComponent) obj).provideCommentService();
        }
        if (cls == C36684f.class) {
            return ((DaggerAppComponent) obj).getCaptchaService();
        }
        if (cls == LogHelper.class) {
            return ((DaggerAppComponent) obj).provideLogHelper();
        }
        if (cls == IBulletService.class) {
            return ((DaggerAppComponent) obj).provideIBulletService();
        }
        if (cls == C31296a.class) {
            return ((DaggerAppComponent) obj).getRuntimeBehaviorService();
        }
        if (cls == C50078a.class) {
            return ((DaggerAppComponent) obj).providePlugin();
        }
        if (cls == IIMService.class) {
            return ((DaggerAppComponent) obj).provideIIMService();
        }
        if (cls == C38027b.class) {
            return ((DaggerAppComponent) obj).provideLivePushService();
        }
        if (cls == IMainServiceHelper.class) {
            return ((DaggerAppComponent) obj).provideIMainServiceHelper();
        }
        if (cls == NoticeABService.class) {
            return ((DaggerAppComponent) obj).provideNoticeABService();
        }
        if (cls == C36701v.class) {
            return ((DaggerAppComponent) obj).getInviteUseListService();
        }
        if (cls == FollowFeedLogHelper.class) {
            return ((DaggerAppComponent) obj).provideFollowFeedLogHelper();
        }
        if (cls == C36694o.class) {
            return ((DaggerAppComponent) obj).getLanguageService();
        }
        if (cls == IFriendsService.class) {
            return ((DaggerAppComponent) obj).provideIFriendsService();
        }
        if (cls == C25281a.class) {
            return ((DaggerAppComponent) obj).provideCommentDependService();
        }
        if (cls == C36687h.class) {
            return ((DaggerAppComponent) obj).getCommerceService();
        }
        if (cls == C31778a.class) {
            return ((DaggerAppComponent) obj).provideFlowFeedCommentService();
        }
        if (cls == C36698s.class) {
            return ((DaggerAppComponent) obj).getPushLaunchPageAssistantService();
        }
        if (cls == C36693n.class) {
            return ((DaggerAppComponent) obj).getInteractStickerService();
        }
        if (cls == IExternalService.class) {
            return ((DaggerAppComponent) obj).getAVServiceImpl();
        }
        if (cls == ShareDependService.class) {
            return ((DaggerAppComponent) obj).provideShareDependService();
        }
        if (cls == C20845aa.class) {
            return ((DaggerAppComponent) obj).provideDetailFeedService();
        }
        if (cls == NoticeLiveServiceAdapter.class) {
            return ((DaggerAppComponent) obj).provideNoticeLiveServiceAdapter();
        }
        if (cls == NoticeCommentHelperService.class) {
            return ((DaggerAppComponent) obj).provideNoticeCommentHelperService();
        }
        if (cls == C38029b.class) {
            return ((DaggerAppComponent) obj).provideNoticeCountService();
        }
        if (cls == C46626d.class) {
            return ((DaggerAppComponent) obj).getSettingService();
        }
        if (cls == NoticeCaptchaHelper.class) {
            return ((DaggerAppComponent) obj).provideNoticeCaptchaHelper();
        }
        if (cls == C36681c.class) {
            return ((DaggerAppComponent) obj).getAntiSpamService();
        }
        if (cls == C36691l.class) {
            return ((DaggerAppComponent) obj).getFeed0VVManagerService();
        }
        if (cls == C46625c.class) {
            return ((DaggerAppComponent) obj).getReportService();
        }
        if (cls == C46627e.class) {
            return ((DaggerAppComponent) obj).getStoryDownloadService();
        }
        if (cls == C31780c.class) {
            return ((DaggerAppComponent) obj).provideFlowFeedItemInteractService();
        }
        if (cls == C36703x.class) {
            return ((DaggerAppComponent) obj).getWebviewService();
        }
        if (cls == C36680b.class) {
            return ((DaggerAppComponent) obj).getUserInfoUpadteAdapterService();
        }
        if (cls == C36688i.class) {
            return ((DaggerAppComponent) obj).getCurrentContextService();
        }
        if (cls == IPayService.class) {
            return ((DaggerAppComponent) obj).provideIPayService();
        }
        if (cls == C38867f.class) {
            return ((DaggerAppComponent) obj).getPlayerService();
        }
        if (cls == ILiveHostOuterService.class) {
            return ((DaggerAppComponent) obj).provideILiveHostOuterService();
        }
        if (cls == C36700u.class) {
            return ((DaggerAppComponent) obj).getShotService();
        }
        if (cls == IUserService.class) {
            return ((DaggerAppComponent) obj).getBaseUserService();
        }
        if (cls == C36689j.class) {
            return ((DaggerAppComponent) obj).getDeleteAccountService();
        }
        if (cls == IWalletMainProxy.class) {
            return ((DaggerAppComponent) obj).provideIWalletMainProxy();
        }
        if (cls == NoticeLiveWatcherUtil.class) {
            return ((DaggerAppComponent) obj).provideNoticeLiveWatcherUtil();
        }
        if (cls == C36697r.class) {
            return ((DaggerAppComponent) obj).getPoiMainService();
        }
        if (cls == C31779b.class) {
            return ((DaggerAppComponent) obj).provideFlowFeedCommonService();
        }
        if (cls == C36699t.class) {
            return ((DaggerAppComponent) obj).getRegionService();
        }
        if (cls == NoticeDuetWithMovieHelper.class) {
            return ((DaggerAppComponent) obj).provideNoticeDuetWithMovieHelper();
        }
        if (cls == C36690k.class) {
            return ((DaggerAppComponent) obj).getDownloadService();
        }
        if (cls == C38045b.class) {
            return ((DaggerAppComponent) obj).provideNoticeListService();
        }
        if (cls == NotificationClickHelper.class) {
            return ((DaggerAppComponent) obj).provideNotificationClickHelper();
        }
        if (cls == ILiveOuterService.class) {
            return ((DaggerAppComponent) obj).provideILiveOuterService();
        }
        if (cls == C46622b.class) {
            return ((DaggerAppComponent) obj).getDuoshanService();
        }
        if (cls == WSHelper.class) {
            return ((DaggerAppComponent) obj).provideWSHelper();
        }
        if (cls == IAnyWhereDoor.class) {
            return ((DaggerAppComponent) obj).getAnyWhereDoorService();
        }
        return null;
    }
}
