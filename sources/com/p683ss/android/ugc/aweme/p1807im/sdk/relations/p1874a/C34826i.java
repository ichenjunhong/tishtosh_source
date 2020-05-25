package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.i */
public final class C34826i implements SectionIndexer {

    /* renamed from: a */
    private String[] f89726a;

    /* renamed from: b */
    private int[] f89727b;

    /* renamed from: c */
    private int f89728c;

    public final Object[] getSections() {
        return this.f89726a;
    }

    public final int getPositionForSection(int i) {
        if (i < 0 || i >= this.f89726a.length) {
            return -1;
        }
        return this.f89727b[i];
    }

    public final int getSectionForPosition(int i) {
        if (i < 0 || i >= this.f89728c) {
            return -1;
        }
        int binarySearch = Arrays.binarySearch(this.f89727b, i);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return (-binarySearch) - 2;
    }

    public C34826i(String[] strArr, int[] iArr) {
        int min = Math.min(strArr.length, iArr.length);
        this.f89726a = strArr;
        this.f89727b = new int[min];
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (TextUtils.isEmpty(this.f89726a[i2])) {
                this.f89726a[i2] = " ";
            } else if (!this.f89726a[i2].equals(" ")) {
                String[] strArr2 = this.f89726a;
                strArr2[i2] = strArr2[i2].trim();
            }
            this.f89727b[i2] = i;
            i += iArr[i2];
        }
        this.f89728c = i;
    }
}
