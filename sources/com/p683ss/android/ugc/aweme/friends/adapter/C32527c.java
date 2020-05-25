package com.p683ss.android.ugc.aweme.friends.adapter;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.c */
public final class C32527c implements SectionIndexer {

    /* renamed from: a */
    private String[] f84669a;

    /* renamed from: b */
    private int[] f84670b;

    /* renamed from: c */
    private int f84671c;

    public final Object[] getSections() {
        return this.f84669a;
    }

    public final int getPositionForSection(int i) {
        if (i < 0 || i >= this.f84669a.length) {
            return -1;
        }
        return this.f84670b[i];
    }

    public final int getSectionForPosition(int i) {
        if (i < 0 || i >= this.f84671c) {
            return -1;
        }
        int binarySearch = Arrays.binarySearch(this.f84670b, i);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return (-binarySearch) - 2;
    }

    /* renamed from: a */
    public final int mo65827a(int i) {
        if (i < 0 || i >= this.f84671c) {
            return -1;
        }
        int[] iArr = this.f84670b;
        int i2 = 0;
        int length = iArr.length - 1;
        while (true) {
            if (i2 <= length) {
                int i3 = (i2 + length) >>> 1;
                if (i >= iArr[i3]) {
                    if (i <= iArr[i3]) {
                        i2 = i3;
                        break;
                    }
                    i2 = i3 + 1;
                } else {
                    length = i3 - 1;
                }
            } else if (i2 == iArr.length || iArr[i2] > i) {
                i2--;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        return (-i2) - 2;
    }

    public C32527c(String[] strArr, int[] iArr) {
        int min = Math.min(strArr.length, iArr.length);
        this.f84669a = strArr;
        this.f84670b = new int[min];
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (TextUtils.isEmpty(this.f84669a[i2])) {
                this.f84669a[i2] = " ";
            } else if (!this.f84669a[i2].equals(" ")) {
                String[] strArr2 = this.f84669a;
                strArr2[i2] = strArr2[i2].trim();
            }
            this.f84670b[i2] = i;
            i += iArr[i2];
        }
        this.f84671c = i;
    }
}
