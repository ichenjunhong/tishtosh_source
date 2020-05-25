package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.RelatedMediaSourceStruct */
public final class RelatedMediaSourceStruct implements Serializable {
    @C17952c(mo34828a = "button")
    private MediaSourceButtonStruct button;
    @C17952c(mo34828a = "classification")
    private List<String> classification;
    @C17952c(mo34828a = "compass_id")
    private String compassId;
    @C17952c(mo34828a = "cover")
    private UrlModel cover = new UrlModel();
    @C17952c(mo34828a = "duration")
    private Integer duration = Integer.valueOf(0);
    @C17952c(mo34828a = "seqs_count")
    private int epCount;
    @C17952c(mo34828a = "media_name")
    private String mediaName = "";
    @C17952c(mo34828a = "media_tag")
    private String mediaTag = "";
    @C17952c(mo34828a = "media_type")
    private int mediaType = 1;
    @C17952c(mo34828a = "rating")
    private Float rating = Float.valueOf(0.0f);
    @C17952c(mo34828a = "rating_status")
    private Integer ratingStatus = Integer.valueOf(0);
    @C17952c(mo34828a = "read_more")
    private String readMore = "";
    @C17952c(mo34828a = "read_more_url")
    private String readMoreUrl = "";
    @C17952c(mo34828a = "release_date")
    private String releaseData = "";
    @C17952c(mo34828a = "title")
    private String title = "";

    public final MediaSourceButtonStruct getButton() {
        return this.button;
    }

    public final List<String> getClassification() {
        return this.classification;
    }

    public final String getCompassId() {
        return this.compassId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final int getEpCount() {
        return this.epCount;
    }

    public final String getMediaName() {
        return this.mediaName;
    }

    public final String getMediaTag() {
        return this.mediaTag;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final Integer getRatingStatus() {
        return this.ratingStatus;
    }

    public final String getReadMore() {
        return this.readMore;
    }

    public final String getReadMoreUrl() {
        return this.readMoreUrl;
    }

    public final String getReleaseData() {
        return this.releaseData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isMovie() {
        if (this.mediaType == 3) {
            return true;
        }
        return false;
    }

    public final String getContentType() {
        List<String> list = this.classification;
        if (list != null) {
            String a = C52575l.m112120a(list, " ", null, null, 0, null, null, 62, null);
            if (a != null) {
                return a;
            }
        }
        return "";
    }

    public final void setButton(MediaSourceButtonStruct mediaSourceButtonStruct) {
        this.button = mediaSourceButtonStruct;
    }

    public final void setClassification(List<String> list) {
        this.classification = list;
    }

    public final void setCompassId(String str) {
        this.compassId = str;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEpCount(int i) {
        this.epCount = i;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setRating(Float f) {
        this.rating = f;
    }

    public final void setRatingStatus(Integer num) {
        this.ratingStatus = num;
    }

    public final void setReleaseData(String str) {
        this.releaseData = str;
    }

    public final void setCover(UrlModel urlModel) {
        C52711k.m112240b(urlModel, "<set-?>");
        this.cover = urlModel;
    }

    public final void setMediaName(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.mediaName = str;
    }

    public final void setMediaTag(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.mediaTag = str;
    }

    public final void setReadMore(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.readMore = str;
    }

    public final void setReadMoreUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.readMoreUrl = str;
    }

    public final void setTitle(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.title = str;
    }
}
