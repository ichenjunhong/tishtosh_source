package com.p683ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.discover.model.VideoTag;
import com.p683ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Video */
public class Video implements Serializable {
    @C17952c(mo34828a = "animated_cover")
    public UrlModel animatedCover;
    @C17952c(mo34828a = "bit_rate")
    public List<BitRate> bitRate;
    public int[] cachedOuterCoverSize;
    public UrlModel cachedOuterCoverUrl;
    @C17952c(mo34828a = "caption_download_addr")
    public UrlModel captionDownloadAddr;
    @C17952c(mo34828a = "cover")
    public UrlModel cover;
    @C17952c(mo34828a = "video_model")
    public String dVideoModel;
    @C17952c(mo34828a = "download_addr")
    public UrlModel downloadAddr;
    @C17952c(mo34828a = "token_auth")
    public PlayTokenAuth drmTokenAuth;
    @C17952c(mo34828a = "dynamic_cover")
    public UrlModel dynamicCover;
    @C17952c(mo34828a = "is_drm_source")
    public boolean enableIntertrustDrm;
    @C17952c(mo34828a = "play_addr_h264")
    public VideoUrlModel h264PlayAddr;
    @C17952c(mo34828a = "has_download_suffix_logo_addr")
    public boolean hasSuffixWaterMark;
    @C17952c(mo34828a = "has_watermark")
    public boolean hasWaterMark;
    @C17952c(mo34828a = "height")
    public int height;
    @C17952c(mo34828a = "misc_download_addrs")
    public String miscDownloadAddrs;
    @C17952c(mo34828a = "need_set_token")
    public boolean needSetCookie;
    @C17952c(mo34828a = "new_download_addr")
    public UrlModel newDownloadAddr;
    @C17952c(mo34828a = "origin_cover")
    public UrlModel originCover;
    @C17952c(mo34828a = "play_addr")
    public VideoUrlModel playAddr;
    @C17952c(mo34828a = "play_addr_265")
    public VideoUrlModel playAddrH265;
    @C17952c(mo34828a = "ratio")
    public String ratio;
    @C17952c(mo34828a = "download_suffix_logo_addr")
    public UrlModel suffixLogoAddr;
    @C17952c(mo34828a = "ui_alike_download_addr")
    public UrlModel uiAlikeAddr;
    @C17952c(mo34828a = "duration")
    public int videoLength;
    @C17952c(mo34828a = "tag")
    public VideoTag videoTag;
    @C17952c(mo34828a = "width")
    public int width;

    public boolean enableIntertrustDrm() {
        return this.enableIntertrustDrm;
    }

    public UrlModel getAnimatedCover() {
        return this.animatedCover;
    }

    public List<BitRate> getBitRate() {
        return this.bitRate;
    }

    public int[] getCachedOuterCoverSize() {
        return this.cachedOuterCoverSize;
    }

    public UrlModel getCachedOuterCoverUrl() {
        return this.cachedOuterCoverUrl;
    }

    public UrlModel getCaptionDownloadAddr() {
        return this.captionDownloadAddr;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDownloadAddr() {
        return this.downloadAddr;
    }

    public PlayTokenAuth getDrmTokenAuth() {
        return this.drmTokenAuth;
    }

    public int getDuration() {
        return this.videoLength;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public VideoUrlModel getH264PlayAddr() {
        return this.h264PlayAddr;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMiscDownloadAddrs() {
        return this.miscDownloadAddrs;
    }

    public UrlModel getNewDownloadAddr() {
        return this.newDownloadAddr;
    }

    public String getRatio() {
        return this.ratio;
    }

    public UrlModel getSuffixLogoDownloadAddr() {
        return this.suffixLogoAddr;
    }

    public UrlModel getUIAlikeDownloadAddr() {
        return this.uiAlikeAddr;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public String getVideoModelStr() {
        return this.dVideoModel;
    }

    public VideoTag getVideoTag() {
        return this.videoTag;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean hasEndWaterMark() {
        return this.hasSuffixWaterMark;
    }

    public boolean isHasWaterMark() {
        return this.hasWaterMark;
    }

    public boolean isLowBr() {
        return false;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public VideoUrlModel getProperPlayAddr() {
        return getPlayAddr();
    }

    public boolean isCoverValid() {
        return isUrlModelValid(this.cover);
    }

    public boolean isOriginCoverValid() {
        return isUrlModelValid(this.originCover);
    }

    public String getVideoId() {
        if (this.drmTokenAuth != null) {
            return this.drmTokenAuth.getVid();
        }
        return null;
    }

    public String getVideoIdApiHost() {
        if (this.drmTokenAuth != null) {
            return this.drmTokenAuth.tryGetHost();
        }
        return null;
    }

    public String getVideoIdAuth() {
        if (this.drmTokenAuth != null) {
            return this.drmTokenAuth.getAuth();
        }
        return null;
    }

    public String getVideoIdPToken() {
        if (this.drmTokenAuth != null) {
            return this.drmTokenAuth.getToken();
        }
        return null;
    }

    public UrlModel getOriginCover() {
        if (isOriginCoverValid() || !isCoverValid()) {
            return this.originCover;
        }
        return this.cover;
    }

    public VideoUrlModel getPlayAddrH264() {
        checkBitRateAndDurationCopy();
        if (this.playAddr != null) {
            this.playAddr.setH265(false);
            this.playAddr.setRatio(this.ratio);
        }
        return this.playAddr;
    }

    public VideoUrlModel getPlayAddrH265() {
        checkBitRateAndDurationCopy();
        if (this.playAddrH265 != null) {
            this.playAddrH265.setH265(true);
            this.playAddrH265.setRatio(this.ratio);
        }
        return this.playAddrH265;
    }

    public VideoUrlModel getPlayAddr() {
        checkBitRateAndDurationCopy();
        if (this.playAddrH265 != null) {
            this.playAddrH265.setH265(true);
            this.playAddrH265.setRatio(this.ratio);
        }
        if (this.playAddr != null) {
            this.playAddr.setH265(false);
            this.playAddr.setRatio(this.ratio);
        }
        if (checkVideo(this.playAddrH265)) {
            return this.playAddrH265;
        }
        return this.playAddr;
    }

    private void checkBitRateAndDurationCopy() {
        if (!(this.playAddrH265 == null || this.playAddrH265.getBitRate() == this.bitRate)) {
            this.playAddrH265.setBitRate(this.bitRate);
            this.playAddrH265.setDuration((double) this.videoLength);
            this.playAddrH265.setH265(true);
        }
        if (this.playAddr != null && this.playAddr.getBitRate() != this.bitRate) {
            this.playAddr.setBitRate(this.bitRate);
            this.playAddr.setDuration((double) this.videoLength);
            this.playAddr.setH265(false);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Video{playAddr=");
        sb.append(this.playAddr);
        sb.append(", playAddrH265=");
        sb.append(this.playAddrH265);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", dynamicCover=");
        sb.append(this.dynamicCover);
        sb.append(", originCover=");
        sb.append(this.originCover);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", ratio='");
        sb.append(this.ratio);
        sb.append('\'');
        sb.append(", downloadAddr=");
        sb.append(this.downloadAddr);
        sb.append(", hasWaterMark=");
        sb.append(this.hasWaterMark);
        sb.append(", videoLength=");
        sb.append(this.videoLength);
        sb.append(", bitRate=");
        sb.append(this.bitRate);
        sb.append(", newDownloadAddr=");
        sb.append(this.newDownloadAddr);
        sb.append(", suffixLogoAddr=");
        sb.append(this.suffixLogoAddr);
        sb.append(", hasSuffixWaterMark=");
        sb.append(this.hasSuffixWaterMark);
        sb.append(", needSetCookie=");
        sb.append(this.needSetCookie);
        sb.append(", misc_download_addrs=");
        sb.append(this.miscDownloadAddrs);
        sb.append('}');
        return sb.toString();
    }

    public void setAnimatedCover(UrlModel urlModel) {
        this.animatedCover = urlModel;
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setCachedOuterCoverSize(int[] iArr) {
        this.cachedOuterCoverSize = iArr;
    }

    public void setCachedOuterCoverUrl(UrlModel urlModel) {
        this.cachedOuterCoverUrl = urlModel;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDownloadAddr(UrlModel urlModel) {
        this.downloadAddr = urlModel;
    }

    public void setDrmTokenAuth(PlayTokenAuth playTokenAuth) {
        this.drmTokenAuth = playTokenAuth;
    }

    public void setDuration(double d) {
        this.videoLength = (int) d;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setEnableIntertrustDrm(boolean z) {
        this.enableIntertrustDrm = z;
    }

    public void setHasWaterMark(boolean z) {
        this.hasWaterMark = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMiscDownloadAddrs(String str) {
        this.miscDownloadAddrs = str;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setNewDownloadAddr(UrlModel urlModel) {
        this.newDownloadAddr = urlModel;
    }

    public void setOriginCover(UrlModel urlModel) {
        this.originCover = urlModel;
    }

    public void setPlayAddr(VideoUrlModel videoUrlModel) {
        this.playAddr = videoUrlModel;
    }

    public void setPlayAddrH265(VideoUrlModel videoUrlModel) {
        this.playAddrH265 = videoUrlModel;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setSourceId(String str) {
        setRationAndSourceId(str);
    }

    public void setVideoLength(int i) {
        this.videoLength = i;
    }

    public void setVideoModelStr(String str) {
        this.dVideoModel = str;
    }

    public void setVideoTag(VideoTag videoTag2) {
        this.videoTag = videoTag2;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    private static boolean isUrlModelValid(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean checkVideo(UrlModel urlModel) {
        if (urlModel == null) {
            return false;
        }
        List urlList = urlModel.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            return false;
        }
        Iterator it = urlList.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty((String) it.next())) {
                it.remove();
            }
        }
        if (urlList.isEmpty() || TextUtils.isEmpty(urlModel.getUri())) {
            return false;
        }
        return true;
    }

    public void setRationAndSourceId(String str) {
        if (this.playAddrH265 != null) {
            this.playAddrH265.setRatio(this.ratio).setSourceId(str);
            this.playAddrH265.setH265(true);
        }
        if (this.playAddr != null) {
            this.playAddr.setRatio(this.ratio).setSourceId(str);
            this.playAddr.setH265(false);
        }
    }
}
