package com.p683ss.android.ugc.aweme.p1445bp.p1450e;

import com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45841j;
import java.io.File;
import java.util.HashSet;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.e.a */
public final class C23892a {

    /* renamed from: a */
    public static final HashSet<String> f63560a;

    /* renamed from: b */
    public static final C23892a f63561b = new C23892a();

    private C23892a() {
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        hashSet2.add(C43308eb.f109492e);
        hashSet2.add(C43308eb.f109493f);
        hashSet2.add(C43308eb.f109494g);
        hashSet2.add(C43308eb.f109497j);
        hashSet2.add(C43308eb.f109498k);
        hashSet2.add(C43308eb.f109499l);
        hashSet2.add(C43308eb.f109500m);
        hashSet2.add(C43308eb.f109502o);
        hashSet2.add(C43308eb.f109503p);
        hashSet2.add(C43308eb.f109504q);
        File file = EffectPlatform.f76569a;
        C52711k.m112236a((Object) file, "EffectPlatform.LOCAL_CACHEDIR");
        hashSet2.add(file.getPath());
        hashSet2.add(C43308eb.f109505r);
        hashSet2.add(C43308eb.f109506s);
        hashSet2.add(C43308eb.f109507t);
        hashSet2.add(C43308eb.f109508u);
        hashSet2.add(C43308eb.f109510w);
        hashSet2.add(C43307ea.f109488a);
        StringBuilder sb = new StringBuilder();
        sb.append(C43308eb.f109491d);
        sb.append("ve_frame_cache2");
        hashSet2.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C43308eb.f109491d);
        sb2.append("mvtheme");
        hashSet2.add(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C43308eb.f109491d);
        sb3.append("filter");
        hashSet2.add(sb3.toString());
        hashSet2.add(C45841j.m99668a());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C43308eb.f109491d);
        sb4.append("shortvideo/shoot/");
        hashSet2.add(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C43308eb.f109491d);
        sb5.append("shortvideo/videoedit/");
        hashSet2.add(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(C43308eb.f109491d);
        sb6.append("shortvideo/publish");
        hashSet2.add(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(C43308eb.f109491d);
        sb7.append("shortvideo/cache/");
        hashSet2.add(sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(C43308eb.f109491d);
        sb8.append("shortvideo/resources/");
        hashSet2.add(sb8.toString());
        StringBuilder sb9 = new StringBuilder();
        sb9.append(C43308eb.f109491d);
        sb9.append("shortvideo/draft/");
        hashSet2.add(sb9.toString());
        String shareDir = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().shareDir();
        StringBuilder sb10 = new StringBuilder();
        sb10.append(shareDir);
        sb10.append("openPlatform/");
        hashSet2.add(sb10.toString());
        hashSet.addAll(hashSet2);
        f63560a = hashSet;
    }
}
