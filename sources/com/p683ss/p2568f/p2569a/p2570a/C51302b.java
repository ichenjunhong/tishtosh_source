package com.p683ss.p2568f.p2569a.p2570a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.p2568f.p2569a.C51300a;
import com.p683ss.p2568f.p2569a.C51334e;
import java.net.InetAddress;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.f.a.a.b */
public final class C51302b implements Callback {

    /* renamed from: A */
    public boolean f128072A;

    /* renamed from: B */
    public String f128073B = "none";

    /* renamed from: C */
    public boolean f128074C;

    /* renamed from: D */
    public String f128075D = "none";

    /* renamed from: E */
    public boolean f128076E;

    /* renamed from: F */
    public int f128077F = -1;

    /* renamed from: G */
    public float f128078G = -1.0f;

    /* renamed from: H */
    public int f128079H = -1;

    /* renamed from: I */
    public float f128080I = -1.0f;

    /* renamed from: J */
    public int f128081J;

    /* renamed from: K */
    public String f128082K = "none";

    /* renamed from: L */
    public long f128083L;

    /* renamed from: M */
    public int f128084M;

    /* renamed from: N */
    public int f128085N;

    /* renamed from: O */
    public int f128086O;

    /* renamed from: P */
    public String f128087P = "none";

    /* renamed from: Q */
    public boolean f128088Q;

    /* renamed from: R */
    public long f128089R;

    /* renamed from: S */
    public boolean f128090S;

    /* renamed from: T */
    public boolean f128091T;

    /* renamed from: U */
    NTPUDPClient f128092U;

    /* renamed from: V */
    public InetAddress f128093V;

    /* renamed from: W */
    public InetAddress f128094W;

    /* renamed from: X */
    public C51303a f128095X;

    /* renamed from: Y */
    public long f128096Y;

    /* renamed from: Z */
    public boolean f128097Z;

    /* renamed from: a */
    Context f128098a;

    /* renamed from: aA */
    private boolean f128099aA;

    /* renamed from: aB */
    private String f128100aB = "flv";

    /* renamed from: aC */
    private int f128101aC;

    /* renamed from: aD */
    private long f128102aD;

    /* renamed from: aE */
    private long f128103aE;

    /* renamed from: aF */
    private long f128104aF = -1;

    /* renamed from: aG */
    private long f128105aG;

    /* renamed from: aH */
    private long f128106aH;

    /* renamed from: aI */
    private int f128107aI;

    /* renamed from: aJ */
    private int f128108aJ;

    /* renamed from: aK */
    private long f128109aK;

    /* renamed from: aL */
    private long f128110aL;

    /* renamed from: aM */
    private int f128111aM;

    /* renamed from: aN */
    private int f128112aN;

    /* renamed from: aO */
    private final long f128113aO = 300000;

    /* renamed from: aP */
    private ArrayList<Long> f128114aP;

    /* renamed from: aQ */
    private ArrayList<Long> f128115aQ;

    /* renamed from: aR */
    private ArrayList<Long> f128116aR;

    /* renamed from: aS */
    private ArrayList<Long> f128117aS;

    /* renamed from: aT */
    private JSONObject f128118aT;

    /* renamed from: aU */
    private ArrayList<Integer> f128119aU;

    /* renamed from: aV */
    private ArrayList<Integer> f128120aV;

    /* renamed from: aW */
    private String f128121aW = Build.BOARD;

    /* renamed from: aX */
    private String f128122aX = Build.HARDWARE;

    /* renamed from: aa */
    public int f128123aa = -1;

    /* renamed from: ab */
    String f128124ab;

    /* renamed from: ac */
    public boolean f128125ac;

    /* renamed from: ad */
    public int f128126ad;

    /* renamed from: ae */
    public int f128127ae;

    /* renamed from: af */
    public int f128128af;

    /* renamed from: ag */
    public boolean f128129ag;

    /* renamed from: ah */
    public boolean f128130ah;

    /* renamed from: ai */
    public int f128131ai;

    /* renamed from: aj */
    public int f128132aj = -1;

    /* renamed from: ak */
    public String f128133ak = "none";

    /* renamed from: al */
    public boolean f128134al;

    /* renamed from: am */
    public int f128135am = -1;

    /* renamed from: an */
    public int f128136an;

    /* renamed from: ao */
    public boolean f128137ao;

    /* renamed from: ap */
    public int f128138ap;

    /* renamed from: aq */
    public int f128139aq = 1;

    /* renamed from: ar */
    public long f128140ar;

    /* renamed from: as */
    public String f128141as = "none";

    /* renamed from: at */
    public String f128142at = "none";

    /* renamed from: au */
    private String f128143au = "none";

    /* renamed from: av */
    private String f128144av = "none";

    /* renamed from: aw */
    private boolean f128145aw;

    /* renamed from: ax */
    private long f128146ax;

    /* renamed from: ay */
    private boolean f128147ay;

    /* renamed from: az */
    private String f128148az = "none";

    /* renamed from: b */
    public Handler f128149b;

    /* renamed from: c */
    public C51300a f128150c;

    /* renamed from: d */
    public C51305c f128151d;

    /* renamed from: e */
    public C51334e f128152e;

    /* renamed from: f */
    public final long f128153f;

    /* renamed from: g */
    public boolean f128154g;

    /* renamed from: h */
    public String f128155h = "none";

    /* renamed from: i */
    public String f128156i = "none";

    /* renamed from: j */
    public String f128157j = "none";

    /* renamed from: k */
    public String f128158k = "none";

    /* renamed from: l */
    public String f128159l = "none";

    /* renamed from: m */
    public boolean f128160m;

    /* renamed from: n */
    public String f128161n = "none";

    /* renamed from: o */
    public String f128162o = "none";

    /* renamed from: p */
    public String f128163p = "none";

    /* renamed from: q */
    public String f128164q = "none";

    /* renamed from: r */
    public String f128165r = "none";

    /* renamed from: s */
    public int f128166s = -1;

    /* renamed from: t */
    public int f128167t = -1;

    /* renamed from: u */
    public int f128168u = -1;

    /* renamed from: v */
    public int f128169v = -1;

    /* renamed from: w */
    public int f128170w = -1;

    /* renamed from: x */
    public String f128171x = "none";

    /* renamed from: y */
    public String f128172y = "none";

    /* renamed from: z */
    public boolean f128173z;

    /* renamed from: com.ss.f.a.a.b$a */
    public static class C51303a {

        /* renamed from: a */
        public Handler f128174a;

        /* renamed from: b */
        private HandlerThread f128175b = new HandlerThread("DnsHandlerThread");

        public C51303a(final C51302b bVar) {
            this.f128175b.start();
            this.f128174a = new Handler(this.f128175b.getLooper()) {
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
                    if (r3.f128094W != null) goto L_0x007d;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:40:0x0083  */
                /* JADX WARNING: Removed duplicated region for block: B:49:0x009e A[SYNTHETIC, Splitter:B:49:0x009e] */
                /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void handleMessage(android.os.Message r11) {
                    /*
                        r10 = this;
                        if (r11 != 0) goto L_0x0003
                        return
                    L_0x0003:
                        int r0 = r11.what
                        r1 = 104(0x68, float:1.46E-43)
                        r2 = -1
                        r3 = 0
                        if (r0 != r1) goto L_0x0011
                        com.ss.f.a.a.b r0 = r3
                        int r0 = r0.f128123aa
                        if (r0 == r2) goto L_0x005f
                    L_0x0011:
                        com.ss.f.a.a.b r0 = r3
                        android.content.Context r1 = r0.f128098a
                        android.net.NetworkInfo r1 = com.p683ss.p2568f.p2569a.p2572c.C51326d.m110386a(r1)
                        if (r1 == 0) goto L_0x002a
                        boolean r4 = r1.isAvailable()
                        if (r4 == 0) goto L_0x002a
                        int r4 = r1.getType()
                        java.lang.String r1 = r1.getExtraInfo()
                        goto L_0x002c
                    L_0x002a:
                        r1 = r3
                        r4 = -1
                    L_0x002c:
                        r5 = 1
                        if (r4 == r2) goto L_0x004d
                        int r2 = r0.f128123aa
                        if (r4 == r2) goto L_0x0038
                        r0.f128123aa = r4
                        r0.f128124ab = r1
                        goto L_0x0051
                    L_0x0038:
                        if (r1 == 0) goto L_0x004b
                        java.lang.String r2 = r0.f128124ab
                        if (r2 == 0) goto L_0x0046
                        java.lang.String r2 = r0.f128124ab
                        boolean r2 = r1.equals(r2)
                        if (r2 != 0) goto L_0x004b
                    L_0x0046:
                        r0.f128123aa = r4
                        r0.f128124ab = r1
                        goto L_0x0051
                    L_0x004b:
                        r5 = 0
                        goto L_0x0051
                    L_0x004d:
                        r0.f128123aa = r4
                        r0.f128124ab = r1
                    L_0x0051:
                        if (r5 != 0) goto L_0x005f
                        com.ss.f.a.a.b r0 = r3
                        java.net.InetAddress r0 = r0.f128093V
                        if (r0 != 0) goto L_0x007d
                        com.ss.f.a.a.b r0 = r3
                        java.net.InetAddress r0 = r0.f128094W
                        if (r0 != 0) goto L_0x007d
                    L_0x005f:
                        com.ss.f.a.a.b r0 = r3     // Catch:{ UnknownHostException -> 0x006a }
                        java.lang.String r1 = "time1.bytedance.com"
                        java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch:{ UnknownHostException -> 0x006a }
                        r0.f128093V = r1     // Catch:{ UnknownHostException -> 0x006a }
                        goto L_0x006e
                    L_0x006a:
                        com.ss.f.a.a.b r0 = r3
                        r0.f128093V = r3
                    L_0x006e:
                        com.ss.f.a.a.b r0 = r3     // Catch:{ UnknownHostException -> 0x0079 }
                        java.lang.String r1 = "time2.bytedance.com"
                        java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch:{ UnknownHostException -> 0x0079 }
                        r0.f128094W = r1     // Catch:{ UnknownHostException -> 0x0079 }
                        goto L_0x007d
                    L_0x0079:
                        com.ss.f.a.a.b r0 = r3
                        r0.f128094W = r3
                    L_0x007d:
                        int r11 = r11.what
                        r0 = 103(0x67, float:1.44E-43)
                        if (r11 != r0) goto L_0x00ef
                        com.ss.f.a.a.b r11 = r3
                        org.apache.commons.net.ntp.NTPUDPClient r1 = r11.f128092U
                        if (r1 == 0) goto L_0x00df
                        org.apache.commons.net.ntp.NTPUDPClient r1 = r11.f128092U     // Catch:{ SocketException -> 0x00de, IOException -> 0x009b }
                        r1.open()     // Catch:{ SocketException -> 0x00de, IOException -> 0x009b }
                        java.net.InetAddress r1 = r11.f128093V     // Catch:{ SocketException -> 0x00de, IOException -> 0x009b }
                        if (r1 == 0) goto L_0x009b
                        org.apache.commons.net.ntp.NTPUDPClient r1 = r11.f128092U     // Catch:{ SocketException -> 0x00de, IOException -> 0x009b }
                        java.net.InetAddress r2 = r11.f128093V     // Catch:{ SocketException -> 0x00de, IOException -> 0x009b }
                        org.apache.commons.net.ntp.TimeInfo r1 = r1.getTime(r2)     // Catch:{ SocketException -> 0x00de, IOException -> 0x009b }
                        goto L_0x009c
                    L_0x009b:
                        r1 = r3
                    L_0x009c:
                        if (r1 != 0) goto L_0x00aa
                        java.net.InetAddress r2 = r11.f128094W     // Catch:{ IOException -> 0x00ab }
                        if (r2 == 0) goto L_0x00aa
                        org.apache.commons.net.ntp.NTPUDPClient r1 = r11.f128092U     // Catch:{ IOException -> 0x00ab }
                        java.net.InetAddress r2 = r11.f128094W     // Catch:{ IOException -> 0x00ab }
                        org.apache.commons.net.ntp.TimeInfo r1 = r1.getTime(r2)     // Catch:{ IOException -> 0x00ab }
                    L_0x00aa:
                        r3 = r1
                    L_0x00ab:
                        if (r3 == 0) goto L_0x00df
                        org.apache.commons.net.ntp.NtpV3Packet r1 = r3.getMessage()
                        org.apache.commons.net.ntp.TimeStamp r1 = r1.getOriginateTimeStamp()
                        long r1 = r1.getTime()
                        org.apache.commons.net.ntp.NtpV3Packet r4 = r3.getMessage()
                        org.apache.commons.net.ntp.TimeStamp r4 = r4.getReceiveTimeStamp()
                        long r4 = r4.getTime()
                        org.apache.commons.net.ntp.NtpV3Packet r3 = r3.getMessage()
                        org.apache.commons.net.ntp.TimeStamp r3 = r3.getTransmitTimeStamp()
                        long r6 = r3.getTime()
                        long r8 = java.lang.System.currentTimeMillis()
                        long r4 = r4 - r1
                        long r6 = r6 - r8
                        long r4 = r4 + r6
                        r1 = 2
                        long r4 = r4 / r1
                        r11.f128096Y = r4
                        goto L_0x00df
                    L_0x00de:
                    L_0x00df:
                        com.ss.f.a.a.b r11 = r3
                        boolean r11 = r11.f128125ac
                        if (r11 == 0) goto L_0x00ef
                        com.ss.f.a.a.b$a r11 = com.p683ss.p2568f.p2569a.p2570a.C51302b.C51303a.this
                        android.os.Handler r11 = r11.f128174a
                        r1 = 300000(0x493e0, double:1.482197E-318)
                        r11.sendEmptyMessageDelayed(r0, r1)
                    L_0x00ef:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p2568f.p2569a.p2570a.C51302b.C51303a.C513041.handleMessage(android.os.Message):void");
                }
            };
        }

        /* renamed from: a */
        public final void mo101836a(int i, long j) {
            if (this.f128175b != null && this.f128174a != null) {
                this.f128174a.sendEmptyMessage(i);
            }
        }
    }

    /* renamed from: d */
    public final void mo101832d() {
        this.f128147ay = true;
    }

    /* renamed from: a */
    public final void mo101820a(String str, String str2, String str3, int i) {
        if (this.f128152e != null && this.f128150c != null) {
            try {
                JSONObject a = mo101813a();
                JSONObject put = a.put("event_key", "switch_url");
                String str4 = "last_cdn_play_url";
                if (str == null) {
                    str = TEVideoRecorder.FACE_BEAUTY_NULL;
                }
                JSONObject put2 = put.put(str4, str);
                String str5 = "next_cdn_play_url";
                if (str2 == null) {
                    str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
                }
                put2.put(str5, str2).put("code", i).put("reason", str3);
                this.f128150c.mo14307a(a);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo101822a(boolean z) {
        if (this.f128090S) {
            this.f128090S = false;
            JSONObject a = mo101813a();
            if (this.f128101aC == -115) {
                this.f128101aC = 0;
            }
            if (this.f128117aS == null) {
                this.f128117aS = new ArrayList<>();
            }
            this.f128117aS.add(Long.valueOf(-(System.currentTimeMillis() - this.f128151d.f128192a)));
            if (this.f128110aL == 0) {
                this.f128110aL = System.currentTimeMillis();
            }
            if (!(a == null || this.f128102aD == 0)) {
                try {
                    if (this.f128103aE != 0) {
                        this.f128107aI++;
                        this.f128108aJ = (int) (((long) this.f128108aJ) + (System.currentTimeMillis() - this.f128103aE));
                    }
                    this.f128105aG++;
                    this.f128106aH += System.currentTimeMillis() - this.f128102aD;
                    a.put("event_key", "stall").put("stall_start", this.f128102aD).put("stall_end", System.currentTimeMillis()).put("reason", this.f128104aF);
                    this.f128150c.mo14307a(a);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo101824b() {
        if (!this.f128088Q) {
            this.f128151d.f128194c = System.currentTimeMillis();
        }
    }

    /* renamed from: f */
    private JSONObject m110311f() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONObject jSONObject;
        m110312g();
        try {
            JSONObject put = new JSONObject().put("start_time", this.f128151d.f128192a).put("duration", System.currentTimeMillis() - this.f128151d.f128192a).put("render_fps_series", new JSONArray(this.f128114aP)).put("download_bitrate_series", new JSONArray(this.f128115aQ)).put("play_buffer_series", new JSONArray(this.f128116aR));
            String str = "push_bitrate_series";
            if (this.f128119aU == null) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(this.f128119aU);
            }
            JSONObject put2 = put.put(str, jSONArray);
            String str2 = "push_fps_series";
            if (this.f128120aV == null) {
                jSONArray2 = new JSONArray();
            } else {
                jSONArray2 = new JSONArray(this.f128120aV);
            }
            JSONObject put3 = put2.put(str2, jSONArray2);
            String str3 = "stall_series";
            if (this.f128117aS == null) {
                jSONArray3 = new JSONArray();
            } else {
                jSONArray3 = new JSONArray(this.f128117aS);
            }
            JSONObject put4 = put3.put(str3, jSONArray3);
            String str4 = "error_series";
            if (this.f128118aT == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = this.f128118aT;
            }
            return put4.put(str4, jSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private void m110312g() {
        if (this.f128152e != null && this.f128150c != null && this.f128151d != null) {
            this.f128152e.mo101887a(this.f128151d, 3);
            if (this.f128114aP == null) {
                this.f128114aP = new ArrayList<>();
                this.f128116aR = new ArrayList<>();
                this.f128115aQ = new ArrayList<>();
            }
            this.f128114aP.add(Long.valueOf((long) this.f128151d.f128178A));
            this.f128116aR.add(Long.valueOf(this.f128151d.f128181D));
            this.f128115aQ.add(Long.valueOf(this.f128151d.f128179B));
            if (this.f128129ag) {
                if (this.f128120aV == null) {
                    this.f128120aV = new ArrayList<>();
                    this.f128119aU = new ArrayList<>();
                }
                this.f128120aV.add(Integer.valueOf(this.f128151d.f128190M));
                this.f128119aU.add(Integer.valueOf(this.f128151d.f128189L));
            }
        }
    }

    /* renamed from: c */
    public final void mo101829c() {
        this.f128158k = "none";
        this.f128144av = "none";
        this.f128145aw = false;
        this.f128146ax = 0;
        this.f128161n = "none";
        this.f128162o = "none";
        this.f128163p = "none";
        this.f128164q = "none";
        this.f128165r = "none";
        this.f128166s = -1;
        this.f128167t = -1;
        this.f128168u = -1;
        this.f128169v = -1;
        this.f128170w = -1;
        this.f128171x = "none";
        this.f128172y = "none";
        this.f128148az = "none";
        this.f128099aA = false;
        this.f128173z = false;
        this.f128072A = false;
        this.f128076E = false;
        this.f128077F = -1;
        this.f128078G = -1.0f;
        this.f128079H = -1;
        this.f128080I = -1.0f;
        this.f128081J = 0;
        this.f128082K = "none";
        this.f128083L = 0;
        this.f128084M = 0;
        this.f128085N = 0;
        this.f128086O = 0;
        this.f128132aj = -1;
        this.f128131ai = 0;
        this.f128088Q = false;
        this.f128089R = 0;
        this.f128101aC = 0;
        this.f128102aD = 0;
        this.f128104aF = -1;
        this.f128105aG = 0;
        this.f128106aH = 0;
        this.f128090S = false;
        this.f128107aI = 0;
        this.f128108aJ = 0;
        this.f128103aE = 0;
        this.f128109aK = 0;
        this.f128110aL = 0;
        this.f128111aM = 0;
        this.f128112aN = 0;
        this.f128097Z = false;
        this.f128096Y = 0;
        this.f128126ad = 0;
        this.f128127ae = 0;
        this.f128128af = 0;
        this.f128135am = -1;
        this.f128114aP = null;
        this.f128115aQ = null;
        this.f128116aR = null;
        this.f128119aU = null;
        this.f128120aV = null;
        this.f128118aT = null;
        this.f128117aS = null;
        if (this.f128151d != null) {
            this.f128151d.mo101838a();
        }
        this.f128075D = "none";
        this.f128073B = "none";
        this.f128139aq = 1;
        this.f128087P = "none";
        this.f128142at = "none";
    }

    /* renamed from: a */
    public final JSONObject mo101813a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C51334e eVar = this.f128152e;
        if (!(eVar.f128359h == null || eVar.f128353b == null)) {
            int intOption = eVar.f128359h.getIntOption(141, -1);
            if (intOption == 0) {
                eVar.f128353b.f128073B = "h264";
            } else if (intOption == 1) {
                eVar.f128353b.f128073B = "h265";
            } else {
                eVar.f128353b.f128073B = "none";
            }
        }
        try {
            JSONObject put = new JSONObject().put("report_version", "5").put("live_sdk_version", "1.3.15.61").put("product_line", CustomActionPushReceiver.f104061f).put("client_timestamp", System.currentTimeMillis());
            String str8 = "player_sdk_version";
            if (this.f128159l == null) {
                str = "-1";
            } else {
                str = this.f128159l;
            }
            JSONObject put2 = put.put(str8, str);
            String str9 = "project_key";
            if (this.f128157j == null) {
                str2 = "-1";
            } else {
                str2 = this.f128157j;
            }
            JSONObject put3 = put2.put(str9, str2);
            String str10 = "live_stream_enter_method";
            if (this.f128155h == null) {
                str3 = "none";
            } else {
                str3 = this.f128155h;
            }
            JSONObject put4 = put3.put(str10, str3);
            String str11 = "live_stream_enter_action";
            if (this.f128156i == null) {
                str4 = "none";
            } else {
                str4 = this.f128156i;
            }
            JSONObject put5 = put4.put(str11, str4);
            String str12 = "cdn_play_url";
            if (this.f128158k == null) {
                str5 = "-1";
            } else {
                str5 = this.f128158k;
            }
            JSONObject put6 = put5.put(str12, str5);
            String str13 = "cdn_ip";
            if (this.f128144av == null) {
                str6 = "none";
            } else {
                str6 = this.f128144av;
            }
            JSONObject put7 = put6.put(str13, str6).put("ip_from_player_core", this.f128145aw ? 1 : 0).put("is_preview", this.f128160m ? 1 : 0).put("push_client_sdk_version", this.f128161n).put("push_client_platform", this.f128162o).put("push_client_os_version", this.f128163p).put("push_client_model", this.f128164q).put("push_client_start_time", this.f128165r).put("push_client_is_hardware_encode", this.f128166s).put("push_client_min_bitrate", this.f128167t).put("push_client_max_bitrate", this.f128168u).put("push_client_default_bitrate", this.f128169v).put("push_client_push_protocol", this.f128171x).put("push_client_qid", this.f128172y).put("push_client_hit_node_optimize", this.f128170w).put("open_dns_optimizer", this.f128147ay ? 1 : 0).put("hit_node_optimize", this.f128099aA ? 1 : 0).put("evaluator_symbol", this.f128148az).put("remote_sorted", this.f128173z ? 1 : 0).put("common_tag", this.f128143au).put("codec_type", this.f128073B).put("codec_name", this.f128075D).put("hardware_decode", this.f128074C ? 1 : 0).put("sharp", this.f128091T ? 1 : 0).put("enable_hurry", this.f128076E ? 1 : 0).put("hurry_time", this.f128077F).put("catch_speed", new DecimalFormat("0.00").format((double) this.f128078G)).put("slow_play_time", this.f128079H).put("slow_speed", new DecimalFormat("0.00").format((double) this.f128080I)).put("first_screen", this.f128088Q ? 1 : 0).put("enable_httpDns", this.f128130ah ? 1 : 0).put("enable_ntp", this.f128126ad).put("enable_media_codec_async", this.f128131ai).put("default_codec_id", this.f128132aj).put("url_ability", this.f128133ak).put("max_cache_seconds", this.f128135am).put("enable_fast_open", this.f128138ap);
            String str14 = "dns_ip";
            if (this.f128151d.f128191N == null) {
                str7 = "none";
            } else {
                str7 = this.f128151d.f128191N;
            }
            return put7.put(str14, str7).put("in_main_looper", this.f128139aq).put("start_play_buffer_threshold", this.f128083L).put("buffering_end_ignore_video", this.f128084M).put("start_direct_after_prepared", this.f128085N).put("check_buffering_end_advance", this.f128086O).put("live_stream_session_id", this.f128087P).put("channel_id", this.f128151d.f128188K).put("sei_delay", this.f128151d.f128186I).put("sei_source", this.f128151d.f128187J).put("chip_board", this.f128121aW).put("chip_hardware", this.f128122aX).put("width", this.f128127ae).put("height", this.f128128af).put("settings_info", this.f128142at).put("play_format", this.f128100aB);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final JSONObject mo101834e() {
        String str;
        String str2;
        String str3;
        C51305c cVar = new C51305c();
        this.f128152e.mo101887a(cVar, 1);
        try {
            JSONObject put = new JSONObject().put("播放时长", System.currentTimeMillis() - this.f128089R).put("拉流sdk版本:", "1.3.15.61");
            String str4 = "播放器版本:";
            if (this.f128159l == null) {
                str = "-1";
            } else {
                str = this.f128159l;
            }
            JSONObject put2 = put.put(str4, str);
            String str5 = "cdn节点:";
            if (this.f128144av == null) {
                str2 = "-1";
            } else {
                str2 = this.f128144av;
            }
            JSONObject put3 = put2.put(str5, str2).put("推流SDK版本:", this.f128161n).put("推流平台:", this.f128162o).put("推流设备机型:", this.f128164q).put("推流系统版本号:", this.f128163p).put("推流端硬编:", this.f128166s).put("推流协议:", this.f128171x).put("qId:", this.f128172y).put("推流码率:", this.f128151d.f128189L).put("推流帧频:", this.f128151d.f128190M).put("命中节点优选:", this.f128099aA ? 1 : 0).put("优选策略:", this.f128148az).put("服务端优选:", this.f128173z ? 1 : 0).put("卡顿次数:", this.f128105aG).put("卡顿时长:", this.f128106aH);
            String str6 = "卡顿原因:";
            if (this.f128104aF == -1) {
                str3 = "无卡顿";
            } else if (this.f128104aF == 0) {
                str3 = "网络卡顿";
            } else {
                str3 = "解码卡顿";
            }
            return put3.put(str6, str3).put("首帧:", this.f128151d.f128202k - this.f128151d.f128192a).put("视频播放缓存:", cVar.f128180C).put("音频播放缓存:", cVar.f128181D).put("延迟:", this.f128151d.f128186I).put("渲染帧频:", (double) cVar.f128178A).put("sei_source:", this.f128151d.f128187J).put("下载码率:", cVar.f128179B).put("错误码:", this.f128101aC).put("硬解:", this.f128074C).put("编码类型:", this.f128073B).put("解码器:", this.f128075D).put("首帧缓存:", this.f128151d.f128184G).put("等待时间:", this.f128151d.f128185H).put("dns_ip:", this.f128151d.f128191N).put("url:", this.f128158k).put("width:", this.f128127ae).put("height:", this.f128128af);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final void mo101833d(String str) {
        if (str != null) {
            this.f128148az = str;
        }
    }

    /* renamed from: a */
    public final void mo101817a(long j) {
        if (this.f128151d != null) {
            this.f128151d.f128185H = j;
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (101 == i) {
            m110309c(false);
        }
        if (102 == i) {
            m110312g();
            if (this.f128154g) {
                this.f128149b.sendEmptyMessageDelayed(102, 5000);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo101814a(int i) {
        if (!this.f128088Q && this.f128152e != null && this.f128150c != null) {
            JSONObject a = mo101813a();
            if (a != null) {
                try {
                    a.put("event_key", "first_frame_failed").put("start_time", System.currentTimeMillis()).put("reason", i);
                    this.f128150c.mo14307a(a);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo101825b(int i) {
        this.f128111aM++;
        this.f128112aN++;
        JSONObject a = mo101813a();
        if (a != null) {
            try {
                a.put("event_key", "retry").put("reason", this.f128101aC).put("code", i);
                this.f128150c.mo14307a(a);
                this.f128151d.mo101839b();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo101830c(int i) {
        String str;
        JSONObject a = mo101813a();
        if (a != null) {
            try {
                JSONObject put = a.put("event_key", "prepare_result");
                String str2 = "error_msg";
                if (i != 0) {
                    str = this.f128152e.mo101913m();
                } else {
                    str = "none";
                }
                put.put(str2, str).put("result", i);
                this.f128150c.mo14307a(a);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    private void m110309c(boolean z) {
        if (this.f128152e != null && this.f128150c != null && this.f128151d != null) {
            try {
                long j = this.f128151d.f128214w;
                long j2 = this.f128151d.f128215x;
                long j3 = this.f128151d.f128216y;
                long j4 = this.f128151d.f128217z;
                this.f128152e.mo101887a(this.f128151d, 1);
                this.f128150c.mo14307a(m110308a(this.f128151d, j, j2, j3, j4, z));
            } catch (JSONException unused) {
            }
            if (this.f128154g) {
                this.f128149b.sendEmptyMessageDelayed(BaseNotice.HASHTAG, this.f128153f);
            }
        }
    }

    /* renamed from: b */
    public final void mo101826b(String str) {
        if (this.f128152e != null && this.f128150c != null) {
            JSONObject a = mo101813a();
            if (a != null) {
                try {
                    a.put("event_key", "illegal_call").put("api_name", str);
                    this.f128150c.mo14307a(a);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public void mo101828b(boolean z) {
        String str;
        JSONObject a = mo101813a();
        if (a != null) {
            try {
                JSONObject put = a.put("event_key", "link");
                String str2 = "info";
                if (z) {
                    str = "start";
                } else {
                    str = "end";
                }
                put.put(str2, str);
                this.f128150c.mo14307a(a);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: e */
    private void m110310e(String str) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = 1;
        if (this.f128088Q) {
            m110309c(true);
        }
        JSONObject a = mo101813a();
        if (a != null) {
            try {
                if (this.f128088Q) {
                    j2 = System.currentTimeMillis() - this.f128089R;
                    j = 0;
                } else if (this.f128101aC != 0 || this.f128151d.f128192a == 0) {
                    j2 = 0;
                    j = 0;
                } else {
                    j = System.currentTimeMillis() - this.f128151d.f128192a;
                    j2 = 0;
                }
                if (this.f128109aK > 0) {
                    j4 = this.f128109aK - this.f128151d.f128202k;
                    j3 = this.f128110aL - this.f128109aK;
                } else {
                    j4 = 0;
                    j3 = 0;
                }
                this.f128152e.mo101887a(this.f128151d, 2);
                JSONObject put = a.put("event_key", "play_stop").put("stop_time", System.currentTimeMillis()).put("play_time", j2).put("is_stream_received", this.f128088Q ? 1 : 0).put("code", this.f128101aC).put("stall_count", this.f128105aG).put("stall_time", this.f128106aH).put("start", this.f128151d.f128192a).put("sdk_dns_analysis_end", this.f128151d.f128193b).put("player_dns_analysis_end", this.f128151d.f128195d).put("tcp_connect_end", this.f128151d.f128196e).put("tcp_first_package_end", this.f128151d.f128197f).put("first_video_package_end", this.f128151d.f128198g).put("first_audio_package_end", this.f128151d.f128199h).put("first_video_frame_decode_end", this.f128151d.f128200i).put("first_audio_frame_decode_end", this.f128151d.f128201j).put("first_frame_render_end", this.f128151d.f128202k).put("video_device_open_start", this.f128151d.f128205n).put("video_device_open_end", this.f128151d.f128206o).put("audio_device_open_start", this.f128151d.f128207p).put("audio_device_open_end", this.f128151d.f128208q).put("prepare_block_end", this.f128151d.f128194c).put("prepare_end", this.f128151d.f128204m).put("retry_count", this.f128112aN).put("download_speed", this.f128151d.f128182E).put("video_buffer_time", this.f128151d.f128183F).put("audio_buffer_time", this.f128151d.f128184G);
                String str2 = "wait_time";
                if (this.f128151d.f128185H > 0) {
                    j5 = this.f128151d.f128185H;
                } else {
                    j5 = -this.f128151d.f128185H;
                }
                JSONObject put2 = put.put(str2, j5);
                String str3 = "is_waiting";
                if (this.f128151d.f128185H >= 0) {
                    i = 0;
                }
                put2.put(str3, i).put("first_stall_time", j4).put("first_stall_duration", j3).put("call_api_name", str).put("play_time_on_no_frame", j);
                if (this.f128134al) {
                    a.put("session_time_series", m110311f());
                }
                this.f128150c.mo14307a(a);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo101831c(String str) {
        if (this.f128152e != null && this.f128150c != null) {
            JSONObject a = mo101813a();
            if (a != null) {
                try {
                    a.put("event_key", "call_not_in_main_thread").put("api_name", str);
                    this.f128150c.mo14307a(a);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo101818a(String str) {
        if (this.f128154g) {
            this.f128154g = false;
            this.f128149b.removeCallbacksAndMessages(null);
            if (this.f128095X != null) {
                this.f128095X.f128174a.removeCallbacksAndMessages(null);
            }
            this.f128125ac = false;
        }
        m110310e(str);
        mo101829c();
    }

    /* renamed from: a */
    public final void mo101821a(String str, boolean z) {
        this.f128144av = str;
        this.f128145aw = z;
    }

    /* renamed from: b */
    public final void mo101827b(String str, String str2) {
        this.f128141as = str;
        this.f128100aB = str2;
    }

    /* renamed from: a */
    public final void mo101823a(boolean z, boolean z2) {
        this.f128151d.f128193b = System.currentTimeMillis();
        this.f128099aA = z2;
        this.f128072A = z;
    }

    /* renamed from: a */
    public final void mo101815a(int i, String str) {
        if (this.f128118aT == null) {
            this.f128118aT = new JSONObject();
        }
        try {
            this.f128118aT.put(Long.toString(System.currentTimeMillis() - this.f128151d.f128192a), i);
        } catch (JSONException unused) {
            this.f128118aT = null;
        }
        JSONObject a = mo101813a();
        if (a != null) {
            try {
                a.put("event_key", "play_error").put("code", i).put("info", str);
                this.f128150c.mo14307a(a);
                this.f128101aC = i;
            } catch (JSONException unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo101816a(int i, boolean z) {
        this.f128101aC = -115;
        if (z) {
            this.f128102aD = System.currentTimeMillis();
            if (this.f128109aK == 0) {
                this.f128109aK = this.f128102aD;
            }
            this.f128103aE = this.f128102aD;
            this.f128104aF = (long) i;
            this.f128090S = true;
            if (this.f128117aS == null) {
                this.f128117aS = new ArrayList<>();
            }
            this.f128117aS.add(Long.valueOf(this.f128102aD - this.f128151d.f128192a));
        }
    }

    /* renamed from: a */
    public final void mo101819a(String str, String str2) {
        mo101829c();
        this.f128151d.f128192a = System.currentTimeMillis();
        this.f128151d.f128191N = str2;
        this.f128158k = str;
        JSONObject a = mo101813a();
        if (a != null) {
            try {
                a.put("event_key", "start_play").put("set_surface_cost", this.f128140ar).put("start_play_time", this.f128151d.f128192a).put("suggest_format", this.f128141as).put("play_format", this.f128100aB);
                this.f128150c.mo14307a(a);
            } catch (JSONException unused) {
            }
        }
    }

    public C51302b(C51334e eVar, C51300a aVar, long j, Context context) {
        this.f128098a = context;
        this.f128149b = new Handler(this);
        if (j <= 0) {
            j = 60000;
        }
        this.f128153f = j;
        this.f128150c = aVar;
        this.f128152e = eVar;
        this.f128151d = new C51305c();
        this.f128092U = new NTPUDPClient();
        this.f128092U.setDefaultTimeout(10000);
    }

    /* renamed from: a */
    private JSONObject m110308a(C51305c cVar, long j, long j2, long j3, long j4, boolean z) throws JSONException {
        long j5;
        JSONObject a = mo101813a();
        if (a == null) {
            return null;
        }
        long j6 = cVar.f128216y - j3;
        long j7 = cVar.f128217z - j4;
        long j8 = cVar.f128215x - j2;
        if (j7 <= 0 || j8 <= 0) {
            j5 = 0;
        } else {
            j5 = (j8 * 8) / j7;
        }
        this.f128146ax++;
        int i = this.f128107aI;
        int i2 = this.f128108aJ;
        if (this.f128090S && this.f128103aE != 0) {
            i++;
            i2 = (int) (((long) i2) + (System.currentTimeMillis() - this.f128103aE));
            this.f128103aE = System.currentTimeMillis();
        }
        a.put("event_key", "playing").put("video_download_size", cVar.f128214w).put("video_play_size", cVar.f128215x).put("render_fps", (double) cVar.f128178A).put("video_rate", j5).put("download_speed", this.f128151d.f128179B).put("play_time", j6).put("retry_count", this.f128111aM).put("stall_count", i).put("stall_time", i2).put("is_last", z ? 1 : 0).put("index", this.f128146ax).put("speed_switch_count", this.f128081J).put("speed_switch_info", this.f128082K).put("video_buffer_time", this.f128151d.f128180C).put("audio_buffer_time", this.f128151d.f128181D).put("enable_sei_check", this.f128137ao ? 1 : 0).put("ntp_sync", this.f128097Z ? 1 : 0);
        this.f128111aM = 0;
        this.f128107aI = 0;
        this.f128108aJ = 0;
        this.f128081J = 0;
        this.f128082K = "none";
        return a;
    }
}
