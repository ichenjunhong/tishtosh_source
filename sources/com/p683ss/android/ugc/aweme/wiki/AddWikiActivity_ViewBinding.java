package com.p683ss.android.ugc.aweme.wiki;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity_ViewBinding */
public final class AddWikiActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddWikiActivity f121750a;

    /* renamed from: b */
    private View f121751b;

    /* renamed from: c */
    private View f121752c;

    /* renamed from: d */
    private View f121753d;

    public final void unbind() {
        AddWikiActivity addWikiActivity = this.f121750a;
        if (addWikiActivity != null) {
            this.f121750a = null;
            addWikiActivity.webView = null;
            addWikiActivity.backBtn = null;
            addWikiActivity.closeBtn = null;
            addWikiActivity.titleView = null;
            addWikiActivity.addBtn = null;
            addWikiActivity.statusBar = null;
            this.f121751b.setOnClickListener(null);
            this.f121751b = null;
            this.f121752c.setOnClickListener(null);
            this.f121752c = null;
            this.f121753d.setOnClickListener(null);
            this.f121753d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AddWikiActivity_ViewBinding(final AddWikiActivity addWikiActivity, View view) {
        this.f121750a = addWikiActivity;
        addWikiActivity.webView = (CrossPlatformWebView) Utils.findRequiredViewAsType(view, R.id.a2j, "field 'webView'", CrossPlatformWebView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "field 'backBtn' and method 'onClickBack'");
        addWikiActivity.backBtn = (ImageView) Utils.castView(findRequiredView, R.id.ik, "field 'backBtn'", ImageView.class);
        this.f121751b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addWikiActivity.onClickBack();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ui, "field 'closeBtn' and method 'onClickClose'");
        addWikiActivity.closeBtn = (ImageView) Utils.castView(findRequiredView2, R.id.ui, "field 'closeBtn'", ImageView.class);
        this.f121752c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addWikiActivity.onClickClose();
            }
        });
        addWikiActivity.titleView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'titleView'", DmtTextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.db, "field 'addBtn' and method 'onClickAdd'");
        addWikiActivity.addBtn = (LinearLayout) Utils.castView(findRequiredView3, R.id.db, "field 'addBtn'", LinearLayout.class);
        this.f121753d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addWikiActivity.onClickAdd();
            }
        });
        addWikiActivity.statusBar = Utils.findRequiredView(view, R.id.csm, "field 'statusBar'");
    }
}
