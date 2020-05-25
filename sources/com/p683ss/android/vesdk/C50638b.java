package com.p683ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.C19318f;
import com.p683ss.android.medialib.FaceBeautyInvoker;
import com.p683ss.android.medialib.FaceBeautyInvoker.EffectAlgorithmCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.FaceInfoCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextBitmapCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnPictureCallbackV2;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19268f.C19270b;
import com.p683ss.android.medialib.camera.C19268f.C19272d;
import com.p683ss.android.medialib.camera.C19268f.C19273e;
import com.p683ss.android.medialib.camera.C19274g;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.medialib.model.C19350a;
import com.p683ss.android.medialib.model.C19352c;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.model.FaceAttributeInfo;
import com.p683ss.android.medialib.model.FaceDetectInfo;
import com.p683ss.android.medialib.p1180b.C19222a.C19223a;
import com.p683ss.android.medialib.p1180b.C19222a.C19224b;
import com.p683ss.android.medialib.p1180b.C19225b;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.medialib.presenter.C19359b;
import com.p683ss.android.medialib.presenter.C19360c;
import com.p683ss.android.medialib.presenter.C19361d;
import com.p683ss.android.medialib.presenter.C19361d.C193674;
import com.p683ss.android.medialib.presenter.C19361d.C19375b;
import com.p683ss.android.medialib.presenter.C19361d.C19376c;
import com.p683ss.android.medialib.presenter.C19361d.C19377d;
import com.p683ss.android.medialib.presenter.C19378e;
import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ttve.model.VEFrame;
import com.p683ss.android.ttve.model.VEFrame.C20091a;
import com.p683ss.android.vesdk.C50601ah.C50613b;
import com.p683ss.android.vesdk.C50601ah.C50614c;
import com.p683ss.android.vesdk.C50601ah.C50615d;
import com.p683ss.android.vesdk.C50601ah.C50617f;
import com.p683ss.android.vesdk.C50601ah.C50617f.C50618a;
import com.p683ss.android.vesdk.C50601ah.C50620h;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import com.p683ss.android.vesdk.C50601ah.C50622j;
import com.p683ss.android.vesdk.C50792y;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import com.p683ss.android.vesdk.VEListener.C50542f;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import com.p683ss.android.vesdk.faceinfo.C50692b;
import com.p683ss.android.vesdk.faceinfo.C50695d;
import com.p683ss.android.vesdk.model.BefTextLayout;
import com.p683ss.android.vesdk.model.BefTextLayoutResult;
import com.p683ss.android.vesdk.p2535e.C50686a;
import com.p683ss.android.vesdk.p2535e.C50687b;
import com.p683ss.android.vesdk.p2535e.C50688c;
import com.p683ss.android.vesdk.p2535e.C50689d;
import com.p683ss.android.vesdk.runtime.C50771d;
import com.p683ss.android.vesdk.utils.C50787c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.libsdl.app.AudioPlayerFS.ICompletionCallback;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.vesdk.b */
public final class C50638b extends C50690f implements C19233b, C19358a, C19359b, C50689d, ICompletionCallback, AudioRecorderInterface {

    /* renamed from: a */
    final List<C19352c> f126954a = new ArrayList();

    /* renamed from: b */
    String f126955b = "IESurfaceVideoRecorder";

    /* renamed from: c */
    C19274g f126956c;

    /* renamed from: d */
    public C19361d f126957d;

    /* renamed from: e */
    SurfaceView f126958e;

    /* renamed from: f */
    TextureView f126959f;

    /* renamed from: g */
    C50652a f126960g;

    /* renamed from: h */
    public boolean f126961h = false;

    /* renamed from: i */
    public long f126962i = 0;

    /* renamed from: j */
    C50595ad f126963j;

    /* renamed from: k */
    String f126964k;

    /* renamed from: l */
    private int f126965l;

    /* renamed from: m */
    private boolean f126966m = true;

    /* renamed from: n */
    private float f126967n = 1.0f;

    /* renamed from: o */
    private boolean f126968o = false;

    /* renamed from: p */
    private long f126969p = -1;

    /* renamed from: q */
    private boolean f126970q;

    /* renamed from: com.ss.android.vesdk.b$a */
    public static class C50652a {

        /* renamed from: a */
        public boolean f126999a = true;

        /* renamed from: b */
        public Surface f127000b;

        public C50652a(Surface surface, boolean z) {
            this.f127000b = surface;
        }
    }

    /* renamed from: a */
    public final void mo98941a(int i, float f, VESize vESize, VESize vESize2) {
    }

    public final void lackPermission() {
    }

    public final void onComplete(boolean z) {
    }

    public final void recordStatus(boolean z) {
    }

    /* renamed from: s */
    public final EnigmaResult mo99025s() {
        return null;
    }

    /* renamed from: a */
    public final void mo39625a(int i, int i2) {
        if (this.f127125B != null) {
            this.f127125B.mo43266a(i != 0);
        }
    }

    /* renamed from: a */
    public final void mo39624a(int i) {
        if (cw_()) {
            int i2 = this.f127143T.getVideoRes().width;
            int i3 = this.f127143T.getVideoRes().height;
            float[] fArr = this.f127148Y.f126874c;
            float f = (float) i3;
            float f2 = (float) i2;
            this.f126957d.mo40332b((int) (fArr[0] * f), (int) (fArr[1] * f), (int) (fArr[2] * f2), (int) (fArr[3] * f2));
            this.f126957d.mo40353d(2, 0);
            float[] fArr2 = this.f127148Y.f126875d;
            this.f126957d.mo40312a(0, 0, (int) (fArr2[2] * f2), (int) (fArr2[3] * f));
        }
        if (this.f127125B != null) {
            this.f127125B.mo43265a(i, "onNativeInitCallBack");
        }
        if (i >= 0) {
            if (!this.f126963j.f126859e) {
                mo98917a(this.f127164ah.f55240a, this.f127164ah.f55241b);
                mo98913a(this.f127164ah.f55242c, this.f127164ah.f55243d);
                if (this.f127166aj.f55262g) {
                    if (!TextUtils.isEmpty(this.f127166aj.f55256a) && !TextUtils.isEmpty(this.f127166aj.f55257b)) {
                        mo98957a(this.f127166aj.f55256a, this.f127166aj.f55257b, this.f127166aj.f55258c, this.f127166aj.f55259d, this.f127166aj.f55260e);
                    } else if (!TextUtils.isEmpty(this.f127166aj.f55256a)) {
                        this.f126957d.mo40335b(this.f127166aj.f55256a, this.f127166aj.f55259d);
                    }
                } else if (!TextUtils.isEmpty(this.f127166aj.f55256a) && !TextUtils.isEmpty(this.f127166aj.f55257b)) {
                    mo98956a(this.f127166aj.f55256a, this.f127166aj.f55257b, this.f127166aj.f55258c);
                } else if (!TextUtils.isEmpty(this.f127166aj.f55256a)) {
                    this.f126957d.mo40360e(this.f127166aj.f55256a);
                    if (!this.f127166aj.f55261f) {
                        this.f126957d.mo40380i(this.f127166aj.f55259d);
                    }
                }
                mo98923a(this.f127167ak.f55263a, this.f127167ak.f55264b, this.f127167ak.f55265c);
                mo98930a(this.f127167ak.f55263a, this.f127167ak.f55266d);
                mo98968b(this.f127168al.f55251a, this.f127168al.f55252b, this.f127168al.f55253c);
                if (!TextUtils.isEmpty(this.f127168al.f55251a)) {
                    mo98915a(19, this.f127168al.f55254d);
                    mo98915a(20, this.f127168al.f55255e);
                }
                mo98926a(this.f127165ai.f55244a, this.f127165ai.f55246c, this.f127165ai.f55247d, this.f127165ai.f55249f, this.f127165ai.f55248e);
            }
            int a = this.f126957d.mo40252a(this.f126954a.size(), this.f126964k);
            if (a != 0) {
                String str = this.f126955b;
                StringBuilder sb = new StringBuilder("tryRestore ret: ");
                sb.append(a);
                C50792y.m109914d(str, sb.toString());
            } else {
                this.f126962i = (long) C19352c.m47249a(this.f126954a);
            }
            m109179u();
            mo98949a(this.f127136M);
        }
    }

    /* renamed from: a */
    public final void mo98904a(Surface surface) {
        this.f126970q = false;
        C50792y.m109911b(this.f126955b, "surfaceCreated");
        this.f126958e.getHolder().setType(3);
        this.f126960g = new C50652a(this.f126958e.getHolder().getSurface(), true);
        m109178a(this.f126958e != null ? this.f126958e.getHolder() : null);
        this.f126958e.setLayoutParams(this.f126958e.getLayoutParams());
        this.f126958e.requestLayout();
    }

    /* renamed from: a */
    public final void mo98905a(Surface surface, int i, int i2, int i3) {
        if (this.f127184z != null && this.f127184z.f127123f) {
            this.f126957d.mo40255a(surface);
            this.f126957d.mo40368f(2);
        }
    }

    /* renamed from: b */
    public final void mo98906b(Surface surface) {
        mo99011l();
        this.f126970q = true;
    }

    /* renamed from: a */
    public final String mo98936a() {
        if (cv_()) {
            return this.f127147X.f127282b;
        }
        return null;
    }

    /* renamed from: a */
    public final int mo98928a(String str, long j, long j2, int i) {
        super.mo98928a(str, j, j2, i);
        if (this.f127149Z == C50600ag.DEFAULT) {
            this.f126957d.mo40279a(str).mo40278a(j, 0).mo40280a(i == 1);
            if (TextUtils.isEmpty(this.f127157aa)) {
                this.f126957d.mo40319b(this.f127183y.getApplicationContext(), 1, (AudioRecorderInterface) this);
            } else {
                this.f126957d.mo40319b(this.f127183y.getApplicationContext(), 5, (AudioRecorderInterface) this);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo98953a(C50636ap apVar) {
        super.mo98953a(apVar);
        if (apVar.f126947a > -1.0f) {
            this.f126957d.mo40276a(apVar.f126947a);
        }
        this.f126957d.mo40328b(apVar.f126948b);
    }

    /* renamed from: a */
    public final int mo98927a(String str, int i, int i2, boolean z, boolean z2, CompressFormat compressFormat, C50613b bVar, boolean z3) {
        int i3 = i;
        int i4 = i2;
        String str2 = this.f126955b;
        StringBuilder sb = new StringBuilder("shot screen save to ");
        String str3 = str;
        sb.append(str);
        C50792y.m109911b(str2, sb.toString());
        if (i3 > 720) {
            final C50613b bVar2 = bVar;
            final String str4 = str;
            final CompressFormat compressFormat2 = compressFormat;
            final boolean z4 = z;
            final C506519 r0 = new C19376c() {
                /* renamed from: a */
                public final void mo40421a(Bitmap bitmap, int i) {
                    bVar2.mo43337a(i);
                    if (i == 0 && bitmap != null) {
                        C19225b.m46858a(bitmap, str4, compressFormat2);
                    }
                    if (i != 0 || z4) {
                        C19274g b = C19274g.m47034b();
                        C50792y.m109911b("IESCameraManager", "re-startPreview...");
                        synchronized (b.f53206r) {
                            if (b.f53191b != null) {
                                b.f53191b.mo39657d();
                            }
                        }
                    }
                }
            };
            C19361d dVar = this.f126957d;
            C5064111 r2 = new C19377d() {
                /* renamed from: a */
                public final void mo40423a(Bitmap bitmap) {
                    r0.mo40421a(bitmap, 0);
                }

                /* renamed from: a */
                public final void mo40422a(int i, int i2) {
                    if (i2 < 0) {
                        r0.mo40421a(null, i2);
                    }
                }
            };
            C50792y.m109911b(C19361d.f53519a, "start ======");
            C19274g b = C19274g.m47034b();
            C193674 r02 = new C19270b(r2, i, i2, 0) {

                /* renamed from: a */
                final /* synthetic */ C19377d f53563a;

                /* renamed from: b */
                final /* synthetic */ int f53564b;

                /* renamed from: c */
                final /* synthetic */ int f53565c;

                /* renamed from: d */
                final /* synthetic */ int f53566d;

                /* renamed from: a */
                public final void mo39715a(ImageFrame imageFrame) {
                    C50792y.m109911b(C19361d.f53519a, "end camera picture ======");
                    if (imageFrame == null) {
                        this.f53563a.mo40422a(0, -1000);
                        return;
                    }
                    this.f53563a.mo40422a(0, 0);
                    C50792y.m109911b(C19361d.f53519a, "start renderPicture ======");
                    int renderPicture = C19361d.this.f53536i.renderPicture(imageFrame, this.f53564b, this.f53565c, new OnPictureCallbackV2() {
                        public final void onResult(int i, int i2) {
                            C193674.this.f53563a.mo40422a(i, i2);
                        }

                        public final void onImage(int[] iArr, int i, int i2) {
                            if (iArr == null || iArr.length <= 0 || i <= 0 || i2 <= 0) {
                                C193674.this.f53563a.mo40423a(null);
                            } else if (C193674.this.f53566d % 360 == 0) {
                                C193674.this.f53563a.mo40423a(Bitmap.createBitmap(iArr, i, i2, Config.ARGB_8888));
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Config.ARGB_8888);
                                Matrix matrix = new Matrix();
                                matrix.setRotate((float) C193674.this.f53566d);
                                C193674.this.f53563a.mo40423a(Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true));
                            }
                        }
                    });
                    if (renderPicture < 0) {
                        this.f53563a.mo40422a(1, renderPicture);
                    }
                }

                {
                    this.f53563a = r2;
                    this.f53564b = r3;
                    this.f53565c = r4;
                    this.f53566d = r5;
                }
            };
            b.mo39721a(i4, i, (C19270b) r02);
            return 0;
        }
        final boolean z5 = z;
        final C50613b bVar3 = bVar;
        C506391 r12 = new C19224b() {
            /* renamed from: a */
            public final void mo39610a(int i) {
                bVar3.mo43337a(i);
            }
        };
        return this.f126957d.mo40269a(str, new int[]{i3, i4}, z2, compressFormat, (C19224b) r12);
    }

    /* renamed from: a */
    public final int mo98926a(String str, int i, int i2, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        int a = this.f126957d.mo40265a(str, i, i2, z, str2);
        this.f127165ai.f55244a = str;
        this.f127165ai.f55245b = false;
        this.f127165ai.f55248e = str2;
        this.f127165ai.f55246c = i;
        this.f127165ai.f55247d = i2;
        this.f127165ai.f55249f = z;
        return a;
    }

    /* renamed from: a */
    public final void mo98946a(IStickerRequestCallback iStickerRequestCallback) {
        this.f127141R = iStickerRequestCallback;
    }

    /* renamed from: a */
    public final int mo98923a(String str, float f, float f2) {
        int i;
        if (TextUtils.isEmpty(str)) {
            str = "";
            i = this.f126957d.mo40262a("", 0.0f, 0.0f);
        } else {
            i = this.f126957d.mo40262a(str, f, f2);
        }
        this.f127167ak.f55263a = str;
        this.f127167ak.f55264b = f;
        this.f127167ak.f55265c = f2;
        return i;
    }

    /* renamed from: a */
    public final int mo98921a(String str) {
        this.f127167ak.f55263a = str;
        return this.f126957d.mo40350d(str);
    }

    /* renamed from: a */
    public final int mo98932a(Map<Integer, Float> map) {
        this.f127167ak.mo42261a(map);
        this.f126957d.mo40305a(map);
        return 0;
    }

    /* renamed from: a */
    public final int mo98930a(String str, Map<Integer, Float> map) {
        this.f127167ak.f55263a = str;
        this.f127167ak.mo42261a(map);
        this.f126957d.mo40304a(str, map);
        return 0;
    }

    /* renamed from: b */
    public final boolean mo98974b(boolean z) {
        return this.f126957d.mo40388j(z);
    }

    /* renamed from: a */
    public final int mo98922a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f126957d.mo40335b(str, f);
        this.f127166aj.f55256a = str;
        this.f127166aj.f55257b = str;
        this.f127166aj.f55259d = f;
        this.f127166aj.f55260e = f;
        this.f127166aj.f55261f = false;
        this.f127166aj.f55258c = 1.0f;
        this.f127166aj.f55262g = true;
        return 0;
    }

    /* renamed from: a */
    public final int mo98924a(String str, float f, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f126957d.mo40360e("");
            str = "";
        } else {
            this.f126957d.mo40360e(str);
            if (!z) {
                this.f126957d.mo40380i(f);
            }
        }
        this.f127166aj.f55256a = str;
        this.f127166aj.f55257b = str;
        this.f127166aj.f55259d = f;
        this.f127166aj.f55260e = f;
        this.f127166aj.f55261f = z;
        this.f127166aj.f55258c = 1.0f;
        this.f127166aj.f55262g = false;
        return 0;
    }

    /* renamed from: a */
    public final void mo98956a(String str, String str2, float f) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        this.f127166aj.f55256a = str;
        this.f127166aj.f55257b = str2;
        this.f127166aj.f55258c = f;
        this.f127166aj.f55261f = true;
        this.f127166aj.f55259d = -1.0f;
        this.f127166aj.f55260e = -1.0f;
        this.f127166aj.f55262g = false;
        this.f126957d.mo40301a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo98957a(String str, String str2, float f, float f2, float f3) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String str3 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str4 = str2;
        this.f127166aj.f55256a = str3;
        this.f127166aj.f55257b = str4;
        this.f127166aj.f55258c = f;
        this.f127166aj.f55261f = true;
        this.f127166aj.f55260e = f3;
        this.f127166aj.f55259d = f2;
        this.f127166aj.f55262g = true;
        this.f126957d.mo40302a(str3, str4, f, f2, f3);
    }

    /* renamed from: a */
    public final int mo98931a(List<C50632am> list, String str, int i, int i2) {
        List list2;
        mo98928a(str, (long) i, this.f127159ac, i2);
        this.f126954a.clear();
        List<C19352c> list3 = this.f126954a;
        if (list == null || list.size() == 0) {
            list2 = Collections.emptyList();
        } else {
            list2 = new ArrayList();
            for (C50632am amVar : list) {
                list2.add(new C19352c(amVar.f53500a, amVar.f53501b));
            }
        }
        list3.addAll(list2);
        this.f126962i = (long) C19352c.m47249a(this.f126954a);
        return this.f126957d.mo40252a(list.size(), this.f126964k);
    }

    /* renamed from: a */
    public final void mo98944a(Surface surface, C50542f fVar) {
        C50792y.m109913c(this.f126955b, "startPreviewAsync is now not asynchronous!!!");
        mo98982c(surface);
        if (fVar != null) {
            fVar.mo43336a(0);
        }
    }

    /* renamed from: a */
    public final void mo98948a(C50542f fVar) {
        C50792y.m109913c(this.f126955b, "stopPreviewAsync is now not asynchronous!!!");
        mo99011l();
        if (fVar != null) {
            fVar.mo43336a(0);
        }
    }

    /* renamed from: a */
    public final void mo98940a(float f, C50542f fVar) {
        C50792y.m109913c(this.f126955b, "startRecordAsync is now not asynchronous!!!");
        fVar.mo43336a(mo98912a(f));
    }

    /* renamed from: b */
    public final void mo98972b(C50542f fVar) {
        C50792y.m109913c(this.f126955b, "stopRecordAsync is now not asynchronous!!!");
        fVar.mo43336a(mo99008k());
    }

    /* renamed from: a */
    public final void mo98954a(Runnable runnable) {
        if (this.f126957d != null) {
            C19361d.m47273a(runnable);
        }
    }

    /* renamed from: a */
    public final void mo98937a(double d) {
        if (this.f126957d != null) {
            this.f126957d.mo40329b(d);
        }
    }

    /* renamed from: a */
    public final void mo98958a(String str, String str2, String str3) {
        String str4 = this.f126955b;
        StringBuilder sb = new StringBuilder("setCustomVideoBg: videoPath = ");
        sb.append(str2);
        sb.append(", audioPath = ");
        sb.append(str3);
        C50792y.m109909a(str4, sb.toString());
        if (this.f126957d != null) {
            this.f127149Z = !TextUtils.isEmpty(str2) ? C50600ag.CUSTOM_VIDEO_BG : C50600ag.DEFAULT;
            this.f126957d.mo40289a(this.f127183y, str, str2, str3);
        }
    }

    /* renamed from: a */
    public final void mo98942a(int i, int i2, int i3, int i4) {
        if (this.f126957d != null) {
            this.f126957d.mo40332b(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final int[] mo98962a(int i, int i2, int i3, int i4, float f) {
        if (this.f126957d != null) {
            return this.f126957d.mo40313a(i, i2, i3, i4, f);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo98929a(String str, String str2, int i, String str3, String str4, int i2) {
        return this.f126957d.mo40266a(str, str2, i, str3, str4, false, i2);
    }

    /* renamed from: a */
    public final void mo98952a(final C50622j jVar) {
        this.f126957d.mo40307a(true, (FaceInfoCallback) new FaceInfoCallback() {
            public final void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo) {
                jVar.mo43760a(C50692b.m109621a(faceAttributeInfo), C50695d.m109622a(faceDetectInfo));
            }
        });
    }

    /* renamed from: a */
    public final void mo98951a(final C50621i iVar) {
        super.mo98951a(iVar);
        this.f126957d.mo40291a((EffectAlgorithmCallback) new EffectAlgorithmCallback() {
            public final void onResult(int[] iArr, long[] jArr, float f) {
                SparseArray sparseArray = new SparseArray();
                for (int i = 0; i < iArr.length; i++) {
                    sparseArray.put(iArr[i], Long.valueOf(jArr[i]));
                }
                iVar.mo43758a(sparseArray, f);
            }
        });
    }

    /* renamed from: a */
    public final void mo98950a(final C50620h hVar) {
        super.mo98950a(hVar);
        this.f126957d.mo40292a((OnCherEffectParmaCallback) new OnCherEffectParmaCallback() {
            public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
                hVar.mo43538a(strArr, dArr, zArr);
            }
        });
    }

    /* renamed from: a */
    public final void mo98947a(VECherEffectParam vECherEffectParam) {
        this.f126957d.mo40309a(vECherEffectParam.getMatrix(), vECherEffectParam.getDuration(), vECherEffectParam.getSegUseCher());
    }

    /* renamed from: a */
    public final void mo98943a(int i, long j, long j2, String str) {
        this.f126957d.mo40285a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo98945a(C2593a aVar) {
        super.mo98945a(aVar);
        FaceBeautyInvoker.setMessageListener(aVar);
    }

    /* renamed from: a */
    public final void mo98960a(float[] fArr) {
        C19318f a = C19318f.m47183a();
        if (a.f53369a != null) {
            a.f53369a.setDeviceRotation(fArr);
        }
    }

    /* renamed from: a */
    public final void mo98938a(float f, float f2, float f3) {
        this.f126957d.mo40282a(f, f2, f3);
    }

    /* renamed from: a */
    public final int mo98933a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f126957d.mo40270a(false, 0, z, z2, z3, z4, "");
    }

    /* renamed from: a */
    public final int mo98934a(double[] dArr, double d) {
        return this.f126957d.mo40272a(dArr, d);
    }

    /* renamed from: a */
    public final int mo98925a(String str, int i, int i2, String str2) {
        return this.f126957d.mo40323b(str, i, i2, str2);
    }

    /* renamed from: a */
    public final int mo98920a(final C50615d dVar) {
        return this.f126957d.mo40259a((OnARTextCountCallback) new OnARTextCountCallback() {
            public final void onResult(int i) {
                if (dVar != null) {
                    dVar.mo43539a(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo98949a(final C50617f fVar) {
        super.mo98949a(fVar);
        if (fVar == null) {
            this.f126957d.mo40297a((C19375b) null);
            return;
        }
        final C50618a a = fVar.mo98902a();
        this.f126957d.mo40298a((C19375b) new C19375b() {
            public final boolean cx_() {
                return a.f126903a;
            }

            /* renamed from: a */
            public final void mo40419a(C19350a aVar) {
                VEFrame vEFrame;
                if (aVar.f53493c == C20091a.TEPixFmt_OpenGL_RGBA8.ordinal()) {
                    vEFrame = VEFrame.createTextureFrame(aVar.f53491a, aVar.f53492b, aVar.f53494d, aVar.f53495e, 0, aVar.f53496f, C20091a.TEPixFmt_OpenGL_RGBA8);
                } else if (aVar.f53493c == C20091a.TEPixFmt_YUV420P.ordinal()) {
                    vEFrame = VEFrame.createByteBufferFrame(aVar.f53498h, aVar.f53494d, aVar.f53495e, 0, aVar.f53496f, C20091a.TEPixFmt_YUV420P);
                } else {
                    vEFrame = null;
                }
                if (vEFrame != null) {
                    vEFrame.setFromFrontCamera(aVar.f53499i);
                }
                fVar.mo98903a(vEFrame);
            }
        }, a.f126904b.ordinal());
    }

    /* renamed from: a */
    public final void mo98955a(String str, String str2) {
        this.f126957d.mo40300a(str, str2);
    }

    /* renamed from: b */
    public final void mo98973b(String str, String str2) {
        this.f126957d.mo40336b(str, str2);
    }

    /* renamed from: a */
    public final int mo98935a(String[] strArr, int i) {
        return this.f126957d.mo40273a(strArr, i);
    }

    /* renamed from: a */
    public final void mo98939a(float f, float f2, float f3, float f4) {
        this.f126957d.mo40283a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo98959a(boolean z, long j) {
        this.f126957d.mo40306a(z, j);
    }

    /* renamed from: a */
    public final boolean mo98961a(C50634ao aoVar, int i) {
        return this.f126957d.mo40311a(aoVar, i);
    }

    /* renamed from: i */
    public final void mo99004i() {
        this.f126957d.mo40400p();
    }

    /* renamed from: j */
    public final void mo99006j() {
        this.f126957d.mo40402q();
    }

    /* renamed from: q */
    public final void mo99021q() {
        this.f126957d.mo40404r();
    }

    /* renamed from: t */
    public final C19378e mo99027t() {
        return this.f126957d.f53537j;
    }

    /* renamed from: m */
    public final boolean mo99013m() {
        if (this.f126957d != null) {
            return this.f126957d.mo40310a();
        }
        return false;
    }

    /* renamed from: n */
    public final int[] mo99015n() {
        if (this.f126957d != null) {
            return this.f126957d.mo40355d();
        }
        return null;
    }

    /* renamed from: o */
    public final int[] mo99017o() {
        if (this.f126957d != null) {
            return this.f126957d.mo40345c();
        }
        return null;
    }

    /* renamed from: p */
    public final float mo99019p() {
        if (this.f126957d != null) {
            return this.f126957d.mo40315b();
        }
        return 0.0f;
    }

    /* renamed from: r */
    public final void mo99023r() {
        super.mo99023r();
        this.f126957d.mo40408s();
    }

    public final boolean cv_() {
        if (this.f127149Z != C50600ag.DUET || this.f127147X == null || this.f127147X.f127281a == null || this.f127147X.f127282b == null) {
            return false;
        }
        return true;
    }

    public final boolean cw_() {
        if (this.f127149Z != C50600ag.REACTION || this.f127148Y == null || this.f127148Y.f126873b == null || this.f127148Y.f126872a == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final float[] mo99003h() {
        if (this.f126957d == null) {
            return new float[]{0.0f, 0.0f};
        }
        return this.f126957d.mo40414v();
    }

    /* renamed from: u */
    private void m109179u() {
        float f;
        if (!"landscape".equals(this.f127142S.f126690l)) {
            f = ((float) this.f126956c.mo39737c()) / ((float) this.f126956c.mo39739d());
        } else {
            f = ((float) this.f126956c.mo39739d()) / ((float) this.f126956c.mo39737c());
        }
        this.f126957d.mo40284a(f, this.f126956c.mo39737c(), this.f126956c.mo39739d());
    }

    /* renamed from: g */
    public final void mo99000g() {
        if (!this.f126970q) {
            mo99011l();
        }
        this.f127166aj = null;
        this.f127167ak = null;
        this.f127168al = null;
        this.f127164ah = null;
        this.f127165ai = null;
        this.f126956c = null;
        this.f126958e = null;
        this.f127126C = null;
        this.f127125B = null;
        this.f127127D = null;
        this.f127128E = null;
        this.f126959f = null;
        this.f127183y = null;
        this.f126957d = null;
        if (this.f127184z != null) {
            this.f127184z.mo99108b((C50689d) this);
        }
        super.mo99000g();
    }

    /* renamed from: v */
    private void m109180v() {
        int i;
        String str = this.f126955b;
        StringBuilder sb = new StringBuilder("initCamera... thread id = ");
        sb.append(Thread.currentThread().getId());
        C50792y.m109911b(str, sb.toString());
        if (!this.f126968o) {
            C50792y.m109914d(this.f126955b, "No init!!!");
            return;
        }
        C5064212 r0 = new C19263c() {
            /* renamed from: a */
            public final void mo39670a(int i) {
                int i2;
                int i3;
                boolean z;
                synchronized (this) {
                    if (C50638b.this.f126956c != null && C50638b.this.f126956c.mo39744h()) {
                        C50638b bVar = C50638b.this;
                        int i4 = bVar.f127143T.getVideoRes().width;
                        int i5 = bVar.f127143T.getVideoRes().height;
                        boolean z2 = !TextUtils.isEmpty(bVar.f127157aa);
                        boolean cv_ = bVar.cv_();
                        VESize vESize = bVar.f126963j.f126855a;
                        bVar.f126957d.mo40343c(1);
                        C19361d dVar = bVar.f126957d;
                        if (vESize == null) {
                            i2 = 1280;
                        } else {
                            i2 = vESize.height;
                        }
                        if (vESize == null) {
                            i3 = 720;
                        } else {
                            i3 = vESize.width;
                        }
                        String str = bVar.f126964k;
                        dVar.mo40251a(i2, i3, str, i5, i4, bVar.f127145V, z2 ? 1 : 0, bVar.f127146W);
                        int x = bVar.f126957d.mo40416x(bVar.f127179aw);
                        if (x != 0) {
                            String str2 = bVar.f126955b;
                            StringBuilder sb = new StringBuilder("setEnableAEC failed ");
                            sb.append(x);
                            C50792y.m109914d(str2, sb.toString());
                        }
                        bVar.f126957d.mo40296a(bVar.f127141R);
                        if (cv_) {
                            bVar.f126957d.mo40303a(bVar.f127147X.f127281a, bVar.f127147X.f127282b, bVar.f127147X.f127283c, bVar.f127147X.f127284d, bVar.f127147X.f127285e, bVar.f127147X.f127286f, bVar.f127147X.f127287g);
                        } else if (bVar.cw_()) {
                            bVar.f126957d.mo40288a(bVar.f126958e.getContext(), bVar.f127148Y.f126872a, bVar.f127148Y.f126873b);
                        }
                        bVar.f126957d.f53536i.enableBlindWaterMark(false);
                        bVar.f126957d.mo40389k(bVar.f126963j.f126858d);
                        bVar.f126956c.mo39740d(bVar.f127142S.f126691m);
                        String str3 = bVar.f126955b;
                        StringBuilder sb2 = new StringBuilder("onOpenSuccess... thread id = ");
                        sb2.append(Thread.currentThread().getId());
                        C50792y.m109911b(str3, sb2.toString());
                        bVar.f126956c.mo39722a(bVar.f127183y);
                        C19361d dVar2 = bVar.f126957d;
                        if (bVar.f127149Z == C50600ag.DEFAULT && bVar.f127160ad == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dVar2.mo40280a(z);
                        bVar.f126957d.mo40253a(bVar.f127183y.getApplicationContext(), bVar.mo99010l(false), (AudioRecorderInterface) bVar);
                        bVar.f126957d.mo40343c(1);
                        bVar.f126957d.mo40379h(bVar.f126963j.f126857c);
                        bVar.f126957d.mo40256a(bVar.f126960g.f127000b, Build.DEVICE);
                    }
                }
                if (C50638b.this.f127126C != null) {
                    C50638b.this.f127126C.mo43393a();
                }
            }

            /* renamed from: a */
            public final void mo39671a(int i, int i2, String str) {
                C50638b bVar = C50638b.this;
                if (bVar.f127126C != null) {
                    bVar.f127126C.mo43394a(i2);
                }
            }
        };
        CAMERA_FACING_ID camera_facing_id = CAMERA_FACING_ID.FACING_BACK;
        if (this.f127142S != null) {
            camera_facing_id = this.f127142S.f126688j;
        }
        C19274g gVar = this.f126956c;
        if (camera_facing_id == CAMERA_FACING_ID.FACING_WIDE_ANGLE) {
            i = 2;
        } else if (camera_facing_id == CAMERA_FACING_ID.FACING_FRONT) {
            i = 1;
        } else {
            i = 0;
        }
        gVar.mo39732a(i, (C19263c) r0);
    }

    /* renamed from: c */
    public final void mo98979c() {
        C19274g b = C19274g.m47034b();
        C50792y.m109911b("IESCameraManager", "stopPreview...");
        synchronized (b.f53206r) {
            b.f53191b.mo39658e();
        }
    }

    /* renamed from: d */
    public final long mo98991d() {
        return this.f126957d.mo40372g();
    }

    /* renamed from: k */
    public final int mo99008k() {
        float f;
        if (this.f126966m || !this.f126961h) {
            return 0;
        }
        this.f126961h = false;
        this.f126957d.mo40386j();
        while (this.f126957d.mo40390k()) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException unused) {
            }
        }
        long g = this.f126957d.mo40372g() / 1000;
        this.f126954a.add(new C19352c(g, (double) this.f126967n));
        synchronized (this) {
            this.f126969p = -1;
            f = (float) g;
            this.f126962i = (long) (((float) this.f126962i) + ((1.0f * f) / this.f126967n));
        }
        this.f126966m = true;
        return (int) (f / this.f126967n);
    }

    /* renamed from: l */
    public final void mo99011l() {
        if (this.f126957d != null) {
            mo99008k();
        }
        synchronized (this) {
            if (this.f126956c != null) {
                this.f126956c.mo39746j();
                this.f126956c.f53192c = null;
                this.f126956c.f53193d = null;
                this.f126956c.mo39727a((C19273e) null);
                this.f126956c.mo39726a((C19272d) null);
            }
        }
        if (this.f126957d != null) {
            this.f126957d.mo40398o();
            this.f126957d.mo40394m();
            FaceBeautyInvoker.setNativeInitListener(null);
            this.f126957d.mo40244a((C19223a) null);
            FaceBeautyInvoker.setFaceDetectListener(null);
        }
    }

    /* renamed from: b */
    public final void mo98971b() {
        C50792y.m109909a(this.f126955b, "delete last frag !!!");
        if (this.f126954a.size() > 0) {
            this.f126954a.remove(this.f126954a.size() - 1);
            this.f126962i = (long) C19352c.m47249a(this.f126954a);
            this.f126957d.mo40381i();
        }
    }

    /* renamed from: k_ */
    public final void mo40236k_(int i) {
        this.f126965l = i;
    }

    /* renamed from: b */
    public final int mo98964b(float f) {
        return this.f126957d.mo40375h(f);
    }

    /* renamed from: c */
    public final float mo98975c(String str) {
        return this.f126957d.mo40363f(str);
    }

    /* renamed from: f */
    public final void mo98998f(boolean z) {
        this.f126957d.mo40395m(z);
    }

    /* renamed from: g_ */
    public final void mo99001g_(boolean z) {
        C19274g.m47034b().mo39736b(z);
    }

    /* renamed from: m */
    public final void mo99012m(boolean z) {
        this.f126957d.mo40352d(z ? 1 : 0);
    }

    /* renamed from: n */
    public final void mo99014n(boolean z) {
        this.f126957d.mo40359e(z ? 1 : 0);
    }

    /* renamed from: o */
    public final int mo99016o(boolean z) {
        return this.f126957d.mo40396n(z);
    }

    /* renamed from: p */
    public final void mo99020p(boolean z) {
        this.f126957d.mo40399o(z);
    }

    /* renamed from: s */
    public final void mo99026s(boolean z) {
        this.f126957d.mo40412u(z);
    }

    public final int closeWavFile(boolean z) {
        C50792y.m109911b(this.f126955b, "closeWavFile...");
        return 0;
    }

    /* renamed from: d */
    public final int mo98989d(String str) {
        return this.f126957d.mo40340c(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo98999g(boolean z) {
        this.f127179aw = z;
        return this.f126957d.mo40416x(z);
    }

    /* renamed from: h */
    public final void mo99002h(boolean z) {
        if (this.f126957d != null) {
            this.f126957d.mo40361e(z);
        }
    }

    /* renamed from: i */
    public final void mo99005i(boolean z) {
        if (this.f126957d != null) {
            this.f126957d.mo40344c(z);
        }
    }

    /* renamed from: j */
    public final void mo99007j(boolean z) {
        if (this.f126957d != null) {
            this.f126957d.mo40354d(z);
        }
    }

    /* renamed from: k */
    public final void mo99009k(boolean z) {
        if (this.f126957d != null) {
            this.f126957d.f53538k = z;
        }
    }

    /* renamed from: q */
    public final void mo99022q(boolean z) {
        this.f126957d.mo40403q(z);
    }

    /* renamed from: t */
    public final void mo99028t(boolean z) {
        this.f126957d.mo40415w(z);
    }

    /* renamed from: d */
    public final int mo98988d(Surface surface) {
        this.f126960g = new C50652a(surface, true);
        int a = this.f126957d.mo40255a(surface);
        this.f126957d.mo40368f(2);
        return a;
    }

    /* renamed from: e */
    public final int mo98996e(String str) {
        return this.f126957d.mo40371g(str);
    }

    /* renamed from: r */
    public final void mo99024r(boolean z) {
        if (z) {
            this.f126957d.mo40318b(this.f127183y);
        } else {
            this.f126957d.mo40411u();
        }
    }

    /* renamed from: a */
    private void m109178a(SurfaceHolder surfaceHolder) {
        FaceBeautyInvoker.setNativeInitListener(this);
        this.f126956c.mo39728a((C19360c) this.f126957d);
        this.f126956c.f53192c = this;
        this.f126956c.f53193d = this;
        if (this.f126968o) {
            this.f126956c.mo39727a((C19273e) new C19273e() {
                /* renamed from: a */
                public final boolean mo39718a() {
                    if (C50638b.this.f127128E == null || !C50638b.this.f127128E.mo43392a()) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: a */
                public final void mo39716a(int i, float f, boolean z) {
                    if (C50638b.this.f127128E != null) {
                        C50638b.this.f127128E.mo43390a(i, f, z);
                    }
                }

                /* renamed from: a */
                public final void mo39717a(int i, boolean z, boolean z2, float f, List<Integer> list) {
                    if (C50638b.this.f127128E != null) {
                        C50638b.this.f127128E.mo43391a(i, z, z2, f, list);
                    }
                }
            });
            this.f126956c.mo39726a((C19272d) new C19272d() {
            });
        }
        m109180v();
    }

    /* renamed from: b */
    public final int mo98966b(final C50615d dVar) {
        return this.f126957d.mo40258a((OnARTextContentCallback) new OnARTextContentCallback() {
            public final void onResult(String[] strArr) {
                if (dVar != null) {
                    dVar.mo43540a(strArr);
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo98997e(boolean z) {
        this.f126957d.mo40392l(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final int mo99010l(boolean z) {
        if (!this.f126963j.f126856b && !z) {
            return 0;
        }
        if (this.f127149Z == C50600ag.DUET || this.f127149Z == C50600ag.REACTION || this.f127149Z == C50600ag.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(this.f127157aa)) {
            return 5;
        }
        return 1;
    }

    /* renamed from: b */
    public final int mo98967b(String str) {
        this.f127168al.f55251a = str;
        return this.f126957d.mo40321b(C50787c.m109901a(str));
    }

    /* renamed from: a */
    public final int mo98912a(float f) {
        int i;
        if (!this.f126966m) {
            return -105;
        }
        this.f126961h = true;
        this.f126967n = f;
        this.f126957d.mo40319b(this.f127183y, mo99010l(true), (AudioRecorderInterface) this);
        this.f126957d.mo40278a(this.f127158ab, this.f126962i);
        if (this.f127143T == null || this.f127143T.getBitrateMode() != ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF) {
            this.f126957d.mo40341c(ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal(), this.f127143T.getSwQP());
        } else {
            int swCRF = this.f127143T.getSwCRF();
            C19361d dVar = this.f126957d;
            int ordinal = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
            if (swCRF < 12) {
                swCRF = 12;
            }
            dVar.mo40341c(ordinal, swCRF);
        }
        float f2 = this.f126967n;
        VEVideoEncodeSettings vEVideoEncodeSettings = this.f127143T;
        float bps = (((float) vEVideoEncodeSettings.getBps()) * 1.0f) / 4194304.0f;
        if (vEVideoEncodeSettings.getEncodeProfile() == ENCODE_PROFILE.ENCODE_PROFILE_MAIN.ordinal()) {
            i = 2;
        } else if (vEVideoEncodeSettings.getEncodeProfile() == ENCODE_PROFILE.ENCODE_PROFILE_HIGH.ordinal()) {
            i = 8;
        } else {
            i = 1;
        }
        int a = this.f126957d.mo40246a((double) f2, !vEVideoEncodeSettings.isSupportHwEnc(), bps, 1, i, false);
        this.f126966m = false;
        synchronized (this) {
            this.f126969p = 0;
        }
        return a;
    }

    /* renamed from: c */
    public final void mo98980c(int i) {
        this.f126957d.mo40387j(i);
    }

    /* renamed from: d */
    public final void mo98992d(boolean z) {
        this.f126957d.mo40389k(z);
    }

    /* renamed from: c */
    public final void mo98982c(Surface surface) {
        this.f126960g = new C50652a(surface, true);
        m109178a((SurfaceHolder) null);
    }

    /* renamed from: a */
    public final int mo98918a(VEEffectParams vEEffectParams) {
        return this.f126957d.mo40260a(vEEffectParams);
    }

    /* renamed from: c */
    public final void mo98983c(boolean z) {
        this.f126957d.mo40405r(z);
    }

    /* renamed from: a */
    public final int mo98919a(final C50614c cVar) {
        this.f126957d.mo40257a((OnARTextBitmapCallback) new OnARTextBitmapCallback() {
            public final BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
                if (cVar != null) {
                    return cVar.mo42959a(str, befTextLayout);
                }
                return null;
            }
        });
        return 0;
    }

    /* renamed from: d */
    public final int mo98987d(float f, float f2) {
        return this.f126957d.mo40357e(f, f2);
    }

    /* renamed from: e */
    public final int mo98994e(float f, float f2) {
        return this.f126957d.mo40365f(f, f2);
    }

    public final int addPCMData(byte[] bArr, int i) {
        C50792y.m109911b(this.f126955b, "addPCMData...");
        if (this.f127127D != null) {
            Arrays.copyOf(bArr, i);
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo98995e(int i, int i2) {
        return this.f126957d.mo40366f(i, i2);
    }

    /* renamed from: a */
    public final int mo98913a(float f, float f2) {
        this.f127164ah.f55242c = f;
        this.f127164ah.f55243d = f2;
        this.f126957d.mo40281a(f, f2);
        return 0;
    }

    /* renamed from: b */
    public final int mo98965b(float f, float f2) {
        return this.f126957d.mo40338c(f, f2);
    }

    /* renamed from: c */
    public final int mo98977c(float f, float f2) {
        return this.f126957d.mo40349d(f, f2);
    }

    /* renamed from: d */
    public final int mo98990d(String str, String str2) {
        return this.f126957d.mo40351d(str, str2);
    }

    /* renamed from: a */
    public final int mo98915a(int i, float f) {
        switch (i) {
            case 1:
                this.f127164ah.f55243d = f;
                break;
            case 2:
                this.f127164ah.f55242c = f;
                break;
            case 4:
                this.f127167ak.f55264b = f;
                break;
            case 5:
                this.f127167ak.f55265c = f;
                break;
            case 17:
                this.f127168al.f55252b = f;
                break;
            case 18:
                this.f127168al.f55253c = f;
                break;
            case 19:
                this.f127168al.f55254d = f;
                break;
            case 20:
                this.f127168al.f55255e = f;
                break;
        }
        return this.f126957d.mo40249a(i, f);
    }

    /* renamed from: c */
    public final void mo98981c(int i, int i2) {
        if (this.f126957d != null) {
            this.f126957d.mo40353d(i, i2);
        }
    }

    /* renamed from: d */
    public final boolean mo98993d(int i, int i2) {
        if (this.f126957d != null) {
            return this.f126957d.mo40362e(i, i2);
        }
        return false;
    }

    /* renamed from: a */
    public final int mo98917a(int i, String str) {
        this.f127164ah.f55240a = i;
        this.f127164ah.f55241b = str;
        this.f126957d.mo40333b(i, str);
        return 0;
    }

    /* renamed from: b */
    public final int mo98970b(String[] strArr, int i) {
        return this.f126957d.mo40325b(strArr, i);
    }

    /* renamed from: b */
    public final void mo40235b(int i, int i2) {
        C50792y.m109911b(this.f126955b, "previewSize");
        m109179u();
    }

    /* renamed from: c */
    public final int[] mo98984c(String str, String str2) {
        return this.f126957d.mo40346c(str, str2);
    }

    public final int initWavFile(int i, int i2, double d) {
        C50792y.m109911b(this.f126955b, "initWavFile...");
        return 0;
    }

    /* renamed from: c */
    public final int mo98978c(String str, String str2, float f) {
        return this.f126957d.mo40324b(str, str2, f);
    }

    public C50638b(Context context, C50771d dVar, C50688c cVar) {
        super(context, dVar, cVar);
        if (cVar instanceof C50686a) {
            this.f126958e = ((C50686a) cVar).f127116a;
        } else if (cVar instanceof C50687b) {
            this.f126959f = ((C50687b) cVar).f127117a;
        }
        if (this.f127184z != null) {
            this.f127184z.mo99107a((C50689d) this);
        }
        this.f127183y = context;
        this.f126956c = C19274g.m47034b();
        this.f126957d = new C19361d();
    }

    /* renamed from: b */
    public final int mo98968b(String str, float f, float f2) {
        this.f127168al.f55251a = str;
        this.f127168al.f55252b = f;
        this.f127168al.f55253c = f2;
        if (TextUtils.isEmpty(str)) {
            this.f127168al.f55251a = "";
            return this.f126957d.mo40322b("", 0.0f, 0.0f);
        }
        this.f127168al.f55251a = str;
        return this.f126957d.mo40322b(str, f, f2);
    }

    /* renamed from: b */
    public final int mo98969b(String str, String str2, float f) {
        return mo98912a(f);
    }

    /* renamed from: a */
    public final int mo98916a(int i, float f, float f2, int i2) {
        return this.f126957d.mo40250a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final int mo98911a(double d, double d2, double d3, double d4) {
        return this.f126957d.mo40245a(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final int mo98963b(double d, double d2, double d3, double d4) {
        return this.f126957d.mo40316b(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final int mo98976c(double d, double d2, double d3, double d4) {
        return this.f126957d.mo40337c(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo98914a(float f, float f2, float f3, float f4, float f5) {
        return this.f126957d.mo40248a(f, f2, f3, f4, f5);
    }
}
