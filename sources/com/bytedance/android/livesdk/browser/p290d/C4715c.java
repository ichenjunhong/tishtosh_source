package com.bytedance.android.livesdk.browser.p290d;

import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4700b;
import com.bytedance.android.livesdk.chatroom.event.C5175au;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.live.C8719s;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.browser.d.c */
public class C4715c extends C4742w {

    /* renamed from: e */
    C8719s f12838e;

    /* renamed from: l */
    private C1690c f12839l;

    /* renamed from: m */
    private String f12840m;

    /* renamed from: n */
    private TextView f12841n;

    /* renamed from: o */
    private ImageView f12842o;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo10545d() {
        return R.layout.bxa;
    }

    public void onDestroy() {
        super.onDestroy();
        DecorationWrapperWidget.f16929m = false;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f12839l != null && !this.f12839l.isDisposed()) {
            this.f12839l.dispose();
        }
    }

    /* renamed from: c */
    public final void mo10542c() {
        int i;
        String str;
        super.mo10542c();
        String e = mo10582e();
        if (this.f12842o != null) {
            if (!TextUtils.isEmpty(e)) {
                str = Uri.parse(e).getPath();
            } else {
                str = "";
            }
            String str2 = "/donate/complete";
            if (str == null || !str.contains(str2)) {
                if (getContext() != null) {
                    this.f12842o.setImageDrawable(C0726c.m2091a(getContext(), (int) R.drawable.bsi));
                }
                this.f12842o.setOnClickListener(new C4719g(this));
            } else {
                if (getContext() != null) {
                    this.f12842o.setImageDrawable(C0726c.m2091a(getContext(), (int) R.drawable.bsp));
                }
                this.f12842o.setOnClickListener(new C4718f(this));
            }
        }
        if (this.f12841n != null && this.f12838e != null) {
            TextView textView = this.f12841n;
            if (TextUtils.equals(mo10582e(), this.f12840m)) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10544a(View view) {
        WebView webView;
        if (this.f12934k != null) {
            webView = this.f12934k.f12890n;
        } else {
            webView = null;
        }
        if (webView == null || !webView.canGoBack()) {
            dismissAllowingStateLoss();
        } else {
            webView.goBack();
        }
    }

    /* renamed from: a */
    public static C4715c m11258a(C4700b bVar, C8719s sVar) {
        C4715c cVar = new C4715c();
        cVar.f12838e = sVar;
        cVar.f12840m = bVar.f12793a;
        cVar.mo10581b(bVar);
        return cVar;
    }

    public void onViewCreated(View view, Bundle bundle) {
        ImageView imageView;
        super.onViewCreated(view, bundle);
        TextView textView = null;
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.ey0);
        } else {
            imageView = null;
        }
        this.f12842o = imageView;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.ey3);
        }
        this.f12841n = textView;
        if (this.f12841n != null && this.f12838e != null) {
            this.f12841n.setOnClickListener(new C4716d(this));
            this.f12839l = C4495a.m10823a().mo10300a(C5175au.class).mo6545f((C1710e<? super T>) new C4717e<Object>(this));
        }
    }
}
