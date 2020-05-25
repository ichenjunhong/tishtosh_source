package com.p683ss.android.ugc.aweme.share.improve.p2162b;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42079d;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.b */
public final class C42134b extends C42140e {

    /* renamed from: a */
    public static final C42135a f106596a = new C42135a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.b$a */
    public static final class C42135a {
        private C42135a() {
        }

        public /* synthetic */ C42135a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.an3;
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        return true;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "copy";
    }

    /* renamed from: c */
    public final String mo86137c() {
        String b = C23723j.m58219b(R.string.dhn);
        C52711k.m112236a((Object) b, "ResUtils.getString(R.string.share_copy_link)");
        return b;
    }

    /* renamed from: a */
    public final boolean mo49947a(C42318f fVar, Context context) {
        C52711k.m112240b(fVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        if (fVar instanceof C42322h) {
            return mo86138a((C42322h) fVar, context);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo86138a(C42322h hVar, Context context) {
        C52711k.m112240b(hVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        C42079d dVar = new C42079d(null, false, false, 7, null);
        dVar.mo86117a(hVar.f106878b, context);
        return true;
    }
}
