package com.p683ss.android.ugc.aweme.main;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.content.C0732g;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p043v7.app.C1160b;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.Toast;
import com.aweme.storage.C2553c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p666b.C10657o.C10658a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.ugc.p694a.C11016e.C11018b;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.bytedance.p126ad.symphony.p131c.C2713g;
import com.bytedance.polaris.p821a.C12559e;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p822b.C12571a;
import com.bytedance.router.SmartRouter;
import com.google.gson.C17971f;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.p1103ad.splash.C18769p;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.p1159di.push.C19073a;
import com.p683ss.android.p1192ml.C19500e;
import com.p683ss.android.ugc.aweme.C27985v;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.experiment.C20966a;
import com.p683ss.android.ugc.aweme.account.task.CookieMonitorTask;
import com.p683ss.android.ugc.aweme.account.util.C22267i;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.p1354b.C22691a;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23111k;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.ChannelUploadHelper;
import com.p683ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23086a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.audio.AudioUtils;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1411c.C23483b;
import com.p683ss.android.ugc.aweme.base.p1411c.C23486e;
import com.p683ss.android.ugc.aweme.base.p1411c.C23487f;
import com.p683ss.android.ugc.aweme.base.p1411c.C23488g;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m.C23700a;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager.C23638a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23726m;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.abtest.AdFixFeedScrollRightSetting;
import com.p683ss.android.ugc.aweme.commercialize.abtest.AwesomeSplashCidColdStartUploadExperiment;
import com.p683ss.android.ugc.aweme.commercialize.abtest.SymphonySdkEnableExperiment;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26224g;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26245m;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26247o;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26252s;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26237e;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26244k;
import com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26369ac;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26426bk;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26443bw;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26445bx;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26855c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.compliance.C27012a;
import com.p683ss.android.ugc.aweme.compliance.business.api.model.AppealStatusResponse;
import com.p683ss.android.ugc.aweme.compliance.business.api.p1601a.C27019b;
import com.p683ss.android.ugc.aweme.compliance.business.api.p1602b.C27020a;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.C27021a;
import com.p683ss.android.ugc.aweme.compliance.termspp.C27086b;
import com.p683ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog;
import com.p683ss.android.ugc.aweme.discover.p1659ui.HotSearchAndDiscoveryFragment2;
import com.p683ss.android.ugc.aweme.dynamicfeature.DfDummyInitTask;
import com.p683ss.android.ugc.aweme.experiment.BackRefreshExperiment;
import com.p683ss.android.ugc.aweme.experiment.OnlineCoverageExperiment;
import com.p683ss.android.ugc.aweme.experiment.UserProfileInitMethodExperiment;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.adapter.C30056b;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.feed.experiment.DefaultFeedExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a.C30515a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30310ab;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30311ac;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30315ag;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30322am;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30323an;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30338g;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30750af;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31143x;
import com.p683ss.android.ugc.aweme.feed.p1736ui.DisLikeAwemeLayout;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31050i;
import com.p683ss.android.ugc.aweme.feed.panel.C30603ak;
import com.p683ss.android.ugc.aweme.feed.utils.C31186b;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.feedback.C31271e;
import com.p683ss.android.ugc.aweme.feedback.C31273f;
import com.p683ss.android.ugc.aweme.feedback.FeedbackActivity;
import com.p683ss.android.ugc.aweme.feedback.reply.C31291a;
import com.p683ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi.C31290a;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendFriendActivity;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.homepage.C32961a;
import com.p683ss.android.ugc.aweme.homepage.C32961a.C32962a;
import com.p683ss.android.ugc.aweme.homepage.C32961a.C32963b;
import com.p683ss.android.ugc.aweme.homepage.NewsCountPresenter;
import com.p683ss.android.ugc.aweme.homepage.NewsCountPresenter.MsgCountBroadcastReceiver;
import com.p683ss.android.ugc.aweme.homepage.api.data.C32968a;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C32964a;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32974c;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32977f;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a;
import com.p683ss.android.ugc.aweme.homepage.business.C32980a;
import com.p683ss.android.ugc.aweme.homepage.business.HomeToastTask;
import com.p683ss.android.ugc.aweme.homepage.experiment.MainUseFragmentsCacheExperiment;
import com.p683ss.android.ugc.aweme.homepage.experiment.ShowLoginDialogWhenClickPublishTabExperiment;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a.C32983a;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a.C32984b;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a.C32985c;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a.C32986d;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a.C32988e;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a.C32989f;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a.C32990g;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a.C32991h;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32982a.C32992i;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.X2CActivityMain;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.X2CFragmentMain;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.X2CFragmentMainPage;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.p1802a.C32994b;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.p1802a.C32995c;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33115h;
import com.p683ss.android.ugc.aweme.journey.C35781s;
import com.p683ss.android.ugc.aweme.journey.NewUserJourneyActivity.C35715a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lancet.C18993n;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35858a;
import com.p683ss.android.ugc.aweme.lego.inflate.SwipUpGuideInflate;
import com.p683ss.android.ugc.aweme.lego.p1914b.C35884a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CFragmentFeed;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p683ss.android.ugc.aweme.legoImp.service.MainLooperOptService.C35922a;
import com.p683ss.android.ugc.aweme.legoImp.task.C35999r;
import com.p683ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.p683ss.android.ugc.aweme.legoImp.task.LegoRequestTask;
import com.p683ss.android.ugc.aweme.legoImp.task.OptFirstFrameTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PolarisInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.login.C27967h;
import com.p683ss.android.ugc.aweme.login.larksso.LarkSsoHelper.C36302d;
import com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.p683ss.android.ugc.aweme.main.experiment.ReleaseWindowBackgroundExperiment;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabSwitchExperiment;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.main.p1937a.C36484a.C36485a;
import com.p683ss.android.ugc.aweme.main.p1942e.C36620c;
import com.p683ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p683ss.android.ugc.aweme.miniapp.utils.C36917d;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.mobile.p1965a.C37136b.C37137a;
import com.p683ss.android.ugc.aweme.money.growth.C37170f.C37171a;
import com.p683ss.android.ugc.aweme.net.p1993f.C37772b;
import com.p683ss.android.ugc.aweme.net.p1993f.C37772b.C37774a;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.FriendTabFragment;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.opensdk.share.C38525e;
import com.p683ss.android.ugc.aweme.opensdk.share.p2041a.C38516a;
import com.p683ss.android.ugc.aweme.opensdk.share.p2041a.C38516a.C38519a;
import com.p683ss.android.ugc.aweme.opensdk.share.share.C38526a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1335aj.C22548a;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.p1382aq.C23229c;
import com.p683ss.android.ugc.aweme.p1382aq.C23251u;
import com.p683ss.android.ugc.aweme.p1382aq.C23255y;
import com.p683ss.android.ugc.aweme.p1386ar.C23261d;
import com.p683ss.android.ugc.aweme.p1397az.p1400c.C23338a;
import com.p683ss.android.ugc.aweme.p1402b.C23345c;
import com.p683ss.android.ugc.aweme.p1402b.C23346d;
import com.p683ss.android.ugc.aweme.p1402b.C23349f;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p1440bm.C23861a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1807im.disableim.C33193d;
import com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16InitTask;
import com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger;
import com.p683ss.android.ugc.aweme.p1963ml.C37105d;
import com.p683ss.android.ugc.aweme.p1963ml.C37109g;
import com.p683ss.android.ugc.aweme.p1963ml.C37115l;
import com.p683ss.android.ugc.aweme.p2377ug.amplify.C47425a;
import com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47423f;
import com.p683ss.android.ugc.aweme.p2377ug.referral.C47486a;
import com.p683ss.android.ugc.aweme.p2377ug.referral.C47490d;
import com.p683ss.android.ugc.aweme.p2377ug.settings.UgcNeedPopupSetting;
import com.p683ss.android.ugc.aweme.pendant.C38588b;
import com.p683ss.android.ugc.aweme.player.C38851d;
import com.p683ss.android.ugc.aweme.player.C38851d.C38853b;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbBackgroundReleaseCodecCountdownDurationExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbBackgroundReleaseCodecEnableExp;
import com.p683ss.android.ugc.aweme.policy.C39498b;
import com.p683ss.android.ugc.aweme.policy.C39500c;
import com.p683ss.android.ugc.aweme.policy.notice.api.C39507b;
import com.p683ss.android.ugc.aweme.policy.notice.p2079a.C39503a;
import com.p683ss.android.ugc.aweme.policy.notice.p2080b.C39509a;
import com.p683ss.android.ugc.aweme.policy.notice.p2080b.C39509a.C39510a;
import com.p683ss.android.ugc.aweme.policy.notice.p2081ui.C39516a;
import com.p683ss.android.ugc.aweme.policy.notice.p2081ui.C39516a.C39518b;
import com.p683ss.android.ugc.aweme.policy.notice.p2081ui.C39516a.C39519c;
import com.p683ss.android.ugc.aweme.policy.notice.p2081ui.C39516a.C39520d;
import com.p683ss.android.ugc.aweme.policy.notice.p2081ui.C39516a.C39521e;
import com.p683ss.android.ugc.aweme.policy.notice.p2081ui.C39516a.C39522f;
import com.p683ss.android.ugc.aweme.policy.notice.p2081ui.C39516a.C39523g;
import com.p683ss.android.ugc.aweme.port.internal.C39663l;
import com.p683ss.android.ugc.aweme.port.internal.ServiceConnectionImpl;
import com.p683ss.android.ugc.aweme.profile.C39713a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40205b;
import com.p683ss.android.ugc.aweme.promote.C40741c;
import com.p683ss.android.ugc.aweme.promote.PromoteProgramDialog;
import com.p683ss.android.ugc.aweme.protection.C40861b;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a;
import com.p683ss.android.ugc.aweme.push.C40906h;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.push.downgrade.C40893b;
import com.p683ss.android.ugc.aweme.push.downgrade.C40896e;
import com.p683ss.android.ugc.aweme.recommend.RecommendUserDialogTask;
import com.p683ss.android.ugc.aweme.report.p2113a.C41202a.C41204a;
import com.p683ss.android.ugc.aweme.requesttask.background.PreCreatePlayerTask;
import com.p683ss.android.ugc.aweme.requesttask.idle.AVCameraInitManager;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41250b;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41254d;
import com.p683ss.android.ugc.aweme.requesttask.idle.FetchImUnder16RequestTask;
import com.p683ss.android.ugc.aweme.requesttask.idle.ReportActivityStatusTask;
import com.p683ss.android.ugc.aweme.requesttask.p2117b.C41243a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.publish.Publish;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService.OnPublishCallback;
import com.p683ss.android.ugc.aweme.setting.C41522ac;
import com.p683ss.android.ugc.aweme.setting.C41528ai;
import com.p683ss.android.ugc.aweme.setting.C41528ai.C41529a;
import com.p683ss.android.ugc.aweme.setting.C41534aj;
import com.p683ss.android.ugc.aweme.setting.C41556av;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.C41623i;
import com.p683ss.android.ugc.aweme.setting.PopupSettingManager;
import com.p683ss.android.ugc.aweme.setting.RegisterStorageTask;
import com.p683ss.android.ugc.aweme.setting.experiment.ClearRedPointCostExperiment;
import com.p683ss.android.ugc.aweme.setting.p2132ab.InAppPushLiveExperiment;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41598d;
import com.p683ss.android.ugc.aweme.setting.personalization.p2143a.C41666a;
import com.p683ss.android.ugc.aweme.setting.personalization.p2144b.C41667a;
import com.p683ss.android.ugc.aweme.share.C41941ab;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.shortvideo.C42424ao;
import com.p683ss.android.ugc.aweme.shortvideo.StopVideoPlayerWhenClickPlusIcon;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.splash.SplashActivity;
import com.p683ss.android.ugc.aweme.splash.SplashAdActivity;
import com.p683ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import com.p683ss.android.ugc.aweme.story.model.C46656b;
import com.p683ss.android.ugc.aweme.tile.TileTask;
import com.p683ss.android.ugc.aweme.user.p2384e.C47574a;
import com.p683ss.android.ugc.aweme.util.C47611a;
import com.p683ss.android.ugc.aweme.util.C47614b;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.util.C47626j;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.p683ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47818dm;
import com.p683ss.android.ugc.aweme.utils.C47835dx;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.utils.C47848eg;
import com.p683ss.android.ugc.aweme.utils.C47854el;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.p683ss.android.ugc.aweme.utils.C47893fn;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.p683ss.android.ugc.aweme.video.C47981ac;
import com.p683ss.android.ugc.aweme.video.C47990aj;
import com.p683ss.android.ugc.aweme.video.C48114q;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.bitrate.C47997a;
import com.p683ss.android.ugc.aweme.video.experiment.RecordLastNetworkSpeedExperiment;
import com.p683ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.awemepushapi.AccountExperiment;
import com.p683ss.android.ugc.bytex.coverage_lib.CoverageHandler;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.p683ss.android.ugc.trill.language.C50350i;
import com.p683ss.android.ugc.trill.language.C50350i.C50351a;
import com.p683ss.android.ugc.trill.p2514a.C50293a;
import com.p683ss.android.ugc.trill.receiver.HomeWatcherReceiver;
import com.p683ss.android.ugc.trill.share.base.ShareCacheRegisterTask;
import com.p683ss.bytedance.ies.net.cronet.ttregion.TTRegionTestApi;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ugc.aweme.performance.p2586a.C51521b.C51522a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p089g.C2147b;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.main.MainActivity */
public class MainActivity extends AmeSSActivity implements C11018b, C23346d, C30603ak, C36485a, C36663h, C41522ac {
    public static final String IS_UPLOAD_PRE_INFO = "is_upload_pre_info";
    private static final int REQUEST_BAN_USER_FEEDBACK = 17;
    private static final int REQUEST_GALLERY_CODE = 16;
    public static final int REQUEST_WELCOME_SCREEN_DEEPLINK = 18;
    private static final String TAG = "MainActivity";
    public static boolean appsFlyerisInit;
    private static boolean mNeedCallShowPersonalizationDialogIfNeeded;
    private static boolean mNeedCallShowPrivacySettingActivityIfNeeded;
    private static boolean mNeedCallShowTermsConsentDialogIfNeeded;
    private static boolean mNeedCallShowUnder16DialogIfNeeded;
    private C25908e adViewController = new C25908e();
    private AtomicBoolean appeal = new AtomicBoolean(false);
    private C23345c asyncInflater;
    private boolean checkPrivacyPolicy;
    private boolean firstCreated;
    private boolean hasFirstRefresh = false;
    public HomePageDataViewModel homeViewModel;
    private HomeWatcherReceiver homeWatcherReceiver;
    boolean isFirstLaunch = false;
    private boolean isPaused = true;
    private boolean isPushReceiverRegisted;
    private boolean isWatchReceiverRegisted;
    private AtomicBoolean lazyDoItCalled = new AtomicBoolean(false);
    private List<Runnable> lazySequence = new ArrayList();
    private boolean lazySequenceCleaned = false;
    private Dialog mAccountBanedDialog;
    private List<C23422a> mActivityOnKeyDownListeners;
    C32961a mActivityProxy = new C32961a();
    private C23699m mAdapter;
    private C27020a mAppealDialogHelper = null;
    public View mAwesomeSplashMask = null;
    private int mAwesomeSplashStatus = 4;
    private C23261d mBatteryMonitor = new C23261d();
    private C44371e mBinder;
    private C27985v mBroadCastRegister;
    protected DataCenter mDataCenter;
    private C42245a mDialogShowingManager;
    DisLikeAwemeLayout mDisLikeAwemeLayout;
    private String mEventType = "homepage_hot";
    private long mFirstClickPublish;
    private Handler mHandler = new Handler();
    private boolean mIsFirstVisible = true;
    private C36543bx mMainHelper;
    private C39498b mPolicyManager;
    private CustomActionPushReceiver mPushReceiver;
    private boolean mRestartFromLogout = false;
    private boolean mResumed = false;
    private C36636ed mScrollSwitchHelper;
    private boolean mShowAgeGate = false;
    private C26247o mSplashLoadMaskHelper = new C26247o(this);
    private boolean mThemeRestored = false;
    ScrollableViewPager mViewPager;
    private final C36545bz mainLifecycleRegistryWrapper = new C36545bz(this);
    private OnPublishCallback processedCallback = new OnPublishCallback() {
        public final void onStopPublish() {
        }

        public final void onStartPublish() {
            MainActivity mainActivity = MainActivity.this;
            C52711k.m112240b(mainActivity, "activity");
            if (!mainActivity.isFinishing()) {
                C47425a.f119653a = new WeakReference<>(mainActivity);
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                if (g.isLogin() && UgcNeedPopupSetting.INSTANCE.needRequestShowUgcPopupApi()) {
                    PopupSettingManager.m91328a().mo85286a(C47425a.f119654b, 3);
                }
            }
            if (!C31357a.m73095a()) {
                MainActivity mainActivity2 = MainActivity.this;
                if (mainActivity2 != null && !mainActivity2.isFinishing() && C20902b.m53242a().isLogin()) {
                    if (C40741c.f103790a != null) {
                        C40741c.f103790a.dismiss();
                        C40741c.f103790a = null;
                    }
                    Boolean bool = (Boolean) SharePrefCache.inst().getPromoteDialogShouldShow().mo47782d();
                    boolean z = false;
                    if (bool != null && bool.booleanValue()) {
                        String string = C40741c.m90140a().getString("uid", "");
                        String curUserId = C20902b.m53242a().getCurUserId();
                        if (TextUtils.isEmpty(string)) {
                            Editor edit = C40741c.m90140a().edit();
                            edit.putString("uid", curUserId);
                            edit.apply();
                            string = curUserId;
                        }
                        if (!string.equals(curUserId)) {
                            Editor edit2 = C40741c.m90140a().edit();
                            edit2.putBoolean("joined", false);
                            edit2.putString("uid", curUserId);
                            edit2.putInt("popup_times", 0);
                            edit2.putLong("popup_last_time", 0);
                            edit2.apply();
                        }
                        if (!C40741c.m90140a().getBoolean("joined", false)) {
                            int i = C40741c.m90140a().getInt("popup_times", 0);
                            long j = C40741c.m90140a().getLong("popup_last_time", 0);
                            Integer num = (Integer) SharePrefCache.inst().getPromoteDialogPopupPopupInterval().mo47782d();
                            if (i < ((Integer) SharePrefCache.inst().getPromoteDialogPopupTimesLimit().mo47782d()).intValue() && System.currentTimeMillis() - j > ((long) (num.intValue() * 1000 * 3600 * 24))) {
                                Editor edit3 = C40741c.m90140a().edit();
                                edit3.putInt("popup_times", i + 1);
                                edit3.putLong("popup_last_time", System.currentTimeMillis());
                                edit3.apply();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        PromoteProgramDialog promoteProgramDialog = new PromoteProgramDialog(mainActivity2, "", (int) C9432q.m18687b(C11010c.m22280a(), 52.0f));
                        C40741c.f103790a = promoteProgramDialog;
                        promoteProgramDialog.setOnDismissListener(new OnDismissListener() {
                            public final void onDismiss(DialogInterface dialogInterface) {
                                SharePrefCache.inst().getShowPromoteLicense().mo47776a(Integer.valueOf(0));
                                C40741c.f103790a = null;
                            }
                        });
                        C26890h.m65011a("creative_permission_show", C23089d.m56640a().f61491a);
                        C40741c.f103790a.show();
                        PromoteProgramDialog promoteProgramDialog2 = C40741c.f103790a;
                    }
                }
            }
        }
    };
    private C32994b scrollBasicChecker = new C32994b(this);
    private C32995c scrollFullChecker = new C32995c(this, this.scrollBasicChecker);
    private boolean showToast = false;
    private ScrollSwitchStateManager stateManager;
    private AtomicBoolean userLogicDelete = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.main.MainActivity$a */
    static class C36459a implements Runnable {
        private C36459a() {
        }

        public final void run() {
            if (C20902b.m53242a().isLogin() && SharePrefCache.inst().getIsContactsUploaded() != null && ((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo47782d()).booleanValue()) {
                C47574a.m103026a(C47574a.m103025a().f120026a, 115);
            }
        }
    }

    private FragmentActivity getActivity() {
        return this;
    }

    static final /* synthetic */ void lambda$onDestroy$7$MainActivity() {
    }

    static final /* synthetic */ void lambda$setupEagleEyeAndDownloaderManager$6$MainActivity() {
    }

    private void setAdScrollRightControl() {
        setI18nAdScrollRightControl();
    }

    public void changeTabToFollowAfterPublish(boolean z) {
    }

    public boolean enableInitHook() {
        return false;
    }

    public C44371e getBinder() {
        return this.mBinder;
    }

    public C36670n getHelper() {
        return this.mScrollSwitchHelper;
    }

    public C0176h getLifecycle() {
        return this.mainLifecycleRegistryWrapper;
    }

    public C36543bx getMainHelper() {
        return this.mMainHelper;
    }

    public OnPublishCallback getProcessedCallback() {
        return this.processedCallback;
    }

    public View getVisionSearchRect() {
        return null;
    }

    public boolean hasRegistedResumeAction() {
        return false;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public boolean isUnderFamiliarTab() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$handleSwitchAccount$20$MainActivity() {
        ImUnder16Manger.m76248a(this);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onEvent$2$MainActivity() {
        ImUnder16Manger.m76248a(this);
    }

    public void onPostResume() {
        super.onPostResume();
    }

    private void setupEagleEyeAndDownloaderManager() {
        maybeAddLazySequence(C36503ar.f93574a);
    }

    public boolean isInDiscoveryPage() {
        return isUnderSecondTab();
    }

    private void changeTabToFollowAfterPublish() {
        this.mDataCenter.mo48228a("changeTabToFollowAfterPublish", (Object) null);
    }

    private void checkJiraPermission() {
        if (C47626j.m103108b()) {
            C47626j.m103105a().mo22736a((Activity) this);
        }
    }

    private void createMainHelper() {
        this.mMainHelper = new C36543bx(this);
        this.mMainHelper.mo75621c();
    }

    private void ensureLazyDoItFinallyCalled() {
        C18842a.m45933a(new C36504as(this), 10000);
    }

    private void hotStartIntercept() {
        if (isHotStart()) {
            C41556av.m91389a().mo85341b();
        }
    }

    private void initDislikeView() {
        this.mDisLikeAwemeLayout.setListener(new C31050i() {
            /* renamed from: a */
            public final void mo55955a(boolean z) {
                MainActivity.this.exitDislikeMode();
            }
        });
    }

    private void onStartUp() {
        if (this.homeViewModel != null) {
            Lock lock = this.homeViewModel.f85649c;
            if (lock != null) {
                try {
                    lock.unlock();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C30016ag getCurrentViewHolder() {
        C30753ai currentFeedRecommendFragment = getCurrentFeedRecommendFragment();
        if (currentFeedRecommendFragment == null) {
            return null;
        }
        return currentFeedRecommendFragment.mo63456o();
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        return super.getResources();
    }

    public TabChangeManager getTabChangeManager() {
        return TabChangeManager.m82396a(getActivity());
    }

    public boolean isInMaskLayer() {
        if (this.mDisLikeAwemeLayout == null || !this.mDisLikeAwemeLayout.f80368m) {
            return false;
        }
        return true;
    }

    public boolean isUnderMainTab() {
        return "HOME".equals(getTabChangeManager().f93538c);
    }

    public boolean isUnderNearbyTab() {
        return "NEARBY".equals(getTabChangeManager().f93538c);
    }

    public boolean isUnderProfileTab() {
        return "USER".equals(getTabChangeManager().f93538c);
    }

    public boolean isUnderSecondTab() {
        return "DISCOVER".equals(getTabChangeManager().f93538c);
    }

    public boolean isUnderThirdTab() {
        return "NOTIFICATION".equals(getTabChangeManager().f93538c);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$showAgeGate$1$MainActivity() {
        this.mShowAgeGate = false;
        C40869c.f104034c = true;
        callAllDialogs(false);
    }

    private void addLegoRequestTask() {
        C35857a.m81001b().mo74526a(new LegoRequestTask()).mo74527a();
    }

    /* access modifiers changed from: private */
    /* renamed from: callLazyDoIt */
    public void bridge$lambda$1$MainActivity() {
        if (this.lazyDoItCalled.compareAndSet(false, true)) {
            C0013i.m12a(1800).mo24b(new C36754y(this), C24076h.m58904e());
            lazyDoItMainThread();
        }
    }

    private void cleanEffects() {
        C35857a.m81001b().mo74526a(new CleanEffectsTask()).mo74527a();
    }

    private void feedOVVMainActivityCreate() {
        if (C30578o.m71565a().booleanValue()) {
            C30436k.f79561e = SystemClock.elapsedRealtime();
            C23727n.m58239a(new Runnable() {
                public final void run() {
                    if (C30436k.m71376g() != null && C30436k.m71376g().booleanValue()) {
                        C30436k.f79560d = true;
                        if (C30436k.f79557a == null) {
                            C30436k.m71366a("no_request");
                            C30436k.m71370b("no_request", "");
                        } else if (C30436k.m71372c()) {
                            C30436k.m71366a("no_repsonse");
                            C23566n.m57766a().mo48750a(new C30443c(), new Callable() {
                                public final Object call() throws Exception {
                                    return C30436k.m71373d();
                                }
                            }, 0);
                        } else if (!C30436k.f79557a.booleanValue()) {
                            C30436k.m71366a("valid_response");
                        } else {
                            C30436k.m71366a("exception");
                        }
                    }
                }
            }, 8000);
        }
    }

    private void getAppealStatus() {
        try {
            C27021a.f71325a.getBanAppealService().mo55251a(C20854a.m53167g().getCurUserId(), (C0011g<AppealStatusResponse, Void>) new C36491af<AppealStatusResponse,Void>(this));
        } catch (Exception unused) {
            this.appeal.set(false);
        }
    }

    private void handleMainPageResume() {
        Fragment a = getTabChangeManager().mo75609a();
        if (a != null && (a instanceof MainFragment)) {
            ((MainFragment) a).mo75502c(true);
        }
    }

    private void initMLModel() {
        C19500e.f53847a = new C37109g();
        C37105d.m83336a().f94754a.mo40670f();
        C37115l.m83346a().f94762a.mo40670f();
    }

    private void larksso() {
        C52711k.m112240b(this, "context");
        new Handler().postDelayed(new C36302d(this), TimeUnit.SECONDS.toMillis(1));
    }

    private void pushAuthorityMonitor() {
        if (C47818dm.m103457a(this)) {
            C23131p.m57776a("aweme_push_authority_rate", 0, (JSONObject) null);
        } else {
            C23131p.m57776a("aweme_push_authority_rate", 1, (JSONObject) null);
        }
    }

    private void showAgeGate() {
        this.mShowAgeGate = C20854a.m53164d().showFTCAgeGateForCurrentUser(this, new C36677s(this), C40869c.f104035d.mo83208i());
        C20854a.m53164d().syncAgeGateInfo();
    }

    private void showTermsConsentDialog() {
        if (!isFinishing()) {
            C52711k.m112240b(this, "context");
            startActivity(new Intent(this, TermsConsentDialog.class));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startAppsFlyerTrack */
    public void bridge$lambda$2$MainActivity() {
        if (!appsFlyerisInit) {
            try {
                appsFlyerisInit = true;
                C0013i.m16a(C47614b.f120083a);
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    private boolean tryShowGuideView() {
        C23689d d = this.stateManager.mo69873d("page_feed");
        if (!(d instanceof MainPageFragment)) {
            return false;
        }
        MainPageFragment mainPageFragment = (MainPageFragment) d;
        if (mainPageFragment.f93510s != null) {
            mainPageFragment.f93510s.mo48228a("lastTryShowGuideViewResult", (Object) Boolean.valueOf(false));
        }
        return false;
    }

    public Fragment getCurFragment() {
        if (getTabChangeManager() == null) {
            return null;
        }
        return getTabChangeManager().mo75609a();
    }

    public C30753ai getCurrentFeedRecommendFragment() {
        Fragment curFragment = getCurFragment();
        if (curFragment instanceof MainFragment) {
            C30750af k = ((MainFragment) curFragment).mo75499c();
            if (k instanceof C30753ai) {
                return (C30753ai) k;
            }
        }
        return null;
    }

    public C23345c getInflater() {
        if (this.asyncInflater == null) {
            if (UserProfileInitMethodExperiment.m69634a()) {
                this.asyncInflater = new C39713a(this, 2147483647L);
            } else {
                this.asyncInflater = new C23349f(this);
            }
        }
        return this.asyncInflater;
    }

    public boolean isMainTabVisible() {
        if (!isUnderMainTab() || this.mScrollSwitchHelper == null || !this.stateManager.mo69868b("page_feed")) {
            return false;
        }
        return true;
    }

    public void onFeedRecommendFragmentReady() {
        fitAwesomeSplash();
        C35857a.m81001b().mo74526a(new ReleaseWindowBackgroundTask(this)).mo74527a();
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, DynamicTabYellowPointVersion.DEFAULT);
        }
    }

    private void checkPrivacyPolicyVersion() {
        if (C20902b.m53242a().isLogin()) {
            if (this.mPolicyManager == null) {
                this.mPolicyManager = new C39498b(this);
            }
            C39498b bVar = this.mPolicyManager;
            if (bVar.f101047b != null) {
                C23566n.m57766a().mo48750a(bVar.f101046a, C39500c.f101049a, 0);
            }
        }
    }

    private void cleanLazySequence() {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            arrayList.addAll(this.lazySequence);
            this.lazySequence.clear();
            this.lazySequenceCleaned = true;
        }
        for (Runnable aaVar : arrayList) {
            C0013i.m18a((Callable<TResult>) new C36486aa<TResult>(aaVar), (Executor) C24076h.m58906g());
        }
    }

    private void feed0VVManagerOnResume() {
        if (C30436k.f79561e != -1) {
            C30436k.f79562f = SystemClock.elapsedRealtime() - C30436k.f79561e;
            C30436k.f79561e = -1;
            if (C30436k.f79566j != null) {
                for (Runnable a : C30436k.f79566j) {
                    C18842a.m45932a(a);
                }
                C30436k.f79566j.clear();
                C30436k.f79566j = null;
            }
        }
    }

    private void fitAwesomeSplash() {
        if (!C26426bk.m63900a(getIntent())) {
            restoreTheme(false);
        } else if (getCurFragment() != null) {
            C22574a.m55738f().mo46917a("cold_boot_aweme_splash_init", false);
            if (!showAwesomeSplash()) {
                restoreTheme(false);
                C26217c.m63502a().mo53865c();
                C26237e.m63579b().f69279f = null;
            }
            C22574a.m55738f().mo46921b("cold_boot_aweme_splash_init", false);
        }
    }

    private String handleIntent() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "HOME";
        }
        Bundle bundleExtra = intent.getBundleExtra("extra_splash_data");
        if (bundleExtra != null) {
            String string = bundleExtra.getString(SplashActivity.SPLASH_OPEN_URL_EXTRA);
            if (!TextUtils.isEmpty(string)) {
                C26445bx.m63936a(this, string);
            }
        }
        return stringExtra;
    }

    private boolean isHotStart() {
        Intent intent = getIntent();
        if (!isTaskRoot() || intent == null || !intent.hasCategory("android.intent.category.LAUNCHER") || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r3.adViewController.mo53246b() == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isOpenWebOrOpenUrlOrMpUrl() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r3.adViewController
            boolean r0 = r0.mo53244a()
            r1 = 0
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r3.adViewController
            boolean r0 = r0.mo53248d()
            if (r0 != 0) goto L_0x003e
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r3.adViewController
            boolean r0 = r0.mo53247c()
            if (r0 != 0) goto L_0x003c
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r3.adViewController
            com.ss.android.ugc.aweme.commercialize.feed.af r2 = r0.f68448c
            if (r2 != 0) goto L_0x0021
            r0 = 0
            goto L_0x0027
        L_0x0021:
            com.ss.android.ugc.aweme.commercialize.feed.af r0 = r0.f68448c
            boolean r0 = r0.hasMpUrl()
        L_0x0027:
            if (r0 != 0) goto L_0x003c
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r0 = r3.homeViewModel
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f85656j
            r2 = 3
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r0, r2)
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r3.adViewController
            boolean r0 = r0.mo53246b()
            if (r0 == 0) goto L_0x003e
        L_0x003c:
            r0 = 1
            return r0
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainActivity.isOpenWebOrOpenUrlOrMpUrl():boolean");
    }

    private void observePageActionForAD() {
        ScrollSwitchStateManager scrollSwitchStateManager = this.stateManager;
        C36501ap apVar = new C36501ap(this);
        C52711k.m112240b(this, "owner");
        C52711k.m112240b(apVar, "observer");
        scrollSwitchStateManager.f85670c.observe(this, apVar);
        this.stateManager.mo69872c(this, new C36502aq(this));
    }

    private void refreshWhenBack() {
        C23051bf isUseBackRefresh = SharePrefCache.inst().getIsUseBackRefresh();
        if (isUseBackRefresh != null && ((Boolean) isUseBackRefresh.mo47782d()).booleanValue() && getTabChangeManager().mo75609a() != null && (getTabChangeManager().mo75609a() instanceof MainFragment)) {
            ((MainFragment) getTabChangeManager().mo75609a()).mo75510j();
        }
    }

    private boolean shouldRecordWithSticker() {
        if (this.homeViewModel.f85656j == null || !this.homeViewModel.f85656j.hasStickerID() || !"HOME".equals(getTabChangeManager().f93538c)) {
            return false;
        }
        return true;
    }

    private boolean showAwesomeSplash() {
        if (C26224g.m63536a() && C26224g.m63537a(getCurrentFeedRecommendFragment())) {
            return true;
        }
        if (!C32816h.m75716b().getEnableLiveSplash().booleanValue() || !C26244k.m63591a(getCurrentFeedRecommendFragment())) {
            return false;
        }
        return true;
    }

    public void exitDislikeMode() {
        if (this.mDisLikeAwemeLayout.f80366k) {
            this.mDisLikeAwemeLayout.mo63291a(false);
            this.mDisLikeAwemeLayout.setInDislikeMode(false);
            this.mDataCenter.mo48228a("ENTER_DISLIKE_MODE", (Object) Boolean.valueOf(false));
            C47718bf.m103288a(new C30340i(false, 1, getActivity().hashCode()));
        }
    }

    public boolean isADShowing() {
        if (AwemeAppData.m47851a().f61128f || C26224g.m63536a() || C26512f.m64061d(this.homeViewModel.f85656j) || C26512f.m64070m(this.homeViewModel.f85656j) || C26235d.m63570a(this.homeViewModel.f85656j)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$lazyDoIt$13$MainActivity() {
        C33115h a = C33115h.m76117a();
        FragmentActivity activity = getActivity();
        a.f85952d = true;
        a.mo70143a((Context) activity);
        if (!C30578o.m71565a().booleanValue() && !this.mRestartFromLogout) {
            C50351a.m108630a().mo98254a((Context) getActivity());
        }
    }

    /* access modifiers changed from: protected */
    public void lazyDoItMainThread() {
        if (isViewValid() && this.showToast && this.mAwesomeSplashStatus != 1 && this.mAwesomeSplashStatus != 2) {
            new HomeToastTask(false).run(C11010c.m22280a());
            this.showToast = false;
        }
    }

    public void onBackPressed() {
        boolean z;
        C36543bx bxVar = this.mMainHelper;
        if (bxVar.mo75659a()) {
            z = false;
        } else {
            z = bxVar.mo75622d();
        }
        if (!z) {
            backRefreshStrategy();
        }
        this.mDataCenter.mo48228a("exitGuideView", (Object) Boolean.valueOf(false));
        exitDislikeMode();
    }

    public void onChanged() {
        SymphonyAdManager.m63648a();
        C35807d.m80935a(C11010c.m22280a(), "sp_symphony", 0).edit().putBoolean("enable_symphony_sdk_ab", C10181b.m20511a().mo18172a(SymphonySdkEnableExperiment.class, true, "enable_symphony_sdk_ab", 31744, true)).apply();
    }

    public void onKeyBack() {
        if (!this.mScrollSwitchHelper.mo75735a()) {
            if (getTabChangeManager().mo75609a() != null && (getTabChangeManager().mo75609a() instanceof C40205b)) {
                refreshWhenBack();
            }
            refreshWhenBack();
        }
    }

    private void injectVideoInfo() {
        boolean z;
        C37772b bVar = C37774a.f96239a;
        if (C37772b.f96237b == null) {
            Boolean bool = (Boolean) SharePrefCache.inst().getShowVideoBitrateInfo().mo47782d();
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            C37772b.f96237b = Boolean.valueOf(z);
        }
        if (C37772b.f96237b.booleanValue()) {
            FrameLayout frameLayout = (FrameLayout) findViewById(16908290);
            bVar.f96238a = new TextView(this);
            bVar.f96238a.setLayoutParams(new LayoutParams(-1, -1));
            bVar.f96238a.setPadding(10, (int) C9432q.m18687b((Context) this, 30.0f), 0, 0);
            bVar.f96238a.setTextColor(-65536);
            frameLayout.addView(bVar.f96238a);
        }
    }

    private void performSplashSkipClick() {
        if (this.mAwesomeSplashStatus == 2) {
            C30016ag currentViewHolder = getCurrentViewHolder();
            long j = 0;
            if (C31186b.m72817e(currentViewHolder) && (C26512f.m64070m(currentViewHolder.mo53999e()) || C26235d.m63570a(currentViewHolder.mo53999e()))) {
                C31208r.m72880a(currentViewHolder.mo53999e(), "livesdk_topview_jump");
                if (getCurFragment() instanceof MainFragment) {
                    MainFragment mainFragment = (MainFragment) getCurFragment();
                    if (mainFragment.mo75499c() instanceof C30753ai) {
                        C30753ai aiVar = (C30753ai) mainFragment.mo75499c();
                        if (aiVar != null) {
                            j = aiVar.f80590m.mo62831aF();
                        }
                    }
                }
                long j2 = j;
                new HashMap().put("duration", String.valueOf(j2));
                C26088l.m63280a((Context) this, currentViewHolder.mo53999e(), j2, 1, "break", Integer.valueOf(2));
                C47718bf.m103288a(new C30338g(currentViewHolder.mo53999e()));
            }
        }
    }

    private void recordLaunchDate() {
        try {
            new C47423f().mo94702b(System.currentTimeMillis());
            ContentValues contentValues = new ContentValues();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            contentValues.put(C38588b.f98135i, Long.valueOf(instance.getTimeInMillis()));
            C50293a.m108558a().f126178a.insert(C38588b.f98134h, null, contentValues);
        } catch (Exception unused) {
        }
    }

    public void onStop() {
        super.onStop();
        C22574a.m55738f().mo46914a();
        LocalVideoPlayerManager.m104046a().mo95316b();
        C33115h.m76117a().mo70144b();
        new StringBuilder("startClean ").append(C2553c.f7932a);
        if (!C2553c.f7932a) {
            C0013i.m18a((Callable<TResult>) new Callable<Object>(getApplicationContext()) {

                /* renamed from: a */
                final /* synthetic */ Context f7941a;

                /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object call() throws java.lang.Exception {
                    /*
                        r10 = this;
                        android.content.Context r0 = r10.f7941a
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "startCleanAsync "
                        r1.<init>(r2)
                        boolean r2 = com.aweme.storage.C2553c.f7932a
                        r1.append(r2)
                        boolean r1 = com.aweme.storage.C2553c.f7932a
                        if (r1 != 0) goto L_0x006e
                        if (r0 != 0) goto L_0x0015
                        goto L_0x006e
                    L_0x0015:
                        com.aweme.storage.i r1 = com.aweme.storage.C2553c.f7935d
                        r2 = 0
                        r3 = 1
                        if (r1 == 0) goto L_0x0056
                        com.aweme.storage.i r1 = com.aweme.storage.C2553c.f7935d
                        boolean r1 = r1.mo7076b()
                        if (r1 == 0) goto L_0x0056
                        if (r0 == 0) goto L_0x0052
                        java.lang.String r1 = "clean_storage_pref"
                        android.content.SharedPreferences r1 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0, r1, r2)
                        java.lang.String r4 = "key_clean_date"
                        r5 = 0
                        long r4 = r1.getLong(r4, r5)
                        com.aweme.storage.a r1 = com.aweme.storage.C2553c.f7934c
                        if (r1 == 0) goto L_0x0044
                        int r6 = r1.f7912a
                        if (r6 <= 0) goto L_0x0044
                        int r1 = r1.f7912a
                        long r6 = (long) r1
                        r8 = 3600000(0x36ee80, double:1.7786363E-317)
                        long r6 = r6 * r8
                        goto L_0x0047
                    L_0x0044:
                        r6 = 259200000(0xf731400, double:1.280618154E-315)
                    L_0x0047:
                        long r8 = java.lang.System.currentTimeMillis()
                        long r8 = r8 - r4
                        int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                        if (r1 <= 0) goto L_0x0052
                        r1 = 1
                        goto L_0x0053
                    L_0x0052:
                        r1 = 0
                    L_0x0053:
                        if (r1 == 0) goto L_0x0056
                        r2 = 1
                    L_0x0056:
                        boolean r1 = com.aweme.storage.C2553c.m7473c(r0)
                        if (r1 == 0) goto L_0x0067
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r4 = "shouldClean: "
                        r1.<init>(r4)
                        r1.append(r2)
                        r2 = 1
                    L_0x0067:
                        if (r2 == 0) goto L_0x006e
                        com.aweme.storage.C2553c.f7932a = r3
                        com.aweme.storage.C2553c.m7472b(r0)
                    L_0x006e:
                        r0 = 0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C2553c.C25541.call():java.lang.Object");
                }

                {
                    this.f7941a = r1;
                }
            }, (Executor) C24076h.m58902c());
        }
        CleanEffectsTask.startCleanEffect(this);
        C30515a.m71483b().mo62713c();
        AVCameraInitManager.m90984a(0, true);
    }

    public void refreshSlideSwitchCanScrollRight() {
        Fragment fragment;
        if (this.mScrollSwitchHelper != null) {
            Fragment a = getTabChangeManager().mo75609a();
            if (a == null || !(a instanceof MainFragment)) {
                this.stateManager.mo69857a((C23638a) this.scrollFullChecker);
            } else if (C47915gg.m103651b()) {
                this.stateManager.mo69857a((C23638a) this.scrollFullChecker);
            } else {
                ScrollSwitchStateManager scrollSwitchStateManager = this.stateManager;
                if (scrollSwitchStateManager.f85677j == null) {
                    fragment = null;
                } else {
                    WeakReference<Fragment> weakReference = scrollSwitchStateManager.f85677j;
                    if (weakReference == null) {
                        C52711k.m112234a();
                    }
                    fragment = (Fragment) weakReference.get();
                }
                C30750af afVar = (C30750af) fragment;
                if (afVar instanceof C36617e) {
                    C36617e eVar = (C36617e) afVar;
                    if ("FeedFollowFragment".equals(eVar.mo63459s()) || "FeedRecommendFragment".equals(eVar.mo63459s())) {
                        C25908e eVar2 = this.adViewController;
                        eVar2.mo53240a((Context) this, eVar2.f68446a);
                        setAdScrollRightControl();
                        return;
                    }
                }
                this.adViewController.mo53254j();
                this.stateManager.mo69857a((C23638a) this.scrollFullChecker);
            }
        }
    }

    private void backRefreshStrategy() {
        C26890h.m65011a("press_back", C23089d.m56640a().mo47829a("enter_from", getTabChangeManager().f93538c).f61491a);
        int a = C10181b.m20511a().mo18168a(BackRefreshExperiment.class, false, "back_refresh_strategy", 31744, 0);
        if (a != 0) {
            if (this.mMainHelper.f93633a) {
                this.mMainHelper.f93633a = false;
            } else if (!this.mDialogShowingManager.mo86222f()) {
                if (!isUnderMainTab()) {
                    this.mDataCenter.mo48228a("performClickTab", (Object) "HOME");
                    Fragment a2 = getTabChangeManager().mo75609a();
                    if (a2 != null && (a2 instanceof MainFragment)) {
                        MainFragment mainFragment = (MainFragment) a2;
                        if (mainFragment.mo75504d()) {
                            mainFragment.mo75502c(true);
                        } else {
                            mainFragment.mo75500c(1);
                        }
                        if (a == 1) {
                            mainFragment.mo75510j();
                        }
                    }
                    return;
                }
                Fragment a3 = getTabChangeManager().mo75609a();
                if (a3 != null && (a3 instanceof MainFragment)) {
                    MainFragment mainFragment2 = (MainFragment) a3;
                    if (!mainFragment2.mo75504d()) {
                        mainFragment2.mo75500c(1);
                    }
                    if (a == 1) {
                        mainFragment2.mo75510j();
                    }
                }
            }
        }
    }

    private void mobLaunchMob() {
        Uri uri;
        try {
            String str = null;
            if (getIntent() != null) {
                uri = getIntent().getData();
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (uri != null) {
                    str = uri.getQueryParameter("gd_label");
                }
                if (booleanExtra || str != null) {
                    return;
                }
            } else {
                uri = null;
            }
            C26890h.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            String str2 = "";
            String str3 = "";
            if (uri != null) {
                str2 = uri.getQueryParameter("enter_to");
                str3 = uri.getQueryParameter("push_id");
            }
            C23255y e = new C23255y().mo48177a("enter_launch").mo48181e(Integer.toString(C23111k.m56679a().f61537b ? 1 : 0));
            if (str2 == null) {
                str2 = "";
            }
            C23255y c = e.mo48179c(str2);
            if (str3 == null) {
                str3 = "";
            }
            c.mo48178b(str3).mo48076e();
            if (C23111k.m56679a().f61537b) {
                C23111k.m56679a().f61537b = false;
            }
        } catch (Exception unused) {
        }
    }

    private void onI18nScrollToProfileEvent() {
        boolean z;
        if (C26512f.m64124Z(this.homeViewModel.f85656j)) {
            C26540w.m64244d(this, this.homeViewModel.f85656j);
        } else if (isOpenWebOrOpenUrlOrMpUrl()) {
            if (C26512f.m64122X(this.homeViewModel.f85656j)) {
                C26540w.m64203a((Context) this, this.homeViewModel.f85656j, "slide");
            } else if (!C26540w.m64211a((Context) this, this.homeViewModel.f85656j) && !C36917d.m83053a(this, this.homeViewModel.f85656j)) {
                C26540w.m64232b((Context) this, this.homeViewModel.f85656j);
            }
        } else if (!this.adViewController.mo53244a() || this.adViewController.mo53250f() || this.adViewController.mo53246b() || this.adViewController.mo53248d()) {
            if (!this.adViewController.mo53244a() || !this.adViewController.mo53250f() || this.adViewController.mo53248d() || C26512f.m64133aa(this.homeViewModel.f85656j)) {
                this.mScrollSwitchHelper.mo75733a(this.homeViewModel.f85656j, "");
            } else {
                C25908e eVar = this.adViewController;
                if (eVar.f68448c == null) {
                    z = false;
                } else {
                    z = eVar.f68448c.isDownloadMode();
                }
                if (!z) {
                    C36505at.m82420a(Toast.makeText(this, R.string.dl, 0));
                } else if (!C26540w.m64257g(this, this.homeViewModel.f85656j)) {
                    C36505at.m82420a(Toast.makeText(this, R.string.dl, 0));
                }
            }
        } else {
            C36505at.m82420a(Toast.makeText(this, R.string.dl, 0));
        }
    }

    private void setI18nAdScrollRightControl() {
        if (MainTabStripSwipeSwitchExperiment.m82550a() || AdFixFeedScrollRightSetting.get()) {
            setVpEnableDispatchTouchEventCheck(false);
        }
        if (!this.adViewController.mo53244a() || this.adViewController.mo53248d()) {
            if (!this.adViewController.mo53248d() || C47915gg.m103651b()) {
                this.stateManager.mo69857a((C23638a) this.scrollFullChecker);
            } else {
                this.stateManager.mo69857a((C23638a) this.scrollBasicChecker);
            }
        } else if (C26512f.m64133aa(this.homeViewModel.f85656j)) {
            this.stateManager.mo69857a((C23638a) this.scrollBasicChecker);
        } else if (C26512f.m64052D(this.homeViewModel.f85656j).booleanValue()) {
            this.stateManager.mo69857a((C23638a) this.scrollFullChecker);
            if (MainTabStripSwipeSwitchExperiment.m82550a() || AdFixFeedScrollRightSetting.get()) {
                setVpEnableDispatchTouchEventCheck(true);
            }
        } else if (!this.adViewController.mo53246b() || C26512f.m64124Z(this.homeViewModel.f85656j) || this.adViewController.mo53250f()) {
            this.stateManager.mo69857a((C23638a) this.scrollFullChecker);
            if (MainTabStripSwipeSwitchExperiment.m82550a() || AdFixFeedScrollRightSetting.get()) {
                setVpEnableDispatchTouchEventCheck(true);
            }
        } else {
            this.stateManager.mo69857a((C23638a) this.scrollBasicChecker);
        }
    }

    public String getEnterFrom() {
        if (getTabChangeManager() == null || TextUtils.isEmpty(getTabChangeManager().f93538c)) {
            return "homepage_hot";
        }
        String str = getTabChangeManager().f93538c;
        if (TextUtils.equals(str, "HOME")) {
            Fragment a = getTabChangeManager().mo75609a();
            if (!(a instanceof MainFragment)) {
                return "homepage_hot";
            }
            MainFragment mainFragment = (MainFragment) a;
            if (mainFragment == null) {
                return "homepage_hot";
            }
            C30750af k = mainFragment.mo75499c();
            if (k != null) {
                if (k instanceof C31143x) {
                    return "homepage_follow";
                }
                if (k instanceof C30753ai) {
                    return "homepage_hot";
                }
            }
        } else if (TextUtils.equals(str, "DISCOVER")) {
            return "discovery";
        } else {
            if (TextUtils.equals(str, "NOTIFICATION")) {
                return "message";
            }
            if (TextUtils.equals(str, "USER")) {
                if (getTabChangeManager().mo75609a() instanceof C23251u) {
                    return ((C23251u) getTabChangeManager().mo75609a()).mo48157a();
                }
                return "personal_homepage";
            }
        }
        return "homepage_hot";
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initWaterMark() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.festival.n r0 = com.p683ss.android.ugc.aweme.shortvideo.festival.C43826n.m96253a()
            boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.festival.C43819g.m96248b()
            if (r1 != 0) goto L_0x0010
            java.lang.String r0 = com.p683ss.android.ugc.aweme.shortvideo.festival.C43826n.f110987a
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103315c(r0)
            return
        L_0x0010:
            java.lang.String r1 = r0.mo89348c()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0040
            java.lang.String r1 = r0.mo89347a(r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L_0x0040
            java.io.File[] r1 = r2.listFiles()
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0040
            java.lang.String r1 = r2.getPath()
            r0.f110990b = r1
            r1 = 1
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            if (r1 != 0) goto L_0x0084
            boolean r1 = r0.f110991c
            if (r1 != 0) goto L_0x0084
            r0.f110991c = r4
            java.lang.String r1 = ""
            r0.f110990b = r1
            java.lang.String r1 = com.p683ss.android.ugc.aweme.shortvideo.festival.C43826n.f110987a
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103315c(r1)
            java.lang.String r1 = com.p683ss.android.ugc.aweme.shortvideo.festival.C43826n.f110987a
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103306a(r1, r3)
            java.lang.String r1 = r0.mo89348c()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0084
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = com.p683ss.android.socialbase.downloader.downloader.Downloader.with(r2)
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r2.url(r1)
            java.lang.String r1 = com.p683ss.android.ugc.aweme.shortvideo.festival.C43826n.m96254a(r1, r4)
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r2.name(r1)
            java.lang.String r2 = com.p683ss.android.ugc.aweme.shortvideo.festival.C43826n.m96255b()
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.savePath(r2)
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r1.subThreadListener(r0)
            r0.download()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainActivity.initWaterMark():void");
    }

    public void onDestroy() {
        if (this.isWatchReceiverRegisted) {
            unregisterReceiver(this.homeWatcherReceiver);
        }
        if (this.isPushReceiverRegisted && this.mPushReceiver != null) {
            C47718bf.m103291d(this.mPushReceiver);
            unregisterReceiver(this.mPushReceiver);
        }
        super.onDestroy();
        C32961a aVar = this.mActivityProxy;
        C52711k.m112240b(this, "activity");
        aVar.f85642d.mo69845a();
        AudioUtils.m57301f(this);
        C52711k.m112240b(this, "activity");
        C41589c.m91432a().f105321a.mo17006b(this);
        maybeAddLazySequence(C36749t.f93920a);
        I18nBridgeService.getBridgeService_Monster().checkToCleanNoneUsedFiles();
        if (!(this.mBroadCastRegister == null || getApplication() == null)) {
            this.mBroadCastRegister.mo56385b(getApplication());
        }
        if (this.mPolicyManager != null) {
            C39498b bVar = this.mPolicyManager;
            if (bVar.f101046a != null) {
                bVar.f101046a.removeCallbacksAndMessages(null);
            }
        }
        C38851d.f98954a.mo6180a();
        if (C38851d.f98957d != null) {
            C2147b<Long> bVar2 = C38851d.f98957d;
            if (bVar2 == null) {
                C52711k.m112234a();
            }
            bVar2.dispose();
            C38851d.f98957d = null;
        }
        if (!C48121w.m104087I()) {
            C48121w.m104249M().mo95264A();
        } else {
            C50130a.m108170a().mo97927c();
        }
        C47981ac.m103815a().mo95143d();
        TTVideoEngine.releaseTextureRender();
        C38851d.f98955b = false;
        C26217c.m63502a().f69227d = false;
        C26237e.m63579b().f69276c = false;
        C26237e.m63579b();
        if (C26237e.f69273b != null) {
            C26237e.f69273b.mo53885b();
        }
        C26217c.m63502a();
        if (C26217c.f69224b != null) {
            C26217c.f69224b.mo53872b();
        }
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
        }
        C30056b.f78448o = 0;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", true);
        if (C47859eq.m103531b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", false);
            return;
        }
        C22574a.m55738f().mo46921b("cold_boot_main_create_to_resume", true);
        C22574a.m55738f().mo46917a("cold_boot_main_resume_duration", true);
        this.isPaused = false;
        this.mResumed = true;
        super.onResume();
        feed0VVManagerOnResume();
        C47625i.m103103a("ProcessPublish tryProcessPublish onResume");
        if (this.checkPrivacyPolicy) {
            checkPrivacyPolicyVersion();
            this.checkPrivacyPolicy = false;
        }
        if (this.mAppealDialogHelper != null && this.mAppealDialogHelper.mo55225a() && !isADShowing()) {
            this.mAppealDialogHelper.mo55226b();
        }
        fitAwesomeSplash();
        C47893fn.m103596a(this);
        ((MainLooperOptService) C35857a.m80997a(MainLooperOptService.class)).updateState(C35922a.WATCH_ON_MEASURE);
        if (!isADShowing()) {
            C41528ai.f105215g.mo85312a(this, false, "");
        }
        C22574a.m55738f().mo46921b("cold_boot_main_resume_duration", true);
        C22574a.m55738f().mo46917a("cold_boot_main_resume_to_measure", false);
        C22574a.m55738f().mo46917a("cold_boot_main_resume_to_focus", true);
        if (!this.firstCreated && C10181b.m20511a().mo18172a(ReleaseWindowBackgroundExperiment.class, true, "is_release_window_background", 31744, true) && !C10181b.m20511a().mo18172a(DynamicTabSwitchExperiment.class, true, "virus_tab_global_switch", 31744, false)) {
            getWindow().getDecorView().setBackground(null);
        }
        this.mBatteryMonitor.mo48200a((Activity) this);
        this.firstCreated = false;
        C47859eq.m103529a(this);
        this.mFirstClickPublish = System.currentTimeMillis();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", false);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Intent, java.lang.String] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r6v5, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r6v6, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v0, types: [android.content.Intent, java.lang.String]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.String, ?[OBJECT, ARRAY], android.content.Intent]
      mth insns count: 102
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkGcmMessage() {
        /*
            r13 = this;
            android.content.Intent r0 = r13.getIntent()
            if (r0 == 0) goto L_0x0115
            android.os.Bundle r1 = r0.getExtras()
            if (r1 != 0) goto L_0x000e
            goto L_0x0115
        L_0x000e:
            android.os.Bundle r1 = r0.getExtras()
            java.lang.String r2 = "payload"
            java.lang.String r1 = r1.getString(r2)
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r2 = "from"
            java.lang.String r0 = r0.getString(r2)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0114 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "id"
            r3 = 0
            int r1 = r2.optInt(r1, r3)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r4 = "pass_through"
            r5 = 1
            int r4 = r2.optInt(r4, r5)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r6 = "preload_article"
            r2.optInt(r6, r3)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r6 = "open_url"
            java.lang.String r6 = r2.optString(r6)     // Catch:{ Exception -> 0x0101 }
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Exception -> 0x0101 }
            r8 = 0
            if (r7 == 0) goto L_0x008a
            java.lang.String r6 = "app_data"
            org.json.JSONObject r2 = r2.optJSONObject(r6)     // Catch:{ Exception -> 0x0101 }
            if (r2 == 0) goto L_0x0088
            java.lang.String r6 = "t"
            int r6 = r2.optInt(r6, r3)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r7 = "p"
            int r3 = r2.optInt(r7, r3)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r7 = "uid"
            r9 = 0
            long r11 = r2.optLong(r7, r9)     // Catch:{ Exception -> 0x0101 }
            if (r6 != r5) goto L_0x0088
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 == r5) goto L_0x0080
            switch(r3) {
                case 3: goto L_0x0077;
                case 4: goto L_0x006d;
                default: goto L_0x006c;
            }     // Catch:{ Exception -> 0x0101 }
        L_0x006c:
            goto L_0x0088
        L_0x006d:
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0088
            java.lang.String r2 = "from_notification"
            r8.putExtra(r2, r5)     // Catch:{ Exception -> 0x0101 }
            goto L_0x0088
        L_0x0077:
            r8.addFlags(r2)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r2 = "from_notification"
            r8.putExtra(r2, r5)     // Catch:{ Exception -> 0x0101 }
            goto L_0x0088
        L_0x0080:
            r8.addFlags(r2)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r2 = "from_notification"
            r8.putExtra(r2, r5)     // Catch:{ Exception -> 0x0101 }
        L_0x0088:
            r6 = r8
            goto L_0x00be
        L_0x008a:
            android.net.Uri r2 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r3 = r2.getScheme()     // Catch:{ Exception -> 0x0101 }
            java.lang.String r7 = "sslocal"
            boolean r7 = r7.equals(r3)     // Catch:{ Exception -> 0x0101 }
            if (r7 == 0) goto L_0x00a4
            com.ss.android.ugc.aweme.app.c$a r2 = com.p683ss.android.ugc.aweme.app.C23057c.f61426d     // Catch:{ Exception -> 0x0101 }
            java.lang.String r2 = r2.mo47786a(r6)     // Catch:{ Exception -> 0x0101 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0101 }
        L_0x00a4:
            android.content.Intent r6 = new android.content.Intent     // Catch:{ Exception -> 0x0101 }
            r6.<init>()     // Catch:{ Exception -> 0x0101 }
            java.lang.String r7 = "android.intent.action.VIEW"
            r6.setAction(r7)     // Catch:{ Exception -> 0x0101 }
            com.ss.android.ugc.aweme.app.c$a r7 = com.p683ss.android.ugc.aweme.app.C23057c.f61426d     // Catch:{ Exception -> 0x0101 }
            boolean r3 = r7.mo47788b(r3)     // Catch:{ Exception -> 0x0101 }
            if (r3 == 0) goto L_0x00bb
            java.lang.String r3 = "is_from_self"
            r6.putExtra(r3, r5)     // Catch:{ Exception -> 0x0101 }
        L_0x00bb:
            r6.setData(r2)     // Catch:{ Exception -> 0x0101 }
        L_0x00be:
            java.lang.String r2 = r13.getPackageName()     // Catch:{ Exception -> 0x0101 }
            if (r6 != 0) goto L_0x00c8
            android.content.Intent r6 = com.p683ss.android.common.util.C18920g.m46046a(r13, r2)     // Catch:{ Exception -> 0x0101 }
        L_0x00c8:
            if (r6 != 0) goto L_0x00cb
            goto L_0x0114
        L_0x00cb:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r6.addFlags(r2)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r2 = "from_notification"
            r6.putExtra(r2, r5)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r2 = "msg_from"
            r3 = 2
            r6.putExtra(r2, r3)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r2 = "msg_id"
            r6.putExtra(r2, r1)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r1 = "message_from"
            r6.putExtra(r1, r0)     // Catch:{ Exception -> 0x0101 }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ Exception -> 0x0101 }
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "message_extra"
            r6.putExtra(r0, r8)     // Catch:{ Exception -> 0x0101 }
        L_0x00f0:
            boolean r0 = com.p683ss.android.ugc.trill.C50292a.m108557a(r4, r13, r6)     // Catch:{ Exception -> 0x0101 }
            if (r0 == 0) goto L_0x00f7
            goto L_0x0114
        L_0x00f7:
            boolean r0 = r13.isFinishing()     // Catch:{ Exception -> 0x0101 }
            if (r0 != 0) goto L_0x0114
            r13.startActivity(r6)     // Catch:{ Exception -> 0x0101 }
            goto L_0x0114
        L_0x0101:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114 }
            java.lang.String r2 = "can not get launch intent: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0114 }
            r1.append(r0)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0114 }
            com.bytedance.ies.p672e.C10752a.m21792a(r13, r0)     // Catch:{ Exception -> 0x0114 }
            return
        L_0x0114:
            return
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainActivity.checkGcmMessage():void");
    }

    /* access modifiers changed from: protected */
    public void lazyDoIt() {
        cleanLazySequence();
        hotStartIntercept();
        C18842a.m45932a(new Runnable(this, new C36487ab(this)) {

            /* renamed from: a */
            final /* synthetic */ Context f120369a;

            /* renamed from: b */
            final /* synthetic */ C47823a f120370b;

            public final void run() {
                C47819dn.m103464a(this.f120369a, false, null, this.f120370b, false);
            }

            {
                this.f120369a = r1;
                this.f120370b = r2;
            }
        });
        C0013i.m18a(C47854el.f120418a, (Executor) C24076h.m58904e());
        C31291a aVar = new C31291a(this);
        if (aVar.f82038a != null) {
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    try {
                        long a = C31271e.m72994a(C31291a.this.f82039b).mo64162a(true);
                        if (C31291a.this.f82039b.getFilesDir() != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(C31291a.this.f82039b.getFilesDir().getParent());
                            sb.append("/shared_prefs");
                            File file = new File(sb.toString(), "feedback_last_time.xml");
                            if (file.exists()) {
                                if (a <= 0) {
                                    SharedPreferences a2 = C35807d.m80935a(C31291a.this.f82039b, "feedback_last_time", 0);
                                    if (a2.contains("key_last_time")) {
                                        a = a2.getLong("key_last_time", -1);
                                    }
                                }
                                file.delete();
                            }
                        }
                        if (a > 0) {
                            C23566n a3 = C23566n.m57766a();
                            Handler handler = C31291a.this.f82038a;
                            C31290a aVar = FeedbackNewestReplyApi.f82036b;
                            aVar.getClass();
                            a3.mo48750a(handler, new C31293b(aVar), 0);
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
        initWaterMark();
        mobLaunchMob();
        pushAuthorityMonitor();
        new C36459a().run();
        if (C23859b.m58575b().mo49472b((Context) this, IS_UPLOAD_PRE_INFO, true)) {
            ChannelUploadHelper.parseFile();
            C23859b.m58575b().mo49466a((Context) this, IS_UPLOAD_PRE_INFO, false);
        }
        if (SharePrefCache.inst().getLastPublishFailed() != null && ((Boolean) SharePrefCache.inst().getLastPublishFailed().mo47782d()).booleanValue()) {
            C9432q.m18672a((Context) this, (int) R.string.bvt);
            SharePrefCache.inst().getLastPublishFailed().mo47776a(Boolean.valueOf(false));
        }
        C41623i iVar = C41623i.f105347c;
        C52711k.m112240b(this, "context");
        AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().tryRestorePublish(this, new C36488ac(this));
        C47990aj.m103825a(true);
        C0013i.m12a(10000).mo20a(C36490ae.f93560a, (Executor) C24076h.m58904e());
        SharePrefCache.inst().getIsContactDialogShown().mo47776a(Boolean.valueOf(true));
        SharePrefCache.inst().getHasEnterBindPhone().mo47776a(Boolean.valueOf(true));
        SharePrefCache.inst().getIsProfileBubbleShown().mo47776a(Boolean.valueOf(false));
        C23542f.m57718c().mo48710b("open", false);
        if (!this.mStatusDestroyed) {
            this.homeWatcherReceiver = new HomeWatcherReceiver();
            registerReceiver(this.homeWatcherReceiver, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            this.isWatchReceiverRegisted = true;
            if (InAppPushLiveExperiment.m91346a()) {
                this.mPushReceiver = new CustomActionPushReceiver();
                C47718bf.m103290c(this.mPushReceiver);
                CustomActionPushReceiver customActionPushReceiver = this.mPushReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append(getPackageName());
                sb.append(".action.PUSH_CUSTOM_ACTION");
                registerReceiver(customActionPushReceiver, new IntentFilter(sb.toString()));
                this.isPushReceiverRegisted = true;
            }
        }
        recordLaunchDate();
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            SharedPreferences a = C35807d.m80935a(applicationContext, "pref_name", 0);
            if (!a.getBoolean("pref_short_cut", false)) {
                C23861a.m58579a(applicationContext, applicationContext.getPackageName());
                a.edit().putBoolean("pref_short_cut", true).apply();
            }
        }
        checkPrivacyPolicyVersion();
        this.mBroadCastRegister = new C27985v();
        if (getApplication() != null) {
            this.mBroadCastRegister.mo56383a(getApplication());
        }
        if (C20966a.m53329a()) {
            List allUidList = C20902b.m53242a().allUidList();
            C52711k.m112240b(allUidList, "uids");
            C38046d.f96822b.mo77574b().mo77492a(allUidList);
        }
    }

    public void onPause() {
        boolean z;
        boolean z2 = true;
        this.isPaused = true;
        this.mBatteryMonitor.mo48199a();
        C22574a.m55738f().mo46914a();
        super.onPause();
        this.mResumed = false;
        if (((float) C47997a.f120634a) > 0.0f && C10181b.m20511a().mo18172a(RecordLastNetworkSpeedExperiment.class, true, "is_record_last_network_speed_enabled", 31744, true)) {
            SharePrefCache.inst().getLastUsableNetworkSpeed().mo47776a(Integer.valueOf(C47997a.f120634a));
        }
        C30016ag currentViewHolder = getCurrentViewHolder();
        Fragment curFragment = getCurFragment();
        if (curFragment == null) {
            C26217c.m63502a().f69227d = false;
            C26217c.m63502a().f69228e = true;
            C26237e.m63579b().f69276c = false;
            C26237e.m63579b().f69277d = true;
        } else {
            if (((Boolean) C25280a.m61493a().getCommentViewModel(this).mo51115a().getValue()).booleanValue() || hasDialogShowing(curFragment) || isInMaskLayer() || (currentViewHolder != null && currentViewHolder.mo60181F())) {
                z = true;
            } else {
                z = false;
            }
            if (!this.stateManager.mo69868b("page_feed") || !(curFragment instanceof MainFragment) || !((MainFragment) curFragment).mo75504d()) {
                z2 = false;
            }
            C26217c.m63502a().f69227d = z;
            C26217c.m63502a().f69228e = z2;
            C26237e.m63579b().f69276c = z;
            C26237e.m63579b().f69277d = z2;
        }
        if (!(currentViewHolder == null || currentViewHolder.mo53999e() == null)) {
            C26217c.m63502a().f69229f = currentViewHolder.mo53999e().isEnableTopView();
        }
        C26217c.m63502a().f69234k = false;
        C26217c.m63502a().f69232i = false;
        C26237e.m63579b().f69281h = false;
        C26237e.m63579b().f69280g = false;
        C2553c.m7469a(C22858c.f61207c);
        C30163b bVar = C30163b.f78736j;
        C1690c cVar = (C1690c) C30163b.f78735i.getValue();
        Context applicationContext = getApplicationContext();
        if (C22548a.f60687b == null) {
            if (!C22548a.m55712b()) {
                C22548a.f60687b = Boolean.FALSE;
            } else {
                try {
                    Class.forName("com.bytedance.test.codecoverage.codeCoverage");
                    C22548a.f60687b = Boolean.TRUE;
                } catch (Throwable unused) {
                    C22548a.f60687b = Boolean.FALSE;
                }
            }
        }
        if (C22548a.f60687b.booleanValue()) {
            new Thread("upload_coverage_data", applicationContext) {

                /* renamed from: a */
                final /* synthetic */ Context f60689a;

                public final void run() {
                    try {
                        File a = C22548a.m55710a(this.f60689a);
                        if (a != null) {
                            String a2 = C22548a.m55711a();
                            String valueOf = String.valueOf(C11010c.m22287h());
                            String k = C11010c.m22290k();
                            String trim = C11010c.m22291l().trim();
                            if (trim.length() > 7) {
                                trim = trim.substring(0, 7);
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(AppLog.getServerDeviceId());
                            String sb2 = sb.toString();
                            if (k.equals("")) {
                                k = "test_branch";
                            }
                            Class cls = Class.forName("com.bytedance.test.codecoverage.codeCoverage");
                            Object newInstance = cls.newInstance();
                            Method method = cls.getMethod("covDataUpload", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class});
                            if (TextUtils.isEmpty(sb2)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(AppLog.getServerDeviceId());
                                sb2 = sb3.toString();
                            }
                            method.invoke(newInstance, new Object[]{a.getAbsolutePath(), a2, valueOf, k, trim, sb2});
                        }
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }

                {
                    this.f60689a = r2;
                }
            }.start();
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onAwesomeSplashEvent$22$MainActivity(View view) {
        performSplashSkipClick();
    }

    @C53771m
    public void onFeedbackEvent(C31273f fVar) {
        showNewFeedbackAlert(this);
    }

    private void changeTag(String str) {
        getTabChangeManager().mo75614a(str);
    }

    public void attachBaseContext(Context context) {
        C30163b.m70779f();
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C0013i lambda$callLazyDoIt$10$MainActivity(C0013i iVar) throws Exception {
        lazyDoIt();
        return null;
    }

    @C53771m
    public void onMobEnterFromEvent(C30310ab abVar) {
        this.homeViewModel.mo69849a(abVar.f79198a);
    }

    @C53771m
    public void onMobRequestIdEvent(C30311ac acVar) {
        this.homeViewModel.f85655i = acVar.f79199a;
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onSettingsDoneEvent(C22691a aVar) {
        callAllDialogs(true);
    }

    public static Intent getMainActivityIntent(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        return intent;
    }

    static final /* synthetic */ Void lambda$lazyDoIt$18$MainActivity(C0013i iVar) throws Exception {
        try {
            TTRegionTestApi.f127801a.ttRegionTest();
        } catch (Exception unused) {
        }
        C35857a.m80999a(C35999r.m81185e());
        return null;
    }

    private void setVpEnableDispatchTouchEventCheck(boolean z) {
        if (this.mViewPager != null) {
            this.mViewPager.setEnableDispatchTouchEventCheck(z);
        }
    }

    private void setupSlideSwitchLayout(String str) {
        if ("DISCOVER".equals(str)) {
            this.stateManager.mo69863a(false);
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C27019b bVar) {
        if (C27967h.f73399a) {
            mNeedCallShowPrivacySettingActivityIfNeeded = true;
        } else {
            showPrivacySettingActivityIfNeeded(this.isFirstLaunch);
        }
    }

    @C53771m
    public void onScrollToDetailEvent(C30322am amVar) {
        if (amVar != null && this.mScrollSwitchHelper != null) {
            this.homeViewModel.mo69849a(amVar.f79216a);
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onTermsConsentEvent(C27086b bVar) {
        if (C27967h.f73399a) {
            mNeedCallShowTermsConsentDialogIfNeeded = true;
        } else {
            showTermsConsentDialog();
        }
    }

    public void setTabBackground(boolean z) {
        this.mDataCenter.mo48228a("setTabBackground", (Object) Boolean.valueOf(z));
    }

    public void unRegisterActivityOnKeyDownListener(C23422a aVar) {
        if (this.mActivityOnKeyDownListeners != null) {
            this.mActivityOnKeyDownListeners.remove(aVar);
        }
    }

    private void maybeAddLazySequence(Runnable runnable) {
        boolean z;
        synchronized (this) {
            if (!this.lazySequenceCleaned) {
                this.lazySequence.add(runnable);
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            C0013i.m18a((Callable<TResult>) new C36755z<TResult>(runnable), (Executor) C24076h.m58906g());
        }
    }

    private void showPrivacySettingActivityIfNeeded(boolean z) {
        mNeedCallShowPrivacySettingActivityIfNeeded = false;
        if (C27021a.f71325a.isShowPrivacyAccountSetting()) {
            SmartRouter.buildRoute((Context) this, "//privacyaccounttip").withParam("isFirstLaunch", z).open();
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$observePageActionForAD$4$MainActivity(C32977f fVar) {
        if (this.stateManager.mo69868b("page_feed")) {
            C25908e eVar = this.adViewController;
            if (eVar.f68448c != null) {
                eVar.f68448c.mo53184d(eVar.f68447b, eVar.f68446a);
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C33193d dVar) {
        if (C27967h.f73399a) {
            mNeedCallShowUnder16DialogIfNeeded = true;
            return;
        }
        if (this.mHandler != null) {
            this.mHandler.postDelayed(new C36489ad(this), 500);
        }
    }

    @C53771m(mo112976b = true)
    public void onQueryUserFinishedEvent(C23483b bVar) {
        if (isViewValid() && C20902b.m53242a().getCurUser().isNeedRecommend()) {
            C18842a.m45934b(new Runnable() {
                public final void run() {
                    if (C11016e.m22312g() != null && C11016e.m22312g().getClass() == MainActivity.class) {
                        C37137a.m83368a((Activity) MainActivity.this).mo76413a(RecommendFriendActivity.class).mo76414a();
                    }
                }
            });
        }
    }

    @C53771m
    public void onScrollToProfileEvent(C30323an anVar) {
        if (anVar != null && this.mScrollSwitchHelper != null && anVar.f79218a == hashCode() && this.mScrollSwitchHelper != null) {
            onI18nScrollToProfileEvent();
        }
    }

    public void registerActivityOnKeyDownListener(C23422a aVar) {
        if (this.mActivityOnKeyDownListeners == null) {
            this.mActivityOnKeyDownListeners = new ArrayList();
        }
        if (!this.mActivityOnKeyDownListeners.contains(aVar)) {
            this.mActivityOnKeyDownListeners.add(aVar);
        }
    }

    private void cancelRestoreDialog(DialogInterface dialogInterface) {
        if (isUnderMainTab()) {
            IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
            if (aVServiceImpl_Monster != null) {
                aVServiceImpl_Monster.publishService().cancelRestoreOnMain();
            }
            handleMainPageResume();
        }
        C18898c.m46009a(getApplicationContext(), "protect", "record_off");
        dialogInterface.dismiss();
    }

    private boolean hasDialogShowing(Fragment fragment) {
        if (!(fragment instanceof MainFragment)) {
            return true;
        }
        C30750af k = ((MainFragment) fragment).mo75499c();
        if (!(k instanceof C30753ai)) {
            return false;
        }
        C30753ai aiVar = (C30753ai) k;
        if (aiVar.mo55943i() || C26369ac.m63811a(aiVar.getFragmentManager())) {
            return true;
        }
        return false;
    }

    private void showUploadItemInNewFollowFeed(C44371e eVar) {
        Fragment c = TabChangeManager.m82396a((FragmentActivity) this).mo75619c("DISCOVER");
        if (c != null && (c instanceof FriendTabFragment)) {
            FriendTabFragment friendTabFragment = (FriendTabFragment) c;
            if (friendTabFragment.mo77354a() != null) {
                friendTabFragment.mo77354a().mo77372a(eVar, this.processedCallback);
            }
        } else if (c == null) {
            this.mBinder = eVar;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            C32458a.m75148a(th);
            C23131p.m56692a("main_activity_dispatch_error", "", C23088c.m56631a().mo47824a("message", th.getMessage()).mo47825b());
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Void lambda$lazyDoIt$17$MainActivity(Boolean bool) {
        if (bool.booleanValue()) {
            C1160b a = C47700ay.m103234a(this, R.string.fbn, R.string.wf, new C36495aj(this), R.string.ah2, new C36496ak(this));
            a.setCanceledOnTouchOutside(false);
            a.setCancelable(false);
        } else {
            enterRecordFrom3rdPlatform(getIntent(), getIntent().getBooleanExtra("enter_record_from_other_platform", false));
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$observePageActionForAD$5$MainActivity(Integer num) {
        if (!this.homeViewModel.f85657k) {
            String a = this.stateManager.mo69853a(num.intValue());
            Aweme aweme = this.homeViewModel.f85656j;
            if (!TextUtils.equals(a, "page_profile") || aweme == null) {
                if (TextUtils.equals(a, "page_feed") && aweme != null) {
                    C25908e eVar = this.adViewController;
                    if (eVar.f68448c != null) {
                        eVar.f68448c.mo53186f(eVar.f68447b, eVar.f68446a);
                    }
                }
                return;
            }
            this.adViewController.mo53253i();
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C41534aj ajVar) {
        Dialog a = C41529a.m91357a((Activity) this);
        if (!a.isShowing()) {
            a.show();
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onLaunchFromAppsFlyer(C23086a aVar) {
        Uri uri = aVar.f61489a;
        if (uri.getPath().startsWith("/referral") && !C47490d.f119778a) {
            C47486a aVar2 = new C47486a(this, this, uri.getQueryParameter("uid"), uri.getQueryParameter("uname"), uri.getQueryParameter("aurl"), uri.getLastPathSegment());
            aVar2.show();
        }
    }

    @C53771m
    public void onSettingSyncDone(C41598d dVar) {
        boolean z;
        C50350i a = C50351a.m108630a();
        Boolean a2 = C30578o.m71565a();
        C52711k.m112236a((Object) a2, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
        if (!a2.booleanValue() || a.f126264a.mo75729d()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C50351a.m108630a().mo98254a((Context) getActivity());
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onUserBannedEvent(C23486e eVar) {
        if ((this.mAppealDialogHelper == null || !this.mAppealDialogHelper.mo55227c()) && this.mResumed && !isADShowing() && this.appeal.compareAndSet(false, true)) {
            getAppealStatus();
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onUserLogicDeleteEvent(C23487f fVar) {
        if (this.userLogicDelete.compareAndSet(false, true)) {
            C10691a.m21547b(C11010c.m22280a(), fVar.f62557a, 1, 2).mo19066a();
            C20854a.m53162b().logout("user_logic_delete", "cancel_account_logout");
        }
    }

    @C53771m
    public void onUserLoginStateChange(C23488g gVar) {
        AwemeSSOPlatformUtils.m103144a();
        if (gVar.f62558a == 0) {
            this.checkPrivacyPolicy = true;
            C47611a.m103065a("login", C20854a.m53167g().getCurUserId());
        }
        C37171a.m83416a().mo76494b(0);
    }

    private void callAllDialogs(boolean z) {
        if (z) {
            showAgeGate();
        }
        if (!this.mShowAgeGate) {
            if (((Boolean) C23183v.m56778a().mo47917m().mo47782d()).booleanValue()) {
                C39509a aVar = new C39509a();
                if (C10181b.m20511a().mo18172a(ClearRedPointCostExperiment.class, true, "clear_red_point_cost", 31744, true)) {
                    C0013i.m16a((Callable<TResult>) new C39510a<TResult>(aVar));
                } else {
                    aVar.mo80540a();
                }
            } else {
                C40869c.f104035d.mo83206g();
            }
        }
    }

    private void restoreTheme(boolean z) {
        if (z) {
            if (!this.mThemeRestored) {
                this.mThemeRestored = true;
            } else {
                return;
            }
        }
        findViewById(16908290).setAlpha(1.0f);
        if (VERSION.SDK_INT >= 21) {
            getWindow().addFlags(DynamicTabYellowPointVersion.DEFAULT);
        }
        getWindow().getDecorView().setBackgroundResource(R.drawable.hz);
        getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
        C26247o oVar = this.mSplashLoadMaskHelper;
        if (!(oVar.f69297a == null || oVar.f69298b == null)) {
            oVar.f69297a.removeView(oVar.f69298b);
        }
        C18778a.m45848b("awesome_splash", "removeSplashLoadMask");
        C18778a.m45848b("awesome_splash", "recoveryTheme");
    }

    private void showOpenSdkShareDialog(Intent intent) {
        String str;
        try {
            if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG")) {
                final C26916m mVar = (C26916m) intent.getSerializableExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG");
                if (mVar != null) {
                    mVar.mNeedShowDialog = true;
                    if (C38526a.m85866a((C26855c) mVar)) {
                        final FragmentActivity activity = getActivity();
                        if (activity != null) {
                            if (TextUtils.isEmpty(mVar.mAppName)) {
                                str = activity.getString(R.string.dxa);
                            } else {
                                str = mVar.mAppName;
                            }
                            new C38516a(activity, str, "share saved", new C38519a() {
                                /* renamed from: b */
                                public final void mo49718b() {
                                    Intent intent = new Intent();
                                    intent.setAction("com.aweme.opensdk.action.stay.in.dy");
                                    activity.sendBroadcast(intent);
                                }

                                /* renamed from: a */
                                public final void mo49717a() {
                                    new C38525e(activity, mVar).mo78433a("Users store shared content for draft or user accounts are not allowed to post videos", 20015);
                                }
                            }).show();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if ("user/homepage".equals(r3.toString()) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void suitRouter(android.content.Intent r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            android.net.Uri r0 = r5.getData()
            if (r0 == 0) goto L_0x0041
            java.lang.String r1 = r0.getHost()
            java.lang.String r0 = r0.getPath()
            java.lang.String r2 = "mine"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0030
            java.lang.String r2 = "user/homepage"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0041
        L_0x0030:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
            java.lang.String r1 = "USER"
            r5.putExtra(r0, r1)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainActivity.suitRouter(android.content.Intent):void");
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Void lambda$getAppealStatus$19$MainActivity(C0013i iVar) throws Exception {
        if (iVar == null || iVar.mo31c() || iVar.mo33d()) {
            this.appeal.set(false);
        } else if (!(iVar == null || !iVar.mo26b() || iVar.mo34e() == null)) {
            this.mAppealDialogHelper = C27021a.f71325a.getBanAppealService().mo55250a((Activity) this, (AppealStatusResponse) iVar.mo34e());
            if (!this.mResumed || isADShowing()) {
                this.mAppealDialogHelper.mo55224a(true);
            } else {
                this.mAppealDialogHelper.mo55226b();
            }
        }
        return null;
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C41666a aVar) {
        if (C27967h.f73399a) {
            mNeedCallShowPersonalizationDialogIfNeeded = true;
        } else {
            C41667a.f105422a.mo85506a(this);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        suitRouter(intent);
        C47718bf.m103288a(new C36620c(intent));
        tryShowGuideView();
        showOpenSdkShareDialog(getIntent());
        if (!tryProcessPublish(intent, false)) {
            this.mDataCenter.mo48228a("onNewIntent", (Object) intent);
            this.stateManager.mo69860a("page_feed", false);
            enterRecordFrom3rdPlatform(intent, intent.getBooleanExtra("enter_record_from_other_platform", false));
            handleSwitchAccount(intent.getExtras());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r5.f117682e != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        return;
     */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPublishMessage(com.p683ss.android.ugc.aweme.story.model.C46656b r5) {
        /*
            r4 = this;
            int r0 = r5.f117678a
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L_0x0032
            switch(r0) {
                case 1: goto L_0x002c;
                case 2: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0031
        L_0x000a:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.f117681d
            java.lang.String r5 = r5.getAid()
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r3 = "mus_af_post_video"
            r0.trackEvent(r1, r3, r2)
            java.lang.String r0 = "UPV"
            java.lang.String r1 = "product"
            com.p683ss.android.ugc.aweme.util.C47611a.m103066a(r0, r1, r5)
            java.lang.String r0 = "fb_mobile_purchase"
            java.lang.String r1 = "product"
            com.p683ss.android.ugc.aweme.util.C47611a.m103070b(r0, r1, r5)
            goto L_0x0031
        L_0x002c:
            boolean r5 = r5.f117682e
            if (r5 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            return
        L_0x0032:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r5 = r4.stateManager
            java.lang.String r0 = "page_feed"
            r1 = 0
            r5.mo69860a(r0, r1)
            java.lang.String r5 = "start_upload"
            com.p683ss.android.ugc.aweme.util.C47611a.m103065a(r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainActivity.onPublishMessage(com.ss.android.ugc.aweme.story.model.b):void");
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C52711k.m112240b(this, "activity");
        try {
            if (VERSION.SDK_INT == 28 && bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
                if (bundle2 != null && TextUtils.equals(bundle2.getClassLoader().getClass().getName(), "java.lang.BootClassLoader")) {
                    bundle2.setClassLoader(getClassLoader());
                }
            }
        } catch (Exception unused) {
        }
        super.onRestoreInstanceState(bundle);
        bundle.getString("previousTag");
        boolean z = bundle.getBoolean("slide_switch_scanScroll");
        TabChangeManager tabChangeManager = getTabChangeManager();
        if (bundle != null) {
            if (tabChangeManager.f93538c == null) {
                tabChangeManager.f93538c = bundle.getString("cur_fragment");
                if (tabChangeManager.f93540e != null) {
                    tabChangeManager.f93540e.mo69927a(tabChangeManager.f93538c);
                }
            }
            if (tabChangeManager.f93536a == null) {
                tabChangeManager.f93536a = bundle.getString("last_fragment");
            }
        }
        getTabChangeManager().mo75615a("HOME", true);
        this.stateManager.mo69863a(z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TabChangeManager tabChangeManager = getTabChangeManager();
        bundle.putString("cur_fragment", tabChangeManager.f93538c);
        bundle.putString("last_fragment", tabChangeManager.f93536a);
        bundle.putString("previousTag", getTabChangeManager().f93538c);
        bundle.putBoolean("slide_switch_scanScroll", this.stateManager.mo69867b());
        bundle.putBoolean("should_show_slide_setting", this.stateManager.mo69877e("page_setting"));
        if (!C10181b.m20511a().mo18172a(MainUseFragmentsCacheExperiment.class, true, "enable_main_use_fragments_cache", 31744, false)) {
            bundle.putParcelable("android:support:fragments", null);
        }
    }

    /* access modifiers changed from: 0000 */
    public void showNewFeedbackAlert(final Context context) {
        C26890h.m65011a("feedback_reply_alert", C23089d.m56640a().mo47829a("uid", C20902b.m53242a().getCurUserId()).f61491a);
        new C10643a(context).mo18885a((int) R.string.br9).mo18886a((int) R.string.bvh, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C26890h.m65011a("feedback_reply_view", C23089d.m56640a().mo47829a("uid", C20902b.m53242a().getCurUserId()).f61491a);
                Intent intent = new Intent(context, FeedbackActivity.class);
                intent.putExtra("enter_from", "feedback_alert");
                context.startActivity(intent);
            }
        }).mo18900b((int) R.string.bup, (OnClickListener) null).mo18897a().mo18882b();
    }

    private void handleSwitchAccount(Bundle bundle) {
        if (bundle != null) {
            Uri uri = null;
            if (C47915gg.m103651b() && C20902b.m53242a().allUidList().size() > 1) {
                C23131p.m56692a("child_mode_multi_account", "", null);
            }
            if (mNeedCallShowPrivacySettingActivityIfNeeded && C27967h.f73399a) {
                showPrivacySettingActivityIfNeeded(this.isFirstLaunch);
            }
            if (mNeedCallShowPersonalizationDialogIfNeeded && C27967h.f73399a) {
                C41667a.f105422a.mo85506a(this);
                mNeedCallShowPersonalizationDialogIfNeeded = false;
            }
            if (mNeedCallShowUnder16DialogIfNeeded && C27967h.f73399a) {
                if (this.mHandler != null) {
                    this.mHandler.postDelayed(new C36492ag(this), 500);
                }
                mNeedCallShowUnder16DialogIfNeeded = false;
            }
            if (mNeedCallShowTermsConsentDialogIfNeeded && C27967h.f73399a) {
                showTermsConsentDialog();
                mNeedCallShowTermsConsentDialogIfNeeded = false;
            }
            C27967h.f73399a = false;
            C40861b.m90358a();
            if (!TextUtils.isEmpty(bundle.getString("switch_account_success_toast_text", null))) {
                new Handler().post(new C36493ah(bundle.getString("switch_account_success_toast_text", null)));
            }
            boolean z = bundle.getBoolean("login_jump");
            boolean z2 = bundle.getBoolean("switch_jump");
            boolean z3 = bundle.getBoolean("cancelRestoreOnMain");
            Intent intent = (Intent) bundle.getParcelable("push_intent");
            if (intent != null) {
                uri = intent.getData();
            }
            if (z3) {
                AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().cancelRestoreOnMain();
            }
            if (intent != null && (z || z2)) {
                intent.putExtra("second_jump", true);
                intent.setClass(this, DeepLinkHandlerActivity.class);
                if (uri != null) {
                    intent.setData(uri.buildUpon().appendQueryParameter("_t", String.valueOf(System.currentTimeMillis())).build());
                }
                startActivity(intent);
            }
        }
    }

    @C53771m
    public void onAwesomeSplashEvent(C26216b bVar) {
        this.mAwesomeSplashStatus = bVar.f69221a;
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        if (bVar.f69221a == 1) {
            this.mThemeRestored = false;
            this.mSplashLoadMaskHelper.mo53901a();
            getWindow().getDecorView().setBackgroundResource(R.color.a5z);
            viewGroup.setAlpha(0.0f);
        } else {
            viewGroup.setAlpha(1.0f);
            restoreTheme(true);
        }
        if (bVar.f69221a == 4) {
            if (this.mAwesomeSplashMask != null) {
                viewGroup.removeView(this.mAwesomeSplashMask);
                this.mAwesomeSplashMask = null;
            }
        } else if (this.mAwesomeSplashMask == null) {
            if (C26235d.m63570a(bVar.f69222b)) {
                getLayoutInflater().inflate(R.layout.b3f, viewGroup, true);
            } else {
                getLayoutInflater().inflate(R.layout.gu, viewGroup, true);
            }
            this.mAwesomeSplashMask = viewGroup.findViewById(R.id.f133583if);
            View findViewById = this.mAwesomeSplashMask.findViewById(R.id.ih);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C36494ai(this));
                findViewById.setOnTouchListener(new OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            long j = 0;
                            C30016ag currentViewHolder = MainActivity.this.getCurrentViewHolder();
                            if (C31186b.m72817e(currentViewHolder) && C26512f.m64070m(currentViewHolder.mo53999e())) {
                                if (MainActivity.this.getCurFragment() instanceof MainFragment) {
                                    MainFragment mainFragment = (MainFragment) MainActivity.this.getCurFragment();
                                    if (mainFragment.mo75499c() instanceof C30753ai) {
                                        C30753ai aiVar = (C30753ai) mainFragment.mo75499c();
                                        if (aiVar != null) {
                                            j = aiVar.f80590m.mo62831aF();
                                        }
                                    }
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("duration", String.valueOf(j));
                                HashMap hashMap2 = new HashMap();
                                if (C47842ed.m103485a(MainActivity.this.getBaseContext())) {
                                    hashMap2.put("click_x", String.valueOf(((float) C23724k.m58224b(MainActivity.this.getBaseContext())) - motionEvent.getRawX()));
                                } else {
                                    hashMap2.put("click_x", String.valueOf(motionEvent.getRawX()));
                                }
                                hashMap2.put("click_y", String.valueOf(motionEvent.getRawY()));
                                hashMap.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
                                Context applicationContext = MainActivity.this.getApplicationContext();
                                Aweme e = currentViewHolder.mo53999e();
                                C26088l.m63322b(applicationContext, "skip", e, C26088l.m63264a(applicationContext, e, "raw ad skip", false, (Map<String, String>) hashMap));
                            }
                        }
                        return false;
                    }
                });
            }
            this.mAwesomeSplashMask.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    C26252s.m63613a(System.currentTimeMillis());
                    if (!(MainActivity.this.mAwesomeSplashMask == null || MainActivity.this.mAwesomeSplashMask.getViewTreeObserver() == null)) {
                        MainActivity.this.mAwesomeSplashMask.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    return true;
                }
            });
        }
        if (this.mAwesomeSplashMask instanceof C26245m) {
            ((C26245m) this.mAwesomeSplashMask).onEvent(bVar);
        }
        if ((bVar.f69221a == 1 || bVar.f69221a == 2) && (getCurFragment() instanceof MainFragment)) {
            C30750af k = ((MainFragment) getCurFragment()).mo75499c();
            if (k instanceof C30753ai) {
                C30753ai aiVar = (C30753ai) k;
                if (aiVar.mo55943i()) {
                    aiVar.f80590m.mo62846aU();
                }
                exitDislikeMode();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0.isShowing() == true) goto L_0x0096;
     */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(com.p683ss.android.ugc.aweme.protection.gradientpunish.C40880b r7) {
        /*
            r6 = this;
            java.lang.String r7 = r6.getEnterFrom()
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            android.app.Dialog r0 = com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a.f104051a
            if (r0 == 0) goto L_0x001e
            android.app.Dialog r0 = com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a.f104051a
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isShowing()
            r1 = 1
            if (r0 != r1) goto L_0x001e
            goto L_0x0096
        L_0x001e:
            com.ss.android.ugc.aweme.protection.gradientpunish.GradientPunishWarning r0 = com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a.m90443b()
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            java.lang.String r1 = r0.component1()
            java.lang.String r0 = r0.component2()
            r2 = r6
            android.content.Context r2 = (android.content.Context) r2
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            r4 = 2132215195(0x7f17059b, float:2.0074253E38)
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r5)
            r4 = 2132023829(0x7f141a15, float:1.9686117E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r5 = "tvMessage"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setText(r1)
            r1 = 2132023828(0x7f141a14, float:1.9686115E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r4 = "tvConfirm"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            com.ss.android.ugc.aweme.protection.gradientpunish.a$a r0 = new com.ss.android.ugc.aweme.protection.gradientpunish.a$a
            r0.<init>(r6, r7)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r1.setOnClickListener(r0)
            com.bytedance.ies.dmt.ui.b.a$a r0 = new com.bytedance.ies.dmt.ui.b.a$a
            r0.<init>(r2)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.mo18897a()
            android.app.Dialog r0 = r0.mo18882b()
            r0.setContentView(r3)
            r1 = 0
            r0.setCancelable(r1)
            r0.show()
            com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a.f104051a = r0
            java.lang.String r0 = "violation_dialog_show"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r7 = r1.mo47829a(r2, r7)
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r7)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainActivity.onEvent(com.ss.android.ugc.aweme.protection.gradientpunish.b):void");
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onWindowFocusChanged", true);
        if (z) {
            C22574a.m55738f().mo46921b("cold_boot_main_measure_to_focus", false);
            C22574a.m55738f().mo46921b("cold_boot_main_resume_to_focus", true);
            C22574a.m55738f().mo46917a("cold_boot_main_focus_duration", true);
        }
        super.onWindowFocusChanged(z);
        this.isFirstLaunch = false;
        if (z && this.mIsFirstVisible) {
            ((MainLooperOptService) C35857a.m80997a(MainLooperOptService.class)).updateState(C35922a.WATCH_ON_DRAW);
            this.mIsFirstVisible = false;
            C18842a.m45933a(new C36751v(this), 300);
            if (!appsFlyerisInit) {
                C18842a.m45933a(new C36752w(this), 200);
            }
            this.isFirstLaunch = true;
            C22267i.m55117a();
            onStartUp();
        }
        if (C40869c.f104035d.mo83205f()) {
            C41667a.m91526a((Context) this, C36753x.f93925a);
        }
        if (z) {
            if (!C18993n.f52298b && C22574a.m55738f().f60703d) {
                C18993n.f52298b = true;
                C22574a.m55738f().mo46924c("wait_sp_load", C18993n.f52297a, false);
            }
            C22574a.m55738f().mo46921b("app_start_to_main_focus", true);
            C22574a.m55738f().mo46921b("cold_boot_main_focus_duration", true);
            C40861b.m90358a();
            if (C35857a.m81010f()) {
                C30514a b = C30515a.m71483b();
                if (C30514a.f79743j && !b.f79753a && !b.f79754b) {
                    b.f79753a = true;
                    if (!C52711k.m112239a((Object) C30514a.f79746m, (Object) C30514a.m71479a())) {
                        C30514a.f79746m = C30514a.m71479a();
                    }
                    Looper.getMainLooper().setMessageLogging(C30514a.f79750q);
                }
                if (!this.hasFirstRefresh) {
                    this.hasFirstRefresh = true;
                    C35857a.m80999a(C35999r.m81182b());
                    C51522a.m110657b().mo103703a("first_refresh");
                }
            }
        } else {
            C22574a.m55738f().mo46914a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onBottomTabClick */
    public void bridge$lambda$0$MainActivity(String str) {
        if (!this.mDialogShowingManager.mo86222f()) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 2223327) {
                if (hashCode == 482617583 && str.equals("PUBLISH")) {
                    c = 1;
                }
            } else if (str.equals("HOME")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    this.stateManager.mo69863a(true);
                    refreshSlideSwitchCanScrollRight();
                    setAdScrollRightControl();
                    return;
                case 1:
                    long currentTimeMillis = System.currentTimeMillis();
                    C45407ay.m98973d("click to open camera");
                    C47848eg.f120415a = System.currentTimeMillis();
                    AVExternalServiceImpl.getAVServiceImpl_Monster().provideAVPerformance().start("av_video_record_init", "clickRecordBtn");
                    if (System.currentTimeMillis() - this.mFirstClickPublish >= 500) {
                        IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
                        if (!aVServiceImpl_Monster.publishService().isPublishing() || !aVServiceImpl_Monster.publishService().isPublishServiceRunning(getActivity())) {
                            if (C10181b.m20511a().mo18172a(StopVideoPlayerWhenClickPlusIcon.class, true, "enable_stop_video_player", 31744, false)) {
                                C48121w.m104249M().mo95292y();
                            }
                            C18898c.m46011a(getActivity(), "record", "click", 0, 0, new C26898j().mo54849a("record_mode", "direct").mo54850a());
                            if (C20902b.m53242a().isLogin() || C10181b.m20511a().mo18168a(ShowLoginDialogWhenClickPublishTabExperiment.class, true, "un_logined_click_ask_login", 31744, 0) != 1) {
                                String str2 = "";
                                if ("HOME".equals(getTabChangeManager().f93538c)) {
                                    MainFragment mainFragment = (MainFragment) getTabChangeManager().mo75609a();
                                    if (mainFragment != null && (mainFragment.mo75499c() instanceof C30753ai)) {
                                        str2 = C29981aa.m70153a().mo60161a(C23198ae.m56872j(C42424ao.INSTANCE.getVideoId()));
                                    }
                                }
                                String uuid = UUID.randomUUID().toString();
                                mobShoot(uuid, str2);
                                C30578o.m71566a(C29988ad.MUSICAL);
                                Builder translationType = new Builder().creationId(uuid).shootWay("direct_shoot").groupId(C23208an.m56933a()).enterFrom(getEnterFrom()).fromMain(true).startRecordTime(currentTimeMillis).musicType(1).translationType(3);
                                if (shouldRecordWithSticker()) {
                                    translationType.stickers(C41941ab.m91890a(this.homeViewModel.f85656j.getStickerIDs()));
                                }
                                AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C36676r(this, translationType));
                                this.mFirstClickPublish = System.currentTimeMillis();
                                break;
                            } else {
                                C27965f.m66719a((Activity) this, this.homeViewModel.mo69848a(), "click_shoot");
                                return;
                            }
                        } else {
                            C10691a.m21548c((Context) getActivity(), (int) R.string.hr).mo19066a();
                            return;
                        }
                    } else {
                        return;
                    }
                    break;
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onShowPolicyNoticeDialogEvent(C39503a aVar) {
        C39516a aVar2 = new C39516a(this, aVar.f101053a);
        C10643a a = new C10643a(aVar2.f101092c).mo18906c().mo18892a(aVar2.f101093d.f101061d);
        String str = aVar2.f101093d.f101062e;
        C52711k.m112240b(str, "body");
        CharSequence a2 = C52830p.m112401a(str, "\n", "\n\n", false, 4, (Object) null);
        SpannableString spannableString = new SpannableString(a2);
        Matcher matcher = Pattern.compile("\n\n").matcher(a2);
        while (matcher.find()) {
            spannableString.setSpan(new AbsoluteSizeSpan(7, true), matcher.start() + 1, matcher.end(), 33);
        }
        a.f28276g = spannableString;
        C10643a a3 = a.mo18890a((C10658a) new C39521e(aVar2)).mo18905b(false).mo18888a((OnDismissListener) new C39522f(aVar2)).mo18894a(((C39507b) aVar2.f101093d.f101063f.get(0)).f101065a, (OnClickListener) new C39523g(aVar2), true);
        if (aVar2.f101093d.f101063f.size() > 1) {
            a3.mo18904b(((C39507b) aVar2.f101093d.f101063f.get(1)).f101065a, (OnClickListener) new C39518b(aVar2), true);
        }
        if (aVar2.f101093d.f101063f.size() > 2) {
            a3.mo18909c(((C39507b) aVar2.f101093d.f101063f.get(2)).f101065a, new C39519c(aVar2), true);
        }
        if (!TextUtils.isEmpty(aVar2.f101093d.f101064g)) {
            SmartImageView smartImageView = new SmartImageView(aVar2.f101092c);
            smartImageView.setScaleType(ScaleType.CENTER_CROP);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C52575l.m112092a(aVar2.f101093d.f101064g));
            urlModel.setWidth(C23728o.m58241a(48.0d));
            urlModel.setHeight(C23728o.m58241a(48.0d));
            C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23125b(C47788ct.m103417a(201)).mo23119a(true).mo23116a((C12197k) smartImageView).mo23122a((C12175j) new C39520d(smartImageView));
            a3.mo18889a((View) smartImageView, 48, 48);
        }
        aVar2.f101091b = a3.mo18897a();
        C10641a aVar3 = aVar2.f101091b;
        if (aVar3 != null) {
            aVar3.mo18883c();
        }
        C26890h.m65011a("tns_general_dialog_show", C23089d.m56640a().mo47829a("business", aVar2.f101093d.f101058a).mo47829a("style", "pop").f61491a);
    }

    @C53771m
    public void onVideoPageChangeEvent(C30315ag agVar) {
        String str;
        String str2;
        if (agVar.f79203a != null) {
            if (SymphonyAdManager.m63648a().mo53957b(this, agVar.f79203a, null)) {
                this.stateManager.mo69857a((C23638a) this.scrollFullChecker);
                C2676c a = SymphonyAdManager.m63648a().mo53950a(agVar.f79203a);
                if (C2713g.m7767a() && a != null) {
                    C2713g.m7764a("show", a);
                    return;
                }
                return;
            }
            String authorUid = agVar.f79203a.getAuthorUid();
            this.homeViewModel.f85656j = agVar.f79203a;
            if (this.homeViewModel.f85656j != null) {
                str = this.homeViewModel.f85656j.getAid();
            } else {
                str = "";
            }
            C23208an.f61753a = str;
            C23229c.f61981b = authorUid;
            if (this.homeViewModel.f85656j != null) {
                str2 = this.homeViewModel.f85656j.getAid();
            } else {
                str2 = "";
            }
            C23229c.f61980a = str2;
            if (!TextUtils.equals(this.homeViewModel.f85651e, authorUid)) {
                this.homeViewModel.f85651e = authorUid;
                this.adViewController.mo53240a((Context) this, agVar.f79203a);
                this.adViewController.mo53252h();
                if (!this.adViewController.mo53244a() || this.adViewController.mo53248d()) {
                    C18842a.m45933a(new Runnable() {
                        public final void run() {
                            if (!MainActivity.this.isFinishing() && MainActivity.this.homeViewModel != null) {
                                HomePageDataViewModel homePageDataViewModel = MainActivity.this.homeViewModel;
                                Aweme aweme = MainActivity.this.homeViewModel.f85656j;
                                homePageDataViewModel.f85652f = aweme;
                                if (aweme != null) {
                                    Aweme aweme2 = homePageDataViewModel.f85652f;
                                    if (aweme2 != null) {
                                        aweme2.setIsPreloadScroll(false);
                                    }
                                }
                            }
                        }
                    }, 300);
                }
                setAdScrollRightControl();
                C50351a.m108630a().mo98255b(getActivity());
                C27012a aVar = C27012a.f71322a;
                Aweme aweme = agVar.f79203a;
                C52711k.m112240b(aweme, "aweme");
                if ((TimeLockRuler.isTeenModeON() || C47915gg.m103651b()) && (aweme.isAd() || aweme.isLive())) {
                    String str3 = "aweme_child_mode";
                    String str4 = "";
                    C23088c a2 = C23088c.m56631a().mo47824a("itemID", aweme.getAid()).mo47824a("log_id", aweme.getRequestId());
                    String str5 = "type";
                    int i = -1;
                    if (aweme.isAd()) {
                        i = 0;
                    }
                    if (aweme.isLive()) {
                        i = 1;
                    }
                    C23131p.m56692a(str3, str4, a2.mo47822a(str5, Integer.valueOf(i)).mo47825b());
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        int i;
        boolean z;
        boolean z2;
        Bundle bundle2 = bundle;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", true);
        C32961a aVar = this.mActivityProxy;
        C52711k.m112240b(this, "activity");
        C22574a.m55738f().mo46921b("cold_boot_application_to_main", true);
        C22574a.m55738f().mo46917a("cold_boot_main_create_duration", true);
        if (C35857a.f92063h != C35858a.COLD_BOOT_BEGIN) {
            C35857a.f92063h = C35858a.HOT_BOOT_BEGIN;
        }
        C52711k.m112240b(this, "activity");
        FragmentActivity fragmentActivity = this;
        aVar.f85639a = C32964a.m75869a(fragmentActivity);
        C0184k kVar = this;
        aVar.f85640b = DataCenter.m57235a(C0214z.m440a(fragmentActivity), kVar);
        aVar.f85641c = C32969a.m75907a(fragmentActivity);
        C52711k.m112240b(fragmentActivity, "activity");
        Activity activity = fragmentActivity;
        C52711k.m112240b(activity, "activity");
        C35884a aVar2 = C35857a.f92060e;
        C52711k.m112240b(activity, "activity");
        aVar2.f92098b.put(activity.getClass(), new WeakReference(activity));
        C35857a.m81003c().mo74513a(X2CActivityMain.class).mo74513a(X2CFragmentMainPage.class).mo74513a(X2CFragmentMain.class).mo74513a(X2CFragmentFeed.class).mo74513a(X2CItemFeed.class).mo74513a(SwipUpGuideInflate.class).mo74514a();
        C52711k.m112240b(fragmentActivity, "activity");
        Intent intent = fragmentActivity.getIntent();
        Boolean bool = null;
        try {
            str = intent.getStringExtra("id");
        } catch (Throwable unused) {
            str = null;
        }
        try {
            str2 = intent.getStringExtra("ids");
        } catch (Throwable unused2) {
            str2 = null;
        }
        try {
            str3 = intent.getStringExtra("push_params");
        } catch (Throwable unused3) {
            str3 = null;
        }
        C32968a aVar3 = C32964a.m75869a(fragmentActivity).f85648b;
        if (aVar3 != null) {
            aVar3.f85663a = str;
            aVar3.f85664b = str2;
            aVar3.f85665c = str3;
        }
        C52711k.m112240b(fragmentActivity, "activity");
        Activity activity2 = this;
        C52711k.m112240b(activity2, "activity");
        String string = C35807d.m80935a(C11010c.m22280a(), "applog_stats", 0).getString("app_track", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                C41302w.m91042a().mo83858a(activity2, new JSONObject(string).optString("openurl"));
            } catch (JSONException unused4) {
            }
        }
        Context context = this;
        AudioUtils.m57300e(context);
        C48114q.m104225a();
        this.stateManager = ScrollSwitchStateManager.m75876a((FragmentActivity) this);
        this.homeViewModel = this.mActivityProxy.f85639a;
        this.mDataCenter = this.mActivityProxy.f85640b;
        this.mRestartFromLogout = getIntent().getBooleanExtra("restart_from_logout", false);
        C35857a.m81005d().mo74519a(new C41250b()).mo74519a(new C41254d()).mo74520a();
        if (!C10181b.m20511a().mo18172a(AwesomeSplashCidColdStartUploadExperiment.class, true, "cold_start_upload_topview_cid_enabled", 31744, false) && !C10181b.m20511a().mo18172a(DefaultFeedExperiment.class, true, "force_show_default_feed", 31744, false)) {
            C35857a.m81005d().mo74519a(new C41243a()).mo74520a();
        }
        C32961a aVar4 = this.mActivityProxy;
        C52711k.m112240b(this, "activity");
        C52711k.m112240b(this, "activity");
        if (bundle2 != null) {
            HomePageDataViewModel homePageDataViewModel = aVar4.f85639a;
            if (homePageDataViewModel != null) {
                homePageDataViewModel.f85647a = bundle2.getBoolean("should_show_slide_setting");
            }
        }
        C22574a.m55738f().mo46917a("feed_lego_add_to_request", false);
        C22574a.m55738f().mo46917a("method_create_welcome_duration", false);
        if (C35781s.f91909n.mo74441e() && !C35781s.f91897b) {
            C35715a.m80706a(this, true);
        }
        C22574a.m55738f().mo46921b("method_create_welcome_duration", false);
        C41529a aVar5 = C41528ai.f105215g;
        C52711k.m112240b(this, "activity");
        if (VERSION.SDK_INT >= 21 && C23859b.m58575b().mo49472b(C11010c.m22280a(), "KEY_UPDATE_IN_PROGRESS", false)) {
            C41529a aVar6 = aVar5;
            C41529a.m91358a(this, "");
        }
        C32980a.m75920a();
        suitRouter(getIntent());
        C26217c.m63502a().f69232i = true;
        C26217c.m63502a().mo53859a(getIntent());
        handleSwitchAccount(getIntent().getExtras());
        if (bundle2 != null) {
            i = R.style.a8;
        } else {
            i = R.style.a9;
        }
        C52711k.m112240b(this, "activity");
        setTheme(i);
        C22574a.m55738f().mo46917a("method_main_super_duration", false);
        super.onCreate(bundle);
        C22574a.m55738f().mo46921b("method_main_super_duration", false);
        C26237e.m63579b().f69280g = true;
        C26237e.m63579b().mo53889a(getIntent());
        C26217c.m63502a().f69234k = true;
        C22574a.m55738f().mo46917a("method_splash_try_show_ad_duration", false);
        if (SplashAdManagerHolder.m99462a()) {
            C22574a.m55738f().mo46917a("get_splash_manager", false);
            C18769p a = SplashAdManagerHolder.m99458a((Context) this);
            C22574a.m55738f().mo46921b("get_splash_manager", false);
            C22574a.m55738f().mo46917a("has_splash_ad", false);
            z = a.mo38115e();
            C22574a.m55738f().mo46921b("has_splash_ad", false);
        } else {
            z = false;
        }
        if (!C26443bw.m63933a((Context) this, z) && z) {
            SplashAdActivity.f115511a.mo92142a(this);
        }
        C22574a.m55738f().mo46921b("method_splash_try_show_ad_duration", false);
        if (C10181b.m20511a().mo18172a(AwesomeSplashCidColdStartUploadExperiment.class, true, "cold_start_upload_topview_cid_enabled", 31744, false) && !C10181b.m20511a().mo18172a(DefaultFeedExperiment.class, true, "force_show_default_feed", 31744, false)) {
            C35857a.m81005d().mo74519a(new C41243a()).mo74520a();
        }
        DataCenter dataCenter = this.mDataCenter;
        String str4 = "start_from_logout_or_switch";
        if (getIntent().getBooleanExtra("restart_from_logout", false) || getIntent().getBooleanExtra("is_start_by_switch_account", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        dataCenter.mo48228a(str4, (Object) Boolean.valueOf(z2));
        C32961a aVar7 = this.mActivityProxy;
        C52711k.m112240b(this, "activity");
        C52711k.m112240b(this, "activity");
        NewsCountPresenter newsCountPresenter = aVar7.f85642d;
        newsCountPresenter.f85637b = new MsgCountBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.msg.count.action.arrived");
        intentFilter.addAction("message_stranger_mark_read_action");
        C0732g.m2130a(C11010c.m22280a()).mo2403a(newsCountPresenter.f85637b, intentFilter);
        if (!NewsCountPresenter.f85636a) {
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    int i;
                    if (NewsCountPresenter.f85636a) {
                        i = 1;
                    } else {
                        i = 5;
                    }
                    C38046d.m85101a(false, i);
                }
            });
        }
        NewsCountPresenter.f85636a = false;
        C52711k.m112240b(this, "activity");
        X2CActivityMain x2CActivityMain = (X2CActivityMain) C35857a.m81002b(X2CActivityMain.class);
        C22574a.m55738f().mo46917a("method_main_set_content_view_duration", false);
        setContentView(x2CActivityMain.getView(context, R.layout.bbk));
        C22574a.m55738f().mo46921b("method_main_set_content_view_duration", false);
        C52711k.m112240b(this, "activity");
        C32982a.f85702a = (ScrollableViewPager) findViewById(R.id.ds2);
        C23700a builderForFragmentInHomePageActivity = HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().getBuilderForFragmentInHomePageActivity();
        builderForFragmentInHomePageActivity.f63219b = new C32989f(this);
        C32982a.f85703b = builderForFragmentInHomePageActivity.mo49128a(getSupportFragmentManager());
        ScrollableViewPager scrollableViewPager = C32982a.f85702a;
        C52711k.m112240b(fragmentActivity, "activity");
        if (scrollableViewPager != null) {
            scrollableViewPager.setOffscreenPageLimit(2);
        }
        ScrollableViewPager scrollableViewPager2 = C32982a.f85702a;
        if (scrollableViewPager2 != null) {
            scrollableViewPager2.setAdapter(C32982a.f85703b);
        }
        C23699m mVar = C32982a.f85703b;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
        ScrollableViewPager scrollableViewPager3 = C32982a.f85702a;
        if (scrollableViewPager3 != null) {
            scrollableViewPager3.setDescendantFocusability(131072);
        }
        ScrollableViewPager scrollableViewPager4 = C32982a.f85702a;
        if (scrollableViewPager4 != null) {
            scrollableViewPager4.setFocusable(true);
        }
        ScrollableViewPager scrollableViewPager5 = C32982a.f85702a;
        if (scrollableViewPager5 != null) {
            scrollableViewPager5.setFocusableInTouchMode(true);
        }
        ScrollableViewPager scrollableViewPager6 = C32982a.f85702a;
        if (scrollableViewPager6 != null) {
            scrollableViewPager6.setOnTouchListener(C32990g.f85710a);
        }
        ScrollableViewPager scrollableViewPager7 = C32982a.f85702a;
        if (scrollableViewPager7 != null) {
            scrollableViewPager7.mo2957a((C0997e) new C32991h(this));
        }
        ScrollableViewPager scrollableViewPager8 = C32982a.f85702a;
        if (scrollableViewPager8 != null) {
            scrollableViewPager8.setOnFlingEndListener(new C32992i(this));
        }
        C52711k.m112240b(this, "activity");
        ScrollSwitchStateManager a2 = C32969a.m75907a(fragmentActivity);
        a2.mo69858a((C32974c) new C32983a());
        a2.mo69856a(kVar, (C0199s<Boolean>) C32984b.f85704a);
        a2.f85672e.observe(kVar, C32985c.f85705a);
        a2.mo69866b(kVar, C32986d.f85706a);
        a2.mo69880g(kVar, C32988e.f85708a);
        this.mAdapter = C32982a.f85703b;
        this.mViewPager = C32982a.f85702a;
        this.mScrollSwitchHelper = new C36636ed(this, this.mViewPager, this.mAdapter);
        C32961a aVar8 = this.mActivityProxy;
        C52711k.m112240b(this, "activity");
        HomePageDataViewModel homePageDataViewModel2 = aVar8.f85639a;
        if (homePageDataViewModel2 != null) {
            homePageDataViewModel2.mo69849a("homepage_hot");
        }
        ScrollSwitchStateManager scrollSwitchStateManager = aVar8.f85641c;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.mo69860a("page_feed", false);
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = aVar8.f85641c;
        if (scrollSwitchStateManager2 != null) {
            C0199s aVar9 = new C32962a(this);
            C52711k.m112240b(kVar, "owner");
            C52711k.m112240b(aVar9, "observer");
            scrollSwitchStateManager2.f85668a.observe(kVar, aVar9);
        }
        ScrollSwitchStateManager scrollSwitchStateManager3 = aVar8.f85641c;
        if (scrollSwitchStateManager3 != null) {
            scrollSwitchStateManager3.mo69872c(kVar, new C32963b(aVar8));
        }
        HomePageDataViewModel homePageDataViewModel3 = aVar8.f85639a;
        if (homePageDataViewModel3 != null) {
            bool = Boolean.valueOf(homePageDataViewModel3.f85647a);
        }
        if (bool == null) {
            C52711k.m112234a();
        }
        if (bool.booleanValue()) {
            ScrollSwitchStateManager scrollSwitchStateManager4 = aVar8.f85641c;
            if (scrollSwitchStateManager4 != null) {
                scrollSwitchStateManager4.mo69879f("page_setting");
            }
        }
        initDislikeView();
        C41589c.m91432a().mo85304a((C41522ac) this);
        this.stateManager.mo69878f(this, new C36498am(this));
        createMainHelper();
        String handleIntent = handleIntent();
        getWindow().setSoftInputMode(32);
        if (TextUtils.equals(C11010c.m22295p(), "local_test")) {
            C23338a.m57402a(this);
        }
        if (!"NOTIFICATION".equals(handleIntent) || C20902b.m53242a().isLogin()) {
            this.showToast = true;
            C20854a.m53161a().addLoginOrLogoutListener(C36499an.f93570a);
            feedOVVMainActivityCreate();
            setupSlideSwitchLayout(handleIntent);
            checkJiraPermission();
            initMLModel();
            injectVideoInfo();
            setupEagleEyeAndDownloaderManager();
            ensureLazyDoItFinallyCalled();
            if (bundle2 == null) {
                changeTag(handleIntent);
            }
            if (!TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") || getIntent().getCategories() == null || getIntent().getCategories().size() <= 0 || !getIntent().getCategories().contains("android.intent.category.LAUNCHER") || isTaskRoot()) {
                C47835dx.f120394b = getClass();
                checkGcmMessage();
                C0013i.m18a(C36500ao.f93571a, (Executor) C24076h.m58904e());
                addLegoRequestTask();
                C35857a.m81001b().mo74526a(new ShareCacheRegisterTask()).mo74526a(new ReportActivityStatusTask(TAG, bundle2)).mo74526a(new TileTask()).mo74526a(new RegisterStorageTask()).mo74526a(new ImUnder16InitTask()).mo74526a(new RecommendUserDialogTask()).mo74526a(new CookieMonitorTask()).mo74527a();
                AVCameraInitManager.m90984a(0, false);
                larksso();
                cleanEffects();
                C22574a.m55738f().mo46921b("cold_boot_main_create_duration", true);
                C22574a.m55738f().mo46917a("cold_boot_main_create_to_resume", true);
                this.mDialogShowingManager = C42245a.m92680a((Context) this);
                this.firstCreated = true;
                if (VERSION.SDK_INT == 28 && "45005".equals(C23726m.m58235a()) && C0726c.m2090a(C11010c.m22280a(), "android.permission.READ_PHONE_STATE") != 0) {
                    C0636b.m1718a(this, new String[]{"android.permission.READ_PHONE_STATE"}, 109);
                }
                Intent intent2 = getIntent();
                if (intent2.getBooleanExtra("jumpToGame", false)) {
                    C36983a.m83185b().mo76294a().openMiniApp((Context) this, C36949e.m83165a("", intent2.getStringExtra("gameId"), true, ""), new C36961a().mo76222b("schema").mo76221a());
                }
                if (C10181b.m20511a().mo18172a(OnlineCoverageExperiment.class, true, "code_coverage", 31744, false)) {
                    CoverageHandler.init(C41204a.f104644a);
                }
                C35857a.m81001b().mo74526a(new DfDummyInitTask()).mo74527a();
                boolean hasExtra = intent2.hasExtra("enable_optimize_main_not_in_stack");
                StringBuilder sb = new StringBuilder("ProcessPublish MainActivityCreate isMainNotInStackPublish:");
                sb.append(hasExtra);
                C47625i.m103103a(sb.toString());
                if ((bundle2 == null && hasExtra) || Publish.isNeedProcessPublish) {
                    Publish.isNeedProcessPublish = false;
                    tryProcessPublish(intent2, true);
                }
                observePageActionForAD();
                showOpenSdkShareDialog(getIntent());
                if (OptFirstFrameTask.enableFirstFrameOpt) {
                    OptFirstFrameTask.enableFirstFrameOpt = false;
                    C35857a.m81001b().mo74526a(new OptFirstFrameTask()).mo74527a();
                }
                C35857a.m81001b().mo74526a(new PreCreatePlayerTask()).mo74526a(new FetchImUnder16RequestTask()).mo74527a();
                if (!C38851d.f98955b) {
                    C38851d.f98955b = true;
                    if (C10181b.m20511a().mo18168a(PlayeAbBackgroundReleaseCodecEnableExp.class, true, "player_background_release_codec_res", 31744, 0) == 1) {
                        C38851d.f98956c = C10181b.m20511a().mo18169a(PlayeAbBackgroundReleaseCodecCountdownDurationExp.class, true, "player_background_release_codec_res_countdown_duration", 31744, 30000);
                        C38851d.f98954a.mo6181a(C11016e.m22309d().mo6545f((C1710e<? super T>) C38853b.f98959a));
                    }
                }
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                return;
            }
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
            return;
        }
        C27965f.m66719a((Activity) this, getEnterFrom(), "click_message");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$null$14$MainActivity(DialogInterface dialogInterface, int i) {
        cancelRestoreDialog(dialogInterface);
    }

    private void enterRecordFrom3rdPlatform(Intent intent, boolean z) {
        if (z) {
            C18898c.m46009a(getApplicationContext(), "protect", "record_on");
            boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
            RecordConfig recordConfig = (RecordConfig) intent.getSerializableExtra("EXTRA_AV_RECORD_CONFIG");
            if (booleanExtra) {
                AwemeAppData.m47851a().f61131i = true;
            }
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C36750u(this, recordConfig));
        }
    }

    private void mobShoot(String str, String str2) {
        C23089d a = C23089d.m56640a().mo47829a("creation_id", str).mo47829a("shoot_way", "direct_shoot").mo47829a("enter_from", getEnterFrom()).mo47829a("group_id", C23208an.m56933a()).mo47826a("_staging_flag", 1);
        if (C40906h.m90485a().mo83391b(C23208an.m56933a())) {
            a.mo47829a("previous_page", "push");
        }
        if (!TextUtils.isEmpty(str2)) {
            a.mo47829a("log_pb", str2);
        }
        C26890h.m65011a("shoot", a.f61491a);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$null$16$MainActivity(DialogInterface dialogInterface, int i) {
        AnchorListManager.m62138a();
        C18898c.m46009a(getApplicationContext(), "protect", "record_on");
        C23208an.m56934a(getEnterFrom());
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C36497al(this, new Builder().shootWay("restore_crash").restoreType(2).creationId(UUID.randomUUID().toString())));
        dialogInterface.dismiss();
    }

    private boolean tryProcessPublish(Intent intent, boolean z) {
        Activity[] activityStack;
        boolean z2;
        StringBuilder sb = new StringBuilder("ProcessPublish tryProcessPublish isOnCreate:");
        sb.append(z);
        C47625i.m103103a(sb.toString());
        if (z) {
            for (Activity activity : ActivityStack.getActivityStack()) {
                if (!(activity instanceof MainActivity)) {
                    activity.finish();
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sb2 = new StringBuilder("ProcessPublish finishActivity isFinish:");
                sb2.append(z2);
                sb2.append(" activity:");
                sb2.append(activity.getClass().getName());
                C47625i.m103103a(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder("MainActivity.onNewIntent()");
        sb3.append(intent.getExtras());
        sb3.append(" isOnCreate:");
        sb3.append(z);
        C47625i.m103103a(sb3.toString());
        StringBuilder sb4 = new StringBuilder("MainActivity.onNewIntent()");
        sb4.append(intent.getExtras());
        C26890h.m65011a("av_video_memory", C23089d.m56640a().mo47829a("log", sb4.toString()).mo47828a("isOnCreate", (Object) Boolean.valueOf(z)).f61491a);
        if (!AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().processPublish(this, intent)) {
            return false;
        }
        if (!intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT")) {
            changeTabToFollowAfterPublish();
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mActivityOnKeyDownListeners != null) {
            for (C23422a onKeyDown : this.mActivityOnKeyDownListeners) {
                if (onKeyDown.onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        boolean z = false;
        if (i == 4) {
            if (this.stateManager.mo69868b("page_discover")) {
                ScrollSwitchStateManager scrollSwitchStateManager = this.stateManager;
                String str = "page_discover";
                C52711k.m112240b(str, "pageName");
                C23689d d = scrollSwitchStateManager.mo69873d(str);
                if (d != null && d.mo49107a()) {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
            Fragment a = getTabChangeManager().mo75609a();
            if (a != null && (a instanceof FriendTabFragment)) {
                HotSearchAndDiscoveryFragment2 f = ((FriendTabFragment) a).mo77356f();
                if (f != null && f.mo58066r()) {
                    return true;
                }
            }
            if (this.mScrollSwitchHelper.mo75735a()) {
                return true;
            }
            if (getTabChangeManager().mo75609a() == null || !(getTabChangeManager().mo75609a() instanceof C40205b)) {
                refreshWhenBack();
                return super.onKeyDown(i, keyEvent);
            }
            refreshWhenBack();
            return super.onKeyDown(i, keyEvent);
        } else if (i != 67) {
            return false;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$enterRecordFrom3rdPlatform$8$MainActivity(RecordConfig recordConfig, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this, recordConfig);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$null$15$MainActivity(Builder builder, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this, builder.build());
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onBottomTabClick$0$MainActivity(Builder builder, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this, builder.build());
        I18nBridgeService.getBridgeService_Monster().changeStatusBarMainTab(this, "PUBLISH");
    }

    public void onPublishServiceConnected(C44371e eVar, ServiceConnectionImpl serviceConnectionImpl, Object obj) {
        C22574a.m55738f().mo46914a();
        C47718bf.m103288a(new C46656b(-1, null, null, null));
        if (this.processedCallback != null) {
            this.processedCallback.onStartPublish();
        }
        I18nBridgeService.getBridgeService_Monster().hideUploadRecover();
        I18nBridgeService.getBridgeService_Monster().showPublishDialogFragment(obj, getSupportFragmentManager(), eVar);
        getSupportFragmentManager().mo2229a((C0655a) new C39663l(this, serviceConnectionImpl, eVar, this.processedCallback), false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 16) {
            if (i == 17) {
                C20854a.m53162b().logout("user_banned", "user_banned");
            }
            if (i == 18 && i2 == -1 && intent != null) {
                startActivity(intent);
            }
            if (i == 19 && i2 == -1) {
                C41529a.m91360a("app_update_click");
            }
            if (i == 1 && i2 == 2 && this.mViewPager != null) {
                this.stateManager.mo69860a("page_profile", false);
            }
            if (i2 == 10) {
                if (intent.getIntExtra("result", -1) == 0) {
                    C10691a.m21535a((Context) this, (int) R.string.cvz, 1, 2).mo19066a();
                }
                C40878a.m90441a();
                return;
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        showCustomToast(str, i2, i3);
    }

    public static void onAccountResult(int i, boolean z, int i2, User user) {
        PolarisInitTask.ensuareInit();
        if (PolarisInitTask.isPolarisInit()) {
            C12559e g = C12563i.m25225g();
            g.mo23618c();
            if (g != null && !g.mo23618c()) {
                C12571a.m25236c().mo23633b();
            }
        }
        int a = C10181b.m20511a().mo18168a(AccountExperiment.class, false, "account_service_type", 31744, 3);
        if (a == 3 || a == 2) {
            if (C40896e.m90465a(C11010c.m22280a())) {
                C40893b.m90462a();
                return;
            }
            C19073a.m46451a().initPushAccountService(C20902b.m53242a().isLogin());
        }
    }
}
