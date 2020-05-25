package com.bytedance.android.livesdk.p279af;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.live.core.p230g.C3915v;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p416t.C8302f;
import com.bytedance.android.livesdk.p416t.C8302f.C8305b;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.monitor.webview.C8902j;
import com.bytedance.common.p520c.C9351b;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ttnet.p883a.C13258a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.af.b */
public final class C4581b {

    /* renamed from: a */
    private static String f12541a;

    /* renamed from: b */
    private static boolean f12542b;

    /* renamed from: a */
    public static void m11007a(String str, String str2, String str3, String str4) {
        String str5 = str.equals("android.permission.ACCESS_FINE_LOCATION") ? "system_position" : str.equals("android.permission.READ_PHONE_STATE") ? "call" : (str.equals("android.permission.WRITE_EXTERNAL_STORAGE") || str.equals("android.permission.READ_EXTERNAL_STORAGE")) ? "save" : null;
        if (!TextUtils.isEmpty(str5)) {
        }
    }

    /* renamed from: a */
    public static void m11008a(HashMap<String, String> hashMap, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys != null && keys.hasNext()) {
                try {
                    String str2 = (String) keys.next();
                    String optString = jSONObject.optString(str2);
                    if (!C9431p.m18664a(str2)) {
                        if (!C9431p.m18664a(optString)) {
                            hashMap.put(str2, optString);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!C9431p.m18664a((String) null)) {
            hashMap.put("User-Agent", null);
        }
    }

    /* renamed from: a */
    public static void m11006a(String str, WebView webView, Map<String, String> map) {
        long j;
        long j2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j3;
        Map<String, String> map2 = map;
        if (webView != null && !C9431p.m18664a(str)) {
            boolean a = m11009a(str);
            Context context = webView.getContext();
            String g = (!a || context == null) ? str : C13258a.m26660a(context).mo24855g(str);
            Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
            if (currentRoom == null) {
                j = 0;
            } else {
                j = currentRoom.getId();
            }
            if (currentRoom == null) {
                j2 = 0;
            } else {
                j2 = currentRoom.getOwnerUserId();
            }
            String str8 = "";
            if (currentRoom == null) {
                str8 = String.valueOf(j2);
            } else if (currentRoom.getOwner() != null) {
                str8 = currentRoom.getOwner().getSecUid();
            }
            long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
            String secUid = TTLiveSDKContext.getHostService().mo10315h().mo14521a().getSecUid();
            if (currentRoom == null) {
                str2 = "";
            } else {
                str2 = currentRoom.getLog_pb();
            }
            if (currentRoom == null) {
                str3 = "";
            } else {
                str3 = currentRoom.getRequestId();
            }
            C8038g a2 = C8049c.m15979a().mo14201a(C8059j.class);
            String str9 = "";
            String str10 = "";
            String str11 = "";
            String str12 = "";
            String str13 = "";
            if (a2 instanceof C8042k) {
                C8042k kVar = (C8042k) a2;
                if (kVar.mo14192a().containsKey("enter_from")) {
                    kVar.mo14192a().get("enter_from");
                }
                if (kVar.mo14192a().containsKey("source")) {
                    kVar.mo14192a().get("source");
                }
                if (kVar.mo14192a().containsKey("action_type")) {
                    str10 = (String) kVar.mo14192a().get("action_type");
                }
                if (kVar.mo14192a().containsKey("video_id")) {
                    str11 = (String) kVar.mo14192a().get("video_id");
                }
                if (kVar.mo14192a().containsKey("gd_label")) {
                    str12 = (String) kVar.mo14192a().get("gd_label");
                }
                Map a3 = kVar.mo14192a();
                str6 = (String) a3.get("enter_from_merge");
                str9 = (String) a3.get("enter_method");
                str7 = str10;
                str5 = str11;
                str4 = str12;
            } else {
                str7 = str10;
                str5 = str11;
                str4 = str12;
                str6 = str13;
            }
            Uri parse = Uri.parse(g);
            boolean z = false;
            if (parse.getHost() != null) {
                Iterator it = TTLiveSDKContext.getHostService().mo10316i().mo15569a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (parse.getHost().endsWith((String) it.next())) {
                        z = true;
                        break;
                    } else {
                        WebView webView2 = webView;
                        Map<String, String> map3 = map;
                    }
                }
            }
            Set queryParameterNames = parse.getQueryParameterNames();
            if (z && queryParameterNames != null) {
                Builder buildUpon = Uri.parse(g).buildUpon();
                if (!queryParameterNames.contains("room_id")) {
                    j3 = 0;
                    if (j != 0) {
                        buildUpon.appendQueryParameter("room_id", String.valueOf(j));
                    }
                } else {
                    j3 = 0;
                }
                if (!queryParameterNames.contains("anchor_id") && j2 != j3) {
                    buildUpon.appendQueryParameter("anchor_id", String.valueOf(j2));
                }
                if (!queryParameterNames.contains("sec_anchor_id")) {
                    buildUpon.appendQueryParameter("sec_anchor_id", str8);
                }
                if (!queryParameterNames.contains("user_id")) {
                    buildUpon.appendQueryParameter("user_id", String.valueOf(b));
                }
                if (!queryParameterNames.contains("sec_user_id")) {
                    buildUpon.appendQueryParameter("sec_user_id", secUid);
                }
                if (!queryParameterNames.contains("enter_from_merge")) {
                    buildUpon.appendQueryParameter("enter_from_merge", str6);
                }
                if (!queryParameterNames.contains("enter_method")) {
                    buildUpon.appendQueryParameter("enter_method", str9);
                }
                if (!queryParameterNames.contains("action_type")) {
                    buildUpon.appendQueryParameter("action_type", str7);
                }
                if (!queryParameterNames.contains("log_pb") && !TextUtils.isEmpty(str2)) {
                    buildUpon.appendQueryParameter("log_pb", str2);
                }
                if (!queryParameterNames.contains("request_id") && !TextUtils.isEmpty(str3)) {
                    buildUpon.appendQueryParameter("request_id", str3);
                }
                if (!queryParameterNames.contains("video_id") && !TextUtils.isEmpty(str5)) {
                    buildUpon.appendQueryParameter("video_id", str5);
                }
                if (!queryParameterNames.contains("action_type") && !TextUtils.isEmpty(str7)) {
                    buildUpon.appendQueryParameter("action_type", str7);
                }
                if (!queryParameterNames.contains("gd_label") && !TextUtils.isEmpty(str4)) {
                    buildUpon.appendQueryParameter("gd_label", str4);
                }
                g = buildUpon.build().toString();
            }
            WebView webView3 = webView;
            C8902j.m17571b().mo15897a(webView3, g);
            Map<String, String> map4 = map;
            if (map4 == null || map.isEmpty()) {
                C3915v.m9893a(webView3, g);
            } else {
                C4593g.m11028a(webView3, g, map4);
            }
        }
    }

    /* renamed from: a */
    public static boolean m11009a(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m11010b(String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = C3922z.m9915e().getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r8 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r8 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri m11000a(android.content.Context r8, java.lang.String r9) {
        /*
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String r5 = "_data= ?"
            r8 = 1
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            r0 = 0
            r6[r0] = r9     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String r8 = "_id"
            r4[r0] = r8     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r9 == 0) goto L_0x003b
            java.lang.String r9 = r8.getString(r0)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            long r2 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            android.net.Uri r9 = android.content.ContentUris.withAppendedId(r0, r2)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r8 == 0) goto L_0x003a
            r8.close()
        L_0x003a:
            return r9
        L_0x003b:
            if (r8 == 0) goto L_0x004e
            goto L_0x004b
        L_0x003e:
            r9 = move-exception
            r1 = r8
            goto L_0x0042
        L_0x0041:
            r9 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()
        L_0x0047:
            throw r9
        L_0x0048:
            r8 = r1
        L_0x0049:
            if (r8 == 0) goto L_0x004e
        L_0x004b:
            r8.close()
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p279af.C4581b.m11000a(android.content.Context, java.lang.String):android.net.Uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r2 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        if (r2 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b0, code lost:
        if (r11 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c2, code lost:
        if (r11 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A[SYNTHETIC, Splitter:B:27:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bd A[SYNTHETIC, Splitter:B:62:0x00bd] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11001a(android.content.Context r11, android.net.Uri r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r12.getScheme()
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r1)
            if (r2 != 0) goto L_0x00c7
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0018
            goto L_0x00c7
        L_0x0018:
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0025
            java.lang.String r11 = r12.toString()
            return r11
        L_0x0025:
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00c6
            r1 = 1
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r2 = "_data"
            r9 = 0
            r8[r9] = r2
            java.lang.String r10 = ""
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r12
            r4 = r8
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x0062, all -> 0x0057 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.getString(r9)     // Catch:{ Exception -> 0x0062, all -> 0x0057 }
            r10 = r0
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ Exception -> 0x0062, all -> 0x0057 }
        L_0x0054:
            if (r2 == 0) goto L_0x0067
            goto L_0x0064
        L_0x0057:
            r11 = move-exception
            goto L_0x005b
        L_0x0059:
            r11 = move-exception
            r2 = r0
        L_0x005b:
            if (r2 == 0) goto L_0x0060
            r2.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r11
        L_0x0061:
            r2 = r0
        L_0x0062:
            if (r2 == 0) goto L_0x0067
        L_0x0064:
            r2.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r0 = r2
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r10)
            if (r2 == 0) goto L_0x00c5
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            java.lang.String r5 = "_id= ?"
            java.lang.String r11 = r12.getLastPathSegment()     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r3 = 19
            if (r12 < r3) goto L_0x0094
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r11)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            if (r12 != 0) goto L_0x0094
            java.lang.String r12 = ":"
            boolean r12 = r11.contains(r12)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            if (r12 == 0) goto L_0x0094
            java.lang.String r12 = ":"
            java.lang.String[] r11 = r11.split(r12)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r11 = r11[r1]     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
        L_0x0094:
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r6[r9] = r11     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r7 = 0
            r4 = r8
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            boolean r12 = r11.moveToFirst()     // Catch:{ Exception -> 0x00c2, all -> 0x00b6 }
            if (r12 == 0) goto L_0x00ab
            java.lang.String r12 = r11.getString(r9)     // Catch:{ Exception -> 0x00c2, all -> 0x00b6 }
            r10 = r12
        L_0x00ab:
            if (r11 == 0) goto L_0x00b0
            r11.close()     // Catch:{ Exception -> 0x00c2, all -> 0x00b6 }
        L_0x00b0:
            if (r11 == 0) goto L_0x00c5
        L_0x00b2:
            r11.close()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c5
        L_0x00b6:
            r12 = move-exception
            r0 = r11
            r11 = r12
            goto L_0x00bb
        L_0x00ba:
            r11 = move-exception
        L_0x00bb:
            if (r0 == 0) goto L_0x00c0
            r0.close()     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            throw r11
        L_0x00c1:
            r11 = r0
        L_0x00c2:
            if (r11 == 0) goto L_0x00c5
            goto L_0x00b2
        L_0x00c5:
            return r10
        L_0x00c6:
            return r0
        L_0x00c7:
            java.lang.String r11 = r12.getPath()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p279af.C4581b.m11001a(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* renamed from: a */
    public static String m11002a(Context context, WebView webView) {
        if (webView != null) {
            String userAgentString = webView.getSettings().getUserAgentString();
            if (!C9431p.m18664a(userAgentString)) {
                f12541a = userAgentString;
                return userAgentString;
            }
        }
        if (!C9431p.m18664a(f12541a)) {
            return f12541a;
        }
        String a = C9351b.m18530a(context);
        f12541a = a;
        if (!C9431p.m18664a(a)) {
            return f12541a;
        }
        if (!f12542b && webView == null && (context instanceof Activity)) {
            f12542b = true;
            try {
                WebView webView2 = new WebView(context);
                f12541a = webView2.getSettings().getUserAgentString();
                webView2.destroy();
            } catch (Throwable unused) {
            }
        }
        return f12541a;
    }

    /* renamed from: a */
    public static void m11003a(final Activity activity, final Fragment fragment, int i) {
        C8302f.m16453a(activity).mo14483a(C4589c.f12554a).mo14485b(C4590d.f12555a).mo14484a(new C8288d(40003) {
            /* renamed from: b */
            public final void mo9069b(String... strArr) {
                C4581b.m11007a("android.permission.WRITE_EXTERNAL_STORAGE", "click", (String) null, "cancel");
            }

            /* renamed from: a */
            public final void mo9068a(String... strArr) {
                if (!"mounted".equals(Environment.getExternalStorageState())) {
                    C9432q.m18673a((Context) activity, (int) R.drawable.bpe, (int) R.string.e7e);
                    return;
                }
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                try {
                    if (fragment != null) {
                        fragment.startActivityForResult(intent, 40003);
                    } else {
                        activity.startActivityForResult(intent, 40003);
                    }
                } catch (Exception unused) {
                    C9432q.m18673a((Context) activity, (int) R.drawable.bpe, (int) R.string.e7d);
                }
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: a */
    public static void m11005a(String str, WebView webView, String str2, boolean z) {
        if (webView != null && !C9431p.m18664a(str)) {
            boolean a = m11009a(str);
            if (a && C9431p.m18664a(str2)) {
                str2 = "https://nativeapp.toutiao.com";
            }
            if (!a) {
                str2 = null;
            }
            HashMap hashMap = new HashMap();
            if (!C9431p.m18664a(str2)) {
                hashMap.put("Referer", str2);
            }
            m11006a(str, webView, (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m11004a(Activity activity, Fragment fragment, int i, String str, String str2) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C9432q.m18673a((Context) activity, (int) R.drawable.bpe, (int) R.string.e7e);
            return;
        }
        C8305b b = C8302f.m16453a(activity).mo14483a(C4591e.f12556a).mo14485b(C4592f.f12557a);
        final String str3 = str;
        final String str4 = str2;
        final Activity activity2 = activity;
        final Fragment fragment2 = fragment;
        C45832 r0 = new C8288d(40004) {
            /* renamed from: b */
            public final void mo9069b(String... strArr) {
                C4581b.m11007a("android.permission.CAMERA", "click", (String) null, "cancel");
            }

            /* renamed from: a */
            public final void mo9068a(String... strArr) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File file = new File(str3);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, str4);
                Activity activity = activity2;
                StringBuilder sb = new StringBuilder();
                sb.append(activity2.getPackageName());
                sb.append(TTLiveFileProvider.NAME);
                intent.putExtra("output", TTLiveFileProvider.getUri(activity, sb.toString(), file2));
                try {
                    if (fragment2 != null) {
                        fragment2.startActivityForResult(intent, 40004);
                    } else {
                        activity2.startActivityForResult(intent, 40004);
                    }
                } catch (Exception unused) {
                    C9432q.m18673a((Context) activity2, (int) R.drawable.bpe, (int) R.string.e7c);
                }
            }
        };
        b.mo14484a(r0, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
