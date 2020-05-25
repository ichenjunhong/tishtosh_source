package com.bytedance.liko.memoryexplorer.android;

import com.bytedance.liko.memoryexplorer.util.CollectionsUtil;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import java.io.PrintStream;
import java.util.Collection;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.parser.model.PrimitiveArrayImpl;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.model.Field;
import org.eclipse.mat.snapshot.model.IClass;
import org.eclipse.mat.snapshot.model.ObjectReference;

public class AndroidOS {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String MANUFACTURER = "";
    public static String MODEL = "";
    public static String RELEASE = "";
    public static int SDK_INT;

    private AndroidOS() {
    }

    public static void parse(ISnapshot iSnapshot) {
        System.out.println("====== Android Device Info ======");
        parseAndroidBrand(iSnapshot);
        parseAndroidOsVersion(iSnapshot);
    }

    private static String resolveStaticString(Field field) throws SnapshotException {
        try {
            Object valueArray = ((PrimitiveArrayImpl) ((ObjectReference) field.getValue()).getObject().resolveValue("value")).getValueArray();
            if (valueArray == null) {
                return "";
            }
            if (valueArray instanceof byte[]) {
                return new String((byte[]) valueArray);
            }
            if (valueArray instanceof char[]) {
                return new String((char[]) valueArray);
            }
            return "";
        } catch (Exception unused) {
        }
    }

    private static void parseAndroidBrand(ISnapshot iSnapshot) {
        try {
            Collection classesByName = iSnapshot.getClassesByName("android.os.Build", false);
            if (!CollectionsUtil.isEmpty(classesByName)) {
                for (Field field : ((IClass) classesByName.iterator().next()).getStaticFields()) {
                    if (field.getName().equalsIgnoreCase("MANUFACTURER")) {
                        MANUFACTURER = resolveStaticString(field);
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder("Android MANUFACTURER Name : ");
                        sb.append(MANUFACTURER);
                        printStream.println(sb.toString());
                    }
                    if (field.getName().equalsIgnoreCase("MODEL")) {
                        MODEL = resolveStaticString(field);
                        PrintStream printStream2 = System.out;
                        StringBuilder sb2 = new StringBuilder("Android device : ");
                        sb2.append(MODEL);
                        printStream2.println(sb2.toString());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void parseAndroidOsVersion(ISnapshot iSnapshot) {
        try {
            Collection classesByName = iSnapshot.getClassesByName("android.os.Build$VERSION", false);
            if (!CollectionsUtil.isEmpty(classesByName)) {
                for (Field field : ((IClass) classesByName.iterator().next()).getStaticFields()) {
                    field.getValue();
                    if (field != null && "SDK_INT".equalsIgnoreCase(field.getName())) {
                        SDK_INT = ((Integer) field.getValue()).intValue();
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder("Android SDK API : ");
                        sb.append(SDK_INT);
                        printStream.println(sb.toString());
                    }
                    if (field.getName().equalsIgnoreCase(C47865ew.f120427a)) {
                        RELEASE = resolveStaticString(field);
                        PrintStream printStream2 = System.out;
                        StringBuilder sb2 = new StringBuilder("Android RELEASE version : ");
                        sb2.append(RELEASE);
                        printStream2.println(sb2.toString());
                    }
                }
            }
        } catch (Exception unused) {
            SDK_INT = 28;
        }
    }
}
