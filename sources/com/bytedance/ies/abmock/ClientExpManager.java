package com.bytedance.ies.abmock;

import com.bytedance.p558e.C9741d;
import com.bytedance.p558e.p559a.C9735a;
import com.bytedance.p558e.p559a.C9736b;
import com.p683ss.android.ugc.aweme.experiment.ABMockClientExperiment;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public class ClientExpManager {
    private static final C9735a decompress_so_strategy_client;
    private static final C9735a show_resso_anchor_existing;
    private static final C9735a show_resso_anchor_new;
    private static final C9735a swipe_up_opt_experiment;
    private static final C9735a test_client_exp;

    public static int decompress_so_strategy_client() {
        return ((Integer) C9741d.m19511a("decompress_so_strategy_client", Integer.TYPE, Integer.valueOf(0), true, true, decompress_so_strategy_client)).intValue();
    }

    public static int show_resso_anchor_existing() {
        return ((Integer) C9741d.m19511a("show_resso_anchor_existing", Integer.TYPE, Integer.valueOf(0), true, true, show_resso_anchor_existing)).intValue();
    }

    public static int show_resso_anchor_new() {
        return ((Integer) C9741d.m19511a("show_resso_anchor_new", Integer.TYPE, Integer.valueOf(0), true, true, show_resso_anchor_new)).intValue();
    }

    public static int swipe_up_opt_experiment() {
        return ((Integer) C9741d.m19511a("swipe_up_opt_experiment", Integer.TYPE, Integer.valueOf(0), true, true, swipe_up_opt_experiment)).intValue();
    }

    public static String test_client_exp() {
        return (String) C9741d.m19511a("test_client_exp", String.class, ABMockClientExperiment.DISABLE, false, true, test_client_exp);
    }

    static {
        C9735a aVar = new C9735a("com.ss.android.ugc.aweme.experiment.ABMockClientExperiment", ProfileUiInitOptimizeEnterThreshold.DEFAULT, "app", new String[]{"test_client_exp", "decompress_so_strategy_client", "swipe_up_opt_experiment", "show_resso_anchor_existing", "show_resso_anchor_new"}, new C9736b("123", 0.4d, ABMockClientExperiment.DISABLE), new C9736b("123", 0.4d, ABMockClientExperiment.GROUP1), new C9736b("123", 0.2d, ABMockClientExperiment.GROUP2));
        test_client_exp = aVar;
        C9735a aVar2 = new C9735a("com.ss.android.ugc.aweme.requesttask.idle.LibraryCompressABGray", ProfileUiInitOptimizeEnterThreshold.DEFAULT, "app", new String[]{"test_client_exp", "decompress_so_strategy_client", "swipe_up_opt_experiment", "show_resso_anchor_existing", "show_resso_anchor_new"}, new C9736b("1668114", 0.25d, Integer.valueOf(0)), new C9736b("1668115", 0.25d, Integer.valueOf(1)), new C9736b("1668116", 0.25d, Integer.valueOf(2)), new C9736b("1668117", 0.25d, Integer.valueOf(3)));
        decompress_so_strategy_client = aVar2;
        C9735a aVar3 = new C9735a("com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideOptExperiment", ProfileUiInitOptimizeEnterThreshold.DEFAULT, "app", new String[]{"test_client_exp", "decompress_so_strategy_client", "swipe_up_opt_experiment", "show_resso_anchor_existing", "show_resso_anchor_new"}, new C9736b("1627404", 0.34d, Integer.valueOf(0)), new C9736b("1627405", 0.33d, Integer.valueOf(1)), new C9736b("1627406", 0.33d, Integer.valueOf(2)));
        swipe_up_opt_experiment = aVar3;
        C9735a aVar4 = new C9735a("com.ss.android.ugc.aweme.buildconfigdiff.RessoAnchorExistedUserExperiment", ProfileUiInitOptimizeEnterThreshold.DEFAULT, "app", new String[]{"test_client_exp", "decompress_so_strategy_client", "swipe_up_opt_experiment", "show_resso_anchor_existing", "show_resso_anchor_new"}, new C9736b("1596369", 0.5d, Integer.valueOf(0)), new C9736b("1596370", 0.5d, Integer.valueOf(1)));
        show_resso_anchor_existing = aVar4;
        C9735a aVar5 = new C9735a("com.ss.android.ugc.aweme.buildconfigdiff.RessoAnchorNewUserExperiment", ProfileUiInitOptimizeEnterThreshold.DEFAULT, "app", new String[]{"test_client_exp", "decompress_so_strategy_client", "swipe_up_opt_experiment", "show_resso_anchor_existing", "show_resso_anchor_new"}, new C9736b("1596338", 0.05d, Integer.valueOf(0)), new C9736b("1596339", 0.05d, Integer.valueOf(1)));
        show_resso_anchor_new = aVar5;
    }
}
