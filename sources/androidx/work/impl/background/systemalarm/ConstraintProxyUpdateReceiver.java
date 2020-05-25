package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy;
import androidx.work.impl.utils.C1647b;
import com.C2240a;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            C2240a.m6772a("Ignoring unknown action %s", new Object[]{str});
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
        boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
        boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
        boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
        C2240a.m6772a("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)});
        C1647b.m5755a(context, BatteryNotLowProxy.class, booleanExtra);
        C1647b.m5755a(context, BatteryChargingProxy.class, booleanExtra2);
        C1647b.m5755a(context, StorageNotLowProxy.class, booleanExtra3);
        C1647b.m5755a(context, NetworkStateProxy.class, booleanExtra4);
    }
}
