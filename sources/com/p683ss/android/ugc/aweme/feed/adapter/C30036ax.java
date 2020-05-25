package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bytedance.common.utility.C9414h;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ax */
public final class C30036ax implements OnAttachStateChangeListener {

    /* renamed from: a */
    public static final C30037a f78404a = new C30037a(null);

    /* renamed from: b */
    private final SmartImageView f78405b;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.ax$a */
    public static final class C30037a {
        private C30037a() {
        }

        public /* synthetic */ C30037a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m70444a(List<String> list, String str) {
            int i;
            long j;
            C52711k.m112240b(list, "urls");
            if (C9414h.m18630a(list)) {
                return null;
            }
            if (str != null) {
                try {
                    j = Long.parseLong(str);
                } catch (Exception unused) {
                    i = 0;
                }
            } else {
                j = 0;
            }
            i = (int) (j % ((long) list.size()));
            if (i < 0 || i >= list.size()) {
                i = 0;
            }
            return (String) list.get(i);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        SmartImageView smartImageView = this.f78405b;
        if (smartImageView != null) {
            smartImageView.setAttached(true);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        SmartImageView smartImageView = this.f78405b;
        if (smartImageView != null) {
            smartImageView.setAttached(false);
        }
    }
}
