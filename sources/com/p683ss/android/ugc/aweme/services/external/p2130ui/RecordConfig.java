package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.RecordConfig */
public class RecordConfig implements Serializable {
    public static final Companion Companion = new Companion(null);
    private String autoUseMusic;
    private String autoUseSticker;
    private Challenge challenge;
    private String challengeId;
    private List<? extends Challenge> challenges;
    private CommentVideoConfig commentVideoConfig;
    private String commerceData;
    private String creationId;
    private Long decompressTime;
    private Integer defaultTab;
    private String donationId;
    private EffectConfig effectConfig;
    private Long effectDownloadDuration;
    private String enterFrom;
    private Effect firstSticker;
    private Boolean fromMain;
    private Boolean fromOtherPlatform;
    private Boolean fromSpecialPlus;
    private Boolean fromSystem;
    private String groupId;
    private String isFilterBusniessSticker;
    private Boolean keepChallenges;
    private C52847n<String, String> mentionUser;
    private MiniAppConfig miniAppConfig;
    private Long musicDownloadDuration;
    private String musicId;
    private MusicModel musicModel;
    private String musicOrigin;
    private String musicPath;
    private String musicSticker;
    private Integer musicType;
    private Effect musicWithStickerEffect;
    private Effect mvSticker;
    private String mvStickerId;
    private Boolean permissionActivityRequired;
    private PoiConfig poiSticker;
    private boolean prepareFilter;
    private Boolean presetSticker;
    private String previousPage;
    private ReshootConfig reshootConfig;
    private int restoreType;
    private String shootway;
    private boolean showStickerPanel;
    private HashMap<String, String> starAtlasConfig;
    private Long startRecordTime;
    private String sticker;
    private String stickerFrom;
    private Music stickerMusic;
    private String stickerWithMusicFilePath;
    private ArrayList<String> stickers;
    private StitchParams stitchParams;
    private HashMap<String, String> taskPlatformConfig;
    private Integer translationType;
    private Long videoDownloadDuration;
    private XSConfig xsConfig;

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder */
    public static class Builder {
        private RecordConfig config;

        public final RecordConfig build() {
            return this.config;
        }

        public Builder() {
            this.config = new RecordConfig(null);
        }

        public final Builder CommentVideoConfig(CommentVideoConfig commentVideoConfig) {
            C52711k.m112240b(commentVideoConfig, "commentVideoConfig");
            Builder builder = this;
            builder.config.setCommentVideoConfig(commentVideoConfig);
            return builder;
        }

        public final Builder XSConfig(XSConfig xSConfig) {
            C52711k.m112240b(xSConfig, "xsConfig");
            Builder builder = this;
            builder.config.setXsConfig(xSConfig);
            return builder;
        }

        public final Builder autoUseMusic(String str) {
            C52711k.m112240b(str, "music");
            Builder builder = this;
            builder.config.setAutoUseMusic(str);
            return builder;
        }

        public final Builder autoUseSticker(String str) {
            C52711k.m112240b(str, "sticker");
            Builder builder = this;
            builder.config.setAutoUseSticker(str);
            return builder;
        }

        public final Builder challenge(Challenge challenge) {
            Builder builder = this;
            builder.config.setChallenge(challenge);
            return builder;
        }

        public final Builder challengeId(String str) {
            Builder builder = this;
            builder.config.setChallengeId(str);
            return builder;
        }

        public final Builder challenges(List<? extends Challenge> list) {
            C52711k.m112240b(list, "challenges");
            Builder builder = this;
            builder.config.setChallenges(list);
            return builder;
        }

        public final Builder commercialData(String str) {
            Builder builder = this;
            builder.config.setCommerceData(str);
            return builder;
        }

        public final Builder creationId(String str) {
            Builder builder = this;
            builder.config.setCreationId(str);
            return builder;
        }

        public final Builder decompressTime(long j) {
            Builder builder = this;
            builder.config.setDecompressTime(Long.valueOf(j));
            return builder;
        }

        public final Builder defaultTab(int i) {
            Builder builder = this;
            builder.config.setDefaultTab(Integer.valueOf(i));
            return builder;
        }

        public final Builder donationId(String str) {
            Builder builder = this;
            builder.config.setDonationId(str);
            return builder;
        }

        public final Builder effectConfig(EffectConfig effectConfig) {
            C52711k.m112240b(effectConfig, "effectConfig");
            Builder builder = this;
            builder.config.setEffectConfig(effectConfig);
            return builder;
        }

        public final Builder effectDownloadDuration(long j) {
            Builder builder = this;
            builder.config.setEffectDownloadDuration(Long.valueOf(j));
            return builder;
        }

        public final Builder enterFrom(String str) {
            Builder builder = this;
            builder.config.setEnterFrom(str);
            return builder;
        }

        public final Builder filterBuinessSticker(String str) {
            Builder builder = this;
            builder.config.setFilterBusniessSticker(str);
            return builder;
        }

        public final Builder firstSticker(Effect effect) {
            C52711k.m112240b(effect, "firstSticker");
            Builder builder = this;
            builder.config.setFirstSticker(effect);
            return builder;
        }

        public final Builder fromMain(boolean z) {
            Builder builder = this;
            builder.config.setFromMain(Boolean.valueOf(z));
            return builder;
        }

        public final Builder fromOtherPlatform(boolean z) {
            Builder builder = this;
            builder.config.setFromOtherPlatform(Boolean.valueOf(z));
            return builder;
        }

        public final Builder fromSpecialPlus(boolean z) {
            Builder builder = this;
            builder.config.setFromSpecialPlus(Boolean.valueOf(z));
            return builder;
        }

        public final Builder fromSystem(Boolean bool) {
            Builder builder = this;
            builder.config.setFromSystem(bool);
            return builder;
        }

        public final Builder groupId(String str) {
            Builder builder = this;
            builder.config.setGroupId(str);
            return builder;
        }

        public final Builder keepChallenge(boolean z) {
            Builder builder = this;
            builder.config.setKeepChallenges(Boolean.valueOf(z));
            return builder;
        }

        public final Builder miniAppConfig(MiniAppConfig miniAppConfig) {
            C52711k.m112240b(miniAppConfig, "miniAppConfig");
            Builder builder = this;
            builder.config.setMiniAppConfig(miniAppConfig);
            return builder;
        }

        public final Builder musicDownloadDuration(long j) {
            Builder builder = this;
            builder.config.setMusicDownloadDuration(Long.valueOf(j));
            return builder;
        }

        public final Builder musicId(String str) {
            Builder builder = this;
            builder.config.setMusicId(str);
            return builder;
        }

        public final Builder musicModel(MusicModel musicModel) {
            Builder builder = this;
            builder.config.setMusicModel(musicModel);
            return builder;
        }

        public final Builder musicOrigin(String str) {
            C52711k.m112240b(str, "musicOrigin");
            Builder builder = this;
            builder.config.setMusicOrigin(str);
            return builder;
        }

        public final Builder musicPath(String str) {
            C52711k.m112240b(str, "musicPath");
            Builder builder = this;
            builder.config.setMusicPath(str);
            return builder;
        }

        public final Builder musicSticker(String str) {
            C52711k.m112240b(str, "stickerId");
            Builder builder = this;
            builder.config.setMusicSticker(str);
            return builder;
        }

        public final Builder musicType(int i) {
            Builder builder = this;
            builder.config.setMusicType(Integer.valueOf(i));
            return builder;
        }

        public final Builder musicWithSticker(Effect effect) {
            Builder builder = this;
            builder.config.setMusicWithStickerEffect(effect);
            return builder;
        }

        public final Builder mvSticker(Effect effect) {
            C52711k.m112240b(effect, "mvSticker");
            Builder builder = this;
            builder.config.setMvSticker(effect);
            return builder;
        }

        public final Builder mvStickerId(String str) {
            Builder builder = this;
            builder.config.setMvStickerId(str);
            return builder;
        }

        public final Builder permissionActivityRequired(boolean z) {
            Builder builder = this;
            builder.config.setPermissionActivityRequired(Boolean.valueOf(z));
            return builder;
        }

        public final Builder poiSticker(PoiConfig poiConfig) {
            C52711k.m112240b(poiConfig, "poiSticker");
            Builder builder = this;
            builder.config.setPoiSticker(poiConfig);
            return builder;
        }

        public final Builder prepareFilter(boolean z) {
            Builder builder = this;
            builder.config.setPrepareFilter(z);
            return builder;
        }

        public final Builder previousPage(String str) {
            Builder builder = this;
            builder.config.setPreviousPage(str);
            return builder;
        }

        public final Builder reshootConfig(ReshootConfig reshootConfig) {
            C52711k.m112240b(reshootConfig, "reshootConfig");
            Builder builder = this;
            builder.config.setReshootConfig(reshootConfig);
            return builder;
        }

        public final Builder restoreType(int i) {
            Builder builder = this;
            builder.config.setRestoreType(i);
            return builder;
        }

        public final Builder shootWay(String str) {
            Builder builder = this;
            builder.config.setShootway(str);
            return builder;
        }

        public final Builder showStickerPanel(boolean z) {
            Builder builder = this;
            builder.config.setShowStickerPanel(z);
            return builder;
        }

        public final Builder starAtlasConfig(HashMap<String, String> hashMap) {
            Builder builder = this;
            builder.config.setStarAtlasConfig(hashMap);
            return builder;
        }

        public final Builder startRecordTime(long j) {
            Builder builder = this;
            builder.config.setStartRecordTime(Long.valueOf(j));
            return builder;
        }

        public final Builder sticker(String str) {
            Builder builder = this;
            builder.config.setSticker(str);
            return builder;
        }

        public final Builder stickerFrom(String str) {
            Builder builder = this;
            builder.config.setStickerFrom(str);
            return builder;
        }

        public final Builder stickerMusic(Music music) {
            Builder builder = this;
            builder.config.setStickerMusic(music);
            return builder;
        }

        public final Builder stickerWithMusicFilePath(String str) {
            Builder builder = this;
            builder.config.setStickerWithMusicFilePath(str);
            return builder;
        }

        public final Builder stickers(ArrayList<String> arrayList) {
            C52711k.m112240b(arrayList, "stickers");
            Builder builder = this;
            builder.config.setStickers(arrayList);
            return builder;
        }

        public final Builder stitchParams(StitchParams stitchParams) {
            C52711k.m112240b(stitchParams, "stitchParams");
            Builder builder = this;
            builder.config.setStitchParams(stitchParams);
            return builder;
        }

        public final Builder taskPlatformConfig(HashMap<String, String> hashMap) {
            Builder builder = this;
            builder.config.setTaskPlatformConfig(hashMap);
            return builder;
        }

        public final Builder translationType(int i) {
            Builder builder = this;
            builder.config.setTranslationType(Integer.valueOf(i));
            return builder;
        }

        public final Builder usePresetSticker(Boolean bool) {
            Builder builder = this;
            builder.config.setPresetSticker(bool);
            return builder;
        }

        public final Builder videoDownloadDuration(long j) {
            Builder builder = this;
            builder.config.setVideoDownloadDuration(Long.valueOf(j));
            return builder;
        }

        public Builder(RecordConfig recordConfig) {
            C52711k.m112240b(recordConfig, "config");
            this.config = recordConfig;
        }

        public final Builder mentionUser(String str, String str2) {
            C52711k.m112240b(str, "userId");
            C52711k.m112240b(str2, "userName");
            Builder builder = this;
            builder.config.setMentionUser(new C52847n(str, str2));
            return builder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public static /* synthetic */ void restoreType$annotations() {
    }

    public final String getAutoUseMusic() {
        return this.autoUseMusic;
    }

    public final String getAutoUseSticker() {
        return this.autoUseSticker;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final List<Challenge> getChallenges() {
        return this.challenges;
    }

    public final CommentVideoConfig getCommentVideoConfig() {
        return this.commentVideoConfig;
    }

    public final String getCommerceData() {
        return this.commerceData;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final Long getDecompressTime() {
        return this.decompressTime;
    }

    public final Integer getDefaultTab() {
        return this.defaultTab;
    }

    public final String getDonationId() {
        return this.donationId;
    }

    public final EffectConfig getEffectConfig() {
        return this.effectConfig;
    }

    public final Long getEffectDownloadDuration() {
        return this.effectDownloadDuration;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final Effect getFirstSticker() {
        return this.firstSticker;
    }

    public final Boolean getFromMain() {
        return this.fromMain;
    }

    public final Boolean getFromOtherPlatform() {
        return this.fromOtherPlatform;
    }

    public final Boolean getFromSpecialPlus() {
        return this.fromSpecialPlus;
    }

    public final Boolean getFromSystem() {
        return this.fromSystem;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final Boolean getKeepChallenges() {
        return this.keepChallenges;
    }

    public final C52847n<String, String> getMentionUser() {
        return this.mentionUser;
    }

    public final MiniAppConfig getMiniAppConfig() {
        return this.miniAppConfig;
    }

    public final Long getMusicDownloadDuration() {
        return this.musicDownloadDuration;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getMusicOrigin() {
        return this.musicOrigin;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final String getMusicSticker() {
        return this.musicSticker;
    }

    public final Integer getMusicType() {
        return this.musicType;
    }

    public final Effect getMusicWithStickerEffect() {
        return this.musicWithStickerEffect;
    }

    public final Effect getMvSticker() {
        return this.mvSticker;
    }

    public final String getMvStickerId() {
        return this.mvStickerId;
    }

    public final Boolean getPermissionActivityRequired() {
        return this.permissionActivityRequired;
    }

    public final PoiConfig getPoiSticker() {
        return this.poiSticker;
    }

    public final boolean getPrepareFilter() {
        return this.prepareFilter;
    }

    public final Boolean getPresetSticker() {
        return this.presetSticker;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final ReshootConfig getReshootConfig() {
        return this.reshootConfig;
    }

    public final int getRestoreType() {
        return this.restoreType;
    }

    public final String getShootway() {
        return this.shootway;
    }

    public final boolean getShowStickerPanel() {
        return this.showStickerPanel;
    }

    public final HashMap<String, String> getStarAtlasConfig() {
        return this.starAtlasConfig;
    }

    public final Long getStartRecordTime() {
        return this.startRecordTime;
    }

    public final String getSticker() {
        return this.sticker;
    }

    public final String getStickerFrom() {
        return this.stickerFrom;
    }

    public final Music getStickerMusic() {
        return this.stickerMusic;
    }

    public final String getStickerWithMusicFilePath() {
        return this.stickerWithMusicFilePath;
    }

    public final ArrayList<String> getStickers() {
        return this.stickers;
    }

    public final StitchParams getStitchParams() {
        return this.stitchParams;
    }

    public final HashMap<String, String> getTaskPlatformConfig() {
        return this.taskPlatformConfig;
    }

    public final Integer getTranslationType() {
        return this.translationType;
    }

    public final Long getVideoDownloadDuration() {
        return this.videoDownloadDuration;
    }

    public final XSConfig getXsConfig() {
        return this.xsConfig;
    }

    public final String isFilterBusniessSticker() {
        return this.isFilterBusniessSticker;
    }

    private RecordConfig() {
        this.keepChallenges = Boolean.valueOf(false);
        this.translationType = Integer.valueOf(0);
        this.permissionActivityRequired = Boolean.valueOf(false);
        this.prepareFilter = true;
        this.defaultTab = Integer.valueOf(0);
        this.musicType = Integer.valueOf(0);
        this.reshootConfig = new ReshootConfig(false, null);
    }

    public /* synthetic */ RecordConfig(C52707g gVar) {
        this();
    }

    public final void setAutoUseMusic(String str) {
        this.autoUseMusic = str;
    }

    public final void setAutoUseSticker(String str) {
        this.autoUseSticker = str;
    }

    public final void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setChallenges(List<? extends Challenge> list) {
        this.challenges = list;
    }

    public final void setCommentVideoConfig(CommentVideoConfig commentVideoConfig2) {
        this.commentVideoConfig = commentVideoConfig2;
    }

    public final void setCommerceData(String str) {
        this.commerceData = str;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setDecompressTime(Long l) {
        this.decompressTime = l;
    }

    public final void setDefaultTab(Integer num) {
        this.defaultTab = num;
    }

    public final void setDonationId(String str) {
        this.donationId = str;
    }

    public final void setEffectConfig(EffectConfig effectConfig2) {
        this.effectConfig = effectConfig2;
    }

    public final void setEffectDownloadDuration(Long l) {
        this.effectDownloadDuration = l;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setFilterBusniessSticker(String str) {
        this.isFilterBusniessSticker = str;
    }

    public final void setFirstSticker(Effect effect) {
        this.firstSticker = effect;
    }

    public final void setFromMain(Boolean bool) {
        this.fromMain = bool;
    }

    public final void setFromOtherPlatform(Boolean bool) {
        this.fromOtherPlatform = bool;
    }

    public final void setFromSpecialPlus(Boolean bool) {
        this.fromSpecialPlus = bool;
    }

    public final void setFromSystem(Boolean bool) {
        this.fromSystem = bool;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setKeepChallenges(Boolean bool) {
        this.keepChallenges = bool;
    }

    public final void setMentionUser(C52847n<String, String> nVar) {
        this.mentionUser = nVar;
    }

    public final void setMiniAppConfig(MiniAppConfig miniAppConfig2) {
        this.miniAppConfig = miniAppConfig2;
    }

    public final void setMusicDownloadDuration(Long l) {
        this.musicDownloadDuration = l;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicModel(MusicModel musicModel2) {
        this.musicModel = musicModel2;
    }

    public final void setMusicOrigin(String str) {
        this.musicOrigin = str;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicSticker(String str) {
        this.musicSticker = str;
    }

    public final void setMusicType(Integer num) {
        this.musicType = num;
    }

    public final void setMusicWithStickerEffect(Effect effect) {
        this.musicWithStickerEffect = effect;
    }

    public final void setMvSticker(Effect effect) {
        this.mvSticker = effect;
    }

    public final void setMvStickerId(String str) {
        this.mvStickerId = str;
    }

    public final void setPermissionActivityRequired(Boolean bool) {
        this.permissionActivityRequired = bool;
    }

    public final void setPoiSticker(PoiConfig poiConfig) {
        this.poiSticker = poiConfig;
    }

    public final void setPrepareFilter(boolean z) {
        this.prepareFilter = z;
    }

    public final void setPresetSticker(Boolean bool) {
        this.presetSticker = bool;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setRestoreType(int i) {
        this.restoreType = i;
    }

    public final void setShootway(String str) {
        this.shootway = str;
    }

    public final void setShowStickerPanel(boolean z) {
        this.showStickerPanel = z;
    }

    public final void setStarAtlasConfig(HashMap<String, String> hashMap) {
        this.starAtlasConfig = hashMap;
    }

    public final void setStartRecordTime(Long l) {
        this.startRecordTime = l;
    }

    public final void setSticker(String str) {
        this.sticker = str;
    }

    public final void setStickerFrom(String str) {
        this.stickerFrom = str;
    }

    public final void setStickerMusic(Music music) {
        this.stickerMusic = music;
    }

    public final void setStickerWithMusicFilePath(String str) {
        this.stickerWithMusicFilePath = str;
    }

    public final void setStickers(ArrayList<String> arrayList) {
        this.stickers = arrayList;
    }

    public final void setStitchParams(StitchParams stitchParams2) {
        this.stitchParams = stitchParams2;
    }

    public final void setTaskPlatformConfig(HashMap<String, String> hashMap) {
        this.taskPlatformConfig = hashMap;
    }

    public final void setTranslationType(Integer num) {
        this.translationType = num;
    }

    public final void setVideoDownloadDuration(Long l) {
        this.videoDownloadDuration = l;
    }

    public final void setXsConfig(XSConfig xSConfig) {
        this.xsConfig = xSConfig;
    }

    public final void setReshootConfig(ReshootConfig reshootConfig2) {
        C52711k.m112240b(reshootConfig2, "<set-?>");
        this.reshootConfig = reshootConfig2;
    }
}
