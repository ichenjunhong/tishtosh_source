package com.google.android.gms.auth.api.p1032a;

import android.content.Context;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15223g;
import com.google.android.gms.common.api.C15230e;
import com.google.android.gms.common.api.internal.C15243a;
import com.google.android.gms.common.api.internal.C15343l;
import com.google.android.gms.internal.p1041b.C16469g;
import com.google.android.gms.p1033b.C15179g;

/* renamed from: com.google.android.gms.auth.api.a.a */
public abstract class C15109a extends C15230e<Object> {

    /* renamed from: i */
    private static final C15223g<C16469g> f39015i = new C15223g<>();

    /* renamed from: j */
    private static final C15212a<C16469g, Object> f39016j = new C15110b();

    /* renamed from: k */
    private static final C15211a<Object> f39017k = new C15211a<>("SmsRetriever.API", f39016j, f39015i);

    public C15109a(Context context) {
        super(context, f39017k, null, (C15343l) new C15243a());
    }

    /* renamed from: a */
    public abstract C15179g<Void> mo27862a();
}
