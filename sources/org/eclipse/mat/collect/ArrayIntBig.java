package org.eclipse.mat.collect;

import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import java.util.ArrayList;

public final class ArrayIntBig implements Serializable {
    private static final long serialVersionUID = 1;
    private int length = 0;
    private int[] page;
    private ArrayList<int[]> pages = new ArrayList<>();

    public final int length() {
        return this.length;
    }

    public final boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    public final long consumption() {
        return ((long) this.pages.size()) << 12;
    }

    public final int[] toArray() {
        int[] iArr = new int[this.length];
        int i = 0;
        while (i < this.length) {
            int min = Math.min(this.length - i, PreloadTask.BYTE_UNIT_NUMBER);
            System.arraycopy(this.pages.get(i >> 10), 0, iArr, i, min);
            i += min;
        }
        return iArr;
    }

    public final void add(int i) {
        int i2 = this.length;
        this.length = i2 + 1;
        int i3 = i2 & 1023;
        if (i3 == 0) {
            ArrayList<int[]> arrayList = this.pages;
            int[] iArr = new int[PreloadTask.BYTE_UNIT_NUMBER];
            this.page = iArr;
            arrayList.add(iArr);
        }
        this.page[i3] = i;
    }

    public final int get(int i) throws IndexOutOfBoundsException {
        if (i < this.length) {
            return ((int[]) this.pages.get(i >> 10))[i & 1023];
        }
        throw new IndexOutOfBoundsException();
    }

    public final void addAll(int[] iArr) {
        int i;
        int i2 = this.length & 1023;
        if (i2 == 0) {
            i = 0;
        } else {
            i = Math.min(iArr.length, 1024 - i2);
        }
        if (i > 0) {
            System.arraycopy(iArr, 0, this.pages.get(this.length >> 10), this.length & 1023, i);
            this.length += i;
        }
        while (i < iArr.length) {
            ArrayList<int[]> arrayList = this.pages;
            int[] iArr2 = new int[PreloadTask.BYTE_UNIT_NUMBER];
            this.page = iArr2;
            arrayList.add(iArr2);
            int min = Math.min(iArr.length - i, PreloadTask.BYTE_UNIT_NUMBER);
            System.arraycopy(iArr, i, this.page, 0, min);
            i += min;
            this.length += min;
        }
    }
}
