package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.ImportFromMailListView */
public class ImportFromMailListView extends LinearLayout {
    public ImportFromMailListView(Context context) {
        this(context, null);
    }

    public ImportFromMailListView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public ImportFromMailListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.av0, this);
        setOrientation(1);
        setLayoutParams(new LayoutParams(-1, -2));
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                ImportFromMailListView importFromMailListView = ImportFromMailListView.this;
                boolean z = false;
                if (C0726c.m2090a(importFromMailListView.getContext(), "android.permission.READ_CONTACTS") != 0) {
                    C0636b.m1718a((Activity) importFromMailListView.getContext(), new String[]{"android.permission.READ_CONTACTS"}, 1);
                } else {
                    z = true;
                }
                if (z) {
                    ComponentName componentName = new ComponentName(importFromMailListView.getContext().getPackageName(), "com.ss.android.ugc.aweme.friends.ui.ContactsActivity");
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    importFromMailListView.getContext().startActivity(intent);
                    return;
                }
                C10691a.m21548c(importFromMailListView.getContext(), (int) R.string.hd).mo19066a();
            }
        });
    }
}
