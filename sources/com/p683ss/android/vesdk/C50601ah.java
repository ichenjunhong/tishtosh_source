package com.p683ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.opengl.EGLContext;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.presenter.C19378e;
import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ttve.model.VEFrame;
import com.p683ss.android.ttve.model.VEFrame.C20091a;
import com.p683ss.android.ttve.model.VEFrame.C20093c;
import com.p683ss.android.ttve.monitor.C20102a;
import com.p683ss.android.ttve.monitor.C20110e;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.vesdk.VEListener.C50542f;
import com.p683ss.android.vesdk.VEListener.C50546j;
import com.p683ss.android.vesdk.VEListener.C50560x;
import com.p683ss.android.vesdk.faceinfo.C50692b;
import com.p683ss.android.vesdk.faceinfo.C50695d;
import com.p683ss.android.vesdk.model.BefTextLayout;
import com.p683ss.android.vesdk.model.BefTextLayoutResult;
import com.p683ss.android.vesdk.p2531a.C50589a;
import com.p683ss.android.vesdk.p2531a.C50590b;
import com.p683ss.android.vesdk.p2534d.C50660a;
import com.p683ss.android.vesdk.p2535e.C50686a;
import com.p683ss.android.vesdk.p2535e.C50687b;
import com.p683ss.android.vesdk.p2535e.C50688c;
import com.p683ss.android.vesdk.p2535e.C50689d;
import com.p683ss.android.vesdk.runtime.C50771d;
import com.p683ss.android.vesdk.runtime.VERuntime;
import com.p683ss.android.vesdk.utils.C50786b;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.ah */
public final class C50601ah {

    /* renamed from: a */
    public C50771d f126877a;

    /* renamed from: b */
    protected C50690f f126878b;

    /* renamed from: c */
    private VERuntime f126879c;

    /* renamed from: com.ss.android.vesdk.ah$a */
    public interface C50612a {
    }

    /* renamed from: com.ss.android.vesdk.ah$b */
    public interface C50613b {
        /* renamed from: a */
        void mo43337a(int i);
    }

    /* renamed from: com.ss.android.vesdk.ah$c */
    public interface C50614c {
        /* renamed from: a */
        BefTextLayoutResult mo42959a(String str, BefTextLayout befTextLayout);
    }

    /* renamed from: com.ss.android.vesdk.ah$d */
    public interface C50615d {
        /* renamed from: a */
        void mo43539a(int i);

        /* renamed from: a */
        void mo43540a(String[] strArr);
    }

    /* renamed from: com.ss.android.vesdk.ah$e */
    public interface C50616e {
        /* renamed from: a */
        void mo43761a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j);

        /* renamed from: a */
        boolean mo43762a();
    }

    /* renamed from: com.ss.android.vesdk.ah$f */
    public interface C50617f {

        /* renamed from: com.ss.android.vesdk.ah$f$a */
        public static class C50618a {

            /* renamed from: a */
            public boolean f126903a;

            /* renamed from: b */
            public C20091a f126904b = C20091a.TEPixFmt_OpenGL_RGBA8;
        }

        /* renamed from: a */
        C50618a mo98902a();

        /* renamed from: a */
        void mo98903a(VEFrame vEFrame);
    }

    /* renamed from: com.ss.android.vesdk.ah$g */
    public interface C50619g {
        /* renamed from: a */
        void mo43390a(int i, float f, boolean z);

        /* renamed from: a */
        void mo43391a(int i, boolean z, boolean z2, float f, List<Integer> list);

        /* renamed from: a */
        boolean mo43392a();
    }

    /* renamed from: com.ss.android.vesdk.ah$h */
    public interface C50620h {
        /* renamed from: a */
        void mo43538a(String[] strArr, double[] dArr, boolean[] zArr);
    }

    /* renamed from: com.ss.android.vesdk.ah$i */
    public interface C50621i {
        /* renamed from: a */
        void mo43758a(SparseArray<Long> sparseArray, float f);
    }

    /* renamed from: com.ss.android.vesdk.ah$j */
    public interface C50622j {
        /* renamed from: a */
        void mo43760a(C50692b bVar, C50695d dVar);
    }

    /* renamed from: com.ss.android.vesdk.ah$k */
    public interface C50623k {
    }

    /* renamed from: com.ss.android.vesdk.ah$l */
    public interface C50624l {
    }

    /* renamed from: com.ss.android.vesdk.ah$m */
    public interface C50625m {
        /* renamed from: a */
        void mo43397a(int i, float f);
    }

    /* renamed from: com.ss.android.vesdk.ah$n */
    public interface C50626n {
    }

    /* renamed from: com.ss.android.vesdk.ah$o */
    public interface C50627o {
        /* renamed from: a */
        void mo43756a(boolean z);
    }

    /* renamed from: a */
    public final void mo98796a(C50560x xVar) {
        this.f126878b.f127125B = xVar;
    }

    /* renamed from: a */
    public final int mo98759a(C50589a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C50595ad adVar) {
        try {
            return this.f126878b.mo99065a((C50589a) null, vEVideoEncodeSettings, vEAudioEncodeSettings, adVar, this.f126877a.mo43564a(), this.f126879c.f127477e.mo99454a());
        } catch (NullPointerException unused) {
            throw new C50751p(-1, "init failed: VESDK need to be init");
        }
    }

    /* renamed from: a */
    public final int mo98762a(C50771d dVar) {
        int a = this.f126878b.mo99066a(dVar);
        if (a == 0) {
            this.f126877a = dVar;
        }
        return a;
    }

    /* renamed from: a */
    public final void mo98792a(VECameraSettings vECameraSettings) {
        this.f126878b.f127142S = vECameraSettings;
    }

    /* renamed from: a */
    public final void mo98815a(boolean z) {
        this.f126878b.f127146W = z;
    }

    /* renamed from: a */
    public final void mo98806a(C50719n nVar) {
        C50690f fVar = this.f126878b;
        fVar.f127147X = nVar;
        fVar.f127149Z = C50600ag.DUET;
        try {
            C20102a.m49612a("vesdk_event_recorder_init_duet", new JSONObject(nVar.toString()), "behavior");
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo98818a() {
        return this.f126878b.mo99013m();
    }

    /* renamed from: a */
    public final void mo98799a(C50599af afVar) {
        C50690f fVar = this.f126878b;
        fVar.f127148Y = afVar;
        fVar.f127149Z = C50600ag.REACTION;
    }

    /* renamed from: a */
    public final void mo98784a(int i, int i2) {
        this.f126878b.mo98981c(i, -1);
    }

    /* renamed from: a */
    public final void mo98785a(int i, int i2, int i3, int i4) {
        this.f126878b.mo98942a(i, i2, i3, i4);
    }

    /* renamed from: b */
    public final int[] mo98840b() {
        return this.f126878b.mo99015n();
    }

    /* renamed from: a */
    public final int[] mo98820a(int i, int i2, int i3, int i4, float f) {
        return this.f126878b.mo98962a(i, i2, i3, i4, f);
    }

    /* renamed from: b */
    public final boolean mo98839b(int i, int i2) {
        return this.f126878b.mo98993d(i, i2);
    }

    /* renamed from: a */
    public final void mo98779a(double d) {
        this.f126878b.mo98937a(d);
    }

    /* renamed from: a */
    public final void mo98813a(String str, String str2, String str3) {
        this.f126878b.mo98958a(str, str2, str3);
    }

    /* renamed from: a */
    public final int mo98766a(String str, int i, int i2, int i3) {
        return this.f126878b.mo98928a(str, (long) i, -1, 2);
    }

    /* renamed from: a */
    public final int mo98771a(List<C50632am> list, String str, int i, int i2) {
        return this.f126878b.mo98931a(list, str, i, 2);
    }

    /* renamed from: a */
    public final void mo98814a(List<C50632am> list, String str, int i, int i2, C50542f fVar) {
        this.f126878b.mo99070a(list, str, i, 2, fVar);
    }

    /* renamed from: a */
    public final void mo98782a(final float f, final C50542f fVar) {
        this.f126878b.mo98940a(f, (C50542f) new C50542f() {
            /* renamed from: a */
            public final void mo43336a(int i) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("speed", (double) f);
                    jSONObject.put("resultCode", i);
                    C20102a.m49612a("vesdk_event_recorder_start_record_async", jSONObject, "behavior");
                } catch (JSONException unused) {
                }
                fVar.mo43336a(i);
            }
        });
    }

    /* renamed from: a */
    public final void mo98794a(final C50542f fVar) {
        this.f126878b.mo98972b((C50542f) new C50542f() {
            /* renamed from: a */
            public final void mo43336a(int i) {
                int i2;
                JSONObject jSONObject = new JSONObject();
                String str = "resultCode";
                if (i > 0) {
                    i2 = 0;
                } else {
                    i2 = -1;
                }
                try {
                    jSONObject.put(str, i2);
                    C20102a.m49612a("vesdk_event_recorder_record_finish", jSONObject, "behavior");
                } catch (JSONException unused) {
                }
                fVar.mo43336a(i);
            }
        });
    }

    /* renamed from: a */
    public final void mo98795a(C50546j jVar) {
        mo98787a(0, "", "", jVar);
    }

    /* renamed from: a */
    public final void mo98787a(int i, String str, String str2, C50546j jVar) {
        m108972a(0, str, str2, jVar, -1);
    }

    /* renamed from: a */
    public final void mo98809a(String str, int i, int i2, boolean z, boolean z2, CompressFormat compressFormat, C50613b bVar, boolean z3) {
        final int i3 = i;
        final int i4 = i2;
        final boolean z4 = z3;
        final C50613b bVar2 = bVar;
        C506097 r0 = new C50613b() {
            /* renamed from: a */
            public final void mo43337a(int i) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("width", i3);
                    jSONObject.put("height", i4);
                    if (z4) {
                        jSONObject.put("tag", "takePicture");
                        C20102a.m49612a("vesdk_event_recorder_take_picture", jSONObject, "behavior");
                    } else {
                        jSONObject.put("tag", "shotScreen");
                        C20102a.m49612a("vesdk_event_recorder_shot_screen", jSONObject, "behavior");
                    }
                } catch (JSONException unused) {
                }
                bVar2.mo43337a(i);
            }
        };
        this.f126878b.mo98927a(str, i3, i4, false, z2, compressFormat, r0, false);
    }

    /* renamed from: a */
    public final void mo98797a(C50590b bVar) {
        this.f126878b.mo99067a(bVar);
    }

    /* renamed from: a */
    public final void mo98788a(Surface surface) {
        this.f126878b.mo98982c(surface);
    }

    /* renamed from: a */
    public final void mo98789a(Surface surface, final C50542f fVar) {
        this.f126878b.mo98944a(surface, (C50542f) new C50542f() {
            /* renamed from: a */
            public final void mo43336a(int i) {
                fVar.mo43336a(i);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", i);
                    C20102a.m49612a("vesdk_event_recorder_start_preview_async", jSONObject, "behavior");
                } catch (JSONException unused) {
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo98835b(C50542f fVar) {
        this.f126878b.mo98948a(fVar);
    }

    /* renamed from: b */
    public final void mo98834b(Surface surface) {
        this.f126878b.mo98988d(surface);
    }

    /* renamed from: a */
    public final void mo98805a(C50636ap apVar) {
        this.f126878b.mo98953a(apVar);
    }

    /* renamed from: a */
    public final int mo98764a(String str, float f) {
        C50660a aVar = new C50660a();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str2 = split[split.length - 1];
            }
        }
        float min = Math.min(1.0f, Math.max(f, 0.0f));
        if (min < 0.0f) {
            min = -1.0f;
        }
        aVar.mo99062a("iesve_verecorder_set_filter_click_idfilter_id", str2).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_filter_click", 1, aVar);
        this.f126878b.mo98922a(str, min);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("filterId", str2);
            jSONObject.put("intensity", String.valueOf(min));
            jSONObject.put("tag", "setFilterNew");
            jSONObject.put("resultCode", 0);
            C20102a.m49612a("vesdk_event_recorder_single_filter", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo98763a(String str) {
        return m108971a(str, 0.0f, true);
    }

    /* renamed from: a */
    public final void mo98811a(String str, String str2, float f) {
        C50660a aVar = new C50660a();
        String str3 = "";
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] split2 = str2.split(File.separator);
            if (split2.length > 0) {
                str4 = split2[split2.length - 1];
            }
        }
        aVar.mo99062a("iesve_verecorder_set_filter_slide_left_id", str3).mo99062a("iesve_verecorder_set_filter_slide_right_id", str4).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_filter_slide", 1, aVar);
        this.f126878b.mo98956a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo98812a(String str, String str2, float f, float f2, float f3) {
        C50660a aVar = new C50660a();
        String str3 = "";
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String str5 = str;
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        } else {
            String str6 = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            String str7 = str2;
            String[] split2 = str2.split(File.separator);
            if (split2.length > 0) {
                str4 = split2[split2.length - 1];
            }
        } else {
            String str8 = str2;
        }
        float f4 = 1.0f;
        float f5 = f2 > 1.0f ? 1.0f : f2;
        if (f3 <= 1.0f) {
            f4 = f3;
        }
        float f6 = f5 < 0.0f ? -1.0f : f5;
        if (f4 < 0.0f) {
            f4 = -1.0f;
        }
        aVar.mo99062a("iesve_verecorder_set_filter_slide_left_id", str3).mo99062a("iesve_verecorder_set_filter_slide_right_id", str4).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_filter_slide", 1, aVar);
        this.f126878b.mo98957a(str, str2, f, f6, f4);
    }

    /* renamed from: a */
    public final int mo98765a(String str, float f, float f2) {
        C50660a aVar = new C50660a();
        aVar.mo99060a("iesve_verecorder_set_bigeyes_smallface_level", f).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_bigeyes_smallface", 1, aVar);
        int a = this.f126878b.mo98923a(str, f, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("fEyeIntensity", String.valueOf(f));
            jSONObject.put("fCheekIntensity", String.valueOf(f2));
            jSONObject.put("resultCode", a);
            C20102a.m49612a("vesdk_event_recorder_face_reshape", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: a */
    public final int mo98772a(Map<Integer, Float> map) {
        return this.f126878b.mo98932a(map);
    }

    /* renamed from: a */
    public final int mo98770a(String str, Map<Integer, Float> map) {
        return this.f126878b.mo98930a(str, map);
    }

    /* renamed from: a */
    public final void mo98798a(C50594ac acVar, VESize vESize, VESize vESize2, VESize vESize3, int i, Context context) {
        final View view;
        float f;
        int a = C50786b.m109900a(context);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        if (a * 16 == i2 * 9) {
            if (acVar == C50594ac.RADIO_FULL) {
                acVar = C50594ac.RADIO_9_16;
            }
            if (this.f126878b.f127161ae == C50594ac.RADIO_FULL.ordinal()) {
                this.f126878b.f127161ae = C50594ac.RADIO_9_16.ordinal();
            }
        }
        if (acVar.ordinal() != this.f126878b.f127161ae || this.f126878b.f127142S == null) {
            VESize vESize4 = new VESize(vESize.width, vESize.height);
            boolean z = true;
            if (!(this.f126878b.f127161ae == C50594ac.RADIO_9_16.ordinal() || acVar == C50594ac.RADIO_9_16 || this.f126878b.f127161ae == C50594ac.RADIO_FULL.ordinal() || acVar == C50594ac.RADIO_FULL)) {
                z = false;
            }
            if (this.f126878b.f127163ag) {
                z = false;
            }
            if (this.f126878b.f127184z instanceof C50686a) {
                view = ((C50686a) this.f126878b.f127184z).f127116a;
            } else if (this.f126878b.f127184z instanceof C50687b) {
                view = ((C50687b) this.f126878b.f127184z).f127117a;
            } else {
                throw new AndroidRuntimeException("renderView not support!");
            }
            switch (acVar) {
                case RADIO_9_16:
                    f = 0.5625f;
                    if (vESize.width * 16 == vESize.height * 9) {
                        view.getLayoutParams().width = a;
                        view.getLayoutParams().height = (int) ((((float) a) / 9.0f) * 16.0f);
                        break;
                    } else {
                        C50792y.m109914d("VERecorder", "previewSize is not fit with PREVIEW_RADIO!");
                        return;
                    }
                case RADIO_3_4:
                case RADIO_1_1:
                case RADIO_ROUND:
                    f = 0.75f;
                    if (vESize.width * 4 == vESize.height * 3) {
                        view.getLayoutParams().width = a;
                        view.getLayoutParams().height = (int) ((((float) a) / 3.0f) * 4.0f);
                        break;
                    } else {
                        C50792y.m109914d("VERecorder", "previewSize is not fit with PREVIEW_RADIO!");
                        return;
                    }
                case RADIO_FULL:
                    f = (((float) a) * 1.0f) / ((float) i2);
                    view.getLayoutParams().width = a;
                    view.getLayoutParams().height = -1;
                    break;
                default:
                    f = 1.0f;
                    break;
            }
            if (acVar == C50594ac.RADIO_1_1 || acVar == C50594ac.RADIO_ROUND) {
                vESize4.height = vESize4.width;
            }
            int i3 = 720;
            if (vESize4.width >= 720) {
                float f2 = (((float) vESize4.height) * 1.0f) / ((float) vESize4.width);
                if (this.f126878b.f127184z.f127120c < 720) {
                    i3 = this.f126878b.f127184z.f127120c;
                }
                vESize4.width = i3;
                vESize4.height = (int) (((float) vESize4.width) * f2);
            }
            if (this.f126878b.f127142S == null) {
                z = false;
            }
            if (z) {
                this.f126878b.mo98941a(acVar.ordinal(), f, vESize, vESize4);
                this.f126878b.f127184z.mo99107a((C50689d) new C50689d() {
                    /* renamed from: a */
                    public final void mo98904a(Surface surface) {
                    }

                    /* renamed from: b */
                    public final void mo98906b(Surface surface) {
                    }

                    /* renamed from: a */
                    public final void mo98905a(Surface surface, int i, int i2, int i3) {
                        C50601ah.this.f126878b.mo98944a(surface, (C50542f) null);
                        C50601ah.this.f126878b.f127184z.mo99108b((C50689d) this);
                    }
                });
                this.f126878b.mo98948a((C50542f) new C50542f() {
                    /* renamed from: a */
                    public final void mo43336a(int i) {
                        view.post(new Runnable() {
                            public final void run() {
                                view.requestLayout();
                            }
                        });
                    }
                });
            } else {
                if ((this.f126878b.f127161ae == C50594ac.RADIO_9_16.ordinal() && acVar == C50594ac.RADIO_FULL) || ((this.f126878b.f127161ae == C50594ac.RADIO_FULL.ordinal() && acVar == C50594ac.RADIO_9_16) || this.f126878b.f127163ag)) {
                    view.requestLayout();
                }
                if (!this.f126878b.f127163ag) {
                    this.f126878b.mo98941a(acVar.ordinal(), 0.0f, (VESize) null, vESize4);
                }
                this.f126878b.f127163ag = false;
            }
            this.f126878b.f127161ae = acVar.ordinal();
        }
    }

    /* renamed from: a */
    public final int mo98768a(String str, int i, int i2, boolean z) {
        return mo98767a(str, i, i2, "");
    }

    /* renamed from: a */
    public final int mo98767a(String str, int i, int i2, String str2) {
        C50660a aVar = new C50660a();
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str4 = split[split.length - 1];
            }
        }
        aVar.mo99062a("iesve_verecorder_set_sticker_id", TextUtils.isEmpty(str4) ? "0" : str4).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_sticker", 1, aVar);
        int a = this.f126878b.mo98926a(str, i, i2, false, str3);
        try {
            JSONObject jSONObject = new JSONObject();
            String str5 = "stickerId";
            if (TextUtils.isEmpty(str4)) {
                str4 = "0";
            }
            jSONObject.put(str5, str4);
            jSONObject.put("resultCode", a);
            C20102a.m49612a("vesdk_event_recorder_switch_effect", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: a */
    public final int mo98769a(String str, int i, int i2, boolean z, String str2) {
        C50660a aVar = new C50660a();
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str4 = split[split.length - 1];
            }
        }
        aVar.mo99062a("iesve_verecorder_set_sticker_id", TextUtils.isEmpty(str4) ? "0" : str4).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_sticker", 1, aVar);
        int a = this.f126878b.mo98926a(str, i, i2, z, str3);
        try {
            JSONObject jSONObject = new JSONObject();
            String str5 = "stickerId";
            if (TextUtils.isEmpty(str4)) {
                str4 = "0";
            }
            jSONObject.put(str5, str4);
            jSONObject.put("resultCode", a);
            C20102a.m49612a("vesdk_event_recorder_switch_effect", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: a */
    public final void mo98791a(IStickerRequestCallback iStickerRequestCallback) {
        this.f126878b.mo98946a(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo98803a(C50622j jVar) {
        this.f126878b.mo98952a(jVar);
    }

    /* renamed from: a */
    public final void mo98802a(C50621i iVar) {
        this.f126878b.mo98951a(iVar);
    }

    /* renamed from: a */
    public final void mo98801a(C50620h hVar) {
        this.f126878b.mo98950a(hVar);
    }

    /* renamed from: a */
    public final void mo98793a(VECherEffectParam vECherEffectParam) {
        this.f126878b.mo98947a(vECherEffectParam);
    }

    /* renamed from: a */
    public final void mo98786a(int i, long j, long j2, String str) {
        this.f126878b.mo98943a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo98790a(C2593a aVar) {
        this.f126878b.mo98945a(aVar);
    }

    /* renamed from: a */
    public final void mo98817a(float[] fArr, double d) {
        this.f126878b.mo99071a(fArr, d);
    }

    /* renamed from: a */
    public final void mo98808a(Runnable runnable) {
        this.f126878b.mo98954a(runnable);
    }

    /* renamed from: a */
    public final void mo98780a(float f, float f2, float f3) {
        this.f126878b.mo98938a(f, f2, f3);
    }

    /* renamed from: a */
    public final void mo98804a(C50627o oVar) {
        C50690f fVar = this.f126878b;
        if (oVar != null) {
            fVar.f127138O.mo98727a(oVar);
        }
    }

    /* renamed from: b */
    public final void mo98836b(C50627o oVar) {
        this.f126878b.f127138O.mo98729b(oVar);
    }

    /* renamed from: a */
    public final int mo98773a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        return mo98774a(z2, z3, z4, z5);
    }

    /* renamed from: a */
    public final int mo98774a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f126878b.mo98933a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final int mo98775a(double[] dArr, double d) {
        return this.f126878b.mo98934a(dArr, d);
    }

    /* renamed from: a */
    public final int mo98761a(C50615d dVar) {
        return this.f126878b.mo98920a(dVar);
    }

    /* renamed from: a */
    public final int mo98760a(C50614c cVar) {
        return this.f126878b.mo98919a(cVar);
    }

    /* renamed from: a */
    public final void mo98783a(int i) {
        this.f126878b.mo99072b(i);
    }

    /* renamed from: a */
    public final void mo98807a(C50790w wVar) {
        this.f126878b.mo99068a(wVar);
    }

    /* renamed from: b */
    public final void mo98837b(C50790w wVar) {
        this.f126878b.mo99074b(wVar);
    }

    /* renamed from: b */
    public final void mo98833b(int i) {
        this.f126878b.mo99075d(i);
    }

    /* renamed from: a */
    public final void mo98800a(final C50616e eVar) {
        C50617f fVar;
        if (eVar == null) {
            fVar = null;
        } else {
            fVar = new C50617f() {
                /* renamed from: a */
                public final C50618a mo98902a() {
                    boolean z;
                    C50618a aVar = new C50618a();
                    aVar.f126904b = C20091a.TEPixFmt_OpenGL_RGBA8;
                    if (eVar == null || !eVar.mo43762a()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    aVar.f126903a = z;
                    return aVar;
                }

                /* renamed from: a */
                public final void mo98903a(VEFrame vEFrame) {
                    if (eVar != null) {
                        if (vEFrame == null || vEFrame.getFormat() != C20091a.TEPixFmt_OpenGL_RGBA8) {
                            eVar.mo43761a(null, 0, 10, 0, 0, 0);
                            return;
                        }
                        C20093c cVar = (C20093c) vEFrame.getFrame();
                        eVar.mo43761a(cVar.f55238a, cVar.f55239b, 10, vEFrame.getWidth(), vEFrame.getHeight(), vEFrame.getTimeStamp());
                    }
                }
            };
        }
        this.f126878b.mo98949a(fVar);
    }

    /* renamed from: a */
    public final void mo98810a(String str, String str2) {
        this.f126878b.mo98955a(str, str2);
    }

    /* renamed from: b */
    public final void mo98838b(String str, String str2) {
        this.f126878b.mo98973b(str, str2);
    }

    /* renamed from: a */
    public final int mo98776a(String[] strArr, int i) {
        return this.f126878b.mo98935a(strArr, 0);
    }

    /* renamed from: a */
    public final int mo98777a(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        C50792y.m109913c("VERecorder", "setComposerNodesWithTag...");
        return this.f126878b.mo98918a(vEEffectParams);
    }

    /* renamed from: b */
    public final int mo98832b(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        C50792y.m109913c("VERecorder", "appendComposerNodes...");
        return this.f126878b.mo98918a(vEEffectParams);
    }

    /* renamed from: a */
    public final int mo98778a(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.intValueTwo = i2;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        vEEffectParams.stringArrayThree = new ArrayList<>(Arrays.asList(strArr3));
        C50792y.m109913c("VERecorder", "replaceComposerNodes...");
        return this.f126878b.mo98918a(vEEffectParams);
    }

    /* renamed from: a */
    public final void mo98781a(float f, float f2, float f3, float f4) {
        this.f126878b.mo98939a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo98816a(boolean z, long j) {
        this.f126878b.mo98959a(z, j);
    }

    /* renamed from: a */
    public final boolean mo98819a(C50634ao aoVar, int i) {
        if (aoVar.f126941b == null || i < 0) {
            return false;
        }
        return this.f126878b.mo98961a(aoVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] mo98821a(int r9, java.lang.String r10, java.lang.String r11) throws com.p683ss.android.vesdk.C50751p {
        /*
            r8 = this;
            com.ss.android.vesdk.runtime.d r9 = r8.f126877a
            r9.mo99456d()
            com.ss.android.vesdk.runtime.d r9 = r8.f126877a
            r9.mo99457e()
            com.ss.android.vesdk.runtime.d r9 = r8.f126877a
            java.lang.String r9 = r9.mo43566b()
            com.ss.android.vesdk.runtime.d r0 = r8.f126877a
            java.lang.String r0 = r0.mo43568c()
            com.p683ss.android.vesdk.C50752q.m109848a(r9)
            com.p683ss.android.vesdk.C50752q.m109848a(r0)
            com.ss.android.vesdk.f r1 = r8.f126878b
            com.ss.android.vesdk.ag r1 = r1.f127149Z
            com.ss.android.vesdk.ag r2 = com.p683ss.android.vesdk.C50600ag.DUET
            if (r1 != r2) goto L_0x002e
            com.ss.android.vesdk.f r1 = r8.f126878b
            java.lang.String r1 = r1.mo98936a()
            if (r1 == 0) goto L_0x002e
            r7 = r1
            goto L_0x002f
        L_0x002e:
            r7 = r0
        L_0x002f:
            com.ss.android.vesdk.f r0 = r8.f126878b
            r6 = -1
            r3 = 0
            r1 = r9
            r2 = r7
            r4 = r10
            r5 = r11
            int r10 = r0.mo98929a(r1, r2, r3, r4, r5, r6)
            if (r10 < 0) goto L_0x0047
            r10 = 2
            java.lang.String[] r10 = new java.lang.String[r10]
            r11 = 0
            r10[r11] = r9
            r9 = 1
            r10[r9] = r7
            return r10
        L_0x0047:
            com.ss.android.vesdk.p r9 = new com.ss.android.vesdk.p
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "concat failed: "
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            r9.<init>(r10, r11)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50601ah.mo98821a(int, java.lang.String, java.lang.String):java.lang.String[]");
    }

    /* renamed from: A */
    public final float mo98748A() {
        return this.f126878b.f127156aG;
    }

    /* renamed from: B */
    public final float[] mo98749B() {
        return this.f126878b.mo99003h();
    }

    /* renamed from: C */
    public final C19378e mo98750C() {
        return this.f126878b.mo99027t();
    }

    /* renamed from: d */
    public final float mo98849d() {
        return this.f126878b.mo99019p();
    }

    /* renamed from: e */
    public final int mo98854e() {
        return this.f126878b.mo99076e();
    }

    /* renamed from: f */
    public final int mo98858f() {
        return this.f126878b.mo99008k();
    }

    /* renamed from: g */
    public final long mo98862g() {
        return this.f126878b.mo99078f();
    }

    /* renamed from: h */
    public final long mo98865h() {
        return this.f126878b.mo98991d();
    }

    /* renamed from: i */
    public final void mo98867i() throws C50751p {
        this.f126878b.mo98971b();
    }

    /* renamed from: j */
    public final void mo98869j() {
        this.f126878b.mo99004i();
    }

    /* renamed from: k */
    public final void mo98871k() {
        this.f126878b.mo99006j();
    }

    /* renamed from: l */
    public final void mo98873l() {
        this.f126878b.mo98979c();
    }

    /* renamed from: m */
    public final void mo98875m() {
        this.f126878b.mo99011l();
    }

    /* renamed from: o */
    public final void mo98879o() {
        this.f126878b.mo99021q();
    }

    /* renamed from: p */
    public final void mo98881p() {
        this.f126878b.mo99023r();
    }

    /* renamed from: r */
    public final int mo98885r() {
        return this.f126878b.f127180ax;
    }

    /* renamed from: s */
    public final int mo98887s() {
        return this.f126878b.f127181ay;
    }

    /* renamed from: t */
    public final int mo98889t() {
        return this.f126878b.f127182az;
    }

    /* renamed from: u */
    public final float mo98891u() {
        return this.f126878b.f127150aA;
    }

    /* renamed from: v */
    public final int mo98893v() {
        return this.f126878b.f127151aB;
    }

    /* renamed from: w */
    public final float mo98895w() {
        return this.f126878b.f127152aC;
    }

    /* renamed from: x */
    public final int mo98897x() {
        return this.f126878b.f127153aD;
    }

    /* renamed from: y */
    public final int mo98899y() {
        return this.f126878b.f127154aE;
    }

    /* renamed from: z */
    public final int mo98900z() {
        return this.f126878b.f127155aF;
    }

    /* renamed from: q */
    public final EnigmaResult mo98884q() {
        return this.f126878b.mo99025s();
    }

    /* renamed from: n */
    public final void mo98877n() {
        C50792y.m109913c("VERecorder", "onDestroy...");
        if (this.f126878b != null) {
            this.f126878b.mo99000g();
        }
        if (this.f126877a != null) {
            C50771d dVar = this.f126877a;
            if (dVar.f127568d != null) {
                dVar.f127568d.clear();
                dVar.f127568d = null;
            }
            if (dVar.f127569e != null) {
                dVar.f127569e.clear();
                dVar.f127569e = null;
            }
        }
    }

    /* renamed from: c */
    public final int[] mo98847c() {
        return this.f126878b.mo99017o();
    }

    /* renamed from: r */
    public final void mo98886r(boolean z) {
        mo98888s(z);
    }

    /* renamed from: n */
    public final void mo98878n(boolean z) {
        this.f126878b.mo99012m(z);
    }

    /* renamed from: q */
    public final int mo98883q(boolean z) {
        return this.f126878b.mo99016o(z);
    }

    /* renamed from: b */
    public final float mo98822b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f126878b.mo98975c(str);
    }

    /* renamed from: g */
    public final void mo98863g(String str) {
        this.f126878b.mo99079f(str);
    }

    /* renamed from: h */
    public final void mo98866h(boolean z) {
        this.f126878b.mo99001g_(z);
    }

    /* renamed from: k */
    public final void mo98872k(boolean z) {
        this.f126878b.mo98992d(z);
    }

    /* renamed from: m */
    public final void mo98876m(boolean z) {
        this.f126878b.mo98983c(z);
    }

    /* renamed from: o */
    public final void mo98880o(boolean z) {
        this.f126878b.mo99022q(z);
    }

    /* renamed from: p */
    public final void mo98882p(boolean z) {
        this.f126878b.mo99084v(z);
    }

    /* renamed from: s */
    public final void mo98888s(boolean z) {
        this.f126878b.mo99020p(z);
    }

    /* renamed from: t */
    public final void mo98890t(boolean z) {
        this.f126878b.mo99024r(z);
    }

    /* renamed from: u */
    public final void mo98892u(boolean z) {
        this.f126878b.mo99026s(z);
    }

    /* renamed from: v */
    public final void mo98894v(boolean z) {
        this.f126878b.mo99085w(z);
    }

    /* renamed from: w */
    public final void mo98896w(boolean z) {
        this.f126878b.mo99028t(z);
    }

    /* renamed from: x */
    public final int mo98898x(boolean z) {
        return this.f126878b.mo98999g(z);
    }

    /* renamed from: a */
    public final int mo98752a(float f) {
        return this.f126878b.mo98969b("", "", f);
    }

    /* renamed from: e */
    public final void mo98857e(boolean z) {
        this.f126878b.mo99009k(z);
    }

    /* renamed from: f */
    public final int mo98860f(String str) {
        return this.f126878b.mo98996e(str);
    }

    /* renamed from: g */
    public final void mo98864g(boolean z) {
        this.f126878b.mo99014n(z);
    }

    /* renamed from: i */
    public final void mo98868i(boolean z) {
        StringBuilder sb = new StringBuilder("enableSceneRecognition:");
        sb.append(z);
        C50792y.m109909a("VERecorder", sb.toString());
        this.f126878b.mo98997e(z);
    }

    /* renamed from: j */
    public final void mo98870j(boolean z) {
        StringBuilder sb = new StringBuilder("enableExpressDetect:");
        sb.append(z);
        C50792y.m109909a("VERecorder", sb.toString());
        this.f126878b.mo98998f(z);
    }

    /* renamed from: b */
    public final int mo98824b(float f) {
        int b = this.f126878b.mo98964b(f);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("intensity", (double) f);
            jSONObject.put("resultCode", b);
            C20102a.m49612a("vesdk_event_recorder_skintone_intensity", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return b;
    }

    /* renamed from: c */
    public final int mo98844c(String str) {
        return this.f126878b.mo98921a(str);
    }

    /* renamed from: d */
    public final int mo98851d(String str) {
        StringBuilder sb = new StringBuilder("setFaceMakeUp: ");
        sb.append(str);
        C50792y.m109909a("VERecorder", sb.toString());
        int b = this.f126878b.mo98967b(str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("resultCode", b);
            C20102a.m49612a("vesdk_event_recorder_face_make_up", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return b;
    }

    /* renamed from: e */
    public final int mo98856e(String str) {
        int d = this.f126878b.mo98989d(str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("skinToneResPath", str);
            jSONObject.put("resultCode", String.valueOf(d));
            C20102a.m49612a("vesdk_event_recorder_skintone", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return d;
    }

    /* renamed from: f */
    public final void mo98861f(boolean z) {
        this.f126878b.mo99002h(z);
    }

    /* renamed from: l */
    public final boolean mo98874l(boolean z) {
        C50660a aVar = new C50660a();
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        aVar.mo99062a("iesve_verecorder_use_sharedtexture", sb.toString()).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_use_sharedtexture", 1, aVar);
        return this.f126878b.mo98974b(z);
    }

    /* renamed from: b */
    public final int mo98826b(C50615d dVar) {
        return this.f126878b.mo98966b(dVar);
    }

    /* renamed from: c */
    public final void mo98845c(int i) {
        this.f126878b.mo98980c(i);
    }

    /* renamed from: d */
    public final void mo98853d(boolean z) {
        this.f126878b.mo99007j(true);
    }

    /* renamed from: c */
    public final void mo98846c(boolean z) {
        this.f126878b.mo99005i(z);
    }

    /* renamed from: b */
    public final int mo98830b(boolean z) {
        return this.f126878b.mo99081u(z);
    }

    /* renamed from: a */
    public final int mo98758a(Bitmap bitmap) {
        return this.f126878b.mo99064a(bitmap);
    }

    public C50601ah(C50771d dVar, Context context) {
        this(dVar, context, null);
    }

    /* renamed from: b */
    public final int mo98825b(float f, float f2) {
        return this.f126878b.mo98965b(f, f2);
    }

    /* renamed from: c */
    public final int mo98842c(float f, float f2) {
        return mo98825b(f, f2);
    }

    /* renamed from: d */
    public final int mo98850d(float f, float f2) {
        return this.f126878b.mo98977c(f, f2);
    }

    /* renamed from: e */
    public final int mo98855e(float f, float f2) {
        return this.f126878b.mo98987d(f, f2);
    }

    /* renamed from: f */
    public final int mo98859f(float f, float f2) {
        return this.f126878b.mo98994e(f, f2);
    }

    /* renamed from: c */
    public final int mo98843c(int i, int i2) {
        return this.f126878b.mo98995e(i, 0);
    }

    /* renamed from: d */
    public final int mo98852d(String str, String str2) {
        if (str2 != null) {
            return this.f126878b.mo98990d(str, str2);
        }
        C50792y.m109914d("VERecorder", "Illegal argument. imagePath can't be null. Consider using empty string to cancel.");
        return -100;
    }

    /* renamed from: a */
    public final int mo98753a(float f, float f2) {
        C50660a aVar = new C50660a();
        aVar.mo99060a("iesve_verecorder_set_beauty_level", f).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_beauty_level", 1, aVar);
        this.f126878b.mo98913a(f, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fSmoothIntensity", String.valueOf(f));
            jSONObject.put("fWhiteIntensity", String.valueOf(f));
            jSONObject.put("resultCode", 0);
            C20102a.m49612a("vesdk_event_recorder_beauty_face_intensity", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo98755a(int i, float f) {
        C50660a aVar = new C50660a();
        StringBuilder sb = new StringBuilder("iesve_verecorder_");
        sb.append(C50703i.m109624a(i));
        sb.append("_level");
        aVar.mo99060a(sb.toString(), f).mo99061a("old", 1);
        StringBuilder sb2 = new StringBuilder("iesve_verecorder_");
        sb2.append(C50703i.m109624a(i));
        sb2.append("_level");
        C20110e.m49637a(sb2.toString(), 1, aVar);
        return this.f126878b.mo98915a(i, f);
    }

    /* renamed from: c */
    public final int[] mo98848c(String str, String str2) {
        if (str == null || str2 == null) {
            return new int[]{-1, 0};
        }
        return this.f126878b.mo98984c(str, str2);
    }

    /* renamed from: a */
    public final int mo98757a(int i, String str) {
        C50660a aVar = new C50660a();
        aVar.mo99061a("iesve_verecorder_set_beauty_algorithm", i).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_beauty_algorithm", 1, aVar);
        this.f126878b.mo98917a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("beautyFaceType", String.valueOf(i));
            jSONObject.put("strBeautyFaceRes", str);
            jSONObject.put("resultCode", 0);
            C20102a.m49612a("vesdk_event_recorder_beauty_face", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo98831b(String[] strArr, int i) {
        return this.f126878b.mo98970b(strArr, i);
    }

    private C50601ah(C50771d dVar, Context context, C50688c cVar) {
        C50690f fVar;
        this.f126877a = dVar;
        this.f126879c = VERuntime.m109853a();
        C50771d dVar2 = this.f126877a;
        if (VERuntime.m109853a().f127481i) {
            fVar = new C50661e(context, dVar2, null);
        } else {
            fVar = new C50638b(context, dVar2, null);
        }
        this.f126878b = fVar;
    }

    /* renamed from: a */
    private int m108971a(String str, float f, boolean z) {
        C50660a aVar = new C50660a();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str2 = split[split.length - 1];
            }
        }
        float min = Math.min(1.0f, Math.max(0.0f, 0.0f));
        aVar.mo99062a("iesve_verecorder_set_filter_click_idfilter_id", str2).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_filter_click", 1, aVar);
        this.f126878b.mo98924a(str, min, true);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("filterId", str2);
            jSONObject.put("intensity", String.valueOf(min));
            jSONObject.put("tag", "setFilter");
            jSONObject.put("resultCode", 0);
            C20102a.m49612a("vesdk_event_recorder_single_filter", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo98827b(String str, float f, float f2) {
        C50660a aVar = new C50660a();
        aVar.mo99060a("iesve_verecorder_set_lipstick_and_blusher_level", f).mo99061a("old", 1);
        C20110e.m49637a("iesve_verecorder_set_lipstick_and_blusher_level", 1, aVar);
        int b = this.f126878b.mo98968b(str, f, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("fLipstickIntensity", String.valueOf(f));
            jSONObject.put("fBlusherIntensity", String.valueOf(f));
            jSONObject.put("resultCode", b);
            C20102a.m49612a("vesdk_event_recorder_face_make_up_intensity", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return b;
    }

    /* renamed from: b */
    public final int mo98829b(String str, String str2, float f) {
        int c = this.f126878b.mo98978c(str, str2, f);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LeakCanaryFileProvider.f132050j, str);
            jSONObject.put("nodeTag", str2);
            jSONObject.put("nodeValue", String.valueOf(f));
            jSONObject.put("resultCode", String.valueOf(c));
            C20102a.m49612a("vesdk_event_recorder_composer", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return c;
    }

    /* renamed from: a */
    public final int mo98756a(int i, float f, float f2, int i2) {
        return this.f126878b.mo98916a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final int mo98751a(double d, double d2, double d3, double d4) {
        return this.f126878b.mo98911a(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final int mo98841c(double d, double d2, double d3, double d4) {
        return this.f126878b.mo98976c(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final int mo98823b(double d, double d2, double d3, double d4) {
        return this.f126878b.mo98963b(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final int mo98828b(String str, int i, int i2, String str2) {
        return this.f126878b.mo98925a(str, i, i2, str2);
    }

    /* renamed from: a */
    private void m108972a(int i, String str, String str2, final C50546j jVar, int i2) {
        try {
            this.f126877a.mo99456d();
            this.f126877a.mo99457e();
            final String b = this.f126877a.mo43566b();
            final String c = this.f126877a.mo43568c();
            C50752q.m109848a(b);
            C50752q.m109848a(c);
            this.f126878b.mo99069a(b, c, i, str, str2, new C50542f() {
                /* renamed from: a */
                public final void mo43336a(int i) {
                    if (jVar != null) {
                        jVar.mo43335a(i, b, c);
                    }
                }
            }, -1);
        } catch (C50751p e) {
            StringBuilder sb = new StringBuilder("No need to concat because: ");
            sb.append(e.getMsgDes());
            C20296p.m50063d("VERecorder", sb.toString());
            if (jVar != null) {
                jVar.mo43335a(-108, "", "");
            }
        }
    }

    /* renamed from: a */
    public final int mo98754a(float f, float f2, float f3, float f4, float f5) {
        return this.f126878b.mo98914a(f, f2, f3, f4, f5);
    }
}
