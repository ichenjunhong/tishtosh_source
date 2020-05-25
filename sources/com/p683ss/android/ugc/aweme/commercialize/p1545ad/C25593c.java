package com.p683ss.android.ugc.aweme.commercialize.p1545ad;

import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.commercialize.settings.AdGapInteractiveDuration;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.HashMap;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.c */
public final class C25593c implements C27979p {

    /* renamed from: a */
    public static final HashMap<String, Integer> f67749a = new HashMap<>();

    /* renamed from: b */
    public static int f67750b;

    /* renamed from: c */
    public static long f67751c;

    /* renamed from: d */
    public static String f67752d = "no_ad";

    /* renamed from: e */
    public static int f67753e;

    /* renamed from: f */
    public static boolean f67754f;

    /* renamed from: g */
    public static long f67755g;

    /* renamed from: h */
    public static long f67756h;

    /* renamed from: i */
    public static final C25593c f67757i = new C25593c();

    private C25593c() {
    }

    /* renamed from: c */
    public final void mo47074c() {
    }

    /* renamed from: e */
    public static void m62132e() {
        f67755g = 0;
        f67756h = 0;
    }

    /* renamed from: a */
    public final void mo47070a() {
        if (!f67754f) {
            f67751c = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo47072b() {
        mo52755d();
        f67749a.clear();
    }

    /* renamed from: d */
    public final void mo52755d() {
        f67753e = 0;
        f67751c = 0;
        m62132e();
        if (f67754f) {
            f67750b = 0;
            f67752d = "feedad";
            return;
        }
        f67750b = 1;
        f67752d = "no_ad";
    }

    /* renamed from: a */
    public static void m62130a(int i) {
        f67753e = i | f67753e;
    }

    /* renamed from: a */
    public static boolean m62131a(String str) {
        if (!AdGapInteractiveDuration.isEnable() || !C52711k.m112239a((Object) "homepage_hot", (Object) str) || f67754f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo52754a(String str, JSONObject jSONObject) {
        if (!(str == null || jSONObject == null)) {
            Object opt = jSONObject.opt("enter_from");
            if (!(opt instanceof String)) {
                opt = null;
            }
            if (m62131a((String) opt)) {
                switch (str.hashCode()) {
                    case -1642623552:
                        if (str.equals("post_comment")) {
                            m62130a(4);
                            return;
                        }
                        break;
                    case -1330248535:
                        if (str.equals("click_comment_button")) {
                            m62130a((int) UnReadVideoExperiment.BROWSE_RECORD_LIST);
                            return;
                        }
                        break;
                    case -1268958287:
                        if (str.equals("follow")) {
                            m62130a(16);
                            return;
                        }
                        break;
                    case -1213756323:
                        if (str.equals("enter_tag_detail")) {
                            m62130a((int) PreloadTask.BYTE_UNIT_NUMBER);
                            break;
                        }
                        break;
                    case -1115125979:
                        if (str.equals("click_more_button")) {
                            m62130a((int) UnReadVideoExperiment.LIKE_USER_LIST);
                            return;
                        }
                        break;
                    case -795864119:
                        if (str.equals("enter_personal_detail")) {
                            Object opt2 = jSONObject.opt("enter_method");
                            if (C52711k.m112239a((Object) "click_head", opt2) || C52711k.m112239a((Object) "click_name", opt2) || C52711k.m112239a((Object) "slide_left", opt2) || C52711k.m112239a((Object) "video_at", opt2)) {
                                m62130a(32);
                                return;
                            }
                        }
                        break;
                    case -17674694:
                        if (str.equals("video_play_finish")) {
                            m62130a(1);
                            return;
                        }
                        break;
                    case 3321751:
                        if (str.equals("like")) {
                            m62130a(2);
                            return;
                        }
                        break;
                    case 409478171:
                        if (str.equals("share_video")) {
                            m62130a(8);
                            return;
                        }
                        break;
                    case 1438590386:
                        if (str.equals("enter_music_detail")) {
                            m62130a(64);
                            return;
                        }
                        break;
                }
            }
        }
    }
}
