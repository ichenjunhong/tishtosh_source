package com.bytedance.android.livesdk.chatroom.end;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdkapi.depend.model.live.C8727z;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.q */
final /* synthetic */ class C5151q implements C1710e {

    /* renamed from: a */
    private final TopFansLayout f13809a;

    /* renamed from: b */
    private final C3846a f13810b;

    C5151q(TopFansLayout topFansLayout, C3846a aVar) {
        this.f13809a = topFansLayout;
        this.f13810b = aVar;
    }

    public final void accept(Object obj) {
        TopFansLayout topFansLayout = this.f13809a;
        List list = (List) obj;
        if (this.f13810b.mo8452l()) {
            if (!C9414h.m18630a(list)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C8727z zVar = (C8727z) it.next();
                    if (zVar == null || zVar.f23995a <= 0) {
                        it.remove();
                    }
                }
                if (C9414h.m18630a(list)) {
                    if (topFansLayout.f13673c != null) {
                        topFansLayout.f13673c.mo11015a();
                    }
                    return;
                }
                TypedArray obtainTypedArray = topFansLayout.getContext().getResources().obtainTypedArray(R.array.ag);
                topFansLayout.f13671a.clear();
                int i = 0;
                while (i < list.size()) {
                    if (i < obtainTypedArray.length()) {
                        User user = ((C8727z) list.get(i)).f23996b;
                        if (user != null) {
                            C5124b bVar = new C5124b(LayoutInflater.from(topFansLayout.getContext()).inflate(R.layout.am5, null));
                            C5213c.m11815a((ImageView) bVar.f13692c, user.getAvatarThumb(), (int) R.drawable.bt6);
                            if (user.getId() == TTLiveSDKContext.getHostService().mo10315h().mo14529b() || user.isFollowing() || !topFansLayout.f13680j) {
                                bVar.f13690a.setVisibility(8);
                            } else {
                                bVar.f13690a.setVisibility(0);
                            }
                            C8727z zVar2 = (C8727z) list.get(i);
                            zVar2.f23997c = i + 1;
                            bVar.f13690a.setTag(R.id.d5g, zVar2);
                            bVar.f13690a.setOnClickListener(topFansLayout.f13681k);
                            bVar.f13692c.setBackgroundResource(obtainTypedArray.getResourceId(i, 0));
                            bVar.f13692c.setTag(R.id.d5g, zVar2);
                            bVar.f13692c.setOnClickListener(topFansLayout.f13676f);
                            if (zVar2.f23996b != null) {
                                bVar.f13693d.setText(zVar2.f23996b.getNickName());
                                bVar.f13694e.setText(topFansLayout.f13674d.getResources().getString(R.string.ewo, new Object[]{C3890e.m9833a(zVar2.f23995a)}));
                            }
                            LayoutParams layoutParams = new LayoutParams(0, -2);
                            layoutParams.weight = 1.0f;
                            bVar.f13691b.setLayoutParams(layoutParams);
                            topFansLayout.f13671a.add(bVar);
                            topFansLayout.addView(bVar.f13691b);
                            if (i != list.size() - 1) {
                                View view = new View(topFansLayout.f13674d);
                                view.setBackgroundResource(R.drawable.bps);
                                LayoutParams layoutParams2 = new LayoutParams((int) C9432q.m18687b((Context) topFansLayout.f13674d, 0.5f), -1);
                                layoutParams2.topMargin = (int) C9432q.m18687b((Context) topFansLayout.f13674d, 20.0f);
                                layoutParams2.bottomMargin = (int) C9432q.m18687b((Context) topFansLayout.f13674d, 20.0f);
                                topFansLayout.addView(view, layoutParams2);
                            }
                            if (i == 0 && list.size() != 2) {
                                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) bVar.f13692c.getLayoutParams();
                                layoutParams3.topMargin = 0;
                                layoutParams3.width = (int) C9432q.m18687b((Context) topFansLayout.f13674d, 56.0f);
                                layoutParams3.height = (int) C9432q.m18687b((Context) topFansLayout.f13674d, 56.0f);
                                bVar.f13693d.setTextSize(2, 14.0f);
                                ((RelativeLayout.LayoutParams) bVar.f13693d.getLayoutParams()).topMargin = (int) C9432q.m18687b((Context) topFansLayout.f13674d, 24.0f);
                            }
                        }
                        i++;
                    }
                }
                if (list.size() == 3) {
                    int indexOfChild = topFansLayout.indexOfChild(((C5124b) topFansLayout.f13671a.get(1)).f13691b);
                    topFansLayout.removeView(((C5124b) topFansLayout.f13671a.get(0)).f13691b);
                    topFansLayout.removeView(((C5124b) topFansLayout.f13671a.get(1)).f13691b);
                    topFansLayout.addView(((C5124b) topFansLayout.f13671a.get(1)).f13691b, 0);
                    topFansLayout.addView(((C5124b) topFansLayout.f13671a.get(0)).f13691b, indexOfChild);
                }
                obtainTypedArray.recycle();
                topFansLayout.postInvalidate();
                topFansLayout.mo11005a();
            } else if (topFansLayout.f13673c != null) {
                topFansLayout.f13673c.mo11015a();
            }
        }
    }
}
