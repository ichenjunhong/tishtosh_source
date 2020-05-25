package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22770h.C22773a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.setting.p2148ui.RadioSettingItem;
import com.p683ss.android.ugc.aweme.setting.p2148ui.RadioSettingItem.C41773a;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockSelectTimeFragmentV2 */
public class TimeLockSelectTimeFragmentV2 extends C23526a {
    ViewGroup mContainerLayout;
    TextView mTitle;

    public void back() {
        getActivity().onBackPressed();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final C0198r<C22773a> rVar = ((TimeLockOptionViewModel) C0214z.m440a(getActivity()).mo359a(TimeLockOptionViewModel.class)).f61036a;
        this.mTitle.setText(getString(R.string.dye));
        Iterator it = C22773a.f61018a.iterator();
        while (it.hasNext()) {
            final C22773a aVar = (C22773a) it.next();
            RadioSettingItem radioSettingItem = new RadioSettingItem(getContext());
            boolean z = false;
            radioSettingItem.setStartText(getString(R.string.dz9, Integer.valueOf(aVar.f61019b)));
            radioSettingItem.setOnSettingItemClickListener(new C41773a() {
                /* renamed from: a */
                public final boolean mo47209a(View view) {
                    rVar.setValue(aVar);
                    return false;
                }
            });
            if (((C22773a) rVar.getValue()).f61019b == aVar.f61019b) {
                z = true;
            }
            radioSettingItem.setChecked(z);
            radioSettingItem.setRippleColor(getResources().getColor(R.color.vf));
            radioSettingItem.setRippleDelayClick(true);
            radioSettingItem.setRippleOverlay(true);
            radioSettingItem.setRippleHover(true);
            this.mContainerLayout.addView(radioSettingItem, this.mContainerLayout.getChildCount());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qo, viewGroup, false);
    }
}
