package com.p683ss.android.ugc.aweme.commerce.p1531c;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.gson.C18082l;
import com.google.gson.C18087q;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25592b;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.p1706fe.method.CloseHalfDialogBridge.C29791a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.c.a */
public final class C25508a extends Dialog {

    /* renamed from: a */
    private final Activity f67461a;

    /* renamed from: b */
    private final int f67462b;

    /* renamed from: c */
    private final String f67463c;

    /* renamed from: d */
    private final float f67464d;

    /* renamed from: e */
    private final boolean f67465e = true;

    /* renamed from: f */
    private final int f67466f;

    public final void dismiss() {
        super.dismiss();
        C47718bf.m103291d(this);
        ((CrossPlatformWebView) findViewById(R.id.cer)).mo55690g(this.f67461a);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void closeHalfDialog(C29791a aVar) {
        boolean z;
        C52711k.m112240b(aVar, "event");
        C18082l a = new C18087q().mo35029a(aVar.f77800a.toString());
        C52711k.m112236a((Object) a, "JsonParser().parse(event.params.toString())");
        C18082l b = a.mo35009m().mo35022b("reactId");
        if (b == null || b.mo35008l()) {
            z = false;
        } else {
            String c = b.mo34905c();
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) findViewById(R.id.cer);
            C52711k.m112236a((Object) crossPlatformWebView, "rn_user_data");
            z = C52711k.m112239a((Object) c, (Object) crossPlatformWebView.getReactId());
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.jz, null);
        C52711k.m112236a((Object) inflate, "view");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(C23724k.m58224b(getContext()), this.f67462b));
        C25592b bVar = new C25592b(this.f67466f, this.f67464d, this.f67464d, 0.0f, 0.0f);
        inflate.setBackground(bVar);
        setContentView(inflate);
        setCanceledOnTouchOutside(this.f67465e);
        ((CrossPlatformWebView) findViewById(R.id.cer)).mo55671a(17, 0, 0, 0, 0);
        findViewById(R.id.cer);
        CrossPlatformWebView.m65746a(this.f67463c, true);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            layoutParams = window2.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = this.f67462b;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(layoutParams);
        }
        C47718bf.m103290c(this);
    }

    public C25508a(Activity activity, int i, String str, float f, boolean z, int i2) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "url");
        super(activity, R.style.vb);
        this.f67461a = activity;
        this.f67462b = i;
        this.f67463c = str;
        this.f67464d = f;
        this.f67466f = i2;
    }
}
