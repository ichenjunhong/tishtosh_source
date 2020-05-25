package com.p683ss.android.vesdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.C2240a;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.medialib.C19319g;
import com.p683ss.android.medialib.FFMpegInvoker;
import com.p683ss.android.ttve.common.C20071a;
import com.p683ss.android.ttve.common.C20072b;
import com.p683ss.android.ttve.common.C20083k;
import com.p683ss.android.ttve.common.TEImageUtils;
import com.p683ss.android.ttve.model.C20097d;
import com.p683ss.android.ttve.model.C20099f;
import com.p683ss.android.ttve.model.MVInfoBean;
import com.p683ss.android.ttve.model.MVResourceBean;
import com.p683ss.android.ttve.model.VEFrame;
import com.p683ss.android.ttve.model.VEFrame.ByteBufferFrame;
import com.p683ss.android.ttve.model.VEFrame.C20091a;
import com.p683ss.android.ttve.model.VEFrame.C20092b;
import com.p683ss.android.ttve.monitor.C20102a;
import com.p683ss.android.ttve.monitor.C20110e;
import com.p683ss.android.ttve.monitor.C20114g;
import com.p683ss.android.ttve.monitor.C20115h;
import com.p683ss.android.ttve.monitor.C20115h.C20116a;
import com.p683ss.android.ttve.monitor.TEMonitorInvoker;
import com.p683ss.android.ttve.nativePort.C20125a;
import com.p683ss.android.ttve.nativePort.NativeCallbacks.C20118a;
import com.p683ss.android.ttve.nativePort.NativeCallbacks.C20119b;
import com.p683ss.android.ttve.nativePort.NativeCallbacks.C20120c;
import com.p683ss.android.ttve.nativePort.NativeCallbacks.C20122e;
import com.p683ss.android.ttve.nativePort.TEInterface;
import com.p683ss.android.ttve.nativePort.TEReverseCallback;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ttve.nativePort.TEVideoUtils;
import com.p683ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.p683ss.android.ttve.p1225a.C20067a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.vesdk.C50712l.C50716c;
import com.p683ss.android.vesdk.C50792y;
import com.p683ss.android.vesdk.VEListener.C50537a;
import com.p683ss.android.vesdk.VEListener.C50541e;
import com.p683ss.android.vesdk.VEListener.C50547k;
import com.p683ss.android.vesdk.VEListener.C50548l;
import com.p683ss.android.vesdk.VEListener.C50549m;
import com.p683ss.android.vesdk.VEListener.C50550n;
import com.p683ss.android.vesdk.VEListener.C50552p;
import com.p683ss.android.vesdk.VEListener.C50553q;
import com.p683ss.android.vesdk.VEListener.C50555s;
import com.p683ss.android.vesdk.VEListener.C50561y;
import com.p683ss.android.vesdk.VEListener.VEInfoStickerBufferListener;
import com.p683ss.android.vesdk.VEMVAlgorithmConfig.MV_REESULT_IN_TYPE;
import com.p683ss.android.vesdk.VERecordData.VERecordSegmentData;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.C50585a;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import com.p683ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p683ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p683ss.android.vesdk.clipparam.VEClipParam;
import com.p683ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p683ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p683ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p683ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.p683ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import com.p683ss.android.vesdk.p2534d.C50660a;
import com.p683ss.android.vesdk.runtime.C50765b;
import com.p683ss.android.vesdk.runtime.C50772e;
import com.p683ss.android.vesdk.runtime.C50774g;
import com.p683ss.android.vesdk.utils.C50785a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.o */
public final class C50720o implements OnFrameAvailableListener {

    /* renamed from: aD */
    private static boolean f127288aD = false;

    /* renamed from: aa */
    private static boolean f127289aa = true;

    /* renamed from: ab */
    private static final Object f127290ab = new Object();

    /* renamed from: ac */
    private static volatile boolean f127291ac = false;

    /* renamed from: A */
    public long f127292A;

    /* renamed from: B */
    public long f127293B;

    /* renamed from: C */
    public long f127294C;

    /* renamed from: D */
    public boolean f127295D;

    /* renamed from: E */
    String f127296E;

    /* renamed from: F */
    long f127297F;

    /* renamed from: G */
    public boolean f127298G;

    /* renamed from: H */
    public C50741b f127299H;

    /* renamed from: I */
    public C50550n f127300I;

    /* renamed from: J */
    public C50553q f127301J;

    /* renamed from: K */
    C20115h f127302K;

    /* renamed from: L */
    int f127303L;

    /* renamed from: M */
    public float f127304M;

    /* renamed from: N */
    public String f127305N;

    /* renamed from: O */
    public double f127306O;

    /* renamed from: P */
    public double f127307P;

    /* renamed from: Q */
    public double f127308Q;

    /* renamed from: R */
    public double f127309R;

    /* renamed from: S */
    private C50774g f127310S;

    /* renamed from: T */
    private VESize f127311T;

    /* renamed from: U */
    private C20083k f127312U;

    /* renamed from: V */
    private C20067a f127313V;

    /* renamed from: W */
    private String[] f127314W;

    /* renamed from: X */
    private String[] f127315X;

    /* renamed from: Y */
    private String f127316Y;

    /* renamed from: Z */
    private int f127317Z;

    /* renamed from: a */
    public C50765b f127318a;

    /* renamed from: aA */
    private C20097d f127319aA;

    /* renamed from: aB */
    private boolean f127320aB;

    /* renamed from: aC */
    private MVInfoBean f127321aC;

    /* renamed from: aE */
    private boolean f127322aE;

    /* renamed from: aF */
    private boolean f127323aF;

    /* renamed from: aG */
    private boolean f127324aG;

    /* renamed from: aH */
    private Bitmap f127325aH;

    /* renamed from: aI */
    private float f127326aI;

    /* renamed from: aJ */
    private float f127327aJ;

    /* renamed from: aK */
    private float f127328aK;

    /* renamed from: aL */
    private int f127329aL;

    /* renamed from: aM */
    private float f127330aM;

    /* renamed from: aN */
    private int f127331aN;

    /* renamed from: aO */
    private int f127332aO;

    /* renamed from: aP */
    private final SurfaceTextureListener f127333aP;

    /* renamed from: aQ */
    private Callback2 f127334aQ;

    /* renamed from: aR */
    private C20122e f127335aR;

    /* renamed from: aS */
    private C20120c f127336aS;

    /* renamed from: aT */
    private C20118a f127337aT;

    /* renamed from: aU */
    private C20119b f127338aU;

    /* renamed from: ad */
    private VEConfig f127339ad;

    /* renamed from: ae */
    private C20072b f127340ae;

    /* renamed from: af */
    private C20072b f127341af;

    /* renamed from: ag */
    private int f127342ag;

    /* renamed from: ah */
    private int f127343ah;

    /* renamed from: ai */
    private Boolean f127344ai;

    /* renamed from: aj */
    private int f127345aj;

    /* renamed from: ak */
    private int f127346ak;

    /* renamed from: al */
    private SurfaceView f127347al;

    /* renamed from: am */
    private TextureView f127348am;

    /* renamed from: an */
    private int f127349an;

    /* renamed from: ao */
    private int f127350ao;

    /* renamed from: ap */
    private C50749j f127351ap;

    /* renamed from: aq */
    private C50748i f127352aq;

    /* renamed from: ar */
    private C50750k f127353ar;

    /* renamed from: as */
    private boolean f127354as;

    /* renamed from: at */
    private boolean f127355at;

    /* renamed from: au */
    private boolean f127356au;

    /* renamed from: av */
    private int f127357av;

    /* renamed from: aw */
    private int f127358aw;

    /* renamed from: ax */
    private int f127359ax;

    /* renamed from: ay */
    private int f127360ay;

    /* renamed from: az */
    private int f127361az;

    /* renamed from: b */
    String f127362b;

    /* renamed from: c */
    public C50746g f127363c;

    /* renamed from: d */
    public volatile C50549m f127364d;

    /* renamed from: e */
    public volatile C50547k f127365e;

    /* renamed from: f */
    public volatile C50552p f127366f;

    /* renamed from: g */
    public volatile C50561y f127367g;

    /* renamed from: h */
    public volatile C50555s f127368h;

    /* renamed from: i */
    public C50711k f127369i;

    /* renamed from: j */
    public C50711k f127370j;

    /* renamed from: k */
    public String f127371k;

    /* renamed from: l */
    public Map<Integer, Boolean> f127372l;

    /* renamed from: m */
    public final Object f127373m;

    /* renamed from: n */
    public AtomicBoolean f127374n;

    /* renamed from: o */
    public int f127375o;

    /* renamed from: p */
    public int f127376p;

    /* renamed from: q */
    public int f127377q;

    /* renamed from: r */
    public int f127378r;

    /* renamed from: s */
    public TEInterface f127379s;

    /* renamed from: t */
    public SurfaceTexture f127380t;

    /* renamed from: u */
    public Surface f127381u;

    /* renamed from: v */
    public int f127382v;

    /* renamed from: w */
    public long f127383w;

    /* renamed from: x */
    public long f127384x;

    /* renamed from: y */
    public long f127385y;

    /* renamed from: z */
    public long f127386z;

    /* renamed from: com.ss.android.vesdk.o$a */
    public enum C50740a {
        GET_FRAMES_MODE_NORMAL(1),
        GET_FRAMES_MODE_NOEFFECT(2),
        GET_FRAMES_MODE_ORIGINAL(4),
        GET_FRAMES_MODE_NORMAL_SCORE(9),
        GET_FRAMES_MODE_NOEFFECT_SCORE(10),
        GET_FRAMES_MODE_ORIGINAL_SCORE(12);
        

        /* renamed from: a */
        private int f127443a;

        public final int getValue() {
            return this.f127443a;
        }

        private C50740a(int i) {
            this.f127443a = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.o$b */
    class C50741b implements Runnable {

        /* renamed from: a */
        String f127444a;

        /* renamed from: b */
        public String f127445b;

        /* renamed from: c */
        String f127446c;

        /* renamed from: d */
        public C50711k f127447d;

        /* renamed from: e */
        boolean f127448e;

        /* renamed from: f */
        public String f127449f;

        /* renamed from: g */
        public int f127450g = 50;

        /* renamed from: h */
        public int f127451h = 50;

        /* renamed from: i */
        public int f127452i = 100;

        /* renamed from: j */
        public int f127453j = 100;

        public final void run() {
            String str;
            if (TextUtils.isEmpty(this.f127445b) || TextUtils.isEmpty(this.f127446c) || this.f127448e) {
                if (this.f127447d != null) {
                    this.f127447d.onCallback(MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME, -205, 0.0f, "File is empty or running");
                }
                return;
            }
            this.f127448e = true;
            int executeFFmpegCommand = TEVideoUtils.executeFFmpegCommand(C2240a.m6772a("ffmpeg -y -i %s -vf palettegen %s", new Object[]{this.f127445b, this.f127444a}), null);
            if (executeFFmpegCommand != 0) {
                this.f127448e = false;
                if (this.f127447d != null) {
                    this.f127447d.onCallback(MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME, executeFFmpegCommand, 0.0f, "ffmpeg gen palette");
                }
                return;
            }
            if (this.f127449f != null) {
                str = C2240a.m6773a(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [2:v]scale=w=%d:h=%d[o0];[0:v][o0]overlay=x=%d-w/2:y=%d-h/2[o1];[o1][1:v]paletteuse -f gif %s", new Object[]{this.f127445b, this.f127444a, this.f127449f, Integer.valueOf(this.f127450g), Integer.valueOf(this.f127451h), Integer.valueOf(this.f127452i), Integer.valueOf(this.f127453j), this.f127446c});
            } else {
                str = C2240a.m6773a(Locale.US, "ffmpeg -y -i %s -i %s -lavfi paletteuse -f gif %s", new Object[]{this.f127445b, this.f127444a, this.f127446c});
            }
            int executeFFmpegCommand2 = TEVideoUtils.executeFFmpegCommand(str, null);
            if (this.f127447d != null) {
                this.f127447d.onCallback(MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME, executeFFmpegCommand2, 0.0f, "ffmepg convert to gif");
            }
            this.f127448e = false;
        }

        C50741b() {
        }
    }

    /* renamed from: com.ss.android.vesdk.o$c */
    public enum C50742c {
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE,
        SCALE_MODE_FIT_START_WITH_2DENGINE,
        SCALE_MODE_FIT_END_WITH_2DENGINE,
        SCALE_MODE_CANVAS
    }

    /* renamed from: com.ss.android.vesdk.o$d */
    public enum C50743d {
        EDITOR_SEEK_FLAG_OnGoing(0),
        EDITOR_SEEK_FLAG_LastSeek(1),
        EDITOR_SEEK_FLAG_ToIframe(2),
        EDITOR_SEEK_FLAG_LAST_UpdateIn(EDITOR_SEEK_FLAG_LastSeek.getValue() | 4),
        EDITOR_SEEK_FLAG_LAST_UpdateOut(EDITOR_SEEK_FLAG_LastSeek.getValue() | 8),
        EDITOR_SEEK_FLAG_LAST_UpdateInOut(EDITOR_SEEK_FLAG_LastSeek.getValue() | 16),
        EDITOR_SEEK_FLAG_Forward(128),
        EDITOR_SEEK_FLAG_LAST_Forward(EDITOR_SEEK_FLAG_Forward.getValue() | EDITOR_SEEK_FLAG_LastSeek.getValue()),
        EDITOR_SEEK_FLAG_LAST_Clear(EDITOR_SEEK_FLAG_LastSeek.getValue() | UnReadVideoExperiment.BROWSE_RECORD_LIST),
        EDITOR_SEEK_FLAG_LAST_Accurate(EDITOR_SEEK_FLAG_LastSeek.getValue() | 640),
        EDITOR_SEEK_FLAG_LAST_Accurate_Clear(EDITOR_SEEK_FLAG_LastSeek.getValue() | 896),
        EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker(24577);
        

        /* renamed from: a */
        private int f127457a;

        public final int getValue() {
            return this.f127457a;
        }

        private C50743d(int i) {
            this.f127457a = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.o$e */
    public enum C50744e {
        EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
        EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);
        

        /* renamed from: a */
        private int f127459a;

        public final int getValue() {
            return this.f127459a;
        }

        private C50744e(int i) {
            this.f127459a = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.o$f */
    public enum C50745f {
        EDITOR_NORMAl_MODE,
        EDITOR_SLOMO_MODE
    }

    /* renamed from: com.ss.android.vesdk.o$g */
    class C50746g extends Handler {
        public final void handleMessage(Message message) {
            String str;
            int i = message.what;
            if (i != 4101) {
                if (i != 4103) {
                    if (i != 4105) {
                        if (i != 4117) {
                            if (i == 4133 && C50720o.this.f127367g != null) {
                                C50561y yVar = C50720o.this.f127367g;
                                int i2 = message.arg1;
                                int i3 = message.arg2;
                            }
                        } else if (C50720o.this.f127301J != null) {
                            C50720o.this.f127301J.mo86779a(null, -1, -1, -1, 0.0f);
                            C50720o.this.f127301J = null;
                        }
                    } else if (C50720o.this.f127365e != null) {
                        C50720o.this.f127365e.onCompileProgress(((Float) message.obj).floatValue());
                    }
                } else if (C50720o.this.f127365e != null) {
                    if (message.arg1 < 0) {
                        C50547k kVar = C50720o.this.f127365e;
                        int i4 = message.arg1;
                        int i5 = message.arg1;
                        if (message.obj == null) {
                            str = "";
                        } else {
                            str = message.obj.toString();
                        }
                        kVar.onCompileError(i4, i5, 0.0f, str);
                    } else {
                        C50720o.this.f127365e.onCompileDone();
                    }
                    C50720o.this.f127365e = null;
                }
            } else if (C50720o.this.f127364d != null) {
                C50720o.this.f127364d.mo88399a(0);
                C50720o.this.f127364d = null;
            }
        }

        public C50746g(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: com.ss.android.vesdk.o$h */
    public enum C50747h {
        ANY(65535),
        ERROR(0),
        NOTHING(1048576),
        IDLE(1),
        INITIALIZED(2),
        PREPARED(4),
        STARTED(8),
        PAUSED(16),
        SEEKING(32),
        STOPPED(64),
        COMPLETED(128);
        

        /* renamed from: a */
        private int f127463a;

        public final int getValue() {
            return this.f127463a;
        }

        public static C50747h valueOf(int i) {
            if (i == 4) {
                return PREPARED;
            }
            if (i == 8) {
                return STARTED;
            }
            if (i == 16) {
                return PAUSED;
            }
            if (i == 32) {
                return SEEKING;
            }
            if (i == 64) {
                return STOPPED;
            }
            if (i == 128) {
                return COMPLETED;
            }
            if (i == 65535) {
                return ANY;
            }
            if (i == 1048576) {
                return NOTHING;
            }
            switch (i) {
                case 0:
                    return ERROR;
                case 1:
                    return IDLE;
                case 2:
                    return INITIALIZED;
                default:
                    return null;
            }
        }

        private C50747h(int i) {
            this.f127463a = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.o$i */
    public enum C50748i {
        ALIGN_PARENT_LEFT,
        ALIGN_PARENT_TOP,
        ALIGN_PARENT_RIGHT,
        ALIGN_PARENT_BOTTOM,
        CENTER_IN_PARENT,
        CENTER_HORIZONTAL,
        CENTER_VERTICAL
    }

    /* renamed from: com.ss.android.vesdk.o$j */
    public enum C50749j {
        VIDEO_OUT_RATIO_1_1,
        VIDEO_OUT_RATIO_4_3,
        VIDEO_OUT_RATIO_3_4,
        VIDEO_OUT_RATIO_16_9,
        VIDEO_OUT_RATIO_9_16,
        VIDEO_OUT_RATIO_ORIGINAL
    }

    /* renamed from: com.ss.android.vesdk.o$k */
    public enum C50750k {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    /* renamed from: z */
    public static void m109694z() {
        TEVideoUtils.nativeCancelCompileProbe();
    }

    /* renamed from: a */
    public final void mo99327a() {
        C50792y.m109913c("VEEditor", "surfaceDestroyed...");
        this.f127379s.releasePreviewSurface();
    }

    /* renamed from: a */
    public final void mo99330a(Surface surface) {
        Rect rect;
        C50792y.m109913c("VEEditor", "surfaceCreated...");
        this.f127323aF = false;
        if (this.f127322aE && this.f127325aH != null) {
            Canvas lockCanvas = surface.lockCanvas(null);
            int width = lockCanvas.getWidth();
            int height = lockCanvas.getHeight();
            int width2 = this.f127325aH.getWidth();
            int height2 = this.f127325aH.getHeight();
            StringBuilder sb = new StringBuilder("width ");
            sb.append(width);
            sb.append(" height ");
            sb.append(height);
            sb.append(" image width ");
            sb.append(width2);
            sb.append(" image height ");
            sb.append(height2);
            C50792y.m109909a("VEEditor", sb.toString());
            float f = (float) width;
            float f2 = (float) height;
            float f3 = ((float) width2) / ((float) height2);
            if (f3 > f / f2) {
                int i = (height - ((int) (f / f3))) / 2;
                rect = new Rect(0, i, width, height - i);
            } else {
                int i2 = (width - ((int) (f2 * f3))) / 2;
                rect = new Rect(i2, 0, width - i2, height);
            }
            lockCanvas.drawBitmap(this.f127325aH, null, rect, null);
            surface.unlockCanvasAndPost(lockCanvas);
            if (this.f127324aG) {
                if (this.f127325aH != null && !this.f127325aH.isRecycled()) {
                    this.f127325aH.recycle();
                    this.f127325aH = null;
                }
                this.f127324aG = false;
            }
        }
        this.f127379s.setPreviewSurface(surface);
    }

    /* renamed from: b */
    public final void mo99349b() {
        boolean b = this.f127302K.mo42272b();
        long j = 1;
        C20114g.m49645a(1, "te_composition_effect_add", b ? 0 : 1);
        if (!b) {
            C20114g.m49646a(1, "te_composition_effect_json", this.f127302K.mo42268a(0));
        }
        boolean c = this.f127302K.mo42273c();
        String str = "te_composition_info_sticker_add";
        if (c) {
            j = 0;
        }
        C20114g.m49645a(1, str, j);
        if (!c) {
            C20114g.m49646a(1, "te_composition_info_sticker_json", this.f127302K.mo42268a(1));
        }
        this.f127302K.mo42269a();
        C20114g.m49646a(1, "iesve_veeditor_composition_finish_file", this.f127362b);
        C20114g.m49646a(1, "iesve_veeditor_composition_finish_result", "fail");
        C20114g.m49646a(1, "iesve_veeditor_composition_finish_reason", "");
        C20114g.m49658b(1);
    }

    /* renamed from: a */
    public final void mo99332a(C50711k kVar) {
        this.f127370j = kVar;
        C50792y.m109909a("VEEditor", "setOnErrorListener...");
    }

    /* renamed from: b */
    public final void mo99351b(C50711k kVar) {
        C50792y.m109909a("VEEditor", "setOnInfoListener...");
        this.f127369i = kVar;
    }

    /* renamed from: a */
    public final void mo99329a(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder("setDisplayPos... ");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        sb.append(" ");
        sb.append(i3);
        sb.append(" ");
        sb.append(i4);
        C50792y.m109909a("VEEditor", sb.toString());
        mo99328a(((float) i3) / ((float) this.f127342ag), ((float) i4) / ((float) this.f127343ah), 0.0f, -(((this.f127377q / 2) - (i3 / 2)) - i), ((this.f127378r / 2) - (i4 / 2)) - i2);
    }

    /* renamed from: a */
    public final VESize mo99326a(int i, int i2) {
        VESize vESize = new VESize(0, 0);
        float f = (float) i;
        float f2 = (float) i2;
        if (((float) this.f127311T.width) / ((float) this.f127311T.height) > f / f2) {
            vESize.width = i;
            vESize.height = (int) (f / (((float) this.f127311T.width) / ((float) this.f127311T.height)));
        } else {
            vESize.height = i2;
            vESize.width = (int) (f2 / (((float) this.f127311T.height) / ((float) this.f127311T.width)));
        }
        StringBuilder sb = new StringBuilder("getInitSize... surfaceWidth:");
        sb.append(i);
        sb.append(", surfaceHeight:");
        sb.append(i2);
        sb.append(", width:");
        sb.append(vESize.width);
        sb.append(", height:");
        sb.append(vESize.height);
        C50792y.m109909a("VEEditor", sb.toString());
        return vESize;
    }

    /* renamed from: a */
    public final void mo99328a(float f, float f2, float f3, int i, int i2) {
        m109680a(f, f2, f3, i, i2, 0);
    }

    /* renamed from: a */
    private void m109680a(float f, float f2, float f3, int i, int i2, int i3) {
        C50660a aVar = new C50660a();
        aVar.mo99060a("iesve_veeditor_video_scale_width", f).mo99060a("iesve_veeditor_video_scale_heigh", f2);
        C20110e.m49637a("iesve_veeditor_video_scale", 1, aVar);
        this.f127326aI = f3;
        this.f127327aJ = f2;
        this.f127328aK = f2;
        StringBuilder sb = new StringBuilder("setDisplayState... ");
        sb.append(f);
        sb.append(" ");
        sb.append(f2);
        sb.append(" ");
        sb.append(f3);
        sb.append(" ");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        sb.append(" 0");
        C50792y.m109909a("VEEditor", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scaleW", String.valueOf(f));
            jSONObject.put("scaleH", String.valueOf(f2));
            jSONObject.put("degree", String.valueOf(f3));
            jSONObject.put("transX", String.valueOf(i));
            jSONObject.put("transY", String.valueOf(i2));
            C20102a.m49612a("vesdk_event_editor_scale_rotate_trans", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        this.f127379s.setDisplayState(f, f2, f3, 0.0f, i, i2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r0 == 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r1 = new java.lang.StringBuilder("getDisplayImage failed ");
        r1.append(r0);
        com.p683ss.android.vesdk.C50792y.m109914d("VEEditor", r1.toString());
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062 A[Catch:{ Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo99325a(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrDisplayImage... width:"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)
            monitor-enter(r4)
            com.ss.android.vesdk.VESize r0 = new com.ss.android.vesdk.VESize     // Catch:{ all -> 0x00aa }
            com.ss.android.vesdk.VESize r1 = r4.f127311T     // Catch:{ all -> 0x00aa }
            int r1 = r1.width     // Catch:{ all -> 0x00aa }
            com.ss.android.vesdk.VESize r2 = r4.f127311T     // Catch:{ all -> 0x00aa }
            int r2 = r2.height     // Catch:{ all -> 0x00aa }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "VEEditor"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "getVideoResolution... width:"
            r2.<init>(r3)     // Catch:{ all -> 0x00aa }
            int r3 = r0.width     // Catch:{ all -> 0x00aa }
            r2.append(r3)     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = ", height:"
            r2.append(r3)     // Catch:{ all -> 0x00aa }
            int r3 = r0.height     // Catch:{ all -> 0x00aa }
            r2.append(r3)     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00aa }
            com.p683ss.android.vesdk.C50792y.m109909a(r1, r2)     // Catch:{ all -> 0x00aa }
            int r1 = r0.width     // Catch:{ all -> 0x00aa }
            r2 = 0
            if (r1 == 0) goto L_0x00a8
            int r1 = r0.height     // Catch:{ all -> 0x00aa }
            if (r1 != 0) goto L_0x004a
            goto L_0x00a8
        L_0x004a:
            if (r5 <= 0) goto L_0x0059
            int r1 = r0.width     // Catch:{ all -> 0x00aa }
            if (r5 < r1) goto L_0x0051
            goto L_0x0059
        L_0x0051:
            int r1 = r0.height     // Catch:{ all -> 0x00aa }
            int r1 = r1 * r5
            int r0 = r0.width     // Catch:{ all -> 0x00aa }
            int r1 = r1 / r0
            goto L_0x005d
        L_0x0059:
            int r5 = r0.width     // Catch:{ all -> 0x00aa }
            int r1 = r0.height     // Catch:{ all -> 0x00aa }
        L_0x005d:
            int r0 = r5 % 2
            r3 = 1
            if (r0 != r3) goto L_0x0064
            int r5 = r5 + 1
        L_0x0064:
            int r0 = r1 % 2
            if (r0 != r3) goto L_0x006a
            int r1 = r1 + 1
        L_0x006a:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x008e }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r1, r0)     // Catch:{ Exception -> 0x008e }
            com.ss.android.ttve.nativePort.TEInterface r0 = r4.f127379s     // Catch:{ all -> 0x00aa }
            int r0 = r0.getDisplayImage(r5)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x008d
            java.lang.String r5 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "getDisplayImage failed "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.p683ss.android.vesdk.C50792y.m109914d(r5, r0)
            r5 = r2
        L_0x008d:
            return r5
        L_0x008e:
            r5 = move-exception
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "getDisplayImage createBitmap failed "
            r1.<init>(r3)     // Catch:{ all -> 0x00aa }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00aa }
            r1.append(r5)     // Catch:{ all -> 0x00aa }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x00aa }
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r5)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            return r2
        L_0x00a8:
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            return r2
        L_0x00aa:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99325a(int):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final void mo99350b(int i) {
        StringBuilder sb = new StringBuilder("setBackgroundColor... color:");
        sb.append(i);
        C50792y.m109909a("VEEditor", sb.toString());
        this.f127331aN = i;
        this.f127379s.setBackGroundColor(i);
    }

    /* renamed from: a */
    public final int mo99283a(int i, int i2, C50744e eVar) {
        int prepareEngine;
        synchronized (this) {
            C50660a aVar = new C50660a();
            aVar.mo99061a("iesve_veeditor_cut_duration", i2 - i);
            C20110e.m49637a("iesve_veeditor_cut_duration", 1, aVar);
            StringBuilder sb = new StringBuilder("setInOut... ");
            sb.append(i);
            sb.append(" ");
            sb.append(i2);
            sb.append(" mode ");
            sb.append(eVar.getValue());
            C50792y.m109909a("VEEditor", sb.toString());
            this.f127379s.stop();
            this.f127379s.setTimeRange(i, i2, eVar.getValue());
            prepareEngine = this.f127379s.prepareEngine(0);
        }
        return prepareEngine;
    }

    /* renamed from: a */
    public final int mo99316a(boolean z) {
        return this.f127379s.setDestroyVersion(z);
    }

    /* renamed from: a */
    public final int mo99324a(String[] strArr, String[] strArr2, String[] strArr3, C50749j jVar) throws C50751p {
        synchronized (this) {
            C20114g.m49661d(1);
            C20114g.m49660c(1);
            this.f127384x = System.currentTimeMillis();
            this.f127385y = System.currentTimeMillis();
            C50792y.m109909a("VEEditor", "init...");
            if (this.f127318a == null) {
                C50792y.m109914d("VEEditor", "init mResManager is null");
                return -112;
            }
            int createScene = this.f127379s.createScene(this.f127318a.f127510a, strArr, strArr3, strArr2, null, jVar.ordinal());
            if (createScene != 0) {
                StringBuilder sb = new StringBuilder("Create Scene failed, ret = ");
                sb.append(createScene);
                C50792y.m109914d("VEEditor", sb.toString());
                mo99349b();
                this.f127354as = false;
                return createScene;
            }
            this.f127354as = true;
            this.f127318a.f127516g = false;
            this.f127351ap = jVar;
            this.f127318a.f127512c = strArr3;
            this.f127318a.f127511b = strArr;
            this.f127318a.f127513d = strArr2;
            this.f127358aw = -1;
            this.f127344ai = Boolean.valueOf((strArr3 == null || strArr3.length == 0) ? false : true);
            if (this.f127344ai.booleanValue()) {
                this.f127318a.f127519j = 1;
            } else {
                this.f127318a.f127519j = 0;
            }
            this.f127318a.f127518i = 0;
            this.f127346ak = 0;
            int G = m109666G();
            return G;
        }
    }

    /* renamed from: a */
    public final int mo99321a(String[] strArr, int[] iArr, int[] iArr2, float[] fArr) throws C50751p {
        synchronized (this) {
            this.f127384x = System.currentTimeMillis();
            this.f127385y = System.currentTimeMillis();
            C50792y.m109909a("VEEditor", "initOnlyAudio...");
            if (this.f127318a == null) {
                C50792y.m109914d("VEEditor", "init mResManager is null");
                return -112;
            }
            int createSceneOnlyAudio = this.f127379s.createSceneOnlyAudio(this.f127318a.f127510a, strArr, iArr, iArr2, fArr);
            if (createSceneOnlyAudio != 0) {
                StringBuilder sb = new StringBuilder("Create audio Scene failed, ret = ");
                sb.append(createSceneOnlyAudio);
                C50792y.m109914d("VEEditor", sb.toString());
                return createSceneOnlyAudio;
            }
            this.f127354as = true;
            this.f127318a.f127516g = false;
            this.f127318a.f127512c = strArr;
            this.f127318a.f127511b = null;
            this.f127318a.f127513d = null;
            this.f127351ap = null;
            this.f127358aw = -1;
            this.f127344ai = Boolean.valueOf(true);
            this.f127318a.f127519j = 1;
            this.f127318a.f127518i = 0;
            this.f127346ak = 0;
            return 0;
        }
    }

    /* renamed from: a */
    public final int mo99299a(VERecordData vERecordData, boolean z) {
        float[] fArr;
        int[] iArr;
        int[] iArr2;
        String[] strArr;
        VERecordData vERecordData2 = vERecordData;
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        if (!z) {
            int size = vERecordData2.f126770b.size();
            String[] strArr2 = new String[size];
            String[] strArr3 = new String[size];
            int[] iArr3 = new int[size];
            int[] iArr4 = new int[size];
            int[] iArr5 = new int[size];
            int[] iArr6 = new int[size];
            float[] fArr2 = new float[size];
            for (VERecordSegmentData vERecordSegmentData : vERecordData2.f126770b) {
                if (vERecordSegmentData.f126781h) {
                    strArr2[i] = vERecordSegmentData.f126774a;
                    strArr3[i] = vERecordSegmentData.f126775b;
                    int i2 = i;
                    iArr3[i2] = (int) (vERecordSegmentData.f126782i / 1000);
                    iArr4[i2] = (int) (vERecordSegmentData.f126783j / 1000);
                    fArr2[i2] = vERecordSegmentData.f126778e;
                    iArr5[i2] = (int) (((float) iArr3[i2]) * fArr2[i2]);
                    iArr6[i2] = (int) (((float) iArr4[i2]) * fArr2[i2]);
                    i = i2 + 1;
                } else {
                    int i3 = i;
                }
            }
            int i4 = i;
            if (i4 == 0) {
                C50792y.m109914d("VEEditor", "没有有效片段");
                return -100;
            }
            int i5 = i4;
            String[] strArr4 = (String[]) Arrays.copyOf(strArr2, i5);
            String[] strArr5 = (String[]) Arrays.copyOf(strArr3, i5);
            int[] copyOf = Arrays.copyOf(iArr3, i5);
            int[] copyOf2 = Arrays.copyOf(iArr4, i5);
            int[] copyOf3 = Arrays.copyOf(iArr5, i5);
            int[] copyOf4 = Arrays.copyOf(iArr6, i5);
            float[] copyOf5 = Arrays.copyOf(fArr2, i5);
            this.f127319aA = null;
            this.f127379s.clearFilter();
            this.f127312U.mo42186a();
            if (vERecordData2.f126771c) {
                strArr = null;
                iArr2 = null;
                iArr = null;
                fArr = null;
            } else {
                fArr = copyOf5;
                iArr = copyOf4;
                iArr2 = copyOf3;
                strArr = strArr5;
            }
            int a = m109675a(strArr4, copyOf, copyOf2, null, strArr, iArr2, iArr, null, fArr, null, C50749j.VIDEO_OUT_RATIO_ORIGINAL, true);
            StringBuilder sb = new StringBuilder("init with VERecordData: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            C50792y.m109909a("VEEditor", sb.toString());
            return a;
        } else if (vERecordData2.f126772d.isEmpty()) {
            C50792y.m109914d("VEEditor", "合并的视频文件路径未配置");
            return -100;
        } else {
            this.f127312U.mo42186a();
            this.f127319aA = null;
            this.f127379s.clearFilter();
            return mo99324a(new String[]{vERecordData2.f126772d}, (String[]) null, vERecordData2.f126771c ? null : new String[]{vERecordData2.f126773e}, C50749j.VIDEO_OUT_RATIO_ORIGINAL);
        }
    }

    /* renamed from: a */
    public final int mo99297a(VEEditorModel vEEditorModel, C50633an anVar) {
        synchronized (this) {
            C20114g.m49661d(1);
            C20114g.m49660c(1);
            this.f127384x = System.currentTimeMillis();
            this.f127385y = System.currentTimeMillis();
            C50792y.m109909a("VEEditor", "init with model...");
            mo99328a(1.0f, 1.0f, 0.0f, 0, 0);
            if (this.f127318a == null) {
                C50792y.m109914d("VEEditor", "init mResManager is null");
                return -112;
            }
            this.f127354as = true;
            this.f127318a.f127516g = vEEditorModel.f126720d;
            this.f127351ap = vEEditorModel.f126721e;
            this.f127318a.f127512c = vEEditorModel.f126730n;
            this.f127318a.f127511b = vEEditorModel.f126729m;
            this.f127318a.f127513d = vEEditorModel.f126731o;
            this.f127358aw = -1;
            this.f127344ai = Boolean.valueOf(vEEditorModel.f126722f);
            this.f127318a.f127518i = 0;
            this.f127346ak = vEEditorModel.f126723g;
            this.f127379s.setHostTrackIndex(vEEditorModel.f126724h);
            if (anVar != null) {
                int updateSenceTime = this.f127379s.updateSenceTime(anVar);
                if (updateSenceTime < 0) {
                    StringBuilder sb = new StringBuilder("updateSceneTime failed, ret = ");
                    sb.append(updateSenceTime);
                    C50792y.m109914d("VEEditor", sb.toString());
                    return updateSenceTime;
                }
                this.f127379s.setTimeRange(0, updateSenceTime, 0);
            }
            this.f127357av = vEEditorModel.f126727k;
            this.f127361az = vEEditorModel.f126728l;
            this.f127345aj = vEEditorModel.f126725i;
            return 0;
        }
    }

    /* renamed from: a */
    public final int mo99322a(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, String[] strArr3, int[] iArr3, int[] iArr4, float[] fArr, float[] fArr2, C50657c[] cVarArr, C50749j jVar) {
        return m109675a(strArr, iArr, iArr2, strArr2, strArr3, iArr3, iArr4, fArr, fArr2, cVarArr, jVar, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m109675a(java.lang.String[] r19, int[] r20, int[] r21, java.lang.String[] r22, java.lang.String[] r23, int[] r24, int[] r25, float[] r26, float[] r27, com.p683ss.android.vesdk.C50657c[] r28, com.p683ss.android.vesdk.C50720o.C50749j r29, boolean r30) throws com.p683ss.android.vesdk.C50751p {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r15 = r23
            r14 = r29
            monitor-enter(r18)
            r13 = 1
            com.p683ss.android.ttve.monitor.C20114g.m49661d(r13)     // Catch:{ all -> 0x0152 }
            com.p683ss.android.ttve.monitor.C20114g.m49660c(r13)     // Catch:{ all -> 0x0152 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0152 }
            r1.f127384x = r2     // Catch:{ all -> 0x0152 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0152 }
            r1.f127385y = r2     // Catch:{ all -> 0x0152 }
            java.lang.String r2 = "VEEditor"
            java.lang.String r3 = "init2... width rotate"
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r3)     // Catch:{ all -> 0x0152 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x0152 }
            r10 = 0
            int[] r16 = com.p683ss.android.vesdk.C50657c.toIntArray(r28)     // Catch:{ all -> 0x0152 }
            int r17 = r29.ordinal()     // Catch:{ all -> 0x0152 }
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r22
            r11 = r26
            r12 = r27
            r13 = r16
            r14 = r17
            r15 = r30
            int r2 = r2.createScene2(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0152 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0152 }
            r3.<init>()     // Catch:{ all -> 0x0152 }
            java.lang.String r4 = "videoFilePaths"
            if (r0 == 0) goto L_0x0058
            java.lang.String r5 = java.util.Arrays.toString(r19)     // Catch:{ JSONException -> 0x00ec }
            goto L_0x005a
        L_0x0058:
            java.lang.String r5 = ""
        L_0x005a:
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x00ec }
            java.lang.String r4 = "audioFilePaths"
            r5 = r23
            if (r5 == 0) goto L_0x0068
            java.lang.String r6 = java.util.Arrays.toString(r23)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x006a
        L_0x0068:
            java.lang.String r6 = ""
        L_0x006a:
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x00ee }
            java.lang.String r4 = "vTrimIn"
            if (r20 == 0) goto L_0x0076
            java.lang.String r6 = java.util.Arrays.toString(r20)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x0078
        L_0x0076:
            java.lang.String r6 = ""
        L_0x0078:
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x00ee }
            java.lang.String r4 = "vTrimOut"
            if (r21 == 0) goto L_0x0084
            java.lang.String r6 = java.util.Arrays.toString(r21)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x0086
        L_0x0084:
            java.lang.String r6 = ""
        L_0x0086:
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x00ee }
            java.lang.String r4 = "aTrimIn"
            if (r24 == 0) goto L_0x0092
            java.lang.String r6 = java.util.Arrays.toString(r24)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x0094
        L_0x0092:
            java.lang.String r6 = ""
        L_0x0094:
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x00ee }
            java.lang.String r4 = "aTrimOut"
            if (r25 == 0) goto L_0x00a0
            java.lang.String r6 = java.util.Arrays.toString(r25)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r6 = ""
        L_0x00a2:
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x00ee }
            java.lang.String r4 = "videoSpeed"
            if (r26 == 0) goto L_0x00ae
            java.lang.String r6 = java.util.Arrays.toString(r26)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r6 = ""
        L_0x00b0:
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x00ee }
            java.lang.String r4 = "audioSpeed"
            if (r27 == 0) goto L_0x00bc
            java.lang.String r6 = java.util.Arrays.toString(r27)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x00be
        L_0x00bc:
            java.lang.String r6 = ""
        L_0x00be:
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x00ee }
            java.lang.String r4 = "rotate"
            if (r28 == 0) goto L_0x00ca
            java.lang.String r6 = java.util.Arrays.toString(r28)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x00cc
        L_0x00ca:
            java.lang.String r6 = ""
        L_0x00cc:
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x00ee }
            java.lang.String r4 = "videoOutRes"
            r6 = r29
            if (r6 == 0) goto L_0x00da
            java.lang.String r7 = r29.name()     // Catch:{ JSONException -> 0x00f0 }
            goto L_0x00dc
        L_0x00da:
            java.lang.String r7 = ""
        L_0x00dc:
            r3.put(r4, r7)     // Catch:{ JSONException -> 0x00f0 }
            java.lang.String r4 = "resultCode"
            r3.put(r4, r2)     // Catch:{ JSONException -> 0x00f0 }
            java.lang.String r4 = "vesdk_event_editor_init_video"
            java.lang.String r7 = "behavior"
            com.p683ss.android.ttve.monitor.C20102a.m49612a(r4, r3, r7)     // Catch:{ JSONException -> 0x00f0 }
            goto L_0x00f0
        L_0x00ec:
            r5 = r23
        L_0x00ee:
            r6 = r29
        L_0x00f0:
            r13 = 0
            if (r2 == 0) goto L_0x010d
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0152 }
            java.lang.String r4 = "Create Scene failed, ret = "
            r3.<init>(r4)     // Catch:{ all -> 0x0152 }
            r3.append(r2)     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0152 }
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r3)     // Catch:{ all -> 0x0152 }
            r18.mo99349b()     // Catch:{ all -> 0x0152 }
            r1.f127354as = r13     // Catch:{ all -> 0x0152 }
            monitor-exit(r18)     // Catch:{ all -> 0x0152 }
            return r2
        L_0x010d:
            r2 = 1
            r1.f127354as = r2     // Catch:{ all -> 0x0152 }
            com.ss.android.vesdk.runtime.b r3 = r1.f127318a     // Catch:{ all -> 0x0152 }
            r3.f127516g = r13     // Catch:{ all -> 0x0152 }
            r1.f127351ap = r6     // Catch:{ all -> 0x0152 }
            com.ss.android.vesdk.runtime.b r3 = r1.f127318a     // Catch:{ all -> 0x0152 }
            r3.f127512c = r5     // Catch:{ all -> 0x0152 }
            com.ss.android.vesdk.runtime.b r3 = r1.f127318a     // Catch:{ all -> 0x0152 }
            r3.f127511b = r0     // Catch:{ all -> 0x0152 }
            com.ss.android.vesdk.runtime.b r0 = r1.f127318a     // Catch:{ all -> 0x0152 }
            r3 = r22
            r0.f127513d = r3     // Catch:{ all -> 0x0152 }
            r0 = -1
            r1.f127358aw = r0     // Catch:{ all -> 0x0152 }
            if (r5 == 0) goto L_0x012e
            int r0 = r5.length     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x012e
            r0 = 1
            goto L_0x012f
        L_0x012e:
            r0 = 0
        L_0x012f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0152 }
            r1.f127344ai = r0     // Catch:{ all -> 0x0152 }
            java.lang.Boolean r0 = r1.f127344ai     // Catch:{ all -> 0x0152 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x0142
            com.ss.android.vesdk.runtime.b r0 = r1.f127318a     // Catch:{ all -> 0x0152 }
            r0.f127519j = r2     // Catch:{ all -> 0x0152 }
            goto L_0x0146
        L_0x0142:
            com.ss.android.vesdk.runtime.b r0 = r1.f127318a     // Catch:{ all -> 0x0152 }
            r0.f127519j = r13     // Catch:{ all -> 0x0152 }
        L_0x0146:
            com.ss.android.vesdk.runtime.b r0 = r1.f127318a     // Catch:{ all -> 0x0152 }
            r0.f127518i = r13     // Catch:{ all -> 0x0152 }
            r1.f127346ak = r13     // Catch:{ all -> 0x0152 }
            int r0 = r18.m109666G()     // Catch:{ all -> 0x0152 }
            monitor-exit(r18)     // Catch:{ all -> 0x0152 }
            return r0
        L_0x0152:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0152 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.m109675a(java.lang.String[], int[], int[], java.lang.String[], java.lang.String[], int[], int[], float[], float[], com.ss.android.vesdk.c[], com.ss.android.vesdk.o$j, boolean):int");
    }

    /* renamed from: a */
    public final int mo99315a(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        int a;
        synchronized (this) {
            a = m109674a(str, strArr, strArr2, str2, i, i2, false);
        }
        return a;
    }

    /* renamed from: a */
    private List<List<List<MVResourceBean>>> m109679a(MVInfoBean mVInfoBean, List<String> list, List<String> list2) {
        ArrayList<MVResourceBean> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList3.add(arrayList4);
        arrayList3.add(arrayList5);
        ArrayList<MVResourceBean> arrayList6 = mVInfoBean.resources;
        ArrayList arrayList7 = new ArrayList();
        while (arrayList7.size() != arrayList6.size()) {
            ArrayList arrayList8 = new ArrayList();
            double d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            double d2 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            for (MVResourceBean mVResourceBean : arrayList6) {
                if (!arrayList7.contains(Integer.valueOf(mVResourceBean.rid))) {
                    if ("video".equals(mVResourceBean.type) || "img".equals(mVResourceBean.type) || "bgimg".equals(mVResourceBean.type)) {
                        List<String> list3 = list2;
                        if (mVResourceBean.seqIn >= d) {
                            MVResourceBean mVResourceBean2 = new MVResourceBean();
                            mVResourceBean2.seqIn = mVResourceBean.seqIn * 1000.0d;
                            mVResourceBean2.seqOut = mVResourceBean.seqOut * 1000.0d;
                            mVResourceBean2.trimIn = mVResourceBean.trimIn * 1000.0d;
                            mVResourceBean2.trimOut = mVResourceBean.trimOut * 1000.0d;
                            if (mVResourceBean2.trimOut != ProfileUiInitOptimizeEnterThreshold.DEFAULT || (!"img".equals(mVResourceBean.type) && !"bgimg".equals(mVResourceBean.type))) {
                                arrayList2 = arrayList5;
                                arrayList = arrayList6;
                            } else {
                                arrayList2 = arrayList5;
                                arrayList = arrayList6;
                                mVResourceBean2.trimOut = mVResourceBean2.seqOut - mVResourceBean2.seqIn;
                            }
                            mVResourceBean2.content = mVResourceBean.content;
                            mVResourceBean2.type = mVResourceBean.type;
                            mVResourceBean2.rid = mVResourceBean.rid;
                            arrayList8.add(mVResourceBean2);
                            d = mVResourceBean.seqOut;
                            arrayList7.add(Integer.valueOf(mVResourceBean2.rid));
                            list.add(mVResourceBean2.content);
                            arrayList5 = arrayList2;
                            arrayList6 = arrayList;
                        }
                        arrayList2 = arrayList5;
                        arrayList = arrayList6;
                        List<String> list4 = list;
                        arrayList5 = arrayList2;
                        arrayList6 = arrayList;
                    } else if (!"audio".equals(mVResourceBean.type)) {
                        List<String> list5 = list2;
                        if ("text".equals(mVResourceBean.type)) {
                            arrayList7.add(Integer.valueOf(mVResourceBean.rid));
                        } else {
                            arrayList7.add(Integer.valueOf(mVResourceBean.rid));
                        }
                        arrayList2 = arrayList5;
                        arrayList = arrayList6;
                        List<String> list42 = list;
                        arrayList5 = arrayList2;
                        arrayList6 = arrayList;
                    } else if (mVResourceBean.seqIn >= d2) {
                        ArrayList arrayList9 = new ArrayList();
                        MVResourceBean mVResourceBean3 = new MVResourceBean();
                        mVResourceBean3.seqIn = mVResourceBean.seqIn * 1000.0d;
                        mVResourceBean3.seqOut = mVResourceBean.seqOut * 1000.0d;
                        mVResourceBean3.trimIn = mVResourceBean.trimIn * 1000.0d;
                        mVResourceBean3.trimOut = mVResourceBean.trimOut * 1000.0d;
                        mVResourceBean3.content = mVResourceBean.content;
                        mVResourceBean3.type = mVResourceBean.type;
                        mVResourceBean3.rid = mVResourceBean.rid;
                        if (this.f127375o == 0) {
                            this.f127375o = mVResourceBean3.rid;
                        }
                        arrayList9.add(mVResourceBean3);
                        d2 = mVResourceBean.seqOut;
                        arrayList7.add(Integer.valueOf(mVResourceBean3.rid));
                        list2.add(mVResourceBean3.content);
                        if (arrayList9.size() > 0) {
                            arrayList5.add(arrayList9);
                        }
                    }
                }
                List<String> list6 = list2;
                arrayList2 = arrayList5;
                arrayList = arrayList6;
                List<String> list422 = list;
                arrayList5 = arrayList2;
                arrayList6 = arrayList;
            }
            List<String> list7 = list2;
            ArrayList arrayList10 = arrayList5;
            ArrayList<MVResourceBean> arrayList11 = arrayList6;
            List<String> list8 = list;
            if (arrayList8.size() > 0) {
                arrayList4.add(arrayList8);
            }
            arrayList5 = arrayList10;
            arrayList6 = arrayList11;
        }
        return arrayList3;
    }

    /* renamed from: a */
    private static void m109682a(List<MVResourceBean> list, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5) {
        int i = 0;
        for (MVResourceBean mVResourceBean : list) {
            iArr[i] = (int) mVResourceBean.trimIn;
            iArr2[i] = (int) mVResourceBean.trimOut;
            iArr3[i] = (int) mVResourceBean.seqIn;
            iArr4[i] = (int) mVResourceBean.seqOut;
            strArr[i] = mVResourceBean.content;
            iArr5[i] = mVResourceBean.rid;
            i++;
        }
    }

    /* renamed from: a */
    public final int mo99312a(String str, String str2, String str3, MV_REESULT_IN_TYPE mv_reesult_in_type) {
        StringBuilder sb = new StringBuilder("setExternalAlgorithmResult. photoPath = ");
        sb.append(str);
        sb.append(", algorithmType = ");
        sb.append(str2);
        sb.append(", result = ");
        sb.append(str3);
        sb.append(", type = ");
        sb.append(mv_reesult_in_type);
        C50792y.m109913c("VEEditor", sb.toString());
        if (this.f127316Y != null && this.f127314W != null && this.f127315X != null) {
            return this.f127379s.setExternalAlgorithmResult(str, str2, str3, mv_reesult_in_type.ordinal());
        }
        C50792y.m109914d("VEEditor", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    /* renamed from: a */
    public final int mo99305a(String str, int i, int i2) {
        C50792y.m109913c("VEEditor", "updateMVBackgroundAudioTrack");
        return m109687b(this.f127316Y, this.f127314W, this.f127315X, str, i, i2, false);
    }

    /* renamed from: a */
    public final int mo99314a(String str, String[] strArr, String[] strArr2) {
        C50792y.m109913c("VEEditor", "updateMVResources");
        return m109687b(str, strArr, strArr2, null, 0, 0, true);
    }

    /* renamed from: a */
    public final int mo99300a(C50633an anVar) {
        synchronized (this) {
            this.f127379s.stop();
            int updateSenceTime = this.f127379s.updateSenceTime(anVar);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", String.valueOf(updateSenceTime));
                jSONObject.put("sceneTime", anVar != null ? anVar.toString() : "");
                C20102a.m49612a("vesdk_event_editor_update_scene_time", jSONObject, "behavior");
            } catch (JSONException unused) {
            }
            if (updateSenceTime < 0) {
                String str = "VEEditor";
                StringBuilder sb = new StringBuilder("updateSceneTime failed, ret = ");
                sb.append(updateSenceTime);
                C50792y.m109914d(str, sb.toString());
                return updateSenceTime;
            }
            this.f127346ak = 0;
            C50792y.m109914d("VEEditor", "updateFilters");
            int duration = this.f127379s.getDuration();
            if (this.f127357av >= 0) {
                this.f127379s.adjustFilterInOut(this.f127357av, 0, duration);
            }
            if (this.f127361az >= 0) {
                this.f127379s.adjustFilterInOut(this.f127361az, 0, duration);
            }
            this.f127379s.setTimeRange(0, updateSenceTime, 0);
            int prepareEngine = this.f127379s.prepareEngine(0);
            if (prepareEngine == 0) {
                return 0;
            }
            StringBuilder sb2 = new StringBuilder("Prepare Engine failed, ret = ");
            sb2.append(prepareEngine);
            C50792y.m109914d("VEEditor", sb2.toString());
            return prepareEngine;
        }
    }

    /* renamed from: a */
    public final int mo99301a(C50633an anVar, int i, int i2) {
        StringBuilder sb = new StringBuilder("update sence time with start/end time");
        sb.append(anVar.toString());
        sb.append(" startTime: ");
        sb.append(i);
        sb.append(" endTime: ");
        sb.append(i2);
        C50792y.m109913c("VEEditor", sb.toString());
        synchronized (this) {
            this.f127379s.stop();
            int updateSenceTime = this.f127379s.updateSenceTime(anVar);
            if (updateSenceTime < 0) {
                StringBuilder sb2 = new StringBuilder("updateSceneTime failed, ret = ");
                sb2.append(updateSenceTime);
                C50792y.m109914d("VEEditor", sb2.toString());
                return updateSenceTime;
            }
            this.f127346ak = 0;
            this.f127379s.setTimeRange(i, i2, 0);
            int prepareEngine = this.f127379s.prepareEngine(0);
            if (prepareEngine == 0) {
                return 0;
            }
            StringBuilder sb3 = new StringBuilder("Prepare Engine failed, ret = ");
            sb3.append(prepareEngine);
            C50792y.m109914d("VEEditor", sb3.toString());
            return prepareEngine;
        }
    }

    /* renamed from: a */
    public final int mo99280a(int i, int i2, C50657c cVar) {
        StringBuilder sb = new StringBuilder("setFileRotate...");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        sb.append(" ");
        sb.append(cVar);
        C50792y.m109909a("VEEditor", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.ordinal());
        return this.f127379s.setClipAttr(0, i, i2, "clip rotate", sb2.toString());
    }

    /* renamed from: a */
    public final int mo99286a(int i, int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("insertClip, trackType:");
            sb.append(i);
            sb.append("clipIndex:");
            sb.append(i2);
            C50792y.m109913c(str, sb.toString());
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                StringBuilder sb2 = new StringBuilder("index: ");
                sb2.append(i3);
                sb2.append("clipSourceParams: ");
                sb2.append(((VEClipSourceParam) arrayList.get(i3)).toString());
                C50792y.m109913c("VEEditor", sb2.toString());
            }
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                StringBuilder sb3 = new StringBuilder("index: ");
                sb3.append(i4);
                sb3.append("clipTimelineParams: ");
                sb3.append(((VEClipTimelineParam) arrayList2.get(i4)).toString());
                C50792y.m109913c("VEEditor", sb3.toString());
            }
            this.f127379s.stop();
            int i5 = i2;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                int insertClip = this.f127379s.insertClip(i, 0, i5, (VEClipSourceParam) arrayList.get(i6), (VEClipTimelineParam) arrayList2.get(i6));
                if (insertClip < 0) {
                    StringBuilder sb4 = new StringBuilder("insertClip failed, ret = ");
                    sb4.append(insertClip);
                    C50792y.m109914d("VEEditor", sb4.toString());
                    return insertClip;
                }
                i5++;
            }
            this.f127346ak = 0;
            this.f127379s.setTimeRange(0, this.f127379s.getDuration(), 1);
            int x = m109693x(0);
            if (x == 0) {
                return 0;
            }
            StringBuilder sb5 = new StringBuilder("Prepare Engine failed, ret = ");
            sb5.append(x);
            C50792y.m109914d("VEEditor", sb5.toString());
            return x;
        }
    }

    /* renamed from: a */
    public final int mo99277a(int i, int i2, int i3) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("moveClip, trackType:");
            sb.append(i);
            sb.append(" from:");
            sb.append(i2);
            sb.append(" to:");
            sb.append(i3);
            C50792y.m109913c(str, sb.toString());
            this.f127379s.stop();
            int moveClip = this.f127379s.moveClip(i, i2, i3);
            if (moveClip < 0) {
                StringBuilder sb2 = new StringBuilder("moveClip failed, ret = ");
                sb2.append(moveClip);
                C50792y.m109914d("VEEditor", sb2.toString());
                return moveClip;
            }
            this.f127346ak = 0;
            int x = m109693x(0);
            if (x == 0) {
                return 0;
            }
            StringBuilder sb3 = new StringBuilder("Prepare Engine failed, ret = ");
            sb3.append(x);
            C50792y.m109914d("VEEditor", sb3.toString());
            return x;
        }
    }

    /* renamed from: a */
    public final int mo99282a(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("addTrackFilter trackType:");
            sb.append(i);
            sb.append(",trackIndex:");
            sb.append(i2);
            sb.append(",filterType:");
            sb.append(vEBaseFilterParam.filterType);
            C50792y.m109909a(str, sb.toString());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("filterName", vEBaseFilterParam.filterName);
                jSONObject.put("filterType", vEBaseFilterParam.filterType);
                jSONObject.put("trackType", i);
                jSONObject.put("trackIndex", i2);
                jSONObject.put("seqIn", i3);
                jSONObject.put("seqOut", i4);
                C20102a.m49612a("vesdk_event_editor_track_filter_effect", jSONObject, "behavior");
            } catch (JSONException unused) {
            }
            if (i == 1) {
                i2 = this.f127312U.mo42187b(1, i2);
            } else if (i == 0) {
                i2 = this.f127312U.mo42187b(2, i2);
            }
            if (i == 0 && vEBaseFilterParam.filterType == 15 && i2 == 0) {
                int i5 = this.f127359ax;
                return i5;
            }
            int i6 = this.f127379s.addFilters(new int[]{i2}, new String[]{vEBaseFilterParam.filterName}, new int[]{i3}, new int[]{i4}, new int[]{i}, new int[]{vEBaseFilterParam.filterType}, new int[]{vEBaseFilterParam.filterDurationType})[0];
            return i6;
        }
    }

    /* renamed from: a */
    public final int mo99289a(int i, VEBaseFilterParam vEBaseFilterParam) {
        int i2;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("updateTrackFilterParam, filterIndex: ");
            sb.append(i);
            C50792y.m109911b(str, sb.toString());
            i2 = -1;
            if (this.f127379s.updateFilterParam(-1, i, vEBaseFilterParam) >= 0) {
                i2 = 0;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final int mo99317a(int[] iArr) {
        int removeFilter;
        synchronized (this) {
            removeFilter = this.f127379s.removeFilter(iArr);
        }
        return removeFilter;
    }

    /* renamed from: a */
    public static C50720o m109678a(C50765b bVar, C50633an anVar, int i, int i2, C50548l lVar) {
        VEVideoEncodeSettings vEVideoEncodeSettings;
        C50765b bVar2 = bVar;
        C50633an anVar2 = anVar;
        int i3 = i;
        int i4 = i2;
        if (anVar2.f126928a == null || anVar2.f126928a.length <= 1) {
            vEVideoEncodeSettings = new C50585a(2).mo98692a(-1, -1).mo98691a(30).mo98703a(false).mo98711c(13).mo98716g(1).mo98700a((VEWatermarkParam) null).mo98698a(ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo98697a(ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo98704a(false, false).mo98705a();
        } else {
            vEVideoEncodeSettings = new C50585a(2).mo98692a(-1, -1).mo98715f(1).mo98691a(30).mo98703a(false).mo98711c(13).mo98716g(1).mo98700a((VEWatermarkParam) null).mo98698a(ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo98697a(ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo98704a(false, false).mo98705a();
        }
        StringBuilder sb = new StringBuilder("genReverseVideo2 with param:startTime:");
        sb.append(i3);
        sb.append("endTime:");
        sb.append(i4);
        C50792y.m109913c("VEEditor", sb.toString());
        float[] fArr = new float[anVar2.f126936i.length];
        for (int i5 = 0; i5 < anVar2.f126936i.length; i5++) {
            fArr[i5] = (float) anVar2.f126936i[i5];
        }
        C50720o oVar = new C50720o(bVar2.f127510a);
        String[] strArr = anVar2.f126928a;
        int[] iArr = anVar2.f126932e;
        int[] iArr2 = anVar2.f126933f;
        String[] strArr2 = anVar2.f126930c;
        int[] iArr3 = anVar2.f126934g;
        int[] iArr4 = anVar2.f126935h;
        int a = oVar.mo99322a(strArr, iArr, iArr2, null, strArr2, iArr3, iArr4, fArr, fArr, anVar2.f126938k, C50749j.VIDEO_OUT_RATIO_ORIGINAL);
        if (a != 0) {
            StringBuilder sb2 = new StringBuilder("genReverseVideo2 init2 error:");
            sb2.append(a);
            C50792y.m109914d("VEEditor", sb2.toString());
            return null;
        }
        oVar.m109685b(i3, i4, C50744e.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
        return m109676a(oVar, bVar2, vEVideoEncodeSettings, true, lVar);
    }

    /* renamed from: a */
    public static C50720o m109677a(C50765b bVar, VERecordData vERecordData, C50548l lVar) {
        VEVideoEncodeSettings a = new C50585a(2).mo98692a(-1, -1).mo98691a(30).mo98703a(false).mo98711c(13).mo98716g(1).mo98700a((VEWatermarkParam) null).mo98698a(ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo98697a(ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo98704a(false, false).mo98705a();
        C50720o oVar = new C50720o(bVar.f127510a);
        int a2 = oVar.mo99299a(vERecordData, false);
        if (a2 == 0) {
            return m109676a(oVar, bVar, a, true, lVar);
        }
        StringBuilder sb = new StringBuilder("genReverseVideo2 init error:");
        sb.append(a2);
        C50792y.m109914d("VEEditor", sb.toString());
        return null;
    }

    /* renamed from: a */
    private static C50720o m109676a(C50720o oVar, C50765b bVar, VEVideoEncodeSettings vEVideoEncodeSettings, boolean z, C50548l lVar) {
        VEVideoEncodeSettings vEVideoEncodeSettings2;
        C50720o oVar2 = oVar;
        C50765b bVar2 = bVar;
        final C50548l lVar2 = lVar;
        System.currentTimeMillis();
        m109694z();
        final TEReverseCallback tEReverseCallback = new TEReverseCallback();
        tEReverseCallback.setListener(lVar2);
        bVar2.f127516g = false;
        if (vEVideoEncodeSettings == null) {
            C50792y.m109913c("VEEditor", "using default video setting for genReverseVideo2");
            vEVideoEncodeSettings2 = new C50585a(2).mo98692a(-1, -1).mo98715f(1).mo98691a(30).mo98703a(false).mo98711c(13).mo98716g(1).mo98700a((VEWatermarkParam) null).mo98698a(ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo98697a(ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo98705a();
        } else {
            vEVideoEncodeSettings2 = vEVideoEncodeSettings;
        }
        String a = bVar2.mo99453a(0);
        final String a2 = bVar2.mo99453a(1);
        StringBuilder sb = new StringBuilder();
        sb.append(C50772e.m109884a(bVar2.f127510a, "concat"));
        sb.append(File.separator);
        sb.append(0);
        sb.append("_reverse");
        sb.append(".wav");
        String sb2 = sb.toString();
        final String str = a;
        final String str2 = sb2;
        C5072614 r13 = r0;
        final C50765b bVar3 = bVar;
        String str3 = sb2;
        final C50548l lVar3 = lVar;
        C5072614 r0 = new C50711k(oVar, true) {

            /* renamed from: a */
            final /* synthetic */ C50720o f127392a;

            public final void onCallback(int i, int i2, float f, String str) {
                if (i != 4103) {
                    if (i == 4105) {
                        TEReverseCallback tEReverseCallback = tEReverseCallback;
                        double d = (double) f;
                        Double.isNaN(d);
                        tEReverseCallback.onProgressChanged(d * 0.5d);
                    }
                } else if (this.f127392a.mo99267A()) {
                    if (true) {
                        TEVideoUtils.reverseAllIVideo(str, a2, tEReverseCallback);
                    } else {
                        TEVideoUtils.reverseAllIVideoAndMuxAudio(str, str2, a2, tEReverseCallback);
                    }
                    new Thread(new Runnable() {
                        public final void run() {
                            C5072614.this.f127392a.mo99389m();
                            String[] strArr = {str};
                            bVar3.f127511b = strArr;
                            if (true) {
                                String[] strArr2 = {str2};
                                bVar3.f127515f = strArr2;
                            }
                            String[] strArr3 = {a2};
                            bVar3.f127514e = strArr3;
                            bVar3.f127516g = true;
                            if (lVar3 != null) {
                                lVar3.mo89270a(0);
                            }
                        }
                    }).start();
                }
            }

            {
                this.f127392a = r1;
            }
        };
        oVar2.mo99351b((C50711k) r13);
        oVar2.mo99332a((C50711k) new C50711k(oVar2) {

            /* renamed from: a */
            final /* synthetic */ C50720o f127401a;

            {
                this.f127401a = r1;
            }

            public final void onCallback(int i, int i2, float f, String str) {
                new Thread(new Runnable() {
                    public final void run() {
                        C507282.this.f127401a.mo99389m();
                        if (lVar2 != null) {
                            lVar2.mo89270a(-1);
                        }
                    }
                }).start();
            }
        });
        oVar2.mo99335a(a, str3, vEVideoEncodeSettings2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mWorkSpace", bVar2.f127510a);
            jSONObject.put("mVideoPaths", bVar2.f127511b != null ? Arrays.toString(bVar2.f127511b) : null);
            jSONObject.put("mAudioPaths", bVar2.f127512c != null ? Arrays.toString(bVar2.f127512c) : null);
            jSONObject.put("mTransitions", bVar2.f127513d != null ? Arrays.toString(bVar2.f127513d) : null);
            jSONObject.put("mReverseVideoPath", bVar2.f127514e != null ? Arrays.toString(bVar2.f127514e) : null);
            jSONObject.put("mReverseAudioPaths", bVar2.f127515f != null ? Arrays.toString(bVar2.f127515f) : null);
            jSONObject.put("resultCode", 0);
            C20102a.m49612a("vesdk_event_editor_reverse_video", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return oVar2;
    }

    /* renamed from: a */
    public final int mo99319a(String[] strArr) {
        C50792y.m109913c("VEEditor", "setReverseVideoPaths");
        if (strArr == null || strArr.length <= 0) {
            C50792y.m109914d("VEEditor", "setReverseVideoPaths error, reverseVideoPaths is null");
            return -100;
        }
        if (this.f127318a != null) {
            this.f127318a.f127514e = strArr;
            this.f127318a.f127516g = true;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo99352b(String[] strArr) {
        C50792y.m109913c("VEEditor", "setVideoPaths");
        this.f127318a.f127511b = strArr;
    }

    /* renamed from: a */
    public final int mo99323a(String[] strArr, String[] strArr2) {
        C50792y.m109913c("VEEditor", "setReverseMediaPaths");
        if (strArr == null || strArr.length <= 0) {
            C50792y.m109914d("VEEditor", "setReverseMediaPaths error, reverseVideoPaths = null");
            return -100;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            C50792y.m109913c("VEEditor", "setReverseMediaPaths with reverseAudioPaths is null");
        }
        if (this.f127318a != null) {
            this.f127318a.f127515f = strArr2;
            this.f127318a.f127514e = strArr;
            this.f127318a.f127516g = true;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo99290a(int i, C50743d dVar) {
        int seek;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("seek... ");
            sb.append(i);
            sb.append(" flags ");
            sb.append(dVar);
            C50792y.m109913c(str, sb.toString());
            if ((dVar.getValue() & C50743d.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                this.f127364d = null;
                this.f127293B = System.currentTimeMillis();
                if (this.f127386z == 0) {
                    this.f127386z = this.f127293B;
                }
            }
            seek = this.f127379s.seek(i, this.f127377q, this.f127378r, dVar.getValue());
        }
        return seek;
    }

    /* renamed from: a */
    public final int mo99291a(int i, C50743d dVar, C50549m mVar) {
        int seek;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("seek with cb... ");
            sb.append(i);
            sb.append(" flags ");
            sb.append(dVar);
            C50792y.m109913c(str, sb.toString());
            if ((dVar.getValue() & C50743d.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                this.f127364d = mVar;
                this.f127293B = System.currentTimeMillis();
                if (this.f127386z == 0) {
                    this.f127386z = this.f127293B;
                }
            }
            seek = this.f127379s.seek(i, this.f127377q, this.f127378r, dVar.getValue());
            if (seek != 0) {
                StringBuilder sb2 = new StringBuilder("seek failed, result = ");
                sb2.append(seek);
                C50792y.m109914d("VEEditor", sb2.toString());
                this.f127364d = null;
            }
        }
        return seek;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        return -100;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo99308a(java.lang.String r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "addAudioTrack... "
            r1.<init>(r2)     // Catch:{ all -> 0x00a4 }
            r1.append(r11)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = " In "
            r1.append(r2)     // Catch:{ all -> 0x00a4 }
            r1.append(r12)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = " Out "
            r1.append(r2)     // Catch:{ all -> 0x00a4 }
            r1.append(r13)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ all -> 0x00a4 }
            r1.append(r14)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a4 }
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r1)     // Catch:{ all -> 0x00a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x00a4 }
            r1 = -100
            if (r0 == 0) goto L_0x0036
            monitor-exit(r10)     // Catch:{ all -> 0x00a4 }
            return r1
        L_0x0036:
            if (r13 <= r12) goto L_0x00a2
            if (r12 >= 0) goto L_0x003b
            goto L_0x00a2
        L_0x003b:
            java.lang.String r0 = "iesve_veeditor_import_music"
            r1 = 0
            r2 = 1
            com.p683ss.android.ttve.monitor.C20110e.m49637a(r0, r2, r1)     // Catch:{ all -> 0x00a4 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r10.f127379s     // Catch:{ all -> 0x00a4 }
            r5 = 0
            int r6 = r13 - r12
            r4 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            int r14 = r3.addAudioTrack(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = "trackIndexNative="
            r1.<init>(r3)     // Catch:{ all -> 0x00a4 }
            r1.append(r14)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a4 }
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r1)     // Catch:{ all -> 0x00a4 }
            com.ss.android.ttve.common.k r0 = r10.f127312U     // Catch:{ all -> 0x00a4 }
            int r14 = r0.mo42185a(r2, r14)     // Catch:{ all -> 0x00a4 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008d }
            r0.<init>()     // Catch:{ JSONException -> 0x008d }
            java.lang.String r1 = "path"
            r0.put(r1, r11)     // Catch:{ JSONException -> 0x008d }
            java.lang.String r11 = "trimIn"
            r0.put(r11, r12)     // Catch:{ JSONException -> 0x008d }
            java.lang.String r11 = "trimOut"
            r0.put(r11, r13)     // Catch:{ JSONException -> 0x008d }
            java.lang.String r11 = "resultCode"
            if (r14 < 0) goto L_0x0082
            r12 = 0
            goto L_0x0083
        L_0x0082:
            r12 = -1
        L_0x0083:
            r0.put(r11, r12)     // Catch:{ JSONException -> 0x008d }
            java.lang.String r11 = "vesdk_event_editor_audio_track"
            java.lang.String r12 = "behavior"
            com.p683ss.android.ttve.monitor.C20102a.m49612a(r11, r0, r12)     // Catch:{ JSONException -> 0x008d }
        L_0x008d:
            java.lang.String r11 = "VEEditor"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
            java.lang.String r13 = "addAudioTrack... "
            r12.<init>(r13)     // Catch:{ all -> 0x00a4 }
            r12.append(r14)     // Catch:{ all -> 0x00a4 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00a4 }
            com.p683ss.android.vesdk.C50792y.m109913c(r11, r12)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r10)     // Catch:{ all -> 0x00a4 }
            return r14
        L_0x00a2:
            monitor-exit(r10)     // Catch:{ all -> 0x00a4 }
            return r1
        L_0x00a4:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00a4 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99308a(java.lang.String, int, int, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        return -100;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo99279a(int r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "updateAudioTrack...  Index "
            r1.<init>(r2)     // Catch:{ all -> 0x004f }
            r1.append(r11)     // Catch:{ all -> 0x004f }
            java.lang.String r2 = " In "
            r1.append(r2)     // Catch:{ all -> 0x004f }
            r1.append(r12)     // Catch:{ all -> 0x004f }
            java.lang.String r2 = " Out "
            r1.append(r2)     // Catch:{ all -> 0x004f }
            r1.append(r13)     // Catch:{ all -> 0x004f }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ all -> 0x004f }
            r1.append(r14)     // Catch:{ all -> 0x004f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004f }
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r1)     // Catch:{ all -> 0x004f }
            r0 = -100
            if (r11 >= 0) goto L_0x0032
            monitor-exit(r10)     // Catch:{ all -> 0x004f }
            return r0
        L_0x0032:
            if (r13 <= r12) goto L_0x004d
            if (r12 >= 0) goto L_0x0037
            goto L_0x004d
        L_0x0037:
            com.ss.android.ttve.common.k r0 = r10.f127312U     // Catch:{ all -> 0x004f }
            r1 = 1
            int r3 = r0.mo42187b(r1, r11)     // Catch:{ all -> 0x004f }
            com.ss.android.ttve.nativePort.TEInterface r2 = r10.f127379s     // Catch:{ all -> 0x004f }
            r4 = 0
            int r5 = r13 - r12
            r9 = 0
            r6 = r12
            r7 = r13
            r8 = r14
            int r11 = r2.updateAudioTrack(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004f }
            monitor-exit(r10)     // Catch:{ all -> 0x004f }
            return r11
        L_0x004d:
            monitor-exit(r10)     // Catch:{ all -> 0x004f }
            return r0
        L_0x004f:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x004f }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99279a(int, int, int, boolean):int");
    }

    /* renamed from: a */
    public final boolean mo99333a(int i, int i2, float f) {
        boolean trackVolume;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setVolume... index:");
            sb.append(i);
            sb.append(" type:");
            sb.append(i2);
            sb.append(" volume:");
            sb.append(f);
            C50792y.m109913c(str, sb.toString());
            trackVolume = this.f127379s.setTrackVolume(i2, this.f127312U.mo42187b(1, i), f);
        }
        return trackVolume;
    }

    /* renamed from: a */
    public final int mo99313a(String str, String[] strArr) {
        int addInfoSticker;
        C50792y.m109909a("VEEditor", "addInfoSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C20110e.m49637a("iesve_veeditor_import_sticker", 1, (C50660a) null);
        synchronized (this) {
            addInfoSticker = this.f127379s.addInfoSticker(str, strArr);
        }
        C20116a aVar = new C20116a();
        aVar.f55325a = str;
        this.f127302K.mo42271a(1, addInfoSticker, aVar);
        StringBuilder sb = new StringBuilder("addInfoSticker success with index ");
        sb.append(addInfoSticker);
        C50792y.m109909a("VEEditor", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LeakCanaryFileProvider.f132050j, str);
            jSONObject.put("resultCode", addInfoSticker >= 0 ? 0 : -1);
            C20102a.m49612a("vesdk_event_editor_info_sticker", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return addInfoSticker;
    }

    /* renamed from: a */
    public final int mo99298a(VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        C50792y.m109913c("VEEditor", "setInfoStickerBufferCallback...");
        return this.f127379s.setInfoStickerBufferCallback(vEInfoStickerBufferListener);
    }

    /* renamed from: a */
    public final int mo99304a(String str, float f, float f2, float f3, float f4) {
        C50792y.m109909a("VEEditor", "addImageSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C20110e.m49637a("iesve_veeditor_import_sticker", 1, (C50660a) null);
        String[] strArr = {String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), "0"};
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LeakCanaryFileProvider.f132050j, str);
            jSONObject.put("width", (double) f3);
            jSONObject.put("height", (double) f4);
            C20102a.m49612a("vesdk_event_editor_image_sticker", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f127379s.addInfoSticker(str, strArr);
    }

    /* renamed from: b */
    public final int mo99347b(String str, float f, float f2, float f3, float f4) {
        C50792y.m109909a("VEEditor", "addImageStickerWithRatio...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C20110e.m49637a("iesve_veeditor_import_sticker", 1, (C50660a) null);
        return this.f127379s.addInfoSticker(str, new String[]{String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), "1"});
    }

    /* renamed from: a */
    public final int mo99276a(int i, float f, float f2) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerPosition... index: ");
            sb.append(i);
            sb.append("offsetX: ");
            sb.append(f);
            sb.append("offsetY: ");
            sb.append(f2);
            C50792y.m109909a(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f127379s.setFilterParam(i, "entity position x", String.valueOf(f)) + this.f127379s.setFilterParam(i, "entity position y", String.valueOf(f2));
            return filterParam;
        }
    }

    /* renamed from: a */
    public final int mo99284a(int i, int i2, String str) {
        synchronized (this) {
            C50792y.m109911b("VEEditor", "setSrtInfo");
            if (i < 0) {
                return -100;
            }
            return this.f127379s.setFilterParam(i, "entity audio start time", String.valueOf(i2)) + this.f127379s.setFilterParam(i, "entity srt info", str) + this.f127379s.setFilterParam(i, "entity srt", "true");
        }
    }

    /* renamed from: a */
    public final int mo99292a(int i, String str) {
        synchronized (this) {
            C50792y.m109911b("VEEditor", "setSrtFont");
            if (i < 0) {
                return -100;
            }
            return this.f127379s.setFilterParam(i, "entity srt font", str);
        }
    }

    /* renamed from: a */
    public final int mo99294a(int i, boolean z) {
        synchronized (this) {
            C50792y.m109911b("VEEditor", "setSrtManipulateState");
            if (i < 0) {
                return -100;
            }
            return this.f127379s.setFilterParam(i, "entity srt manipulate state", String.valueOf(z));
        }
    }

    /* renamed from: a */
    public final int mo99275a(int i, float f) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerRotation... index: ");
            sb.append(i);
            sb.append("degree: ");
            sb.append(f);
            C50792y.m109911b(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f127379s.setFilterParam(i, "entity rotation", String.valueOf(f));
            return filterParam;
        }
    }

    /* renamed from: a */
    public final int mo99295a(int i, float[] fArr) {
        synchronized (this) {
            C50792y.m109909a("VEEditor", "getInfoStickerPosition...");
            if (i >= 0) {
                if (fArr.length == 2) {
                    int infoStickerPosition = this.f127379s.getInfoStickerPosition(i, fArr);
                    return infoStickerPosition;
                }
            }
            return -100;
        }
    }

    /* renamed from: b */
    public final int mo99344b(int i, float[] fArr) {
        synchronized (this) {
            C50792y.m109909a("VEEditor", "getSrtInfoStickerInitPosition...");
            if (i >= 0) {
                if (fArr.length == 2) {
                    int srtInfoStickerInitPosition = this.f127379s.getSrtInfoStickerInitPosition(i, fArr);
                    return srtInfoStickerInitPosition;
                }
            }
            return -100;
        }
    }

    /* renamed from: a */
    public final int mo99296a(int i, ByteBuffer[] byteBufferArr) {
        StringBuilder sb = new StringBuilder("infoStickerPin getInfoStickerPinData... index:");
        sb.append(i);
        C50792y.m109913c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int infoStickerPinData = this.f127379s.getInfoStickerPinData(i, byteBufferArr);
                if (infoStickerPinData >= 0) {
                    return infoStickerPinData;
                }
                C50792y.m109914d("VEEditor", "infoStickerPin getInfoStickerPinData... faild ");
                return infoStickerPinData;
            }
        }
    }

    /* renamed from: a */
    public final int mo99293a(int i, ByteBuffer byteBuffer) {
        StringBuilder sb = new StringBuilder("infoStickerPin setInfoStickerPinWithFile... index:");
        sb.append(i);
        C50792y.m109913c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int restoreInfoStickerPinWithJson = this.f127379s.restoreInfoStickerPinWithJson(i, byteBuffer);
                if (restoreInfoStickerPinWithJson >= 0) {
                    return restoreInfoStickerPinWithJson;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin setInfoStickerPinWithFile... faild ret:");
                sb2.append(restoreInfoStickerPinWithJson);
                C50792y.m109914d("VEEditor", sb2.toString());
                return restoreInfoStickerPinWithJson;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:30|(2:32|(1:34))|35|36|37|38|39|40) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00f8 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo99346b(java.lang.String r7, float r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f127357av     // Catch:{ all -> 0x00fa }
            if (r0 >= 0) goto L_0x0009
            r7 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r6)     // Catch:{ all -> 0x00fa }
            return r7
        L_0x0009:
            if (r7 != 0) goto L_0x000f
            r7 = -100
            monitor-exit(r6)     // Catch:{ all -> 0x00fa }
            return r7
        L_0x000f:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0017
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0017:
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x001e
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x001e:
            com.ss.android.ttve.model.d r1 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            if (r1 != 0) goto L_0x0029
            com.ss.android.ttve.model.d r1 = new com.ss.android.ttve.model.d     // Catch:{ all -> 0x00fa }
            r1.<init>()     // Catch:{ all -> 0x00fa }
            r6.f127319aA = r1     // Catch:{ all -> 0x00fa }
        L_0x0029:
            com.ss.android.ttve.model.d r1 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = r1.f55256a     // Catch:{ all -> 0x00fa }
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x00fa }
            r2 = 0
            if (r1 == 0) goto L_0x0050
            com.ss.android.ttve.model.d r1 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = r1.f55257b     // Catch:{ all -> 0x00fa }
            int r1 = r1.length()     // Catch:{ all -> 0x00fa }
            if (r1 != 0) goto L_0x0050
            com.ss.android.ttve.model.d r1 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            float r1 = r1.f55259d     // Catch:{ all -> 0x00fa }
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0050
            com.ss.android.ttve.model.d r1 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            float r1 = r1.f55258c     // Catch:{ all -> 0x00fa }
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0050
            monitor-exit(r6)     // Catch:{ all -> 0x00fa }
            return r2
        L_0x0050:
            com.ss.android.ttve.model.d r1 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            r1.f55256a = r7     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.model.d r1 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = ""
            r1.f55257b = r3     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.model.d r1 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            r1.f55258c = r0     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.model.d r0 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            r0.f55259d = r8     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.model.d r0 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            r0.f55260e = r8     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.model.d r0 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            r0.f55261f = r2     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.model.d r0 = r6.f127319aA     // Catch:{ all -> 0x00fa }
            r1 = 1
            r0.f55262g = r1     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f127379s     // Catch:{ all -> 0x00fa }
            int r3 = r6.f127357av     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = "left filter"
            r0.setFilterParam(r3, r4, r7)     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f127379s     // Catch:{ all -> 0x00fa }
            int r3 = r6.f127357av     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = "left filter intensity"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r5.<init>()     // Catch:{ all -> 0x00fa }
            r5.append(r8)     // Catch:{ all -> 0x00fa }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00fa }
            r0.setFilterParam(r3, r4, r5)     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f127379s     // Catch:{ all -> 0x00fa }
            int r3 = r6.f127357av     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = "right filter"
            java.lang.String r5 = ""
            r0.setFilterParam(r3, r4, r5)     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f127379s     // Catch:{ all -> 0x00fa }
            int r3 = r6.f127357av     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = "filter position"
            java.lang.String r5 = "1.0"
            r0.setFilterParam(r3, r4, r5)     // Catch:{ all -> 0x00fa }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f127379s     // Catch:{ all -> 0x00fa }
            int r3 = r6.f127357av     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = "filter use v3"
            java.lang.String r5 = "true"
            r0.setFilterParam(r3, r4, r5)     // Catch:{ all -> 0x00fa }
            com.ss.android.vesdk.d.a r0 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x00fa }
            r0.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = ""
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00fa }
            if (r4 != 0) goto L_0x00c8
            java.lang.String r4 = java.io.File.separator     // Catch:{ all -> 0x00fa }
            java.lang.String[] r4 = r7.split(r4)     // Catch:{ all -> 0x00fa }
            int r5 = r4.length     // Catch:{ all -> 0x00fa }
            if (r5 <= 0) goto L_0x00c8
            int r3 = r4.length     // Catch:{ all -> 0x00fa }
            int r3 = r3 - r1
            r3 = r4[r3]     // Catch:{ all -> 0x00fa }
        L_0x00c8:
            java.lang.String r4 = "iesve_veeditor_set_filter_click_filter_id"
            r0.mo99062a(r4, r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = "iesve_veeditor_set_filter_click"
            com.p683ss.android.ttve.monitor.C20110e.m49637a(r3, r1, r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "te_composition_filter_id"
            com.p683ss.android.ttve.monitor.C20114g.m49646a(r1, r0, r7)     // Catch:{ all -> 0x00fa }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f8 }
            r0.<init>()     // Catch:{ JSONException -> 0x00f8 }
            java.lang.String r1 = "filterPath"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x00f8 }
            java.lang.String r7 = "intensity"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ JSONException -> 0x00f8 }
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x00f8 }
            java.lang.String r7 = "tag"
            java.lang.String r8 = "setColorFilterNew"
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x00f8 }
            java.lang.String r7 = "vesdk_event_editor_color_filter"
            java.lang.String r8 = "behavior"
            com.p683ss.android.ttve.monitor.C20102a.m49612a(r7, r0, r8)     // Catch:{ JSONException -> 0x00f8 }
        L_0x00f8:
            monitor-exit(r6)     // Catch:{ all -> 0x00fa }
            return r2
        L_0x00fa:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00fa }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99346b(java.lang.String, float):int");
    }

    /* renamed from: a */
    public final int mo99311a(String str, String str2, float f, float f2, float f3) {
        if (this.f127357av < 0) {
            return -105;
        }
        if (f < 0.0f || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        m109694z();
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = -1.0f;
        }
        if (f3 < 0.0f) {
            f3 = -1.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (this.f127319aA == null) {
            this.f127319aA = new C20097d();
        }
        if (str.equals(this.f127319aA.f55256a) && str2.equals(this.f127319aA.f55257b) && this.f127319aA.f55259d == f2 && this.f127319aA.f55260e == f3 && this.f127319aA.f55258c == f) {
            return 0;
        }
        this.f127319aA.f55256a = str;
        this.f127319aA.f55257b = str2;
        this.f127319aA.f55258c = f;
        this.f127319aA.f55259d = f2;
        this.f127319aA.f55260e = f3;
        this.f127319aA.f55261f = false;
        this.f127319aA.f55262g = true;
        StringBuilder sb = new StringBuilder("leftFilterPath: ");
        sb.append(str);
        sb.append("\nrightFilterPath: ");
        sb.append(str2);
        sb.append(" position: ");
        sb.append(f);
        sb.append("leftIntensity: ");
        sb.append(f2);
        sb.append("rightIntensity: ");
        sb.append(f3);
        C50792y.m109911b("VEEditor", sb.toString());
        this.f127379s.setFilterParam(this.f127357av, "left filter", str);
        this.f127379s.setFilterParam(this.f127357av, "right filter", str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f2);
        this.f127379s.setFilterParam(this.f127357av, "left filter intensity", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f3);
        this.f127379s.setFilterParam(this.f127357av, "right filter intensity", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f);
        this.f127379s.setFilterParam(this.f127357av, "filter position", sb4.toString());
        this.f127379s.setFilterParam(this.f127357av, "filter use v3", "true");
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
        aVar.mo99062a("iesve_veeditor_set_filter_slide_left_id", str3);
        aVar.mo99062a("iesve_veeditor_set_filter_slide_right_id", str4);
        C20110e.m49637a("iesve_veeditor_set_filter_slide", 1, aVar);
        return 0;
    }

    /* renamed from: a */
    public final int[] mo99337a(int[] iArr, int[] iArr2, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (iArr[i] < 0 || iArr[i] > this.f127379s.getDuration() || TextUtils.isEmpty(strArr[i])) {
                return new int[]{-100};
            }
        }
        boolean[] zArr = new boolean[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = false;
            iArr3[i2] = 0;
            iArr4[i2] = 0;
        }
        int length2 = strArr.length;
        String[] strArr2 = new String[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            strArr2[i3] = "";
        }
        if (iArr != null && iArr.length > 0 && iArr2 != null && iArr2.length > 0 && strArr2.length > 0 && strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder("addFilterEffectsWithTag: in ");
            sb.append(iArr[0]);
            sb.append(", out ");
            sb.append(iArr2[0]);
            sb.append(", tag ");
            sb.append(strArr2[0]);
            sb.append(", path ");
            sb.append(strArr[0]);
            C50792y.m109913c("VEEditor", sb.toString());
        }
        int i4 = 0;
        for (int i5 = 0; i5 < strArr2.length; i5++) {
            if ("FreezeFrame".equals(strArr2[i5])) {
                i4 = Math.max(i4, iArr2[i5]);
            }
        }
        StringBuilder sb2 = new StringBuilder("expandTimeline: ");
        sb2.append(i4);
        C50792y.m109913c("VEEditor", sb2.toString());
        this.f127379s.expandTimeline(i4);
        int length3 = iArr.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = new int[length3];
        int[] iArr7 = new int[length3];
        String[] strArr3 = new String[length3];
        for (int i6 = 0; i6 < length3; i6++) {
            iArr5[i6] = 0;
            iArr6[i6] = 0;
            strArr3[i6] = "filter effect";
            iArr7[i6] = 8;
        }
        int[] addFilters = this.f127379s.addFilters(iArr5, strArr3, iArr, iArr2, iArr6, iArr7);
        if (length3 != addFilters.length) {
            int[] iArr8 = new int[length3];
            Arrays.fill(iArr8, -1);
            return iArr8;
        }
        int i7 = 0;
        while (i7 < length3) {
            this.f127379s.setFilterParam(addFilters[i7], "effect res path", strArr[i7]);
            this.f127379s.setFilterParam(addFilters[i7], "effect sticker tag", strArr2[i7] == null ? "" : strArr2[i7]);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(iArr3[i7]);
            this.f127379s.setFilterParam(addFilters[i7], "effect sticker id", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(iArr4[i7]);
            this.f127379s.setFilterParam(addFilters[i7], "effect req id", sb4.toString());
            C20116a aVar = new C20116a();
            aVar.f55325a = strArr[i7];
            aVar.f55326b = iArr[i7];
            aVar.f55327c = iArr2[i7] - iArr[i7];
            this.f127302K.mo42271a(0, addFilters[i7], aVar);
            i7++;
        }
        return addFilters;
    }

    /* renamed from: b */
    public final int mo99348b(int[] iArr) {
        for (int a : iArr) {
            this.f127302K.mo42270a(0, a);
        }
        return this.f127379s.removeFilter(iArr);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0443 A[Catch:{ all -> 0x0738 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x04c7 A[Catch:{ all -> 0x0738 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0564 A[Catch:{ all -> 0x0738 }, LOOP:1: B:60:0x055e->B:62:0x0564, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x05e8 A[Catch:{ all -> 0x0738 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0612 A[Catch:{ all -> 0x0738 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x068d A[Catch:{ all -> 0x0738 }, LOOP:3: B:77:0x0687->B:79:0x068d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x06f2 A[Catch:{ all -> 0x0738 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0712 A[Catch:{ all -> 0x0738 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x072a A[Catch:{ all -> 0x0738 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo99281a(int r33, int r34, com.p683ss.android.vesdk.filterparam.VEBaseFilterParam r35) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r8 = r34
            r3 = r35
            monitor-enter(r32)
            boolean r4 = r3 instanceof com.p683ss.android.vesdk.filterparam.VERepeatFilterParam     // Catch:{ all -> 0x0738 }
            r5 = -1
            if (r4 == 0) goto L_0x0027
            r4 = r3
            com.ss.android.vesdk.filterparam.VERepeatFilterParam r4 = (com.p683ss.android.vesdk.filterparam.VERepeatFilterParam) r4     // Catch:{ all -> 0x0738 }
            int r6 = r4.seqIn     // Catch:{ all -> 0x0738 }
            int r4 = r4.repeatDuration     // Catch:{ all -> 0x0738 }
            int r6 = r6 + r4
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r4 = r4.getDuration()     // Catch:{ all -> 0x0738 }
            if (r6 <= r4) goto L_0x0044
            java.lang.String r2 = "VEEditor"
            java.lang.String r3 = "(repeatFilterParam.seqIn + repeatFilterParam.repeatDuration) > mVideoEditor.getDuration() error"
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r3)     // Catch:{ all -> 0x0738 }
            monitor-exit(r32)     // Catch:{ all -> 0x0738 }
            return r5
        L_0x0027:
            boolean r4 = r3 instanceof com.p683ss.android.vesdk.filterparam.VESlowMotionFilterParam     // Catch:{ all -> 0x0738 }
            if (r4 == 0) goto L_0x0044
            r4 = r3
            com.ss.android.vesdk.filterparam.VESlowMotionFilterParam r4 = (com.p683ss.android.vesdk.filterparam.VESlowMotionFilterParam) r4     // Catch:{ all -> 0x0738 }
            int r6 = r4.seqIn     // Catch:{ all -> 0x0738 }
            int r4 = r4.slowMotionDuration     // Catch:{ all -> 0x0738 }
            int r6 = r6 + r4
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r4 = r4.getDuration()     // Catch:{ all -> 0x0738 }
            if (r6 <= r4) goto L_0x0044
            java.lang.String r2 = "VEEditor"
            java.lang.String r3 = "((slowFilterParam.seqIn + slowFilterParam.slowMotionDuration) > mVideoEditor.getDuration() error"
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r3)     // Catch:{ all -> 0x0738 }
            monitor-exit(r32)     // Catch:{ all -> 0x0738 }
            return r5
        L_0x0044:
            m109694z()     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r4 = r4.getCurState()     // Catch:{ all -> 0x0738 }
            r6 = -20000(0xffffffffffffb1e0, float:NaN)
            r7 = 1
            r15 = 0
            if (r4 == r6) goto L_0x0056
            r19 = 1
            goto L_0x0058
        L_0x0056:
            r19 = 0
        L_0x0058:
            if (r19 == 0) goto L_0x0062
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r4 = r4.stop()     // Catch:{ all -> 0x0738 }
            r6 = r4
            goto L_0x0063
        L_0x0062:
            r6 = 0
        L_0x0063:
            if (r6 == 0) goto L_0x007e
            r4 = -101(0xffffffffffffff9b, float:NaN)
            if (r6 == r4) goto L_0x007e
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r4 = "pauseSync failed in addRepeatEffect, ret "
            r3.<init>(r4)     // Catch:{ all -> 0x0738 }
            r3.append(r6)     // Catch:{ all -> 0x0738 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r3)     // Catch:{ all -> 0x0738 }
            monitor-exit(r32)     // Catch:{ all -> 0x0738 }
            return r5
        L_0x007e:
            int[] r4 = new int[r7]     // Catch:{ all -> 0x0738 }
            r4[r15] = r5     // Catch:{ all -> 0x0738 }
            int[] r9 = new int[r7]     // Catch:{ all -> 0x0738 }
            r9[r15] = r5     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r5 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r5 = r5.getDuration()     // Catch:{ all -> 0x0738 }
            int r10 = r3.filterType     // Catch:{ all -> 0x0738 }
            r11 = 25
            if (r10 != r11) goto L_0x0413
            boolean r10 = r3 instanceof com.p683ss.android.vesdk.filterparam.VERepeatFilterParam     // Catch:{ all -> 0x0738 }
            if (r10 == 0) goto L_0x0259
            r4 = r3
            com.ss.android.vesdk.filterparam.VERepeatFilterParam r4 = (com.p683ss.android.vesdk.filterparam.VERepeatFilterParam) r4     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r10 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int[] r12 = new int[r7]     // Catch:{ all -> 0x0738 }
            r12[r15] = r2     // Catch:{ all -> 0x0738 }
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ all -> 0x0738 }
            java.lang.String r14 = r4.filterName     // Catch:{ all -> 0x0738 }
            r13[r15] = r14     // Catch:{ all -> 0x0738 }
            int[] r14 = new int[r7]     // Catch:{ all -> 0x0738 }
            r14[r15] = r15     // Catch:{ all -> 0x0738 }
            int[] r11 = new int[r7]     // Catch:{ all -> 0x0738 }
            r11[r15] = r5     // Catch:{ all -> 0x0738 }
            r28 = r6
            int[] r6 = new int[r7]     // Catch:{ all -> 0x0738 }
            r6[r15] = r8     // Catch:{ all -> 0x0738 }
            r29 = r9
            int[] r9 = new int[r7]     // Catch:{ all -> 0x0738 }
            r16 = 25
            r9[r15] = r16     // Catch:{ all -> 0x0738 }
            int[] r15 = new int[r7]     // Catch:{ all -> 0x0738 }
            int r7 = r4.filterDurationType     // Catch:{ all -> 0x0738 }
            r16 = 0
            r15[r16] = r7     // Catch:{ all -> 0x0738 }
            r20 = r10
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r11
            r25 = r6
            r26 = r9
            r27 = r15
            int[] r6 = r20.addFilters(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r7 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r9 = r4.timeMode     // Catch:{ all -> 0x0738 }
            r7.f127517h = r9     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r6[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect seqin"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.seqIn     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r6[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect repeating duration"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.repeatDuration     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r6[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect repeating times"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.repeatTime     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r6[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect repeating mode"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.timeMode     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r7 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r7 = r7.f127519j     // Catch:{ all -> 0x0738 }
            r9 = 1
            if (r7 != r9) goto L_0x01db
            com.ss.android.ttve.nativePort.TEInterface r10 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int[] r11 = new int[r9]     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r7 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r7 = r7.f127518i     // Catch:{ all -> 0x0738 }
            r12 = 0
            r11[r12] = r7     // Catch:{ all -> 0x0738 }
            java.lang.String[] r7 = new java.lang.String[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r13 = r4.filterName     // Catch:{ all -> 0x0738 }
            r7[r12] = r13     // Catch:{ all -> 0x0738 }
            int[] r13 = new int[r9]     // Catch:{ all -> 0x0738 }
            r13[r12] = r12     // Catch:{ all -> 0x0738 }
            int[] r14 = new int[r9]     // Catch:{ all -> 0x0738 }
            r14[r12] = r5     // Catch:{ all -> 0x0738 }
            int[] r15 = new int[r9]     // Catch:{ all -> 0x0738 }
            r15[r12] = r9     // Catch:{ all -> 0x0738 }
            int[] r5 = new int[r9]     // Catch:{ all -> 0x0738 }
            r16 = 25
            r5[r12] = r16     // Catch:{ all -> 0x0738 }
            int[] r12 = new int[r9]     // Catch:{ all -> 0x0738 }
            int r9 = r4.filterDurationType     // Catch:{ all -> 0x0738 }
            r16 = 0
            r12[r16] = r9     // Catch:{ all -> 0x0738 }
            r9 = r12
            r12 = r7
            r16 = r5
            r17 = r9
            int[] r5 = r10.addFilters(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r5[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect seqin"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.seqIn     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r5[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect repeating duration"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.repeatDuration     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r5[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect repeating times"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.repeatTime     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r5[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect repeating mode"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.timeMode     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            r9 = r5
            goto L_0x01dd
        L_0x01db:
            r9 = r29
        L_0x01dd:
            java.lang.String r5 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r10 = "TimeEffect addRepeatEffect...  trackIndex:"
            r7.<init>(r10)     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " trackType:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            r7.append(r8)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " filterIndex:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            r2 = 0
            r10 = r6[r2]     // Catch:{ all -> 0x0738 }
            r7.append(r10)     // Catch:{ all -> 0x0738 }
            java.lang.String r10 = " audioFilterIndex:"
            r7.append(r10)     // Catch:{ all -> 0x0738 }
            r10 = r9[r2]     // Catch:{ all -> 0x0738 }
            r7.append(r10)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " seqIn:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            int r2 = r4.seqIn     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " seqOut:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            int r2 = r4.seqOut     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " repeatDuration:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            int r2 = r4.repeatDuration     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " repeatTime:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            int r2 = r4.repeatTime     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " timeMode:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            int r2 = r4.timeMode     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109914d(r5, r2)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.d.a r2 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x0738 }
            r2.<init>()     // Catch:{ all -> 0x0738 }
            java.lang.String r4 = "iesve_veeditor_time_effect_id"
            java.lang.String r5 = "repeat"
            r2.mo99062a(r4, r5)     // Catch:{ all -> 0x0738 }
            java.lang.String r4 = "iesve_veeditor_time_effect"
            r5 = 1
            com.p683ss.android.ttve.monitor.C20110e.m49637a(r4, r5, r2)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.monitor.h r2 = r1.f127302K     // Catch:{ all -> 0x0738 }
            r2.f55324c = r5     // Catch:{ all -> 0x0738 }
        L_0x0255:
            r20 = r6
            goto L_0x041b
        L_0x0259:
            r28 = r6
            r29 = r9
            boolean r6 = r3 instanceof com.p683ss.android.vesdk.filterparam.VESlowMotionFilterParam     // Catch:{ all -> 0x0738 }
            if (r6 == 0) goto L_0x0417
            r4 = r3
            com.ss.android.vesdk.filterparam.VESlowMotionFilterParam r4 = (com.p683ss.android.vesdk.filterparam.VESlowMotionFilterParam) r4     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r9 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r6 = 1
            int[] r10 = new int[r6]     // Catch:{ all -> 0x0738 }
            r7 = 0
            r10[r7] = r2     // Catch:{ all -> 0x0738 }
            java.lang.String[] r11 = new java.lang.String[r6]     // Catch:{ all -> 0x0738 }
            java.lang.String r12 = r4.filterName     // Catch:{ all -> 0x0738 }
            r11[r7] = r12     // Catch:{ all -> 0x0738 }
            int[] r12 = new int[r6]     // Catch:{ all -> 0x0738 }
            r12[r7] = r7     // Catch:{ all -> 0x0738 }
            int[] r13 = new int[r6]     // Catch:{ all -> 0x0738 }
            r13[r7] = r5     // Catch:{ all -> 0x0738 }
            int[] r14 = new int[r6]     // Catch:{ all -> 0x0738 }
            r14[r7] = r8     // Catch:{ all -> 0x0738 }
            int[] r15 = new int[r6]     // Catch:{ all -> 0x0738 }
            r16 = 25
            r15[r7] = r16     // Catch:{ all -> 0x0738 }
            int[] r7 = new int[r6]     // Catch:{ all -> 0x0738 }
            int r6 = r4.filterDurationType     // Catch:{ all -> 0x0738 }
            r16 = 0
            r7[r16] = r6     // Catch:{ all -> 0x0738 }
            r16 = r7
            int[] r6 = r9.addFilters(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r7 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r9 = r4.timeMode     // Catch:{ all -> 0x0738 }
            r7.f127517h = r9     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r6[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect seqin"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.seqIn     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r6[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect slow motion duration"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.slowMotionDuration     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r6[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect slow motion speed"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            float r12 = r4.slowMotionSpeed     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r6[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect slow motion mode"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.timeMode     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r7 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r7 = r7.f127519j     // Catch:{ all -> 0x0738 }
            r9 = 1
            if (r7 != r9) goto L_0x0396
            com.ss.android.ttve.nativePort.TEInterface r10 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int[] r11 = new int[r9]     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r7 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r7 = r7.f127518i     // Catch:{ all -> 0x0738 }
            r12 = 0
            r11[r12] = r7     // Catch:{ all -> 0x0738 }
            java.lang.String[] r7 = new java.lang.String[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r13 = r4.filterName     // Catch:{ all -> 0x0738 }
            r7[r12] = r13     // Catch:{ all -> 0x0738 }
            int[] r13 = new int[r9]     // Catch:{ all -> 0x0738 }
            r13[r12] = r12     // Catch:{ all -> 0x0738 }
            int[] r14 = new int[r9]     // Catch:{ all -> 0x0738 }
            r14[r12] = r5     // Catch:{ all -> 0x0738 }
            int[] r15 = new int[r9]     // Catch:{ all -> 0x0738 }
            r15[r12] = r9     // Catch:{ all -> 0x0738 }
            int[] r5 = new int[r9]     // Catch:{ all -> 0x0738 }
            r16 = 25
            r5[r12] = r16     // Catch:{ all -> 0x0738 }
            int[] r12 = new int[r9]     // Catch:{ all -> 0x0738 }
            int r9 = r4.filterDurationType     // Catch:{ all -> 0x0738 }
            r16 = 0
            r12[r16] = r9     // Catch:{ all -> 0x0738 }
            r9 = r12
            r12 = r7
            r16 = r5
            r17 = r9
            int[] r5 = r10.addFilters(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r5[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect seqin"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.seqIn     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r5[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect slow motion duration"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.slowMotionDuration     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r5[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect slow motion speed"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            float r12 = r4.slowMotionSpeed     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r9 = 0
            r10 = r5[r9]     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "timeEffect slow motion mode"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            int r12 = r4.timeMode     // Catch:{ all -> 0x0738 }
            r11.append(r12)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            r7.setFilterParam(r10, r9, r11)     // Catch:{ all -> 0x0738 }
            r9 = r5
            goto L_0x0398
        L_0x0396:
            r9 = r29
        L_0x0398:
            java.lang.String r5 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r10 = "TimeEffect addRepeatEffect...  trackIndex:"
            r7.<init>(r10)     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " trackType:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            r7.append(r8)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " filterIndex:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            r2 = 0
            r10 = r6[r2]     // Catch:{ all -> 0x0738 }
            r7.append(r10)     // Catch:{ all -> 0x0738 }
            java.lang.String r10 = " audioFilterIndex:"
            r7.append(r10)     // Catch:{ all -> 0x0738 }
            r10 = r9[r2]     // Catch:{ all -> 0x0738 }
            r7.append(r10)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " seqIn:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            int r2 = r4.seqIn     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " seqOut:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            int r2 = r4.seqOut     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " slowMotionDuration:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            int r2 = r4.slowMotionDuration     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " slowMotionSpeed:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            float r2 = r4.slowMotionSpeed     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " timeMode:"
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            int r2 = r4.timeMode     // Catch:{ all -> 0x0738 }
            r7.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109911b(r5, r2)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.d.a r2 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x0738 }
            r2.<init>()     // Catch:{ all -> 0x0738 }
            java.lang.String r4 = "iesve_veeditor_time_effect_id"
            java.lang.String r5 = "slow"
            r2.mo99062a(r4, r5)     // Catch:{ all -> 0x0738 }
            java.lang.String r4 = "iesve_veeditor_time_effect"
            r5 = 1
            com.p683ss.android.ttve.monitor.C20110e.m49637a(r4, r5, r2)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.monitor.h r2 = r1.f127302K     // Catch:{ all -> 0x0738 }
            r4 = 2
            r2.f55324c = r4     // Catch:{ all -> 0x0738 }
            goto L_0x0255
        L_0x0413:
            r28 = r6
            r29 = r9
        L_0x0417:
            r20 = r4
            r9 = r29
        L_0x041b:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0738 }
            r2.<init>()     // Catch:{ all -> 0x0738 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0738 }
            r7.<init>()     // Catch:{ all -> 0x0738 }
            java.util.ArrayList r21 = new java.util.ArrayList     // Catch:{ all -> 0x0738 }
            r21.<init>()     // Catch:{ all -> 0x0738 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0738 }
            r6.<init>()     // Catch:{ all -> 0x0738 }
            int r4 = r1.f127346ak     // Catch:{ all -> 0x0738 }
            r5 = 0
            java.util.List r12 = r1.m109690h(r5, r4)     // Catch:{ all -> 0x0738 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0738 }
            r5.<init>()     // Catch:{ all -> 0x0738 }
            r4 = 0
            com.ss.android.vesdk.runtime.b r10 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r10 = r10.f127519j     // Catch:{ all -> 0x0738 }
            r15 = 1
            if (r10 != r15) goto L_0x0459
            com.ss.android.vesdk.runtime.b r4 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r4 = r4.f127518i     // Catch:{ all -> 0x0738 }
            java.util.List r4 = r1.m109690h(r15, r4)     // Catch:{ all -> 0x0738 }
            r5.addAll(r4)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r10 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r10 = r10.f127518i     // Catch:{ all -> 0x0738 }
            r11 = 0
            float r4 = r4.getTrackVolume(r15, r10, r11)     // Catch:{ all -> 0x0738 }
        L_0x0459:
            com.ss.android.ttve.nativePort.TEInterface r10 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r11 = r1.f127346ak     // Catch:{ all -> 0x0738 }
            r13 = 0
            float r14 = r10.getTrackVolume(r13, r11, r13)     // Catch:{ all -> 0x0738 }
            java.lang.String r10 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r13 = "addTimeEffect mOriginalSoundTrackType="
            r11.<init>(r13)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r13 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r13 = r13.f127519j     // Catch:{ all -> 0x0738 }
            r11.append(r13)     // Catch:{ all -> 0x0738 }
            java.lang.String r13 = " mOriginalSoundTrackIndex="
            r11.append(r13)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r13 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r13 = r13.f127518i     // Catch:{ all -> 0x0738 }
            r11.append(r13)     // Catch:{ all -> 0x0738 }
            java.lang.String r13 = " originalAudio.size="
            r11.append(r13)     // Catch:{ all -> 0x0738 }
            int r13 = r5.size()     // Catch:{ all -> 0x0738 }
            r11.append(r13)     // Catch:{ all -> 0x0738 }
            java.lang.String r13 = " videoVolume="
            r11.append(r13)     // Catch:{ all -> 0x0738 }
            r11.append(r14)     // Catch:{ all -> 0x0738 }
            java.lang.String r13 = " audioVolume="
            r11.append(r13)     // Catch:{ all -> 0x0738 }
            r11.append(r4)     // Catch:{ all -> 0x0738 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109914d(r10, r11)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.g r10 = r1.f127310S     // Catch:{ all -> 0x0738 }
            r16 = 0
            r11 = r20[r16]     // Catch:{ all -> 0x0738 }
            r13 = r9[r16]     // Catch:{ all -> 0x0738 }
            r9 = r10
            r10 = r11
            r11 = r13
            r13 = r5
            r8 = r14
            r14 = r35
            r3 = 0
            r22 = 1
            r15 = r2
            r16 = r7
            r17 = r21
            r18 = r6
            r9.mo99459a(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0738 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x0738 }
        L_0x04c1:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x0738 }
            if (r2 == 0) goto L_0x0548
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x0738 }
            r10 = r2
            com.ss.android.vesdk.clipparam.VEClipParam r10 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r10     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipSourceParam r11 = new com.ss.android.vesdk.clipparam.VEClipSourceParam     // Catch:{ all -> 0x0738 }
            r11.<init>()     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = r10.path     // Catch:{ all -> 0x0738 }
            r11.clipFilePath = r2     // Catch:{ all -> 0x0738 }
            r11.sourceType = r3     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipTimelineParam r12 = new com.ss.android.vesdk.clipparam.VEClipTimelineParam     // Catch:{ all -> 0x0738 }
            r12.<init>()     // Catch:{ all -> 0x0738 }
            int r2 = r10.trimIn     // Catch:{ all -> 0x0738 }
            r12.trimIn = r2     // Catch:{ all -> 0x0738 }
            int r2 = r10.trimOut     // Catch:{ all -> 0x0738 }
            r12.trimOut = r2     // Catch:{ all -> 0x0738 }
            double r13 = r10.speed     // Catch:{ all -> 0x0738 }
            r12.speed = r13     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r14 = "addTimeEffect insertVideoClip ="
            r13.<init>(r14)     // Catch:{ all -> 0x0738 }
            java.lang.String r14 = r10.toString()     // Catch:{ all -> 0x0738 }
            r13.append(r14)     // Catch:{ all -> 0x0738 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r13)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r13 = r1.f127346ak     // Catch:{ all -> 0x0738 }
            int r14 = r10.clipIndex     // Catch:{ all -> 0x0738 }
            r15 = 0
            r3 = r34
            r30 = r4
            r4 = r13
            r13 = r5
            r5 = r14
            r31 = r6
            r14 = r28
            r6 = r11
            r11 = r7
            r7 = r12
            int r2 = r2.insertClip(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0738 }
            if (r2 >= 0) goto L_0x053b
            java.lang.String r3 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r5 = "addTimeEffect insertVideoClip failed, ret = "
            r4.<init>(r5)     // Catch:{ all -> 0x0738 }
            r4.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = " clipParam="
            r4.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = r10.toString()     // Catch:{ all -> 0x0738 }
            r4.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109914d(r3, r2)     // Catch:{ all -> 0x0738 }
        L_0x053b:
            r7 = r11
            r5 = r13
            r28 = r14
            r4 = r30
            r6 = r31
            r3 = 0
            r22 = 1
            goto L_0x04c1
        L_0x0548:
            r30 = r4
            r13 = r5
            r31 = r6
            r11 = r7
            r14 = r28
            r15 = 0
            int r2 = r11.size()     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipTimelineParam[] r2 = new com.p683ss.android.vesdk.clipparam.VEClipTimelineParam[r2]     // Catch:{ all -> 0x0738 }
            int r3 = r11.size()     // Catch:{ all -> 0x0738 }
            int[] r3 = new int[r3]     // Catch:{ all -> 0x0738 }
            r4 = 0
        L_0x055e:
            int r5 = r11.size()     // Catch:{ all -> 0x0738 }
            if (r4 >= r5) goto L_0x05de
            com.ss.android.vesdk.clipparam.VEClipTimelineParam r5 = new com.ss.android.vesdk.clipparam.VEClipTimelineParam     // Catch:{ all -> 0x0738 }
            r5.<init>()     // Catch:{ all -> 0x0738 }
            r2[r4] = r5     // Catch:{ all -> 0x0738 }
            r5 = r2[r4]     // Catch:{ all -> 0x0738 }
            java.lang.Object r6 = r11.get(r4)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r6 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r6     // Catch:{ all -> 0x0738 }
            int r6 = r6.trimIn     // Catch:{ all -> 0x0738 }
            r5.trimIn = r6     // Catch:{ all -> 0x0738 }
            r5 = r2[r4]     // Catch:{ all -> 0x0738 }
            java.lang.Object r6 = r11.get(r4)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r6 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r6     // Catch:{ all -> 0x0738 }
            int r6 = r6.trimOut     // Catch:{ all -> 0x0738 }
            r5.trimOut = r6     // Catch:{ all -> 0x0738 }
            r5 = r2[r4]     // Catch:{ all -> 0x0738 }
            java.lang.Object r6 = r11.get(r4)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r6 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r6     // Catch:{ all -> 0x0738 }
            double r6 = r6.speed     // Catch:{ all -> 0x0738 }
            r5.speed = r6     // Catch:{ all -> 0x0738 }
            java.lang.Object r5 = r11.get(r4)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r5 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r5     // Catch:{ all -> 0x0738 }
            int r5 = r5.clipIndex     // Catch:{ all -> 0x0738 }
            r3[r4] = r5     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r5 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r23 = 0
            int r6 = r1.f127346ak     // Catch:{ all -> 0x0738 }
            r25 = r3[r4]     // Catch:{ all -> 0x0738 }
            java.lang.String r26 = "clip rotate"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            r7.<init>()     // Catch:{ all -> 0x0738 }
            java.lang.Object r9 = r11.get(r4)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r9 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r9     // Catch:{ all -> 0x0738 }
            int r9 = r9.clipRotate     // Catch:{ all -> 0x0738 }
            r7.append(r9)     // Catch:{ all -> 0x0738 }
            java.lang.String r27 = r7.toString()     // Catch:{ all -> 0x0738 }
            r22 = r5
            r24 = r6
            r22.setClipAttr(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0738 }
            java.lang.String r5 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r7 = "addTimeEffect updateVideoClip ="
            r6.<init>(r7)     // Catch:{ all -> 0x0738 }
            java.lang.Object r7 = r11.get(r4)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r7 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r7     // Catch:{ all -> 0x0738 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0738 }
            r6.append(r7)     // Catch:{ all -> 0x0738 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r6)     // Catch:{ all -> 0x0738 }
            int r4 = r4 + 1
            goto L_0x055e
        L_0x05de:
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r5 = r1.f127346ak     // Catch:{ all -> 0x0738 }
            int r2 = r4.updateClipsTimelineParam(r15, r5, r3, r2)     // Catch:{ all -> 0x0738 }
            if (r14 >= 0) goto L_0x05fb
            java.lang.String r3 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r5 = "addTimeEffect updateClipsTimelineParam failed, ret = "
            r4.<init>(r5)     // Catch:{ all -> 0x0738 }
            r4.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109914d(r3, r2)     // Catch:{ all -> 0x0738 }
        L_0x05fb:
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r2 = r2.f127519j     // Catch:{ all -> 0x0738 }
            r3 = 1
            if (r2 != r3) goto L_0x0705
            int r2 = r13.size()     // Catch:{ all -> 0x0738 }
            if (r2 <= 0) goto L_0x0705
            java.util.Iterator r2 = r21.iterator()     // Catch:{ all -> 0x0738 }
        L_0x060c:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0738 }
            if (r4 == 0) goto L_0x067a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r4 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r4     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipSourceParam r13 = new com.ss.android.vesdk.clipparam.VEClipSourceParam     // Catch:{ all -> 0x0738 }
            r13.<init>()     // Catch:{ all -> 0x0738 }
            java.lang.String r5 = r4.path     // Catch:{ all -> 0x0738 }
            r13.clipFilePath = r5     // Catch:{ all -> 0x0738 }
            r13.sourceType = r15     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipTimelineParam r14 = new com.ss.android.vesdk.clipparam.VEClipTimelineParam     // Catch:{ all -> 0x0738 }
            r14.<init>()     // Catch:{ all -> 0x0738 }
            int r5 = r4.trimIn     // Catch:{ all -> 0x0738 }
            r14.trimIn = r5     // Catch:{ all -> 0x0738 }
            int r5 = r4.trimOut     // Catch:{ all -> 0x0738 }
            r14.trimOut = r5     // Catch:{ all -> 0x0738 }
            double r5 = r4.speed     // Catch:{ all -> 0x0738 }
            r14.speed = r5     // Catch:{ all -> 0x0738 }
            java.lang.String r5 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r7 = "addTimeEffect insertAudioClip ="
            r6.<init>(r7)     // Catch:{ all -> 0x0738 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0738 }
            r6.append(r7)     // Catch:{ all -> 0x0738 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r6)     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r9 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r10 = 1
            com.ss.android.vesdk.runtime.b r5 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r11 = r5.f127518i     // Catch:{ all -> 0x0738 }
            int r12 = r4.clipIndex     // Catch:{ all -> 0x0738 }
            int r5 = r9.insertClip(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0738 }
            if (r5 >= 0) goto L_0x060c
            java.lang.String r6 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = "addTimeEffect insertAudioClip failed, ret = "
            r7.<init>(r9)     // Catch:{ all -> 0x0738 }
            r7.append(r5)     // Catch:{ all -> 0x0738 }
            java.lang.String r5 = " clipParam="
            r7.append(r5)     // Catch:{ all -> 0x0738 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0738 }
            r7.append(r4)     // Catch:{ all -> 0x0738 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109914d(r6, r4)     // Catch:{ all -> 0x0738 }
            goto L_0x060c
        L_0x067a:
            int r2 = r31.size()     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipTimelineParam[] r2 = new com.p683ss.android.vesdk.clipparam.VEClipTimelineParam[r2]     // Catch:{ all -> 0x0738 }
            int r4 = r31.size()     // Catch:{ all -> 0x0738 }
            int[] r4 = new int[r4]     // Catch:{ all -> 0x0738 }
            r5 = 0
        L_0x0687:
            int r6 = r31.size()     // Catch:{ all -> 0x0738 }
            if (r5 >= r6) goto L_0x06e6
            com.ss.android.vesdk.clipparam.VEClipTimelineParam r6 = new com.ss.android.vesdk.clipparam.VEClipTimelineParam     // Catch:{ all -> 0x0738 }
            r6.<init>()     // Catch:{ all -> 0x0738 }
            r2[r5] = r6     // Catch:{ all -> 0x0738 }
            r6 = r2[r5]     // Catch:{ all -> 0x0738 }
            r7 = r31
            java.lang.Object r9 = r7.get(r5)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r9 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r9     // Catch:{ all -> 0x0738 }
            int r9 = r9.trimIn     // Catch:{ all -> 0x0738 }
            r6.trimIn = r9     // Catch:{ all -> 0x0738 }
            r6 = r2[r5]     // Catch:{ all -> 0x0738 }
            java.lang.Object r9 = r7.get(r5)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r9 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r9     // Catch:{ all -> 0x0738 }
            int r9 = r9.trimOut     // Catch:{ all -> 0x0738 }
            r6.trimOut = r9     // Catch:{ all -> 0x0738 }
            r6 = r2[r5]     // Catch:{ all -> 0x0738 }
            java.lang.Object r9 = r7.get(r5)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r9 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r9     // Catch:{ all -> 0x0738 }
            double r9 = r9.speed     // Catch:{ all -> 0x0738 }
            r6.speed = r9     // Catch:{ all -> 0x0738 }
            java.lang.Object r6 = r7.get(r5)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r6 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r6     // Catch:{ all -> 0x0738 }
            int r6 = r6.clipIndex     // Catch:{ all -> 0x0738 }
            r4[r5] = r6     // Catch:{ all -> 0x0738 }
            java.lang.String r6 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r10 = "addTimeEffect updateAudioClip ="
            r9.<init>(r10)     // Catch:{ all -> 0x0738 }
            java.lang.Object r10 = r7.get(r5)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.clipparam.VEClipParam r10 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r10     // Catch:{ all -> 0x0738 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0738 }
            r9.append(r10)     // Catch:{ all -> 0x0738 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109909a(r6, r9)     // Catch:{ all -> 0x0738 }
            int r5 = r5 + 1
            r31 = r7
            goto L_0x0687
        L_0x06e6:
            com.ss.android.ttve.nativePort.TEInterface r5 = r1.f127379s     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r6 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r6 = r6.f127518i     // Catch:{ all -> 0x0738 }
            int r2 = r5.updateClipsTimelineParam(r3, r6, r4, r2)     // Catch:{ all -> 0x0738 }
            if (r2 >= 0) goto L_0x0705
            java.lang.String r4 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0738 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0738 }
            java.lang.String r6 = "addTimeEffect updateAudioClip failed, ret = "
            r5.<init>(r6)     // Catch:{ all -> 0x0738 }
            r5.append(r2)     // Catch:{ all -> 0x0738 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0738 }
            com.p683ss.android.vesdk.C50792y.m109914d(r4, r2)     // Catch:{ all -> 0x0738 }
        L_0x0705:
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r4 = r1.f127346ak     // Catch:{ all -> 0x0738 }
            r2.setTrackVolume(r15, r4, r8)     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r2 = r2.f127519j     // Catch:{ all -> 0x0738 }
            if (r2 != r3) goto L_0x071d
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x0738 }
            com.ss.android.vesdk.runtime.b r4 = r1.f127318a     // Catch:{ all -> 0x0738 }
            int r4 = r4.f127518i     // Catch:{ all -> 0x0738 }
            r5 = r30
            r2.setTrackVolume(r3, r4, r5)     // Catch:{ all -> 0x0738 }
        L_0x071d:
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0738 }
            int r4 = r4.getDuration()     // Catch:{ all -> 0x0738 }
            r2.setTimeRange(r15, r4, r3)     // Catch:{ all -> 0x0738 }
            if (r19 == 0) goto L_0x0734
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r2.createTimeline()     // Catch:{ all -> 0x0738 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x0738 }
            r2.prepareEngine(r15)     // Catch:{ all -> 0x0738 }
        L_0x0734:
            r2 = r20[r15]     // Catch:{ all -> 0x0738 }
            monitor-exit(r32)     // Catch:{ all -> 0x0738 }
            return r2
        L_0x0738:
            r0 = move-exception
            r2 = r0
            monitor-exit(r32)     // Catch:{ all -> 0x0738 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99281a(int, int, com.ss.android.vesdk.filterparam.VEBaseFilterParam):int");
    }

    /* renamed from: a */
    public final int mo99274a(float f) {
        StringBuilder sb = new StringBuilder("setSpeedRatioAndUpdate = ");
        sb.append(f);
        C50792y.m109913c("VEEditor", sb.toString());
        this.f127379s.stop();
        if (f > 3.0f) {
            f = 3.0f;
        }
        this.f127379s.setSpeedRatio(f);
        this.f127379s.createTimeline();
        return this.f127379s.prepareEngine(0);
    }

    /* renamed from: a */
    public final int mo99285a(int i, int i2, String str, byte[] bArr, int i3, int i4, C50537a aVar) {
        int i5 = i;
        String str2 = str;
        C50537a aVar2 = aVar;
        if (TextUtils.isEmpty(str)) {
            C50792y.m109914d("VEEditor", "addAudioCommonFilter failed path is null or path not exist");
            return -205;
        }
        m109694z();
        int b = this.f127312U.mo42187b(i5, i2);
        int[] addFilters = this.f127379s.addFilters(new int[]{b}, new String[]{"audio common filter"}, new int[]{i3}, new int[]{i4}, new int[]{i5}, new int[]{1});
        if (addFilters[0] < 0) {
            C50792y.m109914d("VEEditor", "Add filter failed!");
            return -1;
        }
        long[] jArr = new long[1];
        int preprocessAudioTrackForFilter = this.f127379s.preprocessAudioTrackForFilter(i, b, str, bArr, jArr);
        byte[] audioCommonFilterPreprocessResult = this.f127379s.getAudioCommonFilterPreprocessResult(jArr[0]);
        if (aVar2 != null) {
            aVar2.mo98572a(str2, preprocessAudioTrackForFilter, audioCommonFilterPreprocessResult);
        }
        if (preprocessAudioTrackForFilter != 0) {
            C50792y.m109914d("VEEditor", "Add filter preprocess failed!");
            return -1;
        }
        this.f127379s.setFilterParam(addFilters[0], "audio_common_filter_params", str2);
        this.f127379s.setFilterParam(addFilters[0], "audio_common_filter_preresult", audioCommonFilterPreprocessResult);
        return addFilters[0];
    }

    /* renamed from: a */
    public final int mo99309a(String str, String str2) {
        synchronized (this) {
            C50792y.m109913c("VEEditor", "addMetadata...");
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    this.f127379s.addMetaData(str, str2);
                    return 0;
                }
            }
            return -100;
        }
    }

    /* renamed from: a */
    public final int mo99318a(int[] iArr, int i, int i2, C50740a aVar, C50553q qVar) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("getImages... width:");
            sb.append(i);
            sb.append(", height:");
            sb.append(i2);
            sb.append(", flags:");
            sb.append(aVar);
            C50792y.m109909a(str, sb.toString());
            if (i != 0) {
                if (i2 != 0) {
                    this.f127301J = qVar;
                    this.f127379s.setGetImageCallback(this.f127338aU);
                    int images = this.f127379s.getImages(iArr, i, i2, aVar.getValue());
                    return images;
                }
            }
            C50792y.m109914d("VEEditor", "getImages error, size invalid");
            return -100;
        }
    }

    /* renamed from: a */
    public final boolean mo99334a(String str, VEAudioEncodeSettings vEAudioEncodeSettings, C50547k kVar) throws C50751p {
        this.f127365e = kVar;
        return m109683a(str, vEAudioEncodeSettings);
    }

    /* renamed from: a */
    public final boolean mo99336a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, C50547k kVar) throws C50751p {
        this.f127365e = kVar;
        boolean a = m109684a(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.f126650a);
        if (!a) {
            this.f127365e = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo99335a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) throws C50751p {
        this.f127365e = null;
        return m109684a(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.f126650a);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(32:10|(1:12)(1:13)|14|(1:16)|17|(2:19|(1:30)(5:23|(1:25)|26|(1:28)|29))|31|32|63|(1:69)|70|(1:72)(1:73)|74|(2:78|(1:80)(16:81|(1:83)(1:84)|86|(3:(1:96)|97|(3:99|100|101))(2:90|(3:92|93|94))|(2:103|(13:105|(1:107)|108|111|112|113|(1:115)(1:116)|117|(1:119)(1:120)|121|122|123|124)(1:109))|110|111|112|113|(0)(0)|117|(0)(0)|121|122|123|124))|85|86|(1:88)|(0)|97|(0)|(0)|110|111|112|113|(0)(0)|117|(0)(0)|121|122|123|124) */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03fa, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x03f7 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03d8 A[Catch:{ JSONException -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03dd A[Catch:{ JSONException -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03e6 A[Catch:{ JSONException -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03eb A[Catch:{ JSONException -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0368  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m109684a(java.lang.String r23, java.lang.String r24, com.p683ss.android.vesdk.VEVideoEncodeSettings r25, com.p683ss.android.vesdk.VEAudioEncodeSettings r26) throws com.p683ss.android.vesdk.C50751p {
        /*
            r22 = this;
            r1 = r22
            r0 = r25
            r2 = r26
            monitor-enter(r22)
            boolean r3 = r1.f127354as     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x03fb
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            long r3 = r3.getNativeHandler()     // Catch:{ all -> 0x0405 }
            r5 = 0
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x03f9
            boolean r3 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x0020
            goto L_0x03f9
        L_0x0020:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            long r3 = r3.genEditorStatus()     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.runtime.VEPublishSettingManager r8 = com.p683ss.android.vesdk.runtime.VEPublishSettingManager.m109851a()     // Catch:{ all -> 0x0405 }
            r8.nativeSetEditorStatus(r3)     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.runtime.VERuntime r3 = com.p683ss.android.vesdk.runtime.VERuntime.m109853a()     // Catch:{ all -> 0x0405 }
            long r3 = r3.nativeGetNativeContext()     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.runtime.VEPublishSettingManager r8 = com.p683ss.android.vesdk.runtime.VEPublishSettingManager.m109851a()     // Catch:{ all -> 0x0405 }
            int r3 = r8.nativeSetVideoEncodeSettings(r0, r3)     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r8.f127469a = r0     // Catch:{ all -> 0x0405 }
        L_0x0042:
            com.ss.android.vesdk.runtime.VEPublishSettingManager r0 = com.p683ss.android.vesdk.runtime.VEPublishSettingManager.m109851a()     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VEVideoEncodeSettings r3 = r0.f127469a     // Catch:{ all -> 0x0405 }
            boolean r4 = r0.nativeIsCanRemuxVideo()     // Catch:{ all -> 0x0405 }
            r3.setEnableRemuxVideo(r4)     // Catch:{ all -> 0x0405 }
            r0.nativeUpdateVideoEncodeSettings()     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = r0.f127469a     // Catch:{ all -> 0x0405 }
            java.lang.String r3 = "VEEditor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = "VideoEncodeSettings = "
            r4.<init>(r8)     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0405 }
            r4.append(r8)     // Catch:{ all -> 0x0405 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0405 }
            com.p683ss.android.vesdk.C50792y.m109913c(r3, r4)     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.k r3 = r1.f127369i     // Catch:{ all -> 0x0405 }
            r4 = 0
            if (r3 == 0) goto L_0x0093
            com.ss.android.vesdk.runtime.VEPublishSettingManager r3 = com.p683ss.android.vesdk.runtime.VEPublishSettingManager.m109851a()     // Catch:{ all -> 0x0405 }
            int r3 = r3.nativeGetEnableRemuxErrorCode()     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = "VEEditor"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            java.lang.String r10 = "report remux error code = "
            r9.<init>(r10)     // Catch:{ all -> 0x0405 }
            r9.append(r3)     // Catch:{ all -> 0x0405 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0405 }
            com.p683ss.android.vesdk.C50792y.m109913c(r8, r9)     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.k r8 = r1.f127369i     // Catch:{ all -> 0x0405 }
            r9 = 4130(0x1022, float:5.787E-42)
            r10 = 0
            r8.onCallback(r9, r3, r10, r4)     // Catch:{ all -> 0x0405 }
        L_0x0093:
            r3 = r23
            r1.f127296E = r3     // Catch:{ all -> 0x0405 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0405 }
            r1.f127297F = r8     // Catch:{ all -> 0x0405 }
            boolean r8 = r1.f127322aE     // Catch:{ all -> 0x0405 }
            r9 = 2
            r10 = 1
            if (r8 == 0) goto L_0x0106
            com.ss.android.ttve.nativePort.TEInterface r8 = r1.f127379s     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.ai r8 = r8.getDisplayRect()     // Catch:{ all -> 0x0405 }
            int r11 = r8.f126907c     // Catch:{ all -> 0x0405 }
            if (r11 == 0) goto L_0x0104
            int r11 = r8.f126908d     // Catch:{ all -> 0x0405 }
            if (r11 == 0) goto L_0x0104
            int r11 = r8.f126907c     // Catch:{ all -> 0x0405 }
            int r11 = r11 % r9
            if (r11 != r10) goto L_0x00bb
            int r11 = r8.f126907c     // Catch:{ all -> 0x0405 }
            int r11 = r11 + r10
            r8.f126907c = r11     // Catch:{ all -> 0x0405 }
        L_0x00bb:
            int r11 = r8.f126908d     // Catch:{ all -> 0x0405 }
            int r11 = r11 % r9
            if (r11 != r10) goto L_0x00c5
            int r11 = r8.f126908d     // Catch:{ all -> 0x0405 }
            int r11 = r11 + r10
            r8.f126908d = r11     // Catch:{ all -> 0x0405 }
        L_0x00c5:
            int r11 = r8.f126907c     // Catch:{ all -> 0x0405 }
            int r8 = r8.f126908d     // Catch:{ all -> 0x0405 }
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0405 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r11, r8, r12)     // Catch:{ all -> 0x0405 }
            r1.f127325aH = r8     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r8 = r1.f127379s     // Catch:{ all -> 0x0405 }
            android.graphics.Bitmap r11 = r1.f127325aH     // Catch:{ all -> 0x0405 }
            r8.getDisplayImage(r11)     // Catch:{ all -> 0x0405 }
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch:{ all -> 0x0405 }
            r8.<init>()     // Catch:{ all -> 0x0405 }
            float r11 = r1.f127326aI     // Catch:{ all -> 0x0405 }
            r8.postRotate(r11)     // Catch:{ all -> 0x0405 }
            float r11 = r1.f127327aJ     // Catch:{ all -> 0x0405 }
            float r12 = r1.f127328aK     // Catch:{ all -> 0x0405 }
            r8.postScale(r11, r12)     // Catch:{ all -> 0x0405 }
            android.graphics.Bitmap r12 = r1.f127325aH     // Catch:{ all -> 0x0405 }
            r13 = 0
            r14 = 0
            android.graphics.Bitmap r11 = r1.f127325aH     // Catch:{ all -> 0x0405 }
            int r15 = r11.getWidth()     // Catch:{ all -> 0x0405 }
            android.graphics.Bitmap r11 = r1.f127325aH     // Catch:{ all -> 0x0405 }
            int r16 = r11.getHeight()     // Catch:{ all -> 0x0405 }
            r18 = 1
            r17 = r8
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0405 }
            r1.f127325aH = r8     // Catch:{ all -> 0x0405 }
            goto L_0x0106
        L_0x0104:
            r1.f127325aH = r4     // Catch:{ all -> 0x0405 }
        L_0x0106:
            java.lang.String r8 = "VEEditor"
            java.lang.String r11 = "compile..."
            com.p683ss.android.vesdk.C50792y.m109913c(r8, r11)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r8 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r8.stop()     // Catch:{ all -> 0x0405 }
            int[] r8 = com.p683ss.android.vesdk.C50720o.C507356.f127432b     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VEVideoEncodeSettings$COMPILE_TYPE r11 = r0.getCompileType()     // Catch:{ all -> 0x0405 }
            int r11 = r11.ordinal()     // Catch:{ all -> 0x0405 }
            r8 = r8[r11]     // Catch:{ all -> 0x0405 }
            switch(r8) {
                case 1: goto L_0x01fe;
                case 2: goto L_0x01f4;
                case 3: goto L_0x0125;
                default: goto L_0x0121;
            }     // Catch:{ all -> 0x0405 }
        L_0x0121:
            com.ss.android.ttve.nativePort.TEInterface r8 = r1.f127379s     // Catch:{ all -> 0x0405 }
            goto L_0x0208
        L_0x0125:
            com.ss.android.vesdk.o$b r3 = r1.f127299H     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x0131
            com.ss.android.vesdk.o$b r3 = r1.f127299H     // Catch:{ all -> 0x0405 }
            boolean r3 = r3.f127448e     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x0131
            monitor-exit(r22)     // Catch:{ all -> 0x0405 }
            return r7
        L_0x0131:
            r1.f127298G = r10     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r8 = 4
            r3.setCompileType(r8)     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.o$b r3 = r1.f127299H     // Catch:{ all -> 0x0405 }
            if (r3 != 0) goto L_0x0144
            com.ss.android.vesdk.o$b r3 = new com.ss.android.vesdk.o$b     // Catch:{ all -> 0x0405 }
            r3.<init>()     // Catch:{ all -> 0x0405 }
            r1.f127299H = r3     // Catch:{ all -> 0x0405 }
        L_0x0144:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            r3.<init>()     // Catch:{ all -> 0x0405 }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0405 }
            java.lang.String r11 = r1.f127296E     // Catch:{ all -> 0x0405 }
            r8.<init>(r11)     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = r8.getParent()     // Catch:{ all -> 0x0405 }
            r3.append(r8)     // Catch:{ all -> 0x0405 }
            char r8 = java.io.File.separatorChar     // Catch:{ all -> 0x0405 }
            r3.append(r8)     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = "gif.mp4"
            r3.append(r8)     // Catch:{ all -> 0x0405 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.o$b r8 = r1.f127299H     // Catch:{ all -> 0x0405 }
            r8.f127445b = r3     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.o$b r8 = r1.f127299H     // Catch:{ all -> 0x0405 }
            java.lang.String r11 = r1.f127296E     // Catch:{ all -> 0x0405 }
            r8.f127446c = r11     // Catch:{ all -> 0x0405 }
            java.lang.String r11 = r8.f127446c     // Catch:{ all -> 0x0405 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0405 }
            if (r11 == 0) goto L_0x017a
            r8.f127444a = r4     // Catch:{ all -> 0x0405 }
            goto L_0x019d
        L_0x017a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            r11.<init>()     // Catch:{ all -> 0x0405 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x0405 }
            java.lang.String r13 = r8.f127446c     // Catch:{ all -> 0x0405 }
            r12.<init>(r13)     // Catch:{ all -> 0x0405 }
            java.lang.String r12 = r12.getParent()     // Catch:{ all -> 0x0405 }
            r11.append(r12)     // Catch:{ all -> 0x0405 }
            char r12 = java.io.File.separatorChar     // Catch:{ all -> 0x0405 }
            r11.append(r12)     // Catch:{ all -> 0x0405 }
            java.lang.String r12 = "palette.png"
            r11.append(r12)     // Catch:{ all -> 0x0405 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0405 }
            r8.f127444a = r11     // Catch:{ all -> 0x0405 }
        L_0x019d:
            com.ss.android.vesdk.o$b r8 = r1.f127299H     // Catch:{ all -> 0x0405 }
            java.lang.String r11 = r1.f127305N     // Catch:{ all -> 0x0405 }
            r8.f127449f = r11     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.o$b r8 = r1.f127299H     // Catch:{ all -> 0x0405 }
            double r11 = r1.f127306O     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r13 = r0.getVideoRes()     // Catch:{ all -> 0x0405 }
            int r13 = r13.width     // Catch:{ all -> 0x0405 }
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r11 = r11 * r13
            int r11 = (int) r11
            r8.f127450g = r11     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.o$b r8 = r1.f127299H     // Catch:{ all -> 0x0405 }
            double r11 = r1.f127307P     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r13 = r0.getVideoRes()     // Catch:{ all -> 0x0405 }
            int r13 = r13.height     // Catch:{ all -> 0x0405 }
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r11 = r11 * r13
            int r11 = (int) r11
            r8.f127451h = r11     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.o$b r8 = r1.f127299H     // Catch:{ all -> 0x0405 }
            double r11 = r1.f127308Q     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r13 = r0.getVideoRes()     // Catch:{ all -> 0x0405 }
            int r13 = r13.width     // Catch:{ all -> 0x0405 }
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r11 = r11 * r13
            int r11 = (int) r11
            r8.f127452i = r11     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.o$b r8 = r1.f127299H     // Catch:{ all -> 0x0405 }
            double r11 = r1.f127309R     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r13 = r0.getVideoRes()     // Catch:{ all -> 0x0405 }
            int r13 = r13.height     // Catch:{ all -> 0x0405 }
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r11 = r11 * r13
            int r11 = (int) r11
            r8.f127453j = r11     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = "high_gif"
            r1.f127362b = r8     // Catch:{ all -> 0x0405 }
            goto L_0x020f
        L_0x01f4:
            com.ss.android.ttve.nativePort.TEInterface r8 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r8.setCompileType(r9)     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = "gif"
            r1.f127362b = r8     // Catch:{ all -> 0x0405 }
            goto L_0x020f
        L_0x01fe:
            com.ss.android.ttve.nativePort.TEInterface r8 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r8.setCompileType(r10)     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = "mp4"
            r1.f127362b = r8     // Catch:{ all -> 0x0405 }
            goto L_0x020f
        L_0x0208:
            r8.setCompileType(r10)     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = "mp4"
            r1.f127362b = r8     // Catch:{ all -> 0x0405 }
        L_0x020f:
            com.ss.android.ttve.nativePort.TEInterface r8 = r1.f127379s     // Catch:{ all -> 0x0405 }
            int r11 = r0.getFps()     // Catch:{ all -> 0x0405 }
            r8.setCompileFps(r11)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r8 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r11 = r24
            r8.setEngineCompilePath(r3, r11)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            int r8 = r0.getResizeMode()     // Catch:{ all -> 0x0405 }
            float r11 = r0.getResizeX()     // Catch:{ all -> 0x0405 }
            float r12 = r0.getResizeY()     // Catch:{ all -> 0x0405 }
            r3.setResizer(r8, r11, r12)     // Catch:{ all -> 0x0405 }
            java.lang.String r3 = "VEEditor"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            java.lang.String r11 = "compile... resizeMode:"
            r8.<init>(r11)     // Catch:{ all -> 0x0405 }
            int r11 = r0.getResizeMode()     // Catch:{ all -> 0x0405 }
            r8.append(r11)     // Catch:{ all -> 0x0405 }
            java.lang.String r11 = ", resetX:"
            r8.append(r11)     // Catch:{ all -> 0x0405 }
            float r11 = r0.getResizeX()     // Catch:{ all -> 0x0405 }
            r8.append(r11)     // Catch:{ all -> 0x0405 }
            java.lang.String r11 = ", resetY:"
            r8.append(r11)     // Catch:{ all -> 0x0405 }
            float r11 = r0.getResizeY()     // Catch:{ all -> 0x0405 }
            r8.append(r11)     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0405 }
            com.p683ss.android.vesdk.C50792y.m109913c(r3, r8)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            int r8 = r0.getRotate()     // Catch:{ all -> 0x0405 }
            r3.setUsrRotate(r8)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            float r8 = r0.getSpeed()     // Catch:{ all -> 0x0405 }
            r3.setSpeedRatio(r8)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            boolean r8 = r0.isEnableRemuxVideo()     // Catch:{ all -> 0x0405 }
            r3.setEnableRemuxVideo(r8)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            boolean r8 = r0.isEnableInterLeave()     // Catch:{ all -> 0x0405 }
            r3.setEnableInterLeave(r8)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            boolean r8 = r0.isCompileSoftInfo()     // Catch:{ all -> 0x0405 }
            r3.setCompileSoftInfo(r8)     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.l r3 = com.p683ss.android.vesdk.C50712l.m109659a()     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = "vboost_compile"
            com.ss.android.vesdk.l$c r3 = r3.mo99229a(r8)     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x02af
            java.lang.Object r8 = r3.f127275b     // Catch:{ all -> 0x0405 }
            if (r8 == 0) goto L_0x02af
            java.lang.Object r8 = r3.f127275b     // Catch:{ all -> 0x0405 }
            boolean r8 = r8 instanceof java.lang.Boolean     // Catch:{ all -> 0x0405 }
            if (r8 == 0) goto L_0x02af
            java.lang.Object r3 = r3.f127275b     // Catch:{ all -> 0x0405 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0405 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r8 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r8.setEnableCompileVboost(r3)     // Catch:{ all -> 0x0405 }
        L_0x02af:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            int r8 = r2.f126652c     // Catch:{ all -> 0x0405 }
            int r11 = r2.f126654e     // Catch:{ all -> 0x0405 }
            int r12 = r2.f126653d     // Catch:{ all -> 0x0405 }
            r3.setAudioCompileSetting(r8, r11, r12)     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VEListener$n r3 = r1.f127300I     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x02cb
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r3.setEncoderParallel(r10)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.NativeCallbacks$a r4 = r1.f127337aT     // Catch:{ all -> 0x0405 }
            r3.setEncoderDataListener(r4)     // Catch:{ all -> 0x0405 }
            goto L_0x02d5
        L_0x02cb:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r3.setEncoderParallel(r7)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r3.setEncoderDataListener(r4)     // Catch:{ all -> 0x0405 }
        L_0x02d5:
            r22.m109667H()     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r4 = r0.getVideoRes()     // Catch:{ all -> 0x0405 }
            int r4 = r4.width     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r8 = r0.getVideoRes()     // Catch:{ all -> 0x0405 }
            int r8 = r8.height     // Catch:{ all -> 0x0405 }
            r3.setWidthHeight(r4, r8)     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VEWatermarkParam r3 = r0.getWatermarkParam()     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x032c
            com.ss.android.vesdk.VESize r3 = r0.getWatermarkVideoRes()     // Catch:{ all -> 0x0405 }
            int r3 = r3.width     // Catch:{ all -> 0x0405 }
            if (r3 <= 0) goto L_0x032c
            com.ss.android.vesdk.VESize r3 = r0.getWatermarkVideoRes()     // Catch:{ all -> 0x0405 }
            int r3 = r3.height     // Catch:{ all -> 0x0405 }
            if (r3 > 0) goto L_0x0300
            goto L_0x032c
        L_0x0300:
            com.ss.android.vesdk.VEWatermarkParam r3 = r0.getWatermarkParam()     // Catch:{ all -> 0x0405 }
            boolean r3 = r3.needExtFile     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x031a
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r4 = r0.getWatermarkVideoRes()     // Catch:{ all -> 0x0405 }
            int r4 = r4.width     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r8 = r0.getWatermarkVideoRes()     // Catch:{ all -> 0x0405 }
            int r8 = r8.height     // Catch:{ all -> 0x0405 }
            r3.setWatermarkWidthHeight(r4, r8)     // Catch:{ all -> 0x0405 }
            goto L_0x033d
        L_0x031a:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r4 = r0.getWatermarkVideoRes()     // Catch:{ all -> 0x0405 }
            int r4 = r4.width     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r8 = r0.getWatermarkVideoRes()     // Catch:{ all -> 0x0405 }
            int r8 = r8.height     // Catch:{ all -> 0x0405 }
            r3.setWidthHeight(r4, r8)     // Catch:{ all -> 0x0405 }
            goto L_0x033d
        L_0x032c:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r4 = r0.getVideoRes()     // Catch:{ all -> 0x0405 }
            int r4 = r4.width     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VESize r8 = r0.getVideoRes()     // Catch:{ all -> 0x0405 }
            int r8 = r8.height     // Catch:{ all -> 0x0405 }
            r3.setWatermarkWidthHeight(r4, r8)     // Catch:{ all -> 0x0405 }
        L_0x033d:
            com.ss.android.vesdk.VEWatermarkParam r3 = r0.getWatermarkParam()     // Catch:{ all -> 0x0405 }
            if (r3 == 0) goto L_0x0359
            boolean r4 = r3.needExtFile     // Catch:{ all -> 0x0405 }
            if (r4 == 0) goto L_0x0359
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r4.setCompileWatermark(r3)     // Catch:{ all -> 0x0405 }
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0405 }
            int r4 = r4.prepareEngine(r9)     // Catch:{ all -> 0x0405 }
            if (r4 == 0) goto L_0x036d
            r22.mo99349b()     // Catch:{ all -> 0x0405 }
            monitor-exit(r22)     // Catch:{ all -> 0x0405 }
            return r7
        L_0x0359:
            if (r3 == 0) goto L_0x0360
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r4.setEnableRemuxVideo(r7)     // Catch:{ all -> 0x0405 }
        L_0x0360:
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f127379s     // Catch:{ all -> 0x0405 }
            int r4 = r4.prepareEngine(r10)     // Catch:{ all -> 0x0405 }
            if (r4 == 0) goto L_0x036d
            r22.mo99349b()     // Catch:{ all -> 0x0405 }
            monitor-exit(r22)     // Catch:{ all -> 0x0405 }
            return r7
        L_0x036d:
            if (r3 == 0) goto L_0x03b4
            java.lang.String[] r4 = r3.images     // Catch:{ all -> 0x0405 }
            if (r4 == 0) goto L_0x03ad
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0405 }
            r12.<init>()     // Catch:{ all -> 0x0405 }
            java.lang.String[] r4 = r3.images     // Catch:{ all -> 0x0405 }
            r12.add(r4)     // Catch:{ all -> 0x0405 }
            java.lang.String[] r4 = r3.secondHalfImages     // Catch:{ all -> 0x0405 }
            if (r4 == 0) goto L_0x0386
            java.lang.String[] r4 = r3.secondHalfImages     // Catch:{ all -> 0x0405 }
            r12.add(r4)     // Catch:{ all -> 0x0405 }
        L_0x0386:
            com.ss.android.ttve.nativePort.TEInterface r11 = r1.f127379s     // Catch:{ all -> 0x0405 }
            int r13 = r3.interval     // Catch:{ all -> 0x0405 }
            int r14 = r3.xOffset     // Catch:{ all -> 0x0405 }
            int r15 = r3.yOffset     // Catch:{ all -> 0x0405 }
            int r4 = r3.width     // Catch:{ all -> 0x0405 }
            int r5 = r3.height     // Catch:{ all -> 0x0405 }
            long r6 = r3.duration     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.aq r8 = r3.position     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.VEWatermarkParam$VEWatermarkMask r3 = r3.mask     // Catch:{ all -> 0x0405 }
            r16 = r4
            r17 = r5
            r18 = r6
            r20 = r8
            r21 = r3
            r11.setWaterMark(r12, r13, r14, r15, r16, r17, r18, r20, r21)     // Catch:{ all -> 0x0405 }
            java.lang.String r3 = "te_composition_watermark_add"
            r4 = 1
            com.p683ss.android.ttve.monitor.C20114g.m49645a(r10, r3, r4)     // Catch:{ all -> 0x0405 }
            goto L_0x03b9
        L_0x03ad:
            java.lang.String r3 = "VEEditor"
            java.lang.String r4 = "watermarkParam.images is null!!!"
            com.p683ss.android.vesdk.C50792y.m109913c(r3, r4)     // Catch:{ all -> 0x0405 }
        L_0x03b4:
            java.lang.String r3 = "te_composition_watermark_add"
            com.p683ss.android.ttve.monitor.C20114g.m49645a(r10, r3, r5)     // Catch:{ all -> 0x0405 }
        L_0x03b9:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x0405 }
            r3.start()     // Catch:{ all -> 0x0405 }
            com.ss.android.vesdk.d.a r3 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x0405 }
            r3.<init>()     // Catch:{ all -> 0x0405 }
            java.lang.String r4 = "iesve_veeditor_composition_start_file"
            java.lang.String r5 = r1.f127362b     // Catch:{ all -> 0x0405 }
            r3.mo99062a(r4, r5)     // Catch:{ all -> 0x0405 }
            java.lang.String r4 = "iesve_veeditor_composition_start"
            com.p683ss.android.ttve.monitor.C20110e.m49637a(r4, r10, r3)     // Catch:{ all -> 0x0405 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03f7 }
            r3.<init>()     // Catch:{ JSONException -> 0x03f7 }
            java.lang.String r4 = "videoSettings"
            if (r0 == 0) goto L_0x03dd
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x03f7 }
            goto L_0x03df
        L_0x03dd:
            java.lang.String r0 = ""
        L_0x03df:
            r3.put(r4, r0)     // Catch:{ JSONException -> 0x03f7 }
            java.lang.String r0 = "audioSettings"
            if (r2 == 0) goto L_0x03eb
            java.lang.String r2 = r26.toString()     // Catch:{ JSONException -> 0x03f7 }
            goto L_0x03ed
        L_0x03eb:
            java.lang.String r2 = ""
        L_0x03ed:
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x03f7 }
            java.lang.String r0 = "vesdk_event_editor_compile"
            java.lang.String r2 = "behavior"
            com.p683ss.android.ttve.monitor.C20102a.m49612a(r0, r3, r2)     // Catch:{ JSONException -> 0x03f7 }
        L_0x03f7:
            monitor-exit(r22)     // Catch:{ all -> 0x0405 }
            return r10
        L_0x03f9:
            monitor-exit(r22)     // Catch:{ all -> 0x0405 }
            return r7
        L_0x03fb:
            com.ss.android.vesdk.p r0 = new com.ss.android.vesdk.p     // Catch:{ all -> 0x0405 }
            r2 = -105(0xffffffffffffff97, float:NaN)
            java.lang.String r3 = "编码前需确保初始化成功！！！"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0405 }
            throw r0     // Catch:{ all -> 0x0405 }
        L_0x0405:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0405 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.m109684a(java.lang.String, java.lang.String, com.ss.android.vesdk.VEVideoEncodeSettings, com.ss.android.vesdk.VEAudioEncodeSettings):boolean");
    }

    /* renamed from: a */
    private boolean m109683a(String str, VEAudioEncodeSettings vEAudioEncodeSettings) throws C50751p {
        synchronized (this) {
            if (this.f127354as) {
                if (this.f127379s.getNativeHandler() != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f127297F = System.currentTimeMillis();
                        C50792y.m109909a("VEEditor", "_compileOnlyAudio...");
                        this.f127379s.stop();
                        this.f127379s.setCompileType(16);
                        TEInterface tEInterface = this.f127379s;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(".tmp");
                        tEInterface.setEngineCompilePath(sb.toString(), str);
                        this.f127379s.setEnableRemuxVideo(true);
                        this.f127379s.setAudioCompileSetting(vEAudioEncodeSettings.f126652c, vEAudioEncodeSettings.f126654e, vEAudioEncodeSettings.f126653d);
                        m109667H();
                        this.f127379s.prepareEngine(1);
                        this.f127379s.start();
                        return true;
                    }
                }
                return false;
            }
            throw new C50751p(-105, "编码前需确保初始化成功！！！");
        }
    }

    /* renamed from: a */
    public final int mo99320a(String[] strArr, C50749j jVar) throws C50751p {
        synchronized (this) {
            C20114g.m49661d(1);
            C20114g.m49660c(1);
            if (strArr.length == 0) {
                return -100;
            }
            StringBuilder sb = new StringBuilder("initWithAlgorithm... ");
            sb.append(jVar);
            C50792y.m109913c("VEEditor", sb.toString());
            for (int i = 0; i < strArr.length; i++) {
                StringBuilder sb2 = new StringBuilder("initWithAlgorithm...  i: ");
                sb2.append(i);
                sb2.append(" path: ");
                sb2.append(strArr[i]);
                C50792y.m109913c("VEEditor", sb2.toString());
            }
            this.f127384x = System.currentTimeMillis();
            this.f127385y = System.currentTimeMillis();
            int createSceneWithAlgorithm = this.f127379s.createSceneWithAlgorithm(strArr, jVar.ordinal());
            if (createSceneWithAlgorithm != 0) {
                StringBuilder sb3 = new StringBuilder("createSceneWithAlgorithm failed, ret = ");
                sb3.append(createSceneWithAlgorithm);
                C50792y.m109914d("VEEditor", sb3.toString());
                this.f127354as = false;
                return createSceneWithAlgorithm;
            }
            this.f127354as = true;
            this.f127318a.f127516g = false;
            this.f127351ap = jVar;
            this.f127358aw = -1;
            this.f127318a.f127519j = 0;
            this.f127318a.f127518i = 0;
            this.f127346ak = 0;
            int G = m109666G();
            return G;
        }
    }

    /* renamed from: a */
    public final int mo99307a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        synchronized (this) {
            this.f127379s.stop();
            StringBuilder sb = new StringBuilder("setMusicAndResult... audioFilePath: ");
            sb.append(str);
            sb.append(" trimIn: ");
            sb.append(i);
            sb.append(" trimOut: ");
            sb.append(i2);
            sb.append(" ");
            sb.append(vEAlgorithmPath.toString());
            C50792y.m109913c("VEEditor", sb.toString());
            if ((vEAlgorithmPath.getVeBeatsPath() == null || C19319g.m47185a(vEAlgorithmPath.getVeBeatsPath())) && ((vEAlgorithmPath.getDownBeatsPath() == null || C19319g.m47185a(vEAlgorithmPath.getDownBeatsPath())) && ((vEAlgorithmPath.getNoStrengthBeatsPath() == null || C19319g.m47185a(vEAlgorithmPath.getNoStrengthBeatsPath())) && ((vEAlgorithmPath.getManMadePath() == null || C19319g.m47185a(vEAlgorithmPath.getManMadePath())) && (vEAlgorithmPath.getOnlineBeatsPath() == null || C19319g.m47185a(vEAlgorithmPath.getOnlineBeatsPath())))))) {
                int musicAndResult = this.f127379s.setMusicAndResult(str, i, i2, vEAlgorithmPath.getVeBeatsPath(), vEAlgorithmPath.getDownBeatsPath(), vEAlgorithmPath.getNoStrengthBeatsPath(), vEAlgorithmPath.getOnlineBeatsPath(), vEAlgorithmPath.getManMadePath(), vEAlgorithmPath.getType(), vEAlgorithmPath.getMode());
                if (musicAndResult < 0) {
                    StringBuilder sb2 = new StringBuilder("setMusicAndResult failed, ret = ");
                    sb2.append(musicAndResult);
                    C50792y.m109914d("VEEditor", sb2.toString());
                    return musicAndResult;
                }
                int prepareEngine = this.f127379s.prepareEngine(0);
                return prepareEngine;
            }
            C50792y.m109914d("VEEditor", "file is not exist !");
            return -100;
        }
    }

    /* renamed from: a */
    public final int mo99287a(int i, int i2, boolean z, C50541e eVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        boolean z2 = z;
        this.f127372l.put(Integer.valueOf(i), Boolean.valueOf(true));
        String clipPath = this.f127379s.getClipPath(i7);
        if (clipPath.equals("")) {
            StringBuilder sb = new StringBuilder("getClipPath wrong index: ");
            sb.append(i7);
            C50792y.m109914d("VEEditor", sb.toString());
            return -100;
        }
        int[] iArr = new int[10];
        TEVideoUtils.getVideoFileInfo(clipPath, iArr);
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            C50792y.m109914d("VEEditor", "beginGenVideoFrames error for invalid video size");
            return -1;
        }
        if (iArr[0] > iArr[1]) {
            double d = (double) iArr[0];
            Double.isNaN(d);
            double d2 = d / 320.0d;
            double d3 = (double) iArr[1];
            Double.isNaN(d3);
            int i9 = (int) (d3 / d2);
            int i10 = i9 % 16;
            if (i10 >= 8) {
                i9 += 16;
            }
            i3 = i9 - i10;
            i4 = 320;
        } else {
            double d4 = (double) iArr[1];
            Double.isNaN(d4);
            double d5 = d4 / 320.0d;
            double d6 = (double) iArr[0];
            Double.isNaN(d6);
            int i11 = (int) (d6 / d5);
            int i12 = i11 % 16;
            if (i12 >= 8) {
                i11 += 16;
            }
            i4 = i11 - i12;
            i3 = 320;
        }
        int i13 = 3;
        int i14 = (iArr[3] / (i8 * 1000)) + 1;
        if (z2) {
            i5 = i14 / 3;
        } else {
            i13 = i14;
            i5 = i13;
        }
        StringBuilder sb2 = new StringBuilder("HwFrameExtractor_");
        sb2.append(i7);
        sb2.append(" second: ");
        sb2.append(i8);
        sb2.append(" hasHWDecode");
        sb2.append(z2);
        sb2.append("beginGenVideoFrames HWSteps: ");
        sb2.append(i5);
        C50792y.m109913c("VEEditor", sb2.toString());
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < i14; i15 += i13) {
            arrayList.add(Integer.valueOf(i15 * 1000));
        }
        if (arrayList.size() > 0 && ((Integer) arrayList.get(arrayList.size() - 1)).intValue() > 1000) {
            arrayList.set(arrayList.size() - 1, Integer.valueOf(((Integer) arrayList.get(arrayList.size() - 1)).intValue() - 1000));
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            iArr2[i16] = ((Integer) arrayList.get(i16)).intValue();
            StringBuilder sb3 = new StringBuilder("HwFrameExtractor_");
            sb3.append(i7);
            sb3.append(" softList value:");
            sb3.append(iArr2[i16]);
            C50792y.m109909a("VEEditor", sb3.toString());
        }
        final long[] jArr = {System.currentTimeMillis()};
        final int i17 = i;
        C507314 r10 = r0;
        final String str = clipPath;
        String str2 = clipPath;
        final C50541e eVar2 = eVar;
        int[] iArr3 = iArr2;
        final int i18 = i14;
        ArrayList arrayList2 = arrayList;
        final int[] iArr4 = iArr3;
        ArrayList arrayList3 = arrayList2;
        int i19 = i5;
        final int i20 = i4;
        int i21 = i4;
        int i22 = i14;
        final int i23 = i3;
        C507314 r0 = new Runnable() {
            public final void run() {
                final ByteBuffer[] byteBufferArr = {null};
                final float[] fArr = {0.0f};
                TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
                tEVideoUtilsCallback.setListener(new C50753r() {
                    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                        long currentTimeMillis = System.currentTimeMillis() - jArr[0];
                        StringBuilder sb = new StringBuilder("frameProcessSoft");
                        sb.append(i17);
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder(" cost time :");
                        sb3.append(currentTimeMillis);
                        sb3.append(" ptsMs: ");
                        sb3.append(i3);
                        C50792y.m109909a(sb2, sb3.toString());
                        jArr[0] = System.currentTimeMillis();
                        if (byteBufferArr[0] == null) {
                            byteBufferArr[0] = byteBuffer;
                            fArr[0] = (float) i3;
                            return ((Boolean) C50720o.this.f127372l.get(Integer.valueOf(i17))).booleanValue();
                        }
                        C50720o.this.f127379s.processBingoFrames(byteBufferArr[0], byteBuffer, i, i2, fArr[0], str);
                        byteBufferArr[0] = null;
                        fArr[0] = 0.0f;
                        C50720o.this.mo99331a(eVar2, i18, i17);
                        return ((Boolean) C50720o.this.f127372l.get(Integer.valueOf(i17))).booleanValue();
                    }
                });
                TEVideoUtils.getVideoFramesMore(str, iArr4, i20, i23, false, false, 2, true, tEVideoUtilsCallback);
            }
        };
        Thread thread = new Thread(r10);
        thread.start();
        if (z2) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            int i24 = 0;
            while (i24 < i19) {
                int i25 = i24 * 1000;
                ArrayList arrayList7 = arrayList3;
                if (!arrayList7.contains(Integer.valueOf(i25))) {
                    arrayList4.add(Integer.valueOf(i25));
                    StringBuilder sb4 = new StringBuilder("HwFrameExtractor_");
                    sb4.append(i);
                    sb4.append("hwListOne value:");
                    sb4.append(i25);
                    C50792y.m109909a("VEEditor", sb4.toString());
                } else {
                    int i26 = i;
                }
                i24++;
                arrayList3 = arrayList7;
            }
            ArrayList arrayList8 = arrayList3;
            int i27 = i;
            int i28 = i19;
            while (true) {
                i6 = i19 * 2;
                if (i28 >= i6) {
                    break;
                }
                int i29 = i28 * 1000;
                if (!arrayList8.contains(Integer.valueOf(i29))) {
                    arrayList5.add(Integer.valueOf(i29));
                    StringBuilder sb5 = new StringBuilder("HwFrameExtractor_");
                    sb5.append(i27);
                    sb5.append("hwListTwo value:");
                    sb5.append(i29);
                    C50792y.m109909a("VEEditor", sb5.toString());
                }
                i28++;
            }
            while (i6 < i22) {
                int i30 = i6 * 1000;
                if (!arrayList8.contains(Integer.valueOf(i30))) {
                    arrayList6.add(Integer.valueOf(i30));
                    StringBuilder sb6 = new StringBuilder("HwFrameExtractor_");
                    sb6.append(i27);
                    sb6.append("hwListThree value:");
                    sb6.append(i30);
                    C50792y.m109909a("VEEditor", sb6.toString());
                }
                i6++;
            }
            String str3 = str2;
            int i31 = i21;
            int i32 = i3;
            int i33 = i22;
            int i34 = i;
            C50541e eVar3 = eVar;
            m109681a(str3, arrayList4, i31, i32, 2, i33, i34, 1, eVar3);
            m109681a(str3, arrayList5, i31, i32, 2, i33, i34, 2, eVar3);
            m109681a(str3, arrayList6, i31, i32, 2, i33, i34, 3, eVar3);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo99331a(C50541e eVar, int i, int i2) {
        synchronized (this) {
            float f = (float) i;
            float f2 = ((float) (this.f127317Z + 1)) / f;
            StringBuilder sb = new StringBuilder("HwFrameExtractor_");
            sb.append(i2);
            sb.append(" count: ");
            sb.append(this.f127317Z);
            sb.append(" steps: ");
            sb.append(i);
            sb.append(" progress: ");
            sb.append(f2);
            C50792y.m109913c("VEEditor", sb.toString());
            if (f2 <= 1.0f && ((Boolean) this.f127372l.get(Integer.valueOf(i2))).booleanValue()) {
                StringBuilder sb2 = new StringBuilder("HwFrameExtractor_");
                sb2.append(i2);
                sb2.append("progressBack < 1 count: ");
                sb2.append(this.f127317Z);
                sb2.append(" steps: ");
                sb2.append(i);
                sb2.append(" progress: ");
                sb2.append(f2);
                C50792y.m109913c("VEEditor", sb2.toString());
                this.f127317Z++;
                eVar.mo87414a(((float) this.f127317Z) / f);
            }
            if (f2 == 1.0f) {
                StringBuilder sb3 = new StringBuilder("HwFrameExtractor_");
                sb3.append(i2);
                sb3.append("progressBack == 1  count: ");
                sb3.append(this.f127317Z);
                sb3.append(" steps: ");
                sb3.append(i);
                sb3.append(" progress: ");
                sb3.append(f2);
                C50792y.m109913c("VEEditor", sb3.toString());
                this.f127317Z = 0;
                this.f127372l.put(Integer.valueOf(i2), Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    private void m109681a(String str, List<Integer> list, int i, int i2, int i3, int i4, int i5, int i6, C50541e eVar) {
        final int[] iArr = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            List<Integer> list2 = list;
            iArr[i7] = ((Integer) list.get(i7)).intValue();
        }
        final String str2 = str;
        final int i8 = i;
        final int i9 = i2;
        final int i10 = i5;
        final int i11 = i6;
        final C50541e eVar2 = eVar;
        final int i12 = i4;
        C507335 r1 = new Runnable(2) {
            public final void run() {
                int i;
                boolean z;
                final ByteBuffer[] byteBufferArr = {null};
                final float[] fArr = {0.0f};
                final long[] jArr = {System.currentTimeMillis()};
                C20125a aVar = new C20125a(str2, iArr, i8, i9, false, 2, i10, new C50753r() {
                    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                        String str;
                        long currentTimeMillis = System.currentTimeMillis() - jArr[0];
                        StringBuilder sb = new StringBuilder("frameProcessHW");
                        sb.append(i10);
                        sb.append("_");
                        sb.append(i11);
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder(" cost time :");
                        sb3.append(currentTimeMillis);
                        sb3.append(" ptsMs: ");
                        sb3.append(i3);
                        sb3.append(" frame is ");
                        if (byteBuffer == null) {
                            str = TEVideoRecorder.FACE_BEAUTY_NULL;
                        } else {
                            str = "not null";
                        }
                        sb3.append(str);
                        C50792y.m109909a(sb2, sb3.toString());
                        jArr[0] = System.currentTimeMillis();
                        if (byteBuffer == null) {
                            byteBufferArr[0] = null;
                            C50720o.this.mo99331a(eVar2, i12, i10);
                            return ((Boolean) C50720o.this.f127372l.get(Integer.valueOf(i10))).booleanValue();
                        } else if (byteBufferArr[0] == null) {
                            byteBufferArr[0] = byteBuffer;
                            fArr[0] = (float) i3;
                            return ((Boolean) C50720o.this.f127372l.get(Integer.valueOf(i10))).booleanValue();
                        } else {
                            C50720o.this.f127379s.processBingoFrames(byteBufferArr[0], byteBuffer, i, i2, fArr[0], str2);
                            byteBufferArr[0] = null;
                            fArr[0] = 0.0f;
                            C50720o.this.mo99331a(eVar2, i12, i10);
                            return ((Boolean) C50720o.this.f127372l.get(Integer.valueOf(i10))).booleanValue();
                        }
                    }
                });
                try {
                    C50792y.m109909a(aVar.f55336a, "method start begin");
                    if (aVar.f55338e.length <= 0) {
                        String str = aVar.f55336a;
                        StringBuilder sb = new StringBuilder("ptsMs.length is wrong: ");
                        sb.append(aVar.f55338e.length);
                        C50792y.m109909a(str, sb.toString());
                        return;
                    }
                    if (C20125a.f55334b == null || C20125a.f55335c == null) {
                        String lowerCase = C20071a.m49580a().toLowerCase();
                        if (lowerCase.contains("qualcomm")) {
                            C20125a.f55334b = "qualcomm";
                            if (lowerCase.contains("sdm660")) {
                                C20125a.f55335c = "sdm660";
                            } else if (lowerCase.contains("msm8994")) {
                                C20125a.f55335c = "msm8994";
                            } else if (lowerCase.contains("sdm845")) {
                                C20125a.f55335c = "sdm845";
                            } else if (lowerCase.contains("sm8150")) {
                                C20125a.f55335c = "sm8150";
                            } else {
                                C20125a.f55335c = "";
                            }
                        }
                    }
                    aVar.f55349p = System.currentTimeMillis();
                    MediaExtractor mediaExtractor = new MediaExtractor();
                    mediaExtractor.setDataSource(aVar.f55337d);
                    int i2 = aVar.f55339f;
                    int i3 = aVar.f55340g;
                    int i4 = i2;
                    int i5 = i3;
                    MediaFormat mediaFormat = null;
                    for (int i6 = 0; i6 < mediaExtractor.getTrackCount(); i6++) {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i6);
                        if (trackFormat.getString("mime").startsWith("video")) {
                            aVar.f55351r = trackFormat.getInteger("width");
                            aVar.f55352s = trackFormat.getInteger("height");
                            aVar.f55350q = trackFormat.getInteger("rotation-degrees");
                            if (aVar.f55350q != 0) {
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((aVar.f55339f * aVar.f55340g) * 3) / 2);
                                allocateDirect.clear();
                                aVar.f55347n = VEFrame.createByteBufferFrame(allocateDirect, aVar.f55339f, aVar.f55340g, 0, 0, C20091a.TEPixFmt_YUV420P);
                                if (aVar.f55350q == 90 || aVar.f55350q == 270) {
                                    i4 = aVar.f55340g;
                                    i5 = aVar.f55339f;
                                }
                            }
                            mediaExtractor.selectTrack(i6);
                            mediaFormat = trackFormat;
                        }
                    }
                    if (aVar.f55345l == null) {
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i4 * i5) * 3) / 2);
                        allocateDirect2.clear();
                        aVar.f55345l = VEFrame.createByteBufferFrame(allocateDirect2, i4, i5, aVar.f55350q, 0, C20091a.TEPixFmt_YUV420P);
                    }
                    aVar.f55348o = MediaCodec.createDecoderByType("video/avc");
                    ArrayList arrayList = new ArrayList();
                    mediaExtractor.seekTo((long) aVar.f55338e[0], 2);
                    ArrayList arrayList2 = new ArrayList();
                    int i7 = aVar.f55342i;
                    while (true) {
                        long sampleTime = mediaExtractor.getSampleTime();
                        if (sampleTime < 0 && mediaExtractor.advance()) {
                            aVar.f55358y = true;
                            break;
                        }
                        arrayList2.add(Long.valueOf(sampleTime));
                        if (mediaExtractor.getSampleFlags() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(Long.valueOf(sampleTime));
                        }
                        if (sampleTime > ((long) aVar.f55338e[aVar.f55338e.length - 1]) && z) {
                            i7--;
                        }
                        if (mediaExtractor.advance()) {
                            if (i7 <= 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (aVar.f55358y) {
                        C50792y.m109909a(aVar.f55336a, "start wrong");
                        aVar.mo42614b();
                        return;
                    }
                    Collections.sort(arrayList2);
                    List[] listArr = new List[aVar.f55338e.length];
                    int size = arrayList2.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size && i9 < aVar.f55338e.length) {
                        ArrayList arrayList3 = arrayList;
                        if (((Long) arrayList2.get(i8)).longValue() < ((long) aVar.f55338e[i9])) {
                            i8++;
                        } else {
                            if (listArr[i9] == null) {
                                listArr[i9] = new ArrayList();
                            }
                            for (int i10 = 0; i10 < aVar.f55342i; i10++) {
                                int i11 = i8 + i10;
                                if (i11 < size) {
                                    listArr[i9].add(arrayList2.get(i11));
                                }
                            }
                            i8++;
                            i9++;
                        }
                        arrayList = arrayList3;
                    }
                    ArrayList arrayList4 = arrayList;
                    if (listArr[aVar.f55338e.length - 1] != null && listArr[aVar.f55338e.length - 1].size() == 1) {
                        listArr[aVar.f55338e.length - 1].add(listArr[aVar.f55338e.length - 1].get(0));
                        listArr[aVar.f55338e.length - 1].set(0, arrayList2.get(arrayList2.size() - 2));
                    }
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        String str2 = aVar.f55336a;
                        StringBuilder sb2 = new StringBuilder("pts value:");
                        sb2.append(arrayList2.get(i12));
                        C50792y.m109909a(str2, sb2.toString());
                    }
                    for (List list : listArr) {
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            String str3 = aVar.f55336a;
                            StringBuilder sb3 = new StringBuilder("sensArray i: ");
                            sb3.append(i13);
                            sb3.append(" value: ");
                            sb3.append(list.get(i13).toString());
                            C50792y.m109909a(str3, sb3.toString());
                        }
                    }
                    mediaExtractor.seekTo((long) aVar.f55338e[0], 0);
                    aVar.f55353t = new HandlerThread("MediaCodec Callback");
                    aVar.f55353t.start();
                    aVar.f55348o.setCallback(new Callback(mediaExtractor, listArr, arrayList4) {

                        /* renamed from: a */
                        int f55360a;

                        /* renamed from: b */
                        int f55361b;

                        /* renamed from: c */
                        List<Long> f55362c = new ArrayList();

                        /* renamed from: d */
                        List<Long> f55363d = new ArrayList();

                        /* renamed from: e */
                        long f55364e = 0;

                        /* renamed from: f */
                        final /* synthetic */ MediaExtractor f55365f;

                        /* renamed from: g */
                        final /* synthetic */ List[] f55366g;

                        /* renamed from: h */
                        final /* synthetic */ List f55367h;

                        public final void onError(MediaCodec mediaCodec, CodecException codecException) {
                        }

                        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                        }

                        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
                            long j;
                            try {
                                if (this.f55360a >= C20125a.this.f55338e.length) {
                                    C20125a.this.f55348o.queueInputBuffer(i, 0, 0, 0, 4);
                                    C50792y.m109909a(C20125a.this.f55336a, "onInputBufferAvailable end");
                                    return;
                                }
                                int readSampleData = this.f55365f.readSampleData(C20125a.this.f55348o.getInputBuffer(i), 0);
                                long sampleTime = this.f55365f.getSampleTime();
                                if (this.f55365f.getSampleFlags() == 1) {
                                    this.f55364e = sampleTime;
                                }
                                this.f55362c.add(Long.valueOf(sampleTime));
                                if (readSampleData <= 0 || sampleTime < 0) {
                                    String str = C20125a.this.f55336a;
                                    StringBuilder sb = new StringBuilder("onInputBufferAvailable sampSize<0 or time<0 sampSize");
                                    sb.append(readSampleData);
                                    sb.append(" time: ");
                                    sb.append(sampleTime);
                                    C50792y.m109909a(str, sb.toString());
                                    C20125a.this.mo42614b();
                                    C20125a.this.mo42613a();
                                    return;
                                }
                                C20125a.this.f55348o.queueInputBuffer(i, 0, readSampleData, sampleTime, 0);
                                if (!this.f55362c.containsAll(this.f55366g[this.f55360a])) {
                                    this.f55365f.advance();
                                } else {
                                    this.f55362c.clear();
                                    this.f55360a++;
                                    if (this.f55360a < C20125a.this.f55338e.length) {
                                        int indexOf = this.f55367h.indexOf(Long.valueOf(this.f55364e));
                                        long longValue = ((Long) this.f55366g[this.f55360a].get(0)).longValue();
                                        if (indexOf != -1) {
                                            if (indexOf < this.f55367h.size() - 1) {
                                                j = ((Long) this.f55367h.get(indexOf + 1)).longValue();
                                                if (longValue > sampleTime || longValue >= j) {
                                                    this.f55365f.seekTo(longValue, 0);
                                                } else {
                                                    this.f55365f.advance();
                                                    return;
                                                }
                                            }
                                        }
                                        j = Long.MAX_VALUE;
                                        if (longValue > sampleTime) {
                                        }
                                        this.f55365f.seekTo(longValue, 0);
                                    } else {
                                        C50792y.m109909a(C20125a.this.f55336a, "timer begin");
                                        new Handler().postDelayed(new Runnable() {
                                            public final void run() {
                                                C20125a.this.mo42614b();
                                                C20125a.this.mo42613a();
                                            }
                                        }, 1000);
                                    }
                                }
                            } catch (Exception unused) {
                                C50792y.m109909a(C20125a.this.f55336a, "onInputBufferAvailable crash");
                                C20125a.this.mo42614b();
                                C20125a.this.mo42613a();
                            }
                        }

                        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
                            try {
                                if (this.f55361b >= C20125a.this.f55338e.length || !this.f55366g[this.f55361b].contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                                    mediaCodec.releaseOutputBuffer(i, false);
                                } else {
                                    this.f55363d.add(Long.valueOf(bufferInfo.presentationTimeUs));
                                    synchronized (C20125a.this) {
                                        if (VERSION.SDK_INT >= 23) {
                                            mediaCodec.releaseOutputBuffer(i, true);
                                        } else {
                                            mediaCodec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
                                        }
                                        C20125a.this.wait(0);
                                    }
                                    if (this.f55363d.containsAll(this.f55366g[this.f55361b])) {
                                        this.f55361b++;
                                        this.f55363d.clear();
                                    }
                                    if (this.f55361b >= C20125a.this.f55338e.length) {
                                        C20125a.this.mo42613a();
                                    }
                                }
                            } catch (Exception unused) {
                                C20125a.this.mo42614b();
                                C20125a.this.mo42613a();
                            }
                        }

                        {
                            this.f55365f = r2;
                            this.f55366g = r3;
                            this.f55367h = r4;
                        }
                    }, new Handler(aVar.f55353t.getLooper()));
                    aVar.f55354u = new HandlerThread("ImageReader Callback");
                    aVar.f55354u.start();
                    Handler handler = new Handler(aVar.f55354u.getLooper());
                    aVar.f55355v = ImageReader.newInstance(aVar.f55351r, aVar.f55352s, 35, 2);
                    aVar.f55355v.setOnImageAvailableListener(new OnImageAvailableListener(listArr) {

                        /* renamed from: a */
                        int f55370a;

                        /* renamed from: b */
                        List<Long> f55371b = new ArrayList();

                        /* renamed from: c */
                        final /* synthetic */ List[] f55372c;

                        public final void onImageAvailable(ImageReader imageReader) {
                            VEFrame vEFrame;
                            VEFrame vEFrame2;
                            try {
                                synchronized (C20125a.this) {
                                    Image acquireNextImage = imageReader.acquireNextImage();
                                    long timestamp = acquireNextImage.getTimestamp() / 1000;
                                    if (this.f55372c[this.f55370a].contains(Long.valueOf(timestamp))) {
                                        if (C20125a.this.f55343j != null) {
                                            if (acquireNextImage.getFormat() == 35) {
                                                if (acquireNextImage.getPlanes() == null || acquireNextImage.getPlanes()[1].getPixelStride() <= 1) {
                                                    vEFrame = VEFrame.createYUVPlanFrame(new C20099f(acquireNextImage.getPlanes()), C20125a.this.f55351r, C20125a.this.f55352s, C20125a.this.f55350q, 0, C20091a.TEPixFmt_YUV420P);
                                                } else {
                                                    vEFrame = VEFrame.createYUVPlanFrame(new C20099f(acquireNextImage.getPlanes()), C20125a.this.f55351r, C20125a.this.f55352s, C20125a.this.f55350q, 0, C20091a.TEPixFmt_NV12);
                                                    if (C20125a.this.f55346m == null) {
                                                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((C20125a.this.f55351r * C20125a.this.f55352s) * 3) / 2);
                                                        allocateDirect.clear();
                                                        C20125a.this.f55346m = VEFrame.createByteBufferFrame(allocateDirect, C20125a.this.f55351r, C20125a.this.f55352s, C20125a.this.f55350q, 0, C20091a.TEPixFmt_YUV420P);
                                                        TEImageUtils.m49579a(vEFrame, C20125a.this.f55346m, C20092b.OP_CONVERT);
                                                        vEFrame = C20125a.this.f55346m;
                                                    }
                                                }
                                                if (C20125a.this.f55345l != null) {
                                                    TEImageUtils.m49579a(vEFrame, C20125a.this.f55345l, C20092b.OP_SCALE);
                                                }
                                                if (C20125a.this.f55350q != 0) {
                                                    vEFrame2 = C20125a.this.f55347n;
                                                    TEImageUtils.m49579a(C20125a.this.f55345l, vEFrame2, C20092b.OP_ROTATION);
                                                } else {
                                                    vEFrame2 = C20125a.this.f55345l;
                                                }
                                                TEImageUtils.m49579a(vEFrame2, C20125a.this.f55344k, C20092b.OP_CONVERT);
                                                ((ByteBufferFrame) C20125a.this.f55344k.getFrame()).getByteBuffer().clear();
                                            }
                                            C20125a aVar = C20125a.this;
                                            ByteBuffer byteBuffer = ((ByteBufferFrame) C20125a.this.f55344k.getFrame()).getByteBuffer();
                                            int width = C20125a.this.f55344k.getWidth();
                                            int height = C20125a.this.f55344k.getHeight();
                                            double timestamp2 = (double) acquireNextImage.getTimestamp();
                                            Double.isNaN(timestamp2);
                                            int i = (int) (timestamp2 / 1000000.0d);
                                            String str = aVar.f55336a;
                                            StringBuilder sb = new StringBuilder("processFrame right begin hasProcxessCount:");
                                            sb.append(aVar.f55356w);
                                            sb.append(" ptsMsLength: ");
                                            sb.append(aVar.f55338e.length);
                                            C50792y.m109909a(str, sb.toString());
                                            if (aVar.f55356w < aVar.f55338e.length * aVar.f55342i && !aVar.f55357x) {
                                                String str2 = aVar.f55336a;
                                                StringBuilder sb2 = new StringBuilder("processFrame right process hasProcxessCount:");
                                                sb2.append(aVar.f55356w);
                                                sb2.append(" ptsMsLength: ");
                                                sb2.append(aVar.f55338e.length);
                                                sb2.append(" width ");
                                                sb2.append(width);
                                                sb2.append(" height ");
                                                sb2.append(height);
                                                sb2.append("ptsMs:");
                                                sb2.append(i);
                                                C50792y.m109909a(str2, sb2.toString());
                                                if (!aVar.f55343j.processFrame(byteBuffer, width, height, i)) {
                                                    String str3 = aVar.f55336a;
                                                    StringBuilder sb3 = new StringBuilder("processFrame right stop hasProcxessCount:");
                                                    sb3.append(aVar.f55356w);
                                                    sb3.append(" ptsMsLength: ");
                                                    sb3.append(aVar.f55338e.length);
                                                    C50792y.m109909a(str3, sb3.toString());
                                                    aVar.f55357x = true;
                                                    aVar.mo42613a();
                                                }
                                                aVar.f55356w++;
                                            }
                                        }
                                        this.f55371b.add(Long.valueOf(timestamp));
                                        if (this.f55371b.containsAll(this.f55372c[this.f55370a])) {
                                            this.f55371b.clear();
                                            this.f55370a++;
                                        }
                                        C20125a.this.notify();
                                    }
                                    acquireNextImage.close();
                                }
                            } catch (OutOfMemoryError unused) {
                                Runtime.getRuntime().gc();
                                C20125a.this.mo42614b();
                                C20125a.this.notify();
                                C20125a.this.mo42613a();
                            } catch (Exception unused2) {
                                C20125a.this.mo42614b();
                                C20125a.this.notify();
                                C20125a.this.mo42613a();
                            }
                        }

                        {
                            this.f55372c = r2;
                        }
                    }, handler);
                    mediaFormat.setInteger("color-format", 2135033992);
                    String str4 = C20125a.f55335c;
                    if (C20071a.f55170a.containsKey(str4)) {
                        i = ((Integer) C20071a.f55170a.get(str4)).intValue();
                    } else {
                        i = 0;
                    }
                    int i14 = (((i * 1080) * 1920) / aVar.f55351r) / aVar.f55352s;
                    if (i14 > 0) {
                        mediaFormat.setInteger("operating-rate", i14);
                    }
                    aVar.f55348o.configure(mediaFormat, aVar.f55355v.getSurface(), null, 0);
                    aVar.f55348o.start();
                } catch (OutOfMemoryError unused) {
                    C50792y.m109909a(aVar.f55336a, "start crash oom");
                    Runtime.getRuntime().gc();
                    aVar.mo42614b();
                    aVar.mo42613a();
                } catch (Exception unused2) {
                    C50792y.m109909a(aVar.f55336a, "start crash");
                    aVar.mo42614b();
                    aVar.mo42613a();
                }
            }
        };
        new Thread(r1).start();
    }

    /* renamed from: a */
    public final int mo99288a(int i, C50657c cVar) {
        StringBuilder sb = new StringBuilder("setAIRotation index:");
        sb.append(i);
        sb.append(" rotation: ");
        sb.append(cVar);
        C50792y.m109913c("VEEditor", sb.toString());
        int i2 = 0;
        switch (cVar) {
            case ROTATE_90:
                i2 = 90;
                break;
            case ROTATE_180:
                i2 = NormalGiftView.ALPHA_180;
                break;
            case ROTATE_270:
                i2 = 270;
                break;
        }
        int aIRotation = this.f127379s.setAIRotation(i, i2);
        if (aIRotation == 0) {
            return aIRotation;
        }
        StringBuilder sb2 = new StringBuilder("setAIRotation failed, ret = ");
        sb2.append(aIRotation);
        C50792y.m109914d("VEEditor", sb2.toString());
        return aIRotation;
    }

    /* renamed from: a */
    public final int mo99302a(C50742c cVar) {
        StringBuilder sb = new StringBuilder("setScaleMode... mode:");
        sb.append(cVar);
        sb.append(", x = 0.0");
        sb.append(", y = 0.0");
        C50792y.m109913c("VEEditor", sb.toString());
        switch (cVar) {
            case SCALE_MODE_CENTER_CROP:
                this.f127379s.setResizer(2, 0.0f, 0.0f);
                break;
            case SCALE_MODE_CENTER_INSIDE:
                this.f127379s.setResizer(1, 0.0f, 0.0f);
                break;
            case SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE:
                this.f127379s.setResizer(3, 0.0f, 0.0f);
                break;
            case SCALE_MODE_CANVAS:
                this.f127379s.setResizer(4, 0.0f, 0.0f);
                break;
            case SCALE_MODE_FIT_START_WITH_2DENGINE:
                this.f127379s.setResizer(5, 0.0f, 0.0f);
                break;
            case SCALE_MODE_FIT_END_WITH_2DENGINE:
                this.f127379s.setResizer(6, 0.0f, 0.0f);
                break;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo99306a(String str, int i, int i2, int i3, int i4, boolean z) {
        return m109672a(str, (String) null, 0, i2, i3, i4, false, false);
    }

    /* renamed from: a */
    public final int mo99310a(String str, String str2, float f) {
        if (this.f127357av < 0) {
            return -105;
        }
        if (f < 0.0f || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        m109694z();
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (this.f127319aA == null) {
            this.f127319aA = new C20097d();
        }
        if (str.equals(this.f127319aA.f55256a) && str2.equals(this.f127319aA.f55257b) && this.f127319aA.f55259d == 0.0f && this.f127319aA.f55258c == f && this.f127319aA.f55261f) {
            return 0;
        }
        this.f127319aA.f55256a = str;
        this.f127319aA.f55257b = str2;
        this.f127319aA.f55258c = f;
        this.f127319aA.f55259d = 0.0f;
        this.f127319aA.f55260e = 0.0f;
        this.f127319aA.f55261f = true;
        this.f127319aA.f55262g = false;
        StringBuilder sb = new StringBuilder("leftFilterPath: ");
        sb.append(str);
        sb.append("\nrightFilterPath: ");
        sb.append(str2);
        sb.append(" position: ");
        sb.append(f);
        sb.append(" intensity: 0.0");
        C50792y.m109911b("VEEditor", sb.toString());
        this.f127379s.setFilterParam(this.f127357av, "left filter", str);
        this.f127379s.setFilterParam(this.f127357av, "use filter res intensity", "true");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(0.0f);
        this.f127379s.setFilterParam(this.f127357av, "left filter intensity", sb2.toString());
        this.f127379s.setFilterParam(this.f127357av, "right filter", str2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f);
        this.f127379s.setFilterParam(this.f127357av, "filter position", sb3.toString());
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
        aVar.mo99062a("iesve_veeditor_set_filter_slide_left_id", str3);
        aVar.mo99062a("iesve_veeditor_set_filter_slide_right_id", str4);
        C20110e.m49637a("iesve_veeditor_set_filter_slide", 1, aVar);
        return 0;
    }

    /* renamed from: b */
    public final int mo99343b(int i, String str) {
        return m109670a(i, str, 0, 0, "");
    }

    /* renamed from: r */
    public final String[] mo99400r() {
        return this.f127318a.f127511b;
    }

    /* renamed from: w */
    public final int mo99409w() {
        return this.f127379s.getCurPosition();
    }

    /* renamed from: c */
    public final long mo99357c() {
        return this.f127379s.getNativeHandler();
    }

    /* renamed from: e */
    public final Bitmap mo99366e() {
        C50792y.m109909a("VEEditor", "getCurrDisplayImage...");
        return mo99325a(-1);
    }

    /* renamed from: p */
    public final String[] mo99396p() {
        if (this.f127318a.f127516g) {
            return this.f127318a.f127514e;
        }
        return null;
    }

    /* renamed from: q */
    public final String[] mo99398q() {
        if (this.f127318a.f127516g) {
            return this.f127318a.f127515f;
        }
        return null;
    }

    /* renamed from: t */
    public final int mo99403t() {
        int j;
        synchronized (this) {
            j = m109691j(false);
        }
        return j;
    }

    /* renamed from: v */
    public final int mo99407v() {
        int duration;
        synchronized (this) {
            duration = this.f127379s.getDuration();
        }
        return duration;
    }

    /* renamed from: H */
    private void m109667H() {
        String b = C50785a.m109899b(Build.MODEL.toLowerCase());
        C50792y.m109913c("VEEditor", "addCopyright... ");
        this.f127379s.addMetaData("copyright", b);
    }

    /* renamed from: A */
    public final boolean mo99267A() {
        boolean z;
        synchronized (this) {
            if (this.f127379s.getNativeHandler() != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final MVInfoBean mo99371f() {
        if (!f127288aD) {
            throw new C50751p(-1, "The MV resource has not been initialized yet, please call the init2 method");
        } else if (this.f127321aC != null) {
            return this.f127321aC;
        } else {
            throw new C50751p(-1, "MV资源信息构建失败");
        }
    }

    /* renamed from: k */
    public final void mo99384k() {
        synchronized (this) {
            if (this.f127379s != null) {
                C50792y.m109913c("VEEditor", "onRelease... ");
                this.f127379s.stop();
                this.f127379s.releaseEngine();
            }
        }
    }

    /* renamed from: u */
    public final int mo99405u() {
        int refreshCurrentFrame;
        synchronized (this) {
            C50792y.m109911b("VEEditor", "refreshCurrentFrame...");
            refreshCurrentFrame = this.f127379s.refreshCurrentFrame(0);
        }
        return refreshCurrentFrame;
    }

    /* renamed from: x */
    public final int mo99410x() {
        int addInfoStickerWithBuffer;
        synchronized (this) {
            C50792y.m109909a("VEEditor", "addInfoStickerWithBuffer...");
            addInfoStickerWithBuffer = this.f127379s.addInfoStickerWithBuffer();
        }
        return addInfoStickerWithBuffer;
    }

    /* renamed from: y */
    public final int mo99411y() {
        int cancelGetImages;
        synchronized (this) {
            C50792y.m109913c("VEEditor", "cancelGetVideoFrames...");
            cancelGetImages = this.f127379s.cancelGetImages();
        }
        return cancelGetImages;
    }

    /* renamed from: C */
    public final int mo99269C() {
        synchronized (this) {
            C50792y.m109913c("VEEditor", "genRandomSolve");
            this.f127379s.stop();
            int randomSolve = this.f127379s.getRandomSolve();
            if (randomSolve != 0) {
                StringBuilder sb = new StringBuilder("getRandomSolve failed, ret = ");
                sb.append(randomSolve);
                C50792y.m109914d("VEEditor", sb.toString());
                return randomSolve;
            }
            int prepareEngine = this.f127379s.prepareEngine(0);
            return prepareEngine;
        }
    }

    /* renamed from: D */
    public final int mo99270D() {
        synchronized (this) {
            C50792y.m109913c("VEEditor", "genSmartCutting");
            this.f127379s.stop();
            int genAISolve = this.f127379s.genAISolve();
            if (genAISolve != 0) {
                StringBuilder sb = new StringBuilder("getRandomSolve failed, ret = ");
                sb.append(genAISolve);
                C50792y.m109914d("VEEditor", sb.toString());
                return genAISolve;
            }
            int prepareEngine = this.f127379s.prepareEngine(0);
            return prepareEngine;
        }
    }

    /* renamed from: E */
    public final List<VEClipAlgorithmParam> mo99271E() {
        C50792y.m109913c("VEEditor", "getAllVideoRangeData");
        List<VEClipAlgorithmParam> allVideoRangeData = this.f127379s.getAllVideoRangeData();
        for (int i = 0; i < allVideoRangeData.size(); i++) {
            StringBuilder sb = new StringBuilder("rangData: ");
            sb.append(((VEClipAlgorithmParam) allVideoRangeData.get(i)).toString());
            C50792y.m109913c("VEEditor", sb.toString());
        }
        return allVideoRangeData;
    }

    /* renamed from: F */
    public final int mo99272F() {
        C50792y.m109913c("VEEditor", "updateAlgorithmFromNormal");
        int updateAlgorithmFromNormal = this.f127379s.updateAlgorithmFromNormal();
        if (updateAlgorithmFromNormal == 0) {
            return updateAlgorithmFromNormal;
        }
        StringBuilder sb = new StringBuilder("updateAlgorithmFromNormal failed, ret = ");
        sb.append(updateAlgorithmFromNormal);
        C50792y.m109914d("VEEditor", sb.toString());
        return updateAlgorithmFromNormal;
    }

    /* renamed from: g */
    public final VEMVAudioInfo mo99374g() {
        C50792y.m109913c("VEEditor", "getMVOriginalBackgroundAudio");
        if (this.f127316Y != null && this.f127314W != null && this.f127315X != null) {
            return (VEMVAudioInfo) this.f127379s.getMVOriginalBackgroundAudio();
        }
        C50792y.m109914d("VEEditor", "getMVOriginalBackgroundAudio bad input file, please call initMV first");
        return null;
    }

    /* renamed from: s */
    public final int mo99401s() {
        int start;
        synchronized (this) {
            C50792y.m109913c("VEEditor", "play...");
            this.f127382v = 0;
            this.f127384x = System.currentTimeMillis();
            if (this.f127292A == 0) {
                this.f127292A = this.f127384x;
            }
            start = this.f127379s.start();
        }
        return start;
    }

    /* renamed from: G */
    private int m109666G() {
        try {
            int[] addFilters = this.f127379s.addFilters(new int[]{0, 0}, new String[]{"color filter", "effect hdr filter"}, new int[]{0, 0}, new int[]{this.f127350ao, this.f127350ao}, new int[]{0, 0}, new int[]{7, 16});
            this.f127357av = addFilters[0];
            this.f127361az = addFilters[1];
            return 0;
        } catch (NullPointerException unused) {
            throw new C50751p(-1, "init failed: VESDK need to be init");
        }
    }

    /* renamed from: B */
    public final void mo99268B() {
        if (((float) this.f127311T.width) / ((float) this.f127311T.height) > ((float) this.f127377q) / ((float) this.f127378r)) {
            this.f127342ag = this.f127377q;
            this.f127343ah = (int) (((float) this.f127377q) / (((float) this.f127311T.width) / ((float) this.f127311T.height)));
            return;
        }
        this.f127343ah = this.f127378r;
        this.f127342ag = (int) (((float) this.f127378r) / (((float) this.f127311T.height) / ((float) this.f127311T.width)));
    }

    /* renamed from: d */
    public final VESize mo99360d() {
        VESize vESize = new VESize(this.f127342ag, this.f127343ah);
        StringBuilder sb = new StringBuilder("getInitSize... initWidth:");
        sb.append(vESize.width);
        sb.append(", initHeight:");
        sb.append(vESize.height);
        C50792y.m109909a("VEEditor", sb.toString());
        return vESize;
    }

    /* renamed from: h */
    public final VEEditorModel mo99377h() {
        C50792y.m109909a("VEEditor", "saveModel...");
        if (this.f127354as) {
            VEEditorModel vEEditorModel = new VEEditorModel();
            vEEditorModel.f126720d = this.f127318a.f127516g;
            vEEditorModel.f126721e = this.f127351ap;
            vEEditorModel.f126715C = this.f127352aq;
            vEEditorModel.f126716D = this.f127353ar;
            vEEditorModel.f126722f = this.f127344ai.booleanValue();
            vEEditorModel.f126723g = this.f127346ak;
            vEEditorModel.f126724h = this.f127379s.getHostTrackIndex();
            vEEditorModel.f126725i = this.f127345aj;
            vEEditorModel.f126727k = this.f127357av;
            vEEditorModel.f126728l = this.f127361az;
            vEEditorModel.f126729m = this.f127318a.f127511b;
            vEEditorModel.f126730n = this.f127318a.f127512c;
            vEEditorModel.f126731o = this.f127318a.f127513d;
            vEEditorModel.f126732p = this.f127331aN;
            vEEditorModel.f126733q = this.f127332aO;
            return vEEditorModel;
        }
        C50792y.m109914d("VEEditor", "saveModel error, editor is not init...");
        return null;
    }

    /* renamed from: i */
    public final int mo99379i() {
        int prepareEngine;
        synchronized (this) {
            C50792y.m109913c("VEEditor", "prepare...");
            m109692w(this.f127332aO);
            this.f127379s.setEnableRemuxVideo(false);
            this.f127379s.setUsrRotate(0);
            prepareEngine = this.f127379s.prepareEngine(0);
            if (prepareEngine != 0) {
                StringBuilder sb = new StringBuilder("prepare() prepareEngine failed: result: ");
                sb.append(prepareEngine);
                C50792y.m109914d("VEEditor", sb.toString());
                mo99349b();
            }
            int[] initResolution = this.f127379s.getInitResolution();
            this.f127311T.width = initResolution[0];
            this.f127311T.height = initResolution[1];
            if (this.f127377q > 0 && this.f127378r > 0) {
                mo99268B();
            }
            mo99350b(this.f127331aN);
        }
        return prepareEngine;
    }

    /* renamed from: j */
    public final void mo99383j() {
        synchronized (this) {
            if (this.f127379s != null) {
                C50792y.m109913c("VEEditor", "stop... ");
                this.f127379s.stop();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99386l() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.f127354as = r0     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "onReleaseResource... "
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r1)     // Catch:{ all -> 0x0079 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f127379s     // Catch:{ all -> 0x0079 }
            long r0 = r0.getNativeHandler()     // Catch:{ all -> 0x0079 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0019
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            return
        L_0x0019:
            int r0 = r5.f127303L     // Catch:{ all -> 0x0079 }
            r1 = 1
            if (r0 != r1) goto L_0x0022
            r0 = 3
            com.p683ss.android.ttve.monitor.C20114g.m49658b(r0)     // Catch:{ all -> 0x0079 }
        L_0x0022:
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f127379s     // Catch:{ all -> 0x0079 }
            r0.releasePreviewSurface()     // Catch:{ all -> 0x0079 }
            android.view.SurfaceView r0 = r5.f127347al     // Catch:{ all -> 0x0079 }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            android.view.SurfaceView r0 = r5.f127347al     // Catch:{ all -> 0x0079 }
            android.view.SurfaceHolder r0 = r0.getHolder()     // Catch:{ all -> 0x0079 }
            android.view.SurfaceHolder$Callback2 r2 = r5.f127334aQ     // Catch:{ all -> 0x0079 }
            r0.removeCallback(r2)     // Catch:{ all -> 0x0079 }
            goto L_0x004b
        L_0x0038:
            android.view.TextureView r0 = r5.f127348am     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x004b
            android.view.TextureView r0 = r5.f127348am     // Catch:{ all -> 0x0079 }
            android.view.TextureView$SurfaceTextureListener r0 = r0.getSurfaceTextureListener()     // Catch:{ all -> 0x0079 }
            android.view.TextureView$SurfaceTextureListener r2 = r5.f127333aP     // Catch:{ all -> 0x0079 }
            if (r0 != r2) goto L_0x004b
            android.view.TextureView r0 = r5.f127348am     // Catch:{ all -> 0x0079 }
            r0.setSurfaceTextureListener(r1)     // Catch:{ all -> 0x0079 }
        L_0x004b:
            r5.f127347al = r1     // Catch:{ all -> 0x0079 }
            r5.f127348am = r1     // Catch:{ all -> 0x0079 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f127379s     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0062
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f127379s     // Catch:{ all -> 0x0079 }
            r0.setOpenGLListeners(r1)     // Catch:{ all -> 0x0079 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f127379s     // Catch:{ all -> 0x0079 }
            r0.setInfoListener(r1)     // Catch:{ all -> 0x0079 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f127379s     // Catch:{ all -> 0x0079 }
            r0.setErrorListener(r1)     // Catch:{ all -> 0x0079 }
        L_0x0062:
            r5.f127318a = r1     // Catch:{ all -> 0x0079 }
            android.graphics.Bitmap r0 = r5.f127325aH     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            android.graphics.Bitmap r0 = r5.f127325aH     // Catch:{ all -> 0x0079 }
            boolean r0 = r0.isRecycled()     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x0077
            android.graphics.Bitmap r0 = r5.f127325aH     // Catch:{ all -> 0x0079 }
            r0.recycle()     // Catch:{ all -> 0x0079 }
            r5.f127325aH = r1     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            return
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99386l():void");
    }

    /* renamed from: n */
    public final C50747h mo99391n() {
        synchronized (this) {
            if (this.f127379s == null) {
                C50792y.m109913c("VEEditor", "video editor is created yet");
                C50747h hVar = C50747h.IDLE;
                return hVar;
            }
            int curState = this.f127379s.getCurState();
            if (curState < 0) {
                C50792y.m109913c("VEEditor", "native video editor is not inited, already released or releasing");
                C50747h hVar2 = C50747h.IDLE;
                return hVar2;
            }
            C50747h valueOf = C50747h.valueOf(curState);
            return valueOf;
        }
    }

    /* renamed from: m */
    public final void mo99389m() {
        synchronized (this.f127373m) {
            this.f127374n.set(true);
            C50792y.m109913c("VEEditor", "destroy... set destroying true");
        }
        synchronized (this) {
            this.f127354as = false;
            C50792y.m109913c("VEEditor", "onDestroy... ");
            m109694z();
            if (this.f127379s.getNativeHandler() != 0) {
                if (this.f127303L == 1) {
                    C20114g.m49658b(3);
                }
                if (this.f127347al != null) {
                    this.f127347al.getHolder().removeCallback(this.f127334aQ);
                } else if (this.f127348am != null && this.f127348am.getSurfaceTextureListener() == this.f127333aP) {
                    this.f127348am.setSurfaceTextureListener(null);
                }
                this.f127347al = null;
                this.f127348am = null;
                if (this.f127379s != null) {
                    this.f127379s.setOpenGLListeners(null);
                    this.f127379s.setInfoListener(null);
                    this.f127379s.setErrorListener(null);
                    this.f127379s.destroyEngine();
                }
                this.f127318a = null;
                if (this.f127325aH != null && !this.f127325aH.isRecycled()) {
                    this.f127325aH.recycle();
                    this.f127325aH = null;
                }
                this.f127374n.set(false);
            }
        }
    }

    /* renamed from: o */
    public final int mo99392o() throws C50751p {
        C50792y.m109913c("VEEditor", "genReverseVideo");
        if (this.f127318a.f127511b == null || this.f127318a.f127511b.length <= 0) {
            C50792y.m109914d("VEEditor", "genReverseVideo error:invalid videoPaths");
            return -100;
        }
        m109694z();
        long currentTimeMillis = System.currentTimeMillis();
        FFMpegInvoker fFMpegInvoker = new FFMpegInvoker();
        this.f127318a.f127514e = new String[this.f127318a.f127511b.length];
        for (int i = 0; i < this.f127318a.f127511b.length; i++) {
            String a = this.f127318a.mo99453a(i);
            int addFastReverseVideo = fFMpegInvoker.addFastReverseVideo(this.f127318a.f127511b[i], a);
            if (this.f127356au) {
                C50792y.m109913c("VEEditor", "genReverseVideo fail: cancel reverse");
                this.f127356au = false;
                return -1;
            }
            if (addFastReverseVideo != 0) {
                if (addFastReverseVideo == -4) {
                    C50792y.m109914d("VEEditor", "genReverseVideo fail: not video (-4)");
                } else {
                    StringBuilder sb = new StringBuilder("reverse mResManager.mVideoPaths[i] failed: ");
                    sb.append(addFastReverseVideo);
                    throw new C50751p(-1, sb.toString());
                }
            }
            this.f127318a.f127514e[i] = a;
        }
        this.f127318a.f127516g = true;
        C20114g.m49645a(1, "te_edit_reverse_time", System.currentTimeMillis() - currentTimeMillis);
        return 0;
    }

    /* renamed from: b */
    public final int mo99345b(String str) {
        return m109669a(1, str, 1.0f);
    }

    /* renamed from: c */
    public final int mo99355c(boolean z) {
        return this.f127379s.enableEffectAmazing(z);
    }

    /* renamed from: h */
    public final int mo99376h(int i) {
        return m109686b(i, false);
    }

    /* renamed from: i */
    public final void mo99380i(boolean z) {
        this.f127379s.setDleEnabledPreview(z);
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C50792y.m109915e("VEEditor", "onFrameAvailable...");
    }

    /* renamed from: a */
    public final float mo99273a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f127379s.getColorFilterIntensity(str);
    }

    /* renamed from: d */
    public final void mo99363d(boolean z) {
        C50792y.m109909a("VEEditor", "setLoopPlay");
        this.f127379s.setLooping(z);
    }

    /* renamed from: g */
    public final void mo99375g(boolean z) {
        C50792y.m109909a("VEEditor", "setSurfaceReDraw...");
        this.f127322aE = z;
        if (!z) {
            this.f127325aH = null;
        }
    }

    /* renamed from: h */
    public final void mo99378h(boolean z) {
        this.f127379s.setDleEnabled(z);
    }

    /* renamed from: b */
    public static int m109688b(boolean z) {
        StringBuilder sb = new StringBuilder("setEnableEffectTransition: ");
        sb.append(false);
        C50792y.m109909a("VEEditor", sb.toString());
        return TEInterface.setEnableEffectTransition(false);
    }

    /* renamed from: j */
    private int m109691j(boolean z) {
        int pause;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("pause... refreshFrame:");
            sb.append(false);
            C50792y.m109913c(str, sb.toString());
            pause = this.f127379s.pause();
        }
        return pause;
    }

    /* renamed from: w */
    private void m109692w(int i) {
        StringBuilder sb = new StringBuilder("setVideoBackgroudColor... color:");
        sb.append(i);
        C50792y.m109909a("VEEditor", sb.toString());
        this.f127332aO = i;
        this.f127379s.setVideoBackGroundColor(i);
    }

    /* renamed from: d */
    public final void mo99361d(int i) {
        this.f127303L = i;
        StringBuilder sb = new StringBuilder("setPageMode: ");
        sb.append(i);
        C50792y.m109913c("VEEditor", sb.toString());
        this.f127379s.setPageMode(i);
    }

    /* renamed from: i */
    public final boolean mo99381i(int i) {
        boolean isInfoStickerAnimatable;
        synchronized (this) {
            C50792y.m109909a("VEEditor", "isInfoStickerAnimatable...");
            isInfoStickerAnimatable = this.f127379s.isInfoStickerAnimatable(i);
        }
        return isInfoStickerAnimatable;
    }

    /* renamed from: t */
    public final int mo99404t(int i) {
        StringBuilder sb = new StringBuilder("setPreviewFps = ");
        sb.append(i);
        C50792y.m109909a("VEEditor", sb.toString());
        this.f127379s.setPreviewFps(i);
        return 0;
    }

    /* renamed from: d */
    public final int mo99359d(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        StringBuilder sb = new StringBuilder("checkScoresFile filePath:");
        sb.append(str);
        C50792y.m109913c("VEEditor", sb.toString());
        int checkScoresFile = this.f127379s.checkScoresFile(str);
        if (checkScoresFile == 0) {
            return checkScoresFile;
        }
        StringBuilder sb2 = new StringBuilder("setMusicCropRatio failed, ret = ");
        sb2.append(checkScoresFile);
        C50792y.m109914d("VEEditor", sb2.toString());
        return checkScoresFile;
    }

    /* renamed from: e */
    public final int mo99364e(int i) {
        synchronized (this) {
            C50774g gVar = this.f127310S;
            int c = gVar.mo99461c();
            if (c == C50774g.f127574c) {
                VERepeatFilterParam vERepeatFilterParam = (VERepeatFilterParam) gVar.f127576e.f127593g;
                i -= vERepeatFilterParam.repeatDuration * (vERepeatFilterParam.repeatTime - 1);
            } else if (c == C50774g.f127575d) {
                VESlowMotionFilterParam vESlowMotionFilterParam = (VESlowMotionFilterParam) gVar.f127576e.f127593g;
                i -= ((int) (((float) vESlowMotionFilterParam.slowMotionDuration) / vESlowMotionFilterParam.slowMotionSpeed)) - vESlowMotionFilterParam.slowMotionDuration;
            }
        }
        return i;
    }

    /* renamed from: j */
    public final int mo99382j(int i) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("removeInfoSticker... index: ");
            sb.append(i);
            C50792y.m109909a(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            this.f127302K.mo42270a(1, i);
            int removeInfoSticker = this.f127379s.removeInfoSticker(i);
            return removeInfoSticker;
        }
    }

    /* renamed from: k */
    public final float[] mo99385k(int i) throws C50751p {
        float[] infoStickerBoundingBox;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("getInfoStickerBoundingBox... index: ");
            sb.append(i);
            C50792y.m109911b(str, sb.toString());
            if (i >= 0) {
                infoStickerBoundingBox = this.f127379s.getInfoStickerBoundingBox(i);
            } else {
                throw new C50751p(-100, "");
            }
        }
        return infoStickerBoundingBox;
    }

    /* renamed from: l */
    public final float[] mo99387l(int i) throws C50751p {
        float[] infoStickerBoundingBox;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("getInfoStickerBoundingBox... index:");
            sb.append(i);
            C50792y.m109911b(str, sb.toString());
            if (i >= 0) {
                infoStickerBoundingBox = this.f127379s.getInfoStickerBoundingBox(i, false);
            } else {
                throw new C50751p(-100, "");
            }
        }
        return infoStickerBoundingBox;
    }

    /* renamed from: m */
    public final int mo99388m(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin beginInfoStickerPin... index:");
        sb.append(i);
        C50792y.m109913c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int beginInfoStickerPin = this.f127379s.beginInfoStickerPin(i);
                if (beginInfoStickerPin >= 0) {
                    return beginInfoStickerPin;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin beginInfoStickerPin... faild ret:");
                sb2.append(beginInfoStickerPin);
                C50792y.m109914d("VEEditor", sb2.toString());
                return beginInfoStickerPin;
            }
        }
    }

    /* renamed from: n */
    public final int mo99390n(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin cancelInfoStickerPin... index:");
        sb.append(i);
        C50792y.m109913c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int cancelInfoStickerPin = this.f127379s.cancelInfoStickerPin(i);
                if (cancelInfoStickerPin >= 0) {
                    return cancelInfoStickerPin;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin cancelInfoStickerPin... faild ret:");
                sb2.append(cancelInfoStickerPin);
                C50792y.m109914d("VEEditor", sb2.toString());
                return cancelInfoStickerPin;
            }
        }
    }

    /* renamed from: o */
    public final int mo99393o(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin setInfoStickerRestoreMode... index:");
        sb.append(i);
        C50792y.m109909a("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int infoStickerRestoreMode = this.f127379s.setInfoStickerRestoreMode(i);
                if (infoStickerRestoreMode >= 0) {
                    return infoStickerRestoreMode;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin setInfoStickerRestoreMode... faild ret:");
                sb2.append(infoStickerRestoreMode);
                C50792y.m109914d("VEEditor", sb2.toString());
                return infoStickerRestoreMode;
            }
        }
    }

    /* renamed from: p */
    public final float mo99395p(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin getInfoStickerScale... index:");
        sb.append(i);
        C50792y.m109913c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100.0f;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                float infoStickerScale = this.f127379s.getInfoStickerScale(i);
                if (infoStickerScale >= 0.0f) {
                    return infoStickerScale;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin getInfoStickerScale... faild ret:");
                sb2.append(infoStickerScale);
                C50792y.m109914d("VEEditor", sb2.toString());
                return infoStickerScale;
            }
        }
    }

    /* renamed from: q */
    public final float mo99397q(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin getInfoStickerRotate... index:");
        sb.append(i);
        C50792y.m109913c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100.0f;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                float infoStickerRotate = this.f127379s.getInfoStickerRotate(i);
                StringBuilder sb2 = new StringBuilder("infoStickerPin getInfoStickerRotate... ret:");
                sb2.append(infoStickerRotate);
                C50792y.m109909a("VEEditor", sb2.toString());
                return infoStickerRotate;
            }
        }
    }

    /* renamed from: r */
    public final boolean mo99399r(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin getInfoStickerVisible... index:");
        sb.append(i);
        C50792y.m109913c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                boolean infoStickerVisible = this.f127379s.getInfoStickerVisible(i);
                StringBuilder sb2 = new StringBuilder("infoStickerPin  getInfoStickerVisible... ret:");
                sb2.append(infoStickerVisible);
                C50792y.m109909a("VEEditor", sb2.toString());
                return infoStickerVisible;
            }
        }
    }

    /* renamed from: v */
    public final int mo99408v(int i) {
        StringBuilder sb = new StringBuilder("cancelGenVideoFrame index: ");
        sb.append(i);
        C50792y.m109913c("VEEditor", sb.toString());
        this.f127372l.put(Integer.valueOf(i), Boolean.valueOf(false));
        this.f127317Z = 0;
        return 0;
    }

    /* renamed from: c */
    public final int mo99354c(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        StringBuilder sb = new StringBuilder("setInterimScoresToFile filePath:");
        sb.append(str);
        C50792y.m109913c("VEEditor", sb.toString());
        int interimScoresToFile = this.f127379s.setInterimScoresToFile(str);
        if (interimScoresToFile == 0) {
            return interimScoresToFile;
        }
        StringBuilder sb2 = new StringBuilder("setMusicCropRatio failed, ret = ");
        sb2.append(interimScoresToFile);
        C50792y.m109914d("VEEditor", sb2.toString());
        return interimScoresToFile;
    }

    /* renamed from: e */
    public final synchronized void mo99367e(boolean z) {
        String str = "VEEditor";
        StringBuilder sb = new StringBuilder("enableSimpleProcessor: ");
        sb.append(String.valueOf(z));
        C50792y.m109909a(str, sb.toString());
        this.f127379s.enableSimpleProcessor(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo99368f(int r7) {
        /*
            r6 = this;
            com.ss.android.vesdk.runtime.g r0 = r6.f127310S
            int r1 = r0.mo99461c()
            int r2 = com.p683ss.android.vesdk.runtime.C50774g.f127574c
            if (r1 != r2) goto L_0x0033
            com.ss.android.vesdk.runtime.g$b r2 = r0.f127576e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r2 = r2.f127593g
            com.ss.android.vesdk.filterparam.VERepeatFilterParam r2 = (com.p683ss.android.vesdk.filterparam.VERepeatFilterParam) r2
            int r3 = r2.seqIn
            int r4 = r2.repeatDuration
            int r5 = r2.repeatTime
            int r4 = r4 * r5
            int r4 = r4 + r3
            if (r7 >= r3) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            if (r7 < r3) goto L_0x0028
            if (r7 >= r4) goto L_0x0028
            int r4 = r7 - r3
            int r2 = r2.repeatDuration
            int r4 = r4 % r2
            int r2 = r4 + r3
            goto L_0x0034
        L_0x0028:
            int r3 = r2.repeatDuration
            int r2 = r2.repeatTime
            int r2 = r2 + -1
            int r3 = r3 * r2
            int r2 = r7 - r3
            goto L_0x0034
        L_0x0033:
            r2 = r7
        L_0x0034:
            int r3 = com.p683ss.android.vesdk.runtime.C50774g.f127575d
            if (r1 != r3) goto L_0x0066
            com.ss.android.vesdk.runtime.g$b r0 = r0.f127576e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r0 = r0.f127593g
            com.ss.android.vesdk.filterparam.VESlowMotionFilterParam r0 = (com.p683ss.android.vesdk.filterparam.VESlowMotionFilterParam) r0
            int r1 = r0.seqIn
            float r2 = (float) r1
            int r3 = r0.slowMotionDuration
            float r3 = (float) r3
            float r4 = r0.slowMotionSpeed
            float r3 = r3 / r4
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r7 >= r1) goto L_0x004c
            goto L_0x0067
        L_0x004c:
            if (r7 < r1) goto L_0x0059
            if (r7 >= r2) goto L_0x0059
            int r7 = r7 - r1
            float r7 = (float) r7
            float r0 = r0.slowMotionSpeed
            float r7 = r7 * r0
            int r7 = (int) r7
            int r7 = r7 + r1
            goto L_0x0067
        L_0x0059:
            int r1 = r0.slowMotionDuration
            float r1 = (float) r1
            float r2 = r0.slowMotionSpeed
            float r1 = r1 / r2
            int r0 = r0.slowMotionDuration
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = (int) r1
            int r7 = r7 - r0
            goto L_0x0067
        L_0x0066:
            r7 = r2
        L_0x0067:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99368f(int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo99372g(int r6) {
        /*
            r5 = this;
            com.ss.android.vesdk.runtime.g r0 = r5.f127310S
            int r1 = r0.mo99461c()
            int r2 = com.p683ss.android.vesdk.runtime.C50774g.f127574c
            if (r1 != r2) goto L_0x0023
            com.ss.android.vesdk.runtime.g$b r2 = r0.f127576e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r2 = r2.f127593g
            com.ss.android.vesdk.filterparam.VERepeatFilterParam r2 = (com.p683ss.android.vesdk.filterparam.VERepeatFilterParam) r2
            int r3 = r2.seqIn
            int r4 = r2.repeatDuration
            int r3 = r3 + r4
            if (r6 >= r3) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            int r3 = r2.repeatDuration
            int r2 = r2.repeatTime
            int r2 = r2 + -1
            int r3 = r3 * r2
            int r2 = r6 + r3
            goto L_0x0024
        L_0x0023:
            r2 = r6
        L_0x0024:
            int r3 = com.p683ss.android.vesdk.runtime.C50774g.f127575d
            if (r1 != r3) goto L_0x004f
            com.ss.android.vesdk.runtime.g$b r0 = r0.f127576e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r0 = r0.f127593g
            com.ss.android.vesdk.filterparam.VESlowMotionFilterParam r0 = (com.p683ss.android.vesdk.filterparam.VESlowMotionFilterParam) r0
            int r1 = r0.seqIn
            int r2 = r0.slowMotionDuration
            int r2 = r2 + r1
            if (r6 >= r1) goto L_0x0036
            goto L_0x0050
        L_0x0036:
            if (r6 < r1) goto L_0x0042
            if (r6 >= r2) goto L_0x0042
            int r6 = r6 - r1
            float r6 = (float) r6
            float r0 = r0.slowMotionSpeed
            float r6 = r6 / r0
            int r6 = (int) r6
            int r6 = r6 + r1
            goto L_0x0050
        L_0x0042:
            int r1 = r0.slowMotionDuration
            float r1 = (float) r1
            float r2 = r0.slowMotionSpeed
            float r1 = r1 / r2
            int r0 = r0.slowMotionDuration
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = (int) r1
            int r6 = r6 + r0
            goto L_0x0050
        L_0x004f:
            r6 = r2
        L_0x0050:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99372g(int):int");
    }

    /* renamed from: u */
    public final int mo99406u(int i) {
        synchronized (this) {
            this.f127379s.stop();
            StringBuilder sb = new StringBuilder("removeMusic index: ");
            sb.append(i);
            C50792y.m109913c("VEEditor", sb.toString());
            int removeMusic = this.f127379s.removeMusic(i);
            if (removeMusic != 0) {
                StringBuilder sb2 = new StringBuilder("removeMusic failed, ret = ");
                sb2.append(removeMusic);
                C50792y.m109914d("VEEditor", sb2.toString());
                return removeMusic;
            }
            this.f127379s.prepareEngine(0);
            return 0;
        }
    }

    /* renamed from: c */
    public static int m109689c(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        StringBuilder sb = new StringBuilder("setOptConfig... ");
        sb.append(i);
        C50792y.m109909a("VEEditor", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("config", i);
            C20102a.m49612a("vesdk_event_editor_opt_config", jSONObject, "performance");
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("report optConfig json err ");
            sb2.append(e);
            C50792y.m109914d("VEEditor", sb2.toString());
        }
        C50716c a = C50712l.m109659a().mo99229a("remove_model_lock");
        if (a != null && a.f127275b != null && (a.f127275b instanceof Boolean) && ((Boolean) a.f127275b).booleanValue()) {
            i |= 524288;
        }
        C50716c a2 = C50712l.m109659a().mo99229a("crossplat_glbase_fbo");
        if (a2 != null && a2.f127275b != null && (a2.f127275b instanceof Boolean) && ((Boolean) a2.f127275b).booleanValue()) {
            i |= 2097152;
        }
        C50716c a3 = C50712l.m109659a().mo99229a("use_byte264");
        if (a3 != null && a3.f127275b != null && (a3.f127275b instanceof Boolean) && ((Boolean) a3.f127275b).booleanValue()) {
            i |= 33554432;
        }
        boolean z4 = false;
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        C50629aj.f126909a = z;
        if ((i & VideoCacheReadBuffersizeExperiment.DEFAULT) == 8192) {
            z2 = true;
        } else {
            z2 = false;
        }
        C50629aj.f126911c = z2;
        if ((i & 524288) == 524288) {
            z3 = true;
        } else {
            z3 = false;
        }
        C50629aj.f126912d = z3;
        if ((i & 67108864) == 67108864) {
            z4 = true;
        }
        C50629aj.f126913e = z4;
        return TEInterface.setEnableOpt(i);
    }

    /* renamed from: x */
    private int m109693x(int i) {
        Exception e;
        C50747h hVar;
        boolean z = f127289aa;
        if (this.f127339ad == null) {
            C50792y.m109911b("VEEditor", "VE_CONFIG_SET_AUTO_PREPARE mVeConfig is null");
        }
        if (this.f127339ad != null && this.f127339ad.hasConfig(VEConfig.VE_CONFIG_SET_AUTO_PREPARE)) {
            z = this.f127339ad.configIsOpen(VEConfig.VE_CONFIG_SET_AUTO_PREPARE);
            StringBuilder sb = new StringBuilder("VE_CONFIG_SET_AUTO_PREPARE has");
            sb.append(z);
            C50792y.m109911b("VEEditor", sb.toString());
        }
        if (!z) {
            return 0;
        }
        m109692w(this.f127332aO);
        if (this.f127369i == null) {
            return this.f127379s.prepareEngine(0);
        }
        C50747h hVar2 = C50747h.ERROR;
        try {
            hVar = mo99391n();
            try {
                int w = mo99409w();
                int prepareEngine = this.f127379s.prepareEngine(0);
                if (prepareEngine != 0) {
                    StringBuilder sb2 = new StringBuilder("prepareEngine error: ");
                    sb2.append(prepareEngine);
                    C50792y.m109914d("VEEditor", sb2.toString());
                    this.f127369i.onCallback(4120, hVar.ordinal(), (float) w, null);
                    return prepareEngine;
                }
                int[] initResolution = this.f127379s.getInitResolution();
                this.f127311T.width = initResolution[0];
                this.f127311T.height = initResolution[1];
                if (this.f127377q > 0 && this.f127378r > 0) {
                    mo99268B();
                }
                this.f127369i.onCallback(4120, hVar.ordinal(), (float) w, null);
                return 0;
            } catch (Exception e2) {
                e = e2;
                StringBuilder sb3 = new StringBuilder("prepareWithCallback error: ");
                sb3.append(e);
                C50792y.m109914d("VEEditor", sb3.toString());
                this.f127369i.onCallback(4120, hVar.ordinal(), 0.0f, null);
                return -1;
            }
        } catch (Exception e3) {
            hVar = hVar2;
            e = e3;
            StringBuilder sb32 = new StringBuilder("prepareWithCallback error: ");
            sb32.append(e);
            C50792y.m109914d("VEEditor", sb32.toString());
            this.f127369i.onCallback(4120, hVar.ordinal(), 0.0f, null);
            return -1;
        }
    }

    public C50720o(String str) throws C50751p {
        this.f127311T = new VESize(-1, -1);
        this.f127362b = "mp4";
        this.f127363c = new C50746g(Looper.getMainLooper());
        this.f127364d = null;
        this.f127365e = null;
        this.f127366f = null;
        this.f127367g = null;
        this.f127368h = null;
        this.f127369i = null;
        this.f127370j = null;
        this.f127312U = new C20083k();
        this.f127313V = new C20067a();
        this.f127371k = "unknown";
        this.f127372l = new HashMap();
        this.f127339ad = null;
        this.f127373m = new Object();
        this.f127374n = new AtomicBoolean(false);
        this.f127340ae = new C20072b() {
            /* renamed from: a */
            public final void mo42168a(int i, int i2, float f, String str) {
                long j;
                int i3 = i;
                int i4 = i2;
                float f2 = f;
                String str2 = str;
                if (i3 == 4101) {
                    if (C50720o.this.f127293B > 0) {
                        System.currentTimeMillis();
                    }
                    if (C50720o.this.f127364d != null && C50720o.this.f127363c != null) {
                        C50792y.m109913c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        C50720o.this.f127363c.sendEmptyMessage(MessageCenter.MSG_CLIENT_TO_SDK_RESUME_GAME);
                    } else if (C50720o.this.f127369i != null) {
                        C50792y.m109913c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                    }
                } else if (i3 == 4103) {
                    int i5 = 0;
                    if (C50720o.this.f127298G) {
                        C50720o.this.f127299H.f127447d = C50720o.this.f127369i;
                        new Thread(C50720o.this.f127299H).start();
                        C50720o.this.f127298G = false;
                        return;
                    }
                    C50720o oVar = C50720o.this;
                    if (i4 == 1 || i4 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - oVar.f127297F;
                        C20114g.m49648a("te_composition_time", currentTimeMillis);
                        C20114g.m49645a(1, "te_composition_time", currentTimeMillis);
                        if (C19319g.m47185a(oVar.f127296E)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(oVar.f127296E, iArr) == 0) {
                                long length = new File(oVar.f127296E).length();
                                C20114g.m49648a("te_composition_page_mode", (long) oVar.f127303L);
                                double d = (double) length;
                                Double.isNaN(d);
                                double d2 = (d / 1024.0d) / 1024.0d;
                                C20114g.m49647a("te_composition_file_size", d2);
                                C20114g.m49647a("te_composition_file_duration", (double) iArr[3]);
                                C20114g.m49647a("te_composition_bit_rate", (double) iArr[6]);
                                C20114g.m49647a("te_composition_fps", (double) iArr[7]);
                                String str3 = "te_composition_resolution";
                                StringBuilder sb = new StringBuilder();
                                sb.append(iArr[0]);
                                sb.append("x");
                                sb.append(iArr[1]);
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str3)) {
                                    C50792y.m109913c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (sb2 == null) {
                                        sb2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString(str3, sb2);
                                }
                                C20114g.m49645a(1, "te_composition_page_mode", (long) oVar.f127303L);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(iArr[0]);
                                sb3.append("x");
                                sb3.append(iArr[1]);
                                C20114g.m49646a(1, "te_composition_resolution", sb3.toString());
                                C20114g.m49644a(1, "te_composition_fps", (double) iArr[7]);
                                C20114g.m49644a(1, "te_composition_bit_rate", (double) iArr[6]);
                                C20114g.m49644a(1, "te_composition_file_duration", (double) iArr[3]);
                                C20114g.m49644a(1, "te_composition_file_size", d2);
                                int i6 = oVar.f127302K.f55324c;
                                if (i6 != 0) {
                                    C20114g.m49645a(1, "te_composition_time_filter_type", (long) i6);
                                }
                            }
                        }
                        boolean b = oVar.f127302K.mo42272b();
                        String str4 = "te_composition_effect_add";
                        long j2 = 1;
                        if (b) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        C20114g.m49645a(1, str4, j);
                        if (!b) {
                            C20114g.m49646a(1, "te_composition_effect_json", oVar.f127302K.mo42268a(0));
                        }
                        boolean c = oVar.f127302K.mo42273c();
                        String str5 = "te_composition_info_sticker_add";
                        if (c) {
                            j2 = 0;
                        }
                        C20114g.m49645a(1, str5, j2);
                        if (!c) {
                            C20114g.m49646a(1, "te_composition_info_sticker_json", oVar.f127302K.mo42268a(1));
                        }
                        oVar.f127302K.mo42269a();
                        C20114g.m49643a(C20114g.f55318b);
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_file", oVar.f127362b);
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_result", "succ");
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_reason", "");
                        C20114g.m49658b(1);
                    }
                    Map nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        C20114g.m49650a(nativeGetMapByType, jSONObject);
                        jSONObject.put("usage_type", oVar.f127371k);
                        if (i4 != 1) {
                            if (i4 != 2) {
                                i5 = i4;
                            }
                        }
                        jSONObject.put("resultCode", i5);
                    } catch (JSONException unused) {
                    }
                    C20102a.m49612a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                    C20102a.m49612a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                    if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                        C50792y.m109913c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message = new Message();
                        message.what = MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME;
                        message.arg1 = i4;
                        message.obj = str2;
                        C50720o.this.f127363c.sendMessage(message);
                    } else if (C50720o.this.f127369i != null) {
                        C50792y.m109913c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                    }
                } else if (i3 != 4105) {
                    if (i3 != 4129) {
                        switch (i3) {
                            case 4133:
                                if (!(C50720o.this.f127367g == null || C50720o.this.f127363c == null)) {
                                    Message message2 = new Message();
                                    message2.what = 4133;
                                    message2.arg1 = i4;
                                    message2.arg2 = (int) f2;
                                    C50720o.this.f127363c.sendMessage(message2);
                                    return;
                                }
                            case 4134:
                                C50720o.this.f127304M = f2;
                                return;
                            default:
                                if (C50720o.this.f127369i != null) {
                                    StringBuilder sb4 = new StringBuilder("TECommonCallback type:");
                                    sb4.append(i3);
                                    C50792y.m109909a("VEEditor", sb4.toString());
                                    C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                                    break;
                                }
                                break;
                        }
                    } else if (C50720o.this.f127294C == 0) {
                        C50720o.this.f127294C = System.currentTimeMillis();
                        C50792y.m109909a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                    }
                } else if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                    Message message3 = new Message();
                    message3.what = i3;
                    message3.obj = Float.valueOf(f);
                    C50720o.this.f127363c.sendMessage(message3);
                } else if (C50720o.this.f127369i != null) {
                    C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                }
            }
        };
        this.f127341af = new C20072b() {
            /* renamed from: a */
            public final void mo42168a(int i, int i2, float f, String str) {
                C50720o.this.mo99349b();
                if (C50720o.this.f127370j != null) {
                    C50720o.this.f127370j.onCallback(i, i2, f, str);
                }
                if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                    C50746g gVar = C50720o.this.f127363c;
                    final int i3 = i;
                    final int i4 = i2;
                    final float f2 = f;
                    final String str2 = str;
                    C507371 r1 = new Runnable() {
                        public final void run() {
                            if (C50720o.this.f127365e != null) {
                                C50720o.this.f127365e.onCompileError(i3, i4, f2, str2);
                            }
                        }
                    };
                    gVar.post(r1);
                }
            }
        };
        this.f127375o = 0;
        this.f127376p = -1;
        this.f127377q = 0;
        this.f127378r = 0;
        this.f127342ag = 0;
        this.f127343ah = 0;
        this.f127344ai = Boolean.valueOf(false);
        this.f127345aj = -1;
        this.f127346ak = 0;
        this.f127382v = 0;
        this.f127383w = 0;
        this.f127384x = 0;
        this.f127385y = 0;
        this.f127386z = 0;
        this.f127292A = 0;
        this.f127293B = 0;
        this.f127294C = 0;
        this.f127295D = false;
        this.f127349an = 0;
        this.f127350ao = -1;
        this.f127352aq = C50748i.ALIGN_PARENT_BOTTOM;
        this.f127353ar = C50750k.CENTER;
        this.f127354as = false;
        this.f127355at = false;
        this.f127356au = false;
        this.f127357av = -1;
        this.f127358aw = -1;
        this.f127359ax = -1;
        this.f127360ay = -1;
        this.f127361az = -1;
        this.f127296E = null;
        this.f127297F = 0;
        this.f127320aB = false;
        this.f127298G = false;
        this.f127299H = null;
        this.f127300I = null;
        this.f127301J = null;
        this.f127302K = new C20115h();
        this.f127322aE = false;
        this.f127323aF = true;
        this.f127324aG = false;
        this.f127325aH = null;
        this.f127326aI = 0.0f;
        this.f127327aJ = 1.0f;
        this.f127328aK = 1.0f;
        this.f127303L = -1;
        this.f127329aL = 3000;
        this.f127330aM = 30.0f;
        this.f127331aN = -16777216;
        this.f127332aO = -16777216;
        this.f127304M = 0.0f;
        this.f127333aP = new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C50720o.this.mo99327a();
                if (C50720o.this.f127381u != null) {
                    C50720o.this.f127381u.release();
                }
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C50720o.this.f127377q = i;
                C50720o.this.f127378r = i2;
                C50720o.this.mo99268B();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C50720o.this.f127380t == surfaceTexture) {
                    C50720o.this.mo99330a(C50720o.this.f127381u);
                } else {
                    C50720o.this.f127381u = new Surface(surfaceTexture);
                    C50720o.this.mo99330a(C50720o.this.f127381u);
                }
                C50720o.this.f127380t = surfaceTexture;
            }
        };
        this.f127334aQ = new Callback2() {
            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C50792y.m109911b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C50720o.this.mo99330a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                synchronized (C50720o.this.f127373m) {
                    if (C50720o.this.f127374n.get()) {
                        C50792y.m109913c("VEEditor", "surfaceDestroyed, is destroying, just return");
                    } else {
                        C50720o.this.mo99327a();
                    }
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C50792y.m109911b("VEEditor", C2240a.m6773a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                C50720o oVar = C50720o.this;
                StringBuilder sb = new StringBuilder("onSurfaceChanged... ");
                sb.append(i2);
                sb.append(", ");
                sb.append(i3);
                C50792y.m109909a("VEEditor", sb.toString());
                oVar.f127377q = i2;
                oVar.f127378r = i3;
                oVar.mo99268B();
                if (i2 != 0 && i3 != 0) {
                    oVar.f127379s.setSurfaceSize(i2, i3);
                }
            }
        };
        this.f127335aR = new C20122e() {
            /* renamed from: a */
            public final int mo42278a(int i) {
                StringBuilder sb = new StringBuilder("onOpenGLCreate: ret = ");
                sb.append(i);
                C50792y.m109911b("VEEditor", sb.toString());
                return 0;
            }

            /* renamed from: b */
            public final int mo42280b(int i) {
                StringBuilder sb = new StringBuilder("onOpenGLDestroy: ret = ");
                sb.append(i);
                C50792y.m109911b("VEEditor", sb.toString());
                return 0;
            }

            /* renamed from: a */
            public final int mo42279a(int i, double d) {
                long j;
                long j2;
                StringBuilder sb = new StringBuilder("onOpenGLDrawing: tex = ");
                sb.append(i);
                sb.append(" timeStamp = ");
                sb.append(d);
                C50792y.m109915e("VEEditor", sb.toString());
                if (!C50720o.this.f127295D) {
                    C50720o.this.f127295D = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C50720o.this.f127294C > 0) {
                        j = C50720o.this.f127294C;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (C50720o.this.f127292A > 0) {
                        j2 = C50720o.this.f127292A;
                    } else {
                        j2 = C50720o.this.f127386z;
                    }
                    if (j2 == 0 || j2 < C50720o.this.f127385y) {
                        StringBuilder sb2 = new StringBuilder("onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = ");
                        sb2.append(C50720o.this.f127292A);
                        sb2.append(", mlFirstSeekTimeMS = ");
                        sb2.append(C50720o.this.f127386z);
                        sb2.append(", mlInitTimeMS = ");
                        sb2.append(C50720o.this.f127385y);
                        C50792y.m109914d("VEEditor", sb2.toString());
                        j2 = C50720o.this.f127385y;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - C50720o.this.f127385y);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                        jSONObject.put("time_total", currentTimeMillis - C50720o.this.f127385y);
                        jSONObject.put("usage_type", C50720o.this.f127371k);
                        C20102a.m49612a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                    } catch (JSONException e) {
                        StringBuilder sb3 = new StringBuilder("report first frame json err ");
                        sb3.append(e);
                        C50792y.m109914d("VEEditor", sb3.toString());
                    }
                    C20114g.m49645a(1, "te_edit_first_frame_time", currentTimeMillis - C50720o.this.f127385y);
                    if (C50720o.this.f127366f != null) {
                        C50720o.this.f127366f.mo43097a();
                    }
                }
                C50720o.this.f127382v++;
                if (C50720o.this.f127382v == 30) {
                    C50720o.this.f127383w = System.currentTimeMillis();
                    if (C50720o.this.f127384x != C50720o.this.f127383w) {
                        float f = 30000.0f / ((float) (C50720o.this.f127383w - C50720o.this.f127384x));
                        if (C50629aj.f126910b) {
                            StringBuilder sb4 = new StringBuilder("Render FPS = ");
                            sb4.append(f);
                            C50792y.m109909a("VEEditor", sb4.toString());
                        }
                        C50720o.this.f127384x = C50720o.this.f127383w;
                        C50720o.this.f127382v = 0;
                        if (C50720o.this.mo99391n() == C50747h.STARTED) {
                            C20114g.m49644a(2, "te_edit_playback_fps", (double) f);
                        }
                    }
                }
                return 0;
            }
        };
        this.f127336aS = new C20120c() {
            /* renamed from: a */
            public final void mo42277a() {
                if (C50720o.this.f127368h != null) {
                    C50720o.this.f127368h.mo98573a();
                }
            }
        };
        this.f127337aT = new C20118a() {
            /* renamed from: a */
            public final int mo42275a(byte[] bArr, int i, int i2, boolean z) {
                if (bArr == null || i < 0 || i2 <= 0) {
                    return -1;
                }
                if (C50720o.this.f127300I == null) {
                    return -2;
                }
                C50720o.this.f127300I.mo91547a(bArr, i, i2, z);
                return 0;
            }
        };
        this.f127338aU = new C20119b() {
            /* renamed from: a */
            public final int mo42276a(byte[] bArr, int i, int i2, int i3, float f) {
                if (C50720o.this.f127301J == null) {
                    return -100;
                }
                if (bArr != null || C50720o.this.f127363c == null) {
                    return C50720o.this.f127301J.mo86779a(bArr, i, i2, i3, f);
                }
                Message message = new Message();
                message.what = 4117;
                C50720o.this.f127363c.sendMessage(message);
                return 0;
            }
        };
        if (!TextUtils.isEmpty(str)) {
            C50792y.m109909a("VEEditor", "VEEditor offscreen");
            this.f127379s = TEInterface.createEngine();
            this.f127318a = new C50765b(str);
            this.f127310S = new C50774g();
            this.f127379s.setInfoListener(this.f127340ae);
            this.f127379s.setErrorListener(this.f127341af);
            C20110e.m49637a("iesve_veeditor_offscreen", 1, (C50660a) null);
            mo99355c(false);
            return;
        }
        StringBuilder sb = new StringBuilder("workspace is: ");
        sb.append(str);
        throw new C50751p(-100, sb.toString());
    }

    /* renamed from: c */
    public final int mo99356c(int[] iArr) {
        int removeFilter;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("deleteAudioFilter...");
            sb.append(iArr[0]);
            C50792y.m109913c(str, sb.toString());
            removeFilter = this.f127379s.removeFilter(iArr);
        }
        return removeFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        return 0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo99370f(boolean r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            monitor-enter(r18)
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "enableReversePlay:"
            r3.<init>(r4)     // Catch:{ all -> 0x012c }
            r3.append(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012c }
            com.p683ss.android.vesdk.C50792y.m109913c(r2, r3)     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            boolean r2 = r2.f127516g     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x0029
            java.lang.String r0 = "VEEditor"
            java.lang.String r2 = "enableReversePlay error: reverse video is not ready!"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x012c }
            r0 = -100
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r0
        L_0x0029:
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0121
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f127514e     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0121
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f127514e     // Catch:{ all -> 0x012c }
            int r2 = r2.length     // Catch:{ all -> 0x012c }
            if (r2 > 0) goto L_0x003c
            goto L_0x0121
        L_0x003c:
            m109694z()     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x012c }
            long r7 = r2.getDurationUs()     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x012c }
            r2.stop()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0051
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f127514e     // Catch:{ all -> 0x012c }
            goto L_0x0055
        L_0x0051:
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f127511b     // Catch:{ all -> 0x012c }
        L_0x0055:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x012c }
            r9 = 0
            int r2 = r3.updateTrackClips(r9, r9, r2)     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0073
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "Create Scene failed, ret = "
            r3.<init>(r4)     // Catch:{ all -> 0x012c }
            r3.append(r2)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012c }
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r3)     // Catch:{ all -> 0x012c }
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r2
        L_0x0073:
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f127515f     // Catch:{ all -> 0x012c }
            r10 = 1
            if (r2 == 0) goto L_0x00cd
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            int r2 = r2.f127519j     // Catch:{ all -> 0x012c }
            if (r2 == r10) goto L_0x00cd
            com.ss.android.ttve.nativePort.TEInterface r11 = r1.f127379s     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f127515f     // Catch:{ all -> 0x012c }
            r12 = r2[r9]     // Catch:{ all -> 0x012c }
            r13 = 0
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x012c }
            int r14 = r2.getDuration()     // Catch:{ all -> 0x012c }
            r15 = 0
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x012c }
            int r16 = r2.getDuration()     // Catch:{ all -> 0x012c }
            r17 = 0
            int r2 = r11.addAudioTrack(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r3 = r1.f127318a     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.common.k r4 = r1.f127312U     // Catch:{ all -> 0x012c }
            int r2 = r4.mo42185a(r10, r2)     // Catch:{ all -> 0x012c }
            r3.f127518i = r2     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r2 = r1.f127318a     // Catch:{ all -> 0x012c }
            r2.f127519j = r10     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "add org audio track index "
            r3.<init>(r4)     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r4 = r1.f127318a     // Catch:{ all -> 0x012c }
            int r4 = r4.f127518i     // Catch:{ all -> 0x012c }
            r3.append(r4)     // Catch:{ all -> 0x012c }
            java.lang.String r4 = " type "
            r3.append(r4)     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r4 = r1.f127318a     // Catch:{ all -> 0x012c }
            int r4 = r4.f127519j     // Catch:{ all -> 0x012c }
            r3.append(r4)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012c }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r3)     // Catch:{ all -> 0x012c }
        L_0x00cd:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f127379s     // Catch:{ all -> 0x012c }
            r4 = 0
            r5 = 0
            boolean r2 = r1.f127320aB     // Catch:{ all -> 0x012c }
            if (r0 == r2) goto L_0x00d7
            r6 = 1
            goto L_0x00d8
        L_0x00d7:
            r6 = 0
        L_0x00d8:
            r3.updateTrackFilterDuration(r4, r5, r6, r7)     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x012c }
            r2.createTimeline()     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x012c }
            int r2 = r2.prepareEngine(r9)     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x00fd
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "enableReversePlay() prepareEngine failed: result: "
            r3.<init>(r4)     // Catch:{ all -> 0x012c }
            r3.append(r2)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012c }
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r3)     // Catch:{ all -> 0x012c }
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r2
        L_0x00fd:
            r2 = -1
            r1.f127358aw = r2     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.o$d r2 = com.p683ss.android.vesdk.C50720o.C50743d.EDITOR_SEEK_FLAG_LastSeek     // Catch:{ all -> 0x012c }
            r1.mo99290a(r9, r2)     // Catch:{ all -> 0x012c }
            r1.f127320aB = r0     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x011f
            com.ss.android.vesdk.d.a r0 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x012c }
            r0.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "iesve_veeditor_time_effect_id"
            java.lang.String r3 = "reverse"
            r0.mo99062a(r2, r3)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "iesve_veeditor_time_effect"
            com.p683ss.android.ttve.monitor.C20110e.m49637a(r2, r10, r0)     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.monitor.h r0 = r1.f127302K     // Catch:{ all -> 0x012c }
            r2 = 3
            r0.f55324c = r2     // Catch:{ all -> 0x012c }
        L_0x011f:
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r9
        L_0x0121:
            java.lang.String r0 = "VEEditor"
            java.lang.String r2 = "enableReversePlay error: reverse video path is invalid!"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x012c }
            r0 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r0
        L_0x012c:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99370f(boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0364, code lost:
        return r13;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo99402s(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = "TimeEffect deleteTimeEffect...  filterIndexes: "
            r1.<init>(r2)     // Catch:{ all -> 0x0365 }
            r1.append(r13)     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = " audioFilterIndex:"
            r1.append(r2)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g r2 = r12.f127310S     // Catch:{ all -> 0x0365 }
            int r2 = r2.mo99460b()     // Catch:{ all -> 0x0365 }
            r1.append(r2)     // Catch:{ all -> 0x0365 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r1)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = "deleteTimeEffect before getDuration ="
            r1.<init>(r2)     // Catch:{ all -> 0x0365 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r12.f127379s     // Catch:{ all -> 0x0365 }
            int r2 = r2.getDuration()     // Catch:{ all -> 0x0365 }
            r1.append(r2)     // Catch:{ all -> 0x0365 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r1)     // Catch:{ all -> 0x0365 }
            r0 = -1
            if (r13 >= 0) goto L_0x0040
            monitor-exit(r12)     // Catch:{ all -> 0x0365 }
            return r0
        L_0x0040:
            com.ss.android.ttve.nativePort.TEInterface r1 = r12.f127379s     // Catch:{ all -> 0x0365 }
            int r1 = r1.getCurState()     // Catch:{ all -> 0x0365 }
            r2 = -20000(0xffffffffffffb1e0, float:NaN)
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            if (r1 == 0) goto L_0x0058
            com.ss.android.ttve.nativePort.TEInterface r2 = r12.f127379s     // Catch:{ all -> 0x0365 }
            int r2 = r2.stop()     // Catch:{ all -> 0x0365 }
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            if (r2 == 0) goto L_0x0074
            r5 = -101(0xffffffffffffff9b, float:NaN)
            if (r2 == r5) goto L_0x0074
            java.lang.String r13 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r3 = "pauseSync failed, ret "
            r1.<init>(r3)     // Catch:{ all -> 0x0365 }
            r1.append(r2)     // Catch:{ all -> 0x0365 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109909a(r13, r1)     // Catch:{ all -> 0x0365 }
            monitor-exit(r12)     // Catch:{ all -> 0x0365 }
            return r0
        L_0x0074:
            com.ss.android.ttve.nativePort.TEInterface r0 = r12.f127379s     // Catch:{ all -> 0x0365 }
            int[] r2 = new int[r3]     // Catch:{ all -> 0x0365 }
            r2[r4] = r13     // Catch:{ all -> 0x0365 }
            int r13 = r0.removeFilter(r2)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.b r0 = r12.f127318a     // Catch:{ all -> 0x0365 }
            int r0 = r0.f127519j     // Catch:{ all -> 0x0365 }
            if (r0 != r3) goto L_0x009c
            com.ss.android.vesdk.runtime.g r0 = r12.f127310S     // Catch:{ all -> 0x0365 }
            int r0 = r0.mo99460b()     // Catch:{ all -> 0x0365 }
            if (r0 < 0) goto L_0x009c
            com.ss.android.ttve.nativePort.TEInterface r13 = r12.f127379s     // Catch:{ all -> 0x0365 }
            int[] r0 = new int[r3]     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g r2 = r12.f127310S     // Catch:{ all -> 0x0365 }
            int r2 = r2.mo99460b()     // Catch:{ all -> 0x0365 }
            r0[r4] = r2     // Catch:{ all -> 0x0365 }
            int r13 = r13.removeFilter(r0)     // Catch:{ all -> 0x0365 }
        L_0x009c:
            com.ss.android.vesdk.runtime.b r0 = r12.f127318a     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.o$f r2 = com.p683ss.android.vesdk.C50720o.C50745f.EDITOR_NORMAl_MODE     // Catch:{ all -> 0x0365 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0365 }
            r0.f127517h = r2     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g r0 = r12.f127310S     // Catch:{ all -> 0x0365 }
            int r0 = r0.mo99461c()     // Catch:{ all -> 0x0365 }
            int r2 = com.p683ss.android.vesdk.runtime.C50774g.f127573b     // Catch:{ all -> 0x0365 }
            if (r0 != r2) goto L_0x00b2
            r0 = 0
            goto L_0x00b3
        L_0x00b2:
            r0 = 1
        L_0x00b3:
            if (r0 == 0) goto L_0x0343
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0365 }
            r0.<init>()     // Catch:{ all -> 0x0365 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0365 }
            r2.<init>()     // Catch:{ all -> 0x0365 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0365 }
            r5.<init>()     // Catch:{ all -> 0x0365 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0365 }
            r6.<init>()     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g r7 = r12.f127310S     // Catch:{ all -> 0x0365 }
            java.lang.String r8 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = "deleteTimeEffect  mTrack.videoClips="
            r9.<init>(r10)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g$b r10 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r10 = r10.f127587a     // Catch:{ all -> 0x0365 }
            int r10 = r10.size()     // Catch:{ all -> 0x0365 }
            r9.append(r10)     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = "mTrack.videoTimeEffectClips="
            r9.append(r10)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g$b r10 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r10 = r10.f127589c     // Catch:{ all -> 0x0365 }
            int r10 = r10.size()     // Catch:{ all -> 0x0365 }
            r9.append(r10)     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = "mTrack.audioClips="
            r9.append(r10)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g$b r10 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r10 = r10.f127588b     // Catch:{ all -> 0x0365 }
            int r10 = r10.size()     // Catch:{ all -> 0x0365 }
            r9.append(r10)     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = "mTrack.audioTimeEffectClips="
            r9.append(r10)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g$b r10 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r10 = r10.f127590d     // Catch:{ all -> 0x0365 }
            int r10 = r10.size()     // Catch:{ all -> 0x0365 }
            r9.append(r10)     // Catch:{ all -> 0x0365 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r8, r9)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g$b r8 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r8 = r8.f127587a     // Catch:{ all -> 0x0365 }
            int r8 = r8.size()     // Catch:{ all -> 0x0365 }
            if (r8 <= 0) goto L_0x012b
            com.ss.android.vesdk.runtime.g$b r8 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r8 = r8.f127587a     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g$b r9 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r9 = r9.f127589c     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.runtime.C50774g.m109888a(r8, r9, r0, r2)     // Catch:{ all -> 0x0365 }
        L_0x012b:
            com.ss.android.vesdk.runtime.g$b r8 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r8 = r8.f127588b     // Catch:{ all -> 0x0365 }
            int r8 = r8.size()     // Catch:{ all -> 0x0365 }
            if (r8 <= 0) goto L_0x0140
            com.ss.android.vesdk.runtime.g$b r8 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r8 = r8.f127588b     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.g$b r9 = r7.f127576e     // Catch:{ all -> 0x0365 }
            java.util.List<com.ss.android.vesdk.runtime.g$a> r9 = r9.f127590d     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.runtime.C50774g.m109888a(r8, r9, r5, r6)     // Catch:{ all -> 0x0365 }
        L_0x0140:
            r7.mo99458a()     // Catch:{ all -> 0x0365 }
            java.lang.String r7 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.String r8 = "deleteTimeEffect deleteVideoClip begin"
            com.p683ss.android.vesdk.C50792y.m109914d(r7, r8)     // Catch:{ all -> 0x0365 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0365 }
        L_0x014e:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0365 }
            if (r7 == 0) goto L_0x0191
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r7 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r7     // Catch:{ all -> 0x0365 }
            com.ss.android.ttve.nativePort.TEInterface r8 = r12.f127379s     // Catch:{ all -> 0x0365 }
            int r9 = r12.f127346ak     // Catch:{ all -> 0x0365 }
            int r10 = r7.clipIndex     // Catch:{ all -> 0x0365 }
            int r8 = r8.deleteClip(r4, r9, r10)     // Catch:{ all -> 0x0365 }
            if (r8 >= 0) goto L_0x0179
            java.lang.String r9 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r11 = "deleteTimeEffect deleteVideoClip failed, ret = "
            r10.<init>(r11)     // Catch:{ all -> 0x0365 }
            r10.append(r8)     // Catch:{ all -> 0x0365 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r9, r8)     // Catch:{ all -> 0x0365 }
        L_0x0179:
            java.lang.String r8 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = "deleteTimeEffect deleteVideoClip ="
            r9.<init>(r10)     // Catch:{ all -> 0x0365 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0365 }
            r9.append(r7)     // Catch:{ all -> 0x0365 }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109911b(r8, r7)     // Catch:{ all -> 0x0365 }
            goto L_0x014e
        L_0x0191:
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.String r7 = "deleteTimeEffect deleteVideoClip end"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r7)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.String r7 = "deleteTimeEffect updateVideoClip begin"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r7)     // Catch:{ all -> 0x0365 }
            int r0 = r2.size()     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipTimelineParam[] r0 = new com.p683ss.android.vesdk.clipparam.VEClipTimelineParam[r0]     // Catch:{ all -> 0x0365 }
            int r7 = r2.size()     // Catch:{ all -> 0x0365 }
            int[] r7 = new int[r7]     // Catch:{ all -> 0x0365 }
            r8 = 0
        L_0x01ac:
            int r9 = r2.size()     // Catch:{ all -> 0x0365 }
            if (r8 >= r9) goto L_0x0207
            com.ss.android.vesdk.clipparam.VEClipTimelineParam r9 = new com.ss.android.vesdk.clipparam.VEClipTimelineParam     // Catch:{ all -> 0x0365 }
            r9.<init>()     // Catch:{ all -> 0x0365 }
            r0[r8] = r9     // Catch:{ all -> 0x0365 }
            r9 = r0[r8]     // Catch:{ all -> 0x0365 }
            java.lang.Object r10 = r2.get(r8)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r10 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r10     // Catch:{ all -> 0x0365 }
            int r10 = r10.trimIn     // Catch:{ all -> 0x0365 }
            r9.trimIn = r10     // Catch:{ all -> 0x0365 }
            r9 = r0[r8]     // Catch:{ all -> 0x0365 }
            java.lang.Object r10 = r2.get(r8)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r10 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r10     // Catch:{ all -> 0x0365 }
            int r10 = r10.trimOut     // Catch:{ all -> 0x0365 }
            r9.trimOut = r10     // Catch:{ all -> 0x0365 }
            r9 = r0[r8]     // Catch:{ all -> 0x0365 }
            java.lang.Object r10 = r2.get(r8)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r10 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r10     // Catch:{ all -> 0x0365 }
            double r10 = r10.speed     // Catch:{ all -> 0x0365 }
            r9.speed = r10     // Catch:{ all -> 0x0365 }
            java.lang.Object r9 = r2.get(r8)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r9 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r9     // Catch:{ all -> 0x0365 }
            int r9 = r9.clipIndex     // Catch:{ all -> 0x0365 }
            r7[r8] = r9     // Catch:{ all -> 0x0365 }
            java.lang.String r9 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r11 = "deleteTimeEffect updateVideoClip ="
            r10.<init>(r11)     // Catch:{ all -> 0x0365 }
            java.lang.Object r11 = r2.get(r8)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r11 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r11     // Catch:{ all -> 0x0365 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0365 }
            r10.append(r11)     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r9, r10)     // Catch:{ all -> 0x0365 }
            int r8 = r8 + 1
            goto L_0x01ac
        L_0x0207:
            com.ss.android.ttve.nativePort.TEInterface r2 = r12.f127379s     // Catch:{ all -> 0x0365 }
            int r8 = r12.f127346ak     // Catch:{ all -> 0x0365 }
            int r0 = r2.updateClipsTimelineParam(r4, r8, r7, r0)     // Catch:{ all -> 0x0365 }
            if (r0 >= 0) goto L_0x0224
            java.lang.String r2 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r9 = "deleteTimeEffect updateClipsTimelineParam failed, ret = "
            r8.<init>(r9)     // Catch:{ all -> 0x0365 }
            r8.append(r0)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r0)     // Catch:{ all -> 0x0365 }
        L_0x0224:
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = "deleteTimeEffect updateVideoClip end"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.b r0 = r12.f127318a     // Catch:{ all -> 0x0365 }
            int r0 = r0.f127519j     // Catch:{ all -> 0x0365 }
            if (r0 != r3) goto L_0x0329
            int r0 = r5.size()     // Catch:{ all -> 0x0365 }
            if (r0 > 0) goto L_0x023d
            int r0 = r6.size()     // Catch:{ all -> 0x0365 }
            if (r0 <= 0) goto L_0x0329
        L_0x023d:
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = "deleteTimeEffect deleteAuidoClip begin"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x0365 }
            java.util.Iterator r0 = r5.iterator()     // Catch:{ all -> 0x0365 }
        L_0x0248:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0365 }
            if (r2 == 0) goto L_0x028d
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r2 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r2     // Catch:{ all -> 0x0365 }
            com.ss.android.ttve.nativePort.TEInterface r5 = r12.f127379s     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.b r8 = r12.f127318a     // Catch:{ all -> 0x0365 }
            int r8 = r8.f127518i     // Catch:{ all -> 0x0365 }
            int r9 = r2.clipIndex     // Catch:{ all -> 0x0365 }
            int r5 = r5.deleteClip(r3, r8, r9)     // Catch:{ all -> 0x0365 }
            if (r5 >= 0) goto L_0x0275
            java.lang.String r8 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = "deleteTimeEffect deleteAuidoClip failed, ret = "
            r9.<init>(r10)     // Catch:{ all -> 0x0365 }
            r9.append(r5)     // Catch:{ all -> 0x0365 }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r8, r5)     // Catch:{ all -> 0x0365 }
        L_0x0275:
            java.lang.String r5 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r9 = "deleteTimeEffect deleteAuidoClip ="
            r8.<init>(r9)     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0365 }
            r8.append(r2)     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109911b(r5, r2)     // Catch:{ all -> 0x0365 }
            goto L_0x0248
        L_0x028d:
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = "deleteTimeEffect deleteAuidoClip end"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = "deleteTimeEffect updateAudioClip begin"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x0365 }
            int r0 = r6.size()     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipTimelineParam[] r0 = new com.p683ss.android.vesdk.clipparam.VEClipTimelineParam[r0]     // Catch:{ all -> 0x0365 }
            int r2 = r6.size()     // Catch:{ all -> 0x0365 }
            int[] r2 = new int[r2]     // Catch:{ all -> 0x0365 }
            r5 = 0
        L_0x02a8:
            int r8 = r6.size()     // Catch:{ all -> 0x0365 }
            if (r5 >= r8) goto L_0x0303
            com.ss.android.vesdk.clipparam.VEClipTimelineParam r8 = new com.ss.android.vesdk.clipparam.VEClipTimelineParam     // Catch:{ all -> 0x0365 }
            r8.<init>()     // Catch:{ all -> 0x0365 }
            r0[r5] = r8     // Catch:{ all -> 0x0365 }
            r8 = r0[r5]     // Catch:{ all -> 0x0365 }
            java.lang.Object r9 = r6.get(r5)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r9 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r9     // Catch:{ all -> 0x0365 }
            int r9 = r9.trimIn     // Catch:{ all -> 0x0365 }
            r8.trimIn = r9     // Catch:{ all -> 0x0365 }
            r8 = r0[r5]     // Catch:{ all -> 0x0365 }
            java.lang.Object r9 = r6.get(r5)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r9 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r9     // Catch:{ all -> 0x0365 }
            int r9 = r9.trimOut     // Catch:{ all -> 0x0365 }
            r8.trimOut = r9     // Catch:{ all -> 0x0365 }
            r8 = r0[r5]     // Catch:{ all -> 0x0365 }
            java.lang.Object r9 = r6.get(r5)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r9 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r9     // Catch:{ all -> 0x0365 }
            double r9 = r9.speed     // Catch:{ all -> 0x0365 }
            r8.speed = r9     // Catch:{ all -> 0x0365 }
            java.lang.Object r8 = r6.get(r5)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r8 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r8     // Catch:{ all -> 0x0365 }
            int r8 = r8.clipIndex     // Catch:{ all -> 0x0365 }
            r2[r5] = r8     // Catch:{ all -> 0x0365 }
            java.lang.String r8 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = "deleteTimeEffect updateAudioClip ="
            r9.<init>(r10)     // Catch:{ all -> 0x0365 }
            java.lang.Object r10 = r6.get(r5)     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.clipparam.VEClipParam r10 = (com.p683ss.android.vesdk.clipparam.VEClipParam) r10     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0365 }
            r9.append(r10)     // Catch:{ all -> 0x0365 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r8, r9)     // Catch:{ all -> 0x0365 }
            int r5 = r5 + 1
            goto L_0x02a8
        L_0x0303:
            com.ss.android.ttve.nativePort.TEInterface r2 = r12.f127379s     // Catch:{ all -> 0x0365 }
            com.ss.android.vesdk.runtime.b r5 = r12.f127318a     // Catch:{ all -> 0x0365 }
            int r5 = r5.f127518i     // Catch:{ all -> 0x0365 }
            int r0 = r2.updateClipsTimelineParam(r3, r5, r7, r0)     // Catch:{ all -> 0x0365 }
            if (r0 >= 0) goto L_0x0322
            java.lang.String r2 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r6 = "deleteTimeEffect updateClipsTimelineParam failed, ret = "
            r5.<init>(r6)     // Catch:{ all -> 0x0365 }
            r5.append(r0)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r0)     // Catch:{ all -> 0x0365 }
        L_0x0322:
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = "deleteTimeEffect updateAudioClip end"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x0365 }
        L_0x0329:
            java.lang.String r0 = com.p683ss.android.vesdk.runtime.C50774g.f127572a     // Catch:{ all -> 0x0365 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0365 }
            java.lang.String r5 = "deleteTimeEffect after getDuration ="
            r2.<init>(r5)     // Catch:{ all -> 0x0365 }
            com.ss.android.ttve.nativePort.TEInterface r5 = r12.f127379s     // Catch:{ all -> 0x0365 }
            int r5 = r5.getDuration()     // Catch:{ all -> 0x0365 }
            r2.append(r5)     // Catch:{ all -> 0x0365 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0365 }
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x0365 }
            goto L_0x0348
        L_0x0343:
            com.ss.android.vesdk.runtime.g r0 = r12.f127310S     // Catch:{ all -> 0x0365 }
            r0.mo99458a()     // Catch:{ all -> 0x0365 }
        L_0x0348:
            com.ss.android.ttve.nativePort.TEInterface r0 = r12.f127379s     // Catch:{ all -> 0x0365 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r12.f127379s     // Catch:{ all -> 0x0365 }
            int r2 = r2.getDuration()     // Catch:{ all -> 0x0365 }
            r0.setTimeRange(r4, r2, r3)     // Catch:{ all -> 0x0365 }
            com.ss.android.ttve.monitor.h r0 = r12.f127302K     // Catch:{ all -> 0x0365 }
            r0.f55324c = r4     // Catch:{ all -> 0x0365 }
            if (r1 == 0) goto L_0x0363
            com.ss.android.ttve.nativePort.TEInterface r0 = r12.f127379s     // Catch:{ all -> 0x0365 }
            r0.createTimeline()     // Catch:{ all -> 0x0365 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r12.f127379s     // Catch:{ all -> 0x0365 }
            r0.prepareEngine(r4)     // Catch:{ all -> 0x0365 }
        L_0x0363:
            monitor-exit(r12)     // Catch:{ all -> 0x0365 }
            return r13
        L_0x0365:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0365 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.mo99402s(int):int");
    }

    public C50720o(String str, SurfaceView surfaceView) {
        this(str, surfaceView, true);
    }

    /* renamed from: a */
    public final int mo99303a(String str, float f) {
        return m109671a(str, f, false, false);
    }

    /* renamed from: b */
    private int m109686b(int i, boolean z) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("deleteAudioTrack... trackIndex:");
            sb.append(i);
            sb.append(" needPrepare:false");
            C50792y.m109913c(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int b = this.f127312U.mo42187b(1, i);
            this.f127312U.f55211a.remove(Integer.valueOf(i));
            int deleteAudioTrack = this.f127379s.deleteAudioTrack(b, false);
            return deleteAudioTrack;
        }
    }

    /* renamed from: h */
    private List<VEClipParam> m109690h(int i, int i2) {
        List<VEClipParam> allClips = this.f127379s.getAllClips(i, i2);
        for (int i3 = 0; i3 < allClips.size(); i3++) {
            StringBuilder sb = new StringBuilder("getAllClips: ");
            sb.append(((VEClipParam) allClips.get(i3)).toString());
            C50792y.m109913c("VEEditor", sb.toString());
        }
        return allClips;
    }

    /* renamed from: c */
    public final int mo99353c(int i, float f) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerAlpha... index: ");
            sb.append(i);
            sb.append("alpha: ");
            sb.append(f);
            C50792y.m109911b(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f127379s.setFilterParam(i, "entity alpha", String.valueOf(f));
            return filterParam;
        }
    }

    /* renamed from: f */
    public final int mo99369f(int i, int i2) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerLayer... index: ");
            sb.append(i);
            sb.append("layer: ");
            sb.append(i2);
            C50792y.m109911b(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f127379s.setFilterParam(i, "entity layer", String.valueOf(i2));
            return filterParam;
        }
    }

    /* renamed from: b */
    public final int mo99338b(int i, float f) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerScale... index: ");
            sb.append(i);
            sb.append("scale: ");
            sb.append(f);
            C50792y.m109911b(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f127379s.setFilterParam(i, "entity scale x", String.valueOf(f)) + this.f127379s.setFilterParam(i, "entity scale y", String.valueOf(f));
            return filterParam;
        }
    }

    /* renamed from: d */
    public final void mo99362d(int i, int i2) {
        StringBuilder sb = new StringBuilder("setMaxWidthHeight... width:");
        sb.append(i);
        sb.append(", height:");
        sb.append(i2);
        C50792y.m109909a("VEEditor", sb.toString());
        this.f127379s.setMaxWidthHeight(i, i2);
    }

    /* renamed from: e */
    public final int mo99365e(int i, int i2) {
        synchronized (this) {
            C50792y.m109911b("VEEditor", "setSrtColor");
            if (i < 0) {
                return -100;
            }
            C50792y.m109914d("VEEditor", "");
            int i3 = (i2 >>> 24) & NormalGiftView.ALPHA_255;
            int i4 = (i2 >>> 16) & NormalGiftView.ALPHA_255;
            int i5 = (i2 >>> 8) & NormalGiftView.ALPHA_255;
            int i6 = i2 & NormalGiftView.ALPHA_255;
            StringBuilder sb = new StringBuilder("aa=");
            sb.append(i3);
            sb.append(", rr=");
            sb.append(i4);
            sb.append(", gg=");
            sb.append(i5);
            sb.append(", bb=");
            sb.append(i6);
            C50792y.m109914d("VEEditor", sb.toString());
            float f = ((float) i3) * 0.003921569f;
            float f2 = ((float) i4) * 0.003921569f;
            float f3 = ((float) i5) * 0.003921569f;
            float f4 = ((float) i6) * 0.003921569f;
            StringBuilder sb2 = new StringBuilder("a=");
            sb2.append(f);
            sb2.append(", r=");
            sb2.append(f2);
            sb2.append(", g=");
            sb2.append(f3);
            sb2.append(", b=");
            sb2.append(f4);
            C50792y.m109914d("VEEditor", sb2.toString());
            return this.f127379s.setFilterParam(i, "entity srt color a", String.valueOf(f)) + this.f127379s.setFilterParam(i, "entity srt color r", String.valueOf(f2)) + this.f127379s.setFilterParam(i, "entity srt color g", String.valueOf(f3)) + this.f127379s.setFilterParam(i, "entity srt color b", String.valueOf(f4));
        }
    }

    /* renamed from: g */
    public final int mo99373g(int i, int i2) {
        StringBuilder sb = new StringBuilder("disableFilterEffect... ");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        C50792y.m109913c("VEEditor", sb.toString());
        if (i < 0 || i2 < 0) {
            return -100;
        }
        C20116a aVar = (C20116a) this.f127302K.f55322a.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f55327c = i2 - aVar.f55326b;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("outPoint", i2);
            jSONObject.put("effectIndex", i);
            C20102a.m49612a("vesdk_event_editor_filter_effect_end", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f127379s.adjustFilterInOut(i, -1, i2);
    }

    /* renamed from: b */
    public final int mo99340b(int i, int i2) {
        int prepareEngine;
        synchronized (this) {
            C50660a aVar = new C50660a();
            aVar.mo99061a("iesve_veeditor_cut_duration", i2 - i);
            C20110e.m49637a("iesve_veeditor_cut_duration", 1, aVar);
            StringBuilder sb = new StringBuilder("setInOut... ");
            sb.append(i);
            sb.append(" ");
            sb.append(i2);
            C50792y.m109909a("VEEditor", sb.toString());
            this.f127379s.stop();
            this.f127379s.setTimeRange(i, i2, 0);
            prepareEngine = this.f127379s.prepareEngine(0);
        }
        return prepareEngine;
    }

    /* renamed from: c */
    public final void mo99358c(int i, int i2) {
        StringBuilder sb = new StringBuilder("setWidthHeight... width:");
        sb.append(i);
        sb.append(", height:");
        sb.append(i2);
        C50792y.m109909a("VEEditor", sb.toString());
        this.f127379s.setWidthHeight(i, i2);
    }

    public C50720o(String str, TextureView textureView) throws C50751p {
        this.f127311T = new VESize(-1, -1);
        this.f127362b = "mp4";
        this.f127363c = new C50746g(Looper.getMainLooper());
        this.f127364d = null;
        this.f127365e = null;
        this.f127366f = null;
        this.f127367g = null;
        this.f127368h = null;
        this.f127369i = null;
        this.f127370j = null;
        this.f127312U = new C20083k();
        this.f127313V = new C20067a();
        this.f127371k = "unknown";
        this.f127372l = new HashMap();
        this.f127339ad = null;
        this.f127373m = new Object();
        this.f127374n = new AtomicBoolean(false);
        this.f127340ae = new C20072b() {
            /* renamed from: a */
            public final void mo42168a(int i, int i2, float f, String str) {
                long j;
                int i3 = i;
                int i4 = i2;
                float f2 = f;
                String str2 = str;
                if (i3 == 4101) {
                    if (C50720o.this.f127293B > 0) {
                        System.currentTimeMillis();
                    }
                    if (C50720o.this.f127364d != null && C50720o.this.f127363c != null) {
                        C50792y.m109913c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        C50720o.this.f127363c.sendEmptyMessage(MessageCenter.MSG_CLIENT_TO_SDK_RESUME_GAME);
                    } else if (C50720o.this.f127369i != null) {
                        C50792y.m109913c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                    }
                } else if (i3 == 4103) {
                    int i5 = 0;
                    if (C50720o.this.f127298G) {
                        C50720o.this.f127299H.f127447d = C50720o.this.f127369i;
                        new Thread(C50720o.this.f127299H).start();
                        C50720o.this.f127298G = false;
                        return;
                    }
                    C50720o oVar = C50720o.this;
                    if (i4 == 1 || i4 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - oVar.f127297F;
                        C20114g.m49648a("te_composition_time", currentTimeMillis);
                        C20114g.m49645a(1, "te_composition_time", currentTimeMillis);
                        if (C19319g.m47185a(oVar.f127296E)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(oVar.f127296E, iArr) == 0) {
                                long length = new File(oVar.f127296E).length();
                                C20114g.m49648a("te_composition_page_mode", (long) oVar.f127303L);
                                double d = (double) length;
                                Double.isNaN(d);
                                double d2 = (d / 1024.0d) / 1024.0d;
                                C20114g.m49647a("te_composition_file_size", d2);
                                C20114g.m49647a("te_composition_file_duration", (double) iArr[3]);
                                C20114g.m49647a("te_composition_bit_rate", (double) iArr[6]);
                                C20114g.m49647a("te_composition_fps", (double) iArr[7]);
                                String str3 = "te_composition_resolution";
                                StringBuilder sb = new StringBuilder();
                                sb.append(iArr[0]);
                                sb.append("x");
                                sb.append(iArr[1]);
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str3)) {
                                    C50792y.m109913c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (sb2 == null) {
                                        sb2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString(str3, sb2);
                                }
                                C20114g.m49645a(1, "te_composition_page_mode", (long) oVar.f127303L);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(iArr[0]);
                                sb3.append("x");
                                sb3.append(iArr[1]);
                                C20114g.m49646a(1, "te_composition_resolution", sb3.toString());
                                C20114g.m49644a(1, "te_composition_fps", (double) iArr[7]);
                                C20114g.m49644a(1, "te_composition_bit_rate", (double) iArr[6]);
                                C20114g.m49644a(1, "te_composition_file_duration", (double) iArr[3]);
                                C20114g.m49644a(1, "te_composition_file_size", d2);
                                int i6 = oVar.f127302K.f55324c;
                                if (i6 != 0) {
                                    C20114g.m49645a(1, "te_composition_time_filter_type", (long) i6);
                                }
                            }
                        }
                        boolean b = oVar.f127302K.mo42272b();
                        String str4 = "te_composition_effect_add";
                        long j2 = 1;
                        if (b) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        C20114g.m49645a(1, str4, j);
                        if (!b) {
                            C20114g.m49646a(1, "te_composition_effect_json", oVar.f127302K.mo42268a(0));
                        }
                        boolean c = oVar.f127302K.mo42273c();
                        String str5 = "te_composition_info_sticker_add";
                        if (c) {
                            j2 = 0;
                        }
                        C20114g.m49645a(1, str5, j2);
                        if (!c) {
                            C20114g.m49646a(1, "te_composition_info_sticker_json", oVar.f127302K.mo42268a(1));
                        }
                        oVar.f127302K.mo42269a();
                        C20114g.m49643a(C20114g.f55318b);
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_file", oVar.f127362b);
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_result", "succ");
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_reason", "");
                        C20114g.m49658b(1);
                    }
                    Map nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        C20114g.m49650a(nativeGetMapByType, jSONObject);
                        jSONObject.put("usage_type", oVar.f127371k);
                        if (i4 != 1) {
                            if (i4 != 2) {
                                i5 = i4;
                            }
                        }
                        jSONObject.put("resultCode", i5);
                    } catch (JSONException unused) {
                    }
                    C20102a.m49612a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                    C20102a.m49612a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                    if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                        C50792y.m109913c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message = new Message();
                        message.what = MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME;
                        message.arg1 = i4;
                        message.obj = str2;
                        C50720o.this.f127363c.sendMessage(message);
                    } else if (C50720o.this.f127369i != null) {
                        C50792y.m109913c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                    }
                } else if (i3 != 4105) {
                    if (i3 != 4129) {
                        switch (i3) {
                            case 4133:
                                if (!(C50720o.this.f127367g == null || C50720o.this.f127363c == null)) {
                                    Message message2 = new Message();
                                    message2.what = 4133;
                                    message2.arg1 = i4;
                                    message2.arg2 = (int) f2;
                                    C50720o.this.f127363c.sendMessage(message2);
                                    return;
                                }
                            case 4134:
                                C50720o.this.f127304M = f2;
                                return;
                            default:
                                if (C50720o.this.f127369i != null) {
                                    StringBuilder sb4 = new StringBuilder("TECommonCallback type:");
                                    sb4.append(i3);
                                    C50792y.m109909a("VEEditor", sb4.toString());
                                    C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                                    break;
                                }
                                break;
                        }
                    } else if (C50720o.this.f127294C == 0) {
                        C50720o.this.f127294C = System.currentTimeMillis();
                        C50792y.m109909a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                    }
                } else if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                    Message message3 = new Message();
                    message3.what = i3;
                    message3.obj = Float.valueOf(f);
                    C50720o.this.f127363c.sendMessage(message3);
                } else if (C50720o.this.f127369i != null) {
                    C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                }
            }
        };
        this.f127341af = new C20072b() {
            /* renamed from: a */
            public final void mo42168a(int i, int i2, float f, String str) {
                C50720o.this.mo99349b();
                if (C50720o.this.f127370j != null) {
                    C50720o.this.f127370j.onCallback(i, i2, f, str);
                }
                if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                    C50746g gVar = C50720o.this.f127363c;
                    final int i3 = i;
                    final int i4 = i2;
                    final float f2 = f;
                    final String str2 = str;
                    C507371 r1 = new Runnable() {
                        public final void run() {
                            if (C50720o.this.f127365e != null) {
                                C50720o.this.f127365e.onCompileError(i3, i4, f2, str2);
                            }
                        }
                    };
                    gVar.post(r1);
                }
            }
        };
        this.f127375o = 0;
        this.f127376p = -1;
        this.f127377q = 0;
        this.f127378r = 0;
        this.f127342ag = 0;
        this.f127343ah = 0;
        this.f127344ai = Boolean.valueOf(false);
        this.f127345aj = -1;
        this.f127346ak = 0;
        this.f127382v = 0;
        this.f127383w = 0;
        this.f127384x = 0;
        this.f127385y = 0;
        this.f127386z = 0;
        this.f127292A = 0;
        this.f127293B = 0;
        this.f127294C = 0;
        this.f127295D = false;
        this.f127349an = 0;
        this.f127350ao = -1;
        this.f127352aq = C50748i.ALIGN_PARENT_BOTTOM;
        this.f127353ar = C50750k.CENTER;
        this.f127354as = false;
        this.f127355at = false;
        this.f127356au = false;
        this.f127357av = -1;
        this.f127358aw = -1;
        this.f127359ax = -1;
        this.f127360ay = -1;
        this.f127361az = -1;
        this.f127296E = null;
        this.f127297F = 0;
        this.f127320aB = false;
        this.f127298G = false;
        this.f127299H = null;
        this.f127300I = null;
        this.f127301J = null;
        this.f127302K = new C20115h();
        this.f127322aE = false;
        this.f127323aF = true;
        this.f127324aG = false;
        this.f127325aH = null;
        this.f127326aI = 0.0f;
        this.f127327aJ = 1.0f;
        this.f127328aK = 1.0f;
        this.f127303L = -1;
        this.f127329aL = 3000;
        this.f127330aM = 30.0f;
        this.f127331aN = -16777216;
        this.f127332aO = -16777216;
        this.f127304M = 0.0f;
        this.f127333aP = new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C50720o.this.mo99327a();
                if (C50720o.this.f127381u != null) {
                    C50720o.this.f127381u.release();
                }
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C50720o.this.f127377q = i;
                C50720o.this.f127378r = i2;
                C50720o.this.mo99268B();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C50720o.this.f127380t == surfaceTexture) {
                    C50720o.this.mo99330a(C50720o.this.f127381u);
                } else {
                    C50720o.this.f127381u = new Surface(surfaceTexture);
                    C50720o.this.mo99330a(C50720o.this.f127381u);
                }
                C50720o.this.f127380t = surfaceTexture;
            }
        };
        this.f127334aQ = new Callback2() {
            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C50792y.m109911b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C50720o.this.mo99330a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                synchronized (C50720o.this.f127373m) {
                    if (C50720o.this.f127374n.get()) {
                        C50792y.m109913c("VEEditor", "surfaceDestroyed, is destroying, just return");
                    } else {
                        C50720o.this.mo99327a();
                    }
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C50792y.m109911b("VEEditor", C2240a.m6773a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                C50720o oVar = C50720o.this;
                StringBuilder sb = new StringBuilder("onSurfaceChanged... ");
                sb.append(i2);
                sb.append(", ");
                sb.append(i3);
                C50792y.m109909a("VEEditor", sb.toString());
                oVar.f127377q = i2;
                oVar.f127378r = i3;
                oVar.mo99268B();
                if (i2 != 0 && i3 != 0) {
                    oVar.f127379s.setSurfaceSize(i2, i3);
                }
            }
        };
        this.f127335aR = new C20122e() {
            /* renamed from: a */
            public final int mo42278a(int i) {
                StringBuilder sb = new StringBuilder("onOpenGLCreate: ret = ");
                sb.append(i);
                C50792y.m109911b("VEEditor", sb.toString());
                return 0;
            }

            /* renamed from: b */
            public final int mo42280b(int i) {
                StringBuilder sb = new StringBuilder("onOpenGLDestroy: ret = ");
                sb.append(i);
                C50792y.m109911b("VEEditor", sb.toString());
                return 0;
            }

            /* renamed from: a */
            public final int mo42279a(int i, double d) {
                long j;
                long j2;
                StringBuilder sb = new StringBuilder("onOpenGLDrawing: tex = ");
                sb.append(i);
                sb.append(" timeStamp = ");
                sb.append(d);
                C50792y.m109915e("VEEditor", sb.toString());
                if (!C50720o.this.f127295D) {
                    C50720o.this.f127295D = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C50720o.this.f127294C > 0) {
                        j = C50720o.this.f127294C;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (C50720o.this.f127292A > 0) {
                        j2 = C50720o.this.f127292A;
                    } else {
                        j2 = C50720o.this.f127386z;
                    }
                    if (j2 == 0 || j2 < C50720o.this.f127385y) {
                        StringBuilder sb2 = new StringBuilder("onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = ");
                        sb2.append(C50720o.this.f127292A);
                        sb2.append(", mlFirstSeekTimeMS = ");
                        sb2.append(C50720o.this.f127386z);
                        sb2.append(", mlInitTimeMS = ");
                        sb2.append(C50720o.this.f127385y);
                        C50792y.m109914d("VEEditor", sb2.toString());
                        j2 = C50720o.this.f127385y;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - C50720o.this.f127385y);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                        jSONObject.put("time_total", currentTimeMillis - C50720o.this.f127385y);
                        jSONObject.put("usage_type", C50720o.this.f127371k);
                        C20102a.m49612a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                    } catch (JSONException e) {
                        StringBuilder sb3 = new StringBuilder("report first frame json err ");
                        sb3.append(e);
                        C50792y.m109914d("VEEditor", sb3.toString());
                    }
                    C20114g.m49645a(1, "te_edit_first_frame_time", currentTimeMillis - C50720o.this.f127385y);
                    if (C50720o.this.f127366f != null) {
                        C50720o.this.f127366f.mo43097a();
                    }
                }
                C50720o.this.f127382v++;
                if (C50720o.this.f127382v == 30) {
                    C50720o.this.f127383w = System.currentTimeMillis();
                    if (C50720o.this.f127384x != C50720o.this.f127383w) {
                        float f = 30000.0f / ((float) (C50720o.this.f127383w - C50720o.this.f127384x));
                        if (C50629aj.f126910b) {
                            StringBuilder sb4 = new StringBuilder("Render FPS = ");
                            sb4.append(f);
                            C50792y.m109909a("VEEditor", sb4.toString());
                        }
                        C50720o.this.f127384x = C50720o.this.f127383w;
                        C50720o.this.f127382v = 0;
                        if (C50720o.this.mo99391n() == C50747h.STARTED) {
                            C20114g.m49644a(2, "te_edit_playback_fps", (double) f);
                        }
                    }
                }
                return 0;
            }
        };
        this.f127336aS = new C20120c() {
            /* renamed from: a */
            public final void mo42277a() {
                if (C50720o.this.f127368h != null) {
                    C50720o.this.f127368h.mo98573a();
                }
            }
        };
        this.f127337aT = new C20118a() {
            /* renamed from: a */
            public final int mo42275a(byte[] bArr, int i, int i2, boolean z) {
                if (bArr == null || i < 0 || i2 <= 0) {
                    return -1;
                }
                if (C50720o.this.f127300I == null) {
                    return -2;
                }
                C50720o.this.f127300I.mo91547a(bArr, i, i2, z);
                return 0;
            }
        };
        this.f127338aU = new C20119b() {
            /* renamed from: a */
            public final int mo42276a(byte[] bArr, int i, int i2, int i3, float f) {
                if (C50720o.this.f127301J == null) {
                    return -100;
                }
                if (bArr != null || C50720o.this.f127363c == null) {
                    return C50720o.this.f127301J.mo86779a(bArr, i, i2, i3, f);
                }
                Message message = new Message();
                message.what = 4117;
                C50720o.this.f127363c.sendMessage(message);
                return 0;
            }
        };
        if (!TextUtils.isEmpty(str)) {
            C50792y.m109909a("VEEditor", "VEEditor textureView");
            this.f127379s = TEInterface.createEngine();
            this.f127318a = new C50765b(str);
            this.f127310S = new C50774g();
            this.f127348am = textureView;
            textureView.setSurfaceTextureListener(this.f127333aP);
            this.f127379s.setOpenGLListeners(this.f127335aR);
            this.f127379s.setInfoListener(this.f127340ae);
            this.f127379s.setErrorListener(this.f127341af);
            mo99355c(false);
            return;
        }
        StringBuilder sb = new StringBuilder("workspace is: ");
        sb.append(str);
        throw new C50751p(-100, sb.toString());
    }

    /* renamed from: b */
    private int m109685b(int i, int i2, C50744e eVar) {
        int timeRange;
        synchronized (this) {
            timeRange = this.f127379s.setTimeRange(i, i2, eVar.getValue());
        }
        return timeRange;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m109669a(int r5, java.lang.String r6, float r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r5 = r4.f127361az     // Catch:{ all -> 0x0062 }
            if (r5 >= 0) goto L_0x0009
            r5 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            return r5
        L_0x0009:
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0013
            if (r6 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r7
            goto L_0x0015
        L_0x0013:
            java.lang.String r6 = ""
        L_0x0015:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x001d:
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f127379s     // Catch:{ all -> 0x0062 }
            int r0 = r4.f127361az     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "effect hdr type"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r2.<init>()     // Catch:{ all -> 0x0062 }
            r3 = 1
            r2.append(r3)     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0062 }
            r7.setFilterParam(r0, r1, r2)     // Catch:{ all -> 0x0062 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f127379s     // Catch:{ all -> 0x0062 }
            int r0 = r4.f127361az     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "effect res path"
            r7.setFilterParam(r0, r1, r6)     // Catch:{ all -> 0x0062 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f127379s     // Catch:{ all -> 0x0062 }
            int r0 = r4.f127361az     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "effect hdr intensity"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r2.<init>()     // Catch:{ all -> 0x0062 }
            r2.append(r5)     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0062 }
            r7.setFilterParam(r0, r1, r5)     // Catch:{ all -> 0x0062 }
            int r5 = r6.length()     // Catch:{ all -> 0x0062 }
            r6 = 0
            if (r5 <= 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            java.lang.String r5 = "iesve_veeditor_set_effect_hdr"
            r7 = 0
            com.p683ss.android.ttve.monitor.C20110e.m49637a(r5, r3, r7)     // Catch:{ all -> 0x0062 }
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            return r6
        L_0x0062:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.m109669a(int, java.lang.String, float):int");
    }

    /* renamed from: b */
    public final int mo99339b(int i, float f, float f2) {
        synchronized (this) {
            C50792y.m109911b("VEEditor", "setSrtInitialPosition");
            if (i < 0) {
                return -100;
            }
            return this.f127379s.setFilterParam(i, "entity srt initial position x", String.valueOf(f)) + this.f127379s.setFilterParam(i, "entity srt initial position y", String.valueOf(f2));
        }
    }

    public C50720o(String str, SurfaceView surfaceView, long j) {
        this.f127311T = new VESize(-1, -1);
        this.f127362b = "mp4";
        this.f127363c = new C50746g(Looper.getMainLooper());
        this.f127364d = null;
        this.f127365e = null;
        this.f127366f = null;
        this.f127367g = null;
        this.f127368h = null;
        this.f127369i = null;
        this.f127370j = null;
        this.f127312U = new C20083k();
        this.f127313V = new C20067a();
        this.f127371k = "unknown";
        this.f127372l = new HashMap();
        this.f127339ad = null;
        this.f127373m = new Object();
        this.f127374n = new AtomicBoolean(false);
        this.f127340ae = new C20072b() {
            /* renamed from: a */
            public final void mo42168a(int i, int i2, float f, String str) {
                long j;
                int i3 = i;
                int i4 = i2;
                float f2 = f;
                String str2 = str;
                if (i3 == 4101) {
                    if (C50720o.this.f127293B > 0) {
                        System.currentTimeMillis();
                    }
                    if (C50720o.this.f127364d != null && C50720o.this.f127363c != null) {
                        C50792y.m109913c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        C50720o.this.f127363c.sendEmptyMessage(MessageCenter.MSG_CLIENT_TO_SDK_RESUME_GAME);
                    } else if (C50720o.this.f127369i != null) {
                        C50792y.m109913c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                    }
                } else if (i3 == 4103) {
                    int i5 = 0;
                    if (C50720o.this.f127298G) {
                        C50720o.this.f127299H.f127447d = C50720o.this.f127369i;
                        new Thread(C50720o.this.f127299H).start();
                        C50720o.this.f127298G = false;
                        return;
                    }
                    C50720o oVar = C50720o.this;
                    if (i4 == 1 || i4 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - oVar.f127297F;
                        C20114g.m49648a("te_composition_time", currentTimeMillis);
                        C20114g.m49645a(1, "te_composition_time", currentTimeMillis);
                        if (C19319g.m47185a(oVar.f127296E)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(oVar.f127296E, iArr) == 0) {
                                long length = new File(oVar.f127296E).length();
                                C20114g.m49648a("te_composition_page_mode", (long) oVar.f127303L);
                                double d = (double) length;
                                Double.isNaN(d);
                                double d2 = (d / 1024.0d) / 1024.0d;
                                C20114g.m49647a("te_composition_file_size", d2);
                                C20114g.m49647a("te_composition_file_duration", (double) iArr[3]);
                                C20114g.m49647a("te_composition_bit_rate", (double) iArr[6]);
                                C20114g.m49647a("te_composition_fps", (double) iArr[7]);
                                String str3 = "te_composition_resolution";
                                StringBuilder sb = new StringBuilder();
                                sb.append(iArr[0]);
                                sb.append("x");
                                sb.append(iArr[1]);
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str3)) {
                                    C50792y.m109913c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (sb2 == null) {
                                        sb2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString(str3, sb2);
                                }
                                C20114g.m49645a(1, "te_composition_page_mode", (long) oVar.f127303L);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(iArr[0]);
                                sb3.append("x");
                                sb3.append(iArr[1]);
                                C20114g.m49646a(1, "te_composition_resolution", sb3.toString());
                                C20114g.m49644a(1, "te_composition_fps", (double) iArr[7]);
                                C20114g.m49644a(1, "te_composition_bit_rate", (double) iArr[6]);
                                C20114g.m49644a(1, "te_composition_file_duration", (double) iArr[3]);
                                C20114g.m49644a(1, "te_composition_file_size", d2);
                                int i6 = oVar.f127302K.f55324c;
                                if (i6 != 0) {
                                    C20114g.m49645a(1, "te_composition_time_filter_type", (long) i6);
                                }
                            }
                        }
                        boolean b = oVar.f127302K.mo42272b();
                        String str4 = "te_composition_effect_add";
                        long j2 = 1;
                        if (b) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        C20114g.m49645a(1, str4, j);
                        if (!b) {
                            C20114g.m49646a(1, "te_composition_effect_json", oVar.f127302K.mo42268a(0));
                        }
                        boolean c = oVar.f127302K.mo42273c();
                        String str5 = "te_composition_info_sticker_add";
                        if (c) {
                            j2 = 0;
                        }
                        C20114g.m49645a(1, str5, j2);
                        if (!c) {
                            C20114g.m49646a(1, "te_composition_info_sticker_json", oVar.f127302K.mo42268a(1));
                        }
                        oVar.f127302K.mo42269a();
                        C20114g.m49643a(C20114g.f55318b);
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_file", oVar.f127362b);
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_result", "succ");
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_reason", "");
                        C20114g.m49658b(1);
                    }
                    Map nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        C20114g.m49650a(nativeGetMapByType, jSONObject);
                        jSONObject.put("usage_type", oVar.f127371k);
                        if (i4 != 1) {
                            if (i4 != 2) {
                                i5 = i4;
                            }
                        }
                        jSONObject.put("resultCode", i5);
                    } catch (JSONException unused) {
                    }
                    C20102a.m49612a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                    C20102a.m49612a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                    if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                        C50792y.m109913c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message = new Message();
                        message.what = MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME;
                        message.arg1 = i4;
                        message.obj = str2;
                        C50720o.this.f127363c.sendMessage(message);
                    } else if (C50720o.this.f127369i != null) {
                        C50792y.m109913c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                    }
                } else if (i3 != 4105) {
                    if (i3 != 4129) {
                        switch (i3) {
                            case 4133:
                                if (!(C50720o.this.f127367g == null || C50720o.this.f127363c == null)) {
                                    Message message2 = new Message();
                                    message2.what = 4133;
                                    message2.arg1 = i4;
                                    message2.arg2 = (int) f2;
                                    C50720o.this.f127363c.sendMessage(message2);
                                    return;
                                }
                            case 4134:
                                C50720o.this.f127304M = f2;
                                return;
                            default:
                                if (C50720o.this.f127369i != null) {
                                    StringBuilder sb4 = new StringBuilder("TECommonCallback type:");
                                    sb4.append(i3);
                                    C50792y.m109909a("VEEditor", sb4.toString());
                                    C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                                    break;
                                }
                                break;
                        }
                    } else if (C50720o.this.f127294C == 0) {
                        C50720o.this.f127294C = System.currentTimeMillis();
                        C50792y.m109909a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                    }
                } else if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                    Message message3 = new Message();
                    message3.what = i3;
                    message3.obj = Float.valueOf(f);
                    C50720o.this.f127363c.sendMessage(message3);
                } else if (C50720o.this.f127369i != null) {
                    C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                }
            }
        };
        this.f127341af = new C20072b() {
            /* renamed from: a */
            public final void mo42168a(int i, int i2, float f, String str) {
                C50720o.this.mo99349b();
                if (C50720o.this.f127370j != null) {
                    C50720o.this.f127370j.onCallback(i, i2, f, str);
                }
                if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                    C50746g gVar = C50720o.this.f127363c;
                    final int i3 = i;
                    final int i4 = i2;
                    final float f2 = f;
                    final String str2 = str;
                    C507371 r1 = new Runnable() {
                        public final void run() {
                            if (C50720o.this.f127365e != null) {
                                C50720o.this.f127365e.onCompileError(i3, i4, f2, str2);
                            }
                        }
                    };
                    gVar.post(r1);
                }
            }
        };
        this.f127375o = 0;
        this.f127376p = -1;
        this.f127377q = 0;
        this.f127378r = 0;
        this.f127342ag = 0;
        this.f127343ah = 0;
        this.f127344ai = Boolean.valueOf(false);
        this.f127345aj = -1;
        this.f127346ak = 0;
        this.f127382v = 0;
        this.f127383w = 0;
        this.f127384x = 0;
        this.f127385y = 0;
        this.f127386z = 0;
        this.f127292A = 0;
        this.f127293B = 0;
        this.f127294C = 0;
        this.f127295D = false;
        this.f127349an = 0;
        this.f127350ao = -1;
        this.f127352aq = C50748i.ALIGN_PARENT_BOTTOM;
        this.f127353ar = C50750k.CENTER;
        this.f127354as = false;
        this.f127355at = false;
        this.f127356au = false;
        this.f127357av = -1;
        this.f127358aw = -1;
        this.f127359ax = -1;
        this.f127360ay = -1;
        this.f127361az = -1;
        this.f127296E = null;
        this.f127297F = 0;
        this.f127320aB = false;
        this.f127298G = false;
        this.f127299H = null;
        this.f127300I = null;
        this.f127301J = null;
        this.f127302K = new C20115h();
        this.f127322aE = false;
        this.f127323aF = true;
        this.f127324aG = false;
        this.f127325aH = null;
        this.f127326aI = 0.0f;
        this.f127327aJ = 1.0f;
        this.f127328aK = 1.0f;
        this.f127303L = -1;
        this.f127329aL = 3000;
        this.f127330aM = 30.0f;
        this.f127331aN = -16777216;
        this.f127332aO = -16777216;
        this.f127304M = 0.0f;
        this.f127333aP = new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C50720o.this.mo99327a();
                if (C50720o.this.f127381u != null) {
                    C50720o.this.f127381u.release();
                }
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C50720o.this.f127377q = i;
                C50720o.this.f127378r = i2;
                C50720o.this.mo99268B();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C50720o.this.f127380t == surfaceTexture) {
                    C50720o.this.mo99330a(C50720o.this.f127381u);
                } else {
                    C50720o.this.f127381u = new Surface(surfaceTexture);
                    C50720o.this.mo99330a(C50720o.this.f127381u);
                }
                C50720o.this.f127380t = surfaceTexture;
            }
        };
        this.f127334aQ = new Callback2() {
            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C50792y.m109911b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C50720o.this.mo99330a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                synchronized (C50720o.this.f127373m) {
                    if (C50720o.this.f127374n.get()) {
                        C50792y.m109913c("VEEditor", "surfaceDestroyed, is destroying, just return");
                    } else {
                        C50720o.this.mo99327a();
                    }
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C50792y.m109911b("VEEditor", C2240a.m6773a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                C50720o oVar = C50720o.this;
                StringBuilder sb = new StringBuilder("onSurfaceChanged... ");
                sb.append(i2);
                sb.append(", ");
                sb.append(i3);
                C50792y.m109909a("VEEditor", sb.toString());
                oVar.f127377q = i2;
                oVar.f127378r = i3;
                oVar.mo99268B();
                if (i2 != 0 && i3 != 0) {
                    oVar.f127379s.setSurfaceSize(i2, i3);
                }
            }
        };
        this.f127335aR = new C20122e() {
            /* renamed from: a */
            public final int mo42278a(int i) {
                StringBuilder sb = new StringBuilder("onOpenGLCreate: ret = ");
                sb.append(i);
                C50792y.m109911b("VEEditor", sb.toString());
                return 0;
            }

            /* renamed from: b */
            public final int mo42280b(int i) {
                StringBuilder sb = new StringBuilder("onOpenGLDestroy: ret = ");
                sb.append(i);
                C50792y.m109911b("VEEditor", sb.toString());
                return 0;
            }

            /* renamed from: a */
            public final int mo42279a(int i, double d) {
                long j;
                long j2;
                StringBuilder sb = new StringBuilder("onOpenGLDrawing: tex = ");
                sb.append(i);
                sb.append(" timeStamp = ");
                sb.append(d);
                C50792y.m109915e("VEEditor", sb.toString());
                if (!C50720o.this.f127295D) {
                    C50720o.this.f127295D = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C50720o.this.f127294C > 0) {
                        j = C50720o.this.f127294C;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (C50720o.this.f127292A > 0) {
                        j2 = C50720o.this.f127292A;
                    } else {
                        j2 = C50720o.this.f127386z;
                    }
                    if (j2 == 0 || j2 < C50720o.this.f127385y) {
                        StringBuilder sb2 = new StringBuilder("onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = ");
                        sb2.append(C50720o.this.f127292A);
                        sb2.append(", mlFirstSeekTimeMS = ");
                        sb2.append(C50720o.this.f127386z);
                        sb2.append(", mlInitTimeMS = ");
                        sb2.append(C50720o.this.f127385y);
                        C50792y.m109914d("VEEditor", sb2.toString());
                        j2 = C50720o.this.f127385y;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - C50720o.this.f127385y);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                        jSONObject.put("time_total", currentTimeMillis - C50720o.this.f127385y);
                        jSONObject.put("usage_type", C50720o.this.f127371k);
                        C20102a.m49612a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                    } catch (JSONException e) {
                        StringBuilder sb3 = new StringBuilder("report first frame json err ");
                        sb3.append(e);
                        C50792y.m109914d("VEEditor", sb3.toString());
                    }
                    C20114g.m49645a(1, "te_edit_first_frame_time", currentTimeMillis - C50720o.this.f127385y);
                    if (C50720o.this.f127366f != null) {
                        C50720o.this.f127366f.mo43097a();
                    }
                }
                C50720o.this.f127382v++;
                if (C50720o.this.f127382v == 30) {
                    C50720o.this.f127383w = System.currentTimeMillis();
                    if (C50720o.this.f127384x != C50720o.this.f127383w) {
                        float f = 30000.0f / ((float) (C50720o.this.f127383w - C50720o.this.f127384x));
                        if (C50629aj.f126910b) {
                            StringBuilder sb4 = new StringBuilder("Render FPS = ");
                            sb4.append(f);
                            C50792y.m109909a("VEEditor", sb4.toString());
                        }
                        C50720o.this.f127384x = C50720o.this.f127383w;
                        C50720o.this.f127382v = 0;
                        if (C50720o.this.mo99391n() == C50747h.STARTED) {
                            C20114g.m49644a(2, "te_edit_playback_fps", (double) f);
                        }
                    }
                }
                return 0;
            }
        };
        this.f127336aS = new C20120c() {
            /* renamed from: a */
            public final void mo42277a() {
                if (C50720o.this.f127368h != null) {
                    C50720o.this.f127368h.mo98573a();
                }
            }
        };
        this.f127337aT = new C20118a() {
            /* renamed from: a */
            public final int mo42275a(byte[] bArr, int i, int i2, boolean z) {
                if (bArr == null || i < 0 || i2 <= 0) {
                    return -1;
                }
                if (C50720o.this.f127300I == null) {
                    return -2;
                }
                C50720o.this.f127300I.mo91547a(bArr, i, i2, z);
                return 0;
            }
        };
        this.f127338aU = new C20119b() {
            /* renamed from: a */
            public final int mo42276a(byte[] bArr, int i, int i2, int i3, float f) {
                if (C50720o.this.f127301J == null) {
                    return -100;
                }
                if (bArr != null || C50720o.this.f127363c == null) {
                    return C50720o.this.f127301J.mo86779a(bArr, i, i2, i3, f);
                }
                Message message = new Message();
                message.what = 4117;
                C50720o.this.f127363c.sendMessage(message);
                return 0;
            }
        };
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("VEEditor surfaceView with handler:");
            sb.append(j);
            C50792y.m109909a("VEEditor", sb.toString());
            this.f127379s = TEInterface.createEngine(j);
            this.f127318a = new C50765b(str);
            this.f127310S = new C50774g();
            this.f127347al = surfaceView;
            surfaceView.getHolder().addCallback(this.f127334aQ);
            this.f127379s.setOpenGLListeners(this.f127335aR);
            this.f127379s.setInfoListener(this.f127340ae);
            this.f127379s.setErrorListener(this.f127341af);
            mo99355c(false);
            return;
        }
        StringBuilder sb2 = new StringBuilder("workspace is: ");
        sb2.append(str);
        throw new C50751p(-100, sb2.toString());
    }

    private C50720o(String str, SurfaceView surfaceView, boolean z) {
        this.f127311T = new VESize(-1, -1);
        this.f127362b = "mp4";
        this.f127363c = new C50746g(Looper.getMainLooper());
        this.f127364d = null;
        this.f127365e = null;
        this.f127366f = null;
        this.f127367g = null;
        this.f127368h = null;
        this.f127369i = null;
        this.f127370j = null;
        this.f127312U = new C20083k();
        this.f127313V = new C20067a();
        this.f127371k = "unknown";
        this.f127372l = new HashMap();
        this.f127339ad = null;
        this.f127373m = new Object();
        this.f127374n = new AtomicBoolean(false);
        this.f127340ae = new C20072b() {
            /* renamed from: a */
            public final void mo42168a(int i, int i2, float f, String str) {
                long j;
                int i3 = i;
                int i4 = i2;
                float f2 = f;
                String str2 = str;
                if (i3 == 4101) {
                    if (C50720o.this.f127293B > 0) {
                        System.currentTimeMillis();
                    }
                    if (C50720o.this.f127364d != null && C50720o.this.f127363c != null) {
                        C50792y.m109913c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        C50720o.this.f127363c.sendEmptyMessage(MessageCenter.MSG_CLIENT_TO_SDK_RESUME_GAME);
                    } else if (C50720o.this.f127369i != null) {
                        C50792y.m109913c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                    }
                } else if (i3 == 4103) {
                    int i5 = 0;
                    if (C50720o.this.f127298G) {
                        C50720o.this.f127299H.f127447d = C50720o.this.f127369i;
                        new Thread(C50720o.this.f127299H).start();
                        C50720o.this.f127298G = false;
                        return;
                    }
                    C50720o oVar = C50720o.this;
                    if (i4 == 1 || i4 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - oVar.f127297F;
                        C20114g.m49648a("te_composition_time", currentTimeMillis);
                        C20114g.m49645a(1, "te_composition_time", currentTimeMillis);
                        if (C19319g.m47185a(oVar.f127296E)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(oVar.f127296E, iArr) == 0) {
                                long length = new File(oVar.f127296E).length();
                                C20114g.m49648a("te_composition_page_mode", (long) oVar.f127303L);
                                double d = (double) length;
                                Double.isNaN(d);
                                double d2 = (d / 1024.0d) / 1024.0d;
                                C20114g.m49647a("te_composition_file_size", d2);
                                C20114g.m49647a("te_composition_file_duration", (double) iArr[3]);
                                C20114g.m49647a("te_composition_bit_rate", (double) iArr[6]);
                                C20114g.m49647a("te_composition_fps", (double) iArr[7]);
                                String str3 = "te_composition_resolution";
                                StringBuilder sb = new StringBuilder();
                                sb.append(iArr[0]);
                                sb.append("x");
                                sb.append(iArr[1]);
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str3)) {
                                    C50792y.m109913c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (sb2 == null) {
                                        sb2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString(str3, sb2);
                                }
                                C20114g.m49645a(1, "te_composition_page_mode", (long) oVar.f127303L);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(iArr[0]);
                                sb3.append("x");
                                sb3.append(iArr[1]);
                                C20114g.m49646a(1, "te_composition_resolution", sb3.toString());
                                C20114g.m49644a(1, "te_composition_fps", (double) iArr[7]);
                                C20114g.m49644a(1, "te_composition_bit_rate", (double) iArr[6]);
                                C20114g.m49644a(1, "te_composition_file_duration", (double) iArr[3]);
                                C20114g.m49644a(1, "te_composition_file_size", d2);
                                int i6 = oVar.f127302K.f55324c;
                                if (i6 != 0) {
                                    C20114g.m49645a(1, "te_composition_time_filter_type", (long) i6);
                                }
                            }
                        }
                        boolean b = oVar.f127302K.mo42272b();
                        String str4 = "te_composition_effect_add";
                        long j2 = 1;
                        if (b) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        C20114g.m49645a(1, str4, j);
                        if (!b) {
                            C20114g.m49646a(1, "te_composition_effect_json", oVar.f127302K.mo42268a(0));
                        }
                        boolean c = oVar.f127302K.mo42273c();
                        String str5 = "te_composition_info_sticker_add";
                        if (c) {
                            j2 = 0;
                        }
                        C20114g.m49645a(1, str5, j2);
                        if (!c) {
                            C20114g.m49646a(1, "te_composition_info_sticker_json", oVar.f127302K.mo42268a(1));
                        }
                        oVar.f127302K.mo42269a();
                        C20114g.m49643a(C20114g.f55318b);
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_file", oVar.f127362b);
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_result", "succ");
                        C20114g.m49646a(1, "iesve_veeditor_composition_finish_reason", "");
                        C20114g.m49658b(1);
                    }
                    Map nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        C20114g.m49650a(nativeGetMapByType, jSONObject);
                        jSONObject.put("usage_type", oVar.f127371k);
                        if (i4 != 1) {
                            if (i4 != 2) {
                                i5 = i4;
                            }
                        }
                        jSONObject.put("resultCode", i5);
                    } catch (JSONException unused) {
                    }
                    C20102a.m49612a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                    C20102a.m49612a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                    if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                        C50792y.m109913c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message = new Message();
                        message.what = MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME;
                        message.arg1 = i4;
                        message.obj = str2;
                        C50720o.this.f127363c.sendMessage(message);
                    } else if (C50720o.this.f127369i != null) {
                        C50792y.m109913c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                    }
                } else if (i3 != 4105) {
                    if (i3 != 4129) {
                        switch (i3) {
                            case 4133:
                                if (!(C50720o.this.f127367g == null || C50720o.this.f127363c == null)) {
                                    Message message2 = new Message();
                                    message2.what = 4133;
                                    message2.arg1 = i4;
                                    message2.arg2 = (int) f2;
                                    C50720o.this.f127363c.sendMessage(message2);
                                    return;
                                }
                            case 4134:
                                C50720o.this.f127304M = f2;
                                return;
                            default:
                                if (C50720o.this.f127369i != null) {
                                    StringBuilder sb4 = new StringBuilder("TECommonCallback type:");
                                    sb4.append(i3);
                                    C50792y.m109909a("VEEditor", sb4.toString());
                                    C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                                    break;
                                }
                                break;
                        }
                    } else if (C50720o.this.f127294C == 0) {
                        C50720o.this.f127294C = System.currentTimeMillis();
                        C50792y.m109909a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                    }
                } else if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                    Message message3 = new Message();
                    message3.what = i3;
                    message3.obj = Float.valueOf(f);
                    C50720o.this.f127363c.sendMessage(message3);
                } else if (C50720o.this.f127369i != null) {
                    C50720o.this.f127369i.onCallback(i3, i4, f2, str2);
                }
            }
        };
        this.f127341af = new C20072b() {
            /* renamed from: a */
            public final void mo42168a(int i, int i2, float f, String str) {
                C50720o.this.mo99349b();
                if (C50720o.this.f127370j != null) {
                    C50720o.this.f127370j.onCallback(i, i2, f, str);
                }
                if (C50720o.this.f127365e != null && C50720o.this.f127363c != null) {
                    C50746g gVar = C50720o.this.f127363c;
                    final int i3 = i;
                    final int i4 = i2;
                    final float f2 = f;
                    final String str2 = str;
                    C507371 r1 = new Runnable() {
                        public final void run() {
                            if (C50720o.this.f127365e != null) {
                                C50720o.this.f127365e.onCompileError(i3, i4, f2, str2);
                            }
                        }
                    };
                    gVar.post(r1);
                }
            }
        };
        this.f127375o = 0;
        this.f127376p = -1;
        this.f127377q = 0;
        this.f127378r = 0;
        this.f127342ag = 0;
        this.f127343ah = 0;
        this.f127344ai = Boolean.valueOf(false);
        this.f127345aj = -1;
        this.f127346ak = 0;
        this.f127382v = 0;
        this.f127383w = 0;
        this.f127384x = 0;
        this.f127385y = 0;
        this.f127386z = 0;
        this.f127292A = 0;
        this.f127293B = 0;
        this.f127294C = 0;
        this.f127295D = false;
        this.f127349an = 0;
        this.f127350ao = -1;
        this.f127352aq = C50748i.ALIGN_PARENT_BOTTOM;
        this.f127353ar = C50750k.CENTER;
        this.f127354as = false;
        this.f127355at = false;
        this.f127356au = false;
        this.f127357av = -1;
        this.f127358aw = -1;
        this.f127359ax = -1;
        this.f127360ay = -1;
        this.f127361az = -1;
        this.f127296E = null;
        this.f127297F = 0;
        this.f127320aB = false;
        this.f127298G = false;
        this.f127299H = null;
        this.f127300I = null;
        this.f127301J = null;
        this.f127302K = new C20115h();
        this.f127322aE = false;
        this.f127323aF = true;
        this.f127324aG = false;
        this.f127325aH = null;
        this.f127326aI = 0.0f;
        this.f127327aJ = 1.0f;
        this.f127328aK = 1.0f;
        this.f127303L = -1;
        this.f127329aL = 3000;
        this.f127330aM = 30.0f;
        this.f127331aN = -16777216;
        this.f127332aO = -16777216;
        this.f127304M = 0.0f;
        this.f127333aP = new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C50720o.this.mo99327a();
                if (C50720o.this.f127381u != null) {
                    C50720o.this.f127381u.release();
                }
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C50720o.this.f127377q = i;
                C50720o.this.f127378r = i2;
                C50720o.this.mo99268B();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C50720o.this.f127380t == surfaceTexture) {
                    C50720o.this.mo99330a(C50720o.this.f127381u);
                } else {
                    C50720o.this.f127381u = new Surface(surfaceTexture);
                    C50720o.this.mo99330a(C50720o.this.f127381u);
                }
                C50720o.this.f127380t = surfaceTexture;
            }
        };
        this.f127334aQ = new Callback2() {
            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C50792y.m109911b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C50720o.this.mo99330a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                synchronized (C50720o.this.f127373m) {
                    if (C50720o.this.f127374n.get()) {
                        C50792y.m109913c("VEEditor", "surfaceDestroyed, is destroying, just return");
                    } else {
                        C50720o.this.mo99327a();
                    }
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C50792y.m109911b("VEEditor", C2240a.m6773a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                C50720o oVar = C50720o.this;
                StringBuilder sb = new StringBuilder("onSurfaceChanged... ");
                sb.append(i2);
                sb.append(", ");
                sb.append(i3);
                C50792y.m109909a("VEEditor", sb.toString());
                oVar.f127377q = i2;
                oVar.f127378r = i3;
                oVar.mo99268B();
                if (i2 != 0 && i3 != 0) {
                    oVar.f127379s.setSurfaceSize(i2, i3);
                }
            }
        };
        this.f127335aR = new C20122e() {
            /* renamed from: a */
            public final int mo42278a(int i) {
                StringBuilder sb = new StringBuilder("onOpenGLCreate: ret = ");
                sb.append(i);
                C50792y.m109911b("VEEditor", sb.toString());
                return 0;
            }

            /* renamed from: b */
            public final int mo42280b(int i) {
                StringBuilder sb = new StringBuilder("onOpenGLDestroy: ret = ");
                sb.append(i);
                C50792y.m109911b("VEEditor", sb.toString());
                return 0;
            }

            /* renamed from: a */
            public final int mo42279a(int i, double d) {
                long j;
                long j2;
                StringBuilder sb = new StringBuilder("onOpenGLDrawing: tex = ");
                sb.append(i);
                sb.append(" timeStamp = ");
                sb.append(d);
                C50792y.m109915e("VEEditor", sb.toString());
                if (!C50720o.this.f127295D) {
                    C50720o.this.f127295D = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C50720o.this.f127294C > 0) {
                        j = C50720o.this.f127294C;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (C50720o.this.f127292A > 0) {
                        j2 = C50720o.this.f127292A;
                    } else {
                        j2 = C50720o.this.f127386z;
                    }
                    if (j2 == 0 || j2 < C50720o.this.f127385y) {
                        StringBuilder sb2 = new StringBuilder("onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = ");
                        sb2.append(C50720o.this.f127292A);
                        sb2.append(", mlFirstSeekTimeMS = ");
                        sb2.append(C50720o.this.f127386z);
                        sb2.append(", mlInitTimeMS = ");
                        sb2.append(C50720o.this.f127385y);
                        C50792y.m109914d("VEEditor", sb2.toString());
                        j2 = C50720o.this.f127385y;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - C50720o.this.f127385y);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                        jSONObject.put("time_total", currentTimeMillis - C50720o.this.f127385y);
                        jSONObject.put("usage_type", C50720o.this.f127371k);
                        C20102a.m49612a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                    } catch (JSONException e) {
                        StringBuilder sb3 = new StringBuilder("report first frame json err ");
                        sb3.append(e);
                        C50792y.m109914d("VEEditor", sb3.toString());
                    }
                    C20114g.m49645a(1, "te_edit_first_frame_time", currentTimeMillis - C50720o.this.f127385y);
                    if (C50720o.this.f127366f != null) {
                        C50720o.this.f127366f.mo43097a();
                    }
                }
                C50720o.this.f127382v++;
                if (C50720o.this.f127382v == 30) {
                    C50720o.this.f127383w = System.currentTimeMillis();
                    if (C50720o.this.f127384x != C50720o.this.f127383w) {
                        float f = 30000.0f / ((float) (C50720o.this.f127383w - C50720o.this.f127384x));
                        if (C50629aj.f126910b) {
                            StringBuilder sb4 = new StringBuilder("Render FPS = ");
                            sb4.append(f);
                            C50792y.m109909a("VEEditor", sb4.toString());
                        }
                        C50720o.this.f127384x = C50720o.this.f127383w;
                        C50720o.this.f127382v = 0;
                        if (C50720o.this.mo99391n() == C50747h.STARTED) {
                            C20114g.m49644a(2, "te_edit_playback_fps", (double) f);
                        }
                    }
                }
                return 0;
            }
        };
        this.f127336aS = new C20120c() {
            /* renamed from: a */
            public final void mo42277a() {
                if (C50720o.this.f127368h != null) {
                    C50720o.this.f127368h.mo98573a();
                }
            }
        };
        this.f127337aT = new C20118a() {
            /* renamed from: a */
            public final int mo42275a(byte[] bArr, int i, int i2, boolean z) {
                if (bArr == null || i < 0 || i2 <= 0) {
                    return -1;
                }
                if (C50720o.this.f127300I == null) {
                    return -2;
                }
                C50720o.this.f127300I.mo91547a(bArr, i, i2, z);
                return 0;
            }
        };
        this.f127338aU = new C20119b() {
            /* renamed from: a */
            public final int mo42276a(byte[] bArr, int i, int i2, int i3, float f) {
                if (C50720o.this.f127301J == null) {
                    return -100;
                }
                if (bArr != null || C50720o.this.f127363c == null) {
                    return C50720o.this.f127301J.mo86779a(bArr, i, i2, i3, f);
                }
                Message message = new Message();
                message.what = 4117;
                C50720o.this.f127363c.sendMessage(message);
                return 0;
            }
        };
        if (!TextUtils.isEmpty(str)) {
            C50792y.m109909a("VEEditor", "VEEditor surfaceView");
            this.f127379s = TEInterface.createEngine();
            this.f127318a = new C50765b(str);
            this.f127310S = new C50774g();
            this.f127347al = surfaceView;
            surfaceView.getHolder().addCallback(this.f127334aQ);
            this.f127379s.setOpenGLListeners(this.f127335aR);
            this.f127379s.setInfoListener(this.f127340ae);
            this.f127379s.setErrorListener(this.f127341af);
            mo99355c(false);
            return;
        }
        StringBuilder sb = new StringBuilder("workspace is: ");
        sb.append(str);
        throw new C50751p(-100, sb.toString());
    }

    /* renamed from: b */
    public final int mo99341b(int i, int i2, int i3) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerTime... index: ");
            sb.append(i);
            sb.append("startTime: ");
            sb.append(i2);
            sb.append("endTime: ");
            sb.append(i3);
            C50792y.m109909a(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            C20116a aVar = (C20116a) this.f127302K.f55323b.get(Integer.valueOf(i));
            if (aVar != null) {
                aVar.f55326b = i2;
                aVar.f55327c = i3 - i2;
            }
            int filterParam = this.f127379s.setFilterParam(i, "entity start time", String.valueOf(i2)) + this.f127379s.setFilterParam(i, "entity end time", String.valueOf(i3));
            return filterParam;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:31|(2:33|(1:35))|36|37|38|39|40|41) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00fc */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m109671a(java.lang.String r5, float r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r7 = r4.f127357av     // Catch:{ all -> 0x0102 }
            if (r7 >= 0) goto L_0x0009
            r5 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            return r5
        L_0x0009:
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x00fe
            if (r5 != 0) goto L_0x0012
            goto L_0x00fe
        L_0x0012:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x001a:
            com.ss.android.ttve.model.d r0 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            if (r0 != 0) goto L_0x0025
            com.ss.android.ttve.model.d r0 = new com.ss.android.ttve.model.d     // Catch:{ all -> 0x0102 }
            r0.<init>()     // Catch:{ all -> 0x0102 }
            r4.f127319aA = r0     // Catch:{ all -> 0x0102 }
        L_0x0025:
            r0 = 0
            if (r8 != 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = r8.f55256a     // Catch:{ all -> 0x0102 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0102 }
            if (r8 == 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = r8.f55257b     // Catch:{ all -> 0x0102 }
            int r8 = r8.length()     // Catch:{ all -> 0x0102 }
            if (r8 != 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            float r8 = r8.f55259d     // Catch:{ all -> 0x0102 }
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            float r8 = r8.f55258c     // Catch:{ all -> 0x0102 }
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            boolean r8 = r8.f55261f     // Catch:{ all -> 0x0102 }
            if (r8 != 0) goto L_0x0054
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            return r0
        L_0x0054:
            com.ss.android.ttve.model.d r8 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            r8.f55256a = r5     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r8 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = ""
            r8.f55257b = r1     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r8 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            r8.f55258c = r7     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r7 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            r7.f55259d = r6     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r7 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            r7.f55260e = r6     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r7 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            r7.f55261f = r0     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r7 = r4.f127319aA     // Catch:{ all -> 0x0102 }
            r7.f55262g = r0     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f127379s     // Catch:{ all -> 0x0102 }
            int r8 = r4.f127357av     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "left filter"
            r7.setFilterParam(r8, r1, r5)     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f127379s     // Catch:{ all -> 0x0102 }
            int r8 = r4.f127357av     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "use filter res intensity"
            java.lang.String r2 = "false"
            r7.setFilterParam(r8, r1, r2)     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f127379s     // Catch:{ all -> 0x0102 }
            int r8 = r4.f127357av     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "left filter intensity"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r2.<init>()     // Catch:{ all -> 0x0102 }
            r2.append(r6)     // Catch:{ all -> 0x0102 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0102 }
            r7.setFilterParam(r8, r1, r2)     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f127379s     // Catch:{ all -> 0x0102 }
            int r8 = r4.f127357av     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "right filter"
            java.lang.String r2 = ""
            r7.setFilterParam(r8, r1, r2)     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f127379s     // Catch:{ all -> 0x0102 }
            int r8 = r4.f127357av     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "filter position"
            java.lang.String r2 = "1.0"
            r7.setFilterParam(r8, r1, r2)     // Catch:{ all -> 0x0102 }
            com.ss.android.vesdk.d.a r7 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x0102 }
            r7.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0102 }
            r2 = 1
            if (r1 != 0) goto L_0x00cc
            java.lang.String r1 = java.io.File.separator     // Catch:{ all -> 0x0102 }
            java.lang.String[] r1 = r5.split(r1)     // Catch:{ all -> 0x0102 }
            int r3 = r1.length     // Catch:{ all -> 0x0102 }
            if (r3 <= 0) goto L_0x00cc
            int r8 = r1.length     // Catch:{ all -> 0x0102 }
            int r8 = r8 - r2
            r8 = r1[r8]     // Catch:{ all -> 0x0102 }
        L_0x00cc:
            java.lang.String r1 = "iesve_veeditor_set_filter_click_filter_id"
            r7.mo99062a(r1, r8)     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = "iesve_veeditor_set_filter_click"
            com.p683ss.android.ttve.monitor.C20110e.m49637a(r8, r2, r7)     // Catch:{ all -> 0x0102 }
            java.lang.String r7 = "te_composition_filter_id"
            com.p683ss.android.ttve.monitor.C20114g.m49646a(r2, r7, r5)     // Catch:{ all -> 0x0102 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fc }
            r7.<init>()     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r8 = "filterPath"
            r7.put(r8, r5)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r5 = "intensity"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ JSONException -> 0x00fc }
            r7.put(r5, r6)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r5 = "tag"
            java.lang.String r6 = "setColorFilter"
            r7.put(r5, r6)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r5 = "vesdk_event_editor_color_filter"
            java.lang.String r6 = "behavior"
            com.p683ss.android.ttve.monitor.C20102a.m49612a(r5, r7, r6)     // Catch:{ JSONException -> 0x00fc }
        L_0x00fc:
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            return r0
        L_0x00fe:
            r5 = -100
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            return r5
        L_0x0102:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.m109671a(java.lang.String, float, boolean, boolean):int");
    }

    /* renamed from: a */
    private int m109670a(int i, String str, int i2, int i3, String str2) {
        StringBuilder sb = new StringBuilder("enableFilterEffectWithTag... ");
        sb.append(i);
        sb.append(" ");
        C50792y.m109913c("VEEditor", sb.toString());
        if (i < 0 || i > this.f127379s.getDuration() || TextUtils.isEmpty(str)) {
            return -100;
        }
        m109694z();
        int duration = this.f127379s.getDuration();
        int[] addFilters = this.f127379s.addFilters(new int[]{0}, new String[]{"video effect"}, new int[]{i}, new int[]{duration}, new int[]{0}, new int[]{8});
        this.f127379s.setFilterParam(addFilters[0], "effect res path", str);
        this.f127379s.setFilterParam(addFilters[0], "effect sticker tag", str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i2);
        this.f127379s.setFilterParam(addFilters[0], "effect sticker id", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i3);
        this.f127379s.setFilterParam(addFilters[0], "effect req id", sb3.toString());
        C50660a aVar = new C50660a();
        String str3 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        }
        aVar.mo99062a("iesve_veeditor_filter_effect_id", str3);
        C20110e.m49637a("iesve_veeditor_filter_effect", 1, aVar);
        C20116a aVar2 = new C20116a();
        aVar2.f55325a = str;
        aVar2.f55326b = i;
        this.f127302K.mo42271a(0, addFilters[0], aVar2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("seqIn", i);
            jSONObject.put("stickerId", str3);
            jSONObject.put("effectTag", str2);
            jSONObject.put("filterIndex", addFilters[0]);
            C20102a.m49612a("vesdk_event_editor_filter_effect", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return addFilters[0];
    }

    /* renamed from: a */
    public final int mo99278a(int i, int i2, int i3, int i4, int i5, boolean z) {
        return m109668a(i, i2, i3, i4, i5, z, false);
    }

    /* renamed from: b */
    public final int mo99342b(int i, int i2, int i3, int i4, int i5, boolean z) {
        synchronized (this) {
            C50792y.m109911b("VEEditor", "setSrtAudioInfo");
            if (i < 0) {
                return -100;
            }
            return this.f127379s.setFilterParam(i, "entity srt audio index", String.valueOf(i2)) + this.f127379s.setFilterParam(i, "entity srt audio seqIn", String.valueOf(i3)) + this.f127379s.setFilterParam(i, "entity srt audio trimIn", String.valueOf(i4)) + this.f127379s.setFilterParam(i, "entity srt audio trimOut", String.valueOf(i5)) + this.f127379s.setFilterParam(i, "entity srt audio cycle", String.valueOf(z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        return -100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return -100;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m109668a(int r11, int r12, int r13, int r14, int r15, boolean r16, boolean r17) {
        /*
            r10 = this;
            r1 = r10
            r0 = r11
            r6 = r12
            r4 = r14
            monitor-enter(r10)
            java.lang.String r2 = "VEEditor"
            java.lang.String r3 = "updateAudioTrack..."
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r3)     // Catch:{ all -> 0x0038 }
            r2 = -100
            if (r0 >= 0) goto L_0x0012
            monitor-exit(r10)     // Catch:{ all -> 0x0038 }
            return r2
        L_0x0012:
            r7 = r13
            if (r7 <= r6) goto L_0x0036
            if (r6 >= 0) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            r5 = r15
            if (r5 <= r4) goto L_0x0034
            if (r4 >= 0) goto L_0x001e
            goto L_0x0034
        L_0x001e:
            com.ss.android.ttve.common.k r2 = r1.f127312U     // Catch:{ all -> 0x0038 }
            r3 = 1
            int r3 = r2.mo42187b(r3, r11)     // Catch:{ all -> 0x0038 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x0038 }
            r9 = 0
            r4 = r14
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r16
            int r0 = r2.updateAudioTrack(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0038 }
            monitor-exit(r10)     // Catch:{ all -> 0x0038 }
            return r0
        L_0x0034:
            monitor-exit(r10)     // Catch:{ all -> 0x0038 }
            return r2
        L_0x0036:
            monitor-exit(r10)     // Catch:{ all -> 0x0038 }
            return r2
        L_0x0038:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.m109668a(int, int, int, int, int, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        return r5;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m109687b(java.lang.String r5, java.lang.String[] r6, java.lang.String[] r7, java.lang.String r8, int r9, int r10, boolean r11) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "reinitMV..."
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)     // Catch:{ all -> 0x0089 }
            if (r5 == 0) goto L_0x007e
            if (r6 == 0) goto L_0x007e
            if (r7 != 0) goto L_0x000f
            goto L_0x007e
        L_0x000f:
            com.ss.android.vesdk.o$d r0 = com.p683ss.android.vesdk.C50720o.C50743d.EDITOR_SEEK_FLAG_LastSeek     // Catch:{ all -> 0x0089 }
            r1 = 0
            r4.mo99290a(r1, r0)     // Catch:{ all -> 0x0089 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r4.f127379s     // Catch:{ all -> 0x0089 }
            int r0 = r0.stop()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0033
            java.lang.String r5 = "VEEditor"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r7 = "stop in reinitMV failed, ret = "
            r6.<init>(r7)     // Catch:{ all -> 0x0089 }
            r6.append(r0)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0089 }
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r6)     // Catch:{ all -> 0x0089 }
            r5 = -1
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return r5
        L_0x0033:
            r4.f127375o = r1     // Catch:{ all -> 0x0089 }
            r0 = 2
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0089 }
            int r2 = r4.f127357av     // Catch:{ all -> 0x0089 }
            r0[r1] = r2     // Catch:{ all -> 0x0089 }
            int r2 = r4.f127361az     // Catch:{ all -> 0x0089 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x0089 }
            r4.mo99348b(r0)     // Catch:{ all -> 0x0089 }
            int r5 = r4.m109674a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0089 }
            if (r5 == 0) goto L_0x005f
            java.lang.String r6 = "VEEditor"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r8 = "init2 in reinitMV failed, ret = "
            r7.<init>(r8)     // Catch:{ all -> 0x0089 }
            r7.append(r5)     // Catch:{ all -> 0x0089 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0089 }
            com.p683ss.android.vesdk.C50792y.m109914d(r6, r7)     // Catch:{ all -> 0x0089 }
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return r5
        L_0x005f:
            com.ss.android.ttve.nativePort.TEInterface r5 = r4.f127379s     // Catch:{ all -> 0x0089 }
            r5.createTimeline()     // Catch:{ all -> 0x0089 }
            com.ss.android.ttve.nativePort.TEInterface r5 = r4.f127379s     // Catch:{ all -> 0x0089 }
            int r5 = r5.prepareEngine(r1)     // Catch:{ all -> 0x0089 }
            com.ss.android.ttve.nativePort.TEInterface r6 = r4.f127379s     // Catch:{ all -> 0x0089 }
            r6.updateTrackFilter(r1, r1, r1)     // Catch:{ all -> 0x0089 }
            com.ss.android.ttve.model.d r6 = r4.f127319aA     // Catch:{ all -> 0x0089 }
            if (r6 == 0) goto L_0x007c
            com.ss.android.ttve.model.d r6 = r4.f127319aA     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r6.f55256a     // Catch:{ all -> 0x0089 }
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.m109671a(r6, r7, r1, r3)     // Catch:{ all -> 0x0089 }
        L_0x007c:
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return r5
        L_0x007e:
            java.lang.String r5 = "VEEditor"
            java.lang.String r6 = "reinitMV bad input file, please call init2 first"
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r6)     // Catch:{ all -> 0x0089 }
            r5 = -205(0xffffffffffffff33, float:NaN)
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return r5
        L_0x0089:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.m109687b(java.lang.String, java.lang.String[], java.lang.String[], java.lang.String, int, int, boolean):int");
    }

    /* renamed from: a */
    private int m109674a(String str, String[] strArr, String[] strArr2, String str2, int i, int i2, boolean z) {
        boolean z2;
        String str3 = str;
        C20114g.m49661d(1);
        C20114g.m49660c(1);
        this.f127384x = System.currentTimeMillis();
        this.f127385y = System.currentTimeMillis();
        C50792y.m109909a("VEEditor", "initMVInternal...");
        this.f127379s.setmMVInitedCallback(this.f127336aS);
        this.f127316Y = str3;
        this.f127314W = strArr;
        this.f127315X = strArr2;
        TEInterface tEInterface = this.f127379s;
        if (this.f127347al != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f127321aC = (MVInfoBean) tEInterface.initMVResources(str, strArr, strArr2, str2, i, i2, z2, z);
        if (this.f127321aC == null) {
            C50792y.m109914d("VEEditor", "initMVInternal failed");
            return -1;
        }
        f127288aD = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List a = m109679a(this.f127321aC, (List<String>) arrayList, (List<String>) arrayList2);
        if (a.size() != 0) {
            List<List> list = (List) a.get(0);
            if (list.size() != 0) {
                int size = ((List) list.get(0)).size();
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                int[] iArr3 = new int[size];
                int[] iArr4 = new int[size];
                String[] strArr3 = new String[size];
                int[] iArr5 = new int[size];
                int[] iArr6 = iArr4;
                m109682a((List) list.get(0), iArr, iArr2, iArr3, iArr6, strArr3, iArr5);
                List<List> list2 = (List) a.get(1);
                C50749j jVar = C50749j.VIDEO_OUT_RATIO_ORIGINAL;
                float f = ((((float) this.f127321aC.width) * 1.0f) / ((float) this.f127321aC.height)) * 1.0f;
                if (f == 1.0f) {
                    jVar = C50749j.VIDEO_OUT_RATIO_1_1;
                } else if (f == 0.75f) {
                    jVar = C50749j.VIDEO_OUT_RATIO_3_4;
                } else if (f == 1.3333334f) {
                    jVar = C50749j.VIDEO_OUT_RATIO_4_3;
                } else if (f == 1.7777778f) {
                    jVar = C50749j.VIDEO_OUT_RATIO_16_9;
                } else if (f == 0.5625f) {
                    jVar = C50749j.VIDEO_OUT_RATIO_9_16;
                }
                C50749j jVar2 = jVar;
                int createScene2 = this.f127379s.createScene2(strArr3, iArr, iArr2, iArr3, iArr6, null, null, null, null, null, iArr5, null, null, null, jVar2.ordinal());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mvPath", str3);
                    jSONObject.put("resourcesFilePaths", Arrays.toString(strArr));
                    jSONObject.put("resourcesTypes", Arrays.toString(strArr2));
                    jSONObject.put("bgmPath", str2);
                    jSONObject.put("bgmTrimIn", i);
                    jSONObject.put("bgmTrimOut", i2);
                    jSONObject.put("resultCode", createScene2);
                    C20102a.m49612a("vesdk_event_editor_init_mv", jSONObject, "behavior");
                } catch (JSONException unused) {
                }
                if (createScene2 != 0) {
                    StringBuilder sb = new StringBuilder("Create Scene failed, ret = ");
                    sb.append(createScene2);
                    C50792y.m109914d("VEEditor", sb.toString());
                    mo99349b();
                    this.f127354as = false;
                    return createScene2;
                }
                this.f127379s.getDuration();
                boolean z3 = true;
                for (List list3 : list) {
                    if (z3) {
                        z3 = false;
                    } else {
                        int size2 = list3.size();
                        int[] iArr7 = new int[size2];
                        int[] iArr8 = new int[size2];
                        int[] iArr9 = new int[size2];
                        int[] iArr10 = new int[size2];
                        String[] strArr4 = new String[size2];
                        int[] iArr11 = new int[size2];
                        m109682a(list3, iArr7, iArr8, iArr9, iArr10, strArr4, iArr11);
                        this.f127379s.addVideoTrackForMV(strArr4, null, iArr9, iArr10, iArr7, iArr8, iArr11);
                    }
                }
                for (List list4 : list2) {
                    if (list4.size() != 0) {
                        int i3 = (int) ((MVResourceBean) list4.get(0)).trimIn;
                        int i4 = (int) ((MVResourceBean) list4.get(0)).trimOut;
                        int i5 = (int) ((MVResourceBean) list4.get(0)).seqIn;
                        int i6 = (int) ((MVResourceBean) list4.get(0)).seqOut;
                        String str4 = ((MVResourceBean) list4.get(0)).content;
                        int i7 = ((MVResourceBean) list4.get(0)).rid;
                        int addAudioTrackForMV = this.f127379s.addAudioTrackForMV(str4, i5, i6, i3, i4, i7, true);
                        if (i7 == this.f127375o) {
                            this.f127376p = addAudioTrackForMV;
                        }
                    }
                }
                this.f127354as = true;
                this.f127355at = false;
                this.f127351ap = jVar2;
                this.f127318a.f127512c = new String[arrayList2.size()];
                this.f127318a.f127511b = new String[arrayList2.size()];
                arrayList2.toArray(this.f127318a.f127512c);
                arrayList.toArray(this.f127318a.f127511b);
                this.f127318a.f127513d = null;
                this.f127358aw = -1;
                this.f127344ai = Boolean.valueOf(false);
                this.f127318a.f127519j = 0;
                this.f127318a.f127518i = 0;
                this.f127346ak = 0;
                this.f127379s.setWidthHeight(this.f127321aC.width, this.f127321aC.height);
                long currentTimeMillis = System.currentTimeMillis() - this.f127384x;
                StringBuilder sb2 = new StringBuilder("initMVInternal success with cost:");
                sb2.append(currentTimeMillis);
                C50792y.m109913c("VEEditor", sb2.toString());
                return m109666G();
            }
            throw new C50751p(-1, "没有MV视频信息");
        }
        throw new C50751p(-1, "没有MV信息");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        return -100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f2, code lost:
        return -100;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m109672a(java.lang.String r16, java.lang.String r17, int r18, int r19, int r20, int r21, boolean r22, boolean r23) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            monitor-enter(r15)
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "addAudioTrack... "
            r3.<init>(r4)     // Catch:{ all -> 0x00f3 }
            r3.append(r0)     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = " In "
            r3.append(r4)     // Catch:{ all -> 0x00f3 }
            r3.append(r11)     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = " Out "
            r3.append(r4)     // Catch:{ all -> 0x00f3 }
            r3.append(r12)     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = " SeqIn "
            r3.append(r4)     // Catch:{ all -> 0x00f3 }
            r3.append(r13)     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = " seqOut "
            r3.append(r4)     // Catch:{ all -> 0x00f3 }
            r3.append(r14)     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x00f3 }
            r9 = r22
            r3.append(r9)     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f3 }
            com.p683ss.android.vesdk.C50792y.m109913c(r2, r3)     // Catch:{ all -> 0x00f3 }
            boolean r2 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x00f3 }
            r3 = -100
            if (r2 == 0) goto L_0x0053
            monitor-exit(r15)     // Catch:{ all -> 0x00f3 }
            return r3
        L_0x0053:
            if (r12 <= r11) goto L_0x00f1
            if (r11 >= 0) goto L_0x0059
            goto L_0x00f1
        L_0x0059:
            if (r14 <= r13) goto L_0x00ef
            if (r13 >= 0) goto L_0x005f
            goto L_0x00ef
        L_0x005f:
            if (r23 == 0) goto L_0x0066
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x00f3 }
            r2.stop()     // Catch:{ all -> 0x00f3 }
        L_0x0066:
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f127379s     // Catch:{ all -> 0x00f3 }
            r4 = 0
            r3 = r16
            r5 = r20
            r6 = r21
            r7 = r18
            r8 = r19
            r9 = r22
            r10 = r23
            int r2 = r2.addAudioTrack(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.common.k r3 = r1.f127312U     // Catch:{ all -> 0x00f3 }
            r4 = 1
            int r2 = r3.mo42185a(r4, r2)     // Catch:{ all -> 0x00f3 }
            r3 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b2 }
            r5.<init>()     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r6 = "path"
            r5.put(r6, r0)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r0 = "sequenceIn"
            r5.put(r0, r13)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r0 = "sequenceOut"
            r5.put(r0, r14)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r0 = "trimIn"
            r5.put(r0, r11)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r0 = "trimOut"
            r5.put(r0, r12)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r0 = "resultCode"
            if (r2 < 0) goto L_0x00a7
            r6 = 0
            goto L_0x00a8
        L_0x00a7:
            r6 = r2
        L_0x00a8:
            r5.put(r0, r6)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r0 = "vesdk_event_editor_audio_track"
            java.lang.String r6 = "behavior"
            com.p683ss.android.ttve.monitor.C20102a.m49612a(r0, r5, r6)     // Catch:{ JSONException -> 0x00b2 }
        L_0x00b2:
            if (r23 == 0) goto L_0x00da
            com.ss.android.ttve.nativePort.TEInterface r0 = r1.f127379s     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.nativePort.TEInterface r5 = r1.f127379s     // Catch:{ all -> 0x00f3 }
            int r5 = r5.getDuration()     // Catch:{ all -> 0x00f3 }
            r0.setTimeRange(r3, r5, r4)     // Catch:{ all -> 0x00f3 }
            int r0 = r15.m109693x(r3)     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00da
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "addAudioTrack Prepare Engine failed, ret = "
            r3.<init>(r4)     // Catch:{ all -> 0x00f3 }
            r3.append(r0)     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f3 }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r3)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r15)     // Catch:{ all -> 0x00f3 }
            return r0
        L_0x00da:
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "addAudioTrack... "
            r3.<init>(r4)     // Catch:{ all -> 0x00f3 }
            r3.append(r2)     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f3 }
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r3)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r15)     // Catch:{ all -> 0x00f3 }
            return r2
        L_0x00ef:
            monitor-exit(r15)     // Catch:{ all -> 0x00f3 }
            return r3
        L_0x00f1:
            monitor-exit(r15)     // Catch:{ all -> 0x00f3 }
            return r3
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00f3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.m109672a(java.lang.String, java.lang.String, int, int, int, int, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2 = r27;
        r1 = new com.p683ss.android.vesdk.C50720o.C507303();
        r2 = new com.p683ss.android.vesdk.VEVideoEncodeSettings.C50585a(2).mo98701a(r26).mo98705a().getVideoCompileEncodeSetting();
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r2.useHWEncoder == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        com.p683ss.android.vesdk.C50792y.m109913c("VEEditor", "compile use hard encode, not soft encode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r4 = -100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r0 == null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r19.isEmpty() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r3 = new java.io.File(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r3.exists() == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r3.isDirectory() != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append(r0);
        r3.append("/probe/");
        r0 = r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (new java.io.File(r0).exists() != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (com.p683ss.android.vesdk.C50752q.m109850b(r0) != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        com.p683ss.android.vesdk.C50792y.m109913c("VEEditor", "create probeDir failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append(r0);
        r3.append("compile_probe");
        r0 = r3.toString();
        com.p683ss.android.ttve.nativePort.TEVideoUtils.nativeCompileProbe(r18, r0, r20, r21, r22, r24, r2.mSWEncodeSetting.mPreset, r2.mSWEncodeSetting.mCrf, r2.mSWEncodeSetting.mGop, r2.mSWEncodeSetting.mMaxRate, r1);
        r1 = new java.io.File(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        if (r1.exists() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        r3 = new java.lang.StringBuilder("delete file: ");
        r3.append(r0);
        com.p683ss.android.vesdk.C50792y.m109913c("VEEditor", r3.toString());
        r1.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d9, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        r2 = new java.lang.StringBuilder("savepath is not exist, savepath: ");
        r2.append(r0);
        com.p683ss.android.vesdk.C50792y.m109913c("VEEditor", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ef, code lost:
        com.p683ss.android.vesdk.C50792y.m109913c("VEEditor", "savepath is null or savepath is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f8, code lost:
        f127291ac = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m109673a(java.lang.String r18, java.lang.String r19, int r20, int r21, long r22, long r24, java.lang.String r26, com.p683ss.android.vesdk.VEListener.C50545i r27) {
        /*
            r0 = r19
            java.lang.Object r1 = f127290ab
            monitor-enter(r1)
            boolean r2 = f127291ac     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x000c
            r0 = -2
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            return r0
        L_0x000c:
            r2 = 1
            f127291ac = r2     // Catch:{ all -> 0x00fb }
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            com.ss.android.vesdk.o$3 r1 = new com.ss.android.vesdk.o$3
            r2 = r27
            r1.<init>(r2)
            com.ss.android.vesdk.VEVideoEncodeSettings$a r2 = new com.ss.android.vesdk.VEVideoEncodeSettings$a
            r3 = 2
            r2.<init>(r3)
            r3 = r26
            com.ss.android.vesdk.VEVideoEncodeSettings$a r2 = r2.mo98701a(r3)
            com.ss.android.vesdk.VEVideoEncodeSettings r2 = r2.mo98705a()
            com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r2 = r2.getVideoCompileEncodeSetting()
            boolean r3 = r2.useHWEncoder
            r4 = -1
            r17 = 0
            r5 = -100
            if (r3 == 0) goto L_0x003f
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "compile use hard encode, not soft encode"
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r1)
        L_0x003b:
            r4 = -100
            goto L_0x00f8
        L_0x003f:
            if (r0 == 0) goto L_0x00ef
            boolean r3 = r19.isEmpty()
            if (r3 == 0) goto L_0x0049
            goto L_0x00ef
        L_0x0049:
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r5 = r3.exists()
            if (r5 == 0) goto L_0x00db
            boolean r3 = r3.isDirectory()
            if (r3 != 0) goto L_0x005c
            goto L_0x00db
        L_0x005c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "/probe/"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0087
            boolean r3 = com.p683ss.android.vesdk.C50752q.m109850b(r0)
            if (r3 != 0) goto L_0x0087
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "create probeDir failed"
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r1)
            goto L_0x00f8
        L_0x0087:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "compile_probe"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r3 = r2.mSWEncodeSetting
            int r11 = r3.mPreset
            com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r3 = r2.mSWEncodeSetting
            int r12 = r3.mCrf
            com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r3 = r2.mSWEncodeSetting
            int r13 = r3.mGop
            com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r2 = r2.mSWEncodeSetting
            long r14 = r2.mMaxRate
            r3 = r18
            r4 = r0
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r24
            r16 = r1
            com.p683ss.android.ttve.nativePort.TEVideoUtils.nativeCompileProbe(r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r16)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x00d9
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "delete file: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.p683ss.android.vesdk.C50792y.m109913c(r2, r0)
            r1.delete()
        L_0x00d9:
            r4 = 0
            goto L_0x00f8
        L_0x00db:
            java.lang.String r1 = "VEEditor"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "savepath is not exist, savepath: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p683ss.android.vesdk.C50792y.m109913c(r1, r0)
            goto L_0x00f8
        L_0x00ef:
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "savepath is null or savepath is empty"
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r1)
            goto L_0x003b
        L_0x00f8:
            f127291ac = r17
            return r4
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50720o.m109673a(java.lang.String, java.lang.String, int, int, long, long, java.lang.String, com.ss.android.vesdk.VEListener$i):int");
    }
}
