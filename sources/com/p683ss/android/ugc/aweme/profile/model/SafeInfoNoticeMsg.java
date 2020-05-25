package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg */
public final class SafeInfoNoticeMsg {
    @C17952c(mo34828a = "args")
    public final SafeInfoNoticeMsgArgs args;
    @C17952c(mo34828a = "has_notice")
    public final boolean has_notice;
    @C17952c(mo34828a = "highlight")
    public final List<SafeInfoNoticeMsgHighlight> highlight;
    @C17952c(mo34828a = "notice")
    public final String notice;
    @C17952c(mo34828a = "notice_id")
    public final Long noticeId;
    @C17952c(mo34828a = "notice_model")
    public final String noticeModel;
    @C17952c(mo34828a = "notice_tag")
    public final String noticeTag;
    @C17952c(mo34828a = "notice_type")
    public final String noticeType;
    @C17952c(mo34828a = "scheme")
    public final String scheme;

    public static /* synthetic */ SafeInfoNoticeMsg copy$default(SafeInfoNoticeMsg safeInfoNoticeMsg, String str, SafeInfoNoticeMsgArgs safeInfoNoticeMsgArgs, List list, boolean z, Long l, String str2, String str3, String str4, String str5, int i, Object obj) {
        SafeInfoNoticeMsg safeInfoNoticeMsg2 = safeInfoNoticeMsg;
        int i2 = i;
        return safeInfoNoticeMsg.copy((i2 & 1) != 0 ? safeInfoNoticeMsg2.notice : str, (i2 & 2) != 0 ? safeInfoNoticeMsg2.args : safeInfoNoticeMsgArgs, (i2 & 4) != 0 ? safeInfoNoticeMsg2.highlight : list, (i2 & 8) != 0 ? safeInfoNoticeMsg2.has_notice : z, (i2 & 16) != 0 ? safeInfoNoticeMsg2.noticeId : l, (i2 & 32) != 0 ? safeInfoNoticeMsg2.noticeType : str2, (i2 & 64) != 0 ? safeInfoNoticeMsg2.scheme : str3, (i2 & 128) != 0 ? safeInfoNoticeMsg2.noticeModel : str4, (i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? safeInfoNoticeMsg2.noticeTag : str5);
    }

    public final SafeInfoNoticeMsg copy(String str, SafeInfoNoticeMsgArgs safeInfoNoticeMsgArgs, List<SafeInfoNoticeMsgHighlight> list, boolean z, Long l, String str2, String str3, String str4, String str5) {
        SafeInfoNoticeMsg safeInfoNoticeMsg = new SafeInfoNoticeMsg(str, safeInfoNoticeMsgArgs, list, z, l, str2, str3, str4, str5);
        return safeInfoNoticeMsg;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SafeInfoNoticeMsg) {
                SafeInfoNoticeMsg safeInfoNoticeMsg = (SafeInfoNoticeMsg) obj;
                if (C52711k.m112239a((Object) this.notice, (Object) safeInfoNoticeMsg.notice) && C52711k.m112239a((Object) this.args, (Object) safeInfoNoticeMsg.args) && C52711k.m112239a((Object) this.highlight, (Object) safeInfoNoticeMsg.highlight)) {
                    if (!(this.has_notice == safeInfoNoticeMsg.has_notice) || !C52711k.m112239a((Object) this.noticeId, (Object) safeInfoNoticeMsg.noticeId) || !C52711k.m112239a((Object) this.noticeType, (Object) safeInfoNoticeMsg.noticeType) || !C52711k.m112239a((Object) this.scheme, (Object) safeInfoNoticeMsg.scheme) || !C52711k.m112239a((Object) this.noticeModel, (Object) safeInfoNoticeMsg.noticeModel) || !C52711k.m112239a((Object) this.noticeTag, (Object) safeInfoNoticeMsg.noticeTag)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.notice;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        SafeInfoNoticeMsgArgs safeInfoNoticeMsgArgs = this.args;
        int hashCode2 = (hashCode + (safeInfoNoticeMsgArgs != null ? safeInfoNoticeMsgArgs.hashCode() : 0)) * 31;
        List<SafeInfoNoticeMsgHighlight> list = this.highlight;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.has_notice;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        Long l = this.noticeId;
        int hashCode4 = (i2 + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.noticeType;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.scheme;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.noticeModel;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.noticeTag;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeMsg(notice=");
        sb.append(this.notice);
        sb.append(", args=");
        sb.append(this.args);
        sb.append(", highlight=");
        sb.append(this.highlight);
        sb.append(", has_notice=");
        sb.append(this.has_notice);
        sb.append(", noticeId=");
        sb.append(this.noticeId);
        sb.append(", noticeType=");
        sb.append(this.noticeType);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(", noticeModel=");
        sb.append(this.noticeModel);
        sb.append(", noticeTag=");
        sb.append(this.noticeTag);
        sb.append(")");
        return sb.toString();
    }

    public SafeInfoNoticeMsg(String str, SafeInfoNoticeMsgArgs safeInfoNoticeMsgArgs, List<SafeInfoNoticeMsgHighlight> list, boolean z, Long l, String str2, String str3, String str4, String str5) {
        this.notice = str;
        this.args = safeInfoNoticeMsgArgs;
        this.highlight = list;
        this.has_notice = z;
        this.noticeId = l;
        this.noticeType = str2;
        this.scheme = str3;
        this.noticeModel = str4;
        this.noticeTag = str5;
    }
}
