package com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.b */
public final class C34767b {

    /* renamed from: a */
    public final int f89544a;

    /* renamed from: b */
    public final Integer f89545b;

    /* renamed from: c */
    public final String f89546c;

    /* renamed from: d */
    public final Integer f89547d;

    /* renamed from: e */
    public final UrlModel f89548e;

    /* renamed from: f */
    public final String f89549f;

    /* renamed from: g */
    public final String f89550g;

    /* renamed from: h */
    public final String f89551h;

    /* renamed from: i */
    public final Long f89552i;

    /* renamed from: j */
    public final Integer f89553j;

    /* renamed from: k */
    public final boolean f89554k;

    public C34767b() {
        this(0, null, null, null, null, null, null, null, null, null, false, 2047, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34767b) {
                C34767b bVar = (C34767b) obj;
                if ((this.f89544a == bVar.f89544a) && C52711k.m112239a((Object) this.f89545b, (Object) bVar.f89545b) && C52711k.m112239a((Object) this.f89546c, (Object) bVar.f89546c) && C52711k.m112239a((Object) this.f89547d, (Object) bVar.f89547d) && C52711k.m112239a((Object) this.f89548e, (Object) bVar.f89548e) && C52711k.m112239a((Object) this.f89549f, (Object) bVar.f89549f) && C52711k.m112239a((Object) this.f89550g, (Object) bVar.f89550g) && C52711k.m112239a((Object) this.f89551h, (Object) bVar.f89551h) && C52711k.m112239a((Object) this.f89552i, (Object) bVar.f89552i) && C52711k.m112239a((Object) this.f89553j, (Object) bVar.f89553j)) {
                    if (this.f89554k == bVar.f89554k) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f89544a * 31;
        Integer num = this.f89545b;
        int i2 = 0;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f89546c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f89547d;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f89548e;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.f89549f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f89550g;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f89551h;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.f89552i;
        int hashCode8 = (hashCode7 + (l != null ? l.hashCode() : 0)) * 31;
        Integer num3 = this.f89553j;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        int i3 = (hashCode8 + i2) * 31;
        boolean z = this.f89554k;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationContent(type=");
        sb.append(this.f89544a);
        sb.append(", conversationType=");
        sb.append(this.f89545b);
        sb.append(", conversationId=");
        sb.append(this.f89546c);
        sb.append(", messageType=");
        sb.append(this.f89547d);
        sb.append(", avatar=");
        sb.append(this.f89548e);
        sb.append(", name=");
        sb.append(this.f89549f);
        sb.append(", description=");
        sb.append(this.f89550g);
        sb.append(", schema=");
        sb.append(this.f89551h);
        sb.append(", anchorId=");
        sb.append(this.f89552i);
        sb.append(", anchorType=");
        sb.append(this.f89553j);
        sb.append(", isAssemble=");
        sb.append(this.f89554k);
        sb.append(")");
        return sb.toString();
    }

    private C34767b(int i, Integer num, String str, Integer num2, UrlModel urlModel, String str2, String str3, String str4, Long l, Integer num3, boolean z) {
        this.f89544a = i;
        this.f89545b = num;
        this.f89546c = str;
        this.f89547d = num2;
        this.f89548e = urlModel;
        this.f89549f = str2;
        this.f89550g = str3;
        this.f89551h = str4;
        this.f89552i = l;
        this.f89553j = num3;
        this.f89554k = z;
    }

    public /* synthetic */ C34767b(int i, Integer num, String str, Integer num2, UrlModel urlModel, String str2, String str3, String str4, Long l, Integer num3, boolean z, int i2, C52707g gVar) {
        int i3;
        Integer num4;
        String str5;
        Integer num5;
        UrlModel urlModel2;
        String str6;
        String str7;
        String str8;
        Long l2;
        int i4 = i2;
        boolean z2 = false;
        if ((i4 & 1) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        Integer num6 = null;
        if ((i4 & 2) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i4 & 4) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i4 & 8) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i4 & 16) != 0) {
            urlModel2 = null;
        } else {
            urlModel2 = urlModel;
        }
        if ((i4 & 32) != 0) {
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i4 & 64) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i4 & 128) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i4 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i4 & UnReadVideoExperiment.LIKE_USER_LIST) == 0) {
            num6 = num3;
        }
        if ((i4 & PreloadTask.BYTE_UNIT_NUMBER) == 0) {
            z2 = z;
        }
        this(i3, num4, str5, num5, urlModel2, str6, str7, str8, l2, num6, z2);
    }
}
