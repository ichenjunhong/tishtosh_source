package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.C2972e;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;

public class RoomStats implements C2972e {
    final int INT_31 = 31;
    final int INT_32 = 32;
    @C17952c(mo34828a = "dou_plus_promotion")
    String douPlusPromotion;
    @C17952c(mo34828a = "enter_count")
    int enterCount;
    @C17952c(mo34828a = "follow_count")
    int followCount;
    @C17952c(mo34828a = "gift_uv_count")
    int giftUVCount;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    long f8732id;
    @C17952c(mo34828a = "id_str")
    String idStr;
    @C17952c(mo34828a = "money")
    long money;
    @C17952c(mo34828a = "fan_ticket")
    long ticket;
    @C17952c(mo34828a = "total_user")
    int totalUser;
    @C17952c(mo34828a = "user_count_composition")
    public C2980a userComposition;
    @C17952c(mo34828a = "watermelon")
    int watermelon;

    /* renamed from: com.bytedance.android.live.base.model.live.RoomStats$a */
    public static class C2980a {
        @C17952c(mo34828a = "city")

        /* renamed from: a */
        public double f8733a;
        @C17952c(mo34828a = "video_detail")

        /* renamed from: b */
        public double f8734b;
        @C17952c(mo34828a = "my_follow")

        /* renamed from: c */
        public double f8735c;
        @C17952c(mo34828a = "other")

        /* renamed from: d */
        public double f8736d;
    }

    public String getDouPlusPromotion() {
        return this.douPlusPromotion;
    }

    public int getEnterCount() {
        return this.enterCount;
    }

    public int getFollowCount() {
        return this.followCount;
    }

    public int getGiftUVCount() {
        return this.giftUVCount;
    }

    public long getId() {
        return this.f8732id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public long getMoney() {
        return this.money;
    }

    public long getTicket() {
        return this.ticket;
    }

    public int getTotalUser() {
        return this.totalUser;
    }

    public int getWatermelon() {
        return this.watermelon;
    }

    public int hashCode() {
        int i;
        int i2 = ((((((((((((int) (this.f8732id ^ (this.f8732id >>> 32))) * 31) + ((int) (this.ticket ^ (this.ticket >>> 32)))) * 31) + ((int) (this.money ^ (this.money >>> 32)))) * 31) + this.totalUser) * 31) + this.followCount) * 31) + this.giftUVCount) * 31;
        if (this.idStr != null) {
            i = this.idStr.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void setDouPlusPromotion(String str) {
        this.douPlusPromotion = str;
    }

    public void setEnterCount(int i) {
        this.enterCount = i;
    }

    public void setFollowCount(int i) {
        this.followCount = i;
    }

    public void setGiftUVCount(int i) {
        this.giftUVCount = i;
    }

    public void setId(long j) {
        this.f8732id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setMoney(long j) {
        this.money = j;
    }

    public void setTicket(long j) {
        this.ticket = j;
    }

    public void setTotalUser(int i) {
        this.totalUser = i;
    }

    public void setWatermelon(int i) {
        this.watermelon = i;
    }

    public static RoomStats from(C2972e eVar) {
        if (eVar == null) {
            return null;
        }
        if (eVar instanceof RoomStats) {
            C17971f a = C2942b.m8369a();
            return (RoomStats) a.mo34884a(a.mo34889b(eVar), RoomStats.class);
        }
        RoomStats roomStats = new RoomStats();
        roomStats.initWith(eVar);
        return roomStats;
    }

    private void initWith(C2972e eVar) {
        this.f8732id = eVar.getId();
        this.ticket = eVar.getTicket();
        this.money = eVar.getMoney();
        this.totalUser = eVar.getTotalUser();
        this.followCount = eVar.getFollowCount();
        this.giftUVCount = eVar.getGiftUVCount();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoomStats roomStats = (RoomStats) obj;
        if (this.f8732id != roomStats.f8732id || this.ticket != roomStats.ticket || this.money != roomStats.money || this.followCount != roomStats.followCount || this.giftUVCount != roomStats.giftUVCount) {
            return false;
        }
        if (this.idStr == null ? roomStats.idStr != null : !this.idStr.equals(roomStats.idStr)) {
            return false;
        }
        if (this.totalUser == roomStats.totalUser) {
            return true;
        }
        return false;
    }
}
