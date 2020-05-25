package com.p683ss.android.ugc.aweme.player.sdk.impl;

import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.player.sdk.C38854a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38855a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38856b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38857c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38858d;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38862c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38865f;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38868g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38869h;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38870i;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.player.sdk.p2055b.C38874b;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c;
import com.p683ss.android.ugc.playerkit.p2492a.C50101a;
import com.p683ss.android.ugc.playerkit.p2494c.C50111c;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.p2494c.C50120i;
import com.p683ss.android.ugc.playerkit.session.C50122a;
import com.p683ss.android.ugc.playerkit.session.Session;
import com.p683ss.ttvideoengine.Resolution;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.d */
public class C38900d implements C38869h {

    /* renamed from: A */
    private C38857c f99061A;

    /* renamed from: B */
    private C38856b f99062B;

    /* renamed from: C */
    private String f99063C;

    /* renamed from: D */
    private SurfaceHolder f99064D;

    /* renamed from: E */
    private boolean f99065E;

    /* renamed from: a */
    public C38859e f99066a;

    /* renamed from: b */
    public AtomicReference<C38859e> f99067b;

    /* renamed from: c */
    public C50116c f99068c;

    /* renamed from: d */
    public C50120i f99069d;

    /* renamed from: e */
    public String f99070e;

    /* renamed from: f */
    public String f99071f;

    /* renamed from: g */
    public boolean f99072g;

    /* renamed from: h */
    public boolean f99073h;

    /* renamed from: i */
    public boolean f99074i;

    /* renamed from: j */
    public boolean f99075j;

    /* renamed from: k */
    public int f99076k;

    /* renamed from: l */
    public int f99077l;

    /* renamed from: m */
    public int f99078m;

    /* renamed from: n */
    public long f99079n;

    /* renamed from: o */
    public long f99080o = -1;

    /* renamed from: p */
    public C38862c f99081p;

    /* renamed from: q */
    public C38871j f99082q;

    /* renamed from: r */
    public C38858d f99083r;

    /* renamed from: s */
    C50111c f99084s;

    /* renamed from: t */
    public long f99085t;

    /* renamed from: u */
    private volatile Surface f99086u;

    /* renamed from: v */
    private boolean f99087v;

    /* renamed from: w */
    private boolean f99088w;

    /* renamed from: x */
    private boolean f99089x;

    /* renamed from: y */
    private C50101a f99090y;

    /* renamed from: z */
    private C38868g f99091z;

    /* renamed from: a */
    public final void mo78890a(int i, int i2) {
    }

    /* renamed from: b */
    public final void mo78903b(int i) {
    }

    /* renamed from: l */
    public final int mo78916l() {
        return this.f99076k;
    }

    /* renamed from: n */
    public final void mo78918n() {
    }

    /* renamed from: o */
    public final void mo78919o() {
    }

    /* renamed from: q */
    public final C50116c mo78921q() {
        return this.f99068c;
    }

    /* renamed from: a */
    public final void mo78899a(C50120i iVar) {
        if (iVar != null) {
            this.f99084s = iVar.f125574f;
            this.f99071f = iVar.f125582n;
            this.f99077l = 0;
            mo78973a(iVar, iVar.f125572d, iVar.f125573e);
        }
    }

    /* renamed from: a */
    public final void mo78973a(C50120i iVar, String str, boolean z) {
        m86611a(iVar, str, z, 0, false);
    }

    /* renamed from: a */
    public final void mo78900a(String str) {
        if (!TextUtils.isEmpty(str) && str.equals(this.f99070e)) {
            if (C38854a.f98960a) {
                StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, resume(), surface = ");
                sb.append(this.f99086u);
                sb.append(", mPlayer = ");
                sb.append(this.f99066a);
                sb.append(" mStatus = ");
                sb.append(this.f99078m);
                sb.append(", isPrepare2Pause =");
                sb.append(this.f99087v);
                sb.append(" mSurfaceChanged = ");
                sb.append(this.f99088w);
            }
            if (this.f99078m < 2 || this.f99078m > 5 || this.f99087v) {
                mo78973a(this.f99069d, this.f99070e, true);
                this.f99087v = false;
            } else if (!this.f99088w || this.f99066a == null || !this.f99066a.mo78860f()) {
                this.f99078m = 2;
                mo78907c();
            } else {
                m86611a(this.f99069d, this.f99070e, true, this.f99066a.mo78865k(), true);
            }
            if (this.f99082q != null) {
                this.f99082q.mo53527a(this.f99070e);
            }
        }
    }

    /* renamed from: a */
    public final void mo78897a(C38871j jVar) {
        this.f99082q = jVar;
    }

    /* renamed from: a */
    public final void mo78896a(C38868g gVar) {
        this.f99091z = gVar;
        if (this.f99066a != null) {
            this.f99066a.mo78846a(gVar);
        }
    }

    /* renamed from: a */
    public final void mo78894a(C38857c cVar) {
        this.f99061A = cVar;
        if (this.f99066a != null) {
            this.f99066a.mo78844a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo78898a(C50101a aVar) {
        this.f99090y = aVar;
    }

    /* renamed from: a */
    public final void mo78895a(C38858d dVar) {
        this.f99083r = dVar;
    }

    /* renamed from: a */
    public final boolean mo78901a(String str, String str2) {
        return this.f99070e != null && this.f99070e.equals(str) && this.f99063C != null && this.f99063C.equals(str2);
    }

    /* renamed from: m */
    public final void mo78917m() {
        this.f99070e = "";
    }

    /* renamed from: w */
    private void m86613w() {
        this.f99072g = false;
        this.f99087v = false;
        this.f99074i = false;
        this.f99075j = false;
        this.f99076k = 0;
        this.f99088w = false;
        this.f99089x = false;
    }

    /* renamed from: g */
    public final boolean mo78911g() {
        if (this.f99066a != null) {
            return this.f99066a.mo78863i();
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo78914j() {
        if (this.f99066a != null) {
            return this.f99066a.mo78864j();
        }
        return false;
    }

    /* renamed from: k */
    public final String mo78915k() {
        if (this.f99066a != null) {
            return this.f99066a.mo78867m();
        }
        return null;
    }

    /* renamed from: r */
    public final boolean mo78922r() {
        if (this.f99066a != null) {
            return this.f99066a.mo78862h();
        }
        return false;
    }

    /* renamed from: h */
    public final long mo78912h() {
        if (this.f99089x || this.f99066a == null) {
            return -1;
        }
        return this.f99066a.mo78865k();
    }

    /* renamed from: i */
    public final long mo78913i() {
        if (this.f99089x || this.f99066a == null) {
            return -1;
        }
        return this.f99066a.mo78866l();
    }

    /* renamed from: s */
    public final C38866g mo78923s() {
        C38859e eVar = (C38859e) this.f99067b.get();
        if (eVar != null) {
            return eVar.mo78870p();
        }
        return null;
    }

    /* renamed from: t */
    public final C38865f mo78924t() {
        C38859e eVar = (C38859e) this.f99067b.get();
        if (eVar != null) {
            return eVar.mo78871q();
        }
        return null;
    }

    /* renamed from: u */
    public final String mo78925u() {
        C38859e eVar = (C38859e) this.f99067b.get();
        if (eVar != null) {
            return eVar.mo78868n();
        }
        return null;
    }

    /* renamed from: v */
    public final boolean mo78926v() {
        C38859e eVar = (C38859e) this.f99067b.get();
        if (eVar == null || !eVar.mo78869o()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo78908d() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, stop(), surface = ");
            sb.append(this.f99086u);
            sb.append(", mPlayer = ");
            sb.append(this.f99066a);
            sb.append(" mStatus = ");
            sb.append(this.f99078m);
        }
        if (!(this.f99078m == 6 || this.f99066a == null)) {
            mo78909e();
            this.f99066a.mo78858d();
            this.f99078m = 6;
        }
    }

    /* renamed from: p */
    public final void mo78920p() {
        float f;
        long h = mo78912h();
        if (mo78913i() == 0) {
            f = 0.0f;
        } else {
            f = (((float) h) * 100.0f) / ((float) mo78913i());
        }
        if (this.f99082q != null) {
            this.f99082q.mo53523a(f);
        }
    }

    /* renamed from: x */
    private void m86614x() {
        if (this.f99083r != null) {
            this.f99066a = this.f99083r.mo78834a(this.f99068c);
            this.f99067b.set(this.f99066a);
        }
        this.f99066a.mo78848a(this.f99090y);
        this.f99066a.mo78846a(this.f99091z);
        this.f99066a.mo78844a(this.f99061A);
        this.f99066a.mo78847a((C38870i) new C38870i() {
            /* renamed from: a */
            public final void mo78927a() {
                if (C38900d.this.f99082q != null) {
                    C38900d.this.f99082q.mo53529a(true);
                }
            }

            /* renamed from: b */
            public final void mo78928b() {
                if (C38900d.this.f99082q != null) {
                    C38900d.this.f99082q.mo53529a(false);
                }
            }
        });
        this.f99081p = new C38862c() {
            /* renamed from: d */
            public final void mo78879d() {
                if (C38900d.this.f99082q != null) {
                    C38900d.this.f99082q.mo53528a(C38900d.this.f99070e, C38900d.this.f99073h);
                }
            }

            /* renamed from: a */
            public final void mo78872a() {
                if (C38900d.this.f99078m == 1) {
                    C38900d.this.f99078m = 2;
                    C38900d.this.f99075j = true;
                    if (C38900d.this.f99074i) {
                        C38900d.this.f99080o = System.currentTimeMillis();
                        C38900d.this.mo78907c();
                    }
                } else if (C38900d.this.f99078m == 5) {
                    C38900d.this.mo78909e();
                }
            }

            /* renamed from: c */
            public final void mo78878c() {
                if (C38900d.this.f99082q != null) {
                    if (C38900d.this.f99076k == 0) {
                        C38900d.this.f99082q.mo53534d(C38900d.this.f99070e);
                    }
                    C38900d.this.f99076k++;
                    C38900d.this.f99082q.mo53533c(C38900d.this.f99070e);
                }
            }

            /* renamed from: b */
            public final void mo78877b() {
                long j;
                if (C38900d.this.f99082q != null) {
                    C38874b.m86418a().mo78930a(C38900d.this.f99071f, "player_on_render");
                    if (C38900d.this.f99066a != null) {
                        j = C38900d.this.f99066a.mo78866l();
                    } else {
                        j = -1;
                    }
                    C50122a.m108112a().mo97897a(C38900d.this.f99071f);
                    C38900d.this.f99082q.mo53525a(new C50117f(C38900d.this.f99070e, C38900d.this.f99072g, j));
                    if (C38900d.this.f99068c != C50116c.EXO) {
                        C38900d.this.f99082q.mo53526a(new C50118g(C38900d.this.f99070e, C38900d.this.f99072g));
                    }
                }
                C38900d dVar = C38900d.this;
                if (dVar.f99083r != null) {
                    if (dVar.f99079n != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - dVar.f99079n;
                        if (currentTimeMillis > 0) {
                            dVar.f99083r.mo78835a(dVar.f99084s.getPrepareKey(), currentTimeMillis, dVar.f99068c, dVar.f99069d.mo97891b(), dVar.f99072g);
                        }
                        dVar.f99079n = -1;
                    }
                    if (dVar.f99080o != -1) {
                        long currentTimeMillis2 = System.currentTimeMillis() - dVar.f99080o;
                        if (currentTimeMillis2 > 0) {
                            dVar.f99083r.mo78836b(dVar.f99084s.getFirstFrameKey(), currentTimeMillis2, dVar.f99068c, dVar.f99069d.mo97891b(), dVar.f99072g);
                        }
                        dVar.f99080o = -1;
                    }
                }
                C38900d.this.f99075j = false;
            }

            /* renamed from: a */
            public final void mo78874a(long j) {
                if (C38900d.this.f99082q != null && (C38900d.this.f99082q instanceof C38855a)) {
                    ((C38855a) C38900d.this.f99082q).mo78829a(j);
                }
            }

            /* renamed from: a */
            public final void mo78876a(boolean z) {
                if (!z) {
                    C38900d.this.f99075j = false;
                    if (C38900d.this.f99082q != null) {
                        C38900d.this.f99082q.mo53532b(false);
                    }
                } else if (C38900d.this.f99082q != null && (!(C38900d.this.f99066a == null || C38900d.this.f99066a.mo78865k() == 0) || C38900d.this.f99075j)) {
                    C38900d.this.f99082q.mo53532b(true);
                }
            }

            /* renamed from: a */
            public final void mo78875a(Resolution resolution, int i) {
                if (C38900d.this.f99082q != null && (C38900d.this.f99082q instanceof C38855a)) {
                    ((C38855a) C38900d.this.f99082q).mo78830a(resolution, i);
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
                if (r0 != false) goto L_0x001d;
             */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo78873a(int r13, int r14, java.lang.Object r15) {
                /*
                    r12 = this;
                    com.ss.android.ugc.aweme.player.sdk.impl.d r0 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.playerkit.c.e$c r0 = r0.f99068c
                    com.ss.android.ugc.playerkit.c.e$c r1 = com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c.Ijk
                    r2 = 1
                    r3 = 0
                    if (r0 == r1) goto L_0x001d
                    com.ss.android.ugc.aweme.player.sdk.impl.d r0 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.aweme.player.sdk.a.e r1 = r0.f99066a
                    if (r1 == 0) goto L_0x001a
                    com.ss.android.ugc.aweme.player.sdk.a.e r0 = r0.f99066a
                    boolean r0 = r0.mo78861g()
                    if (r0 == 0) goto L_0x001a
                    r0 = 1
                    goto L_0x001b
                L_0x001a:
                    r0 = 0
                L_0x001b:
                    if (r0 == 0) goto L_0x002b
                L_0x001d:
                    r0 = -10000(0xffffffffffffd8f0, float:NaN)
                    if (r13 != r0) goto L_0x002b
                    r0 = -1000(0xfffffffffffffc18, float:NaN)
                    if (r14 == r0) goto L_0x0029
                    r0 = -2000(0xfffffffffffff830, float:NaN)
                    if (r14 != r0) goto L_0x002b
                L_0x0029:
                    r0 = 1
                    goto L_0x002c
                L_0x002b:
                    r0 = 0
                L_0x002c:
                    if (r0 != 0) goto L_0x005f
                    com.ss.android.ugc.aweme.player.sdk.b.b r1 = com.p683ss.android.ugc.aweme.player.sdk.p2055b.C38874b.m86418a()
                    com.ss.android.ugc.aweme.player.sdk.impl.d r4 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    java.lang.String r4 = r4.f99071f
                    java.lang.String r5 = "player_on_failed"
                    r1.mo78930a(r4, r5)
                    com.ss.android.ugc.playerkit.c.d r1 = new com.ss.android.ugc.playerkit.c.d
                    com.ss.android.ugc.aweme.player.sdk.impl.d r4 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    java.lang.String r7 = r4.f99070e
                    com.ss.android.ugc.aweme.player.sdk.impl.d r4 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    boolean r8 = r4.f99072g
                    r6 = r1
                    r9 = r13
                    r10 = r14
                    r11 = r15
                    r6.<init>(r7, r8, r9, r10, r11)
                    com.ss.android.ugc.aweme.player.sdk.impl.d r4 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    boolean r4 = r4.f99073h
                    r1.f125525c = r4
                    com.ss.android.ugc.aweme.player.sdk.impl.d r4 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.aweme.player.sdk.a.j r4 = r4.f99082q
                    if (r4 == 0) goto L_0x005f
                    com.ss.android.ugc.aweme.player.sdk.impl.d r4 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.aweme.player.sdk.a.j r4 = r4.f99082q
                    r4.mo53524a(r1)
                L_0x005f:
                    java.lang.Thread r1 = java.lang.Thread.currentThread()
                    long r4 = r1.getId()
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    long r6 = r1.f99085t
                    int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r1 == 0) goto L_0x0079
                    java.lang.Exception r1 = new java.lang.Exception
                    r1.<init>()
                    java.lang.String r4 = "onError thread not match"
                    com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18312a(r1, r4)
                L_0x0079:
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.aweme.player.sdk.a.e r1 = r1.f99066a
                    if (r1 == 0) goto L_0x009d
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.aweme.player.sdk.a.e r1 = r1.f99066a
                    r4 = 0
                    r1.mo78842a(r4)
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.aweme.player.sdk.a.e r1 = r1.f99066a
                    r1.mo78859e()
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    r1.f99066a = r4
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    java.util.concurrent.atomic.AtomicReference<com.ss.android.ugc.aweme.player.sdk.a.e> r1 = r1.f99067b
                    r1.set(r4)
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    r1.f99078m = r3
                L_0x009d:
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    r3 = -1
                    r1.f99079n = r3
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    r1.f99080o = r3
                    if (r0 == 0) goto L_0x0100
                    com.ss.android.ugc.aweme.player.sdk.impl.d r0 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    int r0 = r0.f99077l
                    r1 = 10
                    if (r0 >= r1) goto L_0x0100
                    com.ss.android.ugc.aweme.player.sdk.impl.d r0 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    int r1 = r0.f99077l
                    int r1 = r1 + r2
                    r0.f99077l = r1
                    com.ss.android.ugc.aweme.player.sdk.b.b r0 = com.p683ss.android.ugc.aweme.player.sdk.p2055b.C38874b.m86418a()
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    java.lang.String r1 = r1.f99071f
                    java.lang.String r2 = "player_try_play"
                    r0.mo78930a(r1, r2)
                    com.ss.android.ugc.aweme.player.sdk.impl.d r0 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.playerkit.c.e$c r1 = com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c.Ijk
                    r0.f99068c = r1
                    com.ss.android.ugc.aweme.player.sdk.impl.d r0 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.playerkit.c.i r1 = r1.f99069d
                    com.ss.android.ugc.aweme.player.sdk.impl.d r2 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    java.lang.String r2 = r2.f99070e
                    com.ss.android.ugc.aweme.player.sdk.impl.d r3 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    boolean r3 = r3.f99074i
                    r0.mo78973a(r1, r2, r3)
                    com.ss.android.ugc.aweme.player.sdk.impl.d r0 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.aweme.player.sdk.a.j r0 = r0.f99082q
                    if (r0 == 0) goto L_0x0100
                    com.ss.android.ugc.playerkit.c.d r0 = new com.ss.android.ugc.playerkit.c.d
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    java.lang.String r2 = r1.f99070e
                    com.ss.android.ugc.aweme.player.sdk.impl.d r1 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    boolean r3 = r1.f99072g
                    r1 = r0
                    r4 = r13
                    r5 = r14
                    r6 = r15
                    r1.<init>(r2, r3, r4, r5, r6)
                    com.ss.android.ugc.aweme.player.sdk.impl.d r13 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    boolean r13 = r13.f99073h
                    r0.f125525c = r13
                    com.ss.android.ugc.aweme.player.sdk.impl.d r13 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.this
                    com.ss.android.ugc.aweme.player.sdk.a.j r13 = r13.f99082q
                    r13.mo53530b(r0)
                L_0x0100:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d.C389022.mo78873a(int, int, java.lang.Object):void");
            }
        };
        this.f99066a.mo78845a(this.f99081p);
    }

    /* renamed from: a */
    public final void mo78887a() {
        if (this.f99066a == null) {
            m86614x();
            if (this.f99066a != null) {
                this.f99066a.mo78838a();
            }
            this.f99065E = true;
        }
    }

    /* renamed from: b */
    public final void mo78902b() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, render(), surface = ");
            sb.append(this.f99086u);
            sb.append(", mPlayer = ");
            sb.append(this.f99066a);
            sb.append(" mStatus = ");
            sb.append(this.f99078m);
        }
        this.f99074i = true;
        if (this.f99078m == 1 || this.f99078m == 2 || this.f99078m == 5 || this.f99078m == 6 || this.f99078m == 3) {
            if (this.f99078m == 2) {
                mo78907c();
            }
            return;
        }
        mo78973a(this.f99069d, this.f99070e, true);
    }

    /* renamed from: c */
    public final void mo78907c() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, start(), surface = ");
            sb.append(this.f99086u);
            sb.append(", mPlayer = ");
            sb.append(this.f99066a);
            sb.append(" mStatus = ");
            sb.append(this.f99078m);
        }
        if (this.f99066a != null && this.f99078m == 2 && this.f99086u != null && this.f99086u.isValid()) {
            if (C38854a.f98960a) {
                StringBuilder sb2 = new StringBuilder("SimplifyPlayerImpl, start surface = ");
                sb2.append(this.f99086u);
                sb2.append(", mSimplifyPlayer = ");
                sb2.append(this.f99066a);
            }
            this.f99066a.mo78842a(this.f99086u);
            this.f99066a.mo78854b();
            this.f99078m = 3;
        }
    }

    /* renamed from: e */
    public final void mo78909e() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, pause(), surface = ");
            sb.append(this.f99086u);
            sb.append(", mPlayer = ");
            sb.append(this.f99066a);
            sb.append(" mStatus = ");
            sb.append(this.f99078m);
        }
        if (this.f99066a != null && this.f99078m <= 5) {
            if (!(this.f99068c == C50116c.Ijk || this.f99068c == C50116c.IjkHardware) || this.f99066a.mo78864j()) {
                this.f99066a.mo78856c();
                if (this.f99082q != null && this.f99078m <= 5) {
                    this.f99082q.mo53531b(this.f99070e);
                }
            }
            if (this.f99078m == 1 && !this.f99065E) {
                this.f99087v = true;
            }
            this.f99078m = 5;
        }
    }

    /* renamed from: f */
    public final void mo78910f() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, release(), surface = ");
            sb.append(this.f99086u);
            sb.append(", mPlayer = ");
            sb.append(this.f99066a);
            sb.append(" mStatus = ");
            sb.append(this.f99078m);
        }
        if (Thread.currentThread().getId() != this.f99085t) {
            C9220a.m18312a((Throwable) new Exception(), "release thread not match");
        }
        mo78908d();
        if (this.f99066a != null) {
            this.f99089x = true;
            this.f99066a.mo78859e();
            this.f99089x = false;
            this.f99066a = null;
            this.f99067b.set(null);
            this.f99078m = 7;
        }
    }

    /* renamed from: a */
    public final void mo78893a(C38856b bVar) {
        this.f99062B = bVar;
    }

    /* renamed from: b */
    public final boolean mo78906b(C38871j jVar) {
        if (this.f99082q == jVar) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo78888a(float f) {
        if (this.f99066a != null) {
            this.f99066a.mo78839a(f);
        }
    }

    /* renamed from: b */
    public final void mo78904b(Surface surface) {
        if (this.f99066a != null) {
            this.f99066a.mo78842a(surface);
        }
    }

    public C38900d(C50116c cVar) {
        this.f99068c = cVar;
        this.f99067b = new AtomicReference<>(null);
    }

    /* renamed from: a */
    private void m86612a(boolean z) {
        this.f99089x = true;
        if (this.f99066a != null) {
            this.f99066a.mo78853a(z);
        }
        this.f99089x = false;
        this.f99078m = 0;
    }

    /* renamed from: b */
    public final void mo78905b(String str) {
        C38859e eVar = (C38859e) this.f99067b.get();
        if (eVar != null) {
            eVar.mo78850a(str);
        }
    }

    /* renamed from: a */
    public final float mo78886a(int i) {
        C38859e eVar = (C38859e) this.f99067b.get();
        if (this.f99089x || eVar == null) {
            return -1.0f;
        }
        return eVar.mo78837a(i);
    }

    /* renamed from: a */
    public final void mo78891a(Surface surface) {
        boolean z = false;
        if (!this.f99065E || surface == null) {
            if (this.f99086u != surface) {
                z = true;
            }
            this.f99088w = z;
        } else {
            this.f99088w = false;
            this.f99065E = false;
        }
        this.f99086u = surface;
        if (this.f99086u != null && this.f99086u.isValid() && this.f99078m == 2 && this.f99074i) {
            mo78907c();
        }
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, setSurface(), surface = ");
            sb.append(this.f99086u);
            sb.append(", mPlayer = ");
            sb.append(this.f99066a);
            sb.append(" mStatus = ");
            sb.append(this.f99078m);
        }
    }

    /* renamed from: a */
    public final void mo78892a(SurfaceHolder surfaceHolder) {
        if (this.f99066a != null) {
            this.f99066a.mo78843a(surfaceHolder);
        } else {
            this.f99064D = surfaceHolder;
        }
    }

    /* renamed from: a */
    public final void mo78889a(float f, float f2) {
        if (this.f99066a != null) {
            this.f99066a.mo78840a(f, f2);
        }
    }

    /* renamed from: a */
    private void m86611a(C50120i iVar, String str, boolean z, long j, boolean z2) {
        String str2;
        boolean z3;
        if (iVar != null && ((iVar.f125594z != null && iVar.f125594z.mo97884a()) || (iVar.mo97890a() != null && iVar.mo97890a().f125595a != null))) {
            if (iVar.f125594z == null) {
                C48525c cVar = iVar.mo97890a().f125598d;
                if (cVar == null || TextUtils.isEmpty(cVar.getUrlKey())) {
                    str2 = this.f99071f;
                } else {
                    str2 = cVar.getUrlKey();
                }
            } else if (iVar.f125594z.f125512a == null || iVar.f125594z.f125512a.getVideoRef() == null) {
                str2 = iVar.f125594z.f125514c;
            } else {
                str2 = iVar.f125594z.f125512a.getVideoRef().mVideoId;
            }
            if (this.f99078m != 1 || !mo78901a(str, str2)) {
                this.f99085t = Thread.currentThread().getId();
                m86613w();
                this.f99069d = iVar;
                this.f99063C = str2;
                this.f99079n = System.currentTimeMillis();
                this.f99070e = str;
                this.f99072g = iVar.f125576h;
                int i = 0;
                if (iVar.f125594z != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f99073h = z3;
                if (this.f99066a == null) {
                    m86614x();
                } else if (iVar.f125591w) {
                    this.f99066a.mo78856c();
                    this.f99066a.mo78858d();
                    this.f99066a.mo78859e();
                    this.f99066a = null;
                    this.f99067b.set(null);
                    m86614x();
                } else {
                    if (z2) {
                        this.f99066a.mo78841a(j);
                    }
                    m86612a(iVar.f125593y);
                }
                this.f99074i = z;
                this.f99075j = false;
                this.f99076k = 0;
                this.f99088w = false;
                if (this.f99084s.isLoop()) {
                    this.f99066a.mo78855b(true);
                }
                try {
                    if (this.f99086u != null && this.f99086u.isValid()) {
                        this.f99066a.mo78842a(this.f99086u);
                    }
                    C38874b.m86418a().mo78930a(this.f99071f, "player_prepare_play");
                    HashMap hashMap = new HashMap();
                    hashMap.put("context", iVar.f125571c);
                    hashMap.put("vr", Boolean.valueOf(iVar.f125575g));
                    hashMap.put("h265", Boolean.valueOf(iVar.f125576h));
                    hashMap.put("render_type", Integer.valueOf(iVar.f125577i));
                    hashMap.put("async_init", Boolean.valueOf(iVar.f125588t));
                    hashMap.put("enable_alog", Integer.valueOf(iVar.f125579k));
                    if (iVar.f125590v && this.f99066a.mo78857c(iVar.f125576h) && (this.f99066a instanceof C38907f)) {
                        i = 1;
                    }
                    hashMap.put("use_texture_render", Integer.valueOf(i));
                    if (iVar.f125589u > 0) {
                        hashMap.put("init_start_time_ms", Integer.valueOf(iVar.f125589u));
                    }
                    hashMap.put("frames_wait", Integer.valueOf(iVar.f125580l));
                    hashMap.put("key", str2);
                    hashMap.put("decoder_type", Integer.valueOf(iVar.f125578j));
                    hashMap.put("set_cookie_token", Boolean.valueOf(iVar.f125591w));
                    hashMap.put("dash_hijack_retry", Boolean.valueOf(iVar.f125592x));
                    hashMap.put("tag", iVar.f125568A);
                    this.f99066a.mo78851a(iVar.f125582n, this.f99062B);
                    if (iVar.f125594z != null) {
                        this.f99066a.mo78849a(iVar.f125594z, (Map<String, Object>) hashMap);
                    } else {
                        if (iVar.mo97890a().f125598d != null) {
                            hashMap.put("bitrate", Integer.valueOf(iVar.mo97890a().f125598d.getBitRate()));
                            hashMap.put("ratio", Integer.valueOf(iVar.mo97890a().f125598d.getQualityType() / 10));
                        }
                        C50122a.m108112a().mo97899a(str2, iVar.mo97890a().f125600f);
                        String str3 = (String) iVar.mo97890a().f125595a;
                        hashMap.put("force_software_decode", Boolean.valueOf(iVar.mo97890a().f125601g));
                        this.f99066a.mo78852a(str3, (Map<String, Object>) hashMap);
                    }
                    this.f99078m = 1;
                    Session b = C50122a.m108112a().mo97901b(iVar.f125582n);
                    if (b != null) {
                        b.h265 = iVar.f125576h;
                    }
                } catch (IOException e) {
                    if (this.f99082q != null) {
                        String str4 = this.f99070e;
                        boolean z4 = this.f99072g;
                        StringBuilder sb = new StringBuilder("prepare exception:");
                        sb.append(e.toString());
                        C50112d dVar = new C50112d(str4, z4, -123, -123, sb.toString());
                        dVar.f125525c = this.f99073h;
                        this.f99082q.mo53524a(dVar);
                    }
                    this.f99079n = -1;
                }
            }
        }
    }
}
