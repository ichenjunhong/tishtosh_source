package com.bytedance.p702im.core.proto;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ResponseBody */
public final class ResponseBody extends Message<ResponseBody, Builder> {
    public static final ProtoAdapter<ResponseBody> ADAPTER = new ProtoAdapter_ResponseBody();
    private static final long serialVersionUID = 0;
    public final BatchMarkConversationReadResponseBody batch_mark_read_body;
    public final CheckMessagesPerUserResponseBody check_messages_per_user_body;
    public final ClientACKResponseBody client_ack_body;
    public final ConversationAddParticipantsResponseBody conversation_add_participants_body;
    public final ConversationInfoUpdatedNotify conversation_info_updated_notify;
    public final ConversationParticipantsListResponseBody conversation_participants_body;
    public final ConversationRemoveParticipantsResponseBody conversation_remove_participants_body;
    public final ConversationSetRoleResponseBody conversation_set_role_body;
    public final ConversationsListResponseBody conversations_list_body;
    public final CreateConversationResponseBody create_conversation_body;
    public final CreateConversationV2ResponseBody create_conversation_v2_body;
    public final DeleteConversationCoreExtInfoResponseBody delete_conversation_core_ext_info_body;
    public final DeleteConversationSettingExtInfoResponseBody delete_conversation_setting_ext_info_body;
    public final DeleteStrangerAllConversationResponseBody delete_stranger_all_conversation_body;
    public final DeleteStrangerConversationResponseBody delete_stranger_conversation_body;
    public final DeleteStrangerMessageResponseBody delete_stranger_message_body;
    public final GetConfigsResponseBody get_configs_body;
    public final GetConversationCoreInfoResponseBody get_conversation_core_info_body;
    public final GetConversationCoreInfoListResponseBody get_conversation_core_info_list_body;
    public final GetConversationInfoResponseBody get_conversation_info_body;
    public final GetConversationInfoListByFavoriteV2ResponseBody get_conversation_info_list_by_favorite_v2_body;
    public final GetConversationInfoListByTopV2ResponseBody get_conversation_info_list_by_top_v2_body;
    public final GetConversationInfoListV2ResponseBody get_conversation_info_list_v2_body;
    public final GetConversationInfoV2ResponseBody get_conversation_info_v2_body;
    public final GetUserConversationListResponseBody get_conversation_list_body;
    public final GetConversationSettingInfoResponseBody get_conversation_setting_info_body;
    public final GetConversationsCheckInfoResponseBody get_conversations_checkinfo_body;
    public final GetConversationInfoListResponseBody get_conversations_info_list_body;
    public final GetGroupInfoResponseBody get_group_info_body;
    public final GetGroupInfoListResponseBody get_groups_info_body;
    public final GetMessagesCheckInfoInConversationResponseBody get_messages_checkinfo_in_conversation_body;
    public final GetStrangerConversationListResponseBody get_stranger_conversation_body;
    public final GetStrangerMessagesResponseBody get_stranger_messages_body;
    public final NewMessageNotify has_new_message_notify;
    public final MarkConversationReadNotify mark_conversation_read_notify;
    public final MarkStrangerAllConversationReadResponseBody mark_stranger_all_conversation_read_body;
    public final MarkStrangerConversationReadResponseBody mark_stranger_conversation_read_body;
    public final MessagesInConversationResponseBody messages_in_conversation_body;
    public final MessagesPerUserResponseBody messages_per_user_body;
    public final MessagesPerUserInitResponseBody messages_per_user_init_body;
    public final MessagesPerUserInitV2ResponseBody messages_per_user_init_v2_body;
    public final MgetConversationParticipantsResponseBody mget_conversation_participants_body;
    public final ModifyMessagePropertyResponseBody modify_message_property_body;
    public final GetConversationParticipantsMinIndexV3ResponseBody participants_min_index_body;
    public final GetConversationParticipantsReadIndexV3ResponseBody participants_read_index_body;
    public final ReactionMessageResponseBody reaction_message_body;
    public final ReportClientMetricsResponseBody report_client_metrics_body;
    public final SendMessageResponseBody send_message_body;
    public final SendUserActionResponseBody send_user_action_body;
    public final SetConversationCoreInfoResponseBody set_conversation_core_info_body;
    public final SetConversationInfoResponseBody set_conversation_info_body;
    public final SetConversationSettingInfoResponseBody set_conversation_setting_info_body;
    public final SetGroupInfoResponseBody set_group_info_body;
    public final StrangerNewMessageNotify stranger_has_new_message_notify;
    public final SyncMessageResponseBody sync_message_body;
    public final UpdateConversationParticipantResponseBody update_conversation_participant_body;
    public final UpsertConversationCoreExtInfoResponseBody upsert_conversation_core_ext_info_body;
    public final UpsertConversationSettingExtInfoResponseBody upsert_conversation_setting_ext_info_body;

    /* renamed from: com.bytedance.im.core.proto.ResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ResponseBody, Builder> {
        public BatchMarkConversationReadResponseBody batch_mark_read_body;
        public CheckMessagesPerUserResponseBody check_messages_per_user_body;
        public ClientACKResponseBody client_ack_body;
        public ConversationAddParticipantsResponseBody conversation_add_participants_body;
        public ConversationInfoUpdatedNotify conversation_info_updated_notify;
        public ConversationParticipantsListResponseBody conversation_participants_body;
        public ConversationRemoveParticipantsResponseBody conversation_remove_participants_body;
        public ConversationSetRoleResponseBody conversation_set_role_body;
        public ConversationsListResponseBody conversations_list_body;
        public CreateConversationResponseBody create_conversation_body;
        public CreateConversationV2ResponseBody create_conversation_v2_body;
        public DeleteConversationCoreExtInfoResponseBody delete_conversation_core_ext_info_body;
        public DeleteConversationSettingExtInfoResponseBody delete_conversation_setting_ext_info_body;
        public DeleteStrangerAllConversationResponseBody delete_stranger_all_conversation_body;
        public DeleteStrangerConversationResponseBody delete_stranger_conversation_body;
        public DeleteStrangerMessageResponseBody delete_stranger_message_body;
        public GetConfigsResponseBody get_configs_body;
        public GetConversationCoreInfoResponseBody get_conversation_core_info_body;
        public GetConversationCoreInfoListResponseBody get_conversation_core_info_list_body;
        public GetConversationInfoResponseBody get_conversation_info_body;
        public GetConversationInfoListByFavoriteV2ResponseBody get_conversation_info_list_by_favorite_v2_body;
        public GetConversationInfoListByTopV2ResponseBody get_conversation_info_list_by_top_v2_body;
        public GetConversationInfoListV2ResponseBody get_conversation_info_list_v2_body;
        public GetConversationInfoV2ResponseBody get_conversation_info_v2_body;
        public GetUserConversationListResponseBody get_conversation_list_body;
        public GetConversationSettingInfoResponseBody get_conversation_setting_info_body;
        public GetConversationsCheckInfoResponseBody get_conversations_checkinfo_body;
        public GetConversationInfoListResponseBody get_conversations_info_list_body;
        public GetGroupInfoResponseBody get_group_info_body;
        public GetGroupInfoListResponseBody get_groups_info_body;
        public GetMessagesCheckInfoInConversationResponseBody get_messages_checkinfo_in_conversation_body;
        public GetStrangerConversationListResponseBody get_stranger_conversation_body;
        public GetStrangerMessagesResponseBody get_stranger_messages_body;
        public NewMessageNotify has_new_message_notify;
        public MarkConversationReadNotify mark_conversation_read_notify;
        public MarkStrangerAllConversationReadResponseBody mark_stranger_all_conversation_read_body;
        public MarkStrangerConversationReadResponseBody mark_stranger_conversation_read_body;
        public MessagesInConversationResponseBody messages_in_conversation_body;
        public MessagesPerUserResponseBody messages_per_user_body;
        public MessagesPerUserInitResponseBody messages_per_user_init_body;
        public MessagesPerUserInitV2ResponseBody messages_per_user_init_v2_body;
        public MgetConversationParticipantsResponseBody mget_conversation_participants_body;
        public ModifyMessagePropertyResponseBody modify_message_property_body;
        public GetConversationParticipantsMinIndexV3ResponseBody participants_min_index_body;
        public GetConversationParticipantsReadIndexV3ResponseBody participants_read_index_body;
        public ReactionMessageResponseBody reaction_message_body;
        public ReportClientMetricsResponseBody report_client_metrics_body;
        public SendMessageResponseBody send_message_body;
        public SendUserActionResponseBody send_user_action_body;
        public SetConversationCoreInfoResponseBody set_conversation_core_info_body;
        public SetConversationInfoResponseBody set_conversation_info_body;
        public SetConversationSettingInfoResponseBody set_conversation_setting_info_body;
        public SetGroupInfoResponseBody set_group_info_body;
        public StrangerNewMessageNotify stranger_has_new_message_notify;
        public SyncMessageResponseBody sync_message_body;
        public UpdateConversationParticipantResponseBody update_conversation_participant_body;
        public UpsertConversationCoreExtInfoResponseBody upsert_conversation_core_ext_info_body;
        public UpsertConversationSettingExtInfoResponseBody upsert_conversation_setting_ext_info_body;

        public final ResponseBody build() {
            ResponseBody responseBody = new ResponseBody(this.send_message_body, this.messages_per_user_body, this.messages_per_user_init_body, this.messages_per_user_init_v2_body, this.check_messages_per_user_body, this.conversations_list_body, this.messages_in_conversation_body, this.get_messages_checkinfo_in_conversation_body, this.send_user_action_body, this.has_new_message_notify, this.mark_conversation_read_notify, this.conversation_info_updated_notify, this.stranger_has_new_message_notify, this.get_conversation_info_body, this.set_conversation_info_body, this.create_conversation_body, this.get_conversations_info_list_body, this.batch_mark_read_body, this.get_conversations_checkinfo_body, this.get_conversation_info_v2_body, this.create_conversation_v2_body, this.get_conversation_info_list_v2_body, this.get_conversation_info_list_by_favorite_v2_body, this.get_conversation_info_list_by_top_v2_body, this.conversation_participants_body, this.conversation_add_participants_body, this.conversation_remove_participants_body, this.conversation_set_role_body, this.mget_conversation_participants_body, this.update_conversation_participant_body, this.reaction_message_body, this.sync_message_body, this.modify_message_property_body, this.get_group_info_body, this.set_group_info_body, this.get_groups_info_body, this.get_conversation_core_info_body, this.set_conversation_core_info_body, this.get_conversation_core_info_list_body, this.upsert_conversation_core_ext_info_body, this.delete_conversation_core_ext_info_body, this.get_conversation_setting_info_body, this.set_conversation_setting_info_body, this.upsert_conversation_setting_ext_info_body, this.delete_conversation_setting_ext_info_body, this.get_stranger_conversation_body, this.get_stranger_messages_body, this.delete_stranger_message_body, this.delete_stranger_conversation_body, this.delete_stranger_all_conversation_body, this.mark_stranger_conversation_read_body, this.mark_stranger_all_conversation_read_body, this.participants_read_index_body, this.participants_min_index_body, this.get_conversation_list_body, this.client_ack_body, this.report_client_metrics_body, this.get_configs_body, super.buildUnknownFields());
            return responseBody;
        }

        public final Builder batch_mark_read_body(BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody) {
            this.batch_mark_read_body = batchMarkConversationReadResponseBody;
            return this;
        }

        public final Builder check_messages_per_user_body(CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
            this.check_messages_per_user_body = checkMessagesPerUserResponseBody;
            return this;
        }

        public final Builder client_ack_body(ClientACKResponseBody clientACKResponseBody) {
            this.client_ack_body = clientACKResponseBody;
            return this;
        }

        public final Builder conversation_add_participants_body(ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
            this.conversation_add_participants_body = conversationAddParticipantsResponseBody;
            return this;
        }

        public final Builder conversation_info_updated_notify(ConversationInfoUpdatedNotify conversationInfoUpdatedNotify) {
            this.conversation_info_updated_notify = conversationInfoUpdatedNotify;
            return this;
        }

        public final Builder conversation_participants_body(ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
            this.conversation_participants_body = conversationParticipantsListResponseBody;
            return this;
        }

        public final Builder conversation_remove_participants_body(ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
            this.conversation_remove_participants_body = conversationRemoveParticipantsResponseBody;
            return this;
        }

        public final Builder conversation_set_role_body(ConversationSetRoleResponseBody conversationSetRoleResponseBody) {
            this.conversation_set_role_body = conversationSetRoleResponseBody;
            return this;
        }

        public final Builder conversations_list_body(ConversationsListResponseBody conversationsListResponseBody) {
            this.conversations_list_body = conversationsListResponseBody;
            return this;
        }

        public final Builder create_conversation_body(CreateConversationResponseBody createConversationResponseBody) {
            this.create_conversation_body = createConversationResponseBody;
            return this;
        }

        public final Builder create_conversation_v2_body(CreateConversationV2ResponseBody createConversationV2ResponseBody) {
            this.create_conversation_v2_body = createConversationV2ResponseBody;
            return this;
        }

        public final Builder delete_conversation_core_ext_info_body(DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody) {
            this.delete_conversation_core_ext_info_body = deleteConversationCoreExtInfoResponseBody;
            return this;
        }

        public final Builder delete_conversation_setting_ext_info_body(DeleteConversationSettingExtInfoResponseBody deleteConversationSettingExtInfoResponseBody) {
            this.delete_conversation_setting_ext_info_body = deleteConversationSettingExtInfoResponseBody;
            return this;
        }

        public final Builder delete_stranger_all_conversation_body(DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody) {
            this.delete_stranger_all_conversation_body = deleteStrangerAllConversationResponseBody;
            return this;
        }

        public final Builder delete_stranger_conversation_body(DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody) {
            this.delete_stranger_conversation_body = deleteStrangerConversationResponseBody;
            return this;
        }

        public final Builder delete_stranger_message_body(DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody) {
            this.delete_stranger_message_body = deleteStrangerMessageResponseBody;
            return this;
        }

        public final Builder get_configs_body(GetConfigsResponseBody getConfigsResponseBody) {
            this.get_configs_body = getConfigsResponseBody;
            return this;
        }

        public final Builder get_conversation_core_info_body(GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody) {
            this.get_conversation_core_info_body = getConversationCoreInfoResponseBody;
            return this;
        }

        public final Builder get_conversation_core_info_list_body(GetConversationCoreInfoListResponseBody getConversationCoreInfoListResponseBody) {
            this.get_conversation_core_info_list_body = getConversationCoreInfoListResponseBody;
            return this;
        }

        public final Builder get_conversation_info_body(GetConversationInfoResponseBody getConversationInfoResponseBody) {
            this.get_conversation_info_body = getConversationInfoResponseBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_favorite_v2_body(GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody) {
            this.get_conversation_info_list_by_favorite_v2_body = getConversationInfoListByFavoriteV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_top_v2_body(GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
            this.get_conversation_info_list_by_top_v2_body = getConversationInfoListByTopV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_info_list_v2_body(GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
            this.get_conversation_info_list_v2_body = getConversationInfoListV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_info_v2_body(GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
            this.get_conversation_info_v2_body = getConversationInfoV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_list_body(GetUserConversationListResponseBody getUserConversationListResponseBody) {
            this.get_conversation_list_body = getUserConversationListResponseBody;
            return this;
        }

        public final Builder get_conversation_setting_info_body(GetConversationSettingInfoResponseBody getConversationSettingInfoResponseBody) {
            this.get_conversation_setting_info_body = getConversationSettingInfoResponseBody;
            return this;
        }

        public final Builder get_conversations_checkinfo_body(GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
            this.get_conversations_checkinfo_body = getConversationsCheckInfoResponseBody;
            return this;
        }

        public final Builder get_conversations_info_list_body(GetConversationInfoListResponseBody getConversationInfoListResponseBody) {
            this.get_conversations_info_list_body = getConversationInfoListResponseBody;
            return this;
        }

        public final Builder get_group_info_body(GetGroupInfoResponseBody getGroupInfoResponseBody) {
            this.get_group_info_body = getGroupInfoResponseBody;
            return this;
        }

        public final Builder get_groups_info_body(GetGroupInfoListResponseBody getGroupInfoListResponseBody) {
            this.get_groups_info_body = getGroupInfoListResponseBody;
            return this;
        }

        public final Builder get_messages_checkinfo_in_conversation_body(GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
            this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationResponseBody;
            return this;
        }

        public final Builder get_stranger_conversation_body(GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
            this.get_stranger_conversation_body = getStrangerConversationListResponseBody;
            return this;
        }

        public final Builder get_stranger_messages_body(GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
            this.get_stranger_messages_body = getStrangerMessagesResponseBody;
            return this;
        }

        public final Builder has_new_message_notify(NewMessageNotify newMessageNotify) {
            this.has_new_message_notify = newMessageNotify;
            return this;
        }

        public final Builder mark_conversation_read_notify(MarkConversationReadNotify markConversationReadNotify) {
            this.mark_conversation_read_notify = markConversationReadNotify;
            return this;
        }

        public final Builder mark_stranger_all_conversation_read_body(MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody) {
            this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadResponseBody;
            return this;
        }

        public final Builder mark_stranger_conversation_read_body(MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody) {
            this.mark_stranger_conversation_read_body = markStrangerConversationReadResponseBody;
            return this;
        }

        public final Builder messages_in_conversation_body(MessagesInConversationResponseBody messagesInConversationResponseBody) {
            this.messages_in_conversation_body = messagesInConversationResponseBody;
            return this;
        }

        public final Builder messages_per_user_body(MessagesPerUserResponseBody messagesPerUserResponseBody) {
            this.messages_per_user_body = messagesPerUserResponseBody;
            return this;
        }

        public final Builder messages_per_user_init_body(MessagesPerUserInitResponseBody messagesPerUserInitResponseBody) {
            this.messages_per_user_init_body = messagesPerUserInitResponseBody;
            return this;
        }

        public final Builder messages_per_user_init_v2_body(MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
            this.messages_per_user_init_v2_body = messagesPerUserInitV2ResponseBody;
            return this;
        }

        public final Builder mget_conversation_participants_body(MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody) {
            this.mget_conversation_participants_body = mgetConversationParticipantsResponseBody;
            return this;
        }

        public final Builder modify_message_property_body(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            this.modify_message_property_body = modifyMessagePropertyResponseBody;
            return this;
        }

        public final Builder participants_min_index_body(GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
            this.participants_min_index_body = getConversationParticipantsMinIndexV3ResponseBody;
            return this;
        }

        public final Builder participants_read_index_body(GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
            this.participants_read_index_body = getConversationParticipantsReadIndexV3ResponseBody;
            return this;
        }

        public final Builder reaction_message_body(ReactionMessageResponseBody reactionMessageResponseBody) {
            this.reaction_message_body = reactionMessageResponseBody;
            return this;
        }

        public final Builder report_client_metrics_body(ReportClientMetricsResponseBody reportClientMetricsResponseBody) {
            this.report_client_metrics_body = reportClientMetricsResponseBody;
            return this;
        }

        public final Builder send_message_body(SendMessageResponseBody sendMessageResponseBody) {
            this.send_message_body = sendMessageResponseBody;
            return this;
        }

        public final Builder send_user_action_body(SendUserActionResponseBody sendUserActionResponseBody) {
            this.send_user_action_body = sendUserActionResponseBody;
            return this;
        }

        public final Builder set_conversation_core_info_body(SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
            this.set_conversation_core_info_body = setConversationCoreInfoResponseBody;
            return this;
        }

        public final Builder set_conversation_info_body(SetConversationInfoResponseBody setConversationInfoResponseBody) {
            this.set_conversation_info_body = setConversationInfoResponseBody;
            return this;
        }

        public final Builder set_conversation_setting_info_body(SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody) {
            this.set_conversation_setting_info_body = setConversationSettingInfoResponseBody;
            return this;
        }

        public final Builder set_group_info_body(SetGroupInfoResponseBody setGroupInfoResponseBody) {
            this.set_group_info_body = setGroupInfoResponseBody;
            return this;
        }

        public final Builder stranger_has_new_message_notify(StrangerNewMessageNotify strangerNewMessageNotify) {
            this.stranger_has_new_message_notify = strangerNewMessageNotify;
            return this;
        }

        public final Builder sync_message_body(SyncMessageResponseBody syncMessageResponseBody) {
            this.sync_message_body = syncMessageResponseBody;
            return this;
        }

        public final Builder update_conversation_participant_body(UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
            this.update_conversation_participant_body = updateConversationParticipantResponseBody;
            return this;
        }

        public final Builder upsert_conversation_core_ext_info_body(UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
            this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoResponseBody;
            return this;
        }

        public final Builder upsert_conversation_setting_ext_info_body(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoResponseBody;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ResponseBody$ProtoAdapter_ResponseBody */
    static final class ProtoAdapter_ResponseBody extends ProtoAdapter<ResponseBody> {
        public ProtoAdapter_ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ResponseBody.class);
        }

        public final ResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 200:
                            builder.messages_per_user_body((MessagesPerUserResponseBody) MessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                            break;
                        case 201:
                            builder.messages_per_user_init_body((MessagesPerUserInitResponseBody) MessagesPerUserInitResponseBody.ADAPTER.decode(protoReader));
                            break;
                        default:
                            switch (nextTag) {
                                case 300:
                                    builder.conversations_list_body((ConversationsListResponseBody) ConversationsListResponseBody.ADAPTER.decode(protoReader));
                                    break;
                                case 301:
                                    builder.messages_in_conversation_body((MessagesInConversationResponseBody) MessagesInConversationResponseBody.ADAPTER.decode(protoReader));
                                    break;
                                case 302:
                                    builder.get_messages_checkinfo_in_conversation_body((GetMessagesCheckInfoInConversationResponseBody) GetMessagesCheckInfoInConversationResponseBody.ADAPTER.decode(protoReader));
                                    break;
                                default:
                                    switch (nextTag) {
                                        case 500:
                                            builder.has_new_message_notify((NewMessageNotify) NewMessageNotify.ADAPTER.decode(protoReader));
                                            break;
                                        case 501:
                                            builder.mark_conversation_read_notify((MarkConversationReadNotify) MarkConversationReadNotify.ADAPTER.decode(protoReader));
                                            break;
                                        case 502:
                                            builder.conversation_info_updated_notify((ConversationInfoUpdatedNotify) ConversationInfoUpdatedNotify.ADAPTER.decode(protoReader));
                                            break;
                                        case 503:
                                            builder.stranger_has_new_message_notify((StrangerNewMessageNotify) StrangerNewMessageNotify.ADAPTER.decode(protoReader));
                                            break;
                                        default:
                                            switch (nextTag) {
                                                case 600:
                                                    builder.get_conversation_info_body((GetConversationInfoResponseBody) GetConversationInfoResponseBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 601:
                                                    builder.set_conversation_info_body((SetConversationInfoResponseBody) SetConversationInfoResponseBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 602:
                                                    builder.create_conversation_body((CreateConversationResponseBody) CreateConversationResponseBody.ADAPTER.decode(protoReader));
                                                    break;
                                                default:
                                                    switch (nextTag) {
                                                        case 607:
                                                            builder.get_conversations_info_list_body((GetConversationInfoListResponseBody) GetConversationInfoListResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 608:
                                                            builder.get_conversation_info_v2_body((GetConversationInfoV2ResponseBody) GetConversationInfoV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 609:
                                                            builder.create_conversation_v2_body((CreateConversationV2ResponseBody) CreateConversationV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 610:
                                                            builder.get_conversation_info_list_v2_body((GetConversationInfoListV2ResponseBody) GetConversationInfoListV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 611:
                                                            builder.get_conversation_info_list_by_favorite_v2_body((GetConversationInfoListByFavoriteV2ResponseBody) GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 612:
                                                            builder.get_conversation_info_list_by_top_v2_body((GetConversationInfoListByTopV2ResponseBody) GetConversationInfoListByTopV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 613:
                                                            builder.batch_mark_read_body((BatchMarkConversationReadResponseBody) BatchMarkConversationReadResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        default:
                                                            switch (nextTag) {
                                                                case 650:
                                                                    builder.conversation_add_participants_body((ConversationAddParticipantsResponseBody) ConversationAddParticipantsResponseBody.ADAPTER.decode(protoReader));
                                                                    break;
                                                                case 651:
                                                                    builder.conversation_remove_participants_body((ConversationRemoveParticipantsResponseBody) ConversationRemoveParticipantsResponseBody.ADAPTER.decode(protoReader));
                                                                    break;
                                                                default:
                                                                    switch (nextTag) {
                                                                        case 653:
                                                                            builder.conversation_set_role_body((ConversationSetRoleResponseBody) ConversationSetRoleResponseBody.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        case 654:
                                                                            builder.mget_conversation_participants_body((MgetConversationParticipantsResponseBody) MgetConversationParticipantsResponseBody.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        case 655:
                                                                            builder.update_conversation_participant_body((UpdateConversationParticipantResponseBody) UpdateConversationParticipantResponseBody.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        default:
                                                                            switch (nextTag) {
                                                                                case 703:
                                                                                    builder.reaction_message_body((ReactionMessageResponseBody) ReactionMessageResponseBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                case 704:
                                                                                    builder.sync_message_body((SyncMessageResponseBody) SyncMessageResponseBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                case 705:
                                                                                    builder.modify_message_property_body((ModifyMessagePropertyResponseBody) ModifyMessagePropertyResponseBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                default:
                                                                                    switch (nextTag) {
                                                                                        case 801:
                                                                                            builder.get_group_info_body((GetGroupInfoResponseBody) GetGroupInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        case 802:
                                                                                            builder.set_group_info_body((SetGroupInfoResponseBody) SetGroupInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        case 803:
                                                                                            builder.get_groups_info_body((GetGroupInfoListResponseBody) GetGroupInfoListResponseBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        default:
                                                                                            switch (nextTag) {
                                                                                                case 901:
                                                                                                    builder.get_conversation_core_info_body((GetConversationCoreInfoResponseBody) GetConversationCoreInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 902:
                                                                                                    builder.set_conversation_core_info_body((SetConversationCoreInfoResponseBody) SetConversationCoreInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 903:
                                                                                                    builder.get_conversation_core_info_list_body((GetConversationCoreInfoListResponseBody) GetConversationCoreInfoListResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 904:
                                                                                                    builder.upsert_conversation_core_ext_info_body((UpsertConversationCoreExtInfoResponseBody) UpsertConversationCoreExtInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 905:
                                                                                                    builder.delete_conversation_core_ext_info_body((DeleteConversationCoreExtInfoResponseBody) DeleteConversationCoreExtInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (nextTag) {
                                                                                                        case 920:
                                                                                                            builder.get_conversation_setting_info_body((GetConversationSettingInfoResponseBody) GetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        case 921:
                                                                                                            builder.set_conversation_setting_info_body((SetConversationSettingInfoResponseBody) SetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        case 922:
                                                                                                            builder.upsert_conversation_setting_ext_info_body((UpsertConversationSettingExtInfoResponseBody) UpsertConversationSettingExtInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        case 923:
                                                                                                            builder.delete_conversation_setting_ext_info_body((DeleteConversationSettingExtInfoResponseBody) DeleteConversationSettingExtInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (nextTag) {
                                                                                                                case 1000:
                                                                                                                    builder.get_stranger_conversation_body((GetStrangerConversationListResponseBody) GetStrangerConversationListResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 1001:
                                                                                                                    builder.get_stranger_messages_body((GetStrangerMessagesResponseBody) GetStrangerMessagesResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case BaseNotice.CHECK_PROFILE /*1002*/:
                                                                                                                    builder.delete_stranger_message_body((DeleteStrangerMessageResponseBody) DeleteStrangerMessageResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                                                                                                                    builder.delete_stranger_conversation_body((DeleteStrangerConversationResponseBody) DeleteStrangerConversationResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 1004:
                                                                                                                    builder.delete_stranger_all_conversation_body((DeleteStrangerAllConversationResponseBody) DeleteStrangerAllConversationResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 1005:
                                                                                                                    builder.mark_stranger_conversation_read_body((MarkStrangerConversationReadResponseBody) MarkStrangerConversationReadResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 1006:
                                                                                                                    builder.mark_stranger_all_conversation_read_body((MarkStrangerAllConversationReadResponseBody) MarkStrangerAllConversationReadResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (nextTag) {
                                                                                                                        case 2000:
                                                                                                                            builder.participants_read_index_body((GetConversationParticipantsReadIndexV3ResponseBody) GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.decode(protoReader));
                                                                                                                            break;
                                                                                                                        case 2001:
                                                                                                                            builder.participants_min_index_body((GetConversationParticipantsMinIndexV3ResponseBody) GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.decode(protoReader));
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (nextTag) {
                                                                                                                                case 2016:
                                                                                                                                    builder.report_client_metrics_body((ReportClientMetricsResponseBody) ReportClientMetricsResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                    break;
                                                                                                                                case 2017:
                                                                                                                                    builder.get_configs_body((GetConfigsResponseBody) GetConfigsResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    switch (nextTag) {
                                                                                                                                        case 100:
                                                                                                                                            builder.send_message_body((SendMessageResponseBody) SendMessageResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                            break;
                                                                                                                                        case 203:
                                                                                                                                            builder.messages_per_user_init_v2_body((MessagesPerUserInitV2ResponseBody) MessagesPerUserInitV2ResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                            break;
                                                                                                                                        case 210:
                                                                                                                                            builder.check_messages_per_user_body((CheckMessagesPerUserResponseBody) CheckMessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                            break;
                                                                                                                                        case 410:
                                                                                                                                            builder.send_user_action_body((SendUserActionResponseBody) SendUserActionResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                            break;
                                                                                                                                        case 605:
                                                                                                                                            builder.conversation_participants_body((ConversationParticipantsListResponseBody) ConversationParticipantsListResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                            break;
                                                                                                                                        case 615:
                                                                                                                                            builder.get_conversations_checkinfo_body((GetConversationsCheckInfoResponseBody) GetConversationsCheckInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                            break;
                                                                                                                                        case 2006:
                                                                                                                                            builder.get_conversation_list_body((GetUserConversationListResponseBody) GetUserConversationListResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                            break;
                                                                                                                                        case 2010:
                                                                                                                                            builder.client_ack_body((ClientACKResponseBody) ClientACKResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                                                                                                                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                            }
                                                                                                                    }
                                                                                                            }
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(ResponseBody responseBody) {
            return SendMessageResponseBody.ADAPTER.encodedSizeWithTag(100, responseBody.send_message_body) + MessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(200, responseBody.messages_per_user_body) + MessagesPerUserInitResponseBody.ADAPTER.encodedSizeWithTag(201, responseBody.messages_per_user_init_body) + MessagesPerUserInitV2ResponseBody.ADAPTER.encodedSizeWithTag(203, responseBody.messages_per_user_init_v2_body) + CheckMessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(210, responseBody.check_messages_per_user_body) + ConversationsListResponseBody.ADAPTER.encodedSizeWithTag(300, responseBody.conversations_list_body) + MessagesInConversationResponseBody.ADAPTER.encodedSizeWithTag(301, responseBody.messages_in_conversation_body) + GetMessagesCheckInfoInConversationResponseBody.ADAPTER.encodedSizeWithTag(302, responseBody.get_messages_checkinfo_in_conversation_body) + SendUserActionResponseBody.ADAPTER.encodedSizeWithTag(410, responseBody.send_user_action_body) + NewMessageNotify.ADAPTER.encodedSizeWithTag(500, responseBody.has_new_message_notify) + MarkConversationReadNotify.ADAPTER.encodedSizeWithTag(501, responseBody.mark_conversation_read_notify) + ConversationInfoUpdatedNotify.ADAPTER.encodedSizeWithTag(502, responseBody.conversation_info_updated_notify) + StrangerNewMessageNotify.ADAPTER.encodedSizeWithTag(503, responseBody.stranger_has_new_message_notify) + GetConversationInfoResponseBody.ADAPTER.encodedSizeWithTag(600, responseBody.get_conversation_info_body) + SetConversationInfoResponseBody.ADAPTER.encodedSizeWithTag(601, responseBody.set_conversation_info_body) + CreateConversationResponseBody.ADAPTER.encodedSizeWithTag(602, responseBody.create_conversation_body) + GetConversationInfoListResponseBody.ADAPTER.encodedSizeWithTag(607, responseBody.get_conversations_info_list_body) + BatchMarkConversationReadResponseBody.ADAPTER.encodedSizeWithTag(613, responseBody.batch_mark_read_body) + GetConversationsCheckInfoResponseBody.ADAPTER.encodedSizeWithTag(615, responseBody.get_conversations_checkinfo_body) + GetConversationInfoV2ResponseBody.ADAPTER.encodedSizeWithTag(608, responseBody.get_conversation_info_v2_body) + CreateConversationV2ResponseBody.ADAPTER.encodedSizeWithTag(609, responseBody.create_conversation_v2_body) + GetConversationInfoListV2ResponseBody.ADAPTER.encodedSizeWithTag(610, responseBody.get_conversation_info_list_v2_body) + GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.encodedSizeWithTag(611, responseBody.get_conversation_info_list_by_favorite_v2_body) + GetConversationInfoListByTopV2ResponseBody.ADAPTER.encodedSizeWithTag(612, responseBody.get_conversation_info_list_by_top_v2_body) + ConversationParticipantsListResponseBody.ADAPTER.encodedSizeWithTag(605, responseBody.conversation_participants_body) + ConversationAddParticipantsResponseBody.ADAPTER.encodedSizeWithTag(650, responseBody.conversation_add_participants_body) + ConversationRemoveParticipantsResponseBody.ADAPTER.encodedSizeWithTag(651, responseBody.conversation_remove_participants_body) + ConversationSetRoleResponseBody.ADAPTER.encodedSizeWithTag(653, responseBody.conversation_set_role_body) + MgetConversationParticipantsResponseBody.ADAPTER.encodedSizeWithTag(654, responseBody.mget_conversation_participants_body) + UpdateConversationParticipantResponseBody.ADAPTER.encodedSizeWithTag(655, responseBody.update_conversation_participant_body) + ReactionMessageResponseBody.ADAPTER.encodedSizeWithTag(703, responseBody.reaction_message_body) + SyncMessageResponseBody.ADAPTER.encodedSizeWithTag(704, responseBody.sync_message_body) + ModifyMessagePropertyResponseBody.ADAPTER.encodedSizeWithTag(705, responseBody.modify_message_property_body) + GetGroupInfoResponseBody.ADAPTER.encodedSizeWithTag(801, responseBody.get_group_info_body) + SetGroupInfoResponseBody.ADAPTER.encodedSizeWithTag(802, responseBody.set_group_info_body) + GetGroupInfoListResponseBody.ADAPTER.encodedSizeWithTag(803, responseBody.get_groups_info_body) + GetConversationCoreInfoResponseBody.ADAPTER.encodedSizeWithTag(901, responseBody.get_conversation_core_info_body) + SetConversationCoreInfoResponseBody.ADAPTER.encodedSizeWithTag(902, responseBody.set_conversation_core_info_body) + GetConversationCoreInfoListResponseBody.ADAPTER.encodedSizeWithTag(903, responseBody.get_conversation_core_info_list_body) + UpsertConversationCoreExtInfoResponseBody.ADAPTER.encodedSizeWithTag(904, responseBody.upsert_conversation_core_ext_info_body) + DeleteConversationCoreExtInfoResponseBody.ADAPTER.encodedSizeWithTag(905, responseBody.delete_conversation_core_ext_info_body) + GetConversationSettingInfoResponseBody.ADAPTER.encodedSizeWithTag(920, responseBody.get_conversation_setting_info_body) + SetConversationSettingInfoResponseBody.ADAPTER.encodedSizeWithTag(921, responseBody.set_conversation_setting_info_body) + UpsertConversationSettingExtInfoResponseBody.ADAPTER.encodedSizeWithTag(922, responseBody.upsert_conversation_setting_ext_info_body) + DeleteConversationSettingExtInfoResponseBody.ADAPTER.encodedSizeWithTag(923, responseBody.delete_conversation_setting_ext_info_body) + GetStrangerConversationListResponseBody.ADAPTER.encodedSizeWithTag(1000, responseBody.get_stranger_conversation_body) + GetStrangerMessagesResponseBody.ADAPTER.encodedSizeWithTag(1001, responseBody.get_stranger_messages_body) + DeleteStrangerMessageResponseBody.ADAPTER.encodedSizeWithTag(BaseNotice.CHECK_PROFILE, responseBody.delete_stranger_message_body) + DeleteStrangerConversationResponseBody.ADAPTER.encodedSizeWithTag(BaseNotice.COMMENT_REPLY_WITH_VIDEO, responseBody.delete_stranger_conversation_body) + DeleteStrangerAllConversationResponseBody.ADAPTER.encodedSizeWithTag(1004, responseBody.delete_stranger_all_conversation_body) + MarkStrangerConversationReadResponseBody.ADAPTER.encodedSizeWithTag(1005, responseBody.mark_stranger_conversation_read_body) + MarkStrangerAllConversationReadResponseBody.ADAPTER.encodedSizeWithTag(1006, responseBody.mark_stranger_all_conversation_read_body) + GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(2000, responseBody.participants_read_index_body) + GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(2001, responseBody.participants_min_index_body) + GetUserConversationListResponseBody.ADAPTER.encodedSizeWithTag(2006, responseBody.get_conversation_list_body) + ClientACKResponseBody.ADAPTER.encodedSizeWithTag(2010, responseBody.client_ack_body) + ReportClientMetricsResponseBody.ADAPTER.encodedSizeWithTag(2016, responseBody.report_client_metrics_body) + GetConfigsResponseBody.ADAPTER.encodedSizeWithTag(2017, responseBody.get_configs_body) + responseBody.unknownFields().size();
        }

        public final ResponseBody redact(ResponseBody responseBody) {
            Builder newBuilder = responseBody.newBuilder();
            if (newBuilder.send_message_body != null) {
                newBuilder.send_message_body = (SendMessageResponseBody) SendMessageResponseBody.ADAPTER.redact(newBuilder.send_message_body);
            }
            if (newBuilder.messages_per_user_body != null) {
                newBuilder.messages_per_user_body = (MessagesPerUserResponseBody) MessagesPerUserResponseBody.ADAPTER.redact(newBuilder.messages_per_user_body);
            }
            if (newBuilder.messages_per_user_init_body != null) {
                newBuilder.messages_per_user_init_body = (MessagesPerUserInitResponseBody) MessagesPerUserInitResponseBody.ADAPTER.redact(newBuilder.messages_per_user_init_body);
            }
            if (newBuilder.messages_per_user_init_v2_body != null) {
                newBuilder.messages_per_user_init_v2_body = (MessagesPerUserInitV2ResponseBody) MessagesPerUserInitV2ResponseBody.ADAPTER.redact(newBuilder.messages_per_user_init_v2_body);
            }
            if (newBuilder.check_messages_per_user_body != null) {
                newBuilder.check_messages_per_user_body = (CheckMessagesPerUserResponseBody) CheckMessagesPerUserResponseBody.ADAPTER.redact(newBuilder.check_messages_per_user_body);
            }
            if (newBuilder.conversations_list_body != null) {
                newBuilder.conversations_list_body = (ConversationsListResponseBody) ConversationsListResponseBody.ADAPTER.redact(newBuilder.conversations_list_body);
            }
            if (newBuilder.messages_in_conversation_body != null) {
                newBuilder.messages_in_conversation_body = (MessagesInConversationResponseBody) MessagesInConversationResponseBody.ADAPTER.redact(newBuilder.messages_in_conversation_body);
            }
            if (newBuilder.get_messages_checkinfo_in_conversation_body != null) {
                newBuilder.get_messages_checkinfo_in_conversation_body = (GetMessagesCheckInfoInConversationResponseBody) GetMessagesCheckInfoInConversationResponseBody.ADAPTER.redact(newBuilder.get_messages_checkinfo_in_conversation_body);
            }
            if (newBuilder.send_user_action_body != null) {
                newBuilder.send_user_action_body = (SendUserActionResponseBody) SendUserActionResponseBody.ADAPTER.redact(newBuilder.send_user_action_body);
            }
            if (newBuilder.has_new_message_notify != null) {
                newBuilder.has_new_message_notify = (NewMessageNotify) NewMessageNotify.ADAPTER.redact(newBuilder.has_new_message_notify);
            }
            if (newBuilder.mark_conversation_read_notify != null) {
                newBuilder.mark_conversation_read_notify = (MarkConversationReadNotify) MarkConversationReadNotify.ADAPTER.redact(newBuilder.mark_conversation_read_notify);
            }
            if (newBuilder.conversation_info_updated_notify != null) {
                newBuilder.conversation_info_updated_notify = (ConversationInfoUpdatedNotify) ConversationInfoUpdatedNotify.ADAPTER.redact(newBuilder.conversation_info_updated_notify);
            }
            if (newBuilder.stranger_has_new_message_notify != null) {
                newBuilder.stranger_has_new_message_notify = (StrangerNewMessageNotify) StrangerNewMessageNotify.ADAPTER.redact(newBuilder.stranger_has_new_message_notify);
            }
            if (newBuilder.get_conversation_info_body != null) {
                newBuilder.get_conversation_info_body = (GetConversationInfoResponseBody) GetConversationInfoResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_body);
            }
            if (newBuilder.set_conversation_info_body != null) {
                newBuilder.set_conversation_info_body = (SetConversationInfoResponseBody) SetConversationInfoResponseBody.ADAPTER.redact(newBuilder.set_conversation_info_body);
            }
            if (newBuilder.create_conversation_body != null) {
                newBuilder.create_conversation_body = (CreateConversationResponseBody) CreateConversationResponseBody.ADAPTER.redact(newBuilder.create_conversation_body);
            }
            if (newBuilder.get_conversations_info_list_body != null) {
                newBuilder.get_conversations_info_list_body = (GetConversationInfoListResponseBody) GetConversationInfoListResponseBody.ADAPTER.redact(newBuilder.get_conversations_info_list_body);
            }
            if (newBuilder.batch_mark_read_body != null) {
                newBuilder.batch_mark_read_body = (BatchMarkConversationReadResponseBody) BatchMarkConversationReadResponseBody.ADAPTER.redact(newBuilder.batch_mark_read_body);
            }
            if (newBuilder.get_conversations_checkinfo_body != null) {
                newBuilder.get_conversations_checkinfo_body = (GetConversationsCheckInfoResponseBody) GetConversationsCheckInfoResponseBody.ADAPTER.redact(newBuilder.get_conversations_checkinfo_body);
            }
            if (newBuilder.get_conversation_info_v2_body != null) {
                newBuilder.get_conversation_info_v2_body = (GetConversationInfoV2ResponseBody) GetConversationInfoV2ResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_v2_body);
            }
            if (newBuilder.create_conversation_v2_body != null) {
                newBuilder.create_conversation_v2_body = (CreateConversationV2ResponseBody) CreateConversationV2ResponseBody.ADAPTER.redact(newBuilder.create_conversation_v2_body);
            }
            if (newBuilder.get_conversation_info_list_v2_body != null) {
                newBuilder.get_conversation_info_list_v2_body = (GetConversationInfoListV2ResponseBody) GetConversationInfoListV2ResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_list_v2_body);
            }
            if (newBuilder.get_conversation_info_list_by_favorite_v2_body != null) {
                newBuilder.get_conversation_info_list_by_favorite_v2_body = (GetConversationInfoListByFavoriteV2ResponseBody) GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_list_by_favorite_v2_body);
            }
            if (newBuilder.get_conversation_info_list_by_top_v2_body != null) {
                newBuilder.get_conversation_info_list_by_top_v2_body = (GetConversationInfoListByTopV2ResponseBody) GetConversationInfoListByTopV2ResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_list_by_top_v2_body);
            }
            if (newBuilder.conversation_participants_body != null) {
                newBuilder.conversation_participants_body = (ConversationParticipantsListResponseBody) ConversationParticipantsListResponseBody.ADAPTER.redact(newBuilder.conversation_participants_body);
            }
            if (newBuilder.conversation_add_participants_body != null) {
                newBuilder.conversation_add_participants_body = (ConversationAddParticipantsResponseBody) ConversationAddParticipantsResponseBody.ADAPTER.redact(newBuilder.conversation_add_participants_body);
            }
            if (newBuilder.conversation_remove_participants_body != null) {
                newBuilder.conversation_remove_participants_body = (ConversationRemoveParticipantsResponseBody) ConversationRemoveParticipantsResponseBody.ADAPTER.redact(newBuilder.conversation_remove_participants_body);
            }
            if (newBuilder.conversation_set_role_body != null) {
                newBuilder.conversation_set_role_body = (ConversationSetRoleResponseBody) ConversationSetRoleResponseBody.ADAPTER.redact(newBuilder.conversation_set_role_body);
            }
            if (newBuilder.mget_conversation_participants_body != null) {
                newBuilder.mget_conversation_participants_body = (MgetConversationParticipantsResponseBody) MgetConversationParticipantsResponseBody.ADAPTER.redact(newBuilder.mget_conversation_participants_body);
            }
            if (newBuilder.update_conversation_participant_body != null) {
                newBuilder.update_conversation_participant_body = (UpdateConversationParticipantResponseBody) UpdateConversationParticipantResponseBody.ADAPTER.redact(newBuilder.update_conversation_participant_body);
            }
            if (newBuilder.reaction_message_body != null) {
                newBuilder.reaction_message_body = (ReactionMessageResponseBody) ReactionMessageResponseBody.ADAPTER.redact(newBuilder.reaction_message_body);
            }
            if (newBuilder.sync_message_body != null) {
                newBuilder.sync_message_body = (SyncMessageResponseBody) SyncMessageResponseBody.ADAPTER.redact(newBuilder.sync_message_body);
            }
            if (newBuilder.modify_message_property_body != null) {
                newBuilder.modify_message_property_body = (ModifyMessagePropertyResponseBody) ModifyMessagePropertyResponseBody.ADAPTER.redact(newBuilder.modify_message_property_body);
            }
            if (newBuilder.get_group_info_body != null) {
                newBuilder.get_group_info_body = (GetGroupInfoResponseBody) GetGroupInfoResponseBody.ADAPTER.redact(newBuilder.get_group_info_body);
            }
            if (newBuilder.set_group_info_body != null) {
                newBuilder.set_group_info_body = (SetGroupInfoResponseBody) SetGroupInfoResponseBody.ADAPTER.redact(newBuilder.set_group_info_body);
            }
            if (newBuilder.get_groups_info_body != null) {
                newBuilder.get_groups_info_body = (GetGroupInfoListResponseBody) GetGroupInfoListResponseBody.ADAPTER.redact(newBuilder.get_groups_info_body);
            }
            if (newBuilder.get_conversation_core_info_body != null) {
                newBuilder.get_conversation_core_info_body = (GetConversationCoreInfoResponseBody) GetConversationCoreInfoResponseBody.ADAPTER.redact(newBuilder.get_conversation_core_info_body);
            }
            if (newBuilder.set_conversation_core_info_body != null) {
                newBuilder.set_conversation_core_info_body = (SetConversationCoreInfoResponseBody) SetConversationCoreInfoResponseBody.ADAPTER.redact(newBuilder.set_conversation_core_info_body);
            }
            if (newBuilder.get_conversation_core_info_list_body != null) {
                newBuilder.get_conversation_core_info_list_body = (GetConversationCoreInfoListResponseBody) GetConversationCoreInfoListResponseBody.ADAPTER.redact(newBuilder.get_conversation_core_info_list_body);
            }
            if (newBuilder.upsert_conversation_core_ext_info_body != null) {
                newBuilder.upsert_conversation_core_ext_info_body = (UpsertConversationCoreExtInfoResponseBody) UpsertConversationCoreExtInfoResponseBody.ADAPTER.redact(newBuilder.upsert_conversation_core_ext_info_body);
            }
            if (newBuilder.delete_conversation_core_ext_info_body != null) {
                newBuilder.delete_conversation_core_ext_info_body = (DeleteConversationCoreExtInfoResponseBody) DeleteConversationCoreExtInfoResponseBody.ADAPTER.redact(newBuilder.delete_conversation_core_ext_info_body);
            }
            if (newBuilder.get_conversation_setting_info_body != null) {
                newBuilder.get_conversation_setting_info_body = (GetConversationSettingInfoResponseBody) GetConversationSettingInfoResponseBody.ADAPTER.redact(newBuilder.get_conversation_setting_info_body);
            }
            if (newBuilder.set_conversation_setting_info_body != null) {
                newBuilder.set_conversation_setting_info_body = (SetConversationSettingInfoResponseBody) SetConversationSettingInfoResponseBody.ADAPTER.redact(newBuilder.set_conversation_setting_info_body);
            }
            if (newBuilder.upsert_conversation_setting_ext_info_body != null) {
                newBuilder.upsert_conversation_setting_ext_info_body = (UpsertConversationSettingExtInfoResponseBody) UpsertConversationSettingExtInfoResponseBody.ADAPTER.redact(newBuilder.upsert_conversation_setting_ext_info_body);
            }
            if (newBuilder.delete_conversation_setting_ext_info_body != null) {
                newBuilder.delete_conversation_setting_ext_info_body = (DeleteConversationSettingExtInfoResponseBody) DeleteConversationSettingExtInfoResponseBody.ADAPTER.redact(newBuilder.delete_conversation_setting_ext_info_body);
            }
            if (newBuilder.get_stranger_conversation_body != null) {
                newBuilder.get_stranger_conversation_body = (GetStrangerConversationListResponseBody) GetStrangerConversationListResponseBody.ADAPTER.redact(newBuilder.get_stranger_conversation_body);
            }
            if (newBuilder.get_stranger_messages_body != null) {
                newBuilder.get_stranger_messages_body = (GetStrangerMessagesResponseBody) GetStrangerMessagesResponseBody.ADAPTER.redact(newBuilder.get_stranger_messages_body);
            }
            if (newBuilder.delete_stranger_message_body != null) {
                newBuilder.delete_stranger_message_body = (DeleteStrangerMessageResponseBody) DeleteStrangerMessageResponseBody.ADAPTER.redact(newBuilder.delete_stranger_message_body);
            }
            if (newBuilder.delete_stranger_conversation_body != null) {
                newBuilder.delete_stranger_conversation_body = (DeleteStrangerConversationResponseBody) DeleteStrangerConversationResponseBody.ADAPTER.redact(newBuilder.delete_stranger_conversation_body);
            }
            if (newBuilder.delete_stranger_all_conversation_body != null) {
                newBuilder.delete_stranger_all_conversation_body = (DeleteStrangerAllConversationResponseBody) DeleteStrangerAllConversationResponseBody.ADAPTER.redact(newBuilder.delete_stranger_all_conversation_body);
            }
            if (newBuilder.mark_stranger_conversation_read_body != null) {
                newBuilder.mark_stranger_conversation_read_body = (MarkStrangerConversationReadResponseBody) MarkStrangerConversationReadResponseBody.ADAPTER.redact(newBuilder.mark_stranger_conversation_read_body);
            }
            if (newBuilder.mark_stranger_all_conversation_read_body != null) {
                newBuilder.mark_stranger_all_conversation_read_body = (MarkStrangerAllConversationReadResponseBody) MarkStrangerAllConversationReadResponseBody.ADAPTER.redact(newBuilder.mark_stranger_all_conversation_read_body);
            }
            if (newBuilder.participants_read_index_body != null) {
                newBuilder.participants_read_index_body = (GetConversationParticipantsReadIndexV3ResponseBody) GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.redact(newBuilder.participants_read_index_body);
            }
            if (newBuilder.participants_min_index_body != null) {
                newBuilder.participants_min_index_body = (GetConversationParticipantsMinIndexV3ResponseBody) GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.redact(newBuilder.participants_min_index_body);
            }
            if (newBuilder.get_conversation_list_body != null) {
                newBuilder.get_conversation_list_body = (GetUserConversationListResponseBody) GetUserConversationListResponseBody.ADAPTER.redact(newBuilder.get_conversation_list_body);
            }
            if (newBuilder.client_ack_body != null) {
                newBuilder.client_ack_body = (ClientACKResponseBody) ClientACKResponseBody.ADAPTER.redact(newBuilder.client_ack_body);
            }
            if (newBuilder.report_client_metrics_body != null) {
                newBuilder.report_client_metrics_body = (ReportClientMetricsResponseBody) ReportClientMetricsResponseBody.ADAPTER.redact(newBuilder.report_client_metrics_body);
            }
            if (newBuilder.get_configs_body != null) {
                newBuilder.get_configs_body = (GetConfigsResponseBody) GetConfigsResponseBody.ADAPTER.redact(newBuilder.get_configs_body);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, ResponseBody responseBody) throws IOException {
            SendMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 100, responseBody.send_message_body);
            MessagesPerUserResponseBody.ADAPTER.encodeWithTag(protoWriter, 200, responseBody.messages_per_user_body);
            MessagesPerUserInitResponseBody.ADAPTER.encodeWithTag(protoWriter, 201, responseBody.messages_per_user_init_body);
            MessagesPerUserInitV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 203, responseBody.messages_per_user_init_v2_body);
            CheckMessagesPerUserResponseBody.ADAPTER.encodeWithTag(protoWriter, 210, responseBody.check_messages_per_user_body);
            ConversationsListResponseBody.ADAPTER.encodeWithTag(protoWriter, 300, responseBody.conversations_list_body);
            MessagesInConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 301, responseBody.messages_in_conversation_body);
            GetMessagesCheckInfoInConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 302, responseBody.get_messages_checkinfo_in_conversation_body);
            SendUserActionResponseBody.ADAPTER.encodeWithTag(protoWriter, 410, responseBody.send_user_action_body);
            NewMessageNotify.ADAPTER.encodeWithTag(protoWriter, 500, responseBody.has_new_message_notify);
            MarkConversationReadNotify.ADAPTER.encodeWithTag(protoWriter, 501, responseBody.mark_conversation_read_notify);
            ConversationInfoUpdatedNotify.ADAPTER.encodeWithTag(protoWriter, 502, responseBody.conversation_info_updated_notify);
            StrangerNewMessageNotify.ADAPTER.encodeWithTag(protoWriter, 503, responseBody.stranger_has_new_message_notify);
            GetConversationInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 600, responseBody.get_conversation_info_body);
            SetConversationInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 601, responseBody.set_conversation_info_body);
            CreateConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 602, responseBody.create_conversation_body);
            GetConversationInfoListResponseBody.ADAPTER.encodeWithTag(protoWriter, 607, responseBody.get_conversations_info_list_body);
            BatchMarkConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 613, responseBody.batch_mark_read_body);
            GetConversationsCheckInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 615, responseBody.get_conversations_checkinfo_body);
            GetConversationInfoV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 608, responseBody.get_conversation_info_v2_body);
            CreateConversationV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 609, responseBody.create_conversation_v2_body);
            GetConversationInfoListV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 610, responseBody.get_conversation_info_list_v2_body);
            GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 611, responseBody.get_conversation_info_list_by_favorite_v2_body);
            GetConversationInfoListByTopV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 612, responseBody.get_conversation_info_list_by_top_v2_body);
            ConversationParticipantsListResponseBody.ADAPTER.encodeWithTag(protoWriter, 605, responseBody.conversation_participants_body);
            ConversationAddParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 650, responseBody.conversation_add_participants_body);
            ConversationRemoveParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 651, responseBody.conversation_remove_participants_body);
            ConversationSetRoleResponseBody.ADAPTER.encodeWithTag(protoWriter, 653, responseBody.conversation_set_role_body);
            MgetConversationParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 654, responseBody.mget_conversation_participants_body);
            UpdateConversationParticipantResponseBody.ADAPTER.encodeWithTag(protoWriter, 655, responseBody.update_conversation_participant_body);
            ReactionMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 703, responseBody.reaction_message_body);
            SyncMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 704, responseBody.sync_message_body);
            ModifyMessagePropertyResponseBody.ADAPTER.encodeWithTag(protoWriter, 705, responseBody.modify_message_property_body);
            GetGroupInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 801, responseBody.get_group_info_body);
            SetGroupInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 802, responseBody.set_group_info_body);
            GetGroupInfoListResponseBody.ADAPTER.encodeWithTag(protoWriter, 803, responseBody.get_groups_info_body);
            GetConversationCoreInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 901, responseBody.get_conversation_core_info_body);
            SetConversationCoreInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 902, responseBody.set_conversation_core_info_body);
            GetConversationCoreInfoListResponseBody.ADAPTER.encodeWithTag(protoWriter, 903, responseBody.get_conversation_core_info_list_body);
            UpsertConversationCoreExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 904, responseBody.upsert_conversation_core_ext_info_body);
            DeleteConversationCoreExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 905, responseBody.delete_conversation_core_ext_info_body);
            GetConversationSettingInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 920, responseBody.get_conversation_setting_info_body);
            SetConversationSettingInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 921, responseBody.set_conversation_setting_info_body);
            UpsertConversationSettingExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 922, responseBody.upsert_conversation_setting_ext_info_body);
            DeleteConversationSettingExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 923, responseBody.delete_conversation_setting_ext_info_body);
            GetStrangerConversationListResponseBody.ADAPTER.encodeWithTag(protoWriter, 1000, responseBody.get_stranger_conversation_body);
            GetStrangerMessagesResponseBody.ADAPTER.encodeWithTag(protoWriter, 1001, responseBody.get_stranger_messages_body);
            DeleteStrangerMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, BaseNotice.CHECK_PROFILE, responseBody.delete_stranger_message_body);
            DeleteStrangerConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, BaseNotice.COMMENT_REPLY_WITH_VIDEO, responseBody.delete_stranger_conversation_body);
            DeleteStrangerAllConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 1004, responseBody.delete_stranger_all_conversation_body);
            MarkStrangerConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 1005, responseBody.mark_stranger_conversation_read_body);
            MarkStrangerAllConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 1006, responseBody.mark_stranger_all_conversation_read_body);
            GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.encodeWithTag(protoWriter, 2000, responseBody.participants_read_index_body);
            GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.encodeWithTag(protoWriter, 2001, responseBody.participants_min_index_body);
            GetUserConversationListResponseBody.ADAPTER.encodeWithTag(protoWriter, 2006, responseBody.get_conversation_list_body);
            ClientACKResponseBody.ADAPTER.encodeWithTag(protoWriter, 2010, responseBody.client_ack_body);
            ReportClientMetricsResponseBody.ADAPTER.encodeWithTag(protoWriter, 2016, responseBody.report_client_metrics_body);
            GetConfigsResponseBody.ADAPTER.encodeWithTag(protoWriter, 2017, responseBody.get_configs_body);
            protoWriter.writeBytes(responseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.send_message_body = this.send_message_body;
        builder.messages_per_user_body = this.messages_per_user_body;
        builder.messages_per_user_init_body = this.messages_per_user_init_body;
        builder.messages_per_user_init_v2_body = this.messages_per_user_init_v2_body;
        builder.check_messages_per_user_body = this.check_messages_per_user_body;
        builder.conversations_list_body = this.conversations_list_body;
        builder.messages_in_conversation_body = this.messages_in_conversation_body;
        builder.get_messages_checkinfo_in_conversation_body = this.get_messages_checkinfo_in_conversation_body;
        builder.send_user_action_body = this.send_user_action_body;
        builder.has_new_message_notify = this.has_new_message_notify;
        builder.mark_conversation_read_notify = this.mark_conversation_read_notify;
        builder.conversation_info_updated_notify = this.conversation_info_updated_notify;
        builder.stranger_has_new_message_notify = this.stranger_has_new_message_notify;
        builder.get_conversation_info_body = this.get_conversation_info_body;
        builder.set_conversation_info_body = this.set_conversation_info_body;
        builder.create_conversation_body = this.create_conversation_body;
        builder.get_conversations_info_list_body = this.get_conversations_info_list_body;
        builder.batch_mark_read_body = this.batch_mark_read_body;
        builder.get_conversations_checkinfo_body = this.get_conversations_checkinfo_body;
        builder.get_conversation_info_v2_body = this.get_conversation_info_v2_body;
        builder.create_conversation_v2_body = this.create_conversation_v2_body;
        builder.get_conversation_info_list_v2_body = this.get_conversation_info_list_v2_body;
        builder.get_conversation_info_list_by_favorite_v2_body = this.get_conversation_info_list_by_favorite_v2_body;
        builder.get_conversation_info_list_by_top_v2_body = this.get_conversation_info_list_by_top_v2_body;
        builder.conversation_participants_body = this.conversation_participants_body;
        builder.conversation_add_participants_body = this.conversation_add_participants_body;
        builder.conversation_remove_participants_body = this.conversation_remove_participants_body;
        builder.conversation_set_role_body = this.conversation_set_role_body;
        builder.mget_conversation_participants_body = this.mget_conversation_participants_body;
        builder.update_conversation_participant_body = this.update_conversation_participant_body;
        builder.reaction_message_body = this.reaction_message_body;
        builder.sync_message_body = this.sync_message_body;
        builder.modify_message_property_body = this.modify_message_property_body;
        builder.get_group_info_body = this.get_group_info_body;
        builder.set_group_info_body = this.set_group_info_body;
        builder.get_groups_info_body = this.get_groups_info_body;
        builder.get_conversation_core_info_body = this.get_conversation_core_info_body;
        builder.set_conversation_core_info_body = this.set_conversation_core_info_body;
        builder.get_conversation_core_info_list_body = this.get_conversation_core_info_list_body;
        builder.upsert_conversation_core_ext_info_body = this.upsert_conversation_core_ext_info_body;
        builder.delete_conversation_core_ext_info_body = this.delete_conversation_core_ext_info_body;
        builder.get_conversation_setting_info_body = this.get_conversation_setting_info_body;
        builder.set_conversation_setting_info_body = this.set_conversation_setting_info_body;
        builder.upsert_conversation_setting_ext_info_body = this.upsert_conversation_setting_ext_info_body;
        builder.delete_conversation_setting_ext_info_body = this.delete_conversation_setting_ext_info_body;
        builder.get_stranger_conversation_body = this.get_stranger_conversation_body;
        builder.get_stranger_messages_body = this.get_stranger_messages_body;
        builder.delete_stranger_message_body = this.delete_stranger_message_body;
        builder.delete_stranger_conversation_body = this.delete_stranger_conversation_body;
        builder.delete_stranger_all_conversation_body = this.delete_stranger_all_conversation_body;
        builder.mark_stranger_conversation_read_body = this.mark_stranger_conversation_read_body;
        builder.mark_stranger_all_conversation_read_body = this.mark_stranger_all_conversation_read_body;
        builder.participants_read_index_body = this.participants_read_index_body;
        builder.participants_min_index_body = this.participants_min_index_body;
        builder.get_conversation_list_body = this.get_conversation_list_body;
        builder.client_ack_body = this.client_ack_body;
        builder.report_client_metrics_body = this.report_client_metrics_body;
        builder.get_configs_body = this.get_configs_body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_message_body != null) {
            sb.append(", send_message_body=");
            sb.append(this.send_message_body);
        }
        if (this.messages_per_user_body != null) {
            sb.append(", messages_per_user_body=");
            sb.append(this.messages_per_user_body);
        }
        if (this.messages_per_user_init_body != null) {
            sb.append(", messages_per_user_init_body=");
            sb.append(this.messages_per_user_init_body);
        }
        if (this.messages_per_user_init_v2_body != null) {
            sb.append(", messages_per_user_init_v2_body=");
            sb.append(this.messages_per_user_init_v2_body);
        }
        if (this.check_messages_per_user_body != null) {
            sb.append(", check_messages_per_user_body=");
            sb.append(this.check_messages_per_user_body);
        }
        if (this.conversations_list_body != null) {
            sb.append(", conversations_list_body=");
            sb.append(this.conversations_list_body);
        }
        if (this.messages_in_conversation_body != null) {
            sb.append(", messages_in_conversation_body=");
            sb.append(this.messages_in_conversation_body);
        }
        if (this.get_messages_checkinfo_in_conversation_body != null) {
            sb.append(", get_messages_checkinfo_in_conversation_body=");
            sb.append(this.get_messages_checkinfo_in_conversation_body);
        }
        if (this.send_user_action_body != null) {
            sb.append(", send_user_action_body=");
            sb.append(this.send_user_action_body);
        }
        if (this.has_new_message_notify != null) {
            sb.append(", has_new_message_notify=");
            sb.append(this.has_new_message_notify);
        }
        if (this.mark_conversation_read_notify != null) {
            sb.append(", mark_conversation_read_notify=");
            sb.append(this.mark_conversation_read_notify);
        }
        if (this.conversation_info_updated_notify != null) {
            sb.append(", conversation_info_updated_notify=");
            sb.append(this.conversation_info_updated_notify);
        }
        if (this.stranger_has_new_message_notify != null) {
            sb.append(", stranger_has_new_message_notify=");
            sb.append(this.stranger_has_new_message_notify);
        }
        if (this.get_conversation_info_body != null) {
            sb.append(", get_conversation_info_body=");
            sb.append(this.get_conversation_info_body);
        }
        if (this.set_conversation_info_body != null) {
            sb.append(", set_conversation_info_body=");
            sb.append(this.set_conversation_info_body);
        }
        if (this.create_conversation_body != null) {
            sb.append(", create_conversation_body=");
            sb.append(this.create_conversation_body);
        }
        if (this.get_conversations_info_list_body != null) {
            sb.append(", get_conversations_info_list_body=");
            sb.append(this.get_conversations_info_list_body);
        }
        if (this.batch_mark_read_body != null) {
            sb.append(", batch_mark_read_body=");
            sb.append(this.batch_mark_read_body);
        }
        if (this.get_conversations_checkinfo_body != null) {
            sb.append(", get_conversations_checkinfo_body=");
            sb.append(this.get_conversations_checkinfo_body);
        }
        if (this.get_conversation_info_v2_body != null) {
            sb.append(", get_conversation_info_v2_body=");
            sb.append(this.get_conversation_info_v2_body);
        }
        if (this.create_conversation_v2_body != null) {
            sb.append(", create_conversation_v2_body=");
            sb.append(this.create_conversation_v2_body);
        }
        if (this.get_conversation_info_list_v2_body != null) {
            sb.append(", get_conversation_info_list_v2_body=");
            sb.append(this.get_conversation_info_list_v2_body);
        }
        if (this.get_conversation_info_list_by_favorite_v2_body != null) {
            sb.append(", get_conversation_info_list_by_favorite_v2_body=");
            sb.append(this.get_conversation_info_list_by_favorite_v2_body);
        }
        if (this.get_conversation_info_list_by_top_v2_body != null) {
            sb.append(", get_conversation_info_list_by_top_v2_body=");
            sb.append(this.get_conversation_info_list_by_top_v2_body);
        }
        if (this.conversation_participants_body != null) {
            sb.append(", conversation_participants_body=");
            sb.append(this.conversation_participants_body);
        }
        if (this.conversation_add_participants_body != null) {
            sb.append(", conversation_add_participants_body=");
            sb.append(this.conversation_add_participants_body);
        }
        if (this.conversation_remove_participants_body != null) {
            sb.append(", conversation_remove_participants_body=");
            sb.append(this.conversation_remove_participants_body);
        }
        if (this.conversation_set_role_body != null) {
            sb.append(", conversation_set_role_body=");
            sb.append(this.conversation_set_role_body);
        }
        if (this.mget_conversation_participants_body != null) {
            sb.append(", mget_conversation_participants_body=");
            sb.append(this.mget_conversation_participants_body);
        }
        if (this.update_conversation_participant_body != null) {
            sb.append(", update_conversation_participant_body=");
            sb.append(this.update_conversation_participant_body);
        }
        if (this.reaction_message_body != null) {
            sb.append(", reaction_message_body=");
            sb.append(this.reaction_message_body);
        }
        if (this.sync_message_body != null) {
            sb.append(", sync_message_body=");
            sb.append(this.sync_message_body);
        }
        if (this.modify_message_property_body != null) {
            sb.append(", modify_message_property_body=");
            sb.append(this.modify_message_property_body);
        }
        if (this.get_group_info_body != null) {
            sb.append(", get_group_info_body=");
            sb.append(this.get_group_info_body);
        }
        if (this.set_group_info_body != null) {
            sb.append(", set_group_info_body=");
            sb.append(this.set_group_info_body);
        }
        if (this.get_groups_info_body != null) {
            sb.append(", get_groups_info_body=");
            sb.append(this.get_groups_info_body);
        }
        if (this.get_conversation_core_info_body != null) {
            sb.append(", get_conversation_core_info_body=");
            sb.append(this.get_conversation_core_info_body);
        }
        if (this.set_conversation_core_info_body != null) {
            sb.append(", set_conversation_core_info_body=");
            sb.append(this.set_conversation_core_info_body);
        }
        if (this.get_conversation_core_info_list_body != null) {
            sb.append(", get_conversation_core_info_list_body=");
            sb.append(this.get_conversation_core_info_list_body);
        }
        if (this.upsert_conversation_core_ext_info_body != null) {
            sb.append(", upsert_conversation_core_ext_info_body=");
            sb.append(this.upsert_conversation_core_ext_info_body);
        }
        if (this.delete_conversation_core_ext_info_body != null) {
            sb.append(", delete_conversation_core_ext_info_body=");
            sb.append(this.delete_conversation_core_ext_info_body);
        }
        if (this.get_conversation_setting_info_body != null) {
            sb.append(", get_conversation_setting_info_body=");
            sb.append(this.get_conversation_setting_info_body);
        }
        if (this.set_conversation_setting_info_body != null) {
            sb.append(", set_conversation_setting_info_body=");
            sb.append(this.set_conversation_setting_info_body);
        }
        if (this.upsert_conversation_setting_ext_info_body != null) {
            sb.append(", upsert_conversation_setting_ext_info_body=");
            sb.append(this.upsert_conversation_setting_ext_info_body);
        }
        if (this.delete_conversation_setting_ext_info_body != null) {
            sb.append(", delete_conversation_setting_ext_info_body=");
            sb.append(this.delete_conversation_setting_ext_info_body);
        }
        if (this.get_stranger_conversation_body != null) {
            sb.append(", get_stranger_conversation_body=");
            sb.append(this.get_stranger_conversation_body);
        }
        if (this.get_stranger_messages_body != null) {
            sb.append(", get_stranger_messages_body=");
            sb.append(this.get_stranger_messages_body);
        }
        if (this.delete_stranger_message_body != null) {
            sb.append(", delete_stranger_message_body=");
            sb.append(this.delete_stranger_message_body);
        }
        if (this.delete_stranger_conversation_body != null) {
            sb.append(", delete_stranger_conversation_body=");
            sb.append(this.delete_stranger_conversation_body);
        }
        if (this.delete_stranger_all_conversation_body != null) {
            sb.append(", delete_stranger_all_conversation_body=");
            sb.append(this.delete_stranger_all_conversation_body);
        }
        if (this.mark_stranger_conversation_read_body != null) {
            sb.append(", mark_stranger_conversation_read_body=");
            sb.append(this.mark_stranger_conversation_read_body);
        }
        if (this.mark_stranger_all_conversation_read_body != null) {
            sb.append(", mark_stranger_all_conversation_read_body=");
            sb.append(this.mark_stranger_all_conversation_read_body);
        }
        if (this.participants_read_index_body != null) {
            sb.append(", participants_read_index_body=");
            sb.append(this.participants_read_index_body);
        }
        if (this.participants_min_index_body != null) {
            sb.append(", participants_min_index_body=");
            sb.append(this.participants_min_index_body);
        }
        if (this.get_conversation_list_body != null) {
            sb.append(", get_conversation_list_body=");
            sb.append(this.get_conversation_list_body);
        }
        if (this.client_ack_body != null) {
            sb.append(", client_ack_body=");
            sb.append(this.client_ack_body);
        }
        if (this.report_client_metrics_body != null) {
            sb.append(", report_client_metrics_body=");
            sb.append(this.report_client_metrics_body);
        }
        if (this.get_configs_body != null) {
            sb.append(", get_configs_body=");
            sb.append(this.get_configs_body);
        }
        StringBuilder replace = sb.replace(0, 2, "ResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitResponseBody messagesPerUserInitResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, ConversationsListResponseBody conversationsListResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody, SendUserActionResponseBody sendUserActionResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, ConversationInfoUpdatedNotify conversationInfoUpdatedNotify, StrangerNewMessageNotify strangerNewMessageNotify, GetConversationInfoResponseBody getConversationInfoResponseBody, SetConversationInfoResponseBody setConversationInfoResponseBody, CreateConversationResponseBody createConversationResponseBody, GetConversationInfoListResponseBody getConversationInfoListResponseBody, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, ConversationSetRoleResponseBody conversationSetRoleResponseBody, MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, ReactionMessageResponseBody reactionMessageResponseBody, SyncMessageResponseBody syncMessageResponseBody, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, GetGroupInfoResponseBody getGroupInfoResponseBody, SetGroupInfoResponseBody setGroupInfoResponseBody, GetGroupInfoListResponseBody getGroupInfoListResponseBody, GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, GetConversationCoreInfoListResponseBody getConversationCoreInfoListResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody, GetConversationSettingInfoResponseBody getConversationSettingInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, DeleteConversationSettingExtInfoResponseBody deleteConversationSettingExtInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody, DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody, DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody, MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody, MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody, ClientACKResponseBody clientACKResponseBody, ReportClientMetricsResponseBody reportClientMetricsResponseBody, GetConfigsResponseBody getConfigsResponseBody) {
        this(sendMessageResponseBody, messagesPerUserResponseBody, messagesPerUserInitResponseBody, messagesPerUserInitV2ResponseBody, checkMessagesPerUserResponseBody, conversationsListResponseBody, messagesInConversationResponseBody, getMessagesCheckInfoInConversationResponseBody, sendUserActionResponseBody, newMessageNotify, markConversationReadNotify, conversationInfoUpdatedNotify, strangerNewMessageNotify, getConversationInfoResponseBody, setConversationInfoResponseBody, createConversationResponseBody, getConversationInfoListResponseBody, batchMarkConversationReadResponseBody, getConversationsCheckInfoResponseBody, getConversationInfoV2ResponseBody, createConversationV2ResponseBody, getConversationInfoListV2ResponseBody, getConversationInfoListByFavoriteV2ResponseBody, getConversationInfoListByTopV2ResponseBody, conversationParticipantsListResponseBody, conversationAddParticipantsResponseBody, conversationRemoveParticipantsResponseBody, conversationSetRoleResponseBody, mgetConversationParticipantsResponseBody, updateConversationParticipantResponseBody, reactionMessageResponseBody, syncMessageResponseBody, modifyMessagePropertyResponseBody, getGroupInfoResponseBody, setGroupInfoResponseBody, getGroupInfoListResponseBody, getConversationCoreInfoResponseBody, setConversationCoreInfoResponseBody, getConversationCoreInfoListResponseBody, upsertConversationCoreExtInfoResponseBody, deleteConversationCoreExtInfoResponseBody, getConversationSettingInfoResponseBody, setConversationSettingInfoResponseBody, upsertConversationSettingExtInfoResponseBody, deleteConversationSettingExtInfoResponseBody, getStrangerConversationListResponseBody, getStrangerMessagesResponseBody, deleteStrangerMessageResponseBody, deleteStrangerConversationResponseBody, deleteStrangerAllConversationResponseBody, markStrangerConversationReadResponseBody, markStrangerAllConversationReadResponseBody, getConversationParticipantsReadIndexV3ResponseBody, getConversationParticipantsMinIndexV3ResponseBody, getUserConversationListResponseBody, clientACKResponseBody, reportClientMetricsResponseBody, getConfigsResponseBody, ByteString.EMPTY);
    }

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitResponseBody messagesPerUserInitResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, ConversationsListResponseBody conversationsListResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody, SendUserActionResponseBody sendUserActionResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, ConversationInfoUpdatedNotify conversationInfoUpdatedNotify, StrangerNewMessageNotify strangerNewMessageNotify, GetConversationInfoResponseBody getConversationInfoResponseBody, SetConversationInfoResponseBody setConversationInfoResponseBody, CreateConversationResponseBody createConversationResponseBody, GetConversationInfoListResponseBody getConversationInfoListResponseBody, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, ConversationSetRoleResponseBody conversationSetRoleResponseBody, MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, ReactionMessageResponseBody reactionMessageResponseBody, SyncMessageResponseBody syncMessageResponseBody, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, GetGroupInfoResponseBody getGroupInfoResponseBody, SetGroupInfoResponseBody setGroupInfoResponseBody, GetGroupInfoListResponseBody getGroupInfoListResponseBody, GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, GetConversationCoreInfoListResponseBody getConversationCoreInfoListResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody, GetConversationSettingInfoResponseBody getConversationSettingInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, DeleteConversationSettingExtInfoResponseBody deleteConversationSettingExtInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody, DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody, DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody, MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody, MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody, ClientACKResponseBody clientACKResponseBody, ReportClientMetricsResponseBody reportClientMetricsResponseBody, GetConfigsResponseBody getConfigsResponseBody, ByteString byteString) {
        super(ADAPTER, byteString);
        this.send_message_body = sendMessageResponseBody;
        this.messages_per_user_body = messagesPerUserResponseBody;
        this.messages_per_user_init_body = messagesPerUserInitResponseBody;
        this.messages_per_user_init_v2_body = messagesPerUserInitV2ResponseBody;
        this.check_messages_per_user_body = checkMessagesPerUserResponseBody;
        this.conversations_list_body = conversationsListResponseBody;
        this.messages_in_conversation_body = messagesInConversationResponseBody;
        this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationResponseBody;
        this.send_user_action_body = sendUserActionResponseBody;
        this.has_new_message_notify = newMessageNotify;
        this.mark_conversation_read_notify = markConversationReadNotify;
        this.conversation_info_updated_notify = conversationInfoUpdatedNotify;
        this.stranger_has_new_message_notify = strangerNewMessageNotify;
        this.get_conversation_info_body = getConversationInfoResponseBody;
        this.set_conversation_info_body = setConversationInfoResponseBody;
        this.create_conversation_body = createConversationResponseBody;
        this.get_conversations_info_list_body = getConversationInfoListResponseBody;
        this.batch_mark_read_body = batchMarkConversationReadResponseBody;
        this.get_conversations_checkinfo_body = getConversationsCheckInfoResponseBody;
        this.get_conversation_info_v2_body = getConversationInfoV2ResponseBody;
        this.create_conversation_v2_body = createConversationV2ResponseBody;
        this.get_conversation_info_list_v2_body = getConversationInfoListV2ResponseBody;
        this.get_conversation_info_list_by_favorite_v2_body = getConversationInfoListByFavoriteV2ResponseBody;
        this.get_conversation_info_list_by_top_v2_body = getConversationInfoListByTopV2ResponseBody;
        this.conversation_participants_body = conversationParticipantsListResponseBody;
        this.conversation_add_participants_body = conversationAddParticipantsResponseBody;
        this.conversation_remove_participants_body = conversationRemoveParticipantsResponseBody;
        this.conversation_set_role_body = conversationSetRoleResponseBody;
        this.mget_conversation_participants_body = mgetConversationParticipantsResponseBody;
        this.update_conversation_participant_body = updateConversationParticipantResponseBody;
        this.reaction_message_body = reactionMessageResponseBody;
        this.sync_message_body = syncMessageResponseBody;
        this.modify_message_property_body = modifyMessagePropertyResponseBody;
        this.get_group_info_body = getGroupInfoResponseBody;
        this.set_group_info_body = setGroupInfoResponseBody;
        this.get_groups_info_body = getGroupInfoListResponseBody;
        this.get_conversation_core_info_body = getConversationCoreInfoResponseBody;
        this.set_conversation_core_info_body = setConversationCoreInfoResponseBody;
        this.get_conversation_core_info_list_body = getConversationCoreInfoListResponseBody;
        this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoResponseBody;
        this.delete_conversation_core_ext_info_body = deleteConversationCoreExtInfoResponseBody;
        this.get_conversation_setting_info_body = getConversationSettingInfoResponseBody;
        this.set_conversation_setting_info_body = setConversationSettingInfoResponseBody;
        this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoResponseBody;
        this.delete_conversation_setting_ext_info_body = deleteConversationSettingExtInfoResponseBody;
        this.get_stranger_conversation_body = getStrangerConversationListResponseBody;
        this.get_stranger_messages_body = getStrangerMessagesResponseBody;
        this.delete_stranger_message_body = deleteStrangerMessageResponseBody;
        this.delete_stranger_conversation_body = deleteStrangerConversationResponseBody;
        this.delete_stranger_all_conversation_body = deleteStrangerAllConversationResponseBody;
        this.mark_stranger_conversation_read_body = markStrangerConversationReadResponseBody;
        this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadResponseBody;
        this.participants_read_index_body = getConversationParticipantsReadIndexV3ResponseBody;
        this.participants_min_index_body = getConversationParticipantsMinIndexV3ResponseBody;
        this.get_conversation_list_body = getUserConversationListResponseBody;
        this.client_ack_body = clientACKResponseBody;
        this.report_client_metrics_body = reportClientMetricsResponseBody;
        this.get_configs_body = getConfigsResponseBody;
    }
}
