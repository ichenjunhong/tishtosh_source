package com.p683ss.ugc.live.sdk.p2606b.p2607a;

import com.p683ss.ttm.player.TTMediaPlayer;
import com.p683ss.ugc.live.sdk.p2606b.C51626b;
import com.p683ss.ugc.live.sdk.p2606b.C51631d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ugc.live.sdk.b.a.a */
final class C51622a extends C51631d {

    /* renamed from: m */
    private final TTMediaPlayer f128929m;

    /* renamed from: j */
    public final String mo105572j() {
        return "tt";
    }

    /* renamed from: f */
    public final long mo105568f() {
        return this.f128929m.getLongOption(46, 0);
    }

    /* renamed from: g */
    public final long mo105569g() {
        return this.f128929m.getLongOption(72, 0);
    }

    /* renamed from: h */
    public final long mo105570h() {
        return this.f128929m.getLongOption(73, 0);
    }

    /* renamed from: i */
    public final String mo105571i() {
        return this.f128929m.getStringOption(71);
    }

    /* renamed from: k */
    public final String mo105573k() {
        return this.f128929m.getStringOption(5002);
    }

    /* renamed from: b */
    private long m110812b(int i) {
        if (this.f128945b <= 0) {
            return 0;
        }
        long longOption = this.f128929m.getLongOption(i, -1);
        if (longOption <= 0) {
            return 0;
        }
        return Math.max(0, longOption - this.f128945b);
    }

    /* renamed from: b */
    public final void mo105567b(JSONObject jSONObject) throws JSONException {
        jSONObject.put("dns_time", m110812b(68)).put("tcp_connect_time", m110812b(69)).put("tcp_first_packet_time", m110812b(70)).put("first_video_frame_received", m110812b(75)).put("first_audio_frame_received", m110812b(76)).put("first_video_frame_decoded", m110812b(77)).put("first_audio_frame_decoded", m110812b(78));
    }

    C51622a(C51626b bVar, TTMediaPlayer tTMediaPlayer) {
        super(bVar);
        this.f128929m = tTMediaPlayer;
    }
}
