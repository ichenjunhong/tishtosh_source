package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.BaseLockActivity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.C22743b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.m */
public class C22780m extends C22743b {
    /* renamed from: b */
    public final void mo47183b(String str) {
        boolean z = this.f60959d;
        Bundle bundle = new Bundle();
        bundle.putString("password", str);
        bundle.putBoolean("from_change_pwd", z);
        C22774i iVar = new C22774i();
        iVar.setArguments(bundle);
        ((BaseLockActivity) getActivity()).mo47173a(iVar);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.cyw);
        TextView textView2 = (TextView) view.findViewById(R.id.cyv);
        if (this.f60959d) {
            textView.setText(getString(R.string.dzi));
            textView2.setVisibility(4);
            return;
        }
        if (mo47196e() == 0) {
            i = R.string.dzj;
        } else {
            i = R.string.dzk;
        }
        textView2.setText(getString(i));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pz, viewGroup, false);
    }
}
