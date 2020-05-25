package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.C4995b;
import com.bytedance.android.livesdk.live.p393a.C7743a;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.C8069h;
import com.bytedance.android.livesdk.p399o.p402c.C8057h;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.h */
public final class C5070h {

    /* renamed from: J */
    private static boolean f13572J;

    /* renamed from: A */
    public long f13573A;

    /* renamed from: B */
    public String f13574B;

    /* renamed from: C */
    public DataCenter f13575C;

    /* renamed from: D */
    public long f13576D = -1;

    /* renamed from: E */
    public String f13577E;

    /* renamed from: F */
    public String f13578F = "";

    /* renamed from: G */
    public String f13579G;

    /* renamed from: H */
    public long f13580H;

    /* renamed from: I */
    public String f13581I;

    /* renamed from: K */
    private final Bundle f13582K;

    /* renamed from: L */
    private long f13583L = 0;

    /* renamed from: M */
    private boolean f13584M = false;

    /* renamed from: N */
    private boolean f13585N = false;

    /* renamed from: O */
    private boolean f13586O = false;

    /* renamed from: P */
    private boolean f13587P;

    /* renamed from: Q */
    private long f13588Q = -1;

    /* renamed from: R */
    private boolean f13589R = false;

    /* renamed from: S */
    private C8722v f13590S;

    /* renamed from: T */
    private long f13591T;

    /* renamed from: U */
    private long f13592U;

    /* renamed from: V */
    private String f13593V;

    /* renamed from: W */
    private int f13594W;

    /* renamed from: X */
    private long f13595X;

    /* renamed from: Y */
    private C1690c f13596Y;

    /* renamed from: Z */
    private boolean f13597Z = false;

    /* renamed from: a */
    public boolean f13598a;

    /* renamed from: aa */
    private boolean f13599aa = false;

    /* renamed from: b */
    public boolean f13600b = true;

    /* renamed from: c */
    public final Runnable f13601c = new Runnable() {
        public final void run() {
            long j;
            String str;
            if (C5070h.this.f13598a) {
                j = 60000 - (((SystemClock.elapsedRealtime() - C5070h.this.f13612n) - C5070h.this.f13616r) % 60000);
                C5070h.this.f13598a = false;
            } else {
                j = 60000;
            }
            C5070h.this.f13602d.postDelayed(this, j);
            if (C5070h.this.f13600b || j != 60000) {
                C5070h.this.f13600b = false;
                return;
            }
            HashMap hashMap = new HashMap();
            String str2 = "streaming_type";
            if (C5070h.this.f13624z) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put(str2, str);
            hashMap.put("growth_deepevent", "1");
            hashMap.put("request_page", C4995b.m11478a().mo10874f());
            C8049c.m15979a().mo14202a("watch_onemin", hashMap, new C8059j().mo14214b("live_view").mo14213a("live_detail").mo14219g(C5070h.this.f13617s), Room.class);
        }
    };

    /* renamed from: d */
    public final Handler f13602d;

    /* renamed from: e */
    public final WeakReference<Context> f13603e;

    /* renamed from: f */
    public final String f13604f;

    /* renamed from: g */
    public final String f13605g;

    /* renamed from: h */
    public final long f13606h;

    /* renamed from: i */
    public final String f13607i;

    /* renamed from: j */
    public final Bundle f13608j;

    /* renamed from: k */
    public final String f13609k;

    /* renamed from: l */
    public boolean f13610l = false;

    /* renamed from: m */
    public boolean f13611m = false;

    /* renamed from: n */
    public long f13612n = -1;

    /* renamed from: o */
    public C7743a f13613o = null;

    /* renamed from: p */
    public long f13614p = -1;

    /* renamed from: q */
    public long f13615q = -1;

    /* renamed from: r */
    public long f13616r = 0;

    /* renamed from: s */
    public String f13617s = "click";

    /* renamed from: t */
    public String f13618t = "other";

    /* renamed from: u */
    public String f13619u = "";

    /* renamed from: v */
    public String f13620v;

    /* renamed from: w */
    public String f13621w;

    /* renamed from: x */
    public String f13622x;

    /* renamed from: y */
    public String f13623y;

    /* renamed from: z */
    public boolean f13624z;

    /* renamed from: h */
    public final void mo10960h() {
        this.f13595X = SystemClock.elapsedRealtime();
    }

    /* renamed from: i */
    public final void mo10961i() {
        this.f13580H = SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final long mo10954b() {
        return (SystemClock.elapsedRealtime() - this.f13612n) - this.f13616r;
    }

    /* renamed from: e */
    public final void mo10957e() {
        Context context;
        if (this.f13603e == null || this.f13603e.get() == null) {
            context = null;
        } else {
            context = (Context) this.f13603e.get();
        }
        C8068g.m16014a(context);
    }

    /* renamed from: a */
    public final void mo10950a() {
        this.f13610l = false;
        this.f13611m = false;
        this.f13584M = false;
        this.f13586O = false;
        this.f13587P = false;
        this.f13612n = -1;
        this.f13588Q = -1;
        this.f13589R = false;
        this.f13613o = null;
        this.f13614p = -1;
        this.f13615q = -1;
        this.f13616r = 0;
        this.f13617s = null;
        this.f13618t = null;
        this.f13620v = null;
        this.f13623y = null;
        this.f13590S = null;
        this.f13591T = 0;
        this.f13592U = 0;
        this.f13593V = null;
        this.f13594W = 0;
        this.f13599aa = false;
        this.f13597Z = false;
        this.f13585N = false;
        this.f13575C = null;
        this.f13602d.removeCallbacksAndMessages(null);
    }

    /* renamed from: f */
    public final void mo10958f() {
        Context context;
        if (this.f13603e == null || this.f13603e.get() == null) {
            context = null;
        } else {
            context = (Context) this.f13603e.get();
        }
        C8068g.m16014a(context);
        m11586a("request_id", this.f13604f, "log_pb", this.f13605g, "log_pb", this.f13605g);
    }

    /* renamed from: d */
    public final void mo10956d() {
        String str;
        long j;
        if (!this.f13586O) {
            this.f13586O = true;
            if (this.f13613o == null) {
                str = "other";
            } else {
                str = this.f13613o.f21289a;
            }
            if (this.f13610l) {
                j = this.f13614p;
            } else if (this.f13613o != null) {
                j = this.f13613o.mo14093a();
            } else {
                j = SystemClock.elapsedRealtime() - this.f13612n;
            }
            C8069h hVar = new C8069h();
            String str2 = "wait_duration";
            if (j <= 0) {
                j = 0;
            }
            hVar.mo14225a(str2, (Object) Long.valueOf(j)).mo14225a("enter_room_type", (Object) str).mo14228a("hotsoon_live_enter_wait_patience", true ^ this.f13610l ? 1 : 0);
        }
    }

    /* renamed from: g */
    public final void mo10959g() {
        if (!this.f13589R) {
            this.f13589R = true;
            this.f13588Q = SystemClock.elapsedRealtime();
            C8049c.m15979a().mo14202a("live_stream_load_success", null, new C8059j().mo14214b("live_view").mo14218f("core").mo14213a("live_detail").mo14215c(CustomActionPushReceiver.f104061f), Room.class, LinkCrossRoomDataHolder.m11103a().mo10411b());
        }
    }

    /* renamed from: c */
    public final void mo10955c() {
        String str;
        String str2;
        String str3;
        if (this.f13612n != -1 && !this.f13587P) {
            if (this.f13588Q != -1) {
                C8049c.m15979a().mo14202a("live_stream_duration", null, new C8059j().mo14214b("live_view").mo14213a("live_detail"), new C8057h((SystemClock.elapsedRealtime() - this.f13588Q) - this.f13616r), Room.class);
            }
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.f13612n) - this.f13616r;
            String str4 = "";
            if (this.f13608j != null) {
                this.f13608j.getString("source");
            }
            HashMap hashMap = new HashMap();
            String str5 = "streaming_type";
            if (this.f13624z) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put(str5, str);
            hashMap.put("request_page", C4995b.m11478a().mo10874f());
            C8049c.m15979a().mo14202a("live_duration", hashMap, new C8059j().mo14214b("live_view").mo14213a("live_detail").mo14216d(str4), new C8057h(elapsedRealtime), Room.class);
            this.f13587P = true;
            if (this.f13576D != -1) {
                DataCenter dataCenter = this.f13575C;
                HashMap hashMap2 = new HashMap();
                if (this.f13608j != null) {
                    hashMap2.put("starlight_rank", this.f13608j.getString("starlight_rank", ""));
                }
                String str6 = "";
                if (C8049c.m15979a().mo14201a(C8059j.class).mo14192a().containsKey("video_id")) {
                    str6 = (String) C8049c.m15979a().mo14201a(C8059j.class).mo14192a().get("video_id");
                }
                hashMap2.put("video_id", str6);
                if (dataCenter != null) {
                    String str7 = "is_live_recall";
                    if (C9431p.m18664a((String) dataCenter.get("data_xt_media_replay", ""))) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    hashMap2.put(str7, str2);
                    Room room = (Room) dataCenter.get("data_room");
                    if (room != null) {
                        String str8 = "is_sale";
                        if (room.hasCommerceGoods) {
                            str3 = "1";
                        } else {
                            str3 = "0";
                        }
                        hashMap2.put(str8, str3);
                        hashMap2.put("orientation", String.valueOf(room.getOrientation()));
                    }
                }
                if (this.f13596Y != null && !this.f13596Y.isDisposed()) {
                    try {
                        this.f13596Y.dispose();
                    } catch (Exception e) {
                        C8064d.m16005b();
                        C8064d.m9718a(6, e.getStackTrace());
                    }
                }
                hashMap2.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f13576D));
                hashMap2.put("trigger", "close");
                C8049c.m15979a().mo14202a("livesdk_video_over", hashMap2, new C8059j().mo14219g(this.f13617s), Room.class);
                this.f13576D = -1;
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m11586a(Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        while (i < 6) {
            try {
                if (objArr[i] instanceof String) {
                    int i2 = i + 1;
                    if (i2 < 6) {
                        jSONObject.put(objArr[i], objArr[i2]);
                    } else if (f13572J) {
                        throw new IllegalArgumentException(C4604n.m11051a(Locale.ENGLISH, "no value found for key at %d", Integer.valueOf(i)));
                    }
                } else if (f13572J) {
                    throw new IllegalArgumentException(C4604n.m11051a(Locale.ENGLISH, "key at %d is not a string", Integer.valueOf(i)));
                }
                i += 2;
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo10953a(boolean z, boolean z2) {
        String str;
        long j;
        String str2;
        if (z) {
            this.f13597Z = z;
        }
        if (z2) {
            this.f13599aa = z2;
        }
        if (this.f13599aa && this.f13597Z && !this.f13585N) {
            this.f13585N = true;
            HashMap hashMap = new HashMap();
            String str3 = "streaming_type";
            if (this.f13624z) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put(str3, str);
            if (this.f13608j != null) {
                Bundle bundle = (Bundle) this.f13608j.get("live.intent.extra.ENTER_LIVE_EXTRA_V1");
                if (bundle != null && bundle.containsKey("subtab")) {
                    hashMap.put("subtab", (String) bundle.get("subtab"));
                }
            }
            if (!C9431p.m18664a(this.f13577E) && "draw".equals(this.f13617s)) {
                hashMap.put("scene_id", this.f13577E);
            }
            hashMap.put("growth_deepevent", "1");
            hashMap.put("live_cover_mode", this.f13619u);
            if (this.f13608j != null) {
                j = this.f13608j.getLong("live.intent.extra.FROM_PORTAL_ID");
            } else {
                j = 0;
            }
            if (j > 0) {
                hashMap.put("portal_id", String.valueOf(j));
                hashMap.put("originating_room_id", String.valueOf(this.f13608j.getLong("live.intent.extra.ORIGINATING_ROOM_ID")));
            }
            if (this.f13608j != null) {
                hashMap.put("request_page", this.f13608j.getString("request_page"));
            }
            if (this.f13608j != null) {
                hashMap.put("anchor_type", this.f13608j.getString("anchor_type"));
            }
            if (this.f13608j != null) {
                hashMap.put("is_fans", this.f13608j.getString("is_fans", "0"));
            }
            if (C4600j.m11043d(this.f13575C) || C4600j.m11040b(this.f13575C)) {
                String str4 = "is_other_channel";
                if (C4600j.m11040b(this.f13575C)) {
                    str2 = "dou_plus";
                } else {
                    str2 = "effective_ad";
                }
                hashMap.put(str4, str2);
            }
            if (!TextUtils.isEmpty(this.f13581I)) {
                hashMap.put("previous_page", this.f13581I);
            }
            if (!(this.f13582K == null || this.f13582K.getBundle("log_extra") == null)) {
                String string = this.f13582K.getBundle("log_extra").getString("enter_from_merge");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put("previous_page", string);
                }
            }
            hashMap.put("request_page", C4995b.m11478a().mo10874f());
            C8049c.m15979a().mo14202a("live_play", hashMap, new C8059j().mo14214b("live_view").mo14218f("core").mo14213a("live_detail").mo14215c(CustomActionPushReceiver.f104061f), Room.class, LinkCrossRoomDataHolder.m11103a().mo10411b());
        }
    }

    /* renamed from: a */
    public final void mo10952a(boolean z, int i, String str) {
        String str2;
        if (!this.f13584M) {
            this.f13584M = true;
            if (this.f13613o == null) {
                str2 = "other";
            } else {
                str2 = this.f13613o.f21289a;
            }
            long j = 0;
            if (z && this.f13614p > 0) {
                j = this.f13614p;
            }
            new C8069h().mo14225a("error_code", (Object) Integer.valueOf(i)).mo14225a("error_desc", (Object) str).mo14225a("duration", (Object) Long.valueOf(j)).mo14225a("enter_room_type", (Object) str2).mo14225a("room_id", (Object) Long.valueOf(this.f13583L)).mo14228a("hotsoon_live_audience_enter_room", z ^ true ? 1 : 0);
        }
    }

    /* renamed from: a */
    public final void mo10951a(long j, boolean z, boolean z2, long j2, C8722v vVar) {
        String str;
        this.f13583L = j;
        if (z) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        this.f13623y = str;
        this.f13624z = z2;
        this.f13573A = j2;
        this.f13590S = vVar;
        if (vVar != null) {
            this.f13591T = vVar.f23955a;
            if (vVar.f23957c != null && vVar.f23957c.f23830b != 0) {
                this.f13592U = vVar.f23957c.f23833e;
                this.f13593V = vVar.f23957c.f23831c;
                this.f13594W = vVar.f23957c.f23830b;
            }
        }
    }

    public C5070h(Context context, String str, String str2, long j, String str3, String str4, Bundle bundle, Bundle bundle2, String str5, String str6, String str7) {
        f13572J = TextUtils.equals(TTLiveSDKContext.getHostService().mo10308a().getChannel(), "local_test");
        this.f13602d = new Handler(Looper.getMainLooper());
        Context context2 = context;
        this.f13603e = new WeakReference<>(context);
        this.f13604f = str;
        this.f13605g = str2;
        this.f13606h = j;
        this.f13607i = str3;
        this.f13620v = str4;
        this.f13608j = bundle;
        this.f13582K = bundle2;
        this.f13609k = str5;
        this.f13621w = str6;
        this.f13622x = str7;
    }
}
