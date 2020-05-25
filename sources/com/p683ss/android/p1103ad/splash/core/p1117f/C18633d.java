package com.p683ss.android.p1103ad.splash.core.p1117f;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import com.p683ss.android.p1103ad.splash.p1123g.C18740f;
import com.p683ss.android.p1103ad.splash.p1123g.C18742h;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.f.d */
public final class C18633d implements C18632c {

    /* renamed from: a */
    public Context f51443a;

    /* renamed from: b */
    public C18638f f51444b;

    /* renamed from: com.ss.android.ad.splash.core.f.d$a */
    class C18636a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        private C18637e f51449b;

        /* renamed from: c */
        private long f51450c;

        /* renamed from: a */
        private static String m45160a(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                String replace = str.replace("[ss_random]", String.valueOf(new Random().nextLong()));
                try {
                    return replace.replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                } catch (Exception unused) {
                    return replace;
                }
            } catch (Exception unused2) {
                return str;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            boolean z;
            String str = this.f51449b.f51452b;
            boolean z2 = false;
            if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return null;
            }
            if (this.f51449b.f51454d == 0) {
                C18633d.this.f51444b.mo38053c(this.f51449b);
                return null;
            }
            while (true) {
                if (this.f51449b.f51454d > 0 && !isCancelled()) {
                    if (this.f51449b.f51454d == 5) {
                        C18633d.this.f51444b.mo38051a(this.f51449b);
                    }
                    if (C18742h.m45696a(C18633d.this.f51443a)) {
                        String str2 = this.f51449b.f51452b;
                        if (!TextUtils.isEmpty(str2)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            this.f51450c = currentTimeMillis;
                            if (str2.contains("{TS}") || str2.contains("__TS__")) {
                                str2 = str2.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                            }
                        }
                        int i = this.f51449b.f51455e;
                        if (this.f51449b.f51453c) {
                            str2 = m45160a(str2);
                        }
                        if (C18642g.m45250w() == null) {
                            return null;
                        }
                        C18640h a = C18642g.m45250w().mo38377a(str2);
                        if (a != null) {
                            JSONObject jSONObject = new JSONObject();
                            if (this.f51449b != null && this.f51449b.f51456f > 0) {
                                try {
                                    jSONObject.put("track_url_list", str2);
                                    jSONObject.put("track_status", a.f51460b);
                                    jSONObject.put("ts", this.f51450c);
                                    jSONObject.put("local_time_ms", System.currentTimeMillis());
                                    if (!C18747l.m45742a(a.f51459a)) {
                                        jSONObject.put("user_agent", a.f51459a);
                                    } else {
                                        jSONObject.put("user_agent", -1);
                                    }
                                    jSONObject.put("is_ad_event", 1);
                                    jSONObject.put("category", "umeng");
                                    jSONObject.put("ad_event_type", "monitor");
                                    long j = -1;
                                    if (C18642g.m45227e() != null && C18642g.m45227e().mo38028d() > 0) {
                                        j = C18642g.m45227e().mo38028d();
                                    }
                                    jSONObject.put("user_id", j);
                                    if (!C18747l.m45742a(this.f51449b.f51457g)) {
                                        jSONObject.put("log_extra", this.f51449b.f51457g);
                                    } else {
                                        jSONObject.put("log_extra", -1);
                                    }
                                    String str3 = "";
                                    switch (i) {
                                        case 1:
                                            str3 = "show";
                                            break;
                                        case 2:
                                            str3 = "play";
                                            break;
                                        case 3:
                                            str3 = "click";
                                            break;
                                        case 4:
                                            str3 = "play_over";
                                            break;
                                    }
                                    jSONObject.put("track_label", str3);
                                    C18642g.m45201a(this.f51449b.f51456f, "track_ad", "track_url", jSONObject);
                                } catch (Exception unused) {
                                }
                            }
                            if (a.f51460b >= 200 && a.f51460b < 300) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            C18633d.this.f51444b.mo38053c(this.f51449b);
                            new StringBuilder("track success : ").append(this.f51449b.f51452b);
                        } else {
                            new StringBuilder("track fail : ").append(this.f51449b.f51452b);
                            this.f51449b.f51454d--;
                            if (this.f51449b.f51454d == 0) {
                                C18633d.this.f51444b.mo38053c(this.f51449b);
                                new StringBuilder("track fail and delete : ").append(this.f51449b.f51452b);
                            } else {
                                C18633d.this.f51444b.mo38052b(this.f51449b);
                            }
                        }
                    }
                }
            }
            if (!z2) {
                String str4 = this.f51449b.f51452b;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("key_send_track_url", str4);
                    C18550a.m44899a().mo37845a("service_ad_send_track_fail", (JSONObject) null, jSONObject2);
                } catch (Exception unused2) {
                }
            }
            return null;
        }

        private C18636a(C18637e eVar) {
            this.f51449b = eVar;
        }
    }

    /* renamed from: a */
    public final void mo38046a() {
        if (C18742h.m45696a(this.f51443a)) {
            C18642g.m45176D().submit(new Runnable() {
                public final void run() {
                    final List a = C18633d.this.f51444b.mo38050a();
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C18633d dVar = C18633d.this;
                            List<C18637e> list = a;
                            if (C18740f.m45692b(list)) {
                                for (C18637e aVar : list) {
                                    new C18636a(aVar).executeOnExecutor(C18642g.m45176D(), new Void[0]);
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    public C18633d(Context context, C18638f fVar) {
        this.f51443a = context;
        this.f51444b = fVar;
    }

    /* renamed from: a */
    private void m45154a(long j, String str, List<String> list, boolean z, int i) {
        if (C18740f.m45692b(list)) {
            for (String eVar : list) {
                long j2 = j;
                String str2 = str;
                C18637e eVar2 = new C18637e(j2, str2, UUID.randomUUID().toString(), eVar, true, 5, i);
                new C18636a(eVar2).executeOnExecutor(C18642g.m45176D(), new Void[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo38042a(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        m45154a(j, str, list, true, 1);
    }

    /* renamed from: b */
    public final void mo38043b(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        m45154a(j, str, list, true, 3);
    }

    /* renamed from: c */
    public final void mo38044c(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        m45154a(j, str, list, true, 2);
    }

    /* renamed from: d */
    public final void mo38045d(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        m45154a(j, str, list, true, 4);
    }
}
