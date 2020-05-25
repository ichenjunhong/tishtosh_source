package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData */
public final class com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData extends Message<com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData> ADAPTER = new C32850xa5540615();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 268320546)
    public final Boolean fragment_display_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 2, tag = 18719457)
    public final List<Integer> vv_of_fragments;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData, Builder> {
        public Boolean fragment_display_switch;
        public List<Integer> vv_of_fragments = Internal.newMutableList();

        public final com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData build() {
            return new com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData(this.fragment_display_switch, this.vv_of_fragments, super.buildUnknownFields());
        }

        public final Builder fragment_display_switch(Boolean bool) {
            this.fragment_display_switch = bool;
            return this;
        }

        public final Builder vv_of_fragments(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.vv_of_fragments = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData$ProtoAdapter_com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData */
    static final class C32850xa5540615 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData> {
        public final com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData redact(com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata) {
            return com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata;
        }

        public C32850xa5540615() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData.class);
        }

        public final com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(268320546, com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata.fragment_display_switch) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(18719457, com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata.vv_of_fragments) + com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 268320546, com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata.fragment_display_switch);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 18719457, com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata.vv_of_fragments);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata.unknownFields());
        }

        public final com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData decode(ProtoReader protoReader, com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata2 = (com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData.class, com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata);
            if (com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata2 != null) {
                builder = com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<Integer> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.vv_of_fragments = newMutableList;
                    }
                    return builder.build();
                } else if (nextTag == 18719457) {
                    newMutableList.add(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 268320546) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.fragment_display_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }
    }

    public final List<Integer> getVvOfFragments() {
        return this.vv_of_fragments;
    }

    public final Boolean getFragmentDisplaySwitch() throws C10174a {
        if (this.fragment_display_switch != null) {
            return this.fragment_display_switch;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.fragment_display_switch = this.fragment_display_switch;
        builder.vv_of_fragments = Internal.copyOf("vv_of_fragments", this.vv_of_fragments);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.fragment_display_switch != null) {
            i = this.fragment_display_switch.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = ((hashCode + i) * 37) + this.vv_of_fragments.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fragment_display_switch != null) {
            sb.append(", fragment_display_switch=");
            sb.append(this.fragment_display_switch);
        }
        if (!this.vv_of_fragments.isEmpty()) {
            sb.append(", vv_of_fragments=");
            sb.append(this.vv_of_fragments);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData)) {
            return false;
        }
        com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata = (com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata.unknownFields()) || !Internal.equals(this.fragment_display_switch, com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata.fragment_display_switch) || !this.vv_of_fragments.equals(com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata.vv_of_fragments)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData(Boolean bool, List<Integer> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData(Boolean bool, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fragment_display_switch = bool;
        this.vv_of_fragments = Internal.immutableCopyOf("vv_of_fragments", list);
    }
}
