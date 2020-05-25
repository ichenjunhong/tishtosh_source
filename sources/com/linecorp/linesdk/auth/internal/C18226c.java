package com.linecorp.linesdk.auth.internal;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.linecorp.linesdk.C18194a;
import com.linecorp.linesdk.C18233b;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.p1086a.C18195a;
import com.linecorp.linesdk.p1086a.C18214d;
import com.linecorp.linesdk.p1086a.C18215e;
import com.linecorp.linesdk.p1086a.C18216f;
import com.linecorp.linesdk.p1086a.p1087a.C18203b;
import com.linecorp.linesdk.p1086a.p1087a.C18209d;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.linecorp.linesdk.auth.internal.c */
final class C18226c {

    /* renamed from: a */
    final LineAuthenticationActivity f50318a;

    /* renamed from: b */
    final LineAuthenticationConfig f50319b;

    /* renamed from: c */
    final C18203b f50320c;

    /* renamed from: d */
    final C18209d f50321d;

    /* renamed from: e */
    final C18221a f50322e;

    /* renamed from: f */
    final C18195a f50323f;

    /* renamed from: g */
    final String[] f50324g;

    /* renamed from: h */
    final C18230d f50325h;

    /* renamed from: com.linecorp.linesdk.auth.internal.c$a */
    class C18227a extends AsyncTask<String, Void, LineLoginResult> {
        private C18227a() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            LineLoginResult lineLoginResult = (LineLoginResult) obj;
            C18226c.this.f50325h.f50332d = C18232a.f50336d;
            C18226c.this.f50318a.mo36314a(lineLoginResult);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            String str;
            String[] strArr = (String[]) objArr;
            if (strArr == null || strArr.length != 1) {
                str = null;
            } else {
                str = strArr[0];
            }
            C18216f fVar = C18226c.this.f50325h.f50329a;
            String str2 = C18226c.this.f50325h.f50330b;
            if (TextUtils.isEmpty(str) || fVar == null || TextUtils.isEmpty(str2)) {
                return new LineLoginResult(C18233b.INTERNAL_ERROR, new LineApiError("Requested data is missing."));
            }
            C18203b bVar = C18226c.this.f50320c;
            String str3 = C18226c.this.f50319b.f50284a;
            Uri build = bVar.f50259f.buildUpon().appendPath("oauth").appendPath("accessToken").build();
            HashMap hashMap = new HashMap(5);
            hashMap.put("grant_type", "authorization_code");
            hashMap.put("code", str);
            hashMap.put("redirect_uri", str2);
            hashMap.put("client_id", str3);
            hashMap.put("otp", fVar.f50278b);
            C18194a a = bVar.f50260g.mo36281a(build, Collections.emptyMap(), hashMap, C18203b.f50255b);
            if (!a.mo36272a()) {
                return C18226c.m44423a(a);
            }
            C18215e eVar = (C18215e) a.mo36273b();
            C18214d dVar = eVar.f50275a;
            C18209d dVar2 = C18226c.this.f50321d;
            Uri build2 = dVar2.f50263b.buildUpon().appendPath("profile").build();
            HashMap hashMap2 = new HashMap(1);
            StringBuilder sb = new StringBuilder("Bearer ");
            sb.append(dVar.f50271a);
            hashMap2.put("Authorization", sb.toString());
            C18194a b = dVar2.f50264c.mo36282b(build2, hashMap2, Collections.emptyMap(), C18209d.f50262a);
            if (!b.mo36272a()) {
                return C18226c.m44423a(b);
            }
            C18195a aVar = C18226c.this.f50323f;
            C35807d.m80935a(aVar.f50240a, aVar.f50241b, 0).edit().putString("accessToken", aVar.mo36278a(dVar.f50271a)).putString("expiresIn", aVar.mo36277a(dVar.f50272b)).putString("issuedClientTime", aVar.mo36277a(dVar.f50273c)).putString("refreshToken", aVar.mo36278a(dVar.f50274d)).apply();
            LineProfile lineProfile = (LineProfile) b.mo36273b();
            LineAccessToken lineAccessToken = new LineAccessToken(dVar.f50271a, dVar.f50272b, dVar.f50273c);
            return new LineLoginResult(lineProfile, new LineCredential(lineAccessToken, eVar.f50276b));
        }

        /* synthetic */ C18227a(C18226c cVar, byte b) {
            this();
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.c$b */
    class C18228b implements Runnable {
        public final void run() {
            if (C18226c.this.f50325h.f50332d != C18232a.f50335c && !C18226c.this.f50318a.isFinishing()) {
                C18226c.this.f50318a.mo36314a(LineLoginResult.f50294a);
            }
        }

        private C18228b() {
        }

        /* synthetic */ C18228b(C18226c cVar, byte b) {
            this();
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.c$c */
    class C18229c extends AsyncTask<Void, Void, C18194a<C18216f>> {
        private C18229c() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            C18203b bVar = C18226c.this.f50320c;
            String str = C18226c.this.f50319b.f50284a;
            Uri build = bVar.f50259f.buildUpon().appendPath("oauth").appendPath("otp").build();
            HashMap hashMap = new HashMap(1);
            hashMap.put("client_id", str);
            return bVar.f50260g.mo36281a(build, Collections.emptyMap(), hashMap, C18203b.f50254a);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0109, code lost:
            if (r9.f50315a >= r2.f50315a) goto L_0x010b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0124 A[Catch:{ ActivityNotFoundException -> 0x01ec }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0129 A[Catch:{ ActivityNotFoundException -> 0x01ec }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x013e A[Catch:{ ActivityNotFoundException -> 0x01ec }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onPostExecute(java.lang.Object r13) {
            /*
                r12 = this;
                com.linecorp.linesdk.a r13 = (com.linecorp.linesdk.C18194a) r13
                boolean r0 = r13.mo36272a()
                if (r0 != 0) goto L_0x001c
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18226c.this
                com.linecorp.linesdk.auth.internal.d r0 = r0.f50325h
                int r1 = com.linecorp.linesdk.auth.internal.C18230d.C18232a.f50336d
                r0.f50332d = r1
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18226c.this
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r0 = r0.f50318a
                com.linecorp.linesdk.auth.LineLoginResult r13 = com.linecorp.linesdk.auth.internal.C18226c.m44423a(r13)
                r0.mo36314a(r13)
                return
            L_0x001c:
                java.lang.Object r13 = r13.mo36273b()
                com.linecorp.linesdk.a.f r13 = (com.linecorp.linesdk.p1086a.C18216f) r13
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18226c.this
                com.linecorp.linesdk.auth.internal.d r0 = r0.f50325h
                r0.f50329a = r13
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18226c.this     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.a r0 = r0.f50322e     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.c r1 = com.linecorp.linesdk.auth.internal.C18226c.this     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r1 = r1.f50318a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.c r2 = com.linecorp.linesdk.auth.internal.C18226c.this     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.LineAuthenticationConfig r2 = r2.f50319b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.c r3 = com.linecorp.linesdk.auth.internal.C18226c.this     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String[] r3 = r3.f50324g     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r4 = 8
                byte[] r5 = new byte[r4]     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.security.SecureRandom r6 = new java.security.SecureRandom     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r6.<init>()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                long r6 = r6.nextLong()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r8 = 0
                r9 = r6
                r6 = 0
            L_0x0048:
                if (r6 >= r4) goto L_0x0052
                int r7 = (int) r9     // Catch:{ ActivityNotFoundException -> 0x01ec }
                byte r7 = (byte) r7     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r5[r6] = r7     // Catch:{ ActivityNotFoundException -> 0x01ec }
                long r9 = r9 >> r4
                int r6 = r6 + 1
                goto L_0x0048
            L_0x0052:
                r4 = 11
                java.lang.String r4 = android.util.Base64.encodeToString(r5, r4)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.d r0 = r0.f50303b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r0.f50331c = r4     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r5 = "intent://result#Intent;package="
                r0.<init>(r5)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r5 = r1.getPackageName()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r0.append(r5)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r5 = ";scheme=lineauth;end"
                r0.append(r5)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r0 = r0.toString()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.net.Uri r5 = r2.f50286c     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r6 = "response_type"
                java.lang.String r7 = "code"
                android.net.Uri$Builder r5 = r5.appendQueryParameter(r6, r7)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r6 = "client_id"
                java.lang.String r7 = r2.f50284a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.net.Uri$Builder r5 = r5.appendQueryParameter(r6, r7)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r6 = "state"
                android.net.Uri$Builder r4 = r5.appendQueryParameter(r6, r4)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r5 = "otpId"
                java.lang.String r13 = r13.f50277a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.net.Uri$Builder r13 = r4.appendQueryParameter(r5, r13)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r4 = "redirect_uri"
                android.net.Uri$Builder r13 = r13.appendQueryParameter(r4, r0)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r3 == 0) goto L_0x00ad
                int r4 = r3.length     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r4 <= 0) goto L_0x00ad
                java.lang.String r4 = "scope"
                java.lang.String r5 = " "
                java.lang.String r3 = android.text.TextUtils.join(r5, r3)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.appendQueryParameter(r4, r3)     // Catch:{ ActivityNotFoundException -> 0x01ec }
            L_0x00ad:
                android.net.Uri r13 = r13.build()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                boolean r2 = r2.f50287d     // Catch:{ ActivityNotFoundException -> 0x01ec }
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r4 = 16
                r5 = 1
                if (r3 < r4) goto L_0x00bc
                r3 = 1
                goto L_0x00bd
            L_0x00bc:
                r3 = 0
            L_0x00bd:
                r6 = 0
                if (r3 == 0) goto L_0x00e0
                android.support.customtabs.c$a r3 = new android.support.customtabs.c$a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r3.<init>()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r7 = 17170443(0x106000b, float:2.4611944E-38)
                int r7 = android.support.p030v4.content.C0726c.m2098c(r1, r7)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r9 = r3.f1252a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r10 = "android.support.customtabs.extra.TOOLBAR_COLOR"
                r9.putExtra(r10, r7)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.support.customtabs.c r3 = r3.mo865a()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r7 = r3.f1250a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r7 = r7.setData(r13)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.os.Bundle r3 = r3.f1251b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                goto L_0x00ec
            L_0x00e0:
                android.content.Intent r3 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r7 = "android.intent.action.VIEW"
                r3.<init>(r7)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r7 = r3.setData(r13)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r3 = r6
            L_0x00ec:
                com.linecorp.linesdk.auth.internal.b r9 = com.linecorp.linesdk.auth.internal.C18225b.m44422a(r1)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r9 != 0) goto L_0x00f9
                com.linecorp.linesdk.auth.internal.a$a r13 = new com.linecorp.linesdk.auth.internal.a$a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.<init>(r7, r3, r8)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                goto L_0x0190
            L_0x00f9:
                if (r2 != 0) goto L_0x0126
                com.linecorp.linesdk.auth.internal.b r2 = com.linecorp.linesdk.auth.internal.C18221a.f50302a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r2 == 0) goto L_0x0121
                int r10 = r9.f50315a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                int r11 = r2.f50315a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r10 == r11) goto L_0x010d
                int r9 = r9.f50315a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                int r2 = r2.f50315a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r9 < r2) goto L_0x0121
            L_0x010b:
                r2 = 1
                goto L_0x0122
            L_0x010d:
                int r10 = r9.f50316b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                int r11 = r2.f50316b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r10 == r11) goto L_0x011a
                int r9 = r9.f50316b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                int r2 = r2.f50316b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r9 < r2) goto L_0x0121
                goto L_0x010b
            L_0x011a:
                int r9 = r9.f50317c     // Catch:{ ActivityNotFoundException -> 0x01ec }
                int r2 = r2.f50317c     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r9 < r2) goto L_0x0121
                goto L_0x010b
            L_0x0121:
                r2 = 0
            L_0x0122:
                if (r2 == 0) goto L_0x0126
                r2 = 1
                goto L_0x0127
            L_0x0126:
                r2 = 0
            L_0x0127:
                if (r2 == 0) goto L_0x013e
                android.content.Intent r1 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r2 = "android.intent.action.VIEW"
                r1.<init>(r2)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r1.setData(r13)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r13 = "jp.naver.line.android"
                r1.setPackage(r13)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.a$a r13 = new com.linecorp.linesdk.auth.internal.a$a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.<init>(r1, r3, r5)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                goto L_0x0190
            L_0x013e:
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r9 = "android.intent.action.VIEW"
                java.lang.String r10 = "http://"
                android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r2.<init>(r9, r10)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.util.List r1 = r1.queryIntentActivities(r2, r8)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.os.Bundle r2 = r7.getExtras()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.util.List r1 = com.linecorp.linesdk.auth.internal.C18221a.m44417a(r13, r1, r2)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                int r2 = r1.size()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r2 == 0) goto L_0x01dc
                if (r2 != r5) goto L_0x016f
                com.linecorp.linesdk.auth.internal.a$a r13 = new com.linecorp.linesdk.auth.internal.a$a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.Object r1 = r1.get(r8)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.<init>(r1, r3, r8)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                goto L_0x0190
            L_0x016f:
                java.lang.Object r13 = r1.remove(r8)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r13 = android.content.Intent.createChooser(r13, r6)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r2 = "android.intent.extra.INITIAL_INTENTS"
                int r5 = r1.size()     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.os.Parcelable[] r5 = new android.os.Parcelable[r5]     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.Object[] r1 = r1.toArray(r5)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.putExtra(r2, r1)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.a$a r1 = new com.linecorp.linesdk.auth.internal.a$a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r1.<init>(r13, r3, r8)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13 = r1
            L_0x0190:
                com.linecorp.linesdk.auth.internal.a$b r1 = new com.linecorp.linesdk.auth.internal.a$b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r2 = r13.f50304a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.os.Bundle r3 = r13.f50305b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                boolean r13 = r13.f50306c     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r1.<init>(r2, r3, r0, r13)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                boolean r13 = r1.f50310d     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r13 == 0) goto L_0x01b9
                int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ ActivityNotFoundException -> 0x01ec }
                if (r13 < r4) goto L_0x01af
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18226c.this     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r13 = r13.f50318a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r0 = r1.f50307a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.os.Bundle r2 = r1.f50308b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.startActivity(r0, r2)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                goto L_0x01d3
            L_0x01af:
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18226c.this     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r13 = r13.f50318a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r0 = r1.f50307a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                goto L_0x01d3
            L_0x01b9:
                int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r0 = 3
                if (r13 < r4) goto L_0x01ca
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18226c.this     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r13 = r13.f50318a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r2 = r1.f50307a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.os.Bundle r3 = r1.f50308b     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.startActivityForResult(r2, r0, r3)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                goto L_0x01d3
            L_0x01ca:
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18226c.this     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r13 = r13.f50318a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                android.content.Intent r2 = r1.f50307a     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.startActivityForResult(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x01ec }
            L_0x01d3:
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18226c.this     // Catch:{ ActivityNotFoundException -> 0x01ec }
                com.linecorp.linesdk.auth.internal.d r13 = r13.f50325h     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r0 = r1.f50309c     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r13.f50330b = r0     // Catch:{ ActivityNotFoundException -> 0x01ec }
                return
            L_0x01dc:
                android.content.ActivityNotFoundException r0 = new android.content.ActivityNotFoundException     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r1 = "Activity for LINE log-in is not found. uri="
                java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                java.lang.String r13 = r1.concat(r13)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                r0.<init>(r13)     // Catch:{ ActivityNotFoundException -> 0x01ec }
                throw r0     // Catch:{ ActivityNotFoundException -> 0x01ec }
            L_0x01ec:
                r13 = move-exception
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18226c.this
                com.linecorp.linesdk.auth.internal.d r0 = r0.f50325h
                int r1 = com.linecorp.linesdk.auth.internal.C18230d.C18232a.f50336d
                r0.f50332d = r1
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18226c.this
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r0 = r0.f50318a
                com.linecorp.linesdk.auth.LineLoginResult r1 = new com.linecorp.linesdk.auth.LineLoginResult
                com.linecorp.linesdk.b r2 = com.linecorp.linesdk.C18233b.INTERNAL_ERROR
                com.linecorp.linesdk.LineApiError r3 = new com.linecorp.linesdk.LineApiError
                r3.<init>(r13)
                r1.<init>(r2, r3)
                r0.mo36314a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.auth.internal.C18226c.C18229c.onPostExecute(java.lang.Object):void");
        }

        /* synthetic */ C18229c(C18226c cVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    static /* synthetic */ LineLoginResult m44423a(C18194a aVar) {
        return new LineLoginResult(aVar.f50237b, aVar.f50238c);
    }

    C18226c(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, C18230d dVar, String[] strArr) {
        this(lineAuthenticationActivity, lineAuthenticationConfig, new C18203b(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.f50285b), new C18209d(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.f50285b), new C18221a(dVar), new C18195a(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.f50284a), dVar, strArr);
    }

    private C18226c(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, C18203b bVar, C18209d dVar, C18221a aVar, C18195a aVar2, C18230d dVar2, String[] strArr) {
        this.f50318a = lineAuthenticationActivity;
        this.f50319b = lineAuthenticationConfig;
        this.f50320c = bVar;
        this.f50321d = dVar;
        this.f50322e = aVar;
        this.f50323f = aVar2;
        this.f50325h = dVar2;
        this.f50324g = strArr;
    }
}
