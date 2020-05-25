package com.p683ss.android.ugc.trill.setting.children;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenLanguageSettingHostFragment */
public class ChildrenLanguageSettingHostFragment extends C23526a {

    /* renamed from: a */
    public C50402a f126375a;
    CommonItemView mChangeLanguageItem;
    TextView mTitle;
    View mTitleLayout;

    /* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenLanguageSettingHostFragment$a */
    public interface C50402a {
        /* renamed from: a */
        void mo98303a(Bundle bundle);
    }

    public void changeLanguage() {
        Bundle bundle = new Bundle();
        if (this.f126375a != null) {
            this.f126375a.mo98303a(bundle);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void exit(View view) {
        getActivity().finish();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTitle.setText(R.string.bvl);
        this.mTitleLayout.setBackgroundColor(getResources().getColor(R.color.a2j));
        this.mChangeLanguageItem.setLeftText(C33106b.m76112c(getContext()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mv, viewGroup, false);
        ButterKnife.bind(inflate);
        return inflate;
    }
}
