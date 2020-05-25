package com.bytedance.bdlocation.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.netwok.p511a.C9233b;
import com.bytedance.bdlocation.netwok.p511a.C9235d;
import java.util.List;

/* renamed from: com.bytedance.bdlocation.utils.c */
public final class C9272c {

    /* renamed from: a */
    public final TelephonyManager f25378a;

    public C9272c(Context context) {
        this.f25378a = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: a */
    public static void m18389a(C9233b bVar, List<NeighboringCellInfo> list) {
        int size = list.size();
        if (size > BDLocationConfig.getBssNum()) {
            size = BDLocationConfig.getBssNum();
        }
        for (int i = 0; i < size; i++) {
            NeighboringCellInfo neighboringCellInfo = (NeighboringCellInfo) list.get(i);
            C9235d dVar = new C9235d();
            dVar.f25235f = (long) neighboringCellInfo.getCid();
            dVar.f25236g = (long) neighboringCellInfo.getCid();
            dVar.f25237h = (long) neighboringCellInfo.getPsc();
            dVar.f25234e = (long) neighboringCellInfo.getLac();
            dVar.f25230a = neighboringCellInfo.getNetworkType();
            dVar.f25238i = (long) neighboringCellInfo.getRssi();
            bVar.f25222b.add(dVar);
        }
    }

    /* renamed from: a */
    public static void m18390a(C9235d dVar, CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
            dVar.f25230a = 16;
            dVar.f25234e = (long) cellIdentity.getLac();
            dVar.f25236g = (long) cellIdentity.getCid();
            dVar.f25235f = (long) cellIdentity.getCid();
            dVar.f25237h = (long) cellIdentity.getPsc();
            dVar.f25233d = (long) cellSignalStrength.getDbm();
            dVar.f25231b = (long) cellIdentity.getMcc();
            dVar.f25232c = (long) cellIdentity.getMnc();
        } else if (cellInfo instanceof CellInfoCdma) {
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            CellSignalStrengthCdma cellSignalStrength2 = cellInfoCdma.getCellSignalStrength();
            dVar.f25230a = 4;
            dVar.f25239j = cellIdentity2.getBasestationId();
            dVar.f25240k = cellIdentity2.getLatitude();
            dVar.f25241l = cellIdentity2.getLongitude();
            dVar.f25242m = cellIdentity2.getNetworkId();
            dVar.f25243n = cellIdentity2.getSystemId();
            dVar.f25233d = (long) cellSignalStrength2.getDbm();
        } else if (cellInfo instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
            CellSignalStrengthLte cellSignalStrength3 = cellInfoLte.getCellSignalStrength();
            if (VERSION.SDK_INT >= 28) {
                dVar.f25244o = cellIdentity3.getBandwidth();
            }
            dVar.f25245p = cellIdentity3.getCi();
            if (VERSION.SDK_INT >= 24) {
                dVar.f25246q = cellIdentity3.getEarfcn();
            }
            dVar.f25230a = 13;
            dVar.f25247r = cellIdentity3.getPci();
            dVar.f25248s = cellIdentity3.getTac();
            dVar.f25233d = (long) cellSignalStrength3.getDbm();
            dVar.f25231b = (long) cellIdentity3.getMcc();
            dVar.f25232c = (long) cellIdentity3.getMnc();
        } else {
            if (VERSION.SDK_INT >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                CellSignalStrengthWcdma cellSignalStrength4 = cellInfoWcdma.getCellSignalStrength();
                dVar.f25230a = 4;
                dVar.f25236g = (long) cellIdentity4.getCid();
                dVar.f25235f = (long) cellIdentity4.getCid();
                dVar.f25234e = (long) cellIdentity4.getLac();
                dVar.f25237h = (long) cellIdentity4.getPsc();
                dVar.f25233d = (long) cellSignalStrength4.getDbm();
                dVar.f25232c = (long) cellIdentity4.getMnc();
                dVar.f25231b = (long) cellIdentity4.getMcc();
            }
        }
    }
}
