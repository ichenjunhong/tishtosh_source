package com.bytedance.p782n;

import com.bytedance.p782n.C12395l.C12396a;
import java.util.List;

/* renamed from: com.bytedance.n.j */
public abstract class C12393j<IN, OUT> extends C12395l<IN, OUT> {

    /* renamed from: g */
    public String f32636g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo18065a(C12378b<OUT> bVar, IN in);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo18066a(C12378b<OUT> bVar, IN in, Throwable th, String str);

    /* renamed from: a_ */
    public final Object mo18063a_(C12378b<OUT> bVar, IN in) throws Throwable {
        this.f32636g = mo18065a(new C12398m(bVar), in);
        C12396a aVar = (C12396a) this.f32638h.get(this.f32636g);
        while (aVar != null) {
            List<C12388h> list = aVar.f32639a;
            try {
                Object a = C12381c.m24939a(list, ((C12391i) bVar).f32632a, this).mo23391a(in);
                if (!m24965a(list)) {
                    return a;
                }
                return bVar.mo23391a(a);
            } catch (C12392a e) {
                this.f32636g = mo18066a(new C12398m(bVar), in, e.getCause(), this.f32636g);
                aVar = (C12396a) this.f32638h.get(this.f32636g);
            } catch (Throwable th) {
                this.f32636g = mo18066a(new C12398m(bVar), in, th, this.f32636g);
                aVar = (C12396a) this.f32638h.get(this.f32636g);
            }
        }
        StringBuilder sb = new StringBuilder("找不到对应分支，分支名：");
        sb.append(this.f32636g);
        throw new IllegalArgumentException(sb.toString());
    }
}
