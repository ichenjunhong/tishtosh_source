package com.p683ss.android.ugc.aweme.commercialize.p1544a;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.views.AdCommentView;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22324a;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22429c;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22430d;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22450d;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commercialize.a.a */
public final class C25589a extends C22450d<C22429c> {

    /* renamed from: a */
    private AdCommentView f67736a;

    /* renamed from: b */
    private WeakReference<C22324a> f67737b;

    /* renamed from: a */
    public final void mo52727a(String str) {
        this.f67736a.setEventType(str);
    }

    public C25589a(View view, C22324a aVar) {
        super(view);
        this.f67736a = (AdCommentView) view;
        this.f67737b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46525a(Context context, C22430d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C22429c cVar = (C22429c) dVar;
        this.f67736a.setData(cVar.f60427e);
        Rect rect = cVar.f60428f;
        AdCommentView adCommentView = this.f67736a;
        if (rect != null) {
            if (rect.top >= 0) {
                i = rect.top;
            } else {
                i = adCommentView.getPaddingTop();
            }
            if (rect.bottom >= 0) {
                i2 = rect.bottom;
            } else {
                i2 = adCommentView.getPaddingBottom();
            }
            if (VERSION.SDK_INT >= 17) {
                if (rect.left >= 0) {
                    i5 = rect.left;
                } else {
                    i5 = adCommentView.getPaddingStart();
                }
                if (rect.right >= 0) {
                    i6 = rect.right;
                } else {
                    i6 = adCommentView.getPaddingEnd();
                }
                adCommentView.setPaddingRelative(i5, i, i6, i2);
            } else {
                if (rect.left >= 0) {
                    i3 = rect.left;
                } else {
                    i3 = adCommentView.getPaddingLeft();
                }
                if (rect.right >= 0) {
                    i4 = rect.right;
                } else {
                    i4 = adCommentView.getPaddingRight();
                }
                if (C47918gj.m103682a(C11010c.m22280a())) {
                    adCommentView.setPadding(i4, i, i3, i2);
                } else {
                    adCommentView.setPadding(i3, i, i4, i2);
                }
            }
        }
        if (this.f67737b.get() != null) {
            this.f67736a.setOnInternalEventListener((C22324a) this.f67737b.get());
        }
    }
}
