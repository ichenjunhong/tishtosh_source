package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BoxData */
public final class BoxData implements Serializable {
    @C17952c(mo34828a = "box")
    private final Coordinate box;
    @C17952c(mo34828a = "timestamp_MS")
    private final int timestampMS;

    public BoxData() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ BoxData copy$default(BoxData boxData, Coordinate coordinate, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coordinate = boxData.box;
        }
        if ((i2 & 2) != 0) {
            i = boxData.timestampMS;
        }
        return boxData.copy(coordinate, i);
    }

    public final Coordinate component1() {
        return this.box;
    }

    public final int component2() {
        return this.timestampMS;
    }

    public final BoxData copy(Coordinate coordinate, int i) {
        return new BoxData(coordinate, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BoxData) {
                BoxData boxData = (BoxData) obj;
                if (C52711k.m112239a((Object) this.box, (Object) boxData.box)) {
                    if (this.timestampMS == boxData.timestampMS) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Coordinate getBox() {
        return this.box;
    }

    public final int getTimestampMS() {
        return this.timestampMS;
    }

    public final int hashCode() {
        Coordinate coordinate = this.box;
        return ((coordinate != null ? coordinate.hashCode() : 0) * 31) + this.timestampMS;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxData(box=");
        sb.append(this.box);
        sb.append(", timestampMS=");
        sb.append(this.timestampMS);
        sb.append(")");
        return sb.toString();
    }

    public BoxData(Coordinate coordinate, int i) {
        this.box = coordinate;
        this.timestampMS = i;
    }

    public /* synthetic */ BoxData(Coordinate coordinate, int i, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            coordinate = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        this(coordinate, i);
    }
}
