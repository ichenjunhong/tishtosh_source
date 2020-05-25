package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.r */
public final class C39134r implements Serializable {
    @C17952c(mo34828a = "book_url")
    public String book_url;
    @C17952c(mo34828a = "queue_status")
    public int queueStatus;
    @C17952c(mo34828a = "queue_url")
    public String queue_url;

    public final boolean isAvailable() {
        if (this.queueStatus < 2 || this.queueStatus > 4) {
            return true;
        }
        return false;
    }
}
