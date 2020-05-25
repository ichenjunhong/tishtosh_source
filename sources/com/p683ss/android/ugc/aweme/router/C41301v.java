package com.p683ss.android.ugc.aweme.router;

import com.bytedance.p558e.C9741d;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22730b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22732d;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeDetailActivity;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.CreateChallengeActivity;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.feedback.FeedbackActivity;
import com.p683ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IAddFriendsActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.InviteUserListActivity;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicDetailActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.router.C41302w.C41308a;
import com.p683ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.p683ss.android.ugc.aweme.setting.experiment.C41602d;
import com.p683ss.android.ugc.aweme.setting.p2148ui.AboutActivity;
import com.p683ss.android.ugc.aweme.setting.p2148ui.TestSettingActivity;
import com.p683ss.android.ugc.aweme.setting.personalization.PersonalizationActivity;
import com.p683ss.android.ugc.aweme.splash.SplashActivity;
import com.p683ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity;
import com.p683ss.android.ugc.trill.setting.PushSettingActivity;

/* renamed from: com.ss.android.ugc.aweme.router.v */
public final class C41301v implements C41308a {
    /* renamed from: a */
    public final void mo83857a() {
        C41302w.f104753e = ((Boolean) C9741d.m19510a("smart_router_enable", Boolean.class, new C41602d().mo17563a(), false, false)).booleanValue();
        C41302w.m91044a("aweme://main", SplashActivity.class);
        C41302w.m91044a("aweme://setting", I18nBridgeService.getBridgeService_Monster().getSettingActivityClass());
        C41302w.m91044a("aweme://privacy/setting/personalization", PersonalizationActivity.class);
        C41302w.m91044a("aweme://privacy/setting", I18nBridgeService.getBridgeService_Monster().getPrivacySettingActivity());
        C41302w.m91044a("aweme://push-setting", PushSettingActivity.class);
        C41302w.m91044a("aweme://account/setting", I18nSettingManageMyAccountActivity.class);
        C41302w.m91044a("aweme://test_setting", TestSettingActivity.class);
        C41302w.m91044a("aweme://profile_edit", ProfileEditActivity.class);
        C41302w.m91044a("aweme://draft_box", AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService().getDraftBoxActivity());
        C41302w.m91044a("aweme://about_activity", AboutActivity.class);
        C41302w.m91044a("aweme://challenge/create", CreateChallengeActivity.class);
        C41302w.m91044a("aweme://challenge/detail/:id", ChallengeDetailActivity.class);
        C41302w.m91044a("aweme://music/detail/:id", MusicDetailActivity.class);
        C41302w.m91044a("aweme://user/profile/:uid", UserProfileActivity.class);
        C41302w.m91044a("aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type", UserProfileActivity.class);
        C41302w.m91044a("aweme://aweme/detail/:id", DetailActivity.class);
        C41302w.m91044a("aweme://aweme/detaillist/:ids", DetailActivity.class);
        C41302w.m91044a("aweme://webview/", CrossPlatformActivity.class);
        C41302w.m91044a("aweme://reactnative/", CrossPlatformActivity.class);
        C41302w.m91044a("aweme://user/invite", IAddFriendsActivity.class);
        C41302w.m91044a("aweme://webview/", CrossPlatformActivity.class);
        C41302w.m91044a("aweme://friend/find", InviteUserListActivity.class);
        C41302w.m91042a();
        C41302w.m91043a("aweme://aweme/challenge/detail/", (C41288m) new C41298s(C41276f.f104728a));
        C41302w.m91042a();
        C41302w.m91043a("aweme://teen_protection", (C41288m) new C22732d());
        C41302w.m91042a();
        C41302w.m91043a("aweme://privacy/setting/modify/", (C41288m) new C22730b());
        C41302w.m91044a("aweme://aweme/forward/:forward_id", ForwardDetailActivity.class);
        C41302w.m91044a("aweme://studio/create", AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService().getVideoRecordPermissionActivityClass());
        C41302w.m91044a("aweme://feedback_record", FeedbackActivity.class);
        C41302w.m91044a("aweme://stickers/detail/:id", StickerPropDetailActicity.class);
    }
}
