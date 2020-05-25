package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.jsbridge.C4762a;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4701c;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4702d;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4703e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;

public class PreloadWebViewWidget extends LiveRecyclableWidget implements C4701c {

    /* renamed from: a */
    private int f17500a;

    /* renamed from: b */
    private C4703e f17501b;

    /* renamed from: a */
    public final boolean mo10522a() {
        if (this.f17500a == 0 && this.f17501b.f12813a.getParent() == this.containerView) {
            return true;
        }
        return false;
    }

    public void onClear() {
        if (this.f17500a == 0) {
            C4514j.m10883j().mo10322c().mo10494a(this.f17501b);
        }
    }

    /* renamed from: b */
    public final C4703e mo10524b() {
        if (this.f17500a != 0 || (this.f17501b.f12813a.getParent() != this.containerView && this.f17501b.f12813a.getParent() != null)) {
            return null;
        }
        if (this.f17501b != null) {
            this.f17500a = this.f17501b.f12813a.hashCode();
            this.containerView.removeView(this.f17501b.f12813a);
        }
        return this.f17501b;
    }

    public void onUnload() {
        C4514j.m10883j().mo10322c().mo10503b((C4701c) this);
        if (this.f17501b != null && this.containerView == this.f17501b.f12813a.getParent()) {
            this.containerView.removeView(this.f17501b.f12813a);
        }
    }

    public void onInit(Object[] objArr) {
        try {
            this.f17501b = C4514j.m10883j().mo10322c().mo10489a((Activity) this.context, (C4702d) null);
            C4514j.m10883j().mo10322c().mo10504b((C4762a) this.f17501b);
        } catch (Error unused) {
        }
    }

    public void onLoad(Object[] objArr) {
        if (this.f17501b != null) {
            String str = (String) LiveConfigSettingKeys.IN_ROOM_PRELOAD_WEB_VIEW_URL.mo9431a();
            if (this.f17501b.f12813a.getParent() == null) {
                if (!TextUtils.isEmpty(str)) {
                    C4514j.m10883j().mo10322c().mo10495a(this.f17501b, str);
                }
                this.containerView.addView(this.f17501b.f12813a);
            }
            C4514j.m10883j().mo10322c().mo10493a((C4701c) this);
        }
    }

    /* renamed from: a */
    public final boolean mo10523a(WebView webView) {
        if (webView.hashCode() != this.f17500a) {
            return false;
        }
        this.f17500a = 0;
        if (this.f17501b != null) {
            this.f17501b.f12813a.setWebChromeClient(this.f17501b.f12815c);
            this.f17501b.f12813a.setWebViewClient(C13482c.m27232a(this.f17501b.f12816d));
            this.f17501b.f12813a.setBackgroundColor(Color.parseColor("#ffffff"));
            this.f17501b.f12813a.loadUrl(QuickShopBusiness.f64351b);
            this.f17501b.f12813a.clearHistory();
            this.f17501b.f12813a.setRadius(0.0f, 0.0f, 0.0f, 0.0f);
            this.containerView.addView(this.f17501b.f12813a);
        }
        return true;
    }
}
