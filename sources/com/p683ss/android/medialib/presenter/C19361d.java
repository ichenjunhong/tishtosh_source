package com.p683ss.android.medialib.presenter;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGLContext;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.C19318f;
import com.p683ss.android.medialib.FaceBeautyInvoker;
import com.p683ss.android.medialib.FaceBeautyInvoker.C19214a;
import com.p683ss.android.medialib.FaceBeautyInvoker.EffectAlgorithmCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.FaceInfoCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextBitmapCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnFrameCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnPictureCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.medialib.camera.C19274g;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.medialib.log.C19348a;
import com.p683ss.android.medialib.log.IMonitor;
import com.p683ss.android.medialib.model.C19350a;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.p1179a.C19218a.C19219a;
import com.p683ss.android.medialib.p1180b.C19222a.C19223a;
import com.p683ss.android.medialib.p1180b.C19222a.C19224b;
import com.p683ss.android.medialib.p1180b.C19225b;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.medialib.p1181c.C19235d;
import com.p683ss.android.medialib.p1183d.C19311a;
import com.p683ss.android.medialib.p1183d.C19312b;
import com.p683ss.android.medialib.p1184e.C19317c;
import com.p683ss.android.ttve.monitor.C20114g;
import com.p683ss.android.vesdk.C50634ao;
import com.p683ss.android.vesdk.C50790w;
import com.p683ss.android.vesdk.C50792y;
import com.p683ss.android.vesdk.VEEffectParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.libsdl.app.AudioRecorderInterface;
import org.libsdl.app.AudioRecorderInterfaceExt;
import org.libsdl.app.BufferedAudioRecorder;

/* renamed from: com.ss.android.medialib.presenter.d */
public class C19361d implements C19219a, C19360c, AudioRecorderInterfaceExt {

    /* renamed from: a */
    public static final String f53519a = "d";

    /* renamed from: A */
    private boolean f53520A = false;

    /* renamed from: B */
    private boolean f53521B = false;

    /* renamed from: C */
    private float f53522C = 1.0f;

    /* renamed from: D */
    private boolean f53523D = false;

    /* renamed from: E */
    private volatile boolean f53524E = false;

    /* renamed from: F */
    private int f53525F = 44100;

    /* renamed from: G */
    private int f53526G = 2;

    /* renamed from: H */
    private double f53527H = -1.0d;

    /* renamed from: I */
    private C19235d f53528I = new C19235d() {
        /* renamed from: a */
        public final long mo39627a(boolean z) {
            long j;
            SurfaceTexture surfaceTexture = C19361d.this.f53541n;
            long abs = Math.abs(System.nanoTime() - surfaceTexture.getTimestamp());
            if (VERSION.SDK_INT >= 17) {
                j = Math.abs(SystemClock.elapsedRealtimeNanos() - surfaceTexture.getTimestamp());
            } else {
                j = Long.MAX_VALUE;
            }
            long abs2 = Math.abs((SystemClock.uptimeMillis() * 1000000) - surfaceTexture.getTimestamp());
            String str = C19361d.f53519a;
            StringBuilder sb = new StringBuilder("nano_time: ");
            sb.append(abs);
            sb.append(",elapsed: ");
            sb.append(j);
            sb.append(" ,delta_uptime_nano: ");
            sb.append(abs2);
            C50792y.m109911b(str, sb.toString());
            final long min = Math.min(Math.min(abs, j), abs2) / 1000;
            if (C19361d.this.f53534g != null && z) {
                C19312b.m47170a("camera_offset", new C19311a() {
                    /* renamed from: a */
                    public final void mo39810a(Map<String, Object> map) {
                        map.put("camera_offset", Long.valueOf(min));
                        map.put("audio_type", Integer.valueOf(C19361d.this.f53531d));
                    }
                });
            }
            return min;
        }
    };

    /* renamed from: b */
    public BufferedAudioRecorder f53529b;

    /* renamed from: c */
    public String f53530c;

    /* renamed from: d */
    public int f53531d = 1;

    /* renamed from: e */
    public int f53532e = 18;

    /* renamed from: f */
    public AudioRecorderInterface f53533f;

    /* renamed from: g */
    public C19312b f53534g;

    /* renamed from: h */
    public C19375b f53535h;

    /* renamed from: i */
    public FaceBeautyInvoker f53536i = new FaceBeautyInvoker();

    /* renamed from: j */
    public C19378e f53537j;

    /* renamed from: k */
    public boolean f53538k = true;

    /* renamed from: l */
    public int f53539l = 0;

    /* renamed from: m */
    public boolean f53540m = true;

    /* renamed from: n */
    SurfaceTexture f53541n;

    /* renamed from: o */
    public boolean f53542o = false;

    /* renamed from: p */
    public int f53543p = -1;

    /* renamed from: q */
    public float f53544q = -1.0f;

    /* renamed from: r */
    public long f53545r = 0;

    /* renamed from: s */
    public long f53546s = 0;

    /* renamed from: t */
    public OnFrameAvailableListener f53547t = new OnFrameAvailableListener() {
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (C19361d.this.f53543p == -1) {
                C19361d.this.f53545r = System.currentTimeMillis();
            }
            C19361d.this.f53543p++;
            C19361d.this.f53546s = System.currentTimeMillis();
            float f = ((float) (C19361d.this.f53546s - C19361d.this.f53545r)) / 1000.0f;
            if (f >= 1.0f) {
                C19361d.this.f53544q = ((float) C19361d.this.f53543p) / f;
                C19361d.this.f53545r = C19361d.this.f53546s;
                C19361d.this.f53543p = 0;
            }
        }
    };

    /* renamed from: u */
    private long f53548u;

    /* renamed from: v */
    private long f53549v;

    /* renamed from: w */
    private boolean f53550w;

    /* renamed from: x */
    private boolean f53551x;

    /* renamed from: y */
    private AtomicBoolean f53552y = new AtomicBoolean(false);

    /* renamed from: z */
    private int f53553z = -1;

    /* renamed from: com.ss.android.medialib.presenter.d$a */
    public interface C19374a {
        /* renamed from: a */
        void mo40418a(int i);
    }

    /* renamed from: com.ss.android.medialib.presenter.d$b */
    public interface C19375b {
        /* renamed from: a */
        void mo40419a(C19350a aVar);

        boolean cx_();
    }

    /* renamed from: com.ss.android.medialib.presenter.d$c */
    public interface C19376c {
        /* renamed from: a */
        void mo40421a(Bitmap bitmap, int i);
    }

    /* renamed from: com.ss.android.medialib.presenter.d$d */
    public interface C19377d {
        /* renamed from: a */
        void mo40422a(int i, int i2);

        /* renamed from: a */
        void mo40423a(Bitmap bitmap);
    }

    /* renamed from: a */
    public final C19361d mo40280a(boolean z) {
        this.f53551x = z;
        return this;
    }

    /* renamed from: a */
    public final C19361d mo40277a(int i, int i2) {
        this.f53525F = i;
        this.f53526G = i2;
        return this;
    }

    /* renamed from: a */
    public final C19361d mo40279a(String str) {
        this.f53530c = str;
        this.f53536i.changeMusicPath(str);
        return this;
    }

    /* renamed from: a */
    public final C19361d mo40276a(float f) {
        this.f53522C = f;
        this.f53536i.setBGMVolume(f);
        return this;
    }

    /* renamed from: b */
    public final C19361d mo40328b(boolean z) {
        this.f53523D = z;
        return this;
    }

    /* renamed from: a */
    public final void mo40303a(String str, String str2, float f, float f2, float f3, boolean z, boolean z2) {
        this.f53536i.initDuet(str, f, f2, f3, z, z2);
        mo40278a(0, 0);
        mo40279a(str2);
        this.f53521B = true;
    }

    /* renamed from: a */
    public final boolean mo40310a() {
        if (this.f53536i != null) {
            return this.f53536i.previewDuetVideo();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo40331b(int i, int i2) {
        String str = f53519a;
        StringBuilder sb = new StringBuilder("changeOutputVideoSize: width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        C50792y.m109909a(str, sb.toString());
        this.f53536i.changeOutputVideoSize(i, i2);
    }

    /* renamed from: a */
    public final void mo40288a(Context context, String str, String str2) {
        this.f53536i.initReaction(context, str, str2);
        mo40278a(0, 0);
        mo40279a(str2);
    }

    /* renamed from: a */
    public final C19361d mo40278a(long j, long j2) {
        this.f53548u = j;
        this.f53549v = j2;
        this.f53536i.setMusicTime(this.f53548u, this.f53549v);
        return this;
    }

    /* renamed from: a */
    public final void mo40295a(IMonitor iMonitor) {
        if (this.f53534g == null) {
            this.f53534g = new C19312b(iMonitor);
        }
    }

    /* renamed from: a */
    public final synchronized int mo40253a(Context context, int i, AudioRecorderInterface audioRecorderInterface) {
        this.f53533f = audioRecorderInterface;
        if (context == null) {
            String str = f53519a;
            StringBuilder sb = new StringBuilder("file ");
            sb.append(C50792y.m109908a());
            sb.append(",fun ");
            sb.append(C50792y.m109912c());
            sb.append(",line ");
            sb.append(C50792y.m109910b());
            sb.append(": context is null");
            C50792y.m109914d(str, sb.toString());
            return -1000;
        }
        this.f53531d = i;
        if (this.f53529b != null) {
            this.f53529b.unInit();
            C50792y.m109909a(f53519a, "initRecord: mAudioRecorder.unInit()");
        }
        if ((this.f53531d & 1) != 0) {
            this.f53529b = new BufferedAudioRecorder(this, this.f53525F, this.f53526G);
            this.f53529b.init(1);
        }
        final int i2 = 0;
        if ((this.f53531d & 4) != 0 && !TextUtils.isEmpty(this.f53530c)) {
            this.f53536i.setBGMVolume(this.f53522C);
            Context context2 = context;
            i2 = this.f53536i.initAudioPlayer(context2, this.f53530c, this.f53549v + this.f53548u, this.f53551x, this.f53523D);
        }
        if (!(this.f53534g == null || i2 == 0)) {
            C19312b.m47170a("record_init_record", new C19311a() {
                /* renamed from: a */
                public final void mo39810a(Map<String, Object> map) {
                    map.put("ret", Integer.valueOf(i2));
                    map.put("audio_type", Integer.valueOf(C19361d.this.f53531d));
                }
            });
        }
        String str2 = f53519a;
        StringBuilder sb2 = new StringBuilder("initRecord return: ");
        sb2.append(i2);
        C50792y.m109909a(str2, sb2.toString());
        return i2;
    }

    /* renamed from: a */
    public final int[] mo40312a(int i, int i2, int i3, int i4) {
        return this.f53536i.updateReactionCameraPos(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final int[] mo40313a(int i, int i2, int i3, int i4, float f) {
        return this.f53536i.updateReactionCameraPosWithRotation(i, i2, i3, i4, f);
    }

    /* renamed from: b */
    public final void mo40332b(int i, int i2, int i3, int i4) {
        this.f53536i.setReactionPosMargin(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void mo40289a(Context context, String str, String str2, String str3) {
        this.f53536i.setCustomVideoBg(context, str, str2, str3, 0, true, this.f53523D);
        if (!TextUtils.isEmpty(str2)) {
            this.f53536i.previewVideoBg();
        }
        if (TextUtils.isEmpty(this.f53530c)) {
            this.f53536i.uninitAudioPlayer();
            mo40279a((String) null);
            mo40352d(0);
        }
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f53530c) && !TextUtils.isEmpty(str3)) {
            int initAudioPlayer = this.f53536i.initAudioPlayer(context, str3, this.f53549v, false, this.f53523D);
            String str4 = f53519a;
            StringBuilder sb = new StringBuilder("setCustomVideoBg, initAudioPlayer ret = ");
            sb.append(initAudioPlayer);
            C50792y.m109909a(str4, sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo40329b(double d) {
        this.f53536i.setVideoBgSpeed(d);
    }

    /* renamed from: a */
    public final synchronized int mo40252a(int i, String str) {
        mo40367f();
        return this.f53536i.tryRestore(i, str);
    }

    /* renamed from: a */
    public final void mo40243a(SurfaceTexture surfaceTexture) {
        this.f53541n = surfaceTexture;
    }

    /* renamed from: a */
    public final int mo40239a(int i, float[] fArr) {
        if (!(this.f53547t == null || this.f53541n == null)) {
            if (fArr != null) {
                boolean z = false;
                if ((fArr[0] * fArr[5]) - (fArr[1] * fArr[4]) >= 0.0f) {
                    z = true;
                }
                this.f53540m = z;
            }
            this.f53547t.onFrameAvailable(this.f53541n);
        }
        return this.f53536i.onDrawFrame(i, fArr);
    }

    /* renamed from: a */
    public final void mo40242a(int i, boolean z) {
        this.f53536i.updateRotation((i + this.f53539l) % 360, z);
    }

    /* renamed from: a */
    public final void mo40282a(float f, float f2, float f3) {
        this.f53536i.updateRotation(f, f2, f3);
    }

    /* renamed from: a */
    public final void mo40308a(float[] fArr, double d) {
        this.f53536i.setDeviceRotation(fArr, d);
    }

    /* renamed from: a */
    public final synchronized int mo40266a(String str, String str2, int i, String str3, String str4, boolean z, int i2) {
        int concat;
        synchronized (this) {
            mo40391l();
            long currentTimeMillis = System.currentTimeMillis();
            concat = this.f53536i.concat(str, str2, i, str3, str4, z, i2);
            C20114g.m49645a(0, "te_record_concat_ret", (long) concat);
            C20114g.m49645a(0, "te_record_concat_time", System.currentTimeMillis() - currentTimeMillis);
        }
        return concat;
    }

    /* renamed from: a */
    public final int mo40256a(Surface surface, String str) {
        int i = C19274g.m47034b().f53196g;
        int i2 = C19274g.m47034b().mo39747k() == 1 ? 1 : 0;
        C50792y.m109911b("MediaPresenter", "Start Play >>> ");
        final int startPlay = this.f53536i.startPlay(surface, str, this.f53550w, i, i2);
        if (!(this.f53534g == null || startPlay == 0)) {
            C19312b.m47170a("record_start_play", new C19311a() {
                /* renamed from: a */
                public final void mo39810a(Map<String, Object> map) {
                    map.put("ret", Integer.valueOf(startPlay));
                }
            });
        }
        StringBuilder sb = new StringBuilder("Start Play ret = ");
        sb.append(startPlay);
        C50792y.m109911b("MediaPresenter", sb.toString());
        return startPlay;
    }

    /* renamed from: a */
    public final int mo40255a(Surface surface) {
        return this.f53536i.changeSurface(surface);
    }

    /* renamed from: a */
    public final void mo40284a(float f, int i, int i2) {
        this.f53536i.setPreviewSizeRatio(f, i, i2);
    }

    /* renamed from: a */
    public final void mo40286a(int i, String str, float f, float f2) {
        String str2 = f53519a;
        StringBuilder sb = new StringBuilder("nativeSetBeautyFace: ");
        sb.append(i);
        C50792y.m109911b(str2, sb.toString());
        this.f53536i.setBeautyFace(i, str);
        this.f53536i.setBeautyFaceIntensity(f, f2);
    }

    /* renamed from: b */
    public final void mo40333b(int i, String str) {
        String str2 = f53519a;
        StringBuilder sb = new StringBuilder("nativeSetBeautyFace: ");
        sb.append(i);
        C50792y.m109911b(str2, sb.toString());
        this.f53536i.setBeautyFace(i, str);
    }

    /* renamed from: a */
    public final void mo40281a(float f, float f2) {
        this.f53536i.setBeautyFaceIntensity(f, f2);
    }

    /* renamed from: b */
    public final void mo40330b(float f) {
        m47274b(2, f);
    }

    /* renamed from: a */
    public final int mo40261a(String str, float f) {
        return mo40262a(str, f, f);
    }

    /* renamed from: a */
    public final int mo40262a(String str, float f, float f2) {
        return this.f53536i.setReshape(str, f, f2);
    }

    /* renamed from: a */
    public final void mo40287a(Context context) {
        this.f53536i.setNativeLibraryDir(context.getApplicationInfo().nativeLibraryDir);
    }

    /* renamed from: a */
    public final void mo40305a(Map<Integer, Float> map) {
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                m47274b(((Integer) entry.getKey()).intValue(), ((Float) entry.getValue()).floatValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo40304a(String str, Map<Integer, Float> map) {
        mo40350d(str);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                m47274b(((Integer) entry.getKey()).intValue(), ((Float) entry.getValue()).floatValue());
            }
        }
    }

    /* renamed from: a */
    public final int mo40264a(String str, int i, int i2, boolean z) {
        return mo40263a(str, i, i2, "");
    }

    /* renamed from: a */
    public final int mo40263a(String str, int i, int i2, String str2) {
        return this.f53536i.setStickerPathWithTag(str, i, i2, false, str2);
    }

    /* renamed from: a */
    public final int mo40265a(String str, int i, int i2, boolean z, String str2) {
        return this.f53536i.setStickerPathWithTag(str, i, i2, z, str2);
    }

    /* renamed from: b */
    public final void mo40335b(String str, float f) {
        int filterNew = this.f53536i.setFilterNew(str, f);
        String str2 = f53519a;
        StringBuilder sb = new StringBuilder("ret = ");
        sb.append(filterNew);
        C50792y.m109911b(str2, sb.toString());
    }

    /* renamed from: a */
    public final void mo40301a(String str, String str2, float f) {
        this.f53536i.setFilter(str, str2, f);
    }

    /* renamed from: a */
    public final void mo40302a(String str, String str2, float f, float f2, float f3) {
        this.f53536i.setFilterNew(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo40244a(C19223a aVar) {
        this.f53536i.setOnOpenGLCallback(aVar);
    }

    /* renamed from: a */
    public final int mo40268a(String str, int[] iArr, C19224b bVar) {
        return mo40269a(str, iArr, true, CompressFormat.PNG, bVar);
    }

    /* renamed from: a */
    public final int mo40269a(final String str, int[] iArr, boolean z, final CompressFormat compressFormat, C19224b bVar) {
        int i = compressFormat == CompressFormat.JPEG ? 1 : compressFormat == CompressFormat.PNG ? 0 : -1;
        return this.f53536i.shotScreen(str, iArr, z, i, new OnPictureCallback() {
            public final void onResult(int[] iArr, int i, int i2) {
                Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Config.ARGB_8888);
                C19225b.m46858a(createBitmap, str, compressFormat);
                if (createBitmap != null) {
                    createBitmap.recycle();
                }
            }
        }, bVar);
    }

    /* renamed from: a */
    public final int mo40270a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        return mo40271a(z2, z3, z4, z5);
    }

    /* renamed from: a */
    public final int mo40271a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f53536i.slamDeviceConfig(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final int mo40272a(double[] dArr, double d) {
        return this.f53536i.slamProcessIngestOri(dArr, d);
    }

    /* renamed from: b */
    public final int mo40323b(String str, int i, int i2, String str2) {
        return this.f53536i.slamSetInputText(str, i, i2, str2);
    }

    /* renamed from: a */
    public final int mo40259a(OnARTextCountCallback onARTextCountCallback) {
        return this.f53536i.slamGetTextLimitCount(onARTextCountCallback);
    }

    /* renamed from: a */
    public final int mo40258a(OnARTextContentCallback onARTextContentCallback) {
        return this.f53536i.slamGetTextParagraphContent(onARTextContentCallback);
    }

    /* renamed from: a */
    public final int mo40257a(OnARTextBitmapCallback onARTextBitmapCallback) {
        return this.f53536i.slamGetTextBitmap(onARTextBitmapCallback);
    }

    /* renamed from: a */
    public final void mo40299a(C50790w wVar) {
        this.f53536i.addLandMarkDetectListener(wVar);
    }

    /* renamed from: b */
    public final void mo40334b(C50790w wVar) {
        this.f53536i.removeLandMarkDetectListener(wVar);
    }

    /* renamed from: a */
    public final int mo40254a(Bitmap bitmap) {
        return this.f53536i.setSlamFace(bitmap);
    }

    /* renamed from: a */
    public final int mo40240a(ImageFrame imageFrame) {
        if (!(this.f53547t == null || this.f53541n == null)) {
            this.f53547t.onFrameAvailable(this.f53541n);
        }
        return this.f53536i.onDrawFrame(imageFrame);
    }

    /* renamed from: a */
    public final int mo40241a(ImageFrame imageFrame, int i) {
        return this.f53536i.onDrawFrame(imageFrame, i);
    }

    /* renamed from: a */
    public final void mo40285a(int i, long j, long j2, String str) {
        this.f53536i.sendEffectMsg(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo40290a(C2593a aVar) {
        this.f53536i.setMessageListenerV2(aVar);
    }

    /* renamed from: a */
    public final void mo40307a(boolean z, FaceInfoCallback faceInfoCallback) {
        this.f53536i.registerFaceInfoUpload(true, faceInfoCallback);
    }

    /* renamed from: a */
    public final void mo40291a(EffectAlgorithmCallback effectAlgorithmCallback) {
        this.f53536i.registerEffectAlgorithmCallback(effectAlgorithmCallback);
    }

    /* renamed from: a */
    public final void mo40283a(float f, float f2, float f3, float f4) {
        this.f53536i.setScanArea(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo40306a(boolean z, long j) {
        this.f53536i.enableScan(z, j);
    }

    /* renamed from: a */
    public final void mo40292a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        this.f53536i.registerCherEffectParamCallback(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo40309a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f53536i.recoverCherEffect(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo40297a(C19375b bVar) {
        mo40298a(bVar, -1);
    }

    /* renamed from: a */
    public final void mo40298a(C19375b bVar, int i) {
        this.f53535h = bVar;
        this.f53536i.setFrameCallback(this.f53535h == null ? null : new OnFrameCallback() {

            /* renamed from: a */
            C19350a f53569a = new C19350a();

            public final void onFrame(int i, double d) {
                this.f53569a.f53492b = i;
                this.f53569a.f53496f = (long) d;
                this.f53569a.f53499i = C19361d.this.f53540m;
                if (C19361d.this.f53535h != null) {
                    C19361d.this.f53535h.mo40419a(this.f53569a);
                }
            }

            public final void onInit(EGLContext eGLContext, int i, int i2, int i3, long j) {
                this.f53569a.f53491a = eGLContext;
                this.f53569a.f53493c = i;
                this.f53569a.f53494d = i2;
                this.f53569a.f53495e = i3;
                this.f53569a.f53497g = j;
            }

            public final void onFrame(ByteBuffer byteBuffer, int i, int i2, int i3, double d) {
                this.f53569a.f53498h = byteBuffer;
                this.f53569a.f53493c = i;
                this.f53569a.f53494d = i2;
                this.f53569a.f53495e = i3;
                this.f53569a.f53496f = (long) d;
                this.f53569a.f53499i = C19361d.this.f53540m;
                if (C19361d.this.f53535h != null) {
                    C19361d.this.f53535h.mo40419a(this.f53569a);
                }
            }
        }, bVar != null && bVar.cx_(), i);
    }

    /* renamed from: a */
    public final void mo40300a(String str, String str2) {
        this.f53536i.setRenderCacheTexture(str, str2);
    }

    /* renamed from: b */
    public final void mo40336b(String str, String str2) {
        this.f53536i.setRenderCacheString(str, str2);
    }

    /* renamed from: a */
    public final void mo40293a(OnRunningErrorCallback onRunningErrorCallback) {
        this.f53536i.setRunningErrorCallback(onRunningErrorCallback);
    }

    /* renamed from: a */
    public final void mo40294a(C19233b bVar) {
        this.f53536i.setNativeInitListener2(bVar);
    }

    /* renamed from: a */
    public final void mo40296a(IStickerRequestCallback iStickerRequestCallback) {
        this.f53536i.setStickerRequestCallback(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final int mo40273a(String[] strArr, int i) {
        return this.f53536i.setComposerNodes(strArr, i);
    }

    /* renamed from: b */
    public final int mo40324b(String str, String str2, float f) {
        return this.f53536i.updateComposerNode(str, str2, f);
    }

    /* renamed from: b */
    public final int mo40325b(String[] strArr, int i) {
        return this.f53536i.removeComposerNodes(strArr, i);
    }

    /* renamed from: a */
    public final int mo40274a(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        String str = f53519a;
        StringBuilder sb = new StringBuilder("setComposerNodesWithTag...");
        sb.append(vEEffectParams.toString());
        C50792y.m109913c(str, sb.toString());
        return this.f53536i.setVEEffectParams(vEEffectParams);
    }

    /* renamed from: b */
    public final int mo40326b(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        String str = f53519a;
        StringBuilder sb = new StringBuilder("appendComposerNodes...");
        sb.append(vEEffectParams.toString());
        C50792y.m109913c(str, sb.toString());
        return this.f53536i.setVEEffectParams(vEEffectParams);
    }

    /* renamed from: a */
    public final int mo40275a(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.intValueTwo = i2;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        vEEffectParams.stringArrayThree = new ArrayList<>(Arrays.asList(strArr3));
        String str = f53519a;
        StringBuilder sb = new StringBuilder("replaceComposerNodes...");
        sb.append(vEEffectParams.toString());
        C50792y.m109913c(str, sb.toString());
        return this.f53536i.setVEEffectParams(vEEffectParams);
    }

    /* renamed from: c */
    public final int[] mo40346c(String str, String str2) {
        return this.f53536i.checkComposerNodeExclusion(str, str2);
    }

    /* renamed from: a */
    public final int mo40260a(VEEffectParams vEEffectParams) {
        return this.f53536i.setVEEffectParams(vEEffectParams);
    }

    /* renamed from: a */
    public final boolean mo40311a(C50634ao aoVar, int i) {
        return this.f53536i.processTouchEvent(aoVar, i);
    }

    /* renamed from: a */
    public final int mo40267a(String str, String str2, String str3, String str4) {
        return mo40266a(str, str2, 0, str3, str4, false, -1);
    }

    /* renamed from: w */
    private void m47275w() {
        C19348a.f53483a = null;
        this.f53534g = null;
    }

    /* renamed from: y */
    private void m47278y() {
        this.f53536i.releaseEncoder();
    }

    public void lackPermission() {
        AudioRecorderInterface audioRecorderInterface = this.f53533f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.lackPermission();
        }
    }

    /* renamed from: m */
    public final void mo40394m() {
        mo40397n();
        mo40358e();
    }

    /* renamed from: o */
    public final void mo40398o() {
        mo40383i(true);
    }

    /* renamed from: r */
    public final void mo40404r() {
        this.f53536i.unRegisterFaceInfoUpload();
    }

    /* renamed from: u */
    public final int mo40411u() {
        return this.f53536i.bindEffectAudioProcessor(0, 0, false);
    }

    /* renamed from: x */
    private boolean m47276x() {
        if (this.f53529b == null || !this.f53529b.isProcessing()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final float mo40315b() {
        return this.f53536i.getReactionCamRotation();
    }

    /* renamed from: j */
    public final synchronized void mo40386j() {
        m47277y(false);
    }

    /* renamed from: k */
    public final boolean mo40390k() {
        return this.f53552y.get();
    }

    /* renamed from: l */
    public final void mo40391l() {
        if (this.f53529b != null && m47276x()) {
            this.f53529b.waitUtilAudioProcessDone();
        }
    }

    /* renamed from: n */
    public final void mo40397n() {
        if (this.f53529b != null) {
            this.f53529b.unInit();
            this.f53529b = null;
        }
        m47275w();
    }

    /* renamed from: q */
    public final void mo40402q() {
        if (this.f53529b != null) {
            this.f53529b.stopRecording();
        }
    }

    /* renamed from: s */
    public final void mo40408s() {
        this.f53536i.unRegisterEffectAlgorithmCallback();
    }

    /* renamed from: t */
    public final EnigmaResult mo40410t() {
        return this.f53536i.getEnigmaResult();
    }

    /* renamed from: v */
    public final float[] mo40414v() {
        return this.f53536i.getAECSuggestVolume();
    }

    /* renamed from: e */
    public final void mo40358e() {
        this.f53536i.uninitFaceBeautyPlay();
    }

    /* renamed from: g */
    public final long mo40372g() {
        return this.f53536i.getEndFrameTime();
    }

    /* renamed from: h */
    public final long mo40377h() {
        return this.f53536i.getLastAudioLength();
    }

    /* renamed from: p */
    public final void mo40400p() {
        if ((!this.f53521B || this.f53538k) && this.f53529b != null) {
            this.f53529b.startRecording(1.0d, false);
        }
    }

    /* renamed from: i */
    public final void mo40381i() {
        synchronized (this) {
            if (m47276x()) {
                C50792y.m109914d(f53519a, "Audio processing, will delete after nativeCloseWavFile");
                this.f53520A = true;
                return;
            }
            C50792y.m109909a(f53519a, "Delete last frag now");
            this.f53536i.deleteLastFrag();
        }
    }

    public C19361d() {
        this.f53536i.resetPerfStats();
        this.f53537j = new C19378e(this.f53536i);
    }

    /* renamed from: f */
    public final synchronized void mo40367f() {
        this.f53536i.clearFragFile();
    }

    /* renamed from: d */
    public final int[] mo40355d() {
        return this.f53536i.getReactionPosMarginInViewPixel();
    }

    /* renamed from: c */
    public final int[] mo40345c() {
        return this.f53536i.getReactionCameraPosInViewPixel();
    }

    /* renamed from: a */
    public static void m47273a(Runnable runnable) {
        FaceBeautyInvoker.setDuetVideoCompleteCallback(runnable);
    }

    /* renamed from: b */
    public final C19361d mo40327b(int i) {
        this.f53532e = i;
        return this;
    }

    /* renamed from: a */
    public final int mo40237a(double d) {
        return this.f53536i.onDrawFrameTime(d);
    }

    /* renamed from: d */
    public final int mo40348d(float f) {
        return m47274b(4, f);
    }

    /* renamed from: e */
    public final int mo40356e(float f) {
        return m47274b(5, f);
    }

    /* renamed from: f */
    public final float mo40363f(String str) {
        return this.f53536i.getFilterIntensity(str);
    }

    /* renamed from: g */
    public final int mo40370g(float f) {
        return m47274b(18, f);
    }

    /* renamed from: h */
    public final int mo40375h(float f) {
        return m47274b(10, f);
    }

    /* renamed from: i */
    public final int mo40380i(float f) {
        return m47274b(12, f);
    }

    /* renamed from: j */
    public final void mo40387j(int i) {
        this.f53536i.setForceAlgorithmCnt(i);
    }

    /* renamed from: k */
    public final void mo40389k(boolean z) {
        this.f53536i.setCameraFirstFrameOptimize(z);
    }

    /* renamed from: l */
    public final void mo40392l(boolean z) {
        this.f53536i.enableSceneRecognition(z);
    }

    /* renamed from: n */
    public final int mo40396n(boolean z) {
        return this.f53536i.slamNotifyHideKeyBoard(z);
    }

    /* renamed from: p */
    public final void mo40401p(boolean z) {
        this.f53536i.pauseEffectAudio(z);
    }

    /* renamed from: q */
    public final void mo40403q(boolean z) {
        this.f53536i.enableEffectBGM(z);
    }

    public void recordStatus(boolean z) {
        AudioRecorderInterface audioRecorderInterface = this.f53533f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.recordStatus(z);
        }
    }

    /* renamed from: s */
    public final int mo40407s(boolean z) {
        return this.f53536i.enableLandMarkGps(z);
    }

    /* renamed from: t */
    public final int mo40409t(boolean z) {
        return this.f53536i.setHandDetectLowpower(z);
    }

    /* renamed from: v */
    public final void mo40413v(boolean z) {
        this.f53536i.enableLandMark(z);
    }

    /* renamed from: f */
    public final int mo40364f(float f) {
        return m47274b(17, f);
    }

    /* renamed from: g */
    public final int mo40371g(String str) {
        return this.f53536i.slamSetLanguge(str);
    }

    /* renamed from: h */
    public final int mo40376h(String str) {
        return this.f53536i.setMusicNodes(str);
    }

    /* renamed from: i */
    public final void mo40382i(int i) {
        this.f53536i.chooseSlamFace(i);
    }

    /* renamed from: m */
    public final void mo40395m(boolean z) {
        this.f53536i.enableStickerRecognition(z);
    }

    /* renamed from: o */
    public final void mo40399o(boolean z) {
        this.f53536i.pauseEffectAudio(z);
    }

    /* renamed from: r */
    public final void mo40405r(boolean z) {
        this.f53536i.enableEffect(z);
    }

    /* renamed from: u */
    public final void mo40412u(boolean z) {
        this.f53536i.useLargeMattingModel(z);
    }

    /* renamed from: w */
    public final void mo40415w(boolean z) {
        if (this.f53536i != null) {
            this.f53536i.setEnableDuetV2(z);
        }
    }

    /* renamed from: d */
    public final int mo40350d(String str) {
        return this.f53536i.setReshapeResource(str);
    }

    /* renamed from: i */
    public final void mo40383i(boolean z) {
        if (this.f53529b != null) {
            this.f53536i.markPlayDone();
            this.f53529b.stopRecording();
        }
        this.f53536i.stopPlay();
        mo40391l();
        if (z) {
            m47278y();
        }
    }

    /* renamed from: j */
    public final boolean mo40388j(boolean z) {
        return this.f53536i.setSharedTextureStatus(z);
    }

    /* renamed from: x */
    public final int mo40416x(boolean z) {
        if (!this.f53521B || this.f53538k) {
            return this.f53536i.setEnableAEC(z);
        }
        return -1;
    }

    /* renamed from: y */
    private synchronized int m47277y(boolean z) {
        if (this.f53552y.get()) {
            return -1;
        }
        this.f53552y.getAndSet(true);
        int stopRecord = this.f53536i.stopRecord(false);
        if (this.f53529b != null) {
            this.f53529b.stopFeeding();
        }
        this.f53552y.getAndSet(false);
        C20114g.m49658b(0);
        return stopRecord;
    }

    /* renamed from: c */
    public final int mo40340c(String str) {
        return this.f53536i.setSkinTone(str);
    }

    public int closeWavFile(boolean z) {
        int closeWavFile;
        synchronized (this) {
            closeWavFile = this.f53536i.closeWavFile(z);
            AudioRecorderInterface audioRecorderInterface = this.f53533f;
            if (audioRecorderInterface != null) {
                audioRecorderInterface.closeWavFile(z);
            }
            if (this.f53520A) {
                this.f53536i.deleteLastFrag();
            }
            this.f53520A = false;
            C50792y.m109909a(f53519a, "closeWavFile");
        }
        return closeWavFile;
    }

    /* renamed from: e */
    public final void mo40359e(int i) {
        this.f53536i.enableAudio(i);
    }

    /* renamed from: g */
    public final void mo40373g(int i) {
        this.f53536i.changePreviewRadioMode(i);
    }

    /* renamed from: h */
    public final void mo40378h(int i) {
        this.f53536i.setDetectInterval(i);
    }

    /* renamed from: b */
    public final int mo40318b(Context context) {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            z = false;
        } else {
            z = packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        String str = f53519a;
        StringBuilder sb = new StringBuilder("has low latency ? ");
        sb.append(z);
        C50792y.m109911b(str, sb.toString());
        Pair a = C19317c.m47182a(context);
        String str2 = f53519a;
        StringBuilder sb2 = new StringBuilder("nativeSampleRate ? ");
        sb2.append(a.first);
        sb2.append(" nativeSamleBufferSize? ");
        sb2.append(a.second);
        C50792y.m109911b(str2, sb2.toString());
        return this.f53536i.bindEffectAudioProcessor(((Integer) a.first).intValue(), ((Integer) a.second).intValue(), true);
    }

    /* renamed from: d */
    public final void mo40352d(int i) {
        this.f53536i.setUseMusic(i);
    }

    /* renamed from: e */
    public final void mo40360e(String str) {
        int filter = this.f53536i.setFilter(str);
        String str2 = f53519a;
        StringBuilder sb = new StringBuilder("ret = ");
        sb.append(filter);
        C50792y.m109911b(str2, sb.toString());
    }

    /* renamed from: g */
    public final void mo40374g(boolean z) {
        this.f53536i.setCameraClose(z);
    }

    /* renamed from: h */
    public final void mo40379h(boolean z) {
        if (this.f53536i != null) {
            this.f53536i.setDetectionMode(z);
        }
    }

    /* renamed from: a */
    public final int mo40238a(int i) {
        return this.f53536i.initImageDrawer(i);
    }

    /* renamed from: c */
    public final void mo40342c(float f) {
        m47274b(1, f);
    }

    /* renamed from: e */
    public final void mo40361e(boolean z) {
        if (this.f53536i != null) {
            this.f53536i.setPreviewDuetVideoPaused(z);
        }
    }

    /* renamed from: f */
    public final void mo40368f(int i) {
        this.f53536i.setModeChangeState(2);
    }

    /* renamed from: b */
    public final int mo40320b(Surface surface) {
        int changeSurface = this.f53536i.changeSurface(surface);
        mo40368f(2);
        return changeSurface;
    }

    /* renamed from: c */
    public final void mo40343c(int i) {
        this.f53536i.setEffectBuildChainType(i);
    }

    /* renamed from: d */
    public final void mo40354d(boolean z) {
        if (this.f53536i != null) {
            this.f53536i.setSwapReactionRegion(z);
        }
    }

    /* renamed from: f */
    public final void mo40369f(boolean z) {
        this.f53536i.enable3buffer(z);
    }

    /* renamed from: b */
    public final int mo40321b(String str) {
        return this.f53536i.setFaceMakeUp(str);
    }

    /* renamed from: c */
    public final void mo40344c(boolean z) {
        if (this.f53536i != null) {
            this.f53536i.setSwapDuetRegion(z);
        }
    }

    /* renamed from: b */
    private int m47274b(int i, float f) {
        return this.f53536i.setIntensityByType(i, f);
    }

    /* renamed from: c */
    public final int mo40338c(float f, float f2) {
        return this.f53536i.processTouchEvent(f, f2);
    }

    /* renamed from: d */
    public final int mo40349d(float f, float f2) {
        return this.f53536i.slamProcessScaleEvent(f, f2);
    }

    /* renamed from: e */
    public final int mo40357e(float f, float f2) {
        return this.f53536i.slamProcessRotationEvent(f, f2);
    }

    public int onProcessData(byte[] bArr, int i) {
        C50792y.m109911b(f53519a, "onProcessData is running");
        return this.f53536i.addPCMData(bArr, i);
    }

    public int addPCMData(byte[] bArr, int i) {
        this.f53536i.onAudioCallback(bArr, i);
        AudioRecorderInterface audioRecorderInterface = this.f53533f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.addPCMData(bArr, i);
            C50792y.m109911b(f53519a, "addPCMData is running");
        }
        return 0;
    }

    /* renamed from: f */
    public final int mo40365f(float f, float f2) {
        return this.f53536i.slamProcessDoubleClickEvent(f, f2);
    }

    /* renamed from: b */
    public final int mo40317b(float f, float f2) {
        return this.f53536i.slamProcessTouchEvent(f, f2);
    }

    /* renamed from: d */
    public final int mo40351d(String str, String str2) {
        if (str2 != null) {
            return this.f53536i.animateImageToPreview(str, str2);
        }
        C50792y.m109914d(f53519a, "Illegal argument. imagePath can't be null. Consider using empty string to cancel.");
        return -100;
    }

    /* renamed from: f */
    public final int mo40366f(int i, int i2) {
        return this.f53536i.setComposerMode(i, i2);
    }

    /* renamed from: c */
    public final C19361d mo40341c(int i, int i2) {
        this.f53553z = i;
        this.f53532e = i2;
        return this;
    }

    /* renamed from: d */
    public final void mo40353d(int i, int i2) {
        this.f53536i.setReactionBorderParam(i, i2);
    }

    /* renamed from: a */
    public final int mo40249a(int i, float f) {
        return m47274b(i, f);
    }

    /* renamed from: e */
    public final boolean mo40362e(int i, int i2) {
        return this.f53536i.posInReactionRegion(i, i2);
    }

    /* renamed from: c */
    public final int mo40339c(Context context, int i, AudioRecorderInterface audioRecorderInterface) {
        if (this.f53529b != null) {
            this.f53529b.unInit();
        }
        if ((this.f53531d & 4) != 0) {
            this.f53536i.uninitAudioPlayer();
        }
        return mo40253a(context, 5, audioRecorderInterface);
    }

    public int initWavFile(int i, int i2, double d) {
        int initWavFile = this.f53536i.initWavFile(i, i2, d);
        AudioRecorderInterface audioRecorderInterface = this.f53533f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.initWavFile(i, i2, d);
            C50792y.m109909a(f53519a, "initWavFile");
        }
        return initWavFile;
    }

    /* renamed from: b */
    public final synchronized int mo40319b(Context context, int i, AudioRecorderInterface audioRecorderInterface) {
        if (this.f53531d == i) {
            C50792y.m109913c(f53519a, "changeAudioRecord: no need");
            return 1;
        } else if (context == null) {
            String str = f53519a;
            StringBuilder sb = new StringBuilder("file ");
            sb.append(C50792y.m109908a());
            sb.append(",fun ");
            sb.append(C50792y.m109912c());
            sb.append(",line ");
            sb.append(C50792y.m109910b());
            sb.append(": context is null");
            C50792y.m109914d(str, sb.toString());
            return -1000;
        } else {
            this.f53533f = audioRecorderInterface;
            int i2 = -2000;
            if ((this.f53531d & 1 & i) == 0 && this.f53529b != null) {
                this.f53529b.unInit();
                this.f53529b = null;
                C50792y.m109909a(f53519a, "changeAudioRecord: mAudioRecorder.unInit()");
            }
            if ((i & 1) != 0 && this.f53529b == null) {
                this.f53529b = new BufferedAudioRecorder(this, this.f53525F, this.f53526G);
                this.f53529b.init(1);
                C50792y.m109909a(f53519a, "changeAudioRecord: mAudioRecorder.init()");
            }
            if ((i & 4) != 0) {
                this.f53536i.setBGMVolume(this.f53522C);
                i2 = this.f53536i.initAudioPlayer(context, this.f53530c, this.f53548u + this.f53549v, this.f53551x, this.f53523D);
                String str2 = f53519a;
                StringBuilder sb2 = new StringBuilder("changeAudioRecord: initAudioPlayer return: ");
                sb2.append(i2);
                C50792y.m109909a(str2, sb2.toString());
            } else {
                this.f53536i.uninitAudioPlayer();
                mo40352d(0);
            }
            this.f53531d = i;
            return i2;
        }
    }

    /* renamed from: b */
    public final int mo40322b(String str, float f, float f2) {
        return this.f53536i.setFaceMakeUp(str, f, f2);
    }

    /* renamed from: a */
    public final int mo40245a(double d, double d2, double d3, double d4) {
        return this.f53536i.slamProcessIngestAcc(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final int mo40337c(double d, double d2, double d3, double d4) {
        return this.f53536i.slamProcessIngestGra(d, d2, d3, d4);
    }

    public int initAudioConfig(int i, int i2, int i3, int i4) {
        C50792y.m109909a(f53519a, "initAudioConfig");
        return this.f53536i.initAudioConfig(i, i2, i3, i4);
    }

    /* renamed from: b */
    public final int mo40316b(double d, double d2, double d3, double d4) {
        return this.f53536i.slamProcessIngestGyr(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo40250a(int i, float f, float f2, int i2) {
        return this.f53536i.slamProcessTouchEventByType(i, f, f2, i2);
    }

    /* renamed from: a */
    public final int mo40248a(float f, float f2, float f3, float f4, float f5) {
        return this.f53536i.slamProcessPanEvent(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final synchronized int mo40246a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return mo40247a(d, z, f, i, i2, z2, "", "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo40247a(double r18, boolean r20, float r21, int r22, int r23, boolean r24, java.lang.String r25, java.lang.String r26) {
        /*
            r17 = this;
            r7 = r17
            monitor-enter(r17)
            boolean r0 = r17.m47276x()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x000d
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            monitor-exit(r17)
            return r0
        L_0x000d:
            com.ss.android.medialib.FaceBeautyInvoker r0 = r7.f53536i     // Catch:{ all -> 0x005e }
            int r1 = r7.f53553z     // Catch:{ all -> 0x005e }
            int r2 = r7.f53532e     // Catch:{ all -> 0x005e }
            r0.setVideoQuality(r1, r2)     // Catch:{ all -> 0x005e }
            com.ss.android.medialib.FaceBeautyInvoker r8 = r7.f53536i     // Catch:{ all -> 0x005e }
            r9 = r18
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r15 = r25
            r16 = r26
            int r4 = r8.startRecord(r9, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x005e }
            if (r4 != 0) goto L_0x0040
            boolean r0 = r7.f53521B     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0034
            boolean r0 = r7.f53538k     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0040
        L_0x0034:
            org.libsdl.app.BufferedAudioRecorder r0 = r7.f53529b     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0040
            org.libsdl.app.BufferedAudioRecorder r0 = r7.f53529b     // Catch:{ all -> 0x005e }
            r1 = 1
            r2 = r18
            r0.startRecording(r2, r1)     // Catch:{ all -> 0x005e }
        L_0x0040:
            if (r4 != 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = r4
        L_0x0045:
            com.ss.android.medialib.d.b r1 = r7.f53534g     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r0 == 0) goto L_0x005c
            java.lang.String r8 = "record_start_record"
            com.ss.android.medialib.presenter.d$8 r9 = new com.ss.android.medialib.presenter.d$8     // Catch:{ all -> 0x005e }
            r5 = 0
            r1 = r9
            r2 = r17
            r3 = r4
            r6 = r21
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x005e }
            com.p683ss.android.medialib.p1183d.C19312b.m47170a(r8, r9)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r17)
            return r0
        L_0x005e:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.presenter.C19361d.mo40247a(double, boolean, float, int, int, boolean, java.lang.String, java.lang.String):int");
    }

    /* renamed from: a */
    public final int mo40251a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        C50792y.m109911b(f53519a, "init enter ");
        C19318f.m47183a().f53369a = this.f53536i;
        C20114g.m49661d(0);
        C20114g.m49660c(0);
        final int initFaceBeautyPlay = this.f53536i.initFaceBeautyPlay(i, i2, str, i3, i4, str2, i5, z);
        this.f53536i.setTextureTimeListener(this.f53528I);
        FaceBeautyInvoker.setRecordStopCallback(new C19214a() {
            /* renamed from: a */
            public final void mo39566a() {
                if (C19361d.this.f53529b != null) {
                    C19361d.this.f53529b.markRecordStop();
                }
            }
        });
        if (!(this.f53534g == null || initFaceBeautyPlay == 0)) {
            C19312b.m47170a("record_init_fb", new C19311a() {
                /* renamed from: a */
                public final void mo39810a(Map<String, Object> map) {
                    map.put("ret", Integer.valueOf(initFaceBeautyPlay));
                }
            });
        }
        String str3 = f53519a;
        StringBuilder sb = new StringBuilder("init ret = ");
        sb.append(initFaceBeautyPlay);
        C50792y.m109911b(str3, sb.toString());
        return initFaceBeautyPlay;
    }
}
