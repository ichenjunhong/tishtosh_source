package com.p683ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.sharer.C42307b.C42308a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a */
public abstract class C42254a implements C42307b {
    /* renamed from: f */
    public float mo86142f() {
        return 0.34f;
    }

    /* renamed from: g */
    public boolean mo86143g() {
        return false;
    }

    /* renamed from: e */
    public int mo86140e() {
        return C42308a.m92905a(this);
    }

    /* renamed from: a */
    public boolean mo86141a(Context context) {
        C52711k.m112240b(context, "context");
        return C42308a.m92907a(this, context);
    }

    /* renamed from: a */
    public void mo86139a(RemoteImageView remoteImageView, boolean z) {
        C52711k.m112240b(remoteImageView, "imageView");
        C42308a.m92906a(this, remoteImageView, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo86229a(Context context, Intent intent) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        if (context.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public boolean mo49947a(C42318f fVar, Context context) {
        C52711k.m112240b(fVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        if (fVar instanceof C42322h) {
            return mo86138a((C42322h) fVar, context);
        }
        if (fVar instanceof C42324j) {
            return mo86134a((C42324j) fVar, context);
        }
        if (fVar instanceof C42323i) {
            return mo86133a((C42323i) fVar, context);
        }
        if (fVar instanceof C42325k) {
            return mo86135a((C42325k) fVar, context);
        }
        throw new C52775l();
    }

    /* renamed from: a */
    public boolean mo86138a(C42322h hVar, Context context) {
        C52711k.m112240b(hVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return mo86134a((C42324j) hVar, context);
    }
}
