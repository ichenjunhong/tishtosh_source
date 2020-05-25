package com.facebook.drawee.p930a.p931a;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.p918b.C13670i;
import com.facebook.common.p920d.C13682e;
import com.facebook.common.p920d.C13691k;
import com.facebook.drawee.p935b.C13777a;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p956a.p958b.C13915a;
import com.facebook.imagepipeline.p964d.C13986p;
import com.facebook.imagepipeline.p965e.C14001h;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p968h.C14038a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p914c.p915a.C13619c;
import java.util.Set;

/* renamed from: com.facebook.drawee.a.a.f */
public final class C13775f implements C13691k<C13773e> {

    /* renamed from: a */
    private final Context f35855a;

    /* renamed from: b */
    private final C14001h f35856b;

    /* renamed from: c */
    private final C13776g f35857c;

    /* renamed from: d */
    private final Set<C13791d> f35858d;

    /* renamed from: a */
    public final C13773e mo23157b() {
        return new C13773e(this.f35855a, this.f35857c, this.f35856b, this.f35858d);
    }

    public C13775f(Context context, C13759b bVar) {
        this(context, C14017k.m28587a(), bVar);
    }

    private C13775f(Context context, C14017k kVar, C13759b bVar) {
        this(context, kVar, null, bVar);
    }

    private C13775f(Context context, C14017k kVar, Set<C13791d> set, C13759b bVar) {
        C14038a aVar;
        C13682e<C14038a> eVar;
        C13691k<Boolean> kVar2;
        this.f35855a = context;
        this.f35856b = kVar.mo26211e();
        if (bVar == null || bVar.f35771b == null) {
            this.f35857c = new C13776g();
        } else {
            this.f35857c = bVar.f35771b;
        }
        C13776g gVar = this.f35857c;
        Resources resources = context.getResources();
        C13777a a = C13777a.m27905a();
        C13915a b = kVar.mo26208b();
        if (b == null) {
            aVar = null;
        } else {
            aVar = b.getAnimatedDrawableFactory(context);
        }
        C13670i a2 = C13670i.m27623a();
        C13986p<C13619c, C14042c> pVar = this.f35856b.f36480a;
        if (bVar != null) {
            eVar = bVar.f35770a;
        } else {
            eVar = null;
        }
        if (bVar != null) {
            kVar2 = bVar.f35772c;
        } else {
            kVar2 = null;
        }
        gVar.f35859a = resources;
        gVar.f35860b = a;
        gVar.f35861c = aVar;
        gVar.f35862d = a2;
        gVar.f35863e = pVar;
        gVar.f35864f = eVar;
        gVar.f35865g = kVar2;
        this.f35858d = null;
    }
}
