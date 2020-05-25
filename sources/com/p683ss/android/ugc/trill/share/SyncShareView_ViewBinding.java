package com.p683ss.android.ugc.trill.share;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.share.SyncShareView_ViewBinding */
public class SyncShareView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SyncShareView f126396a;

    /* renamed from: b */
    private View f126397b;

    /* renamed from: c */
    private View f126398c;

    public void unbind() {
        SyncShareView syncShareView = this.f126396a;
        if (syncShareView != null) {
            this.f126396a = null;
            syncShareView.mGroupHelo = null;
            syncShareView.mBtnHelo = null;
            syncShareView.mBtnTwitter = null;
            syncShareView.mLayoutAutoShare = null;
            syncShareView.mRadioGroup = null;
            syncShareView.mBtnSave = null;
            syncShareView.mBtnIns = null;
            syncShareView.mBtnInsStory = null;
            syncShareView.mSyncTitle = null;
            if (this.f126397b != null) {
                this.f126397b.setOnClickListener(null);
                this.f126397b = null;
            }
            this.f126398c.setOnClickListener(null);
            this.f126398c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SyncShareView_ViewBinding(final SyncShareView syncShareView, View view) {
        this.f126396a = syncShareView;
        syncShareView.mGroupHelo = (RadioGroup) Utils.findOptionalViewAsType(view, R.id.aml, "field 'mGroupHelo'", RadioGroup.class);
        View findViewById = view.findViewById(R.id.ny);
        syncShareView.mBtnHelo = (CanCancelRadioButton) Utils.castView(findViewById, R.id.ny, "field 'mBtnHelo'", CanCancelRadioButton.class);
        if (findViewById != null) {
            this.f126397b = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    syncShareView.onClickHelo(view);
                }
            });
        }
        View findRequiredView = Utils.findRequiredView(view, R.id.ph, "field 'mBtnTwitter' and method 'onClick'");
        syncShareView.mBtnTwitter = (ImageView) Utils.castView(findRequiredView, R.id.ph, "field 'mBtnTwitter'", ImageView.class);
        this.f126398c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                syncShareView.onClick(view);
            }
        });
        syncShareView.mLayoutAutoShare = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.b6y, "field 'mLayoutAutoShare'", LinearLayout.class);
        syncShareView.mRadioGroup = (RadioGroup) Utils.findRequiredViewAsType(view, R.id.c7y, "field 'mRadioGroup'", RadioGroup.class);
        syncShareView.mBtnSave = (CanCancelRadioButton) Utils.findRequiredViewAsType(view, R.id.p1, "field 'mBtnSave'", CanCancelRadioButton.class);
        syncShareView.mBtnIns = (CanCancelRadioButton) Utils.findRequiredViewAsType(view, R.id.o2, "field 'mBtnIns'", CanCancelRadioButton.class);
        syncShareView.mBtnInsStory = (CanCancelRadioButton) Utils.findRequiredViewAsType(view, R.id.o3, "field 'mBtnInsStory'", CanCancelRadioButton.class);
        syncShareView.mSyncTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.cwi, "field 'mSyncTitle'", TextView.class);
    }
}
