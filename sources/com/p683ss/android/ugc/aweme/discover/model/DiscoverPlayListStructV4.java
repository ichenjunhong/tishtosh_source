package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 */
public final class DiscoverPlayListStructV4 {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "aweme_list")
    public final List<Aweme> awemes;
    public BannerList bannerList;
    @C17952c(mo34828a = "cell_id")
    public final String cellID;
    @C17952c(mo34828a = "creator")
    public final User creator;
    @C17952c(mo34828a = "effect")
    public final C46069d effect;
    public LogPbBean logPb;
    @C17952c(mo34828a = "sound")
    public final Music music;
    @C17952c(mo34828a = "recommend_reason")
    public final String reason;
    @C17952c(mo34828a = "ref_url")
    public final String refUrl;
    public final int spanSize;
    @C17952c(mo34828a = "title")
    public final String title;
    @C17952c(mo34828a = "type")
    public final int type;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final String getPlayListType(int i) {
            switch (i) {
                case 0:
                    return "tag";
                case 1:
                    return "theme";
                case 3:
                    return "creator";
                case 4:
                    return "effect";
                case 5:
                    return "sound";
                default:
                    return "video";
            }
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public DiscoverPlayListStructV4() {
        this(null, null, 0, null, null, null, null, null, null, null, null, 0, 4095, null);
    }

    public static /* synthetic */ DiscoverPlayListStructV4 copy$default(DiscoverPlayListStructV4 discoverPlayListStructV4, String str, String str2, int i, List list, String str3, String str4, User user, C46069d dVar, Music music2, BannerList bannerList2, LogPbBean logPbBean, int i2, int i3, Object obj) {
        DiscoverPlayListStructV4 discoverPlayListStructV42 = discoverPlayListStructV4;
        int i4 = i3;
        return discoverPlayListStructV4.copy((i4 & 1) != 0 ? discoverPlayListStructV42.cellID : str, (i4 & 2) != 0 ? discoverPlayListStructV42.title : str2, (i4 & 4) != 0 ? discoverPlayListStructV42.type : i, (i4 & 8) != 0 ? discoverPlayListStructV42.awemes : list, (i4 & 16) != 0 ? discoverPlayListStructV42.refUrl : str3, (i4 & 32) != 0 ? discoverPlayListStructV42.reason : str4, (i4 & 64) != 0 ? discoverPlayListStructV42.creator : user, (i4 & 128) != 0 ? discoverPlayListStructV42.effect : dVar, (i4 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? discoverPlayListStructV42.music : music2, (i4 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? discoverPlayListStructV42.bannerList : bannerList2, (i4 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? discoverPlayListStructV42.logPb : logPbBean, (i4 & 2048) != 0 ? discoverPlayListStructV42.spanSize : i2);
    }

    public final DiscoverPlayListStructV4 copy(String str, String str2, int i, List<? extends Aweme> list, String str3, String str4, User user, C46069d dVar, Music music2, BannerList bannerList2, LogPbBean logPbBean, int i2) {
        String str5 = str4;
        C52711k.m112240b(str5, "reason");
        DiscoverPlayListStructV4 discoverPlayListStructV4 = new DiscoverPlayListStructV4(str, str2, i, list, str3, str5, user, dVar, music2, bannerList2, logPbBean, i2);
        return discoverPlayListStructV4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverPlayListStructV4) {
                DiscoverPlayListStructV4 discoverPlayListStructV4 = (DiscoverPlayListStructV4) obj;
                if (C52711k.m112239a((Object) this.cellID, (Object) discoverPlayListStructV4.cellID) && C52711k.m112239a((Object) this.title, (Object) discoverPlayListStructV4.title)) {
                    if ((this.type == discoverPlayListStructV4.type) && C52711k.m112239a((Object) this.awemes, (Object) discoverPlayListStructV4.awemes) && C52711k.m112239a((Object) this.refUrl, (Object) discoverPlayListStructV4.refUrl) && C52711k.m112239a((Object) this.reason, (Object) discoverPlayListStructV4.reason) && C52711k.m112239a((Object) this.creator, (Object) discoverPlayListStructV4.creator) && C52711k.m112239a((Object) this.effect, (Object) discoverPlayListStructV4.effect) && C52711k.m112239a((Object) this.music, (Object) discoverPlayListStructV4.music) && C52711k.m112239a((Object) this.bannerList, (Object) discoverPlayListStructV4.bannerList) && C52711k.m112239a((Object) this.logPb, (Object) discoverPlayListStructV4.logPb)) {
                        if (this.spanSize == discoverPlayListStructV4.spanSize) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.cellID;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31;
        List<Aweme> list = this.awemes;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.refUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.reason;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        User user = this.creator;
        int hashCode6 = (hashCode5 + (user != null ? user.hashCode() : 0)) * 31;
        C46069d dVar = this.effect;
        int hashCode7 = (hashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Music music2 = this.music;
        int hashCode8 = (hashCode7 + (music2 != null ? music2.hashCode() : 0)) * 31;
        BannerList bannerList2 = this.bannerList;
        int hashCode9 = (hashCode8 + (bannerList2 != null ? bannerList2.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return ((hashCode9 + i) * 31) + Integer.hashCode(this.spanSize);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverPlayListStructV4(cellID=");
        sb.append(this.cellID);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", awemes=");
        sb.append(this.awemes);
        sb.append(", refUrl=");
        sb.append(this.refUrl);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", creator=");
        sb.append(this.creator);
        sb.append(", effect=");
        sb.append(this.effect);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", bannerList=");
        sb.append(this.bannerList);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(", spanSize=");
        sb.append(this.spanSize);
        sb.append(")");
        return sb.toString();
    }

    public final String playListType() {
        switch (this.type) {
            case 0:
                return "tag";
            case 1:
                return "theme";
            case 3:
                return "creator";
            case 4:
                return "effect";
            case 5:
                return "music";
            default:
                return "video";
        }
    }

    public DiscoverPlayListStructV4(String str, String str2, int i, List<? extends Aweme> list, String str3, String str4, User user, C46069d dVar, Music music2, BannerList bannerList2, LogPbBean logPbBean, int i2) {
        C52711k.m112240b(str4, "reason");
        this.cellID = str;
        this.title = str2;
        this.type = i;
        this.awemes = list;
        this.refUrl = str3;
        this.reason = str4;
        this.creator = user;
        this.effect = dVar;
        this.music = music2;
        this.bannerList = bannerList2;
        this.logPb = logPbBean;
        this.spanSize = i2;
    }

    public /* synthetic */ DiscoverPlayListStructV4(String str, String str2, int i, List list, String str3, String str4, User user, C46069d dVar, Music music2, BannerList bannerList2, LogPbBean logPbBean, int i2, int i3, C52707g gVar) {
        String str5;
        String str6;
        int i4;
        List list2;
        String str7;
        String str8;
        User user2;
        C46069d dVar2;
        Music music3;
        BannerList bannerList3;
        int i5;
        int i6 = i3;
        if ((i6 & 1) != 0) {
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i6 & 2) != 0) {
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        LogPbBean logPbBean2 = null;
        if ((i6 & 8) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i6 & 16) != 0) {
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i6 & 32) != 0) {
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i6 & 64) != 0) {
            user2 = null;
        } else {
            user2 = user;
        }
        if ((i6 & 128) != 0) {
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        if ((i6 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            music3 = null;
        } else {
            music3 = music2;
        }
        if ((i6 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            bannerList3 = null;
        } else {
            bannerList3 = bannerList2;
        }
        if ((i6 & PreloadTask.BYTE_UNIT_NUMBER) == 0) {
            logPbBean2 = logPbBean;
        }
        if ((i6 & 2048) != 0) {
            i5 = 1;
        } else {
            i5 = i2;
        }
        this(str5, str6, i4, list2, str7, str8, user2, dVar2, music3, bannerList3, logPbBean2, i5);
    }
}
