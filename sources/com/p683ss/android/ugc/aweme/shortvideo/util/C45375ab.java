package com.p683ss.android.ugc.aweme.shortvideo.util;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ab */
final /* synthetic */ class C45375ab implements Comparator {

    /* renamed from: a */
    static final Comparator f114747a = new C45375ab();

    private C45375ab() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
    }
}
