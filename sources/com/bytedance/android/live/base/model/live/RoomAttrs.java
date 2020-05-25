package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.C2942b;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;

public class RoomAttrs implements C2982b {
    @C17952c(mo34828a = "admin_flag")
    private int adminFlag;
    @C17952c(mo34828a = "fanticket_this_room")
    public long currentRoomContribution;
    @C17952c(mo34828a = "rank_this_room")
    public int currentRoomRank;
    @C17952c(mo34828a = "rank")
    public int rank;
    @C17952c(mo34828a = "silence_flag")
    private int silenceFlag;

    public int getAdminFlag() {
        return this.adminFlag;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSilenceFlag() {
        return this.silenceFlag;
    }

    public int hashCode() {
        return (((this.silenceFlag * 31) + this.adminFlag) * 31) + this.rank;
    }

    public void setAdminFlag(int i) {
        this.adminFlag = i;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setSilenceFlag(int i) {
        this.silenceFlag = i;
    }

    private void initWith(C2982b bVar) {
        this.silenceFlag = bVar.getSilenceFlag();
        this.adminFlag = bVar.getAdminFlag();
        this.rank = bVar.getRank();
    }

    public static RoomAttrs from(C2982b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof RoomAttrs) {
            C17971f a = C2942b.m8369a();
            return (RoomAttrs) a.mo34884a(a.mo34889b(bVar), RoomAttrs.class);
        }
        RoomAttrs roomAttrs = new RoomAttrs();
        roomAttrs.initWith(bVar);
        return roomAttrs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoomAttrs roomAttrs = (RoomAttrs) obj;
        if (this.silenceFlag == roomAttrs.silenceFlag && this.adminFlag == roomAttrs.adminFlag && this.rank == roomAttrs.rank) {
            return true;
        }
        return false;
    }
}
