package com.p683ss.p2568f.p2569a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.C2240a;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.p2549c.p2550a.p2551a.p2554b.C51199c;
import com.p683ss.p2549c.p2550a.p2551a.p2554b.C51201e;
import com.p683ss.p2568f.p2569a.p2570a.C51301a;
import com.p683ss.p2568f.p2569a.p2570a.C51302b;
import com.p683ss.p2568f.p2569a.p2570a.C51305c;
import com.p683ss.p2568f.p2569a.p2571b.C51308b;
import com.p683ss.p2568f.p2569a.p2571b.C51309c;
import com.p683ss.p2568f.p2569a.p2571b.C51310d;
import com.p683ss.p2568f.p2569a.p2572c.C51315a;
import com.p683ss.p2568f.p2569a.p2572c.C51315a.C51319a;
import com.p683ss.p2568f.p2569a.p2572c.C51322c;
import com.p683ss.p2568f.p2569a.p2572c.C51322c.C51325a;
import com.p683ss.p2568f.p2569a.p2573d.C51331a;
import com.p683ss.p2568f.p2569a.p2573d.C51332b;
import com.p683ss.p2568f.p2569a.p2573d.C51333c;
import com.p683ss.p2568f.p2569a.p2574e.C51355a;
import com.p683ss.p2568f.p2569a.p2574e.C51355a.C51357a;
import com.p683ss.p2568f.p2569a.p2575f.C51359a;
import com.p683ss.ttm.player.MediaPlayer;
import com.p683ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p683ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p683ss.ttm.player.MediaPlayer.OnExternInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p683ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p683ss.ttm.player.TTPlayerConfiger;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.f.a.e */
public final class C51334e {

    /* renamed from: G */
    public static boolean f128278G;

    /* renamed from: H */
    public static JSONObject f128279H;

    /* renamed from: I */
    public static Context f128280I;

    /* renamed from: A */
    public String f128281A;

    /* renamed from: B */
    public String f128282B;

    /* renamed from: C */
    public String f128283C;

    /* renamed from: D */
    public long f128284D;

    /* renamed from: E */
    public long f128285E;

    /* renamed from: F */
    public int f128286F;

    /* renamed from: J */
    public boolean f128287J;

    /* renamed from: K */
    public boolean f128288K;

    /* renamed from: L */
    public long f128289L;

    /* renamed from: M */
    public int f128290M;

    /* renamed from: N */
    private final ExecutorService f128291N;

    /* renamed from: O */
    private final Context f128292O;

    /* renamed from: P */
    private final C51311c f128293P;

    /* renamed from: Q */
    private final boolean f128294Q;

    /* renamed from: R */
    private final C51306b f128295R;

    /* renamed from: S */
    private final int f128296S;

    /* renamed from: T */
    private SurfaceHolder f128297T;

    /* renamed from: U */
    private Surface f128298U;

    /* renamed from: V */
    private C51341b f128299V;

    /* renamed from: W */
    private int f128300W;

    /* renamed from: X */
    private int f128301X;

    /* renamed from: Y */
    private int f128302Y;

    /* renamed from: Z */
    private int f128303Z;

    /* renamed from: a */
    public final Handler f128304a;

    /* renamed from: aA */
    private int f128305aA;

    /* renamed from: aB */
    private boolean f128306aB;

    /* renamed from: aC */
    private boolean f128307aC;

    /* renamed from: aD */
    private int f128308aD;

    /* renamed from: aE */
    private int f128309aE;

    /* renamed from: aF */
    private int f128310aF;

    /* renamed from: aG */
    private int f128311aG;

    /* renamed from: aH */
    private int f128312aH;

    /* renamed from: aI */
    private int f128313aI;

    /* renamed from: aJ */
    private int f128314aJ;

    /* renamed from: aK */
    private long f128315aK;

    /* renamed from: aL */
    private long f128316aL;

    /* renamed from: aM */
    private int f128317aM;

    /* renamed from: aN */
    private int f128318aN;

    /* renamed from: aO */
    private int f128319aO;

    /* renamed from: aP */
    private int f128320aP;

    /* renamed from: aQ */
    private int f128321aQ;

    /* renamed from: aR */
    private String f128322aR;

    /* renamed from: aS */
    private int f128323aS;

    /* renamed from: aT */
    private boolean f128324aT;

    /* renamed from: aU */
    private int f128325aU;

    /* renamed from: aV */
    private int f128326aV;

    /* renamed from: aa */
    private int f128327aa;

    /* renamed from: ab */
    private int f128328ab;

    /* renamed from: ac */
    private int f128329ac;

    /* renamed from: ad */
    private int f128330ad;

    /* renamed from: ae */
    private int f128331ae;

    /* renamed from: af */
    private int f128332af;

    /* renamed from: ag */
    private int f128333ag;

    /* renamed from: ah */
    private int f128334ah;

    /* renamed from: ai */
    private int f128335ai;

    /* renamed from: aj */
    private int f128336aj;

    /* renamed from: ak */
    private int f128337ak;

    /* renamed from: al */
    private int f128338al;

    /* renamed from: am */
    private int f128339am;

    /* renamed from: an */
    private int f128340an;

    /* renamed from: ao */
    private int f128341ao;

    /* renamed from: ap */
    private float f128342ap;

    /* renamed from: aq */
    private int f128343aq;

    /* renamed from: ar */
    private float f128344ar;

    /* renamed from: as */
    private String f128345as;

    /* renamed from: at */
    private String f128346at;

    /* renamed from: au */
    private long f128347au;

    /* renamed from: av */
    private int f128348av;

    /* renamed from: aw */
    private String f128349aw;

    /* renamed from: ax */
    private int f128350ax;

    /* renamed from: ay */
    private int f128351ay;

    /* renamed from: az */
    private C51201e f128352az;

    /* renamed from: b */
    public C51302b f128353b;

    /* renamed from: c */
    public final C51300a f128354c;

    /* renamed from: d */
    public final C51315a f128355d;

    /* renamed from: e */
    public final C51355a f128356e;

    /* renamed from: f */
    public final C51333c f128357f;

    /* renamed from: g */
    public final C51308b f128358g;

    /* renamed from: h */
    public MediaPlayer f128359h;

    /* renamed from: i */
    public C51322c f128360i;

    /* renamed from: j */
    C51331a f128361j;

    /* renamed from: k */
    public C51354m f128362k;

    /* renamed from: l */
    public boolean f128363l;

    /* renamed from: m */
    public boolean f128364m;

    /* renamed from: n */
    public boolean f128365n;

    /* renamed from: o */
    public boolean f128366o;

    /* renamed from: p */
    public int f128367p;

    /* renamed from: q */
    public String f128368q;

    /* renamed from: r */
    public boolean f128369r;

    /* renamed from: s */
    public String f128370s;

    /* renamed from: t */
    public int f128371t;

    /* renamed from: u */
    public boolean f128372u;

    /* renamed from: v */
    public boolean f128373v;

    /* renamed from: w */
    public int f128374w;

    /* renamed from: x */
    public boolean f128375x;

    /* renamed from: y */
    String f128376y;

    /* renamed from: z */
    public boolean f128377z;

    /* renamed from: com.ss.f.a.e$a */
    public static final class C51340a {

        /* renamed from: a */
        final Context f128391a;

        /* renamed from: b */
        C51300a f128392b;

        /* renamed from: c */
        String f128393c;

        /* renamed from: d */
        C51311c f128394d;

        /* renamed from: e */
        C51306b f128395e;

        /* renamed from: f */
        boolean f128396f;

        /* renamed from: g */
        boolean f128397g;

        /* renamed from: h */
        int f128398h;

        /* renamed from: i */
        int f128399i;

        /* renamed from: j */
        String f128400j;

        /* renamed from: k */
        String f128401k;

        /* renamed from: l */
        boolean f128402l;

        /* renamed from: m */
        boolean f128403m;

        /* renamed from: n */
        public long f128404n;

        /* renamed from: o */
        public long f128405o;

        /* renamed from: p */
        public long f128406p;

        /* renamed from: a */
        public final C51334e mo101923a() {
            if (this.f128391a == null) {
                throw new IllegalArgumentException("mContext should not be null");
            } else if (this.f128392b == null) {
                throw new IllegalArgumentException("mListener should not be null");
            } else if (this.f128394d != null) {
                return new C51334e(this);
            } else {
                throw new IllegalArgumentException("mNetworkClient should not be null");
            }
        }

        /* renamed from: a */
        public final C51340a mo101918a(int i) {
            this.f128399i = i;
            return this;
        }

        /* renamed from: b */
        public final C51340a mo101925b(boolean z) {
            this.f128397g = false;
            return this;
        }

        /* renamed from: a */
        public final C51340a mo101919a(C51300a aVar) {
            this.f128392b = aVar;
            return this;
        }

        /* renamed from: b */
        public final C51340a mo101924b(int i) {
            this.f128398h = 300000;
            return this;
        }

        /* renamed from: a */
        public final C51340a mo101920a(C51306b bVar) {
            this.f128395e = bVar;
            return this;
        }

        /* renamed from: a */
        public final C51340a mo101921a(C51311c cVar) {
            this.f128394d = cVar;
            return this;
        }

        private C51340a(Context context) {
            this.f128398h = 60000;
            this.f128399i = 1;
            this.f128400j = "origin";
            this.f128401k = "flv";
            this.f128403m = true;
            this.f128404n = 10000;
            this.f128405o = 60000;
            this.f128406p = 8000;
            this.f128391a = context;
        }

        /* renamed from: a */
        public final C51340a mo101922a(boolean z) {
            this.f128396f = false;
            return this;
        }
    }

    /* renamed from: com.ss.f.a.e$b */
    enum C51341b {
        IDLE,
        PLAYED,
        STOPPED
    }

    /* renamed from: com.ss.f.a.e$c */
    static final class C51342c implements OnCompletionListener {

        /* renamed from: a */
        private final WeakReference<C51334e> f128411a;

        public C51342c(C51334e eVar) {
            this.f128411a = new WeakReference<>(eVar);
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            C51334e eVar = (C51334e) this.f128411a.get();
            if (eVar != null && eVar.f128359h != null) {
                eVar.f128354c.mo14310c();
                if (!eVar.f128377z) {
                    if (eVar.f128375x && eVar.f128358g.f128220c == 2 && eVar.mo101893a(-109)) {
                        return;
                    }
                    if (eVar.f128358g.f128220c == 1 && eVar.mo101897b(-109)) {
                        return;
                    }
                    if (eVar.f128367p == 1) {
                        eVar.f128369r = true;
                        if (eVar.f128366o && !TextUtils.isEmpty(eVar.f128368q)) {
                            eVar.mo101899c(eVar.f128368q);
                            eVar.f128366o = true;
                            if (eVar.f128359h != null && eVar.f128377z && !TextUtils.isEmpty(eVar.f128376y)) {
                                eVar.f128359h.setLooping(eVar.f128366o);
                            }
                            eVar.mo101904e(eVar.f128368q);
                            return;
                        }
                        return;
                    }
                    eVar.f128356e.mo101938a(new C51301a(-109, "live stream dry up, push stream may occur error", new HashMap()));
                }
            }
        }
    }

    /* renamed from: com.ss.f.a.e$d */
    static final class C51343d implements OnErrorListener {

        /* renamed from: a */
        private final WeakReference<C51334e> f128412a;

        public C51343d(C51334e eVar) {
            this.f128412a = new WeakReference<>(eVar);
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C51334e eVar = (C51334e) this.f128412a.get();
            if (eVar == null || eVar.f128359h == null) {
                return false;
            }
            if (i != 0) {
                eVar.f128353b.mo101830c(i);
            }
            eVar.f128354c.mo14305a(new C51301a(i, "player on error", null));
            if (eVar.f128377z) {
                return true;
            }
            if (eVar.f128286F == 1 && eVar.mo101900c(i)) {
                return true;
            }
            if (eVar.f128375x && eVar.f128358g.f128220c == 2 && eVar.mo101893a(i)) {
                return true;
            }
            if (eVar.f128358g.f128220c == 1 && eVar.mo101897b(i)) {
                return true;
            }
            new StringBuilder("onError ").append(i);
            HashMap hashMap = new HashMap();
            hashMap.put("internalCode", Integer.valueOf(i));
            hashMap.put("internalExtra", Integer.valueOf(i2));
            hashMap.put("playerType", Integer.valueOf(mediaPlayer.getPlayerType()));
            eVar.f128356e.mo101938a(new C51301a(-103, "player on error", hashMap));
            return false;
        }
    }

    /* renamed from: com.ss.f.a.e$e */
    static final class C51344e implements OnExternInfoListener {

        /* renamed from: a */
        private final WeakReference<C51334e> f128413a;

        public C51344e(C51334e eVar) {
            this.f128413a = new WeakReference<>(eVar);
        }

        public final void onExternInfo(MediaPlayer mediaPlayer, int i, String str) {
            StringBuilder sb = new StringBuilder("onExternInfo, what:");
            sb.append(i);
            sb.append(",message:");
            sb.append(str);
            C51334e eVar = (C51334e) this.f128413a.get();
            if (!(eVar == null || eVar.f128359h == null || 19 != i)) {
                if (eVar.f128287J && !eVar.f128288K) {
                    eVar.f128288K = true;
                    eVar.f128304a.sendEmptyMessageDelayed(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 3000);
                }
                eVar.f128289L = System.currentTimeMillis();
                C51302b bVar = eVar.f128353b;
                if (!(TextUtils.isEmpty(str) || bVar.f128151d == null || bVar.f128152e == null)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("ts")) {
                            long j = jSONObject.getLong("ts");
                            long j2 = 0;
                            if (bVar.f128126ad == 1 && jSONObject.has("tt_ntp") && jSONObject.getInt("tt_ntp") == 1) {
                                if (!bVar.f128125ac && bVar.f128095X != null) {
                                    bVar.f128095X.mo101836a(103, 0);
                                    bVar.f128125ac = true;
                                }
                                j2 = bVar.f128096Y;
                                bVar.f128097Z = true;
                            } else {
                                if (bVar.f128125ac && !jSONObject.has("tt_ntp")) {
                                    if (bVar.f128095X != null) {
                                        bVar.f128095X.f128174a.removeCallbacksAndMessages(null);
                                    }
                                    bVar.f128125ac = false;
                                }
                                bVar.f128097Z = false;
                            }
                            bVar.f128151d.f128186I = (System.currentTimeMillis() - j) + j2;
                            String str2 = bVar.f128151d.f128187J;
                            if (jSONObject.has("source")) {
                                bVar.f128151d.f128187J = jSONObject.getString("source");
                            } else if (jSONObject.has("app_data")) {
                                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("app_data"));
                                if (jSONObject2.has("vendor")) {
                                    bVar.f128151d.f128187J = jSONObject2.getString("vendor");
                                }
                            }
                            if (!str2.equals("none") && !bVar.f128151d.f128187J.equals(str2)) {
                                if (str2.startsWith("TTLiveSDK")) {
                                    bVar.mo101828b(true);
                                } else {
                                    bVar.mo101828b(false);
                                }
                            }
                            if (jSONObject.has("app_data")) {
                                JSONObject jSONObject3 = new JSONObject(jSONObject.optString("app_data"));
                                if (jSONObject3.has("channel_id")) {
                                    bVar.f128151d.f128188K = jSONObject3.getString("channel_id");
                                }
                            } else {
                                bVar.f128151d.f128188K = "none";
                            }
                            if (jSONObject.has("real_bitrate")) {
                                bVar.f128151d.f128189L = jSONObject.getInt("real_bitrate");
                                bVar.f128129ag = true;
                            }
                            if (jSONObject.has("real_video_framerate")) {
                                bVar.f128151d.f128190M = jSONObject.getInt("real_video_framerate");
                                bVar.f128129ag = true;
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                eVar.f128354c.mo14306a(str);
            }
        }
    }

    /* renamed from: com.ss.f.a.e$f */
    static final class C51345f implements C51325a {

        /* renamed from: a */
        public final String f128414a;

        /* renamed from: b */
        private final WeakReference<C51334e> f128415b;

        /* renamed from: a */
        public final void mo101877a(final C51301a aVar) {
            final C51334e eVar = (C51334e) this.f128415b.get();
            if (eVar != null) {
                eVar.mo101889a((Runnable) new Runnable() {
                    public final void run() {
                        if (eVar.f128359h != null && eVar.f128356e != null) {
                            eVar.f128356e.mo101938a(aVar);
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        public final void mo101878a(final C51309c cVar) {
            final C51334e eVar = (C51334e) this.f128415b.get();
            if (eVar != null) {
                eVar.mo101889a((Runnable) new Runnable() {
                    public final void run() {
                        if (eVar.f128359h != null && eVar.f128356e != null) {
                            if (cVar == null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("liveAPI", C51345f.this.f128414a);
                                eVar.f128356e.mo101938a(new C51301a(-105, "live data is null", hashMap));
                                return;
                            }
                            eVar.f128358g.mo101842a(cVar);
                            String a = eVar.f128358g.mo101841a(eVar.f128281A, eVar.f128283C, eVar.f128282B);
                            if (a == null) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("liveAPI", C51345f.this.f128414a);
                                eVar.f128356e.mo101938a(new C51301a(-105, "play url is null", hashMap2));
                                return;
                            }
                            eVar.mo101904e(a);
                        }
                    }
                });
            }
        }

        public C51345f(C51334e eVar, String str) {
            this.f128415b = new WeakReference<>(eVar);
            this.f128414a = str;
        }
    }

    /* renamed from: com.ss.f.a.e$g */
    static final class C51348g implements OnInfoListener {

        /* renamed from: a */
        private final WeakReference<C51334e> f128422a;

        public C51348g(C51334e eVar) {
            this.f128422a = new WeakReference<>(eVar);
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            String str;
            JSONObject jSONObject;
            long j;
            long j2;
            C51334e eVar = (C51334e) this.f128422a.get();
            if (eVar == null || eVar.f128359h == null) {
                return false;
            }
            if (i == 3) {
                String stringOption = eVar.f128359h.getStringOption(142);
                C51302b bVar = eVar.f128353b;
                if (stringOption != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(stringOption);
                        if (jSONObject2.has("sdk_version")) {
                            bVar.f128161n = jSONObject2.getString("sdk_version");
                        }
                        if (jSONObject2.has("platform")) {
                            bVar.f128162o = jSONObject2.getString("platform");
                        }
                        if (jSONObject2.has("os_version")) {
                            bVar.f128163p = jSONObject2.getString("os_version");
                        }
                        if (jSONObject2.has("model")) {
                            bVar.f128164q = jSONObject2.getString("model");
                        }
                        if (jSONObject2.has("start_time")) {
                            bVar.f128165r = jSONObject2.getString("start_time");
                        }
                        if (jSONObject2.has("is_hardware_encode")) {
                            bVar.f128166s = jSONObject2.getInt("is_hardware_encode");
                        }
                        if (jSONObject2.has("min_bitrate")) {
                            bVar.f128167t = jSONObject2.getInt("min_bitrate");
                        }
                        if (jSONObject2.has("max_bitrate")) {
                            bVar.f128168u = jSONObject2.getInt("max_bitrate");
                        }
                        if (jSONObject2.has("default_bitrate")) {
                            bVar.f128169v = jSONObject2.getInt("default_bitrate");
                        }
                        if (jSONObject2.has("hit_node_optimize")) {
                            bVar.f128170w = jSONObject2.getInt("hit_node_optimize");
                        }
                        if (jSONObject2.has("push_protocol")) {
                            bVar.f128171x = jSONObject2.getString("push_protocol");
                        }
                        if (jSONObject2.has("qId")) {
                            bVar.f128172y = jSONObject2.getString("qId");
                        }
                    } catch (JSONException unused) {
                    }
                }
                int intOption = eVar.f128359h.getIntOption(141, -1);
                if (intOption == 0) {
                    eVar.f128353b.f128073B = "h264";
                } else if (intOption == 1) {
                    eVar.f128353b.f128073B = "h265";
                }
                int intOption2 = eVar.f128359h.getIntOption(157, -1);
                C51302b bVar2 = eVar.f128353b;
                switch (intOption2) {
                    case 1:
                        str = "IOSHWCodec";
                        break;
                    case 2:
                        str = "hardware_codec";
                        break;
                    case 3:
                        str = "ff_H264_codec";
                        break;
                    case 4:
                        str = "ff_H265_codec";
                        break;
                    case 5:
                        str = "KS_H265_codec";
                        break;
                    case 6:
                        str = "JX_H265_codec";
                        break;
                    default:
                        str = "none_codec";
                        break;
                }
                bVar2.f128075D = str;
                eVar.f128353b.mo101830c(0);
                eVar.f128372u = false;
                String stringOption2 = eVar.f128359h.getStringOption(71);
                if (eVar.f128370s != null && eVar.f128370s.startsWith("[") && stringOption2 != null && !stringOption2.startsWith("[")) {
                    stringOption2 = C2240a.m6772a("[%s]", new Object[]{stringOption2});
                }
                if (stringOption2 != null && !stringOption2.equals(eVar.f128370s)) {
                    eVar.f128353b.mo101821a(stringOption2, true);
                    eVar.f128370s = stringOption2;
                }
                if (!eVar.f128364m) {
                    C51302b bVar3 = eVar.f128353b;
                    long j3 = eVar.f128285E;
                    bVar3.f128088Q = true;
                    bVar3.f128089R = System.currentTimeMillis();
                    if (!(bVar3.f128152e == null || bVar3.f128150c == null || bVar3.f128151d == null)) {
                        try {
                            bVar3.f128151d.f128216y = System.currentTimeMillis();
                            bVar3.f128152e.mo101887a(bVar3.f128151d, 0);
                            C51305c cVar = bVar3.f128151d;
                            boolean z = bVar3.f128072A;
                            JSONObject a = bVar3.mo101813a();
                            if (a != null) {
                                JSONObject put = a.put("event_key", "first_frame").put("last_retry_end", 0).put("hit_cache", z ? 1 : 0).put("start", cVar.f128192a).put("sdk_dns_analysis_end", cVar.f128193b).put("prepare_block_end", cVar.f128194c).put("player_dns_analysis_end", cVar.f128195d);
                                String str2 = "tfo_fall_back_time";
                                if (cVar.f128209r <= 0) {
                                    j = cVar.f128195d;
                                } else {
                                    j = cVar.f128209r;
                                }
                                JSONObject put2 = put.put(str2, j);
                                String str3 = "tcp_connect_end";
                                if (bVar3.f128158k.startsWith("httpk")) {
                                    j2 = cVar.f128195d;
                                } else {
                                    j2 = cVar.f128196e;
                                }
                                jSONObject = put2.put(str3, j2).put("tcp_first_package_end", cVar.f128197f).put("first_video_package_end", cVar.f128198g).put("first_audio_package_end", cVar.f128199h).put("first_video_frame_decode_end", cVar.f128200i).put("first_audio_frame_decode_end", cVar.f128201j).put("first_frame_from_player_core", cVar.f128203l).put("first_frame_render_end", cVar.f128202k).put("video_device_open_start", cVar.f128205n).put("video_device_open_end", cVar.f128206o).put("audio_device_open_start", cVar.f128207p).put("audio_device_open_end", cVar.f128208q).put("video_buffer_time", bVar3.f128151d.f128180C).put("audio_buffer_time", bVar3.f128151d.f128181D).put("download_speed", bVar3.f128151d.f128179B).put("stall_time", j3).put("first_sei_delay", bVar3.f128151d.f128186I).put("prepare_end", cVar.f128204m);
                            } else {
                                jSONObject = null;
                            }
                            if (bVar3.f128141as != null && bVar3.f128141as.equals("cmaf")) {
                                jSONObject.put("cmaf_mpd_connect_time", bVar3.f128151d.f128210s).put("cmaf_audio_firstseg_connect_time", bVar3.f128151d.f128211t).put("cmaf_video_firstseg_connect_time", bVar3.f128151d.f128212u).put("enable_skip_init_section", bVar3.f128151d.f128213v);
                            }
                            bVar3.f128150c.mo14307a(jSONObject);
                            StringBuilder sb = new StringBuilder("1.0:");
                            sb.append(bVar3.f128089R);
                            bVar3.f128082K = sb.toString();
                        } catch (JSONException unused2) {
                        }
                    }
                    C51302b bVar4 = eVar.f128353b;
                    if (!bVar4.f128154g) {
                        bVar4.f128149b.sendEmptyMessageDelayed(BaseNotice.HASHTAG, bVar4.f128153f);
                        if (bVar4.f128134al) {
                            bVar4.f128149b.sendEmptyMessageDelayed(102, 5000);
                        }
                        if (bVar4.f128126ad == 1 && !bVar4.f128125ac && bVar4.f128095X != null) {
                            bVar4.f128095X.mo101836a(103, 0);
                            bVar4.f128125ac = true;
                        }
                        bVar4.f128154g = true;
                    }
                    eVar.f128364m = true;
                    eVar.f128354c.mo14308a(true);
                } else {
                    eVar.f128353b.mo101825b(0);
                    eVar.f128354c.mo14308a(false);
                    if (eVar.f128353b.f128090S) {
                        eVar.f128354c.mo14309b();
                        eVar.f128353b.mo101822a(true);
                    }
                }
                eVar.f128356e.mo101942d();
            } else if (i != 251658247) {
                switch (i) {
                    case 701:
                        eVar.f128371t++;
                        eVar.f128372u = true;
                        eVar.f128354c.mo14303a();
                        if (!eVar.f128364m) {
                            eVar.f128284D = System.currentTimeMillis();
                            eVar.f128353b.mo101816a(i2, false);
                        } else {
                            eVar.f128353b.mo101816a(i2, true);
                        }
                        if ((!eVar.f128373v || eVar.f128358g.f128220c != 2 || eVar.f128371t < eVar.f128374w || !eVar.mo101915o()) && !eVar.f128377z) {
                            eVar.f128356e.mo101939a(true);
                            break;
                        }
                    case 702:
                        eVar.f128372u = false;
                        eVar.f128354c.mo14309b();
                        eVar.f128356e.mo101939a(false);
                        if (!eVar.f128364m || !eVar.f128353b.f128090S) {
                            if (!eVar.f128364m && eVar.f128284D != 0) {
                                eVar.f128285E = System.currentTimeMillis() - eVar.f128284D;
                                break;
                            }
                        } else {
                            eVar.f128353b.mo101822a(false);
                            break;
                        }
                        break;
                }
            } else {
                eVar.f128353b.f128081J++;
                StringBuilder sb2 = new StringBuilder();
                C51302b bVar5 = eVar.f128353b;
                sb2.append(bVar5.f128082K);
                sb2.append(",");
                double d = (double) i2;
                Double.isNaN(d);
                sb2.append(d / 1000.0d);
                sb2.append(":");
                sb2.append(System.currentTimeMillis());
                bVar5.f128082K = sb2.toString();
            }
            return false;
        }
    }

    /* renamed from: com.ss.f.a.e$h */
    static class C51349h implements OnVideoSizeChangedListener {

        /* renamed from: a */
        private final WeakReference<C51334e> f128423a;

        public C51349h(C51334e eVar) {
            this.f128423a = new WeakReference<>(eVar);
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            C51334e eVar = (C51334e) this.f128423a.get();
            if (!(eVar == null || eVar.f128359h == null || eVar.f128354c == null)) {
                eVar.f128354c.mo14304a(i, i2);
                C51302b bVar = eVar.f128353b;
                bVar.f128127ae = i;
                bVar.f128128af = i2;
            }
        }
    }

    /* renamed from: com.ss.f.a.e$i */
    static final class C51350i implements OnPreparedListener {

        /* renamed from: a */
        private final WeakReference<C51334e> f128424a;

        public C51350i(C51334e eVar) {
            this.f128424a = new WeakReference<>(eVar);
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            C51334e eVar = (C51334e) this.f128424a.get();
            if (eVar != null && eVar.f128362k == C51354m.PREPARING && eVar.f128359h != null) {
                C51302b bVar = eVar.f128353b;
                if (!bVar.f128088Q) {
                    bVar.f128151d.f128204m = System.currentTimeMillis();
                }
                eVar.f128362k = C51354m.PREPARED;
                if (eVar.f128290M == 0) {
                    eVar.f128359h.start();
                }
                eVar.f128354c.mo14311d();
            }
        }
    }

    /* renamed from: com.ss.f.a.e$j */
    static class C51351j implements Runnable {

        /* renamed from: a */
        private MediaPlayer f128425a;

        public final void run() {
            if (this.f128425a != null) {
                try {
                    this.f128425a.release();
                    this.f128425a = null;
                } catch (Exception unused) {
                }
            }
        }

        public C51351j(MediaPlayer mediaPlayer) {
            this.f128425a = mediaPlayer;
        }
    }

    /* renamed from: com.ss.f.a.e$k */
    static final class C51352k implements C51357a {

        /* renamed from: a */
        private final WeakReference<C51334e> f128426a;

        /* renamed from: a */
        public final void mo101931a() {
            C51334e eVar = (C51334e) this.f128426a.get();
            if (eVar != null && eVar.f128359h != null) {
                if (eVar.f128359h.isPlaying()) {
                    eVar.f128359h.stop();
                }
                C51331a aVar = eVar.f128361j;
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.f128273c);
                sb.append("/?Action=GetStreamPlayInfo&AppId=");
                sb.append(aVar.f128272b);
                sb.append("&Stream=");
                sb.append(aVar.f128271a);
                String sb2 = sb.toString();
                try {
                    String host = new URL(sb2).getHost();
                    eVar.f128355d.mo101862a(host, new C51319a(host, sb2) {

                        /* renamed from: a */
                        final /* synthetic */ String f128379a;

                        /* renamed from: b */
                        final /* synthetic */ String f128380b;

                        {
                            this.f128379a = r2;
                            this.f128380b = r3;
                        }

                        /* renamed from: a */
                        public final void mo101870a(String str, final String str2, final C51301a aVar, boolean z) {
                            if (this.f128379a != null && str != null && this.f128379a.equals(str)) {
                                C51334e.this.mo101889a((Runnable) new Runnable() {
                                    public final void run() {
                                        if (aVar != null) {
                                            aVar.code = -113;
                                            C51334e.this.f128356e.mo101938a(aVar);
                                            return;
                                        }
                                        String a = C51334e.this.f128355d.mo101860a(C513362.this.f128380b, str2, null);
                                        C51334e eVar = C51334e.this;
                                        String str = C513362.this.f128379a;
                                        String str2 = C513362.this.f128380b;
                                        C51322c cVar = eVar.f128360i;
                                        C51345f fVar = new C51345f(eVar, str2);
                                        if (!TextUtils.isEmpty(str)) {
                                            if (cVar.f128262a != null) {
                                                cVar.mo101875a();
                                                cVar.f128264c = cVar.f128262a.submit(new Runnable(a, str, fVar) {

                                                    /* renamed from: a */
                                                    final /* synthetic */ String f128265a;

                                                    /* renamed from: b */
                                                    final /* synthetic */ String f128266b;

                                                    /* renamed from: c */
                                                    final /* synthetic */ C51325a f128267c;

                                                    public final void run() {
                                                        C51328f.m110388a(C51322c.this.f128263b, this.f128265a, this.f128266b, new C51329a() {
                                                            /* renamed from: a */
                                                            public final void mo101867a(C51301a aVar) {
                                                                C513231.this.f128267c.mo101877a(aVar);
                                                            }

                                                            /* renamed from: a */
                                                            public final void mo101868a(JSONObject jSONObject) {
                                                                C513231.this.f128267c.mo101878a(new C51309c(jSONObject.optJSONObject("Result")));
                                                            }
                                                        });
                                                    }

                                                    {
                                                        this.f128265a = r2;
                                                        this.f128266b = r3;
                                                        this.f128267c = r4;
                                                    }
                                                });
                                                return;
                                            }
                                            throw new IllegalStateException("mExecutor should not be null");
                                        }
                                    }
                                });
                            }
                        }
                    });
                } catch (MalformedURLException unused) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("liveInfoAPI", sb2);
                    eVar.f128356e.mo101938a(new C51301a(-106, "live info api invalid", hashMap));
                }
            }
        }

        /* renamed from: b */
        public final void mo101934b() {
            int i;
            C51334e eVar = (C51334e) this.f128426a.get();
            if (eVar != null && eVar.f128359h != null) {
                String str = null;
                if (eVar.f128358g.f128220c == 1) {
                    C51308b bVar = eVar.f128358g;
                    bVar.f128221d++;
                    if (!(bVar.f128219b == null || bVar.f128219b.length == 0)) {
                        if (bVar.f128221d < bVar.f128219b.length) {
                            i = bVar.f128221d;
                        } else {
                            i = 0;
                        }
                        str = bVar.f128219b[i];
                    }
                } else if (eVar.f128358g.f128220c == 2) {
                    str = eVar.f128358g.mo101841a(eVar.f128281A, eVar.f128283C, eVar.f128282B);
                }
                eVar.f128353b.f128158k = str;
                if (!eVar.f128365n) {
                    eVar.f128365n = true;
                    eVar.f128353b.mo101817a(eVar.f128359h.getLongOption(314, 0));
                }
                eVar.mo101901d();
                if (eVar.f128362k == C51354m.PREPARED) {
                    eVar.mo101904e(str);
                    return;
                }
                eVar.mo101905f();
                eVar.mo101904e(str);
            }
        }

        public C51352k(C51334e eVar) {
            this.f128426a = new WeakReference<>(eVar);
        }

        /* renamed from: a */
        public final void mo101932a(C51301a aVar) {
            C51334e eVar = (C51334e) this.f128426a.get();
            if (eVar != null && eVar.f128359h != null) {
                eVar.f128354c.mo14305a(aVar);
                eVar.f128360i.mo101875a();
                eVar.f128356e.mo101942d();
            }
        }

        /* renamed from: a */
        public final void mo101933a(boolean z) {
            C51334e eVar = (C51334e) this.f128426a.get();
            if (eVar != null && eVar.f128359h != null) {
                new StringBuilder("onRetryResetPlayer ").append(false);
                if (!eVar.f128365n) {
                    eVar.f128365n = true;
                    eVar.f128353b.mo101817a(eVar.f128359h.getLongOption(314, 0));
                }
                eVar.mo101901d();
                String str = null;
                if (eVar.f128358g.f128220c == 1) {
                    if (eVar.f128358g.mo101840a() != null) {
                        str = eVar.f128358g.mo101840a().f128226a;
                    }
                } else if (eVar.f128358g.f128220c == 2) {
                    str = eVar.f128358g.mo101841a(eVar.f128281A, eVar.f128283C, eVar.f128282B);
                }
                eVar.f128353b.f128158k = str;
                if (eVar.f128362k == C51354m.PREPARED) {
                    eVar.mo101904e(str);
                    return;
                }
                eVar.mo101905f();
                eVar.mo101904e(str);
            }
        }
    }

    /* renamed from: com.ss.f.a.e$l */
    static class C51353l implements ThreadFactory {
        private C51353l() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "VideoLiveManager");
            thread.setPriority(10);
            return thread;
        }
    }

    /* renamed from: com.ss.f.a.e$m */
    enum C51354m {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED
    }

    /* renamed from: a */
    public final void mo101889a(Runnable runnable) {
        this.f128304a.post(runnable);
    }

    /* renamed from: a */
    public final void mo101892a(C51310d[] dVarArr) {
        new StringBuilder("setPlayUrls, sdkParam:").append(dVarArr[0].f128228c);
        mo101906f("setPlayURLS");
        this.f128358g.mo101843a(dVarArr);
        if (this.f128346at != null && this.f128358g.mo101840a().f128226a != this.f128346at) {
            m110400i("setPlayURLs");
        }
    }

    /* renamed from: a */
    public final boolean mo101894a(String str) {
        new StringBuilder("playResolution:").append(str);
        mo101906f("playResolution");
        if (!this.f128358g.mo101845a(str)) {
            return false;
        }
        String a = this.f128358g.mo101841a(str, this.f128283C, "main");
        C51302b bVar = this.f128353b;
        String str2 = this.f128346at;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f128281A);
        sb.append("_to_");
        sb.append(str);
        bVar.mo101820a(str2, a, sb.toString(), 0);
        if (this.f128281A != str) {
            mo101901d();
            mo101905f();
            this.f128281A = str;
            this.f128282B = "main";
            this.f128353b.f128158k = a;
            m110398g(a);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo101891a(boolean z) {
        if (this.f128353b != null) {
            this.f128353b.f128160m = z;
        }
    }

    /* renamed from: a */
    public final void mo101888a(Boolean bool) {
        this.f128357f.mo101879a(bool.booleanValue());
    }

    /* renamed from: a */
    public final void mo101887a(C51305c cVar, int i) {
        C51305c cVar2 = cVar;
        int i2 = i;
        if (cVar2 != null && this.f128359h != null) {
            if (i2 == 0 || i2 == 2) {
                cVar2.f128195d = this.f128359h.getLongOption(68, -1);
                cVar2.f128209r = this.f128359h.getLongOption(318, -1);
                cVar2.f128196e = this.f128359h.getLongOption(69, -1);
                cVar2.f128197f = this.f128359h.getLongOption(70, -1);
                cVar2.f128198g = this.f128359h.getLongOption(75, -1);
                cVar2.f128199h = this.f128359h.getLongOption(76, -1);
                cVar2.f128200i = this.f128359h.getLongOption(77, -1);
                cVar2.f128201j = this.f128359h.getLongOption(78, -1);
                cVar2.f128205n = this.f128359h.getLongOption(155, -1);
                cVar2.f128206o = this.f128359h.getLongOption(162, -1);
                cVar2.f128207p = this.f128359h.getLongOption(156, -1);
                cVar2.f128208q = this.f128359h.getLongOption(163, -1);
                cVar2.f128179B = (this.f128359h.getLongOption(63, 0) * 8) / 1000;
                cVar2.f128181D = this.f128359h.getLongOption(73, 0);
                cVar2.f128180C = this.f128359h.getLongOption(72, 0);
                if (i2 == 0) {
                    cVar2.f128182E = cVar2.f128179B;
                    cVar2.f128183F = cVar2.f128180C;
                    cVar2.f128184G = cVar2.f128181D;
                    cVar2.f128191N = this.f128355d.mo101865c();
                    cVar2.f128203l = this.f128359h.getLongOption(210, -1);
                    cVar2.f128202k = System.currentTimeMillis();
                    cVar2.f128210s = this.f128359h.getLongOption(452, -1);
                    cVar2.f128211t = this.f128359h.getLongOption(453, -1);
                    cVar2.f128212u = this.f128359h.getLongOption(454, -1);
                    cVar2.f128213v = (long) this.f128326aV;
                }
                if (!this.f128365n && i2 == 2) {
                    cVar2.f128185H = this.f128359h.getLongOption(314, 0);
                }
            } else if (i2 == 1) {
                cVar2.f128214w = this.f128359h.getLongOption(45, 0);
                cVar2.f128215x = this.f128359h.getLongOption(46, 0);
                cVar2.f128178A = this.f128359h.getFloatOption(NormalGiftView.MASK_TRANSLATE_VALUE, 0.0f);
                cVar2.f128179B = (this.f128359h.getLongOption(63, 0) * 8) / 1000;
                cVar2.f128181D = this.f128359h.getLongOption(73, 0);
                cVar2.f128180C = this.f128359h.getLongOption(72, 0);
                cVar2.f128217z = (long) this.f128359h.getCurrentPosition();
                cVar2.f128216y = System.currentTimeMillis();
                cVar2.f128191N = this.f128355d.mo101865c();
            } else if (i2 == 3) {
                cVar2.f128178A = this.f128359h.getFloatOption(NormalGiftView.MASK_TRANSLATE_VALUE, 0.0f);
                cVar2.f128179B = (this.f128359h.getLongOption(63, 0) * 8) / 1000;
                cVar2.f128181D = this.f128359h.getLongOption(73, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101890a(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "prepareToPlay:"
            r0.<init>(r1)
            r0.append(r5)
            if (r5 == 0) goto L_0x00e4
            com.ss.ttm.player.MediaPlayer r0 = r4.f128359h
            if (r0 != 0) goto L_0x0012
            goto L_0x00e4
        L_0x0012:
            com.ss.f.a.e$m r0 = r4.f128362k
            com.ss.f.a.e$m r1 = com.p683ss.p2568f.p2569a.C51334e.C51354m.PREPARED
            r2 = 1
            if (r0 != r1) goto L_0x0051
            com.ss.f.a.e$m r0 = com.p683ss.p2568f.p2569a.C51334e.C51354m.INITIALIZED
            r4.f128362k = r0
            com.ss.ttm.player.MediaPlayer r0 = r4.f128359h
            r0.reset()
            int r0 = r4.f128367p
            if (r0 != r2) goto L_0x0051
            java.lang.String r0 = r4.f128368q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = r4.f128345as
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0051
            boolean r0 = r4.f128369r
            if (r0 != 0) goto L_0x0051
            com.ss.ttm.player.MediaPlayer r0 = r4.f128359h
            r1 = 17
            java.lang.String r3 = r4.f128345as
            r0.setStringOption(r1, r3)
            com.ss.ttm.player.MediaPlayer r0 = r4.f128359h
            r1 = 14
            r0.setIntOption(r1, r2)
            com.ss.ttm.player.MediaPlayer r0 = r4.f128359h
            java.lang.String r1 = r4.f128368q
            r0.setCacheFile(r1, r2)
        L_0x0051:
            int r0 = r4.f128321aQ     // Catch:{ Exception -> 0x00bc }
            int r0 = r0 + r2
            r4.f128321aQ = r0     // Catch:{ Exception -> 0x00bc }
            int r0 = r4.f128321aQ     // Catch:{ Exception -> 0x00bc }
            java.lang.String r0 = r4.m110396a(r5, r0)     // Catch:{ Exception -> 0x00bc }
            com.ss.ttm.player.MediaPlayer r5 = r4.f128359h     // Catch:{ Exception -> 0x00ba }
            android.content.Context r1 = r4.f128292O     // Catch:{ Exception -> 0x00ba }
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x00ba }
            r5.setDataSource(r1, r3, r6)     // Catch:{ Exception -> 0x00ba }
            android.view.SurfaceHolder r5 = r4.f128297T
            if (r5 == 0) goto L_0x0073
            com.ss.ttm.player.MediaPlayer r5 = r4.f128359h
            android.view.SurfaceHolder r6 = r4.f128297T
            r5.setDisplay(r6)
            goto L_0x007e
        L_0x0073:
            android.view.Surface r5 = r4.f128298U
            if (r5 == 0) goto L_0x007e
            com.ss.ttm.player.MediaPlayer r5 = r4.f128359h
            android.view.Surface r6 = r4.f128298U
            r5.setSurface(r6)
        L_0x007e:
            com.ss.ttm.player.MediaPlayer r5 = r4.f128359h
            r5.setScreenOnWhilePlaying(r2)
            com.ss.f.a.e$m r5 = r4.f128362k
            com.ss.f.a.e$m r6 = com.p683ss.p2568f.p2569a.C51334e.C51354m.INITIALIZED
            if (r5 == r6) goto L_0x008a
            return
        L_0x008a:
            com.ss.ttm.player.MediaPlayer r5 = r4.f128359h     // Catch:{ Exception -> 0x0094 }
            r5.prepareAsync()     // Catch:{ Exception -> 0x0094 }
            com.ss.f.a.e$m r5 = com.p683ss.p2568f.p2569a.C51334e.C51354m.PREPARING     // Catch:{ Exception -> 0x0094 }
            r4.f128362k = r5     // Catch:{ Exception -> 0x0094 }
            return
        L_0x0094:
            r5 = move-exception
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r1 = "url"
            r6.put(r1, r0)
            com.ss.f.a.a.a r0 = new com.ss.f.a.a.a
            r1 = -101(0xffffffffffffff9b, float:NaN)
            java.lang.String r5 = r5.getMessage()
            r0.<init>(r1, r5, r6)
            boolean r5 = r4.f128377z
            if (r5 == 0) goto L_0x00b4
            com.ss.f.a.a r5 = r4.f128354c
            r5.mo14305a(r0)
            return
        L_0x00b4:
            com.ss.f.a.e.a r5 = r4.f128356e
            r5.mo101938a(r0)
            return
        L_0x00ba:
            r5 = move-exception
            goto L_0x00bf
        L_0x00bc:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L_0x00bf:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r1 = "url"
            r6.put(r1, r0)
            com.ss.f.a.a.a r0 = new com.ss.f.a.a.a
            r1 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.String r5 = r5.getMessage()
            r0.<init>(r1, r5, r6)
            boolean r5 = r4.f128377z
            if (r5 == 0) goto L_0x00de
            com.ss.f.a.a r5 = r4.f128354c
            r5.mo14305a(r0)
            return
        L_0x00de:
            com.ss.f.a.e.a r5 = r4.f128356e
            r5.mo101938a(r0)
            return
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p2568f.p2569a.C51334e.mo101890a(java.lang.String, java.util.Map):void");
    }

    /* renamed from: a */
    public final boolean mo101893a(int i) {
        if (this.f128282B.equals("main")) {
            String a = this.f128358g.mo101841a(this.f128281A, this.f128283C, "backup");
            if (a != null) {
                this.f128353b.mo101820a(this.f128346at, a, "main_to_backup", i);
                this.f128353b.f128158k = a;
                this.f128346at = a;
                this.f128282B = "backup";
                mo101905f();
                mo101904e(a);
                this.f128371t = 0;
                return true;
            }
        } else if (this.f128282B.equals("backup")) {
            String a2 = this.f128358g.mo101841a(this.f128281A, this.f128283C, "main");
            if (a2 != null) {
                this.f128353b.mo101820a(this.f128346at, a2, "backup_to_main", i);
                this.f128353b.f128158k = a2;
                this.f128346at = a2;
                this.f128282B = "main";
                mo101905f();
                mo101904e(a2);
                this.f128371t = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo101880a() {
        this.f128307aC = true;
        this.f128353b.f128134al = true;
    }

    /* renamed from: f */
    public final void mo101905f() {
        if (this.f128359h != null) {
            this.f128359h.reset();
        }
        this.f128362k = C51354m.INITIALIZED;
    }

    /* renamed from: i */
    public final boolean mo101909i() {
        if (this.f128359h == null || !this.f128359h.isOSPlayer()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo101910j() {
        if (this.f128359h == null || !this.f128359h.isPlaying()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final int mo101911k() {
        if (this.f128359h != null) {
            return this.f128359h.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo101912l() {
        if (this.f128359h != null) {
            return this.f128359h.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: m */
    public final String mo101913m() {
        return this.f128359h.getStringOption(5002);
    }

    /* renamed from: n */
    public final JSONObject mo101914n() {
        if (this.f128353b == null) {
            return null;
        }
        return this.f128353b.mo101834e();
    }

    /* renamed from: c */
    public final void mo101898c() {
        mo101906f("stop");
        m110397a(true, "stop");
        this.f128356e.mo101941c();
    }

    /* renamed from: d */
    public final void mo101901d() {
        if (this.f128359h != null && (this.f128362k == C51354m.PREPARED || this.f128362k == C51354m.PREPARING)) {
            this.f128359h.stop();
        }
        this.f128362k = C51354m.INITIALIZED;
        new StringBuilder("prepareState: ").append(this.f128362k);
    }

    /* renamed from: e */
    public final void mo101903e() {
        mo101906f("reset");
        if (this.f128359h != null) {
            m110400i("reset");
            this.f128353b.mo101829c();
            this.f128345as = null;
            this.f128368q = null;
            this.f128373v = false;
            this.f128375x = true;
            this.f128281A = "origin";
            this.f128348av = -1;
            this.f128283C = "flv";
            this.f128282B = "main";
            this.f128376y = null;
            this.f128377z = false;
            this.f128364m = false;
        }
    }

    /* renamed from: g */
    public final void mo101907g() {
        mo101906f("release");
        if (this.f128299V == C51341b.PLAYED) {
            m110397a(true, "release");
        }
        this.f128291N.shutdown();
        this.f128304a.removeCallbacksAndMessages(null);
        if (this.f128359h != null) {
            this.f128359h.prevClose();
            this.f128359h.release();
            this.f128359h = null;
            this.f128353b.mo101829c();
            this.f128362k = C51354m.IDLE;
            this.f128299V = C51341b.IDLE;
        }
    }

    /* renamed from: b */
    public final void mo101895b() {
        String str;
        mo101906f("play");
        if (this.f128299V == C51341b.PLAYED) {
            this.f128353b.mo101826b("play");
            return;
        }
        this.f128299V = C51341b.PLAYED;
        String str2 = null;
        if (this.f128358g != null) {
            if (this.f128358g.f128220c == 1 && this.f128358g.mo101840a() != null) {
                str2 = this.f128358g.mo101840a().f128226a;
            } else if (this.f128358g.f128220c == 2) {
                str2 = this.f128358g.mo101841a(this.f128281A, this.f128283C, this.f128282B);
            }
        }
        if (str2 != null) {
            this.f128321aQ = -1;
            this.f128322aR = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            C51302b bVar = this.f128353b;
            if (this.f128377z) {
                str = this.f128376y;
            } else {
                str = str2;
            }
            bVar.mo101819a(str, this.f128355d.mo101865c());
            m110398g(str2);
            this.f128356e.mo101940b();
        }
    }

    /* renamed from: q */
    private void m110402q() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.f128296S != 0) {
            z = true;
        } else {
            z = false;
        }
        TTPlayerConfiger.setValue(1, z);
        if (this.f128296S == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        TTPlayerConfiger.setValue(2, z2);
        TTPlayerConfiger.setValue(6, false);
        TTPlayerConfiger.setValue(11, true);
        if (this.f128359h != null) {
            boolean isOSPlayer = this.f128359h.isOSPlayer();
            if (this.f128296S == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (isOSPlayer ^ z3) {
                this.f128359h.releaseAsync();
                this.f128359h = null;
            }
        }
        if (this.f128359h == null) {
            this.f128359h = C51332b.m110391a(this.f128292O, this.f128336aj);
            if (!(this.f128359h.getPlayerType() == 1 || this.f128359h.getPlayerType() == 2)) {
                this.f128328ab = 0;
                this.f128308aD = 0;
                this.f128309aE = 0;
            }
            m110401p();
            this.f128359h.setOnPreparedListener(new C51350i(this));
            this.f128359h.setOnErrorListener(new C51343d(this));
            this.f128359h.setOnInfoListener(new C51348g(this));
            this.f128359h.setOnCompletionListener(new C51342c(this));
            this.f128359h.setOnExternInfoListener(new C51344e(this));
            this.f128359h.setOnVideoSizeChangedListener(new C51349h(this));
        }
        if (this.f128359h.isOSPlayer()) {
            this.f128353b.f128159l = "-1";
        } else {
            this.f128353b.f128159l = TTPlayerConfiger.getValue(14, "0");
        }
        C51315a aVar = this.f128355d;
        if (!this.f128294Q || aVar.f128238a == null) {
            z4 = false;
        }
        aVar.f128239b = z4;
        if (this.f128360i == null) {
            this.f128360i = new C51322c(this.f128291N, this.f128293P);
        }
        this.f128357f.f128276b = this.f128359h;
    }

    /* renamed from: h */
    public final void mo101908h() {
        mo101906f("releaseAsync");
        if (this.f128299V == C51341b.PLAYED) {
            m110397a(false, "releaseAsync");
        }
        this.f128291N.shutdown();
        this.f128304a.removeCallbacksAndMessages(null);
        if (this.f128359h != null) {
            if (this.f128297T != null) {
                this.f128359h.setDisplay(null);
            }
            MediaPlayer mediaPlayer = this.f128359h;
            this.f128359h = null;
            this.f128353b.mo101829c();
            this.f128362k = C51354m.IDLE;
            this.f128299V = C51341b.IDLE;
            C51359a.m110469a((Runnable) new C51351j(mediaPlayer));
        }
    }

    /* renamed from: o */
    public final boolean mo101915o() {
        if (this.f128281A == "ld") {
            return false;
        }
        if (this.f128348av == -1) {
            int i = 0;
            while (true) {
                if (i >= C51330d.f128270a.length) {
                    break;
                } else if (C51330d.f128270a[i].equals(this.f128281A)) {
                    this.f128348av = i;
                    break;
                } else {
                    i++;
                }
            }
        }
        int i2 = this.f128348av + 1;
        while (i2 < C51330d.f128270a.length && !this.f128358g.mo101845a(C51330d.f128270a[i2])) {
            i2++;
        }
        if (i2 >= C51330d.f128270a.length) {
            return false;
        }
        String a = this.f128358g.mo101841a(C51330d.f128270a[i2], this.f128283C, "main");
        if (a == null) {
            return false;
        }
        C51302b bVar = this.f128353b;
        String str = this.f128346at;
        StringBuilder sb = new StringBuilder("auto_");
        sb.append(this.f128281A);
        sb.append("_to_");
        sb.append(C51330d.f128270a[i2]);
        bVar.mo101820a(str, a, sb.toString(), -115);
        this.f128346at = a;
        this.f128348av = i2;
        this.f128281A = C51330d.f128270a[i2];
        this.f128353b.f128158k = this.f128346at;
        this.f128282B = "main";
        this.f128371t = 0;
        mo101904e(a);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05b5  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m110401p() {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = ""
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            int r3 = r0.f128303Z
            r4 = 36
            r2.setIntOption(r4, r3)
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 5000(0x1388, float:7.006E-42)
            r2.setIntOption(r3, r4)
            int r2 = r0.f128314aJ
            r3 = 1
            if (r2 != r3) goto L_0x0022
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 52
            r2.setIntOption(r4, r3)
        L_0x0022:
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 64
            r5 = 0
            r2.setIntOption(r4, r5)
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 220(0xdc, float:3.08E-43)
            int r6 = r0.f128313aI
            r2.setIntOption(r4, r6)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r4 = r0.f128313aI
            r2.f128138ap = r4
            android.content.Context r2 = f128280I
            r4 = 4
            r6 = 0
            r7 = 2
            r8 = 0
            r10 = -1
            if (r2 == 0) goto L_0x0175
            boolean r2 = f128278G
            if (r2 == 0) goto L_0x004b
            org.json.JSONObject r2 = f128279H
            if (r2 != 0) goto L_0x0058
        L_0x004b:
            android.content.Context r2 = f128280I     // Catch:{ JSONException -> 0x0056 }
            com.bytedance.s.c r2 = com.bytedance.p836s.C12825c.m25728a(r2)     // Catch:{ JSONException -> 0x0056 }
            org.json.JSONObject r2 = r2.f33579b     // Catch:{ JSONException -> 0x0056 }
            f128279H = r2     // Catch:{ JSONException -> 0x0056 }
            goto L_0x0058
        L_0x0056:
            f128279H = r6
        L_0x0058:
            org.json.JSONObject r2 = f128279H
            if (r2 == 0) goto L_0x0175
            org.json.JSONObject r2 = f128279H
            java.lang.String r11 = "live_settings_state"
            long r11 = r2.optLong(r11, r8)
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0175
            r13 = 1
            long r15 = r11 & r13
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00c7
            org.json.JSONObject r2 = f128279H
            java.lang.String r15 = "live_hurry_type"
            int r2 = r2.optInt(r15, r10)
            r0.f128340an = r2
            int r2 = r0.f128340an
            if (r2 == r10) goto L_0x00c7
            long r15 = r11 >> r3
            long r15 = r15 & r13
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x008f
            org.json.JSONObject r2 = f128279H
            java.lang.String r15 = "live_hurry_time"
            int r2 = r2.optInt(r15, r10)
            r0.f128341ao = r2
        L_0x008f:
            long r15 = r11 >> r7
            long r15 = r15 & r13
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00a3
            org.json.JSONObject r2 = f128279H
            java.lang.String r15 = "live_hurry_speed"
            double r8 = r2.optDouble(r15, r6)
            float r2 = (float) r8
            r0.f128342ap = r2
        L_0x00a3:
            r2 = 3
            long r8 = r11 >> r2
            long r8 = r8 & r13
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00b5
            org.json.JSONObject r2 = f128279H
            java.lang.String r8 = "live_slow_play_time"
            int r2 = r2.optInt(r8, r10)
            r0.f128343aq = r2
        L_0x00b5:
            long r8 = r11 >> r4
            long r8 = r8 & r13
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00c7
            org.json.JSONObject r2 = f128279H
            java.lang.String r8 = "live_slow_play_speed"
            double r6 = r2.optDouble(r8, r6)
            float r2 = (float) r6
            r0.f128344ar = r2
        L_0x00c7:
            r2 = 5
            long r6 = r11 >> r2
            long r6 = r6 & r13
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00d9
            org.json.JSONObject r2 = f128279H
            java.lang.String r6 = "live_h264_hardware_decode_enable"
            int r2 = r2.optInt(r6, r10)
            r0.f128308aD = r2
        L_0x00d9:
            r2 = 6
            long r6 = r11 >> r2
            long r6 = r6 & r13
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00eb
            org.json.JSONObject r2 = f128279H
            java.lang.String r6 = "live_h265_hardware_decode_enable"
            int r2 = r2.optInt(r6, r10)
            r0.f128309aE = r2
        L_0x00eb:
            r2 = 7
            long r6 = r11 >> r2
            long r6 = r6 & r13
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00fd
            org.json.JSONObject r2 = f128279H
            java.lang.String r6 = "live_max_cache_seconds"
            int r2 = r2.optInt(r6, r10)
            r0.f128310aF = r2
        L_0x00fd:
            r2 = 8
            long r6 = r11 >> r2
            long r6 = r6 & r13
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0110
            org.json.JSONObject r2 = f128279H
            java.lang.String r6 = "live_buffering_end_seconds"
            int r2 = r2.optInt(r6, r10)
            r0.f128333ag = r2
        L_0x0110:
            r2 = 9
            long r6 = r11 >> r2
            long r6 = r6 & r13
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0123
            org.json.JSONObject r2 = f128279H
            java.lang.String r6 = "live_buffering_time_out"
            int r2 = r2.optInt(r6, r10)
            r0.f128334ah = r2
        L_0x0123:
            r2 = 10
            long r6 = r11 >> r2
            long r6 = r6 & r13
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0136
            org.json.JSONObject r2 = f128279H
            java.lang.String r6 = "live_network_time_out"
            int r2 = r2.optInt(r6, r10)
            r0.f128335ai = r2
        L_0x0136:
            r2 = 11
            long r6 = r11 >> r2
            long r6 = r6 & r13
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0149
            org.json.JSONObject r2 = f128279H
            java.lang.String r6 = "live_sharp_enable"
            int r2 = r2.optInt(r6, r10)
            r0.f128337ak = r2
        L_0x0149:
            r2 = 12
            long r6 = r11 >> r2
            long r6 = r6 & r13
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x015c
            org.json.JSONObject r2 = f128279H
            java.lang.String r6 = "live_async_init_codec_enable"
            int r2 = r2.optInt(r6, r10)
            r0.f128339am = r2
        L_0x015c:
            r2 = 13
            long r6 = r11 >> r2
            long r6 = r6 & r13
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0175
            org.json.JSONObject r2 = f128279H
            java.lang.String r6 = "live_upload_session_series_enable"
            boolean r2 = r2.optBoolean(r6, r5)
            r0.f128307aC = r2
            com.ss.f.a.a.b r2 = r0.f128353b
            boolean r6 = r0.f128307aC
            r2.f128134al = r6
        L_0x0175:
            com.ss.f.a.b r2 = r0.f128295R
            if (r2 == 0) goto L_0x026d
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r6 = "live_start_play_buffer_thres"
            r7 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            java.lang.Object r2 = r2.mo14302a(r6, r9)
            java.lang.Long r2 = (java.lang.Long) r2
            long r6 = r2.longValue()
            r0.f128316aL = r6
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r6 = "live_check_buffering_end_ignore_video"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.mo14302a(r6, r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f128317aM = r2
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r6 = "live_direct_start_after_prepared"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.mo14302a(r6, r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f128290M = r2
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r6 = "live_check_buffering_end_advance"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.mo14302a(r6, r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f128318aN = r2
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r6 = "live_enable_resolution_degrade"
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.mo14302a(r6, r7)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.f128373v = r2
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r6 = "live_stall_count_thres_for_degrade"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.mo14302a(r6, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f128374w = r2
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r4 = "live_enable_tcp_fast_open"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.mo14302a(r4, r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f128319aO = r2
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r4 = "live_enable_check_packet_corrupt"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.mo14302a(r4, r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f128320aP = r2
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r4 = "live_protocol_start_offset"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.mo14302a(r4, r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f128325aU = r2
            com.ss.f.a.b r2 = r0.f128295R
            java.lang.String r4 = "live_cmaf_skip_init_section"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.mo14302a(r4, r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f128326aV = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "mEnableResolutionAutoDegrade:"
            r2.<init>(r4)
            boolean r4 = r0.f128373v
            r2.append(r4)
            java.lang.String r4 = " mStallCountThresOfResolutionDegrade:"
            r2.append(r4)
            int r4 = r0.f128374w
            r2.append(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "mLiveStartOffset:"
            r2.<init>(r4)
            int r4 = r0.f128325aU
            r2.append(r4)
            java.lang.String r4 = " mEnableSkipInitSection:"
            r2.append(r4)
            int r4 = r0.f128326aV
            r2.append(r4)
        L_0x026d:
            com.ss.f.a.b.b r2 = r0.f128358g
            java.lang.String r4 = r0.f128281A
            java.lang.String r6 = r0.f128282B
            int r7 = r2.f128220c
            r8 = 2
            if (r7 != r8) goto L_0x0284
            com.ss.f.a.b.c r7 = r2.f128218a
            if (r7 != 0) goto L_0x027d
            goto L_0x0284
        L_0x027d:
            com.ss.f.a.b.c r2 = r2.f128218a
            java.lang.String r6 = r2.mo101853b(r4, r6)
            goto L_0x0285
        L_0x0284:
            r6 = 0
        L_0x0285:
            if (r6 == 0) goto L_0x02cd
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02cc }
            r2.<init>(r6)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = "Auto"
            boolean r4 = r2.has(r4)     // Catch:{ JSONException -> 0x02cc }
            if (r4 == 0) goto L_0x02bb
            java.lang.String r4 = "Auto"
            org.json.JSONObject r4 = r2.getJSONObject(r4)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r6 = "Enable"
            int r4 = r4.optInt(r6)     // Catch:{ JSONException -> 0x02cc }
            if (r4 != r3) goto L_0x02a4
            r4 = 1
            goto L_0x02a5
        L_0x02a4:
            r4 = 0
        L_0x02a5:
            r0.f128373v = r4     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = "Auto"
            org.json.JSONObject r4 = r2.getJSONObject(r4)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r6 = "Demotion"
            org.json.JSONObject r4 = r4.getJSONObject(r6)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r6 = "StallCount"
            int r4 = r4.optInt(r6)     // Catch:{ JSONException -> 0x02cc }
            r0.f128374w = r4     // Catch:{ JSONException -> 0x02cc }
        L_0x02bb:
            java.lang.String r4 = "FramesDrop"
            boolean r4 = r2.has(r4)     // Catch:{ JSONException -> 0x02cc }
            if (r4 == 0) goto L_0x02cd
            java.lang.String r4 = "FramesDrop"
            int r2 = r2.optInt(r4)     // Catch:{ JSONException -> 0x02cc }
            r0.f128350ax = r2     // Catch:{ JSONException -> 0x02cc }
            goto L_0x02cd
        L_0x02cc:
        L_0x02cd:
            int r2 = r0.f128337ak
            if (r2 != r3) goto L_0x02e2
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 189(0xbd, float:2.65E-43)
            int r6 = r0.f128337ak
            r2.setIntOption(r4, r6)
            com.ss.f.a.a.b r2 = r0.f128353b
            if (r2 == 0) goto L_0x02e2
            com.ss.f.a.a.b r2 = r0.f128353b
            r2.f128091T = r3
        L_0x02e2:
            com.ss.f.a.b.b r2 = r0.f128358g
            int r2 = r2.f128220c
            r4 = 2
            if (r2 != r4) goto L_0x0300
            com.ss.f.a.b.b r2 = r0.f128358g
            java.lang.String r6 = r0.f128281A
            java.lang.String r7 = r0.f128282B
            int r8 = r2.f128220c
            if (r8 != r4) goto L_0x0313
            com.ss.f.a.b.c r4 = r2.f128218a
            if (r4 != 0) goto L_0x02f8
            goto L_0x0313
        L_0x02f8:
            com.ss.f.a.b.c r2 = r2.f128218a
            java.lang.String r2 = r2.mo101849a(r6, r7)
            r6 = r2
            goto L_0x0314
        L_0x0300:
            com.ss.f.a.b.b r2 = r0.f128358g
            int r2 = r2.f128220c
            if (r2 != r3) goto L_0x0313
            com.ss.f.a.b.b r2 = r0.f128358g
            com.ss.f.a.b.d r2 = r2.mo101840a()
            if (r2 == 0) goto L_0x0313
            java.lang.String r6 = r2.mo101855a()
            goto L_0x0314
        L_0x0313:
            r6 = 0
        L_0x0314:
            if (r6 == 0) goto L_0x0344
            if (r6 == 0) goto L_0x0327
            java.lang.String r2 = "h264"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0327
            int r2 = r0.f128308aD
            r0.f128328ab = r2
            r0.f128338al = r5
            goto L_0x033a
        L_0x0327:
            if (r6 == 0) goto L_0x0338
            java.lang.String r2 = "h265"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0338
            int r2 = r0.f128309aE
            r0.f128328ab = r2
            r0.f128338al = r3
            goto L_0x033a
        L_0x0338:
            r0.f128328ab = r5
        L_0x033a:
            com.ss.f.a.a.b r2 = r0.f128353b
            if (r6 == 0) goto L_0x033f
            goto L_0x0341
        L_0x033f:
            java.lang.String r6 = ""
        L_0x0341:
            r2.f128133ak = r6
            goto L_0x0346
        L_0x0344:
            r0.f128328ab = r5
        L_0x0346:
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 59
            int r6 = r0.f128328ab
            r2.setIntOption(r4, r6)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r4 = r0.f128328ab
            if (r4 != r3) goto L_0x0356
            r5 = 1
        L_0x0356:
            r2.f128074C = r5
            int r2 = r0.f128328ab
            if (r2 != r3) goto L_0x037e
            int r2 = r0.f128338al
            if (r2 == r10) goto L_0x037e
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 181(0xb5, float:2.54E-43)
            int r5 = r0.f128339am
            r2.setIntOption(r4, r5)
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 182(0xb6, float:2.55E-43)
            int r5 = r0.f128338al
            r2.setIntOption(r4, r5)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r4 = r0.f128339am
            r2.f128131ai = r4
            com.ss.f.a.a.b r2 = r0.f128353b
            int r4 = r0.f128338al
            r2.f128132aj = r4
        L_0x037e:
            int r2 = r0.f128332af
            if (r2 == r10) goto L_0x038f
            int r2 = r0.f128309aE
            if (r2 == r3) goto L_0x038f
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 67
            int r5 = r0.f128332af
            r2.setIntOption(r4, r5)
        L_0x038f:
            int r2 = r0.f128334ah
            if (r2 == r10) goto L_0x039c
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 81
            int r5 = r0.f128334ah
            r2.setIntOption(r4, r5)
        L_0x039c:
            float r2 = r0.f128342ap
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x03b2
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r5 = 80
            float r6 = r0.f128342ap
            r2.setFloatOption(r5, r6)
            com.ss.f.a.a.b r2 = r0.f128353b
            float r5 = r0.f128342ap
            r2.f128078G = r5
        L_0x03b2:
            int r2 = r0.f128367p
            if (r2 != r10) goto L_0x03e3
            java.lang.String r2 = r0.f128368q
            if (r2 == 0) goto L_0x03e3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r5 = java.lang.System.currentTimeMillis()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.f128345as = r2
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r5 = 17
            java.lang.String r6 = r0.f128345as
            r2.setStringOption(r5, r6)
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r5 = 14
            r2.setIntOption(r5, r3)
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            java.lang.String r5 = r0.f128368q
            r2.setCacheFile(r5, r3)
        L_0x03e3:
            int r2 = r0.f128340an
            if (r2 == r10) goto L_0x03f4
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r5 = 84
            int r6 = r0.f128340an
            r2.setIntOption(r5, r6)
            com.ss.f.a.a.b r2 = r0.f128353b
            r2.f128076E = r3
        L_0x03f4:
            int r2 = r0.f128340an
            if (r2 != 0) goto L_0x040b
            int r2 = r0.f128341ao
            if (r2 == 0) goto L_0x040b
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r5 = 15
            int r6 = r0.f128341ao
            r2.setIntOption(r5, r6)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r5 = r0.f128341ao
            r2.f128077F = r5
        L_0x040b:
            boolean r2 = r0.f128377z
            if (r2 == 0) goto L_0x0422
            java.lang.String r2 = r0.f128376y
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0422
            boolean r2 = r0.f128366o
            if (r2 == 0) goto L_0x0422
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            boolean r5 = r0.f128366o
            r2.setLooping(r5)
        L_0x0422:
            int r2 = r0.f128333ag
            if (r2 == r10) goto L_0x042f
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r5 = 86
            int r6 = r0.f128333ag
            r2.setIntOption(r5, r6)
        L_0x042f:
            int r2 = r0.f128343aq
            if (r2 == r10) goto L_0x0442
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r5 = 190(0xbe, float:2.66E-43)
            int r6 = r0.f128343aq
            r2.setIntOption(r5, r6)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r5 = r0.f128343aq
            r2.f128079H = r5
        L_0x0442:
            float r2 = r0.f128344ar
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0457
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 191(0xbf, float:2.68E-43)
            float r5 = r0.f128344ar
            r2.setFloatOption(r4, r5)
            com.ss.f.a.a.b r2 = r0.f128353b
            float r4 = r0.f128344ar
            r2.f128080I = r4
        L_0x0457:
            int r2 = r0.f128310aF
            if (r2 == r10) goto L_0x046a
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 198(0xc6, float:2.77E-43)
            int r5 = r0.f128310aF
            r2.setIntOption(r4, r5)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r4 = r0.f128310aF
            r2.f128135am = r4
        L_0x046a:
            int r2 = r0.f128311aG
            if (r2 == 0) goto L_0x047d
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 87
            int r5 = r0.f128311aG
            r2.setIntOption(r4, r5)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r4 = r0.f128311aG
            r2.f128136an = r4
        L_0x047d:
            long r4 = r0.f128316aL
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0494
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 309(0x135, float:4.33E-43)
            long r5 = r0.f128316aL
            r2.setLongOption(r4, r5)
            com.ss.f.a.a.b r2 = r0.f128353b
            long r4 = r0.f128316aL
            r2.f128083L = r4
        L_0x0494:
            int r2 = r0.f128317aM
            if (r2 != r3) goto L_0x04a7
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 310(0x136, float:4.34E-43)
            int r5 = r0.f128317aM
            r2.setIntOption(r4, r5)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r4 = r0.f128317aM
            r2.f128084M = r4
        L_0x04a7:
            int r2 = r0.f128290M
            if (r2 != r3) goto L_0x04ba
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 311(0x137, float:4.36E-43)
            int r5 = r0.f128290M
            r2.setIntOption(r4, r5)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r4 = r0.f128290M
            r2.f128085N = r4
        L_0x04ba:
            int r2 = r0.f128318aN
            if (r2 != r3) goto L_0x04cd
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 313(0x139, float:4.39E-43)
            int r5 = r0.f128318aN
            r2.setIntOption(r4, r5)
            com.ss.f.a.a.b r2 = r0.f128353b
            int r4 = r0.f128318aN
            r2.f128086O = r4
        L_0x04cd:
            int r2 = r0.f128312aH
            if (r2 != r3) goto L_0x04da
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 132(0x84, float:1.85E-43)
            int r5 = r0.f128312aH
            r2.setIntOption(r4, r5)
        L_0x04da:
            com.ss.f.a.a.b r2 = r0.f128353b
            boolean r4 = r0.f128307aC
            r2.f128134al = r4
            int r2 = r0.f128305aA
            if (r2 != r3) goto L_0x04fc
            com.ss.f.a.a.b r2 = r0.f128353b
            r2.f128126ad = r3
            com.ss.f.a.a.b$a r4 = r2.f128095X
            if (r4 != 0) goto L_0x04fc
            com.ss.f.a.a.b$a r4 = new com.ss.f.a.a.b$a
            r4.<init>(r2)
            r2.f128095X = r4
            com.ss.f.a.a.b$a r2 = r2.f128095X
            r4 = 104(0x68, float:1.46E-43)
            r5 = 0
            r2.mo101836a(r4, r5)
        L_0x04fc:
            long r4 = r0.f128347au
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0514
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 231(0xe7, float:3.24E-43)
            long r5 = r0.f128347au
            r2.setLongOption(r4, r5)
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 223(0xdf, float:3.12E-43)
            r2.setIntOption(r4, r3)
        L_0x0514:
            java.lang.String r2 = r0.f128349aw
            if (r2 == 0) goto L_0x0521
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 315(0x13b, float:4.41E-43)
            java.lang.String r5 = r0.f128349aw
            r2.setStringOption(r4, r5)
        L_0x0521:
            java.lang.String r2 = r0.f128349aw
            if (r2 == 0) goto L_0x0538
            java.lang.String r2 = r0.f128349aw
            java.lang.String r4 = "avph"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0538
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 159(0x9f, float:2.23E-43)
            int r5 = r0.f128350ax
            r2.setIntOption(r4, r5)
        L_0x0538:
            java.lang.String r2 = r0.f128349aw
            if (r2 == 0) goto L_0x0558
            java.lang.String r2 = r0.f128349aw
            java.lang.String r4 = "cmaf"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0558
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 450(0x1c2, float:6.3E-43)
            int r5 = r0.f128325aU
            r2.setIntOption(r4, r5)
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 451(0x1c3, float:6.32E-43)
            int r5 = r0.f128326aV
            r2.setIntOption(r4, r5)
        L_0x0558:
            int r2 = r0.f128319aO
            if (r2 != r3) goto L_0x057a
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            if (r2 == 0) goto L_0x057a
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r4 = 316(0x13c, float:4.43E-43)
            int r5 = r0.f128319aO
            r2.setIntOption(r4, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "live_enable_tcp_fast_open:1"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x057a:
            int r2 = r0.f128320aP
            if (r2 != r3) goto L_0x05a7
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            if (r2 == 0) goto L_0x05a7
            com.ss.ttm.player.MediaPlayer r2 = r0.f128359h
            r3 = 317(0x13d, float:4.44E-43)
            int r4 = r0.f128320aP
            r2.setIntOption(r3, r4)
            if (r1 == 0) goto L_0x05a7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x059e
            java.lang.String r1 = "live_enable_check_packet_corrupt:1"
            goto L_0x05a0
        L_0x059e:
            java.lang.String r1 = ",live_enable_check_packet_corrupt:1"
        L_0x05a0:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x05a7:
            com.ss.f.a.a.b r2 = r0.f128353b
            int r3 = r0.f128323aS
            r2.f128139aq = r3
            com.ss.f.a.a.b r2 = r0.f128353b
            int r3 = r1.length()
            if (r3 != 0) goto L_0x05b7
            java.lang.String r1 = "none"
        L_0x05b7:
            r2.f128142at = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p2568f.p2569a.C51334e.m110401p():void");
    }

    /* renamed from: a */
    public static C51340a m110395a(Context context) {
        return new C51340a(context);
    }

    /* renamed from: d */
    public final void mo101902d(String str) {
        this.f128353b.f128157j = str;
    }

    /* renamed from: i */
    private void m110400i(String str) {
        mo101901d();
        mo101905f();
        m110399h(str);
        this.f128281A = "origin";
        this.f128348av = -1;
        this.f128299V = C51341b.IDLE;
    }

    /* renamed from: f */
    public void mo101906f(String str) {
        if (this.f128323aS == 1 && Looper.myLooper() != Looper.getMainLooper() && this.f128353b != null) {
            this.f128353b.mo101831c(str);
        }
    }

    /* renamed from: c */
    public final void mo101899c(String str) {
        mo101906f("setLocalURL");
        if (!(str == null || str.equals(this.f128376y) || this.f128376y == null)) {
            mo101903e();
        }
        this.f128376y = str;
        this.f128377z = true;
    }

    /* renamed from: g */
    private void m110398g(String str) {
        if (this.f128362k == C51354m.PREPARED && this.f128359h != null) {
            if (this.f128370s != null) {
                this.f128353b.mo101821a(this.f128370s, false);
            }
            this.f128359h.start();
        } else if (this.f128362k == C51354m.IDLE || this.f128359h == null) {
            m110402q();
            this.f128362k = C51354m.INITIALIZED;
            if (!this.f128377z || TextUtils.isEmpty(this.f128376y)) {
                mo101904e(str);
            } else {
                this.f128353b.mo101824b();
                mo101890a(this.f128376y, null);
            }
        } else {
            m110401p();
            if (!this.f128377z || TextUtils.isEmpty(this.f128376y)) {
                mo101904e(str);
            } else {
                mo101890a(this.f128376y, null);
            }
        }
        this.f128363l = false;
    }

    /* renamed from: h */
    private void m110399h(String str) {
        if (this.f128360i != null) {
            this.f128360i.mo101875a();
        }
        if (this.f128355d != null) {
            this.f128355d.mo101861a();
        }
        if (!str.equals("reset") && this.f128299V == C51341b.PLAYED) {
            this.f128353b.mo101818a(str);
        }
        this.f128353b.mo101829c();
        this.f128356e.mo101942d();
        if (str.equals("reset")) {
            this.f128358g.mo101848b();
        }
        this.f128364m = false;
        this.f128284D = 0;
        this.f128285E = 0;
        this.f128371t = 0;
        this.f128363l = true;
        this.f128299V = C51341b.STOPPED;
        this.f128288K = false;
        this.f128289L = 0;
        this.f128372u = false;
        this.f128365n = false;
        this.f128304a.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    public final boolean mo101900c(int i) {
        if (this.f128346at != null && this.f128346at.startsWith("httpk")) {
            String replaceAll = this.f128346at.replaceAll("httpk", WebKitApi.SCHEME_HTTP).replaceAll(":(\\d+)/", "/");
            if (replaceAll != null) {
                this.f128353b.f128158k = replaceAll;
                this.f128353b.mo101820a(this.f128346at, replaceAll, "httpk_to_http", i);
                this.f128346at = replaceAll;
                mo101901d();
                mo101905f();
                mo101904e(this.f128346at);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo101896b(String str) {
        JSONObject jSONObject;
        String str2;
        new StringBuilder("setStreamInfo:").append(str);
        mo101906f("setStreamInfo");
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            m110400i("setStreamInfo");
            this.f128358g.mo101842a(new C51309c(jSONObject));
            String b = this.f128358g.mo101847b(this.f128281A, this.f128283C, this.f128282B);
            if (b != null) {
                if (b.equals("cmaf") && !this.f128324aT) {
                    try {
                        C51358f.m110468a("ttmcmaf");
                        this.f128324aT = true;
                    } catch (Throwable unused2) {
                        this.f128358g.mo101844a(1);
                        str2 = this.f128283C;
                        this.f128324aT = false;
                    }
                }
                str2 = b;
                this.f128349aw = str2;
                this.f128353b.mo101827b(b, this.f128349aw);
                return;
            }
            this.f128349aw = "flv";
            this.f128353b.mo101827b("none", this.f128349aw);
        }
    }

    /* renamed from: e */
    public final void mo101904e(final String str) {
        if (str != null && str.length() != 0) {
            this.f128353b.mo101821a("none", false);
            this.f128346at = str;
            final String a = this.f128355d.mo101859a(str);
            if (C51315a.m110361b(a) || !this.f128306aB) {
                this.f128353b.mo101823a(false, false);
                this.f128353b.mo101824b();
                this.f128353b.mo101821a(a, false);
                mo101890a(str, null);
                this.f128370s = a;
                return;
            }
            this.f128356e.f128439d = a;
            if (this.f128352az != null && this.f128356e.mo101936a() <= 3) {
                String a2 = C51199c.m110107a(a, this.f128352az);
                if (!TextUtils.isEmpty(a2)) {
                    this.f128353b.mo101823a(false, true);
                    String a3 = this.f128352az.mo101716a(a, a2);
                    if (a3 != null) {
                        this.f128353b.mo101833d(a3);
                    } else {
                        this.f128353b.mo101833d("sdk_previous_dns");
                    }
                    boolean b = this.f128352az.mo101721b(a);
                    if (b) {
                        this.f128353b.f128173z = b;
                    }
                    this.f128370s = a2;
                    this.f128353b.mo101824b();
                    this.f128353b.mo101821a(a2, false);
                    HashMap hashMap = new HashMap();
                    String a4 = this.f128355d.mo101860a(str, a2, hashMap);
                    if (hashMap.isEmpty()) {
                        hashMap = null;
                    }
                    mo101890a(a4, (Map<String, String>) hashMap);
                    return;
                }
            }
            this.f128355d.mo101862a(a, new C51319a() {
                /* renamed from: a */
                public final void mo101870a(String str, final String str2, final C51301a aVar, boolean z) {
                    if (a != null && str != null && a.equals(str)) {
                        C51334e.this.f128353b.mo101823a(!z, false);
                        if (!z) {
                            HashMap hashMap = new HashMap();
                            String str3 = str;
                            if (str2 == null || str2.length() == 0) {
                                str2 = "none";
                            } else {
                                str3 = C51334e.this.f128355d.mo101860a(str, str2, hashMap);
                            }
                            C51334e.this.f128353b.mo101824b();
                            C51334e.this.f128353b.mo101821a(str2, false);
                            C51334e eVar = C51334e.this;
                            if (hashMap.isEmpty()) {
                                hashMap = null;
                            }
                            eVar.mo101890a(str3, (Map<String, String>) hashMap);
                            C51334e.this.f128370s = str2;
                            return;
                        }
                        C51334e eVar2 = C51334e.this;
                        eVar2.f128304a.postAtFrontOfQueue(new Runnable() {
                            public final void run() {
                                if (aVar != null) {
                                    C51334e.this.f128356e.mo101938a(aVar);
                                    C51301a aVar = aVar;
                                } else if (!C51334e.this.f128363l) {
                                    String str = str2;
                                    HashMap hashMap = new HashMap();
                                    String str2 = str;
                                    if (str2 == null || str2.length() == 0) {
                                        str = "none";
                                    } else {
                                        str2 = C51334e.this.f128355d.mo101860a(str, str, hashMap);
                                    }
                                    C51334e.this.f128353b.mo101824b();
                                    C51334e.this.f128353b.mo101821a(str, false);
                                    C51334e eVar = C51334e.this;
                                    if (hashMap.isEmpty()) {
                                        hashMap = null;
                                    }
                                    eVar.mo101890a(str2, (Map<String, String>) hashMap);
                                    C51334e.this.f128370s = str;
                                }
                            }
                        });
                    }
                }
            });
        } else if (this.f128358g.f128220c == 1 && mo101897b(-117)) {
        } else {
            if (!this.f128375x || this.f128358g.f128220c != 2 || !mo101893a(-102)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url", "try out all urls");
                this.f128356e.mo101938a(new C51301a(-102, "try out all urls", hashMap2));
            }
        }
    }

    private C51334e(C51340a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C51353l() {
        });
        this.f128291N = threadPoolExecutor;
        this.f128304a = new Handler(Looper.myLooper());
        this.f128358g = new C51308b();
        this.f128362k = C51354m.IDLE;
        this.f128299V = C51341b.IDLE;
        this.f128363l = false;
        this.f128364m = false;
        this.f128365n = false;
        this.f128366o = false;
        this.f128300W = 0;
        this.f128301X = 0;
        this.f128302Y = 0;
        this.f128303Z = 0;
        this.f128327aa = 3;
        this.f128328ab = 0;
        this.f128367p = -1;
        this.f128329ac = -1;
        this.f128330ad = -1;
        this.f128331ae = -1;
        this.f128332af = 1;
        this.f128333ag = -1;
        this.f128334ah = -1;
        this.f128335ai = -1;
        this.f128336aj = 0;
        this.f128337ak = 0;
        this.f128338al = -1;
        this.f128339am = 0;
        this.f128340an = -1;
        this.f128341ao = 0;
        this.f128342ap = -1.0f;
        this.f128343aq = -1;
        this.f128344ar = -1.0f;
        this.f128368q = null;
        this.f128345as = null;
        this.f128369r = false;
        this.f128346at = null;
        this.f128370s = null;
        this.f128371t = 0;
        this.f128372u = false;
        this.f128373v = false;
        this.f128374w = 4;
        this.f128375x = true;
        this.f128376y = null;
        this.f128377z = false;
        this.f128347au = -1;
        this.f128281A = "origin";
        this.f128348av = -1;
        this.f128282B = "main";
        this.f128283C = "flv";
        this.f128349aw = "flv";
        this.f128350ax = 15;
        this.f128351ay = 1;
        this.f128352az = null;
        this.f128284D = 0;
        this.f128285E = 0;
        this.f128305aA = 0;
        this.f128306aB = true;
        this.f128307aC = false;
        this.f128308aD = 0;
        this.f128309aE = 0;
        this.f128310aF = -1;
        this.f128311aG = 0;
        this.f128312aH = 1;
        this.f128286F = 0;
        this.f128313aI = 1;
        this.f128314aJ = 1;
        this.f128315aK = 8000;
        this.f128287J = false;
        this.f128288K = false;
        this.f128289L = 0;
        this.f128316aL = 0;
        this.f128317aM = 0;
        this.f128290M = 0;
        this.f128318aN = 0;
        this.f128319aO = 0;
        this.f128320aP = 0;
        this.f128321aQ = -1;
        this.f128323aS = 1;
        this.f128324aT = false;
        this.f128325aU = 1;
        this.f128326aV = 0;
        this.f128292O = aVar.f128391a;
        this.f128354c = aVar.f128392b;
        this.f128295R = aVar.f128395e;
        C51302b bVar = new C51302b(this, this.f128354c, aVar.f128405o, this.f128292O);
        this.f128353b = bVar;
        this.f128353b.f128157j = aVar.f128393c;
        C51355a aVar2 = new C51355a(new C51352k(this), aVar.f128398h, aVar.f128404n, this.f128353b);
        this.f128356e = aVar2;
        this.f128357f = new C51333c(this.f128292O, null);
        this.f128294Q = aVar.f128396f;
        this.f128353b.f128130ah = this.f128294Q;
        this.f128293P = aVar.f128394d;
        this.f128355d = new C51315a(this.f128292O, this.f128291N, this.f128293P);
        this.f128355d.mo101864b();
        this.f128296S = aVar.f128399i;
        this.f128283C = aVar.f128401k;
        this.f128281A = aVar.f128400j;
        this.f128371t = 0;
        this.f128373v = aVar.f128402l;
        this.f128375x = aVar.f128403m;
        this.f128315aK = aVar.f128406p;
    }

    /* renamed from: a */
    public final void mo101884a(Surface surface) {
        long currentTimeMillis = System.currentTimeMillis();
        mo101906f("setSurface");
        this.f128298U = surface;
        if (this.f128359h != null) {
            this.f128359h.setSurface(surface);
        }
        this.f128353b.f128140ar = System.currentTimeMillis() - currentTimeMillis;
    }

    /* renamed from: b */
    public final boolean mo101897b(int i) {
        boolean z = false;
        if (this.f128351ay != 2) {
            return false;
        }
        String str = this.f128358g.mo101846b("h264").f128226a;
        if (str == null) {
            return false;
        }
        this.f128353b.f128158k = str;
        this.f128353b.mo101820a(this.f128346at, str, "h265_to_h264", i);
        this.f128346at = str;
        this.f128351ay = 1;
        this.f128353b.f128133ak = "h264";
        if (this.f128328ab != 1 && this.f128308aD == 1) {
            this.f128328ab = 1;
            this.f128338al = 0;
            this.f128359h.setIntOption(59, this.f128328ab);
            C51302b bVar = this.f128353b;
            if (this.f128328ab == 1) {
                z = true;
            }
            bVar.f128074C = z;
        }
        mo101905f();
        mo101904e(str);
        return true;
    }

    /* renamed from: a */
    public final void mo101885a(SurfaceHolder surfaceHolder) {
        mo101906f("setSurfaceHolder");
        this.f128297T = surfaceHolder;
        if (this.f128359h != null) {
            this.f128359h.setDisplay(surfaceHolder);
        }
    }

    /* renamed from: a */
    public final void mo101886a(C51201e eVar) {
        mo101906f("setDns");
        this.f128352az = eVar;
        this.f128353b.mo101832d();
    }

    /* renamed from: a */
    private void m110397a(boolean z, String str) {
        if (this.f128299V != C51341b.PLAYED) {
            this.f128353b.mo101826b(str);
            return;
        }
        if (z) {
            mo101901d();
        } else {
            this.f128362k = C51354m.INITIALIZED;
        }
        m110399h(str);
        this.f128299V = C51341b.STOPPED;
    }

    /* renamed from: a */
    public final void mo101883a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("set resolution:");
        sb.append(str);
        String sb2 = sb.toString();
        this.f128281A = str;
        new StringBuilder("setStringOption ").append(sb2);
    }

    /* renamed from: a */
    public final void mo101881a(int i, float f) {
        String str = "";
        switch (i) {
            case 19:
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("catch_speed:");
                sb.append(f);
                str = sb.toString();
                this.f128342ap = f;
                if (this.f128359h != null) {
                    this.f128359h.setFloatOption(80, f);
                    this.f128353b.f128078G = f;
                    break;
                }
                break;
            case 20:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("slow_speed:");
                sb2.append(f);
                str = sb2.toString();
                this.f128344ar = f;
                if (this.f128359h != null) {
                    this.f128359h.setFloatOption(191, f);
                    this.f128353b.f128080I = f;
                    break;
                }
                break;
        }
        new StringBuilder("setFloatOption ").append(str);
    }

    /* renamed from: a */
    private String m110396a(String str, int i) {
        if (str == null || str.length() == 0 || this.f128322aR == null || this.f128322aR.length() == 0) {
            return null;
        }
        C51302b bVar = this.f128353b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f128322aR);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(i);
        bVar.f128087P = sb.toString();
        StringBuilder sb2 = new StringBuilder("_session_id=");
        sb2.append(this.f128322aR);
        sb2.append(ClassUtils.PACKAGE_SEPARATOR);
        sb2.append(i);
        String sb3 = sb2.toString();
        int indexOf = str.indexOf("?");
        if (indexOf == -1) {
            StringBuilder sb4 = new StringBuilder("?");
            sb4.append(sb3);
            sb3 = sb4.toString();
        } else if (indexOf != str.length() - 1) {
            StringBuilder sb5 = new StringBuilder("&_session_id=");
            sb5.append(this.f128322aR);
            sb5.append(ClassUtils.PACKAGE_SEPARATOR);
            sb5.append(i);
            sb3 = sb5.toString();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(sb3);
        return sb6.toString();
    }

    /* renamed from: a */
    public final void mo101882a(int i, int i2) {
        String str = "";
        if (i == 25) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("player_degrade_mode:");
            sb.append(i2);
            str = sb.toString();
            this.f128336aj = i2;
        } else if (i == 44) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("set in main looper:");
            sb2.append(i2);
            str = sb2.toString();
            this.f128323aS = i2;
        } else if (i == 55) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("enable tcp fast open:");
            sb3.append(i2);
            str = sb3.toString();
            this.f128319aO = i2;
            if (this.f128359h != null) {
                this.f128359h.setIntOption(316, i2);
            }
        } else if (i != 62) {
            switch (i) {
                case 1:
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append("image_enhancement:");
                    sb4.append(i2);
                    str = sb4.toString();
                    this.f128301X = i2;
                    if (this.f128359h != null) {
                        this.f128359h.setIntOption(37, i2);
                        break;
                    }
                    break;
                case 2:
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str);
                    sb5.append("image_scale:");
                    sb5.append(i2);
                    str = sb5.toString();
                    this.f128302Y = i2;
                    if (this.f128359h != null) {
                        this.f128359h.setIntOption(38, i2);
                        break;
                    }
                    break;
                case 3:
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append("forbid_os_player:");
                    sb6.append(i2);
                    str = sb6.toString();
                    TTPlayerConfiger.setValue(11, i2);
                    break;
                case 4:
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append("image_layout:");
                    sb7.append(i2);
                    str = sb7.toString();
                    this.f128303Z = i2;
                    if (this.f128359h != null) {
                        this.f128359h.setIntOption(36, i2);
                        break;
                    }
                    break;
                case 5:
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str);
                    sb8.append("render_type:");
                    sb8.append(i2);
                    str = sb8.toString();
                    this.f128327aa = i2;
                    if (this.f128359h != null) {
                        this.f128359h.setIntOption(56, i2);
                        break;
                    }
                    break;
                default:
                    boolean z = true;
                    switch (i) {
                        case 7:
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(str);
                            sb9.append("hard_decode:");
                            sb9.append(i2);
                            str = sb9.toString();
                            this.f128328ab = i2;
                            if (this.f128359h != null) {
                                this.f128359h.setIntOption(59, i2);
                                break;
                            }
                            break;
                        case 8:
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(str);
                            sb10.append("enable_cache_file:");
                            sb10.append(i2);
                            str = sb10.toString();
                            this.f128367p = i2;
                            if (this.f128359h != null) {
                                this.f128359h.setIntOption(14, 1);
                                break;
                            }
                            break;
                        case 9:
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(str);
                            sb11.append("h265_decoder_type:");
                            sb11.append(i2);
                            str = sb11.toString();
                            this.f128332af = i2;
                            if (this.f128359h != null) {
                                this.f128359h.setIntOption(67, i2);
                                break;
                            }
                            break;
                        case 10:
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(str);
                            sb12.append("buffering_millSeconds:");
                            sb12.append(i2);
                            str = sb12.toString();
                            this.f128333ag = i2;
                            if (this.f128359h != null) {
                                this.f128359h.setIntOption(86, i2);
                                break;
                            }
                            break;
                        case 11:
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(str);
                            sb13.append("buffering_timeout:");
                            sb13.append(i2);
                            str = sb13.toString();
                            this.f128334ah = i2;
                            if (this.f128359h != null) {
                                this.f128359h.setIntOption(81, i2);
                                break;
                            }
                            break;
                        case 12:
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append(str);
                            sb14.append("network_timeout:");
                            sb14.append(i2);
                            str = sb14.toString();
                            this.f128335ai = i2;
                            if (this.f128359h != null) {
                                this.f128359h.setIntOption(9, i2 * C30514a.f79747n);
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case 15:
                                    StringBuilder sb15 = new StringBuilder();
                                    sb15.append(str);
                                    sb15.append("use_external_dir:");
                                    sb15.append(i2);
                                    str = sb15.toString();
                                    this.f128330ad = i2;
                                    break;
                                case 16:
                                    StringBuilder sb16 = new StringBuilder();
                                    sb16.append(str);
                                    sb16.append("use_test_action:");
                                    sb16.append(i2);
                                    str = sb16.toString();
                                    this.f128329ac = i2;
                                    if (this.f128359h != null) {
                                        this.f128359h.setIntOption(83, this.f128329ac);
                                        break;
                                    }
                                    break;
                                case 17:
                                    StringBuilder sb17 = new StringBuilder();
                                    sb17.append(str);
                                    sb17.append("hurry_time:");
                                    sb17.append(i2);
                                    str = sb17.toString();
                                    this.f128341ao = i2;
                                    if (this.f128359h != null) {
                                        this.f128359h.setIntOption(15, i2);
                                        this.f128353b.f128077F = i2;
                                        break;
                                    }
                                    break;
                                case 18:
                                    StringBuilder sb18 = new StringBuilder();
                                    sb18.append(str);
                                    sb18.append("hurry_type:");
                                    sb18.append(i2);
                                    str = sb18.toString();
                                    this.f128340an = i2;
                                    if (this.f128359h != null) {
                                        this.f128359h.setIntOption(84, i2);
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 21:
                                            StringBuilder sb19 = new StringBuilder();
                                            sb19.append(str);
                                            sb19.append("slow_play_time:");
                                            sb19.append(i2);
                                            str = sb19.toString();
                                            this.f128343aq = i2;
                                            if (this.f128359h != null) {
                                                this.f128359h.setIntOption(190, i2);
                                                this.f128353b.f128079H = i2;
                                                break;
                                            }
                                            break;
                                        case 22:
                                            StringBuilder sb20 = new StringBuilder();
                                            sb20.append(str);
                                            sb20.append("check side data");
                                            sb20.append(i2);
                                            str = sb20.toString();
                                            this.f128312aH = i2;
                                            if (this.f128359h != null) {
                                                this.f128359h.setIntOption(132, i2);
                                                break;
                                            }
                                            break;
                                        default:
                                            switch (i) {
                                                case 31:
                                                    StringBuilder sb21 = new StringBuilder();
                                                    sb21.append(str);
                                                    sb21.append("url_ability:");
                                                    sb21.append(i2);
                                                    str = sb21.toString();
                                                    this.f128351ay = i2;
                                                    if (i2 != 1) {
                                                        if (i2 == 2) {
                                                            this.f128353b.f128133ak = "h265";
                                                            break;
                                                        }
                                                    } else {
                                                        this.f128353b.f128133ak = "h264";
                                                        break;
                                                    }
                                                    break;
                                                case 32:
                                                    StringBuilder sb22 = new StringBuilder();
                                                    sb22.append(str);
                                                    sb22.append("enable_sharp:");
                                                    sb22.append(i2);
                                                    str = sb22.toString();
                                                    this.f128337ak = i2;
                                                    break;
                                                case 33:
                                                    StringBuilder sb23 = new StringBuilder();
                                                    sb23.append(str);
                                                    sb23.append("asyncInit:");
                                                    sb23.append(i2);
                                                    str = sb23.toString();
                                                    this.f128339am = i2;
                                                    if (this.f128359h != null && this.f128328ab == 1) {
                                                        this.f128359h.setIntOption(181, i2);
                                                        this.f128353b.f128131ai = i2;
                                                        break;
                                                    }
                                                case 34:
                                                    StringBuilder sb24 = new StringBuilder();
                                                    sb24.append(str);
                                                    sb24.append("defaultCodecID:");
                                                    sb24.append(i2);
                                                    str = sb24.toString();
                                                    this.f128338al = i2;
                                                    if (this.f128359h != null) {
                                                        this.f128359h.setIntOption(182, i2);
                                                        this.f128353b.f128132aj = i2;
                                                        break;
                                                    }
                                                    break;
                                                case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                                                    StringBuilder sb25 = new StringBuilder();
                                                    sb25.append(str);
                                                    sb25.append("enable 264 hardware decode ");
                                                    sb25.append(i2);
                                                    str = sb25.toString();
                                                    this.f128308aD = i2;
                                                    break;
                                                case 36:
                                                    StringBuilder sb26 = new StringBuilder();
                                                    sb26.append(str);
                                                    sb26.append("enable 265 hardware decode ");
                                                    sb26.append(i2);
                                                    str = sb26.toString();
                                                    this.f128309aE = i2;
                                                    break;
                                                case 37:
                                                    StringBuilder sb27 = new StringBuilder();
                                                    sb27.append(str);
                                                    sb27.append("set max cache");
                                                    sb27.append(i2);
                                                    str = sb27.toString();
                                                    this.f128310aF = i2;
                                                    if (this.f128359h != null) {
                                                        this.f128359h.setIntOption(198, i2);
                                                        this.f128353b.f128135am = i2;
                                                        break;
                                                    }
                                                    break;
                                                case 38:
                                                    StringBuilder sb28 = new StringBuilder();
                                                    sb28.append(str);
                                                    sb28.append("enable test split ");
                                                    sb28.append(i2);
                                                    str = sb28.toString();
                                                    this.f128311aG = i2;
                                                    if (this.f128359h != null) {
                                                        this.f128359h.setIntOption(87, i2);
                                                        this.f128353b.f128136an = i2;
                                                        break;
                                                    }
                                                    break;
                                                case 39:
                                                    StringBuilder sb29 = new StringBuilder();
                                                    sb29.append(str);
                                                    sb29.append("enable httpk degrade:");
                                                    sb29.append(i2);
                                                    str = sb29.toString();
                                                    this.f128286F = i2;
                                                    break;
                                                case 40:
                                                    StringBuilder sb30 = new StringBuilder();
                                                    sb30.append(str);
                                                    sb30.append("enable fast open:");
                                                    sb30.append(i2);
                                                    str = sb30.toString();
                                                    this.f128313aI = i2;
                                                    break;
                                                case BaseNotice.LIKE /*41*/:
                                                    StringBuilder sb31 = new StringBuilder();
                                                    sb31.append(str);
                                                    sb31.append("enable upload sei:");
                                                    sb31.append(i2);
                                                    str = sb31.toString();
                                                    this.f128314aJ = i2;
                                                    break;
                                                case 42:
                                                    StringBuilder sb32 = new StringBuilder();
                                                    sb32.append(str);
                                                    sb32.append("enable NTP:");
                                                    sb32.append(i2);
                                                    str = sb32.toString();
                                                    this.f128305aA = i2;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 46:
                                                            StringBuilder sb33 = new StringBuilder();
                                                            sb33.append(str);
                                                            sb33.append("buffering end ignore video:");
                                                            sb33.append(i2);
                                                            str = sb33.toString();
                                                            this.f128317aM = i2;
                                                            if (this.f128359h != null) {
                                                                this.f128359h.setIntOption(310, i2);
                                                                this.f128353b.f128084M = i2;
                                                                break;
                                                            }
                                                            break;
                                                        case 47:
                                                            StringBuilder sb34 = new StringBuilder();
                                                            sb34.append(str);
                                                            sb34.append("start direct:");
                                                            sb34.append(i2);
                                                            str = sb34.toString();
                                                            this.f128290M = i2;
                                                            if (this.f128359h != null) {
                                                                this.f128359h.setIntOption(311, i2);
                                                                this.f128353b.f128085N = i2;
                                                                break;
                                                            }
                                                            break;
                                                        case 48:
                                                            StringBuilder sb35 = new StringBuilder();
                                                            sb35.append(str);
                                                            sb35.append("check buffering end advance:");
                                                            sb35.append(i2);
                                                            str = sb35.toString();
                                                            this.f128318aN = i2;
                                                            if (this.f128359h != null) {
                                                                this.f128359h.setIntOption(313, i2);
                                                                this.f128353b.f128086O = i2;
                                                                break;
                                                            }
                                                            break;
                                                        case 49:
                                                            StringBuilder sb36 = new StringBuilder();
                                                            sb36.append(str);
                                                            sb36.append("set stall count thre:");
                                                            sb36.append(i2);
                                                            str = sb36.toString();
                                                            this.f128374w = i2;
                                                            break;
                                                        case 50:
                                                            StringBuilder sb37 = new StringBuilder();
                                                            sb37.append(str);
                                                            sb37.append("enable resolution degrade:");
                                                            sb37.append(i2);
                                                            str = sb37.toString();
                                                            if (i2 != 1) {
                                                                z = false;
                                                            }
                                                            this.f128373v = z;
                                                            break;
                                                    }
                                            }
                                            break;
                                    }
                            }
                    }
            }
        } else {
            StringBuilder sb38 = new StringBuilder();
            sb38.append(str);
            sb38.append("enable check packet corrupt:");
            sb38.append(i2);
            str = sb38.toString();
            this.f128320aP = i2;
            if (this.f128359h != null) {
                this.f128359h.setIntOption(317, i2);
            }
        }
        new StringBuilder("setIntOption ").append(str);
    }
}
