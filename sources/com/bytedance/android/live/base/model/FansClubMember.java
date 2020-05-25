package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.user.FansClubData;
import com.google.gson.p1076a.C17952c;
import java.util.Map;

public class FansClubMember {
    public static final int OTHER_ROOM = 1;
    public static final int PERSONAL_PROFILE = 0;
    @C17952c(mo34828a = "cur_level_intimacy")
    int curLevelIntimacy;
    @C17952c(mo34828a = "data")
    FansClubData data;
    @C17952c(mo34828a = "intimacy")
    int intimacy;
    @C17952c(mo34828a = "level")
    int level;
    @C17952c(mo34828a = "next_level_intimacy")
    int nextLevelIntimacy;
    @C17952c(mo34828a = "prefer_data")
    Map<Integer, FansClubData> preferData;
    @C17952c(mo34828a = "status")
    int status;

    public int getCurLevelIntimacy() {
        return this.curLevelIntimacy;
    }

    public FansClubData getData() {
        return this.data;
    }

    public int getIntimacy() {
        return this.intimacy;
    }

    public int getLevel() {
        return this.level;
    }

    public int getNextLevelIntimacy() {
        return this.nextLevelIntimacy;
    }

    public Map<Integer, FansClubData> getPreferData() {
        return this.preferData;
    }

    public int getStatus() {
        return this.status;
    }

    public void setCurLevelIntimacy(int i) {
        this.curLevelIntimacy = i;
    }

    public void setData(FansClubData fansClubData) {
        this.data = fansClubData;
    }

    public void setIntimacy(int i) {
        this.intimacy = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setNextLevelIntimacy(int i) {
        this.nextLevelIntimacy = i;
    }

    public void setPreferData(Map<Integer, FansClubData> map) {
        this.preferData = map;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
