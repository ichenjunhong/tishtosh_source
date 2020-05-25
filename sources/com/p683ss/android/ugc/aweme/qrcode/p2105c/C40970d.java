package com.p683ss.android.ugc.aweme.qrcode.p2105c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.d */
public final class C40970d {

    /* renamed from: a */
    C40972a f104205a;

    /* renamed from: b */
    C40989n f104206b;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.d$a */
    public interface C40972a {
        /* renamed from: d */
        void mo83467d();
    }

    /* renamed from: a */
    public final void mo83466a() {
        if (this.f104205a != null) {
            this.f104205a.mo83467d();
        }
    }

    public C40970d(C40972a aVar) {
        this.f104205a = aVar;
    }

    /* renamed from: a */
    public static void m90569a(Context context, String str, boolean z, int i) {
        if (context != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_load_dialog", true);
            bundle.putBoolean("show_not_official_content_warning", false);
            bundle.putBoolean("hide_nav_bar", false);
            bundle.putBoolean("use_webview_title", true);
            intent.putExtra("hide_more", false);
            intent.putExtra("enter_from", "qr_code");
            intent.putExtras(bundle);
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }
    }
}
