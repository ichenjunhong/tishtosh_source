package com.twitter.sdk.android.core.models;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.models.q */
public final class C52213q implements Serializable {
    private static final long serialVersionUID = 4663450696842173958L;
    @C17952c(mo34828a = "contributors_enabled")
    public final boolean contributorsEnabled;
    @C17952c(mo34828a = "created_at")
    public final String createdAt;
    @C17952c(mo34828a = "default_profile")
    public final boolean defaultProfile;
    @C17952c(mo34828a = "default_profile_image")
    public final boolean defaultProfileImage;
    @C17952c(mo34828a = "description")
    public final String description;
    @C17952c(mo34828a = "email")
    public final String email;
    @C17952c(mo34828a = "entities")
    public final C52214r entities;
    @C17952c(mo34828a = "favourites_count")
    public final int favouritesCount;
    @C17952c(mo34828a = "follow_request_sent")
    public final boolean followRequestSent;
    @C17952c(mo34828a = "followers_count")
    public final int followersCount;
    @C17952c(mo34828a = "friends_count")
    public final int friendsCount;
    @C17952c(mo34828a = "geo_enabled")
    public final boolean geoEnabled;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public final long f130027id;
    @C17952c(mo34828a = "id_str")
    public final String idStr;
    @C17952c(mo34828a = "is_translator")
    public final boolean isTranslator;
    @C17952c(mo34828a = "lang")
    public final String lang;
    @C17952c(mo34828a = "listed_count")
    public final int listedCount;
    @C17952c(mo34828a = "location")
    public final String location;
    @C17952c(mo34828a = "name")
    public final String name;
    @C17952c(mo34828a = "profile_background_color")
    public final String profileBackgroundColor;
    @C17952c(mo34828a = "profile_background_image_url")
    public final String profileBackgroundImageUrl;
    @C17952c(mo34828a = "profile_background_image_url_https")
    public final String profileBackgroundImageUrlHttps;
    @C17952c(mo34828a = "profile_background_tile")
    public final boolean profileBackgroundTile;
    @C17952c(mo34828a = "profile_banner_url")
    public final String profileBannerUrl;
    @C17952c(mo34828a = "profile_image_url")
    public final String profileImageUrl;
    @C17952c(mo34828a = "profile_image_url_https")
    public final String profileImageUrlHttps;
    @C17952c(mo34828a = "profile_link_color")
    public final String profileLinkColor;
    @C17952c(mo34828a = "profile_sidebar_border_color")
    public final String profileSidebarBorderColor;
    @C17952c(mo34828a = "profile_sidebar_fill_color")
    public final String profileSidebarFillColor;
    @C17952c(mo34828a = "profile_text_color")
    public final String profileTextColor;
    @C17952c(mo34828a = "profile_use_background_image")
    public final boolean profileUseBackgroundImage;
    @C17952c(mo34828a = "protected")
    public final boolean protectedUser;
    @C17952c(mo34828a = "screen_name")
    public final String screenName;
    @C17952c(mo34828a = "show_all_inline_media")
    public final boolean showAllInlineMedia;
    @C17952c(mo34828a = "status")
    public final C52209m status;
    @C17952c(mo34828a = "statuses_count")
    public final int statusesCount;
    @C17952c(mo34828a = "time_zone")
    public final String timeZone;
    @C17952c(mo34828a = "url")
    public final String url;
    @C17952c(mo34828a = "utc_offset")
    public final int utcOffset;
    @C17952c(mo34828a = "verified")
    public final boolean verified;
    @C17952c(mo34828a = "withheld_in_countries")
    public final List<String> withheldInCountries;
    @C17952c(mo34828a = "withheld_scope")
    public final String withheldScope;

    public final long getId() {
        return this.f130027id;
    }

    public C52213q(boolean z, String str, boolean z2, boolean z3, String str2, String str3, C52214r rVar, int i, boolean z4, int i2, int i3, boolean z5, long j, String str4, boolean z6, String str5, int i4, String str6, String str7, String str8, String str9, String str10, boolean z7, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z8, boolean z9, String str18, boolean z10, C52209m mVar, int i5, String str19, String str20, int i6, boolean z11, List<String> list, String str21) {
        this.contributorsEnabled = z;
        this.createdAt = str;
        this.defaultProfile = z2;
        this.defaultProfileImage = z3;
        this.description = str2;
        this.email = str3;
        this.entities = rVar;
        this.favouritesCount = i;
        this.followRequestSent = z4;
        this.followersCount = i2;
        this.friendsCount = i3;
        this.geoEnabled = z5;
        this.f130027id = j;
        this.idStr = str4;
        this.isTranslator = z6;
        this.lang = str5;
        this.listedCount = i4;
        this.location = str6;
        this.name = str7;
        this.profileBackgroundColor = str8;
        this.profileBackgroundImageUrl = str9;
        this.profileBackgroundImageUrlHttps = str10;
        this.profileBackgroundTile = z7;
        this.profileBannerUrl = str11;
        this.profileImageUrl = str12;
        this.profileImageUrlHttps = str13;
        this.profileLinkColor = str14;
        this.profileSidebarBorderColor = str15;
        this.profileSidebarFillColor = str16;
        this.profileTextColor = str17;
        this.profileUseBackgroundImage = z8;
        this.protectedUser = z9;
        this.screenName = str18;
        this.showAllInlineMedia = z10;
        this.status = mVar;
        this.statusesCount = i5;
        this.timeZone = str19;
        this.url = str20;
        this.utcOffset = i6;
        this.verified = z11;
        this.withheldInCountries = list;
        this.withheldScope = str21;
    }
}
