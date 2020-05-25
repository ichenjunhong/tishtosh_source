package com.p683ss.android.ugc.asve.sandbox;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.asve.sandbox.C20776e.C20777a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20658a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20706p;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20709q;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20715s;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20724v;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20727w;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20730x;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20733y;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20736z;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.asve.sandbox.i */
public interface C20788i extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.i$a */
    public static abstract class C20789a extends Binder implements C20788i {

        /* renamed from: com.ss.android.ugc.asve.sandbox.i$a$a */
        static class C20790a implements C20788i {

            /* renamed from: a */
            private IBinder f56685a;

            public final IBinder asBinder() {
                return this.f56685a;
            }

            /* renamed from: a */
            public final void mo43959a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56685a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43949a(int i, String str, float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56685a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43948a(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f56685a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43943a(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56685a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43942a(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56685a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo43972a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f56685a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43985b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(17, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43967a(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeMap(map);
                    this.f56685a.transact(22, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43964a(String str, Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f56685a.transact(23, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43945a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56685a.transact(25, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo43937a(String str, int i, int i2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43982b(String str, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    this.f56685a.transact(28, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43961a(String str, String str2, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeFloat(f);
                    this.f56685a.transact(30, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43962a(String str, String str2, float f, float f2, float f3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    this.f56685a.transact(31, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43993c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(32, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo43938a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56685a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43956a(C20730x xVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    this.f56685a.transact(35, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43980b(C20730x xVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    this.f56685a.transact(36, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43968a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(z3 ? 1 : 0);
                    obtain.writeInt(z4 ? 1 : 0);
                    obtain.writeInt(z5 ? 1 : 0);
                    obtain.writeString(str);
                    this.f56685a.transact(37, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43969a(boolean z, boolean z2, boolean z3, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(z3 ? 1 : 0);
                    obtain.writeInt(z4 ? 1 : 0);
                    this.f56685a.transact(38, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43941a(double d, double d2, double d3, double d4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    obtain.writeDouble(d3);
                    obtain.writeDouble(d4);
                    this.f56685a.transact(39, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43970a(double[] dArr, double d) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDoubleArray(dArr);
                    obtain.writeDouble(d);
                    this.f56685a.transact(42, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43946a(int i, float f, float f2, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeInt(i2);
                    this.f56685a.transact(45, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43944a(float f, float f2, float f3, float f4, float f5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    obtain.writeFloat(f4);
                    obtain.writeFloat(f5);
                    this.f56685a.transact(46, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43960a(String str, int i, int i2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    this.f56685a.transact(50, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43955a(C20727w wVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.f56685a.transact(53, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43950a(C20658a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f56685a.transact(54, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43957a(C20733y yVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(yVar != null ? yVar.asBinder() : null);
                    this.f56685a.transact(64, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43952a(C20709q qVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(qVar != null ? qVar.asBinder() : null);
                    this.f56685a.transact(68, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43951a(C20706p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f56685a.transact(70, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43971a(String[] strArr, double[] dArr, boolean[] zArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStringArray(strArr);
                    obtain.writeDoubleArray(dArr);
                    obtain.writeBooleanArray(zArr);
                    this.f56685a.transact(71, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43953a(C20715s sVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
                    this.f56685a.transact(72, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43947a(int i, long j, long j2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeString(str);
                    this.f56685a.transact(78, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43954a(C20724v vVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(vVar != null ? vVar.asBinder() : null);
                    this.f56685a.transact(79, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43983b(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56685a.transact(80, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43958a(C20736z zVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(zVar != null ? zVar.asBinder() : null);
                    this.f56685a.transact(82, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43981b(C20736z zVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(zVar != null ? zVar.asBinder() : null);
                    this.f56685a.transact(83, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43965a(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56685a.transact(86, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43984b(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56685a.transact(87, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43963a(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f56685a.transact(92, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43940a(double d) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDouble(d);
                    this.f56685a.transact(93, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43966a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeTypedList(list2);
                    obtain.writeInt(i);
                    this.f56685a.transact(94, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final int[] mo43994c(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56685a.transact(95, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43939a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56685a.transact(18, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43975b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56685a.transact(63, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43988c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56685a.transact(69, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo43997d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56685a.transact(73, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo44004e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56685a.transact(84, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo44009f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56685a.transact(89, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final C20776e mo44015g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56685a.transact(91, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20777a.m52601a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C20790a(IBinder iBinder) {
                this.f56685a = iBinder;
            }

            /* renamed from: g */
            public final void mo44016g(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56685a.transact(52, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo44018h(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56685a.transact(67, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final void mo44020i(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(58, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo44021j(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(62, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo44022k(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(74, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo44023l(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(75, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo44024m(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(76, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final void mo44025n(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(85, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final int mo43973b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56685a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final int mo43986c(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56685a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final int mo43995d(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56685a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final float mo44002e(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56685a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final int mo44008f(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56685a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final int mo44014g(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56685a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo44019h(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(57, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final int mo43987c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56685a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final int mo43996d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56685a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final int mo44003e(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56685a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo43933a(Bitmap bitmap) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56685a.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo44011f(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56685a.transact(77, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo44017g(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(56, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43977b(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56685a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo43999d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56685a.transact(65, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo44006e(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56685a.transact(66, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo44012f(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56685a.transact(29, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43991c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56685a.transact(61, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo44007e(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(51, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo44013f(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(55, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43979b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56685a.transact(59, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo44001d(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(33, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo43931a(int i, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    this.f56685a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo43932a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f56685a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo44010f(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56685a.transact(49, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo43998d(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56685a.transact(47, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo44005e(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56685a.transact(48, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo43934a(String str, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    this.f56685a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43990c(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56685a.transact(44, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43978b(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56685a.transact(43, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo44000d(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56685a.transact(90, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43992c(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56685a.transact(88, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final int mo43974b(String str, float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56685a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo43935a(String str, float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56685a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43976b(double d, double d2, double d3, double d4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    obtain.writeDouble(d3);
                    obtain.writeDouble(d4);
                    this.f56685a.transact(40, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43989c(double d, double d2, double d3, double d4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    obtain.writeDouble(d3);
                    obtain.writeDouble(d4);
                    this.f56685a.transact(41, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo43936a(String str, int i, int i2, String str2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56685a.transact(81, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v19, types: [com.ss.android.ugc.asve.sandbox.b.w] */
        /* JADX WARNING: type inference failed for: r3v20, types: [com.ss.android.ugc.asve.sandbox.b.w$a$a] */
        /* JADX WARNING: type inference failed for: r3v22, types: [com.ss.android.ugc.asve.sandbox.b.w] */
        /* JADX WARNING: type inference failed for: r3v23, types: [com.ss.android.ugc.asve.sandbox.b.a] */
        /* JADX WARNING: type inference failed for: r3v24, types: [com.ss.android.ugc.asve.sandbox.b.a$a$a] */
        /* JADX WARNING: type inference failed for: r3v26, types: [com.ss.android.ugc.asve.sandbox.b.a] */
        /* JADX WARNING: type inference failed for: r3v27, types: [android.graphics.Bitmap] */
        /* JADX WARNING: type inference failed for: r3v29, types: [android.graphics.Bitmap] */
        /* JADX WARNING: type inference failed for: r3v30, types: [com.ss.android.ugc.asve.sandbox.b.y] */
        /* JADX WARNING: type inference failed for: r3v31, types: [com.ss.android.ugc.asve.sandbox.b.y$a$a] */
        /* JADX WARNING: type inference failed for: r3v33, types: [com.ss.android.ugc.asve.sandbox.b.y] */
        /* JADX WARNING: type inference failed for: r3v34, types: [com.ss.android.ugc.asve.sandbox.b.q] */
        /* JADX WARNING: type inference failed for: r3v35, types: [com.ss.android.ugc.asve.sandbox.b.q$a$a] */
        /* JADX WARNING: type inference failed for: r3v37, types: [com.ss.android.ugc.asve.sandbox.b.q] */
        /* JADX WARNING: type inference failed for: r3v38, types: [com.ss.android.ugc.asve.sandbox.b.p] */
        /* JADX WARNING: type inference failed for: r3v39, types: [com.ss.android.ugc.asve.sandbox.b.p$a$a] */
        /* JADX WARNING: type inference failed for: r3v41, types: [com.ss.android.ugc.asve.sandbox.b.p] */
        /* JADX WARNING: type inference failed for: r3v42, types: [com.ss.android.ugc.asve.sandbox.b.s] */
        /* JADX WARNING: type inference failed for: r3v43, types: [com.ss.android.ugc.asve.sandbox.b.s$a$a] */
        /* JADX WARNING: type inference failed for: r3v45, types: [com.ss.android.ugc.asve.sandbox.b.s] */
        /* JADX WARNING: type inference failed for: r3v47, types: [com.ss.android.ugc.asve.sandbox.b.v] */
        /* JADX WARNING: type inference failed for: r3v48, types: [com.ss.android.ugc.asve.sandbox.b.v$a$a] */
        /* JADX WARNING: type inference failed for: r3v50, types: [com.ss.android.ugc.asve.sandbox.b.v] */
        /* JADX WARNING: type inference failed for: r3v53, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r3v54, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r3v55 */
        /* JADX WARNING: type inference failed for: r3v56 */
        /* JADX WARNING: type inference failed for: r3v57 */
        /* JADX WARNING: type inference failed for: r3v58 */
        /* JADX WARNING: type inference failed for: r3v59 */
        /* JADX WARNING: type inference failed for: r3v60 */
        /* JADX WARNING: type inference failed for: r3v61 */
        /* JADX WARNING: type inference failed for: r3v62 */
        /* JADX WARNING: type inference failed for: r3v63 */
        /* JADX WARNING: type inference failed for: r3v64 */
        /* JADX WARNING: type inference failed for: r3v65 */
        /* JADX WARNING: type inference failed for: r3v66 */
        /* JADX WARNING: type inference failed for: r3v67 */
        /* JADX WARNING: type inference failed for: r3v68 */
        /* JADX WARNING: type inference failed for: r3v69 */
        /* JADX WARNING: type inference failed for: r3v70 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.asve.sandbox.b.a$a$a, com.ss.android.ugc.asve.sandbox.b.w$a$a, com.ss.android.ugc.asve.sandbox.b.w, com.ss.android.ugc.asve.sandbox.b.a, android.graphics.Bitmap, com.ss.android.ugc.asve.sandbox.b.y$a$a, com.ss.android.ugc.asve.sandbox.b.y, com.ss.android.ugc.asve.sandbox.b.q$a$a, com.ss.android.ugc.asve.sandbox.b.q, com.ss.android.ugc.asve.sandbox.b.p$a$a, com.ss.android.ugc.asve.sandbox.b.p, com.ss.android.ugc.asve.sandbox.b.s$a$a, com.ss.android.ugc.asve.sandbox.b.s, com.ss.android.ugc.asve.sandbox.b.v$a$a, com.ss.android.ugc.asve.sandbox.b.v, android.os.IBinder]
          uses: [com.ss.android.ugc.asve.sandbox.b.w, com.ss.android.ugc.asve.sandbox.b.a, android.graphics.Bitmap, com.ss.android.ugc.asve.sandbox.b.y, com.ss.android.ugc.asve.sandbox.b.q, com.ss.android.ugc.asve.sandbox.b.p, com.ss.android.ugc.asve.sandbox.b.s, com.ss.android.ugc.asve.sandbox.b.v, android.os.IBinder]
          mth insns count: 710
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 17 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r14, android.os.Parcel r15, android.os.Parcel r16, int r17) throws android.os.RemoteException {
            /*
                r13 = this;
                r9 = r13
                r0 = r14
                r1 = r15
                r6 = r16
                java.lang.String r2 = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService"
                r3 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r10 = 1
                if (r0 == r3) goto L_0x0747
                r3 = 0
                r4 = 0
                switch(r0) {
                    case 1: goto L_0x073c;
                    case 2: goto L_0x0725;
                    case 3: goto L_0x0716;
                    case 4: goto L_0x0707;
                    case 5: goto L_0x06fc;
                    case 6: goto L_0x06f1;
                    case 7: goto L_0x06db;
                    case 8: goto L_0x06c1;
                    case 9: goto L_0x06a7;
                    case 10: goto L_0x0695;
                    case 11: goto L_0x0683;
                    case 12: goto L_0x0671;
                    case 13: goto L_0x065f;
                    case 14: goto L_0x064d;
                    case 15: goto L_0x0637;
                    case 16: goto L_0x0622;
                    case 17: goto L_0x0614;
                    case 18: goto L_0x060d;
                    case 19: goto L_0x05fb;
                    case 20: goto L_0x05e9;
                    case 21: goto L_0x05d7;
                    case 22: goto L_0x05c4;
                    case 23: goto L_0x05ad;
                    case 24: goto L_0x0597;
                    case 25: goto L_0x058c;
                    case 26: goto L_0x056b;
                    case 27: goto L_0x0559;
                    case 28: goto L_0x054a;
                    case 29: goto L_0x053f;
                    case 30: goto L_0x052c;
                    case 31: goto L_0x050b;
                    case 32: goto L_0x04fd;
                    case 33: goto L_0x04ef;
                    case 34: goto L_0x04d9;
                    case 35: goto L_0x04ca;
                    case 36: goto L_0x04bb;
                    case 37: goto L_0x0477;
                    case 38: goto L_0x044e;
                    case 39: goto L_0x0432;
                    case 40: goto L_0x0416;
                    case 41: goto L_0x03fa;
                    case 42: goto L_0x03eb;
                    case 43: goto L_0x03dc;
                    case 44: goto L_0x03cd;
                    case 45: goto L_0x03b6;
                    case 46: goto L_0x0395;
                    case 47: goto L_0x0386;
                    case 48: goto L_0x0377;
                    case 49: goto L_0x0368;
                    case 50: goto L_0x0351;
                    case 51: goto L_0x0343;
                    case 52: goto L_0x0338;
                    case 53: goto L_0x0315;
                    case 54: goto L_0x02f2;
                    case 55: goto L_0x02e4;
                    case 56: goto L_0x02d6;
                    case 57: goto L_0x02c8;
                    case 58: goto L_0x02ba;
                    case 59: goto L_0x02af;
                    case 60: goto L_0x0292;
                    case 61: goto L_0x0287;
                    case 62: goto L_0x0279;
                    case 63: goto L_0x0272;
                    case 64: goto L_0x024f;
                    case 65: goto L_0x0244;
                    case 66: goto L_0x0239;
                    case 67: goto L_0x022e;
                    case 68: goto L_0x020b;
                    case 69: goto L_0x0204;
                    case 70: goto L_0x01e1;
                    case 71: goto L_0x01ce;
                    case 72: goto L_0x01ab;
                    case 73: goto L_0x01a4;
                    case 74: goto L_0x0196;
                    case 75: goto L_0x0188;
                    case 76: goto L_0x017a;
                    case 77: goto L_0x016f;
                    case 78: goto L_0x0153;
                    case 79: goto L_0x0130;
                    case 80: goto L_0x0121;
                    case 81: goto L_0x00f4;
                    case 82: goto L_0x00e5;
                    case 83: goto L_0x00d6;
                    case 84: goto L_0x00cf;
                    case 85: goto L_0x00c1;
                    case 86: goto L_0x00b0;
                    case 87: goto L_0x009f;
                    case 88: goto L_0x008e;
                    case 89: goto L_0x0087;
                    case 90: goto L_0x0076;
                    case 91: goto L_0x0062;
                    case 92: goto L_0x004f;
                    case 93: goto L_0x0044;
                    case 94: goto L_0x002d;
                    case 95: goto L_0x0017;
                    default: goto L_0x0012;
                }
            L_0x0012:
                boolean r0 = super.onTransact(r14, r15, r16, r17)
                return r0
            L_0x0017:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                java.lang.String r1 = r15.readString()
                int[] r0 = r13.mo43994c(r0, r1)
                r16.writeNoException()
                r6.writeIntArray(r0)
                return r10
            L_0x002d:
                r15.enforceInterface(r2)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r2 = com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r2 = r15.createTypedArrayList(r2)
                int r1 = r15.readInt()
                r13.mo43966a(r0, r2, r1)
                return r10
            L_0x0044:
                r15.enforceInterface(r2)
                double r0 = r15.readDouble()
                r13.mo43940a(r0)
                return r10
            L_0x004f:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                java.lang.String r2 = r15.readString()
                java.lang.String r1 = r15.readString()
                r13.mo43963a(r0, r2, r1)
                return r10
            L_0x0062:
                r15.enforceInterface(r2)
                com.ss.android.ugc.asve.sandbox.e r0 = r13.mo44015g()
                r16.writeNoException()
                if (r0 == 0) goto L_0x0072
                android.os.IBinder r3 = r0.asBinder()
            L_0x0072:
                r6.writeStrongBinder(r3)
                return r10
            L_0x0076:
                r15.enforceInterface(r2)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                int r1 = r15.readInt()
                r13.mo44000d(r0, r1)
                return r10
            L_0x0087:
                r15.enforceInterface(r2)
                r13.mo44009f()
                return r10
            L_0x008e:
                r15.enforceInterface(r2)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                int r1 = r15.readInt()
                r13.mo43992c(r0, r1)
                return r10
            L_0x009f:
                r15.enforceInterface(r2)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                int r1 = r15.readInt()
                r13.mo43984b(r0, r1)
                return r10
            L_0x00b0:
                r15.enforceInterface(r2)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                int r1 = r15.readInt()
                r13.mo43965a(r0, r1)
                return r10
            L_0x00c1:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x00cb
                r4 = 1
            L_0x00cb:
                r13.mo44025n(r4)
                return r10
            L_0x00cf:
                r15.enforceInterface(r2)
                r13.mo44004e()
                return r10
            L_0x00d6:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.z r0 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20736z.C20737a.m52068a(r0)
                r13.mo43981b(r0)
                return r10
            L_0x00e5:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.z r0 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20736z.C20737a.m52068a(r0)
                r13.mo43958a(r0)
                return r10
            L_0x00f4:
                r15.enforceInterface(r2)
                java.lang.String r2 = r15.readString()
                int r3 = r15.readInt()
                int r5 = r15.readInt()
                java.lang.String r7 = r15.readString()
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x010f
                r8 = 1
                goto L_0x0110
            L_0x010f:
                r8 = 0
            L_0x0110:
                r0 = r13
                r1 = r2
                r2 = r3
                r3 = r5
                r4 = r7
                r5 = r8
                int r0 = r0.mo43936a(r1, r2, r3, r4, r5)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x0121:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                java.lang.String r1 = r15.readString()
                r13.mo43983b(r0, r1)
                return r10
            L_0x0130:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                if (r0 != 0) goto L_0x013a
                goto L_0x014f
            L_0x013a:
                java.lang.String r1 = "com.ss.android.ugc.asve.sandbox.listener.IMessageListener"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x014a
                boolean r2 = r1 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20724v
                if (r2 == 0) goto L_0x014a
                r3 = r1
                com.ss.android.ugc.asve.sandbox.b.v r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20724v) r3
                goto L_0x014f
            L_0x014a:
                com.ss.android.ugc.asve.sandbox.b.v$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.v$a$a
                r3.<init>(r0)
            L_0x014f:
                r13.mo43954a(r3)
                return r10
            L_0x0153:
                r15.enforceInterface(r2)
                int r2 = r15.readInt()
                long r3 = r15.readLong()
                long r5 = r15.readLong()
                java.lang.String r7 = r15.readString()
                r0 = r13
                r1 = r2
                r2 = r3
                r4 = r5
                r6 = r7
                r0.mo43947a(r1, r2, r4, r6)
                return r10
            L_0x016f:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                r13.mo44011f(r0)
                return r10
            L_0x017a:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0184
                r4 = 1
            L_0x0184:
                r13.mo44024m(r4)
                return r10
            L_0x0188:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0192
                r4 = 1
            L_0x0192:
                r13.mo44023l(r4)
                return r10
            L_0x0196:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x01a0
                r4 = 1
            L_0x01a0:
                r13.mo44022k(r4)
                return r10
            L_0x01a4:
                r15.enforceInterface(r2)
                r13.mo43997d()
                return r10
            L_0x01ab:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                if (r0 != 0) goto L_0x01b5
                goto L_0x01ca
            L_0x01b5:
                java.lang.String r1 = "com.ss.android.ugc.asve.sandbox.listener.IFaceInfoListener"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x01c5
                boolean r2 = r1 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20715s
                if (r2 == 0) goto L_0x01c5
                r3 = r1
                com.ss.android.ugc.asve.sandbox.b.s r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20715s) r3
                goto L_0x01ca
            L_0x01c5:
                com.ss.android.ugc.asve.sandbox.b.s$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.s$a$a
                r3.<init>(r0)
            L_0x01ca:
                r13.mo43953a(r3)
                return r10
            L_0x01ce:
                r15.enforceInterface(r2)
                java.lang.String[] r0 = r15.createStringArray()
                double[] r2 = r15.createDoubleArray()
                boolean[] r1 = r15.createBooleanArray()
                r13.mo43971a(r0, r2, r1)
                return r10
            L_0x01e1:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                if (r0 != 0) goto L_0x01eb
                goto L_0x0200
            L_0x01eb:
                java.lang.String r1 = "com.ss.android.ugc.asve.sandbox.listener.ICherEffectParmaCallback"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x01fb
                boolean r2 = r1 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20706p
                if (r2 == 0) goto L_0x01fb
                r3 = r1
                com.ss.android.ugc.asve.sandbox.b.p r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20706p) r3
                goto L_0x0200
            L_0x01fb:
                com.ss.android.ugc.asve.sandbox.b.p$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.p$a$a
                r3.<init>(r0)
            L_0x0200:
                r13.mo43951a(r3)
                return r10
            L_0x0204:
                r15.enforceInterface(r2)
                r13.mo43988c()
                return r10
            L_0x020b:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                if (r0 != 0) goto L_0x0215
                goto L_0x022a
            L_0x0215:
                java.lang.String r1 = "com.ss.android.ugc.asve.sandbox.listener.IEffectAlgorithmCallback"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x0225
                boolean r2 = r1 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20709q
                if (r2 == 0) goto L_0x0225
                r3 = r1
                com.ss.android.ugc.asve.sandbox.b.q r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20709q) r3
                goto L_0x022a
            L_0x0225:
                com.ss.android.ugc.asve.sandbox.b.q$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.q$a$a
                r3.<init>(r0)
            L_0x022a:
                r13.mo43952a(r3)
                return r10
            L_0x022e:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                r13.mo44018h(r0)
                return r10
            L_0x0239:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                r13.mo44006e(r0)
                return r10
            L_0x0244:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                r13.mo43999d(r0)
                return r10
            L_0x024f:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                if (r0 != 0) goto L_0x0259
                goto L_0x026e
            L_0x0259:
                java.lang.String r1 = "com.ss.android.ugc.asve.sandbox.listener.IStickerRequestCallback"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x0269
                boolean r2 = r1 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20733y
                if (r2 == 0) goto L_0x0269
                r3 = r1
                com.ss.android.ugc.asve.sandbox.b.y r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20733y) r3
                goto L_0x026e
            L_0x0269:
                com.ss.android.ugc.asve.sandbox.b.y$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.y$a$a
                r3.<init>(r0)
            L_0x026e:
                r13.mo43957a(r3)
                return r10
            L_0x0272:
                r15.enforceInterface(r2)
                r13.mo43975b()
                return r10
            L_0x0279:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0283
                r4 = 1
            L_0x0283:
                r13.mo44021j(r4)
                return r10
            L_0x0287:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                r13.mo43991c(r0)
                return r10
            L_0x0292:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x02a4
                android.os.Parcelable$Creator r0 = android.graphics.Bitmap.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r15)
                r3 = r0
                android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            L_0x02a4:
                int r0 = r13.mo43933a(r3)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x02af:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                r13.mo43979b(r0)
                return r10
            L_0x02ba:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x02c4
                r4 = 1
            L_0x02c4:
                r13.mo44020i(r4)
                return r10
            L_0x02c8:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x02d2
                r4 = 1
            L_0x02d2:
                r13.mo44019h(r4)
                return r10
            L_0x02d6:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x02e0
                r4 = 1
            L_0x02e0:
                r13.mo44017g(r4)
                return r10
            L_0x02e4:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x02ee
                r4 = 1
            L_0x02ee:
                r13.mo44013f(r4)
                return r10
            L_0x02f2:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                if (r0 != 0) goto L_0x02fc
                goto L_0x0311
            L_0x02fc:
                java.lang.String r1 = "com.ss.android.ugc.asve.sandbox.listener.IARTextContentCallback"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x030c
                boolean r2 = r1 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20658a
                if (r2 == 0) goto L_0x030c
                r3 = r1
                com.ss.android.ugc.asve.sandbox.b.a r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20658a) r3
                goto L_0x0311
            L_0x030c:
                com.ss.android.ugc.asve.sandbox.b.a$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.a$a$a
                r3.<init>(r0)
            L_0x0311:
                r13.mo43950a(r3)
                return r10
            L_0x0315:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                if (r0 != 0) goto L_0x031f
                goto L_0x0334
            L_0x031f:
                java.lang.String r1 = "com.ss.android.ugc.asve.sandbox.listener.IOnARTextCountCallback"
                android.os.IInterface r1 = r0.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x032f
                boolean r2 = r1 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20727w
                if (r2 == 0) goto L_0x032f
                r3 = r1
                com.ss.android.ugc.asve.sandbox.b.w r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20727w) r3
                goto L_0x0334
            L_0x032f:
                com.ss.android.ugc.asve.sandbox.b.w$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.w$a$a
                r3.<init>(r0)
            L_0x0334:
                r13.mo43955a(r3)
                return r10
            L_0x0338:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                r13.mo44016g(r0)
                return r10
            L_0x0343:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x034d
                r4 = 1
            L_0x034d:
                r13.mo44007e(r4)
                return r10
            L_0x0351:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                int r2 = r15.readInt()
                int r3 = r15.readInt()
                java.lang.String r1 = r15.readString()
                r13.mo43960a(r0, r2, r3, r1)
                return r10
            L_0x0368:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo44010f(r0, r1)
                return r10
            L_0x0377:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo44005e(r0, r1)
                return r10
            L_0x0386:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo43998d(r0, r1)
                return r10
            L_0x0395:
                r15.enforceInterface(r2)
                float r2 = r15.readFloat()
                float r3 = r15.readFloat()
                float r4 = r15.readFloat()
                float r5 = r15.readFloat()
                float r6 = r15.readFloat()
                r0 = r13
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r0.mo43944a(r1, r2, r3, r4, r5)
                return r10
            L_0x03b6:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                float r2 = r15.readFloat()
                float r3 = r15.readFloat()
                int r1 = r15.readInt()
                r13.mo43946a(r0, r2, r3, r1)
                return r10
            L_0x03cd:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo43990c(r0, r1)
                return r10
            L_0x03dc:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo43978b(r0, r1)
                return r10
            L_0x03eb:
                r15.enforceInterface(r2)
                double[] r0 = r15.createDoubleArray()
                double r1 = r15.readDouble()
                r13.mo43970a(r0, r1)
                return r10
            L_0x03fa:
                r15.enforceInterface(r2)
                double r2 = r15.readDouble()
                double r4 = r15.readDouble()
                double r6 = r15.readDouble()
                double r11 = r15.readDouble()
                r0 = r13
                r1 = r2
                r3 = r4
                r5 = r6
                r7 = r11
                r0.mo43989c(r1, r3, r5, r7)
                return r10
            L_0x0416:
                r15.enforceInterface(r2)
                double r2 = r15.readDouble()
                double r4 = r15.readDouble()
                double r6 = r15.readDouble()
                double r11 = r15.readDouble()
                r0 = r13
                r1 = r2
                r3 = r4
                r5 = r6
                r7 = r11
                r0.mo43976b(r1, r3, r5, r7)
                return r10
            L_0x0432:
                r15.enforceInterface(r2)
                double r2 = r15.readDouble()
                double r4 = r15.readDouble()
                double r6 = r15.readDouble()
                double r11 = r15.readDouble()
                r0 = r13
                r1 = r2
                r3 = r4
                r5 = r6
                r7 = r11
                r0.mo43941a(r1, r3, r5, r7)
                return r10
            L_0x044e:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0459
                r0 = 1
                goto L_0x045a
            L_0x0459:
                r0 = 0
            L_0x045a:
                int r2 = r15.readInt()
                if (r2 == 0) goto L_0x0462
                r2 = 1
                goto L_0x0463
            L_0x0462:
                r2 = 0
            L_0x0463:
                int r3 = r15.readInt()
                if (r3 == 0) goto L_0x046b
                r3 = 1
                goto L_0x046c
            L_0x046b:
                r3 = 0
            L_0x046c:
                int r1 = r15.readInt()
                if (r1 == 0) goto L_0x0473
                r4 = 1
            L_0x0473:
                r13.mo43969a(r0, r2, r3, r4)
                return r10
            L_0x0477:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0482
                r2 = 1
                goto L_0x0483
            L_0x0482:
                r2 = 0
            L_0x0483:
                int r3 = r15.readInt()
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x048f
                r5 = 1
                goto L_0x0490
            L_0x048f:
                r5 = 0
            L_0x0490:
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0498
                r6 = 1
                goto L_0x0499
            L_0x0498:
                r6 = 0
            L_0x0499:
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x04a1
                r7 = 1
                goto L_0x04a2
            L_0x04a1:
                r7 = 0
            L_0x04a2:
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x04aa
                r8 = 1
                goto L_0x04ab
            L_0x04aa:
                r8 = 0
            L_0x04ab:
                java.lang.String r11 = r15.readString()
                r0 = r13
                r1 = r2
                r2 = r3
                r3 = r5
                r4 = r6
                r5 = r7
                r6 = r8
                r7 = r11
                r0.mo43968a(r1, r2, r3, r4, r5, r6, r7)
                return r10
            L_0x04bb:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.x r0 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20730x.C20731a.m52063a(r0)
                r13.mo43980b(r0)
                return r10
            L_0x04ca:
                r15.enforceInterface(r2)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.x r0 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20730x.C20731a.m52063a(r0)
                r13.mo43956a(r0)
                return r10
            L_0x04d9:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                java.lang.String r1 = r15.readString()
                int r0 = r13.mo43938a(r0, r1)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x04ef:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x04f9
                r4 = 1
            L_0x04f9:
                r13.mo44001d(r4)
                return r10
            L_0x04fd:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0507
                r4 = 1
            L_0x0507:
                r13.mo43993c(r4)
                return r10
            L_0x050b:
                r15.enforceInterface(r2)
                java.lang.String r2 = r15.readString()
                java.lang.String r3 = r15.readString()
                float r4 = r15.readFloat()
                float r5 = r15.readFloat()
                float r6 = r15.readFloat()
                r0 = r13
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r0.mo43962a(r1, r2, r3, r4, r5)
                return r10
            L_0x052c:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                java.lang.String r2 = r15.readString()
                float r1 = r15.readFloat()
                r13.mo43961a(r0, r2, r1)
                return r10
            L_0x053f:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                r13.mo44012f(r0)
                return r10
            L_0x054a:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                float r1 = r15.readFloat()
                r13.mo43982b(r0, r1)
                return r10
            L_0x0559:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                float r0 = r13.mo44002e(r0)
                r16.writeNoException()
                r6.writeFloat(r0)
                return r10
            L_0x056b:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                int r2 = r15.readInt()
                int r3 = r15.readInt()
                int r1 = r15.readInt()
                if (r1 == 0) goto L_0x0581
                r4 = 1
            L_0x0581:
                int r0 = r13.mo43937a(r0, r2, r3, r4)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x058c:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                r13.mo43945a(r0)
                return r10
            L_0x0597:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                int r1 = r15.readInt()
                int r0 = r13.mo43932a(r0, r1)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x05ad:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                java.lang.Class r2 = r13.getClass()
                java.lang.ClassLoader r2 = r2.getClassLoader()
                java.util.HashMap r1 = r15.readHashMap(r2)
                r13.mo43964a(r0, r1)
                return r10
            L_0x05c4:
                r15.enforceInterface(r2)
                java.lang.Class r0 = r13.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.util.HashMap r0 = r15.readHashMap(r0)
                r13.mo43967a(r0)
                return r10
            L_0x05d7:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                int r0 = r13.mo43996d(r0)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x05e9:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                int r0 = r13.mo44014g(r0)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x05fb:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                int r0 = r13.mo43987c(r0)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x060d:
                r15.enforceInterface(r2)
                r13.mo43939a()
                return r10
            L_0x0614:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x061e
                r4 = 1
            L_0x061e:
                r13.mo43985b(r4)
                return r10
            L_0x0622:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x062c
                r4 = 1
            L_0x062c:
                boolean r0 = r13.mo43972a(r4)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x0637:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                float r1 = r15.readFloat()
                int r0 = r13.mo43931a(r0, r1)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x064d:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                int r0 = r13.mo44008f(r0)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x065f:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                int r0 = r13.mo44003e(r0)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x0671:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                int r0 = r13.mo43995d(r0)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x0683:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                int r0 = r13.mo43986c(r0)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x0695:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                int r0 = r13.mo43973b(r0)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x06a7:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                float r2 = r15.readFloat()
                float r1 = r15.readFloat()
                int r0 = r13.mo43974b(r0, r2, r1)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x06c1:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                float r2 = r15.readFloat()
                float r1 = r15.readFloat()
                int r0 = r13.mo43935a(r0, r2, r1)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x06db:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                float r1 = r15.readFloat()
                int r0 = r13.mo43934a(r0, r1)
                r16.writeNoException()
                r6.writeInt(r0)
                return r10
            L_0x06f1:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                r13.mo43977b(r0)
                return r10
            L_0x06fc:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                r13.mo43942a(r0)
                return r10
            L_0x0707:
                r15.enforceInterface(r2)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo43943a(r0, r1)
                return r10
            L_0x0716:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                java.lang.String r1 = r15.readString()
                r13.mo43948a(r0, r1)
                return r10
            L_0x0725:
                r15.enforceInterface(r2)
                int r0 = r15.readInt()
                java.lang.String r2 = r15.readString()
                float r3 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo43949a(r0, r2, r3, r1)
                return r10
            L_0x073c:
                r15.enforceInterface(r2)
                java.lang.String r0 = r15.readString()
                r13.mo43959a(r0)
                return r10
            L_0x0747:
                r6.writeString(r2)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.sandbox.C20788i.C20789a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public C20789a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
        }
    }

    /* renamed from: a */
    int mo43931a(int i, float f) throws RemoteException;

    /* renamed from: a */
    int mo43932a(int i, int i2) throws RemoteException;

    /* renamed from: a */
    int mo43933a(Bitmap bitmap) throws RemoteException;

    /* renamed from: a */
    int mo43934a(String str, float f) throws RemoteException;

    /* renamed from: a */
    int mo43935a(String str, float f, float f2) throws RemoteException;

    /* renamed from: a */
    int mo43936a(String str, int i, int i2, String str2, boolean z) throws RemoteException;

    /* renamed from: a */
    int mo43937a(String str, int i, int i2, boolean z) throws RemoteException;

    /* renamed from: a */
    int mo43938a(String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo43939a() throws RemoteException;

    /* renamed from: a */
    void mo43940a(double d) throws RemoteException;

    /* renamed from: a */
    void mo43941a(double d, double d2, double d3, double d4) throws RemoteException;

    /* renamed from: a */
    void mo43942a(float f) throws RemoteException;

    /* renamed from: a */
    void mo43943a(float f, float f2) throws RemoteException;

    /* renamed from: a */
    void mo43944a(float f, float f2, float f3, float f4, float f5) throws RemoteException;

    /* renamed from: a */
    void mo43945a(int i) throws RemoteException;

    /* renamed from: a */
    void mo43946a(int i, float f, float f2, int i2) throws RemoteException;

    /* renamed from: a */
    void mo43947a(int i, long j, long j2, String str) throws RemoteException;

    /* renamed from: a */
    void mo43948a(int i, String str) throws RemoteException;

    /* renamed from: a */
    void mo43949a(int i, String str, float f, float f2) throws RemoteException;

    /* renamed from: a */
    void mo43950a(C20658a aVar) throws RemoteException;

    /* renamed from: a */
    void mo43951a(C20706p pVar) throws RemoteException;

    /* renamed from: a */
    void mo43952a(C20709q qVar) throws RemoteException;

    /* renamed from: a */
    void mo43953a(C20715s sVar) throws RemoteException;

    /* renamed from: a */
    void mo43954a(C20724v vVar) throws RemoteException;

    /* renamed from: a */
    void mo43955a(C20727w wVar) throws RemoteException;

    /* renamed from: a */
    void mo43956a(C20730x xVar) throws RemoteException;

    /* renamed from: a */
    void mo43957a(C20733y yVar) throws RemoteException;

    /* renamed from: a */
    void mo43958a(C20736z zVar) throws RemoteException;

    /* renamed from: a */
    void mo43959a(String str) throws RemoteException;

    /* renamed from: a */
    void mo43960a(String str, int i, int i2, String str2) throws RemoteException;

    /* renamed from: a */
    void mo43961a(String str, String str2, float f) throws RemoteException;

    /* renamed from: a */
    void mo43962a(String str, String str2, float f, float f2, float f3) throws RemoteException;

    /* renamed from: a */
    void mo43963a(String str, String str2, String str3) throws RemoteException;

    /* renamed from: a */
    void mo43964a(String str, Map map) throws RemoteException;

    /* renamed from: a */
    void mo43965a(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: a */
    void mo43966a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) throws RemoteException;

    /* renamed from: a */
    void mo43967a(Map map) throws RemoteException;

    /* renamed from: a */
    void mo43968a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) throws RemoteException;

    /* renamed from: a */
    void mo43969a(boolean z, boolean z2, boolean z3, boolean z4) throws RemoteException;

    /* renamed from: a */
    void mo43970a(double[] dArr, double d) throws RemoteException;

    /* renamed from: a */
    void mo43971a(String[] strArr, double[] dArr, boolean[] zArr) throws RemoteException;

    /* renamed from: a */
    boolean mo43972a(boolean z) throws RemoteException;

    /* renamed from: b */
    int mo43973b(String str) throws RemoteException;

    /* renamed from: b */
    int mo43974b(String str, float f, float f2) throws RemoteException;

    /* renamed from: b */
    void mo43975b() throws RemoteException;

    /* renamed from: b */
    void mo43976b(double d, double d2, double d3, double d4) throws RemoteException;

    /* renamed from: b */
    void mo43977b(float f) throws RemoteException;

    /* renamed from: b */
    void mo43978b(float f, float f2) throws RemoteException;

    /* renamed from: b */
    void mo43979b(int i) throws RemoteException;

    /* renamed from: b */
    void mo43980b(C20730x xVar) throws RemoteException;

    /* renamed from: b */
    void mo43981b(C20736z zVar) throws RemoteException;

    /* renamed from: b */
    void mo43982b(String str, float f) throws RemoteException;

    /* renamed from: b */
    void mo43983b(String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo43984b(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: b */
    void mo43985b(boolean z) throws RemoteException;

    /* renamed from: c */
    int mo43986c(float f) throws RemoteException;

    /* renamed from: c */
    int mo43987c(String str) throws RemoteException;

    /* renamed from: c */
    void mo43988c() throws RemoteException;

    /* renamed from: c */
    void mo43989c(double d, double d2, double d3, double d4) throws RemoteException;

    /* renamed from: c */
    void mo43990c(float f, float f2) throws RemoteException;

    /* renamed from: c */
    void mo43991c(int i) throws RemoteException;

    /* renamed from: c */
    void mo43992c(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: c */
    void mo43993c(boolean z) throws RemoteException;

    /* renamed from: c */
    int[] mo43994c(String str, String str2) throws RemoteException;

    /* renamed from: d */
    int mo43995d(float f) throws RemoteException;

    /* renamed from: d */
    int mo43996d(String str) throws RemoteException;

    /* renamed from: d */
    void mo43997d() throws RemoteException;

    /* renamed from: d */
    void mo43998d(float f, float f2) throws RemoteException;

    /* renamed from: d */
    void mo43999d(int i) throws RemoteException;

    /* renamed from: d */
    void mo44000d(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: d */
    void mo44001d(boolean z) throws RemoteException;

    /* renamed from: e */
    float mo44002e(String str) throws RemoteException;

    /* renamed from: e */
    int mo44003e(float f) throws RemoteException;

    /* renamed from: e */
    void mo44004e() throws RemoteException;

    /* renamed from: e */
    void mo44005e(float f, float f2) throws RemoteException;

    /* renamed from: e */
    void mo44006e(int i) throws RemoteException;

    /* renamed from: e */
    void mo44007e(boolean z) throws RemoteException;

    /* renamed from: f */
    int mo44008f(float f) throws RemoteException;

    /* renamed from: f */
    void mo44009f() throws RemoteException;

    /* renamed from: f */
    void mo44010f(float f, float f2) throws RemoteException;

    /* renamed from: f */
    void mo44011f(int i) throws RemoteException;

    /* renamed from: f */
    void mo44012f(String str) throws RemoteException;

    /* renamed from: f */
    void mo44013f(boolean z) throws RemoteException;

    /* renamed from: g */
    int mo44014g(float f) throws RemoteException;

    /* renamed from: g */
    C20776e mo44015g() throws RemoteException;

    /* renamed from: g */
    void mo44016g(String str) throws RemoteException;

    /* renamed from: g */
    void mo44017g(boolean z) throws RemoteException;

    /* renamed from: h */
    void mo44018h(String str) throws RemoteException;

    /* renamed from: h */
    void mo44019h(boolean z) throws RemoteException;

    /* renamed from: i */
    void mo44020i(boolean z) throws RemoteException;

    /* renamed from: j */
    void mo44021j(boolean z) throws RemoteException;

    /* renamed from: k */
    void mo44022k(boolean z) throws RemoteException;

    /* renamed from: l */
    void mo44023l(boolean z) throws RemoteException;

    /* renamed from: m */
    void mo44024m(boolean z) throws RemoteException;

    /* renamed from: n */
    void mo44025n(boolean z) throws RemoteException;
}
