package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.v */
public class C8012v extends C7859c {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    public String f21923a;
    @C17952c(mo34828a = "after_content")

    /* renamed from: b */
    public String f21924b;
    @C17952c(mo34828a = "user_side_content")

    /* renamed from: c */
    public String f21925c;
    @C17952c(mo34828a = "after_display_text")

    /* renamed from: d */
    public C8851g f21926d;
    @C17952c(mo34828a = "duration")

    /* renamed from: e */
    public int f21927e;
    @C17952c(mo34828a = "message_type")

    /* renamed from: f */
    public int f21928f;
    @C17952c(mo34828a = "extra")

    /* renamed from: g */
    public C8013w f21929g;
    @C17952c(mo34828a = "trace_id")

    /* renamed from: h */
    public String f21930h;
    @C17952c(mo34828a = "rank")

    /* renamed from: i */
    public int f21931i;
    @C17952c(mo34828a = "rich_content")

    /* renamed from: j */
    public String f21932j;
    @C17952c(mo34828a = "content_type")

    /* renamed from: k */
    public long f21933k;
    @C17952c(mo34828a = "city_code")

    /* renamed from: l */
    public String f21934l;
    @C17952c(mo34828a = "style")

    /* renamed from: m */
    public String f21935m;

    public C8012v() {
        this.type = C8629a.DAILY_RANK;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DailyRankMessage{content='");
        sb.append(this.f21923a);
        sb.append('\'');
        sb.append(", afterContent='");
        sb.append(this.f21924b);
        sb.append('\'');
        sb.append(", userSideContent='");
        sb.append(this.f21925c);
        sb.append('\'');
        sb.append(", afterDisplayText=");
        sb.append(this.f21926d);
        sb.append(", duration=");
        sb.append(this.f21927e);
        sb.append(", messageType=");
        sb.append(this.f21928f);
        sb.append(", extra=");
        sb.append(this.f21929g);
        sb.append(", traceId='");
        sb.append(this.f21930h);
        sb.append('\'');
        sb.append(", rank=");
        sb.append(this.f21931i);
        sb.append(", contentForDy='");
        sb.append(this.f21932j);
        sb.append('\'');
        sb.append(", contentType=");
        sb.append(this.f21933k);
        sb.append(", cityCode='");
        sb.append(this.f21934l);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
