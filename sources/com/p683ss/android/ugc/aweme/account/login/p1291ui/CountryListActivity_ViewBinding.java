package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.CountryListActivity_ViewBinding */
public class CountryListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CountryListActivity f58381a;

    public void unbind() {
        CountryListActivity countryListActivity = this.f58381a;
        if (countryListActivity != null) {
            this.f58381a = null;
            countryListActivity.etSearch = null;
            countryListActivity.txtSearch = null;
            countryListActivity.back = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CountryListActivity_ViewBinding(CountryListActivity countryListActivity, View view) {
        this.f58381a = countryListActivity;
        countryListActivity.etSearch = (EditText) Utils.findRequiredViewAsType(view, R.id.cj3, "field 'etSearch'", EditText.class);
        countryListActivity.txtSearch = (TextView) Utils.findRequiredViewAsType(view, R.id.cjt, "field 'txtSearch'", TextView.class);
        countryListActivity.back = (ImageView) Utils.findRequiredViewAsType(view, R.id.ik, "field 'back'", ImageView.class);
    }
}
