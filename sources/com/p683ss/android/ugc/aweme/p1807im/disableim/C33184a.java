package com.p683ss.android.ugc.aweme.p1807im.disableim;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.disableim.a */
public final class C33184a {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    public final int f86165a;
    @C17952c(mo34828a = "status_msg")

    /* renamed from: b */
    public final String f86166b;
    @C17952c(mo34828a = "show_msg_disappear_alert")

    /* renamed from: c */
    public final boolean f86167c;
    @C17952c(mo34828a = "is_chat_function_off")

    /* renamed from: d */
    public final boolean f86168d;
    @C17952c(mo34828a = "download_data_page_url")

    /* renamed from: e */
    public final String f86169e;
    @C17952c(mo34828a = "msg_disappear_page_url")

    /* renamed from: f */
    public final String f86170f;
    @C17952c(mo34828a = "alert_title")

    /* renamed from: g */
    public final String f86171g;
    @C17952c(mo34828a = "alert_content")

    /* renamed from: h */
    public final String f86172h;
    @C17952c(mo34828a = "chat_cell_title")

    /* renamed from: i */
    public final String f86173i;
    @C17952c(mo34828a = "chat_cell_content")

    /* renamed from: j */
    public final String f86174j;
    @C17952c(mo34828a = "show_msg_privacy_entrance")

    /* renamed from: k */
    public final boolean f86175k;
    @C17952c(mo34828a = "show_msg_disappear_chat_cell")

    /* renamed from: l */
    public final boolean f86176l;
    @C17952c(mo34828a = "redirect_to_msg_disappear_page")

    /* renamed from: m */
    public final boolean f86177m;
    @C17952c(mo34828a = "clear_im_chatlist")

    /* renamed from: n */
    public final boolean f86178n;
    @C17952c(mo34828a = "msg_disappear_chat_cell_server_time")

    /* renamed from: o */
    public final long f86179o;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33184a) {
                C33184a aVar = (C33184a) obj;
                if ((this.f86165a == aVar.f86165a) && C52711k.m112239a((Object) this.f86166b, (Object) aVar.f86166b)) {
                    if (this.f86167c == aVar.f86167c) {
                        if ((this.f86168d == aVar.f86168d) && C52711k.m112239a((Object) this.f86169e, (Object) aVar.f86169e) && C52711k.m112239a((Object) this.f86170f, (Object) aVar.f86170f) && C52711k.m112239a((Object) this.f86171g, (Object) aVar.f86171g) && C52711k.m112239a((Object) this.f86172h, (Object) aVar.f86172h) && C52711k.m112239a((Object) this.f86173i, (Object) aVar.f86173i) && C52711k.m112239a((Object) this.f86174j, (Object) aVar.f86174j)) {
                            if (this.f86175k == aVar.f86175k) {
                                if (this.f86176l == aVar.f86176l) {
                                    if (this.f86177m == aVar.f86177m) {
                                        if (this.f86178n == aVar.f86178n) {
                                            if (this.f86179o == aVar.f86179o) {
                                                return true;
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

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f86165a) * 31;
        String str = this.f86166b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f86167c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f86168d;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str2 = this.f86169e;
        int hashCode3 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86170f;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f86171g;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f86172h;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f86173i;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f86174j;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i4 = (hashCode7 + i) * 31;
        boolean z3 = this.f86175k;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f86176l;
        if (z4) {
            z4 = true;
        }
        int i6 = (i5 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f86177m;
        if (z5) {
            z5 = true;
        }
        int i7 = (i6 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f86178n;
        if (z6) {
            z6 = true;
        }
        return ((i7 + (z6 ? 1 : 0)) * 31) + Long.hashCode(this.f86179o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisableChatUnder16Resp(statusCode=");
        sb.append(this.f86165a);
        sb.append(", statusMsg=");
        sb.append(this.f86166b);
        sb.append(", isShowAlert=");
        sb.append(this.f86167c);
        sb.append(", isChatFucOffLine=");
        sb.append(this.f86168d);
        sb.append(", downloadDataPageUrl=");
        sb.append(this.f86169e);
        sb.append(", msgTipsUrl=");
        sb.append(this.f86170f);
        sb.append(", alertTitle=");
        sb.append(this.f86171g);
        sb.append(", alertContent=");
        sb.append(this.f86172h);
        sb.append(", alertChatCellTitle=");
        sb.append(this.f86173i);
        sb.append(", alertChatCellContent=");
        sb.append(this.f86174j);
        sb.append(", isShowChatPrivacySetting=");
        sb.append(this.f86175k);
        sb.append(", isShowMsgTipsChatCell=");
        sb.append(this.f86176l);
        sb.append(", isRedirectToDisappearPage=");
        sb.append(this.f86177m);
        sb.append(", isClearImChatList=");
        sb.append(this.f86178n);
        sb.append(", msgDisappearChatCellShowServerTime=");
        sb.append(this.f86179o);
        sb.append(")");
        return sb.toString();
    }
}
