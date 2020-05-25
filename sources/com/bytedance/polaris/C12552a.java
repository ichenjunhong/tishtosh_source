package com.bytedance.polaris;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.polaris.p821a.C12559e;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p826d.C12649o;
import com.bytedance.polaris.p826d.C12650p;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.a */
public final class C12552a implements C9382a {

    /* renamed from: e */
    public static C12649o<C12552a> f32937e = new C12649o<C12552a>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo23595a() {
            return new C12552a();
        }
    };

    /* renamed from: a */
    public volatile boolean f32938a;

    /* renamed from: b */
    public long f32939b;

    /* renamed from: c */
    public Handler f32940c;

    /* renamed from: d */
    public long f32941d;

    /* renamed from: f */
    private JSONObject f32942f;

    /* renamed from: com.bytedance.polaris.a$a */
    static final class C12554a implements Runnable {
        C12554a() {
        }

        public final void run() {
            try {
                if (!C12552a.m25181a().f32938a) {
                    C12552a.m25181a().f32938a = true;
                    C12559e g = C12563i.m25225g();
                    if (g == null) {
                        C12552a.m25181a().f32938a = false;
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C12552a.m25181a().f32939b > 21600000 || C12552a.m25181a().f32941d * 1000 <= currentTimeMillis) {
                        C12552a.m25181a().f32939b = System.currentTimeMillis();
                        C12552a a = C12552a.m25181a();
                        Application a2 = C12563i.m25215a();
                        if (a2 != null) {
                            Editor edit = C35807d.m80935a(a2, "red_packet", 0).edit();
                            edit.putLong("last_update_settings_time", a.f32939b);
                            edit.commit();
                        }
                        StringBuilder sb = new StringBuilder(C12563i.m25220b("/luckycat/tiktokm/v1/widget/kvs"));
                        C12650p.m25420a(sb, true);
                        sb.append("&keys=next_req_interval,req_frequency_control_switch,next_refresh");
                        String a3 = g.mo23607a(20480, sb.toString());
                        if (TextUtils.isEmpty(a3)) {
                            C12552a.m25181a().f32938a = false;
                            return;
                        }
                        JSONObject jSONObject = new JSONObject(a3);
                        if (jSONObject.optInt("err_no", -1) != 0) {
                            C12552a.m25181a().f32938a = false;
                            return;
                        }
                        C12552a.m25181a().f32938a = false;
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = optJSONObject;
                        C12552a.m25181a().f32940c.sendMessage(obtain);
                        return;
                    }
                    C12552a.m25181a().f32938a = false;
                }
            } catch (Throwable unused) {
                C12552a.m25181a().f32938a = false;
            }
        }
    }

    /* renamed from: a */
    public static C12552a m25181a() {
        return (C12552a) f32937e.mo23740b();
    }

    /* renamed from: b */
    public final void mo23593b() {
        if (!this.f32938a) {
            C9393e.submitRunnable(new C12554a());
        }
    }

    /* renamed from: c */
    public final boolean mo23594c() {
        if (m25180a("req_frequency_control_switch", 0) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static JSONObject m25182d() {
        try {
            Application a = C12563i.m25215a();
            if (a == null) {
                return null;
            }
            String string = C35807d.m80935a(a, "red_packet", 0).getString("red_packet_settings", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    private C12552a() {
        this.f32942f = m25182d();
        Application a = C12563i.m25215a();
        long j = 0;
        if (a != null) {
            SharedPreferences a2 = C35807d.m80935a(a, "red_packet", 0);
            if (a2 != null) {
                j = a2.getLong("last_update_settings_time", 0);
            }
        }
        this.f32939b = j;
        this.f32940c = new C9381g(Looper.getMainLooper(), this);
        if (this.f32942f == null) {
            this.f32941d = -1;
        } else {
            this.f32941d = mo23592a("next_refresh", -1);
        }
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            JSONObject jSONObject = (JSONObject) message.obj;
            C12552a a = m25181a();
            if (jSONObject != null) {
                Application a2 = C12563i.m25215a();
                if (a2 != null) {
                    a.f32942f = jSONObject;
                    if (a.f32942f != null) {
                        a.f32941d = a.mo23592a("next_refresh", -1);
                    }
                    Editor edit = C35807d.m80935a(a2, "red_packet", 0).edit();
                    edit.putString("red_packet_settings", jSONObject.toString());
                    edit.commit();
                }
            }
        }
    }

    /* renamed from: a */
    private int m25180a(String str, int i) {
        try {
            if (TextUtils.isEmpty(str) || this.f32942f == null || !this.f32942f.has(str)) {
                return 0;
            }
            JSONObject optJSONObject = this.f32942f.optJSONObject(str);
            if (optJSONObject == null) {
                return 0;
            }
            return Integer.valueOf(optJSONObject.optString("value", "0")).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final long mo23592a(String str, long j) {
        try {
            if (TextUtils.isEmpty(str) || !this.f32942f.has(str)) {
                return j;
            }
            JSONObject optJSONObject = this.f32942f.optJSONObject(str);
            if (optJSONObject == null) {
                return j;
            }
            return Long.valueOf(optJSONObject.optString("value", String.valueOf(j))).longValue();
        } catch (Throwable unused) {
            return 0;
        }
    }
}
