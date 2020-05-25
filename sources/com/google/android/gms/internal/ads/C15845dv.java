package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15524o;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.dv */
public class C15845dv implements C15839dq {

    /* renamed from: a */
    final C15842ds f44905a;

    /* renamed from: b */
    final C15843dt f44906b;

    /* renamed from: c */
    boolean f44907c;

    /* renamed from: d */
    boolean f44908d;

    /* renamed from: e */
    public C15860ej f44909e;

    /* renamed from: f */
    private final Object f44910f = new Object();

    /* renamed from: g */
    private final Context f44911g;

    /* renamed from: h */
    private final C15820cy f44912h;

    /* renamed from: i */
    private final JSONObject f44913i;

    /* renamed from: j */
    private final C16276tu f44914j;

    /* renamed from: k */
    private final beh f44915k;

    /* renamed from: l */
    private final zzbgz f44916l;

    /* renamed from: m */
    private String f44917m;

    /* renamed from: n */
    private aac f44918n;

    /* renamed from: o */
    private boolean f44919o = false;

    /* renamed from: p */
    private long f44920p = 0;

    /* renamed from: q */
    private long f44921q = 0;

    /* renamed from: r */
    private WeakReference<View> f44922r = null;

    public C15845dv(Context context, C15842ds dsVar, C16276tu tuVar, beh beh, JSONObject jSONObject, C15843dt dtVar, zzbgz zzbgz, String str) {
        this.f44911g = context;
        this.f44905a = dsVar;
        this.f44914j = tuVar;
        this.f44915k = beh;
        this.f44913i = jSONObject;
        this.f44906b = dtVar;
        this.f44916l = zzbgz;
        this.f44917m = str;
        this.f44912h = new C15820cy(this.f44914j);
    }

    /* renamed from: b */
    public void mo31018b(View view, Map<String, WeakReference<View>> map) {
    }

    /* renamed from: a */
    public View mo31009a(OnClickListener onClickListener, boolean z) {
        C15819cx d = this.f44906b.mo30922d();
        if (d == null) {
            return null;
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (!z) {
            int i = d.f44806f;
            if (i != 0) {
                switch (i) {
                    case 2:
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                        break;
                    case 3:
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                        break;
                    default:
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                        break;
                }
            } else {
                layoutParams.addRule(10);
                layoutParams.addRule(9);
            }
        }
        C15823da daVar = new C15823da(this.f44911g, d, layoutParams);
        daVar.setOnClickListener(onClickListener);
        daVar.setContentDescription((CharSequence) caf.m37099d().mo30717a(C15740bx.f44283bQ));
        return daVar;
    }

    /* renamed from: a */
    public boolean mo31017a() {
        C15819cx d = this.f44906b.mo30922d();
        return d != null && d.f44807g;
    }

    /* renamed from: c */
    public boolean mo31020c() {
        return this.f44913i != null && this.f44913i.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* renamed from: b */
    public boolean mo31019b() {
        return this.f44913i != null && this.f44913i.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: a */
    private final boolean m37377a(String str) {
        JSONObject optJSONObject = this.f44913i == null ? null : this.f44913i.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    public final void mo31033a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2, boolean z) {
        JSONObject jSONObject;
        View view3 = view2;
        JSONObject a = m37375a(map, view3);
        JSONObject f = m37381f(view3);
        JSONObject g = m37382g(view2);
        JSONObject h = m37383h(view3);
        JSONObject jSONObject2 = null;
        try {
            Bundle bundle2 = bundle;
            JSONObject a2 = C14963ax.m30831a().mo28663a(bundle, (JSONObject) null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a2);
                String str2 = str;
            } catch (Exception e) {
                e = e;
                String str3 = str;
                jSONObject2 = jSONObject3;
                abv.m32793b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m37376a(view, f, a, g, h, str, jSONObject, null, z);
            }
            try {
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject3;
                abv.m32793b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m37376a(view, f, a, g, h, str, jSONObject, null, z);
            }
        } catch (Exception e3) {
            e = e3;
            String str4 = str;
            abv.m32793b("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            m37376a(view, f, a, g, h, str, jSONObject, null, z);
        }
        m37376a(view, f, a, g, h, str, jSONObject, null, z);
    }

    /* renamed from: a */
    public void mo31013a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C15464q.m32132b("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Entry entry : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                        mo31033a(view, (String) entry.getKey(), bundle, map, view2, false);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.f44906b.mo30920b())) {
            mo31033a(view, "3099", bundle, map, view2, false);
        } else if ("2".equals(this.f44906b.mo30920b())) {
            mo31033a(view, "2099", bundle, map, view2, false);
        } else {
            if ("1".equals(this.f44906b.mo30920b())) {
                mo31033a(view, "1099", bundle, map, view2, false);
            }
        }
    }

    /* renamed from: b */
    public final void mo31035b(Bundle bundle) {
        if (bundle == null) {
            abv.m32792b("Click data is null. No click is reported.");
        } else if (!m37377a("click_reporting")) {
            abv.m32794c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            m37376a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, C14963ax.m30831a().mo28663a(bundle, (JSONObject) null), false);
        }
    }

    /* renamed from: a */
    private final void m37376a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z) {
        C15464q.m32132b("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(C29094ad.f76264a, this.f44913i);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            long a = C14963ax.m30837g().mo28523a();
            jSONObject8.put("time_from_last_touch_down", a - this.f44921q);
            jSONObject8.put("time_from_last_touch", a - this.f44920p);
            jSONObject7.put("touch_signal", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", this.f44906b.mo30920b());
            jSONObject9.put("is_privileged_process", acm.m32637c());
            boolean z2 = false;
            if (this.f44912h.f44811b != null && this.f44913i.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", a);
            jSONObject9.put("has_custom_click_handler", this.f44905a.mo27530c(this.f44906b.mo30921c()) != null);
            if (this.f44919o && mo31019b()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            String str2 = "has_custom_click_handler";
            if (this.f44905a.mo27530c(this.f44906b.mo30921c()) != null) {
                z2 = true;
            }
            jSONObject7.put(str2, z2);
            try {
                JSONObject optJSONObject = this.f44913i.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject9.put("click_signals", this.f44915k.f42188b.mo27635a(this.f44911g, optJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                abv.m32793b("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject9);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f44917m);
            afn.m32817a(this.f44914j.mo31417b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            abv.m32793b("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: a */
    public void mo31010a(MotionEvent motionEvent) {
        this.f44920p = C14963ax.m30837g().mo28523a();
        if (motionEvent.getAction() == 0) {
            this.f44921q = C14963ax.m30837g().mo28523a();
        }
        this.f44915k.mo30080a(motionEvent);
    }

    /* renamed from: c */
    public final void mo31037c(Bundle bundle) {
        if (bundle == null) {
            abv.m32792b("Touch event data is null. No touch event is reported.");
        } else if (!m37377a("touch_reporting")) {
            abv.m32794c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            this.f44915k.f42188b.mo27637a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31039c(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f44910f
            monitor-enter(r0)
            boolean r1 = r3.f44907c     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0009:
            boolean r1 = m37379d(r4)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0014
            r3.mo31012a(r4, r5)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15740bx.f44287bU     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo30717a(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x005c
            monitor-enter(r5)     // Catch:{ all -> 0x005e }
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0059 }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0059 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0059 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0059 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = m37379d(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            r3.mo31012a(r4, r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r4     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15845dv.mo31039c(android.view.View, java.util.Map):void");
    }

    /* renamed from: d */
    private static boolean m37379d(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* renamed from: m */
    public void mo31030m() {
        this.f44905a.mo27511H();
    }

    /* renamed from: a */
    public void mo31012a(View view, Map<String, WeakReference<View>> map) {
        m37378a(m37381f(view), m37375a(map, view), m37382g(view), m37383h(view), (JSONObject) null);
    }

    /* renamed from: a */
    public final boolean mo31034a(Bundle bundle) {
        if (!m37377a("impression_reporting")) {
            abv.m32794c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return m37378a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, C14963ax.m30831a().mo28663a(bundle, (JSONObject) null));
    }

    /* renamed from: a */
    private final boolean m37378a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        C15464q.m32132b("Invalid call from a non-UI thread.");
        if (this.f44907c) {
            return true;
        }
        this.f44907c = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(C29094ad.f76264a, this.f44913i);
            jSONObject6.put("ads_id", this.f44917m);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            afn.m32817a(this.f44914j.mo31419c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f44905a.mo27526a((C15839dq) this);
            this.f44905a.mo31049z();
            mo31030m();
            return true;
        } catch (JSONException e) {
            abv.m32793b("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: e */
    public void mo31022e() {
        C15464q.m32132b("Invalid call from a non-UI thread.");
        if (!this.f44908d) {
            this.f44908d = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C29094ad.f76264a, this.f44913i);
                jSONObject.put("ads_id", this.f44917m);
                afn.m32817a(this.f44914j.mo31420d(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (JSONException e) {
                afc.m32793b("", e);
            }
        }
    }

    /* renamed from: o */
    public final View mo31040o() {
        if (this.f44922r != null) {
            return (View) this.f44922r.get();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo31038c(View view) {
        this.f44922r = new WeakReference<>(view);
    }

    /* renamed from: b */
    public final void mo31036b(View view) {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44314bv)).booleanValue() && this.f44915k != null) {
            bed bed = this.f44915k.f42188b;
            if (bed != null) {
                bed.mo27639a(view);
            }
        }
    }

    /* renamed from: a */
    public void mo31014a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        if (map != null) {
            synchronized (map) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                        view2.setClickable(true);
                        view2.setOnClickListener(onClickListener);
                    }
                }
            }
        }
        if (map2 != null) {
            synchronized (map2) {
                for (Entry value2 : map2.entrySet()) {
                    View view3 = (View) ((WeakReference) value2.getValue()).get();
                    if (view3 != null) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public ama mo31027j() throws amk {
        if (this.f44913i == null || this.f44913i.optJSONObject("overlay") == null) {
            return null;
        }
        Context context = this.f44911g;
        zzyz a = zzyz.m39303a(this.f44911g);
        ama a2 = amg.m33346a(context, anp.m33673a(a), a.f46338a, false, false, this.f44915k, this.f44916l, null, null, null, byc.m36979a());
        if (a2 != null) {
            a2.getView().setVisibility(8);
            C15847dx dxVar = new C15847dx(a2);
            C16276tu tuVar = this.f44914j;
            tuVar.mo31415a("/loadHtml", (C15948hq<? super T>) new C15848dy<Object>(dxVar, tuVar));
            tuVar.mo31415a("/showOverlay", (C15948hq<? super T>) new C15851ea<Object>(dxVar, tuVar));
            tuVar.mo31415a("/hideOverlay", (C15948hq<? super T>) new C15852eb<Object>(dxVar, tuVar));
            ama ama = (ama) dxVar.f44925a.get();
            if (ama != null) {
                ama.mo29157a("/sendMessageToSdk", (C15948hq<? super ama>) new C15853ec<Object>(dxVar, tuVar));
            }
        }
        return a2;
    }

    /* renamed from: b */
    public final boolean mo31050b(View view, C15837do doVar) {
        FrameLayout.LayoutParams layoutParams;
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44286bT)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        View e = this.f44906b.mo30923e();
        if (e == null) {
            return false;
        }
        ViewParent parent = e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(e);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(e, layoutParams);
        this.f44905a.mo27525a(doVar);
        return true;
    }

    /* renamed from: a */
    public final void mo31032a(View view, C15837do doVar) {
        if (!mo31050b(view, doVar)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            if (this.f44906b instanceof C15844du) {
                C15844du duVar = (C15844du) this.f44906b;
                if (duVar.mo30938f() != null && duVar.mo30938f().size() > 0) {
                    Object obj = duVar.mo30938f().get(0);
                    C15865eo a = obj instanceof IBinder ? C15866ep.m37470a((IBinder) obj) : null;
                    if (a != null) {
                        try {
                            C14882b a2 = a.mo30929a();
                            if (a2 != null) {
                                Drawable drawable = (Drawable) C14886d.m30545a(a2);
                                ImageView imageView = new ImageView(this.f44911g);
                                imageView.setImageDrawable(drawable);
                                imageView.setScaleType(ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            abv.m32798e("Could not get drawable from image");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo31016a(C15912gh ghVar) {
        if (!this.f44913i.optBoolean("custom_one_point_five_click_enabled", false)) {
            abv.m32798e("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        C15820cy cyVar = this.f44912h;
        cyVar.f44811b = ghVar;
        if (cyVar.f44812c != null) {
            cyVar.f44810a.mo31418b("/unconfirmedClick", cyVar.f44812c);
        }
        cyVar.f44812c = new C15821cz(cyVar);
        cyVar.f44810a.mo31415a("/unconfirmedClick", cyVar.f44812c);
    }

    /* renamed from: d */
    public void mo31021d() {
        if (this.f44913i.optBoolean("custom_one_point_five_click_enabled", false)) {
            C15820cy cyVar = this.f44912h;
            if (!(cyVar.f44811b == null || cyVar.f44814e == null)) {
                cyVar.mo30914a();
                try {
                    cyVar.f44811b.mo31082a();
                } catch (RemoteException e) {
                    afc.m32797d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo31011a(View view) {
        if (!this.f44913i.optBoolean("custom_one_point_five_click_enabled", false)) {
            abv.m32798e("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        C15820cy cyVar = this.f44912h;
        if (view != null) {
            view.setOnClickListener(cyVar);
            view.setClickable(true);
            cyVar.f44815f = new WeakReference<>(view);
        }
    }

    /* renamed from: f */
    public void mo31023f() {
        this.f44919o = true;
    }

    /* renamed from: g */
    public void mo31024g() {
        if (this.f44909e == null) {
            abv.m32792b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else if (!this.f44919o) {
            abv.m32792b("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!mo31019b()) {
            abv.m32792b("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            mo31033a(this.f44909e.mo31061c(), "3099", null, this.f44909e.mo31059b(), this.f44909e.mo31061c(), true);
        }
    }

    /* renamed from: l */
    public void mo31029l() {
        this.f44905a.mo27515L();
    }

    /* renamed from: n */
    public void mo31031n() {
        this.f44905a.mo27516M();
    }

    /* renamed from: k */
    public void mo31028k() {
        this.f44914j.mo31414a();
    }

    /* renamed from: p */
    public final Context mo31041p() {
        return this.f44911g;
    }

    /* renamed from: e */
    private static int[] m37380e(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: a */
    private final int m37373a(int i) {
        return aes.m32758b(this.f44911g, i);
    }

    /* renamed from: a */
    private final JSONObject m37374a(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m37373a(rect.right - rect.left));
        jSONObject.put("height", m37373a(rect.bottom - rect.top));
        jSONObject.put("x", m37373a(rect.left));
        jSONObject.put("y", m37373a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: f */
    private final JSONObject m37381f(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] e = m37380e(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", m37373a(view.getMeasuredWidth()));
            jSONObject3.put("height", m37373a(view.getMeasuredHeight()));
            jSONObject3.put("x", m37373a(e[0]));
            jSONObject3.put("y", m37373a(e[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = m37374a(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                jSONObject.put("x", m37373a(e[0]));
                jSONObject.put("y", m37373a(e[1]));
                jSONObject.put("relative_to", "window");
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            abv.m32798e("Unable to get native ad view bounding box");
        }
        return jSONObject2;
    }

    /* renamed from: g */
    private static JSONObject m37382g(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("contained_in_scroll_view", acd.m32605d(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: h */
    private final JSONObject m37383h(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("can_show_on_lock_screen", acd.m32603c(view));
            String str = "is_keyguard_locked";
            Context context = this.f44911g;
            boolean z = false;
            if (context != null) {
                if (C15524o.m32294b()) {
                    KeyguardManager i = acd.m32613i(context);
                    if (i != null && i.isKeyguardLocked()) {
                        z = true;
                    }
                }
            }
            jSONObject.put(str, z);
        } catch (JSONException unused) {
            abv.m32798e("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONObject m37375a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] e = m37380e(view);
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] e2 = m37380e(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", m37373a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", m37373a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", m37373a(e2[0] - e[0]));
                        jSONObject4.put("y", m37373a(e2[1] - e[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = m37374a(rect);
                        } else {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", m37373a(e2[0] - e[0]));
                            jSONObject5.put("y", m37373a(e2[1] - e[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject = jSONObject5;
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", (double) textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put((String) entry.getKey(), jSONObject3);
                    } catch (JSONException unused) {
                        abv.m32798e("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: q */
    public final aac mo31051q() {
        if (!C14963ax.m30849s().mo28557a(this.f44911g)) {
            return null;
        }
        if (this.f44918n == null) {
            this.f44918n = new aac(this.f44911g, this.f44905a.mo27444A());
        }
        return this.f44918n;
    }
}
