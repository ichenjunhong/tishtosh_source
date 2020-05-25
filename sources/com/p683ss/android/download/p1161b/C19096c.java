package com.p683ss.android.download.p1161b;

import android.net.Uri;
import android.provider.BaseColumns;

/* renamed from: com.ss.android.download.b.c */
public final class C19096c {

    /* renamed from: com.ss.android.download.b.c$a */
    public static final class C19097a implements BaseColumns {

        /* renamed from: a */
        public static final Uri f52584a = Uri.parse("content://com.ss.android.newmedia.downloads/all_downloads");

        /* renamed from: a */
        public static boolean m46513a(int i) {
            return i >= 200 && i < 300;
        }

        /* renamed from: b */
        public static boolean m46514b(int i) {
            return i >= 400 && i < 600;
        }

        /* renamed from: c */
        public static boolean m46515c(int i) {
            return (i >= 200 && i < 300) || (i >= 400 && i < 600);
        }
    }
}
