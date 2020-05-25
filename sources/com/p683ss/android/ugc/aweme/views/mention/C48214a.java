package com.p683ss.android.ugc.aweme.views.mention;

import android.text.Editable;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.views.mention.a */
final /* synthetic */ class C48214a implements Comparator {

    /* renamed from: a */
    private final Editable f121339a;

    C48214a(Editable editable) {
        this.f121339a = editable;
    }

    public final int compare(Object obj, Object obj2) {
        Editable editable = this.f121339a;
        return editable.getSpanStart((MentionSpan) obj) - editable.getSpanStart((MentionSpan) obj2);
    }
}
