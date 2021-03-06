package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.RoomInfo */
public final class RoomInfo {
    @C17952c(mo34828a = "room_id")
    private final long roomId;
    @C17952c(mo34828a = "title")
    private final String title;

    public RoomInfo() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ RoomInfo copy$default(RoomInfo roomInfo, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = roomInfo.roomId;
        }
        if ((i & 2) != 0) {
            str = roomInfo.title;
        }
        return roomInfo.copy(j, str);
    }

    public final long component1() {
        return this.roomId;
    }

    public final String component2() {
        return this.title;
    }

    public final RoomInfo copy(long j, String str) {
        return new RoomInfo(j, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RoomInfo) {
                RoomInfo roomInfo = (RoomInfo) obj;
                if (!(this.roomId == roomInfo.roomId) || !C52711k.m112239a((Object) this.title, (Object) roomInfo.title)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        long j = this.roomId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.title;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoomInfo(roomId=");
        sb.append(this.roomId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(")");
        return sb.toString();
    }

    public RoomInfo(long j, String str) {
        this.roomId = j;
        this.title = str;
    }

    public /* synthetic */ RoomInfo(long j, String str, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        this(j, str);
    }
}
