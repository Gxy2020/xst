package com.xst.event;

import com.xst.domain.User;
import org.springframework.context.ApplicationEvent;

/**
 * @author GUO
 * @Classname OnRegistrationCompleteEvent
 * @Description TODO
 * @Date 2020/11/16 21:07
 */
public class OnRegistrationCompleteEvent extends ApplicationEvent {


    private final User user;


    public OnRegistrationCompleteEvent(final User user) {
        super(user);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}