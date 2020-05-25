package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.os.Environment;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eb */
public class C43308eb {

    /* renamed from: d */
    public static final String f109491d;

    /* renamed from: e */
    public static final String f109492e;

    /* renamed from: f */
    public static final String f109493f;

    /* renamed from: g */
    public static final String f109494g;

    /* renamed from: h */
    public static final String f109495h;

    /* renamed from: i */
    public static final String f109496i;

    /* renamed from: j */
    public static final String f109497j;

    /* renamed from: k */
    public static final String f109498k;

    /* renamed from: l */
    public static final String f109499l;

    /* renamed from: m */
    public static final String f109500m;

    /* renamed from: n */
    public static final String f109501n;

    /* renamed from: o */
    public static final String f109502o;

    /* renamed from: p */
    public static final String f109503p;

    /* renamed from: q */
    public static final String f109504q;

    /* renamed from: r */
    public static final String f109505r;

    /* renamed from: s */
    public static final String f109506s;

    /* renamed from: t */
    public static final String f109507t;

    /* renamed from: u */
    public static final String f109508u;

    /* renamed from: v */
    public static final String f109509v;

    /* renamed from: w */
    public static final String f109510w;

    /* renamed from: b */
    public static String m94997b() {
        StringBuilder sb = new StringBuilder();
        sb.append(f109498k);
        sb.append(m94999c(".mp4"));
        return sb.toString();
    }

    static {
        C39629l.m88232a().mo58588s();
        StringBuilder sb = new StringBuilder();
        sb.append(C50200d.m108348b((Context) C39629l.m88233b()));
        sb.append("/");
        f109491d = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f109491d);
        sb2.append("tmp/");
        f109492e = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f109491d);
        sb3.append("draft/");
        f109493f = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f109491d);
        sb4.append("import/");
        f109494g = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(f109491d);
        sb5.append("background_video/tmp/");
        f109495h = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(f109491d);
        sb6.append("background_video/draft/");
        f109496i = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(f109491d);
        sb7.append("origin_sound/");
        f109497j = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(f109491d);
        sb8.append("tmp_video/");
        f109498k = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(f109491d);
        sb9.append("parallel_upload/");
        f109499l = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append(f109491d);
        sb10.append("record_work_space");
        f109500m = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(f109491d);
        sb11.append("shortvideo/videoedit/audiorecord/");
        f109501n = sb11.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append(Environment.getExternalStorageDirectory().getPath());
        sb12.append("/aweme/draft/");
        f109502o = sb12.toString();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(f109491d);
        sb13.append("cache/");
        f109503p = sb13.toString();
        StringBuilder sb14 = new StringBuilder();
        sb14.append(f109491d);
        sb14.append("filters/");
        f109504q = sb14.toString();
        StringBuilder sb15 = new StringBuilder();
        sb15.append(f109491d);
        sb15.append("audio-effect/");
        f109505r = sb15.toString();
        StringBuilder sb16 = new StringBuilder();
        sb16.append(f109491d);
        sb16.append("music/");
        f109506s = sb16.toString();
        StringBuilder sb17 = new StringBuilder();
        sb17.append(f109491d);
        sb17.append("beauty-face/");
        f109507t = sb17.toString();
        StringBuilder sb18 = new StringBuilder();
        sb18.append(f109491d);
        sb18.append("noCopyDraft/");
        f109508u = sb18.toString();
        StringBuilder sb19 = new StringBuilder();
        sb19.append(f109491d);
        sb19.append("greenscreen/bg/");
        f109509v = sb19.toString();
        StringBuilder sb20 = new StringBuilder();
        sb20.append(f109491d);
        sb20.append("compat_draft_track/");
        f109510w = sb20.toString();
        C50200d.m108349b(new File(f109491d));
    }

    /* renamed from: b */
    public static String m94998b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f109491d);
        sb.append(m94999c(str));
        return sb.toString();
    }

    /* renamed from: c */
    public static String m94999c(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(time));
        sb.append(str);
        return sb.toString();
    }
}
