package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.BillboardWeeklyInfoStruct */
public class BillboardWeeklyInfoStruct implements Serializable {
    @C17952c(mo34828a = "end_date")
    private String endDate;
    @C17952c(mo34828a = "last_updated_date")
    private String lastUpdatedDate;
    @C17952c(mo34828a = "serial")
    private int serial;
    @C17952c(mo34828a = "start_date")
    private String startDate;

    public String getEndDate() {
        return this.endDate;
    }

    public String getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public int getSerial() {
        return this.serial;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setEndDate(String str) {
        this.endDate = str;
    }

    public void setLastUpdatedDate(String str) {
        this.lastUpdatedDate = str;
    }

    public void setSerial(int i) {
        this.serial = i;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }
}
