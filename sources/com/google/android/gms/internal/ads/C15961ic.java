package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14987bu;
import com.google.android.gms.common.util.C15515f;
import java.util.Collections;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ic */
public final class C15961ic implements C15948hq<ama> {

    /* renamed from: d */
    private static final Map<String, Integer> f45058d;

    /* renamed from: a */
    private final C14987bu f45059a;

    /* renamed from: b */
    private final C16205rd f45060b;

    /* renamed from: c */
    private final C16218rq f45061c;

    public C15961ic(C14987bu buVar, C16205rd rdVar, C16218rq rqVar) {
        this.f45059a = buVar;
        this.f45060b = rdVar;
        this.f45061c = rqVar;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo27606a(java.lang.Object r14, java.util.Map r15) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.ama r14 = (com.google.android.gms.internal.ads.ama) r14
            java.lang.String r0 = "a"
            java.lang.Object r0 = r15.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, java.lang.Integer> r1 = f45058d
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 7
            r2 = 5
            if (r0 == r2) goto L_0x002f
            if (r0 == r1) goto L_0x002f
            com.google.android.gms.ads.internal.bu r3 = r13.f45059a
            if (r3 == 0) goto L_0x002f
            com.google.android.gms.ads.internal.bu r3 = r13.f45059a
            boolean r3 = r3.mo27622b()
            if (r3 != 0) goto L_0x002f
            com.google.android.gms.ads.internal.bu r14 = r13.f45059a
            r15 = 0
            r14.mo27621a(r15)
            return
        L_0x002f:
            r3 = -1
            r4 = 0
            r5 = 1
            if (r0 == r5) goto L_0x01f2
            r2 = 2132548542(0x7f1c1bbe, float:2.0750361E38)
            r6 = 2132548541(0x7f1c1bbd, float:2.075036E38)
            switch(r0) {
                case 3: goto L_0x0113;
                case 4: goto L_0x009c;
                case 5: goto L_0x0062;
                case 6: goto L_0x005c;
                case 7: goto L_0x0043;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.String r14 = "Unknown MRAID command called."
            com.google.android.gms.internal.ads.abv.m32796d(r14)
            goto L_0x005b
        L_0x0043:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.C15740bx.f44199M
            com.google.android.gms.internal.ads.bu r15 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r14 = r15.mo30717a(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.rq r14 = r13.f45061c
            r14.mo27623I()
            return
        L_0x005b:
            return
        L_0x005c:
            com.google.android.gms.internal.ads.rd r14 = r13.f45060b
            r14.mo31354a(r5)
            return
        L_0x0062:
            com.google.android.gms.internal.ads.rg r0 = new com.google.android.gms.internal.ads.rg
            r0.<init>(r14, r15)
            com.google.android.gms.internal.ads.ama r14 = r0.f45483a
            if (r14 != 0) goto L_0x0071
            java.lang.String r14 = "AdWebView is null"
            com.google.android.gms.internal.ads.abv.m32798e(r14)
            return
        L_0x0071:
            java.lang.String r14 = "portrait"
            java.lang.String r15 = r0.f45485c
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x007c
            goto L_0x0096
        L_0x007c:
            java.lang.String r14 = "landscape"
            java.lang.String r15 = r0.f45485c
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x0088
            r1 = 6
            goto L_0x0096
        L_0x0088:
            boolean r14 = r0.f45484b
            if (r14 == 0) goto L_0x008e
            r1 = -1
            goto L_0x0096
        L_0x008e:
            com.google.android.gms.internal.ads.acm r14 = com.google.android.gms.ads.internal.C14963ax.m30832b()
            int r1 = r14.mo28683a()
        L_0x0096:
            com.google.android.gms.internal.ads.ama r14 = r0.f45483a
            r14.setRequestedOrientation(r1)
            return
        L_0x009c:
            com.google.android.gms.internal.ads.ra r0 = new com.google.android.gms.internal.ads.ra
            r0.<init>(r14, r15)
            android.content.Context r14 = r0.f45454a
            if (r14 != 0) goto L_0x00ab
            java.lang.String r14 = "Activity context is not available."
            r0.mo31366a(r14)
            return
        L_0x00ab:
            android.content.Context r14 = r0.f45454a
            com.google.android.gms.internal.ads.bh r14 = com.google.android.gms.internal.ads.acd.m32608e(r14)
            boolean r14 = r14.mo30160b()
            if (r14 != 0) goto L_0x00bd
            java.lang.String r14 = "This feature is not available on the device."
            r0.mo31366a(r14)
            return
        L_0x00bd:
            android.content.Context r14 = r0.f45454a
            android.app.AlertDialog$Builder r14 = com.google.android.gms.internal.ads.acd.m32606d(r14)
            com.google.android.gms.internal.ads.abh r15 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            android.content.res.Resources r15 = r15.mo28592c()
            if (r15 == 0) goto L_0x00d5
            r1 = 2132548543(0x7f1c1bbf, float:2.0750363E38)
            java.lang.String r1 = r15.getString(r1)
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r1 = "Create calendar event"
        L_0x00d7:
            r14.setTitle(r1)
            if (r15 == 0) goto L_0x00e4
            r1 = 2132548544(0x7f1c1bc0, float:2.0750365E38)
            java.lang.String r1 = r15.getString(r1)
            goto L_0x00e6
        L_0x00e4:
            java.lang.String r1 = "Allow Ad to create a calendar event?"
        L_0x00e6:
            r14.setMessage(r1)
            if (r15 == 0) goto L_0x00f0
            java.lang.String r1 = r15.getString(r6)
            goto L_0x00f2
        L_0x00f0:
            java.lang.String r1 = "Accept"
        L_0x00f2:
            com.google.android.gms.internal.ads.rb r3 = new com.google.android.gms.internal.ads.rb
            r3.<init>(r0)
            r14.setPositiveButton(r1, r3)
            if (r15 == 0) goto L_0x0101
            java.lang.String r15 = r15.getString(r2)
            goto L_0x0103
        L_0x0101:
            java.lang.String r15 = "Decline"
        L_0x0103:
            com.google.android.gms.internal.ads.rc r1 = new com.google.android.gms.internal.ads.rc
            r1.<init>(r0)
            r14.setNegativeButton(r15, r1)
            android.app.AlertDialog r14 = r14.create()
            r14.show()
            return
        L_0x0113:
            com.google.android.gms.internal.ads.rh r0 = new com.google.android.gms.internal.ads.rh
            r0.<init>(r14, r15)
            android.content.Context r14 = r0.f45487b
            if (r14 != 0) goto L_0x0122
            java.lang.String r14 = "Activity context is not available"
            r0.mo31366a(r14)
            return
        L_0x0122:
            android.content.Context r14 = r0.f45487b
            com.google.android.gms.internal.ads.bh r14 = com.google.android.gms.internal.ads.acd.m32608e(r14)
            boolean r14 = r14.mo30158a()
            if (r14 != 0) goto L_0x0134
            java.lang.String r14 = "Feature is not supported by the device."
            r0.mo31366a(r14)
            return
        L_0x0134:
            java.util.Map<java.lang.String, java.lang.String> r14 = r0.f45486a
            java.lang.String r15 = "iurl"
            java.lang.Object r14 = r14.get(r15)
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 == 0) goto L_0x014a
            java.lang.String r14 = "Image url cannot be empty."
            r0.mo31366a(r14)
            return
        L_0x014a:
            boolean r15 = android.webkit.URLUtil.isValidUrl(r14)
            if (r15 != 0) goto L_0x016a
            java.lang.String r15 = "Invalid image url: "
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r1 = r14.length()
            if (r1 == 0) goto L_0x0161
            java.lang.String r14 = r15.concat(r14)
            goto L_0x0166
        L_0x0161:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r15)
        L_0x0166:
            r0.mo31366a(r14)
            return
        L_0x016a:
            android.net.Uri r15 = android.net.Uri.parse(r14)
            java.lang.String r15 = r15.getLastPathSegment()
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            if (r1 == 0) goto L_0x0179
            goto L_0x017f
        L_0x0179:
            java.lang.String r1 = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)"
            boolean r4 = r15.matches(r1)
        L_0x017f:
            if (r4 != 0) goto L_0x019c
            java.lang.String r14 = "Image type not recognized: "
            java.lang.String r15 = java.lang.String.valueOf(r15)
            int r1 = r15.length()
            if (r1 == 0) goto L_0x0192
            java.lang.String r14 = r14.concat(r15)
            goto L_0x0198
        L_0x0192:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r14)
            r14 = r15
        L_0x0198:
            r0.mo31366a(r14)
            return
        L_0x019c:
            com.google.android.gms.internal.ads.abh r1 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            android.content.res.Resources r1 = r1.mo28592c()
            android.content.Context r3 = r0.f45487b
            android.app.AlertDialog$Builder r3 = com.google.android.gms.internal.ads.acd.m32606d(r3)
            if (r1 == 0) goto L_0x01b4
            r4 = 2132548539(0x7f1c1bbb, float:2.0750355E38)
            java.lang.String r4 = r1.getString(r4)
            goto L_0x01b6
        L_0x01b4:
            java.lang.String r4 = "Save image"
        L_0x01b6:
            r3.setTitle(r4)
            if (r1 == 0) goto L_0x01c3
            r4 = 2132548540(0x7f1c1bbc, float:2.0750357E38)
            java.lang.String r4 = r1.getString(r4)
            goto L_0x01c5
        L_0x01c3:
            java.lang.String r4 = "Allow Ad to store image in Picture gallery?"
        L_0x01c5:
            r3.setMessage(r4)
            if (r1 == 0) goto L_0x01cf
            java.lang.String r4 = r1.getString(r6)
            goto L_0x01d1
        L_0x01cf:
            java.lang.String r4 = "Accept"
        L_0x01d1:
            com.google.android.gms.internal.ads.rj r5 = new com.google.android.gms.internal.ads.rj
            r5.<init>(r0, r14, r15)
            r3.setPositiveButton(r4, r5)
            if (r1 == 0) goto L_0x01e0
            java.lang.String r14 = r1.getString(r2)
            goto L_0x01e2
        L_0x01e0:
            java.lang.String r14 = "Decline"
        L_0x01e2:
            com.google.android.gms.internal.ads.rk r15 = new com.google.android.gms.internal.ads.rk
            r15.<init>(r0)
            r3.setNegativeButton(r14, r15)
            android.app.AlertDialog r14 = r3.create()
            r14.show()
            return
        L_0x01f2:
            com.google.android.gms.internal.ads.rd r14 = r13.f45060b
            java.lang.Object r0 = r14.f45470g
            monitor-enter(r0)
            android.app.Activity r1 = r14.f45472i     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x0202
            java.lang.String r15 = "Not an activity context. Cannot resize."
            r14.mo31366a(r15)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x0202:
            com.google.android.gms.internal.ads.ama r1 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.anp r1 = r1.mo29195u()     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x0211
            java.lang.String r15 = "Webview is not yet available, size is not set."
            r14.mo31366a(r15)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x0211:
            com.google.android.gms.internal.ads.ama r1 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.anp r1 = r1.mo29195u()     // Catch:{ all -> 0x04f7 }
            boolean r1 = r1.mo29366e()     // Catch:{ all -> 0x04f7 }
            if (r1 == 0) goto L_0x0224
            java.lang.String r15 = "Is interstitial. Cannot resize an interstitial."
            r14.mo31366a(r15)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x0224:
            com.google.android.gms.internal.ads.ama r1 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            boolean r1 = r1.mo29138B()     // Catch:{ all -> 0x04f7 }
            if (r1 == 0) goto L_0x0233
            java.lang.String r15 = "Cannot resize an expanded banner."
            r14.mo31366a(r15)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x0233:
            java.lang.String r1 = "width"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x04f7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x024f
            java.lang.String r1 = "width"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x04f7 }
            int r1 = com.google.android.gms.internal.ads.acd.m32570a(r1)     // Catch:{ all -> 0x04f7 }
            r14.f45469f = r1     // Catch:{ all -> 0x04f7 }
        L_0x024f:
            java.lang.String r1 = "height"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x04f7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x026b
            java.lang.String r1 = "height"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x04f7 }
            int r1 = com.google.android.gms.internal.ads.acd.m32570a(r1)     // Catch:{ all -> 0x04f7 }
            r14.f45466c = r1     // Catch:{ all -> 0x04f7 }
        L_0x026b:
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x04f7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x0287
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x04f7 }
            int r1 = com.google.android.gms.internal.ads.acd.m32570a(r1)     // Catch:{ all -> 0x04f7 }
            r14.f45467d = r1     // Catch:{ all -> 0x04f7 }
        L_0x0287:
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x04f7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x02a3
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x04f7 }
            int r1 = com.google.android.gms.internal.ads.acd.m32570a(r1)     // Catch:{ all -> 0x04f7 }
            r14.f45468e = r1     // Catch:{ all -> 0x04f7 }
        L_0x02a3:
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x04f7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x02bf
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x04f7 }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ all -> 0x04f7 }
            r14.f45465b = r1     // Catch:{ all -> 0x04f7 }
        L_0x02bf:
            java.lang.String r1 = "customClosePosition"
            java.lang.Object r15 = r15.get(r1)     // Catch:{ all -> 0x04f7 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x04f7 }
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x02cf
            r14.f45464a = r15     // Catch:{ all -> 0x04f7 }
        L_0x02cf:
            int r15 = r14.f45469f     // Catch:{ all -> 0x04f7 }
            if (r15 < 0) goto L_0x02d9
            int r15 = r14.f45466c     // Catch:{ all -> 0x04f7 }
            if (r15 < 0) goto L_0x02d9
            r15 = 1
            goto L_0x02da
        L_0x02d9:
            r15 = 0
        L_0x02da:
            if (r15 != 0) goto L_0x02e3
            java.lang.String r15 = "Invalid width and height options. Cannot resize."
            r14.mo31366a(r15)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x02e3:
            android.app.Activity r15 = r14.f45472i     // Catch:{ all -> 0x04f7 }
            android.view.Window r15 = r15.getWindow()     // Catch:{ all -> 0x04f7 }
            if (r15 == 0) goto L_0x04f0
            android.view.View r1 = r15.getDecorView()     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x02f3
            goto L_0x04f0
        L_0x02f3:
            int[] r1 = r14.mo31355a()     // Catch:{ all -> 0x04f7 }
            if (r1 != 0) goto L_0x0300
            java.lang.String r15 = "Resize location out of screen or close button is not visible."
            r14.mo31366a(r15)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x0300:
            android.app.Activity r6 = r14.f45472i     // Catch:{ all -> 0x04f7 }
            int r7 = r14.f45469f     // Catch:{ all -> 0x04f7 }
            int r6 = com.google.android.gms.internal.ads.aes.m32748a(r6, r7)     // Catch:{ all -> 0x04f7 }
            android.app.Activity r7 = r14.f45472i     // Catch:{ all -> 0x04f7 }
            int r8 = r14.f45466c     // Catch:{ all -> 0x04f7 }
            int r7 = com.google.android.gms.internal.ads.aes.m32748a(r7, r8)     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.ama r8 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04f7 }
            android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x04f7 }
            if (r8 == 0) goto L_0x04e9
            boolean r9 = r8 instanceof android.view.ViewGroup     // Catch:{ all -> 0x04f7 }
            if (r9 == 0) goto L_0x04e9
            r9 = r8
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.ama r10 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            android.view.View r10 = r10.getView()     // Catch:{ all -> 0x04f7 }
            r9.removeView(r10)     // Catch:{ all -> 0x04f7 }
            android.widget.PopupWindow r9 = r14.f45477n     // Catch:{ all -> 0x04f7 }
            if (r9 != 0) goto L_0x0366
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x04f7 }
            r14.f45479p = r8     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.ama r8 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04f7 }
            r8.setDrawingCacheEnabled(r5)     // Catch:{ all -> 0x04f7 }
            android.graphics.Bitmap r9 = r8.getDrawingCache()     // Catch:{ all -> 0x04f7 }
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9)     // Catch:{ all -> 0x04f7 }
            r8.setDrawingCacheEnabled(r4)     // Catch:{ all -> 0x04f7 }
            android.widget.ImageView r8 = new android.widget.ImageView     // Catch:{ all -> 0x04f7 }
            android.app.Activity r10 = r14.f45472i     // Catch:{ all -> 0x04f7 }
            r8.<init>(r10)     // Catch:{ all -> 0x04f7 }
            r14.f45474k = r8     // Catch:{ all -> 0x04f7 }
            android.widget.ImageView r8 = r14.f45474k     // Catch:{ all -> 0x04f7 }
            r8.setImageBitmap(r9)     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.ama r8 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.anp r8 = r8.mo29195u()     // Catch:{ all -> 0x04f7 }
            r14.f45473j = r8     // Catch:{ all -> 0x04f7 }
            android.view.ViewGroup r8 = r14.f45479p     // Catch:{ all -> 0x04f7 }
            android.widget.ImageView r9 = r14.f45474k     // Catch:{ all -> 0x04f7 }
            r8.addView(r9)     // Catch:{ all -> 0x04f7 }
            goto L_0x036b
        L_0x0366:
            android.widget.PopupWindow r8 = r14.f45477n     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.C16206re.m38718a(r8)     // Catch:{ all -> 0x04f7 }
        L_0x036b:
            android.widget.RelativeLayout r8 = new android.widget.RelativeLayout     // Catch:{ all -> 0x04f7 }
            android.app.Activity r9 = r14.f45472i     // Catch:{ all -> 0x04f7 }
            r8.<init>(r9)     // Catch:{ all -> 0x04f7 }
            r14.f45478o = r8     // Catch:{ all -> 0x04f7 }
            android.widget.RelativeLayout r8 = r14.f45478o     // Catch:{ all -> 0x04f7 }
            r8.setBackgroundColor(r4)     // Catch:{ all -> 0x04f7 }
            android.widget.RelativeLayout r8 = r14.f45478o     // Catch:{ all -> 0x04f7 }
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x04f7 }
            r9.<init>(r6, r7)     // Catch:{ all -> 0x04f7 }
            r8.setLayoutParams(r9)     // Catch:{ all -> 0x04f7 }
            android.widget.RelativeLayout r8 = r14.f45478o     // Catch:{ all -> 0x04f7 }
            android.widget.PopupWindow r9 = new android.widget.PopupWindow     // Catch:{ all -> 0x04f7 }
            r9.<init>(r8, r6, r7, r4)     // Catch:{ all -> 0x04f7 }
            r14.f45477n = r9     // Catch:{ all -> 0x04f7 }
            android.widget.PopupWindow r8 = r14.f45477n     // Catch:{ all -> 0x04f7 }
            r8.setOutsideTouchable(r5)     // Catch:{ all -> 0x04f7 }
            android.widget.PopupWindow r8 = r14.f45477n     // Catch:{ all -> 0x04f7 }
            r8.setTouchable(r5)     // Catch:{ all -> 0x04f7 }
            android.widget.PopupWindow r8 = r14.f45477n     // Catch:{ all -> 0x04f7 }
            boolean r9 = r14.f45465b     // Catch:{ all -> 0x04f7 }
            r9 = r9 ^ r5
            r8.setClippingEnabled(r9)     // Catch:{ all -> 0x04f7 }
            android.widget.RelativeLayout r8 = r14.f45478o     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.ama r9 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x04f7 }
            r8.addView(r9, r3, r3)     // Catch:{ all -> 0x04f7 }
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch:{ all -> 0x04f7 }
            android.app.Activity r9 = r14.f45472i     // Catch:{ all -> 0x04f7 }
            r8.<init>(r9)     // Catch:{ all -> 0x04f7 }
            r14.f45475l = r8     // Catch:{ all -> 0x04f7 }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x04f7 }
            android.app.Activity r9 = r14.f45472i     // Catch:{ all -> 0x04f7 }
            r10 = 50
            int r9 = com.google.android.gms.internal.ads.aes.m32748a(r9, r10)     // Catch:{ all -> 0x04f7 }
            android.app.Activity r11 = r14.f45472i     // Catch:{ all -> 0x04f7 }
            int r10 = com.google.android.gms.internal.ads.aes.m32748a(r11, r10)     // Catch:{ all -> 0x04f7 }
            r8.<init>(r9, r10)     // Catch:{ all -> 0x04f7 }
            java.lang.String r9 = r14.f45464a     // Catch:{ all -> 0x04f7 }
            int r10 = r9.hashCode()     // Catch:{ all -> 0x04f7 }
            switch(r10) {
                case -1364013995: goto L_0x0400;
                case -1012429441: goto L_0x03f6;
                case -655373719: goto L_0x03ec;
                case 1163912186: goto L_0x03e3;
                case 1288627767: goto L_0x03d9;
                case 1755462605: goto L_0x03cf;
                default: goto L_0x03ce;
            }     // Catch:{ all -> 0x04f7 }
        L_0x03ce:
            goto L_0x040a
        L_0x03cf:
            java.lang.String r2 = "top-center"
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x04f7 }
            if (r2 == 0) goto L_0x040a
            r2 = 1
            goto L_0x040b
        L_0x03d9:
            java.lang.String r2 = "bottom-center"
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x04f7 }
            if (r2 == 0) goto L_0x040a
            r2 = 4
            goto L_0x040b
        L_0x03e3:
            java.lang.String r10 = "bottom-right"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x04f7 }
            if (r9 == 0) goto L_0x040a
            goto L_0x040b
        L_0x03ec:
            java.lang.String r2 = "bottom-left"
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x04f7 }
            if (r2 == 0) goto L_0x040a
            r2 = 3
            goto L_0x040b
        L_0x03f6:
            java.lang.String r2 = "top-left"
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x04f7 }
            if (r2 == 0) goto L_0x040a
            r2 = 0
            goto L_0x040b
        L_0x0400:
            java.lang.String r2 = "center"
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x04f7 }
            if (r2 == 0) goto L_0x040a
            r2 = 2
            goto L_0x040b
        L_0x040a:
            r2 = -1
        L_0x040b:
            r3 = 14
            r9 = 9
            r10 = 11
            r11 = 12
            r12 = 10
            switch(r2) {
                case 0: goto L_0x043e;
                case 1: goto L_0x0437;
                case 2: goto L_0x0431;
                case 3: goto L_0x042a;
                case 4: goto L_0x0423;
                case 5: goto L_0x041c;
                default: goto L_0x0418;
            }     // Catch:{ all -> 0x04f7 }
        L_0x0418:
            r8.addRule(r12)     // Catch:{ all -> 0x04f7 }
            goto L_0x0445
        L_0x041c:
            r8.addRule(r11)     // Catch:{ all -> 0x04f7 }
            r8.addRule(r10)     // Catch:{ all -> 0x04f7 }
            goto L_0x0448
        L_0x0423:
            r8.addRule(r11)     // Catch:{ all -> 0x04f7 }
            r8.addRule(r3)     // Catch:{ all -> 0x04f7 }
            goto L_0x0448
        L_0x042a:
            r8.addRule(r11)     // Catch:{ all -> 0x04f7 }
            r8.addRule(r9)     // Catch:{ all -> 0x04f7 }
            goto L_0x0448
        L_0x0431:
            r2 = 13
            r8.addRule(r2)     // Catch:{ all -> 0x04f7 }
            goto L_0x0448
        L_0x0437:
            r8.addRule(r12)     // Catch:{ all -> 0x04f7 }
            r8.addRule(r3)     // Catch:{ all -> 0x04f7 }
            goto L_0x0448
        L_0x043e:
            r8.addRule(r12)     // Catch:{ all -> 0x04f7 }
            r8.addRule(r9)     // Catch:{ all -> 0x04f7 }
            goto L_0x0448
        L_0x0445:
            r8.addRule(r10)     // Catch:{ all -> 0x04f7 }
        L_0x0448:
            android.widget.LinearLayout r2 = r14.f45475l     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.rf r3 = new com.google.android.gms.internal.ads.rf     // Catch:{ all -> 0x04f7 }
            r3.<init>(r14)     // Catch:{ all -> 0x04f7 }
            r2.setOnClickListener(r3)     // Catch:{ all -> 0x04f7 }
            android.widget.LinearLayout r2 = r14.f45475l     // Catch:{ all -> 0x04f7 }
            java.lang.String r3 = "Close button"
            r2.setContentDescription(r3)     // Catch:{ all -> 0x04f7 }
            android.widget.RelativeLayout r2 = r14.f45478o     // Catch:{ all -> 0x04f7 }
            android.widget.LinearLayout r3 = r14.f45475l     // Catch:{ all -> 0x04f7 }
            r2.addView(r3, r8)     // Catch:{ all -> 0x04f7 }
            android.widget.PopupWindow r2 = r14.f45477n     // Catch:{ RuntimeException -> 0x04a1 }
            android.view.View r15 = r15.getDecorView()     // Catch:{ RuntimeException -> 0x04a1 }
            android.app.Activity r3 = r14.f45472i     // Catch:{ RuntimeException -> 0x04a1 }
            r8 = r1[r4]     // Catch:{ RuntimeException -> 0x04a1 }
            int r3 = com.google.android.gms.internal.ads.aes.m32748a(r3, r8)     // Catch:{ RuntimeException -> 0x04a1 }
            android.app.Activity r8 = r14.f45472i     // Catch:{ RuntimeException -> 0x04a1 }
            r9 = r1[r5]     // Catch:{ RuntimeException -> 0x04a1 }
            int r8 = com.google.android.gms.internal.ads.aes.m32748a(r8, r9)     // Catch:{ RuntimeException -> 0x04a1 }
            r2.showAtLocation(r15, r4, r3, r8)     // Catch:{ RuntimeException -> 0x04a1 }
            r15 = r1[r4]     // Catch:{ all -> 0x04f7 }
            r2 = r1[r5]     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.rq r3 = r14.f45476m     // Catch:{ all -> 0x04f7 }
            if (r3 == 0) goto L_0x048a
            com.google.android.gms.internal.ads.rq r3 = r14.f45476m     // Catch:{ all -> 0x04f7 }
            int r8 = r14.f45469f     // Catch:{ all -> 0x04f7 }
            int r9 = r14.f45466c     // Catch:{ all -> 0x04f7 }
            r3.mo27601a(r15, r2, r8, r9)     // Catch:{ all -> 0x04f7 }
        L_0x048a:
            com.google.android.gms.internal.ads.ama r15 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.anp r2 = com.google.android.gms.internal.ads.anp.m33672a(r6, r7)     // Catch:{ all -> 0x04f7 }
            r15.mo29153a(r2)     // Catch:{ all -> 0x04f7 }
            r15 = r1[r4]     // Catch:{ all -> 0x04f7 }
            r1 = r1[r5]     // Catch:{ all -> 0x04f7 }
            r14.mo31352a(r15, r1)     // Catch:{ all -> 0x04f7 }
            java.lang.String r15 = "resized"
            r14.mo31367b(r15)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x04a1:
            r15 = move-exception
            java.lang.String r1 = "Cannot show popup window: "
            java.lang.String r15 = r15.getMessage()     // Catch:{ all -> 0x04f7 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x04f7 }
            int r2 = r15.length()     // Catch:{ all -> 0x04f7 }
            if (r2 == 0) goto L_0x04b7
            java.lang.String r15 = r1.concat(r15)     // Catch:{ all -> 0x04f7 }
            goto L_0x04bc
        L_0x04b7:
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x04f7 }
            r15.<init>(r1)     // Catch:{ all -> 0x04f7 }
        L_0x04bc:
            r14.mo31366a(r15)     // Catch:{ all -> 0x04f7 }
            android.widget.RelativeLayout r15 = r14.f45478o     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.ama r1 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            android.view.View r1 = r1.getView()     // Catch:{ all -> 0x04f7 }
            r15.removeView(r1)     // Catch:{ all -> 0x04f7 }
            android.view.ViewGroup r15 = r14.f45479p     // Catch:{ all -> 0x04f7 }
            if (r15 == 0) goto L_0x04e7
            android.view.ViewGroup r15 = r14.f45479p     // Catch:{ all -> 0x04f7 }
            android.widget.ImageView r1 = r14.f45474k     // Catch:{ all -> 0x04f7 }
            r15.removeView(r1)     // Catch:{ all -> 0x04f7 }
            android.view.ViewGroup r15 = r14.f45479p     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.ama r1 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            android.view.View r1 = r1.getView()     // Catch:{ all -> 0x04f7 }
            r15.addView(r1)     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.ama r15 = r14.f45471h     // Catch:{ all -> 0x04f7 }
            com.google.android.gms.internal.ads.anp r14 = r14.f45473j     // Catch:{ all -> 0x04f7 }
            r15.mo29153a(r14)     // Catch:{ all -> 0x04f7 }
        L_0x04e7:
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x04e9:
            java.lang.String r15 = "Webview is detached, probably in the middle of a resize or expand."
            r14.mo31366a(r15)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x04f0:
            java.lang.String r15 = "Activity context is not ready, cannot get window or decor view."
            r14.mo31366a(r15)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            return
        L_0x04f7:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x04f7 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15961ic.mo27606a(java.lang.Object, java.util.Map):void");
    }

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)};
        Map b = C15515f.m32277b(7, false);
        for (int i = 0; i < 7; i++) {
            b.put(strArr[i], numArr[i]);
        }
        f45058d = Collections.unmodifiableMap(b);
    }
}
