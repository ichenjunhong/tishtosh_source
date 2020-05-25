package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;
import com.C2240a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.setting.AllowLongVideoThreshold;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2192d.C43457b;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Locale;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.d */
public final class C43155d {

    /* renamed from: a */
    public static int f109098a = C23728o.m58241a(56.0d);

    /* renamed from: b */
    public static int f109099b = C23728o.m58241a(60.0d);

    /* renamed from: c */
    public static int f109100c = C23728o.m58241a(30.0d);

    /* renamed from: d */
    public static int f109101d = C23728o.m58241a(35.0d);

    /* renamed from: e */
    public static final C43155d f109102e = new C43155d();

    private C43155d() {
    }

    /* renamed from: b */
    public static final boolean m94697b() {
        return C43457b.m95263a();
    }

    /* renamed from: c */
    public static final long m94698c() {
        return C43307ea.m94995a();
    }

    /* renamed from: a */
    public static final long m94693a() {
        if (m94697b()) {
            return Math.min(AllowLongVideoThreshold.INSTANCE.videoThreshold(), 900000);
        }
        if (m94699d()) {
            return C39629l.m88232a().mo58574e().mo83119c(C40796a.LongVideoThreshold);
        }
        return 15000;
    }

    /* renamed from: d */
    private static boolean m94699d() {
        if (C39629l.m88232a().mo58574e().mo83117a(C40796a.LongVideoPermitted) || C39629l.m88232a().mo58594y().mo74171a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m94695a(Context context) {
        C52711k.m112240b(context, "context");
        Object systemService = context.getSystemService("vibrator");
        if (systemService != null) {
            ((Vibrator) systemService).vibrate(10);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.os.Vibrator");
    }

    /* renamed from: a */
    public static final MediaModel m94694a(String str, CutMultiVideoViewModel cutMultiVideoViewModel) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(cutMultiVideoViewModel, "cutMultiVideoViewModel");
        if (cutMultiVideoViewModel.f107677k) {
            MediaModel mediaModel = new MediaModel(-1);
            mediaModel.f95383b = str;
            mediaModel.f95390i = 720;
            mediaModel.f95391j = 1280;
            mediaModel.f95386e = (long) cutMultiVideoViewModel.f107678l;
            return mediaModel;
        }
        int[] iArr = new int[10];
        if (C46813b.m101656a(str, iArr) != 0) {
            return null;
        }
        MediaModel mediaModel2 = new MediaModel(-1);
        mediaModel2.f95383b = str;
        mediaModel2.f95390i = iArr[0];
        mediaModel2.f95391j = iArr[1];
        mediaModel2.f95386e = (long) iArr[3];
        return mediaModel2;
    }

    /* renamed from: a */
    private static boolean m94696a(float f, boolean z) {
        if (z || !m94697b() || f <= 60.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String mo87727a(Activity activity, float f, boolean z) {
        C52711k.m112240b(activity, "context");
        if (m94696a(f, z)) {
            int i = (int) f;
            StringBuilder sb = new StringBuilder();
            Locale locale = Locale.getDefault();
            C52711k.m112236a((Object) locale, "Locale.getDefault()");
            String a = C2240a.m6773a(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60)}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
            sb.append(a);
            sb.append(':');
            Locale locale2 = Locale.getDefault();
            C52711k.m112236a((Object) locale2, "Locale.getDefault()");
            String a2 = C2240a.m6773a(locale2, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i % 60)}, 1));
            C52711k.m112236a((Object) a2, "java.lang.String.format(locale, format, *args)");
            sb.append(a2);
            String string = activity.getString(R.string.grz, new Object[]{sb.toString()});
            C52711k.m112236a((Object) string, "context.getString(R.stri…video_trim_time, timeStr)");
            return string;
        }
        Locale locale3 = Locale.getDefault();
        C52711k.m112236a((Object) locale3, "Locale.getDefault()");
        String a3 = C2240a.m6773a(locale3, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        C52711k.m112236a((Object) a3, "java.lang.String.format(locale, format, *args)");
        String string2 = activity.getResources().getString(R.string.c8j, new Object[]{a3});
        C52711k.m112236a((Object) string2, "context.resources.getStr…deo_time_select, timeStr)");
        return string2;
    }
}
