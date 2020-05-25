package dmt.p2652av.video.p2655c;

import android.content.Context;
import android.view.SurfaceHolder;
import com.p683ss.android.ugc.asve.context.C20353a;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.context.C20357d;
import com.p683ss.android.ugc.asve.context.C20361f;
import com.p683ss.android.ugc.asve.context.C20362g;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.p1238b.C20337p;
import com.p683ss.android.ugc.asve.recorder.C20504f;
import com.p683ss.android.ugc.asve.sandbox.C20809p;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43257i;
import com.p683ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44455e;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: dmt.av.video.c.d */
public final class C52946d implements C20363h {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f131321a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C52946d.class), "workspaceProvider", "getWorkspaceProvider()Lcom/ss/android/ugc/asve/recorder/IRecorderWorkspaceProvider;"))};

    /* renamed from: b */
    public boolean f131322b;

    /* renamed from: c */
    public long f131323c;

    /* renamed from: d */
    public C20809p f131324d;

    /* renamed from: e */
    public final Void f131325e;

    /* renamed from: f */
    public final Context f131326f;

    /* renamed from: g */
    public final ShortVideoContext f131327g;

    /* renamed from: h */
    public final C20353a f131328h;

    /* renamed from: i */
    private final C52668f f131329i;

    /* renamed from: j */
    private final C20362g f131330j;

    /* renamed from: k */
    private final C20361f f131331k;

    /* renamed from: l */
    private final C20357d f131332l;

    /* renamed from: m */
    private final C52847n<Integer, Integer> f131333m;

    /* renamed from: n */
    private final boolean f131334n;

    /* renamed from: o */
    private final boolean f131335o;

    /* renamed from: p */
    private final boolean f131336p;

    /* renamed from: q */
    private final boolean f131337q;

    /* renamed from: r */
    private final boolean f131338r;

    /* renamed from: s */
    private final Boolean f131339s = null;

    /* renamed from: t */
    private final boolean f131340t;

    /* renamed from: dmt.av.video.c.d$a */
    public static final class C52947a implements C20357d {

        /* renamed from: a */
        final /* synthetic */ C52946d f131341a;

        /* renamed from: b */
        private final boolean f131342b;

        /* renamed from: c */
        private final boolean f131343c;

        /* renamed from: d */
        private final float f131344d;

        /* renamed from: e */
        private final C20337p f131345e;

        /* renamed from: f */
        private final int f131346f;

        /* renamed from: g */
        private final boolean f131347g;

        /* renamed from: a */
        public final float mo43136a() {
            return 1.0f;
        }

        /* renamed from: b */
        public final boolean mo43137b() {
            return this.f131343c;
        }

        /* renamed from: c */
        public final float mo43138c() {
            return this.f131344d;
        }

        /* renamed from: d */
        public final boolean mo43139d() {
            return this.f131342b;
        }

        /* renamed from: e */
        public final int mo43140e() {
            return this.f131346f;
        }

        /* renamed from: f */
        public final C20337p mo43141f() {
            return this.f131345e;
        }

        /* renamed from: g */
        public final boolean mo43142g() {
            return this.f131347g;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
            if (r0 == null) goto L_0x001a;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo43143h() {
            /*
                r9 = this;
                boolean r0 = r9.mo43142g()
                if (r0 == 0) goto L_0x004d
                dmt.av.video.c.d r0 = r9.f131341a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.f131327g
                com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r0 = r0.f107118k
                if (r0 == 0) goto L_0x001a
                java.io.File r0 = r0.mo86455c()
                if (r0 == 0) goto L_0x001a
                java.lang.String r0 = r0.getPath()
                if (r0 != 0) goto L_0x001c
            L_0x001a:
                java.lang.String r0 = ""
            L_0x001c:
                r4 = r0
                r1 = 1
                r2 = 0
                dmt.av.video.c.d r0 = r9.f131341a
                android.content.Context r3 = r0.f131326f
                r0 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                dmt.av.video.c.d r0 = r9.f131341a
                d.n r0 = r0.mo43121e()
                java.lang.Object r0 = r0.getFirst()
                r6 = r0
                java.lang.Integer r6 = (java.lang.Integer) r6
                dmt.av.video.c.d r0 = r9.f131341a
                d.n r0 = r0.mo43121e()
                java.lang.Object r0 = r0.getSecond()
                r7 = r0
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = 0
                java.lang.String r0 = com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k.m96392a(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.String r1 = "MetaDataUtil.getMetaData… outputSize.second, null)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                return r0
            L_0x004d:
                java.lang.String r0 = ""
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dmt.p2652av.video.p2655c.C52946d.C52947a.mo43143h():java.lang.String");
        }

        C52947a(C52946d dVar) {
            this.f131341a = dVar;
            boolean z = true;
            if (dVar.f131327g.f107127t != 1) {
                z = false;
            }
            this.f131342b = z;
            this.f131343c = C39618d.f101152P.mo83103a(C40790a.EnableEnhanceVolume);
            this.f131344d = C40797m.m90249d() * 4.0f;
            this.f131345e = C44455e.m97283c();
            this.f131346f = C40797m.m90251f();
            this.f131347g = dVar.f131327g.f107038Q;
        }
    }

    /* renamed from: dmt.av.video.c.d$b */
    public static final class C52948b implements C20361f {

        /* renamed from: a */
        final /* synthetic */ C52946d f131348a;

        /* renamed from: b */
        private final boolean f131349b;

        /* renamed from: c */
        private final String f131350c;

        /* renamed from: d */
        private final String f131351d;

        /* renamed from: e */
        private final int f131352e;

        /* renamed from: f */
        private final int f131353f;

        /* renamed from: g */
        private final boolean f131354g;

        /* renamed from: a */
        public final boolean mo43173a() {
            return this.f131349b;
        }

        /* renamed from: b */
        public final String mo43174b() {
            return this.f131350c;
        }

        /* renamed from: c */
        public final String mo43175c() {
            return this.f131351d;
        }

        /* renamed from: d */
        public final int mo43176d() {
            return this.f131352e;
        }

        /* renamed from: e */
        public final int mo43177e() {
            return this.f131353f;
        }

        /* renamed from: f */
        public final boolean mo43178f() {
            return this.f131354g;
        }

        C52948b(C52946d dVar) {
            Effect effect;
            boolean z;
            this.f131348a = dVar;
            GameDuetResource gameDuetResource = dVar.f131327g.f107097aw;
            if (gameDuetResource != null) {
                effect = gameDuetResource.gameSticker;
            } else {
                effect = null;
            }
            boolean z2 = false;
            if (effect != null) {
                z = true;
            } else {
                z = false;
            }
            this.f131349b = z;
            String str = dVar.f131327g.f107028G;
            if (str == null) {
                str = "";
            }
            this.f131350c = str;
            String str2 = dVar.f131327g.f107027F;
            if (str2 == null) {
                str2 = "";
            }
            this.f131351d = str2;
            this.f131352e = dVar.f131327g.f107032K;
            this.f131353f = dVar.f131327g.f107033L;
            if (C39618d.f101152P.mo83103a(C40790a.StudioDuetChangeLayout) && C43257i.f109380a.mo87936b()) {
                z2 = true;
            }
            this.f131354g = z2;
        }
    }

    /* renamed from: dmt.av.video.c.d$c */
    public static final class C52949c implements C20362g {

        /* renamed from: a */
        final /* synthetic */ C52946d f131355a;

        /* renamed from: b */
        private final String f131356b;

        /* renamed from: c */
        private final String f131357c;

        /* renamed from: d */
        private final boolean f131358d;

        /* renamed from: a */
        public final String mo43179a() {
            return this.f131356b;
        }

        /* renamed from: b */
        public final String mo43180b() {
            return this.f131357c;
        }

        /* renamed from: c */
        public final float mo43181c() {
            return 0.66f;
        }

        /* renamed from: d */
        public final boolean mo43182d() {
            return this.f131358d;
        }

        /* renamed from: e */
        public final int mo43183e() {
            return R.array.a6;
        }

        /* renamed from: f */
        public final int mo43184f() {
            return R.array.a5;
        }

        /* renamed from: g */
        public final int mo43185g() {
            return R.drawable.b9f;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
            if (r0 == null) goto L_0x000f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
            if (r0 == null) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C52949c(dmt.p2652av.video.p2655c.C52946d r2) {
            /*
                r1 = this;
                r1.f131355a = r2
                r1.<init>()
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.f131327g
                com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r0 = r0.f107035N
                if (r0 == 0) goto L_0x000f
                java.lang.String r0 = r0.wavPath
                if (r0 != 0) goto L_0x0011
            L_0x000f:
                java.lang.String r0 = ""
            L_0x0011:
                r1.f131356b = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.f131327g
                com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r0 = r0.f107035N
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r0.videoPath
                if (r0 != 0) goto L_0x001f
            L_0x001d:
                java.lang.String r0 = ""
            L_0x001f:
                r1.f131357c = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r2.f131327g
                com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r2 = r2.f107035N
                r0 = 0
                if (r2 == 0) goto L_0x002b
                boolean r2 = r2.nonReacted
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                if (r2 != 0) goto L_0x002f
                r0 = 1
            L_0x002f:
                r1.f131358d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dmt.p2652av.video.p2655c.C52946d.C52949c.<init>(dmt.av.video.c.d):void");
        }
    }

    /* renamed from: dmt.av.video.c.d$d */
    static final class C52950d extends C52712l implements C52670a<C52943a> {

        /* renamed from: a */
        final /* synthetic */ C52946d f131359a;

        C52950d(C52946d dVar) {
            this.f131359a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Workspace workspace = this.f131359a.f131327g.f107118k;
            if (workspace == null) {
                workspace = Workspace.m93091a();
                C52711k.m112236a((Object) workspace, "Workspace.allocate()");
            }
            return new C52943a(workspace);
        }
    }

    /* renamed from: a */
    public final Boolean mo43117a() {
        return this.f131339s;
    }

    /* renamed from: b */
    public final boolean mo43118b() {
        return false;
    }

    /* renamed from: d */
    public final C20504f mo43120d() {
        return (C20504f) this.f131329i.getValue();
    }

    /* renamed from: e */
    public final C52847n<Integer, Integer> mo43121e() {
        return this.f131333m;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52946d) {
                C52946d dVar = (C52946d) obj;
                if (C52711k.m112239a((Object) this.f131326f, (Object) dVar.f131326f) && C52711k.m112239a((Object) this.f131327g, (Object) dVar.f131327g) && C52711k.m112239a((Object) this.f131328h, (Object) dVar.f131328h) && C52711k.m112239a((Object) mo43117a(), (Object) dVar.mo43117a())) {
                    if (mo43130n() == dVar.mo43130n()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo43122f() {
        return this.f131335o;
    }

    /* renamed from: g */
    public final boolean mo43123g() {
        return this.f131336p;
    }

    /* renamed from: h */
    public final boolean mo43124h() {
        return this.f131337q;
    }

    public final int hashCode() {
        Context context = this.f131326f;
        int i = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        ShortVideoContext shortVideoContext = this.f131327g;
        int hashCode2 = (hashCode + (shortVideoContext != null ? shortVideoContext.hashCode() : 0)) * 31;
        C20353a aVar = this.f131328h;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean a = mo43117a();
        if (a != null) {
            i = a.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean n = mo43130n();
        if (n) {
            n = true;
        }
        return i2 + (n ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo43125i() {
        return this.f131334n;
    }

    /* renamed from: j */
    public final C20361f mo43126j() {
        return this.f131331k;
    }

    /* renamed from: k */
    public final C20362g mo43127k() {
        return this.f131330j;
    }

    /* renamed from: l */
    public final C20357d mo43128l() {
        return this.f131332l;
    }

    /* renamed from: n */
    public final boolean mo43130n() {
        return this.f131340t;
    }

    /* renamed from: o */
    public final C20809p mo43131o() {
        return this.f131324d;
    }

    /* renamed from: p */
    public final boolean mo43132p() {
        return this.f131338r;
    }

    /* renamed from: q */
    public final boolean mo43133q() {
        return true;
    }

    /* renamed from: r */
    public final boolean mo43134r() {
        return this.f131322b;
    }

    /* renamed from: s */
    public final long mo43135s() {
        return this.f131323c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecorderContext(context=");
        sb.append(this.f131326f);
        sb.append(", shortVideoContext=");
        sb.append(this.f131327g);
        sb.append(", cameraContext=");
        sb.append(this.f131328h);
        sb.append(", isUseVERecorder=");
        sb.append(mo43117a());
        sb.append(", enableSandBox=");
        sb.append(mo43130n());
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ SurfaceHolder mo43119c() {
        return (SurfaceHolder) this.f131325e;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C20355c mo43129m() {
        return this.f131328h;
    }

    public C52946d(Context context, ShortVideoContext shortVideoContext, C20353a aVar, Boolean bool, boolean z) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        C52711k.m112240b(aVar, "cameraContext");
        this.f131326f = context;
        this.f131327g = shortVideoContext;
        this.f131328h = aVar;
        this.f131340t = z;
        this.f131329i = C52732g.m112285a(new C52950d(this));
        this.f131330j = new C52949c(this);
        this.f131331k = new C52948b(this);
        this.f131332l = new C52947a(this);
        this.f131333m = new C52847n<>(Integer.valueOf(this.f131327g.f107116i), Integer.valueOf(this.f131327g.f107117j));
        this.f131334n = this.f131327g.mo86361c();
        this.f131335o = C39618d.f101152P.mo83103a(C40790a.EnableEffectNewEngine);
        this.f131336p = !C39618d.f101152P.mo83103a(C40790a.CameraOptionFlagsOpt);
        this.f131337q = C39618d.f101152P.mo83103a(C40790a.EnableEffectParallelFwk);
        this.f131338r = C39618d.f101152P.mo83103a(C40790a.EnableThreeBuffer);
    }
}
