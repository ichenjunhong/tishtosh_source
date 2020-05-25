package com.p683ss.android.ugc.aweme.comment.p1526k;

import android.text.TextUtils;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.k.a */
public final class C25218a {
    /* renamed from: a */
    public static void m61325a(Comment comment, TextView textView) {
        if (!TextUtils.isEmpty(comment.getLabelText())) {
            String a = C2240a.m6772a(textView.getResources().getString(R.string.a8u), new Object[]{""});
            if (!TextUtils.isEmpty(a)) {
                textView.setVisibility(0);
                textView.setText(a);
                if (textView instanceof DmtTextView) {
                    ((DmtTextView) textView).setFontType(C10751d.f28908g);
                }
                return;
            }
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public static void m61326a(Comment comment, TextView textView, boolean z) {
        String labelText = comment.getLabelText();
        if (TextUtils.isEmpty(labelText) || comment.getLabelType() == 9) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(labelText);
        if (comment.getLabelType() == 1) {
            textView.setTextColor(textView.getResources().getColor(R.color.z_));
        } else {
            textView.setTextColor(textView.getResources().getColor(R.color.pz));
        }
        if (textView instanceof DmtTextView) {
            ((DmtTextView) textView).setFontType(C10751d.f28908g);
        }
    }
}
