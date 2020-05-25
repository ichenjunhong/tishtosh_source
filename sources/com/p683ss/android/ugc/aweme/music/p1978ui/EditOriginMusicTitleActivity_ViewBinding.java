package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity_ViewBinding */
public class EditOriginMusicTitleActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EditOriginMusicTitleActivity f95507a;

    /* renamed from: b */
    private View f95508b;

    public void unbind() {
        EditOriginMusicTitleActivity editOriginMusicTitleActivity = this.f95507a;
        if (editOriginMusicTitleActivity != null) {
            this.f95507a = null;
            editOriginMusicTitleActivity.mTitleBar = null;
            editOriginMusicTitleActivity.musicTitleEdt = null;
            editOriginMusicTitleActivity.clearBtn = null;
            this.f95508b.setOnClickListener(null);
            this.f95508b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public EditOriginMusicTitleActivity_ViewBinding(final EditOriginMusicTitleActivity editOriginMusicTitleActivity, View view) {
        this.f95507a = editOriginMusicTitleActivity;
        editOriginMusicTitleActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
        editOriginMusicTitleActivity.musicTitleEdt = (EditText) Utils.findRequiredViewAsType(view, R.id.bou, "field 'musicTitleEdt'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.tr, "field 'clearBtn' and method 'onViewClicked'");
        editOriginMusicTitleActivity.clearBtn = (ImageView) Utils.castView(findRequiredView, R.id.tr, "field 'clearBtn'", ImageView.class);
        this.f95508b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                editOriginMusicTitleActivity.onViewClicked(view);
            }
        });
    }
}
