package com.p683ss.android.ugc.trill.language;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41684a;
import com.p683ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.language.f */
final /* synthetic */ class C50341f implements OnClickListener {

    /* renamed from: a */
    private final C50337c f126241a;

    /* renamed from: b */
    private final C41684a f126242b;

    C50341f(C50337c cVar, C41684a aVar) {
        this.f126241a = cVar;
        this.f126242b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C50337c cVar = this.f126241a;
        C41684a aVar = this.f126242b;
        if (i == -2) {
            dialogInterface.dismiss();
            return;
        }
        if (i == -1) {
            cVar.f126232a.remove(aVar);
            ContentPreferenceViewModel contentPreferenceViewModel = cVar.f126234c;
            if (aVar != null) {
                ArrayList arrayList = (ArrayList) contentPreferenceViewModel.mo98275d().getValue();
                if (arrayList != null) {
                    arrayList.remove(aVar);
                }
                contentPreferenceViewModel.f126306c = true;
            }
            cVar.f126235d.mo98265a(aVar, 0);
            cVar.notifyDataSetChanged();
            dialogInterface.dismiss();
        }
    }
}
