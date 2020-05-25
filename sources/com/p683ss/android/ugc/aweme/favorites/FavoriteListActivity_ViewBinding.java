package com.p683ss.android.ugc.aweme.favorites;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.FavoriteListActivity_ViewBinding */
public class FavoriteListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FavoriteListActivity f77526a;

    public void unbind() {
        FavoriteListActivity favoriteListActivity = this.f77526a;
        if (favoriteListActivity != null) {
            this.f77526a = null;
            favoriteListActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FavoriteListActivity_ViewBinding(FavoriteListActivity favoriteListActivity, View view) {
        this.f77526a = favoriteListActivity;
        favoriteListActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
    }
}
