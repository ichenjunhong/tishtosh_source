package com.p683ss.android.ugc.common.component.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.ies.uikit.base.AbsActivity;

/* renamed from: com.ss.android.ugc.common.component.activity.ComponentActivity */
public abstract class ComponentActivity extends AbsActivity {

    /* renamed from: a */
    private SparseArray<Object> f121965a;

    /* renamed from: a */
    public abstract SparseArray<Object> mo96011a();

    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.f121965a.size(); i++) {
            this.f121965a.valueAt(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        for (int i = 0; i < this.f121965a.size(); i++) {
            this.f121965a.valueAt(i);
        }
    }

    public void onResume() {
        super.onResume();
        for (int i = 0; i < this.f121965a.size(); i++) {
            this.f121965a.valueAt(i);
        }
    }

    public void onStart() {
        super.onStart();
        for (int i = 0; i < this.f121965a.size(); i++) {
            this.f121965a.valueAt(i);
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.f121965a.size(); i++) {
            this.f121965a.valueAt(i);
        }
    }

    public void onDestroy() {
        for (int i = 0; i < this.f121965a.size(); i++) {
            this.f121965a.valueAt(i);
        }
        if (this.f121965a != null) {
            this.f121965a.clear();
            this.f121965a = null;
        }
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        this.f121965a = mo96011a();
        super.onCreate(bundle);
        for (int i = 0; i < this.f121965a.size(); i++) {
            this.f121965a.valueAt(i);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        for (int i = 0; i < this.f121965a.size(); i++) {
            this.f121965a.valueAt(i);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (int i3 = 0; i3 < this.f121965a.size(); i3++) {
            this.f121965a.valueAt(i3);
        }
    }
}
