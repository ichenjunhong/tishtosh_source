package com.p683ss.android.ugc.aweme.shortvideo.util;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aa */
final /* synthetic */ class C45374aa implements Comparator {

    /* renamed from: a */
    static final Comparator f114746a = new C45374aa();

    private C45374aa() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
    }
}
