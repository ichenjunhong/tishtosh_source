package com.p683ss.android.ugc.aweme.share.p2170ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9395d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.share.p2170ui.LiveShareCodeView.C42240b;
import java.io.File;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.ui.a */
public final class C42242a {

    /* renamed from: a */
    public static String f106780a = null;

    /* renamed from: b */
    public static UrlModel f106781b = null;

    /* renamed from: c */
    static String f106782c = null;

    /* renamed from: d */
    static String f106783d = "live_share_card.png";

    /* renamed from: e */
    public static final C42242a f106784e = new C42242a();

    /* renamed from: f */
    private static final String f106785f = f106785f;

    /* renamed from: com.ss.android.ugc.aweme.share.ui.a$a */
    public static final class C42243a implements C42240b {

        /* renamed from: a */
        final /* synthetic */ LiveShareCodeView f106786a;

        /* renamed from: b */
        final /* synthetic */ Context f106787b;

        /* renamed from: c */
        final /* synthetic */ C52671b f106788c;

        /* renamed from: a */
        public final void mo86202a() {
            Bitmap bitmap;
            C42242a aVar = C42242a.f106784e;
            View view = this.f106786a;
            Context context = this.f106787b;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(context, "context");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            sb.append(C9395d.m18571a(sb2.toString()));
            sb.append(".png");
            C42242a.f106783d = sb.toString();
            File cacheDir = context.getCacheDir();
            C52711k.m112236a((Object) cacheDir, "context.cacheDir");
            C42242a.f106782c = cacheDir.getAbsolutePath();
            C52711k.m112240b(view, "v");
            view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            String str = null;
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                bitmap = null;
            } else {
                bitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Config.ARGB_8888);
                if (bitmap == null) {
                    C52711k.m112234a();
                }
                view.draw(new Canvas(bitmap));
            }
            if (bitmap != null && BitmapUtils.saveBitmapToSD(bitmap, C42242a.f106782c, C42242a.f106783d)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C42242a.f106782c);
                sb3.append('/');
                sb3.append(C42242a.f106783d);
                str = sb3.toString();
            }
            if (str != null) {
                this.f106788c.invoke(str);
            }
        }

        public C42243a(LiveShareCodeView liveShareCodeView, Context context, C52671b bVar) {
            this.f106786a = liveShareCodeView;
            this.f106787b = context;
            this.f106788c = bVar;
        }
    }

    private C42242a() {
    }
}
