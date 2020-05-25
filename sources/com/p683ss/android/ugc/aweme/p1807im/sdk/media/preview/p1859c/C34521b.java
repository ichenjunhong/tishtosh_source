package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1859c;

import android.app.Activity;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.MediaPreviewActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.model.C34537a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1858b.C34517a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.c.b */
public final class C34521b {

    /* renamed from: a */
    public static C34517a f88999a;

    /* renamed from: b */
    public static final C34521b f89000b = new C34521b();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.c.b$a */
    public static final class C34522a extends C52712l implements C52671b<C34409a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52670a f89001a;

        public C34522a(C52670a aVar) {
            this.f89001a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C34409a) obj, "it");
            this.f89001a.invoke();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.c.b$b */
    public static final class C34523b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34517a f89002a;

        /* renamed from: b */
        final /* synthetic */ Activity f89003b;

        /* renamed from: c */
        final /* synthetic */ C34537a f89004c;

        /* renamed from: d */
        final /* synthetic */ int f89005d;

        public C34523b(C34517a aVar, Activity activity, C34537a aVar2, int i) {
            this.f89002a = aVar;
            this.f89003b = activity;
            this.f89004c = aVar2;
            this.f89005d = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C34521b.f88999a = this.f89002a;
            Activity activity = this.f89003b;
            C34537a aVar = this.f89004c;
            int i = this.f89005d;
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(aVar, "settings");
            Intent intent = new Intent(activity, MediaPreviewActivity.class);
            intent.putExtra("extra_preview_settings", aVar);
            activity.startActivityForResult(intent, i);
            return C52860x.f131107a;
        }
    }

    private C34521b() {
    }
}
