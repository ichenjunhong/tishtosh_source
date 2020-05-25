package org.msgpack.packer;

import org.msgpack.C53798c;

public final class PackerStack {
    private int[] counts = new int[128];
    public int top;
    private byte[] types = new byte[128];

    public final int getTopCount() {
        return this.counts[this.top];
    }

    public final void pop() {
        this.top--;
    }

    public final void reduceCount() {
        int[] iArr = this.counts;
        int i = this.top;
        iArr[i] = iArr[i] - 1;
    }

    public final boolean topIsArray() {
        if (this.types[this.top] == 1) {
            return true;
        }
        return false;
    }

    public final boolean topIsMap() {
        if (this.types[this.top] == 2) {
            return true;
        }
        return false;
    }

    public PackerStack() {
        this.types[0] = 0;
    }

    public final void checkCount() {
        if (this.counts[this.top] <= 0) {
            if (this.types[this.top] == 1) {
                throw new C53798c("Array is end but writeArrayEnd() is not called");
            } else if (this.types[this.top] == 2) {
                throw new C53798c("Map is end but writeMapEnd() is not called");
            }
        }
    }

    public final void pushArray(int i) {
        this.top++;
        this.types[this.top] = 1;
        this.counts[this.top] = i;
    }

    public final void pushMap(int i) {
        this.top++;
        this.types[this.top] = 2;
        this.counts[this.top] = i * 2;
    }
}
