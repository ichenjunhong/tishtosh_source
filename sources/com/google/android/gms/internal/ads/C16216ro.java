package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ro */
public final class C16216ro extends C16217rp implements C15948hq<ama> {

    /* renamed from: a */
    private final ama f45503a;

    /* renamed from: b */
    private final Context f45504b;

    /* renamed from: c */
    private final WindowManager f45505c;

    /* renamed from: d */
    private final C15721bh f45506d;

    /* renamed from: e */
    private DisplayMetrics f45507e;

    /* renamed from: f */
    private float f45508f;

    /* renamed from: g */
    private int f45509g = -1;

    /* renamed from: h */
    private int f45510h = -1;

    /* renamed from: i */
    private int f45511i;

    /* renamed from: j */
    private int f45512j = -1;

    /* renamed from: k */
    private int f45513k = -1;

    /* renamed from: l */
    private int f45514l = -1;

    /* renamed from: m */
    private int f45515m = -1;

    public C16216ro(ama ama, Context context, C15721bh bhVar) {
        super(ama);
        this.f45503a = ama;
        this.f45504b = context;
        this.f45506d = bhVar;
        this.f45505c = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final void mo31363a(int i, int i2) {
        int i3 = 0;
        if (this.f45504b instanceof Activity) {
            i3 = acd.m32604c((Activity) this.f45504b)[0];
        }
        if (this.f45503a.mo29195u() == null || !this.f45503a.mo29195u().mo29366e()) {
            this.f45514l = aes.m32758b(this.f45504b, this.f45503a.getWidth());
            this.f45515m = aes.m32758b(this.f45504b, this.f45503a.getHeight());
        }
        int i4 = i2 - i3;
        int i5 = this.f45514l;
        try {
            this.f45517q.mo29243a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i4).put("width", i5).put("height", this.f45515m));
        } catch (JSONException e) {
            abv.m32793b("Error occured while dispatching default position.", e);
        }
        this.f45503a.mo29197w().mo29203a(i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        this.f45507e = new DisplayMetrics();
        Display defaultDisplay = this.f45505c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f45507e);
        this.f45508f = this.f45507e.density;
        this.f45511i = defaultDisplay.getRotation();
        this.f45509g = aes.m32759b(this.f45507e, this.f45507e.widthPixels);
        this.f45510h = aes.m32759b(this.f45507e, this.f45507e.heightPixels);
        Activity d = this.f45503a.mo28938d();
        if (d == null || d.getWindow() == null) {
            this.f45512j = this.f45509g;
            this.f45513k = this.f45510h;
        } else {
            int[] a = acd.m32594a(d);
            this.f45512j = aes.m32759b(this.f45507e, a[0]);
            this.f45513k = aes.m32759b(this.f45507e, a[1]);
        }
        if (this.f45503a.mo29195u().mo29366e()) {
            this.f45514l = this.f45509g;
            this.f45515m = this.f45510h;
        } else {
            this.f45503a.measure(0, 0);
        }
        mo31365a(this.f45509g, this.f45510h, this.f45512j, this.f45513k, this.f45508f, this.f45511i);
        C16215rn rnVar = new C16215rn();
        C15721bh bhVar = this.f45506d;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        rnVar.f45499b = bhVar.mo30159a(intent);
        C15721bh bhVar2 = this.f45506d;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        rnVar.f45498a = bhVar2.mo30159a(intent2);
        rnVar.f45500c = this.f45506d.mo30160b();
        rnVar.f45501d = this.f45506d.mo30158a();
        rnVar.f45502e = true;
        this.f45503a.mo29243a("onDeviceFeaturesReceived", new C16213rl(rnVar).mo31362a());
        int[] iArr = new int[2];
        this.f45503a.getLocationOnScreen(iArr);
        mo31363a(aes.m32758b(this.f45504b, iArr[0]), aes.m32758b(this.f45504b, iArr[1]));
        if (abv.m32791a(2)) {
            abv.m32796d("Dispatching Ready Event.");
        }
        try {
            this.f45517q.mo29243a("onReadyEventReceived", new JSONObject().put("js", this.f45503a.mo28944k().f46237a));
        } catch (JSONException e) {
            abv.m32793b("Error occured while dispatching ready Event.", e);
        }
    }
}
