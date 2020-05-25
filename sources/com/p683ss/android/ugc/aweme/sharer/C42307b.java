package com.p683ss.android.ugc.aweme.sharer;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.b */
public interface C42307b {

    /* renamed from: com.ss.android.ugc.aweme.sharer.b$a */
    public static final class C42308a {
        /* renamed from: a */
        public static boolean m92907a(C42307b bVar, Context context) {
            C52711k.m112240b(context, "context");
            return true;
        }

        /* renamed from: a */
        public static int m92905a(C42307b bVar) {
            return bVar.mo86131a();
        }

        /* renamed from: a */
        public static void m92906a(C42307b bVar, RemoteImageView remoteImageView, boolean z) {
            int i;
            C52711k.m112240b(remoteImageView, "imageView");
            if (z) {
                i = bVar.mo86140e();
            } else {
                i = bVar.mo86131a();
            }
            remoteImageView.setImageResource(i);
        }
    }

    /* renamed from: a */
    int mo86131a();

    /* renamed from: a */
    void mo86139a(RemoteImageView remoteImageView, boolean z);

    /* renamed from: a */
    boolean mo86141a(Context context);

    /* renamed from: a */
    boolean mo86132a(Context context, C42318f fVar);

    /* renamed from: a */
    boolean mo49947a(C42318f fVar, Context context);

    /* renamed from: a */
    boolean mo86138a(C42322h hVar, Context context);

    /* renamed from: a */
    boolean mo86133a(C42323i iVar, Context context);

    /* renamed from: a */
    boolean mo86134a(C42324j jVar, Context context);

    /* renamed from: a */
    boolean mo86135a(C42325k kVar, Context context);

    /* renamed from: b */
    String mo86136b();

    /* renamed from: c */
    String mo86137c();

    /* renamed from: e */
    int mo86140e();

    /* renamed from: f */
    float mo86142f();

    /* renamed from: g */
    boolean mo86143g();
}
