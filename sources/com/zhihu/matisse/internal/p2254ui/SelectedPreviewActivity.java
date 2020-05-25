package com.zhihu.matisse.internal.p2254ui;

import android.os.Bundle;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.internal.entity.Item;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zhihu.matisse.internal.ui.SelectedPreviewActivity */
public class SelectedPreviewActivity extends BasePreviewActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C45353c.m98893a().f114679p) {
            setResult(0);
            finish();
            return;
        }
        ArrayList parcelableArrayList = getIntent().getBundleExtra("extra_default_bundle").getParcelableArrayList("state_selection");
        this.f114691d.mo110065a((List<Item>) parcelableArrayList);
        this.f114691d.notifyDataSetChanged();
        if (this.f114689b.f114669f) {
            this.f114692e.setCheckedNum(1);
        } else {
            this.f114692e.setChecked(true);
        }
        this.f114696i = 0;
        mo91676a((Item) parcelableArrayList.get(0));
    }
}
