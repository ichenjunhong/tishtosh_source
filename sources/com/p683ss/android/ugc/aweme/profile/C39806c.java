package com.p683ss.android.ugc.aweme.profile;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.c */
public class C39806c {

    /* renamed from: k */
    private static C39806c f101575k;

    /* renamed from: a */
    public int f101576a = 11;

    /* renamed from: b */
    public Keva f101577b = Keva.getRepo("ug_coupon_repo");

    /* renamed from: c */
    private final String f101578c = "ug_coupon_repo";

    /* renamed from: d */
    private final String f101579d = "show_bubble";

    /* renamed from: e */
    private final String f101580e = "show_bar";

    /* renamed from: f */
    private final String f101581f = "show_star";

    /* renamed from: g */
    private final String f101582g = "show_bar_time";

    /* renamed from: h */
    private DateFormat f101583h = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: i */
    private String f101584i = C39806c.class.getSimpleName();

    /* renamed from: j */
    private int f101585j = 24;

    /* renamed from: b */
    public final boolean mo80881b() {
        if (!this.f101577b.getBoolean("show_bubble", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo80884d() {
        if (this.f101577b.getInt("show_bar_time", 0) >= this.f101576a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C39806c m88518a() {
        if (f101575k == null) {
            synchronized (C39806c.class) {
                if (f101575k == null) {
                    f101575k = new C39806c();
                }
            }
        }
        return f101575k;
    }

    /* renamed from: c */
    public final void mo80882c() {
        this.f101577b.storeInt("show_bar_time", this.f101577b.getInt("show_bar_time", 0) + 1);
    }

    /* renamed from: e */
    public final boolean mo80885e() {
        if (!this.f101577b.contains("show_bubble")) {
            return false;
        }
        if (!this.f101577b.contains("show_star") || !this.f101577b.getBoolean("show_star", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo80880b(boolean z) {
        if (z || !this.f101577b.getBoolean("show_bar", false)) {
            this.f101577b.storeBoolean("show_bar", z);
        }
    }

    /* renamed from: a */
    public final void mo80877a(JSONObject jSONObject) {
        new StringBuilder("updateFirstTime:").append(jSONObject.toString());
        try {
            String string = jSONObject.getString("activity_id");
            Date date = new Date();
            StringBuilder sb = new StringBuilder("setFirstTime:");
            sb.append(date.toString());
            sb.append("activityId:");
            sb.append(string);
            this.f101577b.storeString(string, this.f101583h.format(date));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    public final void mo80883c(boolean z) {
        if (!this.f101577b.getBoolean("show_star", false)) {
            this.f101577b.storeBoolean("show_star", false);
        }
    }

    /* renamed from: a */
    public final void mo80878a(boolean z) {
        if (z || !this.f101577b.getBoolean("show_bubble", false)) {
            this.f101577b.storeBoolean("show_bubble", z);
        }
    }

    /* renamed from: a */
    public final boolean mo80879a(String str, int i) {
        String string = this.f101577b.getString(str, "");
        new StringBuilder("showCouponIcon,activityId:").append(str);
        if (TextUtils.equals(string, "")) {
            return false;
        }
        try {
            if ((new Date().getTime() - this.f101583h.parse(string).getTime()) / TimeUnit.DAYS.toMillis(1) < ((long) i)) {
                return true;
            }
            return false;
        } catch (ParseException unused) {
            this.f101577b.storeString(str, "");
            return false;
        }
    }
}
