package org.eclipse.mat.hprof;

import java.io.IOException;
import java.io.InputStream;
import org.eclipse.mat.parser.p2693io.PositionInputStream;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.model.IPrimitiveArray;
import org.eclipse.mat.snapshot.model.ObjectReference;
import org.eclipse.mat.util.MessageUtil;

abstract class AbstractParser {
    protected int idSize;

    /* renamed from: in */
    protected PositionInputStream f133278in;
    protected Version version;

    interface Constants {

        public interface DumpSegment {
        }

        public interface Record {
        }
    }

    enum Version {
        JDK12BETA3("JAVA PROFILE 1.0"),
        JDK12BETA4("JAVA PROFILE 1.0.1"),
        JDK6("JAVA PROFILE 1.0.2"),
        ANDROID103("JAVA PROFILE 1.0.3");
        
        private String label;

        public final String getLabel() {
            return this.label;
        }

        public static Version byLabel(String str) {
            Version[] values;
            for (Version version : values()) {
                if (version.label.equals(str)) {
                    return version;
                }
            }
            return null;
        }

        private Version(String str) {
            this.label = str;
        }
    }

    AbstractParser() {
    }

    /* access modifiers changed from: protected */
    public int determineDumpNumber() {
        String property = System.getProperty("MAT_HPROF_DUMP_NR");
        if (property == null) {
            return 0;
        }
        return Integer.parseInt(property);
    }

    /* access modifiers changed from: protected */
    public long readUnsignedInt() throws IOException {
        return ((long) this.f133278in.readInt()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    public void skipValue() throws IOException {
        skipValue(this.f133278in.readByte());
    }

    /* access modifiers changed from: protected */
    public long readID() throws IOException {
        if (this.idSize == 4) {
            return 4294967295L & ((long) this.f133278in.readInt());
        }
        return this.f133278in.readLong();
    }

    /* access modifiers changed from: protected */
    public Object readValue(ISnapshot iSnapshot) throws IOException {
        return readValue(iSnapshot, this.f133278in.readByte());
    }

    /* access modifiers changed from: protected */
    public void skipValue(int i) throws IOException {
        if (i == 2) {
            this.f133278in.skipBytes(this.idSize);
        } else {
            this.f133278in.skipBytes(IPrimitiveArray.ELEMENT_SIZE[i]);
        }
    }

    static Version readVersion(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < 20) {
            byte read = (byte) inputStream.read();
            i++;
            if (read != 0) {
                sb.append((char) read);
            } else {
                Version byLabel = Version.byLabel(sb.toString());
                if (byLabel == null) {
                    if (i <= 13) {
                        throw new IOException(Messages.AbstractParser_Error_NotHeapDump);
                    }
                    throw new IOException(MessageUtil.format(Messages.AbstractParser_Error_UnknownHPROFVersion, sb.toString()));
                } else if (byLabel != Version.JDK12BETA3) {
                    return byLabel;
                } else {
                    throw new IOException(MessageUtil.format(Messages.AbstractParser_Error_UnsupportedHPROFVersion, byLabel.getLabel()));
                }
            }
        }
        throw new IOException(Messages.AbstractParser_Error_InvalidHPROFHeader);
    }

    /* access modifiers changed from: protected */
    public Object readValue(ISnapshot iSnapshot, int i) throws IOException {
        if (i != 2) {
            boolean z = false;
            switch (i) {
                case 4:
                    if (this.f133278in.readByte() != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                case 5:
                    return Character.valueOf(this.f133278in.readChar());
                case 6:
                    return Float.valueOf(this.f133278in.readFloat());
                case 7:
                    return Double.valueOf(this.f133278in.readDouble());
                case 8:
                    return Byte.valueOf(this.f133278in.readByte());
                case 9:
                    return Short.valueOf(this.f133278in.readShort());
                case 10:
                    return Integer.valueOf(this.f133278in.readInt());
                case 11:
                    return Long.valueOf(this.f133278in.readLong());
                default:
                    throw new IOException(MessageUtil.format(Messages.AbstractParser_Error_IllegalType, Integer.valueOf(i)));
            }
        } else {
            long readID = readID();
            if (readID == 0) {
                return null;
            }
            return new ObjectReference(iSnapshot, readID);
        }
    }
}
