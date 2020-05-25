package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.view.ViewGroup;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.group.C12919g;
import com.bytedance.scene.p843ui.C12978a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n */
public final class C44262n extends C12978a {

    /* renamed from: a */
    public List<? extends MyMediaModel> f112060a = C52575l.m112097a();

    /* renamed from: b */
    public final C44211e f112061b;

    /* renamed from: c */
    private final Map<Integer, C44212f> f112062c = new LinkedHashMap();

    public final int getCount() {
        return this.f112060a.size();
    }

    /* renamed from: b */
    public final C44212f mo90158b(int i) {
        Object obj = this.f112062c.get(Integer.valueOf(i));
        if (obj == null) {
            obj = null;
        }
        return (C44212f) obj;
    }

    /* renamed from: a */
    public final C12919g mo24567a(int i) {
        C12919g gVar;
        MyMediaModel myMediaModel = (MyMediaModel) C52575l.m112118a(this.f112060a, i);
        if (myMediaModel == null || !myMediaModel.mo76676c()) {
            gVar = new C44243k();
        } else {
            gVar = new C44264p();
        }
        C44212f fVar = (C44212f) gVar;
        fVar.mo90137a(i, this.f112061b);
        fVar.mo90138a((MyMediaModel) C52575l.m112118a(this.f112060a, i));
        this.f112062c.put(Integer.valueOf(i), fVar);
        return gVar;
    }

    public C44262n(C12896b bVar, C44211e eVar) {
        C52711k.m112240b(bVar, "groupScene");
        C52711k.m112240b(eVar, "controller");
        super(bVar);
        this.f112061b = eVar;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C52711k.m112240b(viewGroup, "container");
        C52711k.m112240b(obj, "obj");
        super.destroyItem(viewGroup, i, obj);
        if (!(obj instanceof C44212f)) {
            obj = null;
        }
        if (((C44212f) obj) != null) {
            this.f112062c.remove(Integer.valueOf(i));
        }
    }
}
