package com.zhihu.matisse.internal.p2254ui;

import android.database.Cursor;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p2252b.C45342b;
import com.zhihu.matisse.internal.p2252b.C45342b.C45343a;
import com.zhihu.matisse.internal.p2254ui.p2626a.C52533c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zhihu.matisse.internal.ui.AlbumPreviewActivity */
public class AlbumPreviewActivity extends BasePreviewActivity implements C45343a {

    /* renamed from: l */
    private C45342b f114686l = new C45342b();

    /* renamed from: m */
    private boolean f114687m;

    /* renamed from: a */
    public final void mo91640a() {
    }

    public void onDestroy() {
        super.onDestroy();
        this.f114686l.mo91637a();
    }

    /* renamed from: a */
    public final void mo91641a(Cursor cursor) {
        if (cursor != null) {
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                arrayList.add(Item.m98888a(cursor));
            }
            if (!arrayList.isEmpty()) {
                C52533c cVar = (C52533c) this.f114690c.getAdapter();
                cVar.mo110065a((List<Item>) arrayList);
                cVar.notifyDataSetChanged();
                if (!this.f114687m) {
                    this.f114687m = true;
                    int indexOf = arrayList.indexOf((Item) getIntent().getParcelableExtra("extra_item"));
                    this.f114690c.setCurrentItem(indexOf, false);
                    this.f114696i = indexOf;
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C45353c.m98893a().f114679p) {
            setResult(0);
            finish();
            return;
        }
        this.f114686l.mo91638a((FragmentActivity) this, (C45343a) this);
        this.f114686l.mo91639a((Album) getIntent().getParcelableExtra("extra_album"), false);
        Item item = (Item) getIntent().getParcelableExtra("extra_item");
        if (this.f114689b.f114669f) {
            this.f114692e.setCheckedNum(this.f114688a.mo91652e(item));
        } else {
            this.f114692e.setChecked(this.f114688a.mo91649c(item));
        }
        mo91676a(item);
    }
}
