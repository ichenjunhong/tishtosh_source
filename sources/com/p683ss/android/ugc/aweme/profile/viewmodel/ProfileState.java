package com.p683ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11790ac;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.lighten.p766a.C12200n;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileState */
public final class ProfileState implements C11932s {
    public static final C40597a Companion = new C40597a(null);
    private final int avatarClickCount;
    private final int curTabType;
    private final Integer currentDownloadSetting;
    private final String enterFrom;
    private final String from;
    private final String fromSearch;
    private final boolean isAvatarClicked;
    private final boolean isBackgroundCoverClicked;
    private final Boolean isPostAwemeEmpty;
    private final Boolean isPostAwemeEmptyWhenPrivateShow;
    private final Boolean isPostGuideShow;
    private final String livePreviousPage;
    private final C11787a<C52847n<UrlModel, C12200n>> loadAvatar;
    private final boolean needShowProfileCollectionGuide;
    private final String needUpdateAvatarUrl;
    private final boolean onHiddenChanged;
    private final Aweme sourceAweme;
    private final String suid;
    private final String uid;
    private final User user;
    private final boolean userVisibleHint;

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileState$a */
    public static final class C40597a {
        private C40597a() {
        }

        public /* synthetic */ C40597a(C52707g gVar) {
            this();
        }
    }

    public ProfileState() {
        this(null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, false, false, false, null, false, null, 2097151, null);
    }

    public static /* synthetic */ ProfileState copy$default(ProfileState profileState, String str, String str2, User user2, Aweme aweme, C11787a aVar, int i, int i2, boolean z, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7, int i3, Object obj) {
        Boolean bool4;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Integer num2;
        Integer num3;
        boolean z12;
        ProfileState profileState2 = profileState;
        int i4 = i3;
        String str8 = (i4 & 1) != 0 ? profileState2.uid : str;
        String str9 = (i4 & 2) != 0 ? profileState2.suid : str2;
        User user3 = (i4 & 4) != 0 ? profileState2.user : user2;
        Aweme aweme2 = (i4 & 8) != 0 ? profileState2.sourceAweme : aweme;
        C11787a aVar2 = (i4 & 16) != 0 ? profileState2.loadAvatar : aVar;
        int i5 = (i4 & 32) != 0 ? profileState2.avatarClickCount : i;
        int i6 = (i4 & 64) != 0 ? profileState2.curTabType : i2;
        boolean z13 = (i4 & 128) != 0 ? profileState2.userVisibleHint : z;
        String str10 = (i4 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? profileState2.needUpdateAvatarUrl : str3;
        String str11 = (i4 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? profileState2.livePreviousPage : str4;
        String str12 = (i4 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? profileState2.from : str5;
        String str13 = (i4 & 2048) != 0 ? profileState2.enterFrom : str6;
        Boolean bool5 = (i4 & 4096) != 0 ? profileState2.isPostGuideShow : bool;
        Boolean bool6 = (i4 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? profileState2.isPostAwemeEmpty : bool2;
        Boolean bool7 = (i4 & 16384) != 0 ? profileState2.isPostAwemeEmptyWhenPrivateShow : bool3;
        if ((i4 & 32768) != 0) {
            bool4 = bool7;
            z6 = profileState2.needShowProfileCollectionGuide;
        } else {
            bool4 = bool7;
            z6 = z2;
        }
        if ((i4 & 65536) != 0) {
            z7 = z6;
            z8 = profileState2.isAvatarClicked;
        } else {
            z7 = z6;
            z8 = z3;
        }
        if ((i4 & 131072) != 0) {
            z9 = z8;
            z10 = profileState2.isBackgroundCoverClicked;
        } else {
            z9 = z8;
            z10 = z4;
        }
        if ((i4 & 262144) != 0) {
            z11 = z10;
            num2 = profileState2.currentDownloadSetting;
        } else {
            z11 = z10;
            num2 = num;
        }
        if ((i4 & 524288) != 0) {
            num3 = num2;
            z12 = profileState2.onHiddenChanged;
        } else {
            num3 = num2;
            z12 = z5;
        }
        return profileState.copy(str8, str9, user3, aweme2, aVar2, i5, i6, z13, str10, str11, str12, str13, bool5, bool6, bool4, z7, z9, z11, num3, z12, (i4 & 1048576) != 0 ? profileState2.fromSearch : str7);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component10() {
        return this.livePreviousPage;
    }

    public final String component11() {
        return this.from;
    }

    public final String component12() {
        return this.enterFrom;
    }

    public final Boolean component13() {
        return this.isPostGuideShow;
    }

    public final Boolean component14() {
        return this.isPostAwemeEmpty;
    }

    public final Boolean component15() {
        return this.isPostAwemeEmptyWhenPrivateShow;
    }

    public final boolean component16() {
        return this.needShowProfileCollectionGuide;
    }

    public final boolean component17() {
        return this.isAvatarClicked;
    }

    public final boolean component18() {
        return this.isBackgroundCoverClicked;
    }

    public final Integer component19() {
        return this.currentDownloadSetting;
    }

    public final String component2() {
        return this.suid;
    }

    public final boolean component20() {
        return this.onHiddenChanged;
    }

    public final String component21() {
        return this.fromSearch;
    }

    public final User component3() {
        return this.user;
    }

    public final Aweme component4() {
        return this.sourceAweme;
    }

    public final C11787a<C52847n<UrlModel, C12200n>> component5() {
        return this.loadAvatar;
    }

    public final int component6() {
        return this.avatarClickCount;
    }

    public final int component7() {
        return this.curTabType;
    }

    public final boolean component8() {
        return this.userVisibleHint;
    }

    public final String component9() {
        return this.needUpdateAvatarUrl;
    }

    public final ProfileState copy(String str, String str2, User user2, Aweme aweme, C11787a<? extends C52847n<? extends UrlModel, ? extends C12200n>> aVar, int i, int i2, boolean z, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7) {
        String str8 = str2;
        User user3 = user2;
        Aweme aweme2 = aweme;
        C11787a<? extends C52847n<? extends UrlModel, ? extends C12200n>> aVar2 = aVar;
        int i3 = i;
        int i4 = i2;
        boolean z6 = z;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        Boolean bool4 = bool;
        Boolean bool5 = bool2;
        Boolean bool6 = bool3;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        Integer num2 = num;
        boolean z10 = z5;
        String str13 = str7;
        String str14 = str;
        C52711k.m112240b(aVar, "loadAvatar");
        ProfileState profileState = new ProfileState(str14, str8, user3, aweme2, aVar2, i3, i4, z6, str9, str10, str11, str12, bool4, bool5, bool6, z7, z8, z9, num2, z10, str13);
        return profileState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileState) {
                ProfileState profileState = (ProfileState) obj;
                if (C52711k.m112239a((Object) this.uid, (Object) profileState.uid) && C52711k.m112239a((Object) this.suid, (Object) profileState.suid) && C52711k.m112239a((Object) this.user, (Object) profileState.user) && C52711k.m112239a((Object) this.sourceAweme, (Object) profileState.sourceAweme) && C52711k.m112239a((Object) this.loadAvatar, (Object) profileState.loadAvatar)) {
                    if (this.avatarClickCount == profileState.avatarClickCount) {
                        if (this.curTabType == profileState.curTabType) {
                            if ((this.userVisibleHint == profileState.userVisibleHint) && C52711k.m112239a((Object) this.needUpdateAvatarUrl, (Object) profileState.needUpdateAvatarUrl) && C52711k.m112239a((Object) this.livePreviousPage, (Object) profileState.livePreviousPage) && C52711k.m112239a((Object) this.from, (Object) profileState.from) && C52711k.m112239a((Object) this.enterFrom, (Object) profileState.enterFrom) && C52711k.m112239a((Object) this.isPostGuideShow, (Object) profileState.isPostGuideShow) && C52711k.m112239a((Object) this.isPostAwemeEmpty, (Object) profileState.isPostAwemeEmpty) && C52711k.m112239a((Object) this.isPostAwemeEmptyWhenPrivateShow, (Object) profileState.isPostAwemeEmptyWhenPrivateShow)) {
                                if (this.needShowProfileCollectionGuide == profileState.needShowProfileCollectionGuide) {
                                    if (this.isAvatarClicked == profileState.isAvatarClicked) {
                                        if ((this.isBackgroundCoverClicked == profileState.isBackgroundCoverClicked) && C52711k.m112239a((Object) this.currentDownloadSetting, (Object) profileState.currentDownloadSetting)) {
                                            if (!(this.onHiddenChanged == profileState.onHiddenChanged) || !C52711k.m112239a((Object) this.fromSearch, (Object) profileState.fromSearch)) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getAvatarClickCount() {
        return this.avatarClickCount;
    }

    public final int getCurTabType() {
        return this.curTabType;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getFromSearch() {
        return this.fromSearch;
    }

    public final String getLivePreviousPage() {
        return this.livePreviousPage;
    }

    public final C11787a<C52847n<UrlModel, C12200n>> getLoadAvatar() {
        return this.loadAvatar;
    }

    public final boolean getNeedShowProfileCollectionGuide() {
        return this.needShowProfileCollectionGuide;
    }

    public final String getNeedUpdateAvatarUrl() {
        return this.needUpdateAvatarUrl;
    }

    public final boolean getOnHiddenChanged() {
        return this.onHiddenChanged;
    }

    public final Aweme getSourceAweme() {
        return this.sourceAweme;
    }

    public final String getSuid() {
        return this.suid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean getUserVisibleHint() {
        return this.userVisibleHint;
    }

    public final int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.suid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        User user2 = this.user;
        int hashCode3 = (hashCode2 + (user2 != null ? user2.hashCode() : 0)) * 31;
        Aweme aweme = this.sourceAweme;
        int hashCode4 = (hashCode3 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        C11787a<C52847n<UrlModel, C12200n>> aVar = this.loadAvatar;
        int hashCode5 = (((((hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31) + Integer.hashCode(this.avatarClickCount)) * 31) + Integer.hashCode(this.curTabType)) * 31;
        boolean z = this.userVisibleHint;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str3 = this.needUpdateAvatarUrl;
        int hashCode6 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.livePreviousPage;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.from;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.enterFrom;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.isPostGuideShow;
        int hashCode10 = (hashCode9 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isPostAwemeEmpty;
        int hashCode11 = (hashCode10 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.isPostAwemeEmptyWhenPrivateShow;
        int hashCode12 = (hashCode11 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        boolean z2 = this.needShowProfileCollectionGuide;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode12 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.isAvatarClicked;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isBackgroundCoverClicked;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        Integer num = this.currentDownloadSetting;
        int hashCode13 = (i5 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z5 = this.onHiddenChanged;
        if (z5) {
            z5 = true;
        }
        int i6 = (hashCode13 + (z5 ? 1 : 0)) * 31;
        String str7 = this.fromSearch;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i6 + i;
    }

    public final boolean isAvatarClicked() {
        return this.isAvatarClicked;
    }

    public final boolean isBackgroundCoverClicked() {
        return this.isBackgroundCoverClicked;
    }

    public final Boolean isPostAwemeEmpty() {
        return this.isPostAwemeEmpty;
    }

    public final Boolean isPostAwemeEmptyWhenPrivateShow() {
        return this.isPostAwemeEmptyWhenPrivateShow;
    }

    public final Boolean isPostGuideShow() {
        return this.isPostGuideShow;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileState(uid=");
        sb.append(this.uid);
        sb.append(", suid=");
        sb.append(this.suid);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", sourceAweme=");
        sb.append(this.sourceAweme);
        sb.append(", loadAvatar=");
        sb.append(this.loadAvatar);
        sb.append(", avatarClickCount=");
        sb.append(this.avatarClickCount);
        sb.append(", curTabType=");
        sb.append(this.curTabType);
        sb.append(", userVisibleHint=");
        sb.append(this.userVisibleHint);
        sb.append(", needUpdateAvatarUrl=");
        sb.append(this.needUpdateAvatarUrl);
        sb.append(", livePreviousPage=");
        sb.append(this.livePreviousPage);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", isPostGuideShow=");
        sb.append(this.isPostGuideShow);
        sb.append(", isPostAwemeEmpty=");
        sb.append(this.isPostAwemeEmpty);
        sb.append(", isPostAwemeEmptyWhenPrivateShow=");
        sb.append(this.isPostAwemeEmptyWhenPrivateShow);
        sb.append(", needShowProfileCollectionGuide=");
        sb.append(this.needShowProfileCollectionGuide);
        sb.append(", isAvatarClicked=");
        sb.append(this.isAvatarClicked);
        sb.append(", isBackgroundCoverClicked=");
        sb.append(this.isBackgroundCoverClicked);
        sb.append(", currentDownloadSetting=");
        sb.append(this.currentDownloadSetting);
        sb.append(", onHiddenChanged=");
        sb.append(this.onHiddenChanged);
        sb.append(", fromSearch=");
        sb.append(this.fromSearch);
        sb.append(")");
        return sb.toString();
    }

    public ProfileState(String str, String str2, User user2, Aweme aweme, C11787a<? extends C52847n<? extends UrlModel, ? extends C12200n>> aVar, int i, int i2, boolean z, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7) {
        C11787a<? extends C52847n<? extends UrlModel, ? extends C12200n>> aVar2 = aVar;
        C52711k.m112240b(aVar, "loadAvatar");
        this.uid = str;
        this.suid = str2;
        this.user = user2;
        this.sourceAweme = aweme;
        this.loadAvatar = aVar2;
        this.avatarClickCount = i;
        this.curTabType = i2;
        this.userVisibleHint = z;
        this.needUpdateAvatarUrl = str3;
        this.livePreviousPage = str4;
        this.from = str5;
        this.enterFrom = str6;
        this.isPostGuideShow = bool;
        this.isPostAwemeEmpty = bool2;
        this.isPostAwemeEmptyWhenPrivateShow = bool3;
        this.needShowProfileCollectionGuide = z2;
        this.isAvatarClicked = z3;
        this.isBackgroundCoverClicked = z4;
        this.currentDownloadSetting = num;
        this.onHiddenChanged = z5;
        this.fromSearch = str7;
    }

    public /* synthetic */ ProfileState(String str, String str2, User user2, Aweme aweme, C11787a aVar, int i, int i2, boolean z, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7, int i3, C52707g gVar) {
        String str8;
        String str9;
        User user3;
        Aweme aweme2;
        C11787a aVar2;
        int i4;
        int i5;
        boolean z6;
        String str10;
        String str11;
        String str12;
        String str13;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        boolean z7;
        boolean z8;
        boolean z9;
        Integer num2;
        boolean z10;
        String str14;
        int i6 = i3;
        if ((i6 & 1) != 0) {
            str8 = null;
        } else {
            str8 = str;
        }
        if ((i6 & 2) != 0) {
            str9 = null;
        } else {
            str9 = str2;
        }
        if ((i6 & 4) != 0) {
            user3 = null;
        } else {
            user3 = user2;
        }
        if ((i6 & 8) != 0) {
            aweme2 = null;
        } else {
            aweme2 = aweme;
        }
        if ((i6 & 16) != 0) {
            aVar2 = C11790ac.f31299a;
        } else {
            aVar2 = aVar;
        }
        if ((i6 & 32) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i6 & 64) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i6 & 128) != 0) {
            z6 = true;
        } else {
            z6 = z;
        }
        if ((i6 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            str10 = null;
        } else {
            str10 = str3;
        }
        if ((i6 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            str11 = "";
        } else {
            str11 = str4;
        }
        if ((i6 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            str12 = "";
        } else {
            str12 = str5;
        }
        if ((i6 & 2048) != 0) {
            str13 = "";
        } else {
            str13 = str6;
        }
        if ((i6 & 4096) != 0) {
            bool4 = null;
        } else {
            bool4 = bool;
        }
        if ((i6 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            bool5 = null;
        } else {
            bool5 = bool2;
        }
        if ((i6 & 16384) != 0) {
            bool6 = null;
        } else {
            bool6 = bool3;
        }
        if ((i6 & 32768) != 0) {
            z7 = false;
        } else {
            z7 = z2;
        }
        if ((i6 & 65536) != 0) {
            z8 = false;
        } else {
            z8 = z3;
        }
        if ((i6 & 131072) != 0) {
            z9 = false;
        } else {
            z9 = z4;
        }
        if ((i6 & 262144) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i6 & 524288) != 0) {
            z10 = false;
        } else {
            z10 = z5;
        }
        if ((i6 & 1048576) != 0) {
            str14 = "";
        } else {
            str14 = str7;
        }
        this(str8, str9, user3, aweme2, aVar2, i4, i5, z6, str10, str11, str12, str13, bool4, bool5, bool6, z7, z8, z9, num2, z10, str14);
    }
}
