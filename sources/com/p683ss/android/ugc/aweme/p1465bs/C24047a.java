package com.p683ss.android.ugc.aweme.p1465bs;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bs.a */
public final class C24047a {
    @C17952c(mo34828a = "dialog_id")

    /* renamed from: a */
    public int f63822a;
    @C17952c(mo34828a = "title")

    /* renamed from: b */
    public String f63823b;
    @C17952c(mo34828a = "question")

    /* renamed from: c */
    public String f63824c;
    @C17952c(mo34828a = "answer1")

    /* renamed from: d */
    public String f63825d;
    @C17952c(mo34828a = "answer2")

    /* renamed from: e */
    public String f63826e;
    @C17952c(mo34828a = "end_title")

    /* renamed from: f */
    public String f63827f;
    @C17952c(mo34828a = "end_sub_title")

    /* renamed from: g */
    public String f63828g;
    @C17952c(mo34828a = "orig_question")

    /* renamed from: h */
    public String f63829h;
    @C17952c(mo34828a = "original_id")

    /* renamed from: i */
    public int f63830i;
    @C17952c(mo34828a = "orig_answer1")

    /* renamed from: j */
    public String f63831j;
    @C17952c(mo34828a = "orig_answer2")

    /* renamed from: k */
    public String f63832k;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24047a) {
                C24047a aVar = (C24047a) obj;
                if ((this.f63822a == aVar.f63822a) && C52711k.m112239a((Object) this.f63823b, (Object) aVar.f63823b) && C52711k.m112239a((Object) this.f63824c, (Object) aVar.f63824c) && C52711k.m112239a((Object) this.f63825d, (Object) aVar.f63825d) && C52711k.m112239a((Object) this.f63826e, (Object) aVar.f63826e) && C52711k.m112239a((Object) this.f63827f, (Object) aVar.f63827f) && C52711k.m112239a((Object) this.f63828g, (Object) aVar.f63828g) && C52711k.m112239a((Object) this.f63829h, (Object) aVar.f63829h)) {
                    if (!(this.f63830i == aVar.f63830i) || !C52711k.m112239a((Object) this.f63831j, (Object) aVar.f63831j) || !C52711k.m112239a((Object) this.f63832k, (Object) aVar.f63832k)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f63822a) * 31;
        String str = this.f63823b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f63824c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f63825d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f63826e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f63827f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f63828g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f63829h;
        int hashCode8 = (((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + Integer.hashCode(this.f63830i)) * 31;
        String str8 = this.f63831j;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f63832k;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurveyData(dialogId=");
        sb.append(this.f63822a);
        sb.append(", title=");
        sb.append(this.f63823b);
        sb.append(", question=");
        sb.append(this.f63824c);
        sb.append(", answer1=");
        sb.append(this.f63825d);
        sb.append(", answer2=");
        sb.append(this.f63826e);
        sb.append(", resultTitle=");
        sb.append(this.f63827f);
        sb.append(", resultDesc=");
        sb.append(this.f63828g);
        sb.append(", originalQuestion=");
        sb.append(this.f63829h);
        sb.append(", originId=");
        sb.append(this.f63830i);
        sb.append(", originAnswer1=");
        sb.append(this.f63831j);
        sb.append(", originAnswer2=");
        sb.append(this.f63832k);
        sb.append(")");
        return sb.toString();
    }
}
