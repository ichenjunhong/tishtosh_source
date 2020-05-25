package com.bytedance.android.live.core.p223b;

import android.content.Context;
import com.bytedance.android.live.C2942b;
import com.bytedance.ies.p672e.C10753b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46485a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.b.a */
public final class C3829a {

    /* renamed from: a */
    private static Locale f10784a = new Locale("hi", "IN");

    /* renamed from: b */
    private static Locale f10785b = new Locale("te", "IN");

    /* renamed from: c */
    private static Locale f10786c = new Locale("ta", "IN");

    /* renamed from: d */
    private static Locale f10787d = new Locale("mr", "IN");

    /* renamed from: e */
    private static Locale f10788e = new Locale("bn", "IN");

    /* renamed from: f */
    private static Locale f10789f = new Locale("gu", "IN");

    /* renamed from: g */
    private static Locale f10790g = new Locale("kn", "IN");

    /* renamed from: h */
    private static Locale f10791h = new Locale("ml", "IN");

    /* renamed from: i */
    private static Locale f10792i = new Locale("pa", "IN");

    /* renamed from: j */
    private static Locale f10793j = new Locale(C46485a.f117298d, "IN");

    /* renamed from: k */
    private static Locale f10794k = new Locale("in", "ID");

    /* renamed from: l */
    private static Locale f10795l = new Locale("vi", "VN");

    /* renamed from: m */
    private static Locale f10796m = Locale.JAPAN;

    /* renamed from: n */
    private static Locale f10797n = Locale.KOREA;

    /* renamed from: o */
    private static Locale f10798o = new Locale("th", "TH");

    /* renamed from: p */
    private static Locale f10799p = new Locale("pt", "PT");

    /* renamed from: q */
    private static Locale f10800q = new Locale("ms");

    /* renamed from: r */
    private static Locale f10801r = Locale.FRANCE;

    /* renamed from: s */
    private static Locale f10802s = new Locale("ru", "RU");

    /* renamed from: t */
    private static Locale f10803t = new Locale("es");

    /* renamed from: u */
    private static Locale f10804u = new Locale("ar");

    /* renamed from: v */
    private static HashSet<String> f10805v = new HashSet<>(Arrays.asList(new String[]{"en", "hi", "in", "vi", "ko", "ja", "th", "ta", "te", "mr", "ms", "pt", "bn", "fr", "ru", "es", "ar"}));

    /* renamed from: w */
    private static List<String> f10806w = Arrays.asList(new String[]{"EG", "DZ", "MA", "TN", "LY", "YE", "SS", "DJ", "CMR", "SO", "MR", "SD", "SA", "AE", "OM", "KW", "QA", "BH", "JO", "LB", "PS", "IQ", "SY"});

    /* renamed from: x */
    private static List<String> f10807x = Arrays.asList(new String[]{"US", "GB"});

    /* renamed from: a */
    public static Locale m9702a(Context context) {
        Locale locale = null;
        if (context == null) {
            return null;
        }
        try {
            Locale locale2 = (Locale) C2942b.m8369a().mo34884a(C10753b.m21793a(context).mo19442a("sp_lanuage_last_select_tag", ""), Locale.class);
            if (locale2 instanceof Locale) {
                locale = locale2;
            }
        } catch (Exception unused) {
        }
        return locale;
    }
}
