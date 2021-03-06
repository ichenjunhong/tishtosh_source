package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.Range */
public final class Range {
    private int from;

    /* renamed from: to */
    private int f87333to;

    public final int getFrom() {
        return this.from;
    }

    public final int getTo() {
        return this.f87333to;
    }

    public final int hashCode() {
        return (this.from * 31) + this.f87333to;
    }

    public final void setFrom(int i) {
        this.from = i;
    }

    public final void setTo(int i) {
        this.f87333to = i;
    }

    public final int getAnchorPosition(int i) {
        if ((i - this.from) - (this.f87333to - i) >= 0) {
            return this.f87333to;
        }
        return this.from;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (this.from == range.from && this.f87333to == range.f87333to) {
            return true;
        }
        return false;
    }

    public Range(int i, int i2) {
        this.from = i;
        this.f87333to = i2;
    }

    public final boolean contains(int i, int i2) {
        if (this.from > i || this.f87333to < i2) {
            return false;
        }
        return true;
    }

    public final boolean isEqual(int i, int i2) {
        if ((this.from == i && this.f87333to == i2) || (this.from == i2 && this.f87333to == i)) {
            return true;
        }
        return false;
    }

    public final boolean isWrappedBy(int i, int i2) {
        int i3 = this.from + 1;
        int i4 = this.f87333to;
        if (i3 > i || i4 <= i) {
            int i5 = this.from + 1;
            int i6 = this.f87333to;
            if (i5 > i2 || i6 <= i2) {
                return false;
            }
        }
        return true;
    }
}
