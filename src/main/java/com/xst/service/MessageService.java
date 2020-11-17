package com.xst.service;

import com.github.pagehelper.PageInfo;
import com.xst.domain.Message;
import com.xst.domain.MessageUser;
import com.xst.viewmodel.admin.message.MessagePageRequestVM;
import com.xst.viewmodel.student.user.MessageRequestVM;

import java.util.List;

/**
 * @author GUO
 * @Classname MessageService
 * @Description TODO
 * @Date 2020/11/16 20:39
 */
public interface MessageService {
    List<Message> selectMessageByIds(List<Integer> ids);

    PageInfo<MessageUser> studentPage(MessageRequestVM requestVM);

    PageInfo<Message> page(MessagePageRequestVM requestVM);

    List<MessageUser> selectByMessageIds(List<Integer> ids);

    void sendMessage(Message message, List<MessageUser> messageUsers);

    void read(Integer id);

    Integer unReadCount(Integer userId);

    Message messageDetail(Integer id);
}
