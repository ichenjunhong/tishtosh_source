package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.livesdkapi.message.C8851g;
import com.google.gson.p1076a.C17952c;

public class ShareReportResult {
    @C17952c(mo34828a = "delta_intimacy")
    private long deltaIntimacy;
    @C17952c(mo34828a = "display_text")
    private C8851g displayText;

    public long getDeltaIntimacy() {
        return this.deltaIntimacy;
    }

    public C8851g getDisplayText() {
        return this.displayText;
    }

    @C17952c(mo34828a = "delta_intimacy")
    public void setDeltaIntimacy(long j) {
        this.deltaIntimacy = j;
    }

    @C17952c(mo34828a = "display_text")
    public void setDisplayText(C8851g gVar) {
        this.displayText = gVar;
    }
}
