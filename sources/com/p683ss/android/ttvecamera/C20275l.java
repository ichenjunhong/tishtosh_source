package com.p683ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.l */
public final class C20275l {

    /* renamed from: E */
    public static final int[] f55713E = {2, 0, 1, 3};

    /* renamed from: F */
    public static final int[] f55714F = {1, 2, 0, 3};

    /* renamed from: a */
    public static final String[] f55715a = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};

    /* renamed from: A */
    public int f55716A = 0;

    /* renamed from: B */
    public boolean f55717B = true;

    /* renamed from: C */
    public int f55718C = 0;

    /* renamed from: D */
    public String f55719D = "auto";

    /* renamed from: b */
    public Context f55720b;

    /* renamed from: c */
    public int f55721c = 1;

    /* renamed from: d */
    public C20295o f55722d = new C20295o(7, 30);

    /* renamed from: e */
    public int f55723e = 0;

    /* renamed from: f */
    public int f55724f = 0;

    /* renamed from: g */
    public int f55725g = -1;

    /* renamed from: h */
    public int f55726h = 17;

    /* renamed from: i */
    public boolean f55727i = false;

    /* renamed from: j */
    public TEFrameSizei f55728j = new TEFrameSizei(1280, 720);

    /* renamed from: k */
    public TEFrameSizei f55729k = new TEFrameSizei(1920, 1080);

    /* renamed from: l */
    public int f55730l = 1;

    /* renamed from: m */
    public int f55731m = 0;

    /* renamed from: n */
    public int f55732n = 0;

    /* renamed from: o */
    public boolean f55733o = false;

    /* renamed from: p */
    public int f55734p = 0;

    /* renamed from: q */
    public int f55735q = 1;

    /* renamed from: r */
    public int f55736r = 1;

    /* renamed from: s */
    public Bundle f55737s = new Bundle();

    /* renamed from: t */
    public byte f55738t = 1;

    /* renamed from: u */
    public String f55739u = "auto";

    /* renamed from: v */
    public String f55740v = "0";

    /* renamed from: w */
    public String f55741w = "-1";

    /* renamed from: x */
    public C20276a f55742x = new C20276a();

    /* renamed from: y */
    public boolean f55743y = true;

    /* renamed from: z */
    public int f55744z = 0;

    /* renamed from: com.ss.android.ttvecamera.l$a */
    public static class C20276a {

        /* renamed from: a */
        public int f55745a;

        /* renamed from: b */
        public int f55746b;

        /* renamed from: c */
        public int f55747c;

        /* renamed from: d */
        public float f55748d;

        /* renamed from: a */
        public final boolean mo42918a() {
            if (this.f55745a <= this.f55747c || this.f55748d <= 0.001f) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.l$b */
    public interface C20277b {
        /* renamed from: a */
        void mo42919a(float[] fArr);
    }

    /* renamed from: com.ss.android.ttvecamera.l$c */
    public static final class C20278c {

        /* renamed from: a */
        static final Map<String, Class> f55749a;

        static {
            HashMap hashMap = new HashMap();
            f55749a = hashMap;
            hashMap.put("facing", Integer.class);
            f55749a.put("support_light_soft", Boolean.class);
            f55749a.put("device_support_wide_angle", Boolean.class);
            f55749a.put("device_support_camera", Boolean.class);
            f55749a.put("support_wide_angle", Boolean.class);
            f55749a.put("support_body_beauty", Boolean.class);
            f55749a.put("support_anti_shake", Boolean.class);
            f55749a.put("support_fps_480", Boolean.class);
            f55749a.put("support_fps_120", Boolean.class);
            f55749a.put("support_fps_60", Boolean.class);
            f55749a.put("support_preview_sizes", ArrayList.class);
            f55749a.put("support_picture_sizes", ArrayList.class);
            f55749a.put("camera_preview_size", TEFrameSizei.class);
            f55749a.put("camera_focus_parameters", TEFocusParameters.class);
            f55749a.put("camera_torch_supported", Boolean.class);
        }
    }

    /* renamed from: com.ss.android.ttvecamera.l$d */
    public static class C20279d {

        /* renamed from: a */
        public int f55750a;
    }

    /* renamed from: com.ss.android.ttvecamera.l$e */
    public static final class C20280e {

        /* renamed from: a */
        private static final Map<String, Class> f55751a;

        static {
            HashMap hashMap = new HashMap();
            f55751a = hashMap;
            hashMap.put("enable_body_beauty", Boolean.class);
            f55751a.put("enable_light_soft", Boolean.class);
            f55751a.put("enable_anti_shake", Boolean.class);
            f55751a.put("video_path", String.class);
            f55751a.put("body_beauty_level", Integer.class);
            f55751a.put("enable_dim_light_quality", Boolean.class);
        }

        /* renamed from: a */
        public static boolean m50037a(String str, Object obj) {
            if (!f55751a.containsKey(str) || (obj != null && obj.getClass() != f55751a.get(str))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.l$f */
    public interface C20281f {
    }

    /* renamed from: com.ss.android.ttvecamera.l$g */
    public interface C20282g {
        /* renamed from: a */
        void mo42920a(int i, float f);
    }

    /* renamed from: com.ss.android.ttvecamera.l$h */
    public interface C20283h {
    }

    /* renamed from: com.ss.android.ttvecamera.l$i */
    public interface C20284i {
        /* renamed from: a */
        void mo42921a(int i, float f, boolean z);

        /* renamed from: a */
        void mo42922a(int i, boolean z, boolean z2, float f, List<Integer> list);

        /* renamed from: a */
        boolean mo42923a();
    }

    public C20275l(Context context) {
        this.f55720b = context;
    }

    public C20275l(Context context, int i) {
        this.f55720b = context;
        this.f55721c = i;
    }

    public C20275l(Context context, int i, int i2, int i3) {
        this.f55720b = context;
        this.f55721c = i;
        this.f55728j.f55398a = i2;
        this.f55728j.f55399b = i3;
    }
}
