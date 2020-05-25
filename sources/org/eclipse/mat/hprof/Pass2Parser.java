package org.eclipse.mat.hprof;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.hprof.IHprofParserHandler.HeapObject;
import org.eclipse.mat.parser.model.ClassImpl;
import org.eclipse.mat.parser.model.ObjectArrayImpl;
import org.eclipse.mat.parser.model.PrimitiveArrayImpl;
import org.eclipse.mat.parser.p2693io.PositionInputStream;
import org.eclipse.mat.snapshot.model.FieldDescriptor;
import org.eclipse.mat.snapshot.model.IClass;
import org.eclipse.mat.snapshot.model.IPrimitiveArray;
import org.eclipse.mat.util.IProgressListener.OperationCanceledException;
import org.eclipse.mat.util.MessageUtil;
import org.eclipse.mat.util.SimpleMonitor.Listener;

public class Pass2Parser extends AbstractParser {
    static final Set<String> ignorableClasses;
    private IHprofParserHandler handler;
    private Listener monitor;

    static {
        HashSet hashSet = new HashSet();
        ignorableClasses = hashSet;
        hashSet.add(WeakReference.class.getName());
        ignorableClasses.add(SoftReference.class.getName());
        ignorableClasses.add(PhantomReference.class.getName());
        ignorableClasses.add("java.lang.ref.Finalizer");
    }

    private void skipClassDump() throws IOException {
        this.f133278in.skipBytes((this.idSize * 7) + 8);
        int readUnsignedShort = this.f133278in.readUnsignedShort();
        for (int i = 0; i < readUnsignedShort; i++) {
            this.f133278in.skipBytes(2);
            skipValue();
        }
        int readUnsignedShort2 = this.f133278in.readUnsignedShort();
        for (int i2 = 0; i2 < readUnsignedShort2; i2++) {
            this.f133278in.skipBytes(this.idSize);
            skipValue();
        }
        this.f133278in.skipBytes((this.idSize + 1) * this.f133278in.readUnsignedShort());
    }

    private void readObjectArrayDump(long j) throws IOException {
        long readID = readID();
        this.f133278in.skipBytes(4);
        int readInt = this.f133278in.readInt();
        long readID2 = readID();
        ClassImpl classImpl = (ClassImpl) this.handler.lookupClass(readID2);
        if (classImpl != null) {
            HeapObject heapObject = new HeapObject(this.handler.mapAddressToId(readID), readID, classImpl, ObjectArrayImpl.doGetUsedHeapSize(classImpl, readInt));
            heapObject.references.add(classImpl.getObjectAddress());
            heapObject.isArray = true;
            for (int i = 0; i < readInt; i++) {
                long readID3 = readID();
                if (readID3 != 0) {
                    heapObject.references.add(readID3);
                }
            }
            this.handler.addObject(heapObject, j);
            return;
        }
        throw new RuntimeException(MessageUtil.format(Messages.Pass2Parser_Error_HandlerMustCreateFakeClassForAddress, Long.toHexString(readID2)));
    }

    private void readPrimitiveArrayDump(long j) throws SnapshotException, IOException {
        long readID = readID();
        this.f133278in.skipBytes(4);
        int readInt = this.f133278in.readInt();
        byte readByte = this.f133278in.readByte();
        if (readByte < 4 || readByte > 11) {
            throw new SnapshotException(Messages.Pass1Parser_Error_IllegalType);
        }
        String str = IPrimitiveArray.TYPE[readByte];
        ClassImpl classImpl = (ClassImpl) this.handler.lookupClassByName(str, true);
        if (classImpl != null) {
            HeapObject heapObject = new HeapObject(this.handler.mapAddressToId(readID), readID, classImpl, PrimitiveArrayImpl.doGetUsedHeapSize(classImpl, readInt, readByte));
            heapObject.references.add(classImpl.getObjectAddress());
            heapObject.isArray = true;
            this.handler.addObject(heapObject, j);
            this.f133278in.skipBytes(IPrimitiveArray.ELEMENT_SIZE[readByte] * readInt);
            return;
        }
        throw new RuntimeException(MessageUtil.format(Messages.Pass2Parser_Error_HandleMustCreateFakeClassForName, str));
    }

    private void readPrimitiveArrayNoDataDump(long j) throws SnapshotException, IOException {
        long readID = readID();
        this.f133278in.skipBytes(4);
        int readInt = this.f133278in.readInt();
        byte readByte = this.f133278in.readByte();
        if (readByte < 4 || readByte > 11) {
            throw new SnapshotException(Messages.Pass1Parser_Error_IllegalType);
        }
        String str = IPrimitiveArray.TYPE[readByte];
        ClassImpl classImpl = (ClassImpl) this.handler.lookupClassByName(str, true);
        if (classImpl != null) {
            HeapObject heapObject = new HeapObject(this.handler.mapAddressToId(readID), readID, classImpl, PrimitiveArrayImpl.doGetUsedHeapSize(classImpl, readInt, readByte));
            heapObject.references.add(classImpl.getObjectAddress());
            heapObject.isArray = true;
            this.handler.addObject(heapObject, j);
            return;
        }
        throw new RuntimeException(MessageUtil.format(Messages.Pass2Parser_Error_HandleMustCreateFakeClassForName, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        r7.f133278in.skipBytes(r7.idSize);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readDumpSegments(long r8) throws org.eclipse.mat.SnapshotException, java.io.IOException {
        /*
            r7 = this;
            org.eclipse.mat.parser.io.PositionInputStream r0 = r7.f133278in
            long r0 = r0.position()
            long r8 = r8 + r0
        L_0x0007:
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c1
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r0 / r2
            org.eclipse.mat.util.SimpleMonitor$Listener r4 = r7.monitor
            long r4 = r4.getWorkDone()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x002d
            org.eclipse.mat.util.SimpleMonitor$Listener r4 = r7.monitor
            boolean r4 = r4.isProbablyCanceled()
            if (r4 != 0) goto L_0x0027
            org.eclipse.mat.util.SimpleMonitor$Listener r4 = r7.monitor
            r4.totalWorkDone(r2)
            goto L_0x002d
        L_0x0027:
            org.eclipse.mat.util.IProgressListener$OperationCanceledException r8 = new org.eclipse.mat.util.IProgressListener$OperationCanceledException
            r8.<init>()
            throw r8
        L_0x002d:
            org.eclipse.mat.parser.io.PositionInputStream r2 = r7.f133278in
            int r2 = r2.readUnsignedByte()
            r3 = 144(0x90, float:2.02E-43)
            if (r2 == r3) goto L_0x00b2
            r3 = 195(0xc3, float:2.73E-43)
            if (r2 == r3) goto L_0x00ae
            r3 = 2
            switch(r2) {
                case 1: goto L_0x00a4;
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 4: goto L_0x0090;
                case 5: goto L_0x0088;
                case 6: goto L_0x0090;
                case 7: goto L_0x0088;
                case 8: goto L_0x009a;
                default: goto L_0x003f;
            }
        L_0x003f:
            switch(r2) {
                case 32: goto L_0x0084;
                case 33: goto L_0x0080;
                case 34: goto L_0x007c;
                case 35: goto L_0x0078;
                default: goto L_0x0042;
            }
        L_0x0042:
            switch(r2) {
                case 137: goto L_0x00b2;
                case 138: goto L_0x00b2;
                case 139: goto L_0x00b2;
                case 140: goto L_0x00b2;
                case 141: goto L_0x00b2;
                case 142: goto L_0x006e;
                default: goto L_0x0045;
            }
        L_0x0045:
            switch(r2) {
                case 254: goto L_0x0064;
                case 255: goto L_0x0088;
                default: goto L_0x0048;
            }
        L_0x0048:
            org.eclipse.mat.SnapshotException r8 = new org.eclipse.mat.SnapshotException
            java.lang.String r9 = org.eclipse.mat.hprof.Messages.Pass1Parser_Error_InvalidHeapDumpFile
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r4] = r2
            r2 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3[r2] = r0
            java.lang.String r9 = org.eclipse.mat.util.MessageUtil.format(r9, r3)
            r8.<init>(r9)
            throw r8
        L_0x0064:
            org.eclipse.mat.parser.io.PositionInputStream r0 = r7.f133278in
            int r1 = r7.idSize
            int r1 = r1 + 4
            r0.skipBytes(r1)
            goto L_0x00b9
        L_0x006e:
            org.eclipse.mat.parser.io.PositionInputStream r0 = r7.f133278in
            int r1 = r7.idSize
            int r1 = r1 + 8
            r0.skipBytes(r1)
            goto L_0x00b9
        L_0x0078:
            r7.readPrimitiveArrayDump(r0)
            goto L_0x00b9
        L_0x007c:
            r7.readObjectArrayDump(r0)
            goto L_0x00b9
        L_0x0080:
            r7.readInstanceDump(r0)
            goto L_0x00b9
        L_0x0084:
            r7.skipClassDump()
            goto L_0x00b9
        L_0x0088:
            org.eclipse.mat.parser.io.PositionInputStream r0 = r7.f133278in
            int r1 = r7.idSize
            r0.skipBytes(r1)
            goto L_0x00b9
        L_0x0090:
            org.eclipse.mat.parser.io.PositionInputStream r0 = r7.f133278in
            int r1 = r7.idSize
            int r1 = r1 + 4
            r0.skipBytes(r1)
            goto L_0x00b9
        L_0x009a:
            org.eclipse.mat.parser.io.PositionInputStream r0 = r7.f133278in
            int r1 = r7.idSize
            int r1 = r1 + 8
            r0.skipBytes(r1)
            goto L_0x00b9
        L_0x00a4:
            org.eclipse.mat.parser.io.PositionInputStream r0 = r7.f133278in
            int r1 = r7.idSize
            int r1 = r1 * 2
            r0.skipBytes(r1)
            goto L_0x00b9
        L_0x00ae:
            r7.readPrimitiveArrayNoDataDump(r0)
            goto L_0x00b9
        L_0x00b2:
            org.eclipse.mat.parser.io.PositionInputStream r0 = r7.f133278in
            int r1 = r7.idSize
            r0.skipBytes(r1)
        L_0x00b9:
            org.eclipse.mat.parser.io.PositionInputStream r0 = r7.f133278in
            long r0 = r0.position()
            goto L_0x0007
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.hprof.Pass2Parser.readDumpSegments(long):void");
    }

    private void readInstanceDump(long j) throws IOException {
        boolean z;
        long readID = readID();
        this.f133278in.skipBytes(4);
        long readID2 = readID();
        long readInt = ((long) this.f133278in.readInt()) + this.f133278in.position();
        List<IClass> resolveClassHierarchy = this.handler.resolveClassHierarchy(readID2);
        ClassImpl classImpl = (ClassImpl) resolveClassHierarchy.get(0);
        HeapObject heapObject = new HeapObject(this.handler.mapAddressToId(readID), readID, classImpl, classImpl.getHeapSizePerInstance());
        heapObject.references.add(classImpl.getObjectAddress());
        Iterator it = resolveClassHierarchy.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (ignorableClasses.contains(((IClass) it.next()).getName())) {
                z = true;
                break;
            }
        }
        for (IClass fieldDescriptors : resolveClassHierarchy) {
            for (FieldDescriptor fieldDescriptor : fieldDescriptors.getFieldDescriptors()) {
                int type = fieldDescriptor.getType();
                if (type == 2) {
                    long readID3 = readID();
                    if (readID3 != 0 && (!z || !fieldDescriptor.getName().equals("referent"))) {
                        heapObject.references.add(readID3);
                    }
                } else {
                    skipValue(type);
                }
            }
        }
        if (readInt == this.f133278in.position()) {
            this.handler.addObject(heapObject, j);
            return;
        }
        long j2 = j;
        throw new IOException(MessageUtil.format(Messages.Pass2Parser_Error_InsufficientBytesRead, Long.valueOf(j)));
    }

    public void read(File file) throws SnapshotException, IOException {
        this.f133278in = new PositionInputStream(new BufferedInputStream(new FileInputStream(file)));
        int determineDumpNumber = determineDumpNumber();
        try {
            this.version = readVersion(this.f133278in);
            this.idSize = this.f133278in.readInt();
            if (this.idSize != 4) {
                if (this.idSize != 8) {
                    throw new SnapshotException(Messages.Pass1Parser_Error_SupportedDumps);
                }
            }
            this.f133278in.skipBytes(8);
            long length = file.length();
            long position = this.f133278in.position();
            int i = 0;
            while (position < length) {
                if (!this.monitor.isProbablyCanceled()) {
                    this.monitor.totalWorkDone(position / 1000);
                    int readUnsignedByte = this.f133278in.readUnsignedByte();
                    this.f133278in.skipBytes(4);
                    long readUnsignedInt = readUnsignedInt();
                    if (readUnsignedInt >= 0) {
                        if (readUnsignedByte == 12 || readUnsignedByte == 28) {
                            if (determineDumpNumber == i) {
                                readDumpSegments(readUnsignedInt);
                            } else {
                                this.f133278in.skipBytes(readUnsignedInt);
                            }
                            if (readUnsignedByte == 12) {
                                i++;
                            }
                        } else {
                            if (readUnsignedByte == 44) {
                                i++;
                            }
                            this.f133278in.skipBytes(readUnsignedInt);
                        }
                        position = this.f133278in.position();
                    } else {
                        throw new SnapshotException(MessageUtil.format(Messages.Pass1Parser_Error_IllegalRecordLength, Long.valueOf(this.f133278in.position())));
                    }
                } else {
                    throw new OperationCanceledException();
                }
            }
        } finally {
            try {
                this.f133278in.close();
            } catch (IOException unused) {
            }
        }
    }

    public Pass2Parser(IHprofParserHandler iHprofParserHandler, Listener listener) {
        this.handler = iHprofParserHandler;
        this.monitor = listener;
    }
}
