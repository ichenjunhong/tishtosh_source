package beancopy;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.commerce.C25483a;
import com.p683ss.android.ugc.aweme.commerce.C25507c;
import com.p683ss.android.ugc.aweme.commerce.C25513e;
import com.p683ss.android.ugc.aweme.commerce.C25514f;
import com.p683ss.android.ugc.aweme.commerce.model.C25515a;
import com.p683ss.android.ugc.aweme.commerce.model.C25516b;
import com.p683ss.android.ugc.aweme.commerce.model.C25518d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26132m;
import com.p683ss.android.ugc.aweme.discover.model.CategoryCoverStruct;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.p683ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.p683ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import com.p683ss.android.ugc.aweme.feed.api.C30147e;
import com.p683ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p683ss.android.ugc.aweme.feed.model.Anchor;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.p683ss.android.ugc.aweme.feed.model.AnchorShopLinkStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p683ss.android.ugc.aweme.feed.model.AwemeControl;
import com.p683ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeNationalTask;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.BannerTip;
import com.p683ss.android.ugc.aweme.feed.model.BitRate;
import com.p683ss.android.ugc.aweme.feed.model.CommerceConfigData;
import com.p683ss.android.ugc.aweme.feed.model.DescendantsModel;
import com.p683ss.android.ugc.aweme.feed.model.Extra;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import com.p683ss.android.ugc.aweme.feed.model.GameInfo;
import com.p683ss.android.ugc.aweme.feed.model.HotSearchGuideWord;
import com.p683ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.feed.model.LongVideo;
import com.p683ss.android.ugc.aweme.feed.model.MixStatisStruct;
import com.p683ss.android.ugc.aweme.feed.model.MixStatusStruct;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p683ss.android.ugc.aweme.feed.model.Preload;
import com.p683ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p683ss.android.ugc.aweme.feed.model.RelationLabelNew;
import com.p683ss.android.ugc.aweme.feed.model.RelationLabelUser;
import com.p683ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.p683ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p683ss.android.ugc.aweme.feed.model.UserProfileInitInfo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoControl;
import com.p683ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p683ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p683ss.android.ugc.aweme.feed.model.live.FansStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.ShareStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import com.p683ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36969h;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.music.C37390k;
import com.p683ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1323ae.p1325b.C22468a;
import com.p683ss.android.ugc.aweme.poi.model.C39118b;
import com.p683ss.android.ugc.aweme.poi.model.C39127k;
import com.p683ss.android.ugc.aweme.poi.model.C39130n;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.p683ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.p683ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p683ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.p683ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p683ss.android.ugc.aweme.profile.model.EffectArtistDetail;
import com.p683ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p683ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p683ss.android.ugc.aweme.profile.model.HonorStruct;
import com.p683ss.android.ugc.aweme.profile.model.HotListStruct;
import com.p683ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import com.p683ss.android.ugc.aweme.profile.model.LinkUserInfoStruct;
import com.p683ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.p683ss.android.ugc.aweme.profile.model.QuickShopInfo;
import com.p683ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo;
import com.p683ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.p683ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.p683ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.p683ss.android.ugc.aweme.profile.model.UnReadVideoInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.p2121a.C41398a;
import com.p683ss.android.ugc.aweme.search.p2121a.C41399b;
import com.p683ss.android.ugc.aweme.search.p2121a.C41400c;
import com.p683ss.android.ugc.aweme.sticker.data.Address;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.PoiCardStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.p683ss.android.ugc.aweme.sticker.model.C46067b;
import com.p683ss.android.ugc.aweme.sticker.model.C46068c;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.ugc.aweme.proto.ACLCommonStructV2;
import com.p683ss.ugc.aweme.proto.ActivityTimeRangeV2;
import com.p683ss.ugc.aweme.proto.AdCoverTitleV2;
import com.p683ss.ugc.aweme.proto.AddressStructV2;
import com.p683ss.ugc.aweme.proto.AnchorCommonStructV2;
import com.p683ss.ugc.aweme.proto.AnchorShopLinkStructV2;
import com.p683ss.ugc.aweme.proto.AnchorStructV2;
import com.p683ss.ugc.aweme.proto.AnchorWikipediaStructV2;
import com.p683ss.ugc.aweme.proto.AnnouncementStructV2;
import com.p683ss.ugc.aweme.proto.AvatarDecorationStructV2;
import com.p683ss.ugc.aweme.proto.AwemeACLStructV2;
import com.p683ss.ugc.aweme.proto.AwemeAnchorStructV2;
import com.p683ss.ugc.aweme.proto.AwemeCommerceStickerStructV2;
import com.p683ss.ugc.aweme.proto.AwemeCommerceStructV2;
import com.p683ss.ugc.aweme.proto.AwemeControlStructV2;
import com.p683ss.ugc.aweme.proto.AwemeFloatingCardStructV2;
import com.p683ss.ugc.aweme.proto.AwemeLabelStructV2;
import com.p683ss.ugc.aweme.proto.AwemeNationalTaskStructV2;
import com.p683ss.ugc.aweme.proto.AwemePromotionOtherStructV2;
import com.p683ss.ugc.aweme.proto.AwemeRiskStructV2;
import com.p683ss.ugc.aweme.proto.AwemeSearchStructV2;
import com.p683ss.ugc.aweme.proto.AwemeStarAtlasStructV2;
import com.p683ss.ugc.aweme.proto.AwemeStatisticsStructV2;
import com.p683ss.ugc.aweme.proto.AwemeStatusStructV2;
import com.p683ss.ugc.aweme.proto.AwemeStructV2;
import com.p683ss.ugc.aweme.proto.BannerTipV2;
import com.p683ss.ugc.aweme.proto.BitRateStructV2;
import com.p683ss.ugc.aweme.proto.BlueVBrandInfoStructV2;
import com.p683ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2;
import com.p683ss.ugc.aweme.proto.CNYStructV2;
import com.p683ss.ugc.aweme.proto.CaptionInfoStructV2;
import com.p683ss.ugc.aweme.proto.CategoryCoverStructV2;
import com.p683ss.ugc.aweme.proto.ChallengeStructV2;
import com.p683ss.ugc.aweme.proto.CommerceActivityStructV2;
import com.p683ss.ugc.aweme.proto.CommerceConfigDataV2;
import com.p683ss.ugc.aweme.proto.CommerceInfoStructV2;
import com.p683ss.ugc.aweme.proto.CommercePermissionStructV2;
import com.p683ss.ugc.aweme.proto.CommerceStickerStructV2;
import com.p683ss.ugc.aweme.proto.CommerceStickerUnlockStructV2;
import com.p683ss.ugc.aweme.proto.CommerceUserStructV2;
import com.p683ss.ugc.aweme.proto.DescendantStructV2;
import com.p683ss.ugc.aweme.proto.DisclaimerStructV2;
import com.p683ss.ugc.aweme.proto.EffectArtistStructV2;
import com.p683ss.ugc.aweme.proto.ExternalSongStructV2;
import com.p683ss.ugc.aweme.proto.ExtraStructV2;
import com.p683ss.ugc.aweme.proto.FansStructV2;
import com.p683ss.ugc.aweme.proto.FollowersDetailV2;
import com.p683ss.ugc.aweme.proto.GameStructV2;
import com.p683ss.ugc.aweme.proto.GuideWordV2;
import com.p683ss.ugc.aweme.proto.HotListStructV2;
import com.p683ss.ugc.aweme.proto.HotsearchSprintStructV2;
import com.p683ss.ugc.aweme.proto.HybridLabelStructV2;
import com.p683ss.ugc.aweme.proto.IconButtonStructV2;
import com.p683ss.ugc.aweme.proto.ImageInfoStructV2;
import com.p683ss.ugc.aweme.proto.InteractionStickerStructV2;
import com.p683ss.ugc.aweme.proto.ItemLikeEggDataV2;
import com.p683ss.ugc.aweme.proto.LifeStoryBlockStructV2;
import com.p683ss.ugc.aweme.proto.LinkMatchStructV2;
import com.p683ss.ugc.aweme.proto.LinkUserInfoStructV2;
import com.p683ss.ugc.aweme.proto.LiveHonorStructV2;
import com.p683ss.ugc.aweme.proto.LogPbStructV2;
import com.p683ss.ugc.aweme.proto.LongVideoStructV2;
import com.p683ss.ugc.aweme.proto.MaskStructV2;
import com.p683ss.ugc.aweme.proto.MatchInfoStructV2;
import com.p683ss.ugc.aweme.proto.MicroAppCardStructV2;
import com.p683ss.ugc.aweme.proto.MicroAppStructV2;
import com.p683ss.ugc.aweme.proto.MixStatisStructV2;
import com.p683ss.ugc.aweme.proto.MixStatusStructV2;
import com.p683ss.ugc.aweme.proto.MixStructV2;
import com.p683ss.ugc.aweme.proto.MusicStructV2;
import com.p683ss.ugc.aweme.proto.NationalTaskLinkStructV2;
import com.p683ss.ugc.aweme.proto.NewFaceStickerStructV2;
import com.p683ss.ugc.aweme.proto.OfflineInfoStructV2;
import com.p683ss.ugc.aweme.proto.OriginalMusicianStructV2;
import com.p683ss.ugc.aweme.proto.PermissionStructV2;
import com.p683ss.ugc.aweme.proto.PlatformSyncStatusStructV2;
import com.p683ss.ugc.aweme.proto.PlayTokenAuthStructV2;
import com.p683ss.ugc.aweme.proto.PoiBackendTypeStructV2;
import com.p683ss.ugc.aweme.proto.PoiCardStructV2;
import com.p683ss.ugc.aweme.proto.PoiStructV2;
import com.p683ss.ugc.aweme.proto.PositionStructV2;
import com.p683ss.ugc.aweme.proto.PreloadStructV2;
import com.p683ss.ugc.aweme.proto.QuickShopSecondFloorV2;
import com.p683ss.ugc.aweme.proto.QuickShopStructV2;
import com.p683ss.ugc.aweme.proto.RFansGroupInfoV2;
import com.p683ss.ugc.aweme.proto.RecommendItemStructV2;
import com.p683ss.ugc.aweme.proto.RelationDynamicLableStructV2;
import com.p683ss.ugc.aweme.proto.RelationLabelStructV2;
import com.p683ss.ugc.aweme.proto.RelationRecommendStructV2;
import com.p683ss.ugc.aweme.proto.RelativeUserStructV2;
import com.p683ss.ugc.aweme.proto.ShareStructV2;
import com.p683ss.ugc.aweme.proto.SimpleUserStructV2;
import com.p683ss.ugc.aweme.proto.SmartPhoneSettingsStructV2;
import com.p683ss.ugc.aweme.proto.SpecialStickerStructV2;
import com.p683ss.ugc.aweme.proto.StarAtlasLinkStructV2;
import com.p683ss.ugc.aweme.proto.StreamUrlStructV2;
import com.p683ss.ugc.aweme.proto.TextExtraStructV2;
import com.p683ss.ugc.aweme.proto.UrlStructV2;
import com.p683ss.ugc.aweme.proto.UserProfileStructV2;
import com.p683ss.ugc.aweme.proto.UserStructV2;
import com.p683ss.ugc.aweme.proto.VideoControlV2;
import com.p683ss.ugc.aweme.proto.VideoReplyStructV2;
import com.p683ss.ugc.aweme.proto.VideoStructV2;
import com.p683ss.ugc.aweme.proto.VideoTextStructV2;
import com.p683ss.ugc.aweme.proto.VideoUnreadStructV2;
import com.p683ss.ugc.aweme.proto.VoteOptionStructV2;
import com.p683ss.ugc.aweme.proto.VoteStructV2;
import com.p683ss.ugc.aweme.proto.WebcastRoomFeedCellStructV2;
import com.p683ss.ugc.aweme.proto.WebcastRoomStructV2;
import com.p683ss.ugc.aweme.proto.XiguaTaskStructV2;
import com.p683ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.ArrayList;
import java.util.List;

public class ConvertHelp {
    private ConvertHelp() {
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$List$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange */
    public static List<C25515a> m5779xa30ff353(List<ActivityTimeRangeV2> list, List<C25515a> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ActivityTimeRangeV2 com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange : list) {
            arrayList.add(m5806x304bdb3(com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$AnchorCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct */
    public static List<AnchorCommonStruct> m5780x4869b99e(List<AnchorCommonStructV2> list, List<AnchorCommonStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStructV2 com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct : list) {
            arrayList.add(m5810x8be04f0e(com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$AwemeLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel */
    public static List<AwemeLabelModel> m5781x76f794a0(List<AwemeLabelStructV2> list, List<AwemeLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AwemeLabelStructV2 com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel : list) {
            arrayList.add(m5822x8a3abbb6(com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme */
    public static List<Aweme> m5782x83100197(List<AwemeStructV2> list, List<Aweme> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AwemeStructV2 com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme : list) {
            arrayList.add(m5830xbda5a8e1(com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate */
    public static List<BitRate> m5783xb984563(List<BitRateStructV2> list, List<BitRate> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (BitRateStructV2 com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate : list) {
            arrayList.add(m5832x8afb92e1(com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge */
    public static List<Challenge> m5784x890b881a(List<ChallengeStructV2> list, List<Challenge> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ChallengeStructV2 com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge : list) {
            arrayList.add(m5838x5652a2ac(com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$CommerceConfigDataV2$$List$com$ss$android$ugc$aweme$feed$model$CommerceConfigData */
    public static List<CommerceConfigData> m5785x76aeb75e(List<CommerceConfigDataV2> list, List<CommerceConfigData> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (CommerceConfigDataV2 com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData : list) {
            arrayList.add(m5840x5692c932(com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$ExternalSongStructV2$$List$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo */
    public static List<ExternalMusicInfo> m5786x6301e2f6(List<ExternalSongStructV2> list, List<ExternalMusicInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ExternalSongStructV2 com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo : list) {
            arrayList.add(m5849xc9224d66(com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$FollowersDetailV2$$List$com$ss$android$ugc$aweme$profile$model$FollowerDetail */
    public static List<FollowerDetail> m5787xba3b9b20(List<FollowersDetailV2> list, List<FollowerDetail> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (FollowersDetailV2 com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail : list) {
            arrayList.add(m5852xc3646396(com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$HybridLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel */
    public static List<AwemeHybridLabelModel> m5788xa8867139(List<HybridLabelStructV2> list, List<AwemeHybridLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (HybridLabelStructV2 com$ss$ugc$aweme$proto$HybridLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel : list) {
            arrayList.add(m5857xef19dc1(com$ss$ugc$aweme$proto$HybridLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo */
    public static List<ImageInfo> m5789x71a3bddb(List<ImageInfoStructV2> list, List<ImageInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ImageInfoStructV2 com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo : list) {
            arrayList.add(m5859x9f65f721(com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$InteractionStickerStructV2$$List$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct */
    public static List<InteractStickerStruct> m5790xb33b7ec(List<InteractionStickerStructV2> list, List<InteractStickerStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (InteractionStickerStructV2 com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct : list) {
            arrayList.add(m5860x24286486(com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo */
    public static List<LongVideo> m5791x8d23647(List<LongVideoStructV2> list, List<LongVideo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (LongVideoStructV2 com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo : list) {
            arrayList.add(m5867xd9f92261(com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$MatchInfoStructV2$$List$com$ss$android$ugc$aweme$search$caption$MatchInfo */
    public static List<C41400c> m5792xa5b614b6(List<MatchInfoStructV2> list, List<C41400c> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MatchInfoStructV2 com$ss$ugc$aweme$proto$MatchInfoStructV2$$com$ss$android$ugc$aweme$search$caption$MatchInfo : list) {
            arrayList.add(m5869xc68009e8(com$ss$ugc$aweme$proto$MatchInfoStructV2$$com$ss$android$ugc$aweme$search$caption$MatchInfo, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$MusicStructV2$$List$com$ss$android$ugc$aweme$music$model$Music */
    public static List<Music> m5793xd117b1c(List<MusicStructV2> list, List<Music> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MusicStructV2 com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music : list) {
            arrayList.add(m5875x2fe8170e(com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$OfflineInfoStructV2$$List$com$ss$android$ugc$aweme$commerce$OfflineInfo */
    public static List<C25513e> m5794x3e86323(List<OfflineInfoStructV2> list, List<C25513e> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (OfflineInfoStructV2 com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo : list) {
            arrayList.add(m5878xb1fda959(com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$Arraycom$ss$android$ugc$aweme$profile$model$PlatformInfo */
    public static PlatformInfo[] m5795xc1a28d7c(List<PlatformSyncStatusStructV2> list, PlatformInfo[] platformInfoArr) {
        if (list == null) {
            return platformInfoArr;
        }
        if (list.isEmpty()) {
            return new PlatformInfo[0];
        }
        PlatformInfo[] platformInfoArr2 = new PlatformInfo[list.size()];
        for (int i = 0; i < list.size(); i++) {
            platformInfoArr2[i] = m5881xb8c54a7f((PlatformSyncStatusStructV2) list.get(i), null);
        }
        return platformInfoArr2;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position */
    public static List<Position> m5796xed17e9e(List<PositionStructV2> list, List<Position> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (PositionStructV2 com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position : list) {
            arrayList.add(m5888x5cec7640(com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$RecommendItemStructV2$$List$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem */
    public static List<RecommendAwemeItem> m5797x2cf2d58d(List<RecommendItemStructV2> list, List<RecommendAwemeItem> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RecommendItemStructV2 com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem : list) {
            arrayList.add(m5893x55fe9987(com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$feed$model$RelationLabelUser */
    public static List<RelationLabelUser> m5798x6e5454b1(List<RelativeUserStructV2> list, List<RelationLabelUser> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RelativeUserStructV2 com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelUser : list) {
            arrayList.add(m5897x91dc7273(com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelUser, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo */
    public static List<RelativeUserInfo> m5799xf3bc2c2a(List<RelativeUserStructV2> list, List<RelativeUserInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RelativeUserStructV2 com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo : list) {
            arrayList.add(m5898x55b3e16c(com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$SimpleUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$User */
    public static List<User> m5800x7b892b96(List<SimpleUserStructV2> list, List<User> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (SimpleUserStructV2 com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User : list) {
            arrayList.add(m5901xd0fb664c(com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct */
    public static List<TextExtraStruct> m5801xdd10ff50(List<TextExtraStructV2> list, List<TextExtraStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (TextExtraStructV2 com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct : list) {
            arrayList.add(m5906x8e855afe(com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel */
    public static List<UrlModel> m5802x5c3c5aaf(List<UrlStructV2> list, List<UrlModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (UrlStructV2 com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel : list) {
            arrayList.add(m5907xd6e21675(com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel */
    public static List<AwemeTextLabelModel> m5803x16f8d95a(List<VideoTextStructV2> list, List<AwemeTextLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTextStructV2 com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel : list) {
            arrayList.add(m5914x7df21302(com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$VoteOptionStructV2$$List$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean */
    public static List<OptionsBean> m5804x41864bc5(List<VoteOptionStructV2> list, List<OptionsBean> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (VoteOptionStructV2 com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean : list) {
            arrayList.add(m5916xbfb88253(com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean, null));
        }
        return arrayList;
    }

    public static long[] List$java$lang$Long$$ArrayJ(List<Long> list, long[] jArr) {
        if (list == null) {
            return jArr;
        }
        if (list.isEmpty()) {
            return new long[0];
        }
        long[] jArr2 = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr2[i] = C1662a.m5929a((Long) list.get(i));
        }
        return jArr2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare */
    public static ACLCommonShare m5805x33cb8ebe(ACLCommonStructV2 aCLCommonStructV2, ACLCommonShare aCLCommonShare) {
        if (aCLCommonStructV2 == null) {
            return aCLCommonShare;
        }
        ACLCommonShare aCLCommonShare2 = new ACLCommonShare();
        aCLCommonShare2.code = C1662a.m5926a(aCLCommonStructV2.code, aCLCommonShare2.code);
        aCLCommonShare2.showType = C1662a.m5926a(aCLCommonStructV2.show_type, aCLCommonShare2.showType);
        aCLCommonShare2.toastMsg = aCLCommonStructV2.toast_msg == null ? aCLCommonShare2.toastMsg : aCLCommonStructV2.toast_msg;
        aCLCommonShare2.extra = aCLCommonStructV2.extra == null ? aCLCommonShare2.extra : aCLCommonStructV2.extra;
        return aCLCommonShare2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange */
    public static C25515a m5806x304bdb3(ActivityTimeRangeV2 activityTimeRangeV2, C25515a aVar) {
        if (activityTimeRangeV2 == null) {
            return aVar;
        }
        C25515a aVar2 = new C25515a();
        aVar2.start = C1662a.m5923a(activityTimeRangeV2.start, aVar2.start);
        aVar2.end = C1662a.m5923a(activityTimeRangeV2.end, aVar2.end);
        return aVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AdCoverTitleV2$$com$ss$android$ugc$aweme$profile$model$AdCoverTitle */
    public static AdCoverTitle m5807xc3027593(AdCoverTitleV2 adCoverTitleV2, AdCoverTitle adCoverTitle) {
        if (adCoverTitleV2 == null) {
            return adCoverTitle;
        }
        AdCoverTitle adCoverTitle2 = new AdCoverTitle();
        adCoverTitle2.title = adCoverTitleV2.title == null ? adCoverTitle2.title : adCoverTitleV2.title;
        adCoverTitle2.webUrl = adCoverTitleV2.web_url == null ? adCoverTitle2.webUrl : adCoverTitleV2.web_url;
        return adCoverTitle2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AddressStructV2$$com$ss$android$ugc$aweme$poi$model$Address */
    public static C39118b m5808x14cb9651(AddressStructV2 addressStructV2, C39118b bVar) {
        if (addressStructV2 == null) {
            return bVar;
        }
        C39118b bVar2 = new C39118b();
        bVar2.province = addressStructV2.province == null ? bVar2.province : addressStructV2.province;
        bVar2.city = addressStructV2.city == null ? bVar2.city : addressStructV2.city;
        bVar2.district = addressStructV2.district == null ? bVar2.district : addressStructV2.district;
        bVar2.address = addressStructV2.address == null ? bVar2.address : addressStructV2.address;
        bVar2.simpleAddr = addressStructV2.simple_addr == null ? bVar2.simpleAddr : addressStructV2.simple_addr;
        bVar2.cityCode = addressStructV2.city_code == null ? bVar2.cityCode : addressStructV2.city_code;
        bVar2.country = addressStructV2.country == null ? bVar2.country : addressStructV2.country;
        bVar2.countryCode = addressStructV2.country_code == null ? bVar2.countryCode : addressStructV2.country_code;
        return bVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AddressStructV2$$com$ss$android$ugc$aweme$sticker$data$Address */
    public static Address m5809x21b8fdcf(AddressStructV2 addressStructV2, Address address) {
        if (addressStructV2 == null) {
            return address;
        }
        Address address2 = new Address();
        address2.provice = addressStructV2.province == null ? address2.provice : addressStructV2.province;
        address2.city = addressStructV2.city == null ? address2.city : addressStructV2.city;
        address2.district = addressStructV2.district == null ? address2.district : addressStructV2.district;
        address2.address = addressStructV2.address == null ? address2.address : addressStructV2.address;
        address2.simpleAddr = addressStructV2.simple_addr == null ? address2.simpleAddr : addressStructV2.simple_addr;
        return address2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct */
    public static AnchorCommonStruct m5810x8be04f0e(AnchorCommonStructV2 anchorCommonStructV2, AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStructV2 == null) {
            return anchorCommonStruct;
        }
        AnchorCommonStruct anchorCommonStruct2 = new AnchorCommonStruct();
        anchorCommonStruct2.keyword = anchorCommonStructV2.keyword == null ? anchorCommonStruct2.keyword : anchorCommonStructV2.keyword;
        anchorCommonStruct2.url = anchorCommonStructV2.url == null ? anchorCommonStruct2.url : anchorCommonStructV2.url;
        anchorCommonStruct2.language = anchorCommonStructV2.language == null ? anchorCommonStruct2.language : anchorCommonStructV2.language;
        anchorCommonStruct2.schema = anchorCommonStructV2.schema == null ? anchorCommonStruct2.schema : anchorCommonStructV2.schema;
        anchorCommonStruct2.f79725id = anchorCommonStructV2.f128786id == null ? anchorCommonStruct2.f79725id : anchorCommonStructV2.f128786id;
        anchorCommonStruct2.type = C1662a.m5926a(anchorCommonStructV2.type, anchorCommonStruct2.type);
        anchorCommonStruct2.icon = m5907xd6e21675(anchorCommonStructV2.icon, anchorCommonStruct2.icon);
        anchorCommonStruct2.extra = anchorCommonStructV2.extra == null ? anchorCommonStruct2.extra : anchorCommonStructV2.extra;
        anchorCommonStruct2.deepLink = anchorCommonStructV2.deep_link == null ? anchorCommonStruct2.deepLink : anchorCommonStructV2.deep_link;
        anchorCommonStruct2.universalLink = anchorCommonStructV2.universal_link == null ? anchorCommonStruct2.universalLink : anchorCommonStructV2.universal_link;
        anchorCommonStruct2.logExtra = anchorCommonStructV2.log_extra == null ? anchorCommonStruct2.logExtra : anchorCommonStructV2.log_extra;
        return anchorCommonStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnchorShopLinkStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorShopLinkStruct */
    public static AnchorShopLinkStruct m5811xd2e2ca58(AnchorShopLinkStructV2 anchorShopLinkStructV2, AnchorShopLinkStruct anchorShopLinkStruct) {
        if (anchorShopLinkStructV2 == null) {
            return anchorShopLinkStruct;
        }
        AnchorShopLinkStruct anchorShopLinkStruct2 = new AnchorShopLinkStruct();
        anchorShopLinkStruct2.keyword = anchorShopLinkStructV2.keyword == null ? anchorShopLinkStruct2.keyword : anchorShopLinkStructV2.keyword;
        anchorShopLinkStruct2.url = anchorShopLinkStructV2.url == null ? anchorShopLinkStruct2.url : anchorShopLinkStructV2.url;
        return anchorShopLinkStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnchorStructV2$$com$ss$android$ugc$aweme$feed$model$Anchor */
    public static Anchor m5812x94014543(AnchorStructV2 anchorStructV2, Anchor anchor) {
        if (anchorStructV2 == null) {
            return anchor;
        }
        Anchor anchor2 = new Anchor();
        anchor2.showType = anchorStructV2.show_type == null ? anchor2.showType : anchorStructV2.show_type;
        anchor2.businessType = anchorStructV2.business_type == null ? anchor2.businessType : anchorStructV2.business_type;
        anchor2.wikipediaInfo = m5813x3f769644(anchorStructV2.wikipedia_info, anchor2.wikipediaInfo);
        anchor2.shopLinkStruct = m5811xd2e2ca58(anchorStructV2.shop_link, anchor2.shopLinkStruct);
        anchor2.anchorInfo = m5810x8be04f0e(anchorStructV2.anchor_info, anchor2.anchorInfo);
        anchor2.anchorId = anchorStructV2.anchor_id == null ? anchor2.anchorId : anchorStructV2.anchor_id;
        return anchor2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnchorWikipediaStructV2$$com$ss$android$ugc$aweme$feed$model$WikipediaInfo */
    public static WikipediaInfo m5813x3f769644(AnchorWikipediaStructV2 anchorWikipediaStructV2, WikipediaInfo wikipediaInfo) {
        if (anchorWikipediaStructV2 == null) {
            return wikipediaInfo;
        }
        WikipediaInfo wikipediaInfo2 = new WikipediaInfo();
        wikipediaInfo2.keyword = anchorWikipediaStructV2.keyword == null ? wikipediaInfo2.keyword : anchorWikipediaStructV2.keyword;
        wikipediaInfo2.lang = anchorWikipediaStructV2.lang == null ? wikipediaInfo2.lang : anchorWikipediaStructV2.lang;
        return wikipediaInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnnouncementStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeAnnouncement */
    public static ChallengeAnnouncement m5814xcb0a6e35(AnnouncementStructV2 announcementStructV2, ChallengeAnnouncement challengeAnnouncement) {
        if (announcementStructV2 == null) {
            return challengeAnnouncement;
        }
        ChallengeAnnouncement challengeAnnouncement2 = new ChallengeAnnouncement();
        challengeAnnouncement2.title = announcementStructV2.title == null ? challengeAnnouncement2.title : announcementStructV2.title;
        challengeAnnouncement2.content = announcementStructV2.body == null ? challengeAnnouncement2.content : announcementStructV2.body;
        return challengeAnnouncement2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AvatarDecorationStructV2$$com$ss$android$ugc$aweme$profile$model$AvatarDecoration */
    public static AvatarDecoration m5815xb77ea0de(AvatarDecorationStructV2 avatarDecorationStructV2, AvatarDecoration avatarDecoration) {
        if (avatarDecorationStructV2 == null) {
            return avatarDecoration;
        }
        AvatarDecoration avatarDecoration2 = new AvatarDecoration();
        avatarDecoration2.f101819id = C1662a.m5930a(avatarDecorationStructV2.f128788id, avatarDecoration2.f101819id);
        avatarDecoration2.name = avatarDecorationStructV2.name == null ? avatarDecoration2.name : avatarDecorationStructV2.name;
        avatarDecoration2.sourceUrl = m5907xd6e21675(avatarDecorationStructV2.source_url, avatarDecoration2.sourceUrl);
        return avatarDecoration2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeACLStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeACLShare */
    public static AwemeACLShare m5816x769da000(AwemeACLStructV2 awemeACLStructV2, AwemeACLShare awemeACLShare) {
        if (awemeACLStructV2 == null) {
            return awemeACLShare;
        }
        AwemeACLShare awemeACLShare2 = new AwemeACLShare();
        awemeACLShare2.downloadGeneral = m5805x33cb8ebe(awemeACLStructV2.download_general, awemeACLShare2.downloadGeneral);
        awemeACLShare2.downloadMaskPanel = m5805x33cb8ebe(awemeACLStructV2.download_mask_panel, awemeACLShare2.downloadMaskPanel);
        awemeACLShare2.downloadSharePanel = m5805x33cb8ebe(awemeACLStructV2.download_share_panel, awemeACLShare2.downloadSharePanel);
        return awemeACLShare2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeAnchorStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorInfo */
    public static AnchorInfo m5817x956cf17e(AwemeAnchorStructV2 awemeAnchorStructV2, AnchorInfo anchorInfo) {
        if (awemeAnchorStructV2 == null) {
            return anchorInfo;
        }
        AnchorInfo anchorInfo2 = new AnchorInfo();
        anchorInfo2.type = awemeAnchorStructV2.type == null ? anchorInfo2.type : awemeAnchorStructV2.type;
        anchorInfo2.f79726id = awemeAnchorStructV2.f128790id == null ? anchorInfo2.f79726id : awemeAnchorStructV2.f128790id;
        anchorInfo2.icon = m5907xd6e21675(awemeAnchorStructV2.icon, anchorInfo2.icon);
        anchorInfo2.title = awemeAnchorStructV2.title == null ? anchorInfo2.title : awemeAnchorStructV2.title;
        anchorInfo2.openUrl = awemeAnchorStructV2.open_url == null ? anchorInfo2.openUrl : awemeAnchorStructV2.open_url;
        anchorInfo2.webUrl = awemeAnchorStructV2.web_url == null ? anchorInfo2.webUrl : awemeAnchorStructV2.web_url;
        anchorInfo2.mpUrl = awemeAnchorStructV2.mp_url == null ? anchorInfo2.mpUrl : awemeAnchorStructV2.mp_url;
        anchorInfo2.extra = awemeAnchorStructV2.extra == null ? anchorInfo2.extra : awemeAnchorStructV2.extra;
        anchorInfo2.logExtra = awemeAnchorStructV2.log_extra == null ? anchorInfo2.logExtra : awemeAnchorStructV2.log_extra;
        return anchorInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeCommerceStickerStructV2$$com$ss$android$ugc$aweme$commercialize$model$CommerceStickerInfo */
    public static C26132m m5818xe74539ee(AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2, C26132m mVar) {
        if (awemeCommerceStickerStructV2 == null) {
            return mVar;
        }
        C26132m mVar2 = new C26132m();
        mVar2.commerceStickerId = C1662a.m5930a(awemeCommerceStickerStructV2.commerce_sticker_id, mVar2.commerceStickerId);
        mVar2.iconUrl = m5907xd6e21675(awemeCommerceStickerStructV2.icon_url, mVar2.iconUrl);
        mVar2.letters = awemeCommerceStickerStructV2.letters == null ? mVar2.letters : awemeCommerceStickerStructV2.letters;
        mVar2.openUrl = awemeCommerceStickerStructV2.open_url == null ? mVar2.openUrl : awemeCommerceStickerStructV2.open_url;
        mVar2.webUrl = awemeCommerceStickerStructV2.web_url == null ? mVar2.webUrl : awemeCommerceStickerStructV2.web_url;
        mVar2.webUrlTitle = awemeCommerceStickerStructV2.web_url_title == null ? mVar2.webUrlTitle : awemeCommerceStickerStructV2.web_url_title;
        return mVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeCommerceStructV2$$com$ss$android$ugc$aweme$commerce$AwemeCommerceStruct */
    public static C25483a m5819x337d8a6e(AwemeCommerceStructV2 awemeCommerceStructV2, C25483a aVar) {
        if (awemeCommerceStructV2 == null) {
            return aVar;
        }
        C25483a aVar2 = new C25483a();
        aVar2.ad_auth_status = C1662a.m5926a(awemeCommerceStructV2.ad_auth_status, aVar2.ad_auth_status);
        aVar2.ad_source = C1662a.m5926a(awemeCommerceStructV2.ad_source, aVar2.ad_source);
        aVar2.avoid_global_pendant = C1662a.m5934a(awemeCommerceStructV2.avoid_global_pendant, aVar2.avoid_global_pendant);
        return aVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeControlStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeControl */
    public static AwemeControl m5820xbb564985(AwemeControlStructV2 awemeControlStructV2, AwemeControl awemeControl) {
        if (awemeControlStructV2 == null) {
            return awemeControl;
        }
        AwemeControl awemeControl2 = new AwemeControl();
        awemeControl2.canForward = C1662a.m5934a(awemeControlStructV2.can_forward, awemeControl2.canForward);
        awemeControl2.canShare = C1662a.m5934a(awemeControlStructV2.can_share, awemeControl2.canShare);
        awemeControl2.canComment = C1662a.m5934a(awemeControlStructV2.can_comment, awemeControl2.canComment);
        awemeControl2.canShowComment = C1662a.m5934a(awemeControlStructV2.can_show_comment, awemeControl2.canShowComment);
        return awemeControl2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeFloatingCardStructV2$$com$ss$android$ugc$aweme$feed$model$FloatingCardInfo */
    public static FloatingCardInfo m5821xba8b7c80(AwemeFloatingCardStructV2 awemeFloatingCardStructV2, FloatingCardInfo floatingCardInfo) {
        if (awemeFloatingCardStructV2 == null) {
            return floatingCardInfo;
        }
        FloatingCardInfo floatingCardInfo2 = new FloatingCardInfo();
        floatingCardInfo2.schema = awemeFloatingCardStructV2.schema == null ? floatingCardInfo2.schema : awemeFloatingCardStructV2.schema;
        floatingCardInfo2.schemaDesc = awemeFloatingCardStructV2.schema_desc == null ? floatingCardInfo2.schemaDesc : awemeFloatingCardStructV2.schema_desc;
        floatingCardInfo2.icons = m5802x5c3c5aaf(awemeFloatingCardStructV2.icons, floatingCardInfo2.icons);
        floatingCardInfo2.title = awemeFloatingCardStructV2.title == null ? floatingCardInfo2.title : awemeFloatingCardStructV2.title;
        floatingCardInfo2.description = awemeFloatingCardStructV2.description == null ? floatingCardInfo2.description : awemeFloatingCardStructV2.description;
        floatingCardInfo2.buttonDesc = awemeFloatingCardStructV2.button_desc == null ? floatingCardInfo2.buttonDesc : awemeFloatingCardStructV2.button_desc;
        floatingCardInfo2.buttonBackground = m5907xd6e21675(awemeFloatingCardStructV2.button_bg, floatingCardInfo2.buttonBackground);
        return floatingCardInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel */
    public static AwemeLabelModel m5822x8a3abbb6(AwemeLabelStructV2 awemeLabelStructV2, AwemeLabelModel awemeLabelModel) {
        if (awemeLabelStructV2 == null) {
            return awemeLabelModel;
        }
        AwemeLabelModel awemeLabelModel2 = new AwemeLabelModel();
        awemeLabelModel2.urlModels = m5907xd6e21675(awemeLabelStructV2.label_url, awemeLabelModel2.urlModels);
        awemeLabelModel2.labelType = C1662a.m5926a(awemeLabelStructV2.label_type, awemeLabelModel2.labelType);
        return awemeLabelModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeNationalTaskStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeNationalTask */
    public static AwemeNationalTask m5823xf4f1d381(AwemeNationalTaskStructV2 awemeNationalTaskStructV2, AwemeNationalTask awemeNationalTask) {
        if (awemeNationalTaskStructV2 == null) {
            return awemeNationalTask;
        }
        AwemeNationalTask awemeNationalTask2 = new AwemeNationalTask();
        awemeNationalTask2.nationalTaskLink = m5876xe7569efb(awemeNationalTaskStructV2.link_info, awemeNationalTask2.nationalTaskLink);
        return awemeNationalTask2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemePromotionOtherStructV2$$com$ss$android$ugc$aweme$commerce$model$PromotionOtherInfo */
    public static C25518d m5824x5e568bd1(AwemePromotionOtherStructV2 awemePromotionOtherStructV2, C25518d dVar) {
        if (awemePromotionOtherStructV2 == null) {
            return dVar;
        }
        C25518d dVar2 = new C25518d();
        dVar2.recallReason = awemePromotionOtherStructV2.recall_reason == null ? dVar2.recallReason : awemePromotionOtherStructV2.recall_reason;
        dVar2.cardPredictDuration = C1662a.m5926a(awemePromotionOtherStructV2.card_predict_duration, dVar2.cardPredictDuration);
        dVar2.isOrderShareRecommend = C1662a.m5934a(awemePromotionOtherStructV2.order_share_recommend, dVar2.isOrderShareRecommend);
        return dVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeRiskStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRiskModel */
    public static AwemeRiskModel m5825x7282f728(AwemeRiskStructV2 awemeRiskStructV2, AwemeRiskModel awemeRiskModel) {
        if (awemeRiskStructV2 == null) {
            return awemeRiskModel;
        }
        AwemeRiskModel awemeRiskModel2 = new AwemeRiskModel();
        awemeRiskModel2.vote = C1662a.m5934a(awemeRiskStructV2.vote, awemeRiskModel2.vote);
        awemeRiskModel2.warn = C1662a.m5934a(awemeRiskStructV2.warn, awemeRiskModel2.warn);
        awemeRiskModel2.riskSink = C1662a.m5934a(awemeRiskStructV2.risk_sink, awemeRiskModel2.riskSink);
        awemeRiskModel2.type = C1662a.m5926a(awemeRiskStructV2.type, awemeRiskModel2.type);
        awemeRiskModel2.content = awemeRiskStructV2.content == null ? awemeRiskModel2.content : awemeRiskStructV2.content;
        awemeRiskModel2.notice = C1662a.m5934a(awemeRiskStructV2.notice, awemeRiskModel2.notice);
        awemeRiskModel2.url = awemeRiskStructV2.url == null ? awemeRiskModel2.url : awemeRiskStructV2.url;
        return awemeRiskModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo */
    public static HotSearchInfo m5826xdc86b975(AwemeSearchStructV2 awemeSearchStructV2, HotSearchInfo hotSearchInfo) {
        if (awemeSearchStructV2 == null) {
            return hotSearchInfo;
        }
        HotSearchInfo hotSearchInfo2 = new HotSearchInfo();
        hotSearchInfo2.sentence = awemeSearchStructV2.sentence == null ? hotSearchInfo2.sentence : awemeSearchStructV2.sentence;
        hotSearchInfo2.challengeId = awemeSearchStructV2.challenge_id == null ? hotSearchInfo2.challengeId : awemeSearchStructV2.challenge_id;
        hotSearchInfo2.searchWord = awemeSearchStructV2.search_word == null ? hotSearchInfo2.searchWord : awemeSearchStructV2.search_word;
        hotSearchInfo2.value = C1662a.m5930a(awemeSearchStructV2.value, hotSearchInfo2.value);
        hotSearchInfo2.videoRank = C1662a.m5926a(awemeSearchStructV2.vb_rank, hotSearchInfo2.videoRank);
        hotSearchInfo2.videoRankVV = C1662a.m5930a(awemeSearchStructV2.vb_rank_value, hotSearchInfo2.videoRankVV);
        hotSearchInfo2.f79728id = awemeSearchStructV2.group_id == null ? hotSearchInfo2.f79728id : awemeSearchStructV2.group_id;
        hotSearchInfo2.label = C1662a.m5926a(awemeSearchStructV2.label, hotSearchInfo2.label);
        return hotSearchInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeStarAtlasStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStarAtlas */
    public static AwemeStarAtlas m5827x86e073fd(AwemeStarAtlasStructV2 awemeStarAtlasStructV2, AwemeStarAtlas awemeStarAtlas) {
        if (awemeStarAtlasStructV2 == null) {
            return awemeStarAtlas;
        }
        AwemeStarAtlas awemeStarAtlas2 = new AwemeStarAtlas();
        awemeStarAtlas2.reviewStatus = C1662a.m5926a(awemeStarAtlasStructV2.review_status, awemeStarAtlas2.reviewStatus);
        awemeStarAtlas2.starAtlasLink = m5904xf622e661(awemeStarAtlasStructV2.link_info, awemeStarAtlas2.starAtlasLink);
        return awemeStarAtlas2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics */
    public static AwemeStatistics m5828xadd88b01(AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatistics awemeStatistics) {
        if (awemeStatisticsStructV2 == null) {
            return awemeStatistics;
        }
        AwemeStatistics awemeStatistics2 = new AwemeStatistics();
        awemeStatistics2.commentCount = C1662a.m5930a(awemeStatisticsStructV2.comment_count, awemeStatistics2.commentCount);
        awemeStatistics2.diggCount = C1662a.m5930a(awemeStatisticsStructV2.digg_count, awemeStatistics2.diggCount);
        awemeStatistics2.downloadCount = C1662a.m5930a(awemeStatisticsStructV2.download_count, awemeStatistics2.downloadCount);
        awemeStatistics2.playCount = C1662a.m5930a(awemeStatisticsStructV2.play_count, awemeStatistics2.playCount);
        awemeStatistics2.shareCount = C1662a.m5930a(awemeStatisticsStructV2.share_count, awemeStatistics2.shareCount);
        awemeStatistics2.forwardCount = C1662a.m5930a(awemeStatisticsStructV2.forward_count, awemeStatistics2.forwardCount);
        awemeStatistics2.loseCount = C1662a.m5926a(awemeStatisticsStructV2.lose_count, awemeStatistics2.loseCount);
        awemeStatistics2.loseCommentCount = C1662a.m5926a(awemeStatisticsStructV2.lose_comment_count, awemeStatistics2.loseCommentCount);
        return awemeStatistics2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus */
    public static AwemeStatus m5829xf928bfe1(AwemeStatusStructV2 awemeStatusStructV2, AwemeStatus awemeStatus) {
        if (awemeStatusStructV2 == null) {
            return awemeStatus;
        }
        AwemeStatus awemeStatus2 = new AwemeStatus();
        awemeStatus2.isDelete = C1662a.m5934a(awemeStatusStructV2.is_delete, awemeStatus2.isDelete);
        awemeStatus2.allowShare = C1662a.m5934a(awemeStatusStructV2.allow_share, awemeStatus2.allowShare);
        awemeStatus2.allowComment = C1662a.m5934a(awemeStatusStructV2.allow_comment, awemeStatus2.allowComment);
        awemeStatus2.privateStatus = C1662a.m5926a(awemeStatusStructV2.private_status, awemeStatus2.privateStatus);
        awemeStatus2.withFusionGoods = C1662a.m5934a(awemeStatusStructV2.with_fusion_goods, awemeStatus2.withFusionGoods);
        awemeStatus2.inReviewing = C1662a.m5934a(awemeStatusStructV2.in_reviewing, awemeStatus2.inReviewing);
        awemeStatus2.reviewed = C1662a.m5926a(awemeStatusStructV2.reviewed, awemeStatus2.reviewed);
        awemeStatus2.selfSee = C1662a.m5934a(awemeStatusStructV2.self_see, awemeStatus2.selfSee);
        awemeStatus2.isProhibited = C1662a.m5934a(awemeStatusStructV2.is_prohibited, awemeStatus2.isProhibited);
        awemeStatus2.downloadStatus = C1662a.m5926a(awemeStatusStructV2.download_status, awemeStatus2.downloadStatus);
        return awemeStatus2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme */
    public static Aweme m5830xbda5a8e1(AwemeStructV2 awemeStructV2, Aweme aweme) {
        if (awemeStructV2 == null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.aid = awemeStructV2.aweme_id == null ? aweme2.aid : awemeStructV2.aweme_id;
        aweme2.desc = awemeStructV2.desc == null ? aweme2.desc : awemeStructV2.desc;
        aweme2.createTime = C1662a.m5930a(awemeStructV2.create_time, aweme2.createTime);
        aweme2.author = m5910x2fb9c61e(awemeStructV2.author, aweme2.author);
        aweme2.music = m5875x2fe8170e(awemeStructV2.music, aweme2.music);
        aweme2.challengeList = m5784x890b881a(awemeStructV2.cha_list, aweme2.challengeList);
        aweme2.video = m5913xdc245461(awemeStructV2.video, aweme2.video);
        aweme2.shareUrl = awemeStructV2.share_url == null ? aweme2.shareUrl : awemeStructV2.share_url;
        aweme2.userDigg = C1662a.m5926a(awemeStructV2.user_digged, aweme2.userDigg);
        aweme2.statistics = m5828xadd88b01(awemeStructV2.statistics, aweme2.statistics);
        aweme2.status = m5829xf928bfe1(awemeStructV2.status, aweme2.status);
        aweme2.extra = awemeStructV2.extra == null ? aweme2.extra : awemeStructV2.extra;
        aweme2.rate = C1662a.m5926a(awemeStructV2.rate, aweme2.rate);
        aweme2.textExtra = m5801xdd10ff50(awemeStructV2.text_extra, aweme2.textExtra);
        aweme2.labelLarge = m5907xd6e21675(awemeStructV2.label_large, aweme2.labelLarge);
        aweme2.labelThumb = m5907xd6e21675(awemeStructV2.label_thumb, aweme2.labelThumb);
        aweme2.isTop = C1662a.m5926a(awemeStructV2.is_top, aweme2.isTop);
        aweme2.labelTop = m5907xd6e21675(awemeStructV2.label_top, aweme2.labelTop);
        aweme2.shareInfo = m5899xe4348698(awemeStructV2.share_info, aweme2.shareInfo);
        aweme2.originAuthor = m5907xd6e21675(awemeStructV2.label_origin_author, aweme2.originAuthor);
        aweme2.distance = awemeStructV2.distance == null ? aweme2.distance : awemeStructV2.distance;
        aweme2.musicStarter = m5907xd6e21675(awemeStructV2.label_music_starter, aweme2.musicStarter);
        aweme2.labelPrivate = m5907xd6e21675(awemeStructV2.label_private, aweme2.labelPrivate);
        aweme2.videoLabels = m5781x76f794a0(awemeStructV2.video_labels, aweme2.videoLabels);
        aweme2.isVr = C1662a.m5934a(awemeStructV2.is_vr, aweme2.isVr);
        aweme2.landingPage = awemeStructV2.landing_page == null ? aweme2.landingPage : awemeStructV2.landing_page;
        aweme2.isAd = C1662a.m5934a(awemeStructV2.is_ads, aweme2.isAd);
        aweme2.poiStruct = m5886xbafb8d32(awemeStructV2.poi_info, aweme2.poiStruct);
        aweme2.awemeType = C1662a.m5926a(awemeStructV2.aweme_type, aweme2.awemeType);
        aweme2.relationLabel = m5894x14249e0d(awemeStructV2.relation_label, aweme2.relationLabel);
        aweme2.isFantasy = C1662a.m5934a(awemeStructV2.is_fantasy, aweme2.isFantasy);
        aweme2.cmtSwt = C1662a.m5934a(awemeStructV2.cmt_swt, aweme2.cmtSwt);
        aweme2.imageInfos = m5789x71a3bddb(awemeStructV2.image_infos, aweme2.imageInfos);
        aweme2.awemeRiskModel = m5825x7282f728(awemeStructV2.risk_infos, aweme2.awemeRiskModel);
        aweme2.isRelieve = C1662a.m5934a(awemeStructV2.is_relieve, aweme2.isRelieve);
        aweme2.position = m5796xed17e9e(awemeStructV2.position, aweme2.position);
        aweme2.uniqidPosition = m5796xed17e9e(awemeStructV2.uniqid_position, aweme2.uniqidPosition);
        aweme2.isHashTag = C1662a.m5926a(awemeStructV2.is_hash_tag, aweme2.isHashTag);
        aweme2.isPgcShow = C1662a.m5934a(awemeStructV2.is_pgcshow, aweme2.isPgcShow);
        aweme2.region = awemeStructV2.region == null ? aweme2.region : awemeStructV2.region;
        aweme2.textVideoLabels = m5803x16f8d95a(awemeStructV2.video_text, aweme2.textVideoLabels);
        aweme2.specialSticker = m5903xd27658e1(awemeStructV2.sp_sticker, aweme2.specialSticker);
        aweme2.adSchedule = awemeStructV2.ad_schedule == null ? aweme2.adSchedule : awemeStructV2.ad_schedule;
        aweme2.collectStatus = C1662a.m5926a(awemeStructV2.collect_stat, aweme2.collectStatus);
        aweme2.textTopLabels = m5803x16f8d95a(awemeStructV2.label_top_text, aweme2.textTopLabels);
        aweme2.stickerIDs = awemeStructV2.stickers == null ? aweme2.stickerIDs : awemeStructV2.stickers;
        aweme2.forwardItem = m5830xbda5a8e1(awemeStructV2.forward_item, aweme2.forwardItem);
        aweme2.forwardCommentId = awemeStructV2.forward_comment_id == null ? aweme2.forwardCommentId : awemeStructV2.forward_comment_id;
        aweme2.forwardItemId = awemeStructV2.forward_item_id == null ? aweme2.forwardItemId : awemeStructV2.forward_item_id;
        aweme2.preForwardId = awemeStructV2.pre_forward_id == null ? aweme2.preForwardId : awemeStructV2.pre_forward_id;
        aweme2.preventDownload = C1662a.m5934a(awemeStructV2.prevent_download, aweme2.preventDownload);
        aweme2.nicknamePosition = m5796xed17e9e(awemeStructV2.nickname_position, aweme2.nicknamePosition);
        aweme2.commentSetting = C1662a.m5926a(awemeStructV2.item_comment_settings, aweme2.commentSetting);
        aweme2.descendantsModel = m5846x20c3bc89(awemeStructV2.descendants, aweme2.descendantsModel);
        aweme2.awemeRawAd = C30147e.m70752a(awemeStructV2.raw_ad_data, aweme2.awemeRawAd);
        aweme2.gameInfo = m5853xcdef338b(awemeStructV2.game_info, aweme2.gameInfo);
        aweme2.microAppInfo = m5871x5742a110(awemeStructV2.micro_app_info, aweme2.microAppInfo);
        aweme2.withPromotionalMusic = C1662a.m5934a(awemeStructV2.with_promotional_music, aweme2.withPromotionalMusic);
        aweme2.linkAdData = C30147e.m70751a(awemeStructV2.link_ad_data, aweme2.linkAdData);
        aweme2.xiGuaTask = m5920xc04704f4(awemeStructV2.xigua_task, aweme2.xiGuaTask);
        aweme2.activityPendant = m5839xaa721a85(awemeStructV2.activity_pendant, aweme2.activityPendant);
        aweme2.stickerEntranceInfo = m5877xe7895fba(awemeStructV2.sticker_detail, aweme2.stickerEntranceInfo);
        aweme2.longVideos = m5791x8d23647(awemeStructV2.long_video, aweme2.longVideos);
        aweme2.duetSetting = C1662a.m5926a(awemeStructV2.item_duet, aweme2.duetSetting);
        aweme2.reactSetting = C1662a.m5926a(awemeStructV2.item_react, aweme2.reactSetting);
        aweme2.hotSearchInfo = m5826xdc86b975(awemeStructV2.hot_info, aweme2.hotSearchInfo);
        aweme2.starAtlasOrderId = C1662a.m5930a(awemeStructV2.star_atlas_order_id, aweme2.starAtlasOrderId);
        aweme2.mLabelMusicStarterText = awemeStructV2.label_music_starter_text == null ? aweme2.mLabelMusicStarterText : awemeStructV2.label_music_starter_text;
        aweme2.downloadWithoutWatermark = C1662a.m5934a(awemeStructV2.without_watermark, aweme2.downloadWithoutWatermark);
        aweme2.preload = m5889xdd7fa861(awemeStructV2.preload, aweme2.preload);
        aweme2.starRecommendTag = awemeStructV2.star_recommend_tag == null ? aweme2.starRecommendTag : awemeStructV2.star_recommend_tag;
        aweme2.adOrderId = awemeStructV2.ad_order_id == null ? aweme2.adOrderId : awemeStructV2.ad_order_id;
        aweme2.starAtlasInfo = m5827x86e073fd(awemeStructV2.star_atlas_info, aweme2.starAtlasInfo);
        aweme2.descLanguage = awemeStructV2.desc_language == null ? aweme2.descLanguage : awemeStructV2.desc_language;
        aweme2.floatingCardInfo = m5821xba8b7c80(awemeStructV2.floating_card_content, aweme2.floatingCardInfo);
        aweme2.interactStickerStructs = m5790xb33b7ec(awemeStructV2.interaction_stickers, aweme2.interactStickerStructs);
        aweme2.adLinkType = C1662a.m5926a(awemeStructV2.ad_link_type, aweme2.adLinkType);
        aweme2.takeDownReason = C1662a.m5926a(awemeStructV2.take_down_reason, aweme2.takeDownReason);
        aweme2.takeDownDesc = awemeStructV2.take_down_desc == null ? aweme2.takeDownDesc : awemeStructV2.take_down_desc;
        aweme2.uploadMiscInfoStructStr = awemeStructV2.misc_info == null ? aweme2.uploadMiscInfoStructStr : awemeStructV2.misc_info;
        aweme2.promotionOtherInfo = m5824x5e568bd1(awemeStructV2.promotion_other_info, aweme2.promotionOtherInfo);
        aweme2.originCommentIds = awemeStructV2.origin_comment_ids == null ? aweme2.originCommentIds : awemeStructV2.origin_comment_ids;
        aweme2.commerceConfigDataList = m5785x76aeb75e(awemeStructV2.commerce_config_data, aweme2.commerceConfigDataList);
        aweme2.commerceStickerInfo = m5818xe74539ee(awemeStructV2.commerce_sticker_info, aweme2.commerceStickerInfo);
        aweme2.enableTopView = C1662a.m5934a(awemeStructV2.enable_top_view, aweme2.enableTopView);
        aweme2.distributeType = C1662a.m5926a(awemeStructV2.distribute_type, aweme2.distributeType);
        aweme2.videoControl = m5911x817ae5e8(awemeStructV2.video_control, aweme2.videoControl);
        aweme2.isEffectDesigner = C1662a.m5935a(awemeStructV2.is_effect_designer, aweme2.isEffectDesigner);
        aweme2.adAwemeSource = C1662a.m5926a(awemeStructV2.ad_aweme_source, aweme2.adAwemeSource);
        aweme2.awemeControl = m5820xbb564985(awemeStructV2.aweme_control, aweme2.awemeControl);
        aweme2.hasVisionSearchEntry = C1662a.m5934a(awemeStructV2.has_vs_entry, aweme2.hasVisionSearchEntry);
        aweme2.anchor = m5812x94014543(awemeStructV2.anchor, aweme2.anchor);
        aweme2.feedRelationLabel = m5895x36fc5a9f(awemeStructV2.feed_relation_label, aweme2.feedRelationLabel);
        aweme2.mixInfo = m5874x5b231276(awemeStructV2.mix_info, aweme2.mixInfo);
        aweme2.hotListStruct = m5855x45439813(awemeStructV2.hot_list, aweme2.hotListStruct);
        aweme2.mCommerceVideoAuthInfo = m5819x337d8a6e(awemeStructV2.commerce_info, aweme2.mCommerceVideoAuthInfo);
        aweme2.awemeNationalTask = m5823xf4f1d381(awemeStructV2.national_task_info, aweme2.awemeNationalTask);
        aweme2.bannerTip = m5831x4c72d636(awemeStructV2.banner_tip, aweme2.bannerTip);
        aweme2.awemeACLShareInfo = m5816x769da000(awemeStructV2.acl_info, aweme2.awemeACLShareInfo);
        aweme2.anchorInfo = m5817x956cf17e(awemeStructV2.anchor_info, aweme2.anchorInfo);
        aweme2.mLiveAwesomeSplashInfo = m5835x8441e9e8(awemeStructV2.cny_info, aweme2.mLiveAwesomeSplashInfo);
        aweme2.isFamiliar = C1662a.m5934a(awemeStructV2.is_familiar, aweme2.isFamiliar);
        aweme2.needVisionSearchEntry = C1662a.m5934a(awemeStructV2.need_vs_entry, aweme2.needVisionSearchEntry);
        aweme2.mRoomFeedCellStruct = m5918xf777e67b(awemeStructV2.cell_room, aweme2.mRoomFeedCellStruct);
        aweme2.liveReaSon = awemeStructV2.live_reason == null ? aweme2.liveReaSon : awemeStructV2.live_reason;
        aweme2.videoFeedTag = awemeStructV2.video_feed_tag == null ? aweme2.videoFeedTag : awemeStructV2.video_feed_tag;
        aweme2.videoMaskInfo = m5868x59acc730(awemeStructV2.mask_info, aweme2.videoMaskInfo);
        aweme2.linkMatch = m5863x13c582e8(awemeStructV2.link_match, aweme2.linkMatch);
        aweme2.videoReplyStruct = m5912xc5fe6d6c(awemeStructV2.video_reply_info, aweme2.videoReplyStruct);
        aweme2.anchors = m5780x4869b99e(awemeStructV2.anchors, aweme2.anchors);
        aweme2.hybridLabels = m5788xa8867139(awemeStructV2.hybrid_label, aweme2.hybridLabels);
        aweme2.relationRecommendInfo = m5896xbcd34a71(awemeStructV2.relation_recommend_info, aweme2.relationRecommendInfo);
        aweme2.userProfileInitInfo = m5909xf505f47f(awemeStructV2.user_profile_init_info, aweme2.userProfileInitInfo);
        aweme2.withSurvey = C1662a.m5934a(awemeStructV2.with_survey, aweme2.withSurvey);
        return aweme2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$BannerTipV2$$com$ss$android$ugc$aweme$feed$model$BannerTip */
    public static BannerTip m5831x4c72d636(BannerTipV2 bannerTipV2, BannerTip bannerTip) {
        if (bannerTipV2 == null) {
            return bannerTip;
        }
        BannerTip bannerTip2 = new BannerTip();
        bannerTip2.bannerType = C1662a.m5926a(bannerTipV2.banner_type, bannerTip2.bannerType);
        bannerTip2.bannerTxt = bannerTipV2.banner_txt == null ? bannerTip2.bannerTxt : bannerTipV2.banner_txt;
        bannerTip2.linkType = C1662a.m5926a(bannerTipV2.link_type, bannerTip2.linkType);
        bannerTip2.linkUrl = bannerTipV2.link_url == null ? bannerTip2.linkUrl : bannerTipV2.link_url;
        bannerTip2.linkTxt = bannerTipV2.link_txt == null ? bannerTip2.linkTxt : bannerTipV2.link_txt;
        return bannerTip2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate */
    public static BitRate m5832x8afb92e1(BitRateStructV2 bitRateStructV2, BitRate bitRate) {
        if (bitRateStructV2 == null) {
            return bitRate;
        }
        BitRate bitRate2 = new BitRate();
        bitRate2.gearName = bitRateStructV2.gear_name == null ? bitRate2.gearName : bitRateStructV2.gear_name;
        bitRate2.qualityType = C1662a.m5926a(bitRateStructV2.quality_type, bitRate2.qualityType);
        bitRate2.bitRate = C1662a.m5926a(bitRateStructV2.bit_rate, bitRate2.bitRate);
        bitRate2.playAddr = m5907xd6e21675(bitRateStructV2.play_addr, bitRate2.playAddr);
        bitRate2.isH265 = C1662a.m5926a(bitRateStructV2.is_h265, bitRate2.isH265);
        return bitRate2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$BlueVBrandInfoStructV2$$com$ss$android$ugc$aweme$profile$model$BlueVBrandInfo */
    public static BlueVBrandInfo m5833x254728de(BlueVBrandInfoStructV2 blueVBrandInfoStructV2, BlueVBrandInfo blueVBrandInfo) {
        if (blueVBrandInfoStructV2 == null) {
            return blueVBrandInfo;
        }
        BlueVBrandInfo blueVBrandInfo2 = new BlueVBrandInfo();
        blueVBrandInfo2.categoryId = C1662a.m5926a(blueVBrandInfoStructV2.category_id, blueVBrandInfo2.categoryId);
        blueVBrandInfo2.categoryName = blueVBrandInfoStructV2.category_name == null ? blueVBrandInfo2.categoryName : blueVBrandInfoStructV2.category_name;
        blueVBrandInfo2.brandId = C1662a.m5926a(blueVBrandInfoStructV2.brand_id, blueVBrandInfo2.brandId);
        blueVBrandInfo2.brandName = blueVBrandInfoStructV2.brand_name == null ? blueVBrandInfo2.brandName : blueVBrandInfoStructV2.brand_name;
        blueVBrandInfo2.logoUrl = m5907xd6e21675(blueVBrandInfoStructV2.logo_url, blueVBrandInfo2.logoUrl);
        blueVBrandInfo2.heat = C1662a.m5928a(blueVBrandInfoStructV2.heat, blueVBrandInfo2.heat);
        blueVBrandInfo2.rank = C1662a.m5926a(blueVBrandInfoStructV2.rank, blueVBrandInfo2.rank);
        blueVBrandInfo2.rankDiff = C1662a.m5926a(blueVBrandInfoStructV2.rank_diff, blueVBrandInfo2.rankDiff);
        blueVBrandInfo2.tagName = blueVBrandInfoStructV2.tag_name == null ? blueVBrandInfo2.tagName : blueVBrandInfoStructV2.tag_name;
        return blueVBrandInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$BranchBillboardWeeklyStructV2$$com$ss$android$ugc$aweme$hotsearch$model$BillboardWeeklyInfo */
    public static C22468a m5834x55bde6e0(BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2, C22468a aVar) {
        if (branchBillboardWeeklyStructV2 == null) {
            return aVar;
        }
        C22468a aVar2 = new C22468a();
        aVar2.uid = branchBillboardWeeklyStructV2.uid == null ? aVar2.uid : branchBillboardWeeklyStructV2.uid;
        aVar2.editionNo = C1662a.m5926a(branchBillboardWeeklyStructV2.edition_no, aVar2.editionNo);
        aVar2.startTime = C1662a.m5930a(branchBillboardWeeklyStructV2.start_time, aVar2.startTime);
        aVar2.endTime = C1662a.m5930a(branchBillboardWeeklyStructV2.end_time, aVar2.endTime);
        return aVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CNYStructV2$$com$ss$android$ugc$aweme$feed$model$livesplash$LiveAwesomeSplashInfo */
    public static LiveAwesomeSplashInfo m5835x8441e9e8(CNYStructV2 cNYStructV2, LiveAwesomeSplashInfo liveAwesomeSplashInfo) {
        if (cNYStructV2 == null) {
            return liveAwesomeSplashInfo;
        }
        LiveAwesomeSplashInfo liveAwesomeSplashInfo2 = new LiveAwesomeSplashInfo();
        liveAwesomeSplashInfo2.startTime = C1662a.m5930a(cNYStructV2.start_time, liveAwesomeSplashInfo2.startTime);
        liveAwesomeSplashInfo2.endTime = C1662a.m5930a(cNYStructV2.end_time, liveAwesomeSplashInfo2.endTime);
        liveAwesomeSplashInfo2.topviewValid = C1662a.m5934a(cNYStructV2.topview_valid, liveAwesomeSplashInfo2.topviewValid);
        liveAwesomeSplashInfo2.feedShowTime = C1662a.m5926a(cNYStructV2.feed_show_time, liveAwesomeSplashInfo2.feedShowTime);
        liveAwesomeSplashInfo2.liveData = cNYStructV2.live_info == null ? liveAwesomeSplashInfo2.liveData : cNYStructV2.live_info;
        return liveAwesomeSplashInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CaptionInfoStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionInfo */
    public static C41398a m5836x52c73508(CaptionInfoStructV2 captionInfoStructV2, C41398a aVar) {
        if (captionInfoStructV2 == null) {
            return aVar;
        }
        C41398a aVar2 = new C41398a();
        aVar2.keyword = captionInfoStructV2.keyword == null ? aVar2.keyword : captionInfoStructV2.keyword;
        aVar2.link = captionInfoStructV2.link == null ? aVar2.link : captionInfoStructV2.link;
        return aVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CategoryCoverStructV2$$com$ss$android$ugc$aweme$discover$model$CategoryCoverStruct */
    public static CategoryCoverStruct m5837xd5f807e1(CategoryCoverStructV2 categoryCoverStructV2, CategoryCoverStruct categoryCoverStruct) {
        if (categoryCoverStructV2 == null) {
            return categoryCoverStruct;
        }
        CategoryCoverStruct categoryCoverStruct2 = new CategoryCoverStruct();
        categoryCoverStruct2.awemeId = categoryCoverStructV2.aweme_id == null ? categoryCoverStruct2.awemeId : categoryCoverStructV2.aweme_id;
        categoryCoverStruct2.cover = m5907xd6e21675(categoryCoverStructV2.cover, categoryCoverStruct2.cover);
        categoryCoverStruct2.dynamicCover = m5907xd6e21675(categoryCoverStructV2.dynamic_cover, categoryCoverStruct2.dynamicCover);
        return categoryCoverStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge */
    public static Challenge m5838x5652a2ac(ChallengeStructV2 challengeStructV2, Challenge challenge) {
        if (challengeStructV2 == null) {
            return challenge;
        }
        Challenge challenge2 = new Challenge();
        challenge2.cid = challengeStructV2.cid == null ? challenge2.cid : challengeStructV2.cid;
        challenge2.challengeName = challengeStructV2.cha_name == null ? challenge2.challengeName : challengeStructV2.cha_name;
        challenge2.desc = challengeStructV2.desc == null ? challenge2.desc : challengeStructV2.desc;
        challenge2.schema = challengeStructV2.schema == null ? challenge2.schema : challengeStructV2.schema;
        challenge2.author = m5910x2fb9c61e(challengeStructV2.author, challenge2.author);
        challenge2.userCount = C1662a.m5926a(challengeStructV2.user_count, challenge2.userCount);
        challenge2.shareInfo = m5899xe4348698(challengeStructV2.share_info, challenge2.shareInfo);
        challenge2.connectMusics = m5793xd117b1c(challengeStructV2.connect_music, challenge2.connectMusics);
        challenge2.type = C1662a.m5926a(challengeStructV2.type, challenge2.type);
        challenge2.subType = C1662a.m5926a(challengeStructV2.sub_type, challenge2.subType);
        challenge2.backgroundImageUrl = m5907xd6e21675(challengeStructV2.background_image_url, challenge2.backgroundImageUrl);
        challenge2.stickerId = challengeStructV2.sticker_id == null ? challenge2.stickerId : challengeStructV2.sticker_id;
        challenge2.linkText = challengeStructV2.link_text == null ? challenge2.linkText : challengeStructV2.link_text;
        challenge2.linkAction = challengeStructV2.link_action == null ? challenge2.linkAction : challengeStructV2.link_action;
        challenge2.pgcshow = C1662a.m5934a(challengeStructV2.is_pgcshow, challenge2.pgcshow);
        challenge2.collectStatus = C1662a.m5926a(challengeStructV2.collect_stat, challenge2.collectStatus);
        challenge2.coverItem = m5907xd6e21675(challengeStructV2.cover_item, challenge2.coverItem);
        challenge2.isChallenge = C1662a.m5926a(challengeStructV2.is_challenge, challenge2.isChallenge);
        challenge2.viewCount = C1662a.m5930a(challengeStructV2.view_count, challenge2.viewCount);
        challenge2.challengeDisclaimer = m5847x15f566f5(challengeStructV2.disclaimer, challenge2.challengeDisclaimer);
        challenge2.allowUploadCover = C1662a.m5924a(challengeStructV2.allow_upload_cover, challenge2.allowUploadCover);
        challenge2.isCommerceAndValid = C1662a.m5934a(challengeStructV2.is_commerce, challenge2.isCommerceAndValid);
        challenge2.categoryCover = m5837xd5f807e1(challengeStructV2.category_cover_info, challenge2.categoryCover);
        challenge2.challengeProfileUrl = challengeStructV2.hashtag_profile == null ? challenge2.challengeProfileUrl : challengeStructV2.hashtag_profile;
        challenge2.challengeBgUrl = challengeStructV2.cover_photo == null ? challenge2.challengeBgUrl : challengeStructV2.cover_photo;
        challenge2.isHotSearch = C1662a.m5926a(challengeStructV2.is_hot_search, challenge2.isHotSearch);
        challenge2.linkType = C1662a.m5926a(challengeStructV2.link_type, challenge2.linkType);
        challenge2.challengeAnnouncement = m5814xcb0a6e35(challengeStructV2.announcement_info, challenge2.challengeAnnouncement);
        challenge2.contentType = C1662a.m5926a(challengeStructV2.content_type, challenge2.contentType);
        challenge2.moduleType = C1662a.m5926a(challengeStructV2.module_type, challenge2.moduleType);
        challenge2.profileTagUrl = challengeStructV2.profile_tag == null ? challenge2.profileTagUrl : challengeStructV2.profile_tag;
        challenge2.attrs = challengeStructV2.cha_attrs == null ? challenge2.attrs : challengeStructV2.cha_attrs;
        challenge2.transfrom = m5858xdc170a42(challengeStructV2.button, challenge2.transfrom);
        return challenge2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceActivityStructV2$$com$ss$android$ugc$aweme$commerce$model$CommerceActivityStruct */
    public static C25516b m5839xaa721a85(CommerceActivityStructV2 commerceActivityStructV2, C25516b bVar) {
        if (commerceActivityStructV2 == null) {
            return bVar;
        }
        C25516b bVar2 = new C25516b();
        bVar2.actType = C1662a.m5926a(commerceActivityStructV2.act_type, bVar2.actType);
        bVar2.image = m5907xd6e21675(commerceActivityStructV2.image, bVar2.image);
        bVar2.jumpWebUrl = commerceActivityStructV2.jump_web_url == null ? bVar2.jumpWebUrl : commerceActivityStructV2.jump_web_url;
        bVar2.jumpOpenUrl = commerceActivityStructV2.jump_open_url == null ? bVar2.jumpOpenUrl : commerceActivityStructV2.jump_open_url;
        bVar2.title = commerceActivityStructV2.title == null ? bVar2.title : commerceActivityStructV2.title;
        bVar2.startTime = C1662a.m5930a(commerceActivityStructV2.start_time, bVar2.startTime);
        bVar2.endTime = C1662a.m5930a(commerceActivityStructV2.end_time, bVar2.endTime);
        bVar2.timeRange = m5779xa30ff353(commerceActivityStructV2.time_range, bVar2.timeRange);
        bVar2.trackUrlList = m5907xd6e21675(commerceActivityStructV2.track_url_list, bVar2.trackUrlList);
        bVar2.clickTrackUrlList = m5907xd6e21675(commerceActivityStructV2.click_track_url_list, bVar2.clickTrackUrlList);
        return bVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData */
    public static CommerceConfigData m5840x5692c932(CommerceConfigDataV2 commerceConfigDataV2, CommerceConfigData commerceConfigData) {
        if (commerceConfigDataV2 == null) {
            return commerceConfigData;
        }
        CommerceConfigData commerceConfigData2 = new CommerceConfigData();
        commerceConfigData2.type = C1662a.m5926a(commerceConfigDataV2.type, commerceConfigData2.type);
        commerceConfigData2.itemLikeEggData = m5861x1d28fe76(commerceConfigDataV2.item_like_egg, commerceConfigData2.itemLikeEggData);
        commerceConfigData2.itemCommentEggGroup = C30147e.m70753a(commerceConfigDataV2.data, commerceConfigData2.itemCommentEggGroup);
        return commerceConfigData2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceInfoStructV2$$com$ss$android$ugc$aweme$commerce$CommerceInfo */
    public static C25507c m5841x89ac5ff3(CommerceInfoStructV2 commerceInfoStructV2, C25507c cVar) {
        if (commerceInfoStructV2 == null) {
            return cVar;
        }
        C25507c cVar2 = new C25507c();
        cVar2.headImageUrl = m5907xd6e21675(commerceInfoStructV2.head_image_url, cVar2.headImageUrl);
        cVar2.offlineInfoList = m5794x3e86323(commerceInfoStructV2.offline_info_list, cVar2.offlineInfoList);
        cVar2.challengeList = m5784x890b881a(commerceInfoStructV2.challenge_list, cVar2.challengeList);
        cVar2.smartPhone = m5902x2271c8ae(commerceInfoStructV2.smart_phone, cVar2.smartPhone);
        cVar2.quickShopUrl = commerceInfoStructV2.quick_shop_url == null ? cVar2.quickShopUrl : commerceInfoStructV2.quick_shop_url;
        cVar2.quickShopName = commerceInfoStructV2.quick_shop_name == null ? cVar2.quickShopName : commerceInfoStructV2.quick_shop_name;
        cVar2.siteId = commerceInfoStructV2.site_id == null ? cVar2.siteId : commerceInfoStructV2.site_id;
        return cVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommercePermissionStructV2$$com$ss$android$ugc$aweme$profile$model$CommercePermissionStruct */
    public static CommercePermissionStruct m5842xdb3e10b3(CommercePermissionStructV2 commercePermissionStructV2, CommercePermissionStruct commercePermissionStruct) {
        if (commercePermissionStructV2 == null) {
            return commercePermissionStruct;
        }
        CommercePermissionStruct commercePermissionStruct2 = new CommercePermissionStruct();
        commercePermissionStruct2.topItem = C1662a.m5926a(commercePermissionStructV2.top_item, commercePermissionStruct2.topItem);
        commercePermissionStruct2.starAtlasOrder = C1662a.m5926a(commercePermissionStructV2.star_atlas_order, commercePermissionStruct2.starAtlasOrder);
        return commercePermissionStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceSticker */
    public static C46067b m5843xb40da7e0(CommerceStickerStructV2 commerceStickerStructV2, C46067b bVar) {
        if (commerceStickerStructV2 == null) {
            return bVar;
        }
        C46067b bVar2 = new C46067b();
        bVar2.f116245id = commerceStickerStructV2.f128792id == null ? bVar2.f116245id : commerceStickerStructV2.f128792id;
        bVar2.adOwnerId = commerceStickerStructV2.ad_owner_id == null ? bVar2.adOwnerId : commerceStickerStructV2.ad_owner_id;
        bVar2.adOwnerName = commerceStickerStructV2.ad_owner_name == null ? bVar2.adOwnerName : commerceStickerStructV2.ad_owner_name;
        bVar2.detailDesc = commerceStickerStructV2.detail_desc == null ? bVar2.detailDesc : commerceStickerStructV2.detail_desc;
        bVar2.detailLetters = commerceStickerStructV2.detail_letters == null ? bVar2.detailLetters : commerceStickerStructV2.detail_letters;
        bVar2.detailOpenUrl = commerceStickerStructV2.detail_open_url == null ? bVar2.detailOpenUrl : commerceStickerStructV2.detail_open_url;
        bVar2.detailWebUrl = commerceStickerStructV2.detail_web_url == null ? bVar2.detailWebUrl : commerceStickerStructV2.detail_web_url;
        bVar2.detailWebUrlTitle = commerceStickerStructV2.detail_web_url_title == null ? bVar2.detailWebUrlTitle : commerceStickerStructV2.detail_web_url_title;
        bVar2.screenDesc = commerceStickerStructV2.screen_desc == null ? bVar2.screenDesc : commerceStickerStructV2.screen_desc;
        bVar2.musicId = commerceStickerStructV2.music_id == null ? bVar2.musicId : commerceStickerStructV2.music_id;
        bVar2.challengeId = commerceStickerStructV2.challenge_id == null ? bVar2.challengeId : commerceStickerStructV2.challenge_id;
        bVar2.screenIcon = m5907xd6e21675(commerceStickerStructV2.screen_icon, bVar2.screenIcon);
        bVar2.expireTime = C1662a.m5930a(commerceStickerStructV2.expire_time, bVar2.expireTime);
        bVar2.commerceStickerUnlockInfo = m5844x5f668cb6(commerceStickerStructV2.unlock_info, bVar2.commerceStickerUnlockInfo);
        return bVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceStickerUnlockStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceStickerUnlockInfo */
    public static C46068c m5844x5f668cb6(CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2, C46068c cVar) {
        if (commerceStickerUnlockStructV2 == null) {
            return cVar;
        }
        C46068c cVar2 = new C46068c();
        cVar2.desc = commerceStickerUnlockStructV2.desc == null ? cVar2.desc : commerceStickerUnlockStructV2.desc;
        cVar2.webUrl = commerceStickerUnlockStructV2.web_url == null ? cVar2.webUrl : commerceStickerUnlockStructV2.web_url;
        cVar2.openUrl = commerceStickerUnlockStructV2.open_url == null ? cVar2.openUrl : commerceStickerUnlockStructV2.open_url;
        return cVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceUserStructV2$$com$ss$android$ugc$aweme$profile$model$CommerceUserInfo */
    public static CommerceUserInfo m5845x60620bcc(CommerceUserStructV2 commerceUserStructV2, CommerceUserInfo commerceUserInfo) {
        if (commerceUserStructV2 == null) {
            return commerceUserInfo;
        }
        CommerceUserInfo commerceUserInfo2 = new CommerceUserInfo();
        commerceUserInfo2.starAtlas = C1662a.m5926a(commerceUserStructV2.star_atlas, commerceUserInfo2.starAtlas);
        commerceUserInfo2.showStarAtlasCooperation = C1662a.m5934a(commerceUserStructV2.show_star_atlas_cooperation, commerceUserInfo2.showStarAtlasCooperation);
        commerceUserInfo2.hasAdEntry = C1662a.m5934a(commerceUserStructV2.has_ads_entry, commerceUserInfo2.hasAdEntry);
        commerceUserInfo2.linkUserInfo = m5864x809a4293(commerceUserStructV2.link_user_info, commerceUserInfo2.linkUserInfo);
        commerceUserInfo2.adInfluencerType = C1662a.m5926a(commerceUserStructV2.ad_influencer_type, commerceUserInfo2.adInfluencerType);
        return commerceUserInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$DescendantStructV2$$com$ss$android$ugc$aweme$feed$model$DescendantsModel */
    public static DescendantsModel m5846x20c3bc89(DescendantStructV2 descendantStructV2, DescendantsModel descendantsModel) {
        if (descendantStructV2 == null) {
            return descendantsModel;
        }
        DescendantsModel descendantsModel2 = new DescendantsModel();
        descendantsModel2.platforms = descendantStructV2.platforms == null ? descendantsModel2.platforms : descendantStructV2.platforms;
        descendantsModel2.notifyMsg = descendantStructV2.notify_msg == null ? descendantsModel2.notifyMsg : descendantStructV2.notify_msg;
        return descendantsModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$DisclaimerStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeDisclaimer */
    public static ChallengeDisclaimer m5847x15f566f5(DisclaimerStructV2 disclaimerStructV2, ChallengeDisclaimer challengeDisclaimer) {
        if (disclaimerStructV2 == null) {
            return challengeDisclaimer;
        }
        ChallengeDisclaimer challengeDisclaimer2 = new ChallengeDisclaimer();
        challengeDisclaimer2.title = disclaimerStructV2.title == null ? challengeDisclaimer2.title : disclaimerStructV2.title;
        challengeDisclaimer2.content = disclaimerStructV2.content == null ? challengeDisclaimer2.content : disclaimerStructV2.content;
        return challengeDisclaimer2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$EffectArtistStructV2$$com$ss$android$ugc$aweme$profile$model$EffectArtistDetail */
    public static EffectArtistDetail m5848xcd80c52f(EffectArtistStructV2 effectArtistStructV2, EffectArtistDetail effectArtistDetail) {
        if (effectArtistStructV2 == null) {
            return effectArtistDetail;
        }
        EffectArtistDetail effectArtistDetail2 = new EffectArtistDetail();
        effectArtistDetail2.total = C1662a.m5926a(effectArtistStructV2.total, effectArtistDetail2.total);
        return effectArtistDetail2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo */
    public static ExternalMusicInfo m5849xc9224d66(ExternalSongStructV2 externalSongStructV2, ExternalMusicInfo externalMusicInfo) {
        if (externalSongStructV2 == null) {
            return externalMusicInfo;
        }
        ExternalMusicInfo externalMusicInfo2 = new ExternalMusicInfo();
        externalMusicInfo2.jumpUrl = externalSongStructV2.h5_url == null ? externalMusicInfo2.jumpUrl : externalSongStructV2.h5_url;
        externalMusicInfo2.partnerName = externalSongStructV2.partner_name == null ? externalMusicInfo2.partnerName : externalSongStructV2.partner_name;
        externalMusicInfo2.partnerSongId = externalSongStructV2.partner_song_id == null ? externalMusicInfo2.partnerSongId : externalSongStructV2.partner_song_id;
        externalMusicInfo2.externalSongKey = externalSongStructV2.external_song_key == null ? externalMusicInfo2.externalSongKey : externalSongStructV2.external_song_key;
        return externalMusicInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ExtraStructV2$$com$ss$android$ugc$aweme$feed$model$Extra */
    public static Extra m5850x7e6bce41(ExtraStructV2 extraStructV2, Extra extra) {
        if (extraStructV2 == null) {
            return extra;
        }
        Extra extra2 = new Extra();
        extra2.now = C1662a.m5930a(extraStructV2.now, extra2.now);
        extra2.fatalItemIds = extraStructV2.fatal_item_ids == null ? extra2.fatalItemIds : extraStructV2.fatal_item_ids;
        return extra2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$FansStructV2$$com$ss$android$ugc$aweme$feed$model$live$FansStruct */
    public static FansStruct m5851x43c70f74(FansStructV2 fansStructV2, FansStruct fansStruct) {
        if (fansStructV2 == null) {
            return fansStruct;
        }
        FansStruct fansStruct2 = new FansStruct();
        fansStruct2.fansName = fansStructV2.fans_name == null ? fansStruct2.fansName : fansStructV2.fans_name;
        fansStruct2.fansLevel = C1662a.m5926a(fansStructV2.fans_level, fansStruct2.fansLevel);
        fansStruct2.isFan = C1662a.m5934a(fansStructV2.is_fan, fansStruct2.isFan);
        fansStruct2.lightUp = C1662a.m5934a(fansStructV2.light_up, fansStruct2.lightUp);
        return fansStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail */
    public static FollowerDetail m5852xc3646396(FollowersDetailV2 followersDetailV2, FollowerDetail followerDetail) {
        if (followersDetailV2 == null) {
            return followerDetail;
        }
        FollowerDetail followerDetail2 = new FollowerDetail();
        followerDetail2.name = followersDetailV2.name == null ? followerDetail2.name : followersDetailV2.name;
        followerDetail2.icon = followersDetailV2.icon == null ? followerDetail2.icon : followersDetailV2.icon;
        followerDetail2.fansCount = C1662a.m5926a(followersDetailV2.fans_count, followerDetail2.fansCount);
        followerDetail2.openUrl = followersDetailV2.open_url == null ? followerDetail2.openUrl : followersDetailV2.open_url;
        followerDetail2.appleId = followersDetailV2.apple_id == null ? followerDetail2.appleId : followersDetailV2.apple_id;
        followerDetail2.downloadUrl = followersDetailV2.download_url == null ? followerDetail2.downloadUrl : followersDetailV2.download_url;
        followerDetail2.packageName = followersDetailV2.package_name == null ? followerDetail2.packageName : followersDetailV2.package_name;
        followerDetail2.appName = followersDetailV2.app_name == null ? followerDetail2.appName : followersDetailV2.app_name;
        return followerDetail2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$GameStructV2$$com$ss$android$ugc$aweme$feed$model$GameInfo */
    public static GameInfo m5853xcdef338b(GameStructV2 gameStructV2, GameInfo gameInfo) {
        if (gameStructV2 == null) {
            return gameInfo;
        }
        GameInfo gameInfo2 = new GameInfo();
        gameInfo2.gameType = C1662a.m5926a(gameStructV2.game_type, gameInfo2.gameType);
        gameInfo2.gameScore = C1662a.m5926a(gameStructV2.game_score, gameInfo2.gameScore);
        return gameInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$GuideWordV2$$com$ss$android$ugc$aweme$feed$model$HotSearchGuideWord */
    public static HotSearchGuideWord m5854xd7636a61(GuideWordV2 guideWordV2, HotSearchGuideWord hotSearchGuideWord) {
        if (guideWordV2 == null) {
            return hotSearchGuideWord;
        }
        HotSearchGuideWord hotSearchGuideWord2 = new HotSearchGuideWord();
        hotSearchGuideWord2.displayWord = guideWordV2.word == null ? hotSearchGuideWord2.displayWord : guideWordV2.word;
        hotSearchGuideWord2.searchWord = guideWordV2.search_word == null ? hotSearchGuideWord2.searchWord : guideWordV2.search_word;
        hotSearchGuideWord2.type = C1662a.m5926a(guideWordV2.type, hotSearchGuideWord2.type);
        hotSearchGuideWord2.breatheTimes = C1662a.m5926a(guideWordV2.breathe_times, hotSearchGuideWord2.breatheTimes);
        return hotSearchGuideWord2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$HotListStructV2$$com$ss$android$ugc$aweme$profile$model$HotListStruct */
    public static HotListStruct m5855x45439813(HotListStructV2 hotListStructV2, HotListStruct hotListStruct) {
        if (hotListStructV2 == null) {
            return hotListStruct;
        }
        HotListStruct hotListStruct2 = new HotListStruct();
        hotListStruct2.titile = hotListStructV2.title == null ? hotListStruct2.titile : hotListStructV2.title;
        hotListStruct2.imageUrl = hotListStructV2.image_url == null ? hotListStruct2.imageUrl : hotListStructV2.image_url;
        hotListStruct2.schema = hotListStructV2.schema == null ? hotListStruct2.schema : hotListStructV2.schema;
        hotListStruct2.type = C1662a.m5926a(hotListStructV2.type, hotListStruct2.type);
        hotListStruct2.header = hotListStructV2.header == null ? hotListStruct2.header : hotListStructV2.header;
        hotListStruct2.footer = hotListStructV2.footer == null ? hotListStruct2.footer : hotListStructV2.footer;
        return hotListStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$HotsearchSprintStructV2$$com$ss$android$ugc$aweme$profile$model$HotSearchSprintStruct */
    public static HotSearchSprintStruct m5856xbdc2a07b(HotsearchSprintStructV2 hotsearchSprintStructV2, HotSearchSprintStruct hotSearchSprintStruct) {
        if (hotsearchSprintStructV2 == null) {
            return hotSearchSprintStruct;
        }
        HotSearchSprintStruct hotSearchSprintStruct2 = new HotSearchSprintStruct();
        hotSearchSprintStruct2.sprint = C1662a.m5926a(hotsearchSprintStructV2.sprint, hotSearchSprintStruct2.sprint);
        hotSearchSprintStruct2.hitRankPeoples = m5800x7b892b96(hotsearchSprintStructV2.followers, hotSearchSprintStruct2.hitRankPeoples);
        return hotSearchSprintStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$HybridLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel */
    public static AwemeHybridLabelModel m5857xef19dc1(HybridLabelStructV2 hybridLabelStructV2, AwemeHybridLabelModel awemeHybridLabelModel) {
        if (hybridLabelStructV2 == null) {
            return awemeHybridLabelModel;
        }
        AwemeHybridLabelModel awemeHybridLabelModel2 = new AwemeHybridLabelModel();
        awemeHybridLabelModel2.backgroundColor = hybridLabelStructV2.background_color == null ? awemeHybridLabelModel2.backgroundColor : hybridLabelStructV2.background_color;
        awemeHybridLabelModel2.text = hybridLabelStructV2.text == null ? awemeHybridLabelModel2.text : hybridLabelStructV2.text;
        awemeHybridLabelModel2.textColor = hybridLabelStructV2.text_color == null ? awemeHybridLabelModel2.textColor : hybridLabelStructV2.text_color;
        awemeHybridLabelModel2.imageUrl = m5907xd6e21675(hybridLabelStructV2.image, awemeHybridLabelModel2.imageUrl);
        awemeHybridLabelModel2.refUrl = hybridLabelStructV2.ref_url == null ? awemeHybridLabelModel2.refUrl : hybridLabelStructV2.ref_url;
        return awemeHybridLabelModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$IconButtonStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeTransform */
    public static ChallengeTransform m5858xdc170a42(IconButtonStructV2 iconButtonStructV2, ChallengeTransform challengeTransform) {
        if (iconButtonStructV2 == null) {
            return challengeTransform;
        }
        ChallengeTransform challengeTransform2 = new ChallengeTransform();
        challengeTransform2.text = iconButtonStructV2.text == null ? challengeTransform2.text : iconButtonStructV2.text;
        challengeTransform2.iconUrlModel = m5907xd6e21675(iconButtonStructV2.icon, challengeTransform2.iconUrlModel);
        challengeTransform2.action = iconButtonStructV2.action == null ? challengeTransform2.action : iconButtonStructV2.action;
        return challengeTransform2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo */
    public static ImageInfo m5859x9f65f721(ImageInfoStructV2 imageInfoStructV2, ImageInfo imageInfo) {
        if (imageInfoStructV2 == null) {
            return imageInfo;
        }
        ImageInfo imageInfo2 = new ImageInfo();
        imageInfo2.height = C1662a.m5926a(imageInfoStructV2.height, imageInfo2.height);
        imageInfo2.width = C1662a.m5926a(imageInfoStructV2.width, imageInfo2.width);
        imageInfo2.labelLarge = m5907xd6e21675(imageInfoStructV2.label_large, imageInfo2.labelLarge);
        imageInfo2.labelThumb = m5907xd6e21675(imageInfoStructV2.label_thumb, imageInfo2.labelThumb);
        return imageInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct */
    public static InteractStickerStruct m5860x24286486(InteractionStickerStructV2 interactionStickerStructV2, InteractStickerStruct interactStickerStruct) {
        if (interactionStickerStructV2 == null) {
            return interactStickerStruct;
        }
        InteractStickerStruct interactStickerStruct2 = new InteractStickerStruct();
        interactStickerStruct2.type = C1662a.m5926a(interactionStickerStructV2.type, interactStickerStruct2.type);
        interactStickerStruct2.index = C1662a.m5926a(interactionStickerStructV2.index, interactStickerStruct2.index);
        interactStickerStruct2.poiStruct = m5887xa9e66ec4(interactionStickerStructV2.poi_info, interactStickerStruct2.poiStruct);
        interactStickerStruct2.trackList = interactionStickerStructV2.track_info == null ? interactStickerStruct2.trackList : interactionStickerStructV2.track_info;
        interactStickerStruct2.attr = interactionStickerStructV2.attr == null ? interactStickerStruct2.attr : interactionStickerStructV2.attr;
        interactStickerStruct2.voteStruct = m5917x9c43fc14(interactionStickerStructV2.vote_info, interactStickerStruct2.voteStruct);
        interactStickerStruct2.mTextStruct = interactionStickerStructV2.text_info == null ? interactStickerStruct2.mTextStruct : interactionStickerStructV2.text_info;
        return interactStickerStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ItemLikeEggDataV2$$com$ss$android$ugc$aweme$feed$model$ItemLikeEggData */
    public static ItemLikeEggData m5861x1d28fe76(ItemLikeEggDataV2 itemLikeEggDataV2, ItemLikeEggData itemLikeEggData) {
        if (itemLikeEggDataV2 == null) {
            return itemLikeEggData;
        }
        ItemLikeEggData itemLikeEggData2 = new ItemLikeEggData();
        itemLikeEggData2.materialUrl = itemLikeEggDataV2.material_url == null ? itemLikeEggData2.materialUrl : itemLikeEggDataV2.material_url;
        itemLikeEggData2.fileType = itemLikeEggDataV2.file_type == null ? itemLikeEggData2.fileType : itemLikeEggDataV2.file_type;
        return itemLikeEggData2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LifeStoryBlockStructV2$$com$ss$android$ugc$aweme$profile$model$StoryBlockInfo */
    public static StoryBlockInfo m5862x63b96a30(LifeStoryBlockStructV2 lifeStoryBlockStructV2, StoryBlockInfo storyBlockInfo) {
        if (lifeStoryBlockStructV2 == null) {
            return storyBlockInfo;
        }
        StoryBlockInfo storyBlockInfo2 = new StoryBlockInfo();
        storyBlockInfo2.isBlock = C1662a.m5934a(lifeStoryBlockStructV2.life_story_block, storyBlockInfo2.isBlock);
        storyBlockInfo2.isBlocked = C1662a.m5934a(lifeStoryBlockStructV2.life_story_blocked, storyBlockInfo2.isBlocked);
        return storyBlockInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LinkMatchStructV2$$com$ss$android$ugc$aweme$search$caption$LinkMatch */
    public static C41399b m5863x13c582e8(LinkMatchStructV2 linkMatchStructV2, C41399b bVar) {
        if (linkMatchStructV2 == null) {
            return bVar;
        }
        C41399b bVar2 = new C41399b();
        bVar2.totalLimit = C1662a.m5926a(linkMatchStructV2.total_limit, bVar2.totalLimit);
        bVar2.queryLimit = C1662a.m5926a(linkMatchStructV2.query_limit, bVar2.queryLimit);
        bVar2.matchInfoList = m5792xa5b614b6(linkMatchStructV2.match_info, bVar2.matchInfoList);
        bVar2.captionInfo = m5836x52c73508(linkMatchStructV2.caption_info, bVar2.captionInfo);
        return bVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LinkUserInfoStructV2$$com$ss$android$ugc$aweme$profile$model$LinkUserInfoStruct */
    public static LinkUserInfoStruct m5864x809a4293(LinkUserInfoStructV2 linkUserInfoStructV2, LinkUserInfoStruct linkUserInfoStruct) {
        if (linkUserInfoStructV2 == null) {
            return linkUserInfoStruct;
        }
        LinkUserInfoStruct linkUserInfoStruct2 = new LinkUserInfoStruct();
        linkUserInfoStruct2.authStatus = C1662a.m5926a(linkUserInfoStructV2.auth_status, linkUserInfoStruct2.authStatus);
        linkUserInfoStruct2.authType = C1662a.m5926a(linkUserInfoStructV2.auth_type, linkUserInfoStruct2.authType);
        return linkUserInfoStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LiveHonorStructV2$$com$ss$android$ugc$aweme$profile$model$HonorStruct */
    public static HonorStruct m5865x5053ac85(LiveHonorStructV2 liveHonorStructV2, HonorStruct honorStruct) {
        if (liveHonorStructV2 == null) {
            return honorStruct;
        }
        HonorStruct honorStruct2 = new HonorStruct();
        honorStruct2.level = C1662a.m5926a(liveHonorStructV2.honor_level, honorStruct2.level);
        honorStruct2.score = C1662a.m5930a(liveHonorStructV2.honor_score, honorStruct2.score);
        return honorStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean */
    public static LogPbBean m5866x980e63d1(LogPbStructV2 logPbStructV2, LogPbBean logPbBean) {
        if (logPbStructV2 == null) {
            return logPbBean;
        }
        LogPbBean logPbBean2 = new LogPbBean();
        logPbBean2.imprId = logPbStructV2.impr_id == null ? logPbBean2.imprId : logPbStructV2.impr_id;
        return logPbBean2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo */
    public static LongVideo m5867xd9f92261(LongVideoStructV2 longVideoStructV2, LongVideo longVideo) {
        if (longVideoStructV2 == null) {
            return longVideo;
        }
        LongVideo longVideo2 = new LongVideo();
        longVideo2.video = m5913xdc245461(longVideoStructV2.video, longVideo2.video);
        longVideo2.longVideoType = C1662a.m5926a(longVideoStructV2.long_video_type, longVideo2.longVideoType);
        longVideo2.trailerStartTime = C1662a.m5925a(longVideoStructV2.trailer_start_time, longVideo2.trailerStartTime);
        longVideo2.videoControl = m5911x817ae5e8(longVideoStructV2.video_control, longVideo2.videoControl);
        return longVideo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MaskStructV2$$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo */
    public static VideoMaskInfo m5868x59acc730(MaskStructV2 maskStructV2, VideoMaskInfo videoMaskInfo) {
        if (maskStructV2 == null) {
            return videoMaskInfo;
        }
        VideoMaskInfo videoMaskInfo2 = new VideoMaskInfo();
        videoMaskInfo2.showMask = maskStructV2.show_mask == null ? videoMaskInfo2.showMask : maskStructV2.show_mask;
        videoMaskInfo2.maskType = maskStructV2.mask_type == null ? videoMaskInfo2.maskType : maskStructV2.mask_type;
        videoMaskInfo2.status = maskStructV2.status == null ? videoMaskInfo2.status : maskStructV2.status;
        videoMaskInfo2.title = maskStructV2.title == null ? videoMaskInfo2.title : maskStructV2.title;
        videoMaskInfo2.content = maskStructV2.content == null ? videoMaskInfo2.content : maskStructV2.content;
        videoMaskInfo2.cancelMaskLabel = maskStructV2.cancel_mask_label == null ? videoMaskInfo2.cancelMaskLabel : maskStructV2.cancel_mask_label;
        return videoMaskInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MatchInfoStructV2$$com$ss$android$ugc$aweme$search$caption$MatchInfo */
    public static C41400c m5869xc68009e8(MatchInfoStructV2 matchInfoStructV2, C41400c cVar) {
        if (matchInfoStructV2 == null) {
            return cVar;
        }
        C41400c cVar2 = new C41400c();
        cVar2.query = matchInfoStructV2.query == null ? cVar2.query : matchInfoStructV2.query;
        cVar2.link = matchInfoStructV2.link == null ? cVar2.link : matchInfoStructV2.link;
        cVar2.begin = C1662a.m5926a(matchInfoStructV2.begin, cVar2.begin);
        cVar2.end = C1662a.m5926a(matchInfoStructV2.end, cVar2.end);
        return cVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MicroAppCardStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MiniAppCard */
    public static C36969h m5870xb6412805(MicroAppCardStructV2 microAppCardStructV2, C36969h hVar) {
        if (microAppCardStructV2 == null) {
            return hVar;
        }
        C36969h hVar2 = new C36969h();
        hVar2.imageUrl = microAppCardStructV2.image_url == null ? hVar2.imageUrl : microAppCardStructV2.image_url;
        hVar2.text = microAppCardStructV2.text == null ? hVar2.text : microAppCardStructV2.text;
        hVar2.waitTime = C1662a.m5926a(microAppCardStructV2.wait_time, hVar2.waitTime);
        return hVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MicroAppStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MicroAppInfo */
    public static C36966e m5871x5742a110(MicroAppStructV2 microAppStructV2, C36966e eVar) {
        if (microAppStructV2 == null) {
            return eVar;
        }
        C36966e eVar2 = new C36966e();
        eVar2.appId = microAppStructV2.app_id == null ? eVar2.appId : microAppStructV2.app_id;
        eVar2.name = microAppStructV2.app_name == null ? eVar2.name : microAppStructV2.app_name;
        eVar2.icon = microAppStructV2.icon == null ? eVar2.icon : microAppStructV2.icon;
        eVar2.orientation = C1662a.m5926a(microAppStructV2.orientation, eVar2.orientation);
        eVar2.schema = microAppStructV2.schema == null ? eVar2.schema : microAppStructV2.schema;
        eVar2.state = C1662a.m5926a(microAppStructV2.state, eVar2.state);
        eVar2.summary = microAppStructV2.summary == null ? eVar2.summary : microAppStructV2.summary;
        eVar2.type = C1662a.m5926a(microAppStructV2.type, eVar2.type);
        eVar2.desc = microAppStructV2.description == null ? eVar2.desc : microAppStructV2.description;
        eVar2.title = microAppStructV2.title == null ? eVar2.title : microAppStructV2.title;
        eVar2.miniAppCard = m5870xb6412805(microAppStructV2.card, eVar2.miniAppCard);
        eVar2.webUrl = microAppStructV2.web_url == null ? eVar2.webUrl : microAppStructV2.web_url;
        return eVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MixStatisStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatisStruct */
    public static MixStatisStruct m5872xc75e0336(MixStatisStructV2 mixStatisStructV2, MixStatisStruct mixStatisStruct) {
        if (mixStatisStructV2 == null) {
            return mixStatisStruct;
        }
        MixStatisStruct mixStatisStruct2 = new MixStatisStruct();
        mixStatisStruct2.playVV = C1662a.m5930a(mixStatisStructV2.play_vv, mixStatisStruct2.playVV);
        mixStatisStruct2.collectVV = C1662a.m5930a(mixStatisStructV2.collect_vv, mixStatisStruct2.collectVV);
        mixStatisStruct2.currentEpisode = C1662a.m5930a(mixStatisStructV2.current_episode, mixStatisStruct2.currentEpisode);
        mixStatisStruct2.updatedToEpisode = C1662a.m5930a(mixStatisStructV2.updated_to_episode, mixStatisStruct2.updatedToEpisode);
        mixStatisStruct2.hasUpdatedEpisode = C1662a.m5930a(mixStatisStructV2.has_updated_episode, mixStatisStruct2.hasUpdatedEpisode);
        return mixStatisStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MixStatusStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatusStruct */
    public static MixStatusStruct m5873x10a650b6(MixStatusStructV2 mixStatusStructV2, MixStatusStruct mixStatusStruct) {
        if (mixStatusStructV2 == null) {
            return mixStatusStruct;
        }
        MixStatusStruct mixStatusStruct2 = new MixStatusStruct();
        mixStatusStruct2.status = C1662a.m5926a(mixStatusStructV2.status, mixStatusStruct2.status);
        mixStatusStruct2.isCollected = C1662a.m5926a(mixStatusStructV2.is_collected, mixStatusStruct2.isCollected);
        return mixStatusStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MixStructV2$$com$ss$android$ugc$aweme$feed$model$MixStruct */
    public static MixStruct m5874x5b231276(MixStructV2 mixStructV2, MixStruct mixStruct) {
        if (mixStructV2 == null) {
            return mixStruct;
        }
        MixStruct mixStruct2 = new MixStruct();
        mixStruct2.mixId = mixStructV2.mix_id == null ? mixStruct2.mixId : mixStructV2.mix_id;
        mixStruct2.mixName = mixStructV2.mix_name == null ? mixStruct2.mixName : mixStructV2.mix_name;
        mixStruct2.cover = m5907xd6e21675(mixStructV2.cover_url, mixStruct2.cover);
        mixStruct2.icon = m5907xd6e21675(mixStructV2.icon_url, mixStruct2.icon);
        mixStruct2.status = m5873x10a650b6(mixStructV2.status, mixStruct2.status);
        mixStruct2.statis = m5872xc75e0336(mixStructV2.statis, mixStruct2.statis);
        mixStruct2.desc = mixStructV2.desc == null ? mixStruct2.desc : mixStructV2.desc;
        mixStruct2.author = m5910x2fb9c61e(mixStructV2.author, mixStruct2.author);
        mixStruct2.extra = mixStructV2.extra == null ? mixStruct2.extra : mixStructV2.extra;
        mixStruct2.shareInfo = m5899xe4348698(mixStructV2.share_info, mixStruct2.shareInfo);
        return mixStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music */
    public static Music m5875x2fe8170e(MusicStructV2 musicStructV2, Music music) {
        if (musicStructV2 == null) {
            return music;
        }
        Music music2 = new Music();
        music2.f95403id = C1662a.m5930a(musicStructV2.f128796id, music2.f95403id);
        music2.mid = musicStructV2.id_str == null ? music2.mid : musicStructV2.id_str;
        music2.musicName = musicStructV2.title == null ? music2.musicName : musicStructV2.title;
        music2.authorName = musicStructV2.author == null ? music2.authorName : musicStructV2.author;
        music2.album = musicStructV2.album == null ? music2.album : musicStructV2.album;
        music2.converHd = m5907xd6e21675(musicStructV2.cover_hd, music2.converHd);
        music2.coverLarge = m5907xd6e21675(musicStructV2.cover_large, music2.coverLarge);
        music2.coverMedium = m5907xd6e21675(musicStructV2.cover_medium, music2.coverMedium);
        music2.coverThumb = m5907xd6e21675(musicStructV2.cover_thumb, music2.coverThumb);
        music2.playUrl = m5907xd6e21675(musicStructV2.play_url, music2.playUrl);
        music2.schema = musicStructV2.schema_url == null ? music2.schema : musicStructV2.schema_url;
        music2.source = C1662a.m5926a(musicStructV2.source_platform, music2.source);
        music2.startTime = C1662a.m5926a(musicStructV2.start_time, music2.startTime);
        music2.endTime = C1662a.m5926a(musicStructV2.end_time, music2.endTime);
        music2.duration = C1662a.m5926a(musicStructV2.duration, music2.duration);
        music2.extra = musicStructV2.extra == null ? music2.extra : musicStructV2.extra;
        music2.userCount = C1662a.m5926a(musicStructV2.user_count, music2.userCount);
        music2.positions = m5796xed17e9e(musicStructV2.position, music2.positions);
        music2.shareInfo = m5899xe4348698(musicStructV2.share_info, music2.shareInfo);
        music2.collectStatus = C1662a.m5926a(musicStructV2.collect_stat, music2.collectStatus);
        music2.musicStatus = C1662a.m5926a(musicStructV2.status, music2.musicStatus);
        music2.offlineDesc = musicStructV2.offline_desc == null ? music2.offlineDesc : musicStructV2.offline_desc;
        music2.effectsData = m5907xd6e21675(musicStructV2.effects_data, music2.effectsData);
        music2.ownerId = musicStructV2.owner_id == null ? music2.ownerId : musicStructV2.owner_id;
        music2.ownerNickName = musicStructV2.owner_nickname == null ? music2.ownerNickName : musicStructV2.owner_nickname;
        music2.audioTrack = m5907xd6e21675(musicStructV2.audio_track, music2.audioTrack);
        music2.bodyDanceUrl = m5907xd6e21675(musicStructV2.bodydance_url, music2.bodyDanceUrl);
        music2.bodyDanceChallenge = m5838x5652a2ac(musicStructV2.bodydance_challenge, music2.bodyDanceChallenge);
        music2.isOriginMusic = C1662a.m5934a(musicStructV2.is_original, music2.isOriginMusic);
        music2.challenge = m5838x5652a2ac(musicStructV2.challenge, music2.challenge);
        music2.billboardRank = C1662a.m5926a(musicStructV2.billboard_rank, music2.billboardRank);
        music2.redirect = C1662a.m5934a(musicStructV2.redirect, music2.redirect);
        music2.isAuthorDeleted = C1662a.m5934a(musicStructV2.author_deleted, music2.isAuthorDeleted);
        music2.ownerHandle = musicStructV2.owner_handle == null ? music2.ownerHandle : musicStructV2.owner_handle;
        music2.preventDownload = C1662a.m5934a(musicStructV2.prevent_download, music2.preventDownload);
        music2.billboardType = C1662a.m5926a(musicStructV2.music_billboard_type, music2.billboardType);
        music2.weeklyBillInfo = m5834x55bde6e0(musicStructV2.music_billboard_weekly_info, music2.weeklyBillInfo);
        music2.categoryCover = m5837xd5f807e1(musicStructV2.category_cover_info, music2.categoryCover);
        music2.strongBeatUrl = m5907xd6e21675(musicStructV2.strong_beat_url, music2.strongBeatUrl);
        music2.mExternalMusicInfos = m5786x6301e2f6(musicStructV2.external_song_info, music2.mExternalMusicInfos);
        music2.secUid = musicStructV2.sec_uid == null ? music2.secUid : musicStructV2.sec_uid;
        music2.lrcType = C1662a.m5926a(musicStructV2.lyric_type, music2.lrcType);
        music2.lrcUrl = musicStructV2.lyric_url == null ? music2.lrcUrl : musicStructV2.lyric_url;
        music2.avatarThumb = m5907xd6e21675(musicStructV2.avatar_thumb, music2.avatarThumb);
        music2.previewStartTime = C1662a.m5923a(musicStructV2.preview_start_time, music2.previewStartTime);
        music2.clusterId = C1662a.m5930a(musicStructV2.cluster_id, music2.clusterId);
        music2.muteShare = C1662a.m5934a(musicStructV2.mute_share, music2.muteShare);
        music2.isArtistMusic = C1662a.m5934a(musicStructV2.is_author_artist, music2.isArtistMusic);
        music2.isPgc = C1662a.m5934a(musicStructV2.is_pgc, music2.isPgc);
        return music2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$NationalTaskLinkStructV2$$com$ss$android$ugc$aweme$feed$model$NationalTaskLink */
    public static NationalTaskLink m5876xe7569efb(NationalTaskLinkStructV2 nationalTaskLinkStructV2, NationalTaskLink nationalTaskLink) {
        if (nationalTaskLinkStructV2 == null) {
            return nationalTaskLink;
        }
        NationalTaskLink nationalTaskLink2 = new NationalTaskLink();
        nationalTaskLink2.f79729id = nationalTaskLinkStructV2.f128798id == null ? nationalTaskLink2.f79729id : nationalTaskLinkStructV2.f128798id;
        nationalTaskLink2.title = nationalTaskLinkStructV2.title == null ? nationalTaskLink2.title : nationalTaskLinkStructV2.title;
        nationalTaskLink2.subTitle = nationalTaskLinkStructV2.sub_title == null ? nationalTaskLink2.subTitle : nationalTaskLinkStructV2.sub_title;
        nationalTaskLink2.avatarIcon = m5907xd6e21675(nationalTaskLinkStructV2.avatar_icon, nationalTaskLink2.avatarIcon);
        nationalTaskLink2.webUrl = nationalTaskLinkStructV2.web_url == null ? nationalTaskLink2.webUrl : nationalTaskLinkStructV2.web_url;
        nationalTaskLink2.openUrl = nationalTaskLinkStructV2.open_url == null ? nationalTaskLink2.openUrl : nationalTaskLinkStructV2.open_url;
        return nationalTaskLink2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$NewFaceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$NewFaceStickerBean */
    public static C46069d m5877xe7895fba(NewFaceStickerStructV2 newFaceStickerStructV2, C46069d dVar) {
        if (newFaceStickerStructV2 == null) {
            return dVar;
        }
        C46069d dVar2 = new C46069d();
        dVar2.f116246id = newFaceStickerStructV2.f128800id == null ? dVar2.f116246id : newFaceStickerStructV2.f128800id;
        dVar2.name = newFaceStickerStructV2.name == null ? dVar2.name : newFaceStickerStructV2.name;
        dVar2.children = newFaceStickerStructV2.children == null ? dVar2.children : newFaceStickerStructV2.children;
        dVar2.iconUrl = m5907xd6e21675(newFaceStickerStructV2.icon_url, dVar2.iconUrl);
        dVar2.ownerId = newFaceStickerStructV2.owner_id == null ? dVar2.ownerId : newFaceStickerStructV2.owner_id;
        dVar2.ownerName = newFaceStickerStructV2.owner_nickname == null ? dVar2.ownerName : newFaceStickerStructV2.owner_nickname;
        dVar2.userCount = C1662a.m5928a(newFaceStickerStructV2.user_count, dVar2.userCount);
        dVar2.desc = newFaceStickerStructV2.desc == null ? dVar2.desc : newFaceStickerStructV2.desc;
        dVar2.shareInfo = m5899xe4348698(newFaceStickerStructV2.share_info, dVar2.shareInfo);
        dVar2.isFavorite = C1662a.m5934a(newFaceStickerStructV2.is_favorite, dVar2.isFavorite);
        dVar2.commerceSticker = m5843xb40da7e0(newFaceStickerStructV2.commerce_sticker, dVar2.commerceSticker);
        dVar2.mTags = newFaceStickerStructV2.tags == null ? dVar2.mTags : newFaceStickerStructV2.tags;
        dVar2.avatarThumb = m5907xd6e21675(newFaceStickerStructV2.avatar_thumb, dVar2.avatarThumb);
        dVar2.viewCount = C1662a.m5930a(newFaceStickerStructV2.vv_count, dVar2.viewCount);
        dVar2.extra = newFaceStickerStructV2.extra == null ? dVar2.extra : newFaceStickerStructV2.extra;
        return dVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo */
    public static C25513e m5878xb1fda959(OfflineInfoStructV2 offlineInfoStructV2, C25513e eVar) {
        if (offlineInfoStructV2 == null) {
            return eVar;
        }
        C25513e eVar2 = new C25513e();
        eVar2.offlineInfoType = C1662a.m5926a(offlineInfoStructV2.offline_info_type, eVar2.offlineInfoType);
        eVar2.text = offlineInfoStructV2.text == null ? eVar2.text : offlineInfoStructV2.text;
        eVar2.action = offlineInfoStructV2.action == null ? eVar2.action : offlineInfoStructV2.action;
        return eVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$OriginalMusicianStructV2$$com$ss$android$ugc$aweme$music$OriginalMusician */
    public static C37390k m5879x309ee127(OriginalMusicianStructV2 originalMusicianStructV2, C37390k kVar) {
        if (originalMusicianStructV2 == null) {
            return kVar;
        }
        C37390k kVar2 = new C37390k();
        kVar2.musicCount = C1662a.m5926a(originalMusicianStructV2.music_count, kVar2.musicCount);
        kVar2.musicUseCount = C1662a.m5926a(originalMusicianStructV2.music_used_count, kVar2.musicUseCount);
        kVar2.musicQrcodeUrl = m5907xd6e21675(originalMusicianStructV2.music_qrcode_url, kVar2.musicQrcodeUrl);
        kVar2.musicCoverUrl = m5907xd6e21675(originalMusicianStructV2.music_cover_url, kVar2.musicCoverUrl);
        kVar2.diggCount = C1662a.m5926a(originalMusicianStructV2.digg_count, kVar2.diggCount);
        return kVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PermissionStructV2$$com$ss$android$ugc$aweme$profile$model$GeneralPermission */
    public static GeneralPermission m5880xef5550a8(PermissionStructV2 permissionStructV2, GeneralPermission generalPermission) {
        if (permissionStructV2 == null) {
            return generalPermission;
        }
        GeneralPermission generalPermission2 = new GeneralPermission();
        generalPermission2.mFollowToast = C1662a.m5926a(permissionStructV2.follow_toast, generalPermission2.mFollowToast);
        generalPermission2.mOriginalList = C1662a.m5926a(permissionStructV2.original_list, generalPermission2.mOriginalList);
        generalPermission2.mShopToast = C1662a.m5926a(permissionStructV2.shop_toast, generalPermission2.mShopToast);
        generalPermission2.mShareToast = C1662a.m5926a(permissionStructV2.share_toast, generalPermission2.mShareToast);
        return generalPermission2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$com$ss$android$ugc$aweme$profile$model$PlatformInfo */
    public static PlatformInfo m5881xb8c54a7f(PlatformSyncStatusStructV2 platformSyncStatusStructV2, PlatformInfo platformInfo) {
        if (platformSyncStatusStructV2 == null) {
            return platformInfo;
        }
        PlatformInfo platformInfo2 = new PlatformInfo();
        platformInfo2.patformName = platformSyncStatusStructV2.platform_name == null ? platformInfo2.patformName : platformSyncStatusStructV2.platform_name;
        platformInfo2.nickName = platformSyncStatusStructV2.nickname == null ? platformInfo2.nickName : platformSyncStatusStructV2.nickname;
        platformInfo2.fullSynced = C1662a.m5934a(platformSyncStatusStructV2.full_synced, platformInfo2.fullSynced);
        return platformInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth */
    public static PlayTokenAuth m5882x92d6feb8(PlayTokenAuthStructV2 playTokenAuthStructV2, PlayTokenAuth playTokenAuth) {
        if (playTokenAuthStructV2 == null) {
            return playTokenAuth;
        }
        PlayTokenAuth playTokenAuth2 = new PlayTokenAuth();
        playTokenAuth2.vid = playTokenAuthStructV2.vid == null ? playTokenAuth2.vid : playTokenAuthStructV2.vid;
        playTokenAuth2.token = playTokenAuthStructV2.token == null ? playTokenAuth2.token : playTokenAuthStructV2.token;
        playTokenAuth2.auth = playTokenAuthStructV2.auth == null ? playTokenAuth2.auth : playTokenAuthStructV2.auth;
        playTokenAuth2.hosts = playTokenAuthStructV2.hosts == null ? playTokenAuth2.hosts : playTokenAuthStructV2.hosts;
        return playTokenAuth2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PoiBackendTypeStructV2$$com$ss$android$ugc$aweme$poi$model$PoiBackendType */
    public static C39127k m5883x7bb9737d(PoiBackendTypeStructV2 poiBackendTypeStructV2, C39127k kVar) {
        if (poiBackendTypeStructV2 == null) {
            return kVar;
        }
        C39127k kVar2 = new C39127k();
        kVar2.code = poiBackendTypeStructV2.code == null ? kVar2.code : poiBackendTypeStructV2.code;
        kVar2.name = poiBackendTypeStructV2.name == null ? kVar2.name : poiBackendTypeStructV2.name;
        return kVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PoiCardStructV2$$com$ss$android$ugc$aweme$poi$model$PoiCardStruct */
    public static C39130n m5884x6f6a1e92(PoiCardStructV2 poiCardStructV2, C39130n nVar) {
        if (poiCardStructV2 == null) {
            return nVar;
        }
        C39130n nVar2 = new C39130n();
        nVar2.isShow = C1662a.m5926a(poiCardStructV2.is_show, nVar2.isShow);
        nVar2.url = poiCardStructV2.url == null ? nVar2.url : poiCardStructV2.url;
        return nVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PoiCardStructV2$$com$ss$android$ugc$aweme$sticker$data$PoiCardStruct */
    public static PoiCardStruct m5885x31530fc4(PoiCardStructV2 poiCardStructV2, PoiCardStruct poiCardStruct) {
        if (poiCardStructV2 == null) {
            return poiCardStruct;
        }
        PoiCardStruct poiCardStruct2 = new PoiCardStruct();
        poiCardStruct2.isShow = poiCardStructV2.is_show == null ? poiCardStruct2.isShow : poiCardStructV2.is_show;
        poiCardStruct2.url = poiCardStructV2.url == null ? poiCardStruct2.url : poiCardStructV2.url;
        return poiCardStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PoiStructV2$$com$ss$android$ugc$aweme$poi$model$PoiStruct */
    public static PoiStruct m5886xbafb8d32(PoiStructV2 poiStructV2, PoiStruct poiStruct) {
        if (poiStructV2 == null) {
            return poiStruct;
        }
        PoiStruct poiStruct2 = new PoiStruct();
        poiStruct2.poiId = poiStructV2.poi_id == null ? poiStruct2.poiId : poiStructV2.poi_id;
        poiStruct2.poiName = poiStructV2.poi_name == null ? poiStruct2.poiName : poiStructV2.poi_name;
        poiStruct2.typeCode = poiStructV2.type_code == null ? poiStruct2.typeCode : poiStructV2.type_code;
        poiStruct2.userCount = C1662a.m5926a(poiStructV2.user_count, poiStruct2.userCount);
        poiStruct2.itemCount = C1662a.m5926a(poiStructV2.item_count, poiStruct2.itemCount);
        poiStruct2.shareInfo = m5899xe4348698(poiStructV2.share_info, poiStruct2.shareInfo);
        poiStruct2.coverHd = m5907xd6e21675(poiStructV2.cover_hd, poiStruct2.coverHd);
        poiStruct2.coverLarge = m5907xd6e21675(poiStructV2.cover_large, poiStruct2.coverLarge);
        poiStruct2.coverMedium = m5907xd6e21675(poiStructV2.cover_medium, poiStruct2.coverMedium);
        poiStruct2.coverThumb = m5907xd6e21675(poiStructV2.cover_thumb, poiStruct2.coverThumb);
        poiStruct2.distance = poiStructV2.distance == null ? poiStruct2.distance : poiStructV2.distance;
        poiStruct2.address = m5808x14cb9651(poiStructV2.address_info, poiStruct2.address);
        poiStruct2.iconType = C1662a.m5926a(poiStructV2.icon_type, poiStruct2.iconType);
        poiStruct2.collectStatus = C1662a.m5926a(poiStructV2.collect_stat, poiStruct2.collectStatus);
        poiStruct2.poiLongitude = C1662a.m5932a(poiStructV2.poi_longitude, poiStruct2.poiLongitude);
        poiStruct2.poiLatitude = C1662a.m5932a(poiStructV2.poi_latitude, poiStruct2.poiLatitude);
        poiStruct2.expandType = C1662a.m5928a(poiStructV2.expand_type, poiStruct2.expandType);
        poiStruct2.iconOnMap = m5907xd6e21675(poiStructV2.icon_on_map, poiStruct2.iconOnMap);
        poiStruct2.iconOnEntry = m5907xd6e21675(poiStructV2.icon_on_entry, poiStruct2.iconOnEntry);
        poiStruct2.iconOnInfo = m5907xd6e21675(poiStructV2.icon_on_info, poiStruct2.iconOnInfo);
        poiStruct2.poiType = C1662a.m5928a(poiStructV2.poi_type, poiStruct2.poiType);
        poiStruct2.poiVoucher = poiStructV2.poi_voucher == null ? poiStruct2.poiVoucher : poiStructV2.poi_voucher;
        poiStruct2.poiRating = C1662a.m5922a(poiStructV2.rating, poiStruct2.poiRating);
        poiStruct2.poiCost = C1662a.m5922a(poiStructV2.cost, poiStruct2.poiCost);
        poiStruct2.poiRankDesc = poiStructV2.poi_rank_desc == null ? poiStruct2.poiRankDesc : poiStructV2.poi_rank_desc;
        poiStruct2.poiBusinessAreaName = poiStructV2.business_area_name == null ? poiStruct2.poiBusinessAreaName : poiStructV2.business_area_name;
        poiStruct2.poiIsLocalCity = C1662a.m5934a(poiStructV2.is_local_city, poiStruct2.poiIsLocalCity);
        poiStruct2.poiOptionName = poiStructV2.option_name == null ? poiStruct2.poiOptionName : poiStructV2.option_name;
        poiStruct2.poiSubTitle = poiStructV2.poi_subtitle == null ? poiStruct2.poiSubTitle : poiStructV2.poi_subtitle;
        poiStruct2.isCandidate = C1662a.m5934a(poiStructV2.is_candidate, poiStruct2.isCandidate);
        poiStruct2.poiCard = m5884x6f6a1e92(poiStructV2.poi_card, poiStruct2.poiCard);
        poiStruct2.poiSubTitleType = C1662a.m5926a(poiStructV2.poi_subtitle_type, poiStruct2.poiSubTitleType);
        poiStruct2.voucherReleaseAreas = poiStructV2.voucher_release_areas == null ? poiStruct2.voucherReleaseAreas : poiStructV2.voucher_release_areas;
        poiStruct2.showHalfCard = C1662a.m5926a(poiStructV2.is_show_halfcard, poiStruct2.showHalfCard);
        poiStruct2.poiBackendType = m5883x7bb9737d(poiStructV2.poi_backend_type, poiStruct2.poiBackendType);
        poiStruct2.coverItem = m5907xd6e21675(poiStructV2.cover_item, poiStruct2.coverItem);
        poiStruct2.isTopRecommend = C1662a.m5934a(poiStructV2.is_top_recommend, poiStruct2.isTopRecommend);
        poiStruct2.isAdminArea = C1662a.m5934a(poiStructV2.is_admin_area, poiStruct2.isAdminArea);
        poiStruct2.viewCount = poiStructV2.view_count == null ? poiStruct2.viewCount : poiStructV2.view_count;
        return poiStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PoiStructV2$$com$ss$android$ugc$aweme$sticker$data$PoiStruct */
    public static com.p683ss.android.ugc.aweme.sticker.data.PoiStruct m5887xa9e66ec4(PoiStructV2 poiStructV2, com.p683ss.android.ugc.aweme.sticker.data.PoiStruct poiStruct) {
        if (poiStructV2 == null) {
            return poiStruct;
        }
        com.p683ss.android.ugc.aweme.sticker.data.PoiStruct poiStruct2 = new com.p683ss.android.ugc.aweme.sticker.data.PoiStruct();
        poiStruct2.poiId = poiStructV2.poi_id == null ? poiStruct2.poiId : poiStructV2.poi_id;
        poiStruct2.poiName = poiStructV2.poi_name == null ? poiStruct2.poiName : poiStructV2.poi_name;
        poiStruct2.typeCode = poiStructV2.type_code == null ? poiStruct2.typeCode : poiStructV2.type_code;
        poiStruct2.userCount = poiStructV2.user_count == null ? poiStruct2.userCount : poiStructV2.user_count;
        poiStruct2.itemCount = poiStructV2.item_count == null ? poiStruct2.itemCount : poiStructV2.item_count;
        poiStruct2.shareInfo = m5899xe4348698(poiStructV2.share_info, poiStruct2.shareInfo);
        poiStruct2.coverHd = m5907xd6e21675(poiStructV2.cover_hd, poiStruct2.coverHd);
        poiStruct2.coverLarge = m5907xd6e21675(poiStructV2.cover_large, poiStruct2.coverLarge);
        poiStruct2.coverMedium = m5907xd6e21675(poiStructV2.cover_medium, poiStruct2.coverMedium);
        poiStruct2.coverThumb = m5907xd6e21675(poiStructV2.cover_thumb, poiStruct2.coverThumb);
        poiStruct2.distance = poiStructV2.distance == null ? poiStruct2.distance : poiStructV2.distance;
        poiStruct2.address = m5809x21b8fdcf(poiStructV2.address_info, poiStruct2.address);
        poiStruct2.iconType = poiStructV2.icon_type == null ? poiStruct2.iconType : poiStructV2.icon_type;
        poiStruct2.collectStatus = poiStructV2.collect_stat == null ? poiStruct2.collectStatus : poiStructV2.collect_stat;
        poiStruct2.poiLongitude = C1662a.m5932a(poiStructV2.poi_longitude, poiStruct2.poiLongitude);
        poiStruct2.poiLatitude = C1662a.m5932a(poiStructV2.poi_latitude, poiStruct2.poiLatitude);
        poiStruct2.expandType = C1662a.m5931a(poiStructV2.expand_type, poiStruct2.expandType);
        poiStruct2.iconOnMap = m5907xd6e21675(poiStructV2.icon_on_map, poiStruct2.iconOnMap);
        poiStruct2.iconOnEntry = m5907xd6e21675(poiStructV2.icon_on_entry, poiStruct2.iconOnEntry);
        poiStruct2.iconOnInfo = m5907xd6e21675(poiStructV2.icon_on_info, poiStruct2.iconOnInfo);
        poiStruct2.poiType = C1662a.m5931a(poiStructV2.poi_type, poiStruct2.poiType);
        poiStruct2.poiVoucher = poiStructV2.poi_voucher == null ? poiStruct2.poiVoucher : poiStructV2.poi_voucher;
        poiStruct2.poiRating = poiStructV2.rating == null ? poiStruct2.poiRating : poiStructV2.rating;
        poiStruct2.poiCost = poiStructV2.cost == null ? poiStruct2.poiCost : poiStructV2.cost;
        poiStruct2.poiRankDesc = poiStructV2.poi_rank_desc == null ? poiStruct2.poiRankDesc : poiStructV2.poi_rank_desc;
        poiStruct2.poiBusinessAreaName = poiStructV2.business_area_name == null ? poiStruct2.poiBusinessAreaName : poiStructV2.business_area_name;
        poiStruct2.poiIsLocalCity = poiStructV2.is_local_city == null ? poiStruct2.poiIsLocalCity : poiStructV2.is_local_city;
        poiStruct2.poiOptionName = poiStructV2.option_name == null ? poiStruct2.poiOptionName : poiStructV2.option_name;
        poiStruct2.poiSubTitle = poiStructV2.poi_subtitle == null ? poiStruct2.poiSubTitle : poiStructV2.poi_subtitle;
        poiStruct2.isCandidate = poiStructV2.is_candidate == null ? poiStruct2.isCandidate : poiStructV2.is_candidate;
        poiStruct2.poiCard = m5885x31530fc4(poiStructV2.poi_card, poiStruct2.poiCard);
        poiStruct2.poiSubTitleType = poiStructV2.poi_subtitle_type == null ? poiStruct2.poiSubTitleType : poiStructV2.poi_subtitle_type;
        poiStruct2.voucherReleaseAreas = poiStructV2.voucher_release_areas == null ? poiStruct2.voucherReleaseAreas : poiStructV2.voucher_release_areas;
        poiStruct2.coverItem = m5907xd6e21675(poiStructV2.cover_item, poiStruct2.coverItem);
        return poiStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position */
    public static Position m5888x5cec7640(PositionStructV2 positionStructV2, Position position) {
        if (positionStructV2 == null) {
            return position;
        }
        Position position2 = new Position();
        position2.begin = C1662a.m5926a(positionStructV2.begin, position2.begin);
        position2.end = C1662a.m5926a(positionStructV2.end, position2.end);
        return position2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PreloadStructV2$$com$ss$android$ugc$aweme$feed$model$Preload */
    public static Preload m5889xdd7fa861(PreloadStructV2 preloadStructV2, Preload preload) {
        if (preloadStructV2 == null) {
            return preload;
        }
        Preload preload2 = new Preload();
        preload2.commentPreload = C1662a.m5926a(preloadStructV2.comment, preload2.commentPreload);
        preload2.profilePreload = C1662a.m5926a(preloadStructV2.profile, preload2.profilePreload);
        preload2.commentPro = C1662a.m5922a(preloadStructV2.comment_pro, preload2.commentPro);
        preload2.profilePro = C1662a.m5922a(preloadStructV2.profile_pro, preload2.profilePro);
        preload2.commentThres = C1662a.m5922a(preloadStructV2.comment_thres, preload2.commentThres);
        preload2.profileThres = C1662a.m5922a(preloadStructV2.profile_thres, preload2.profileThres);
        preload2.commentMedianTime = C1662a.m5927a(preloadStructV2.comment_median_time, preload2.commentMedianTime);
        preload2.profileMedianTime = C1662a.m5927a(preloadStructV2.profile_median_time, preload2.profileMedianTime);
        preload2.modelV2 = C1662a.m5926a(preloadStructV2.model_v2, preload2.modelV2);
        return preload2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$QuickShopSecondFloorV2$$com$ss$android$ugc$aweme$profile$model$QuickShopSecondFloorInfo */
    public static QuickShopSecondFloorInfo m5890xa9801cc1(QuickShopSecondFloorV2 quickShopSecondFloorV2, QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        if (quickShopSecondFloorV2 == null) {
            return quickShopSecondFloorInfo;
        }
        QuickShopSecondFloorInfo quickShopSecondFloorInfo2 = new QuickShopSecondFloorInfo();
        quickShopSecondFloorInfo2.processText = quickShopSecondFloorV2.process_text == null ? quickShopSecondFloorInfo2.processText : quickShopSecondFloorV2.process_text;
        quickShopSecondFloorInfo2.enterText = quickShopSecondFloorV2.enter_text == null ? quickShopSecondFloorInfo2.enterText : quickShopSecondFloorV2.enter_text;
        quickShopSecondFloorInfo2.transBgText = quickShopSecondFloorV2.trans_bg_text == null ? quickShopSecondFloorInfo2.transBgText : quickShopSecondFloorV2.trans_bg_text;
        return quickShopSecondFloorInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$QuickShopStructV2$$com$ss$android$ugc$aweme$profile$model$QuickShopInfo */
    public static QuickShopInfo m5891x85e038dc(QuickShopStructV2 quickShopStructV2, QuickShopInfo quickShopInfo) {
        if (quickShopStructV2 == null) {
            return quickShopInfo;
        }
        QuickShopInfo quickShopInfo2 = new QuickShopInfo();
        quickShopInfo2.quickShopUrl = quickShopStructV2.quick_shop_url == null ? quickShopInfo2.quickShopUrl : quickShopStructV2.quick_shop_url;
        quickShopInfo2.quickShopName = quickShopStructV2.quick_shop_name == null ? quickShopInfo2.quickShopName : quickShopStructV2.quick_shop_name;
        quickShopInfo2.withTextEntry = C1662a.m5934a(quickShopStructV2.with_text_entry, quickShopInfo2.withTextEntry);
        quickShopInfo2.secondFloorInfo = m5890xa9801cc1(quickShopStructV2.second_floor_info, quickShopInfo2.secondFloorInfo);
        return quickShopInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RFansGroupInfoV2$$com$ss$android$ugc$aweme$base$share$RocketFansGroupInfo */
    public static RocketFansGroupInfo m5892x59f04dc3(RFansGroupInfoV2 rFansGroupInfoV2, RocketFansGroupInfo rocketFansGroupInfo) {
        if (rFansGroupInfoV2 == null) {
            return rocketFansGroupInfo;
        }
        RocketFansGroupInfo rocketFansGroupInfo2 = new RocketFansGroupInfo();
        rocketFansGroupInfo2.schema = rFansGroupInfoV2.schema == null ? rocketFansGroupInfo2.schema : rFansGroupInfoV2.schema;
        rocketFansGroupInfo2.token = rFansGroupInfoV2.token == null ? rocketFansGroupInfo2.token : rFansGroupInfoV2.token;
        rocketFansGroupInfo2.downloadUrl = rFansGroupInfoV2.download_url == null ? rocketFansGroupInfo2.downloadUrl : rFansGroupInfoV2.download_url;
        return rocketFansGroupInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem */
    public static RecommendAwemeItem m5893x55fe9987(RecommendItemStructV2 recommendItemStructV2, RecommendAwemeItem recommendAwemeItem) {
        if (recommendItemStructV2 == null) {
            return recommendAwemeItem;
        }
        RecommendAwemeItem recommendAwemeItem2 = new RecommendAwemeItem();
        recommendAwemeItem2.aid = recommendItemStructV2.aweme_id == null ? recommendAwemeItem2.aid : recommendItemStructV2.aweme_id;
        recommendAwemeItem2.cover = m5907xd6e21675(recommendItemStructV2.cover, recommendAwemeItem2.cover);
        recommendAwemeItem2.dynamicCover = m5907xd6e21675(recommendItemStructV2.dynamic_cover, recommendAwemeItem2.dynamicCover);
        recommendAwemeItem2.mediaType = C1662a.m5933a(recommendItemStructV2.media_type, recommendAwemeItem2.mediaType);
        return recommendAwemeItem2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RelationDynamicLableStructV2$$com$ss$android$ugc$aweme$feed$model$RelationDynamicLabel */
    public static RelationDynamicLabel m5894x14249e0d(RelationDynamicLableStructV2 relationDynamicLableStructV2, RelationDynamicLabel relationDynamicLabel) {
        if (relationDynamicLableStructV2 == null) {
            return relationDynamicLabel;
        }
        RelationDynamicLabel relationDynamicLabel2 = new RelationDynamicLabel();
        relationDynamicLabel2.nickname = relationDynamicLableStructV2.nickname == null ? relationDynamicLabel2.nickname : relationDynamicLableStructV2.nickname;
        relationDynamicLabel2.labelInfo = relationDynamicLableStructV2.label_info == null ? relationDynamicLabel2.labelInfo : relationDynamicLableStructV2.label_info;
        relationDynamicLabel2.count = C1662a.m5926a(relationDynamicLableStructV2.count, relationDynamicLabel2.count);
        relationDynamicLabel2.userId = relationDynamicLableStructV2.user_id == null ? relationDynamicLabel2.userId : relationDynamicLableStructV2.user_id;
        relationDynamicLabel2.type = C1662a.m5926a(relationDynamicLableStructV2.type, relationDynamicLabel2.type);
        return relationDynamicLabel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RelationLabelStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelNew */
    public static RelationLabelNew m5895x36fc5a9f(RelationLabelStructV2 relationLabelStructV2, RelationLabelNew relationLabelNew) {
        if (relationLabelStructV2 == null) {
            return relationLabelNew;
        }
        RelationLabelNew relationLabelNew2 = new RelationLabelNew();
        relationLabelNew2.userList = m5798x6e5454b1(relationLabelStructV2.user_list, relationLabelNew2.userList);
        relationLabelNew2.type = relationLabelStructV2.type == null ? relationLabelNew2.type : relationLabelStructV2.type;
        relationLabelNew2.extra = C30147e.m70754a(relationLabelStructV2.extra, relationLabelNew2.extra);
        return relationLabelNew2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RelationRecommendStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRelationRecommendModel */
    public static AwemeRelationRecommendModel m5896xbcd34a71(RelationRecommendStructV2 relationRecommendStructV2, AwemeRelationRecommendModel awemeRelationRecommendModel) {
        if (relationRecommendStructV2 == null) {
            return awemeRelationRecommendModel;
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel2 = new AwemeRelationRecommendModel();
        awemeRelationRecommendModel2.recommendType = C1662a.m5930a(relationRecommendStructV2.recommend_type, awemeRelationRecommendModel2.recommendType);
        awemeRelationRecommendModel2.relationTextKey = relationRecommendStructV2.relation_text_key == null ? awemeRelationRecommendModel2.relationTextKey : relationRecommendStructV2.relation_text_key;
        return awemeRelationRecommendModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelUser */
    public static RelationLabelUser m5897x91dc7273(RelativeUserStructV2 relativeUserStructV2, RelationLabelUser relationLabelUser) {
        if (relativeUserStructV2 == null) {
            return relationLabelUser;
        }
        RelationLabelUser relationLabelUser2 = new RelationLabelUser();
        relationLabelUser2.uid = C1662a.m5930a(relativeUserStructV2.uid, relationLabelUser2.uid);
        relationLabelUser2.avatarLarger = m5907xd6e21675(relativeUserStructV2.avatar, relationLabelUser2.avatarLarger);
        relationLabelUser2.nickName = relativeUserStructV2.nickname == null ? relationLabelUser2.nickName : relativeUserStructV2.nickname;
        relationLabelUser2.remarkName = relativeUserStructV2.remark_name == null ? relationLabelUser2.remarkName : relativeUserStructV2.remark_name;
        relationLabelUser2.avatarThumb = m5907xd6e21675(relativeUserStructV2.avatar_thumb, relationLabelUser2.avatarThumb);
        relationLabelUser2.followStatus = C1662a.m5926a(relativeUserStructV2.follow_status, relationLabelUser2.followStatus);
        relationLabelUser2.secUid = relativeUserStructV2.sec_uid == null ? relationLabelUser2.secUid : relativeUserStructV2.sec_uid;
        return relationLabelUser2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo */
    public static RelativeUserInfo m5898x55b3e16c(RelativeUserStructV2 relativeUserStructV2, RelativeUserInfo relativeUserInfo) {
        if (relativeUserStructV2 == null) {
            return relativeUserInfo;
        }
        RelativeUserInfo relativeUserInfo2 = new RelativeUserInfo();
        relativeUserInfo2.uid = C1662a.m5933a(relativeUserStructV2.uid, relativeUserInfo2.uid);
        relativeUserInfo2.avatar = m5907xd6e21675(relativeUserStructV2.avatar, relativeUserInfo2.avatar);
        return relativeUserInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo */
    public static ShareInfo m5899xe4348698(ShareStructV2 shareStructV2, ShareInfo shareInfo) {
        if (shareStructV2 == null) {
            return shareInfo;
        }
        ShareInfo shareInfo2 = new ShareInfo();
        shareInfo2.shareUrl = shareStructV2.share_url == null ? shareInfo2.shareUrl : shareStructV2.share_url;
        shareInfo2.shareWeiboDesc = shareStructV2.share_weibo_desc == null ? shareInfo2.shareWeiboDesc : shareStructV2.share_weibo_desc;
        shareInfo2.shareDesc = shareStructV2.share_desc == null ? shareInfo2.shareDesc : shareStructV2.share_desc;
        shareInfo2.shareTitle = shareStructV2.share_title == null ? shareInfo2.shareTitle : shareStructV2.share_title;
        shareInfo2.qrCodeUrls = m5907xd6e21675(shareStructV2.share_qrcode_url, shareInfo2.qrCodeUrls);
        shareInfo2.goodsManagerUrl = shareStructV2.manage_goods_url == null ? shareInfo2.goodsManagerUrl : shareStructV2.manage_goods_url;
        shareInfo2.imageUrls = m5907xd6e21675(shareStructV2.share_image_url, shareInfo2.imageUrls);
        shareInfo2.boolPersist = C1662a.m5926a(shareStructV2.bool_persist, shareInfo2.boolPersist);
        shareInfo2.goodsRecUrl = shareStructV2.goods_rec_url == null ? shareInfo2.goodsRecUrl : shareStructV2.goods_rec_url;
        shareInfo2.shareTitleMyself = shareStructV2.share_title_myself == null ? shareInfo2.shareTitleMyself : shareStructV2.share_title_myself;
        shareInfo2.shareTitleOther = shareStructV2.share_title_other == null ? shareInfo2.shareTitleOther : shareStructV2.share_title_other;
        shareInfo2.shareLinkDesc = shareStructV2.share_link_desc == null ? shareInfo2.shareLinkDesc : shareStructV2.share_link_desc;
        shareInfo2.shareSignatureUrl = shareStructV2.share_signature_url == null ? shareInfo2.shareSignatureUrl : shareStructV2.share_signature_url;
        shareInfo2.shareSignatureDesc = shareStructV2.share_signature_desc == null ? shareInfo2.shareSignatureDesc : shareStructV2.share_signature_desc;
        shareInfo2.shareQuote = shareStructV2.share_quote == null ? shareInfo2.shareQuote : shareStructV2.share_quote;
        shareInfo2.whatsappShareDesc = shareStructV2.whatsapp_desc == null ? shareInfo2.whatsappShareDesc : shareStructV2.whatsapp_desc;
        return shareInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$feed$model$live$ShareStruct */
    public static ShareStruct m5900x84e4115a(ShareStructV2 shareStructV2, ShareStruct shareStruct) {
        if (shareStructV2 == null) {
            return shareStruct;
        }
        ShareStruct shareStruct2 = new ShareStruct();
        shareStruct2.shareUrl = shareStructV2.share_url == null ? shareStruct2.shareUrl : shareStructV2.share_url;
        shareStruct2.shareWeiboDesc = shareStructV2.share_weibo_desc == null ? shareStruct2.shareWeiboDesc : shareStructV2.share_weibo_desc;
        shareStruct2.shareDesc = shareStructV2.share_desc == null ? shareStruct2.shareDesc : shareStructV2.share_desc;
        shareStruct2.shareTitle = shareStructV2.share_title == null ? shareStruct2.shareTitle : shareStructV2.share_title;
        shareStruct2.shareQrcodeUrl = m5907xd6e21675(shareStructV2.share_qrcode_url, shareStruct2.shareQrcodeUrl);
        shareStruct2.boolPersist = C1662a.m5926a(shareStructV2.bool_persist, shareStruct2.boolPersist);
        shareStruct2.shareLinkDesc = shareStructV2.share_link_desc == null ? shareStruct2.shareLinkDesc : shareStructV2.share_link_desc;
        return shareStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User */
    public static User m5901xd0fb664c(SimpleUserStructV2 simpleUserStructV2, User user) {
        if (simpleUserStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = simpleUserStructV2.uid == null ? user2.uid : simpleUserStructV2.uid;
        user2.nickname = simpleUserStructV2.nickname == null ? user2.nickname : simpleUserStructV2.nickname;
        user2.signature = simpleUserStructV2.signature == null ? user2.signature : simpleUserStructV2.signature;
        user2.avatarThumb = m5907xd6e21675(simpleUserStructV2.avatar_thumb, user2.avatarThumb);
        user2.followStatus = C1662a.m5926a(simpleUserStructV2.follow_status, user2.followStatus);
        user2.userRate = C1662a.m5926a(simpleUserStructV2.user_rate, user2.userRate);
        user2.avatarLarger = m5907xd6e21675(simpleUserStructV2.avatar_larger, user2.avatarLarger);
        user2.uniqueId = simpleUserStructV2.unique_id == null ? user2.uniqueId : simpleUserStructV2.unique_id;
        user2.secUid = simpleUserStructV2.sec_uid == null ? user2.secUid : simpleUserStructV2.sec_uid;
        return user2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$SmartPhoneSettingsStructV2$$com$ss$android$ugc$aweme$commerce$SmartPhone */
    public static C25514f m5902x2271c8ae(SmartPhoneSettingsStructV2 smartPhoneSettingsStructV2, C25514f fVar) {
        if (smartPhoneSettingsStructV2 == null) {
            return fVar;
        }
        C25514f fVar2 = new C25514f();
        fVar2.phoneNumber = smartPhoneSettingsStructV2.phone_number == null ? fVar2.phoneNumber : smartPhoneSettingsStructV2.phone_number;
        fVar2.phoneId = smartPhoneSettingsStructV2.phone_id == null ? fVar2.phoneId : smartPhoneSettingsStructV2.phone_id;
        fVar2.encryptKey = smartPhoneSettingsStructV2.encrypt_key == null ? fVar2.encryptKey : smartPhoneSettingsStructV2.encrypt_key;
        return fVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$SpecialStickerStructV2$$com$ss$android$ugc$aweme$feed$model$SpecialSticker */
    public static SpecialSticker m5903xd27658e1(SpecialStickerStructV2 specialStickerStructV2, SpecialSticker specialSticker) {
        if (specialStickerStructV2 == null) {
            return specialSticker;
        }
        SpecialSticker specialSticker2 = new SpecialSticker();
        specialSticker2.stickerType = C1662a.m5926a(specialStickerStructV2.sticker_type, specialSticker2.stickerType);
        specialSticker2.linkUrl = specialStickerStructV2.link == null ? specialSticker2.linkUrl : specialStickerStructV2.link;
        specialSticker2.title = specialStickerStructV2.title == null ? specialSticker2.title : specialStickerStructV2.title;
        specialSticker2.stickerId = specialStickerStructV2.sticker_id == null ? specialSticker2.stickerId : specialStickerStructV2.sticker_id;
        specialSticker2.iconUrl = m5907xd6e21675(specialStickerStructV2.icon_url, specialSticker2.iconUrl);
        specialSticker2.openUrl = specialStickerStructV2.open_url == null ? specialSticker2.openUrl : specialStickerStructV2.open_url;
        return specialSticker2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$StarAtlasLinkStructV2$$com$ss$android$ugc$aweme$feed$model$StarAtlasLink */
    public static StarAtlasLink m5904xf622e661(StarAtlasLinkStructV2 starAtlasLinkStructV2, StarAtlasLink starAtlasLink) {
        if (starAtlasLinkStructV2 == null) {
            return starAtlasLink;
        }
        StarAtlasLink starAtlasLink2 = new StarAtlasLink();
        starAtlasLink2.f79732id = starAtlasLinkStructV2.f128802id == null ? starAtlasLink2.f79732id : starAtlasLinkStructV2.f128802id;
        starAtlasLink2.title = starAtlasLinkStructV2.title == null ? starAtlasLink2.title : starAtlasLinkStructV2.title;
        starAtlasLink2.subTitle = starAtlasLinkStructV2.sub_title == null ? starAtlasLink2.subTitle : starAtlasLinkStructV2.sub_title;
        starAtlasLink2.avatarIcon = m5907xd6e21675(starAtlasLinkStructV2.avatar_icon, starAtlasLink2.avatarIcon);
        starAtlasLink2.webUrl = starAtlasLinkStructV2.web_url == null ? starAtlasLink2.webUrl : starAtlasLinkStructV2.web_url;
        starAtlasLink2.openUrl = starAtlasLinkStructV2.open_url == null ? starAtlasLink2.openUrl : starAtlasLinkStructV2.open_url;
        return starAtlasLink2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$StreamUrlStructV2$$com$ss$android$ugc$aweme$feed$model$live$StreamUrlStruct */
    public static StreamUrlStruct m5905x6525b8ba(StreamUrlStructV2 streamUrlStructV2, StreamUrlStruct streamUrlStruct) {
        if (streamUrlStructV2 == null) {
            return streamUrlStruct;
        }
        StreamUrlStruct streamUrlStruct2 = new StreamUrlStruct();
        streamUrlStruct2.sid = C1662a.m5930a(streamUrlStructV2.sid, streamUrlStruct2.sid);
        streamUrlStruct2.rtmp_pull_url = streamUrlStructV2.rtmp_pull_url == null ? streamUrlStruct2.rtmp_pull_url : streamUrlStructV2.rtmp_pull_url;
        streamUrlStruct2.rtmp_push_url = streamUrlStructV2.rtmp_push_url == null ? streamUrlStruct2.rtmp_push_url : streamUrlStructV2.rtmp_push_url;
        streamUrlStruct2.provider = C1662a.m5926a(streamUrlStructV2.provider, streamUrlStruct2.provider);
        return streamUrlStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct */
    public static TextExtraStruct m5906x8e855afe(TextExtraStructV2 textExtraStructV2, TextExtraStruct textExtraStruct) {
        if (textExtraStructV2 == null) {
            return textExtraStruct;
        }
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.start = C1662a.m5926a(textExtraStructV2.start, textExtraStruct2.start);
        textExtraStruct2.end = C1662a.m5926a(textExtraStructV2.end, textExtraStruct2.end);
        textExtraStruct2.userId = textExtraStructV2.user_id == null ? textExtraStruct2.userId : textExtraStructV2.user_id;
        textExtraStruct2.type = C1662a.m5926a(textExtraStructV2.type, textExtraStruct2.type);
        textExtraStruct2.hashTagName = textExtraStructV2.hashtag_name == null ? textExtraStruct2.hashTagName : textExtraStructV2.hashtag_name;
        textExtraStruct2.cid = textExtraStructV2.hashtag_id == null ? textExtraStruct2.cid : textExtraStructV2.hashtag_id;
        textExtraStruct2.isCommerce = C1662a.m5934a(textExtraStructV2.is_commerce, textExtraStruct2.isCommerce);
        textExtraStruct2.mSecUid = textExtraStructV2.sec_uid == null ? textExtraStruct2.mSecUid : textExtraStructV2.sec_uid;
        textExtraStruct2.awemeId = textExtraStructV2.aweme_id == null ? textExtraStruct2.awemeId : textExtraStructV2.aweme_id;
        textExtraStruct2.subType = C1662a.m5926a(textExtraStructV2.sub_type, textExtraStruct2.subType);
        return textExtraStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel */
    public static UrlModel m5907xd6e21675(UrlStructV2 urlStructV2, UrlModel urlModel) {
        if (urlStructV2 == null) {
            return urlModel;
        }
        UrlModel urlModel2 = new UrlModel();
        urlModel2.uri = urlStructV2.uri == null ? urlModel2.uri : urlStructV2.uri;
        urlModel2.urlList = urlStructV2.url_list == null ? urlModel2.urlList : urlStructV2.url_list;
        urlModel2.width = C1662a.m5926a(urlStructV2.width, urlModel2.width);
        urlModel2.height = C1662a.m5926a(urlStructV2.height, urlModel2.height);
        urlModel2.urlKey = urlStructV2.url_key == null ? urlModel2.urlKey : urlStructV2.url_key;
        urlModel2.size = C1662a.m5930a(urlStructV2.data_size, urlModel2.size);
        urlModel2.fileHash = urlStructV2.file_hash == null ? urlModel2.fileHash : urlStructV2.file_hash;
        return urlModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel */
    public static VideoUrlModel m5908xb077c847(UrlStructV2 urlStructV2, VideoUrlModel videoUrlModel) {
        if (urlStructV2 == null) {
            return videoUrlModel;
        }
        VideoUrlModel videoUrlModel2 = new VideoUrlModel();
        videoUrlModel2.uri = urlStructV2.uri == null ? videoUrlModel2.uri : urlStructV2.uri;
        videoUrlModel2.urlList = urlStructV2.url_list == null ? videoUrlModel2.urlList : urlStructV2.url_list;
        videoUrlModel2.width = C1662a.m5926a(urlStructV2.width, videoUrlModel2.width);
        videoUrlModel2.height = C1662a.m5926a(urlStructV2.height, videoUrlModel2.height);
        videoUrlModel2.urlKey = urlStructV2.url_key == null ? videoUrlModel2.urlKey : urlStructV2.url_key;
        videoUrlModel2.size = C1662a.m5930a(urlStructV2.data_size, videoUrlModel2.size);
        videoUrlModel2.fileHash = urlStructV2.file_hash == null ? videoUrlModel2.fileHash : urlStructV2.file_hash;
        videoUrlModel2.fileCheckSum = urlStructV2.file_cs == null ? videoUrlModel2.fileCheckSum : urlStructV2.file_cs;
        return videoUrlModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UserProfileStructV2$$com$ss$android$ugc$aweme$feed$model$UserProfileInitInfo */
    public static UserProfileInitInfo m5909xf505f47f(UserProfileStructV2 userProfileStructV2, UserProfileInitInfo userProfileInitInfo) {
        if (userProfileStructV2 == null) {
            return userProfileInitInfo;
        }
        UserProfileInitInfo userProfileInitInfo2 = new UserProfileInitInfo();
        userProfileInitInfo2.headModelScore = C1662a.m5922a(userProfileStructV2.head_model_score, userProfileInitInfo2.headModelScore);
        return userProfileInitInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User */
    public static User m5910x2fb9c61e(UserStructV2 userStructV2, User user) {
        if (userStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = userStructV2.uid == null ? user2.uid : userStructV2.uid;
        user2.shortId = userStructV2.short_id == null ? user2.shortId : userStructV2.short_id;
        user2.nickname = userStructV2.nickname == null ? user2.nickname : userStructV2.nickname;
        user2.gender = C1662a.m5926a(userStructV2.gender, user2.gender);
        user2.signature = userStructV2.signature == null ? user2.signature : userStructV2.signature;
        user2.avatarLarger = m5907xd6e21675(userStructV2.avatar_larger, user2.avatarLarger);
        user2.avatarThumb = m5907xd6e21675(userStructV2.avatar_thumb, user2.avatarThumb);
        user2.avatarMedium = m5907xd6e21675(userStructV2.avatar_medium, user2.avatarMedium);
        user2.birthday = userStructV2.birthday == null ? user2.birthday : userStructV2.birthday;
        user2.followStatus = C1662a.m5926a(userStructV2.follow_status, user2.followStatus);
        user2.awemeCount = C1662a.m5926a(userStructV2.aweme_count, user2.awemeCount);
        user2.followingCount = C1662a.m5926a(userStructV2.following_count, user2.followingCount);
        user2.followerCount = C1662a.m5926a(userStructV2.follower_count, user2.followerCount);
        user2.favoritingCount = C1662a.m5926a(userStructV2.favoriting_count, user2.favoritingCount);
        user2.totalFavorited = C1662a.m5928a(userStructV2.total_favorited, user2.totalFavorited);
        user2.isBlock = C1662a.m5934a(userStructV2.is_block, user2.isBlock);
        user2.thirdName = userStructV2.third_name == null ? user2.thirdName : userStructV2.third_name;
        user2.hideSearch = C1662a.m5934a(userStructV2.hide_search, user2.hideSearch);
        user2.constellation = C1662a.m5926a(userStructV2.constellation, user2.constellation);
        user2.city = userStructV2.location == null ? user2.city : userStructV2.location;
        user2.hideCity = C1662a.m5934a(userStructV2.hide_location, user2.hideCity);
        user2.weiboVerify = userStructV2.weibo_verify == null ? user2.weiboVerify : userStructV2.weibo_verify;
        user2.customVerify = userStructV2.custom_verify == null ? user2.customVerify : userStructV2.custom_verify;
        user2.uniqueId = userStructV2.unique_id == null ? user2.uniqueId : userStructV2.unique_id;
        user2.bindPhone = userStructV2.bind_phone == null ? user2.bindPhone : userStructV2.bind_phone;
        user2.needRecommend = C1662a.m5935a(userStructV2.need_recommend, user2.needRecommend);
        user2.isBindedWeibo = C1662a.m5934a(userStructV2.is_binded_weibo, user2.isBindedWeibo);
        user2.weiboNickname = userStructV2.weibo_name == null ? user2.weiboNickname : userStructV2.weibo_name;
        user2.weiboSchema = userStructV2.weibo_schema == null ? user2.weiboSchema : userStructV2.weibo_schema;
        user2.weiboUrl = userStructV2.weibo_url == null ? user2.weiboUrl : userStructV2.weibo_url;
        user2.storyOpen = C1662a.m5934a(userStructV2.story_open, user2.storyOpen);
        user2.storyCount = C1662a.m5926a(userStructV2.story_count, user2.storyCount);
        user2.recommendReason = userStructV2.recommend_reason == null ? user2.recommendReason : userStructV2.recommend_reason;
        user2.hasFacebookToken = C1662a.m5934a(userStructV2.has_facebook_token, user2.hasFacebookToken);
        user2.hasTwitterToken = C1662a.m5934a(userStructV2.has_twitter_token, user2.hasTwitterToken);
        user2.fbExpireTime = C1662a.m5928a(userStructV2.fb_expire_time, user2.fbExpireTime);
        user2.twExpireTime = C1662a.m5928a(userStructV2.tw_expire_time, user2.twExpireTime);
        user2.hasYoutubeToken = C1662a.m5934a(userStructV2.has_youtube_token, user2.hasYoutubeToken);
        user2.youtubeExpireTime = C1662a.m5928a(userStructV2.youtube_expire_time, user2.youtubeExpireTime);
        user2.roomId = C1662a.m5930a(userStructV2.room_id, user2.roomId);
        user2.verifyStatus = C1662a.m5926a(userStructV2.live_verify, user2.verifyStatus);
        user2.authorityStatus = C1662a.m5930a(userStructV2.authority_status, user2.authorityStatus);
        user2.verifyInfo = userStructV2.verify_info == null ? user2.verifyInfo : userStructV2.verify_info;
        user2.shieldFollowNotice = C1662a.m5926a(userStructV2.shield_follow_notice, user2.shieldFollowNotice);
        user2.shieldDiggNotice = C1662a.m5926a(userStructV2.shield_digg_notice, user2.shieldDiggNotice);
        user2.shieldCommentNotice = C1662a.m5926a(userStructV2.shield_comment_notice, user2.shieldCommentNotice);
        user2.schoolName = userStructV2.school_name == null ? user2.schoolName : userStructV2.school_name;
        user2.schoolPoiId = userStructV2.school_poi_id == null ? user2.schoolPoiId : userStructV2.school_poi_id;
        user2.schoolType = C1662a.m5926a(userStructV2.school_type, user2.schoolType);
        user2.shareInfo = m5899xe4348698(userStructV2.share_info, user2.shareInfo);
        user2.withCommerceEntry = C1662a.m5934a(userStructV2.with_commerce_entry, user2.withCommerceEntry);
        user2.verificationType = C1662a.m5926a(userStructV2.verification_type, user2.verificationType);
        user2.originalMusician = m5879x309ee127(userStructV2.original_musician, user2.originalMusician);
        user2.enterpriseVerifyReason = userStructV2.enterprise_verify_reason == null ? user2.enterpriseVerifyReason : userStructV2.enterprise_verify_reason;
        user2.isAdFake = C1662a.m5934a(userStructV2.is_ad_fake, user2.isAdFake);
        user2.starUseNewDownload = C1662a.m5934a(userStructV2.star_use_new_download, user2.starUseNewDownload);
        user2.fansCount = C1662a.m5926a(userStructV2.mplatform_followers_count, user2.fansCount);
        user2.followerDetailList = m5787xba3b9b20(userStructV2.followers_detail, user2.followerDetailList);
        user2.hasMedal = C1662a.m5934a(userStructV2.has_activity_medal, user2.hasMedal);
        user2.region = userStructV2.region == null ? user2.region : userStructV2.region;
        user2.accountRegion = userStructV2.account_region == null ? user2.accountRegion : userStructV2.account_region;
        user2.isSyncToutiao = C1662a.m5926a(userStructV2.sync_to_toutiao, user2.isSyncToutiao);
        user2.commerceUserLevel = C1662a.m5926a(userStructV2.commerce_user_level, user2.commerceUserLevel);
        user2.commerceInfo = m5841x89ac5ff3(userStructV2.commerce_info, user2.commerceInfo);
        user2.liveAgreement = C1662a.m5926a(userStructV2.live_agreement, user2.liveAgreement);
        user2.platformInfos = m5795xc1a28d7c(userStructV2.platform_sync_info, user2.platformInfos);
        user2.withShopEntry = C1662a.m5934a(userStructV2.with_shop_entry, user2.withShopEntry);
        user2.isDisciplineMember = C1662a.m5934a(userStructV2.is_discipline_member, user2.isDisciplineMember);
        user2.secret = C1662a.m5935a(userStructV2.secret, user2.secret);
        user2.hasOrders = C1662a.m5934a(userStructV2.has_orders, user2.hasOrders);
        user2.preventDownload = C1662a.m5934a(userStructV2.prevent_download, user2.preventDownload);
        user2.showImageBubble = C1662a.m5934a(userStructV2.show_image_bubble, user2.showImageBubble);
        user2.unique_id_modify_time = C1662a.m5928a(userStructV2.unique_id_modify_time, user2.unique_id_modify_time);
        user2.avatarVideoUri = m5907xd6e21675(userStructV2.video_icon, user2.avatarVideoUri);
        user2.insId = userStructV2.ins_id == null ? user2.insId : userStructV2.ins_id;
        user2.googleAccount = userStructV2.google_account == null ? user2.googleAccount : userStructV2.google_account;
        user2.youtubeChannelId = userStructV2.youtube_channel_id == null ? user2.youtubeChannelId : userStructV2.youtube_channel_id;
        user2.youtubeChannelTitle = userStructV2.youtube_channel_title == null ? user2.youtubeChannelTitle : userStructV2.youtube_channel_title;
        user2.withDouEntry = C1662a.m5934a(userStructV2.with_dou_entry, user2.withDouEntry);
        user2.withFusionShopEntry = C1662a.m5934a(userStructV2.with_fusion_shop_entry, user2.withFusionShopEntry);
        user2.isPhoneBinded = C1662a.m5934a(userStructV2.is_phone_binded, user2.isPhoneBinded);
        user2.loginPlatform = C1662a.m5926a(userStructV2.login_platform, user2.loginPlatform);
        user2.acceptPrivatePolicy = C1662a.m5934a(userStructV2.accept_private_policy, user2.acceptPrivatePolicy);
        user2.verifyStatus = C1662a.m5926a(userStructV2.realname_verify_status, user2.verifyStatus);
        user2.twitterId = userStructV2.twitter_id == null ? user2.twitterId : userStructV2.twitter_id;
        user2.twitterName = userStructV2.twitter_name == null ? user2.twitterName : userStructV2.twitter_name;
        user2.userCancelled = C1662a.m5934a(userStructV2.user_canceled, user2.userCancelled);
        user2.hasEmail = C1662a.m5934a(userStructV2.has_email, user2.hasEmail);
        user2.mIsGovMediaVip = C1662a.m5934a(userStructV2.is_gov_media_vip, user2.mIsGovMediaVip);
        user2.dongtai_count = C1662a.m5926a(userStructV2.dongtai_count, user2.dongtai_count);
        user2.registerTime = C1662a.m5930a(userStructV2.register_time, user2.registerTime);
        user2.withDouplusEntry = C1662a.m5934a(userStructV2.with_douplus_entry, user2.withDouplusEntry);
        user2.createTime = userStructV2.create_time == null ? user2.createTime : userStructV2.create_time;
        user2.followerStatus = C1662a.m5926a(userStructV2.follower_status, user2.followerStatus);
        user2.neiguangShield = C1662a.m5926a(userStructV2.neiguang_shield, user2.neiguangShield);
        user2.commentSetting = C1662a.m5926a(userStructV2.comment_setting, user2.commentSetting);
        user2.duetSetting = C1662a.m5926a(userStructV2.duet_setting, user2.duetSetting);
        user2.userRate = C1662a.m5926a(userStructV2.user_rate, user2.userRate);
        user2.withNewGoods = C1662a.m5934a(userStructV2.with_new_goods, user2.withNewGoods);
        user2.isFlowcardMember = C1662a.m5934a(userStructV2.is_flowcard_member, user2.isFlowcardMember);
        user2.roomCover = m5907xd6e21675(userStructV2.room_cover, user2.roomCover);
        user2.downloadSetting = C1662a.m5926a(userStructV2.download_setting, user2.downloadSetting);
        user2.liveCommerce = C1662a.m5934a(userStructV2.live_commerce, user2.liveCommerce);
        user2.collegeName = userStructV2.college_name == null ? user2.collegeName : userStructV2.college_name;
        user2.enrollYear = userStructV2.enroll_year == null ? user2.enrollYear : userStructV2.enroll_year;
        user2.country = userStructV2.country == null ? user2.country : userStructV2.country;
        user2.province = userStructV2.province == null ? user2.province : userStructV2.province;
        user2.cityName = userStructV2.city == null ? user2.cityName : userStructV2.city;
        user2.coverUrls = m5802x5c3c5aaf(userStructV2.cover_url, user2.coverUrls);
        user2.recommendReasonRelation = userStructV2.recommend_reason_relation == null ? user2.recommendReasonRelation : userStructV2.recommend_reason_relation;
        user2.isoCountryCode = userStructV2.iso_country_code == null ? user2.isoCountryCode : userStructV2.iso_country_code;
        user2.showGenderStrategy = C1662a.m5926a(userStructV2.show_gender_strategy, user2.showGenderStrategy);
        user2.district = userStructV2.district == null ? user2.district : userStructV2.district;
        user2.language = userStructV2.language == null ? user2.language : userStructV2.language;
        user2.roomTypeTag = userStructV2.room_type_tag == null ? user2.roomTypeTag : userStructV2.room_type_tag;
        user2.douPlusShareLocation = C1662a.m5926a(userStructV2.dou_plus_share_location, user2.douPlusShareLocation);
        user2.isCreater = C1662a.m5934a(userStructV2.has_insights, user2.isCreater);
        user2.remarkName = userStructV2.remark_name == null ? user2.remarkName : userStructV2.remark_name;
        user2.tabType = C1662a.m5926a(userStructV2.profile_tab_type, user2.tabType);
        user2.avatarDecoration = m5815xb77ea0de(userStructV2.avatar_decoration, user2.avatarDecoration);
        user2.watchStatus = C1662a.m5924a(userStructV2.watch_status, user2.watchStatus);
        user2.withCommerceNewbieTask = C1662a.m5934a(userStructV2.with_commerce_newbie_task, user2.withCommerceNewbieTask);
        user2.withItemCommerceEntry = C1662a.m5934a(userStructV2.with_item_commerce_entry, user2.withItemCommerceEntry);
        user2.starBillboardRank = C1662a.m5926a(userStructV2.star_billboard_rank, user2.starBillboardRank);
        user2.education = C1662a.m5926a(userStructV2.education, user2.education);
        user2.canModifySchoolInfo = C1662a.m5934a(userStructV2.can_modify_school_info, user2.canModifySchoolInfo);
        user2.schoolInfoShowRange = C1662a.m5926a(userStructV2.school_visible, user2.schoolInfoShowRange);
        user2.avatarPendantLarger = m5907xd6e21675(userStructV2.avatar_pendant_larger, user2.avatarPendantLarger);
        user2.avatarPendantThumb = m5907xd6e21675(userStructV2.avatar_pendant_thumb, user2.avatarPendantThumb);
        user2.avatarPendantMedium = m5907xd6e21675(userStructV2.avatar_pendant_medium, user2.avatarPendantMedium);
        user2.recommendAwemeItems = m5797x2cf2d58d(userStructV2.item_list, user2.recommendAwemeItems);
        user2.userMode = C1662a.m5926a(userStructV2.user_mode, user2.userMode);
        user2.userPeriod = C1662a.m5926a(userStructV2.user_period, user2.userPeriod);
        user2.isEffectArtist = C1662a.m5934a(userStructV2.is_effect_artist, user2.isEffectArtist);
        user2.effectArtistDetail = m5848xcd80c52f(userStructV2.effect_detail, user2.effectArtistDetail);
        user2.commercePermission = m5842xdb3e10b3(userStructV2.commerce_permissions, user2.commercePermission);
        user2.storyBlockInfo = m5862x63b96a30(userStructV2.life_story_block, user2.storyBlockInfo);
        user2.hideFollowingFollowerList = C1662a.m5926a(userStructV2.hide_following_follower_list, user2.hideFollowingFollowerList);
        user2.hasUnreadStory = userStructV2.has_unread_story == null ? user2.hasUnreadStory : userStructV2.has_unread_story;
        user2.latestStoryCover = m5802x5c3c5aaf(userStructV2.new_story_cover, user2.latestStoryCover);
        user2.userStoryCount = C1662a.m5926a(userStructV2.user_story_count, user2.userStoryCount);
        user2.hasStory = C1662a.m5934a(userStructV2.has_story, user2.hasStory);
        user2.isStar = C1662a.m5934a(userStructV2.is_star, user2.isStar);
        user2.typeLabels = List$java$lang$Long$$ArrayJ(userStructV2.type_label, user2.typeLabels);
        user2.withLubanEntry = C1662a.m5934a(userStructV2.with_luban_entry, user2.withLubanEntry);
        user2.adCoverUrl = m5802x5c3c5aaf(userStructV2.ad_cover_url, user2.adCoverUrl);
        user2.adCoverTitle = m5807xc3027593(userStructV2.ad_cover_title, user2.adCoverTitle);
        user2.adOrderId = userStructV2.ad_order_id == null ? user2.adOrderId : userStructV2.ad_order_id;
        user2.rFansGroupInfo = m5892x59f04dc3(userStructV2.r_fans_group_info, user2.rFansGroupInfo);
        user2.withCommerceEnterpriseTabEntry = C1662a.m5934a(userStructV2.with_commerce_enterprise_tab_entry, user2.withCommerceEnterpriseTabEntry);
        user2.honorStruct = m5865x5053ac85(userStructV2.honor_info, user2.honorStruct);
        user2.commentFilterStatus = C1662a.m5926a(userStructV2.comment_filter_status, user2.commentFilterStatus);
        user2.notifyPrivateAccount = C1662a.m5926a(userStructV2.notify_private_account, user2.notifyPrivateAccount);
        user2.isBlocked = C1662a.m5934a(userStructV2.is_blocked, user2.isBlocked);
        user2.forcePrivateAccount = C1662a.m5934a(userStructV2.force_private_account, user2.forcePrivateAccount);
        user2.withStarAtlasEntry = C1662a.m5934a(userStructV2.with_star_atlas_entry, user2.withStarAtlasEntry);
        user2.sprintSupportUserInfo = m5856xbdc2a07b(userStructV2.sprint_support_user_info, user2.sprintSupportUserInfo);
        user2.signatureLanguage = userStructV2.signature_language == null ? user2.signatureLanguage : userStructV2.signature_language;
        user2.brandInfo = m5833x254728de(userStructV2.brand_info, user2.brandInfo);
        user2.displayWvalantineActivityEntry = C1662a.m5934a(userStructV2.display_wvalantine_activity_entry, user2.displayWvalantineActivityEntry);
        user2.shopMicroApp = userStructV2.shop_micro_app == null ? user2.shopMicroApp : userStructV2.shop_micro_app;
        user2.commerceUserInfo = m5845x60620bcc(userStructV2.commerce_user_info, user2.commerceUserInfo);
        user2.relativeUserInfos = m5799xf3bc2c2a(userStructV2.relative_users, user2.relativeUserInfos);
        user2.quickShopInfo = m5891x85e038dc(userStructV2.quick_shop_info, user2.quickShopInfo);
        user2.relationLabel = userStructV2.relation_label == null ? user2.relationLabel : userStructV2.relation_label;
        user2.challengeList = m5784x890b881a(userStructV2.cha_list, user2.challengeList);
        user2.isMinor = C1662a.m5934a(userStructV2.is_minor, user2.isMinor);
        user2.secUid = userStructV2.sec_uid == null ? user2.secUid : userStructV2.sec_uid;
        user2.recommendScore = C1662a.m5922a(userStructV2.recommend_score, user2.recommendScore);
        user2.wxTag = C1662a.m5926a(userStructV2.wx_tag, user2.wxTag);
        user2.mGeneralPermission = m5880xef5550a8(userStructV2.general_permission, user2.mGeneralPermission);
        user2.birthdayHideLevel = C1662a.m5926a(userStructV2.birthday_hide_level, user2.birthdayHideLevel);
        user2.bioUrl = userStructV2.bio_url == null ? user2.bioUrl : userStructV2.bio_url;
        user2.bioEmail = userStructV2.bio_email == null ? user2.bioEmail : userStructV2.bio_email;
        user2.latestOrderTime = userStructV2.latest_order_time == null ? user2.latestOrderTime : userStructV2.latest_order_time;
        user2.isProAccount = C1662a.m5934a(userStructV2.is_pro_account, user2.isProAccount);
        user2.email = userStructV2.email == null ? user2.email : userStructV2.email;
        user2.isEmailVerified = C1662a.m5934a(userStructV2.is_email_verified, user2.isEmailVerified);
        user2.bioSecureUrl = userStructV2.bio_secure_url == null ? user2.bioSecureUrl : userStructV2.bio_secure_url;
        user2.collectCount = C1662a.m5926a(userStructV2.collect_count, user2.collectCount);
        user2.nicknameUpdateReminder = C1662a.m5934a(userStructV2.nickname_update_reminder, user2.nicknameUpdateReminder);
        user2.avatarUpdateReminder = C1662a.m5934a(userStructV2.avatar_update_reminder, user2.avatarUpdateReminder);
        user2.isActivityUser = C1662a.m5934a(userStructV2.is_activity_user, user2.isActivityUser);
        user2.roomData = userStructV2.room_data == null ? user2.roomData : userStructV2.room_data;
        user2.unReadVideoInfo = m5915x5665e1cc(userStructV2.video_unread_info, user2.unReadVideoInfo);
        return user2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl */
    public static VideoControl m5911x817ae5e8(VideoControlV2 videoControlV2, VideoControl videoControl) {
        if (videoControlV2 == null) {
            return videoControl;
        }
        VideoControl videoControl2 = new VideoControl();
        videoControl2.allowDownload = videoControlV2.allow_download == null ? videoControl2.allowDownload : videoControlV2.allow_download;
        videoControl2.shareType = C1662a.m5926a(videoControlV2.share_type, videoControl2.shareType);
        videoControl2.showProgressBar = C1662a.m5926a(videoControlV2.show_progress_bar, videoControl2.showProgressBar);
        videoControl2.draftProgressBar = C1662a.m5926a(videoControlV2.draft_progress_bar, videoControl2.draftProgressBar);
        videoControl2.isAllowDuet = C1662a.m5934a(videoControlV2.allow_duet, videoControl2.isAllowDuet);
        videoControl2.isAllowReact = C1662a.m5934a(videoControlV2.allow_react, videoControl2.isAllowReact);
        videoControl2.preventDownloadType = C1662a.m5926a(videoControlV2.prevent_download_type, videoControl2.preventDownloadType);
        videoControl2.isAllowDynamicWallpaper = C1662a.m5934a(videoControlV2.allow_dynamic_wallpaper, videoControl2.isAllowDynamicWallpaper);
        videoControl2.timerStatus = C1662a.m5926a(videoControlV2.timer_status, videoControl2.timerStatus);
        return videoControl2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoReplyStructV2$$com$ss$android$ugc$aweme$feed$model$VideoReplyStruct */
    public static VideoReplyStruct m5912xc5fe6d6c(VideoReplyStructV2 videoReplyStructV2, VideoReplyStruct videoReplyStruct) {
        if (videoReplyStructV2 == null) {
            return videoReplyStruct;
        }
        VideoReplyStruct videoReplyStruct2 = new VideoReplyStruct();
        videoReplyStruct2.awemeId = C1662a.m5933a(videoReplyStructV2.aweme_id, videoReplyStruct2.awemeId);
        videoReplyStruct2.commentId = C1662a.m5933a(videoReplyStructV2.comment_id, videoReplyStruct2.commentId);
        videoReplyStruct2.aliasCommentId = C1662a.m5933a(videoReplyStructV2.alias_comment_id, videoReplyStruct2.aliasCommentId);
        return videoReplyStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video */
    public static Video m5913xdc245461(VideoStructV2 videoStructV2, Video video) {
        if (videoStructV2 == null) {
            return video;
        }
        Video video2 = new Video();
        video2.playAddr = m5908xb077c847(videoStructV2.play_addr, video2.playAddr);
        video2.cover = m5907xd6e21675(videoStructV2.cover, video2.cover);
        video2.height = C1662a.m5926a(videoStructV2.height, video2.height);
        video2.width = C1662a.m5926a(videoStructV2.width, video2.width);
        video2.dynamicCover = m5907xd6e21675(videoStructV2.dynamic_cover, video2.dynamicCover);
        video2.originCover = m5907xd6e21675(videoStructV2.origin_cover, video2.originCover);
        video2.ratio = videoStructV2.ratio == null ? video2.ratio : videoStructV2.ratio;
        video2.downloadAddr = m5907xd6e21675(videoStructV2.download_addr, video2.downloadAddr);
        video2.hasWaterMark = C1662a.m5934a(videoStructV2.has_watermark, video2.hasWaterMark);
        video2.bitRate = m5783xb984563(videoStructV2.bit_rate, video2.bitRate);
        video2.newDownloadAddr = m5907xd6e21675(videoStructV2.new_download_addr, video2.newDownloadAddr);
        video2.videoLength = C1662a.m5926a(videoStructV2.duration, video2.videoLength);
        video2.suffixLogoAddr = m5907xd6e21675(videoStructV2.download_suffix_logo_addr, video2.suffixLogoAddr);
        video2.hasSuffixWaterMark = C1662a.m5934a(videoStructV2.has_download_suffix_logo_addr, video2.hasSuffixWaterMark);
        video2.playAddrH265 = m5908xb077c847(videoStructV2.play_addr_265, video2.playAddrH265);
        video2.h264PlayAddr = m5908xb077c847(videoStructV2.play_addr_h264, video2.h264PlayAddr);
        video2.uiAlikeAddr = m5907xd6e21675(videoStructV2.ui_alike_download_addr, video2.uiAlikeAddr);
        video2.captionDownloadAddr = m5907xd6e21675(videoStructV2.caption_download_addr, video2.captionDownloadAddr);
        video2.dVideoModel = videoStructV2.video_model == null ? video2.dVideoModel : videoStructV2.video_model;
        video2.needSetCookie = C1662a.m5934a(videoStructV2.need_set_token, video2.needSetCookie);
        video2.miscDownloadAddrs = videoStructV2.misc_download_addrs == null ? video2.miscDownloadAddrs : videoStructV2.misc_download_addrs;
        video2.drmTokenAuth = m5882x92d6feb8(videoStructV2.token_auth, video2.drmTokenAuth);
        return video2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel */
    public static AwemeTextLabelModel m5914x7df21302(VideoTextStructV2 videoTextStructV2, AwemeTextLabelModel awemeTextLabelModel) {
        if (videoTextStructV2 == null) {
            return awemeTextLabelModel;
        }
        AwemeTextLabelModel awemeTextLabelModel2 = new AwemeTextLabelModel();
        awemeTextLabelModel2.labelName = videoTextStructV2.text == null ? awemeTextLabelModel2.labelName : videoTextStructV2.text;
        awemeTextLabelModel2.bgColor = videoTextStructV2.color == null ? awemeTextLabelModel2.bgColor : videoTextStructV2.color;
        awemeTextLabelModel2.textColor = videoTextStructV2.color_text == null ? awemeTextLabelModel2.textColor : videoTextStructV2.color_text;
        awemeTextLabelModel2.labelType = C1662a.m5926a(videoTextStructV2.type, awemeTextLabelModel2.labelType);
        return awemeTextLabelModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoUnreadStructV2$$com$ss$android$ugc$aweme$profile$model$UnReadVideoInfo */
    public static UnReadVideoInfo m5915x5665e1cc(VideoUnreadStructV2 videoUnreadStructV2, UnReadVideoInfo unReadVideoInfo) {
        if (videoUnreadStructV2 == null) {
            return unReadVideoInfo;
        }
        UnReadVideoInfo unReadVideoInfo2 = new UnReadVideoInfo();
        unReadVideoInfo2.unReadCount = C1662a.m5926a(videoUnreadStructV2.unread_count, unReadVideoInfo2.unReadCount);
        unReadVideoInfo2.latestUnreadVideoCreatedTime = C1662a.m5930a(videoUnreadStructV2.latest_unread_video_created_time, unReadVideoInfo2.latestUnreadVideoCreatedTime);
        return unReadVideoInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean */
    public static OptionsBean m5916xbfb88253(VoteOptionStructV2 voteOptionStructV2, OptionsBean optionsBean) {
        if (voteOptionStructV2 == null) {
            return optionsBean;
        }
        OptionsBean optionsBean2 = new OptionsBean();
        optionsBean2.optionText = voteOptionStructV2.option_text == null ? optionsBean2.optionText : voteOptionStructV2.option_text;
        optionsBean2.optionId = C1662a.m5930a(voteOptionStructV2.option_id, optionsBean2.optionId);
        optionsBean2.voteCount = C1662a.m5930a(voteOptionStructV2.vote_count, optionsBean2.voteCount);
        optionsBean2.postOption = voteOptionStructV2.option == null ? optionsBean2.postOption : voteOptionStructV2.option;
        return optionsBean2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VoteStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct */
    public static VoteStruct m5917x9c43fc14(VoteStructV2 voteStructV2, VoteStruct voteStruct) {
        if (voteStructV2 == null) {
            return voteStruct;
        }
        VoteStruct voteStruct2 = new VoteStruct();
        voteStruct2.voteId = C1662a.m5930a(voteStructV2.vote_id, voteStruct2.voteId);
        voteStruct2.refId = C1662a.m5930a(voteStructV2.ref_id, voteStruct2.refId);
        voteStruct2.refType = C1662a.m5926a(voteStructV2.ref_type, voteStruct2.refType);
        voteStruct2.question = voteStructV2.question == null ? voteStruct2.question : voteStructV2.question;
        voteStruct2.options = m5804x41864bc5(voteStructV2.options, voteStruct2.options);
        voteStruct2.selectOptionId = C1662a.m5930a(voteStructV2.select_option_id, voteStruct2.selectOptionId);
        return voteStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$WebcastRoomFeedCellStructV2$$com$ss$android$ugc$aweme$feed$model$live$RoomFeedCellStruct */
    public static RoomFeedCellStruct m5918xf777e67b(WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2, RoomFeedCellStruct roomFeedCellStruct) {
        if (webcastRoomFeedCellStructV2 == null) {
            return roomFeedCellStruct;
        }
        RoomFeedCellStruct roomFeedCellStruct2 = new RoomFeedCellStruct();
        roomFeedCellStruct2.room = m5919x5fb58c07(webcastRoomFeedCellStructV2.room, roomFeedCellStruct2.room);
        roomFeedCellStruct2.type = C1662a.m5926a(webcastRoomFeedCellStructV2.type, roomFeedCellStruct2.type);
        roomFeedCellStruct2.mFansStruct = m5851x43c70f74(webcastRoomFeedCellStructV2.fans_struct, roomFeedCellStruct2.mFansStruct);
        roomFeedCellStruct2.tag = webcastRoomFeedCellStructV2.tag == null ? roomFeedCellStruct2.tag : webcastRoomFeedCellStructV2.tag;
        roomFeedCellStruct2.tagId = C1662a.m5930a(webcastRoomFeedCellStructV2.tag_id, roomFeedCellStruct2.tagId);
        roomFeedCellStruct2.icon = m5907xd6e21675(webcastRoomFeedCellStructV2.icon, roomFeedCellStruct2.icon);
        roomFeedCellStruct2.distance = webcastRoomFeedCellStructV2.distance == null ? roomFeedCellStruct2.distance : webcastRoomFeedCellStructV2.distance;
        roomFeedCellStruct2.newLiveRoomData = C30147e.m70755a(webcastRoomFeedCellStructV2.rawdata, roomFeedCellStruct2.newLiveRoomData);
        return roomFeedCellStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$WebcastRoomStructV2$$com$ss$android$ugc$aweme$feed$model$live$LiveRoomStruct */
    public static LiveRoomStruct m5919x5fb58c07(WebcastRoomStructV2 webcastRoomStructV2, LiveRoomStruct liveRoomStruct) {
        if (webcastRoomStructV2 == null) {
            return liveRoomStruct;
        }
        LiveRoomStruct liveRoomStruct2 = new LiveRoomStruct();
        liveRoomStruct2.f79734id = C1662a.m5930a(webcastRoomStructV2.room_id, liveRoomStruct2.f79734id);
        liveRoomStruct2.status = C1662a.m5926a(webcastRoomStructV2.status, liveRoomStruct2.status);
        liveRoomStruct2.owner = m5910x2fb9c61e(webcastRoomStructV2.owner, liveRoomStruct2.owner);
        liveRoomStruct2.title = webcastRoomStructV2.title == null ? liveRoomStruct2.title : webcastRoomStructV2.title;
        liveRoomStruct2.user_count = C1662a.m5926a(webcastRoomStructV2.user_count, liveRoomStruct2.user_count);
        liveRoomStruct2.create_time = C1662a.m5930a(webcastRoomStructV2.create_time, liveRoomStruct2.create_time);
        liveRoomStruct2.finish_time = C1662a.m5930a(webcastRoomStructV2.finish_time, liveRoomStruct2.finish_time);
        liveRoomStruct2.stream_id = C1662a.m5930a(webcastRoomStructV2.stream_id, liveRoomStruct2.stream_id);
        liveRoomStruct2.stream_url = m5905x6525b8ba(webcastRoomStructV2.stream_url, liveRoomStruct2.stream_url);
        liveRoomStruct2.share_info = m5900x84e4115a(webcastRoomStructV2.share_info, liveRoomStruct2.share_info);
        liveRoomStruct2.digg_count = C1662a.m5926a(webcastRoomStructV2.digg_count, liveRoomStruct2.digg_count);
        liveRoomStruct2.total_user_count = C1662a.m5926a(webcastRoomStructV2.total_user_count, liveRoomStruct2.total_user_count);
        liveRoomStruct2.coins = C1662a.m5926a(webcastRoomStructV2.coins, liveRoomStruct2.coins);
        liveRoomStruct2.inSandbox = C1662a.m5934a(webcastRoomStructV2.in_sandbox, liveRoomStruct2.inSandbox);
        liveRoomStruct2.roomCover = m5907xd6e21675(webcastRoomStructV2.room_cover, liveRoomStruct2.roomCover);
        liveRoomStruct2.roomTypeTag = webcastRoomStructV2.room_type_tag == null ? liveRoomStruct2.roomTypeTag : webcastRoomStructV2.room_type_tag;
        liveRoomStruct2.additional_stream_url = m5905x6525b8ba(webcastRoomStructV2.additional_stream_url, liveRoomStruct2.additional_stream_url);
        liveRoomStruct2.liveTypeAudio = C1662a.m5934a(webcastRoomStructV2.live_type_audio, liveRoomStruct2.liveTypeAudio);
        liveRoomStruct2.isThirdParty = C1662a.m5934a(webcastRoomStructV2.live_type_third_party, liveRoomStruct2.isThirdParty);
        liveRoomStruct2.isScreenshot = C1662a.m5934a(webcastRoomStructV2.live_type_screenshot, liveRoomStruct2.isScreenshot);
        liveRoomStruct2.isOfficialType = C1662a.m5934a(webcastRoomStructV2.live_type_official, liveRoomStruct2.isOfficialType);
        liveRoomStruct2.withLinkmic = C1662a.m5934a(webcastRoomStructV2.with_linkmic, liveRoomStruct2.withLinkmic);
        return liveRoomStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$XiguaTaskStructV2$$com$ss$android$ugc$aweme$feed$model$xigua$XiGuaTaskStruct */
    public static XiGuaTaskStruct m5920xc04704f4(XiguaTaskStructV2 xiguaTaskStructV2, XiGuaTaskStruct xiGuaTaskStruct) {
        if (xiguaTaskStructV2 == null) {
            return xiGuaTaskStruct;
        }
        XiGuaTaskStruct xiGuaTaskStruct2 = new XiGuaTaskStruct();
        xiGuaTaskStruct2.isXiGuaTask = C1662a.m5934a(xiguaTaskStructV2.is_xigua_task, xiGuaTaskStruct2.isXiGuaTask);
        xiGuaTaskStruct2.jumpUrl = xiguaTaskStructV2.jump_url == null ? xiGuaTaskStruct2.jumpUrl : xiguaTaskStructV2.jump_url;
        xiGuaTaskStruct2.title = xiguaTaskStructV2.title == null ? xiGuaTaskStruct2.title : xiguaTaskStructV2.title;
        xiGuaTaskStruct2.desc = xiguaTaskStructV2.desc == null ? xiGuaTaskStruct2.desc : xiguaTaskStructV2.desc;
        xiGuaTaskStruct2.iconUrl = xiguaTaskStructV2.icon_url == null ? xiGuaTaskStruct2.iconUrl : xiguaTaskStructV2.icon_url;
        xiGuaTaskStruct2.switchType = C1662a.m5926a(xiguaTaskStructV2.switch_type, xiGuaTaskStruct2.switchType);
        xiGuaTaskStruct2.entranceUrl = xiguaTaskStructV2.entrance_url == null ? xiGuaTaskStruct2.entranceUrl : xiguaTaskStructV2.entrance_url;
        return xiGuaTaskStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList */
    public static FeedItemList m5921x2ccced6e(aweme_v2_feed_response aweme_v2_feed_response, FeedItemList feedItemList) {
        if (aweme_v2_feed_response == null) {
            return feedItemList;
        }
        FeedItemList feedItemList2 = new FeedItemList();
        feedItemList2.status_code = C1662a.m5926a(aweme_v2_feed_response.status_code, feedItemList2.status_code);
        feedItemList2.minCursor = C1662a.m5930a(aweme_v2_feed_response.min_cursor, feedItemList2.minCursor);
        feedItemList2.maxCursor = C1662a.m5930a(aweme_v2_feed_response.max_cursor, feedItemList2.maxCursor);
        feedItemList2.hasMore = C1662a.m5926a(aweme_v2_feed_response.has_more, feedItemList2.hasMore);
        feedItemList2.items = m5782x83100197(aweme_v2_feed_response.aweme_list, feedItemList2.items);
        feedItemList2.requestId = aweme_v2_feed_response.rid == null ? feedItemList2.requestId : aweme_v2_feed_response.rid;
        feedItemList2.refreshClear = C1662a.m5926a(aweme_v2_feed_response.refresh_clear, feedItemList2.refreshClear);
        feedItemList2.extra = m5850x7e6bce41(aweme_v2_feed_response.extra, feedItemList2.extra);
        feedItemList2.logPb = m5866x980e63d1(aweme_v2_feed_response.log_pb, feedItemList2.logPb);
        feedItemList2.hotSearchGuideWord = m5854xd7636a61(aweme_v2_feed_response.guide_word, feedItemList2.hotSearchGuideWord);
        feedItemList2.preloadAds = m5782x83100197(aweme_v2_feed_response.preload_ads, feedItemList2.preloadAds);
        feedItemList2.status_msg = aweme_v2_feed_response.status_msg == null ? feedItemList2.status_msg : aweme_v2_feed_response.status_msg;
        feedItemList2.blockCode = C1662a.m5926a(aweme_v2_feed_response.block_code, feedItemList2.blockCode);
        feedItemList2.preloadAwemes = m5782x83100197(aweme_v2_feed_response.preload_awemes, feedItemList2.preloadAwemes);
        feedItemList2.enableReRank = C1662a.m5934a(aweme_v2_feed_response.enable_re_rank, feedItemList2.enableReRank);
        return feedItemList2;
    }
}
