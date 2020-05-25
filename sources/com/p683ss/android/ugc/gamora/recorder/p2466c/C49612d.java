package com.p683ss.android.ugc.gamora.recorder.p2466c;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2767k;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12931a;
import com.p683ss.android.ugc.asve.recorder.C20420b;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42475bt;
import com.p683ss.android.ugc.aweme.shortvideo.C42476bu;
import com.p683ss.android.ugc.aweme.shortvideo.C42479bx;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43309ec;
import com.p683ss.android.ugc.aweme.shortvideo.C45325v;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.record.p2224b.C44451a;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.tools.C47062g;
import com.p683ss.android.ugc.aweme.tools.C47324o;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49578c;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.ss.android.ugc.trill.R;
import java.io.File;
import org.libsdl.app.AudioRecorderInterface;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52855s;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.c.d */
public final class C49612d extends C2764h<C49607a> implements C12356a, C49548a, C49607a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124454a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49612d.class), "activity", "getActivity()Landroid/support/v4/app/FragmentActivity;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49612d.class), "cameraApi", "getCameraApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/CameraApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49612d.class), "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49612d.class), "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49612d.class), "shortVideoContextViewModel", "getShortVideoContextViewModel()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49612d.class), "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49612d.class), "chooseMusicHandler", "getChooseMusicHandler()Lcom/ss/android/ugc/aweme/shortvideo/ChooseMusicHandler;"))};

    /* renamed from: b */
    public final C2765i<C52860x> f124455b = new C2765i<>();

    /* renamed from: c */
    public final C2765i<C52860x> f124456c = new C2765i<>();

    /* renamed from: d */
    public final C12896b f124457d;

    /* renamed from: e */
    private final C49609b f124458e;

    /* renamed from: f */
    private final C52668f f124459f = C52732g.m112286a(C52757k.NONE, new C49613a(this, null));

    /* renamed from: g */
    private final C52668f f124460g = C52732g.m112286a(C52757k.NONE, new C49614b(this, null));

    /* renamed from: h */
    private final C52668f f124461h = C52732g.m112286a(C52757k.NONE, new C49615c(this, null));

    /* renamed from: i */
    private final C52668f f124462i = C52732g.m112286a(C52757k.NONE, new C49616d(this, null));

    /* renamed from: j */
    private final C52668f f124463j = C52732g.m112286a(C52757k.NONE, new C49618f(this));

    /* renamed from: k */
    private final C52668f f124464k = C52732g.m112286a(C52757k.NONE, new C49617e(this, null));

    /* renamed from: l */
    private final C52668f f124465l = C52732g.m112285a(new C49619g(this));

    /* renamed from: m */
    private final C12361b f124466m;

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$a */
    public static final class C49613a extends C52712l implements C52670a<FragmentActivity> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124467a;

        /* renamed from: b */
        final /* synthetic */ String f124468b;

        public C49613a(C12356a aVar, String str) {
            this.f124467a = aVar;
            this.f124468b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [android.support.v4.app.FragmentActivity, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [android.support.v4.app.FragmentActivity, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [android.support.v4.app.FragmentActivity]
          mth insns count: 6
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.support.p030v4.app.FragmentActivity invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124467a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<android.support.v4.app.FragmentActivity> r1 = android.support.p030v4.app.FragmentActivity.class
                java.lang.String r2 = r3.f124468b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2466c.C49612d.C49613a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$b */
    public static final class C49614b extends C52712l implements C52670a<C45004a> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124469a;

        /* renamed from: b */
        final /* synthetic */ String f124470b;

        public C49614b(C12356a aVar, String str) {
            this.f124469a = aVar;
            this.f124470b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ui.b.a, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ui.b.a, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.aweme.shortvideo.ui.b.a]
          mth insns count: 6
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124469a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ui.b.a> r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a.class
                java.lang.String r2 = r3.f124470b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2466c.C49612d.C49614b.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$c */
    public static final class C49615c extends C52712l implements C52670a<C50048n> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124471a;

        /* renamed from: b */
        final /* synthetic */ String f124472b;

        public C49615c(C12356a aVar, String str) {
            this.f124471a = aVar;
            this.f124472b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.gamora.recorder.sticker.a.n, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.gamora.recorder.sticker.a.n, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.gamora.recorder.sticker.a.n]
          mth insns count: 6
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124471a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.sticker.a.n> r1 = com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n.class
                java.lang.String r2 = r3.f124472b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2466c.C49612d.C49615c.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$d */
    public static final class C49616d extends C52712l implements C52670a<C49577b> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124473a;

        /* renamed from: b */
        final /* synthetic */ String f124474b;

        public C49616d(C12356a aVar, String str) {
            this.f124473a = aVar;
            this.f124474b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.gamora.recorder.b.b] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [java.lang.Object, com.ss.android.ugc.gamora.recorder.b.b]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.gamora.recorder.b.b]
          mth insns count: 6
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124473a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.b.b> r1 = com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b.class
                java.lang.String r2 = r3.f124474b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2466c.C49612d.C49616d.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$e */
    public static final class C49617e extends C52712l implements C52670a<ShortVideoContext> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124475a;

        /* renamed from: b */
        final /* synthetic */ String f124476b;

        public C49617e(C12356a aVar, String str) {
            this.f124475a = aVar;
            this.f124476b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContext]
          mth insns count: 6
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124475a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContext> r1 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext.class
                java.lang.String r2 = r3.f124476b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2466c.C49612d.C49617e.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$f */
    public static final class C49618f extends C52712l implements C52670a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124477a;

        public C49618f(C12356a aVar) {
            this.f124477a = aVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel, android.arch.lifecycle.x] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v5, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel, android.arch.lifecycle.x]
          assigns: [android.arch.lifecycle.x]
          uses: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel]
          mth insns count: 9
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel invoke() {
            /*
                r2 = this;
                com.bytedance.m.a r0 = r2.f124477a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<android.support.v4.app.FragmentActivity> r1 = android.support.p030v4.app.FragmentActivity.class
                java.lang.Object r0 = r0.mo23372a(r1)
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m440a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r1 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                android.arch.lifecycle.x r0 = r0.mo359a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2466c.C49612d.C49618f.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$g */
    static final class C49619g extends C52712l implements C52670a<C45325v> {

        /* renamed from: a */
        final /* synthetic */ C49612d f124478a;

        C49619g(C49612d dVar) {
            this.f124478a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C45325v(this.f124478a.mo97530n(), this.f124478a.mo97531o(), this.f124478a, this.f124478a.mo97532p());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$h */
    static final class C49620h<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49625e f124479a;

        C49620h(C49625e eVar) {
            this.f124479a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00db, code lost:
            if (r2 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x012f, code lost:
            if (r2 != false) goto L_0x0131;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r13) {
            /*
                r12 = this;
                d.x r13 = (p2628d.C52860x) r13
                com.ss.android.ugc.gamora.recorder.c.e r13 = r12.f124479a
                android.support.v4.app.FragmentActivity r0 = r13.f124484a
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m440a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r1 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                android.arch.lifecycle.x r0 = r0.mo359a(r1)
                java.lang.String r1 = "ViewModelProviders.of(ac…extViewModel::class.java)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = (com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r0
                java.lang.String r1 = "viewModel"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
                com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.f107134a
                java.lang.String r3 = r3.f107131x
                com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.f107134a
                java.lang.String r3 = r3.f107132y
                com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
                java.lang.String r2 = "route"
                java.lang.String r3 = "1"
                com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
                java.lang.String r2 = "is_photo"
                boolean r0 = r0.mo86389b()
                if (r0 == 0) goto L_0x0047
                java.lang.String r0 = "1"
                goto L_0x0049
            L_0x0047:
                java.lang.String r0 = "0"
            L_0x0049:
                com.ss.android.ugc.aweme.app.f.c r0 = r1.mo47824a(r2, r0)
                java.lang.String r1 = "position"
                java.lang.String r2 = "shoot_page"
                com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r1, r2)
                org.json.JSONObject r0 = r0.mo47825b()
                java.lang.String r1 = "builder.build()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.shortvideo.az r1 = com.p683ss.android.ugc.aweme.shortvideo.C42438az.m93209a()
                java.lang.String r2 = "label"
                java.lang.String r3 = "shoot_page"
                com.ss.android.ugc.aweme.shortvideo.az r2 = r1.mo86526a(r2, r3)
                java.lang.String r3 = "ext_json"
                r2.mo86525a(r3, r0)
                boolean r2 = com.p683ss.android.ugc.aweme.status.C45733a.m99540a()
                if (r2 == 0) goto L_0x007c
                java.lang.String r2 = "is_commercial"
                java.lang.String r3 = "1"
                r1.mo86526a(r2, r3)
            L_0x007c:
                java.lang.String r2 = "change_music"
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f107329a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r1)
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r13.f124488e
                java.lang.String r1 = r1.f107132y
                com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                java.lang.String r3 = "PublishManager.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r2 = r2.f109287b
                r3 = r1
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.String r4 = "challenge"
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x00ea
                r3 = r2
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
                if (r3 != 0) goto L_0x00ea
                java.lang.String r3 = "avChallenges"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.lang.Object r3 = p2628d.p2629a.C52575l.m112140f(r2)
                if (r3 != 0) goto L_0x00b6
                goto L_0x00ea
            L_0x00b6:
                java.lang.Object r3 = p2628d.p2629a.C52575l.m112140f(r2)
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r3 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r3
                if (r3 == 0) goto L_0x00ea
                boolean r3 = r3.isCommerce
                if (r3 == r4) goto L_0x00c3
                goto L_0x00ea
            L_0x00c3:
                java.lang.String r3 = "music_button_click_monitor"
                com.ss.android.ugc.aweme.shortvideo.ay r6 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
                java.lang.String r7 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.ay r1 = r6.mo86521a(r7, r1)
                java.lang.String r6 = "challenge_id"
                java.lang.Object r2 = r2.get(r5)
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r2 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r2
                if (r2 == 0) goto L_0x00dd
                java.lang.String r2 = r2.cid
                if (r2 != 0) goto L_0x00df
            L_0x00dd:
                java.lang.String r2 = ""
            L_0x00df:
                com.ss.android.ugc.aweme.shortvideo.ay r1 = r1.mo86521a(r6, r2)
                org.json.JSONObject r1 = r1.mo86522b()
                com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r3, r5, r1)
            L_0x00ea:
                com.ss.android.ugc.aweme.shortvideo.ui.b.a r1 = r13.f124485b
                com.ss.android.ugc.asve.recorder.view.ASCameraView r1 = r1.mo91307M()
                com.ss.android.ugc.asve.recorder.effect.b r1 = r1.getEffectController()
                r1.mo43526f(r4)
                android.os.Bundle r9 = new android.os.Bundle
                r9.<init>()
                android.support.v4.app.FragmentActivity r1 = r13.f124484a
                android.content.Intent r1 = r1.getIntent()
                java.lang.String r2 = "sticker_music"
                java.io.Serializable r1 = r1.getSerializableExtra(r2)
                if (r1 == 0) goto L_0x0131
                com.ss.android.ugc.gamora.recorder.sticker.a.n r2 = r13.f124486c
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r13.f124488e
                com.ss.android.ugc.aweme.shortvideo.em r3 = r3.f107119l
                if (r3 == 0) goto L_0x011b
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r3 = p2628d.p2629a.C52575l.m112140f(r3)
                com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r3 = (com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension) r3
                goto L_0x011c
            L_0x011b:
                r3 = 0
            L_0x011c:
                if (r3 == 0) goto L_0x0123
                boolean r2 = r3.isBusiSticker()
                goto L_0x012f
            L_0x0123:
                com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r2 = r2.mo97798C()
                if (r2 == 0) goto L_0x012e
                boolean r2 = r2.isBusi()
                goto L_0x012f
            L_0x012e:
                r2 = 0
            L_0x012f:
                if (r2 == 0) goto L_0x01da
            L_0x0131:
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r13.f124488e
                com.ss.android.ugc.aweme.shortvideo.em r2 = r2.f107119l
                java.lang.String r3 = "shortVideoContext.mDurings"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r2 = p2628d.p2629a.C52575l.m112140f(r2)
                com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r2 = (com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension) r2
                if (r2 == 0) goto L_0x018e
                java.util.List r3 = r2.getStickerMusicIds()
                r6 = r3
                java.util.Collection r6 = (java.util.Collection) r6
                if (r6 == 0) goto L_0x0155
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L_0x0154
                goto L_0x0155
            L_0x0154:
                r4 = 0
            L_0x0155:
                if (r4 != 0) goto L_0x0180
                com.google.gson.f r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101161b
                java.lang.String r3 = r4.mo34889b(r3)
                java.lang.String r4 = "first_sticker_music_ids"
                r9.putString(r4, r3)
                java.lang.String r3 = "first_sticker_id"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = r2.getStickerId()
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                r9.putString(r3, r4)
                java.lang.String r3 = "is_busi_sticker"
                boolean r4 = r2.isBusiSticker()
                r9.putBoolean(r3, r4)
            L_0x0180:
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r2 = r2.getHashtag()
                if (r2 == 0) goto L_0x01da
                java.lang.String r3 = "challenge"
                java.lang.String r2 = r2.cid
                r9.putString(r3, r2)
                goto L_0x01da
            L_0x018e:
                com.ss.android.ugc.gamora.recorder.sticker.a.n r2 = r13.f124486c
                com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r2 = r2.mo97798C()
                if (r2 == 0) goto L_0x01da
                java.util.List r3 = r2.getMusicIds()
                if (r3 == 0) goto L_0x01cb
                int r4 = r3.size()
                if (r4 <= 0) goto L_0x01cb
                com.google.gson.f r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101161b
                java.lang.String r3 = r4.mo34889b(r3)
                java.lang.String r4 = "first_sticker_music_ids"
                r9.putString(r4, r3)
                java.lang.String r3 = "first_sticker_id"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                long r6 = r2.getStickerId()
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                r9.putString(r3, r4)
                java.lang.String r3 = "is_busi_sticker"
                boolean r2 = r2.isBusi()
                r9.putBoolean(r3, r2)
            L_0x01cb:
                com.ss.android.ugc.gamora.recorder.sticker.a.n r2 = r13.f124486c
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r2 = r2.mo97799D()
                if (r2 == 0) goto L_0x01da
                java.lang.String r3 = "challenge"
                java.lang.String r2 = r2.cid
                r9.putString(r3, r2)
            L_0x01da:
                com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                java.lang.String r3 = "PublishManager.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r2 = r2.f109287b
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0203
                java.lang.String r2 = "challenge"
                com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                java.lang.String r4 = "PublishManager.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r3 = r3.f109287b
                java.lang.Object r3 = r3.get(r5)
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r3 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r3
                java.lang.String r3 = r3.cid
                r9.putString(r2, r3)
            L_0x0203:
                java.lang.String r2 = "sticker_music"
                r9.putSerializable(r2, r1)
                com.ss.android.ugc.gamora.recorder.sticker.a.n r1 = r13.f124486c
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r13.f124488e
                com.ss.android.ugc.aweme.sticker.model.a r2 = r2.f107126s
                if (r2 == 0) goto L_0x0217
                com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.e r1 = r1.mo97824x()
                r1.mo93193d()
            L_0x0217:
                android.support.v4.f.k r0 = com.p683ss.android.ugc.gamora.recorder.p2466c.C49625e.m107113a(r0)
                com.ss.android.ugc.aweme.port.in.ab r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101168i
                android.support.v4.app.FragmentActivity r2 = r13.f124484a
                android.app.Activity r2 = (android.app.Activity) r2
                r3 = 110(0x6e, float:1.54E-43)
                android.support.v4.app.FragmentActivity r4 = r13.f124484a
                r5 = 2132542665(0x7f1c04c9, float:2.0738441E38)
                java.lang.String r6 = r4.getString(r5)
                r7 = 2
                r8 = 1
                F r4 = r0.f2711a
                r10 = r4
                java.lang.String r10 = (java.lang.String) r10
                S r0 = r0.f2712b
                r11 = r0
                java.lang.String r11 = (java.lang.String) r11
                com.ss.android.ugc.aweme.bw.a.c r4 = com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24432c.C24433a.m59808a(r6, r7, r8, r9, r10, r11)
                com.ss.android.ugc.gamora.recorder.c.e$a r0 = new com.ss.android.ugc.gamora.recorder.c.e$a
                r0.<init>(r13)
                r5 = r0
                d.f.a.b r5 = (p2628d.p2639f.p2640a.C52671b) r5
                com.ss.android.ugc.gamora.recorder.c.e$b r0 = new com.ss.android.ugc.gamora.recorder.c.e$b
                r0.<init>(r13)
                r6 = r0
                d.f.a.a r6 = (p2628d.p2639f.p2640a.C52670a) r6
                r1.mo80572a(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2466c.C49612d.C49620h.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$i */
    static final class C49621i<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49612d f124480a;

        C49621i(C49612d dVar) {
            this.f124480a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                C12931a.m25973a(this.f124480a.f124457d, "RecordChooseMusicScene");
            } else {
                C12931a.m25974b(this.f124480a.f124457d, "RecordChooseMusicScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$j */
    static final class C49622j<T> implements C2767k<C47337r> {

        /* renamed from: a */
        final /* synthetic */ C49612d f124481a;

        C49622j(C49612d dVar) {
            this.f124481a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C47337r rVar = (C47337r) obj;
            C52711k.m112236a((Object) rVar, "ev");
            if (rVar.f119494c != 0 || !rVar.f119493b.isEmpty() || this.f124481a.mo97532p().f107122o) {
                z = false;
            } else {
                z = true;
            }
            C49612d dVar = this.f124481a;
            if (dVar.mo97532p().mo86365f() || dVar.mo97532p().mo86366g() || dVar.mo97532p().mo86368i()) {
                dVar.mo97517a(Boolean.valueOf(false), (Boolean) null, (Boolean) null);
                return;
            }
            if (dVar.mo97532p().mo86362d()) {
                z = false;
            }
            dVar.mo97519a(z);
            dVar.mo97529b(z);
            if (z) {
                if (C43214dh.m94817a().mo50201b() == null) {
                    dVar.mo97515a((C42482c) null);
                }
            } else if (C43214dh.m94817a().mo50201b() != null && dVar.mo97532p().mo86361c()) {
                dVar.mo97515a(C43214dh.m94817a().mo50201b());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$k */
    static final class C49623k<T> implements C2767k<C49578c> {

        /* renamed from: a */
        final /* synthetic */ C49612d f124482a;

        C49623k(C49612d dVar) {
            this.f124482a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C49578c cVar = (C49578c) obj;
            Object obj2 = cVar.f124357c;
            if (obj2 != null) {
                if (!TextUtils.equals((CharSequence) obj2, C39629l.m88233b().getString(R.string.d5n))) {
                    Object obj3 = cVar.f124357c;
                    if (obj3 == null) {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    } else if (!TextUtils.equals((CharSequence) obj3, C39629l.m88233b().getString(R.string.d5h))) {
                        if (!this.f124482a.mo97532p().mo86365f() && !this.f124482a.mo97532p().mo86366g()) {
                            this.f124482a.mo97517a((Boolean) null, Boolean.valueOf(true), Boolean.valueOf(true));
                            return;
                        }
                        return;
                    }
                }
                this.f124482a.mo97517a((Boolean) null, Boolean.valueOf(false), Boolean.valueOf(false));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.d$l */
    static final class C49624l<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49612d f124483a;

        C49624l(C49612d dVar) {
            this.f124483a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52860x xVar = (C52860x) obj;
            this.f124483a.mo97523k();
        }
    }

    /* renamed from: q */
    private final C50048n m107077q() {
        return (C50048n) this.f124461h.getValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this;
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124466m;
    }

    /* renamed from: n */
    public final FragmentActivity mo97530n() {
        return (FragmentActivity) this.f124459f.getValue();
    }

    /* renamed from: o */
    public final C45004a mo97531o() {
        return (C45004a) this.f124460g.getValue();
    }

    /* renamed from: p */
    public final ShortVideoContext mo97532p() {
        return (ShortVideoContext) this.f124464k.getValue();
    }

    /* renamed from: a */
    public final void mo97517a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            this.f124458e.f124441a.mo7345a(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            this.f124458e.f124443c.mo7345a(Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool3 != null) {
            this.f124458e.f124442b.mo7345a(Boolean.valueOf(bool3.booleanValue()));
        }
    }

    /* renamed from: a */
    public final void mo97519a(boolean z) {
        this.f124458e.f124448h.mo7350a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo97518a(Integer num) {
        this.f124458e.f124449i.mo7350a(num);
    }

    /* renamed from: a */
    public final void mo97520a(boolean z, String str, C42482c cVar, String str2) {
        if (z) {
            mo97515a((C42482c) null);
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            mo97515a(cVar);
            this.f124458e.f124445e.mo7350a(null);
        }
    }

    /* renamed from: a */
    public final void mo97516a(C47062g gVar) {
        C52711k.m112240b(gVar, "event");
        C42482c cVar = gVar.f118843a;
        if (cVar != null) {
            String str = gVar.f118844b;
            boolean c = mo97532p().mo86361c();
            m107078r().mo43640e(true);
            mo97532p().f107118k.mo86453a(new File(str));
            mo97532p().f107112e = str;
            m107078r().setMusicPath(str);
            m107078r().mo43630a(str, 0, 0);
            m107078r().mo43633b(true);
            m107078r().mo43637d(false);
            m107077q().mo97810d(true);
            if (!c) {
                ASCameraView r = m107078r();
                Context n = mo97530n();
                AudioRecorderInterface a = mo97531o().mo91306L().mo90324a();
                C52711k.m112240b(n, "context");
                C20420b bVar = r.f56318e;
                if (bVar == null) {
                    C52711k.m112237a("recorder");
                }
                bVar.mo43257e().mo43301b(n, a);
            }
            int i = cVar.duration;
            if (i > 0) {
                mo97532p().f107114g = i;
            }
            UrlModel urlModel = cVar.audioTrack;
            if (urlModel != null) {
                mo97532p().f107111d = urlModel;
            }
            if (!mo97532p().mo86362d()) {
                mo97532p().f107113f = 0;
            }
            m107077q().mo97806K();
        }
        if (cVar == null) {
            this.f124456c.mo7350a(C52860x.f131107a);
        } else {
            this.f124455b.mo7350a(C52860x.f131107a);
        }
        if (!mo97532p().f107088an) {
            mo97531o().mo91356b(mo97532p().f107089ao, false);
        }
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2762f mo97521e() {
        return this.f124455b;
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2762f mo97522g() {
        return this.f124456c;
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* renamed from: r */
    private final ASCameraView m107078r() {
        return mo97531o().mo91307M();
    }

    /* renamed from: k */
    public final void mo97523k() {
        this.f124458e.f124449i.mo7350a(null);
    }

    /* renamed from: m */
    public final void mo97525m() {
        this.f124458e.f124450j.mo7350a(null);
    }

    /* renamed from: l */
    public final void mo97524l() {
        m107078r().mo43637d(true);
        m107078r().mo43640e(false);
        m107078r().setMusicPath("");
        m107078r().mo43630a("", 0, 0);
        m107078r().mo43633b(false);
        m107077q().mo97805J();
        mo97532p().f107114g = 0;
        mo97532p().f107113f = 0;
        mo97532p().f107118k.mo86459f();
        mo97532p().f107112e = null;
        m107077q().mo97806K();
        this.f124456c.mo7350a(C52860x.f131107a);
        if (!mo97532p().f107088an) {
            mo97531o().mo91356b(mo97532p().f107089ao, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x020d, code lost:
        if (r2 == null) goto L_0x020f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bO_() {
        /*
            r9 = this;
            super.bO_()
            com.ss.android.ugc.gamora.recorder.c.e r6 = new com.ss.android.ugc.gamora.recorder.c.e
            android.support.v4.app.FragmentActivity r1 = r9.mo97530n()
            com.ss.android.ugc.aweme.shortvideo.ui.b.a r2 = r9.mo97531o()
            com.ss.android.ugc.gamora.recorder.sticker.a.n r3 = r9.m107077q()
            r4 = r9
            com.ss.android.ugc.gamora.recorder.c.a r4 = (com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a) r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r9.mo97532p()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.bytedance.scene.group.b r0 = r9.f124457d
            com.ss.android.ugc.gamora.recorder.c.f r1 = new com.ss.android.ugc.gamora.recorder.c.f
            com.ss.android.ugc.gamora.recorder.c.b r2 = r9.f124458e
            com.bytedance.m.b r3 = r9.mo23370j()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.g.a> r4 = com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a.class
            java.lang.Object r3 = r3.mo23372a(r4)
            com.ss.android.ugc.aweme.shortvideo.g.a r3 = (com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a) r3
            com.bytedance.als.g r3 = r3.mo89403e()
            r1.<init>(r2, r3)
            com.bytedance.scene.i r1 = (com.bytedance.scene.C12924i) r1
            java.lang.String r2 = "RecordChooseMusicScene"
            r3 = 2132022145(0x7f141381, float:1.9682701E38)
            r0.mo24389a(r3, r1, r2)
            com.ss.android.ugc.gamora.recorder.c.b r0 = r9.f124458e
            com.bytedance.als.i<d.x> r0 = r0.f124451k
            r1 = r9
            android.arch.lifecycle.k r1 = (android.arch.lifecycle.C0184k) r1
            com.ss.android.ugc.gamora.recorder.c.d$h r2 = new com.ss.android.ugc.gamora.recorder.c.d$h
            r2.<init>(r6)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r0.mo7349a(r1, r2)
            com.ss.android.ugc.gamora.recorder.c.b r0 = r9.f124458e
            com.bytedance.als.j<java.lang.Boolean> r0 = r0.f124441a
            com.ss.android.ugc.gamora.recorder.c.d$i r2 = new com.ss.android.ugc.gamora.recorder.c.d$i
            r2.<init>(r9)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r0.mo7352a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.ui.b.a r0 = r9.mo97531o()
            com.bytedance.als.f r0 = r0.mo91295A()
            com.ss.android.ugc.gamora.recorder.c.d$j r2 = new com.ss.android.ugc.gamora.recorder.c.d$j
            r2.<init>(r9)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r0.mo7349a(r1, r2)
            d.f r0 = r9.f124462i
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.gamora.recorder.b.b r0 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b) r0
            com.bytedance.als.f r0 = r0.mo97485e()
            com.ss.android.ugc.gamora.recorder.c.d$k r2 = new com.ss.android.ugc.gamora.recorder.c.d$k
            r2.<init>(r9)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r0.mo7349a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.mo97532p()
            boolean r0 = r0.mo86365f()
            if (r0 != 0) goto L_0x022c
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.mo97532p()
            boolean r0 = r0.mo86366g()
            if (r0 == 0) goto L_0x009c
            goto L_0x022c
        L_0x009c:
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            if (r0 == 0) goto L_0x022b
            com.ss.android.ugc.asve.recorder.view.ASCameraView r2 = r9.m107078r()
            r3 = 1
            r2.mo43640e(r3)
            com.ss.android.ugc.asve.recorder.view.ASCameraView r2 = r9.m107078r()
            r2.mo43633b(r3)
            com.ss.android.ugc.asve.recorder.view.ASCameraView r2 = r9.m107078r()
            r4 = 0
            r2.mo43637d(r4)
            r9.mo97515a(r0)
            r9.mo97529b(r4)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.mo97532p()
            if (r2 == 0) goto L_0x01b3
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.mo97532p()
            boolean r2 = r2.mo86359a()
            if (r2 == 0) goto L_0x01b3
            com.bytedance.scene.group.b r2 = r9.f124457d
            android.app.Activity r2 = r2.f33840g_
            if (r2 != 0) goto L_0x00dc
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00dc:
            java.lang.String r5 = "parentScene.activity!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r5 = "first_sticker"
            android.os.Parcelable r2 = r2.getParcelableExtra(r5)
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r2
            boolean r2 = com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a.m97421e(r2)
            if (r2 != 0) goto L_0x01b3
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.mo97532p()
            r2.mo86360b()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r9.mo97518a(r2)
            com.bytedance.m.b r2 = r9.mo23370j()
            java.lang.Class<com.ss.android.ugc.gamora.recorder.e.a> r5 = com.p683ss.android.ugc.gamora.recorder.p2468e.C49659a.class
            java.lang.Object r2 = r2.mo23372a(r5)
            com.ss.android.ugc.gamora.recorder.e.a r2 = (com.p683ss.android.ugc.gamora.recorder.p2468e.C49659a) r2
            r2.mo97558a(r3)
            com.bytedance.als.f r2 = r2.mo97560c()
            com.ss.android.ugc.gamora.recorder.c.d$l r5 = new com.ss.android.ugc.gamora.recorder.c.d$l
            r5.<init>(r9)
            com.bytedance.als.k r5 = (com.bytedance.als.C2767k) r5
            r2.mo7349a(r1, r5)
            java.lang.String r1 = "prop_reuse"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.mo97532p()
            java.lang.String r2 = r2.f107132y
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 != 0) goto L_0x013d
            java.lang.String r1 = "prop_page"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.mo97532p()
            java.lang.String r2 = r2.f107132y
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r1 = 0
            goto L_0x013e
        L_0x013d:
            r1 = 1
        L_0x013e:
            if (r1 == 0) goto L_0x01b3
            com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r1 = r1.mo50201b()
            if (r1 != 0) goto L_0x014b
            goto L_0x01b3
        L_0x014b:
            com.bytedance.scene.group.b r2 = r9.f124457d
            android.app.Activity r2 = r2.f33840g_
            if (r2 != 0) goto L_0x0154
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0154:
            java.lang.String r5 = "parentScene.activity!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r5 = "first_sticker"
            android.os.Parcelable r2 = r2.getParcelableExtra(r5)
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r2
            if (r2 != 0) goto L_0x0168
            goto L_0x01b3
        L_0x0168:
            java.lang.String r5 = "prop_music_show"
            com.ss.android.ugc.aweme.shortvideo.az r6 = com.p683ss.android.ugc.aweme.shortvideo.C42438az.m93209a()
            java.lang.String r7 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r8 = r9.mo97532p()
            java.lang.String r8 = r8.f107131x
            com.ss.android.ugc.aweme.shortvideo.az r6 = r6.mo86526a(r7, r8)
            java.lang.String r7 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r8 = r9.mo97532p()
            java.lang.String r8 = r8.f107132y
            com.ss.android.ugc.aweme.shortvideo.az r6 = r6.mo86526a(r7, r8)
            java.lang.String r7 = "enter_from"
            java.lang.String r8 = "video_shoot_page"
            com.ss.android.ugc.aweme.shortvideo.az r6 = r6.mo86526a(r7, r8)
            java.lang.String r7 = "music_id"
            java.lang.String r1 = r1.getMusicId()
            com.ss.android.ugc.aweme.shortvideo.az r1 = r6.mo86526a(r7, r1)
            java.lang.String r6 = "prop_id"
            java.lang.String r2 = r2.getEffectId()
            com.ss.android.ugc.aweme.shortvideo.az r1 = r1.mo86526a(r6, r2)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.shortvideo.ao r6 = com.p683ss.android.ugc.aweme.shortvideo.C42424ao.INSTANCE
            java.lang.String r6 = r6.getVideoId()
            com.ss.android.ugc.aweme.shortvideo.az r1 = r1.mo86526a(r2, r6)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f107329a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r1)
        L_0x01b3:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r9.mo97532p()
            java.lang.String r1 = r1.f107132y
            if (r0 == 0) goto L_0x022b
            com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            java.lang.String r5 = "PublishManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r2 = r2.f109287b
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r6 = "challenge"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L_0x022a
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r5 != 0) goto L_0x022a
            java.lang.String r5 = "avChallenges"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112140f(r2)
            if (r5 != 0) goto L_0x01e8
            goto L_0x022a
        L_0x01e8:
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112140f(r2)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r5 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r5
            if (r5 == 0) goto L_0x0229
            boolean r5 = r5.isCommerce
            if (r5 == r3) goto L_0x01f5
            goto L_0x022b
        L_0x01f5:
            java.lang.String r3 = "autoselected_music_monitor"
            com.ss.android.ugc.aweme.shortvideo.ay r5 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
            java.lang.String r6 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ay r1 = r5.mo86521a(r6, r1)
            java.lang.String r5 = "challenge_id"
            java.lang.Object r2 = r2.get(r4)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r2 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r2
            if (r2 == 0) goto L_0x020f
            java.lang.String r2 = r2.cid
            if (r2 != 0) goto L_0x0211
        L_0x020f:
            java.lang.String r2 = ""
        L_0x0211:
            com.ss.android.ugc.aweme.shortvideo.ay r1 = r1.mo86521a(r5, r2)
            java.lang.String r2 = "sticker_id"
            java.lang.String r0 = r0.mid
            if (r0 != 0) goto L_0x021d
            java.lang.String r0 = ""
        L_0x021d:
            com.ss.android.ugc.aweme.shortvideo.ay r0 = r1.mo86521a(r2, r0)
            org.json.JSONObject r0 = r0.mo86522b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r3, r4, r0)
            goto L_0x022b
        L_0x0229:
            return
        L_0x022a:
            return
        L_0x022b:
            return
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2466c.C49612d.bO_():void");
    }

    /* renamed from: a */
    public final void mo97515a(C42482c cVar) {
        this.f124458e.f124447g.mo7350a(cVar);
    }

    /* renamed from: b */
    public final void mo97529b(boolean z) {
        this.f124458e.f124446f.mo7345a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo97514a(C24434d dVar) {
        long j;
        long j2;
        long j3;
        long j4;
        C42475bt btVar;
        C24434d dVar2 = dVar;
        C52711k.m112240b(dVar2, "result");
        C45325v vVar = (C45325v) this.f124465l.getValue();
        C52711k.m112240b(dVar2, "chooseMusicResult");
        if (dVar2.f64818a) {
            if (!vVar.f114602a.isFinishing()) {
                C43309ec.m95003a(vVar.f114605d);
                long b = vVar.mo91605b();
                if (b > 0 && vVar.mo91606c()) {
                    vVar.f114605d.f107110c = Math.min(vVar.f114605d.f107110c, b);
                }
                vVar.f114603b.mo91330a(new C47324o(vVar.f114605d.f107110c));
                vVar.f114604c.mo97524l();
            }
            return;
        }
        if (!TextUtils.isEmpty(dVar2.f64821d) && !vVar.f114602a.isFinishing()) {
            String str = dVar2.f64821d;
            C42482c cVar = dVar2.f64820c;
            String str2 = dVar2.f64819b;
            if (vVar.f114605d.f107089ao) {
                j = C45325v.f114600e;
            } else {
                j = 15000;
            }
            long j5 = j;
            if (C44451a.m97278a(vVar.f114605d.f107036O)) {
                StitchParams stitchParams = vVar.f114605d.f107036O;
                C52711k.m112236a((Object) stitchParams, "shortVideoContext.stitchParams");
                C52855s a = C44451a.m97277a(stitchParams, str, cVar, j5);
                long longValue = ((Number) a.component1()).longValue();
                j3 = ((Number) a.component2()).longValue();
                j4 = ((Number) a.component3()).longValue();
                j2 = longValue;
            } else {
                if (cVar == null || TextUtils.isEmpty(str)) {
                    j2 = 0;
                    j3 = j5;
                } else {
                    long a2 = C42479bx.m93330a(cVar, str);
                    j3 = Math.min(a2, j5);
                    j2 = a2;
                }
                long b2 = vVar.mo91605b();
                if (b2 > 0 && vVar.mo91606c()) {
                    j3 = Math.min(j3, b2);
                }
                j4 = j3;
            }
            vVar.f114605d.f107115h = str2;
            vVar.f114605d.f107112e = str;
            vVar.f114605d.f107110c = j3;
            if (cVar != null) {
                vVar.f114605d.f107070aV = C43191e.m94741a(cVar);
            }
            vVar.f114604c.mo97516a(new C47062g(cVar, str));
            if (cVar != null) {
                if (((long) cVar.shootDuration) > j5 || Math.abs(cVar.shootDuration - cVar.duration) >= 1000) {
                    C49850a a3 = vVar.mo91604a();
                    if (a3 != null) {
                        a3.mo97680a(true);
                    }
                } else {
                    C49850a a4 = vVar.mo91604a();
                    if (a4 != null) {
                        a4.mo97680a(false);
                    }
                }
            }
            if (vVar.f114605d.mo86362d()) {
                btVar = C42476bu.m93323a(j5, j4, 0);
            } else {
                btVar = C42476bu.m93323a(j5, j2, 0);
            }
            if (btVar == C42475bt.MUSIC && dVar2.f64822e) {
                vVar.f114604c.mo97518a(Integer.valueOf(1));
            }
            vVar.f114603b.mo91330a(new C47324o(j4));
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    public C49612d(C12896b bVar, C12361b bVar2) {
        C12896b bVar3 = bVar;
        C12361b bVar4 = bVar2;
        C52711k.m112240b(bVar3, "parentScene");
        C52711k.m112240b(bVar4, "diContainer");
        this.f124457d = bVar3;
        this.f124466m = bVar4;
        C49609b bVar5 = new C49609b(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        this.f124458e = bVar5;
    }

    /* renamed from: a */
    public final void mo97513a(float f, float f2) {
        this.f124458e.f124444d.mo7345a(C52856t.m112465a(Float.valueOf(f), Float.valueOf(f2)));
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
