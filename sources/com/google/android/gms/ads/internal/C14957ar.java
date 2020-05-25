package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.example.p906a.C13482c;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15583ak;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C15813cr;
import com.google.android.gms.internal.ads.C15958i;
import com.google.android.gms.internal.ads.C16066m;
import com.google.android.gms.internal.ads.C16147p;
import com.google.android.gms.internal.ads.C16230sb;
import com.google.android.gms.internal.ads.C16234sf;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16309v;
import com.google.android.gms.internal.ads.C16396yf;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acb;
import com.google.android.gms.internal.ads.aes;
import com.google.android.gms.internal.ads.beh;
import com.google.android.gms.internal.ads.bei;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.cai;
import com.google.android.gms.internal.ads.cal;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.ar */
public final class C14957ar extends C15958i {

    /* renamed from: a */
    final zzbgz f38557a;

    /* renamed from: b */
    final Future<beh> f38558b = acb.m32567a((Callable<T>) new C14960au<T>(this));

    /* renamed from: c */
    final Context f38559c;
    /* access modifiers changed from: 0000 */

    /* renamed from: d */
    public beh f38560d;

    /* renamed from: e */
    private final zzyz f38561e;

    /* renamed from: f */
    private final C14962aw f38562f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public WebView f38563g = new WebView(this.f38559c);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public cal f38564h;

    /* renamed from: i */
    private AsyncTask<Void, Void, String> f38565i;

    public C14957ar(Context context, zzyz zzyz, String str, zzbgz zzbgz) {
        this.f38559c = context;
        this.f38557a = zzbgz;
        this.f38561e = zzyz;
        this.f38562f = new C14962aw(str);
        mo27552a(0);
        this.f38563g.setVerticalScrollBarEnabled(false);
        this.f38563g.getSettings().setJavaScriptEnabled(true);
        this.f38563g.setWebViewClient(C13482c.m27232a(new C14958as(this)));
        this.f38563g.setOnTouchListener(new C14959at(this));
    }

    /* renamed from: B_ */
    public final String mo27550B_() throws RemoteException {
        return null;
    }

    /* renamed from: a */
    public final String mo27551a() throws RemoteException {
        return null;
    }

    /* renamed from: a */
    public final void mo27475a(boolean z) throws RemoteException {
    }

    /* renamed from: j */
    public final boolean mo27488j() throws RemoteException {
        return false;
    }

    /* renamed from: o */
    public final void mo27493o() throws RemoteException {
    }

    /* renamed from: p */
    public final boolean mo27494p() throws RemoteException {
        return false;
    }

    /* renamed from: q */
    public final C15583ak mo27495q() {
        return null;
    }

    /* renamed from: h */
    public final C14882b mo27486h() throws RemoteException {
        C15464q.m32132b("getAdFrame must be called on the main UI thread.");
        return C14886d.m30544a(this.f38563g);
    }

    /* renamed from: g */
    public final void mo27485g() throws RemoteException {
        C15464q.m32132b("destroy must be called on the main UI thread.");
        this.f38565i.cancel(true);
        this.f38558b.cancel(true);
        this.f38563g.destroy();
        this.f38563g = null;
    }

    /* renamed from: b */
    public final boolean mo27482b(zzyv zzyv) throws RemoteException {
        C15464q.m32124a(this.f38563g, (Object) "This Search Ad has already been torn down");
        C14962aw awVar = this.f38562f;
        zzbgz zzbgz = this.f38557a;
        awVar.f38572c = zzyv.f46326j.f46061a;
        Bundle bundle = zzyv.f46329m != null ? zzyv.f46329m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) caf.m37099d().mo30717a(C15740bx.f44350ce);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    awVar.f38573d = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    awVar.f38571b.put(str2.substring(4), bundle.getString(str2));
                }
            }
            awVar.f38571b.put("SDKVersion", zzbgz.f46237a);
        }
        this.f38565i = new C14961av(this, null).execute(new Void[0]);
        return true;
    }

    /* renamed from: l */
    public final void mo27490l() throws RemoteException {
        C15464q.m32132b("pause must be called on the main UI thread.");
    }

    /* renamed from: m */
    public final void mo27491m() throws RemoteException {
        C15464q.m32132b("resume must be called on the main UI thread.");
    }

    /* renamed from: a */
    public final void mo27457a(cal cal) throws RemoteException {
        this.f38564h = cal;
    }

    /* renamed from: a */
    public final void mo27461a(C16147p pVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo27460a(C16066m mVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: n */
    public final Bundle mo27492n() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: E */
    public final void mo27508E() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: k */
    public final void mo27489k() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: i */
    public final zzyz mo27487i() throws RemoteException {
        return this.f38561e;
    }

    /* renamed from: a */
    public final void mo27470a(zzyz zzyz) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    /* renamed from: a */
    public final void mo27462a(C16230sb sbVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo27463a(C16234sf sfVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: A */
    public final String mo27444A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: B */
    public final C16147p mo27445B() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: C */
    public final cal mo27446C() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: a */
    public final void mo27459a(C15813cr crVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo27456a(cai cai) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo27464a(C16309v vVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo27466a(C16396yf yfVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo27471a(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: b */
    public final void mo27480b(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo27468a(zzacq zzacq) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo27467a(zzabp zzabp) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: b */
    public final void mo27481b(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo27553c(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            return aes.m32748a(this.f38559c, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27552a(int i) {
        if (this.f38563g != null) {
            this.f38563g.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo27554c() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) caf.m37099d().mo30717a(C15740bx.f44349cd));
        builder.appendQueryParameter("query", this.f38562f.f38572c);
        builder.appendQueryParameter("pubId", this.f38562f.f38570a);
        Map<String, String> map = this.f38562f.f38571b;
        for (String str : map.keySet()) {
            builder.appendQueryParameter(str, (String) map.get(str));
        }
        Uri build = builder.build();
        if (this.f38560d != null) {
            try {
                build = this.f38560d.mo30079a(build, this.f38559c, null, false, null, null);
            } catch (bei e) {
                abv.m32795c("Unable to process ad data", e);
            }
        }
        String d = mo27555d();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(d);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo27555d() {
        String str = this.f38562f.f38573d;
        if (TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) caf.m37099d().mo30717a(C15740bx.f44349cd);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("https://");
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo27556d(String str) {
        if (this.f38560d == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f38560d.mo30078a(parse, this.f38559c, null, null);
        } catch (bei e) {
            abv.m32795c("Unable to process ad data", e);
        }
        return parse.toString();
    }
}
