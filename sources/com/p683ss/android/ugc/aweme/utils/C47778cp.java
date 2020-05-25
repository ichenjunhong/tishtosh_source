package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.util.C18915b;
import com.p683ss.android.common.util.C18919f;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.p1147d.C18956k;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.cp */
public final class C47778cp {

    /* renamed from: a */
    public static final C47778cp f120297a = new C47778cp();

    private C47778cp() {
    }

    /* renamed from: a */
    public static boolean m103404a(Context context, int i, String str, List<? extends C18956k> list, String str2, String str3, String str4, C18915b<String> bVar, String str5, C18919f fVar) throws Throwable {
        int i2;
        int i3;
        boolean z;
        String str6 = str2;
        String str7 = str4;
        C52711k.m112240b(context, "tx");
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str6, "dir");
        C52711k.m112240b(str7, LeakCanaryFileProvider.f132049i);
        if (i <= 0) {
            i2 = 20971520;
        } else {
            i2 = i;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        int i4 = 0;
        for (C18956k kVar : list) {
            if (kVar != null) {
                String str8 = kVar.f52243a;
                C52711k.m112236a((Object) str8, "urlInfo.mUrl");
                if (!C9431p.m18664a(str8)) {
                    int i5 = i4 + 1;
                    if (i5 > 3) {
                        return false;
                    }
                    String[] strArr = new String[1];
                    int[] iArr = new int[1];
                    System.currentTimeMillis();
                    try {
                        if (!C47779cq.m103405a(context)) {
                            return false;
                        }
                        int[] iArr2 = iArr;
                        z = true;
                        i3 = i5;
                        try {
                            boolean downloadFile = NetworkUtils.downloadFile(i2, str8, str2, str3, str4, bVar, str5, fVar, kVar.f52244b, strArr, iArr2);
                            System.currentTimeMillis();
                            if (!downloadFile) {
                                return downloadFile;
                            }
                            try {
                                File file = new File(str6, str7);
                                if (file.isFile()) {
                                    long length = file.length();
                                    if (length > 0 && iArr2[0] <= 0 && length < 2147483647L) {
                                        iArr2[0] = (int) length;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            return downloadFile;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i3 = i5;
                        z = true;
                        if (!(th instanceof SocketException) && !(th instanceof IOException) && !(th instanceof SocketTimeoutException) && !(th instanceof C19174b)) {
                            z = false;
                        }
                        if (!z) {
                            throw th;
                        } else if (!C47779cq.m103405a(context)) {
                            return false;
                        } else {
                            i4 = i3;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
