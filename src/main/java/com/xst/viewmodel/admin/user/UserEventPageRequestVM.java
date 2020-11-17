package com.xst.viewmodel.admin.user;


import com.xst.base.BasePage;
import lombok.Data;

/**
 * @author GUO
 */

@Data
public class UserEventPageRequestVM extends BasePage {

    private Integer userId;

    private String userName;

}
