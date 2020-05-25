package com.p683ss.android.ugc.asve.sandbox;

import android.view.SurfaceHolder;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.context.C20357d;
import com.p683ss.android.ugc.asve.context.C20361f;
import com.p683ss.android.ugc.asve.context.C20362g;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.p1238b.C20318a;
import com.p683ss.android.ugc.asve.p1238b.C20318a.C20319a;
import com.p683ss.android.ugc.asve.p1238b.C20323e;
import com.p683ss.android.ugc.asve.p1238b.C20323e.C20324a;
import com.p683ss.android.ugc.asve.p1238b.C20331k;
import com.p683ss.android.ugc.asve.p1238b.C20331k.C20332a;
import com.p683ss.android.ugc.asve.p1238b.C20337p;
import com.p683ss.android.ugc.asve.p1238b.C20337p.C20338a;
import com.p683ss.android.ugc.asve.recorder.C20504f;
import com.p683ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxCameraContextWrapper;
import com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxCodecContextWrapper;
import com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxDuetContextWrapper;
import com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxReactionContextWrapper;
import com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxWorkspaceProviderWrapper;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.c */
public final class C20739c implements C20363h {

    /* renamed from: a */
    public C20809p f56545a;

    /* renamed from: b */
    public final ASSandBoxRecorderContextWrapper f56546b;

    /* renamed from: c */
    private final boolean f56547c;

    /* renamed from: d */
    private final C20504f f56548d = new C20744e(this);

    /* renamed from: e */
    private final C20355c f56549e = new C20740a(this);

    /* renamed from: f */
    private final C20357d f56550f = new C20741b(this);

    /* renamed from: g */
    private final C20362g f56551g = new C20743d(this);

    /* renamed from: h */
    private final C20361f f56552h = new C20742c(this);

    /* renamed from: i */
    private final C52847n<Integer, Integer> f56553i = new C52847n<>(Integer.valueOf(this.f56546b.f56698g), Integer.valueOf(this.f56546b.f56699h));

    /* renamed from: j */
    private final boolean f56554j = this.f56546b.f56700i;

    /* renamed from: k */
    private final boolean f56555k = this.f56546b.f56701j;

    /* renamed from: l */
    private final boolean f56556l = this.f56546b.f56702k;

    /* renamed from: m */
    private final boolean f56557m = this.f56546b.f56705n;

    /* renamed from: n */
    private final boolean f56558n = this.f56546b.f56703l;

    /* renamed from: o */
    private final boolean f56559o = this.f56546b.f56704m;

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$a */
    public static final class C20740a implements C20355c {

        /* renamed from: a */
        final /* synthetic */ C20739c f56560a;

        /* renamed from: b */
        private final C20331k f56561b;

        /* renamed from: c */
        private final C20323e f56562c;

        /* renamed from: d */
        private final C20318a f56563d;

        /* renamed from: e */
        private final boolean f56564e;

        /* renamed from: f */
        private final byte f56565f;

        /* renamed from: g */
        private final boolean f56566g;

        /* renamed from: h */
        private final int[] f56567h;

        /* renamed from: a */
        public final C20331k mo43109a() {
            return this.f56561b;
        }

        /* renamed from: b */
        public final C20323e mo43110b() {
            return this.f56562c;
        }

        /* renamed from: c */
        public final C20318a mo43111c() {
            return this.f56563d;
        }

        /* renamed from: d */
        public final boolean mo43112d() {
            return this.f56564e;
        }

        /* renamed from: e */
        public final byte mo43113e() {
            return this.f56565f;
        }

        /* renamed from: f */
        public final boolean mo43114f() {
            return this.f56566g;
        }

        /* renamed from: g */
        public final int mo43115g() {
            return R.drawable.z8;
        }

        /* renamed from: h */
        public final int[] mo43116h() {
            return this.f56567h;
        }

        C20740a(C20739c cVar) {
            this.f56560a = cVar;
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper = cVar.f56546b.f56692a;
            C52711k.m112236a((Object) sandBoxCameraContextWrapper, "recorderContext.sandBoxCameraContextWrapper");
            this.f56561b = C20332a.m50105a(sandBoxCameraContextWrapper.f56730a);
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper2 = cVar.f56546b.f56692a;
            C52711k.m112236a((Object) sandBoxCameraContextWrapper2, "recorderContext.sandBoxCameraContextWrapper");
            this.f56562c = C20324a.m50102a(sandBoxCameraContextWrapper2.f56731b);
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper3 = cVar.f56546b.f56692a;
            C52711k.m112236a((Object) sandBoxCameraContextWrapper3, "recorderContext.sandBoxCameraContextWrapper");
            this.f56563d = C20319a.m50100a(sandBoxCameraContextWrapper3.f56732c);
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper4 = cVar.f56546b.f56692a;
            C52711k.m112236a((Object) sandBoxCameraContextWrapper4, "recorderContext.sandBoxCameraContextWrapper");
            this.f56564e = sandBoxCameraContextWrapper4.f56733d;
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper5 = cVar.f56546b.f56692a;
            C52711k.m112236a((Object) sandBoxCameraContextWrapper5, "recorderContext.sandBoxCameraContextWrapper");
            this.f56565f = (byte) sandBoxCameraContextWrapper5.f56734e;
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper6 = cVar.f56546b.f56692a;
            C52711k.m112236a((Object) sandBoxCameraContextWrapper6, "recorderContext.sandBoxCameraContextWrapper");
            this.f56566g = sandBoxCameraContextWrapper6.f56735f;
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper7 = cVar.f56546b.f56692a;
            C52711k.m112236a((Object) sandBoxCameraContextWrapper7, "recorderContext.sandBoxCameraContextWrapper");
            int[] iArr = sandBoxCameraContextWrapper7.f56736g;
            C52711k.m112236a((Object) iArr, "recorderContext.sandBoxC…ContextWrapper.renderSize");
            this.f56567h = iArr;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$b */
    public static final class C20741b implements C20357d {

        /* renamed from: a */
        final /* synthetic */ C20739c f56568a;

        /* renamed from: b */
        private final boolean f56569b;

        /* renamed from: c */
        private final boolean f56570c;

        /* renamed from: d */
        private final float f56571d;

        /* renamed from: e */
        private final float f56572e;

        /* renamed from: f */
        private final C20337p f56573f;

        /* renamed from: g */
        private final int f56574g;

        /* renamed from: h */
        private final boolean f56575h;

        /* renamed from: i */
        private final String f56576i;

        /* renamed from: a */
        public final float mo43136a() {
            return this.f56571d;
        }

        /* renamed from: b */
        public final boolean mo43137b() {
            return this.f56570c;
        }

        /* renamed from: c */
        public final float mo43138c() {
            return this.f56572e;
        }

        /* renamed from: d */
        public final boolean mo43139d() {
            return this.f56569b;
        }

        /* renamed from: e */
        public final int mo43140e() {
            return this.f56574g;
        }

        /* renamed from: f */
        public final C20337p mo43141f() {
            return this.f56573f;
        }

        /* renamed from: g */
        public final boolean mo43142g() {
            return this.f56575h;
        }

        /* renamed from: h */
        public final String mo43143h() {
            return this.f56576i;
        }

        C20741b(C20739c cVar) {
            this.f56568a = cVar;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper = cVar.f56546b.f56693b;
            C52711k.m112236a((Object) sandBoxCodecContextWrapper, "recorderContext.sandBoxCodecContextWrapper");
            this.f56569b = sandBoxCodecContextWrapper.f56740d;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper2 = cVar.f56546b.f56693b;
            C52711k.m112236a((Object) sandBoxCodecContextWrapper2, "recorderContext.sandBoxCodecContextWrapper");
            this.f56570c = sandBoxCodecContextWrapper2.f56738b;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper3 = cVar.f56546b.f56693b;
            C52711k.m112236a((Object) sandBoxCodecContextWrapper3, "recorderContext.sandBoxCodecContextWrapper");
            this.f56571d = sandBoxCodecContextWrapper3.f56737a;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper4 = cVar.f56546b.f56693b;
            C52711k.m112236a((Object) sandBoxCodecContextWrapper4, "recorderContext.sandBoxCodecContextWrapper");
            this.f56572e = sandBoxCodecContextWrapper4.f56739c;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper5 = cVar.f56546b.f56693b;
            C52711k.m112236a((Object) sandBoxCodecContextWrapper5, "recorderContext.sandBoxCodecContextWrapper");
            this.f56573f = C20338a.m50107a(sandBoxCodecContextWrapper5.f56742f);
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper6 = cVar.f56546b.f56693b;
            C52711k.m112236a((Object) sandBoxCodecContextWrapper6, "recorderContext.sandBoxCodecContextWrapper");
            this.f56574g = sandBoxCodecContextWrapper6.f56741e;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper7 = cVar.f56546b.f56693b;
            C52711k.m112236a((Object) sandBoxCodecContextWrapper7, "recorderContext.sandBoxCodecContextWrapper");
            this.f56575h = sandBoxCodecContextWrapper7.f56743g;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper8 = cVar.f56546b.f56693b;
            C52711k.m112236a((Object) sandBoxCodecContextWrapper8, "recorderContext.sandBoxCodecContextWrapper");
            this.f56576i = sandBoxCodecContextWrapper8.f56744h;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$c */
    public static final class C20742c implements C20361f {

        /* renamed from: a */
        final /* synthetic */ C20739c f56577a;

        /* renamed from: b */
        private final boolean f56578b;

        /* renamed from: c */
        private final String f56579c;

        /* renamed from: d */
        private final String f56580d;

        /* renamed from: e */
        private final int f56581e;

        /* renamed from: f */
        private final int f56582f;

        /* renamed from: a */
        public final boolean mo43173a() {
            return this.f56578b;
        }

        /* renamed from: b */
        public final String mo43174b() {
            return this.f56579c;
        }

        /* renamed from: c */
        public final String mo43175c() {
            return this.f56580d;
        }

        /* renamed from: d */
        public final int mo43176d() {
            return this.f56581e;
        }

        /* renamed from: e */
        public final int mo43177e() {
            return this.f56582f;
        }

        /* renamed from: f */
        public final boolean mo43178f() {
            return false;
        }

        C20742c(C20739c cVar) {
            this.f56577a = cVar;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper = cVar.f56546b.f56696e;
            C52711k.m112236a((Object) sandBoxDuetContextWrapper, "recorderContext.sandBoxDuetContextWrapper");
            this.f56578b = sandBoxDuetContextWrapper.f56745a;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper2 = cVar.f56546b.f56696e;
            C52711k.m112236a((Object) sandBoxDuetContextWrapper2, "recorderContext.sandBoxDuetContextWrapper");
            this.f56579c = sandBoxDuetContextWrapper2.f56746b;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper3 = cVar.f56546b.f56696e;
            C52711k.m112236a((Object) sandBoxDuetContextWrapper3, "recorderContext.sandBoxDuetContextWrapper");
            this.f56580d = sandBoxDuetContextWrapper3.f56747c;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper4 = cVar.f56546b.f56696e;
            C52711k.m112236a((Object) sandBoxDuetContextWrapper4, "recorderContext.sandBoxDuetContextWrapper");
            this.f56581e = sandBoxDuetContextWrapper4.f56748d;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper5 = cVar.f56546b.f56696e;
            C52711k.m112236a((Object) sandBoxDuetContextWrapper5, "recorderContext.sandBoxDuetContextWrapper");
            this.f56582f = sandBoxDuetContextWrapper5.f56749e;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$d */
    public static final class C20743d implements C20362g {

        /* renamed from: a */
        final /* synthetic */ C20739c f56583a;

        /* renamed from: b */
        private final String f56584b;

        /* renamed from: c */
        private final String f56585c;

        /* renamed from: d */
        private final float f56586d;

        /* renamed from: e */
        private final boolean f56587e;

        /* renamed from: f */
        private final int f56588f;

        /* renamed from: g */
        private final int f56589g;

        /* renamed from: h */
        private final int f56590h;

        /* renamed from: a */
        public final String mo43179a() {
            return this.f56584b;
        }

        /* renamed from: b */
        public final String mo43180b() {
            return this.f56585c;
        }

        /* renamed from: c */
        public final float mo43181c() {
            return this.f56586d;
        }

        /* renamed from: d */
        public final boolean mo43182d() {
            return this.f56587e;
        }

        /* renamed from: e */
        public final int mo43183e() {
            return this.f56588f;
        }

        /* renamed from: f */
        public final int mo43184f() {
            return this.f56589g;
        }

        /* renamed from: g */
        public final int mo43185g() {
            return this.f56590h;
        }

        C20743d(C20739c cVar) {
            this.f56583a = cVar;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper = cVar.f56546b.f56695d;
            C52711k.m112236a((Object) sandBoxReactionContextWrapper, "recorderContext.sandBoxReactionContextWrapper");
            this.f56584b = sandBoxReactionContextWrapper.f56750a;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper2 = cVar.f56546b.f56695d;
            C52711k.m112236a((Object) sandBoxReactionContextWrapper2, "recorderContext.sandBoxReactionContextWrapper");
            this.f56585c = sandBoxReactionContextWrapper2.f56751b;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper3 = cVar.f56546b.f56695d;
            C52711k.m112236a((Object) sandBoxReactionContextWrapper3, "recorderContext.sandBoxReactionContextWrapper");
            this.f56586d = sandBoxReactionContextWrapper3.f56752c;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper4 = cVar.f56546b.f56695d;
            C52711k.m112236a((Object) sandBoxReactionContextWrapper4, "recorderContext.sandBoxReactionContextWrapper");
            this.f56587e = sandBoxReactionContextWrapper4.f56753d;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper5 = cVar.f56546b.f56695d;
            C52711k.m112236a((Object) sandBoxReactionContextWrapper5, "recorderContext.sandBoxReactionContextWrapper");
            this.f56588f = sandBoxReactionContextWrapper5.f56754e;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper6 = cVar.f56546b.f56695d;
            C52711k.m112236a((Object) sandBoxReactionContextWrapper6, "recorderContext.sandBoxReactionContextWrapper");
            this.f56589g = sandBoxReactionContextWrapper6.f56755f;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper7 = cVar.f56546b.f56695d;
            C52711k.m112236a((Object) sandBoxReactionContextWrapper7, "recorderContext.sandBoxReactionContextWrapper");
            this.f56590h = sandBoxReactionContextWrapper7.f56756g;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$e */
    public static final class C20744e implements C20504f {

        /* renamed from: a */
        final /* synthetic */ C20739c f56591a;

        /* renamed from: b */
        private final File f56592b;

        /* renamed from: c */
        private final File f56593c;

        /* renamed from: d */
        private final File f56594d;

        /* renamed from: e */
        private final File f56595e;

        /* renamed from: f */
        private final File f56596f;

        /* renamed from: a */
        public final File mo43186a() {
            return this.f56593c;
        }

        /* renamed from: b */
        public final File mo43188b() {
            return this.f56594d;
        }

        /* renamed from: c */
        public final File mo43190c() {
            return this.f56595e;
        }

        /* renamed from: d */
        public final File mo43191d() {
            return this.f56596f;
        }

        /* renamed from: e */
        public final File mo43192e() {
            return this.f56592b;
        }

        /* renamed from: a */
        public final String mo43187a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(File.separator);
            sb.append(i);
            sb.append(".mp4");
            return sb.toString();
        }

        /* renamed from: b */
        public final String mo43189b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(File.separator);
            sb.append(i);
            sb.append(".wav");
            return sb.toString();
        }

        C20744e(C20739c cVar) {
            this.f56591a = cVar;
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper = cVar.f56546b.f56694c;
            C52711k.m112236a((Object) sandBoxWorkspaceProviderWrapper, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56592b = new File(sandBoxWorkspaceProviderWrapper.f56757a);
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper2 = cVar.f56546b.f56694c;
            C52711k.m112236a((Object) sandBoxWorkspaceProviderWrapper2, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56593c = new File(sandBoxWorkspaceProviderWrapper2.f56757a);
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper3 = cVar.f56546b.f56694c;
            C52711k.m112236a((Object) sandBoxWorkspaceProviderWrapper3, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56594d = new File(sandBoxWorkspaceProviderWrapper3.f56758b);
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper4 = cVar.f56546b.f56694c;
            C52711k.m112236a((Object) sandBoxWorkspaceProviderWrapper4, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56595e = new File(sandBoxWorkspaceProviderWrapper4.f56759c);
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper5 = cVar.f56546b.f56694c;
            C52711k.m112236a((Object) sandBoxWorkspaceProviderWrapper5, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56596f = new File(sandBoxWorkspaceProviderWrapper5.f56760d);
        }
    }

    /* renamed from: a */
    public final Boolean mo43117a() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo43118b() {
        return false;
    }

    /* renamed from: c */
    public final SurfaceHolder mo43119c() {
        return null;
    }

    /* renamed from: d */
    public final C20504f mo43120d() {
        return this.f56548d;
    }

    /* renamed from: e */
    public final C52847n<Integer, Integer> mo43121e() {
        return this.f56553i;
    }

    /* renamed from: f */
    public final boolean mo43122f() {
        return this.f56554j;
    }

    /* renamed from: g */
    public final boolean mo43123g() {
        return this.f56555k;
    }

    /* renamed from: h */
    public final boolean mo43124h() {
        return this.f56558n;
    }

    /* renamed from: i */
    public final boolean mo43125i() {
        return this.f56559o;
    }

    /* renamed from: j */
    public final C20361f mo43126j() {
        return this.f56552h;
    }

    /* renamed from: k */
    public final C20362g mo43127k() {
        return this.f56551g;
    }

    /* renamed from: l */
    public final C20357d mo43128l() {
        return this.f56550f;
    }

    /* renamed from: m */
    public final C20355c mo43129m() {
        return this.f56549e;
    }

    /* renamed from: n */
    public final boolean mo43130n() {
        return this.f56547c;
    }

    /* renamed from: o */
    public final C20809p mo43131o() {
        return this.f56545a;
    }

    /* renamed from: p */
    public final boolean mo43132p() {
        return this.f56556l;
    }

    /* renamed from: q */
    public final boolean mo43133q() {
        return this.f56557m;
    }

    /* renamed from: r */
    public final boolean mo43134r() {
        return false;
    }

    /* renamed from: s */
    public final long mo43135s() {
        return 0;
    }

    public C20739c(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) {
        C52711k.m112240b(aSSandBoxRecorderContextWrapper, "recorderContext");
        this.f56546b = aSSandBoxRecorderContextWrapper;
    }
}
