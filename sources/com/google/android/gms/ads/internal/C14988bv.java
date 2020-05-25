package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.p030v4.p038f.C0777a;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import com.google.android.gms.ads.C14912d;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15583ak;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16148pa;
import com.google.android.gms.internal.ads.C16151pd;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16442zy;
import com.google.android.gms.internal.ads.aac;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.amk;
import com.google.android.gms.internal.ads.ann;
import com.google.android.gms.internal.ads.anp;
import com.google.android.gms.internal.ads.bvs;
import com.google.android.gms.internal.ads.bvw;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.p1027a.C14886d;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.bv */
public final class C14988bv extends C14972bf implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: j */
    private boolean f38697j;

    /* renamed from: k */
    private boolean f38698k;

    /* renamed from: l */
    private WeakReference<Object> f38699l = new WeakReference<>(null);

    public C14988bv(Context context, zzyz zzyz, String str, C16134on onVar, zzbgz zzbgz, C14986bt btVar) {
        super(context, zzyz, str, onVar, zzbgz, btVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ama mo27600a(abc abc, C14987bu buVar, C16442zy zyVar) throws amk {
        zzyz zzyz;
        C14912d dVar;
        if (this.f38501e.f38635i.f46344g == null && this.f38501e.f38635i.f46346i) {
            C14964ay ayVar = this.f38501e;
            if (abc.f40130b.f46207y) {
                zzyz = this.f38501e.f38635i;
            } else {
                String str = abc.f40130b.f46194l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    dVar = new C14912d(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    dVar = this.f38501e.f38635i.mo31647b();
                }
                zzyz = new zzyz(this.f38501e.f38629c, dVar);
            }
            ayVar.f38635i = zzyz;
        }
        return super.mo27600a(abc, buVar, zyVar);
    }

    /* renamed from: b */
    public final boolean mo27482b(zzyv zzyv) {
        zzyv zzyv2 = zzyv;
        this.f38698k = false;
        this.f38504h = null;
        if (zzyv2.f46324h != this.f38697j) {
            zzyv zzyv3 = new zzyv(zzyv2.f46317a, zzyv2.f46318b, zzyv2.f46319c, zzyv2.f46320d, zzyv2.f46321e, zzyv2.f46322f, zzyv2.f46323g, zzyv2.f46324h || this.f38697j, zzyv2.f46325i, zzyv2.f46326j, zzyv2.f46327k, zzyv2.f46328l, zzyv2.f46329m, zzyv2.f46330n, zzyv2.f46331o, zzyv2.f46332p, zzyv2.f46333q, zzyv2.f46334r, null, zzyv2.f46336t, zzyv2.f46337u);
            zzyv2 = zzyv3;
        }
        return super.mo27482b(zzyv2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.caf.m37099d().mo30717a(com.google.android.gms.internal.ads.C15740bx.f44277bK)).booleanValue() != false) goto L_0x006f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27477a(com.google.android.gms.internal.ads.abb r5, com.google.android.gms.internal.ads.abb r6) {
        /*
            r4 = this;
            boolean r0 = super.mo27477a(r5, r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.gms.ads.internal.ay r0 = r4.f38501e
            boolean r0 = r0.mo27568c()
            if (r0 == 0) goto L_0x001c
            boolean r5 = r4.m30945b(r5, r6)
            if (r5 != 0) goto L_0x001c
            com.google.android.gms.internal.ads.byc r5 = r6.f40092K
            r4.mo27451a(r1, r5)
            return r1
        L_0x001c:
            r4.mo27588b(r6, r1)
            boolean r5 = r6.f40114l
            r0 = 0
            if (r5 == 0) goto L_0x0055
            r4.mo27624d(r6)
            com.google.android.gms.ads.internal.ay r5 = r4.f38501e
            com.google.android.gms.ads.internal.az r5 = r5.f38632f
            com.google.android.gms.internal.ads.agu.m32860a(r5, r4)
            com.google.android.gms.ads.internal.ay r5 = r4.f38501e
            com.google.android.gms.ads.internal.az r5 = r5.f38632f
            com.google.android.gms.internal.ads.agu.m32861a(r5, r4)
            boolean r5 = r6.f40115m
            if (r5 != 0) goto L_0x0072
            com.google.android.gms.ads.internal.bw r5 = new com.google.android.gms.ads.internal.bw
            r5.<init>(r4)
            com.google.android.gms.internal.ads.ama r1 = r6.f40104b
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.ama r1 = r6.f40104b
            com.google.android.gms.internal.ads.anj r1 = r1.mo29197w()
            goto L_0x004a
        L_0x0049:
            r1 = r0
        L_0x004a:
            if (r1 == 0) goto L_0x0072
            com.google.android.gms.ads.internal.bx r2 = new com.google.android.gms.ads.internal.bx
            r2.<init>(r6, r5)
            r1.mo29210a(r2)
            goto L_0x0072
        L_0x0055:
            com.google.android.gms.ads.internal.ay r5 = r4.f38501e
            boolean r5 = r5.mo27569d()
            if (r5 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.C15740bx.f44277bK
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r5 = r2.mo30717a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0072
        L_0x006f:
            r4.mo27583a(r6, r1)
        L_0x0072:
            com.google.android.gms.internal.ads.ama r5 = r6.f40104b
            if (r5 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.ama r5 = r6.f40104b
            com.google.android.gms.internal.ads.ams r5 = r5.mo28936b()
            com.google.android.gms.internal.ads.ama r1 = r6.f40104b
            com.google.android.gms.internal.ads.anj r1 = r1.mo29197w()
            if (r1 == 0) goto L_0x0087
            r1.mo29221g()
        L_0x0087:
            com.google.android.gms.ads.internal.ay r1 = r4.f38501e
            com.google.android.gms.internal.ads.zzacq r1 = r1.f38651y
            if (r1 == 0) goto L_0x0096
            if (r5 == 0) goto L_0x0096
            com.google.android.gms.ads.internal.ay r1 = r4.f38501e
            com.google.android.gms.internal.ads.zzacq r1 = r1.f38651y
            r5.mo29350a(r1)
        L_0x0096:
            com.google.android.gms.ads.internal.ay r5 = r4.f38501e
            boolean r5 = r5.mo27568c()
            if (r5 == 0) goto L_0x013c
            com.google.android.gms.internal.ads.ama r5 = r6.f40104b
            if (r5 == 0) goto L_0x0157
            org.json.JSONObject r5 = r6.f40113k
            if (r5 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.buu r5 = r4.f38503g
            com.google.android.gms.ads.internal.ay r0 = r4.f38501e
            com.google.android.gms.internal.ads.zzyz r0 = r0.f38635i
            r5.mo30742a(r0, r6)
        L_0x00af:
            com.google.android.gms.internal.ads.ama r5 = r6.f40104b
            android.view.View r0 = r5.getView()
            com.google.android.gms.internal.ads.bvs r5 = new com.google.android.gms.internal.ads.bvs
            com.google.android.gms.ads.internal.ay r1 = r4.f38501e
            android.content.Context r1 = r1.f38629c
            r5.<init>(r1, r0)
            com.google.android.gms.internal.ads.aad r1 = com.google.android.gms.ads.internal.C14963ax.m30849s()
            com.google.android.gms.ads.internal.ay r2 = r4.f38501e
            android.content.Context r2 = r2.f38629c
            boolean r1 = r1.mo28557a(r2)
            if (r1 == 0) goto L_0x00ee
            com.google.android.gms.internal.ads.zzyv r1 = r6.f40103a
            boolean r1 = m30670a(r1)
            if (r1 == 0) goto L_0x00ee
            com.google.android.gms.ads.internal.ay r1 = r4.f38501e
            java.lang.String r1 = r1.f38628b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00ee
            com.google.android.gms.internal.ads.aac r1 = new com.google.android.gms.internal.ads.aac
            com.google.android.gms.ads.internal.ay r2 = r4.f38501e
            android.content.Context r2 = r2.f38629c
            com.google.android.gms.ads.internal.ay r3 = r4.f38501e
            java.lang.String r3 = r3.f38628b
            r1.<init>(r2, r3)
            r5.mo30776a(r1)
        L_0x00ee:
            boolean r1 = r6.mo28583a()
            if (r1 == 0) goto L_0x00fa
            com.google.android.gms.internal.ads.ama r1 = r6.f40104b
            r5.mo30776a(r1)
            goto L_0x0108
        L_0x00fa:
            com.google.android.gms.internal.ads.ama r1 = r6.f40104b
            com.google.android.gms.internal.ads.anj r1 = r1.mo29197w()
            com.google.android.gms.ads.internal.b r2 = new com.google.android.gms.ads.internal.b
            r2.<init>(r5, r6)
            r1.mo29209a(r2)
        L_0x0108:
            boolean r1 = r6.f40098Q
            if (r1 == 0) goto L_0x0134
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15740bx.f44301bi
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r1 = r2.mo30717a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0134
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15740bx.f44300bh
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r1 = r2.mo30717a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            com.google.android.gms.internal.ads.aeh r5 = r5.f44061b
            r5.mo28749a(r1)
            goto L_0x0157
        L_0x0134:
            com.google.android.gms.internal.ads.aeh r5 = r5.f44061b
            long r1 = com.google.android.gms.internal.ads.bvs.f44060a
            r5.mo28749a(r1)
            goto L_0x0157
        L_0x013c:
            com.google.android.gms.ads.internal.ay r5 = r4.f38501e
            android.view.View r5 = r5.f38617K
            if (r5 == 0) goto L_0x0157
            org.json.JSONObject r5 = r6.f40113k
            if (r5 == 0) goto L_0x0157
            com.google.android.gms.internal.ads.buu r5 = r4.f38503g
            com.google.android.gms.ads.internal.ay r0 = r4.f38501e
            com.google.android.gms.internal.ads.zzyz r0 = r0.f38635i
            com.google.android.gms.ads.internal.ay r1 = r4.f38501e
            android.view.View r1 = r1.f38617K
            r5.mo30743a(r0, r6, r1)
            com.google.android.gms.ads.internal.ay r5 = r4.f38501e
            android.view.View r0 = r5.f38617K
        L_0x0157:
            boolean r5 = r6.f40116n
            if (r5 != 0) goto L_0x0160
            com.google.android.gms.ads.internal.ay r5 = r4.f38501e
            r5.mo27565a(r0)
        L_0x0160:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14988bv.mo27477a(com.google.android.gms.internal.ads.abb, com.google.android.gms.internal.ads.abb):boolean");
    }

    /* renamed from: b */
    private final boolean m30945b(abb abb, abb abb2) {
        if (abb2.f40116n) {
            View a = C15033t.m31088a(abb2);
            if (a == null) {
                abv.m32798e("Could not get mediation view");
                return false;
            }
            View nextView = this.f38501e.f38632f.getNextView();
            if (nextView != null) {
                if (nextView instanceof ama) {
                    ((ama) nextView).destroy();
                }
                this.f38501e.f38632f.removeView(nextView);
            }
            if (!C15033t.m31097b(abb2)) {
                try {
                    if (C14963ax.m30849s().mo28557a(this.f38501e.f38629c)) {
                        new bvs(this.f38501e.f38629c, a).mo30776a((bvw) new aac(this.f38501e.f38629c, this.f38501e.f38628b));
                    }
                    if (abb2.f40123u != null) {
                        this.f38501e.f38632f.setMinimumWidth(abb2.f40123u.f46343f);
                        this.f38501e.f38632f.setMinimumHeight(abb2.f40123u.f46340c);
                    }
                    mo27453a(a);
                } catch (Exception e) {
                    C14963ax.m30834d().mo28588a((Throwable) e, "BannerAdManager.swapViews");
                    abv.m32795c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(abb2.f40123u == null || abb2.f40104b == null)) {
            abb2.f40104b.mo29153a(anp.m33673a(abb2.f40123u));
            this.f38501e.f38632f.removeAllViews();
            this.f38501e.f38632f.setMinimumWidth(abb2.f40123u.f46343f);
            this.f38501e.f38632f.setMinimumHeight(abb2.f40123u.f46340c);
            mo27453a(abb2.f40104b.getView());
        }
        if (this.f38501e.f38632f.getChildCount() > 1) {
            this.f38501e.f38632f.showNext();
        }
        if (abb != null) {
            View nextView2 = this.f38501e.f38632f.getNextView();
            if (nextView2 instanceof ama) {
                ((ama) nextView2).destroy();
            } else if (nextView2 != null) {
                this.f38501e.f38632f.removeView(nextView2);
            }
            this.f38501e.mo27567b();
        }
        this.f38501e.f38632f.setVisibility(0);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo27499u() {
        ama ama = this.f38501e.f38636j != null ? this.f38501e.f38636j.f40104b : null;
        if (!this.f38698k && ama != null) {
            m30946c(ama);
        }
        super.mo27499u();
    }

    /* renamed from: c */
    private final void m30946c(ama ama) {
        if (mo27598J()) {
            WebView webView = ama.getWebView();
            if (webView != null) {
                View view = ama.getView();
                if (view != null && C14963ax.m30845o().mo31372a(this.f38501e.f38629c)) {
                    int i = this.f38501e.f38631e.f46238b;
                    int i2 = this.f38501e.f38631e.f46239c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(i2);
                    this.f38504h = C14963ax.m30845o().mo31368a(sb.toString(), webView, "", "javascript", mo27447D());
                    if (this.f38504h != null) {
                        C14963ax.m30845o().mo31371a(this.f38504h, view);
                        ama.mo29151a(this.f38504h);
                        C14963ax.m30845o().mo31370a(this.f38504h);
                        this.f38698k = true;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final boolean mo27577U() {
        boolean z;
        if (!acd.m32590a(this.f38501e.f38629c, "android.permission.INTERNET")) {
            caf.m37096a().mo28762a(this.f38501e.f38632f, this.f38501e.f38635i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else {
            z = true;
        }
        if (!acd.m32589a(this.f38501e.f38629c)) {
            caf.m37096a().mo28762a(this.f38501e.f38632f, this.f38501e.f38635i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.f38501e.f38632f != null) {
            this.f38501e.f38632f.setVisibility(0);
        }
        return z;
    }

    /* renamed from: a */
    public final void mo27475a(boolean z) {
        C15464q.m32132b("setManualImpressionsEnabled must be called from the main thread.");
        this.f38697j = z;
    }

    /* renamed from: E */
    public final void mo27508E() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public final void onGlobalLayout() {
        mo27624d(this.f38501e.f38636j);
    }

    public final void onScrollChanged() {
        mo27624d(this.f38501e.f38636j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27583a(abb abb, boolean z) {
        acd.f40245a.post(new C14991c(this, abb));
        super.mo27583a(abb, z);
        if (C15033t.m31097b(abb)) {
            C14992d dVar = new C14992d(this);
            if (abb != null && C15033t.m31097b(abb)) {
                ama ama = abb.f40104b;
                Object view = ama != null ? ama.getView() : null;
                if (view == null) {
                    abv.m32798e("AdWebView is null");
                    return;
                }
                try {
                    List list = abb.f40117o != null ? abb.f40117o.f45290t : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            C16148pa h = abb.f40118p != null ? abb.f40118p.mo31259h() : null;
                            C16151pd i = abb.f40118p != null ? abb.f40118p.mo31260i() : null;
                            if (list.contains("2") && h != null) {
                                h.mo31272b(C14886d.m30544a(view));
                                if (!h.mo31281j()) {
                                    h.mo31280i();
                                }
                                ama.mo29157a("/nativeExpressViewClicked", C15033t.m31090a(h, (C16151pd) null, dVar));
                                return;
                            } else if (!list.contains("1") || i == null) {
                                abv.m32798e("No matching template id and mapper");
                                return;
                            } else {
                                i.mo31293b(C14886d.m30544a(view));
                                if (!i.mo31300h()) {
                                    i.mo31299g();
                                }
                                ama.mo29157a("/nativeExpressViewClicked", C15033t.m31090a((C16148pa) null, i, dVar));
                                return;
                            }
                        }
                    }
                    abv.m32798e("No template ids present in mediation response");
                } catch (RemoteException e) {
                    abv.m32795c("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo27624d(abb abb) {
        if (abb != null && !abb.f40115m && this.f38501e.f38632f != null && C14963ax.m30831a().mo28669a((View) this.f38501e.f38632f, this.f38501e.f38629c) && this.f38501e.f38632f.getGlobalVisibleRect(new Rect(), null)) {
            if (!(abb == null || abb.f40104b == null || abb.f40104b.mo29197w() == null)) {
                abb.f40104b.mo29197w().mo29210a((ann) null);
            }
            mo27583a(abb, false);
            abb.f40115m = true;
        }
    }

    /* renamed from: q */
    public final C15583ak mo27495q() {
        C15464q.m32132b("getVideoController must be called from the main thread.");
        if (this.f38501e.f38636j == null || this.f38501e.f38636j.f40104b == null) {
            return null;
        }
        return this.f38501e.f38636j.f40104b.mo28936b();
    }

    /* renamed from: I */
    public final void mo27623I() {
        C14953an anVar = this.f38500d;
        anVar.f38550c = false;
        anVar.f38549b = false;
        if (!(anVar.f38548a == null || anVar.f38548a.f46319c == null)) {
            anVar.f38548a.f46319c.remove("_ad");
        }
        anVar.mo27542a(anVar.f38548a, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo27625e(abb abb) {
        if (mo27598J()) {
            ama ama = abb != null ? abb.f40104b : null;
            if (ama != null) {
                if (!this.f38698k) {
                    m30946c(ama);
                }
                if (this.f38504h != null) {
                    ama.mo29242a("onSdkImpression", (Map) new C0777a());
                }
            }
        }
    }
}
