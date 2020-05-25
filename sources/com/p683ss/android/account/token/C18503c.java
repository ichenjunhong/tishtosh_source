package com.p683ss.android.account.token;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.account.token.AuthTokenMultiProcessSharedProvider.C18498a;
import com.p683ss.android.account.token.AuthTokenMultiProcessSharedProvider.C18499b;
import com.p683ss.android.account.token.C18501b.C18502a;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.account.token.c */
public final class C18503c implements C9382a {

    /* renamed from: a */
    static C18503c f50990a;

    /* renamed from: f */
    static volatile boolean f50991f;

    /* renamed from: b */
    public volatile boolean f50992b;

    /* renamed from: c */
    public C18501b f50993c;

    /* renamed from: d */
    public Handler f50994d;

    /* renamed from: e */
    public volatile int f50995e;

    /* renamed from: g */
    public volatile boolean f50996g;

    /* renamed from: h */
    private volatile boolean f50997h;

    /* renamed from: i */
    private volatile boolean f50998i;

    /* renamed from: j */
    private volatile String f50999j;

    /* renamed from: k */
    private IGetTokenApi f51000k;

    /* renamed from: l */
    private PrivateKey f51001l;

    /* renamed from: m */
    private Context f51002m;

    /* renamed from: n */
    private final int f51003n = 1000;

    /* renamed from: o */
    private volatile int f51004o;

    /* renamed from: p */
    private final long f51005p = 10000;

    /* renamed from: q */
    private volatile boolean f51006q = true;

    /* renamed from: r */
    private volatile boolean f51007r;

    /* renamed from: s */
    private volatile boolean f51008s;

    /* renamed from: t */
    private C18499b f51009t;

    /* renamed from: a */
    protected static C18503c m44773a() {
        return f50990a;
    }

    /* renamed from: d */
    private static String m44779d() {
        return "1";
    }

    /* renamed from: c */
    public final C18509g mo37768c() {
        return this.f50993c.f50984c;
    }

    /* renamed from: e */
    private String m44780e() {
        if (f50991f) {
            return this.f50999j;
        }
        return this.f51009t.mo37759a("X-Tt-Token", "");
    }

    /* renamed from: g */
    private void m44782g() {
        this.f50999j = "";
        this.f51009t.mo37758a().mo37756a("X-Tt-Token", "").mo37757a();
    }

    /* renamed from: f */
    private boolean m44781f() {
        if (!f50991f || this.f50998i || !this.f50997h || (!"change.token".equals(this.f50999j) && !TextUtils.isEmpty(this.f50999j))) {
            return false;
        }
        this.f50998i = true;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37767b() {
        if (f50991f && !this.f50992b && this.f51006q) {
            this.f50992b = true;
            String str = this.f50993c.f50982a;
            if (this.f51000k == null) {
                this.f51000k = (IGetTokenApi) C13333g.m26861a(str, IGetTokenApi.class);
            }
            if (!TextUtils.isEmpty(this.f50999j) || !this.f51008s) {
                if (!C18506d.m44791a(this.f51002m)) {
                    this.f51004o++;
                    this.f50994d.sendEmptyMessageDelayed(1000, Math.min(((long) this.f51004o) * 10000, this.f50993c.f50987f));
                    this.f50992b = false;
                    return;
                }
                this.f51004o = 0;
                this.f51000k.requestToken("").enqueue(new C12743e<String>() {
                    /* renamed from: a */
                    public final void mo19942a(C12690b<String> bVar, C12799u<String> uVar) {
                        try {
                            C18503c.this.f50992b = false;
                            C18503c.this.f50994d.sendEmptyMessageDelayed(1000, C18503c.this.f50993c.f50987f);
                            if (!(uVar == null || uVar.mo23958a() == 200)) {
                                C18507e.m44794a("tt_token_beat", uVar.mo23959b(), uVar.mo23958a(), (String) uVar.f33552b);
                            }
                        } catch (Exception unused) {
                        }
                    }

                    /* renamed from: a */
                    public final void mo19943a(C12690b<String> bVar, Throwable th) {
                        try {
                            C18503c.this.f50992b = false;
                            C18503c.this.f50994d.sendEmptyMessageDelayed(1000, C18503c.this.f50993c.f50987f);
                            C18507e.m44794a("tt_token_beat", (List) null, -1, th.getMessage());
                        } catch (Exception unused) {
                        }
                    }
                });
            } else if (!this.f50996g) {
                this.f51000k.requestChangeToken("").enqueue(new C12743e<String>() {
                    /* renamed from: a */
                    public final void mo19942a(C12690b<String> bVar, C12799u<String> uVar) {
                        try {
                            C18503c.this.f50992b = false;
                            C18503c.this.f50994d.sendEmptyMessageDelayed(1000, C18503c.this.f50993c.f50987f);
                            if (uVar == null || uVar.mo23958a() == 200) {
                                C18503c.this.f50996g = true;
                            } else {
                                C18507e.m44794a("tt_token_change", uVar.mo23959b(), uVar.mo23958a(), (String) uVar.f33552b);
                            }
                        } catch (Exception unused) {
                        }
                    }

                    /* renamed from: a */
                    public final void mo19943a(C12690b<String> bVar, Throwable th) {
                        try {
                            C18503c.this.f50992b = false;
                            C18503c.this.f50995e++;
                            if (C18503c.this.f50995e < 5) {
                                C18503c.this.f50994d.sendEmptyMessageDelayed(1000, C18503c.this.f50993c.f50988g * ((long) C18503c.this.f50995e));
                            }
                            C18507e.m44794a("tt_token_change", (List) null, -1, th.getMessage());
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo37765a(Collection<String> collection) {
        this.f50993c.f50983b.addAll(collection);
    }

    /* renamed from: b */
    private boolean m44778b(String str) {
        if (str != null) {
            C18502a aVar = this.f50993c.f50989h;
            if (aVar != null) {
                return aVar.mo37764a(str);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo37766a(boolean z) {
        this.f51006q = z;
        if (!z) {
            m44782g();
        }
    }

    public final void handleMsg(Message message) {
        if (message.what == 1000) {
            this.f50994d.removeMessages(1000);
            mo37767b();
        }
    }

    /* renamed from: a */
    private boolean m44776a(String str) {
        if (!this.f51006q || !C18508f.m44799a(str, this.f50993c.f50983b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m44775a(String str, List<C12685b> list) {
        String str2;
        if (f50990a != null && f50990a.m44776a(str) && !f50990a.m44778b(str)) {
            if (!f50991f) {
                if (f50990a != null) {
                    str2 = f50990a.f51009t.mo37759a("X-Tt-Token", "");
                } else {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(str2)) {
                    list.add(new C12685b("X-Tt-Token", str2));
                }
            } else if (!TextUtils.isEmpty(f50990a.f50999j) && !f50990a.f51007r) {
                list.add(new C12685b("X-Tt-Token", f50990a.m44780e()));
            }
            list.add(new C12685b("sdk-version", m44779d()));
            if (f50990a.m44781f()) {
                C18507e.m44792a(str);
            }
        }
    }

    /* renamed from: b */
    public static void m44777b(String str, List<C12685b> list) {
        if (f50991f && f50990a != null && f50990a.m44776a(str) && !f50990a.m44778b(str)) {
            String str2 = null;
            String str3 = null;
            for (C12685b bVar : list) {
                if ("X-Tt-Token-Sign".equalsIgnoreCase(bVar.f33318a)) {
                    str3 = bVar.f33319b;
                } else if ("X-Tt-Token".equalsIgnoreCase(bVar.f33318a)) {
                    str2 = bVar.f33319b;
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    f50990a.m44774a(str3, str2);
                    return;
                }
            }
        }
    }

    C18503c(Context context, C18501b bVar) {
        this.f50993c = bVar;
        this.f51002m = context.getApplicationContext();
        C13333g.m26865a((C12727a) new AuthTokenInterceptor());
        String str = bVar.f50985d;
        if (TextUtils.isEmpty(str)) {
            str = "token_shared_preference";
        }
        f50991f = C18508f.m44798a(this.f51002m);
        this.f51009t = AuthTokenMultiProcessSharedProvider.m44753a(this.f51002m, str, f50991f);
        this.f50994d = new C9381g(Looper.getMainLooper(), this);
        if (!f50991f) {
            return;
        }
        if (!TextUtils.isEmpty(bVar.f50982a)) {
            this.f50999j = this.f51009t.mo37759a("X-Tt-Token", "");
            this.f51008s = this.f51009t.mo37760a("first-launch", true);
            if (this.f51008s) {
                C18498a a = this.f51009t.mo37758a();
                a.f50975b.put("first-launch", Boolean.valueOf(false));
                a.mo37757a();
            }
            this.f50997h = !TextUtils.isEmpty(this.f50999j);
            return;
        }
        throw new IllegalStateException("not set beat host");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m44774a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.ss.android.account.token.b r0 = r10.f50993c     // Catch:{ all -> 0x00f5 }
            boolean r0 = r0.f50986e     // Catch:{ all -> 0x00f5 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = ""
            java.security.PrivateKey r3 = r10.f51001l     // Catch:{ all -> 0x00f5 }
            if (r3 != 0) goto L_0x001d
            java.lang.String r3 = com.p683ss.android.account.token.C18510h.f51013a     // Catch:{ Exception -> 0x0018 }
            java.security.PrivateKey r3 = com.p683ss.android.account.token.C18510h.m44803a(r3)     // Catch:{ Exception -> 0x0018 }
            r10.f51001l = r3     // Catch:{ Exception -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00f5 }
        L_0x001d:
            java.security.PrivateKey r3 = r10.f51001l     // Catch:{ all -> 0x00f5 }
            if (r3 == 0) goto L_0x00b6
            int r3 = r11.length()     // Catch:{ all -> 0x00f5 }
            int r4 = r3 / 2
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x00f5 }
            r5 = 0
        L_0x002a:
            if (r5 >= r3) goto L_0x004b
            int r6 = r5 / 2
            char r7 = r11.charAt(r5)     // Catch:{ all -> 0x00f5 }
            r8 = 16
            int r7 = java.lang.Character.digit(r7, r8)     // Catch:{ all -> 0x00f5 }
            int r7 = r7 << 4
            int r9 = r5 + 1
            char r9 = r11.charAt(r9)     // Catch:{ all -> 0x00f5 }
            int r8 = java.lang.Character.digit(r9, r8)     // Catch:{ all -> 0x00f5 }
            int r7 = r7 + r8
            byte r7 = (byte) r7     // Catch:{ all -> 0x00f5 }
            r4[r6] = r7     // Catch:{ all -> 0x00f5 }
            int r5 = r5 + 2
            goto L_0x002a
        L_0x004b:
            java.security.PrivateKey r3 = r10.f51001l     // Catch:{ all -> 0x00f5 }
            byte[] r3 = com.p683ss.android.account.token.C18510h.m44804a(r4, r3)     // Catch:{ all -> 0x00f5 }
            r4 = 0
            if (r3 == 0) goto L_0x0059
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00f5 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0059:
            r3 = 100
            if (r4 == 0) goto L_0x0067
            int r5 = r4.length()     // Catch:{ all -> 0x00f5 }
            if (r5 <= r3) goto L_0x0067
            java.lang.String r4 = r4.substring(r2, r3)     // Catch:{ all -> 0x00f5 }
        L_0x0067:
            if (r12 == 0) goto L_0x0074
            int r5 = r12.length()     // Catch:{ all -> 0x00f5 }
            if (r5 <= r3) goto L_0x0074
            java.lang.String r3 = r12.substring(r2, r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0075
        L_0x0074:
            r3 = r12
        L_0x0075:
            if (r4 == 0) goto L_0x00ad
            if (r12 == 0) goto L_0x00ad
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x00f5 }
            if (r3 == 0) goto L_0x00ad
            boolean r11 = r10.f51007r     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0085
            r10.f51007r = r2     // Catch:{ all -> 0x00f5 }
        L_0x0085:
            r10.f50999j = r12     // Catch:{ all -> 0x00f5 }
            com.ss.android.account.token.AuthTokenMultiProcessSharedProvider$b r11 = r10.f51009t     // Catch:{ all -> 0x00f5 }
            com.ss.android.account.token.AuthTokenMultiProcessSharedProvider$a r11 = r11.mo37758a()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "X-Tt-Token"
            com.ss.android.account.token.AuthTokenMultiProcessSharedProvider$a r11 = r11.mo37756a(r0, r12)     // Catch:{ all -> 0x00f5 }
            r11.mo37757a()     // Catch:{ all -> 0x00f5 }
            java.lang.String r11 = "change.token"
            java.lang.String r12 = r10.f50999j     // Catch:{ all -> 0x00f5 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00a9
            java.lang.String r11 = r10.f50999j     // Catch:{ all -> 0x00f5 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            r10.f50997h = r1     // Catch:{ all -> 0x00f5 }
            goto L_0x00be
        L_0x00ad:
            java.lang.String r1 = "compare"
            com.p683ss.android.account.token.C18507e.m44793a(r1, r11, r12, r0)     // Catch:{ all -> 0x00f5 }
            r10.m44782g()     // Catch:{ all -> 0x00f5 }
            goto L_0x00f3
        L_0x00b6:
            java.lang.String r1 = "privateKey"
            com.p683ss.android.account.token.C18507e.m44793a(r1, r11, r12, r0)     // Catch:{ all -> 0x00f5 }
            r10.m44782g()     // Catch:{ all -> 0x00f5 }
        L_0x00be:
            monitor-exit(r10)
            return
        L_0x00c0:
            boolean r11 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00f3
            boolean r11 = r10.f51007r     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00cc
            r10.f51007r = r2     // Catch:{ all -> 0x00f5 }
        L_0x00cc:
            r10.f50999j = r12     // Catch:{ all -> 0x00f5 }
            com.ss.android.account.token.AuthTokenMultiProcessSharedProvider$b r11 = r10.f51009t     // Catch:{ all -> 0x00f5 }
            com.ss.android.account.token.AuthTokenMultiProcessSharedProvider$a r11 = r11.mo37758a()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "X-Tt-Token"
            com.ss.android.account.token.AuthTokenMultiProcessSharedProvider$a r11 = r11.mo37756a(r0, r12)     // Catch:{ all -> 0x00f5 }
            r11.mo37757a()     // Catch:{ all -> 0x00f5 }
            java.lang.String r11 = "change.token"
            java.lang.String r12 = r10.f50999j     // Catch:{ all -> 0x00f5 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00f0
            java.lang.String r11 = r10.f50999j     // Catch:{ all -> 0x00f5 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            r10.f50997h = r1     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r10)
            return
        L_0x00f5:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.account.token.C18503c.m44774a(java.lang.String, java.lang.String):void");
    }
}
