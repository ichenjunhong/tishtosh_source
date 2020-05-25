package com.p683ss.android.ugc.asve.p1239c;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import com.p683ss.android.ttve.model.MVInfoBean;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.vesdk.C50633an;
import com.p683ss.android.vesdk.C50657c;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.C50720o.C50740a;
import com.p683ss.android.vesdk.C50720o.C50742c;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.C50720o.C50744e;
import com.p683ss.android.vesdk.C50720o.C50747h;
import com.p683ss.android.vesdk.VEListener.C50537a;
import com.p683ss.android.vesdk.VEListener.C50541e;
import com.p683ss.android.vesdk.VEListener.C50547k;
import com.p683ss.android.vesdk.VEListener.C50549m;
import com.p683ss.android.vesdk.VEListener.C50552p;
import com.p683ss.android.vesdk.VEListener.C50553q;
import com.p683ss.android.vesdk.VEListener.C50555s;
import com.p683ss.android.vesdk.VEListener.VEInfoStickerBufferListener;
import com.p683ss.android.vesdk.VEMVAlgorithmConfig.MV_REESULT_IN_TYPE;
import com.p683ss.android.vesdk.VEMVAudioInfo;
import com.p683ss.android.vesdk.VERecordData;
import com.p683ss.android.vesdk.VESize;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import com.p683ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p683ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p683ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p683ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p683ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p683ss.android.vesdk.runtime.C50765b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.c.a */
public class C20342a implements C20347c {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C50552p> f55834a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C50711k> f55835b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<C50711k> f55836c;

    /* renamed from: d */
    public final C50720o f55837d;

    /* renamed from: e */
    private final C50552p f55838e;

    /* renamed from: f */
    private final C50711k f55839f;

    /* renamed from: g */
    private final C50711k f55840g;

    /* renamed from: h */
    private boolean f55841h;

    /* renamed from: com.ss.android.ugc.asve.c.a$a */
    static final class C20343a implements C50552p {

        /* renamed from: a */
        final /* synthetic */ C20342a f55842a;

        C20343a(C20342a aVar) {
            this.f55842a = aVar;
        }

        /* renamed from: a */
        public final void mo43097a() {
            for (C50552p a : this.f55842a.f55834a) {
                a.mo43097a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.c.a$b */
    static final class C20344b implements C50711k {

        /* renamed from: a */
        final /* synthetic */ C20342a f55843a;

        C20344b(C20342a aVar) {
            this.f55843a = aVar;
        }

        public final /* synthetic */ void onCallback(int i, int i2, float f, String str) {
            for (C50711k onCallback : this.f55843a.f55835b) {
                onCallback.onCallback(i, i2, f, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.c.a$c */
    static final class C20345c implements C50711k {

        /* renamed from: a */
        final /* synthetic */ C20342a f55844a;

        C20345c(C20342a aVar) {
            this.f55844a = aVar;
        }

        public final /* synthetic */ void onCallback(int i, int i2, float f, String str) {
            for (C50711k onCallback : this.f55844a.f55836c) {
                onCallback.onCallback(i, i2, f, str);
            }
        }
    }

    /* renamed from: a */
    public final C50765b mo43013a() {
        C50765b bVar = this.f55837d.f127318a;
        C52711k.m112236a((Object) bVar, "editor.resManager");
        return bVar;
    }

    /* renamed from: b */
    public final VESize mo43037b() {
        VESize d = this.f55837d.mo99360d();
        C52711k.m112236a((Object) d, "editor.initSize");
        return d;
    }

    /* renamed from: a */
    public final void mo43020a(String[] strArr) {
        this.f55837d.mo99352b(strArr);
    }

    /* renamed from: a */
    public final void mo43016a(C50552p pVar) {
        C52711k.m112240b(pVar, "firstFrameListener");
        if (this.f55834a.isEmpty()) {
            this.f55837d.f127366f = pVar;
        }
        if (!m50108a(this.f55834a, (Object) pVar)) {
            this.f55834a.add(pVar);
        }
    }

    /* renamed from: a */
    public final void mo43018a(C50711k kVar) {
        C52711k.m112240b(kVar, "callback");
        if (this.f55835b.isEmpty()) {
            this.f55837d.mo99332a(this.f55839f);
        }
        if (!m50108a(this.f55835b, (Object) kVar)) {
            this.f55835b.add(kVar);
        }
    }

    /* renamed from: b */
    public final void mo43039b(C50711k kVar) {
        C52711k.m112240b(kVar, "callback");
        if (this.f55836c.isEmpty()) {
            this.f55837d.mo99351b(this.f55840g);
        }
        if (!m50108a(this.f55836c, (Object) kVar)) {
            this.f55836c.add(kVar);
        }
    }

    /* renamed from: a */
    public final void mo43015a(int i, int i2, int i3, int i4) {
        this.f55837d.mo99329a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final VESize mo43012a(int i, int i2) {
        VESize a = this.f55837d.mo99326a(i, i2);
        C52711k.m112236a((Object) a, "editor.getInitSize(surfaceWidth, surfaceHeight)");
        return a;
    }

    /* renamed from: a */
    public final void mo43014a(float f, float f2, float f3, int i, int i2) {
        this.f55837d.mo99328a(f, f2, f3, i, i2);
    }

    /* renamed from: a */
    public final Bitmap mo43011a(int i) {
        return this.f55837d.mo99325a(i);
    }

    /* renamed from: b */
    public final void mo43038b(int i) {
        this.f55837d.mo99350b(i);
    }

    /* renamed from: a */
    public final int mo42976a(int i, int i2, C50744e eVar) {
        C52711k.m112240b(eVar, "mode");
        return this.f55837d.mo99283a(i, i2, eVar);
    }

    /* renamed from: a */
    public int mo42990a(C20348d dVar) {
        C52711k.m112240b(dVar, "param");
        int a = dVar.mo43099a(this.f55837d, this.f55841h);
        this.f55841h = true;
        return a;
    }

    /* renamed from: a */
    public final int mo42992a(VERecordData vERecordData, boolean z) {
        return this.f55837d.mo99299a(vERecordData, z);
    }

    /* renamed from: a */
    public int mo42999a(String str, int i, int i2) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        return this.f55837d.mo99305a(str, i, i2);
    }

    /* renamed from: a */
    public final int mo43007a(String str, String[] strArr, String[] strArr2) {
        C52711k.m112240b(str, "mvPath");
        C52711k.m112240b(strArr, "resourcesFilePaths");
        C52711k.m112240b(strArr2, "resourcesTypes");
        return this.f55837d.mo99314a(str, strArr, strArr2);
    }

    /* renamed from: a */
    public final int mo42993a(C50633an anVar) {
        C52711k.m112240b(anVar, "sceneTime");
        return this.f55837d.mo99300a(anVar);
    }

    /* renamed from: a */
    public final int mo42994a(C50633an anVar, int i, int i2) {
        C52711k.m112240b(anVar, "sceneTime");
        return this.f55837d.mo99301a(anVar, i, i2);
    }

    /* renamed from: a */
    public final int mo42979a(int i, int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        C52711k.m112240b(arrayList, "clipSourceParams");
        C52711k.m112240b(arrayList2, "clipTimelineParams");
        return this.f55837d.mo99286a(0, i2, arrayList, arrayList2);
    }

    /* renamed from: a */
    public final int mo42975a(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4) {
        C52711k.m112240b(vEBaseFilterParam, "param");
        return this.f55837d.mo99282a(i, 0, vEBaseFilterParam, i3, i4);
    }

    /* renamed from: a */
    public final int mo42982a(int i, VEBaseFilterParam vEBaseFilterParam) {
        C52711k.m112240b(vEBaseFilterParam, "param");
        return this.f55837d.mo99289a(i, vEBaseFilterParam);
    }

    /* renamed from: a */
    public final int mo43008a(int[] iArr) {
        C52711k.m112240b(iArr, "filterIndexes");
        return this.f55837d.mo99317a(iArr);
    }

    /* renamed from: a */
    public final void mo43019a(boolean z) {
        this.f55837d.mo99363d(z);
    }

    /* renamed from: b */
    public final void mo43040b(boolean z) {
        this.f55837d.mo99367e(z);
    }

    /* renamed from: b */
    public final int mo43036b(String[] strArr) {
        return this.f55837d.mo99319a(strArr);
    }

    /* renamed from: a */
    public final int mo43010a(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            return -100;
        }
        return this.f55837d.mo99323a(strArr, strArr2);
    }

    /* renamed from: a */
    public final int mo42995a(C50742c cVar) {
        C52711k.m112240b(cVar, "mode");
        return this.f55837d.mo99302a(cVar);
    }

    /* renamed from: a */
    public final int mo42983a(int i, C50743d dVar) {
        C52711k.m112240b(dVar, "flags");
        return this.f55837d.mo99290a(i, dVar);
    }

    /* renamed from: a */
    public final int mo42984a(int i, C50743d dVar, C50549m mVar) {
        C52711k.m112240b(dVar, "flags");
        return this.f55837d.mo99291a(i, dVar, mVar);
    }

    /* renamed from: a */
    public int mo43001a(String str, int i, int i2, boolean z) {
        C52711k.m112240b(str, "file");
        return this.f55837d.mo99308a(str, i, i2, z);
    }

    /* renamed from: a */
    public final boolean mo43021a(int i, int i2, float f) {
        return this.f55837d.mo99333a(i, i2, f);
    }

    /* renamed from: a */
    public final int mo43006a(String str, String[] strArr) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        return this.f55837d.mo99313a(str, strArr);
    }

    /* renamed from: a */
    public final int mo42991a(VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        return this.f55837d.mo99298a(vEInfoStickerBufferListener);
    }

    /* renamed from: a */
    public final int mo42998a(String str, float f, float f2, float f3, float f4) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        return this.f55837d.mo99304a(str, 0.0f, 0.0f, 1.0f, 1.0f);
    }

    /* renamed from: b */
    public final int mo43034b(String str, float f, float f2, float f3, float f4) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        return this.f55837d.mo99347b(str, 0.0f, 0.0f, 1.0f, f4);
    }

    /* renamed from: a */
    public final int mo42988a(int i, float[] fArr) {
        C52711k.m112240b(fArr, "pos");
        return this.f55837d.mo99295a(i, fArr);
    }

    /* renamed from: a */
    public final int mo42997a(String str, float f) {
        return this.f55837d.mo99303a(str, 1.0f);
    }

    /* renamed from: a */
    public final int mo43003a(String str, String str2, float f) {
        return this.f55837d.mo99310a(str, str2, f);
    }

    /* renamed from: a */
    public final int mo43004a(String str, String str2, float f, float f2, float f3) {
        return this.f55837d.mo99311a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final int mo42996a(String str) {
        return this.f55837d.mo99345b(str);
    }

    /* renamed from: a */
    public final int mo42985a(int i, String str) {
        return this.f55837d.mo99343b(i, str);
    }

    /* renamed from: a */
    public final int[] mo43024a(int[] iArr, int[] iArr2, String[] strArr) {
        C52711k.m112240b(iArr, "seqIns");
        C52711k.m112240b(iArr2, "seqOuts");
        C52711k.m112240b(strArr, "effectPaths");
        int[] a = this.f55837d.mo99337a(iArr, iArr2, strArr);
        C52711k.m112236a((Object) a, "editor.addFilterEffects(…ns, seqOuts, effectPaths)");
        return a;
    }

    /* renamed from: b */
    public final int mo43035b(int[] iArr) {
        C52711k.m112240b(iArr, "filterIndexes");
        return this.f55837d.mo99348b(iArr);
    }

    /* renamed from: a */
    public final int mo42978a(int i, int i2, String str, byte[] bArr, int i3, int i4, C50537a aVar) {
        String str2 = str;
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C50537a aVar2 = aVar;
        C52711k.m112240b(aVar2, "preprocessListener");
        return this.f55837d.mo99285a(i, i2, str2, bArr, i3, i4, aVar2);
    }

    /* renamed from: a */
    public final int mo43002a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        return this.f55837d.mo99309a(str, str2);
    }

    /* renamed from: a */
    public final int mo43009a(int[] iArr, int i, int i2, C50740a aVar, C50553q qVar) {
        C52711k.m112240b(iArr, "timeStamps");
        C52711k.m112240b(aVar, "flags");
        C52711k.m112240b(qVar, "listener");
        return this.f55837d.mo99318a(iArr, i, i2, aVar, qVar);
    }

    /* renamed from: a */
    public final boolean mo43023a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, C50547k kVar) {
        C52711k.m112240b(vEVideoEncodeSettings, "settings");
        return this.f55837d.mo99336a(str, str2, vEVideoEncodeSettings, kVar);
    }

    /* renamed from: a */
    public final boolean mo43022a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) {
        C52711k.m112240b(vEVideoEncodeSettings, "settings");
        return this.f55837d.mo99335a(str, (String) null, vEVideoEncodeSettings);
    }

    /* renamed from: a */
    public final int mo43000a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        C52711k.m112240b(str, "audioFilePath");
        C52711k.m112240b(vEAlgorithmPath, "veAlgorithmPath");
        return this.f55837d.mo99307a(str, i, i2, vEAlgorithmPath);
    }

    /* renamed from: a */
    public final int mo42980a(int i, int i2, boolean z, C50541e eVar) {
        return this.f55837d.mo99287a(i, 1, true, eVar);
    }

    /* renamed from: a */
    public final int mo42981a(int i, C50657c cVar) {
        C52711k.m112240b(cVar, "rotate");
        return this.f55837d.mo99288a(i, cVar);
    }

    /* renamed from: a */
    public final int mo42977a(int i, int i2, String str) {
        C52711k.m112240b(str, "srt");
        return this.f55837d.mo99284a(i, i2, str);
    }

    /* renamed from: a */
    public final int mo42987a(int i, boolean z) {
        return this.f55837d.mo99294a(i, z);
    }

    /* renamed from: a */
    public final int mo42989a(int i, ByteBuffer[] byteBufferArr) {
        C52711k.m112240b(byteBufferArr, "byteBuffer");
        return this.f55837d.mo99296a(i, byteBufferArr);
    }

    /* renamed from: a */
    public final int mo42986a(int i, ByteBuffer byteBuffer) {
        return this.f55837d.mo99293a(i, byteBuffer);
    }

    /* renamed from: a */
    public final int mo43005a(String str, String str2, String str3, MV_REESULT_IN_TYPE mv_reesult_in_type) {
        C52711k.m112240b(str, "photoPath");
        C52711k.m112240b(str2, "algorithmType");
        C52711k.m112240b(str3, C42311c.f106865i);
        C52711k.m112240b(mv_reesult_in_type, "type");
        return this.f55837d.mo99312a(str, str2, str3, mv_reesult_in_type);
    }

    /* renamed from: a */
    public final void mo43017a(C50555s sVar) {
        C52711k.m112240b(sVar, "listener");
        this.f55837d.f127368h = sVar;
    }

    /* renamed from: e */
    public final int mo43054e() {
        return this.f55837d.f127376p;
    }

    /* renamed from: h */
    public final String[] mo43066h() {
        return this.f55837d.mo99396p();
    }

    /* renamed from: k */
    public final int mo43071k() {
        return this.f55837d.mo99407v();
    }

    /* renamed from: l */
    public final int mo43073l() {
        return this.f55837d.mo99409w();
    }

    /* renamed from: m */
    public final List<VEClipAlgorithmParam> mo43075m() {
        return this.f55837d.mo99271E();
    }

    /* renamed from: n */
    public final int mo43077n() {
        return this.f55837d.mo99379i();
    }

    /* renamed from: q */
    public final int mo43083q() {
        return this.f55837d.mo99392o();
    }

    /* renamed from: r */
    public final int mo43085r() {
        return this.f55837d.mo99401s();
    }

    /* renamed from: s */
    public final int mo43087s() {
        return this.f55837d.mo99403t();
    }

    /* renamed from: t */
    public final int mo43089t() {
        return this.f55837d.mo99405u();
    }

    /* renamed from: u */
    public final int mo43091u() {
        return this.f55837d.mo99410x();
    }

    /* renamed from: v */
    public final int mo43092v() {
        return this.f55837d.mo99411y();
    }

    /* renamed from: w */
    public final int mo43093w() {
        return this.f55837d.mo99269C();
    }

    /* renamed from: x */
    public final int mo43094x() {
        return this.f55837d.mo99270D();
    }

    /* renamed from: y */
    public final int mo43095y() {
        return this.f55837d.mo99272F();
    }

    /* renamed from: z */
    public final float mo43096z() {
        return this.f55837d.f127304M;
    }

    /* renamed from: A */
    public final int mo42966A() {
        return this.f55837d.mo99364e(this.f55837d.mo99407v());
    }

    /* renamed from: g */
    public final C50747h mo43063g() {
        return this.f55837d.mo99391n();
    }

    /* renamed from: i */
    public final String[] mo43068i() {
        return this.f55837d.mo99398q();
    }

    /* renamed from: j */
    public final String[] mo43070j() {
        return this.f55837d.mo99400r();
    }

    /* renamed from: o */
    public final void mo43080o() {
        this.f55837d.mo99384k();
    }

    /* renamed from: p */
    public final void mo43082p() {
        this.f55837d.mo99389m();
    }

    /* renamed from: d */
    public final MVInfoBean mo43051d() {
        MVInfoBean f = this.f55837d.mo99371f();
        C52711k.m112236a((Object) f, "editor.mvInfo");
        return f;
    }

    /* renamed from: f */
    public final VEMVAudioInfo mo43060f() {
        return this.f55837d.mo99374g();
    }

    /* renamed from: c */
    public final Bitmap mo43045c() {
        return this.f55837d.mo99366e();
    }

    /* renamed from: a */
    public final int mo42967a(float f) {
        return this.f55837d.mo99274a(f);
    }

    /* renamed from: d */
    public final int mo43049d(int i) {
        return this.f55837d.mo99376h(i);
    }

    /* renamed from: f */
    public final int mo43058f(int i) {
        return this.f55837d.mo99382j(i);
    }

    /* renamed from: i */
    public final int mo43067i(int i) {
        return this.f55837d.mo99404t(i);
    }

    /* renamed from: j */
    public final int mo43069j(int i) {
        return this.f55837d.mo99406u(i);
    }

    /* renamed from: o */
    public final float mo43079o(int i) {
        return this.f55837d.mo99395p(i);
    }

    /* renamed from: p */
    public final float mo43081p(int i) {
        return this.f55837d.mo99397q(i);
    }

    public C20342a(String str) {
        C52711k.m112240b(str, "workSpace");
        this(new C50720o(str));
    }

    /* renamed from: b */
    public final float mo43025b(String str) {
        C52711k.m112240b(str, "filterPath");
        return this.f55837d.mo99273a(str);
    }

    /* renamed from: c */
    public final int mo43042c(String str) {
        C52711k.m112240b(str, "filePath");
        return this.f55837d.mo99354c(str);
    }

    /* renamed from: d */
    public final int mo43050d(String str) {
        C52711k.m112240b(str, "filePath");
        return this.f55837d.mo99359d(str);
    }

    /* renamed from: h */
    public final float[] mo43065h(int i) {
        float[] l = this.f55837d.mo99387l(i);
        C52711k.m112236a((Object) l, "editor.getInfoStickerBou…ngBoxWithoutRotate(index)");
        return l;
    }

    /* renamed from: k */
    public final int mo43072k(int i) {
        return this.f55837d.mo99408v(i);
    }

    /* renamed from: l */
    public final int mo43074l(int i) {
        return this.f55837d.mo99388m(i);
    }

    /* renamed from: m */
    public final void mo43076m(int i) {
        this.f55837d.mo99390n(i);
    }

    /* renamed from: n */
    public final int mo43078n(int i) {
        return this.f55837d.mo99393o(i);
    }

    /* renamed from: q */
    public final boolean mo43084q(int i) {
        return this.f55837d.mo99399r(i);
    }

    /* renamed from: r */
    public final int mo43086r(int i) {
        return this.f55837d.mo99368f(i);
    }

    /* renamed from: s */
    public final int mo43088s(int i) {
        return this.f55837d.mo99372g(i);
    }

    /* renamed from: t */
    public final int mo43090t(int i) {
        return this.f55837d.mo99402s(i);
    }

    /* renamed from: c */
    public final int mo43043c(boolean z) {
        return this.f55837d.mo99370f(z);
    }

    /* renamed from: e */
    public final void mo43056e(boolean z) {
        this.f55837d.mo99378h(z);
    }

    /* renamed from: g */
    public final float[] mo43064g(int i) {
        float[] k = this.f55837d.mo99385k(i);
        C52711k.m112236a((Object) k, "editor.getInfoStickerBoundingBox(index)");
        return k;
    }

    public C20342a(C50720o oVar) {
        C52711k.m112240b(oVar, "editor");
        this.f55834a = new CopyOnWriteArrayList<>();
        this.f55838e = new C20343a(this);
        this.f55835b = new CopyOnWriteArrayList<>();
        this.f55839f = new C20344b(this);
        this.f55836c = new CopyOnWriteArrayList<>();
        this.f55840g = new C20345c(this);
        this.f55837d = oVar;
    }

    /* renamed from: c */
    public final int mo43044c(int[] iArr) {
        C52711k.m112240b(iArr, "filterIndexes");
        return this.f55837d.mo99356c(iArr);
    }

    /* renamed from: e */
    public final boolean mo43057e(int i) {
        return this.f55837d.mo99381i(i);
    }

    /* renamed from: f */
    public final void mo43061f(boolean z) {
        this.f55837d.mo99380i(z);
    }

    /* renamed from: d */
    public final void mo43053d(boolean z) {
        this.f55837d.mo99375g(true);
    }

    /* renamed from: c */
    public final void mo43046c(int i) {
        this.f55837d.mo99361d(i);
    }

    /* renamed from: c */
    public final void mo43048c(C50711k kVar) {
        C52711k.m112240b(kVar, "callback");
        this.f55836c.remove(kVar);
    }

    /* renamed from: b */
    public final int mo43026b(int i, float f) {
        return this.f55837d.mo99338b(i, f);
    }

    /* renamed from: c */
    public final int mo43041c(int i, float f) {
        return this.f55837d.mo99353c(i, f);
    }

    /* renamed from: g */
    public final int mo43062g(int i, int i2) {
        return this.f55837d.mo99365e(i, i2);
    }

    /* renamed from: a */
    public final int mo42968a(int i, float f) {
        return this.f55837d.mo99275a(i, f);
    }

    /* renamed from: e */
    public final int mo43055e(int i, int i2) {
        return this.f55837d.mo99369f(i, i2);
    }

    /* renamed from: f */
    public final int mo43059f(int i, int i2) {
        return this.f55837d.mo99373g(i, i2);
    }

    public C20342a(String str, SurfaceView surfaceView) {
        C52711k.m112240b(str, "workSpace");
        C52711k.m112240b(surfaceView, "surfaceView");
        this(new C50720o(str, surfaceView));
    }

    /* renamed from: a */
    private static boolean m50108a(CopyOnWriteArrayList<?> copyOnWriteArrayList, Object obj) {
        for (Object obj2 : copyOnWriteArrayList) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int mo43028b(int i, int i2) {
        return this.f55837d.mo99340b(i, i2);
    }

    /* renamed from: d */
    public final void mo43052d(int i, int i2) {
        this.f55837d.mo99362d(i, i2);
    }

    public C20342a(String str, TextureView textureView) {
        C52711k.m112240b(str, "workSpace");
        C52711k.m112240b(textureView, "textureView");
        this(new C50720o(str, textureView));
    }

    /* renamed from: b */
    public final int mo43031b(int i, String str) {
        C52711k.m112240b(str, "fontPath");
        return this.f55837d.mo99292a(i, str);
    }

    /* renamed from: c */
    public final void mo43047c(int i, int i2) {
        this.f55837d.mo99358c(i, i2);
    }

    /* renamed from: b */
    public final int mo43032b(int i, float[] fArr) {
        C52711k.m112240b(fArr, "pos");
        return this.f55837d.mo99344b(i, fArr);
    }

    /* renamed from: b */
    public final int mo43033b(String str, float f) {
        return this.f55837d.mo99346b(str, f);
    }

    /* renamed from: b */
    public final int mo43027b(int i, float f, float f2) {
        return this.f55837d.mo99339b(i, f, f2);
    }

    /* renamed from: a */
    public final int mo42969a(int i, float f, float f2) {
        return this.f55837d.mo99276a(i, f, f2);
    }

    public C20342a(String str, SurfaceView surfaceView, long j) {
        C52711k.m112240b(str, "workspace");
        C52711k.m112240b(surfaceView, "surfaceView");
        this(new C50720o(str, surfaceView, j));
    }

    /* renamed from: a */
    public final int mo42970a(int i, int i2, int i3) {
        return this.f55837d.mo99277a(0, i2, i3);
    }

    /* renamed from: b */
    public final int mo43029b(int i, int i2, int i3) {
        return this.f55837d.mo99341b(i, i2, i3);
    }

    /* renamed from: a */
    public final int mo42973a(int i, int i2, C50657c cVar) {
        C52711k.m112240b(cVar, "degree");
        return this.f55837d.mo99280a(0, i2, cVar);
    }

    /* renamed from: a */
    public final int mo42974a(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        return this.f55837d.mo99281a(0, 0, vEBaseFilterParam);
    }

    /* renamed from: a */
    public final int mo42972a(int i, int i2, int i3, boolean z) {
        return this.f55837d.mo99279a(i, i2, i3, z);
    }

    /* renamed from: a */
    public final int mo42971a(int i, int i2, int i3, int i4, int i5, boolean z) {
        return this.f55837d.mo99278a(i, i2, i3, i4, i5, z);
    }

    /* renamed from: b */
    public final int mo43030b(int i, int i2, int i3, int i4, int i5, boolean z) {
        return this.f55837d.mo99342b(i, i2, i3, i4, i5, z);
    }
}
