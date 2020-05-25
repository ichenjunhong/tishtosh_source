package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 */
public final class DiscoveryCellStructV3 {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "aweme_list")
    public final List<Aweme> awemes;
    @C17952c(mo34828a = "cell_id")
    public final String cellID;
    public int columnIdx;
    public int displayHeight;
    public int displayWidth;
    public int idx;
    public LogPbBean logPb;
    @C17952c(mo34828a = "ref_url")
    public final String refUrl;
    @C17952c(mo34828a = "title")
    public final String title;
    @C17952c(mo34828a = "type")
    public final int type;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final String getPlayListType(int i) {
            switch (i) {
                case 0:
                    return "tag";
                case 1:
                    return "music";
                case 2:
                    return "theme";
                case 4:
                    return "normal_playlist";
                case 5:
                    return "sponsored";
                default:
                    return "video";
            }
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public static /* synthetic */ DiscoveryCellStructV3 copy$default(DiscoveryCellStructV3 discoveryCellStructV3, String str, String str2, int i, List list, String str3, int i2, int i3, int i4, int i5, LogPbBean logPbBean, int i6, Object obj) {
        DiscoveryCellStructV3 discoveryCellStructV32 = discoveryCellStructV3;
        int i7 = i6;
        return discoveryCellStructV3.copy((i7 & 1) != 0 ? discoveryCellStructV32.cellID : str, (i7 & 2) != 0 ? discoveryCellStructV32.title : str2, (i7 & 4) != 0 ? discoveryCellStructV32.type : i, (i7 & 8) != 0 ? discoveryCellStructV32.awemes : list, (i7 & 16) != 0 ? discoveryCellStructV32.refUrl : str3, (i7 & 32) != 0 ? discoveryCellStructV32.displayWidth : i2, (i7 & 64) != 0 ? discoveryCellStructV32.displayHeight : i3, (i7 & 128) != 0 ? discoveryCellStructV32.columnIdx : i4, (i7 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? discoveryCellStructV32.idx : i5, (i7 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? discoveryCellStructV32.logPb : logPbBean);
    }

    public final DiscoveryCellStructV3 copy(String str, String str2, int i, List<? extends Aweme> list, String str3, int i2, int i3, int i4, int i5, LogPbBean logPbBean) {
        String str4 = str;
        C52711k.m112240b(str, "cellID");
        DiscoveryCellStructV3 discoveryCellStructV3 = new DiscoveryCellStructV3(str4, str2, i, list, str3, i2, i3, i4, i5, logPbBean);
        return discoveryCellStructV3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoveryCellStructV3) {
                DiscoveryCellStructV3 discoveryCellStructV3 = (DiscoveryCellStructV3) obj;
                if (C52711k.m112239a((Object) this.cellID, (Object) discoveryCellStructV3.cellID) && C52711k.m112239a((Object) this.title, (Object) discoveryCellStructV3.title)) {
                    if ((this.type == discoveryCellStructV3.type) && C52711k.m112239a((Object) this.awemes, (Object) discoveryCellStructV3.awemes) && C52711k.m112239a((Object) this.refUrl, (Object) discoveryCellStructV3.refUrl)) {
                        if (this.displayWidth == discoveryCellStructV3.displayWidth) {
                            if (this.displayHeight == discoveryCellStructV3.displayHeight) {
                                if (this.columnIdx == discoveryCellStructV3.columnIdx) {
                                    if (!(this.idx == discoveryCellStructV3.idx) || !C52711k.m112239a((Object) this.logPb, (Object) discoveryCellStructV3.logPb)) {
                                        return false;
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

    public final int hashCode() {
        String str = this.cellID;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31;
        List<Aweme> list = this.awemes;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.refUrl;
        int hashCode4 = (((((((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.displayWidth)) * 31) + Integer.hashCode(this.displayHeight)) * 31) + Integer.hashCode(this.columnIdx)) * 31) + Integer.hashCode(this.idx)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryCellStructV3(cellID=");
        sb.append(this.cellID);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", awemes=");
        sb.append(this.awemes);
        sb.append(", refUrl=");
        sb.append(this.refUrl);
        sb.append(", displayWidth=");
        sb.append(this.displayWidth);
        sb.append(", displayHeight=");
        sb.append(this.displayHeight);
        sb.append(", columnIdx=");
        sb.append(this.columnIdx);
        sb.append(", idx=");
        sb.append(this.idx);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(")");
        return sb.toString();
    }

    public final String getPlayListType() {
        return Companion.getPlayListType(this.type);
    }

    public DiscoveryCellStructV3(String str, Aweme aweme, int i) {
        String str2 = str;
        C52711k.m112240b(str, "cellID");
        C52711k.m112240b(aweme, "aweme");
        this(str2, "", 0, C52575l.m112092a(aweme), "", 0, 0, 0, i, null, UnReadVideoExperiment.LIKE_USER_LIST, null);
    }

    public DiscoveryCellStructV3(String str, String str2, int i, List<? extends Aweme> list, String str3, int i2, int i3, int i4, int i5, LogPbBean logPbBean) {
        C52711k.m112240b(str, "cellID");
        this.cellID = str;
        this.title = str2;
        this.type = i;
        this.awemes = list;
        this.refUrl = str3;
        this.displayWidth = i2;
        this.displayHeight = i3;
        this.columnIdx = i4;
        this.idx = i5;
        this.logPb = logPbBean;
    }

    public /* synthetic */ DiscoveryCellStructV3(String str, String str2, int i, List list, String str3, int i2, int i3, int i4, int i5, LogPbBean logPbBean, int i6, C52707g gVar) {
        int i7;
        LogPbBean logPbBean2;
        int i8 = i6;
        if ((i8 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            i7 = -1;
        } else {
            i7 = i5;
        }
        if ((i8 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            logPbBean2 = null;
        } else {
            logPbBean2 = logPbBean;
        }
        this(str, str2, i, list, str3, i2, i3, i4, i7, logPbBean2);
    }
}
