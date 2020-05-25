package com.bytedance.android.livesdkapi.ping;

import com.google.gson.p1076a.C17952c;

public class PingResult {
    @C17952c(mo34828a = "mosaic_status")
    private int mosaicStatus;
    @C17952c(mo34828a = "next_ping")
    private long nextPingInterval;
    @C17952c(mo34828a = "room_id")
    private long roomId;
    @C17952c(mo34828a = "room_status")
    private int roomStatus;

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public long getNextPingInterval() {
        return this.nextPingInterval;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public int getRoomStatus() {
        return this.roomStatus;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setRoomId(long j) {
        this.roomId = j;
    }

    public void setRoomStatus(int i) {
        this.roomStatus = i;
    }
}
