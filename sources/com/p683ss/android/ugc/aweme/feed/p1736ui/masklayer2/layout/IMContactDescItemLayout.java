package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.IMContactDescItemLayout */
public final class IMContactDescItemLayout extends LinearLayout {

    /* renamed from: a */
    private TextView f81365a = ((TextView) findViewById(R.id.a4e));

    /* renamed from: b */
    private RemoteImageView f81366b;

    public IMContactDescItemLayout(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.b60, this);
        int b = (int) C9432q.m18687b(getContext(), 12.0f);
        setPadding(b, b, b, b);
        setGravity(16);
        TextView textView = this.f81365a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f81366b = (RemoteImageView) findViewById(R.id.aqa);
    }

    /* renamed from: a */
    public final void mo63868a(IMContact iMContact) {
        C52711k.m112240b(iMContact, "contact");
        C23515d.m57669a(this.f81366b, iMContact.getDisplayAvatar());
        TextView textView = this.f81365a;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            sb.append(context.getResources().getText(R.string.ftv).toString());
            sb.append(": ");
            sb.append(iMContact.getDisplayName());
            textView.setText(sb.toString());
        }
    }

    public IMContactDescItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.b60, this);
        int b = (int) C9432q.m18687b(getContext(), 12.0f);
        setPadding(b, b, b, b);
        setGravity(16);
        TextView textView = this.f81365a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f81366b = (RemoteImageView) findViewById(R.id.aqa);
    }

    public IMContactDescItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.b60, this);
        int b = (int) C9432q.m18687b(getContext(), 12.0f);
        setPadding(b, b, b, b);
        setGravity(16);
        TextView textView = this.f81365a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f81366b = (RemoteImageView) findViewById(R.id.aqa);
    }
}
