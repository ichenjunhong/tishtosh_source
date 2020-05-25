package com.p683ss.android.ugc.common.component.p2417a;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.C11079a;

/* renamed from: com.ss.android.ugc.common.component.a.a */
public abstract class C48519a extends C11079a {

    /* renamed from: a */
    private SparseArray<C48521c> f121962a;

    /* renamed from: B */
    public abstract SparseArray<C48521c> mo48685B();

    public void onDestroy() {
        for (int i = 0; i < this.f121962a.size(); i++) {
            ((C48521c) this.f121962a.valueAt(i)).mo62854aw();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.f121962a.size(); i++) {
            ((C48521c) this.f121962a.valueAt(i)).mo62830aE();
        }
    }

    public void onResume() {
        super.onResume();
        for (int i = 0; i < this.f121962a.size(); i++) {
            ((C48521c) this.f121962a.valueAt(i)).mo55812l();
        }
    }

    public void onStart() {
        super.onStart();
        for (int i = 0; i < this.f121962a.size(); i++) {
            ((C48521c) this.f121962a.valueAt(i)).mo62855ax();
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.f121962a.size(); i++) {
            ((C48521c) this.f121962a.valueAt(i)).az_();
        }
    }

    public void onDetach() {
        for (int i = 0; i < this.f121962a.size(); i++) {
            ((C48521c) this.f121962a.valueAt(i)).mo62828aC();
        }
        if (this.f121962a != null) {
            this.f121962a.clear();
            this.f121962a = null;
        }
        super.onDetach();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (int i = 0; i < this.f121962a.size(); i++) {
            this.f121962a.valueAt(i);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (int i = 0; i < this.f121962a.size(); i++) {
            ((C48521c) this.f121962a.valueAt(i)).mo58361a(bundle);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        for (int i = 0; i < this.f121962a.size(); i++) {
            this.f121962a.valueAt(i);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        for (int i = 0; i < this.f121962a.size(); i++) {
            this.f121962a.valueAt(i);
        }
    }

    public void onAttach(Activity activity) {
        this.f121962a = mo48685B();
        for (int i = 0; i < this.f121962a.size(); i++) {
            ((C48521c) this.f121962a.valueAt(i)).mo62815a(activity, this);
        }
        super.onAttach(activity);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
