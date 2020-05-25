package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse */
public final class CreateAwemeResponse extends C42421al implements C22982e, Serializable {
    @C17952c(mo34828a = "aweme")
    public Aweme aweme;
    @C17952c(mo34828a = "coupon_info")
    public C25687b couponInfo;
    @C17952c(mo34828a = "has_sticker_red_packet")
    public boolean hasStickerRedPacket;
    @C17952c(mo34828a = "is_review_video")
    public int isReviewVideo;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPbBean;
    @C17952c(mo34828a = "notify")
    public String[] notify;
    @C17952c(mo34828a = "notify_extra")
    public C42368a notifyExtra;
    public String requestId;
    @C17952c(mo34828a = "share_tip_duration")
    public int shareTipDuration;
    @C17952c(mo34828a = "token")
    public String stickerToken;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse$a */
    public static final class C42368a implements Serializable {
        @C17952c(mo34828a = "button_text")
        public String btnText;
        @C17952c(mo34828a = "text")
        public String text;
        @C17952c(mo34828a = "type")
        public int type;
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }
}
