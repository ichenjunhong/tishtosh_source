package com.p683ss.android.ugc.asve.p1239c;

import android.graphics.Bitmap;
import com.p683ss.android.ttve.model.MVInfoBean;
import com.p683ss.android.vesdk.C50633an;
import com.p683ss.android.vesdk.C50657c;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o.C50740a;
import com.p683ss.android.vesdk.C50720o.C50742c;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.C50720o.C50744e;
import com.p683ss.android.vesdk.C50720o.C50747h;
import com.p683ss.android.vesdk.C50751p;
import com.p683ss.android.vesdk.VEListener.C50537a;
import com.p683ss.android.vesdk.VEListener.C50541e;
import com.p683ss.android.vesdk.VEListener.C50547k;
import com.p683ss.android.vesdk.VEListener.C50549m;
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

/* renamed from: com.ss.android.ugc.asve.c.c */
public interface C20347c {
    /* renamed from: A */
    int mo42966A();

    /* renamed from: a */
    int mo42967a(float f);

    /* renamed from: a */
    int mo42968a(int i, float f);

    /* renamed from: a */
    int mo42969a(int i, float f, float f2);

    /* renamed from: a */
    int mo42970a(int i, int i2, int i3);

    /* renamed from: a */
    int mo42971a(int i, int i2, int i3, int i4, int i5, boolean z);

    /* renamed from: a */
    int mo42972a(int i, int i2, int i3, boolean z);

    /* renamed from: a */
    int mo42973a(int i, int i2, C50657c cVar);

    /* renamed from: a */
    int mo42974a(int i, int i2, VEBaseFilterParam vEBaseFilterParam);

    /* renamed from: a */
    int mo42975a(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4);

    /* renamed from: a */
    int mo42976a(int i, int i2, C50744e eVar);

    /* renamed from: a */
    int mo42977a(int i, int i2, String str);

    /* renamed from: a */
    int mo42978a(int i, int i2, String str, byte[] bArr, int i3, int i4, C50537a aVar);

    /* renamed from: a */
    int mo42979a(int i, int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2);

    /* renamed from: a */
    int mo42980a(int i, int i2, boolean z, C50541e eVar);

    /* renamed from: a */
    int mo42981a(int i, C50657c cVar);

    /* renamed from: a */
    int mo42982a(int i, VEBaseFilterParam vEBaseFilterParam);

    /* renamed from: a */
    int mo42983a(int i, C50743d dVar);

    /* renamed from: a */
    int mo42984a(int i, C50743d dVar, C50549m mVar);

    /* renamed from: a */
    int mo42985a(int i, String str);

    /* renamed from: a */
    int mo42986a(int i, ByteBuffer byteBuffer);

    /* renamed from: a */
    int mo42987a(int i, boolean z);

    /* renamed from: a */
    int mo42988a(int i, float[] fArr);

    /* renamed from: a */
    int mo42989a(int i, ByteBuffer[] byteBufferArr);

    /* renamed from: a */
    int mo42990a(C20348d dVar);

    /* renamed from: a */
    int mo42991a(VEInfoStickerBufferListener vEInfoStickerBufferListener);

    /* renamed from: a */
    int mo42992a(VERecordData vERecordData, boolean z);

    /* renamed from: a */
    int mo42993a(C50633an anVar);

    /* renamed from: a */
    int mo42994a(C50633an anVar, int i, int i2);

    /* renamed from: a */
    int mo42995a(C50742c cVar);

    /* renamed from: a */
    int mo42996a(String str);

    /* renamed from: a */
    int mo42997a(String str, float f);

    /* renamed from: a */
    int mo42998a(String str, float f, float f2, float f3, float f4);

    /* renamed from: a */
    int mo42999a(String str, int i, int i2);

    /* renamed from: a */
    int mo43000a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath);

    /* renamed from: a */
    int mo43001a(String str, int i, int i2, boolean z);

    /* renamed from: a */
    int mo43002a(String str, String str2);

    /* renamed from: a */
    int mo43003a(String str, String str2, float f);

    /* renamed from: a */
    int mo43004a(String str, String str2, float f, float f2, float f3);

    /* renamed from: a */
    int mo43005a(String str, String str2, String str3, MV_REESULT_IN_TYPE mv_reesult_in_type);

    /* renamed from: a */
    int mo43006a(String str, String[] strArr);

    /* renamed from: a */
    int mo43007a(String str, String[] strArr, String[] strArr2);

    /* renamed from: a */
    int mo43008a(int[] iArr);

    /* renamed from: a */
    int mo43009a(int[] iArr, int i, int i2, C50740a aVar, C50553q qVar);

    /* renamed from: a */
    int mo43010a(String[] strArr, String[] strArr2);

    /* renamed from: a */
    Bitmap mo43011a(int i);

    /* renamed from: a */
    VESize mo43012a(int i, int i2);

    /* renamed from: a */
    C50765b mo43013a();

    /* renamed from: a */
    void mo43014a(float f, float f2, float f3, int i, int i2);

    /* renamed from: a */
    void mo43015a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo43017a(C50555s sVar);

    /* renamed from: a */
    void mo43019a(boolean z);

    /* renamed from: a */
    void mo43020a(String[] strArr);

    /* renamed from: a */
    boolean mo43021a(int i, int i2, float f);

    /* renamed from: a */
    boolean mo43023a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, C50547k kVar) throws C50751p;

    /* renamed from: a */
    int[] mo43024a(int[] iArr, int[] iArr2, String[] strArr);

    /* renamed from: b */
    float mo43025b(String str);

    /* renamed from: b */
    int mo43026b(int i, float f);

    /* renamed from: b */
    int mo43027b(int i, float f, float f2);

    /* renamed from: b */
    int mo43028b(int i, int i2);

    /* renamed from: b */
    int mo43029b(int i, int i2, int i3);

    /* renamed from: b */
    int mo43030b(int i, int i2, int i3, int i4, int i5, boolean z);

    /* renamed from: b */
    int mo43031b(int i, String str);

    /* renamed from: b */
    int mo43032b(int i, float[] fArr);

    /* renamed from: b */
    int mo43033b(String str, float f);

    /* renamed from: b */
    int mo43034b(String str, float f, float f2, float f3, float f4);

    /* renamed from: b */
    int mo43035b(int[] iArr);

    /* renamed from: b */
    int mo43036b(String[] strArr);

    /* renamed from: b */
    VESize mo43037b();

    /* renamed from: b */
    void mo43039b(C50711k kVar);

    /* renamed from: c */
    int mo43041c(int i, float f);

    /* renamed from: c */
    int mo43042c(String str);

    /* renamed from: c */
    int mo43043c(boolean z);

    /* renamed from: c */
    int mo43044c(int[] iArr);

    /* renamed from: c */
    Bitmap mo43045c();

    /* renamed from: c */
    void mo43046c(int i);

    /* renamed from: c */
    void mo43047c(int i, int i2);

    /* renamed from: c */
    void mo43048c(C50711k kVar);

    /* renamed from: d */
    int mo43049d(int i);

    /* renamed from: d */
    int mo43050d(String str);

    /* renamed from: d */
    MVInfoBean mo43051d();

    /* renamed from: e */
    int mo43054e();

    /* renamed from: e */
    int mo43055e(int i, int i2);

    /* renamed from: e */
    void mo43056e(boolean z);

    /* renamed from: e */
    boolean mo43057e(int i);

    /* renamed from: f */
    int mo43058f(int i);

    /* renamed from: f */
    int mo43059f(int i, int i2);

    /* renamed from: f */
    VEMVAudioInfo mo43060f();

    /* renamed from: f */
    void mo43061f(boolean z);

    /* renamed from: g */
    int mo43062g(int i, int i2);

    /* renamed from: g */
    C50747h mo43063g();

    /* renamed from: g */
    float[] mo43064g(int i) throws C50751p;

    /* renamed from: h */
    float[] mo43065h(int i) throws C50751p;

    /* renamed from: h */
    String[] mo43066h();

    /* renamed from: i */
    String[] mo43068i();

    /* renamed from: j */
    int mo43069j(int i);

    /* renamed from: j */
    String[] mo43070j();

    /* renamed from: k */
    int mo43071k();

    /* renamed from: k */
    int mo43072k(int i);

    /* renamed from: l */
    int mo43073l();

    /* renamed from: l */
    int mo43074l(int i);

    /* renamed from: m */
    List<VEClipAlgorithmParam> mo43075m();

    /* renamed from: m */
    void mo43076m(int i);

    /* renamed from: n */
    int mo43077n();

    /* renamed from: n */
    int mo43078n(int i);

    /* renamed from: o */
    float mo43079o(int i);

    /* renamed from: o */
    void mo43080o();

    /* renamed from: p */
    float mo43081p(int i);

    /* renamed from: p */
    void mo43082p();

    /* renamed from: q */
    int mo43083q() throws C50751p;

    /* renamed from: q */
    boolean mo43084q(int i);

    /* renamed from: r */
    int mo43085r();

    /* renamed from: r */
    int mo43086r(int i);

    /* renamed from: s */
    int mo43087s();

    /* renamed from: s */
    int mo43088s(int i);

    /* renamed from: t */
    int mo43089t();

    /* renamed from: t */
    int mo43090t(int i);

    /* renamed from: u */
    int mo43091u();

    /* renamed from: v */
    int mo43092v();

    /* renamed from: w */
    int mo43093w();

    /* renamed from: x */
    int mo43094x();

    /* renamed from: y */
    int mo43095y();

    /* renamed from: z */
    float mo43096z();
}
