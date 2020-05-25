package com.p683ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.FaceBeautyInvoker.EffectAlgorithmCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.FaceInfoCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextBitmapCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.medialib.camera.C19307k;
import com.p683ss.android.medialib.model.C19350a;
import com.p683ss.android.medialib.model.C19352c;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.model.FaceAttributeInfo;
import com.p683ss.android.medialib.model.FaceDetectInfo;
import com.p683ss.android.medialib.p1180b.C19222a.C19223a;
import com.p683ss.android.medialib.p1180b.C19222a.C19224b;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.medialib.p1181c.C19234c;
import com.p683ss.android.medialib.presenter.C19361d;
import com.p683ss.android.medialib.presenter.C19361d.C19374a;
import com.p683ss.android.medialib.presenter.C19361d.C19375b;
import com.p683ss.android.medialib.presenter.C19378e;
import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ttve.model.VEFrame;
import com.p683ss.android.ttve.model.VEFrame.C20091a;
import com.p683ss.android.ttve.monitor.C20114g;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.vesdk.C50601ah.C50613b;
import com.p683ss.android.vesdk.C50601ah.C50614c;
import com.p683ss.android.vesdk.C50601ah.C50615d;
import com.p683ss.android.vesdk.C50601ah.C50617f;
import com.p683ss.android.vesdk.C50601ah.C50620h;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import com.p683ss.android.vesdk.C50601ah.C50622j;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_TYPE;
import com.p683ss.android.vesdk.VEListener.C50539c;
import com.p683ss.android.vesdk.VEListener.C50542f;
import com.p683ss.android.vesdk.VEListener.C50559w;
import com.p683ss.android.vesdk.VEListener.C50560x;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import com.p683ss.android.vesdk.faceinfo.C50692b;
import com.p683ss.android.vesdk.faceinfo.C50695d;
import com.p683ss.android.vesdk.model.BefTextLayout;
import com.p683ss.android.vesdk.model.BefTextLayoutResult;
import com.p683ss.android.vesdk.p2531a.C50589a;
import com.p683ss.android.vesdk.p2531a.C50590b;
import com.p683ss.android.vesdk.p2532b.C50653a;
import com.p683ss.android.vesdk.p2532b.C50654b;
import com.p683ss.android.vesdk.p2532b.C50654b.C50655a;
import com.p683ss.android.vesdk.p2532b.C50656c;
import com.p683ss.android.vesdk.p2535e.C50688c;
import com.p683ss.android.vesdk.p2535e.C50689d;
import com.p683ss.android.vesdk.runtime.C50771d;
import com.p683ss.android.vesdk.utils.C50787c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.vesdk.e */
public class C50661e extends C50690f implements OnRunningErrorCallback, C19233b, C19234c, C19375b, C50689d, AudioRecorderInterface {

    /* renamed from: a */
    public static final String f127016a = "e";

    /* renamed from: k */
    public static final Object f127017k = new Object();

    /* renamed from: aH */
    private boolean f127018aH;

    /* renamed from: aI */
    private final VESize f127019aI = new VESize(1280, 720);

    /* renamed from: aJ */
    private float f127020aJ = 1.0f;

    /* renamed from: aK */
    private long f127021aK = -1;

    /* renamed from: aL */
    private boolean f127022aL;

    /* renamed from: aM */
    private Surface f127023aM;

    /* renamed from: aN */
    private C50595ad f127024aN;

    /* renamed from: aO */
    private boolean f127025aO = false;

    /* renamed from: aP */
    private final ExecutorService f127026aP = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());

    /* renamed from: aQ */
    private Object f127027aQ = new Object();

    /* renamed from: aR */
    private FaceInfoCallback f127028aR;

    /* renamed from: aS */
    private C50622j f127029aS = null;

    /* renamed from: aT */
    private boolean f127030aT = false;

    /* renamed from: aU */
    private boolean f127031aU = false;

    /* renamed from: aV */
    private boolean f127032aV = false;

    /* renamed from: aW */
    private long f127033aW = 0;

    /* renamed from: aX */
    private C19223a f127034aX = new C19223a() {
        /* renamed from: b */
        public final void mo39608b() {
            C50792y.m109915e(C50661e.f127016a, "onOpenGLDestroy");
            C50661e.this.f127047o.mo39802b();
            C50661e.this.f127048p.mo98729b(C50661e.this.f127049q);
            C50560x xVar = C50661e.this.f127125B;
            if (xVar instanceof C50559w) {
                ((C50559w) xVar).mo43264a(1001, 0, "Render Env Destroyed.");
            }
        }

        /* renamed from: c */
        public final int mo39609c() {
            float f;
            int i;
            if (C50661e.this.f127043j) {
                synchronized (C50661e.f127017k) {
                    if (C50661e.this.f127040g.width > 0 && C50661e.this.f127040g.height > 0) {
                        if (!C50661e.this.f127049q.f127007f) {
                            f = (float) C50661e.this.f127040g.width;
                            i = C50661e.this.f127040g.height;
                        } else {
                            f = (float) C50661e.this.f127040g.height;
                            i = C50661e.this.f127040g.width;
                        }
                        C50661e.this.f127036c.mo40284a(f / ((float) i), C50661e.this.f127040g.width, C50661e.this.f127040g.height);
                    }
                    boolean z = true;
                    if (C50661e.this.f127045m != 1) {
                        z = false;
                    }
                    C50661e.this.f127036c.mo40242a(C50661e.this.f127042i, z);
                    C50661e.this.f127043j = false;
                }
            }
            if (C50661e.this.f127142S == null || C50661e.this.f127142S.f126697s != CAMERA_OUTPUT_MODE.FRAME) {
                try {
                    C50661e.this.f127047o.mo39803c();
                    if (C50661e.this.f127044l) {
                        return -1;
                    }
                    if (C50661e.this.f127047o.f53343b != null) {
                        C50661e.this.f127036c.mo40237a(C50661e.this.f127047o.mo39804d());
                    }
                    return 0;
                } catch (Exception e) {
                    String str = C50661e.f127016a;
                    StringBuilder sb = new StringBuilder("onOpenGLRunning error: ");
                    sb.append(e.getMessage());
                    C50792y.m109914d(str, sb.toString());
                }
            } else {
                if (C50661e.this.f127142S.f126687i == CAMERA_TYPE.TYPE1 && C50661e.this.f127142S.f126702x.getBoolean("forceRunUpdateTexImg", false)) {
                    try {
                        C50661e.this.f127047o.mo39803c();
                    } catch (Exception e2) {
                        String str2 = C50661e.f127016a;
                        StringBuilder sb2 = new StringBuilder("onOpenGLRunning error: ");
                        sb2.append(e2.getMessage());
                        C50792y.m109914d(str2, sb2.toString());
                    }
                }
                if (C50661e.this.f127044l) {
                    return -1;
                }
                return 0;
            }
        }

        /* renamed from: a */
        public final void mo39607a() {
            int i;
            C50792y.m109915e(C50661e.f127016a, "onOpenGLCreate");
            C50661e.this.f127047o.mo39801a();
            C50661e.this.f127036c.mo40243a(C50661e.this.f127047o.f53343b);
            if (C50661e.this.f127142S == null || C50661e.this.f127142S.f126697s == CAMERA_OUTPUT_MODE.SURFACE) {
                C50661e eVar = C50661e.this;
                C50656c cVar = new C50656c(new TEFrameSizei(C50661e.this.f127041h.width, C50661e.this.f127041h.height), C50661e.this.f127056x, true, C50661e.this.f127047o.f53342a, C50661e.this.f127047o.f53343b);
                eVar.f127049q = cVar;
            } else if (C50661e.this.f127142S.f126697s == CAMERA_OUTPUT_MODE.SURFACE_FRAME && C50661e.this.f127142S.f126687i != CAMERA_TYPE.TYPE1) {
                C50661e.this.f127142S.f126697s = CAMERA_OUTPUT_MODE.SURFACE;
                C50661e eVar2 = C50661e.this;
                C50656c cVar2 = new C50656c(new TEFrameSizei(C50661e.this.f127041h.width, C50661e.this.f127041h.height), C50661e.this.f127056x, true, C50661e.this.f127047o.f53342a, C50661e.this.f127047o.f53343b);
                eVar2.f127049q = cVar2;
            } else if (C50661e.this.f127142S.f126697s != CAMERA_OUTPUT_MODE.FRAME || C50661e.this.f127142S.f126687i == CAMERA_TYPE.TYPE1) {
                C50661e eVar3 = C50661e.this;
                TEFrameSizei tEFrameSizei = new TEFrameSizei(C50661e.this.f127041h.width, C50661e.this.f127041h.height);
                C50655a aVar = C50661e.this.f127056x;
                SurfaceTexture surfaceTexture = C50661e.this.f127047o.f53343b;
                if (C50661e.this.f127142S.f126697s == CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                    i = 1;
                } else {
                    i = 0;
                }
                C50653a aVar2 = new C50653a(tEFrameSizei, aVar, true, surfaceTexture, i);
                eVar3.f127049q = aVar2;
                if (C50661e.this.f127142S.f126687i == CAMERA_TYPE.TYPE1) {
                    C50661e.this.f127036c.mo40238a(0);
                } else {
                    C50661e.this.f127036c.mo40238a(1);
                }
            } else {
                C50661e.this.f127142S.f126697s = CAMERA_OUTPUT_MODE.SURFACE;
                C50661e eVar4 = C50661e.this;
                C50656c cVar3 = new C50656c(new TEFrameSizei(C50661e.this.f127041h.width, C50661e.this.f127041h.height), C50661e.this.f127056x, true, C50661e.this.f127047o.f53342a, C50661e.this.f127047o.f53343b);
                eVar4.f127049q = cVar3;
            }
            C50661e.this.f127048p.mo98727a(C50661e.this.f127049q);
            if (C50661e.this.f127039f != null) {
                C50661e.this.f127039f.mo98734a(C50661e.this.f127048p);
                return;
            }
            if (C50661e.this.f127125B != null && (C50661e.this.f127125B instanceof C50559w)) {
                ((C50559w) C50661e.this.f127125B).mo43264a(1000, 0, "Render Env Created.");
            }
        }
    };

    /* renamed from: b */
    final List<C19352c> f127035b = new ArrayList();

    /* renamed from: c */
    public C19361d f127036c;

    /* renamed from: d */
    public String f127037d;

    /* renamed from: e */
    public long f127038e = 0;

    /* renamed from: f */
    public C50589a f127039f;

    /* renamed from: g */
    public VESize f127040g = new VESize(0, 0);

    /* renamed from: h */
    public VESize f127041h = this.f127019aI;

    /* renamed from: i */
    public int f127042i = -1;

    /* renamed from: j */
    public boolean f127043j;

    /* renamed from: l */
    public boolean f127044l;

    /* renamed from: m */
    public int f127045m = 0;

    /* renamed from: n */
    public int f127046n = 0;

    /* renamed from: o */
    public C19307k f127047o = new C19307k();

    /* renamed from: p */
    public C50588a<C50654b> f127048p = new C50588a<>();

    /* renamed from: q */
    public C50654b f127049q;

    /* renamed from: r */
    public List<C50622j> f127050r;

    /* renamed from: s */
    public int f127051s = 3;

    /* renamed from: t */
    public boolean f127052t = false;

    /* renamed from: u */
    public ConditionVariable f127053u = new ConditionVariable();

    /* renamed from: v */
    public LandMarkFrame f127054v = new LandMarkFrame();

    /* renamed from: w */
    public C50631al f127055w = C50631al.m109175a();

    /* renamed from: x */
    C50655a f127056x = new C50655a() {
        /* renamed from: a */
        public final void mo99031a(TEFrameSizei tEFrameSizei) {
            C19361d dVar = C50661e.this.f127036c;
            dVar.f53536i.setCamPreviewSize(tEFrameSizei.f55398a, tEFrameSizei.f55399b);
        }

        public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
            C50792y.m109911b(C50661e.f127016a, "onNewSurfaceTexture...");
            C50661e.this.f127036c.mo40243a(surfaceTexture);
            C50661e.this.f127047o.f53343b = surfaceTexture;
        }

        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v1, types: [byte[]] */
        /* JADX WARNING: type inference failed for: r5v2, types: [byte[]] */
        /* JADX WARNING: type inference failed for: r5v3, types: [com.ss.android.ttvecamera.q] */
        /* JADX WARNING: type inference failed for: r5v6, types: [com.ss.android.ttvecamera.q] */
        /* JADX WARNING: type inference failed for: r5v7, types: [float[]] */
        /* JADX WARNING: type inference failed for: r5v8, types: [float[]] */
        /* JADX WARNING: type inference failed for: r5v11 */
        /* JADX WARNING: type inference failed for: r5v12 */
        /* JADX WARNING: type inference failed for: r5v13 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ttvecamera.q, byte[], float[]]
          uses: [byte[], com.ss.android.ttvecamera.q, float[]]
          mth insns count: 212
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFrameCaptured(com.p683ss.android.ttvecamera.C20232i r18) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VESize r2 = r2.f127040g
                int r2 = r2.width
                com.ss.android.ttvecamera.TEFrameSizei r3 = r18.mo42839b()
                int r3 = r3.f55398a
                if (r2 != r3) goto L_0x0020
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VESize r2 = r2.f127040g
                int r2 = r2.height
                com.ss.android.ttvecamera.TEFrameSizei r3 = r18.mo42839b()
                int r3 = r3.f55399b
                if (r2 == r3) goto L_0x0038
            L_0x0020:
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VESize r2 = r2.f127040g
                com.ss.android.ttvecamera.TEFrameSizei r3 = r18.mo42839b()
                int r3 = r3.f55398a
                r2.width = r3
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VESize r2 = r2.f127040g
                com.ss.android.ttvecamera.TEFrameSizei r3 = r18.mo42839b()
                int r3 = r3.f55399b
                r2.height = r3
            L_0x0038:
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                int r2 = r2.f127045m
                int r3 = r18.mo42840c()
                r4 = 1
                if (r2 != r3) goto L_0x004d
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                int r2 = r2.f127042i
                int r3 = r18.mo42836a()
                if (r2 == r3) goto L_0x0065
            L_0x004d:
                java.lang.Object r2 = com.p683ss.android.vesdk.C50661e.f127017k
                monitor-enter(r2)
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this     // Catch:{ all -> 0x01c2 }
                int r5 = r18.mo42840c()     // Catch:{ all -> 0x01c2 }
                r3.f127045m = r5     // Catch:{ all -> 0x01c2 }
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this     // Catch:{ all -> 0x01c2 }
                int r5 = r18.mo42836a()     // Catch:{ all -> 0x01c2 }
                r3.f127042i = r5     // Catch:{ all -> 0x01c2 }
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this     // Catch:{ all -> 0x01c2 }
                r3.f127043j = r4     // Catch:{ all -> 0x01c2 }
                monitor-exit(r2)     // Catch:{ all -> 0x01c2 }
            L_0x0065:
                com.ss.android.ttvecamera.i$d r2 = r0.f55594d
                com.ss.android.ttvecamera.i$b r2 = r2.f55602d
                com.ss.android.ttvecamera.i$b r3 = com.p683ss.android.ttvecamera.C20232i.C20235b.PIXEL_FORMAT_OpenGL_OES
                r5 = 0
                if (r2 != r3) goto L_0x00ec
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.al r2 = r2.f127055w
                boolean r2 = r2.f126927i
                r3 = 0
                if (r2 == 0) goto L_0x00c5
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.LandMarkFrame r6 = r2.f127054v
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.al r2 = r2.f127055w
                float r7 = r2.f126919a
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.al r2 = r2.f127055w
                float r8 = r2.f126920b
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.al r2 = r2.f127055w
                float r9 = r2.f126921c
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.al r2 = r2.f127055w
                double r10 = r2.f126922d
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.al r2 = r2.f127055w
                double r12 = r2.f126923e
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.al r2 = r2.f127055w
                float r14 = r2.f126924f
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.al r2 = r2.f127055w
                float[] r15 = r2.f126925g
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.al r2 = r2.f127055w
                float[] r2 = r2.f126926h
                r16 = r2
                r6.setInfo(r7, r8, r9, r10, r12, r14, r15, r16)
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r2 = r2.f127036c
                r2.mo40413v(r4)
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r2 = r2.f127036c
                com.ss.android.vesdk.e r4 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.LandMarkFrame r4 = r4.f127054v
                com.ss.android.medialib.FaceBeautyInvoker r2 = r2.f53536i
                r2.setLandMarkInfo(r4)
                goto L_0x00cc
            L_0x00c5:
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r2 = r2.f127036c
                r2.mo40413v(r3)
            L_0x00cc:
                com.ss.android.vesdk.e r2 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r2 = r2.f127036c
                com.ss.android.ttvecamera.i$d r4 = r0.f55594d
                boolean r4 = r4 instanceof com.p683ss.android.ttvecamera.C20232i.C20236c
                if (r4 == 0) goto L_0x00dc
                com.ss.android.ttvecamera.i$d r3 = r0.f55594d
                com.ss.android.ttvecamera.i$c r3 = (com.p683ss.android.ttvecamera.C20232i.C20236c) r3
                int r3 = r3.f55599a
            L_0x00dc:
                com.ss.android.ttvecamera.i$d r4 = r0.f55594d
                boolean r4 = r4 instanceof com.p683ss.android.ttvecamera.C20232i.C20236c
                if (r4 == 0) goto L_0x00e8
                com.ss.android.ttvecamera.i$d r0 = r0.f55594d
                com.ss.android.ttvecamera.i$c r0 = (com.p683ss.android.ttvecamera.C20232i.C20236c) r0
                float[] r5 = r0.f55600b
            L_0x00e8:
                r2.mo40239a(r3, r5)
                return
            L_0x00ec:
                com.ss.android.ttvecamera.i$d r3 = r0.f55594d
                int r3 = r3.f55603e
                r6 = 3
                r7 = 1000(0x3e8, double:4.94E-321)
                if (r3 != r6) goto L_0x0153
                com.ss.android.medialib.camera.ImageFrame r2 = new com.ss.android.medialib.camera.ImageFrame
                com.ss.android.ttvecamera.i$d r3 = r0.f55594d
                boolean r3 = r3 instanceof com.p683ss.android.ttvecamera.C20232i.C20238e
                if (r3 == 0) goto L_0x0103
                com.ss.android.ttvecamera.i$d r3 = r0.f55594d
                com.ss.android.ttvecamera.i$e r3 = (com.p683ss.android.ttvecamera.C20232i.C20238e) r3
                com.ss.android.ttvecamera.q r5 = r3.f55607a
            L_0x0103:
                com.ss.android.medialib.camera.j r3 = com.p683ss.android.vesdk.utils.TEPlanUtils.convert(r5)
                r4 = -2
                com.ss.android.ttvecamera.TEFrameSizei r5 = r18.mo42839b()
                int r5 = r5.f55398a
                com.ss.android.ttvecamera.TEFrameSizei r6 = r18.mo42839b()
                int r6 = r6.f55399b
                r2.<init>(r3, r4, r5, r6)
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VECameraSettings r3 = r3.f127142S
                if (r3 == 0) goto L_0x0140
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VECameraSettings r3 = r3.f127142S
                com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r3 = r3.f126697s
                com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r4 = com.p683ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE.FRAME
                if (r3 != r4) goto L_0x0128
                goto L_0x0140
            L_0x0128:
                com.ss.android.vesdk.e r0 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VECameraSettings r0 = r0.f127142S
                com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r0 = r0.f126697s
                com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r3 = com.p683ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME
                if (r0 != r3) goto L_0x013f
                com.ss.android.vesdk.e r0 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r0 = r0.f127036c
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.camera.k r3 = r3.f127047o
                int r3 = r3.f53342a
                r0.mo40241a(r2, r3)
            L_0x013f:
                return
            L_0x0140:
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r3 = r3.f127036c
                long r4 = r0.f55593c
                long r4 = r4 / r7
                double r4 = (double) r4
                r3.mo40237a(r4)
                com.ss.android.vesdk.e r0 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r0 = r0.f127036c
                r0.mo40240a(r2)
                goto L_0x01c1
            L_0x0153:
                com.ss.android.ttvecamera.i$b r3 = com.p683ss.android.ttvecamera.C20232i.C20235b.PIXEL_FORMAT_NV21
                if (r2 == r3) goto L_0x0164
                com.ss.android.ttvecamera.i$b r3 = com.p683ss.android.ttvecamera.C20232i.C20235b.PIXEL_FORMAT_JPEG
                if (r2 != r3) goto L_0x015c
                goto L_0x0164
            L_0x015c:
                java.lang.String r0 = com.p683ss.android.vesdk.C50661e.f127016a
                java.lang.String r2 = "Not support now!!"
                com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)
                goto L_0x01c1
            L_0x0164:
                com.ss.android.ttvecamera.i$b r3 = com.p683ss.android.ttvecamera.C20232i.C20235b.PIXEL_FORMAT_NV21
                if (r2 != r3) goto L_0x0169
                r4 = -3
            L_0x0169:
                com.ss.android.medialib.camera.ImageFrame r2 = new com.ss.android.medialib.camera.ImageFrame
                com.ss.android.ttvecamera.i$d r3 = r0.f55594d
                boolean r3 = r3 instanceof com.p683ss.android.ttvecamera.C20232i.C20234a
                if (r3 == 0) goto L_0x0177
                com.ss.android.ttvecamera.i$d r3 = r0.f55594d
                com.ss.android.ttvecamera.i$a r3 = (com.p683ss.android.ttvecamera.C20232i.C20234a) r3
                byte[] r5 = r3.f55597b
            L_0x0177:
                com.ss.android.ttvecamera.TEFrameSizei r3 = r18.mo42839b()
                int r3 = r3.f55398a
                com.ss.android.ttvecamera.TEFrameSizei r6 = r18.mo42839b()
                int r6 = r6.f55399b
                r2.<init>(r5, r4, r3, r6)
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VECameraSettings r3 = r3.f127142S
                if (r3 == 0) goto L_0x01af
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VECameraSettings r3 = r3.f127142S
                com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r3 = r3.f126697s
                com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r4 = com.p683ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE.FRAME
                if (r3 != r4) goto L_0x0197
                goto L_0x01af
            L_0x0197:
                com.ss.android.vesdk.e r0 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.vesdk.VECameraSettings r0 = r0.f127142S
                com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r0 = r0.f126697s
                com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r3 = com.p683ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME
                if (r0 != r3) goto L_0x01ae
                com.ss.android.vesdk.e r0 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r0 = r0.f127036c
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.camera.k r3 = r3.f127047o
                int r3 = r3.f53342a
                r0.mo40241a(r2, r3)
            L_0x01ae:
                return
            L_0x01af:
                com.ss.android.vesdk.e r3 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r3 = r3.f127036c
                long r4 = r0.f55593c
                long r4 = r4 / r7
                double r4 = (double) r4
                r3.mo40237a(r4)
                com.ss.android.vesdk.e r0 = com.p683ss.android.vesdk.C50661e.this
                com.ss.android.medialib.presenter.d r0 = r0.f127036c
                r0.mo40240a(r2)
            L_0x01c1:
                return
            L_0x01c2:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x01c2 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.C50661e.C5066310.onFrameCaptured(com.ss.android.ttvecamera.i):void");
        }
    };

    /* renamed from: e */
    public final int mo99076e() {
        return this.f127046n;
    }

    public void lackPermission() {
    }

    public void recordStatus(boolean z) {
    }

    /* renamed from: a */
    public final int mo99066a(C50771d dVar) {
        if (this.f127046n == 0 || this.f127046n == 1) {
            super.mo99066a(dVar);
            this.f127035b.clear();
            this.f127038e = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.mo43564a());
            sb.append(File.separator);
            this.f127037d = sb.toString();
            if (this.f127046n == 1) {
                mo99082u();
                int w = m109329w();
                if (w != 0) {
                    String str = f127016a;
                    StringBuilder sb2 = new StringBuilder("nativeInitFaceBeautyPlay error: ");
                    sb2.append(w);
                    C50792y.m109914d(str, sb2.toString());
                    return -108;
                }
            }
            return 0;
        }
        C50792y.m109914d(f127016a, "调用时机错误");
        return -105;
    }

    /* renamed from: a */
    public final void mo98942a(int i, int i2, int i3, int i4) {
        this.f127036c.mo40332b(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final int[] mo98962a(int i, int i2, int i3, int i4, float f) {
        return this.f127036c.mo40313a(i, i2, i3, i4, f);
    }

    /* renamed from: a */
    public final void mo98937a(final double d) {
        m109328b((Runnable) new Runnable() {
            public final void run() {
                synchronized (C50661e.this) {
                    if (C50661e.this.f127046n == 3) {
                        String str = C50661e.f127016a;
                        StringBuilder sb = new StringBuilder("setVideoBgSpeed could not be executed in state: ");
                        sb.append(C50661e.this.f127046n);
                        C50792y.m109914d(str, sb.toString());
                        return;
                    }
                    C50661e.this.f127036c.mo40329b(d);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo98958a(final String str, final String str2, final String str3) {
        String str4 = f127016a;
        StringBuilder sb = new StringBuilder("setCustomVideoBg: videoPath = ");
        sb.append(str2);
        sb.append(", audioPath = ");
        sb.append(str3);
        sb.append(", mVERecordMode = ");
        sb.append(this.f127149Z);
        C50792y.m109909a(str4, sb.toString());
        if (this.f127149Z == C50600ag.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(str2)) {
            m109328b((Runnable) new Runnable() {
                public final void run() {
                    C50600ag agVar;
                    synchronized (C50661e.this) {
                        C50792y.m109909a(C50661e.f127016a, "setCustomVideoBg: doing... ");
                        if (C50661e.this.f127046n == 3) {
                            String str = C50661e.f127016a;
                            StringBuilder sb = new StringBuilder("setCustomVideoBg could not be executed in recording mode: ");
                            sb.append(C50661e.this.f127046n);
                            C50792y.m109914d(str, sb.toString());
                            return;
                        }
                        C50661e eVar = C50661e.this;
                        if (!TextUtils.isEmpty(str2)) {
                            agVar = C50600ag.CUSTOM_VIDEO_BG;
                        } else {
                            agVar = C50600ag.DEFAULT;
                        }
                        eVar.f127149Z = agVar;
                        C50661e.this.f127036c.mo40289a(C50661e.this.f127183y, str, str2, str3);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo98904a(Surface surface) {
        this.f127023aM = surface;
        this.f127018aH = false;
        if (!this.f127025aO) {
            mo98944a(surface, (C50542f) null);
        }
    }

    /* renamed from: a */
    public final void mo98905a(final Surface surface, int i, int i2, int i3) {
        if ((this.f127184z != null && this.f127184z.f127123f) || this.f127025aO) {
            this.f127026aP.submit(new Runnable() {
                public final void run() {
                    C50661e.this.mo98988d(surface);
                }
            });
            this.f127025aO = false;
        }
    }

    /* renamed from: b */
    public final void mo98906b(Surface surface) {
        mo98948a((C50542f) null);
        this.f127018aH = true;
        this.f127025aO = false;
    }

    /* renamed from: a */
    public final int mo98928a(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j;
        final long j4 = j2;
        final int i2 = i;
        C5067420 r0 = new Runnable() {
            public final void run() {
                synchronized (C50661e.this) {
                    if (C50661e.this.f127046n == 3) {
                        String str = C50661e.f127016a;
                        StringBuilder sb = new StringBuilder("setRecordBGM could not be executed in state: ");
                        sb.append(C50661e.this.f127046n);
                        C50792y.m109914d(str, sb.toString());
                        return;
                    }
                    C50661e.super.mo98928a(str2, j3, j4, i2);
                    C19361d a = C50661e.this.f127036c.mo40279a(str2);
                    boolean z = true;
                    if (C50661e.this.f127160ad != 1) {
                        z = false;
                    }
                    a.mo40280a(z).mo40278a(C50661e.this.f127158ab, C50661e.this.f127038e);
                    C50661e.this.f127036c.mo40319b(C50661e.this.f127183y, C50661e.this.mo99080l(false), (AudioRecorderInterface) C50661e.this);
                }
            }
        };
        m109328b((Runnable) r0);
        return 0;
    }

    /* renamed from: a */
    public final int mo98931a(List<C50632am> list, String str, int i, int i2) {
        int a;
        synchronized (this.f127027aQ) {
            mo98928a(str, (long) i, this.f127159ac, i2);
            this.f127035b.clear();
            this.f127035b.addAll(list);
            this.f127038e = (long) C19352c.m47249a(this.f127035b);
            a = this.f127036c.mo40252a(list.size(), this.f127037d);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo99070a(final List<C50632am> list, String str, int i, int i2, final C50542f fVar) {
        this.f127032aV = true;
        this.f127026aP.submit(new Runnable() {
            public final void run() {
                C50661e.this.f127035b.clear();
                C50661e.this.f127035b.addAll(list);
                C50661e.this.f127038e = (long) C19352c.m47249a(C50661e.this.f127035b);
                int a = C50661e.this.f127036c.mo40252a(list.size(), C50661e.this.f127037d);
                if (fVar != null) {
                    fVar.mo43336a(a);
                }
            }
        });
        mo98928a(str, (long) i, this.f127159ac, i2);
    }

    /* renamed from: a */
    public final void mo98944a(final Surface surface, final C50542f fVar) {
        this.f127032aV = true;
        this.f127026aP.submit(new Runnable() {
            public final void run() {
                int e = C50661e.this.mo99077e(surface);
                if (fVar != null) {
                    fVar.mo43336a(e);
                }
            }
        });
        m109330x();
    }

    /* renamed from: a */
    public final void mo98948a(final C50542f fVar) {
        mo98958a((String) null, (String) null, (String) null);
        m109331y();
        final boolean z = this.f127024aN != null && this.f127024aN.f126861g;
        if (z) {
            this.f127053u.close();
        }
        this.f127026aP.submit(new Runnable() {
            public final void run() {
                C50661e.this.mo99083v();
                if (fVar != null) {
                    fVar.mo43336a(0);
                }
                if (z) {
                    C50661e.this.f127053u.open();
                }
            }
        });
        if (z) {
            this.f127053u.block(2000);
        }
    }

    /* renamed from: a */
    public final void mo98941a(int i, float f, VESize vESize, VESize vESize2) {
        this.f127161ae = i;
        this.f127171ao = true;
        if (vESize2.isValid()) {
            this.f127173aq.width = vESize2.height;
            this.f127173aq.height = vESize2.width;
        }
        if (this.f127142S != null) {
            if (f <= 0.0f) {
                this.f127036c.mo40373g(i);
                if (this.f127172ap.isValid()) {
                    this.f127036c.mo40331b(this.f127172ap.width, this.f127172ap.height);
                    return;
                }
                String str = f127016a;
                StringBuilder sb = new StringBuilder("mVideoOutputSize is not valid: ");
                sb.append(this.f127172ap.toString());
                C50792y.m109914d(str, sb.toString());
                return;
            }
            VESize a = ((C50704j) this.f127039f).mo99220a(f, vESize);
            if (a != null) {
                this.f127041h = a;
            }
        }
    }

    /* renamed from: a */
    public final void mo98940a(final float f, final C50542f fVar) {
        this.f127026aP.submit(new Runnable() {
            public final void run() {
                int a = C50661e.this.mo98912a(f);
                if (fVar != null) {
                    fVar.mo43336a(a);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo98972b(final C50542f fVar) {
        this.f127026aP.submit(new Runnable() {
            public final void run() {
                int k = C50661e.this.mo99008k();
                if (fVar != null) {
                    fVar.mo43336a(k);
                }
            }
        });
    }

    /* renamed from: a */
    public final int mo98929a(String str, String str2, int i, String str3, String str4, int i2) {
        if (this.f127046n == 3) {
            mo99008k();
        }
        if (this.f127046n == 0) {
            return -105;
        }
        return this.f127036c.mo40266a(str, str2, i, str3, str4, this.f127143T.isOptRemuxWithCopy(), i2);
    }

    /* renamed from: a */
    public final void mo99069a(String str, String str2, int i, String str3, String str4, C50542f fVar, int i2) {
        ExecutorService executorService = this.f127026aP;
        final C50542f fVar2 = fVar;
        final String str5 = str;
        final String str6 = str2;
        final int i3 = i;
        final String str7 = str3;
        final String str8 = str4;
        final int i4 = i2;
        C506826 r0 = new Runnable() {
            public final void run() {
                if (C50661e.this.f127046n == 3 || C50661e.this.f127046n == 0) {
                    if (fVar2 != null) {
                        fVar2.mo43336a(-105);
                    }
                    return;
                }
                int a = C50661e.this.f127036c.mo40266a(str5, str6, i3, str7, str8, C50661e.this.f127143T.isOptRemuxWithCopy(), i4);
                if (fVar2 != null) {
                    fVar2.mo43336a(a);
                }
            }
        };
        executorService.submit(r0);
    }

    /* renamed from: a */
    public final void mo98954a(Runnable runnable) {
        C19361d.m47273a(runnable);
    }

    /* renamed from: a */
    public final void mo98949a(C50617f fVar) {
        super.mo98949a(fVar);
        this.f127036c.mo40297a((C19375b) fVar == null ? null : this);
    }

    /* renamed from: a */
    public final void mo98953a(C50636ap apVar) {
        if (apVar.f126947a > -1.0f) {
            this.f127036c.mo40276a(apVar.f126947a);
        }
        this.f127036c.mo40328b(apVar.f126948b);
    }

    /* renamed from: a */
    public final void mo99067a(C50590b bVar) {
        if (bVar != null) {
            VESize j = bVar.mo98736j();
            C50654b bVar2 = null;
            Iterator it = this.f127048p.mo98728b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C50654b bVar3 = (C50654b) it.next();
                if (bVar3.f127006e) {
                    bVar2 = bVar3;
                    break;
                }
            }
            if (!(j == null || bVar2 == null || bVar2.f127004c == null)) {
                bVar2.f127004c.f55398a = j.width;
                bVar2.f127004c.f55399b = j.height;
            }
            bVar.mo98734a(this.f127048p);
        }
    }

    /* renamed from: a */
    public final void mo39624a(int i) {
        C20114g.m49645a(0, "te_record_preview_init_time", System.currentTimeMillis() - this.f127033aW);
        if ((this.f127149Z != C50600ag.REACTION || this.f127148Y == null || this.f127148Y.f126873b == null || this.f127148Y.f126872a == null) ? false : true) {
            int i2 = this.f127143T.getVideoRes().width;
            int i3 = this.f127143T.getVideoRes().height;
            float[] fArr = this.f127148Y.f126874c;
            float f = (float) i3;
            float f2 = (float) i2;
            this.f127036c.mo40332b((int) (fArr[0] * f), (int) (fArr[1] * f), (int) (fArr[2] * f2), (int) (fArr[3] * f2));
            this.f127036c.mo40353d(2, 0);
            float[] fArr2 = this.f127148Y.f126875d;
            this.f127036c.mo40312a(0, 0, (int) (fArr2[2] * f2), (int) (fArr2[3] * f));
        }
        if (i == 0) {
            if (!this.f127024aN.f126859e) {
                mo98917a(this.f127164ah.f55240a, this.f127164ah.f55241b);
                mo98913a(this.f127164ah.f55242c, this.f127164ah.f55243d);
                if (this.f127166aj.f55262g) {
                    if (!TextUtils.isEmpty(this.f127166aj.f55256a) && !TextUtils.isEmpty(this.f127166aj.f55257b)) {
                        mo98957a(this.f127166aj.f55256a, this.f127166aj.f55257b, this.f127166aj.f55258c, this.f127166aj.f55259d, this.f127166aj.f55260e);
                    } else if (!TextUtils.isEmpty(this.f127166aj.f55256a)) {
                        this.f127036c.mo40335b(this.f127166aj.f55256a, this.f127166aj.f55259d);
                    }
                } else if (!TextUtils.isEmpty(this.f127166aj.f55256a) && !TextUtils.isEmpty(this.f127166aj.f55257b)) {
                    mo98956a(this.f127166aj.f55256a, this.f127166aj.f55257b, this.f127166aj.f55258c);
                } else if (!TextUtils.isEmpty(this.f127166aj.f55256a)) {
                    this.f127036c.mo40360e(this.f127166aj.f55256a);
                    if (!this.f127166aj.f55261f) {
                        this.f127036c.mo40380i(this.f127166aj.f55259d);
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
            if (this.f127136M == null) {
                this.f127036c.mo40297a((C19375b) null);
            } else {
                this.f127036c.mo40298a((C19375b) this, this.f127136M.mo98902a().f126904b.ordinal());
            }
        } else {
            C50792y.m109914d(f127016a, "Create native GL env failed");
        }
        if (this.f127125B != null) {
            this.f127125B.mo43265a(i, "onNativeInitCallBack");
            if (this.f127125B instanceof C50559w) {
                ((C50559w) this.f127125B).mo43264a(BaseNotice.CHECK_PROFILE, i, "Init onNativeInitCallBack");
            }
        }
        C20114g.m49645a(0, "te_record_preview_init_ret", (long) i);
    }

    /* renamed from: a */
    public final void mo39625a(int i, int i2) {
        if (this.f127125B != null) {
            boolean z = i != 0;
            this.f127125B.mo43266a(z);
            if (this.f127125B instanceof C50559w) {
                ((C50559w) this.f127125B).mo43264a(BaseNotice.COMMENT_REPLY_WITH_VIDEO, z ? 1 : -1, "Init HardEncode");
            }
        }
        if (this.f127143T.isSupportHwEnc()) {
            C20114g.m49645a(0, "te_record_hard_encode_init_ret", i == 1 ? -1 : 0);
        }
    }

    /* renamed from: a */
    public final void mo40419a(C19350a aVar) {
        C50617f fVar = this.f127136M;
        if (fVar != null) {
            VEFrame vEFrame = null;
            if (aVar.f53493c == C20091a.TEPixFmt_OpenGL_RGBA8.ordinal()) {
                vEFrame = VEFrame.createTextureFrame(aVar.f53491a, aVar.f53492b, aVar.f53494d, aVar.f53495e, 0, aVar.f53496f, C20091a.TEPixFmt_OpenGL_RGBA8);
            } else if (aVar.f53493c == C20091a.TEPixFmt_YUV420P.ordinal()) {
                vEFrame = VEFrame.createByteBufferFrame(aVar.f53498h, aVar.f53494d, aVar.f53495e, 0, aVar.f53496f, C20091a.TEPixFmt_YUV420P);
            }
            if (vEFrame != null) {
                vEFrame.setFromFrontCamera(aVar.f53499i);
            }
            if (VERSION.SDK_INT >= 17) {
                fVar.mo98903a(vEFrame);
            }
        }
    }

    /* renamed from: a */
    public final int mo98922a(String str, float f) {
        this.f127166aj.f55256a = str;
        this.f127166aj.f55257b = str;
        this.f127166aj.f55259d = f;
        this.f127166aj.f55260e = f;
        this.f127166aj.f55261f = false;
        this.f127166aj.f55258c = 1.0f;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f127036c.mo40335b(str, f);
        return 0;
    }

    /* renamed from: a */
    public final int mo98924a(String str, float f, boolean z) {
        this.f127166aj.f55256a = str;
        this.f127166aj.f55259d = f;
        this.f127166aj.f55260e = f;
        this.f127166aj.f55261f = z;
        if (TextUtils.isEmpty(str)) {
            this.f127036c.mo40360e("");
            return 0;
        }
        this.f127036c.mo40360e(str);
        if (f >= 0.0f && f <= 1.0f && !z) {
            this.f127036c.mo40380i(f);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo98956a(String str, String str2, float f) {
        this.f127166aj.f55256a = str;
        this.f127166aj.f55257b = str2;
        this.f127166aj.f55258c = f;
        this.f127166aj.f55261f = true;
        this.f127036c.mo40301a(C50787c.m109901a(str), C50787c.m109901a(str2), f);
    }

    /* renamed from: a */
    public final void mo98957a(String str, String str2, float f, float f2, float f3) {
        this.f127166aj.f55256a = str;
        this.f127166aj.f55257b = str2;
        this.f127166aj.f55258c = f;
        this.f127166aj.f55259d = f2;
        this.f127166aj.f55260e = f3;
        this.f127166aj.f55261f = true;
        this.f127166aj.f55262g = true;
        this.f127036c.mo40302a(C50787c.m109901a(str), C50787c.m109901a(str2), f, f2, f3);
    }

    /* renamed from: a */
    public final int mo98923a(String str, float f, float f2) {
        this.f127167ak.f55263a = str;
        this.f127167ak.f55264b = f;
        this.f127167ak.f55265c = f2;
        this.f127036c.mo40262a(C50787c.m109901a(str), f, f2);
        return 0;
    }

    /* renamed from: a */
    public final int mo98921a(String str) {
        this.f127167ak.f55263a = str;
        this.f127036c.mo40350d(str);
        return 0;
    }

    /* renamed from: a */
    public final int mo98932a(Map<Integer, Float> map) {
        this.f127167ak.mo42261a(map);
        this.f127036c.mo40305a(map);
        return 0;
    }

    /* renamed from: a */
    public final int mo98930a(String str, Map<Integer, Float> map) {
        this.f127167ak.f55263a = str;
        this.f127167ak.mo42261a(map);
        this.f127036c.mo40304a(str, map);
        return 0;
    }

    /* renamed from: b */
    public final boolean mo98974b(boolean z) {
        return this.f127036c.mo40388j(z);
    }

    /* renamed from: a */
    public final int mo98926a(String str, int i, int i2, boolean z, String str2) {
        this.f127165ai.f55244a = str;
        this.f127165ai.f55247d = i2;
        this.f127165ai.f55246c = i;
        this.f127165ai.f55248e = str2;
        this.f127165ai.f55249f = z;
        return this.f127036c.mo40265a(C50787c.m109901a(str), i, i2, z, str2);
    }

    /* renamed from: a */
    public final void mo98952a(C50622j jVar) {
        super.mo98952a(jVar);
        if (this.f127050r == null) {
            this.f127050r = new CopyOnWriteArrayList();
        }
        this.f127050r.add(jVar);
        if (this.f127028aR == null) {
            this.f127028aR = new FaceInfoCallback() {
                public final void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo) {
                    for (C50622j a : C50661e.this.f127050r) {
                        a.mo43760a(C50692b.m109621a(faceAttributeInfo), C50695d.m109622a(faceDetectInfo));
                    }
                }
            };
        }
        this.f127036c.mo40307a(true, this.f127028aR);
    }

    /* renamed from: b */
    public final void mo99073b(C50622j jVar) {
        super.mo99073b(jVar);
        if (this.f127050r != null) {
            for (C50622j jVar2 : this.f127050r) {
                if (jVar2.equals(jVar)) {
                    this.f127050r.remove(jVar2);
                }
            }
            if (this.f127050r.isEmpty()) {
                this.f127036c.mo40404r();
            }
        }
    }

    /* renamed from: a */
    public final void mo98951a(final C50621i iVar) {
        super.mo98951a(iVar);
        this.f127036c.mo40291a((EffectAlgorithmCallback) new EffectAlgorithmCallback() {
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
        this.f127036c.mo40292a((OnCherEffectParmaCallback) new OnCherEffectParmaCallback() {
            public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
                hVar.mo43538a(strArr, dArr, zArr);
            }
        });
    }

    /* renamed from: a */
    public final void mo98947a(VECherEffectParam vECherEffectParam) {
        this.f127036c.mo40309a(vECherEffectParam.getMatrix(), vECherEffectParam.getDuration(), vECherEffectParam.getSegUseCher());
    }

    /* renamed from: a */
    public final void mo98943a(int i, long j, long j2, String str) {
        this.f127036c.mo40285a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo98945a(C2593a aVar) {
        this.f127036c.mo40290a(aVar);
    }

    /* renamed from: a */
    public final void mo98960a(float[] fArr) {
        this.f127036c.f53536i.setDeviceRotation(fArr);
    }

    /* renamed from: a */
    public final void mo99071a(float[] fArr, double d) {
        this.f127036c.mo40308a(fArr, d);
    }

    /* renamed from: a */
    public final void mo98938a(float f, float f2, float f3) {
        this.f127036c.mo40282a(f, f2, f3);
    }

    /* renamed from: a */
    public final int mo98933a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f127036c.mo40271a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final int mo98934a(double[] dArr, double d) {
        return this.f127036c.mo40272a(dArr, d);
    }

    /* renamed from: a */
    public final int mo98925a(String str, int i, int i2, String str2) {
        return this.f127036c.mo40323b(str, i, i2, str2);
    }

    /* renamed from: a */
    public final int mo98920a(final C50615d dVar) {
        return this.f127036c.mo40259a((OnARTextCountCallback) new OnARTextCountCallback() {
            public final void onResult(int i) {
                if (dVar != null) {
                    dVar.mo43539a(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final int mo98919a(final C50614c cVar) {
        this.f127036c.mo40257a((OnARTextBitmapCallback) new OnARTextBitmapCallback() {
            public final BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
                if (cVar != null) {
                    return cVar.mo42959a(str, befTextLayout);
                }
                return null;
            }
        });
        return 0;
    }

    /* renamed from: b */
    public final void mo99072b(int i) {
        this.f127036c.mo40382i(i);
    }

    /* renamed from: a */
    public final void mo99068a(C50790w wVar) {
        this.f127036c.mo40299a(wVar);
    }

    /* renamed from: b */
    public final void mo99074b(C50790w wVar) {
        this.f127036c.mo40334b(wVar);
    }

    /* renamed from: a */
    public final void mo98955a(String str, String str2) {
        this.f127036c.mo40300a(str, str2);
    }

    /* renamed from: b */
    public final void mo98973b(String str, String str2) {
        this.f127036c.mo40336b(str, str2);
    }

    /* renamed from: a */
    public final int mo98935a(String[] strArr, int i) {
        return this.f127036c.mo40273a(strArr, i);
    }

    /* renamed from: a */
    public final void mo39626a(boolean z) {
        for (C50627o oVar : this.f127138O.mo98728b()) {
            if (oVar != null) {
                oVar.mo43756a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo98939a(float f, float f2, float f3, float f4) {
        this.f127036c.mo40283a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo98959a(boolean z, long j) {
        this.f127036c.mo40306a(z, j);
    }

    /* renamed from: a */
    public final boolean mo98961a(C50634ao aoVar, int i) {
        return this.f127036c.mo40311a(aoVar, i);
    }

    /* renamed from: a */
    public final int mo99065a(C50589a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C50595ad adVar, String str, String str2) {
        this.f127039f = aVar;
        if (this.f127039f != null) {
            this.f127041h = this.f127039f.mo98736j();
        }
        this.f127142S = aVar == null ? null : aVar.mo98735i();
        if (!(this.f127142S == null || this.f127142S.f126697s != CAMERA_OUTPUT_MODE.SURFACE_FRAME || this.f127142S.f126687i == CAMERA_TYPE.TYPE1)) {
            this.f127142S.f126697s = CAMERA_OUTPUT_MODE.SURFACE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        this.f127037d = sb.toString();
        this.f127143T = vEVideoEncodeSettings;
        this.f127144U = vEAudioEncodeSettings;
        this.f127024aN = adVar;
        this.f127145V = str2;
        return m109329w();
    }

    /* renamed from: a */
    public final String mo98936a() {
        if ((this.f127149Z != C50600ag.DUET || this.f127147X == null || this.f127147X.f127281a == null || this.f127147X.f127282b == null) ? false : true) {
            return this.f127147X.f127282b;
        }
        return null;
    }

    /* renamed from: a */
    public final int mo98927a(String str, int i, int i2, final boolean z, boolean z2, CompressFormat compressFormat, final C50613b bVar, boolean z3) {
        C5067118 r5 = new C19224b() {
            /* renamed from: a */
            public final void mo39610a(int i) {
                bVar.mo43337a(i);
            }
        };
        return this.f127036c.mo40269a(str, new int[]{i, i2}, z2, compressFormat, (C19224b) r5);
    }

    /* renamed from: f */
    public final long mo99078f() {
        return this.f127036c.mo40377h();
    }

    /* renamed from: i */
    public final void mo99004i() {
        this.f127036c.mo40400p();
    }

    /* renamed from: j */
    public final void mo99006j() {
        this.f127036c.mo40402q();
    }

    /* renamed from: l */
    public final void mo99011l() {
        m109331y();
        mo99083v();
    }

    /* renamed from: m */
    public final boolean mo99013m() {
        return this.f127036c.mo40310a();
    }

    /* renamed from: n */
    public final int[] mo99015n() {
        return this.f127036c.mo40355d();
    }

    /* renamed from: p */
    public final float mo99019p() {
        return this.f127036c.mo40315b();
    }

    /* renamed from: s */
    public final EnigmaResult mo99025s() {
        return this.f127036c.mo40410t();
    }

    /* renamed from: t */
    public final C19378e mo99027t() {
        return this.f127036c.f53537j;
    }

    /* renamed from: x */
    private void m109330x() {
        this.f127036c.mo40374g(false);
        if (this.f127039f != null) {
            this.f127039f.mo98730b();
        }
    }

    /* renamed from: y */
    private void m109331y() {
        this.f127036c.mo40374g(true);
        if (this.f127039f != null) {
            this.f127039f.mo98732e();
        }
    }

    /* renamed from: o */
    public final int[] mo99017o() {
        return this.f127036c.mo40345c();
    }

    /* renamed from: q */
    public final void mo99021q() {
        super.mo99021q();
        this.f127050r.clear();
        this.f127036c.mo40404r();
    }

    /* renamed from: r */
    public final void mo99023r() {
        super.mo99023r();
        this.f127036c.mo40408s();
    }

    /* renamed from: u */
    public final void mo99082u() {
        if (this.f127046n != 0) {
            this.f127036c.mo40358e();
            this.f127046n = 0;
        }
    }

    public final boolean cx_() {
        C50617f fVar = this.f127136M;
        if (fVar != null) {
            fVar.mo98902a();
            if (fVar.mo98902a().f126903a) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final float[] mo99003h() {
        if (this.f127036c == null) {
            return new float[]{0.0f, 0.0f};
        }
        return this.f127036c.mo40414v();
    }

    /* renamed from: g */
    public final void mo99000g() {
        if (!this.f127018aH) {
            mo98948a((C50542f) null);
        }
        if (this.f127184z != null) {
            this.f127184z.mo99108b((C50689d) this);
        }
        if (this.f127039f != null) {
            this.f127039f.mo98733f();
        }
        this.f127036c.f53536i.setFaceDetectListener2(null);
        if (this.f127050r != null) {
            this.f127050r.clear();
        }
        this.f127026aP.submit(new Runnable() {
            public final void run() {
                C50661e.this.mo99082u();
            }
        });
        this.f127026aP.shutdown();
        super.mo99000g();
    }

    /* renamed from: c */
    public final void mo98979c() {
        if (this.f127039f != null) {
            this.f127039f.mo98731d();
        } else {
            C50792y.m109913c(f127016a, "No Camera capture to stopCameraPreview");
        }
    }

    /* renamed from: d */
    public final long mo98991d() {
        return this.f127036c.mo40372g();
    }

    /* renamed from: v */
    public final synchronized void mo99083v() {
        long currentTimeMillis = System.currentTimeMillis();
        if ((this.f127046n & 2) == 0) {
            String str = f127016a;
            StringBuilder sb = new StringBuilder("stopRecordPreview status error: ");
            sb.append(this.f127046n);
            C50792y.m109913c(str, sb.toString());
            return;
        }
        this.f127036c.mo40383i(false);
        this.f127046n = 1;
        this.f127036c.mo40397n();
        this.f127036c.mo40294a((C19233b) null);
        this.f127036c.mo40293a((OnRunningErrorCallback) null);
        this.f127036c.f53536i.removeSlamDetectListener2(this);
        mo99073b(this.f127029aS);
        this.f127029aS = null;
        if (this.f127171ao) {
            mo99082u();
        } else {
            this.f127046n = 1;
        }
        C20114g.m49645a(0, "te_record_preview_destroy_time", System.currentTimeMillis() - currentTimeMillis);
        C20114g.m49658b(0);
    }

    /* renamed from: w */
    private int m109329w() {
        VESize vESize;
        int i;
        if (this.f127046n != 0) {
            String str = f127016a;
            StringBuilder sb = new StringBuilder("initInternalRecorder called in a invalid state: ");
            sb.append(this.f127046n);
            sb.append("should be : 0");
            C50792y.m109914d(str, sb.toString());
            return -105;
        }
        if (this.f127144U != null) {
            this.f127036c.mo40277a(this.f127144U.f126652c, this.f127144U.f126654e);
        }
        this.f127036c.mo40287a(this.f127183y);
        int i2 = this.f127143T.getVideoRes().width;
        int i3 = this.f127143T.getVideoRes().height;
        boolean z = !TextUtils.isEmpty(this.f127157aa);
        if (this.f127171ao) {
            vESize = this.f127173aq;
        } else {
            vESize = new VESize(this.f127024aN.f126855a.height, this.f127024aN.f126855a.width);
        }
        C19361d dVar = this.f127036c;
        int i4 = vESize.width;
        int i5 = vESize.height;
        String str2 = this.f127037d;
        String str3 = this.f127145V;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        int a = dVar.mo40251a(i4, i5, str2, i3, i2, str3, i, this.f127146W);
        int x = this.f127036c.mo40416x(this.f127179aw);
        if (x != 0) {
            String str4 = f127016a;
            StringBuilder sb2 = new StringBuilder("setEnableAEC failed ");
            sb2.append(x);
            C50792y.m109914d(str4, sb2.toString());
        }
        if (a == 0) {
            this.f127046n = 1;
        }
        return a;
    }

    /* renamed from: k */
    public final synchronized int mo99008k() {
        float f;
        if (this.f127046n != 3) {
            String str = f127016a;
            StringBuilder sb = new StringBuilder("nativeStopRecord called in a invalid state: ");
            sb.append(this.f127046n);
            C50792y.m109914d(str, sb.toString());
            return -105;
        }
        this.f127030aT = false;
        this.f127031aU = false;
        this.f127036c.mo40386j();
        this.f127030aT = true;
        this.f127036c.mo40391l();
        if (this.f127031aU && this.f127125B != null && (this.f127125B instanceof C50559w)) {
            ((C50559w) this.f127125B).mo43264a(1021, 0, "更新分段时长");
        }
        long g = (long) (((float) this.f127036c.mo40372g()) / 1000.0f);
        this.f127035b.add(new C19352c(g, (double) this.f127020aJ));
        synchronized (f127017k) {
            this.f127021aK = -1;
            f = (float) g;
            this.f127038e = (long) (((float) this.f127038e) + ((1.0f * f) / this.f127020aJ));
        }
        this.f127046n = 2;
        return (int) (f / this.f127020aJ);
    }

    /* renamed from: b */
    public final void mo98971b() {
        m109328b((Runnable) new Runnable() {
            public final void run() {
                synchronized (C50661e.this) {
                    if (C50661e.this.f127046n == 3) {
                        String str = C50661e.f127016a;
                        StringBuilder sb = new StringBuilder("deleteLastFrag could not be executed in mode: ");
                        sb.append(C50661e.this.f127046n);
                        C50792y.m109914d(str, sb.toString());
                        return;
                    }
                    int size = C50661e.this.f127035b.size();
                    if (size > 0) {
                        C50661e.this.f127035b.remove(size - 1);
                        C50661e.this.f127038e = (long) C19352c.m47249a(C50661e.this.f127035b);
                    }
                    C50661e.this.f127036c.mo40381i();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo98946a(IStickerRequestCallback iStickerRequestCallback) {
        this.f127141R = iStickerRequestCallback;
    }

    /* renamed from: g_ */
    public final void mo99001g_(boolean z) {
        this.f127044l = z;
    }

    /* renamed from: b */
    public final int mo98964b(float f) {
        return this.f127036c.mo40375h(f);
    }

    /* renamed from: c */
    public final float mo98975c(String str) {
        return this.f127036c.mo40363f(str);
    }

    /* renamed from: h */
    public final void mo99002h(boolean z) {
        this.f127036c.mo40361e(z);
    }

    /* renamed from: k */
    public final void mo99009k(boolean z) {
        this.f127036c.f53538k = z;
    }

    /* renamed from: o */
    public final int mo99016o(boolean z) {
        return this.f127036c.mo40396n(z);
    }

    /* renamed from: q */
    public final void mo99022q(boolean z) {
        this.f127036c.mo40403q(z);
    }

    /* renamed from: u */
    public final int mo99081u(boolean z) {
        return this.f127036c.mo40407s(z);
    }

    /* renamed from: v */
    public final void mo99084v(boolean z) {
        this.f127036c.f53542o = z;
    }

    /* renamed from: w */
    public final void mo99085w(boolean z) {
        this.f127036c.mo40409t(z);
    }

    /* renamed from: d */
    public final int mo98988d(Surface surface) {
        int a = this.f127036c.mo40255a(surface);
        this.f127036c.mo40368f(2);
        return a;
    }

    /* renamed from: f */
    public final void mo99079f(String str) {
        this.f127036c.mo40376h(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo98999g(boolean z) {
        this.f127179aw = z;
        return this.f127036c.mo40416x(z);
    }

    /* renamed from: i */
    public final void mo99005i(boolean z) {
        this.f127036c.mo40344c(z);
    }

    /* renamed from: j */
    public final void mo99007j(boolean z) {
        this.f127036c.mo40354d(z);
    }

    /* renamed from: m */
    public final void mo99012m(final boolean z) {
        this.f127022aL = z;
        m109328b((Runnable) new Runnable() {
            public final void run() {
                C50661e.this.f127036c.mo40352d(z ? 1 : 0);
            }
        });
    }

    /* renamed from: n */
    public final void mo99014n(final boolean z) {
        m109328b((Runnable) new Runnable() {
            public final void run() {
                C50661e.this.f127036c.mo40359e(z ? 1 : 0);
            }
        });
    }

    /* renamed from: p */
    public final void mo99020p(boolean z) {
        this.f127036c.mo40401p(z);
    }

    /* renamed from: s */
    public final void mo99026s(boolean z) {
        this.f127036c.mo40412u(z);
    }

    /* renamed from: t */
    public final void mo99028t(boolean z) {
        this.f127036c.mo40415w(z);
    }

    /* renamed from: b */
    private void m109328b(Runnable runnable) {
        if (!this.f127032aV) {
            runnable.run();
        } else if (this.f127026aP.isShutdown()) {
            C50792y.m109914d(f127016a, "EXECUTOR isShutdown");
        } else {
            this.f127026aP.submit(runnable);
        }
    }

    /* renamed from: d */
    public final int mo98989d(String str) {
        return this.f127036c.mo40340c(C50787c.m109901a(str));
    }

    /* renamed from: e */
    public final int mo98996e(String str) {
        return this.f127036c.mo40371g(str);
    }

    /* renamed from: f */
    public final void mo98998f(boolean z) {
        this.f127036c.mo40395m(z);
    }

    /* renamed from: r */
    public final void mo99024r(boolean z) {
        if (z) {
            this.f127036c.mo40318b(this.f127183y);
        } else {
            this.f127036c.mo40411u();
        }
    }

    public int closeWavFile(boolean z) {
        C50792y.m109911b(f127016a, "closeWavFile...");
        this.f127031aU = true;
        if (this.f127030aT && this.f127125B != null && (this.f127125B instanceof C50559w)) {
            ((C50559w) this.f127125B).mo43264a(1021, 0, "更新分段时长");
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo98997e(boolean z) {
        this.f127036c.mo40392l(z);
    }

    /* renamed from: l */
    public final int mo99080l(boolean z) {
        if (!this.f127024aN.f126856b && !z) {
            return 0;
        }
        if (this.f127149Z == C50600ag.DUET || this.f127149Z == C50600ag.REACTION || this.f127149Z == C50600ag.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(this.f127157aa)) {
            return 5;
        }
        return 1;
    }

    public void onError(int i) {
        String str = f127016a;
        StringBuilder sb = new StringBuilder("running error: ");
        sb.append(i);
        C50792y.m109914d(str, sb.toString());
        int i2 = OnRunningErrorCallback.FRAG_HW_ENCODER_ERR;
        if (i == -602) {
            i2 = OnRunningErrorCallback.INIT_FRAG_OUTPUT_ERR;
        } else if (i != -601) {
            i2 = 0;
        }
        if (this.f127125B instanceof C50559w) {
            ((C50559w) this.f127125B).mo43267b(i2, "");
        }
    }

    /* renamed from: b */
    public final int mo98966b(final C50615d dVar) {
        return this.f127036c.mo40258a((OnARTextContentCallback) new OnARTextContentCallback() {
            public final void onResult(String[] strArr) {
                if (dVar != null) {
                    dVar.mo43540a(strArr);
                }
            }
        });
    }

    /* renamed from: b */
    public final int mo98967b(String str) {
        this.f127168al.f55251a = str;
        this.f127036c.mo40321b(C50787c.m109901a(str));
        return 0;
    }

    /* renamed from: c */
    public final void mo98980c(int i) {
        this.f127036c.mo40387j(i);
    }

    /* renamed from: d */
    public final void mo99075d(int i) {
        this.f127036c.mo40378h(i);
    }

    /* renamed from: a */
    public final synchronized int mo98912a(float f) {
        int i;
        float f2 = f;
        synchronized (this) {
            if (this.f127143T == null) {
                return -108;
            }
            if (this.f127046n != 2) {
                String str = f127016a;
                StringBuilder sb = new StringBuilder("nativeStartRecord called in a invalid state: ");
                sb.append(this.f127046n);
                sb.append("should be : 2");
                C50792y.m109914d(str, sb.toString());
                return -105;
            }
            this.f127046n = 3;
            this.f127036c.mo40319b(this.f127183y, mo99080l(true), (AudioRecorderInterface) this);
            this.f127020aJ = f2;
            this.f127036c.mo40278a(this.f127158ab, this.f127038e);
            if (this.f127143T.getBitrateMode() == ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF) {
                int swCRF = this.f127143T.getSwCRF();
                C19361d dVar = this.f127036c;
                int ordinal = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
                if (swCRF < 12) {
                    swCRF = 12;
                }
                dVar.mo40341c(ordinal, swCRF);
            } else {
                this.f127036c.mo40341c(ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal(), this.f127143T.getSwQP());
            }
            float bps = (((float) this.f127143T.getBps()) * 1.0f) / 4194304.0f;
            if (this.f127143T.getEncodeProfile() == ENCODE_PROFILE.ENCODE_PROFILE_MAIN.ordinal()) {
                i = 2;
            } else if (this.f127143T.getEncodeProfile() == ENCODE_PROFILE.ENCODE_PROFILE_HIGH.ordinal()) {
                i = 8;
            } else {
                i = 1;
            }
            C19361d dVar2 = this.f127036c;
            dVar2.f53536i.enableWaterMark(this.f127177au);
            if (this.f127178av != null) {
                if (this.f127178av.waterMarkBitmap == null) {
                    C19361d dVar3 = this.f127036c;
                    dVar3.f53536i.setWaterMark(this.f127178av.images, this.f127178av.width, this.f127178av.height, this.f127178av.xOffset, this.f127178av.yOffset, this.f127178av.position.ordinal(), this.f127178av.interval, this.f127178av.rotation);
                } else {
                    C19361d dVar4 = this.f127036c;
                    dVar4.f53536i.setWaterMark(this.f127178av.waterMarkBitmap, this.f127178av.width, this.f127178av.height, this.f127178av.xOffset, this.f127178av.yOffset, this.f127178av.position.ordinal(), this.f127178av.interval, this.f127178av.rotation);
                }
            }
            final C50539c cVar = this.f127140Q;
            C5067824 r3 = new C19374a() {
                /* renamed from: a */
                public final void mo40418a(int i) {
                    C20114g.m49645a(0, "te_record_audio_start_record_ret", (long) i);
                }
            };
            C19361d dVar5 = this.f127036c;
            if (dVar5.f53529b != null) {
                dVar5.f53529b.setAudioRecordStateCallack(r3);
            }
            int a = this.f127036c.mo40247a((double) f2, !this.f127143T.isSupportHwEnc(), bps, 1, i, false, this.f127143T.getDescription(), this.f127143T.getComment());
            if (a != 0) {
                String str2 = f127016a;
                StringBuilder sb2 = new StringBuilder("nativeStartRecord error: ");
                sb2.append(a);
                C50792y.m109914d(str2, sb2.toString());
            }
            C20114g.m49645a(0, "te_record_start_record_ret", (long) a);
            synchronized (f127017k) {
                this.f127021aK = 0;
            }
            return a;
        }
    }

    /* renamed from: d */
    public final void mo98992d(boolean z) {
        this.f127036c.mo40389k(z);
    }

    /* renamed from: c */
    public final void mo98982c(Surface surface) {
        this.f127032aV = false;
        m109330x();
        mo99077e(surface);
    }

    /* renamed from: e */
    public final synchronized int mo99077e(Surface surface) {
        int i;
        int i2;
        int i3;
        boolean z;
        this.f127033aW = System.currentTimeMillis();
        if (this.f127125B != null && (this.f127125B instanceof C50559w)) {
            ((C50559w) this.f127125B).mo43264a(1020, 0, "在这里可以更换ResManager");
        }
        if (this.f127046n == 0) {
            mo99082u();
            int w = m109329w();
            if (w != 0) {
                String str = f127016a;
                StringBuilder sb = new StringBuilder("nativeInitFaceBeautyPlay error: ");
                sb.append(w);
                C50792y.m109914d(str, sb.toString());
                return -108;
            }
        }
        if (this.f127046n != 1) {
            String str2 = f127016a;
            StringBuilder sb2 = new StringBuilder("startRecordPreview statue error: ");
            sb2.append(this.f127046n);
            C50792y.m109914d(str2, sb2.toString());
            if (this.f127023aM != surface) {
                mo98988d(surface);
                this.f127023aM = surface;
            }
            return -105;
        }
        this.f127023aM = surface;
        this.f127042i = -1;
        this.f127045m = 0;
        this.f127040g.width = 0;
        this.f127040g.height = 0;
        this.f127036c.mo40296a(this.f127141R);
        this.f127036c.mo40373g(this.f127161ae);
        C19361d dVar = this.f127036c;
        dVar.f53536i.chooseAreaFromRatio34(this.f127174ar);
        C19361d dVar2 = this.f127036c;
        dVar2.f53536i.setPaddingBottomInRatio34(this.f127175as);
        C19361d dVar3 = this.f127036c;
        dVar3.f53536i.enablePBO(this.f127170an);
        VESize videoRes = this.f127143T.getVideoRes();
        if (this.f127172ap.isValid() && !videoRes.equals(this.f127172ap)) {
            this.f127036c.mo40331b(this.f127172ap.width, this.f127172ap.height);
            videoRes.width = this.f127172ap.width;
            videoRes.height = this.f127172ap.height;
        }
        if (this.f127149Z == C50600ag.DUET) {
            this.f127036c.mo40303a(this.f127147X.f127281a, this.f127147X.f127282b, this.f127147X.f127283c, this.f127147X.f127284d, this.f127147X.f127285e, this.f127147X.f127286f, this.f127147X.f127287g);
        } else if (this.f127149Z == C50600ag.REACTION) {
            this.f127036c.mo40288a(this.f127183y, this.f127148Y.f126872a, this.f127148Y.f126873b);
        } else {
            C19361d a = this.f127036c.mo40279a(this.f127157aa);
            if (this.f127160ad == 1) {
                z = true;
            } else {
                z = false;
            }
            a.mo40280a(z).mo40278a(this.f127158ab, 0);
        }
        this.f127036c.mo40343c(1);
        this.f127036c.mo40379h(this.f127024aN.f126857c);
        this.f127036c.mo40294a((C19233b) this);
        this.f127036c.mo40293a((OnRunningErrorCallback) this);
        this.f127036c.mo40389k(this.f127024aN.f126858d);
        this.f127036c.mo40388j(this.f127024aN.f126860f);
        C19361d dVar4 = this.f127036c;
        dVar4.f53536i.forceFirstFrameHasEffect(this.f127176at);
        this.f127036c.f53536i.addSlamDetectListener2(this);
        this.f127036c.mo40369f(this.f127024aN.f126862h);
        C19361d dVar5 = this.f127036c;
        dVar5.f53536i.enablePreloadEffectRes(this.f127024aN.f126863i);
        C19361d dVar6 = this.f127036c;
        dVar6.f53536i.setEffectAlgorithmRequirement(this.f127024aN.f126864j);
        C19361d dVar7 = this.f127036c;
        dVar7.f53536i.enableEffectRT(this.f127024aN.f126865k);
        C19361d dVar8 = this.f127036c;
        dVar8.f53536i.enableClearColorAfterRender(this.f127171ao);
        if (surface != null) {
            i = this.f127036c.mo40256a(surface, Build.DEVICE);
        } else {
            if (this.f127184z != null) {
                i2 = this.f127184z.f127120c;
            } else {
                i2 = -1;
            }
            if (this.f127184z != null) {
                i3 = this.f127184z.f127121d;
            } else {
                i3 = -1;
            }
            i = this.f127036c.f53536i.startPlay(i2, i3, Build.DEVICE, -1, -1);
        }
        if (i != 0) {
            String str3 = f127016a;
            StringBuilder sb3 = new StringBuilder("nativeStartPlay error: ");
            sb3.append(i);
            C50792y.m109914d(str3, sb3.toString());
        }
        C20114g.m49645a(0, "te_record_start_preview_ret", (long) i);
        if (this.f127129F != null) {
            new StringBuilder("nativeStartPlay error: ").append(i);
        }
        this.f127046n = 2;
        this.f127036c.mo40253a(this.f127183y, mo99080l(false), (AudioRecorderInterface) this);
        synchronized (this.f127027aQ) {
            if (!this.f127035b.isEmpty()) {
                int a2 = this.f127036c.mo40252a(this.f127035b.size(), this.f127037d);
                if (a2 != 0) {
                    String str4 = f127016a;
                    StringBuilder sb4 = new StringBuilder("tryRestore ret: ");
                    sb4.append(a2);
                    C50792y.m109914d(str4, sb4.toString());
                } else {
                    this.f127038e = (long) C19352c.m47249a(this.f127035b);
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final int mo99064a(Bitmap bitmap) {
        return this.f127036c.mo40254a(bitmap);
    }

    /* renamed from: c */
    public final void mo98983c(boolean z) {
        this.f127036c.mo40405r(z);
    }

    /* renamed from: a */
    public final int mo98918a(VEEffectParams vEEffectParams) {
        return this.f127036c.mo40260a(vEEffectParams);
    }

    /* renamed from: d */
    public final int mo98987d(float f, float f2) {
        return this.f127036c.mo40357e(f, f2);
    }

    /* renamed from: e */
    public final int mo98994e(float f, float f2) {
        return this.f127036c.mo40365f(f, f2);
    }

    public int addPCMData(byte[] bArr, int i) {
        C50792y.m109911b(f127016a, "addPCMData...");
        if (this.f127127D != null) {
            Arrays.copyOf(bArr, i);
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo98995e(int i, int i2) {
        return this.f127036c.mo40366f(i, i2);
    }

    /* renamed from: a */
    public final int mo98913a(float f, float f2) {
        this.f127164ah.f55242c = f;
        this.f127164ah.f55243d = f2;
        this.f127036c.mo40281a(f, f2);
        return 0;
    }

    /* renamed from: c */
    public final int mo98977c(float f, float f2) {
        return this.f127036c.mo40349d(f, f2);
    }

    /* renamed from: b */
    public final int mo98965b(float f, float f2) {
        return this.f127036c.mo40338c(f, f2);
    }

    /* renamed from: d */
    public final int mo98990d(String str, String str2) {
        return this.f127036c.mo40351d(str, str2);
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
        this.f127036c.mo40249a(i, f);
        return 0;
    }

    public void onInfo(int i, int i2) {
        switch (i) {
            case 1040:
                this.f127180ax = i2;
                break;
            case 1041:
                this.f127181ay = i2;
                break;
            case 1042:
                if (i2 != 0) {
                    this.f127150aA = 1000.0f / ((float) i2);
                    break;
                }
                break;
            case 1043:
                this.f127182az = i2;
                break;
            case 1044:
                this.f127153aD = i2;
                break;
            case 1045:
                this.f127154aE = i2;
                break;
            case 1046:
                this.f127155aF = i2;
                break;
            case 1047:
                if (i2 != 0) {
                    this.f127156aG = 1000.0f / ((float) i2);
                    break;
                }
                break;
            case 1048:
                this.f127151aB = i2;
                break;
            case 1049:
                this.f127152aC = ((float) i2) / 1000.0f;
                break;
        }
        String str = f127016a;
        StringBuilder sb = new StringBuilder("onInfo: ");
        sb.append(i);
        sb.append("ext:");
        sb.append(i2);
        C50792y.m109911b(str, sb.toString());
        String str2 = "";
        if (i == 1030) {
            str2 = "shotScreen...";
        }
        if (this.f127125B instanceof C50559w) {
            ((C50559w) this.f127125B).mo43264a(i, i2, str2);
        }
    }

    /* renamed from: c */
    public final void mo98981c(int i, int i2) {
        this.f127036c.mo40353d(i, i2);
    }

    /* renamed from: a */
    public final int mo98917a(int i, String str) {
        this.f127164ah.f55240a = i;
        this.f127164ah.f55241b = str;
        this.f127036c.mo40333b(i, str);
        return 0;
    }

    /* renamed from: d */
    public final boolean mo98993d(int i, int i2) {
        return this.f127036c.mo40362e(i, i2);
    }

    /* renamed from: b */
    public final int mo98970b(String[] strArr, int i) {
        return this.f127036c.mo40325b(strArr, i);
    }

    /* renamed from: c */
    public final int[] mo98984c(String str, String str2) {
        return this.f127036c.mo40346c(str, str2);
    }

    public int initWavFile(int i, int i2, double d) {
        C50792y.m109911b(f127016a, "initWavFile...");
        return 0;
    }

    /* renamed from: c */
    public final int mo98978c(String str, String str2, float f) {
        return this.f127036c.mo40324b(str, str2, f);
    }

    public C50661e(Context context, C50771d dVar, C50688c cVar) {
        super(context, dVar, cVar);
        if (this.f127184z != null) {
            this.f127184z.mo99107a((C50689d) this);
        }
        this.f127036c = new C19361d();
        this.f127036c.mo40244a(this.f127034aX);
        C20114g.m49648a("iesve_use_new_record", 1);
    }

    /* renamed from: b */
    public final int mo98968b(String str, float f, float f2) {
        this.f127168al.f55251a = str;
        this.f127168al.f55252b = f;
        this.f127168al.f55253c = f2;
        this.f127036c.mo40322b(C50787c.m109901a(str), f, f2);
        return 0;
    }

    /* renamed from: b */
    public final int mo98969b(String str, String str2, float f) {
        return mo98912a(f);
    }

    /* renamed from: a */
    public final int mo98911a(double d, double d2, double d3, double d4) {
        return this.f127036c.mo40245a(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final int mo98963b(double d, double d2, double d3, double d4) {
        return this.f127036c.mo40316b(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final int mo98976c(double d, double d2, double d3, double d4) {
        return this.f127036c.mo40337c(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo98916a(int i, float f, float f2, int i2) {
        return this.f127036c.mo40250a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final int mo98914a(float f, float f2, float f3, float f4, float f5) {
        return this.f127036c.mo40248a(f, f2, f3, f4, f5);
    }
}
