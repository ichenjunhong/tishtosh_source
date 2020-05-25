package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.internal.C14338p;
import com.facebook.p909a.C13594o;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14987bu;
import com.google.android.gms.internal.ads.amy;
import com.google.android.gms.internal.ads.amz;
import com.google.android.gms.internal.ads.and;
import com.google.android.gms.internal.ads.ang;
import com.google.android.gms.internal.ads.ani;
import com.p683ss.android.ugc.aweme.tools.extract.C47041l;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.id */
public final class C15962id<T extends amy & amz & and & ang & ani> implements C15948hq<T> {

    /* renamed from: a */
    private final C14987bu f45062a;

    /* renamed from: b */
    private final C16205rd f45063b;

    public C15962id(C14987bu buVar, C16205rd rdVar) {
        this.f45062a = buVar;
        this.f45063b = rdVar;
    }

    /* renamed from: a */
    private static boolean m37779a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m37780b(Map<String, String> map) {
        String str = (String) map.get(C13594o.f35460a);
        if (str != null) {
            if (C14338p.f37308a.equalsIgnoreCase(str)) {
                return 7;
            }
            if (C47041l.f118793f.equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return C14963ax.m30832b().mo28683a();
            }
        }
        return -1;
    }

    /* renamed from: a */
    private final void m37778a(boolean z) {
        if (this.f45063b != null) {
            this.f45063b.mo31354a(z);
        }
    }

    /* renamed from: a */
    static String m37777a(Context context, beh beh, String str, View view, Activity activity) {
        if (beh == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            boolean z = false;
            if (beh.mo30081a(parse)) {
                String[] strArr = beh.f42187a;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (parse.getPath().endsWith(strArr[i])) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                parse = beh.mo30078a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (bei unused) {
            return str;
        } catch (Exception e) {
            C14963ax.m30834d().mo28588a((Throwable) e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v19, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r3v20, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r5v22, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r3v27, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r3v28, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r3v29, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r3v31, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r3v33, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r3v37 */
    /* JADX WARNING: type inference failed for: r3v38 */
    /* JADX WARNING: type inference failed for: r3v39 */
    /* JADX WARNING: type inference failed for: r3v40 */
    /* JADX WARNING: type inference failed for: r3v41 */
    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.ie.a(android.content.Intent):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a1, code lost:
        if (r0.mo31089a((android.content.Intent) r3) != null) goto L_0x01f5;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v6
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], android.content.Intent, android.net.Uri]
      uses: [android.content.Intent, android.net.Uri]
      mth insns count: 294
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0250 A[SYNTHETIC, Splitter:B:97:0x0250] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo27606a(java.lang.Object r12, java.util.Map r13) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.amy r12 = (com.google.android.gms.internal.ads.amy) r12
            java.lang.String r0 = "u"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r1 = r12.getContext()
            r2 = 1
            java.lang.String r0 = com.google.android.gms.internal.ads.aav.m32439a(r0, r1, r2)
            java.lang.String r1 = "a"
            java.lang.Object r1 = r13.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0023
            java.lang.String r12 = "Action missing from an open GMSG."
            com.google.android.gms.internal.ads.abv.m32798e(r12)
            return
        L_0x0023:
            com.google.android.gms.ads.internal.bu r3 = r11.f45062a
            if (r3 == 0) goto L_0x0035
            com.google.android.gms.ads.internal.bu r3 = r11.f45062a
            boolean r3 = r3.mo27622b()
            if (r3 != 0) goto L_0x0035
            com.google.android.gms.ads.internal.bu r12 = r11.f45062a
            r12.mo27621a(r0)
            return
        L_0x0035:
            java.lang.String r3 = "expand"
            boolean r3 = r3.equalsIgnoreCase(r1)
            r4 = 0
            if (r3 == 0) goto L_0x005e
            r0 = r12
            com.google.android.gms.internal.ads.amz r0 = (com.google.android.gms.internal.ads.amz) r0
            boolean r0 = r0.mo29138B()
            if (r0 == 0) goto L_0x004d
            java.lang.String r12 = "Cannot expand WebView that is already expanded."
            com.google.android.gms.internal.ads.abv.m32798e(r12)
            return
        L_0x004d:
            r11.m37778a(r4)
            com.google.android.gms.internal.ads.and r12 = (com.google.android.gms.internal.ads.and) r12
            boolean r0 = m37779a(r13)
            int r13 = m37780b(r13)
            r12.mo29244a(r0, r13)
            return
        L_0x005e:
            java.lang.String r3 = "webapp"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 == 0) goto L_0x0097
            r11.m37778a(r4)
            if (r0 == 0) goto L_0x0079
            com.google.android.gms.internal.ads.and r12 = (com.google.android.gms.internal.ads.and) r12
            boolean r1 = m37779a(r13)
            int r13 = m37780b(r13)
            r12.mo29245a(r1, r13, r0)
            return
        L_0x0079:
            com.google.android.gms.internal.ads.and r12 = (com.google.android.gms.internal.ads.and) r12
            boolean r0 = m37779a(r13)
            int r1 = m37780b(r13)
            java.lang.String r2 = "html"
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "baseurl"
            java.lang.Object r13 = r13.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            r12.mo29246a(r0, r1, r2, r13)
            return
        L_0x0097:
            java.lang.String r3 = "app"
            boolean r1 = r3.equalsIgnoreCase(r1)
            r3 = 0
            if (r1 == 0) goto L_0x0209
            java.lang.String r1 = "true"
            java.lang.String r5 = "system_browser"
            java.lang.Object r5 = r13.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0209
            r11.m37778a(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00bf
            java.lang.String r12 = "Destination url cannot be empty."
            com.google.android.gms.internal.ads.abv.m32798e(r12)
            return
        L_0x00bf:
            com.google.android.gms.internal.ads.ie r0 = new com.google.android.gms.internal.ads.ie
            android.content.Context r1 = r12.getContext()
            r5 = r12
            com.google.android.gms.internal.ads.ang r5 = (com.google.android.gms.internal.ads.ang) r5
            com.google.android.gms.internal.ads.beh r5 = r5.mo29200z()
            r6 = r12
            com.google.android.gms.internal.ads.ani r6 = (com.google.android.gms.internal.ads.ani) r6
            android.view.View r6 = r6.getView()
            r0.<init>(r1, r5, r6)
            android.content.Context r1 = r0.f45064a
            java.lang.String r5 = "activity"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            java.lang.String r5 = "u"
            java.lang.Object r5 = r13.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x00f0
            goto L_0x01f5
        L_0x00f0:
            android.content.Context r6 = r0.f45064a
            com.google.android.gms.internal.ads.beh r7 = r0.f45065b
            android.view.View r8 = r0.f45066c
            java.lang.String r5 = m37777a(r6, r7, r5, r8, r3)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r6 = "use_first_package"
            java.lang.Object r6 = r13.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            java.lang.String r7 = "use_running_process"
            java.lang.Object r7 = r13.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = java.lang.Boolean.parseBoolean(r7)
            java.lang.String r8 = "use_custom_tabs"
            java.lang.Object r13 = r13.get(r8)
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = java.lang.Boolean.parseBoolean(r13)
            if (r13 != 0) goto L_0x0138
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r13 = com.google.android.gms.internal.ads.C15740bx.f44365ct
            com.google.android.gms.internal.ads.bu r8 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r13 = r8.mo30717a(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r2 = 0
        L_0x0138:
            java.lang.String r13 = "http"
            java.lang.String r8 = r5.getScheme()
            boolean r13 = r13.equalsIgnoreCase(r8)
            if (r13 == 0) goto L_0x0153
            android.net.Uri$Builder r13 = r5.buildUpon()
            java.lang.String r3 = "https"
            android.net.Uri$Builder r13 = r13.scheme(r3)
            android.net.Uri r3 = r13.build()
            goto L_0x016d
        L_0x0153:
            java.lang.String r13 = "https"
            java.lang.String r8 = r5.getScheme()
            boolean r13 = r13.equalsIgnoreCase(r8)
            if (r13 == 0) goto L_0x016d
            android.net.Uri$Builder r13 = r5.buildUpon()
            java.lang.String r3 = "http"
            android.net.Uri$Builder r13 = r13.scheme(r3)
            android.net.Uri r3 = r13.build()
        L_0x016d:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            android.content.Intent r5 = com.google.android.gms.internal.ads.C15963ie.m37783a(r5)
            android.content.Intent r3 = com.google.android.gms.internal.ads.C15963ie.m37783a(r3)
            if (r2 == 0) goto L_0x0186
            android.content.Context r2 = r0.f45064a
            com.google.android.gms.internal.ads.acd.m32598b(r2, r5)
            android.content.Context r2 = r0.f45064a
            com.google.android.gms.internal.ads.acd.m32598b(r2, r3)
        L_0x0186:
            android.content.pm.ResolveInfo r2 = r0.mo31090a(r5, r13)
            if (r2 == 0) goto L_0x0191
            android.content.Intent r3 = com.google.android.gms.internal.ads.C15963ie.m37782a(r5, r2)
            goto L_0x01f5
        L_0x0191:
            if (r3 == 0) goto L_0x01a4
            android.content.pm.ResolveInfo r2 = r0.mo31089a(r3)
            if (r2 == 0) goto L_0x01a4
            android.content.Intent r3 = com.google.android.gms.internal.ads.C15963ie.m37782a(r5, r2)
            android.content.pm.ResolveInfo r0 = r0.mo31089a(r3)
            if (r0 == 0) goto L_0x01a4
            goto L_0x01f5
        L_0x01a4:
            int r0 = r13.size()
            if (r0 == 0) goto L_0x01f4
            if (r7 == 0) goto L_0x01e7
            if (r1 == 0) goto L_0x01e7
            java.util.List r0 = r1.getRunningAppProcesses()
            if (r0 == 0) goto L_0x01e7
            r1 = r13
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
        L_0x01bc:
            if (r3 >= r2) goto L_0x01e7
            java.lang.Object r7 = r1.get(r3)
            int r3 = r3 + 1
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            java.util.Iterator r8 = r0.iterator()
        L_0x01ca:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01bc
            java.lang.Object r9 = r8.next()
            android.app.ActivityManager$RunningAppProcessInfo r9 = (android.app.ActivityManager.RunningAppProcessInfo) r9
            java.lang.String r9 = r9.processName
            android.content.pm.ActivityInfo r10 = r7.activityInfo
            java.lang.String r10 = r10.packageName
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x01ca
            android.content.Intent r3 = com.google.android.gms.internal.ads.C15963ie.m37782a(r5, r7)
            goto L_0x01f5
        L_0x01e7:
            if (r6 == 0) goto L_0x01f4
            java.lang.Object r13 = r13.get(r4)
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13
            android.content.Intent r3 = com.google.android.gms.internal.ads.C15963ie.m37782a(r5, r13)
            goto L_0x01f5
        L_0x01f4:
            r3 = r5
        L_0x01f5:
            com.google.android.gms.internal.ads.and r12 = (com.google.android.gms.internal.ads.and) r12     // Catch:{ ActivityNotFoundException -> 0x0200 }
            com.google.android.gms.ads.internal.overlay.zzc r13 = new com.google.android.gms.ads.internal.overlay.zzc     // Catch:{ ActivityNotFoundException -> 0x0200 }
            r13.<init>(r3)     // Catch:{ ActivityNotFoundException -> 0x0200 }
            r12.mo29241a(r13)     // Catch:{ ActivityNotFoundException -> 0x0200 }
            return
        L_0x0200:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            com.google.android.gms.internal.ads.abv.m32798e(r12)
            return
        L_0x0209:
            r11.m37778a(r2)
            java.lang.String r1 = "intent_url"
            java.lang.Object r1 = r13.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0239
            android.content.Intent r2 = android.content.Intent.parseUri(r1, r4)     // Catch:{ URISyntaxException -> 0x021f }
            goto L_0x023a
        L_0x021f:
            r2 = move-exception
            java.lang.String r4 = "Error parsing the url: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            if (r5 == 0) goto L_0x0231
            java.lang.String r1 = r4.concat(r1)
            goto L_0x0236
        L_0x0231:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x0236:
            com.google.android.gms.internal.ads.abv.m32793b(r1, r2)
        L_0x0239:
            r2 = r3
        L_0x023a:
            if (r2 == 0) goto L_0x02a7
            android.net.Uri r1 = r2.getData()
            if (r1 == 0) goto L_0x02a7
            android.net.Uri r1 = r2.getData()
            java.lang.String r3 = r1.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x02a4
            android.content.Context r4 = r12.getContext()     // Catch:{ Exception -> 0x026c }
            r5 = r12
            com.google.android.gms.internal.ads.ang r5 = (com.google.android.gms.internal.ads.ang) r5     // Catch:{ Exception -> 0x026c }
            com.google.android.gms.internal.ads.beh r5 = r5.mo29200z()     // Catch:{ Exception -> 0x026c }
            r6 = r12
            com.google.android.gms.internal.ads.ani r6 = (com.google.android.gms.internal.ads.ani) r6     // Catch:{ Exception -> 0x026c }
            android.view.View r6 = r6.getView()     // Catch:{ Exception -> 0x026c }
            android.app.Activity r7 = r12.mo28938d()     // Catch:{ Exception -> 0x026c }
            java.lang.String r4 = m37777a(r4, r5, r3, r6, r7)     // Catch:{ Exception -> 0x026c }
            r3 = r4
            goto L_0x027b
        L_0x026c:
            r4 = move-exception
            java.lang.String r5 = "Error occurred while adding signals."
            com.google.android.gms.internal.ads.abv.m32793b(r5, r4)
            com.google.android.gms.internal.ads.abh r5 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            java.lang.String r6 = "OpenGmsgHandler.onGmsg"
            r5.mo28588a(r4, r6)
        L_0x027b:
            android.net.Uri r4 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0281 }
            r1 = r4
            goto L_0x02a4
        L_0x0281:
            r4 = move-exception
            java.lang.String r5 = "Error parsing the uri: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x0293
            java.lang.String r3 = r5.concat(r3)
            goto L_0x0298
        L_0x0293:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
        L_0x0298:
            com.google.android.gms.internal.ads.abv.m32793b(r3, r4)
            com.google.android.gms.internal.ads.abh r3 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            java.lang.String r5 = "OpenGmsgHandler.onGmsg"
            r3.mo28588a(r4, r5)
        L_0x02a4:
            r2.setData(r1)
        L_0x02a7:
            if (r2 == 0) goto L_0x02b4
            com.google.android.gms.internal.ads.and r12 = (com.google.android.gms.internal.ads.and) r12
            com.google.android.gms.ads.internal.overlay.zzc r13 = new com.google.android.gms.ads.internal.overlay.zzc
            r13.<init>(r2)
            r12.mo29241a(r13)
            return
        L_0x02b4:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x02d4
            android.content.Context r1 = r12.getContext()
            r2 = r12
            com.google.android.gms.internal.ads.ang r2 = (com.google.android.gms.internal.ads.ang) r2
            com.google.android.gms.internal.ads.beh r2 = r2.mo29200z()
            r3 = r12
            com.google.android.gms.internal.ads.ani r3 = (com.google.android.gms.internal.ads.ani) r3
            android.view.View r3 = r3.getView()
            android.app.Activity r4 = r12.mo28938d()
            java.lang.String r0 = m37777a(r1, r2, r0, r3, r4)
        L_0x02d4:
            r3 = r0
            com.google.android.gms.internal.ads.and r12 = (com.google.android.gms.internal.ads.and) r12
            com.google.android.gms.ads.internal.overlay.zzc r0 = new com.google.android.gms.ads.internal.overlay.zzc
            java.lang.String r1 = "i"
            java.lang.Object r1 = r13.get(r1)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = "m"
            java.lang.Object r1 = r13.get(r1)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "p"
            java.lang.Object r1 = r13.get(r1)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "c"
            java.lang.Object r1 = r13.get(r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "f"
            java.lang.Object r1 = r13.get(r1)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r1 = "e"
            java.lang.Object r13 = r13.get(r1)
            r8 = r13
            java.lang.String r8 = (java.lang.String) r8
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.mo29241a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15962id.mo27606a(java.lang.Object, java.util.Map):void");
    }
}
