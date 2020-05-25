package com.bytedance.sdk.account.p859d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9379e;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.sdk.account.p844a.C12988a;
import com.bytedance.sdk.account.p844a.C13006c;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.C13022g;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p845a.C12995g;
import com.bytedance.sdk.account.p844a.p846b.C13002c;
import com.bytedance.sdk.account.p844a.p847c.C13007a;
import com.bytedance.sdk.account.p844a.p848d.C13014c;
import com.bytedance.sdk.account.p844a.p848d.C13016e;
import com.bytedance.sdk.account.p861f.p862a.C13110i;
import com.bytedance.sdk.account.p871j.C13180a;
import com.bytedance.sdk.account.p871j.p872a.C13183a;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18495c;
import com.p683ss.android.account.p1102b.C18494a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.d.e */
class C13082e implements C9382a, C13006c {

    /* renamed from: C */
    private static final C18494a[] f34156C = {f34159a, f34160b, f34161c, f34162d, f34163e, f34164f, f34165g, f34166h, f34167i, f34168j, f34169k, f34170l, f34171m, f34172n, f34173o, f34174p, f34175q, f34176r, f34177s, f34178t, f34179u, f34180v, f34181w, f34182x, f34183y, f34184z};

    /* renamed from: R */
    private static volatile C13006c f34157R;

    /* renamed from: S */
    private static List<C13085a> f34158S = new ArrayList();

    /* renamed from: a */
    static final C18494a f34159a = new C18494a("sina_weibo", R.string.dmx);

    /* renamed from: b */
    static final C18494a f34160b = new C18494a("qq_weibo", R.string.f133601dmt);

    /* renamed from: c */
    static final C18494a f34161c = new C18494a("renren_sns", R.string.dmr);

    /* renamed from: d */
    static final C18494a f34162d = new C18494a("kaixin_sns", R.string.dmm);

    /* renamed from: e */
    static final C18494a f34163e = new C18494a("qzone_sns", R.string.dmq);

    /* renamed from: f */
    static final C18494a f34164f = new C18494a("mobile", R.string.dmp);

    /* renamed from: g */
    static final C18494a f34165g = new C18494a("weixin", R.string.dmy);

    /* renamed from: h */
    static final C18494a f34166h = new C18494a("flyme", R.string.dmh);

    /* renamed from: i */
    static final C18494a f34167i = new C18494a("huawei", R.string.dmj);

    /* renamed from: j */
    static final C18494a f34168j = new C18494a("telecom", R.string.dms);

    /* renamed from: k */
    static final C18494a f34169k = new C18494a("xiaomi", R.string.dmz);

    /* renamed from: l */
    static final C18494a f34170l = new C18494a("email", R.string.dme);

    /* renamed from: m */
    static final C18494a f34171m = new C18494a("live_stream", R.string.dmk);

    /* renamed from: n */
    static final C18494a f34172n = new C18494a("aweme", R.string.dmd);

    /* renamed from: o */
    static final C18494a f34173o = new C18494a("aweme_v2", R.string.dmd);

    /* renamed from: p */
    static final C18494a f34174p = new C18494a("google", R.string.dmi);

    /* renamed from: q */
    static final C18494a f34175q = new C18494a("facebook", R.string.dmf);

    /* renamed from: r */
    static final C18494a f34176r = new C18494a("twitter", R.string.dmv);

    /* renamed from: s */
    static final C18494a f34177s = new C18494a("instagram", R.string.dml);

    /* renamed from: t */
    static final C18494a f34178t = new C18494a("line", R.string.dmo);

    /* renamed from: u */
    static final C18494a f34179u = new C18494a("kakaotalk", R.string.dmn);

    /* renamed from: v */
    static final C18494a f34180v = new C18494a("vk", R.string.dmw);

    /* renamed from: w */
    static final C18494a f34181w = new C18494a("toutiao", R.string.dmu);

    /* renamed from: x */
    static final C18494a f34182x = new C18494a("toutiao_v2", R.string.dmu);

    /* renamed from: y */
    static final C18494a f34183y = new C18494a("flipchat", R.string.dmg);

    /* renamed from: z */
    static final C18494a f34184z = new C18494a("gogokid", R.string.hkn);

    /* renamed from: A */
    final Context f34185A;

    /* renamed from: B */
    public final C9381g f34186B = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: D */
    private boolean f34187D;

    /* renamed from: E */
    private long f34188E;

    /* renamed from: F */
    private String f34189F = "";

    /* renamed from: G */
    private final int f34190G = 2000;

    /* renamed from: H */
    private SharedPreferences f34191H;

    /* renamed from: I */
    private String f34192I;

    /* renamed from: J */
    private String f34193J = "";

    /* renamed from: K */
    private Set<String> f34194K = new HashSet();

    /* renamed from: L */
    private final C18494a[] f34195L;

    /* renamed from: M */
    private boolean f34196M;

    /* renamed from: N */
    private C9379e<Object> f34197N = new C9379e<>();

    /* renamed from: O */
    private C9379e<Object> f34198O = new C9379e<>();

    /* renamed from: P */
    private C13011d f34199P;

    /* renamed from: Q */
    private long f34200Q = 0;

    /* renamed from: com.bytedance.sdk.account.d.e$a */
    interface C13085a {
        /* renamed from: a */
        void mo24765a(C12990b bVar);
    }

    /* renamed from: com.bytedance.sdk.account.d.e$b */
    static class C13086b implements C13085a {
        private C13086b() {
        }

        /* renamed from: a */
        public final void mo24765a(C12990b bVar) {
            if (bVar.f34004g == 10001 && bVar.f33998a) {
                C13006c a = C13081d.m26311a();
                a.mo24598a(false);
                a.mo24594a(new C12988a(1));
            }
        }
    }

    /* renamed from: com.bytedance.sdk.account.d.e$c */
    static class C13087c implements C13085a {
        private C13087c() {
        }

        /* renamed from: a */
        public final void mo24765a(C12990b bVar) {
            if (bVar instanceof C12995g) {
                C13207b bVar2 = ((C12995g) bVar).f34009h;
                if (bVar2 != null && (bVar2 instanceof C13207b)) {
                    C13081d.m26311a().mo24596a(bVar2);
                }
            } else if (bVar instanceof C12993e) {
                T t = ((C12993e) bVar).f34007h;
                if (t instanceof C13110i) {
                    C13081d.m26311a().mo24596a(((C13110i) t).mo24646b());
                }
            } else if (bVar instanceof C13016e) {
                C13207b bVar3 = ((C13016e) bVar).f34037h;
                if (bVar3 != null && (bVar3 instanceof C13207b)) {
                    C13081d.m26311a().mo24596a(bVar3);
                }
            } else {
                if (bVar instanceof C13014c) {
                    C13081d.m26311a().mo24595a((C13014c) bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo24593a() {
        return this.f34192I;
    }

    /* renamed from: a */
    public final void mo24598a(boolean z) {
        this.f34187D = false;
        this.f34188E = 0;
        this.f34193J = "";
        this.f34189F = "";
        AppLog.setUserId(this.f34188E);
        AppLog.setSessionKey(this.f34189F);
        for (C18494a a : this.f34195L) {
            a.mo37743a();
        }
        m26314a(this.f34185A);
    }

    /* renamed from: c */
    private void m26319c() {
        new C12988a(0);
        Iterator it = this.f34197N.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    static C13006c m26317b() {
        if (f34157R == null) {
            synchronized (C13082e.class) {
                if (f34157R == null) {
                    f34157R = new C13082e(C18495c.m44742a().mo38462b());
                }
            }
        }
        return f34157R;
    }

    /* renamed from: a */
    public final void mo24594a(C12988a aVar) {
        Iterator it = this.f34197N.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    public final void mo24599b(String str) {
        this.f34194K.add(str);
        this.f34191H.edit().putStringSet("has_update_sec_uids", this.f34194K).apply();
    }

    /* renamed from: a */
    private void m26314a(Context context) {
        Editor edit = C35807d.m80935a(context, "com.bytedance.sdk.account_setting", 0).edit();
        m26315a(edit);
        edit.remove("session");
        edit.putBoolean("is_login", this.f34187D);
        edit.putLong("user_id", this.f34188E);
        edit.putString("sec_user_id", this.f34193J);
        edit.putString("session_key", this.f34189F);
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    private void m26315a(Editor editor) {
        C18494a[] aVarArr;
        for (C18494a aVar : this.f34195L) {
            if (aVar.f50950d) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mName", aVar.f50948b);
                    jSONObject.put("mNickname", aVar.f50951e);
                    jSONObject.put("mAvatar", aVar.f50952f);
                    jSONObject.put("mPlatformUid", aVar.f50953g);
                    jSONObject.put("mExpire", aVar.f50956j);
                    jSONObject.put("mExpireIn", aVar.f50957k);
                    jSONObject.put("isLogin", aVar.f50950d);
                    jSONObject.put("mModifyTime", aVar.f50955i);
                    StringBuilder sb = new StringBuilder("_platform_");
                    sb.append(aVar.f50948b);
                    editor.putString(sb.toString(), jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        }
        editor.apply();
    }

    /* renamed from: b */
    private boolean m26318b(C13207b bVar) {
        C18494a[] aVarArr;
        boolean z = false;
        for (C18494a aVar : this.f34195L) {
            C18494a aVar2 = (C18494a) bVar.f34475c.get(aVar.f50948b);
            if (aVar2 == null) {
                if (aVar.f50950d) {
                    z = true;
                }
                aVar.mo37743a();
            } else {
                if (!aVar.f50950d) {
                    aVar.f50950d = true;
                    z = true;
                }
                aVar.f50956j = aVar2.f50956j;
                aVar.f50957k = aVar2.f50957k;
                aVar.f50951e = aVar2.f50951e;
                aVar.f50952f = aVar2.f50952f;
                aVar.f50953g = aVar2.f50953g;
                aVar.f50955i = aVar2.f50955i;
            }
        }
        return z;
    }

    public void handleMsg(Message message) {
        if (message.what == 100 && (message.obj instanceof C13095j)) {
            C13095j jVar = (C13095j) message.obj;
            if (jVar.f34219b != null) {
                T t = jVar.f34219b;
                for (C13085a a : f34158S) {
                    a.mo24765a(t);
                }
                if (jVar.f34218a != null) {
                    Object obj = jVar.f34218a.get();
                    if (obj != null && (obj instanceof C12989a)) {
                        C12989a aVar = (C12989a) obj;
                        aVar.dispatchOnResponse(jVar.f34219b);
                        C13007a aVar2 = aVar.mJobController;
                        if (aVar2 != null) {
                            aVar2.mo24600a();
                        }
                    }
                }
            }
        }
        if (message.what == 2000) {
            this.f34186B.removeMessages(2000);
            if (this.f34199P != null) {
                this.f34199P.mo24606a((C13002c) new C13002c() {
                    public final /* synthetic */ void onSuccess(C12990b bVar) {
                        C13014c cVar = (C13014c) bVar;
                        if (C13082e.this.f34186B != null) {
                            long j = 600000;
                            if (C18495c.m44743b() != null) {
                                j = C18495c.m44743b().f52134a;
                            }
                            C13082e.this.f34186B.sendEmptyMessageDelayed(2000, j);
                        }
                    }

                    public final /* synthetic */ void onError(C12990b bVar, int i) {
                        C13014c cVar = (C13014c) bVar;
                        if (C13082e.this.f34186B != null) {
                            long j = 600000;
                            if (C18495c.m44743b() != null) {
                                j = C18495c.m44743b().f52134a;
                            }
                            C13082e.this.f34186B.sendEmptyMessageDelayed(2000, j);
                        }
                    }
                });
            }
        }
    }

    private C13082e(Context context) {
        f34158S.add(new C13087c());
        f34158S.add(new C13086b());
        this.f34185A = context.getApplicationContext();
        this.f34196M = false;
        this.f34199P = C13081d.m26312a(this.f34185A);
        this.f34195L = f34156C;
        if (!this.f34196M) {
            this.f34196M = true;
            this.f34191H = C35807d.m80935a(this.f34185A, "com.bytedance.sdk.account_setting", 0);
            this.f34187D = this.f34191H.getBoolean("is_login", false);
            this.f34188E = this.f34191H.getLong("user_id", 0);
            this.f34193J = this.f34191H.getString("sec_user_id", "");
            this.f34194K = this.f34191H.getStringSet("has_update_sec_uids", new HashSet());
            this.f34189F = this.f34191H.getString("session_key", "");
            this.f34192I = this.f34191H.getString("multi_sids", "");
            if (this.f34187D && this.f34188E <= 0) {
                this.f34187D = false;
                this.f34188E = 0;
            } else if (!this.f34187D && this.f34188E > 0) {
                this.f34188E = 0;
            }
            m26316a(this.f34191H);
            if (this.f34188E > 0) {
                AppLog.setUserId(this.f34188E);
                AppLog.setSessionKey(this.f34189F);
            }
        }
    }

    /* renamed from: a */
    private void m26316a(SharedPreferences sharedPreferences) {
        for (int i = 0; i < this.f34195L.length; i++) {
            this.f34195L[i].f50950d = false;
            C18494a aVar = this.f34195L[i];
            try {
                if (!TextUtils.isEmpty(aVar.f50948b)) {
                    StringBuilder sb = new StringBuilder("_platform_");
                    sb.append(aVar.f50948b);
                    String string = sharedPreferences.getString(sb.toString(), null);
                    if (string != null) {
                        JSONObject jSONObject = new JSONObject(string);
                        if (jSONObject.optString("mName", "").equals(aVar.f50948b)) {
                            if (jSONObject.has("mNickname")) {
                                aVar.f50951e = jSONObject.optString("mNickname", null);
                            }
                            if (jSONObject.has("mAvatar")) {
                                aVar.f50952f = jSONObject.optString("mAvatar", null);
                            }
                            if (jSONObject.has("mPlatformUid")) {
                                aVar.f50953g = jSONObject.optString("mPlatformUid", null);
                            }
                            if (jSONObject.has("mExpire")) {
                                aVar.f50956j = jSONObject.optLong("mExpire", aVar.f50956j);
                            }
                            if (jSONObject.has("mExpireIn")) {
                                aVar.f50957k = jSONObject.optLong("mExpireIn", aVar.f50957k);
                            }
                            if (jSONObject.has("isLogin")) {
                                aVar.f50950d = jSONObject.optBoolean("isLogin", false);
                            }
                            if (jSONObject.has("mModifyTime")) {
                                aVar.f50955i = jSONObject.optLong("mModifyTime");
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo24595a(C13014c cVar) {
        if (cVar != null) {
            C13022g gVar = new C13022g(cVar.f33998a);
            gVar.f34043f = cVar.f34003f;
            if (cVar.f33998a) {
                gVar.f34042e = cVar.f34027i;
            } else {
                gVar.f34039b = cVar.f34000c;
                gVar.f34040c = cVar.f34001d;
                gVar.f34041d = cVar.f34026h;
            }
            synchronized (this.f34198O) {
                Iterator it = this.f34198O.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24596a(C13207b bVar) {
        if (bVar != null) {
            this.f34200Q = System.currentTimeMillis();
            long j = bVar.f34473a;
            boolean z = false;
            if (j > 0) {
                if (!this.f34187D) {
                    this.f34187D = true;
                    try {
                        CookieSyncManager.getInstance().sync();
                    } catch (Throwable unused) {
                    }
                    z = true;
                }
                "1".equals(bVar.f34482j.optString("new_platform"));
                if (this.f34188E != j) {
                    this.f34188E = j;
                    AppLog.setUserId(this.f34188E);
                    z = true;
                }
                String str = bVar.f34474b;
                if (!this.f34193J.equals(str)) {
                    this.f34193J = str;
                    StringBuilder sb = new StringBuilder();
                    sb.append(bVar.f34473a);
                    C13183a.f34414d.execute(new Runnable() {
                        public final void run() {
                            try {
                                C13183a.f34415e.post(new Runnable(C13183a.this.mo24795a()) {

                                    /* renamed from: a */
                                    final /* synthetic */ Object f34417a;

                                    public final void run() {
                                    }

                                    {
                                        this.f34417a = r2;
                                    }
                                });
                            } catch (Exception unused) {
                            }
                        }
                    });
                    z = true;
                }
                if (!C9431p.m18665a(this.f34189F, bVar.f34478f)) {
                    this.f34189F = bVar.f34478f;
                    AppLog.setSessionKey(this.f34189F);
                    z = true;
                }
                if (m26318b(bVar)) {
                    z = true;
                }
                this.f34187D = true;
            } else if (this.f34187D) {
                this.f34187D = false;
                this.f34188E = 0;
                this.f34189F = "";
                z = true;
            }
            if (z) {
                m26314a(this.f34185A);
                m26319c();
                if (C13180a.m26563a(bVar) != null) {
                    new Object() {
                    };
                    C18495c.m44742a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24597a(String str) {
        this.f34192I = str;
        if (this.f34191H != null && this.f34191H.edit() != null) {
            this.f34191H.edit().putString("multi_sids", str).apply();
        }
    }
}
