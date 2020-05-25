package com.p683ss.android.ugc.aweme.utils;

import android.app.Dialog;
import android.net.Uri;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.base.C23569o;
import java.net.URLDecoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import leakcanary.internal.LeakCanaryFileProvider;
import okhttp3.C53673t;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.utils.ew */
public class C47865ew {

    /* renamed from: a */
    public static final String f120427a = "RELEASE";

    /* renamed from: b */
    public static final String[] f120428b = {"uid", "user_id", "author_id", "target_user_ud", "to_user_id", "push_user_id", "share_user_id", "star_uid"};

    /* renamed from: g */
    private static final String[] f120429g = {"com.tellh.me.ele.", "com.ixigua.", "com.ss.", "com.bytedance."};

    /* renamed from: h */
    private static final String[] f120430h = {"com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "com.ss.android.ugc.aweme.live.LiveDummyActivity"};

    /* renamed from: i */
    private static final String[] f120431i = {"com.bytedance.ies.web.jsbridge", "com.ss.android.ugc.aweme.bullet", "com.ss.android.ugc.aweme.crossplatform", "com.ss.android.ugc.aweme.web.jsbridge", "com.ss.android.ugc.aweme.fe.method", "com.bytedance.android.live.browser.jsbridge"};

    /* renamed from: j */
    private static final String[] f120432j = {"/api/ad/splash"};

    /* renamed from: k */
    private static volatile C47865ew f120433k;

    /* renamed from: l */
    private static boolean f120434l;

    /* renamed from: m */
    private static boolean f120435m;

    /* renamed from: n */
    private static boolean f120436n;

    /* renamed from: c */
    public String f120437c;

    /* renamed from: d */
    public boolean f120438d;

    /* renamed from: e */
    public boolean f120439e;

    /* renamed from: f */
    public Keva f120440f;

    /* renamed from: o */
    private final ConcurrentHashMap<String, String> f120441o = new ConcurrentHashMap<>();

    /* renamed from: p */
    private final LinkedList<String> f120442p;

    /* renamed from: q */
    private Set<String> f120443q;

    /* renamed from: com.ss.android.ugc.aweme.utils.ew$a */
    public interface C47867a {
        /* renamed from: a */
        void mo95084a();

        /* renamed from: b */
        void mo95085b();
    }

    /* renamed from: a */
    public final void mo95081a(C53673t tVar) {
        if (tVar != null && !m103542c()) {
            try {
                m103538a(tVar.mo111619f(), false);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo95080a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null && jSONObject.length() > 0) {
            try {
                String[] strArr = f120428b;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    String optString = jSONObject.optString(str2);
                    StringBuilder sb = new StringBuilder("sec_");
                    sb.append(str2);
                    String optString2 = jSONObject.optString(sb.toString());
                    if (m103543d(optString) || !m103543d(optString2)) {
                        i++;
                    } else {
                        m103538a(str, m103542c());
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static C47865ew m103536a() {
        if (f120433k == null) {
            synchronized (C47865ew.class) {
                if (f120433k == null) {
                    f120433k = new C47865ew();
                }
            }
        }
        return f120433k;
    }

    /* renamed from: c */
    private static boolean m103542c() {
        if (f120434l || f120435m || f120436n) {
            return true;
        }
        return false;
    }

    private C47865ew() {
        boolean z;
        boolean z2;
        LinkedList<String> linkedList;
        String p = C11010c.m22295p();
        if (TextUtils.isEmpty(p)) {
            z = false;
        } else {
            z = p.equalsIgnoreCase("local_test");
        }
        f120435m = z;
        String p2 = C11010c.m22295p();
        if (TextUtils.isEmpty(p2)) {
            z2 = false;
        } else {
            z2 = p2.equalsIgnoreCase("lark_inhouse");
        }
        f120436n = z2;
        f120434l = false;
        this.f120440f = Keva.getRepo("aweme_network");
        this.f120438d = this.f120440f.getBoolean("strict_mode", f120434l);
        this.f120439e = this.f120440f.getBoolean("request_with_compile_mode", f120434l);
        this.f120437c = this.f120440f.getString("lastInputEmailPrefix", "");
        if (m103542c()) {
            linkedList = new LinkedList<>();
        } else {
            linkedList = null;
        }
        this.f120442p = linkedList;
    }

    /* renamed from: b */
    private String m103541b() {
        if (this.f120442p == null || this.f120442p.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f120442p.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(sb)) {
                sb.append("\n");
            }
            sb.append(str);
        }
        String sb2 = sb.toString();
        try {
            sb2 = URLDecoder.decode(sb2, "UTF-8");
        } catch (Exception unused) {
        }
        return sb2;
    }

    /* renamed from: b */
    public final boolean mo95082b(String str) {
        if (!this.f120438d || str.contains("passport")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m103543d(String str) {
        if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m103544e(String str) {
        for (String startsWith : f120432j) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final String mo95083c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals("0", str) || TextUtils.equals("-1", str)) {
            return null;
        }
        return (String) this.f120441o.get(str);
    }

    /* renamed from: a */
    public final void mo95075a(Uri uri) {
        if (uri != null) {
            String str = "";
            try {
                str = URLDecoder.decode(uri.toString(), "UTF-8");
            } catch (Exception unused) {
            } finally {
                mo95076a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo95076a(String str) {
        if (this.f120442p != null && !TextUtils.isEmpty(str)) {
            if (this.f120442p.size() == 6) {
                this.f120442p.pollLast();
            }
            this.f120442p.offerFirst(str);
        }
    }

    /* renamed from: a */
    private void m103538a(String str, boolean z) throws Exception {
        m103539a(str, z, 0);
    }

    /* renamed from: a */
    private void m103540a(JSONObject jSONObject, long j) {
        C0013i.m12a(j).mo20a((C0011g<TResult, TContinuationResult>) new C47868ex<TResult,TContinuationResult>(this, jSONObject), C0013i.f25b);
    }

    /* renamed from: a */
    public static void m103537a(Dialog dialog, EditText editText) {
        InputMethodManager inputMethodManager = (InputMethodManager) C11010c.m22280a().getSystemService("input_method");
        if (!(inputMethodManager == null || editText == null)) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo95077a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals("0", str) && !TextUtils.equals("-1", str) && !TextUtils.isEmpty(str2)) {
            this.f120441o.put(str, str2);
        }
    }

    /* renamed from: a */
    private void m103539a(String str, boolean z, long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(LeakCanaryFileProvider.f132050j, str);
        jSONObject.put("pages", C47928j.m103702a());
        if (z) {
            String a = C47928j.m103703a(f120429g);
            jSONObject.put("backtrace", a);
            if ((f120434l || this.f120438d) && !m103544e(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(a);
                String a2 = C47803da.m103437a(sb.toString());
                if (this.f120443q == null) {
                    this.f120443q = new HashSet();
                }
                if (!this.f120443q.contains(a2)) {
                    this.f120443q.add(a2);
                    m103540a(jSONObject, j);
                }
            }
        }
        C23569o.m57779a("log_miss_sec_uid", jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x004a A[EDGE_INSN: B:40:0x004a->B:29:0x004a ?: BREAK  
    EDGE_INSN: B:40:0x004a->B:29:0x004a ?: BREAK  
    EDGE_INSN: B:40:0x004a->B:29:0x004a ?: BREAK  
    EDGE_INSN: B:40:0x004a->B:29:0x004a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x004a A[EDGE_INSN: B:40:0x004a->B:29:0x004a ?: BREAK  
    EDGE_INSN: B:40:0x004a->B:29:0x004a ?: BREAK  
    EDGE_INSN: B:40:0x004a->B:29:0x004a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x004a A[EDGE_INSN: B:40:0x004a->B:29:0x004a ?: BREAK  
    EDGE_INSN: B:40:0x004a->B:29:0x004a ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95079a(java.lang.String r13, java.lang.String r14, org.json.JSONObject r15) {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.utils.ev r0 = com.p683ss.android.ugc.aweme.utils.C47864ev.f120425a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "path"
            java.lang.String r4 = r15.getString(r4)     // Catch:{ Exception -> 0x0022 }
            java.lang.String r0 = "pages"
            java.lang.String r0 = r15.getString(r0)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r1 = "backtrace"
            java.lang.String r15 = r15.getString(r1)     // Catch:{ Exception -> 0x0024 }
            r9 = r15
            r8 = r0
            goto L_0x0026
        L_0x0022:
            r4 = r0
        L_0x0023:
            r0 = r1
        L_0x0024:
            r8 = r0
            r9 = r2
        L_0x0026:
            r7 = r4
            java.util.LinkedList<java.lang.String> r15 = r12.f120442p
            if (r15 == 0) goto L_0x0065
            java.util.LinkedList<java.lang.String> r15 = r12.f120442p
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x0065
            java.lang.String[] r15 = f120430h
            int r0 = r15.length
            r1 = 0
            r2 = 0
        L_0x0038:
            if (r2 >= r0) goto L_0x004a
            r4 = r15[r2]
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x0047
            java.lang.String r3 = r12.m103541b()
            goto L_0x004a
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0038
        L_0x004a:
            boolean r15 = android.text.TextUtils.isEmpty(r3)
            if (r15 == 0) goto L_0x0065
            java.lang.String[] r15 = f120431i
            int r0 = r15.length
        L_0x0053:
            if (r1 >= r0) goto L_0x0065
            r2 = r15[r1]
            boolean r2 = r9.contains(r2)
            if (r2 == 0) goto L_0x0062
            java.lang.String r3 = r12.m103541b()
            goto L_0x0065
        L_0x0062:
            int r1 = r1 + 1
            goto L_0x0053
        L_0x0065:
            r11 = r3
            com.ss.android.ugc.aweme.utils.ev r5 = com.p683ss.android.ugc.aweme.utils.C47864ev.f120425a
            r6 = r13
            r10 = r14
            r5.reportToChat(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47865ew.mo95079a(java.lang.String, java.lang.String, org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final void mo95078a(String str, String str2, String str3, long j) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            try {
                m103539a(str, m103542c(), j);
            } catch (Exception unused) {
            }
        }
    }
}
