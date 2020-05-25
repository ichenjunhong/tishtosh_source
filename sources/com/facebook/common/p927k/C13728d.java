package com.facebook.common.p927k;

import com.facebook.common.p920d.C13689i;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.k.d */
public final class C13728d {
    /* renamed from: a */
    public static long m27774a(InputStream inputStream, long j) throws IOException {
        boolean z;
        C13689i.m27652a(inputStream);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else if (inputStream.read() == -1) {
                return j - j2;
            } else {
                j2--;
            }
        }
        return j;
    }
}
