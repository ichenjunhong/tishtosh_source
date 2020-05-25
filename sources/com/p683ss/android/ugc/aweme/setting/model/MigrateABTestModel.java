package com.p683ss.android.ugc.aweme.setting.model;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.experiment.UseRecyclerPartialUpdateExperiment;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABBindFgGuideTextIndex;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABBindPhoneForPostAweme;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABBindPhoneForPostIm;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABCommentBgcolorType;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABContainsKeyWithLruEntries;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABEnableImHaveRead;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABEnableNotificationPrefetchVideo;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABEnableSyncToutiao;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABEnableTeenagerModeNew;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABEnableYouthControlPlus;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABHotLiveEnterNewStyle;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABImQrcodeShareDirect;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABInsShareType;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABIsHashTag;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABIsReplaceAwemeManagerWithLrucache;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABLoadNewFfmpeg;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABNonStandardAdHotSearchStyle;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABOppoRedPointAppearAgainTimeInterval;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABOppoRedPointAppearModel;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABOutAppShareDirect;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABPropShowLikeNum;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABSingleConvHelloMsg;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABSkylightRecommendLive;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABStarAtlasCooperationEntryOpen;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABUserRecommendCardEnhance;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABVisibleGoods;
import com.p683ss.android.ugc.aweme.setting.model.p2142ab.ABXiguaTaskSwitchType;

/* renamed from: com.ss.android.ugc.aweme.setting.model.MigrateABTestModel */
public class MigrateABTestModel {

    /* renamed from: com.ss.android.ugc.aweme.setting.model.MigrateABTestModel$CommentBackgroundType */
    public interface CommentBackgroundType {
        public static final int BLACK = 0;
        public static final int WHITE = 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.MigrateABTestModel$InstanceHolder */
    static final class InstanceHolder {
        public static final MigrateABTestModel INSTANCE = new MigrateABTestModel();

        private InstanceHolder() {
        }
    }

    private MigrateABTestModel() {
    }

    public static MigrateABTestModel getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public int getBindFGGuideTextIndex() {
        return C10181b.m20511a().mo18168a(ABBindFgGuideTextIndex.class, true, "bind_fg_guide_text_index", 31744, -1);
    }

    public int getBindPhoneForIm() {
        return C10181b.m20511a().mo18168a(ABBindPhoneForPostIm.class, true, "bind_phone_for_post_im", 31744, 10);
    }

    public int getBindPhoneForPostAweme() {
        return C10181b.m20511a().mo18168a(ABBindPhoneForPostAweme.class, true, "bind_phone_for_post_aweme", 31744, 21);
    }

    public int getCommentBG() {
        return C10181b.m20511a().mo18168a(ABCommentBgcolorType.class, true, "comment_bgcolor_type", 31744, 1);
    }

    public int getEnableNotificationPrefetchVideo() {
        return C10181b.m20511a().mo18168a(ABEnableNotificationPrefetchVideo.class, true, "enable_notification_prefetch_video", 31744, 0);
    }

    public int getEnableReadState() {
        return C10181b.m20511a().mo18168a(ABEnableImHaveRead.class, true, "enable_im_have_read", 31744, 0);
    }

    public int getEnableTeenagerModeNew() {
        return C10181b.m20511a().mo18168a(ABEnableTeenagerModeNew.class, true, "enable_teenager_mode_new", 31744, 1);
    }

    public int getHotLiveEnterNewStyle() {
        return C10181b.m20511a().mo18168a(ABHotLiveEnterNewStyle.class, true, "hot_live_enter_new_style", 31744, 0);
    }

    public int getImQrcodeShareDirect() {
        return C10181b.m20511a().mo18168a(ABImQrcodeShareDirect.class, true, "im_qrcode_share_direct", 31744, 0);
    }

    public int getInsShareType() {
        return C10181b.m20511a().mo18168a(ABInsShareType.class, true, "ins_share_type", 31744, 0);
    }

    public int getIsHashTag() {
        return C10181b.m20511a().mo18168a(ABIsHashTag.class, true, "is_hash_tag", 31744, 0);
    }

    public int getNonStdHotSearch() {
        return C10181b.m20511a().mo18168a(ABNonStandardAdHotSearchStyle.class, true, "non_standard_ad_hot_search_style", 31744, 0);
    }

    public int getOppoRedPointAppearAgainTimeInterval() {
        return C10181b.m20511a().mo18168a(ABOppoRedPointAppearAgainTimeInterval.class, true, "oppo_red_point_appear_again_time_interval", 31744, 0);
    }

    public int getOppoRedPointAppearModel() {
        return C10181b.m20511a().mo18168a(ABOppoRedPointAppearModel.class, true, "oppo_red_point_appear_model", 31744, 0);
    }

    public int getOutAppShareDirect() {
        return C10181b.m20511a().mo18168a(ABOutAppShareDirect.class, true, "out_app_share_direct", 31744, 0);
    }

    public int getSingleChatHelloMsg() {
        return C10181b.m20511a().mo18168a(ABSingleConvHelloMsg.class, true, "single_conv_hello_msg", 31744, 0);
    }

    public int getUndegradeProtect() {
        return C10181b.m20511a().mo18168a(ABEnableYouthControlPlus.class, true, "enable_youth_control_plus", 31744, 0);
    }

    public int getUserRecommendCardEnhance() {
        return C10181b.m20511a().mo18168a(ABUserRecommendCardEnhance.class, true, "user_recommend_card_enhance", 31744, 0);
    }

    public int getVisibleGoods() {
        return C10181b.m20511a().mo18168a(ABVisibleGoods.class, true, "visible_goods", 31744, 0);
    }

    public int getXiGuaTaskPosition() {
        return C10181b.m20511a().mo18168a(ABXiguaTaskSwitchType.class, true, "xigua_task_switch_type", 31744, 0);
    }

    public boolean isContainsKeyWithLruEntries() {
        return C10181b.m20511a().mo18172a(ABContainsKeyWithLruEntries.class, true, "contains_key_with_lruEntries", 31744, true);
    }

    public boolean isEffectLikeShow() {
        if (C10181b.m20511a().mo18168a(ABPropShowLikeNum.class, true, "prop_show_like_num", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    public boolean isEnableSyncToutiao() {
        return C10181b.m20511a().mo18172a(ABEnableSyncToutiao.class, true, "enable_sync_toutiao", 31744, false);
    }

    public boolean isLoadNewFFmpeg() {
        return C10181b.m20511a().mo18172a(ABLoadNewFfmpeg.class, true, "load_new_ffmpeg", 31744, false);
    }

    public boolean isReplaceAwemeManagerWithLRUCache() {
        return C10181b.m20511a().mo18172a(ABIsReplaceAwemeManagerWithLrucache.class, true, "is_replace_aweme_manager_with_lrucache", 31744, true);
    }

    public boolean isSkyLightRecommendLive() {
        return C10181b.m20511a().mo18172a(ABSkylightRecommendLive.class, true, "skylight_recommend_live", 31744, false);
    }

    public boolean isStarAtlasCooperationEntryOpen() {
        return C10181b.m20511a().mo18172a(ABStarAtlasCooperationEntryOpen.class, true, "star_atlas_cooperation_entry_open", 31744, false);
    }

    public boolean shouldUseRecyclerPartialUpdate() {
        return C10181b.m20511a().mo18172a(UseRecyclerPartialUpdateExperiment.class, true, "share_useNotifySingle", 31744, false);
    }
}
