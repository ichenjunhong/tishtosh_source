package com.bytedance.android.livesdk.sign;

import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.ss.android.ugc.trill.R;

public class BroadcastSigningActivityProxy extends LiveActivityProxy {

    /* renamed from: a */
    private String f22611a;

    /* renamed from: b */
    private C8268a f22612b;

    public void onCreate() {
        super.onCreate();
        this.f23571d.setContentView(R.layout.agg);
        this.f22612b = new C8268a();
        this.f22611a = this.f23571d.getIntent().getStringExtra("url");
        if (TextUtils.isEmpty(this.f22611a)) {
            this.f23571d.finish();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_user_webview_title", true);
        this.f22612b.setArguments(bundle);
        bundle.putString("url", this.f22611a);
        C0679r a = this.f23571d.getSupportFragmentManager().mo2225a();
        a.mo2191b(R.id.zn, this.f22612b);
        a.mo2195c();
    }

    public BroadcastSigningActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
}
