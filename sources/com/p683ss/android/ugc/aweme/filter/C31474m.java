package com.p683ss.android.ugc.aweme.filter;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.filter.m */
public final class C31474m {

    /* renamed from: a */
    private static final String f82361a = new File(C39629l.m88233b().getFilesDir(), "filter").getAbsolutePath();

    /* renamed from: b */
    private static final String f82362b = new File(f82361a, "face_reshape").getAbsolutePath();

    /* renamed from: c */
    private static final String f82363c = new File(f82361a, "Qinyan").getAbsolutePath();

    /* renamed from: d */
    private static final String f82364d = new File(f82361a, "contour").getAbsolutePath();

    /* renamed from: a */
    public static String m73302a() {
        StringBuilder sb = new StringBuilder();
        sb.append(f82362b);
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m73306b() {
        C39629l.m88232a().mo58574e().mo83116a(C40796a.UlikeBeautyCopied, false);
        C39629l.m88232a().mo58574e().mo83116a(C40796a.ContourModelCopied, false);
        C39629l.m88232a().mo58574e().mo83116a(C40796a.ReshapeModelCopied, false);
    }

    /* renamed from: d */
    private static boolean m73308d() {
        if (C39629l.m88232a().mo58574e().mo83118b(C40796a.EffectResourceVersion) == 3 && C39629l.m88232a().mo58574e().mo83117a(C40796a.ContourModelCopied)) {
            return true;
        }
        AssetManager assets = C39629l.m88233b().getAssets();
        String str = "Contour_2D";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(f82364d);
            sb.append("/");
            m73304a(assets, str, sb.toString());
            C39629l.m88232a().mo58574e().mo83116a(C40796a.ContourModelCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m73309e() {
        if (C39629l.m88232a().mo58574e().mo83118b(C40796a.EffectResourceVersion) == 3 && C39629l.m88232a().mo58574e().mo83117a(C40796a.UlikeBeautyCopied)) {
            return true;
        }
        try {
            C50205i.m108369a(C39629l.m88233b().getAssets().open("Qinyan.zip"), f82363c);
            C39629l.m88232a().mo58574e().mo83116a(C40796a.UlikeBeautyCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }

    static {
        File file = new File(f82361a);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(f82362b);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(f82363c);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        File file4 = new File(f82364d);
        if (file4.exists()) {
            file4.mkdirs();
        }
        m73309e();
        m73307c();
        m73308d();
        C39629l.m88232a().mo58574e().mo83113a(C40796a.EffectResourceVersion, 3);
    }

    /* renamed from: c */
    private static boolean m73307c() {
        boolean z;
        if (!new File(f82362b, FilterModel.CONFIG_FILE).exists() || !new File(f82362b, "distortion.json").exists()) {
            z = false;
        } else {
            z = true;
        }
        if (C39629l.m88232a().mo58574e().mo83117a(C40796a.ReshapeModelCopied) && z) {
            return true;
        }
        AssetManager assets = C39629l.m88233b().getAssets();
        try {
            File file = new File(f82362b, FilterModel.CONFIG_FILE);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            if (!C50200d.m108345a(assets.open("FaceReshape_V2/config.json"), (OutputStream) new FileOutputStream(file))) {
                return false;
            }
            File file2 = new File(f82362b, "distortion.json");
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            if (!C50200d.m108345a(assets.open("FaceReshape_V2/distortion.json"), (OutputStream) new FileOutputStream(file2))) {
                return false;
            }
            C39629l.m88232a().mo58574e().mo83116a(C40796a.ReshapeModelCopied, true);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m73305b(int i) {
        if (i != 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C43307ea.f109507t);
        sb.append("beautify_filter_korean");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m73303a(int i) {
        if (i != 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C43307ea.f109507t);
        sb.append("beautify_filter");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m73304a(AssetManager assetManager, String str, String str2) throws IOException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = File.separator;
            String[] list = assetManager.list(str);
            if (list == null || list.length <= 0) {
                C50200d.m108345a(assetManager.open(str), (OutputStream) new FileOutputStream(str2));
                return;
            }
            File file = new File(str2);
            if (file.exists() || file.mkdirs()) {
                for (String str4 : list) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str3);
                    sb.append(str4);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(str3);
                    sb3.append(str4);
                    m73304a(assetManager, sb2, sb3.toString());
                }
            }
        }
    }
}
