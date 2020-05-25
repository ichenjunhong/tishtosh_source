package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.b */
public final class C27106b extends C1352v {

    /* renamed from: a */
    C27112g f71513a;

    /* renamed from: b */
    int f71514b;

    public C27106b(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        view.setOnLongClickListener(new OnLongClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C27106b f71515a;

            {
                this.f71515a = r1;
            }

            public final boolean onLongClick(View view) {
                String str;
                C27106b bVar = this.f71515a;
                View view2 = bVar.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                ClipboardManager clipboardManager = (ClipboardManager) view2.getContext().getSystemService("clipboard");
                StringBuilder sb = new StringBuilder();
                C27112g gVar = bVar.f71513a;
                String str2 = null;
                if (gVar != null) {
                    str = gVar.f71528a;
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append(" ");
                C27112g gVar2 = bVar.f71513a;
                if (gVar2 != null) {
                    str2 = gVar2.f71529b;
                }
                sb.append(str2);
                ClipData newPlainText = ClipData.newPlainText("label", sb.toString());
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                C10691a.m21537a(C11010c.m22280a(), "Copied").mo19066a();
                return true;
            }
        });
    }
}
