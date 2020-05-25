package com.p683ss.android.ugc.aweme.story.api.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.story.api.model.p2335a.C46630a;
import com.p683ss.android.ugc.aweme.story.api.model.p2335a.C46632b;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.api.model.LifeStory */
public class LifeStory implements Serializable {
    @C17952c(mo34828a = "author")
    User author;
    @C17952c(mo34828a = "author_user_id")
    long authorUserId;
    @C17952c(mo34828a = "aweme_type")
    int awemeType;
    @C17952c(mo34828a = "cmt_swt")
    boolean cmtSwt;
    @C17952c(mo34828a = "create_time")
    long createTime;
    @C17952c(mo34828a = "duration")
    int duration;
    @C17952c(mo34828a = "group_id")
    String groupId;
    @C17952c(mo34828a = "image_info")
    ImageInfo imageInfo;
    @C17952c(mo34828a = "interaction_stickers")
    List<InteractStickerStruct> interactStickerStructs;
    @C17952c(mo34828a = "label_large")
    UrlModel labelLarge;
    @C17952c(mo34828a = "label_thumb")
    UrlModel labelThumb;
    @C17952c(mo34828a = "life_activity_info")
    C46630a lifeActivityInfo;
    @C17952c(mo34828a = "share_url")
    String shareUrl;
    @C17952c(mo34828a = "stickers")
    String stickers;
    @C17952c(mo34828a = "story_id")
    String storyId;
    @C17952c(mo34828a = "third_platform_info")
    C46632b thirdPlatformInfo;
    @C17952c(mo34828a = "video")
    Video video;

    public User getAuthor() {
        return this.author;
    }

    public long getAuthorUserId() {
        return this.authorUserId;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public List<InteractStickerStruct> getInteractStickerStructs() {
        return this.interactStickerStructs;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public C46630a getLifeActivityInfo() {
        return this.lifeActivityInfo;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getStickers() {
        return this.stickers;
    }

    public String getStoryId() {
        return this.storyId;
    }

    public C46632b getThirdPlatformInfo() {
        return this.thirdPlatformInfo;
    }

    public Video getVideo() {
        return this.video;
    }

    public boolean isCmtSwt() {
        return this.cmtSwt;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAuthorUserId(long j) {
        this.authorUserId = j;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setCmtSwt(boolean z) {
        this.cmtSwt = z;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setImageInfo(ImageInfo imageInfo2) {
        this.imageInfo = imageInfo2;
    }

    public void setInteractStickerStructs(List<InteractStickerStruct> list) {
        this.interactStickerStructs = list;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLifeActivityInfo(C46630a aVar) {
        this.lifeActivityInfo = aVar;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStickers(String str) {
        this.stickers = str;
    }

    public void setStoryId(String str) {
        this.storyId = str;
    }

    public void setThirdPlatformInfo(C46632b bVar) {
        this.thirdPlatformInfo = bVar;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }
}
