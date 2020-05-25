package com.facebook.drawee.p930a.p931a;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.p920d.C13682e;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.p933b.C13764b;
import com.facebook.drawee.p930a.p931a.p933b.C13768f;
import com.facebook.drawee.p936c.C13786b;
import com.facebook.drawee.p936c.C13786b.C13789a;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p965e.C14001h;
import com.facebook.imagepipeline.p968h.C14038a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p929d.C13745c;
import java.util.Set;

/* renamed from: com.facebook.drawee.a.a.e */
public final class C13773e extends C13786b<C13773e, C14229b, C13715a<C14042c>, C14045f> {

    /* renamed from: o */
    private final C14001h f35849o;

    /* renamed from: p */
    private final C13776g f35850p;

    /* renamed from: q */
    private C13682e<C14038a> f35851q;

    /* renamed from: r */
    private C13764b f35852r;

    /* renamed from: s */
    private C13768f f35853s;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C13772d mo25724a() {
        C13772d dVar;
        C13619c cVar;
        C13619c a;
        if (C14237b.m29187b()) {
            C14237b.m29186a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            C13842a aVar = this.f35918m;
            String valueOf = String.valueOf(C13786b.f35903n.getAndIncrement());
            if (aVar instanceof C13772d) {
                dVar = (C13772d) aVar;
            } else {
                dVar = this.f35850p.mo25727a();
            }
            C13691k a2 = mo25750a((C13842a) dVar, valueOf);
            C14229b bVar = (C14229b) this.f35908c;
            C13969f fVar = this.f35849o.f36483d;
            if (fVar == null || bVar == null) {
                cVar = null;
            } else {
                if (bVar.mPostprocessor != null) {
                    a = fVar.mo26146b(bVar, this.f35907b);
                } else {
                    a = fVar.mo26145a(bVar, this.f35907b);
                }
                cVar = a;
            }
            dVar.mo25706a(a2, valueOf, cVar, this.f35907b, this.f35851q, this.f35852r);
            dVar.mo25708a(this.f35853s);
            return dVar;
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* renamed from: a */
    public final C13773e mo25723a(String str) {
        if (str == null || str.isEmpty()) {
            return (C13773e) super.mo25757b(C14229b.fromUri(str));
        }
        return mo25725b(Uri.parse(str));
    }

    /* renamed from: a */
    public final C13773e mo25725b(Uri uri) {
        if (uri == null) {
            return (C13773e) super.mo25757b(null);
        }
        return (C13773e) super.mo25757b(C14232c.m29169a(uri).mo26454a(C13953e.m28430c()).mo26449a());
    }

    public C13773e(Context context, C13776g gVar, C14001h hVar, Set<C13791d> set) {
        super(context, set);
        this.f35849o = hVar;
        this.f35850p = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C13745c mo25721a(C13842a aVar, String str, Object obj, Object obj2, C13789a aVar2) {
        C14231b bVar;
        C14050c cVar;
        C14229b bVar2 = (C14229b) obj;
        C14001h hVar = this.f35849o;
        switch (aVar2) {
            case FULL_FETCH:
                bVar = C14231b.FULL_FETCH;
                break;
            case DISK_CACHE:
                bVar = C14231b.DISK_CACHE;
                break;
            case BITMAP_MEMORY_CACHE:
                bVar = C14231b.BITMAP_MEMORY_CACHE;
                break;
            default:
                StringBuilder sb = new StringBuilder("Cache level");
                sb.append(aVar2);
                sb.append("is not supported. ");
                throw new RuntimeException(sb.toString());
        }
        if (aVar instanceof C13772d) {
            cVar = ((C13772d) aVar).mo25704a();
        } else {
            cVar = null;
        }
        return hVar.mo26184a(bVar2, obj2, bVar, cVar);
    }
}
