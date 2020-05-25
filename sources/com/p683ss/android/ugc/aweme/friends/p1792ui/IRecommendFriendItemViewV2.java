package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.IRecommendFriendItemViewV2 */
public abstract class IRecommendFriendItemViewV2 extends RelativeLayout {

    /* renamed from: a */
    private HashMap f84952a;

    /* renamed from: a */
    public View mo66184a(int i) {
        if (this.f84952a == null) {
            this.f84952a = new HashMap();
        }
        View view = (View) this.f84952a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f84952a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract void setEnterFrom(String str);

    public abstract void setListener(C23452y<User> yVar);

    public IRecommendFriendItemViewV2(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }
}
