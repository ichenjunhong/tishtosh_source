package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.os.Vibrator;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42659b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.k */
public final class C42652k {

    /* renamed from: a */
    public static int f107889a = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 60.0f));

    /* renamed from: b */
    public static int f107890b = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 30.0f));

    /* renamed from: c */
    public static int f107891c = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 64.0f));

    /* renamed from: d */
    public static int f107892d = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 12.0f));

    /* renamed from: e */
    public static int f107893e = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 8.0f));

    /* renamed from: f */
    public static int f107894f = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 5.0f));

    /* renamed from: g */
    public static int f107895g = C39629l.m88233b().getResources().getDimensionPixelSize(R.dimen.vq);

    /* renamed from: h */
    public static int f107896h = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 20.0f));

    /* renamed from: a */
    public static void m93582a() {
        C39629l.m88232a().mo58567E().mo49430a("rotate_upload_video", null);
    }

    /* renamed from: c */
    public static void m93587c() {
        C39629l.m88232a().mo58567E().mo49430a("click_edit_segments", null);
    }

    /* renamed from: b */
    public static void m93586b() {
        C39629l.m88232a().mo58567E().mo49430a("click_edit_segments_return", null);
    }

    /* renamed from: a */
    public static long m93580a(long j) {
        boolean z;
        if (!C39629l.m88232a().mo58594y().mo74171a()) {
            if (C39629l.m88232a().mo58574e().mo83117a(C40796a.LongVideoPermitted) || C39629l.m88232a().mo58594y().mo74171a()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (j > C39629l.m88232a().mo58574e().mo83119c(C40796a.LongVideoThreshold)) {
                    j = C39629l.m88232a().mo58574e().mo83119c(C40796a.LongVideoThreshold);
                }
                return j;
            } else if (j > 15000) {
                return 15000;
            } else {
                return j;
            }
        } else if (j > 300000) {
            return 300000;
        } else {
            return j;
        }
    }

    /* renamed from: a */
    public static C47339t m93581a(float f) {
        if (f == C47339t.EPIC.value()) {
            return C47339t.EPIC;
        }
        if (f == C47339t.SLOW.value()) {
            return C47339t.SLOW;
        }
        if (f == C47339t.NORMAL.value()) {
            return C47339t.NORMAL;
        }
        if (f == C47339t.FAST.value()) {
            return C47339t.FAST;
        }
        if (f == C47339t.LAPSE.value()) {
            return C47339t.LAPSE;
        }
        return null;
    }

    /* renamed from: a */
    public static void m93583a(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(10);
        }
    }

    /* renamed from: b */
    public static float m93585b(Context context, int i) {
        return (float) ((C43303dy.m94971b(context) - (i * 2)) - (f107892d * 2));
    }

    /* renamed from: a */
    public static void m93584a(Context context, int i) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate((long) i);
        }
    }

    /* renamed from: a */
    public static float m93579a(C42659b bVar, VideoSegment videoSegment, int i, int i2) {
        return (((((float) videoSegment.mo86952f()) * 1.0f) / (videoSegment.mo86954h() * bVar.f107931e)) + ((float) i2)) - ((float) i);
    }

    /* renamed from: a */
    public static float m93578a(Context context, C42659b bVar, float f, VideoSegment videoSegment, int i) {
        if (videoSegment.mo86953g() - videoSegment.mo86952f() == videoSegment.f107904c) {
            return (float) ((C43303dy.m94971b(context) - i) - f107892d);
        }
        return f + ((float) f107892d) + (((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / (videoSegment.mo86954h() * bVar.f107931e));
    }
}
