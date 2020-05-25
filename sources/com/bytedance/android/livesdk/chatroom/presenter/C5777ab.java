package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.chatroom.presenter.C5899y.C5901a;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17980i;
import com.google.gson.C18085o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ab */
public final /* synthetic */ class C5777ab implements C1710e {

    /* renamed from: a */
    private final C5899y f15225a;

    public C5777ab(C5899y yVar) {
        this.f15225a = yVar;
    }

    public final void accept(Object obj) {
        C5899y yVar = this.f15225a;
        C18085o oVar = (C18085o) obj;
        yVar.f15431a = false;
        try {
            ArrayList arrayList = new ArrayList();
            C17980i d = oVar.mo35024d("data");
            for (int i = 0; i < d.mo34901a(); i++) {
                C18085o m = d.mo34902a(i).mo35009m();
                TaskGiftEvent taskGiftEvent = new TaskGiftEvent();
                taskGiftEvent.setData(m.mo35022b("data").toString());
                taskGiftEvent.setType(m.mo35022b("type").mo34910g());
                taskGiftEvent.setSubtitle(m.mo35022b("subtitle").mo34905c());
                arrayList.add(taskGiftEvent);
            }
            if (!C9376b.m18558a((Collection<T>) arrayList) && arrayList.size() >= 3 && yVar.mo8518c() != null) {
                ((C5901a) yVar.mo8518c()).mo11799a((List<TaskGiftEvent>) arrayList);
            }
        } catch (Exception e) {
            C3831a.m9716d("GiftPresenter", e.toString());
        }
    }
}
