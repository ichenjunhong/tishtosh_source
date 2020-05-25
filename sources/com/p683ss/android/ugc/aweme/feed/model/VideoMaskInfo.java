package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoMaskInfo */
public final class VideoMaskInfo implements Serializable {
    @C17952c(mo34828a = "cancel_mask_label")
    public String cancelMaskLabel;
    @C17952c(mo34828a = "content")
    public String content;
    @C17952c(mo34828a = "mask_type")
    public Integer maskType;
    @C17952c(mo34828a = "show_mask")
    public Boolean showMask;
    @C17952c(mo34828a = "status")
    public Integer status;
    @C17952c(mo34828a = "title")
    public String title;

    public VideoMaskInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ VideoMaskInfo copy$default(VideoMaskInfo videoMaskInfo, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = videoMaskInfo.showMask;
        }
        if ((i & 2) != 0) {
            num = videoMaskInfo.maskType;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            num2 = videoMaskInfo.status;
        }
        Integer num4 = num2;
        if ((i & 8) != 0) {
            str = videoMaskInfo.title;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = videoMaskInfo.content;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = videoMaskInfo.cancelMaskLabel;
        }
        return videoMaskInfo.copy(bool, num3, num4, str4, str5, str3);
    }

    public final Boolean component1() {
        return this.showMask;
    }

    public final Integer component2() {
        return this.maskType;
    }

    public final Integer component3() {
        return this.status;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.content;
    }

    public final String component6() {
        return this.cancelMaskLabel;
    }

    public final VideoMaskInfo copy(Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        VideoMaskInfo videoMaskInfo = new VideoMaskInfo(bool, num, num2, str, str2, str3);
        return videoMaskInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.cancelMaskLabel, (java.lang.Object) r3.cancelMaskLabel) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feed.model.VideoMaskInfo
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.feed.model.VideoMaskInfo r3 = (com.p683ss.android.ugc.aweme.feed.model.VideoMaskInfo) r3
            java.lang.Boolean r0 = r2.showMask
            java.lang.Boolean r1 = r3.showMask
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r0 = r2.maskType
            java.lang.Integer r1 = r3.maskType
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r0 = r2.status
            java.lang.Integer r1 = r3.status
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.content
            java.lang.String r1 = r3.content
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.cancelMaskLabel
            java.lang.String r3 = r3.cancelMaskLabel
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.model.VideoMaskInfo.equals(java.lang.Object):boolean");
    }

    public final String getCancelMaskLabel() {
        return this.cancelMaskLabel;
    }

    public final String getContent() {
        return this.content;
    }

    public final Integer getMaskType() {
        return this.maskType;
    }

    public final Boolean getShowMask() {
        return this.showMask;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        Boolean bool = this.showMask;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.maskType;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.status;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.title;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.content;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cancelMaskLabel;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMaskInfo(showMask=");
        sb.append(this.showMask);
        sb.append(", maskType=");
        sb.append(this.maskType);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", cancelMaskLabel=");
        sb.append(this.cancelMaskLabel);
        sb.append(")");
        return sb.toString();
    }

    public VideoMaskInfo(Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        this.showMask = bool;
        this.maskType = num;
        this.status = num2;
        this.title = str;
        this.content = str2;
        this.cancelMaskLabel = str3;
    }

    public /* synthetic */ VideoMaskInfo(Boolean bool, Integer num, Integer num2, String str, String str2, String str3, int i, C52707g gVar) {
        Integer num3;
        if ((i & 1) != 0) {
            bool = Boolean.valueOf(false);
        }
        Integer num4 = null;
        if ((i & 2) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 4) == 0) {
            num4 = num2;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = "";
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = "";
        }
        this(bool, num3, num4, str4, str5, str3);
    }
}
