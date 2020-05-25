package com.p683ss.android.ugc.aweme.sharer.p2173ui;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.g */
public interface C42357g {

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.g$a */
    public static final class C42358a {
        /* renamed from: a */
        public static void m93001a(C42357g gVar, Context context) {
            C52711k.m112240b(context, "context");
        }

        /* renamed from: a */
        public static void m93002a(C42357g gVar, ImageView imageView) {
            C52711k.m112240b(imageView, "iconView");
        }

        /* renamed from: a */
        public static int m93000a(C42357g gVar) {
            return gVar.mo49948a();
        }

        /* renamed from: a */
        public static void m93003a(C42357g gVar, TextView textView) {
            C52711k.m112240b(textView, "textView");
            textView.setText(textView.getResources().getString(gVar.mo49953b()));
        }
    }

    /* renamed from: a */
    int mo49948a();

    /* renamed from: a */
    void mo49949a(Context context);

    /* renamed from: a */
    void mo49950a(Context context, SharePackage sharePackage);

    /* renamed from: a */
    void mo49951a(ImageView imageView);

    /* renamed from: a */
    void mo49952a(TextView textView);

    /* renamed from: b */
    int mo49953b();

    /* renamed from: c */
    String mo49954c();

    /* renamed from: d */
    boolean mo49955d();

    /* renamed from: e */
    boolean mo49956e();

    /* renamed from: f */
    boolean mo49957f();

    /* renamed from: g */
    int mo49958g();
}
