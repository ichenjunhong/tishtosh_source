package com.bytedance.p513c.p515b;

import android.app.Activity;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.widget.Toast;
import com.bytedance.p513c.C9296c;
import com.bytedance.p513c.C9296c.C9299b;
import com.bytedance.p513c.C9302d;
import com.bytedance.p513c.C9315f;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.bytedance.c.b.c */
public final class C9295c {

    /* renamed from: a */
    public C9296c f25422a;

    /* renamed from: b */
    public C9292b f25423b;

    /* renamed from: c */
    public boolean f25424c;

    public C9295c(C9296c cVar) {
        this.f25422a = cVar;
        this.f25423b = new C9292b(cVar.f25426b, cVar.f25442r);
    }

    /* renamed from: a */
    public final String mo16888a(Activity activity, int i, String str) {
        String str2;
        String str3;
        C9292b bVar = this.f25423b;
        C9299b bVar2 = this.f25422a.f25425a;
        if (C9292b.f25406a != bVar2) {
            C9292b.f25406a = bVar2;
            bVar.mo16883a();
        }
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 1:
                str2 = this.f25423b.f25413e;
                sb.append("&scene=");
                sb.append(this.f25422a.f25447w);
                break;
            case 2:
                str2 = this.f25423b.f25412d;
                if (str == null) {
                    sb.append("&challenge_code=");
                    sb.append(this.f25422a.f25446v);
                    break;
                }
                break;
            default:
                str2 = null;
                break;
        }
        String c = this.f25423b.mo16886c();
        int i2 = 1;
        if (C9315f.m18472a()) {
            if (this.f25422a.f25443s != null && !this.f25422a.f25443s.isEmpty()) {
                str2 = this.f25422a.f25443s;
            }
            if (this.f25422a.f25444t != null && !this.f25422a.f25444t.isEmpty()) {
                c = this.f25422a.f25444t;
            }
            StringBuilder sb2 = new StringBuilder("url = ");
            sb2.append(str2);
            sb2.append(", verifyHost = ");
            sb2.append(c);
            Toast makeText = Toast.makeText(activity, sb2.toString(), 1);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
        }
        try {
            str3 = URLEncoder.encode(c, "utf-8");
            if (str != null) {
                try {
                    sb.append("&verify_data=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = c;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append("?");
        StringBuilder sb4 = new StringBuilder(sb3.toString());
        sb4.append("aid=");
        sb4.append(this.f25422a.f25426b);
        sb4.append("&lang=");
        sb4.append(this.f25422a.f25427c);
        sb4.append("&locale=");
        sb4.append(this.f25422a.f25445u);
        sb4.append("&app_name=");
        sb4.append(this.f25422a.f25428d);
        sb4.append("&ch=");
        sb4.append(this.f25422a.f25429e);
        sb4.append("&os_type=0");
        sb4.append("&sdk_version=");
        sb4.append(this.f25422a.f25430f);
        sb4.append("&app_key=");
        sb4.append(this.f25422a.f25431g);
        sb4.append("&iid=");
        sb4.append(this.f25422a.f25432h);
        sb4.append("&vc=");
        sb4.append(this.f25422a.f25433i);
        sb4.append("&os_name=");
        sb4.append(this.f25422a.f25434j);
        sb4.append("&os_version=");
        sb4.append(this.f25422a.f25435k);
        sb4.append("&did=");
        sb4.append(this.f25422a.f25436l);
        sb4.append("&user_id=");
        sb4.append(this.f25422a.f25439o);
        sb4.append("&session_id=");
        sb4.append(this.f25422a.f25440p);
        sb4.append("&orientation=");
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        new StringBuilder("rotation current ").append(rotation);
        switch (rotation) {
            case 0:
            case 2:
                i2 = 2;
                break;
            case 1:
            case 3:
                break;
            default:
                i2 = 0;
                break;
        }
        C9302d.m18448a(i2);
        sb4.append(i2);
        sb4.append("&resolution=");
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(i3);
        sb5.append("*");
        sb5.append(i4);
        sb4.append(sb5.toString());
        sb4.append("&region=");
        sb4.append(this.f25422a.f25425a.getName());
        sb4.append("&device_brand=");
        sb4.append(this.f25422a.f25437m);
        sb4.append("&device_model=");
        sb4.append(this.f25422a.f25438n);
        sb4.append("&verify_host=");
        sb4.append(str3);
        sb4.append(sb);
        return sb4.toString();
    }
}
