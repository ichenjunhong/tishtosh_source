package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.graphics.drawable.C0809a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45421bg.C45422a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem */
public class PermissionSettingItem extends PublishSettingItem implements OnClickListener {

    /* renamed from: a */
    private ArrayList<OnClickListener> f113655a;

    /* renamed from: b */
    private int f113656b;

    public int getPermission() {
        return this.f113656b;
    }

    /* renamed from: a */
    public final void mo91079a(OnClickListener onClickListener) {
        if (this.f113655a == null) {
            this.f113655a = new ArrayList<>();
        }
        this.f113655a.add(onClickListener);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C9376b.m18558a((Collection<T>) this.f113655a)) {
            Iterator it = this.f113655a.iterator();
            while (it.hasNext()) {
                ((OnClickListener) it.next()).onClick(view);
            }
        }
    }

    public void setPermission(int i) {
        this.f113656b = i;
        if (i == 0) {
            C45422a.m98995a(this);
            Drawable a = C0726c.m2091a(getContext(), (int) R.drawable.abe);
            ColorStateList valueOf = ColorStateList.valueOf(C0726c.m2098c(getContext(), R.color.a1k));
            Drawable f = C0809a.m2337f(a);
            C0809a.m2327a(f, valueOf);
            setDrawableLeft(f);
        } else if (i == 1) {
            setSubtitle((int) R.string.cxo);
            setDrawableLeft((int) R.drawable.abg);
        } else {
            setSubtitle((int) R.string.b6n);
            setDrawableLeft((int) R.drawable.aac);
        }
    }

    public PermissionSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDrawableLeft(C0726c.m2091a(context, (int) R.drawable.abe));
        setTitle((int) R.string.cxs);
        C45422a.m98995a(this);
        this.f113680g.setBackground(C10678c.m21505e(context));
        if (!C39618d.f101151O.mo83117a(C40796a.PrivateAvailable)) {
            setVisibility(8);
        }
        setOnClickListener(this);
    }
}
