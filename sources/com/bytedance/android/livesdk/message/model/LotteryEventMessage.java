package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message.C8845b;
import com.google.gson.p1076a.C17952c;

public class LotteryEventMessage extends C7859c {
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_FINISHED = 2;
    public static final int STATUS_ONGOING = 1;
    public static final int STATUS_REJECTED = 5;
    public static final int STATUS_REVIEWING = 4;
    @C17952c(mo34828a = "lottery_current_time")
    public long lotteryCurrentTime;
    @C17952c(mo34828a = "lottery_draw_time")
    public long lotteryDrawTime;
    @C17952c(mo34828a = "lottery_id")
    public long lotteryId;
    @C17952c(mo34828a = "rule_page_scheme")
    public String lotteryRulePageScheme;
    @C17952c(mo34828a = "lottery_start_time")
    public long lotteryStartTime;
    @C17952c(mo34828a = "lottery_status")
    public int lotteryStatus;

    public boolean supportDisplayText() {
        return true;
    }

    LotteryEventMessage() {
    }

    public boolean canText() {
        C8845b bVar = this.baseMessage;
        if (bVar == null || bVar.f24139j == null) {
            return false;
        }
        return true;
    }
}
