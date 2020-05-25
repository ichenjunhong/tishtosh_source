package com.p683ss.android.ugc.aweme.app;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.app.LogListActivity_ViewBinding */
public class LogListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LogListActivity f61175a;

    public void unbind() {
        LogListActivity logListActivity = this.f61175a;
        if (logListActivity != null) {
            this.f61175a = null;
            logListActivity.listView = null;
            logListActivity.clearBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LogListActivity_ViewBinding(LogListActivity logListActivity, View view) {
        this.f61175a = logListActivity;
        logListActivity.listView = (ListView) Utils.findRequiredViewAsType(view, R.id.bc3, "field 'listView'", ListView.class);
        logListActivity.clearBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.to, "field 'clearBtn'", TextView.class);
    }
}
