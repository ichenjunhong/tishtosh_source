package com.p683ss.ugc.live.sdk.p2606b;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C9415i;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.ugc.live.sdk.p2606b.C51627c.C51630c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ugc.live.sdk.b.d */
public abstract class C51631d {

    /* renamed from: a */
    public final C51626b f128944a;

    /* renamed from: b */
    protected long f128945b;

    /* renamed from: c */
    int f128946c;

    /* renamed from: d */
    long f128947d;

    /* renamed from: e */
    long f128948e;

    /* renamed from: f */
    public long f128949f;

    /* renamed from: g */
    public String f128950g;

    /* renamed from: h */
    public String f128951h;

    /* renamed from: i */
    String f128952i;

    /* renamed from: j */
    String f128953j;

    /* renamed from: k */
    C51630c f128954k = C51630c.VIDEO;

    /* renamed from: l */
    int f128955l = 0;

    /* renamed from: m */
    private final Handler f128956m = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1024) {
                try {
                    C51631d.this.mo105577a(new JSONObject().put("body_type", "onPlay").put("video_buff_length", C51631d.this.mo105569g()).put("audio_buff_length", C51631d.this.mo105570h()).put("stream_delay", new JSONObject().put("delay", C51631d.this.f128949f).put("vendor", C51631d.this.f128951h).put("push_dev", C51631d.this.f128950g)));
                    C51631d.this.mo105581e();
                } catch (JSONException unused) {
                }
            }
        }
    };

    /* renamed from: n */
    private final boolean f128957n;

    /* renamed from: o */
    private C51633a f128958o = C51633a.IDLE;

    /* renamed from: com.ss.ugc.live.sdk.b.d$a */
    enum C51633a {
        IDLE,
        PREPARING,
        PREPARED
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo105567b(JSONObject jSONObject) throws JSONException;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract long mo105568f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract long mo105569g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract long mo105570h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo105571i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract String mo105572j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo105573k();

    /* renamed from: l */
    private void m110848l() {
        this.f128956m.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
    }

    /* renamed from: e */
    public final void mo105581e() {
        if (!this.f128956m.hasMessages(PreloadTask.BYTE_UNIT_NUMBER)) {
            this.f128956m.sendEmptyMessageDelayed(PreloadTask.BYTE_UNIT_NUMBER, 5000);
        }
    }

    /* renamed from: a */
    public final void mo105575a() {
        if (this.f128958o == C51633a.IDLE) {
            this.f128958o = C51633a.PREPARING;
            this.f128946c = 0;
            this.f128947d = 0;
            this.f128948e = 0;
            this.f128945b = System.currentTimeMillis();
            this.f128949f = 0;
            this.f128950g = null;
            this.f128951h = null;
        }
    }

    /* renamed from: b */
    public final void mo105578b() {
        m110848l();
        long f = mo105568f();
        long currentTimeMillis = System.currentTimeMillis() - this.f128945b;
        try {
            mo105577a(new JSONObject().put("body_type", "onPause").put("block_cnt", this.f128946c).put("block_time", this.f128948e).put("down_size", f / 1024).put("play_len", currentTimeMillis).put("play_speed", f / currentTimeMillis));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    public final void mo105579c() {
        m110848l();
        long f = mo105568f();
        long currentTimeMillis = System.currentTimeMillis() - this.f128945b;
        try {
            mo105577a(new JSONObject().put("body_type", "onPlayEnd").put("block_cnt", this.f128946c).put("block_time", this.f128948e).put("down_size", f / 1024).put("play_len", currentTimeMillis).put("play_speed", f / currentTimeMillis));
        } catch (JSONException unused) {
        }
        this.f128958o = C51633a.IDLE;
        this.f128946c = 0;
        this.f128947d = 0;
        this.f128948e = 0;
        this.f128945b = 0;
        this.f128949f = 0;
        this.f128950g = null;
        this.f128951h = null;
    }

    /* renamed from: d */
    public final void mo105580d() {
        if (this.f128958o != C51633a.PREPARED) {
            this.f128958o = C51633a.PREPARED;
            try {
                JSONObject put = new JSONObject().put("body_type", "onPrepared").put("first_screen", System.currentTimeMillis() - this.f128945b).put("play_stat", "ok").put("fail_code", 0).put("retry_times", this.f128955l);
                this.f128955l = 0;
                mo105567b(put);
                mo105577a(put);
                m110848l();
                mo105581e();
            } catch (JSONException unused) {
            }
        }
    }

    public C51631d(C51626b bVar) {
        this.f128944a = bVar;
        this.f128957n = C9415i.m18635b();
    }

    /* renamed from: a */
    public final void mo105576a(int i) {
        JSONObject jSONObject;
        m110848l();
        try {
            if (this.f128958o != C51633a.PREPARED) {
                this.f128958o = C51633a.PREPARED;
                jSONObject = new JSONObject().put("body_type", "onPrepared").put("first_screen", 0).put("play_stat", "fail").put("fail_code", i).put("error_msg", mo105573k());
                mo105567b(jSONObject);
            } else {
                jSONObject = new JSONObject().put("body_type", "onPrepared").put("fail_code", i).put("error_msg", mo105573k());
            }
            int i2 = this.f128955l + 1;
            this.f128955l = i2;
            jSONObject.put("fail_count", i2);
            mo105577a(jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo105577a(JSONObject jSONObject) throws JSONException {
        if (!TextUtils.isEmpty(this.f128953j)) {
            String i = mo105571i();
            Uri parse = Uri.parse(this.f128953j);
            String queryParameter = parse.getQueryParameter("anchor_version");
            String queryParameter2 = parse.getQueryParameter("anchor_device_platform");
            String queryParameter3 = parse.getQueryParameter("room_id");
            jSONObject.put("anchor_version", queryParameter).put("anchor_device_platform", queryParameter2).put("room_id", queryParameter3).put("serverIp", i).put("stream_type", this.f128954k.ordinal()).put("tt_url", this.f128953j).put("anchor_rtmp_service", this.f128951h).put("anchor_uid", parse.getQueryParameter("anchor_id")).put("player_type", mo105572j());
        }
    }
}
