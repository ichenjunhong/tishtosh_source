package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity_ViewBinding */
public class MusCountryListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusCountryListActivity f58403a;

    public void unbind() {
        MusCountryListActivity musCountryListActivity = this.f58403a;
        if (musCountryListActivity != null) {
            this.f58403a = null;
            musCountryListActivity.etSearch = null;
            musCountryListActivity.txtSearch = null;
            musCountryListActivity.back = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusCountryListActivity_ViewBinding(MusCountryListActivity musCountryListActivity, View view) {
        this.f58403a = musCountryListActivity;
        musCountryListActivity.etSearch = (EditText) Utils.findRequiredViewAsType(view, R.id.cj3, "field 'etSearch'", EditText.class);
        musCountryListActivity.txtSearch = (TextView) Utils.findRequiredViewAsType(view, R.id.cjt, "field 'txtSearch'", TextView.class);
        musCountryListActivity.back = (ImageView) Utils.findRequiredViewAsType(view, R.id.ik, "field 'back'", ImageView.class);
    }
}
