package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by */
public final class C26446by {
    /* renamed from: a */
    public static void m63937a(Activity activity, Fragment fragment) {
        if (activity != null && fragment != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("trigger_by");
                if (stringExtra != null) {
                    Bundle arguments = fragment.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                        fragment.setArguments(arguments);
                    }
                    arguments.putString("trigger_by", stringExtra);
                }
            }
        }
    }
}
