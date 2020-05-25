package com.bytedance.android.livesdk.player;

import android.os.SystemClock;
import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.live.p393a.C7743a;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.r */
public final class C8108r extends C3833a {

    /* renamed from: a */
    public C7743a f22135a;

    /* renamed from: b */
    public long f22136b;

    /* renamed from: c */
    public volatile boolean f22137c;

    /* renamed from: d */
    public int f22138d;

    /* renamed from: e */
    public C8110t f22139e;

    /* renamed from: f */
    private volatile boolean f22140f;

    /* renamed from: a */
    public final long mo14294a() {
        long j;
        if (this.f22135a != null) {
            j = this.f22135a.mo14093a();
        } else if (this.f22136b > 0) {
            j = SystemClock.uptimeMillis() - this.f22136b;
        } else {
            j = 0;
        }
        this.f22135a = null;
        this.f22136b = 0;
        return j;
    }

    /* renamed from: a */
    public final void mo14298a(long j) {
        String str;
        if (!this.f22137c) {
            this.f22137c = true;
            if (this.f22135a != null) {
                str = this.f22135a.f21289a;
            } else {
                str = "other";
            }
            long a = mo14294a();
            JSONObject jSONObject = new JSONObject();
            m9731a(jSONObject, "enter_room_type", str);
            m9730a(jSONObject, "room_id", j);
            C3837e.m9742a("ttlive_audience_enter_room_all", 2, a, jSONObject);
            C3837e.m9744a("ttlive_audience_enter_room_error", 2, jSONObject);
            C8029a.m15933a().mo14190a(C8030b.Room.info, "ttlive_audience_enter_room", 2, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo14295a(int i, String str) {
        if (!this.f22140f) {
            this.f22140f = true;
            JSONObject jSONObject = new JSONObject();
            m9730a(jSONObject, "exit_code", (long) i);
            m9731a(jSONObject, "exit_msg", str);
            C3837e.m9744a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo14296a(int i, String str, long j) {
        if (!this.f22140f) {
            if (i != 115) {
                this.f22140f = true;
            }
            JSONObject jSONObject = new JSONObject();
            m9730a(jSONObject, "exit_code", (long) i);
            m9731a(jSONObject, "exit_msg", str);
            m9730a(jSONObject, "room_id", j);
            C3837e.m9744a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo14297a(int i, String str, long j, String str2, String str3) {
        String str4;
        if (!this.f22137c) {
            this.f22137c = true;
            if (this.f22135a != null) {
                str4 = this.f22135a.f21289a;
            } else {
                str4 = "other";
            }
            mo14294a();
            JSONObject jSONObject = new JSONObject();
            m9731a(jSONObject, "enter_room_type", str4);
            m9731a(jSONObject, "room_type", str2);
            m9730a(jSONObject, "error_code", (long) i);
            m9731a(jSONObject, "error_msg", str);
            m9730a(jSONObject, "room_id", j);
            m9731a(jSONObject, "pull_url", str3);
            C3837e.m9749b("ttlive_audience_enter_room_all", 1, jSONObject);
            C3837e.m9744a("ttlive_audience_enter_room_error", 1, jSONObject);
            C8029a.m15933a().mo14190a(C8030b.Room.info, "ttlive_audience_enter_room", 1, jSONObject);
        }
    }
}
