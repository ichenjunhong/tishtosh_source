package com.p683ss.android.ugc.aweme.p1361ap.p1362a;

import android.os.Environment;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.ap.a.a */
public class C22793a {

    /* renamed from: a */
    public static final String f61066a;

    /* renamed from: d */
    private static C22793a f61067d;

    /* renamed from: b */
    public int f61068b = ((int) C43307ea.m94995a());

    /* renamed from: c */
    public int f61069c = 600000;

    private C22793a() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
        sb.append(File.separator);
        sb.append("neihanduanzi");
        f61066a = sb.toString();
    }

    /* renamed from: a */
    public static C22793a m56152a() {
        if (f61067d == null) {
            synchronized (C22793a.class) {
                f61067d = new C22793a();
            }
        }
        return f61067d;
    }
}
