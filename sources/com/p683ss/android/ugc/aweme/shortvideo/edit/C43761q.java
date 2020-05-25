package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.app.Application;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.q */
public final class C43761q {

    /* renamed from: a */
    public static final C43762a f110814a = new C43762a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.q$a */
    public static final class C43762a {
        private C43762a() {
        }

        /* renamed from: a */
        public final String mo89271a() {
            StringBuilder sb = new StringBuilder();
            sb.append(m96176b());
            sb.append(m96175a("_cover.png"));
            return sb.toString();
        }

        /* renamed from: b */
        public static String m96176b() {
            StringBuilder sb = new StringBuilder();
            Application b = C39629l.m88233b();
            C52711k.m112236a((Object) b, "CameraClient.getApplication()");
            File cacheDir = b.getCacheDir();
            C52711k.m112236a((Object) cacheDir, "CameraClient.getApplication().cacheDir");
            sb.append(cacheDir.getPath());
            sb.append(File.separator);
            return sb.toString();
        }

        public /* synthetic */ C43762a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static String m96175a(String str) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
            C52711k.m112236a((Object) instance, "calendar");
            Date time = instance.getTime();
            StringBuilder sb = new StringBuilder();
            sb.append(simpleDateFormat.format(time));
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static final String m96174a() {
        return f110814a.mo89271a();
    }
}
