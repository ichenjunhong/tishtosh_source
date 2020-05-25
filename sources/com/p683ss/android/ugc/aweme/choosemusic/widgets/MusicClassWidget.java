package com.p683ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.C0199s;
import android.content.Intent;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.C23270a;
import com.p683ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24863s;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder;
import com.p683ss.android.ugc.aweme.music.adapter.C37289e;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget */
public class MusicClassWidget extends ListItemWidget<MusicClassViewHolder> implements C0199s<C23274a> {

    /* renamed from: h */
    public int f66335h;

    /* renamed from: i */
    public int f66336i;

    /* renamed from: j */
    public int f66337j;

    public void onCreate() {
        super.onCreate();
        this.f62238e.mo48226a("list", (C0199s<C23274a>) this);
        this.f66337j = ((Integer) this.f62238e.mo48229a("key_choose_music_type")).intValue();
    }

    /* renamed from: a */
    private void m60878a(List<Object> list) {
        if (list != null && list.size() > 0) {
            ((MusicClassViewHolder) this.f62218a).mo51004a(((C24863s) list.get(this.f66335h)).f65789a, this.f66337j);
            ((MusicClassViewHolder) this.f62218a).f66212b = new C37289e() {
                /* renamed from: a */
                public final void mo51050a(C1352v vVar, View view, MusicModel musicModel) {
                    if (view.getId() == R.id.dhi) {
                        Intent intent = new Intent(MusicClassWidget.this.f62235b, MusicDetailListActivity.class);
                        intent.putExtra("music_type", 4);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", MusicClassWidget.this.f66337j);
                        MusicClassWidget.this.mo48240a(intent, MusicClassWidget.this.f66336i);
                    }
                }
            };
            ((MusicClassViewHolder) this.f62218a).f66213c = new C25049f(this);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (this.f62218a != null) {
            String str = aVar.f62242a;
            char c = 65535;
            if (str.hashCode() == 3322014 && str.equals("list")) {
                c = 0;
            }
            if (c == 0) {
                m60878a((List) aVar.mo48246a());
            }
        }
    }

    /* renamed from: a */
    public final void mo48220a(C23270a aVar) {
        super.mo48220a(aVar);
        m60878a((List) this.f62238e.mo48229a("list"));
    }

    /* renamed from: a */
    public final void mo48239a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.f66336i) {
            mo48242c().setResult(-1, intent);
            mo48242c().finish();
        }
    }
}
