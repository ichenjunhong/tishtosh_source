package com.p683ss.android.ugc.aweme.account;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.C27975m.C27976a;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.AccountDepeService */
public interface AccountDepeService {
    List<C22254a> getAfterLoginActions(Bundle bundle);

    C27976a getAfterLoginUtilsActions(Bundle bundle);

    List<C22254a> getAfterSwitchAccountActions(Bundle bundle);
}
